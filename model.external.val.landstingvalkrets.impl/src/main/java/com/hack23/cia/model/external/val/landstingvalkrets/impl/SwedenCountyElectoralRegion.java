/*
 * Copyright 2010 James Pether Sörling
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:39:52 PM CET 
//


package com.hack23.cia.model.external.val.landstingvalkrets.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * The Class SwedenCountyElectoralRegion.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwedenCountyElectoralRegion", propOrder = {
    "code",
    "countyName",
    "seats",
    "landstingsvalkrets"
})
@Entity(name = "SwedenCountyElectoralRegion")
@Table(name = "SWEDEN_COUNTY_ELECTORAL_REGI_1")
@Inheritance(strategy = InheritanceType.JOINED)
public class SwedenCountyElectoralRegion
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The code. */
    @XmlElement(name = "landstingskod", required = true)
    protected BigInteger code;
    
    /** The county name. */
    @XmlElement(name = "landstingsnamn", required = true)
    protected String countyName;
    
    /** The seats. */
    @XmlElement(name = "valkretsmandat", required = true)
    protected BigInteger seats;
    
    /** The landstingsvalkrets. */
    @XmlElement(required = true)
    protected List<SwedenCountyElectoralArea> landstingsvalkrets = new ArrayList<>();
    
    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the code.
	 *
	 * @return the code
	 */
    @Basic
    @Column(name = "CODE", precision = 20)
    public BigInteger getCode() {
        return code;
    }

    /**
	 * Sets the code.
	 *
	 * @param value the new code
	 */
    public void setCode(final BigInteger value) {
        this.code = value;
    }

    /**
	 * Gets the county name.
	 *
	 * @return the county name
	 */
    @Basic
    @Column(name = "COUNTY_NAME")
    public String getCountyName() {
        return countyName;
    }

    /**
	 * Sets the county name.
	 *
	 * @param value the new county name
	 */
    public void setCountyName(final String value) {
        this.countyName = value;
    }

    /**
	 * Gets the seats.
	 *
	 * @return the seats
	 */
    @Basic
    @Column(name = "SEATS", precision = 20)
    public BigInteger getSeats() {
        return seats;
    }

    /**
	 * Sets the seats.
	 *
	 * @param value the new seats
	 */
    public void setSeats(final BigInteger value) {
        this.seats = value;
    }

    /**
	 * Gets the landstingsvalkrets.
	 *
	 * @return the landstingsvalkrets
	 */
    @OneToMany(targetEntity = SwedenCountyElectoralArea.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LANDSTINGSVALKRETS_SWEDEN_CO_0")
    public List<SwedenCountyElectoralArea> getLandstingsvalkrets() {
        return this.landstingsvalkrets;
    }

    /**
	 * Sets the landstingsvalkrets.
	 *
	 * @param landstingsvalkrets the new landstingsvalkrets
	 */
    public void setLandstingsvalkrets(final List<SwedenCountyElectoralArea> landstingsvalkrets) {
        this.landstingsvalkrets = landstingsvalkrets;
    }

    /**
	 * Gets the hjid.
	 *
	 * @return the hjid
	 */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
	 * Sets the hjid.
	 *
	 * @param value the new hjid
	 */
    public void setHjid(final Long value) {
        this.hjid = value;
    }

	@Override
	public final boolean equals(final Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj,"hjid");
	}

	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}

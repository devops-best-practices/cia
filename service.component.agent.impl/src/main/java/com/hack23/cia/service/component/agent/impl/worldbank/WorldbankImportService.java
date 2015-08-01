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
 *	$Id: WorldbankImportService.java 6102 2015-06-17 21:48:57Z pether $
 *  $HeadURL: svn+ssh://svn.code.sf.net/p/cia/code/trunk/service.component.agent.impl/src/main/java/com/hack23/cia/service/component/agent/impl/worldbank/WorldbankImportService.java $
*/
package com.hack23.cia.service.component.agent.impl.worldbank;

import java.util.List;
import java.util.Map;

import com.hack23.cia.model.external.worldbank.countries.impl.CountryElement;
import com.hack23.cia.model.external.worldbank.data.impl.WorldBankData;
import com.hack23.cia.model.external.worldbank.indicators.impl.IndicatorElement;

/**
 * The Interface WorldbankImportService.
 */
public interface WorldbankImportService {

	/**
	 * Gets the world bank country map.
	 *
	 * @return the world bank country map
	 */
	Map<String, String> getWorldBankCountryMap();

	/**
	 * Gets the world bank data map.
	 *
	 * @return the world bank data map
	 */
	Map<String, String> getWorldBankDataMap();

	/**
	 * Gets the world bank indicator element map.
	 *
	 * @return the world bank indicator element map
	 */
	Map<String, String> getWorldBankIndicatorElementMap();


	/**
	 * Update country element.
	 *
	 * @param country
	 *            the country
	 */
	void updateCountryElement(CountryElement country);



	/**
	 * Update data.
	 *
	 * @param data
	 *            the data
	 */
	void updateData(List<WorldBankData> data);


	/**
	 * Update indicator element.
	 *
	 * @param object
	 *            the object
	 */
	void updateIndicatorElement(IndicatorElement object);

	/**
	 * Gets the all indicators.
	 *
	 * @return the all indicators
	 */
	List<IndicatorElement> getAllIndicators();



}

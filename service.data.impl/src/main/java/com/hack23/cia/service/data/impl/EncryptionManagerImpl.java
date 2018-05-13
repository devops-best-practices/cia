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
package com.hack23.cia.service.data.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hack23.cia.service.data.api.EncryptionManager;

/**
 * The Class EncryptionManagerImpl.
 */
@Service
@Transactional
final class EncryptionManagerImpl implements EncryptionManager {

	/** The data source. */
	@Autowired
	private DataSource dataSource;

	/**
	 * Instantiates a new encryption manager impl.
	 */
	public EncryptionManagerImpl() {
		super();
	}

	@Override
	public void setEncryptionKey(final String key) {
		final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.execute("select set_config('cia.encrypt.key', '" + key + "', false)");
	}

}

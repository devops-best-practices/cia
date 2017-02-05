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
package com.hack23.cia.service.component.agent.impl.worldbank.workers;

import java.util.List;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hack23.cia.service.external.worldbank.api.DataFailureException;
import com.hack23.cia.service.external.worldbank.api.WorldBankDataApi;

/**
 * The Class WorldbankDataWorkConsumerImpl.
 */
@Service("worldbankDataWorkConsumerImpl")
@Transactional
final class WorldbankDataWorkConsumerImpl implements
MessageListener {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory
			.getLogger(WorldbankDataWorkConsumerImpl.class);

	/** The update service. */
	@Autowired
	private WorldbankUpdateService updateService;

	@Autowired
	private WorldBankDataApi worldbankDataApi;

	/**
	 * Instantiates a new worldbank data work consumer impl.
	 */
	public WorldbankDataWorkConsumerImpl() {
		super();
	}


	@Override
	public void onMessage(final Message message) {
		try {
			final List<String>  countryIndicator= (List<String>) ((ObjectMessage) message).getObject();
			updateService.updateData(worldbankDataApi.getData(countryIndicator.get(0), countryIndicator.get(1)));
		} catch (final DataFailureException | RuntimeException | JMSException e) {
			LOGGER.warn("Error loading worldbank data:" , e);
		}
	}
}

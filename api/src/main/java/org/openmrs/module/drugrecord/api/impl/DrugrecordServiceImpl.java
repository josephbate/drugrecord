/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.drugrecord.api.impl;

import java.util.List;

import org.openmrs.api.APIException;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.drugrecord.Item;
import org.openmrs.module.drugrecord.api.DrugrecordService;
import org.openmrs.module.drugrecord.api.dao.DrugrecordDao;

public class DrugrecordServiceImpl extends BaseOpenmrsService implements DrugrecordService {
	
	DrugrecordDao dao;
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setDao(DrugrecordDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Item getItemByUuid(String uuid) throws APIException {
		return dao.getItemByUuid(uuid);
	}
	
	@Override
	public Item saveItem(Item item) throws APIException {
		return dao.saveItem(item);
	}
	
	@Override
	public Item updateItem(Item item) throws APIException {
		return dao.updateItem(item);
	}
	
	@Override
	public Item deleteItem(Item item) throws APIException {
		return dao.deleteItem(item);
	}
	
	@Override
	public List<Item> getAllItems() throws APIException {
		return dao.getAllItems();
	}
}

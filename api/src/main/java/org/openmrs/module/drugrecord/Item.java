/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.drugrecord;

import org.openmrs.BaseOpenmrsData;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Please note that a corresponding table schema must be created in liquibase.xml.
 */
//Uncomment 2 lines below if you want to make the Item class persistable, see also DrugrecordDaoTest and liquibase.xml
@Entity(name = "drugrecord.Item")
@Table(name = "drugrecord_item")
public class Item extends BaseOpenmrsData {
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", drugName=" + drugName + ", description=" + description + ", prescription="
		        + prescription + ", quantity=" + quantity + ", purchases=" + purchases + "]";
	}
	
	@Id
	@GeneratedValue
	@Column(name = "drugrecord_item_id")
	private Integer id;
	
	@Basic
	@Column(name = "drug_name", length = 30)
	private String drugName;
	
	@Basic
	@Column(name = "description", length = 255)
	private String description;
	
	@Basic
	@Column(name = "prescription", length = 255)
	private String prescription;
	
	@Basic
	@Column(name = "quantity")
	private Integer quantity;
	
	@Basic
	@Column(name = "purchases")
	private Integer purchases;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDrugName() {
		return drugName;
	}
	
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	
	public String getPrescription() {
		return prescription;
	}
	
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Integer getPurchases() {
		return purchases;
	}
	
	public void setPurchases(Integer purchases) {
		this.purchases = purchases;
	}
	
	@Override
	public String getUuid() {
		return super.getUuid();
	}
	
	@Override
	public void setUuid(String uuid) {
		super.setUuid(uuid);
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}

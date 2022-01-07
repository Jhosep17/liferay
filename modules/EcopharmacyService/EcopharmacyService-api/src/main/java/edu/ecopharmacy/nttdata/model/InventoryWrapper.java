/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package edu.ecopharmacy.nttdata.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Inventory}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Inventory
 * @generated
 */
public class InventoryWrapper
	extends BaseModelWrapper<Inventory>
	implements Inventory, ModelWrapper<Inventory> {

	public InventoryWrapper(Inventory inventory) {
		super(inventory);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("inventoryId", getInventoryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("productId", getProductId());
		attributes.put("sedeId", getSedeId());
		attributes.put("stock", getStock());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long inventoryId = (Long)attributes.get("inventoryId");

		if (inventoryId != null) {
			setInventoryId(inventoryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
		}

		Long sedeId = (Long)attributes.get("sedeId");

		if (sedeId != null) {
			setSedeId(sedeId);
		}

		Integer stock = (Integer)attributes.get("stock");

		if (stock != null) {
			setStock(stock);
		}
	}

	/**
	 * Returns the company ID of this inventory.
	 *
	 * @return the company ID of this inventory
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this inventory.
	 *
	 * @return the create date of this inventory
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this inventory.
	 *
	 * @return the group ID of this inventory
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the inventory ID of this inventory.
	 *
	 * @return the inventory ID of this inventory
	 */
	@Override
	public long getInventoryId() {
		return model.getInventoryId();
	}

	/**
	 * Returns the modified date of this inventory.
	 *
	 * @return the modified date of this inventory
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this inventory.
	 *
	 * @return the primary key of this inventory
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product ID of this inventory.
	 *
	 * @return the product ID of this inventory
	 */
	@Override
	public long getProductId() {
		return model.getProductId();
	}

	/**
	 * Returns the sede ID of this inventory.
	 *
	 * @return the sede ID of this inventory
	 */
	@Override
	public long getSedeId() {
		return model.getSedeId();
	}

	/**
	 * Returns the stock of this inventory.
	 *
	 * @return the stock of this inventory
	 */
	@Override
	public Integer getStock() {
		return model.getStock();
	}

	/**
	 * Returns the user ID of this inventory.
	 *
	 * @return the user ID of this inventory
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this inventory.
	 *
	 * @return the user name of this inventory
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this inventory.
	 *
	 * @return the user uuid of this inventory
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this inventory.
	 *
	 * @param companyId the company ID of this inventory
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this inventory.
	 *
	 * @param createDate the create date of this inventory
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this inventory.
	 *
	 * @param groupId the group ID of this inventory
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the inventory ID of this inventory.
	 *
	 * @param inventoryId the inventory ID of this inventory
	 */
	@Override
	public void setInventoryId(long inventoryId) {
		model.setInventoryId(inventoryId);
	}

	/**
	 * Sets the modified date of this inventory.
	 *
	 * @param modifiedDate the modified date of this inventory
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this inventory.
	 *
	 * @param primaryKey the primary key of this inventory
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product ID of this inventory.
	 *
	 * @param productId the product ID of this inventory
	 */
	@Override
	public void setProductId(long productId) {
		model.setProductId(productId);
	}

	/**
	 * Sets the sede ID of this inventory.
	 *
	 * @param sedeId the sede ID of this inventory
	 */
	@Override
	public void setSedeId(long sedeId) {
		model.setSedeId(sedeId);
	}

	/**
	 * Sets the stock of this inventory.
	 *
	 * @param stock the stock of this inventory
	 */
	@Override
	public void setStock(Integer stock) {
		model.setStock(stock);
	}

	/**
	 * Sets the user ID of this inventory.
	 *
	 * @param userId the user ID of this inventory
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this inventory.
	 *
	 * @param userName the user name of this inventory
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this inventory.
	 *
	 * @param userUuid the user uuid of this inventory
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected InventoryWrapper wrap(Inventory inventory) {
		return new InventoryWrapper(inventory);
	}

}
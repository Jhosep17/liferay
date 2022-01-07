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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Inventory service. Represents a row in the &quot;VC_Inventory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>edu.ecopharmacy.nttdata.model.impl.InventoryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>edu.ecopharmacy.nttdata.model.impl.InventoryImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Inventory
 * @generated
 */
@ProviderType
public interface InventoryModel
	extends BaseModel<Inventory>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a inventory model instance should use the {@link Inventory} interface instead.
	 */

	/**
	 * Returns the primary key of this inventory.
	 *
	 * @return the primary key of this inventory
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this inventory.
	 *
	 * @param primaryKey the primary key of this inventory
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the inventory ID of this inventory.
	 *
	 * @return the inventory ID of this inventory
	 */
	public long getInventoryId();

	/**
	 * Sets the inventory ID of this inventory.
	 *
	 * @param inventoryId the inventory ID of this inventory
	 */
	public void setInventoryId(long inventoryId);

	/**
	 * Returns the group ID of this inventory.
	 *
	 * @return the group ID of this inventory
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this inventory.
	 *
	 * @param groupId the group ID of this inventory
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this inventory.
	 *
	 * @return the company ID of this inventory
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this inventory.
	 *
	 * @param companyId the company ID of this inventory
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this inventory.
	 *
	 * @return the user ID of this inventory
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this inventory.
	 *
	 * @param userId the user ID of this inventory
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this inventory.
	 *
	 * @return the user uuid of this inventory
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this inventory.
	 *
	 * @param userUuid the user uuid of this inventory
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this inventory.
	 *
	 * @return the user name of this inventory
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this inventory.
	 *
	 * @param userName the user name of this inventory
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this inventory.
	 *
	 * @return the create date of this inventory
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this inventory.
	 *
	 * @param createDate the create date of this inventory
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this inventory.
	 *
	 * @return the modified date of this inventory
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this inventory.
	 *
	 * @param modifiedDate the modified date of this inventory
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the product ID of this inventory.
	 *
	 * @return the product ID of this inventory
	 */
	public long getProductId();

	/**
	 * Sets the product ID of this inventory.
	 *
	 * @param productId the product ID of this inventory
	 */
	public void setProductId(long productId);

	/**
	 * Returns the sede ID of this inventory.
	 *
	 * @return the sede ID of this inventory
	 */
	public long getSedeId();

	/**
	 * Sets the sede ID of this inventory.
	 *
	 * @param sedeId the sede ID of this inventory
	 */
	public void setSedeId(long sedeId);

	/**
	 * Returns the stock of this inventory.
	 *
	 * @return the stock of this inventory
	 */
	public Integer getStock();

	/**
	 * Sets the stock of this inventory.
	 *
	 * @param stock the stock of this inventory
	 */
	public void setStock(Integer stock);

}
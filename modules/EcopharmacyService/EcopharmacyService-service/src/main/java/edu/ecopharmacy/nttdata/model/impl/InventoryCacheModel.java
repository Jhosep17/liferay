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

package edu.ecopharmacy.nttdata.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import edu.ecopharmacy.nttdata.model.Inventory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Inventory in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class InventoryCacheModel
	implements CacheModel<Inventory>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof InventoryCacheModel)) {
			return false;
		}

		InventoryCacheModel inventoryCacheModel = (InventoryCacheModel)object;

		if (inventoryId == inventoryCacheModel.inventoryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, inventoryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{inventoryId=");
		sb.append(inventoryId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", productId=");
		sb.append(productId);
		sb.append(", sedeId=");
		sb.append(sedeId);
		sb.append(", stock=");
		sb.append(stock);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Inventory toEntityModel() {
		InventoryImpl inventoryImpl = new InventoryImpl();

		inventoryImpl.setInventoryId(inventoryId);
		inventoryImpl.setGroupId(groupId);
		inventoryImpl.setCompanyId(companyId);
		inventoryImpl.setUserId(userId);

		if (userName == null) {
			inventoryImpl.setUserName("");
		}
		else {
			inventoryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			inventoryImpl.setCreateDate(null);
		}
		else {
			inventoryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			inventoryImpl.setModifiedDate(null);
		}
		else {
			inventoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		inventoryImpl.setProductId(productId);
		inventoryImpl.setSedeId(sedeId);
		inventoryImpl.setStock(stock);

		inventoryImpl.resetOriginalValues();

		return inventoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		inventoryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		productId = objectInput.readLong();

		sedeId = objectInput.readLong();

		stock = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(inventoryId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(productId);

		objectOutput.writeLong(sedeId);

		objectOutput.writeInt(stock);
	}

	public long inventoryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long productId;
	public long sedeId;
	public int stock;

}
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

import edu.ecopharmacy.nttdata.model.Product;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Product in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProductCacheModel implements CacheModel<Product>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductCacheModel)) {
			return false;
		}

		ProductCacheModel productCacheModel = (ProductCacheModel)object;

		if (productId == productCacheModel.productId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, productId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{productId=");
		sb.append(productId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", price=");
		sb.append(price);
		sb.append(", category=");
		sb.append(category);
		sb.append(", images=");
		sb.append(images);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Product toEntityModel() {
		ProductImpl productImpl = new ProductImpl();

		productImpl.setProductId(productId);
		productImpl.setGroupId(groupId);
		productImpl.setCompanyId(companyId);
		productImpl.setUserId(userId);

		if (userName == null) {
			productImpl.setUserName("");
		}
		else {
			productImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			productImpl.setCreateDate(null);
		}
		else {
			productImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			productImpl.setModifiedDate(null);
		}
		else {
			productImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			productImpl.setName("");
		}
		else {
			productImpl.setName(name);
		}

		if (description == null) {
			productImpl.setDescription("");
		}
		else {
			productImpl.setDescription(description);
		}

		productImpl.setPrice(price);

		if (category == null) {
			productImpl.setCategory("");
		}
		else {
			productImpl.setCategory(category);
		}

		if (images == null) {
			productImpl.setImages("");
		}
		else {
			productImpl.setImages(images);
		}

		productImpl.resetOriginalValues();

		return productImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		productId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();

		price = objectInput.readDouble();
		category = objectInput.readUTF();
		images = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(productId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeDouble(price);

		if (category == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(category);
		}

		if (images == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(images);
		}
	}

	public long productId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String description;
	public double price;
	public String category;
	public String images;

}
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

import edu.ecopharmacy.nttdata.model.Sede;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Sede in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SedeCacheModel implements CacheModel<Sede>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SedeCacheModel)) {
			return false;
		}

		SedeCacheModel sedeCacheModel = (SedeCacheModel)object;

		if (sedeId == sedeCacheModel.sedeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sedeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{sedeId=");
		sb.append(sedeId);
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
		sb.append(", direction=");
		sb.append(direction);
		sb.append(", phone=");
		sb.append(phone);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Sede toEntityModel() {
		SedeImpl sedeImpl = new SedeImpl();

		sedeImpl.setSedeId(sedeId);
		sedeImpl.setGroupId(groupId);
		sedeImpl.setCompanyId(companyId);
		sedeImpl.setUserId(userId);

		if (userName == null) {
			sedeImpl.setUserName("");
		}
		else {
			sedeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sedeImpl.setCreateDate(null);
		}
		else {
			sedeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sedeImpl.setModifiedDate(null);
		}
		else {
			sedeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			sedeImpl.setName("");
		}
		else {
			sedeImpl.setName(name);
		}

		if (direction == null) {
			sedeImpl.setDirection("");
		}
		else {
			sedeImpl.setDirection(direction);
		}

		if (phone == null) {
			sedeImpl.setPhone("");
		}
		else {
			sedeImpl.setPhone(phone);
		}

		sedeImpl.resetOriginalValues();

		return sedeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sedeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		direction = objectInput.readUTF();
		phone = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sedeId);

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

		if (direction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(direction);
		}

		if (phone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(phone);
		}
	}

	public long sedeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String direction;
	public String phone;

}
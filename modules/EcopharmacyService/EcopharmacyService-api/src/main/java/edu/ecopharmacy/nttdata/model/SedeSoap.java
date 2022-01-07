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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class SedeSoap implements Serializable {

	public static SedeSoap toSoapModel(Sede model) {
		SedeSoap soapModel = new SedeSoap();

		soapModel.setSedeId(model.getSedeId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setDirection(model.getDirection());
		soapModel.setPhone(model.getPhone());

		return soapModel;
	}

	public static SedeSoap[] toSoapModels(Sede[] models) {
		SedeSoap[] soapModels = new SedeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SedeSoap[][] toSoapModels(Sede[][] models) {
		SedeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SedeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SedeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SedeSoap[] toSoapModels(List<Sede> models) {
		List<SedeSoap> soapModels = new ArrayList<SedeSoap>(models.size());

		for (Sede model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SedeSoap[soapModels.size()]);
	}

	public SedeSoap() {
	}

	public long getPrimaryKey() {
		return _sedeId;
	}

	public void setPrimaryKey(long pk) {
		setSedeId(pk);
	}

	public long getSedeId() {
		return _sedeId;
	}

	public void setSedeId(long sedeId) {
		_sedeId = sedeId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDirection() {
		return _direction;
	}

	public void setDirection(String direction) {
		_direction = direction;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	private long _sedeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _direction;
	private String _phone;

}
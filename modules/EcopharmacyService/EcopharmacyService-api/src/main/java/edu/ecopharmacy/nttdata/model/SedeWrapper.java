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
 * This class is a wrapper for {@link Sede}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Sede
 * @generated
 */
public class SedeWrapper
	extends BaseModelWrapper<Sede> implements ModelWrapper<Sede>, Sede {

	public SedeWrapper(Sede sede) {
		super(sede);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sedeId", getSedeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("direction", getDirection());
		attributes.put("phone", getPhone());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sedeId = (Long)attributes.get("sedeId");

		if (sedeId != null) {
			setSedeId(sedeId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String direction = (String)attributes.get("direction");

		if (direction != null) {
			setDirection(direction);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}
	}

	/**
	 * Returns the company ID of this sede.
	 *
	 * @return the company ID of this sede
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sede.
	 *
	 * @return the create date of this sede
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the direction of this sede.
	 *
	 * @return the direction of this sede
	 */
	@Override
	public String getDirection() {
		return model.getDirection();
	}

	/**
	 * Returns the group ID of this sede.
	 *
	 * @return the group ID of this sede
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sede.
	 *
	 * @return the modified date of this sede
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this sede.
	 *
	 * @return the name of this sede
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the phone of this sede.
	 *
	 * @return the phone of this sede
	 */
	@Override
	public String getPhone() {
		return model.getPhone();
	}

	/**
	 * Returns the primary key of this sede.
	 *
	 * @return the primary key of this sede
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sede ID of this sede.
	 *
	 * @return the sede ID of this sede
	 */
	@Override
	public long getSedeId() {
		return model.getSedeId();
	}

	/**
	 * Returns the user ID of this sede.
	 *
	 * @return the user ID of this sede
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sede.
	 *
	 * @return the user name of this sede
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sede.
	 *
	 * @return the user uuid of this sede
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
	 * Sets the company ID of this sede.
	 *
	 * @param companyId the company ID of this sede
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sede.
	 *
	 * @param createDate the create date of this sede
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the direction of this sede.
	 *
	 * @param direction the direction of this sede
	 */
	@Override
	public void setDirection(String direction) {
		model.setDirection(direction);
	}

	/**
	 * Sets the group ID of this sede.
	 *
	 * @param groupId the group ID of this sede
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sede.
	 *
	 * @param modifiedDate the modified date of this sede
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this sede.
	 *
	 * @param name the name of this sede
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the phone of this sede.
	 *
	 * @param phone the phone of this sede
	 */
	@Override
	public void setPhone(String phone) {
		model.setPhone(phone);
	}

	/**
	 * Sets the primary key of this sede.
	 *
	 * @param primaryKey the primary key of this sede
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sede ID of this sede.
	 *
	 * @param sedeId the sede ID of this sede
	 */
	@Override
	public void setSedeId(long sedeId) {
		model.setSedeId(sedeId);
	}

	/**
	 * Sets the user ID of this sede.
	 *
	 * @param userId the user ID of this sede
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sede.
	 *
	 * @param userName the user name of this sede
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sede.
	 *
	 * @param userUuid the user uuid of this sede
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected SedeWrapper wrap(Sede sede) {
		return new SedeWrapper(sede);
	}

}
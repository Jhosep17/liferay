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

package edu.ecopharmacy.nttdata.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SedeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SedeLocalService
 * @generated
 */
public class SedeLocalServiceWrapper
	implements SedeLocalService, ServiceWrapper<SedeLocalService> {

	public SedeLocalServiceWrapper(SedeLocalService sedeLocalService) {
		_sedeLocalService = sedeLocalService;
	}

	/**
	 * Adds the sede to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SedeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sede the sede
	 * @return the sede that was added
	 */
	@Override
	public edu.ecopharmacy.nttdata.model.Sede addSede(
		edu.ecopharmacy.nttdata.model.Sede sede) {

		return _sedeLocalService.addSede(sede);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sedeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sede with the primary key. Does not add the sede to the database.
	 *
	 * @param sedeId the primary key for the new sede
	 * @return the new sede
	 */
	@Override
	public edu.ecopharmacy.nttdata.model.Sede createSede(long sedeId) {
		return _sedeLocalService.createSede(sedeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sedeLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sede with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SedeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sedeId the primary key of the sede
	 * @return the sede that was removed
	 * @throws PortalException if a sede with the primary key could not be found
	 */
	@Override
	public edu.ecopharmacy.nttdata.model.Sede deleteSede(long sedeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sedeLocalService.deleteSede(sedeId);
	}

	/**
	 * Deletes the sede from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SedeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sede the sede
	 * @return the sede that was removed
	 */
	@Override
	public edu.ecopharmacy.nttdata.model.Sede deleteSede(
		edu.ecopharmacy.nttdata.model.Sede sede) {

		return _sedeLocalService.deleteSede(sede);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sedeLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _sedeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>edu.ecopharmacy.nttdata.model.impl.SedeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _sedeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>edu.ecopharmacy.nttdata.model.impl.SedeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _sedeLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _sedeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _sedeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public edu.ecopharmacy.nttdata.model.Sede fetchSede(long sedeId) {
		return _sedeLocalService.fetchSede(sedeId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sedeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sedeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sedeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sedeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sede with the primary key.
	 *
	 * @param sedeId the primary key of the sede
	 * @return the sede
	 * @throws PortalException if a sede with the primary key could not be found
	 */
	@Override
	public edu.ecopharmacy.nttdata.model.Sede getSede(long sedeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sedeLocalService.getSede(sedeId);
	}

	@Override
	public java.util.List<edu.ecopharmacy.nttdata.model.Sede> getSedeAll() {
		return _sedeLocalService.getSedeAll();
	}

	/**
	 * Returns a range of all the sedes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>edu.ecopharmacy.nttdata.model.impl.SedeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sedes
	 * @param end the upper bound of the range of sedes (not inclusive)
	 * @return the range of sedes
	 */
	@Override
	public java.util.List<edu.ecopharmacy.nttdata.model.Sede> getSedes(
		int start, int end) {

		return _sedeLocalService.getSedes(start, end);
	}

	/**
	 * Returns the number of sedes.
	 *
	 * @return the number of sedes
	 */
	@Override
	public int getSedesCount() {
		return _sedeLocalService.getSedesCount();
	}

	/**
	 * Updates the sede in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SedeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sede the sede
	 * @return the sede that was updated
	 */
	@Override
	public edu.ecopharmacy.nttdata.model.Sede updateSede(
		edu.ecopharmacy.nttdata.model.Sede sede) {

		return _sedeLocalService.updateSede(sede);
	}

	@Override
	public SedeLocalService getWrappedService() {
		return _sedeLocalService;
	}

	@Override
	public void setWrappedService(SedeLocalService sedeLocalService) {
		_sedeLocalService = sedeLocalService;
	}

	private SedeLocalService _sedeLocalService;

}
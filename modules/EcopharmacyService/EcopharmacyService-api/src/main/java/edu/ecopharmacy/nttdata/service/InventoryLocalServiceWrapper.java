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
 * Provides a wrapper for {@link InventoryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see InventoryLocalService
 * @generated
 */
public class InventoryLocalServiceWrapper
	implements InventoryLocalService, ServiceWrapper<InventoryLocalService> {

	public InventoryLocalServiceWrapper(
		InventoryLocalService inventoryLocalService) {

		_inventoryLocalService = inventoryLocalService;
	}

	/**
	 * Adds the inventory to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InventoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param inventory the inventory
	 * @return the inventory that was added
	 */
	@Override
	public edu.ecopharmacy.nttdata.model.Inventory addInventory(
		edu.ecopharmacy.nttdata.model.Inventory inventory) {

		return _inventoryLocalService.addInventory(inventory);
	}

	/**
	 * Creates a new inventory with the primary key. Does not add the inventory to the database.
	 *
	 * @param inventoryId the primary key for the new inventory
	 * @return the new inventory
	 */
	@Override
	public edu.ecopharmacy.nttdata.model.Inventory createInventory(
		long inventoryId) {

		return _inventoryLocalService.createInventory(inventoryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _inventoryLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the inventory from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InventoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param inventory the inventory
	 * @return the inventory that was removed
	 */
	@Override
	public edu.ecopharmacy.nttdata.model.Inventory deleteInventory(
		edu.ecopharmacy.nttdata.model.Inventory inventory) {

		return _inventoryLocalService.deleteInventory(inventory);
	}

	/**
	 * Deletes the inventory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InventoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param inventoryId the primary key of the inventory
	 * @return the inventory that was removed
	 * @throws PortalException if a inventory with the primary key could not be found
	 */
	@Override
	public edu.ecopharmacy.nttdata.model.Inventory deleteInventory(
			long inventoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _inventoryLocalService.deleteInventory(inventoryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _inventoryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _inventoryLocalService.dynamicQuery();
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

		return _inventoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>edu.ecopharmacy.nttdata.model.impl.InventoryModelImpl</code>.
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

		return _inventoryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>edu.ecopharmacy.nttdata.model.impl.InventoryModelImpl</code>.
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

		return _inventoryLocalService.dynamicQuery(
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

		return _inventoryLocalService.dynamicQueryCount(dynamicQuery);
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

		return _inventoryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public edu.ecopharmacy.nttdata.model.Inventory fetchInventory(
		long inventoryId) {

		return _inventoryLocalService.fetchInventory(inventoryId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _inventoryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _inventoryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the inventories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>edu.ecopharmacy.nttdata.model.impl.InventoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inventories
	 * @param end the upper bound of the range of inventories (not inclusive)
	 * @return the range of inventories
	 */
	@Override
	public java.util.List<edu.ecopharmacy.nttdata.model.Inventory>
		getInventories(int start, int end) {

		return _inventoryLocalService.getInventories(start, end);
	}

	/**
	 * Returns the number of inventories.
	 *
	 * @return the number of inventories
	 */
	@Override
	public int getInventoriesCount() {
		return _inventoryLocalService.getInventoriesCount();
	}

	/**
	 * Returns the inventory with the primary key.
	 *
	 * @param inventoryId the primary key of the inventory
	 * @return the inventory
	 * @throws PortalException if a inventory with the primary key could not be found
	 */
	@Override
	public edu.ecopharmacy.nttdata.model.Inventory getInventory(
			long inventoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _inventoryLocalService.getInventory(inventoryId);
	}

	@Override
	public java.util.List<edu.ecopharmacy.nttdata.model.Inventory>
		getListInventorySede(long sede) {

		return _inventoryLocalService.getListInventorySede(sede);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _inventoryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _inventoryLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public edu.ecopharmacy.nttdata.model.Inventory saveInventory(
		long productId, long sedeId, int stock) {

		return _inventoryLocalService.saveInventory(productId, sedeId, stock);
	}

	/**
	 * Updates the inventory in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InventoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param inventory the inventory
	 * @return the inventory that was updated
	 */
	@Override
	public edu.ecopharmacy.nttdata.model.Inventory updateInventory(
		edu.ecopharmacy.nttdata.model.Inventory inventory) {

		return _inventoryLocalService.updateInventory(inventory);
	}

	@Override
	public InventoryLocalService getWrappedService() {
		return _inventoryLocalService;
	}

	@Override
	public void setWrappedService(InventoryLocalService inventoryLocalService) {
		_inventoryLocalService = inventoryLocalService;
	}

	private InventoryLocalService _inventoryLocalService;

}
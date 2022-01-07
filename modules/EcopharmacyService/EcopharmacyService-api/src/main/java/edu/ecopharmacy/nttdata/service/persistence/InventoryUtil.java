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

package edu.ecopharmacy.nttdata.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import edu.ecopharmacy.nttdata.model.Inventory;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the inventory service. This utility wraps <code>edu.ecopharmacy.nttdata.service.persistence.impl.InventoryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InventoryPersistence
 * @generated
 */
public class InventoryUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Inventory inventory) {
		getPersistence().clearCache(inventory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Inventory> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Inventory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Inventory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Inventory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Inventory> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Inventory update(Inventory inventory) {
		return getPersistence().update(inventory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Inventory update(
		Inventory inventory, ServiceContext serviceContext) {

		return getPersistence().update(inventory, serviceContext);
	}

	/**
	 * Returns all the inventories where sedeId = &#63;.
	 *
	 * @param sedeId the sede ID
	 * @return the matching inventories
	 */
	public static List<Inventory> findBySedeId(long sedeId) {
		return getPersistence().findBySedeId(sedeId);
	}

	/**
	 * Returns a range of all the inventories where sedeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InventoryModelImpl</code>.
	 * </p>
	 *
	 * @param sedeId the sede ID
	 * @param start the lower bound of the range of inventories
	 * @param end the upper bound of the range of inventories (not inclusive)
	 * @return the range of matching inventories
	 */
	public static List<Inventory> findBySedeId(
		long sedeId, int start, int end) {

		return getPersistence().findBySedeId(sedeId, start, end);
	}

	/**
	 * Returns an ordered range of all the inventories where sedeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InventoryModelImpl</code>.
	 * </p>
	 *
	 * @param sedeId the sede ID
	 * @param start the lower bound of the range of inventories
	 * @param end the upper bound of the range of inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching inventories
	 */
	public static List<Inventory> findBySedeId(
		long sedeId, int start, int end,
		OrderByComparator<Inventory> orderByComparator) {

		return getPersistence().findBySedeId(
			sedeId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the inventories where sedeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InventoryModelImpl</code>.
	 * </p>
	 *
	 * @param sedeId the sede ID
	 * @param start the lower bound of the range of inventories
	 * @param end the upper bound of the range of inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching inventories
	 */
	public static List<Inventory> findBySedeId(
		long sedeId, int start, int end,
		OrderByComparator<Inventory> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBySedeId(
			sedeId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first inventory in the ordered set where sedeId = &#63;.
	 *
	 * @param sedeId the sede ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inventory
	 * @throws NoSuchInventoryException if a matching inventory could not be found
	 */
	public static Inventory findBySedeId_First(
			long sedeId, OrderByComparator<Inventory> orderByComparator)
		throws edu.ecopharmacy.nttdata.exception.NoSuchInventoryException {

		return getPersistence().findBySedeId_First(sedeId, orderByComparator);
	}

	/**
	 * Returns the first inventory in the ordered set where sedeId = &#63;.
	 *
	 * @param sedeId the sede ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inventory, or <code>null</code> if a matching inventory could not be found
	 */
	public static Inventory fetchBySedeId_First(
		long sedeId, OrderByComparator<Inventory> orderByComparator) {

		return getPersistence().fetchBySedeId_First(sedeId, orderByComparator);
	}

	/**
	 * Returns the last inventory in the ordered set where sedeId = &#63;.
	 *
	 * @param sedeId the sede ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inventory
	 * @throws NoSuchInventoryException if a matching inventory could not be found
	 */
	public static Inventory findBySedeId_Last(
			long sedeId, OrderByComparator<Inventory> orderByComparator)
		throws edu.ecopharmacy.nttdata.exception.NoSuchInventoryException {

		return getPersistence().findBySedeId_Last(sedeId, orderByComparator);
	}

	/**
	 * Returns the last inventory in the ordered set where sedeId = &#63;.
	 *
	 * @param sedeId the sede ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inventory, or <code>null</code> if a matching inventory could not be found
	 */
	public static Inventory fetchBySedeId_Last(
		long sedeId, OrderByComparator<Inventory> orderByComparator) {

		return getPersistence().fetchBySedeId_Last(sedeId, orderByComparator);
	}

	/**
	 * Returns the inventories before and after the current inventory in the ordered set where sedeId = &#63;.
	 *
	 * @param inventoryId the primary key of the current inventory
	 * @param sedeId the sede ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inventory
	 * @throws NoSuchInventoryException if a inventory with the primary key could not be found
	 */
	public static Inventory[] findBySedeId_PrevAndNext(
			long inventoryId, long sedeId,
			OrderByComparator<Inventory> orderByComparator)
		throws edu.ecopharmacy.nttdata.exception.NoSuchInventoryException {

		return getPersistence().findBySedeId_PrevAndNext(
			inventoryId, sedeId, orderByComparator);
	}

	/**
	 * Removes all the inventories where sedeId = &#63; from the database.
	 *
	 * @param sedeId the sede ID
	 */
	public static void removeBySedeId(long sedeId) {
		getPersistence().removeBySedeId(sedeId);
	}

	/**
	 * Returns the number of inventories where sedeId = &#63;.
	 *
	 * @param sedeId the sede ID
	 * @return the number of matching inventories
	 */
	public static int countBySedeId(long sedeId) {
		return getPersistence().countBySedeId(sedeId);
	}

	/**
	 * Caches the inventory in the entity cache if it is enabled.
	 *
	 * @param inventory the inventory
	 */
	public static void cacheResult(Inventory inventory) {
		getPersistence().cacheResult(inventory);
	}

	/**
	 * Caches the inventories in the entity cache if it is enabled.
	 *
	 * @param inventories the inventories
	 */
	public static void cacheResult(List<Inventory> inventories) {
		getPersistence().cacheResult(inventories);
	}

	/**
	 * Creates a new inventory with the primary key. Does not add the inventory to the database.
	 *
	 * @param inventoryId the primary key for the new inventory
	 * @return the new inventory
	 */
	public static Inventory create(long inventoryId) {
		return getPersistence().create(inventoryId);
	}

	/**
	 * Removes the inventory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param inventoryId the primary key of the inventory
	 * @return the inventory that was removed
	 * @throws NoSuchInventoryException if a inventory with the primary key could not be found
	 */
	public static Inventory remove(long inventoryId)
		throws edu.ecopharmacy.nttdata.exception.NoSuchInventoryException {

		return getPersistence().remove(inventoryId);
	}

	public static Inventory updateImpl(Inventory inventory) {
		return getPersistence().updateImpl(inventory);
	}

	/**
	 * Returns the inventory with the primary key or throws a <code>NoSuchInventoryException</code> if it could not be found.
	 *
	 * @param inventoryId the primary key of the inventory
	 * @return the inventory
	 * @throws NoSuchInventoryException if a inventory with the primary key could not be found
	 */
	public static Inventory findByPrimaryKey(long inventoryId)
		throws edu.ecopharmacy.nttdata.exception.NoSuchInventoryException {

		return getPersistence().findByPrimaryKey(inventoryId);
	}

	/**
	 * Returns the inventory with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param inventoryId the primary key of the inventory
	 * @return the inventory, or <code>null</code> if a inventory with the primary key could not be found
	 */
	public static Inventory fetchByPrimaryKey(long inventoryId) {
		return getPersistence().fetchByPrimaryKey(inventoryId);
	}

	/**
	 * Returns all the inventories.
	 *
	 * @return the inventories
	 */
	public static List<Inventory> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the inventories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InventoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inventories
	 * @param end the upper bound of the range of inventories (not inclusive)
	 * @return the range of inventories
	 */
	public static List<Inventory> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the inventories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InventoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inventories
	 * @param end the upper bound of the range of inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of inventories
	 */
	public static List<Inventory> findAll(
		int start, int end, OrderByComparator<Inventory> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the inventories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InventoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of inventories
	 * @param end the upper bound of the range of inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of inventories
	 */
	public static List<Inventory> findAll(
		int start, int end, OrderByComparator<Inventory> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the inventories from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of inventories.
	 *
	 * @return the number of inventories
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static InventoryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<InventoryPersistence, InventoryPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(InventoryPersistence.class);

		ServiceTracker<InventoryPersistence, InventoryPersistence>
			serviceTracker =
				new ServiceTracker<InventoryPersistence, InventoryPersistence>(
					bundle.getBundleContext(), InventoryPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}
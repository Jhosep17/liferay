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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import edu.ecopharmacy.nttdata.exception.NoSuchInventoryException;
import edu.ecopharmacy.nttdata.model.Inventory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the inventory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InventoryUtil
 * @generated
 */
@ProviderType
public interface InventoryPersistence extends BasePersistence<Inventory> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InventoryUtil} to access the inventory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the inventories where sedeId = &#63;.
	 *
	 * @param sedeId the sede ID
	 * @return the matching inventories
	 */
	public java.util.List<Inventory> findBySedeId(long sedeId);

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
	public java.util.List<Inventory> findBySedeId(
		long sedeId, int start, int end);

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
	public java.util.List<Inventory> findBySedeId(
		long sedeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Inventory>
			orderByComparator);

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
	public java.util.List<Inventory> findBySedeId(
		long sedeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Inventory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first inventory in the ordered set where sedeId = &#63;.
	 *
	 * @param sedeId the sede ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inventory
	 * @throws NoSuchInventoryException if a matching inventory could not be found
	 */
	public Inventory findBySedeId_First(
			long sedeId,
			com.liferay.portal.kernel.util.OrderByComparator<Inventory>
				orderByComparator)
		throws NoSuchInventoryException;

	/**
	 * Returns the first inventory in the ordered set where sedeId = &#63;.
	 *
	 * @param sedeId the sede ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching inventory, or <code>null</code> if a matching inventory could not be found
	 */
	public Inventory fetchBySedeId_First(
		long sedeId,
		com.liferay.portal.kernel.util.OrderByComparator<Inventory>
			orderByComparator);

	/**
	 * Returns the last inventory in the ordered set where sedeId = &#63;.
	 *
	 * @param sedeId the sede ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inventory
	 * @throws NoSuchInventoryException if a matching inventory could not be found
	 */
	public Inventory findBySedeId_Last(
			long sedeId,
			com.liferay.portal.kernel.util.OrderByComparator<Inventory>
				orderByComparator)
		throws NoSuchInventoryException;

	/**
	 * Returns the last inventory in the ordered set where sedeId = &#63;.
	 *
	 * @param sedeId the sede ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching inventory, or <code>null</code> if a matching inventory could not be found
	 */
	public Inventory fetchBySedeId_Last(
		long sedeId,
		com.liferay.portal.kernel.util.OrderByComparator<Inventory>
			orderByComparator);

	/**
	 * Returns the inventories before and after the current inventory in the ordered set where sedeId = &#63;.
	 *
	 * @param inventoryId the primary key of the current inventory
	 * @param sedeId the sede ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next inventory
	 * @throws NoSuchInventoryException if a inventory with the primary key could not be found
	 */
	public Inventory[] findBySedeId_PrevAndNext(
			long inventoryId, long sedeId,
			com.liferay.portal.kernel.util.OrderByComparator<Inventory>
				orderByComparator)
		throws NoSuchInventoryException;

	/**
	 * Removes all the inventories where sedeId = &#63; from the database.
	 *
	 * @param sedeId the sede ID
	 */
	public void removeBySedeId(long sedeId);

	/**
	 * Returns the number of inventories where sedeId = &#63;.
	 *
	 * @param sedeId the sede ID
	 * @return the number of matching inventories
	 */
	public int countBySedeId(long sedeId);

	/**
	 * Caches the inventory in the entity cache if it is enabled.
	 *
	 * @param inventory the inventory
	 */
	public void cacheResult(Inventory inventory);

	/**
	 * Caches the inventories in the entity cache if it is enabled.
	 *
	 * @param inventories the inventories
	 */
	public void cacheResult(java.util.List<Inventory> inventories);

	/**
	 * Creates a new inventory with the primary key. Does not add the inventory to the database.
	 *
	 * @param inventoryId the primary key for the new inventory
	 * @return the new inventory
	 */
	public Inventory create(long inventoryId);

	/**
	 * Removes the inventory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param inventoryId the primary key of the inventory
	 * @return the inventory that was removed
	 * @throws NoSuchInventoryException if a inventory with the primary key could not be found
	 */
	public Inventory remove(long inventoryId) throws NoSuchInventoryException;

	public Inventory updateImpl(Inventory inventory);

	/**
	 * Returns the inventory with the primary key or throws a <code>NoSuchInventoryException</code> if it could not be found.
	 *
	 * @param inventoryId the primary key of the inventory
	 * @return the inventory
	 * @throws NoSuchInventoryException if a inventory with the primary key could not be found
	 */
	public Inventory findByPrimaryKey(long inventoryId)
		throws NoSuchInventoryException;

	/**
	 * Returns the inventory with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param inventoryId the primary key of the inventory
	 * @return the inventory, or <code>null</code> if a inventory with the primary key could not be found
	 */
	public Inventory fetchByPrimaryKey(long inventoryId);

	/**
	 * Returns all the inventories.
	 *
	 * @return the inventories
	 */
	public java.util.List<Inventory> findAll();

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
	public java.util.List<Inventory> findAll(int start, int end);

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
	public java.util.List<Inventory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Inventory>
			orderByComparator);

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
	public java.util.List<Inventory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Inventory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the inventories from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of inventories.
	 *
	 * @return the number of inventories
	 */
	public int countAll();

}
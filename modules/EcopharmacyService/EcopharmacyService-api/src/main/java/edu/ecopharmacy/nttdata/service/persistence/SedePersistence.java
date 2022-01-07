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

import edu.ecopharmacy.nttdata.exception.NoSuchSedeException;
import edu.ecopharmacy.nttdata.model.Sede;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sede service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SedeUtil
 * @generated
 */
@ProviderType
public interface SedePersistence extends BasePersistence<Sede> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SedeUtil} to access the sede persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the sede in the entity cache if it is enabled.
	 *
	 * @param sede the sede
	 */
	public void cacheResult(Sede sede);

	/**
	 * Caches the sedes in the entity cache if it is enabled.
	 *
	 * @param sedes the sedes
	 */
	public void cacheResult(java.util.List<Sede> sedes);

	/**
	 * Creates a new sede with the primary key. Does not add the sede to the database.
	 *
	 * @param sedeId the primary key for the new sede
	 * @return the new sede
	 */
	public Sede create(long sedeId);

	/**
	 * Removes the sede with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sedeId the primary key of the sede
	 * @return the sede that was removed
	 * @throws NoSuchSedeException if a sede with the primary key could not be found
	 */
	public Sede remove(long sedeId) throws NoSuchSedeException;

	public Sede updateImpl(Sede sede);

	/**
	 * Returns the sede with the primary key or throws a <code>NoSuchSedeException</code> if it could not be found.
	 *
	 * @param sedeId the primary key of the sede
	 * @return the sede
	 * @throws NoSuchSedeException if a sede with the primary key could not be found
	 */
	public Sede findByPrimaryKey(long sedeId) throws NoSuchSedeException;

	/**
	 * Returns the sede with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sedeId the primary key of the sede
	 * @return the sede, or <code>null</code> if a sede with the primary key could not be found
	 */
	public Sede fetchByPrimaryKey(long sedeId);

	/**
	 * Returns all the sedes.
	 *
	 * @return the sedes
	 */
	public java.util.List<Sede> findAll();

	/**
	 * Returns a range of all the sedes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SedeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sedes
	 * @param end the upper bound of the range of sedes (not inclusive)
	 * @return the range of sedes
	 */
	public java.util.List<Sede> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sedes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SedeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sedes
	 * @param end the upper bound of the range of sedes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sedes
	 */
	public java.util.List<Sede> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sede>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sedes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SedeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sedes
	 * @param end the upper bound of the range of sedes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sedes
	 */
	public java.util.List<Sede> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sede>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sedes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sedes.
	 *
	 * @return the number of sedes
	 */
	public int countAll();

}
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

package edu.ecopharmacy.nttdata.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;

import edu.ecopharmacy.nttdata.exception.NoSuchSedeException;
import edu.ecopharmacy.nttdata.model.Sede;
import edu.ecopharmacy.nttdata.model.impl.SedeImpl;
import edu.ecopharmacy.nttdata.model.impl.SedeModelImpl;
import edu.ecopharmacy.nttdata.service.persistence.SedePersistence;
import edu.ecopharmacy.nttdata.service.persistence.impl.constants.VCPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the sede service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SedePersistence.class)
public class SedePersistenceImpl
	extends BasePersistenceImpl<Sede> implements SedePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SedeUtil</code> to access the sede persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SedeImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public SedePersistenceImpl() {
		setModelClass(Sede.class);

		setModelImplClass(SedeImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the sede in the entity cache if it is enabled.
	 *
	 * @param sede the sede
	 */
	@Override
	public void cacheResult(Sede sede) {
		entityCache.putResult(SedeImpl.class, sede.getPrimaryKey(), sede);
	}

	/**
	 * Caches the sedes in the entity cache if it is enabled.
	 *
	 * @param sedes the sedes
	 */
	@Override
	public void cacheResult(List<Sede> sedes) {
		for (Sede sede : sedes) {
			if (entityCache.getResult(SedeImpl.class, sede.getPrimaryKey()) ==
					null) {

				cacheResult(sede);
			}
		}
	}

	/**
	 * Clears the cache for all sedes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SedeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sede.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Sede sede) {
		entityCache.removeResult(SedeImpl.class, sede);
	}

	@Override
	public void clearCache(List<Sede> sedes) {
		for (Sede sede : sedes) {
			entityCache.removeResult(SedeImpl.class, sede);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SedeImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sede with the primary key. Does not add the sede to the database.
	 *
	 * @param sedeId the primary key for the new sede
	 * @return the new sede
	 */
	@Override
	public Sede create(long sedeId) {
		Sede sede = new SedeImpl();

		sede.setNew(true);
		sede.setPrimaryKey(sedeId);

		sede.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sede;
	}

	/**
	 * Removes the sede with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sedeId the primary key of the sede
	 * @return the sede that was removed
	 * @throws NoSuchSedeException if a sede with the primary key could not be found
	 */
	@Override
	public Sede remove(long sedeId) throws NoSuchSedeException {
		return remove((Serializable)sedeId);
	}

	/**
	 * Removes the sede with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sede
	 * @return the sede that was removed
	 * @throws NoSuchSedeException if a sede with the primary key could not be found
	 */
	@Override
	public Sede remove(Serializable primaryKey) throws NoSuchSedeException {
		Session session = null;

		try {
			session = openSession();

			Sede sede = (Sede)session.get(SedeImpl.class, primaryKey);

			if (sede == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSedeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sede);
		}
		catch (NoSuchSedeException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Sede removeImpl(Sede sede) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sede)) {
				sede = (Sede)session.get(
					SedeImpl.class, sede.getPrimaryKeyObj());
			}

			if (sede != null) {
				session.delete(sede);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sede != null) {
			clearCache(sede);
		}

		return sede;
	}

	@Override
	public Sede updateImpl(Sede sede) {
		boolean isNew = sede.isNew();

		if (!(sede instanceof SedeModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sede.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(sede);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sede proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Sede implementation " +
					sede.getClass());
		}

		SedeModelImpl sedeModelImpl = (SedeModelImpl)sede;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (sede.getCreateDate() == null)) {
			if (serviceContext == null) {
				sede.setCreateDate(now);
			}
			else {
				sede.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!sedeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sede.setModifiedDate(now);
			}
			else {
				sede.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sede);
			}
			else {
				sede = (Sede)session.merge(sede);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(SedeImpl.class, sede, false, true);

		if (isNew) {
			sede.setNew(false);
		}

		sede.resetOriginalValues();

		return sede;
	}

	/**
	 * Returns the sede with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sede
	 * @return the sede
	 * @throws NoSuchSedeException if a sede with the primary key could not be found
	 */
	@Override
	public Sede findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSedeException {

		Sede sede = fetchByPrimaryKey(primaryKey);

		if (sede == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSedeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sede;
	}

	/**
	 * Returns the sede with the primary key or throws a <code>NoSuchSedeException</code> if it could not be found.
	 *
	 * @param sedeId the primary key of the sede
	 * @return the sede
	 * @throws NoSuchSedeException if a sede with the primary key could not be found
	 */
	@Override
	public Sede findByPrimaryKey(long sedeId) throws NoSuchSedeException {
		return findByPrimaryKey((Serializable)sedeId);
	}

	/**
	 * Returns the sede with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sedeId the primary key of the sede
	 * @return the sede, or <code>null</code> if a sede with the primary key could not be found
	 */
	@Override
	public Sede fetchByPrimaryKey(long sedeId) {
		return fetchByPrimaryKey((Serializable)sedeId);
	}

	/**
	 * Returns all the sedes.
	 *
	 * @return the sedes
	 */
	@Override
	public List<Sede> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Sede> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Sede> findAll(
		int start, int end, OrderByComparator<Sede> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Sede> findAll(
		int start, int end, OrderByComparator<Sede> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Sede> list = null;

		if (useFinderCache) {
			list = (List<Sede>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEDE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEDE;

				sql = sql.concat(SedeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Sede>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the sedes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Sede sede : findAll()) {
			remove(sede);
		}
	}

	/**
	 * Returns the number of sedes.
	 *
	 * @return the number of sedes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SEDE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "sedeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEDE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SedeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sede persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new SedeModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Sede.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(SedeImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = VCPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = VCPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = VCPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEDE = "SELECT sede FROM Sede sede";

	private static final String _SQL_COUNT_SEDE =
		"SELECT COUNT(sede) FROM Sede sede";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sede.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Sede exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		SedePersistenceImpl.class);

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class SedeModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			SedeModelImpl sedeModelImpl = (SedeModelImpl)baseModel;

			long columnBitmask = sedeModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(sedeModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |= sedeModelImpl.getColumnBitmask(
						columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(sedeModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			SedeModelImpl sedeModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = sedeModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = sedeModelImpl.getColumnValue(columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}
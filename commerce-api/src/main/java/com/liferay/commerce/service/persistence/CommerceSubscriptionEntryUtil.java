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

package com.liferay.commerce.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.model.CommerceSubscriptionEntry;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the commerce subscription entry service. This utility wraps {@link com.liferay.commerce.service.persistence.impl.CommerceSubscriptionEntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommerceSubscriptionEntryPersistence
 * @see com.liferay.commerce.service.persistence.impl.CommerceSubscriptionEntryPersistenceImpl
 * @generated
 */
@ProviderType
public class CommerceSubscriptionEntryUtil {
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
	public static void clearCache(
		CommerceSubscriptionEntry commerceSubscriptionEntry) {
		getPersistence().clearCache(commerceSubscriptionEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CommerceSubscriptionEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CommerceSubscriptionEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CommerceSubscriptionEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CommerceSubscriptionEntry update(
		CommerceSubscriptionEntry commerceSubscriptionEntry) {
		return getPersistence().update(commerceSubscriptionEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CommerceSubscriptionEntry update(
		CommerceSubscriptionEntry commerceSubscriptionEntry,
		ServiceContext serviceContext) {
		return getPersistence().update(commerceSubscriptionEntry, serviceContext);
	}

	/**
	* Returns all the commerce subscription entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the commerce subscription entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @return the range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByUuid(String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the commerce subscription entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByUuid(String uuid,
		int start, int end,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the commerce subscription entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByUuid(String uuid,
		int start, int end,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first commerce subscription entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry findByUuid_First(String uuid,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first commerce subscription entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchByUuid_First(String uuid,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last commerce subscription entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry findByUuid_Last(String uuid,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last commerce subscription entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchByUuid_Last(String uuid,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the commerce subscription entries before and after the current commerce subscription entry in the ordered set where uuid = &#63;.
	*
	* @param commerceSubscriptionEntryId the primary key of the current commerce subscription entry
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a commerce subscription entry with the primary key could not be found
	*/
	public static CommerceSubscriptionEntry[] findByUuid_PrevAndNext(
		long commerceSubscriptionEntryId, String uuid,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence()
				   .findByUuid_PrevAndNext(commerceSubscriptionEntryId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the commerce subscription entries where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of commerce subscription entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching commerce subscription entries
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the commerce subscription entry where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchSubscriptionEntryException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry findByUUID_G(String uuid,
		long groupId)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the commerce subscription entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchByUUID_G(String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the commerce subscription entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchByUUID_G(String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the commerce subscription entry where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the commerce subscription entry that was removed
	*/
	public static CommerceSubscriptionEntry removeByUUID_G(String uuid,
		long groupId)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of commerce subscription entries where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching commerce subscription entries
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the commerce subscription entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByUuid_C(String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the commerce subscription entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @return the range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByUuid_C(String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the commerce subscription entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByUuid_C(String uuid,
		long companyId, int start, int end,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the commerce subscription entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByUuid_C(String uuid,
		long companyId, int start, int end,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first commerce subscription entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry findByUuid_C_First(String uuid,
		long companyId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first commerce subscription entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchByUuid_C_First(String uuid,
		long companyId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last commerce subscription entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry findByUuid_C_Last(String uuid,
		long companyId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last commerce subscription entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchByUuid_C_Last(String uuid,
		long companyId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the commerce subscription entries before and after the current commerce subscription entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param commerceSubscriptionEntryId the primary key of the current commerce subscription entry
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a commerce subscription entry with the primary key could not be found
	*/
	public static CommerceSubscriptionEntry[] findByUuid_C_PrevAndNext(
		long commerceSubscriptionEntryId, String uuid, long companyId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(commerceSubscriptionEntryId, uuid,
			companyId, orderByComparator);
	}

	/**
	* Removes all the commerce subscription entries where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of commerce subscription entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching commerce subscription entries
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the commerce subscription entries where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the commerce subscription entries where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @return the range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByGroupId(long groupId,
		int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the commerce subscription entries where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByGroupId(long groupId,
		int start, int end,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the commerce subscription entries where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByGroupId(long groupId,
		int start, int end,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first commerce subscription entry in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry findByGroupId_First(long groupId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first commerce subscription entry in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchByGroupId_First(long groupId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last commerce subscription entry in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry findByGroupId_Last(long groupId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last commerce subscription entry in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchByGroupId_Last(long groupId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the commerce subscription entries before and after the current commerce subscription entry in the ordered set where groupId = &#63;.
	*
	* @param commerceSubscriptionEntryId the primary key of the current commerce subscription entry
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a commerce subscription entry with the primary key could not be found
	*/
	public static CommerceSubscriptionEntry[] findByGroupId_PrevAndNext(
		long commerceSubscriptionEntryId, long groupId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(commerceSubscriptionEntryId,
			groupId, orderByComparator);
	}

	/**
	* Removes all the commerce subscription entries where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of commerce subscription entries where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching commerce subscription entries
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the commerce subscription entries where subscriptionStatus = &#63;.
	*
	* @param subscriptionStatus the subscription status
	* @return the matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findBysubscriptionStatus(
		int subscriptionStatus) {
		return getPersistence().findBysubscriptionStatus(subscriptionStatus);
	}

	/**
	* Returns a range of all the commerce subscription entries where subscriptionStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param subscriptionStatus the subscription status
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @return the range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findBysubscriptionStatus(
		int subscriptionStatus, int start, int end) {
		return getPersistence()
				   .findBysubscriptionStatus(subscriptionStatus, start, end);
	}

	/**
	* Returns an ordered range of all the commerce subscription entries where subscriptionStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param subscriptionStatus the subscription status
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findBysubscriptionStatus(
		int subscriptionStatus, int start, int end,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence()
				   .findBysubscriptionStatus(subscriptionStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the commerce subscription entries where subscriptionStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param subscriptionStatus the subscription status
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findBysubscriptionStatus(
		int subscriptionStatus, int start, int end,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBysubscriptionStatus(subscriptionStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first commerce subscription entry in the ordered set where subscriptionStatus = &#63;.
	*
	* @param subscriptionStatus the subscription status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry findBysubscriptionStatus_First(
		int subscriptionStatus,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence()
				   .findBysubscriptionStatus_First(subscriptionStatus,
			orderByComparator);
	}

	/**
	* Returns the first commerce subscription entry in the ordered set where subscriptionStatus = &#63;.
	*
	* @param subscriptionStatus the subscription status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchBysubscriptionStatus_First(
		int subscriptionStatus,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence()
				   .fetchBysubscriptionStatus_First(subscriptionStatus,
			orderByComparator);
	}

	/**
	* Returns the last commerce subscription entry in the ordered set where subscriptionStatus = &#63;.
	*
	* @param subscriptionStatus the subscription status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry findBysubscriptionStatus_Last(
		int subscriptionStatus,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence()
				   .findBysubscriptionStatus_Last(subscriptionStatus,
			orderByComparator);
	}

	/**
	* Returns the last commerce subscription entry in the ordered set where subscriptionStatus = &#63;.
	*
	* @param subscriptionStatus the subscription status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchBysubscriptionStatus_Last(
		int subscriptionStatus,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence()
				   .fetchBysubscriptionStatus_Last(subscriptionStatus,
			orderByComparator);
	}

	/**
	* Returns the commerce subscription entries before and after the current commerce subscription entry in the ordered set where subscriptionStatus = &#63;.
	*
	* @param commerceSubscriptionEntryId the primary key of the current commerce subscription entry
	* @param subscriptionStatus the subscription status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a commerce subscription entry with the primary key could not be found
	*/
	public static CommerceSubscriptionEntry[] findBysubscriptionStatus_PrevAndNext(
		long commerceSubscriptionEntryId, int subscriptionStatus,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence()
				   .findBysubscriptionStatus_PrevAndNext(commerceSubscriptionEntryId,
			subscriptionStatus, orderByComparator);
	}

	/**
	* Removes all the commerce subscription entries where subscriptionStatus = &#63; from the database.
	*
	* @param subscriptionStatus the subscription status
	*/
	public static void removeBysubscriptionStatus(int subscriptionStatus) {
		getPersistence().removeBysubscriptionStatus(subscriptionStatus);
	}

	/**
	* Returns the number of commerce subscription entries where subscriptionStatus = &#63;.
	*
	* @param subscriptionStatus the subscription status
	* @return the number of matching commerce subscription entries
	*/
	public static int countBysubscriptionStatus(int subscriptionStatus) {
		return getPersistence().countBysubscriptionStatus(subscriptionStatus);
	}

	/**
	* Returns all the commerce subscription entries where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByG_U(long groupId,
		long userId) {
		return getPersistence().findByG_U(groupId, userId);
	}

	/**
	* Returns a range of all the commerce subscription entries where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @return the range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByG_U(long groupId,
		long userId, int start, int end) {
		return getPersistence().findByG_U(groupId, userId, start, end);
	}

	/**
	* Returns an ordered range of all the commerce subscription entries where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByG_U(long groupId,
		long userId, int start, int end,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence()
				   .findByG_U(groupId, userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the commerce subscription entries where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findByG_U(long groupId,
		long userId, int start, int end,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_U(groupId, userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first commerce subscription entry in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry findByG_U_First(long groupId,
		long userId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence()
				   .findByG_U_First(groupId, userId, orderByComparator);
	}

	/**
	* Returns the first commerce subscription entry in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchByG_U_First(long groupId,
		long userId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence()
				   .fetchByG_U_First(groupId, userId, orderByComparator);
	}

	/**
	* Returns the last commerce subscription entry in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry findByG_U_Last(long groupId,
		long userId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence()
				   .findByG_U_Last(groupId, userId, orderByComparator);
	}

	/**
	* Returns the last commerce subscription entry in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchByG_U_Last(long groupId,
		long userId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence()
				   .fetchByG_U_Last(groupId, userId, orderByComparator);
	}

	/**
	* Returns the commerce subscription entries before and after the current commerce subscription entry in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param commerceSubscriptionEntryId the primary key of the current commerce subscription entry
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a commerce subscription entry with the primary key could not be found
	*/
	public static CommerceSubscriptionEntry[] findByG_U_PrevAndNext(
		long commerceSubscriptionEntryId, long groupId, long userId,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence()
				   .findByG_U_PrevAndNext(commerceSubscriptionEntryId, groupId,
			userId, orderByComparator);
	}

	/**
	* Removes all the commerce subscription entries where groupId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public static void removeByG_U(long groupId, long userId) {
		getPersistence().removeByG_U(groupId, userId);
	}

	/**
	* Returns the number of commerce subscription entries where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching commerce subscription entries
	*/
	public static int countByG_U(long groupId, long userId) {
		return getPersistence().countByG_U(groupId, userId);
	}

	/**
	* Returns the commerce subscription entry where CPInstanceUuid = &#63; and CProductId = &#63; and commerceOrderItemId = &#63; or throws a {@link NoSuchSubscriptionEntryException} if it could not be found.
	*
	* @param CPInstanceUuid the cp instance uuid
	* @param CProductId the c product ID
	* @param commerceOrderItemId the commerce order item ID
	* @return the matching commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry findByC_C_C(String CPInstanceUuid,
		long CProductId, long commerceOrderItemId)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence()
				   .findByC_C_C(CPInstanceUuid, CProductId, commerceOrderItemId);
	}

	/**
	* Returns the commerce subscription entry where CPInstanceUuid = &#63; and CProductId = &#63; and commerceOrderItemId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param CPInstanceUuid the cp instance uuid
	* @param CProductId the c product ID
	* @param commerceOrderItemId the commerce order item ID
	* @return the matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchByC_C_C(
		String CPInstanceUuid, long CProductId, long commerceOrderItemId) {
		return getPersistence()
				   .fetchByC_C_C(CPInstanceUuid, CProductId, commerceOrderItemId);
	}

	/**
	* Returns the commerce subscription entry where CPInstanceUuid = &#63; and CProductId = &#63; and commerceOrderItemId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param CPInstanceUuid the cp instance uuid
	* @param CProductId the c product ID
	* @param commerceOrderItemId the commerce order item ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching commerce subscription entry, or <code>null</code> if a matching commerce subscription entry could not be found
	*/
	public static CommerceSubscriptionEntry fetchByC_C_C(
		String CPInstanceUuid, long CProductId, long commerceOrderItemId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByC_C_C(CPInstanceUuid, CProductId,
			commerceOrderItemId, retrieveFromCache);
	}

	/**
	* Removes the commerce subscription entry where CPInstanceUuid = &#63; and CProductId = &#63; and commerceOrderItemId = &#63; from the database.
	*
	* @param CPInstanceUuid the cp instance uuid
	* @param CProductId the c product ID
	* @param commerceOrderItemId the commerce order item ID
	* @return the commerce subscription entry that was removed
	*/
	public static CommerceSubscriptionEntry removeByC_C_C(
		String CPInstanceUuid, long CProductId, long commerceOrderItemId)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence()
				   .removeByC_C_C(CPInstanceUuid, CProductId,
			commerceOrderItemId);
	}

	/**
	* Returns the number of commerce subscription entries where CPInstanceUuid = &#63; and CProductId = &#63; and commerceOrderItemId = &#63;.
	*
	* @param CPInstanceUuid the cp instance uuid
	* @param CProductId the c product ID
	* @param commerceOrderItemId the commerce order item ID
	* @return the number of matching commerce subscription entries
	*/
	public static int countByC_C_C(String CPInstanceUuid, long CProductId,
		long commerceOrderItemId) {
		return getPersistence()
				   .countByC_C_C(CPInstanceUuid, CProductId, commerceOrderItemId);
	}

	/**
	* Caches the commerce subscription entry in the entity cache if it is enabled.
	*
	* @param commerceSubscriptionEntry the commerce subscription entry
	*/
	public static void cacheResult(
		CommerceSubscriptionEntry commerceSubscriptionEntry) {
		getPersistence().cacheResult(commerceSubscriptionEntry);
	}

	/**
	* Caches the commerce subscription entries in the entity cache if it is enabled.
	*
	* @param commerceSubscriptionEntries the commerce subscription entries
	*/
	public static void cacheResult(
		List<CommerceSubscriptionEntry> commerceSubscriptionEntries) {
		getPersistence().cacheResult(commerceSubscriptionEntries);
	}

	/**
	* Creates a new commerce subscription entry with the primary key. Does not add the commerce subscription entry to the database.
	*
	* @param commerceSubscriptionEntryId the primary key for the new commerce subscription entry
	* @return the new commerce subscription entry
	*/
	public static CommerceSubscriptionEntry create(
		long commerceSubscriptionEntryId) {
		return getPersistence().create(commerceSubscriptionEntryId);
	}

	/**
	* Removes the commerce subscription entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param commerceSubscriptionEntryId the primary key of the commerce subscription entry
	* @return the commerce subscription entry that was removed
	* @throws NoSuchSubscriptionEntryException if a commerce subscription entry with the primary key could not be found
	*/
	public static CommerceSubscriptionEntry remove(
		long commerceSubscriptionEntryId)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence().remove(commerceSubscriptionEntryId);
	}

	public static CommerceSubscriptionEntry updateImpl(
		CommerceSubscriptionEntry commerceSubscriptionEntry) {
		return getPersistence().updateImpl(commerceSubscriptionEntry);
	}

	/**
	* Returns the commerce subscription entry with the primary key or throws a {@link NoSuchSubscriptionEntryException} if it could not be found.
	*
	* @param commerceSubscriptionEntryId the primary key of the commerce subscription entry
	* @return the commerce subscription entry
	* @throws NoSuchSubscriptionEntryException if a commerce subscription entry with the primary key could not be found
	*/
	public static CommerceSubscriptionEntry findByPrimaryKey(
		long commerceSubscriptionEntryId)
		throws com.liferay.commerce.exception.NoSuchSubscriptionEntryException {
		return getPersistence().findByPrimaryKey(commerceSubscriptionEntryId);
	}

	/**
	* Returns the commerce subscription entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param commerceSubscriptionEntryId the primary key of the commerce subscription entry
	* @return the commerce subscription entry, or <code>null</code> if a commerce subscription entry with the primary key could not be found
	*/
	public static CommerceSubscriptionEntry fetchByPrimaryKey(
		long commerceSubscriptionEntryId) {
		return getPersistence().fetchByPrimaryKey(commerceSubscriptionEntryId);
	}

	public static java.util.Map<java.io.Serializable, CommerceSubscriptionEntry> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the commerce subscription entries.
	*
	* @return the commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the commerce subscription entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @return the range of commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the commerce subscription entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findAll(int start, int end,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the commerce subscription entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceSubscriptionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of commerce subscription entries
	* @param end the upper bound of the range of commerce subscription entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of commerce subscription entries
	*/
	public static List<CommerceSubscriptionEntry> findAll(int start, int end,
		OrderByComparator<CommerceSubscriptionEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the commerce subscription entries from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of commerce subscription entries.
	*
	* @return the number of commerce subscription entries
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CommerceSubscriptionEntryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CommerceSubscriptionEntryPersistence, CommerceSubscriptionEntryPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CommerceSubscriptionEntryPersistence.class);

		ServiceTracker<CommerceSubscriptionEntryPersistence, CommerceSubscriptionEntryPersistence> serviceTracker =
			new ServiceTracker<CommerceSubscriptionEntryPersistence, CommerceSubscriptionEntryPersistence>(bundle.getBundleContext(),
				CommerceSubscriptionEntryPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}
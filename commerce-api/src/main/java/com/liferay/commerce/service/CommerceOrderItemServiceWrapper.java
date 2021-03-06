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

package com.liferay.commerce.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CommerceOrderItemService}.
 *
 * @author Alessio Antonio Rendina
 * @see CommerceOrderItemService
 * @generated
 */
@ProviderType
public class CommerceOrderItemServiceWrapper implements CommerceOrderItemService,
	ServiceWrapper<CommerceOrderItemService> {
	public CommerceOrderItemServiceWrapper(
		CommerceOrderItemService commerceOrderItemService) {
		_commerceOrderItemService = commerceOrderItemService;
	}

	@Override
	public com.liferay.commerce.model.CommerceOrderItem addCommerceOrderItem(
		long commerceOrderId, long cpInstanceId, int quantity,
		int shippedQuantity, String json,
		com.liferay.commerce.context.CommerceContext commerceContext,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.addCommerceOrderItem(commerceOrderId,
			cpInstanceId, quantity, shippedQuantity, json, commerceContext,
			serviceContext);
	}

	@Override
	public void deleteCommerceOrderItem(long commerceOrderItemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_commerceOrderItemService.deleteCommerceOrderItem(commerceOrderItemId);
	}

	@Override
	public com.liferay.commerce.model.CommerceOrderItem fetchByExternalReferenceCode(
		long companyId, String externalReferenceCode)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.fetchByExternalReferenceCode(companyId,
			externalReferenceCode);
	}

	@Override
	public com.liferay.commerce.model.CommerceOrderItem fetchCommerceOrderItem(
		long commerceOrderItemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.fetchCommerceOrderItem(commerceOrderItemId);
	}

	@Override
	public java.util.List<com.liferay.commerce.model.CommerceOrderItem> getAvailableForShipmentCommerceOrderItems(
		long commerceOrderId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.getAvailableForShipmentCommerceOrderItems(commerceOrderId);
	}

	@Override
	public com.liferay.commerce.model.CommerceOrderItem getCommerceOrderItem(
		long commerceOrderItemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.getCommerceOrderItem(commerceOrderItemId);
	}

	@Override
	public java.util.List<com.liferay.commerce.model.CommerceOrderItem> getCommerceOrderItems(
		long commerceOrderId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.getCommerceOrderItems(commerceOrderId,
			start, end);
	}

	@Override
	public int getCommerceOrderItemsCount(long commerceOrderId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.getCommerceOrderItemsCount(commerceOrderId);
	}

	@Override
	public int getCommerceOrderItemsQuantity(long commerceOrderId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.getCommerceOrderItemsQuantity(commerceOrderId);
	}

	@Override
	public int getCommerceWarehouseItemQuantity(long commerceOrderItemId,
		long commerceWarehouseId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.getCommerceWarehouseItemQuantity(commerceOrderItemId,
			commerceWarehouseId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _commerceOrderItemService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.search.BaseModelSearchResult<com.liferay.commerce.model.CommerceOrderItem> search(
		long commerceOrderId, String keywords, int start, int end,
		com.liferay.portal.kernel.search.Sort sort)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.search(commerceOrderId, keywords,
			start, end, sort);
	}

	@Override
	public com.liferay.portal.kernel.search.BaseModelSearchResult<com.liferay.commerce.model.CommerceOrderItem> search(
		long commerceOrderId, String sku, String name, boolean andOperator,
		int start, int end, com.liferay.portal.kernel.search.Sort sort)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.search(commerceOrderId, sku, name,
			andOperator, start, end, sort);
	}

	@Override
	public com.liferay.commerce.model.CommerceOrderItem updateCommerceOrderItem(
		long commerceOrderItemId, int quantity,
		com.liferay.commerce.context.CommerceContext commerceContext,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.updateCommerceOrderItem(commerceOrderItemId,
			quantity, commerceContext, serviceContext);
	}

	@Override
	public com.liferay.commerce.model.CommerceOrderItem updateCommerceOrderItem(
		long commerceOrderItemId, int quantity, String json,
		com.liferay.commerce.context.CommerceContext commerceContext,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.updateCommerceOrderItem(commerceOrderItemId,
			quantity, json, commerceContext, serviceContext);
	}

	@Override
	public com.liferay.commerce.model.CommerceOrderItem upsertCommerceOrderItem(
		long commerceOrderId, long cpInstanceId, int quantity,
		int shippedQuantity, String json,
		com.liferay.commerce.context.CommerceContext commerceContext,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItemService.upsertCommerceOrderItem(commerceOrderId,
			cpInstanceId, quantity, shippedQuantity, json, commerceContext,
			serviceContext);
	}

	@Override
	public CommerceOrderItemService getWrappedService() {
		return _commerceOrderItemService;
	}

	@Override
	public void setWrappedService(
		CommerceOrderItemService commerceOrderItemService) {
		_commerceOrderItemService = commerceOrderItemService;
	}

	private CommerceOrderItemService _commerceOrderItemService;
}
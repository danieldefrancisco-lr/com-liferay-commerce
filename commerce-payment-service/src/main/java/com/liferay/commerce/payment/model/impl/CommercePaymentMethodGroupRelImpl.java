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

package com.liferay.commerce.payment.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.webserver.WebServerServletTokenUtil;

/**
 * The extended model implementation for the CommercePaymentMethodGroupRel service. Represents a row in the &quot;CommercePaymentMethodGroupRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel} interface.
 * </p>
 *
 * @author Luca Pellizzon
 */
@ProviderType
public class CommercePaymentMethodGroupRelImpl
	extends CommercePaymentMethodGroupRelBaseImpl {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a commerce payment method group rel model instance should use the {@link com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel} interface instead.
	 */
	public CommercePaymentMethodGroupRelImpl() {
	}

	@Override
	public String getImageURL(ThemeDisplay themeDisplay) {
		if (getImageId() <= 0) {
			return null;
		}

		StringBundler sb = new StringBundler(5);

		sb.append(themeDisplay.getPathImage());
		sb.append("/payment/method?img_id=");
		sb.append(getImageId());
		sb.append("&t=");
		sb.append(WebServerServletTokenUtil.getToken(getImageId()));

		return sb.toString();
	}

}
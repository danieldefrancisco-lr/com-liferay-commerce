<%--
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
--%>

<%@ include file="/init.jsp" %>

<%
CommerceUserSegmentDisplayContext commerceUserSegmentDisplayContext = (CommerceUserSegmentDisplayContext)request.getAttribute(WebKeys.PORTLET_DISPLAY_CONTEXT);

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

CommerceUserSegmentCriterion commerceUserSegmentCriterion = (CommerceUserSegmentCriterion)row.getObject();
%>

<liferay-ui:icon-menu
	direction="left-side"
	icon="<%= StringPool.BLANK %>"
	markupView="lexicon"
	message="<%= StringPool.BLANK %>"
	showWhenSingleIcon="<%= true %>"
>
	<c:if test="<%= commerceUserSegmentDisplayContext.hasPermission(commerceUserSegmentCriterion.getCommerceUserSegmentEntryId(), CommerceUserSegmentActionKeys.ADD_COMMERCE_USER_SEGMENTATION_CRITERION) %>">
		<portlet:renderURL var="editURL">
			<portlet:param name="mvcRenderCommandName" value="editCommerceUserSegmentCriterion" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
			<portlet:param name="commerceUserSegmentCriterionId" value="<%= String.valueOf(commerceUserSegmentCriterion.getCommerceUserSegmentCriterionId()) %>" />
			<portlet:param name="commerceUserSegmentEntryId" value="<%= String.valueOf(commerceUserSegmentCriterion.getCommerceUserSegmentEntryId()) %>" />
		</portlet:renderURL>

		<liferay-ui:icon
			message="edit"
			url="<%= editURL %>"
		/>
	</c:if>

	<c:if test="<%= commerceUserSegmentDisplayContext.hasPermission(commerceUserSegmentCriterion.getCommerceUserSegmentEntryId(), CommerceUserSegmentActionKeys.DELETE_COMMERCE_USER_SEGMENTATION_CRITERION) %>">
		<portlet:actionURL name="editCommerceUserSegmentCriterion" var="deleteURL">
			<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.DELETE %>" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
			<portlet:param name="commerceUserSegmentCriterionId" value="<%= String.valueOf(commerceUserSegmentCriterion.getCommerceUserSegmentCriterionId()) %>" />
		</portlet:actionURL>

		<liferay-ui:icon-delete
			url="<%= deleteURL %>"
		/>
	</c:if>
</liferay-ui:icon-menu>
/* ===========================================================
 * TradeManager : a application to trade strategies for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2011-2011, by Simon Allen and Contributors.
 *
 * Project Info:  org.trade
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Oracle, Inc.
 * in the United States and other countries.]
 *
 * (C) Copyright 2011-2011, by Simon Allen and Contributors.
 *
 * Original Author:  Simon Allen;
 * Contributor(s):   -;
 *
 * Changes
 * -------
 *
 */
package org.trade.persistent.dao;

// Generated Feb 21, 2011 12:43:33 PM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.trade.core.dao.Aspect;
import org.trade.core.util.CoreUtils;
import org.trade.core.valuetype.Money;
import org.trade.dictionary.valuetype.OverrideConstraints;
import org.trade.dictionary.valuetype.TimeInForce;
import org.trade.dictionary.valuetype.TriggerMethod;

/**
 * Order generated by hbm2java
 * 
 * @author Simon Allen
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "tradeorder")
public class TradeOrder extends Aspect implements java.io.Serializable,
		Cloneable {

	private static final long serialVersionUID = -832064631322873796L;
	private Trade trade;
	private String action;
	private String accountNumber;
	private BigDecimal averageFilledPrice;
	private Boolean allOrNothing = new Boolean(false);
	private BigDecimal auxPrice;
	private Integer clientId;
	private BigDecimal commission;
	private Date createDate;
	private Integer displayQuantity;
	private String FAGroup;
	private String FAProfile;
	private String FAMethod;
	private BigDecimal FAPercent;
	private Integer filledQuantity;
	private Date filledDate;
	private Date goodAfterTime;
	private Date goodTillTime;
	private Boolean hidden = new Boolean(false);
	private Boolean isOpenPosition = new Boolean(false);
	private Boolean isFilled = new Boolean(false);
	private BigDecimal limitPrice;
	private String ocaGroupName;
	private Integer ocaType;
	private Integer orderKey;
	private String orderReference;
	private String orderType;
	private Integer overrideConstraints;
	private Integer permId;
	private Integer parentId;
	private Integer quantity;
	private String timeInForce;
	private String status;
	private BigDecimal stopPrice;
	private Boolean transmit = new Boolean(false);
	private Integer triggerMethod;
	private String warningMessage;
	private String whyHeld;
	private Date updateDate;
	private List<TradeOrderfill> tradeOrderfills = new ArrayList<TradeOrderfill>(
			0);

	public TradeOrder() {
	}

	/**
	 * Constructor for TradeOrder.
	 * 
	 * @param trade
	 *            Trade
	 * @param action
	 *            String
	 * @param orderType
	 *            String
	 * @param quantity
	 *            Integer
	 * @param auxPrice
	 *            BigDecimal
	 * @param limitPrice
	 *            BigDecimal
	 * @param createDate
	 *            Date
	 */
	public TradeOrder(Trade trade, String action, String orderType,
			Integer quantity, BigDecimal auxPrice, BigDecimal limitPrice,
			Date createDate) {
		this(trade, action, createDate, orderType, quantity, auxPrice,
				limitPrice, OverrideConstraints.YES, TimeInForce.DAY,
				TriggerMethod.DEFAULT);
	}

	/**
	 * Constructor for TradeOrder.
	 * 
	 * @param trade
	 *            Trade
	 * @param action
	 *            String
	 * @param createDate
	 *            Date
	 * @param orderType
	 *            String
	 * @param quantity
	 *            Integer
	 * @param auxPrice
	 *            BigDecimal
	 * @param limitPrice
	 *            BigDecimal
	 * @param overrideConstraints
	 *            Integer
	 * @param timeInForce
	 *            String
	 * @param triggerMethod
	 *            Integer
	 */
	public TradeOrder(Trade trade, String action, Date createDate,
			String orderType, Integer quantity, BigDecimal auxPrice,
			BigDecimal limitPrice, Integer overrideConstraints,
			String timeInForce, Integer triggerMethod) {
		this.trade = trade;
		this.action = action;
		this.auxPrice = auxPrice;
		this.createDate = createDate;
		this.limitPrice = limitPrice;
		this.orderType = orderType;
		this.overrideConstraints = overrideConstraints;
		this.quantity = quantity;
		this.timeInForce = timeInForce;
		this.triggerMethod = triggerMethod;
		this.updateDate = createDate;
	}

	/**
	 * Constructor for TradeOrder.
	 * 
	 * @param trade
	 *            Trade
	 * @param action
	 *            String
	 * @param averageFilledPrice
	 *            BigDecimal
	 * @param allOrNothing
	 *            Boolean
	 * @param auxPrice
	 *            BigDecimal
	 * @param clientId
	 *            Integer
	 * @param commission
	 *            BigDecimal
	 * @param createDate
	 *            Date
	 * @param displayQuantity
	 *            Integer
	 * @param filledDate
	 *            Date
	 * @param filledQuantity
	 *            Integer
	 * @param goodAfterTime
	 *            Date
	 * @param goodTillTime
	 *            Date
	 * @param hidden
	 *            Boolean
	 * @param isOpenPosition
	 *            Boolean
	 * @param isFilled
	 *            Boolean
	 * @param limitPrice
	 *            BigDecimal
	 * @param ocaGroupName
	 *            String
	 * @param ocaType
	 *            Integer
	 * @param orderKey
	 *            Integer
	 * @param orderReference
	 *            String
	 * @param orderType
	 *            String
	 * @param overrideConstraints
	 *            Integer
	 * @param parentId
	 *            Integer
	 * @param permId
	 *            Integer
	 * @param quantity
	 *            Integer
	 * @param timeInForce
	 *            String
	 * @param status
	 *            String
	 * @param stopPrice
	 *            BigDecimal
	 * @param transmit
	 *            Boolean
	 * @param triggerMethod
	 *            Integer
	 * @param warningMessage
	 *            String
	 * @param whyHeld
	 *            String
	 * @param updateDate
	 *            Date
	 * @param tradeOrderfills
	 *            List<TradeOrderfill>
	 */
	public TradeOrder(Trade trade, String action,
			BigDecimal averageFilledPrice, Boolean allOrNothing,
			BigDecimal auxPrice, Integer clientId, BigDecimal commission,
			Date createDate, Integer displayQuantity, Date filledDate,
			Integer filledQuantity, Date goodAfterTime, Date goodTillTime,
			Boolean hidden, Boolean isOpenPosition, Boolean isFilled,
			BigDecimal limitPrice, String ocaGroupName, Integer ocaType,
			Integer orderKey, String orderReference, String orderType,
			Integer overrideConstraints, Integer parentId, Integer permId,
			Integer quantity, String timeInForce, String status,
			BigDecimal stopPrice, Boolean transmit, Integer triggerMethod,
			String warningMessage, String whyHeld, Date updateDate,
			List<TradeOrderfill> tradeOrderfills) {
		this.trade = trade;
		this.action = action;
		this.allOrNothing = allOrNothing;
		this.auxPrice = auxPrice;
		this.averageFilledPrice = averageFilledPrice;
		this.clientId = clientId;
		this.commission = commission;
		this.createDate = createDate;
		this.displayQuantity = displayQuantity;
		this.filledDate = filledDate;
		this.filledQuantity = filledQuantity;
		this.goodAfterTime = goodAfterTime;
		this.goodTillTime = goodTillTime;
		this.hidden = hidden;
		this.isOpenPosition = isOpenPosition;
		this.isFilled = isFilled;
		this.limitPrice = limitPrice;
		this.ocaGroupName = ocaGroupName;
		this.ocaType = ocaType;
		this.orderKey = orderKey;
		this.orderReference = orderReference;
		this.orderType = orderType;
		this.overrideConstraints = overrideConstraints;
		this.permId = permId;
		this.parentId = parentId;
		this.quantity = quantity;
		this.timeInForce = timeInForce;
		this.status = status;
		this.stopPrice = stopPrice;
		this.transmit = transmit;
		this.triggerMethod = triggerMethod;
		this.warningMessage = warningMessage;
		this.whyHeld = whyHeld;
		this.updateDate = updateDate;
		this.tradeOrderfills = tradeOrderfills;
	}

	/**
	 * Method getIdTradeOrder.
	 * 
	 * @return Integer
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idTradeOrder", unique = true, nullable = false)
	public Integer getIdTradeOrder() {
		return this.id;
	}

	/**
	 * Method setIdTradeOrder.
	 * 
	 * @param idTradeOrder
	 *            Integer
	 */
	public void setIdTradeOrder(Integer idTradeOrder) {
		this.id = idTradeOrder;
	}

	/**
	 * Method getTrade.
	 * 
	 * @return Trade
	 */
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.REFRESH })
	@JoinColumn(name = "idTrade", insertable = true, updatable = true, nullable = false)
	public Trade getTrade() {
		return this.trade;
	}

	/**
	 * Method setTrade.
	 * 
	 * @param trade
	 *            Trade
	 */
	public void setTrade(Trade trade) {
		this.trade = trade;
	}

	/**
	 * Method getAction.
	 * 
	 * @return String
	 */
	@Column(name = "action", nullable = false, length = 6)
	public String getAction() {
		return this.action;
	}

	/**
	 * Method setAction.
	 * 
	 * @param action
	 *            String
	 */
	public void setAction(String action) {
		this.action = action;
	}
	
	/**
	 * Method getAccountNumber.
	 * 
	 * @return String
	 */
	@Column(name = "accountNumber", unique = true, nullable = false, length = 20)
	public String getAccountNumber() {
		return this.accountNumber;
	}

	/**
	 * Method setAccountNumber.
	 * 
	 * @param accountNumber
	 *            String
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Method getAllOrNothing.
	 * 
	 * @return Boolean
	 */
	@Column(name = "allOrNothing")
	public Boolean getAllOrNothing() {
		return this.allOrNothing;
	}

	/**
	 * Method setAllOrNothing.
	 * 
	 * @param allOrNothing
	 *            Boolean
	 */
	public void setAllOrNothing(Boolean allOrNothing) {
		this.allOrNothing = allOrNothing;
	}

	/**
	 * Method getAuxPrice.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "auxPrice", precision = 10)
	public BigDecimal getAuxPrice() {
		return this.auxPrice;
	}

	/**
	 * Method setAuxPrice.
	 * 
	 * @param auxPrice
	 *            BigDecimal
	 */
	public void setAuxPrice(BigDecimal auxPrice) {
		this.auxPrice = auxPrice;
	}

	/**
	 * Method getAverageFilledPrice.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "averageFilledPrice", precision = 11)
	public BigDecimal getAverageFilledPrice() {
		return this.averageFilledPrice;
	}

	/**
	 * Method setAverageFilledPrice.
	 * 
	 * @param averageFilledPrice
	 *            BigDecimal
	 */
	public void setAverageFilledPrice(BigDecimal averageFilledPrice) {
		this.averageFilledPrice = averageFilledPrice;
	}

	/**
	 * Method getClientId.
	 * 
	 * @return Integer
	 */
	@Column(name = "clientId")
	public Integer getClientId() {
		return this.clientId;
	}

	/**
	 * Method setClientId.
	 * 
	 * @param clientId
	 *            Integer
	 */
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	/**
	 * Method getCommission.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "commission", precision = 10)
	public BigDecimal getCommission() {
		return this.commission;
	}

	/**
	 * Method setCommission.
	 * 
	 * @param commission
	 *            BigDecimal
	 */
	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	/**
	 * Method getCreateDate.
	 * 
	 * @return Date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", nullable = false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	/**
	 * Method setCreateDate.
	 * 
	 * @param createDate
	 *            Date
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * Method getDisplayQuantity.
	 * 
	 * @return Integer
	 */
	@Column(name = "displayQuantity")
	public Integer getDisplayQuantity() {
		return this.displayQuantity;
	}

	/**
	 * Method setDisplayQuantity.
	 * 
	 * @param displayQuantity
	 *            Integer
	 */
	public void setDisplayQuantity(Integer displayQuantity) {
		this.displayQuantity = displayQuantity;
	}

	/**
	 * Method getFAGroup.
	 * 
	 * @return String
	 */
	@Column(name = "FAGroup", length = 45)
	public String getFAGroup() {
		return this.FAGroup;
	}

	/**
	 * Method setAccountNumber.
	 * 
	 * @param FAGroup
	 *            String
	 */
	public void setFAGroup(String FAGroup) {
		this.FAGroup = FAGroup;
	}

	/**
	 * Method getFAProfile.
	 * 
	 * @return String
	 */
	@Column(name = "FAProfile", length = 45)
	public String getFAProfile() {
		return this.FAProfile;
	}

	/**
	 * Method setFAProfile.
	 * 
	 * @param FAProfile
	 *            String
	 */
	public void setFAProfile(String FAProfile) {
		this.FAProfile = FAProfile;
	}

	/**
	 * Method getFAMethod.
	 * 
	 * @return String
	 */
	@Column(name = "FAMethod", length = 20)
	public String getFAMethod() {
		return this.FAMethod;
	}

	/**
	 * Method setFAMethod.
	 * 
	 * @param FAMethod
	 *            String
	 */
	public void setFAMethod(String FAMethod) {
		this.FAMethod = FAMethod;
	}

	/**
	 * Method getFAPercent.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "FAPercent", precision = 10)
	public BigDecimal getFAPercent() {
		return this.FAPercent;
	}

	/**
	 * Method setFAPercent.
	 * 
	 * @param FAPercent
	 *            BigDecimal
	 */
	public void setFAPercent(BigDecimal FAPercent) {
		this.FAPercent = FAPercent;
	}

	/**
	 * Method getFilledDate.
	 * 
	 * @return Date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "filledDate", length = 19)
	public Date getFilledDate() {
		return this.filledDate;
	}

	/**
	 * Method setFilledDate.
	 * 
	 * @param filledDate
	 *            Date
	 */
	public void setFilledDate(Date filledDate) {
		this.filledDate = filledDate;
	}

	/**
	 * Method getFilledQuantity.
	 * 
	 * @return Integer
	 */
	@Column(name = "filledQuantity")
	public Integer getFilledQuantity() {
		return this.filledQuantity;
	}

	/**
	 * Method setFilledQuantity.
	 * 
	 * @param filledQuantity
	 *            Integer
	 */
	public void setFilledQuantity(Integer filledQuantity) {
		this.filledQuantity = filledQuantity;
	}

	/**
	 * Method getGoodAfterTime.
	 * 
	 * @return Date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "goodAfterTime", length = 19)
	public Date getGoodAfterTime() {
		return this.goodAfterTime;
	}

	/**
	 * Method setGoodAfterTime.
	 * 
	 * @param goodAfterTime
	 *            Date
	 */
	public void setGoodAfterTime(Date goodAfterTime) {
		this.goodAfterTime = goodAfterTime;
	}

	/**
	 * Method getGoodTillTime.
	 * 
	 * @return Date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "goodTillTime", length = 19)
	public Date getGoodTillTime() {
		return this.goodTillTime;
	}

	/**
	 * Method setGoodTillTime.
	 * 
	 * @param goodTillTime
	 *            Date
	 */
	public void setGoodTillTime(Date goodTillTime) {
		this.goodTillTime = goodTillTime;
	}

	/**
	 * Method getHidden.
	 * 
	 * @return Boolean
	 */
	@Column(name = "hidden")
	public Boolean getHidden() {
		return this.hidden;
	}

	/**
	 * Method setHidden.
	 * 
	 * @param hidden
	 *            Boolean
	 */
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	/**
	 * Method getIsOpenPosition.
	 * 
	 * @return Boolean
	 */
	@Column(name = "isOpenPosition")
	public Boolean getIsOpenPosition() {
		return this.isOpenPosition;
	}

	/**
	 * Method setIsOpenPosition.
	 * 
	 * @param isOpenPosition
	 *            Boolean
	 */
	public void setIsOpenPosition(Boolean isOpenPosition) {
		this.isOpenPosition = isOpenPosition;
	}

	/**
	 * Method getIsFilled.
	 * 
	 * @return Boolean
	 */
	@Column(name = "isFilled")
	public Boolean getIsFilled() {
		return this.isFilled;
	}

	/**
	 * Method setIsFilled.
	 * 
	 * @param isFilled
	 *            Boolean
	 */
	public void setIsFilled(Boolean isFilled) {
		this.isFilled = isFilled;
	}

	/**
	 * Method getLimitPrice.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "limitPrice", precision = 10)
	public BigDecimal getLimitPrice() {
		return this.limitPrice;
	}

	/**
	 * Method setLimitPrice.
	 * 
	 * @param limitPrice
	 *            BigDecimal
	 */
	public void setLimitPrice(BigDecimal limitPrice) {
		this.limitPrice = limitPrice;
	}

	/**
	 * Method getOcaGroupName.
	 * 
	 * @return String
	 */
	@Column(name = "ocaGroupName", length = 45)
	public String getOcaGroupName() {
		return this.ocaGroupName;
	}

	/**
	 * Method setOcaGroupName.
	 * 
	 * @param ocaGroupName
	 *            String
	 */
	public void setOcaGroupName(String ocaGroupName) {
		this.ocaGroupName = ocaGroupName;
	}

	/**
	 * Method getOcaType.
	 * 
	 * @return Integer
	 */
	@Column(name = "ocaType")
	public Integer getOcaType() {
		return this.ocaType;
	}

	/**
	 * Method setOcaType.
	 * 
	 * @param ocaType
	 *            Integer
	 */
	public void setOcaType(Integer ocaType) {
		this.ocaType = ocaType;
	}

	/**
	 * Method getOrderKey.
	 * 
	 * @return Integer
	 */
	@Column(name = "orderKey")
	public Integer getOrderKey() {
		return this.orderKey;
	}

	/**
	 * Method setOrderKey.
	 * 
	 * @param orderKey
	 *            Integer
	 */
	public void setOrderKey(Integer orderKey) {
		this.orderKey = orderKey;
	}

	/**
	 * Method getOrderReference.
	 * 
	 * @return String
	 */
	@Column(name = "orderReference", length = 45)
	public String getOrderReference() {
		return this.orderReference;
	}

	/**
	 * Method setOrderReference.
	 * 
	 * @param orderReference
	 *            String
	 */
	public void setOrderReference(String orderReference) {
		this.orderReference = orderReference;
	}

	/**
	 * Method getOrderType.
	 * 
	 * @return String
	 */
	@Column(name = "orderType", nullable = false, length = 10)
	public String getOrderType() {
		return this.orderType;
	}

	/**
	 * Method setOrderType.
	 * 
	 * @param orderType
	 *            String
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * Method getOverrideConstraints.
	 * 
	 * @return Integer
	 */
	@Column(name = "overrideConstraints", nullable = false)
	public Integer getOverrideConstraints() {
		return this.overrideConstraints;
	}

	/**
	 * Method setOverrideConstraints.
	 * 
	 * @param overrideConstraints
	 *            Integer
	 */
	public void setOverrideConstraints(Integer overrideConstraints) {
		this.overrideConstraints = overrideConstraints;
	}

	/**
	 * Method getParentId.
	 * 
	 * @return Integer
	 */
	@Column(name = "parentId")
	public Integer getParentId() {
		return this.parentId;
	}

	/**
	 * Method setParentId.
	 * 
	 * @param parentId
	 *            Integer
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	/**
	 * Method getPermId.
	 * 
	 * @return Integer
	 */
	@Column(name = "permId")
	public Integer getPermId() {
		return this.permId;
	}

	/**
	 * Method setPermId.
	 * 
	 * @param permId
	 *            Integer
	 */
	public void setPermId(Integer permId) {
		this.permId = permId;
	}

	/**
	 * Method getQuantity.
	 * 
	 * @return Integer
	 */
	@Column(name = "quantity", nullable = false)
	public Integer getQuantity() {
		return this.quantity;
	}

	/**
	 * Method setQuantity.
	 * 
	 * @param quantity
	 *            Integer
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * Method getTimeInForce.
	 * 
	 * @return String
	 */
	@Column(name = "timeInForce", nullable = false, length = 3)
	public String getTimeInForce() {
		return this.timeInForce;
	}

	/**
	 * Method setTimeInForce.
	 * 
	 * @param timeInForce
	 *            String
	 */
	public void setTimeInForce(String timeInForce) {
		this.timeInForce = timeInForce;
	}

	/**
	 * Method getStatus.
	 * 
	 * @return String
	 */
	@Column(name = "status", length = 45)
	public String getStatus() {
		return this.status;
	}

	/**
	 * Method setStatus.
	 * 
	 * @param status
	 *            String
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Method getStopPrice.
	 * 
	 * @return BigDecimal
	 */
	@Column(name = "stopPrice", precision = 10)
	public BigDecimal getStopPrice() {
		return this.stopPrice;
	}

	/**
	 * Method setStopPrice.
	 * 
	 * @param stopPrice
	 *            BigDecimal
	 */
	public void setStopPrice(BigDecimal stopPrice) {
		this.stopPrice = stopPrice;
	}

	/**
	 * Method getTransmit.
	 * 
	 * @return Boolean
	 */
	@Column(name = "transmit", length = 1)
	public Boolean getTransmit() {
		return this.transmit;
	}

	/**
	 * Method setTransmit.
	 * 
	 * @param transmit
	 *            Boolean
	 */
	public void setTransmit(Boolean transmit) {
		this.transmit = transmit;
	}

	/**
	 * Method getTriggerMethod.
	 * 
	 * @return Integer
	 */
	@Column(name = "triggerMethod", nullable = false)
	public Integer getTriggerMethod() {
		return this.triggerMethod;
	}

	/**
	 * Method setTriggerMethod.
	 * 
	 * @param triggerMethod
	 *            Integer
	 */
	public void setTriggerMethod(Integer triggerMethod) {
		this.triggerMethod = triggerMethod;
	}

	/**
	 * Method getUpdateDate.
	 * 
	 * @return Date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateDate", nullable = false, length = 19)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	/**
	 * Method setUpdateDate.
	 * 
	 * @param updateDate
	 *            Date
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * Method getVersion.
	 * 
	 * @return Integer
	 */
	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * Method setVersion.
	 * 
	 * @param version
	 *            Integer
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * Method getWarningMessage.
	 * 
	 * @return String
	 */
	@Column(name = "warningMessage", length = 200)
	public String getWarningMessage() {
		return this.warningMessage;
	}

	/**
	 * Method setWarningMessage.
	 * 
	 * @param warningMessage
	 *            String
	 */
	public void setWarningMessage(String warningMessage) {
		this.warningMessage = warningMessage;
	}

	/**
	 * Method getWhyHeld.
	 * 
	 * @return String
	 */
	@Column(name = "whyHeld", length = 45)
	public String getWhyHeld() {
		return this.whyHeld;
	}

	/**
	 * Method setWhyHeld.
	 * 
	 * @param whyHeld
	 *            String
	 */
	public void setWhyHeld(String whyHeld) {
		this.whyHeld = whyHeld;
	}

	/**
	 * Method getTradeOrderfills.
	 * 
	 * @return List<TradeOrderfill>
	 */
	@OneToMany(mappedBy = "tradeOrder", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@OrderBy("time ASC")
	public List<TradeOrderfill> getTradeOrderfills() {
		return this.tradeOrderfills;
	}

	/**
	 * Method setTradeOrderfills.
	 * 
	 * @param tradeOrderfills
	 *            List<TradeOrderfill>
	 */
	public void setTradeOrderfills(List<TradeOrderfill> tradeOrderfills) {
		this.tradeOrderfills = tradeOrderfills;
	}

	/**
	 * Method addTradeOrderfill.
	 * 
	 * @param tradeOrderfills
	 *            TradeOrderfill
	 */
	public void addTradeOrderfill(TradeOrderfill tradeOrderfills) {
		this.tradeOrderfills.add(tradeOrderfills);
	}

	/**
	 * Method existTradeOrderfill.
	 * 
	 * @param execId
	 *            String
	 * @return boolean
	 */
	@Transient
	public boolean existTradeOrderfill(String execId) {
		for (TradeOrderfill tradeOrderfill : this.getTradeOrderfills()) {
			if (tradeOrderfill.getExecId().equals(execId)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Method clone.
	 * 
	 * @return TradeOrder
	 */
	public TradeOrder clone() {
		try {
			TradeOrder order = (TradeOrder) super.clone();
			List<TradeOrderfill> tradeOrderfills = new ArrayList<TradeOrderfill>(
					0);
			order.setTradeOrderfills(tradeOrderfills);
			return order;
		} catch (CloneNotSupportedException e) {
			// will never happen
			return null;
		}
	}

	/**
	 * Method equals.
	 * 
	 * @param objectToCompare
	 *            Object
	 * @return boolean
	 */
	public boolean equals(Object objectToCompare) {

		if (super.equals(objectToCompare))
			return true;

		if (!(objectToCompare instanceof TradeOrder))
			return false;

		TradeOrder theOtherOrder = (TradeOrder) objectToCompare;

		if (!theOtherOrder.getAction().equals((this.getAction()))) {
			return false;
		}
		if (theOtherOrder.getAverageFilledPrice() != this
				.getAverageFilledPrice()) {
			return false;
		}
		if (theOtherOrder.getAllOrNothing() != this.getAllOrNothing()) {
			return false;
		}
		if (theOtherOrder.getAuxPrice() != this.getAuxPrice()) {
			return false;
		}
		if (theOtherOrder.getClientId() != this.getClientId()) {
			return false;
		}
		if (theOtherOrder.getCommission() != this.getCommission()) {
			return false;
		}
		if (theOtherOrder.getCreateDate() != this.getCreateDate()) {
			return false;
		}
		if (theOtherOrder.getDisplayQuantity() != this.getDisplayQuantity()) {
			return false;
		}
		if (theOtherOrder.getFilledQuantity() != this.getFilledQuantity()) {
			return false;
		}
		if (theOtherOrder.getFilledDate() != this.getFilledDate()) {
			return false;
		}
		if (theOtherOrder.getGoodAfterTime() != this.getGoodAfterTime()) {
			return false;
		}
		if (theOtherOrder.getGoodTillTime() != this.getGoodTillTime()) {
			return false;
		}
		if (theOtherOrder.getHidden() != this.getHidden()) {
			return false;
		}
		if (theOtherOrder.getIsOpenPosition() != this.getIsOpenPosition()) {
			return false;
		}
		if (theOtherOrder.getIsFilled() != this.getIsFilled()) {
			return false;
		}
		if (theOtherOrder.getLimitPrice() != this.getLimitPrice()) {
			return false;
		}
		if (!theOtherOrder.getOcaGroupName().equals(this.getOcaGroupName())) {
			return false;
		}
		if (theOtherOrder.getOcaType() != this.getOcaType()) {
			return false;
		}
		if (theOtherOrder.getOrderKey() != this.getOrderKey()) {
			return false;
		}
		if (!theOtherOrder.getOrderReference().equals(this.getOrderReference())) {
			return false;
		}
		if (!theOtherOrder.getOrderType().equals(this.getOrderType())) {
			return false;
		}
		if (theOtherOrder.getOverrideConstraints() != this
				.getOverrideConstraints()) {
			return false;
		}
		if (theOtherOrder.getPermId() != this.getPermId()) {
			return false;
		}
		if (theOtherOrder.getParentId() != this.getParentId()) {
			return false;
		}
		if (theOtherOrder.getQuantity() != this.getQuantity()) {
			return false;
		}
		if (!theOtherOrder.getTimeInForce().equals(this.getTimeInForce())) {
			return false;
		}
		if (!theOtherOrder.getStatus().equals(this.getStatus())) {
			return false;
		}
		if (theOtherOrder.getStopPrice() != this.getStopPrice()) {
			return false;
		}
		if (theOtherOrder.getTransmit() != this.getTransmit()) {
			return false;
		}
		if (theOtherOrder.getTriggerMethod() != this.getTriggerMethod()) {
			return false;
		}
		if (!theOtherOrder.getWarningMessage().equals(this.getWarningMessage())) {
			return false;
		}
		if (!theOtherOrder.getWhyHeld().equals(this.getWhyHeld())) {
			return false;
		}
		return true;
	}

	public static final Comparator<TradeOrder> FILLDATE_ORDER = new Comparator<TradeOrder>() {
		public int compare(TradeOrder o1, TradeOrder o2) {
			m_ascending = true;
			int returnVal = 0;
			if (CoreUtils.nullSafeComparator(o1.getFilledDate(),
					o2.getFilledDate()) == 0) {
				returnVal = CoreUtils.nullSafeComparator(o1.getAction(),
						o2.getAction());
			} else {
				returnVal = CoreUtils.nullSafeComparator(o1.getFilledDate(),
						o2.getFilledDate());
			}

			if (m_ascending.equals(Boolean.FALSE)) {
				returnVal = returnVal * -1;
			}
			return returnVal;
		}
	};

	/**
	 * Method toString.
	 * 
	 * @return String
	 */
	public String toString() {
		return "OrderKey: " + this.getOrderKey() + " Id: "
				+ this.getIdTradeOrder() + " Version: " + this.getVersion()
				+ " Action: " + this.getAction() + " Quantity: "
				+ this.getQuantity() + " Status: " + this.getStatus()
				+ " OrderType: " + this.getOrderType() + " AuxPrice: "
				+ new Money(this.getAuxPrice()) + " LmtPrice: "
				+ new Money(this.getLimitPrice()) + " Open Position: "
				+ this.getIsOpenPosition() + " Filled: " + this.getIsFilled()
				+ " Filled Qty: " + this.getFilledQuantity() + " Trade Id: "
				+ this.getTrade().getIdTrade() + " Trade Version: "
				+ this.getTrade().getVersion();
	}
}

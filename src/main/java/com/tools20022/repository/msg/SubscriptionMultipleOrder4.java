/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.setr.SubscriptionOrderV03;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice;
import com.tools20022.repository.codeset.CancellationRight1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IndividualPerson9;
import com.tools20022.repository.msg.InvestmentAccount21;
import com.tools20022.repository.msg.PaymentTransaction23;
import com.tools20022.repository.msg.SubscriptionOrder8;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Order to invest the investor's principal in an investment fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#CancellationRightOrExtendedCancellationRightRule
 * SubscriptionMultipleOrder4.CancellationRightOrExtendedCancellationRightRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmMasterReference
 * SubscriptionMultipleOrder4.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmPlaceOfTrade
 * SubscriptionMultipleOrder4.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmOrderDateTime
 * SubscriptionMultipleOrder4.mmOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmExpiryDateTime
 * SubscriptionMultipleOrder4.mmExpiryDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmRequestedFutureTradeDate
 * SubscriptionMultipleOrder4.mmRequestedFutureTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmCancellationRight
 * SubscriptionMultipleOrder4.mmCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmExtendedCancellationRight
 * SubscriptionMultipleOrder4.mmExtendedCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmInvestmentAccountDetails
 * SubscriptionMultipleOrder4.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmBeneficiaryDetails
 * SubscriptionMultipleOrder4.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmIndividualOrderDetails
 * SubscriptionMultipleOrder4.mmIndividualOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmTotalSettlementAmount
 * SubscriptionMultipleOrder4.mmTotalSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmCashSettlementDate
 * SubscriptionMultipleOrder4.mmCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmBulkCashSettlementDetails
 * SubscriptionMultipleOrder4.mmBulkCashSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SubscriptionOrder
 * SubscriptionOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03#mmMultipleOrderDetails
 * SubscriptionOrderV03.mmMultipleOrderDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails1Rule#forSubscriptionMultipleOrder4
 * ConstraintBulkCashSettlementDetails1Rule.forSubscriptionMultipleOrder4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrency5Rule#forSubscriptionMultipleOrder4
 * ConstraintSettlementCurrency5Rule.forSubscriptionMultipleOrder4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCashSettlementDateRule#forSubscriptionMultipleOrder4
 * ConstraintCashSettlementDateRule.forSubscriptionMultipleOrder4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forSubscriptionMultipleOrder4
 * ConstraintOrderOriginatorEligibility3Rule.forSubscriptionMultipleOrder4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionMultipleOrder4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Order to invest the investor's principal in an investment fund."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6
 * SubscriptionMultipleOrder6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubscriptionMultipleOrder4", propOrder = {"masterReference", "placeOfTrade", "orderDateTime", "expiryDateTime", "requestedFutureTradeDate", "cancellationRight", "extendedCancellationRight", "investmentAccountDetails",
		"beneficiaryDetails", "individualOrderDetails", "totalSettlementAmount", "cashSettlementDate", "bulkCashSettlementDetails"})
public class SubscriptionMultipleOrder4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmMasterReference
	 * SubscriptionMultipleOrder6.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionMultipleOrder4, Optional<Max35Text>> mmMasterReference = new MMMessageAttribute<SubscriptionMultipleOrder4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionMultipleOrder6.mmMasterReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionMultipleOrder4 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(SubscriptionMultipleOrder4 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfTrad")
	protected PlaceOfTradeIdentification1Choice placeOfTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice
	 * PlaceOfTradeIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market in which the advised trade transaction was executed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmPlaceOfTrade
	 * SubscriptionMultipleOrder6.mmPlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionMultipleOrder4, Optional<PlaceOfTradeIdentification1Choice>> mmPlaceOfTrade = new MMMessageAttribute<SubscriptionMultipleOrder4, Optional<PlaceOfTradeIdentification1Choice>>() {
		{
			businessComponentTrace_lazy = () -> TradingMarket.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which the advised trade transaction was executed.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionMultipleOrder6.mmPlaceOfTrade);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PlaceOfTradeIdentification1Choice.mmObject();
		}

		@Override
		public Optional<PlaceOfTradeIdentification1Choice> getValue(SubscriptionMultipleOrder4 obj) {
			return obj.getPlaceOfTrade();
		}

		@Override
		public void setValue(SubscriptionMultipleOrder4 obj, Optional<PlaceOfTradeIdentification1Choice> value) {
			obj.setPlaceOfTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrDtTm")
	protected ISODateTime orderDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderDateTime
	 * InvestmentFundOrder.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the investor places the order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmOrderDateTime
	 * SubscriptionMultipleOrder6.mmOrderDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionMultipleOrder4, Optional<ISODateTime>> mmOrderDateTime = new MMMessageAttribute<SubscriptionMultipleOrder4, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			isDerived = false;
			xmlTag = "OrdrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDateTime";
			definition = "Date the investor places the order.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionMultipleOrder6.mmOrderDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(SubscriptionMultipleOrder4 obj) {
			return obj.getOrderDateTime();
		}

		@Override
		public void setValue(SubscriptionMultipleOrder4 obj, Optional<ISODateTime> value) {
			obj.setOrderDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDtTm")
	protected DateAndDateTimeChoice expiryDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmExpiryDateTime
	 * InvestmentFundOrder.mmExpiryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the order expires."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmExpiryDateTime
	 * SubscriptionMultipleOrder6.mmExpiryDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionMultipleOrder4, Optional<DateAndDateTimeChoice>> mmExpiryDateTime = new MMMessageAttribute<SubscriptionMultipleOrder4, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmExpiryDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			isDerived = false;
			xmlTag = "XpryDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDateTime";
			definition = "Date on which the order expires.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionMultipleOrder6.mmExpiryDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(SubscriptionMultipleOrder4 obj) {
			return obj.getExpiryDateTime();
		}

		@Override
		public void setValue(SubscriptionMultipleOrder4 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setExpiryDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdFutrTradDt")
	protected ISODate requestedFutureTradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedExecutionDateTime
	 * InvestmentFundOrder.mmRequestedExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdFutrTradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedFutureTradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Future date at which the investor requests the order to be executed. The specification of a requested future trade date is not allowed in some markets. The date must be a date in the future."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmRequestedFutureTradeDate
	 * SubscriptionMultipleOrder6.mmRequestedFutureTradeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionMultipleOrder4, Optional<ISODate>> mmRequestedFutureTradeDate = new MMMessageAttribute<SubscriptionMultipleOrder4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedExecutionDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			isDerived = false;
			xmlTag = "ReqdFutrTradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedFutureTradeDate";
			definition = "Future date at which the investor requests the order to be executed. The specification of a requested future trade date is not allowed in some markets. The date must be a date in the future.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionMultipleOrder6.mmRequestedFutureTradeDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(SubscriptionMultipleOrder4 obj) {
			return obj.getRequestedFutureTradeDate();
		}

		@Override
		public void setValue(SubscriptionMultipleOrder4 obj, Optional<ISODate> value) {
			obj.setRequestedFutureTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlRght")
	protected CancellationRight1Code cancellationRight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRight1Code
	 * CancellationRight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmCancellationRight
	 * InvestmentFundOrder.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation right of an investor with respect to an investment fund order."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmCancellationRight
	 * SubscriptionMultipleOrder6.mmCancellationRight}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionMultipleOrder4, Optional<CancellationRight1Code>> mmCancellationRight = new MMMessageAttribute<SubscriptionMultipleOrder4, Optional<CancellationRight1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmCancellationRight;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			isDerived = false;
			xmlTag = "CxlRght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of an investor with respect to an investment fund order.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionMultipleOrder6.mmCancellationRight);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CancellationRight1Code.mmObject();
		}

		@Override
		public Optional<CancellationRight1Code> getValue(SubscriptionMultipleOrder4 obj) {
			return obj.getCancellationRight();
		}

		@Override
		public void setValue(SubscriptionMultipleOrder4 obj, Optional<CancellationRight1Code> value) {
			obj.setCancellationRight(value.orElse(null));
		}
	};
	@XmlElement(name = "XtndedCxlRght")
	protected Extended350Code extendedCancellationRight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmCancellationRight
	 * InvestmentFundOrder.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedCxlRght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedCancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation right of an investor with respect to an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionMultipleOrder4, Optional<Extended350Code>> mmExtendedCancellationRight = new MMMessageAttribute<SubscriptionMultipleOrder4, Optional<Extended350Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmCancellationRight;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			isDerived = false;
			xmlTag = "XtndedCxlRght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedCancellationRight";
			definition = "Cancellation right of an investor with respect to an investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Optional<Extended350Code> getValue(SubscriptionMultipleOrder4 obj) {
			return obj.getExtendedCancellationRight();
		}

		@Override
		public void setValue(SubscriptionMultipleOrder4 obj, Optional<Extended350Code> value) {
			obj.setExtendedCancellationRight(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtAcctDtls", required = true)
	protected InvestmentAccount21 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount21
	 * InvestmentAccount21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account impacted by an investment fund order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmInvestmentAccountDetails
	 * SubscriptionMultipleOrder6.mmInvestmentAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionMultipleOrder4, InvestmentAccount21> mmInvestmentAccountDetails = new MMMessageAssociationEnd<SubscriptionMultipleOrder4, InvestmentAccount21>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account impacted by an investment fund order.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionMultipleOrder6.mmInvestmentAccountDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccount21.mmObject();
		}

		@Override
		public InvestmentAccount21 getValue(SubscriptionMultipleOrder4 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(SubscriptionMultipleOrder4 obj, InvestmentAccount21 value) {
			obj.setInvestmentAccountDetails(value);
		}
	};
	@XmlElement(name = "BnfcryDtls")
	protected IndividualPerson9 beneficiaryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson9
	 * IndividualPerson9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the beneficial owner."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmBeneficiaryDetails
	 * SubscriptionMultipleOrder6.mmBeneficiaryDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionMultipleOrder4, Optional<IndividualPerson9>> mmBeneficiaryDetails = new MMMessageAssociationEnd<SubscriptionMultipleOrder4, Optional<IndividualPerson9>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			isDerived = false;
			xmlTag = "BnfcryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryDetails";
			definition = "Additional information about the beneficial owner.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionMultipleOrder6.mmBeneficiaryDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndividualPerson9.mmObject();
		}

		@Override
		public Optional<IndividualPerson9> getValue(SubscriptionMultipleOrder4 obj) {
			return obj.getBeneficiaryDetails();
		}

		@Override
		public void setValue(SubscriptionMultipleOrder4 obj, Optional<IndividualPerson9> value) {
			obj.setBeneficiaryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "IndvOrdrDtls", required = true)
	protected List<SubscriptionOrder8> individualOrderDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubscriptionOrder8
	 * SubscriptionOrder8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionOrder
	 * SubscriptionOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvOrdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualOrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order to invest the investor's principal in an investment fund."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmIndividualOrderDetails
	 * SubscriptionMultipleOrder6.mmIndividualOrderDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionMultipleOrder4, List<SubscriptionOrder8>> mmIndividualOrderDetails = new MMMessageAssociationEnd<SubscriptionMultipleOrder4, List<SubscriptionOrder8>>() {
		{
			businessComponentTrace_lazy = () -> SubscriptionOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			isDerived = false;
			xmlTag = "IndvOrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOrderDetails";
			definition = "Order to invest the investor's principal in an investment fund.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionMultipleOrder6.mmIndividualOrderDetails);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SubscriptionOrder8.mmObject();
		}

		@Override
		public List<SubscriptionOrder8> getValue(SubscriptionMultipleOrder4 obj) {
			return obj.getIndividualOrderDetails();
		}

		@Override
		public void setValue(SubscriptionMultipleOrder4 obj, List<SubscriptionOrder8> value) {
			obj.setIndividualOrderDetails(value);
		}
	};
	@XmlElement(name = "TtlSttlmAmt")
	protected ActiveCurrencyAndAmount totalSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money paid /to be paid or received in exchange for the financial instrument in the multiple order."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmTotalSettlementAmount
	 * SubscriptionMultipleOrder6.mmTotalSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionMultipleOrder4, Optional<ActiveCurrencyAndAmount>> mmTotalSettlementAmount = new MMMessageAttribute<SubscriptionMultipleOrder4, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			isDerived = false;
			xmlTag = "TtlSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalSettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the multiple order.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionMultipleOrder6.mmTotalSettlementAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SubscriptionMultipleOrder4 obj) {
			return obj.getTotalSettlementAmount();
		}

		@Override
		public void setValue(SubscriptionMultipleOrder4 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "CshSttlmDt")
	protected ISODate cashSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which cash is available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionMultipleOrder4, Optional<ISODate>> mmCashSettlementDate = new MMMessageAttribute<SubscriptionMultipleOrder4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDate";
			definition = "Date on which cash is available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(SubscriptionMultipleOrder4 obj) {
			return obj.getCashSettlementDate();
		}

		@Override
		public void setValue(SubscriptionMultipleOrder4 obj, Optional<ISODate> value) {
			obj.setCashSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "BlkCshSttlmDtls")
	protected PaymentTransaction23 bulkCashSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction23
	 * PaymentTransaction23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BulkPayment BulkPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlkCshSttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment processes required to transfer cash from the debtor to the creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmBulkCashSettlementDetails
	 * SubscriptionMultipleOrder6.mmBulkCashSettlementDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionMultipleOrder4, Optional<PaymentTransaction23>> mmBulkCashSettlementDetails = new MMMessageAssociationEnd<SubscriptionMultipleOrder4, Optional<PaymentTransaction23>>() {
		{
			businessComponentTrace_lazy = () -> BulkPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			isDerived = false;
			xmlTag = "BlkCshSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(SubscriptionMultipleOrder6.mmBulkCashSettlementDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction23.mmObject();
		}

		@Override
		public Optional<PaymentTransaction23> getValue(SubscriptionMultipleOrder4 obj) {
			return obj.getBulkCashSettlementDetails();
		}

		@Override
		public void setValue(SubscriptionMultipleOrder4 obj, Optional<PaymentTransaction23> value) {
			obj.setBulkCashSettlementDetails(value.orElse(null));
		}
	};
	/**
	 * Either CancellationRight or ExtendedCancellationRight may be present but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4
	 * SubscriptionMultipleOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmCancellationRight
	 * SubscriptionMultipleOrder4.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmExtendedCancellationRight
	 * SubscriptionMultipleOrder4.mmExtendedCancellationRight}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRightOrExtendedCancellationRightRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CancellationRight or ExtendedCancellationRight may be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor CancellationRightOrExtendedCancellationRightRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRightOrExtendedCancellationRightRule";
			definition = "Either CancellationRight or ExtendedCancellationRight may be present but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmCancellationRight, com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmExtendedCancellationRight);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmMasterReference, com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmPlaceOfTrade,
						com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmOrderDateTime, com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmExpiryDateTime,
						com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmRequestedFutureTradeDate, com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmCancellationRight,
						com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmExtendedCancellationRight, com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmInvestmentAccountDetails,
						com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmBeneficiaryDetails, com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmIndividualOrderDetails,
						com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmTotalSettlementAmount, com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmCashSettlementDate,
						com.tools20022.repository.msg.SubscriptionMultipleOrder4.mmBulkCashSettlementDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(SubscriptionOrderV03.mmMultipleOrderDetails);
				trace_lazy = () -> SubscriptionOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails1Rule.forSubscriptionMultipleOrder4,
						com.tools20022.repository.constraints.ConstraintSettlementCurrency5Rule.forSubscriptionMultipleOrder4, com.tools20022.repository.constraints.ConstraintCashSettlementDateRule.forSubscriptionMultipleOrder4,
						com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forSubscriptionMultipleOrder4);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SubscriptionMultipleOrder4";
				definition = "Order to invest the investor's principal in an investment fund.";
				nextVersions_lazy = () -> Arrays.asList(SubscriptionMultipleOrder6.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionMultipleOrder4.CancellationRightOrExtendedCancellationRightRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public SubscriptionMultipleOrder4 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Optional<PlaceOfTradeIdentification1Choice> getPlaceOfTrade() {
		return placeOfTrade == null ? Optional.empty() : Optional.of(placeOfTrade);
	}

	public SubscriptionMultipleOrder4 setPlaceOfTrade(PlaceOfTradeIdentification1Choice placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
		return this;
	}

	public Optional<ISODateTime> getOrderDateTime() {
		return orderDateTime == null ? Optional.empty() : Optional.of(orderDateTime);
	}

	public SubscriptionMultipleOrder4 setOrderDateTime(ISODateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getExpiryDateTime() {
		return expiryDateTime == null ? Optional.empty() : Optional.of(expiryDateTime);
	}

	public SubscriptionMultipleOrder4 setExpiryDateTime(DateAndDateTimeChoice expiryDateTime) {
		this.expiryDateTime = expiryDateTime;
		return this;
	}

	public Optional<ISODate> getRequestedFutureTradeDate() {
		return requestedFutureTradeDate == null ? Optional.empty() : Optional.of(requestedFutureTradeDate);
	}

	public SubscriptionMultipleOrder4 setRequestedFutureTradeDate(ISODate requestedFutureTradeDate) {
		this.requestedFutureTradeDate = requestedFutureTradeDate;
		return this;
	}

	public Optional<CancellationRight1Code> getCancellationRight() {
		return cancellationRight == null ? Optional.empty() : Optional.of(cancellationRight);
	}

	public SubscriptionMultipleOrder4 setCancellationRight(CancellationRight1Code cancellationRight) {
		this.cancellationRight = cancellationRight;
		return this;
	}

	public Optional<Extended350Code> getExtendedCancellationRight() {
		return extendedCancellationRight == null ? Optional.empty() : Optional.of(extendedCancellationRight);
	}

	public SubscriptionMultipleOrder4 setExtendedCancellationRight(Extended350Code extendedCancellationRight) {
		this.extendedCancellationRight = extendedCancellationRight;
		return this;
	}

	public InvestmentAccount21 getInvestmentAccountDetails() {
		return investmentAccountDetails;
	}

	public SubscriptionMultipleOrder4 setInvestmentAccountDetails(InvestmentAccount21 investmentAccountDetails) {
		this.investmentAccountDetails = Objects.requireNonNull(investmentAccountDetails);
		return this;
	}

	public Optional<IndividualPerson9> getBeneficiaryDetails() {
		return beneficiaryDetails == null ? Optional.empty() : Optional.of(beneficiaryDetails);
	}

	public SubscriptionMultipleOrder4 setBeneficiaryDetails(IndividualPerson9 beneficiaryDetails) {
		this.beneficiaryDetails = beneficiaryDetails;
		return this;
	}

	public List<SubscriptionOrder8> getIndividualOrderDetails() {
		return individualOrderDetails == null ? individualOrderDetails = new ArrayList<>() : individualOrderDetails;
	}

	public SubscriptionMultipleOrder4 setIndividualOrderDetails(List<SubscriptionOrder8> individualOrderDetails) {
		this.individualOrderDetails = Objects.requireNonNull(individualOrderDetails);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalSettlementAmount() {
		return totalSettlementAmount == null ? Optional.empty() : Optional.of(totalSettlementAmount);
	}

	public SubscriptionMultipleOrder4 setTotalSettlementAmount(ActiveCurrencyAndAmount totalSettlementAmount) {
		this.totalSettlementAmount = totalSettlementAmount;
		return this;
	}

	public Optional<ISODate> getCashSettlementDate() {
		return cashSettlementDate == null ? Optional.empty() : Optional.of(cashSettlementDate);
	}

	public SubscriptionMultipleOrder4 setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = cashSettlementDate;
		return this;
	}

	public Optional<PaymentTransaction23> getBulkCashSettlementDetails() {
		return bulkCashSettlementDetails == null ? Optional.empty() : Optional.of(bulkCashSettlementDetails);
	}

	public SubscriptionMultipleOrder4 setBulkCashSettlementDetails(PaymentTransaction23 bulkCashSettlementDetails) {
		this.bulkCashSettlementDetails = bulkCashSettlementDetails;
		return this;
	}
}
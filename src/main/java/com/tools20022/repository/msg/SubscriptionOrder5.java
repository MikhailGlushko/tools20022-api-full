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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#NetAmountOrGrossAmountOrUnitsNumberRule
 * SubscriptionOrder5.NetAmountOrGrossAmountOrUnitsNumberRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmOrderReference
 * SubscriptionOrder5.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmClientReference
 * SubscriptionOrder5.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmCancellationReference
 * SubscriptionOrder5.mmCancellationReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmOrderType
 * SubscriptionOrder5.mmOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmBeneficiaryDetails
 * SubscriptionOrder5.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmUnitsNumber
 * SubscriptionOrder5.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmGrossAmount
 * SubscriptionOrder5.mmGrossAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmNetAmount
 * SubscriptionOrder5.mmNetAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmRounding
 * SubscriptionOrder5.mmRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmSettlementAmount
 * SubscriptionOrder5.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmCashSettlementDate
 * SubscriptionOrder5.mmCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmSettlementMethod
 * SubscriptionOrder5.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmIncomePreference
 * SubscriptionOrder5.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmInvestmentAccountDetails
 * SubscriptionOrder5.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmForeignExchangeDetails
 * SubscriptionOrder5.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmLetterIntentReference
 * SubscriptionOrder5.mmLetterIntentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmAccumulationRightReference
 * SubscriptionOrder5.mmAccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmChargeDetails
 * SubscriptionOrder5.mmChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmCommissionDetails
 * SubscriptionOrder5.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmTaxDetails
 * SubscriptionOrder5.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmSettlementAndCustodyDetails
 * SubscriptionOrder5.mmSettlementAndCustodyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmPhysicalDeliveryIndicator
 * SubscriptionOrder5.mmPhysicalDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmPhysicalDeliveryDetails
 * SubscriptionOrder5.mmPhysicalDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmCashSettlementDetails
 * SubscriptionOrder5.mmCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmNonStandardSettlementInformation
 * SubscriptionOrder5.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmStaffClientBreakdown
 * SubscriptionOrder5.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmFinancialAdvice
 * SubscriptionOrder5.mmFinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmNegotiatedTrade
 * SubscriptionOrder5.mmNegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmRelatedPartyDetails
 * SubscriptionOrder5.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmEqualisation
 * SubscriptionOrder5.mmEqualisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SubscriptionOrder
 * SubscriptionOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionOrder5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Order to invest the investor's principal in an investment fund."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetailsRule#forSubscriptionOrder5
 * ConstraintPhysicalDeliveryDetailsRule.forSubscriptionOrder5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forSubscriptionOrder5
 * ConstraintOrderOriginatorEligibility3Rule.forSubscriptionOrder5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubscriptionOrder5", propOrder = {"orderReference", "clientReference", "cancellationReference", "orderType", "beneficiaryDetails", "unitsNumber", "grossAmount", "netAmount", "rounding", "settlementAmount",
		"cashSettlementDate", "settlementMethod", "incomePreference", "investmentAccountDetails", "foreignExchangeDetails", "letterIntentReference", "accumulationRightReference", "chargeDetails", "commissionDetails", "taxDetails",
		"settlementAndCustodyDetails", "physicalDeliveryIndicator", "physicalDeliveryDetails", "cashSettlementDetails", "nonStandardSettlementInformation", "staffClientBreakdown", "financialAdvice", "negotiatedTrade",
		"relatedPartyDetails", "equalisation"})
public class SubscriptionOrder5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrdrRef", required = true)
	protected Max35Text orderReference;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order, as assigned by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, Max35Text> mmOrderReference = new MMMessageAttribute<SubscriptionOrder5, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for an order, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SubscriptionOrder5 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Max35Text value) {
			obj.setOrderReference(value);
		}
	};
	@XmlElement(name = "ClntRef")
	protected Max35Text clientReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, Optional<Max35Text>> mmClientReference = new MMMessageAttribute<SubscriptionOrder5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionOrder5 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<Max35Text> value) {
			obj.setClientReference(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlRef")
	protected Max35Text cancellationReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order cancellation, as assigned by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, Optional<Max35Text>> mmCancellationReference = new MMMessageAttribute<SubscriptionOrder5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "CxlRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReference";
			definition = "Unique and unambiguous identifier for an order cancellation, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionOrder5 obj) {
			return obj.getCancellationReference();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<Max35Text> value) {
			obj.setCancellationReference(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrTp")
	protected List<FundOrderType2> orderType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundOrderType2
	 * FundOrderType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderType
	 * InvestmentFundOrder.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of the investment fund order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder5, List<FundOrderType2>> mmOrderType = new MMMessageAssociationEnd<SubscriptionOrder5, List<FundOrderType2>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "OrdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderType";
			definition = "Specifies the category of the investment fund order.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundOrderType2.mmObject();
		}

		@Override
		public List<FundOrderType2> getValue(SubscriptionOrder5 obj) {
			return obj.getOrderType();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, List<FundOrderType2> value) {
			obj.setOrderType(value);
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the investor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder5, Optional<IndividualPerson9>> mmBeneficiaryDetails = new MMMessageAssociationEnd<SubscriptionOrder5, Optional<IndividualPerson9>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "BnfcryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryDetails";
			definition = "Additional information about the investor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndividualPerson9.mmObject();
		}

		@Override
		public Optional<IndividualPerson9> getValue(SubscriptionOrder5 obj) {
			return obj.getBeneficiaryDetails();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<IndividualPerson9> value) {
			obj.setBeneficiaryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitsNb", required = true)
	protected FinancialInstrumentQuantity1 unitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
	 * InvestmentFundOrder.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of investment fund units to be subscribed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, FinancialInstrumentQuantity1> mmUnitsNumber = new MMMessageAttribute<SubscriptionOrder5, FinancialInstrumentQuantity1>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Quantity of investment fund units to be subscribed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1 getValue(SubscriptionOrder5 obj) {
			return obj.getUnitsNumber();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, FinancialInstrumentQuantity1 value) {
			obj.setUnitsNumber(value);
		}
	};
	@XmlElement(name = "GrssAmt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount grossAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmount
	 * InvestmentFundOrder.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be invested in a specific financial instrument by an investor before deduction of charges, commissions and taxes and used to determine the quantity of investment fund units to be subscribed.\n[(Quantity * Price) + (Charges + Commissions +Taxes)]."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, ActiveOrHistoricCurrencyAndAmount> mmGrossAmount = new MMMessageAttribute<SubscriptionOrder5, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmGrossAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "GrssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "Amount of money to be invested in a specific financial instrument by an investor before deduction of charges, commissions and taxes and used to determine the quantity of investment fund units to be subscribed.\n[(Quantity * Price) + (Charges + Commissions +Taxes)].";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(SubscriptionOrder5 obj) {
			return obj.getGrossAmount();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setGrossAmount(value);
		}
	};
	@XmlElement(name = "NetAmt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount netAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNetAmount
	 * InvestmentFundOrder.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money remaining after deduction of charges, commissions and taxes and used to determine the quantity of investment fund units to be subscribed.\n[Quantity * Price]."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, ActiveOrHistoricCurrencyAndAmount> mmNetAmount = new MMMessageAttribute<SubscriptionOrder5, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmNetAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Amount of money remaining after deduction of charges, commissions and taxes and used to determine the quantity of investment fund units to be subscribed.\n[Quantity * Price].";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(SubscriptionOrder5 obj) {
			return obj.getNetAmount();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setNetAmount(value);
		}
	};
	@XmlElement(name = "Rndg")
	protected RoundingDirection2Code rounding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirection2Code
	 * RoundingDirection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRoundingDirection
	 * RoundingParameters.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rndg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rounding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the rounding direction applied to nearest unit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, Optional<RoundingDirection2Code>> mmRounding = new MMMessageAttribute<SubscriptionOrder5, Optional<RoundingDirection2Code>>() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "Rndg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rounding";
			definition = "Indicates the rounding direction applied to nearest unit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection2Code.mmObject();
		}

		@Override
		public Optional<RoundingDirection2Code> getValue(SubscriptionOrder5 obj) {
			return obj.getRounding();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<RoundingDirection2Code> value) {
			obj.setRounding(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected ActiveCurrencyAndAmount settlementAmount;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, Optional<ActiveCurrencyAndAmount>> mmSettlementAmount = new MMMessageAttribute<SubscriptionOrder5, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SubscriptionOrder5 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setSettlementAmount(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which cash is available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, Optional<ISODate>> mmCashSettlementDate = new MMMessageAttribute<SubscriptionOrder5, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
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
		public Optional<ISODate> getValue(SubscriptionOrder5 obj) {
			return obj.getCashSettlementDate();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<ISODate> value) {
			obj.setCashSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmMtd")
	protected DeliveryReceiptType2Code settlementMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType2Code
	 * DeliveryReceiptType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementType
	 * SecuritiesSettlement.mmSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method by which the transaction is settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, Optional<DeliveryReceiptType2Code>> mmSettlementMethod = new MMMessageAttribute<SubscriptionOrder5, Optional<DeliveryReceiptType2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "SttlmMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod";
			definition = "Method by which the transaction is settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}

		@Override
		public Optional<DeliveryReceiptType2Code> getValue(SubscriptionOrder5 obj) {
			return obj.getSettlementMethod();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<DeliveryReceiptType2Code> value) {
			obj.setSettlementMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmPref")
	protected IncomePreference1Code incomePreference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference1Code
	 * IncomePreference1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPref"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, Optional<IncomePreference1Code>> mmIncomePreference = new MMMessageAttribute<SubscriptionOrder5, Optional<IncomePreference1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}

		@Override
		public Optional<IncomePreference1Code> getValue(SubscriptionOrder5 obj) {
			return obj.getIncomePreference();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<IncomePreference1Code> value) {
			obj.setIncomePreference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account impacted by an investment fund order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder5, InvestmentAccount21> mmInvestmentAccountDetails = new MMMessageAssociationEnd<SubscriptionOrder5, InvestmentAccount21>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account impacted by an investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccount21.mmObject();
		}

		@Override
		public InvestmentAccount21 getValue(SubscriptionOrder5 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, InvestmentAccount21 value) {
			obj.setInvestmentAccountDetails(value);
		}
	};
	@XmlElement(name = "FXDtls")
	protected ForeignExchangeTerms6 foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6
	 * ForeignExchangeTerms6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information needed to process a currency exchange or conversion."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder5, Optional<ForeignExchangeTerms6>> mmForeignExchangeDetails = new MMMessageAssociationEnd<SubscriptionOrder5, Optional<ForeignExchangeTerms6>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms6.mmObject();
		}

		@Override
		public Optional<ForeignExchangeTerms6> getValue(SubscriptionOrder5 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<ForeignExchangeTerms6> value) {
			obj.setForeignExchangeDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "LttrInttRef")
	protected Max35Text letterIntentReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountContract
	 * InvestmentAccount.mmInvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrInttRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterIntentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, Optional<Max35Text>> mmLetterIntentReference = new MMMessageAttribute<SubscriptionOrder5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentAccountContract;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "LttrInttRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterIntentReference";
			definition = "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionOrder5 obj) {
			return obj.getLetterIntentReference();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<Max35Text> value) {
			obj.setLetterIntentReference(value.orElse(null));
		}
	};
	@XmlElement(name = "AcmltnRghtRef")
	protected Max35Text accumulationRightReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmAccumulationRightReference
	 * InvestmentAccountContract.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcmltnRghtRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulationRightReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of an accumulation right program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, Optional<Max35Text>> mmAccumulationRightReference = new MMMessageAttribute<SubscriptionOrder5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountContract.mmAccumulationRightReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "AcmltnRghtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulationRightReference";
			definition = "Reference of an accumulation right program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionOrder5 obj) {
			return obj.getAccumulationRightReference();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<Max35Text> value) {
			obj.setAccumulationRightReference(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgDtls")
	protected List<Charge17> chargeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge17 Charge17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
	 * InvestmentFundTransaction.mmTransactionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge for the placement of an order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder5, List<Charge17>> mmChargeDetails = new MMMessageAssociationEnd<SubscriptionOrder5, List<Charge17>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "ChrgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeDetails";
			definition = "Charge for the placement of an order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charge17.mmObject();
		}

		@Override
		public List<Charge17> getValue(SubscriptionOrder5 obj) {
			return obj.getChargeDetails();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, List<Charge17> value) {
			obj.setChargeDetails(value);
		}
	};
	@XmlElement(name = "ComssnDtls")
	protected List<Commission10> commissionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission10
	 * Commission10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to a party as compensation for a service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder5, List<Commission10>> mmCommissionDetails = new MMMessageAssociationEnd<SubscriptionOrder5, List<Commission10>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Amount of money due to a party as compensation for a service.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Commission10.mmObject();
		}

		@Override
		public List<Commission10> getValue(SubscriptionOrder5 obj) {
			return obj.getCommissionDetails();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, List<Commission10> value) {
			obj.setCommissionDetails(value);
		}
	};
	@XmlElement(name = "TaxDtls")
	protected List<Tax16> taxDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax16 Tax16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionTax
	 * InvestmentFundTransaction.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax applicable to an investment fund order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder5, List<Tax16>> mmTaxDetails = new MMMessageAssociationEnd<SubscriptionOrder5, List<Tax16>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "TaxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDetails";
			definition = "Tax applicable to an investment fund order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax16.mmObject();
		}

		@Override
		public List<Tax16> getValue(SubscriptionOrder5 obj) {
			return obj.getTaxDetails();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, List<Tax16> value) {
			obj.setTaxDetails(value);
		}
	};
	@XmlElement(name = "SttlmAndCtdyDtls")
	protected FundSettlementParameters4 settlementAndCustodyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4
	 * FundSettlementParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAndCtdyDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAndCustodyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters used to execute the settlement of an investment fund order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder5, Optional<FundSettlementParameters4>> mmSettlementAndCustodyDetails = new MMMessageAssociationEnd<SubscriptionOrder5, Optional<FundSettlementParameters4>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "SttlmAndCtdyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAndCustodyDetails";
			definition = "Parameters used to execute the settlement of an investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundSettlementParameters4.mmObject();
		}

		@Override
		public Optional<FundSettlementParameters4> getValue(SubscriptionOrder5 obj) {
			return obj.getSettlementAndCustodyDetails();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<FundSettlementParameters4> value) {
			obj.setSettlementAndCustodyDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PhysDlvryInd", required = true)
	protected YesNoIndicator physicalDeliveryIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument is to be physically delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, YesNoIndicator> mmPhysicalDeliveryIndicator = new MMMessageAttribute<SubscriptionOrder5, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryIndicator";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SubscriptionOrder5 obj) {
			return obj.getPhysicalDeliveryIndicator();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, YesNoIndicator value) {
			obj.setPhysicalDeliveryIndicator(value);
		}
	};
	@XmlElement(name = "PhysDlvryDtls")
	protected NameAndAddress4 physicalDeliveryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress4
	 * NameAndAddress4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmAddress
	 * PhysicalDelivery.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to physical delivery of the securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder5, Optional<NameAndAddress4>> mmPhysicalDeliveryDetails = new MMMessageAssociationEnd<SubscriptionOrder5, Optional<NameAndAddress4>>() {
		{
			businessElementTrace_lazy = () -> PhysicalDelivery.mmAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetails";
			definition = "Information related to physical delivery of the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NameAndAddress4.mmObject();
		}

		@Override
		public Optional<NameAndAddress4> getValue(SubscriptionOrder5 obj) {
			return obj.getPhysicalDeliveryDetails();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<NameAndAddress4> value) {
			obj.setPhysicalDeliveryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CshSttlmDtls")
	protected PaymentTransaction23 cashSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction23
	 * PaymentTransaction23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment processes required to transfer cash from the debtor to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder5, Optional<PaymentTransaction23>> mmCashSettlementDetails = new MMMessageAssociationEnd<SubscriptionOrder5, Optional<PaymentTransaction23>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentOffset;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDetails";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction23.mmObject();
		}

		@Override
		public Optional<PaymentTransaction23> getValue(SubscriptionOrder5 obj) {
			return obj.getCashSettlementDetails();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<PaymentTransaction23> value) {
			obj.setCashSettlementDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "NonStdSttlmInf")
	protected Max350Text nonStandardSettlementInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
	 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonStdSttlmInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional specific settlement information for non-regulated traded funds."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, Optional<Max350Text>> mmNonStandardSettlementInformation = new MMMessageAttribute<SubscriptionOrder5, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(SubscriptionOrder5 obj) {
			return obj.getNonStandardSettlementInformation();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<Max350Text> value) {
			obj.setNonStandardSettlementInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "StffClntBrkdwn")
	protected List<InvestmentFundsOrderBreakdown1> staffClientBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1
	 * InvestmentFundsOrderBreakdown1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionOrder
	 * SubscriptionOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StffClntBrkdwn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StaffClientBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Breakdown of the net amount per type of order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder5, List<InvestmentFundsOrderBreakdown1>> mmStaffClientBreakdown = new MMMessageAssociationEnd<SubscriptionOrder5, List<InvestmentFundsOrderBreakdown1>>() {
		{
			businessComponentTrace_lazy = () -> SubscriptionOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "StffClntBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StaffClientBreakdown";
			definition = "Breakdown of the net amount per type of order.";
			maxOccurs = 4;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentFundsOrderBreakdown1.mmObject();
		}

		@Override
		public List<InvestmentFundsOrderBreakdown1> getValue(SubscriptionOrder5 obj) {
			return obj.getStaffClientBreakdown();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, List<InvestmentFundsOrderBreakdown1> value) {
			obj.setStaffClientBreakdown(value);
		}
	};
	@XmlElement(name = "FinAdvc")
	protected FinancialAdvice1Code financialAdvice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAdvice1Code
	 * FinancialAdvice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmFinancialAdvice
	 * InvestmentFundOrder.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinAdvc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if advice has been received from an independent financial advisor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, Optional<FinancialAdvice1Code>> mmFinancialAdvice = new MMMessageAttribute<SubscriptionOrder5, Optional<FinancialAdvice1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmFinancialAdvice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "FinAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvice";
			definition = "Specifies if advice has been received from an independent financial advisor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FinancialAdvice1Code.mmObject();
		}

		@Override
		public Optional<FinancialAdvice1Code> getValue(SubscriptionOrder5 obj) {
			return obj.getFinancialAdvice();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<FinancialAdvice1Code> value) {
			obj.setFinancialAdvice(value.orElse(null));
		}
	};
	@XmlElement(name = "NgtdTrad")
	protected NegotiatedTrade1Code negotiatedTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NegotiatedTrade1Code
	 * NegotiatedTrade1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNegotiatedTrade
	 * InvestmentFundOrder.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NgtdTrad"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the trade is negotiated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubscriptionOrder5, Optional<NegotiatedTrade1Code>> mmNegotiatedTrade = new MMMessageAttribute<SubscriptionOrder5, Optional<NegotiatedTrade1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmNegotiatedTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "NgtdTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTrade";
			definition = "Specifies whether the trade is negotiated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NegotiatedTrade1Code.mmObject();
		}

		@Override
		public Optional<NegotiatedTrade1Code> getValue(SubscriptionOrder5 obj) {
			return obj.getNegotiatedTrade();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<NegotiatedTrade1Code> value) {
			obj.setNegotiatedTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdPtyDtls")
	protected List<Intermediary8> relatedPartyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary8
	 * Intermediary8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPtyDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about parties related to the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder5, List<Intermediary8>> mmRelatedPartyDetails = new MMMessageAssociationEnd<SubscriptionOrder5, List<Intermediary8>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "RltdPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartyDetails";
			definition = "Information about parties related to the transaction.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary8.mmObject();
		}

		@Override
		public List<Intermediary8> getValue(SubscriptionOrder5 obj) {
			return obj.getRelatedPartyDetails();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, List<Intermediary8> value) {
			obj.setRelatedPartyDetails(value);
		}
	};
	@XmlElement(name = "Equlstn")
	protected Equalisation1 equalisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Equalisation1
	 * Equalisation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmEqualisation
	 * InvestmentFundClass.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Equlstn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrder5, Optional<Equalisation1>> mmEqualisation = new MMMessageAssociationEnd<SubscriptionOrder5, Optional<Equalisation1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmEqualisation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			isDerived = false;
			xmlTag = "Equlstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Equalisation1.mmObject();
		}

		@Override
		public Optional<Equalisation1> getValue(SubscriptionOrder5 obj) {
			return obj.getEqualisation();
		}

		@Override
		public void setValue(SubscriptionOrder5 obj, Optional<Equalisation1> value) {
			obj.setEqualisation(value.orElse(null));
		}
	};
	/**
	 * One and only one message element in the list (NetAmount, GrossAmount,
	 * UnitsNumber) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5
	 * SubscriptionOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmUnitsNumber
	 * SubscriptionOrder5.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmGrossAmount
	 * SubscriptionOrder5.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmNetAmount
	 * SubscriptionOrder5.mmNetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmountOrGrossAmountOrUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (NetAmount, GrossAmount, UnitsNumber) must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor NetAmountOrGrossAmountOrUnitsNumberRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmountOrGrossAmountOrUnitsNumberRule";
			definition = "One and only one message element in the list (NetAmount, GrossAmount, UnitsNumber) must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder5.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionOrder5.mmUnitsNumber, com.tools20022.repository.msg.SubscriptionOrder5.mmGrossAmount,
					com.tools20022.repository.msg.SubscriptionOrder5.mmNetAmount);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionOrder5.mmOrderReference, com.tools20022.repository.msg.SubscriptionOrder5.mmClientReference,
						com.tools20022.repository.msg.SubscriptionOrder5.mmCancellationReference, com.tools20022.repository.msg.SubscriptionOrder5.mmOrderType, com.tools20022.repository.msg.SubscriptionOrder5.mmBeneficiaryDetails,
						com.tools20022.repository.msg.SubscriptionOrder5.mmUnitsNumber, com.tools20022.repository.msg.SubscriptionOrder5.mmGrossAmount, com.tools20022.repository.msg.SubscriptionOrder5.mmNetAmount,
						com.tools20022.repository.msg.SubscriptionOrder5.mmRounding, com.tools20022.repository.msg.SubscriptionOrder5.mmSettlementAmount, com.tools20022.repository.msg.SubscriptionOrder5.mmCashSettlementDate,
						com.tools20022.repository.msg.SubscriptionOrder5.mmSettlementMethod, com.tools20022.repository.msg.SubscriptionOrder5.mmIncomePreference, com.tools20022.repository.msg.SubscriptionOrder5.mmInvestmentAccountDetails,
						com.tools20022.repository.msg.SubscriptionOrder5.mmForeignExchangeDetails, com.tools20022.repository.msg.SubscriptionOrder5.mmLetterIntentReference,
						com.tools20022.repository.msg.SubscriptionOrder5.mmAccumulationRightReference, com.tools20022.repository.msg.SubscriptionOrder5.mmChargeDetails, com.tools20022.repository.msg.SubscriptionOrder5.mmCommissionDetails,
						com.tools20022.repository.msg.SubscriptionOrder5.mmTaxDetails, com.tools20022.repository.msg.SubscriptionOrder5.mmSettlementAndCustodyDetails,
						com.tools20022.repository.msg.SubscriptionOrder5.mmPhysicalDeliveryIndicator, com.tools20022.repository.msg.SubscriptionOrder5.mmPhysicalDeliveryDetails,
						com.tools20022.repository.msg.SubscriptionOrder5.mmCashSettlementDetails, com.tools20022.repository.msg.SubscriptionOrder5.mmNonStandardSettlementInformation,
						com.tools20022.repository.msg.SubscriptionOrder5.mmStaffClientBreakdown, com.tools20022.repository.msg.SubscriptionOrder5.mmFinancialAdvice, com.tools20022.repository.msg.SubscriptionOrder5.mmNegotiatedTrade,
						com.tools20022.repository.msg.SubscriptionOrder5.mmRelatedPartyDetails, com.tools20022.repository.msg.SubscriptionOrder5.mmEqualisation);
				trace_lazy = () -> SubscriptionOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetailsRule.forSubscriptionOrder5,
						com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forSubscriptionOrder5);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SubscriptionOrder5";
				definition = "Order to invest the investor's principal in an investment fund.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionOrder5.NetAmountOrGrossAmountOrUnitsNumberRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public SubscriptionOrder5 setOrderReference(Max35Text orderReference) {
		this.orderReference = Objects.requireNonNull(orderReference);
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public SubscriptionOrder5 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Optional<Max35Text> getCancellationReference() {
		return cancellationReference == null ? Optional.empty() : Optional.of(cancellationReference);
	}

	public SubscriptionOrder5 setCancellationReference(Max35Text cancellationReference) {
		this.cancellationReference = cancellationReference;
		return this;
	}

	public List<FundOrderType2> getOrderType() {
		return orderType == null ? orderType = new ArrayList<>() : orderType;
	}

	public SubscriptionOrder5 setOrderType(List<FundOrderType2> orderType) {
		this.orderType = Objects.requireNonNull(orderType);
		return this;
	}

	public Optional<IndividualPerson9> getBeneficiaryDetails() {
		return beneficiaryDetails == null ? Optional.empty() : Optional.of(beneficiaryDetails);
	}

	public SubscriptionOrder5 setBeneficiaryDetails(IndividualPerson9 beneficiaryDetails) {
		this.beneficiaryDetails = beneficiaryDetails;
		return this;
	}

	public FinancialInstrumentQuantity1 getUnitsNumber() {
		return unitsNumber;
	}

	public SubscriptionOrder5 setUnitsNumber(FinancialInstrumentQuantity1 unitsNumber) {
		this.unitsNumber = Objects.requireNonNull(unitsNumber);
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getGrossAmount() {
		return grossAmount;
	}

	public SubscriptionOrder5 setGrossAmount(ActiveOrHistoricCurrencyAndAmount grossAmount) {
		this.grossAmount = Objects.requireNonNull(grossAmount);
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public SubscriptionOrder5 setNetAmount(ActiveOrHistoricCurrencyAndAmount netAmount) {
		this.netAmount = Objects.requireNonNull(netAmount);
		return this;
	}

	public Optional<RoundingDirection2Code> getRounding() {
		return rounding == null ? Optional.empty() : Optional.of(rounding);
	}

	public SubscriptionOrder5 setRounding(RoundingDirection2Code rounding) {
		this.rounding = rounding;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public SubscriptionOrder5 setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<ISODate> getCashSettlementDate() {
		return cashSettlementDate == null ? Optional.empty() : Optional.of(cashSettlementDate);
	}

	public SubscriptionOrder5 setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = cashSettlementDate;
		return this;
	}

	public Optional<DeliveryReceiptType2Code> getSettlementMethod() {
		return settlementMethod == null ? Optional.empty() : Optional.of(settlementMethod);
	}

	public SubscriptionOrder5 setSettlementMethod(DeliveryReceiptType2Code settlementMethod) {
		this.settlementMethod = settlementMethod;
		return this;
	}

	public Optional<IncomePreference1Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public SubscriptionOrder5 setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public InvestmentAccount21 getInvestmentAccountDetails() {
		return investmentAccountDetails;
	}

	public SubscriptionOrder5 setInvestmentAccountDetails(InvestmentAccount21 investmentAccountDetails) {
		this.investmentAccountDetails = Objects.requireNonNull(investmentAccountDetails);
		return this;
	}

	public Optional<ForeignExchangeTerms6> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? Optional.empty() : Optional.of(foreignExchangeDetails);
	}

	public SubscriptionOrder5 setForeignExchangeDetails(ForeignExchangeTerms6 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
		return this;
	}

	public Optional<Max35Text> getLetterIntentReference() {
		return letterIntentReference == null ? Optional.empty() : Optional.of(letterIntentReference);
	}

	public SubscriptionOrder5 setLetterIntentReference(Max35Text letterIntentReference) {
		this.letterIntentReference = letterIntentReference;
		return this;
	}

	public Optional<Max35Text> getAccumulationRightReference() {
		return accumulationRightReference == null ? Optional.empty() : Optional.of(accumulationRightReference);
	}

	public SubscriptionOrder5 setAccumulationRightReference(Max35Text accumulationRightReference) {
		this.accumulationRightReference = accumulationRightReference;
		return this;
	}

	public List<Charge17> getChargeDetails() {
		return chargeDetails == null ? chargeDetails = new ArrayList<>() : chargeDetails;
	}

	public SubscriptionOrder5 setChargeDetails(List<Charge17> chargeDetails) {
		this.chargeDetails = Objects.requireNonNull(chargeDetails);
		return this;
	}

	public List<Commission10> getCommissionDetails() {
		return commissionDetails == null ? commissionDetails = new ArrayList<>() : commissionDetails;
	}

	public SubscriptionOrder5 setCommissionDetails(List<Commission10> commissionDetails) {
		this.commissionDetails = Objects.requireNonNull(commissionDetails);
		return this;
	}

	public List<Tax16> getTaxDetails() {
		return taxDetails == null ? taxDetails = new ArrayList<>() : taxDetails;
	}

	public SubscriptionOrder5 setTaxDetails(List<Tax16> taxDetails) {
		this.taxDetails = Objects.requireNonNull(taxDetails);
		return this;
	}

	public Optional<FundSettlementParameters4> getSettlementAndCustodyDetails() {
		return settlementAndCustodyDetails == null ? Optional.empty() : Optional.of(settlementAndCustodyDetails);
	}

	public SubscriptionOrder5 setSettlementAndCustodyDetails(FundSettlementParameters4 settlementAndCustodyDetails) {
		this.settlementAndCustodyDetails = settlementAndCustodyDetails;
		return this;
	}

	public YesNoIndicator getPhysicalDeliveryIndicator() {
		return physicalDeliveryIndicator;
	}

	public SubscriptionOrder5 setPhysicalDeliveryIndicator(YesNoIndicator physicalDeliveryIndicator) {
		this.physicalDeliveryIndicator = Objects.requireNonNull(physicalDeliveryIndicator);
		return this;
	}

	public Optional<NameAndAddress4> getPhysicalDeliveryDetails() {
		return physicalDeliveryDetails == null ? Optional.empty() : Optional.of(physicalDeliveryDetails);
	}

	public SubscriptionOrder5 setPhysicalDeliveryDetails(NameAndAddress4 physicalDeliveryDetails) {
		this.physicalDeliveryDetails = physicalDeliveryDetails;
		return this;
	}

	public Optional<PaymentTransaction23> getCashSettlementDetails() {
		return cashSettlementDetails == null ? Optional.empty() : Optional.of(cashSettlementDetails);
	}

	public SubscriptionOrder5 setCashSettlementDetails(PaymentTransaction23 cashSettlementDetails) {
		this.cashSettlementDetails = cashSettlementDetails;
		return this;
	}

	public Optional<Max350Text> getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation == null ? Optional.empty() : Optional.of(nonStandardSettlementInformation);
	}

	public SubscriptionOrder5 setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
		return this;
	}

	public List<InvestmentFundsOrderBreakdown1> getStaffClientBreakdown() {
		return staffClientBreakdown == null ? staffClientBreakdown = new ArrayList<>() : staffClientBreakdown;
	}

	public SubscriptionOrder5 setStaffClientBreakdown(List<InvestmentFundsOrderBreakdown1> staffClientBreakdown) {
		this.staffClientBreakdown = Objects.requireNonNull(staffClientBreakdown);
		return this;
	}

	public Optional<FinancialAdvice1Code> getFinancialAdvice() {
		return financialAdvice == null ? Optional.empty() : Optional.of(financialAdvice);
	}

	public SubscriptionOrder5 setFinancialAdvice(FinancialAdvice1Code financialAdvice) {
		this.financialAdvice = financialAdvice;
		return this;
	}

	public Optional<NegotiatedTrade1Code> getNegotiatedTrade() {
		return negotiatedTrade == null ? Optional.empty() : Optional.of(negotiatedTrade);
	}

	public SubscriptionOrder5 setNegotiatedTrade(NegotiatedTrade1Code negotiatedTrade) {
		this.negotiatedTrade = negotiatedTrade;
		return this;
	}

	public List<Intermediary8> getRelatedPartyDetails() {
		return relatedPartyDetails == null ? relatedPartyDetails = new ArrayList<>() : relatedPartyDetails;
	}

	public SubscriptionOrder5 setRelatedPartyDetails(List<Intermediary8> relatedPartyDetails) {
		this.relatedPartyDetails = Objects.requireNonNull(relatedPartyDetails);
		return this;
	}

	public Optional<Equalisation1> getEqualisation() {
		return equalisation == null ? Optional.empty() : Optional.of(equalisation);
	}

	public SubscriptionOrder5 setEqualisation(Equalisation1 equalisation) {
		this.equalisation = equalisation;
		return this;
	}
}
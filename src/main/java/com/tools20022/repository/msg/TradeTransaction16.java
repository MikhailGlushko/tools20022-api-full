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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice;
import com.tools20022.repository.choice.SecuritiesTransactionPrice8Choice;
import com.tools20022.repository.choice.TradeConfirmation2Choice;
import com.tools20022.repository.codeset.PhysicalTransferType4Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details of trade transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmUniqueTradeIdentifier
 * TradeTransaction16.mmUniqueTradeIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmReportTrackingNumber
 * TradeTransaction16.mmReportTrackingNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmComplexTradeIdentification
 * TradeTransaction16.mmComplexTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmTradingVenue
 * TradeTransaction16.mmTradingVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmCompression
 * TradeTransaction16.mmCompression}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction16#mmPrice
 * TradeTransaction16.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmNotionalAmount
 * TradeTransaction16.mmNotionalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmPriceMultiplier
 * TradeTransaction16.mmPriceMultiplier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction16#mmQuantity
 * TradeTransaction16.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmUpFrontPayment
 * TradeTransaction16.mmUpFrontPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmDeliveryType
 * TradeTransaction16.mmDeliveryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmExecutionDateTime
 * TradeTransaction16.mmExecutionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmEffectiveDate
 * TradeTransaction16.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmMaturityDate
 * TradeTransaction16.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmTerminationDate
 * TradeTransaction16.mmTerminationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmSettlementDate
 * TradeTransaction16.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmMasterAgreement
 * TradeTransaction16.mmMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmTradeConfirmation
 * TradeTransaction16.mmTradeConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmTradeClearing
 * TradeTransaction16.mmTradeClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmInterestRate
 * TradeTransaction16.mmInterestRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction16#mmCurrency
 * TradeTransaction16.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction16#mmCommodity
 * TradeTransaction16.mmCommodity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction16#mmOption
 * TradeTransaction16.mmOption}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction16#mmCredit
 * TradeTransaction16.mmCredit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeTransaction16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details of trade transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeTransaction16", propOrder = {"uniqueTradeIdentifier", "reportTrackingNumber", "complexTradeIdentification", "tradingVenue", "compression", "price", "notionalAmount", "priceMultiplier", "quantity", "upFrontPayment",
		"deliveryType", "executionDateTime", "effectiveDate", "maturityDate", "terminationDate", "settlementDate", "masterAgreement", "tradeConfirmation", "tradeClearing", "interestRate", "currency", "commodity", "option", "credit"})
public class TradeTransaction16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UnqTradIdr", required = true)
	protected Max52Text uniqueTradeIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmUniqueTradeIdentifier
	 * TradeIdentification.mmUniqueTradeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnqTradIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueTradeIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique trade Identifier (UTI) as agreed with the counterparty."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction16, Max52Text> mmUniqueTradeIdentifier = new MMMessageAttribute<TradeTransaction16, Max52Text>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmUniqueTradeIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "UnqTradIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniqueTradeIdentifier";
			definition = "Unique trade Identifier (UTI) as agreed with the counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max52Text.mmObject();
		}

		@Override
		public Max52Text getValue(TradeTransaction16 obj) {
			return obj.getUniqueTradeIdentifier();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Max52Text value) {
			obj.setUniqueTradeIdentifier(value);
		}
	};
	@XmlElement(name = "RptTrckgNb")
	protected Max52Text reportTrackingNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptTrckgNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportTrackingNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique number to indicate a group of reports which relate to the same execution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction16, Optional<Max52Text>> mmReportTrackingNumber = new MMMessageAttribute<TradeTransaction16, Optional<Max52Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "RptTrckgNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportTrackingNumber";
			definition = "Unique number to indicate a group of reports which relate to the same execution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max52Text.mmObject();
		}

		@Override
		public Optional<Max52Text> getValue(TradeTransaction16 obj) {
			return obj.getReportTrackingNumber();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<Max52Text> value) {
			obj.setReportTrackingNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CmplxTradId")
	protected Max35Text complexTradeIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
	 * TradeIdentification.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmplxTradId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComplexTradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification, internal to the reporting firm to identify all the reports related to the same execution of a combination of financial instruments. The code must be unique for the firm for the group of reports for the execution.\r\n\r\nUsage: Field only applies when the instrument is complex.\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction16, Optional<Max35Text>> mmComplexTradeIdentification = new MMMessageAttribute<TradeTransaction16, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "CmplxTradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComplexTradeIdentification";
			definition = "Identification, internal to the reporting firm to identify all the reports related to the same execution of a combination of financial instruments. The code must be unique for the firm for the group of reports for the execution.\r\n\r\nUsage: Field only applies when the instrument is complex.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeTransaction16 obj) {
			return obj.getComplexTradeIdentification();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<Max35Text> value) {
			obj.setComplexTradeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgVn")
	protected MICIdentifier tradingVenue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
	 * OrganisationIdentification.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgVn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingVenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Venue of execution identified by a unique code for this venue. \r\nIn case of a contract concluded OTC, it has to be identified using specific MIC codes designating OTC transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction16, Optional<MICIdentifier>> mmTradingVenue = new MMMessageAttribute<TradeTransaction16, Optional<MICIdentifier>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "TradgVn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingVenue";
			definition = "Venue of execution identified by a unique code for this venue. \r\nIn case of a contract concluded OTC, it has to be identified using specific MIC codes designating OTC transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}

		@Override
		public Optional<MICIdentifier> getValue(TradeTransaction16 obj) {
			return obj.getTradingVenue();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<MICIdentifier> value) {
			obj.setTradingVenue(value.orElse(null));
		}
	};
	@XmlElement(name = "Cmprssn")
	protected TrueFalseIndicator compression;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmprssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compression"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the contract results from a compression operation or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction16, Optional<TrueFalseIndicator>> mmCompression = new MMMessageAttribute<TradeTransaction16, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "Cmprssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compression";
			definition = "Identifies whether the contract results from a compression operation or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(TradeTransaction16 obj) {
			return obj.getCompression();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<TrueFalseIndicator> value) {
			obj.setCompression(value.orElse(null));
		}
	};
	@XmlElement(name = "Pric")
	protected SecuritiesTransactionPrice8Choice price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice8Choice
	 * SecuritiesTransactionPrice8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
	 * SecuritiesTrade.mmTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the price per derivative excluding, where applicable, commission and accrued interest."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction16, Optional<SecuritiesTransactionPrice8Choice>> mmPrice = new MMMessageAssociationEnd<TradeTransaction16, Optional<SecuritiesTransactionPrice8Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Indicates the price per derivative excluding, where applicable, commission and accrued interest.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionPrice8Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesTransactionPrice8Choice> getValue(TradeTransaction16 obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<SecuritiesTransactionPrice8Choice> value) {
			obj.setPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "NtnlAmt")
	protected AmountAndDirection56 notionalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection56
	 * AmountAndDirection56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAmount
	 * SecuritiesTrade.mmTradeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference amount from which contractual payments are determined.\r\n\r\nUsage: In case of partial terminations, and amortisations and in case of contracts where the notional, due to the characteristics of the contract, varies over time, it shall reflect the remaining notional after the change took place."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction16, Optional<AmountAndDirection56>> mmNotionalAmount = new MMMessageAssociationEnd<TradeTransaction16, Optional<AmountAndDirection56>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "NtnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalAmount";
			definition = "Reference amount from which contractual payments are determined.\r\n\r\nUsage: In case of partial terminations, and amortisations and in case of contracts where the notional, due to the characteristics of the contract, varies over time, it shall reflect the remaining notional after the change took place.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection56.mmObject();
		}

		@Override
		public Optional<AmountAndDirection56> getValue(TradeTransaction16 obj) {
			return obj.getNotionalAmount();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<AmountAndDirection56> value) {
			obj.setNotionalAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PricMltplr")
	protected LongDecimalNumberFraction21 priceMultiplier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LongDecimalNumberFraction21
	 * LongDecimalNumberFraction21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmStrikeMultiplier
	 * Option.mmStrikeMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricMltplr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units of the underlying instrument represented by a single derivative contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction16, Optional<LongDecimalNumberFraction21>> mmPriceMultiplier = new MMMessageAttribute<TradeTransaction16, Optional<LongDecimalNumberFraction21>>() {
		{
			businessElementTrace_lazy = () -> Option.mmStrikeMultiplier;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "PricMltplr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceMultiplier";
			definition = "Number of units of the underlying instrument represented by a single derivative contract.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LongDecimalNumberFraction21.mmObject();
		}

		@Override
		public Optional<LongDecimalNumberFraction21> getValue(TradeTransaction16 obj) {
			return obj.getPriceMultiplier();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<LongDecimalNumberFraction21> value) {
			obj.setPriceMultiplier(value.orElse(null));
		}
	};
	@XmlElement(name = "Qty")
	protected FinancialInstrumentQuantity30Choice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice
	 * FinancialInstrumentQuantity30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeQuantity
	 * SecuritiesTrade.mmTradeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units of the financial instrument, that is, the nominal value."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction16, Optional<FinancialInstrumentQuantity30Choice>> mmQuantity = new MMMessageAssociationEnd<TradeTransaction16, Optional<FinancialInstrumentQuantity30Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Number of units of the financial instrument, that is, the nominal value.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity30Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity30Choice> getValue(TradeTransaction16 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<FinancialInstrumentQuantity30Choice> value) {
			obj.setQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "UpFrntPmt")
	protected AmountAndDirection56 upFrontPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection56
	 * AmountAndDirection56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpFrntPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpFrontPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money of any up-front payment the reporting counterparty made or received.\r\n\r\nUsage: The negative symbol to be used to indicate that the payment was made, not received."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction16, Optional<AmountAndDirection56>> mmUpFrontPayment = new MMMessageAssociationEnd<TradeTransaction16, Optional<AmountAndDirection56>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "UpFrntPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpFrontPayment";
			definition = "Amount of money of any up-front payment the reporting counterparty made or received.\r\n\r\nUsage: The negative symbol to be used to indicate that the payment was made, not received.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection56.mmObject();
		}

		@Override
		public Optional<AmountAndDirection56> getValue(TradeTransaction16 obj) {
			return obj.getUpFrontPayment();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<AmountAndDirection56> value) {
			obj.setUpFrontPayment(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryTp")
	protected PhysicalTransferType4Code deliveryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferType4Code
	 * PhysicalTransferType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmDeliveryType
	 * SecuritiesFinancingAgreement.mmDeliveryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument is settled physically or in cash or decided at expiration time by counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction16, Optional<PhysicalTransferType4Code>> mmDeliveryType = new MMMessageAttribute<TradeTransaction16, Optional<PhysicalTransferType4Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancingAgreement.mmDeliveryType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "DlvryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryType";
			definition = "Indicates whether the financial instrument is settled physically or in cash or decided at expiration time by counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PhysicalTransferType4Code.mmObject();
		}

		@Override
		public Optional<PhysicalTransferType4Code> getValue(TradeTransaction16 obj) {
			return obj.getDeliveryType();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<PhysicalTransferType4Code> value) {
			obj.setDeliveryType(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctnDtTm")
	protected ISODateTime executionDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date and time when the contract was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction16, Optional<ISODateTime>> mmExecutionDateTime = new MMMessageAttribute<TradeTransaction16, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "ExctnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionDateTime";
			definition = "Indicates the date and time when the contract was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(TradeTransaction16 obj) {
			return obj.getExecutionDateTime();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<ISODateTime> value) {
			obj.setExecutionDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "FctvDt")
	protected ISODate effectiveDate;
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmEffectiveDate
	 * Asset.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date when obligations under the contract come into effect."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction16, Optional<ISODate>> mmEffectiveDate = new MMMessageAttribute<TradeTransaction16, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmEffectiveDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Indicates the date when obligations under the contract come into effect.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TradeTransaction16 obj) {
			return obj.getEffectiveDate();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<ISODate> value) {
			obj.setEffectiveDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected ISODate maturityDate;
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the original date of expiry of the reported contract. \r\n\r\nUsage: \r\nAn early termination shall not be reported in this field.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction16, Optional<ISODate>> mmMaturityDate = new MMMessageAttribute<TradeTransaction16, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Indicates the original date of expiry of the reported contract. \r\n\r\nUsage: \r\nAn early termination shall not be reported in this field.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TradeTransaction16 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<ISODate> value) {
			obj.setMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TermntnDt", required = true)
	protected ISODate terminationDate;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationDateTime
	 * SecuritiesFinancing.mmTerminationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date in the case of an early termination of the reported contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction16, ISODate> mmTerminationDate = new MMMessageAttribute<TradeTransaction16, ISODate>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "TermntnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDate";
			definition = "Indicates the date in the case of an early termination of the reported contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(TradeTransaction16 obj) {
			return obj.getTerminationDate();
		}

		@Override
		public void setValue(TradeTransaction16 obj, ISODate value) {
			obj.setTerminationDate(value);
		}
	};
	@XmlElement(name = "SttlmDt")
	protected List<ISODate> settlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the date of settlement of the underlying."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeTransaction16, List<ISODate>> mmSettlementDate = new MMMessageAttribute<TradeTransaction16, List<ISODate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Indicates the date of settlement of the underlying.";
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public List<ISODate> getValue(TradeTransaction16 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(TradeTransaction16 obj, List<ISODate> value) {
			obj.setSettlementDate(value);
		}
	};
	@XmlElement(name = "MstrAgrmt")
	protected MasterAgreement2 masterAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MasterAgreement2
	 * MasterAgreement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmGoverningDocument
	 * Trade.mmGoverningDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the Master agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction16, Optional<MasterAgreement2>> mmMasterAgreement = new MMMessageAssociationEnd<TradeTransaction16, Optional<MasterAgreement2>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmGoverningDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "MstrAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterAgreement";
			definition = "Details related to the Master agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MasterAgreement2.mmObject();
		}

		@Override
		public Optional<MasterAgreement2> getValue(TradeTransaction16 obj) {
			return obj.getMasterAgreement();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<MasterAgreement2> value) {
			obj.setMasterAgreement(value.orElse(null));
		}
	};
	@XmlElement(name = "TradConf")
	protected TradeConfirmation2Choice tradeConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TradeConfirmation2Choice
	 * TradeConfirmation2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConfirmationStatus
	 * SecuritiesOrderStatus.mmConfirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on whether the contract was electronically confirmed, non-electronically confirmed or remains unconfirmed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction16, Optional<TradeConfirmation2Choice>> mmTradeConfirmation = new MMMessageAssociationEnd<TradeTransaction16, Optional<TradeConfirmation2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConfirmationStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "TradConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeConfirmation";
			definition = "Provides information on whether the contract was electronically confirmed, non-electronically confirmed or remains unconfirmed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeConfirmation2Choice.mmObject();
		}

		@Override
		public Optional<TradeConfirmation2Choice> getValue(TradeTransaction16 obj) {
			return obj.getTradeConfirmation();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<TradeConfirmation2Choice> value) {
			obj.setTradeConfirmation(value.orElse(null));
		}
	};
	@XmlElement(name = "TradClr")
	protected TradeClearing2 tradeClearing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeClearing2
	 * TradeClearing2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing
	 * SecuritiesClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradClr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to clearing of the reported contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction16, Optional<TradeClearing2>> mmTradeClearing = new MMMessageAssociationEnd<TradeTransaction16, Optional<TradeClearing2>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesClearing.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "TradClr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeClearing";
			definition = "Information related to clearing of the reported contract.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeClearing2.mmObject();
		}

		@Override
		public Optional<TradeClearing2> getValue(TradeTransaction16 obj) {
			return obj.getTradeClearing();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<TradeClearing2> value) {
			obj.setTradeClearing(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstRate")
	protected InterestRateLegs5 interestRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InterestRateLegs5
	 * InterestRateLegs5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to interest rate asset class type."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction16, Optional<InterestRateLegs5>> mmInterestRate = new MMMessageAssociationEnd<TradeTransaction16, Optional<InterestRateLegs5>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Information related to interest rate asset class type.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestRateLegs5.mmObject();
		}

		@Override
		public Optional<InterestRateLegs5> getValue(TradeTransaction16 obj) {
			return obj.getInterestRate();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<InterestRateLegs5> value) {
			obj.setInterestRate(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected CurrencyExchange11 currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyExchange11
	 * CurrencyExchange11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
	 * AssetHolding.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to currency asset class type."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction16, Optional<CurrencyExchange11>> mmCurrency = new MMMessageAssociationEnd<TradeTransaction16, Optional<CurrencyExchange11>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Information related to currency asset class type.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyExchange11.mmObject();
		}

		@Override
		public Optional<CurrencyExchange11> getValue(TradeTransaction16 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<CurrencyExchange11> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "Cmmdty")
	protected AssetClassCommodity1 commodity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AssetClassCommodity1
	 * AssetClassCommodity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmAsset Trade.mmAsset}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmmdty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to commodity asset class type."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction16, Optional<AssetClassCommodity1>> mmCommodity = new MMMessageAssociationEnd<TradeTransaction16, Optional<AssetClassCommodity1>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmAsset;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "Cmmdty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			definition = "Information related to commodity asset class type.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AssetClassCommodity1.mmObject();
		}

		@Override
		public Optional<AssetClassCommodity1> getValue(TradeTransaction16 obj) {
			return obj.getCommodity();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<AssetClassCommodity1> value) {
			obj.setCommodity(value.orElse(null));
		}
	};
	@XmlElement(name = "Optn")
	protected OptionOrSwaption6 option;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OptionOrSwaption6
	 * OptionOrSwaption6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Optn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to credit derivative asset class type."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction16, Optional<OptionOrSwaption6>> mmOption = new MMMessageAssociationEnd<TradeTransaction16, Optional<OptionOrSwaption6>>() {
		{
			businessComponentTrace_lazy = () -> Option.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "Optn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Information related to credit derivative asset class type.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionOrSwaption6.mmObject();
		}

		@Override
		public Optional<OptionOrSwaption6> getValue(TradeTransaction16 obj) {
			return obj.getOption();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<OptionOrSwaption6> value) {
			obj.setOption(value.orElse(null));
		}
	};
	@XmlElement(name = "Cdt")
	protected CreditDerivative3 credit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CreditDerivative3
	 * CreditDerivative3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmDerivative
	 * Asset.mmDerivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16
	 * TradeTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to credit derivative asset class type."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransaction16, Optional<CreditDerivative3>> mmCredit = new MMMessageAssociationEnd<TradeTransaction16, Optional<CreditDerivative3>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmDerivative;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransaction16.mmObject();
			isDerived = false;
			xmlTag = "Cdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			definition = "Information related to credit derivative asset class type.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CreditDerivative3.mmObject();
		}

		@Override
		public Optional<CreditDerivative3> getValue(TradeTransaction16 obj) {
			return obj.getCredit();
		}

		@Override
		public void setValue(TradeTransaction16 obj, Optional<CreditDerivative3> value) {
			obj.setCredit(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeTransaction16.mmUniqueTradeIdentifier, com.tools20022.repository.msg.TradeTransaction16.mmReportTrackingNumber,
						com.tools20022.repository.msg.TradeTransaction16.mmComplexTradeIdentification, com.tools20022.repository.msg.TradeTransaction16.mmTradingVenue, com.tools20022.repository.msg.TradeTransaction16.mmCompression,
						com.tools20022.repository.msg.TradeTransaction16.mmPrice, com.tools20022.repository.msg.TradeTransaction16.mmNotionalAmount, com.tools20022.repository.msg.TradeTransaction16.mmPriceMultiplier,
						com.tools20022.repository.msg.TradeTransaction16.mmQuantity, com.tools20022.repository.msg.TradeTransaction16.mmUpFrontPayment, com.tools20022.repository.msg.TradeTransaction16.mmDeliveryType,
						com.tools20022.repository.msg.TradeTransaction16.mmExecutionDateTime, com.tools20022.repository.msg.TradeTransaction16.mmEffectiveDate, com.tools20022.repository.msg.TradeTransaction16.mmMaturityDate,
						com.tools20022.repository.msg.TradeTransaction16.mmTerminationDate, com.tools20022.repository.msg.TradeTransaction16.mmSettlementDate, com.tools20022.repository.msg.TradeTransaction16.mmMasterAgreement,
						com.tools20022.repository.msg.TradeTransaction16.mmTradeConfirmation, com.tools20022.repository.msg.TradeTransaction16.mmTradeClearing, com.tools20022.repository.msg.TradeTransaction16.mmInterestRate,
						com.tools20022.repository.msg.TradeTransaction16.mmCurrency, com.tools20022.repository.msg.TradeTransaction16.mmCommodity, com.tools20022.repository.msg.TradeTransaction16.mmOption,
						com.tools20022.repository.msg.TradeTransaction16.mmCredit);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeTransaction16";
				definition = "Provides details of trade transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max52Text getUniqueTradeIdentifier() {
		return uniqueTradeIdentifier;
	}

	public TradeTransaction16 setUniqueTradeIdentifier(Max52Text uniqueTradeIdentifier) {
		this.uniqueTradeIdentifier = Objects.requireNonNull(uniqueTradeIdentifier);
		return this;
	}

	public Optional<Max52Text> getReportTrackingNumber() {
		return reportTrackingNumber == null ? Optional.empty() : Optional.of(reportTrackingNumber);
	}

	public TradeTransaction16 setReportTrackingNumber(Max52Text reportTrackingNumber) {
		this.reportTrackingNumber = reportTrackingNumber;
		return this;
	}

	public Optional<Max35Text> getComplexTradeIdentification() {
		return complexTradeIdentification == null ? Optional.empty() : Optional.of(complexTradeIdentification);
	}

	public TradeTransaction16 setComplexTradeIdentification(Max35Text complexTradeIdentification) {
		this.complexTradeIdentification = complexTradeIdentification;
		return this;
	}

	public Optional<MICIdentifier> getTradingVenue() {
		return tradingVenue == null ? Optional.empty() : Optional.of(tradingVenue);
	}

	public TradeTransaction16 setTradingVenue(MICIdentifier tradingVenue) {
		this.tradingVenue = tradingVenue;
		return this;
	}

	public Optional<TrueFalseIndicator> getCompression() {
		return compression == null ? Optional.empty() : Optional.of(compression);
	}

	public TradeTransaction16 setCompression(TrueFalseIndicator compression) {
		this.compression = compression;
		return this;
	}

	public Optional<SecuritiesTransactionPrice8Choice> getPrice() {
		return price == null ? Optional.empty() : Optional.of(price);
	}

	public TradeTransaction16 setPrice(SecuritiesTransactionPrice8Choice price) {
		this.price = price;
		return this;
	}

	public Optional<AmountAndDirection56> getNotionalAmount() {
		return notionalAmount == null ? Optional.empty() : Optional.of(notionalAmount);
	}

	public TradeTransaction16 setNotionalAmount(AmountAndDirection56 notionalAmount) {
		this.notionalAmount = notionalAmount;
		return this;
	}

	public Optional<LongDecimalNumberFraction21> getPriceMultiplier() {
		return priceMultiplier == null ? Optional.empty() : Optional.of(priceMultiplier);
	}

	public TradeTransaction16 setPriceMultiplier(LongDecimalNumberFraction21 priceMultiplier) {
		this.priceMultiplier = priceMultiplier;
		return this;
	}

	public Optional<FinancialInstrumentQuantity30Choice> getQuantity() {
		return quantity == null ? Optional.empty() : Optional.of(quantity);
	}

	public TradeTransaction16 setQuantity(FinancialInstrumentQuantity30Choice quantity) {
		this.quantity = quantity;
		return this;
	}

	public Optional<AmountAndDirection56> getUpFrontPayment() {
		return upFrontPayment == null ? Optional.empty() : Optional.of(upFrontPayment);
	}

	public TradeTransaction16 setUpFrontPayment(AmountAndDirection56 upFrontPayment) {
		this.upFrontPayment = upFrontPayment;
		return this;
	}

	public Optional<PhysicalTransferType4Code> getDeliveryType() {
		return deliveryType == null ? Optional.empty() : Optional.of(deliveryType);
	}

	public TradeTransaction16 setDeliveryType(PhysicalTransferType4Code deliveryType) {
		this.deliveryType = deliveryType;
		return this;
	}

	public Optional<ISODateTime> getExecutionDateTime() {
		return executionDateTime == null ? Optional.empty() : Optional.of(executionDateTime);
	}

	public TradeTransaction16 setExecutionDateTime(ISODateTime executionDateTime) {
		this.executionDateTime = executionDateTime;
		return this;
	}

	public Optional<ISODate> getEffectiveDate() {
		return effectiveDate == null ? Optional.empty() : Optional.of(effectiveDate);
	}

	public TradeTransaction16 setEffectiveDate(ISODate effectiveDate) {
		this.effectiveDate = effectiveDate;
		return this;
	}

	public Optional<ISODate> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public TradeTransaction16 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public ISODate getTerminationDate() {
		return terminationDate;
	}

	public TradeTransaction16 setTerminationDate(ISODate terminationDate) {
		this.terminationDate = Objects.requireNonNull(terminationDate);
		return this;
	}

	public List<ISODate> getSettlementDate() {
		return settlementDate == null ? settlementDate = new ArrayList<>() : settlementDate;
	}

	public TradeTransaction16 setSettlementDate(List<ISODate> settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public Optional<MasterAgreement2> getMasterAgreement() {
		return masterAgreement == null ? Optional.empty() : Optional.of(masterAgreement);
	}

	public TradeTransaction16 setMasterAgreement(MasterAgreement2 masterAgreement) {
		this.masterAgreement = masterAgreement;
		return this;
	}

	public Optional<TradeConfirmation2Choice> getTradeConfirmation() {
		return tradeConfirmation == null ? Optional.empty() : Optional.of(tradeConfirmation);
	}

	public TradeTransaction16 setTradeConfirmation(TradeConfirmation2Choice tradeConfirmation) {
		this.tradeConfirmation = tradeConfirmation;
		return this;
	}

	public Optional<TradeClearing2> getTradeClearing() {
		return tradeClearing == null ? Optional.empty() : Optional.of(tradeClearing);
	}

	public TradeTransaction16 setTradeClearing(TradeClearing2 tradeClearing) {
		this.tradeClearing = tradeClearing;
		return this;
	}

	public Optional<InterestRateLegs5> getInterestRate() {
		return interestRate == null ? Optional.empty() : Optional.of(interestRate);
	}

	public TradeTransaction16 setInterestRate(InterestRateLegs5 interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public Optional<CurrencyExchange11> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public TradeTransaction16 setCurrency(CurrencyExchange11 currency) {
		this.currency = currency;
		return this;
	}

	public Optional<AssetClassCommodity1> getCommodity() {
		return commodity == null ? Optional.empty() : Optional.of(commodity);
	}

	public TradeTransaction16 setCommodity(AssetClassCommodity1 commodity) {
		this.commodity = commodity;
		return this;
	}

	public Optional<OptionOrSwaption6> getOption() {
		return option == null ? Optional.empty() : Optional.of(option);
	}

	public TradeTransaction16 setOption(OptionOrSwaption6 option) {
		this.option = option;
		return this;
	}

	public Optional<CreditDerivative3> getCredit() {
		return credit == null ? Optional.empty() : Optional.of(credit);
	}

	public TradeTransaction16 setCredit(CreditDerivative3 credit) {
		this.credit = credit;
		return this;
	}
}
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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
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
 * Provides the details of the update(s) for the settlement transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails32.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmLinkages
 * SecuritiesSettlementTransactionDetails32.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmTradeDetails
 * SecuritiesSettlementTransactionDetails32.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionDetails32.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails32.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails32.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionDetails32.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails32.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails32.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmCashParties
 * SecuritiesSettlementTransactionDetails32.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmSettlementAmount
 * SecuritiesSettlementTransactionDetails32.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmOtherAmounts
 * SecuritiesSettlementTransactionDetails32.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmOtherBusinessParties
 * SecuritiesSettlementTransactionDetails32.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionDetails32.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32#mmSupplementaryData
 * SecuritiesSettlementTransactionDetails32.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionDetails32"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details of the update(s) for the settlement transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26
 * SecuritiesSettlementTransactionDetails26}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionDetails32", propOrder = {"settlementTypeAndAdditionalParameters", "linkages", "tradeDetails", "financialInstrumentAttributes", "quantityAndAccountDetails", "settlementParameters",
		"standingSettlementInstructionDetails", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "settlementAmount", "otherAmounts", "otherBusinessParties", "additionalPhysicalOrRegistrationDetails",
		"supplementaryData"})
public class SecuritiesSettlementTransactionDetails32 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttlmTpAndAddtlParams")
	protected SettlementTypeAndAdditionalParameters13 settlementTypeAndAdditionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters13
	 * SettlementTypeAndAdditionalParameters13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTpAndAddtlParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTypeAndAdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides settlement type and identification information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmSettlementTypeAndAdditionalParameters
	 * SecuritiesSettlementTransactionDetails26.
	 * mmSettlementTypeAndAdditionalParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<SettlementTypeAndAdditionalParameters13>> mmSettlementTypeAndAdditionalParameters = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<SettlementTypeAndAdditionalParameters13>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "SttlmTpAndAddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTypeAndAdditionalParameters";
			definition = "Provides settlement type and identification information.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmSettlementTypeAndAdditionalParameters;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndAdditionalParameters13.mmObject();
		}

		@Override
		public Optional<SettlementTypeAndAdditionalParameters13> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getSettlementTypeAndAdditionalParameters();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, Optional<SettlementTypeAndAdditionalParameters13> value) {
			obj.setSettlementTypeAndAdditionalParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "Lnkgs")
	protected List<Linkages38> linkages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Linkages38 Linkages38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link to another transaction that must be processed after, before or at the same time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmLinkages
	 * SecuritiesSettlementTransactionDetails26.mmLinkages}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, List<Linkages38>> mmLinkages = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, List<Linkages38>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction that must be processed after, before or at the same time.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmLinkages;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Linkages38.mmObject();
		}

		@Override
		public List<Linkages38> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getLinkages();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, List<Linkages38> value) {
			obj.setLinkages(value);
		}
	};
	@XmlElement(name = "TradDtls")
	protected SecuritiesTradeDetails78 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78
	 * SecuritiesTradeDetails78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
	 * SecuritiesTradeExecution.mmRelatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmTradeDetails
	 * SecuritiesSettlementTransactionDetails26.mmTradeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<SecuritiesTradeDetails78>> mmTradeDetails = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<SecuritiesTradeDetails78>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmRelatedTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the trade.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmTradeDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesTradeDetails78.mmObject();
		}

		@Override
		public Optional<SecuritiesTradeDetails78> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getTradeDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, Optional<SecuritiesTradeDetails78> value) {
			obj.setTradeDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes91 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91
	 * FinancialInstrumentAttributes91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecurity
	 * SecuritiesSettlement.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Attributes defining a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionDetails26.mmFinancialInstrumentAttributes}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<FinancialInstrumentAttributes91>> mmFinancialInstrumentAttributes = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<FinancialInstrumentAttributes91>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Attributes defining a financial instrument.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmFinancialInstrumentAttributes;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes91.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes91> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, Optional<FinancialInstrumentAttributes91> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyAndAcctDtls")
	protected QuantityAndAccount66 quantityAndAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityAndAccount66
	 * QuantityAndAccount66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyAndAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityAndAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the account and quantity involved in the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmQuantityAndAccountDetails
	 * SecuritiesSettlementTransactionDetails26.mmQuantityAndAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<QuantityAndAccount66>> mmQuantityAndAccountDetails = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<QuantityAndAccount66>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmQuantityAndAccountDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QuantityAndAccount66.mmObject();
		}

		@Override
		public Optional<QuantityAndAccount66> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getQuantityAndAccountDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, Optional<QuantityAndAccount66> value) {
			obj.setQuantityAndAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmParams")
	protected SettlementDetails146 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmSettlementParameters
	 * SecuritiesSettlementTransactionDetails26.mmSettlementParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<SettlementDetails146>> mmSettlementParameters = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<SettlementDetails146>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmSettlementParameters;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementDetails146.mmObject();
		}

		@Override
		public Optional<SettlementDetails146> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getSettlementParameters();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, Optional<SettlementDetails146> value) {
			obj.setSettlementParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "StgSttlmInstrDtls")
	protected StandingSettlementInstruction14 standingSettlementInstructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction14
	 * StandingSettlementInstruction14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
	 * Settlement.mmStandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgSttlmInstrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionDetails26.
	 * mmStandingSettlementInstructionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<StandingSettlementInstruction14>> mmStandingSettlementInstructionDetails = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<StandingSettlementInstruction14>>() {
		{
			businessElementTrace_lazy = () -> Settlement.mmStandingSettlementInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "StgSttlmInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructionDetails";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmStandingSettlementInstructionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StandingSettlementInstruction14.mmObject();
		}

		@Override
		public Optional<StandingSettlementInstruction14> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getStandingSettlementInstructionDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, Optional<StandingSettlementInstruction14> value) {
			obj.setStandingSettlementInstructionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties63 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties63
	 * SettlementParties63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmDeliveringSettlementParties
	 * SecuritiesSettlementTransactionDetails26.mmDeliveringSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<SettlementParties63>> mmDeliveringSettlementParties = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<SettlementParties63>>() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmDeliveringSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties63.mmObject();
		}

		@Override
		public Optional<SettlementParties63> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, Optional<SettlementParties63> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties63 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties63
	 * SettlementParties63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmReceivingSettlementParties
	 * SecuritiesSettlementTransactionDetails26.mmReceivingSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<SettlementParties63>> mmReceivingSettlementParties = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<SettlementParties63>>() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmReceivingSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties63.mmObject();
		}

		@Override
		public Optional<SettlementParties63> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, Optional<SettlementParties63> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties26 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashParties26
	 * CashParties26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash parties involved in the transaction if different for the securities settlement parties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmCashParties
	 * SecuritiesSettlementTransactionDetails26.mmCashParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<CashParties26>> mmCashParties = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<CashParties26>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmCashParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashParties26.mmObject();
		}

		@Override
		public Optional<CashParties26> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, Optional<CashParties26> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected AmountAndDirection89 settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection89
	 * AmountAndDirection89}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmSettlementAmount
	 * SecuritiesSettlementTransactionDetails26.mmSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<AmountAndDirection89>> mmSettlementAmount = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<AmountAndDirection89>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection89.mmObject();
		}

		@Override
		public Optional<AmountAndDirection89> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, Optional<AmountAndDirection89> value) {
			obj.setSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrAmts")
	protected OtherAmounts39 otherAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherAmounts39
	 * OtherAmounts39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other amounts than the settlement amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmOtherAmounts
	 * SecuritiesSettlementTransactionDetails26.mmOtherAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<OtherAmounts39>> mmOtherAmounts = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<OtherAmounts39>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmOtherAmounts;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherAmounts39.mmObject();
		}

		@Override
		public Optional<OtherAmounts39> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getOtherAmounts();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, Optional<OtherAmounts39> value) {
			obj.setOtherAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties27 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherParties27
	 * OtherParties27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other business parties relevant to the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmOtherBusinessParties
	 * SecuritiesSettlementTransactionDetails26.mmOtherBusinessParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<OtherParties27>> mmOtherBusinessParties = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<OtherParties27>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmOtherBusinessParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherParties27.mmObject();
		}

		@Override
		public Optional<OtherParties27> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, Optional<OtherParties27> value) {
			obj.setOtherBusinessParties(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlPhysOrRegnDtls")
	protected RegistrationParameters6 additionalPhysicalOrRegistrationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters6
	 * RegistrationParameters6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistration
	 * Security.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPhysOrRegnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information required for the registration or physical settlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionDetails26.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<RegistrationParameters6>> mmAdditionalPhysicalOrRegistrationDetails = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, Optional<RegistrationParameters6>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistration;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "AddtlPhysOrRegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetails";
			definition = "Provides information required for the registration or physical settlement.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmAdditionalPhysicalOrRegistrationDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RegistrationParameters6.mmObject();
		}

		@Override
		public Optional<RegistrationParameters6> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getAdditionalPhysicalOrRegistrationDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, Optional<RegistrationParameters6> value) {
			obj.setAdditionalPhysicalOrRegistrationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32
	 * SecuritiesSettlementTransactionDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmSupplementaryData
	 * SecuritiesSettlementTransactionDetails26.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<SecuritiesSettlementTransactionDetails32, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmSupplementaryData;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesSettlementTransactionDetails32 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionDetails32 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmLinkages, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmTradeDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmQuantityAndAccountDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmStandingSettlementInstructionDetails,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmCashParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmSettlementAmount,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmOtherAmounts, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmOtherBusinessParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmAdditionalPhysicalOrRegistrationDetails, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails32.mmSupplementaryData);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionDetails32";
				definition = "Provides the details of the update(s) for the settlement transaction.";
				previousVersion_lazy = () -> SecuritiesSettlementTransactionDetails26.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SettlementTypeAndAdditionalParameters13> getSettlementTypeAndAdditionalParameters() {
		return settlementTypeAndAdditionalParameters == null ? Optional.empty() : Optional.of(settlementTypeAndAdditionalParameters);
	}

	public SecuritiesSettlementTransactionDetails32 setSettlementTypeAndAdditionalParameters(SettlementTypeAndAdditionalParameters13 settlementTypeAndAdditionalParameters) {
		this.settlementTypeAndAdditionalParameters = settlementTypeAndAdditionalParameters;
		return this;
	}

	public List<Linkages38> getLinkages() {
		return linkages == null ? linkages = new ArrayList<>() : linkages;
	}

	public SecuritiesSettlementTransactionDetails32 setLinkages(List<Linkages38> linkages) {
		this.linkages = Objects.requireNonNull(linkages);
		return this;
	}

	public Optional<SecuritiesTradeDetails78> getTradeDetails() {
		return tradeDetails == null ? Optional.empty() : Optional.of(tradeDetails);
	}

	public SecuritiesSettlementTransactionDetails32 setTradeDetails(SecuritiesTradeDetails78 tradeDetails) {
		this.tradeDetails = tradeDetails;
		return this;
	}

	public Optional<FinancialInstrumentAttributes91> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesSettlementTransactionDetails32 setFinancialInstrumentAttributes(FinancialInstrumentAttributes91 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public Optional<QuantityAndAccount66> getQuantityAndAccountDetails() {
		return quantityAndAccountDetails == null ? Optional.empty() : Optional.of(quantityAndAccountDetails);
	}

	public SecuritiesSettlementTransactionDetails32 setQuantityAndAccountDetails(QuantityAndAccount66 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = quantityAndAccountDetails;
		return this;
	}

	public Optional<SettlementDetails146> getSettlementParameters() {
		return settlementParameters == null ? Optional.empty() : Optional.of(settlementParameters);
	}

	public SecuritiesSettlementTransactionDetails32 setSettlementParameters(SettlementDetails146 settlementParameters) {
		this.settlementParameters = settlementParameters;
		return this;
	}

	public Optional<StandingSettlementInstruction14> getStandingSettlementInstructionDetails() {
		return standingSettlementInstructionDetails == null ? Optional.empty() : Optional.of(standingSettlementInstructionDetails);
	}

	public SecuritiesSettlementTransactionDetails32 setStandingSettlementInstructionDetails(StandingSettlementInstruction14 standingSettlementInstructionDetails) {
		this.standingSettlementInstructionDetails = standingSettlementInstructionDetails;
		return this;
	}

	public Optional<SettlementParties63> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesSettlementTransactionDetails32 setDeliveringSettlementParties(SettlementParties63 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties63> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesSettlementTransactionDetails32 setReceivingSettlementParties(SettlementParties63 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<CashParties26> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public SecuritiesSettlementTransactionDetails32 setCashParties(CashParties26 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<AmountAndDirection89> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public SecuritiesSettlementTransactionDetails32 setSettlementAmount(AmountAndDirection89 settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<OtherAmounts39> getOtherAmounts() {
		return otherAmounts == null ? Optional.empty() : Optional.of(otherAmounts);
	}

	public SecuritiesSettlementTransactionDetails32 setOtherAmounts(OtherAmounts39 otherAmounts) {
		this.otherAmounts = otherAmounts;
		return this;
	}

	public Optional<OtherParties27> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesSettlementTransactionDetails32 setOtherBusinessParties(OtherParties27 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public Optional<RegistrationParameters6> getAdditionalPhysicalOrRegistrationDetails() {
		return additionalPhysicalOrRegistrationDetails == null ? Optional.empty() : Optional.of(additionalPhysicalOrRegistrationDetails);
	}

	public SecuritiesSettlementTransactionDetails32 setAdditionalPhysicalOrRegistrationDetails(RegistrationParameters6 additionalPhysicalOrRegistrationDetails) {
		this.additionalPhysicalOrRegistrationDetails = additionalPhysicalOrRegistrationDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesSettlementTransactionDetails32 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}
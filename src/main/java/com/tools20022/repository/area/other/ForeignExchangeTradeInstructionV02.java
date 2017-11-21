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

package com.tools20022.repository.area.other;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.OtherMessages;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * Scope <br>
 * The ForeignExchangeTradeInstruction message is sent by a participant to a
 * central settlement system to notify the creation of the foreign exchange
 * trade agreed by both trading parties. <br>
 * Usage <br>
 * The ForeignExchangeTradeInstruction message is sent from a participant to a
 * central settlement system to advise of the creation of a foreign exchange
 * trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} = {@linkplain com.tools20022.repository.area.OtherMessages
 * OtherMessages}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FXTradInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmTradeInformation
 * ForeignExchangeTradeInstructionV02.mmTradeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmTradingSideIdentification
 * ForeignExchangeTradeInstructionV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmCounterpartySideIdentification
 * ForeignExchangeTradeInstructionV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmTradeAmounts
 * ForeignExchangeTradeInstructionV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmAgreedRate
 * ForeignExchangeTradeInstructionV02.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmTradingSideSettlementInstructions
 * ForeignExchangeTradeInstructionV02.mmTradingSideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmCounterpartySideSettlementInstructions
 * ForeignExchangeTradeInstructionV02.mmCounterpartySideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmOptionalGeneralInformation
 * ForeignExchangeTradeInstructionV02.mmOptionalGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmRegulatoryReporting
 * ForeignExchangeTradeInstructionV02.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmSupplementaryData
 * ForeignExchangeTradeInstructionV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.014.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeInstructionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\r\nThe ForeignExchangeTradeInstruction message is sent by a participant to a central settlement system to notify the creation of the foreign exchange trade agreed by both trading parties.\r\r\nUsage\r\r\nThe ForeignExchangeTradeInstruction message is sent from a participant to a central settlement system to advise of the creation of a foreign exchange trade."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ForeignExchangeTradeInstructionV02", propOrder = {"tradeInformation", "tradingSideIdentification", "counterpartySideIdentification", "tradeAmounts", "agreedRate", "tradingSideSettlementInstructions",
		"counterpartySideSettlementInstructions", "optionalGeneralInformation", "regulatoryReporting", "supplementaryData"})
public class ForeignExchangeTradeInstructionV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected TradeAgreement7 tradeInformation;
	/**
	 * General information related to the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeAgreement7
	 * TradeAgreement7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information related to the trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeInformation";
			definition = "General information related to the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeAgreement7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeInstructionV02.class.getMethod("getTradeInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradePartyIdentification6 tradingSideIdentification;
	/**
	 * Party(ies) on the trading side of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification6
	 * TradePartyIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party(ies) on the trading side of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradingSideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Party(ies) on the trading side of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeInstructionV02.class.getMethod("getTradingSideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradePartyIdentification6 counterpartySideIdentification;
	/**
	 * Party(ies) on the counterparty side of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification6
	 * TradePartyIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party(ies) on the counterparty side of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCounterpartySideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Party(ies) on the counterparty side of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeInstructionV02.class.getMethod("getCounterpartySideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AmountsAndValueDate1 tradeAmounts;
	/**
	 * Amounts of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1
	 * AmountsAndValueDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amounts of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmounts";
			definition = "Amounts of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountsAndValueDate1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeInstructionV02.class.getMethod("getTradeAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AgreedRate1 agreedRate;
	/**
	 * Exchange rate as agreed by the traders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AgreedRate1
	 * AgreedRate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange rate as agreed by the traders."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgreedRate = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgrdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedRate";
			definition = "Exchange rate as agreed by the traders.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AgreedRate1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeInstructionV02.class.getMethod("getAgreedRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementParties29 tradingSideSettlementInstructions;
	/**
	 * Settlement instructions for the amounts received by the trading side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties29
	 * SettlementParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdSttlmInstrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement instructions for the amounts received by the trading side."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradingSideSettlementInstructions = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradgSdSttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideSettlementInstructions";
			definition = "Settlement instructions for the amounts received by the trading side.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties29.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeInstructionV02.class.getMethod("getTradingSideSettlementInstructions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementParties29 counterpartySideSettlementInstructions;
	/**
	 * Settlement instructions for the amounts received by the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties29
	 * SettlementParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySdSttlmInstrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySideSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement instructions for the amounts received by the counterparty."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCounterpartySideSettlementInstructions = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrPtySdSttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideSettlementInstructions";
			definition = "Settlement instructions for the amounts received by the counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties29.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeInstructionV02.class.getMethod("getCounterpartySideSettlementInstructions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected GeneralInformation4 optionalGeneralInformation;
	/**
	 * Specifies whether the trade is a block or an individual trade. It also
	 * contains supplementary information such as free format information,
	 * broker's identification, dealing branches and references.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4
	 * GeneralInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnlGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionalGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the trade is a block or an individual trade. It also contains supplementary information such as free format information, broker's identification, dealing branches and references."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOptionalGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "OptnlGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionalGeneralInformation";
			definition = "Specifies whether the trade is a block or an individual trade. It also contains supplementary information such as free format information, broker's identification, dealing branches and references.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GeneralInformation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeInstructionV02.class.getMethod("getOptionalGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RegulatoryReporting1 regulatoryReporting;
	/**
	 * This is information that is to be provided to trade repositories in the
	 * context of the regulatory standards around OTC derivatives, central
	 * counterparties and trade repositories.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryRptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This is information that is to be provided to trade repositories in the context of the regulatory standards around OTC derivatives, central counterparties and trade repositories."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRegulatoryReporting = new MMMessageBuildingBlock() {
		{
			xmlTag = "RgltryRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryReporting";
			definition = "This is information that is to be provided to trade repositories in the context of the regulatory standards around OTC derivatives, central counterparties and trade repositories.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegulatoryReporting1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeInstructionV02.class.getMethod("getRegulatoryReporting", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeInstructionV02.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ForeignExchangeTradeInstructionV02";
				definition = "Scope\r\r\nThe ForeignExchangeTradeInstruction message is sent by a participant to a central settlement system to notify the creation of the foreign exchange trade agreed by both trading parties.\r\r\nUsage\r\r\nThe ForeignExchangeTradeInstruction message is sent from a participant to a central settlement system to advise of the creation of a foreign exchange trade.";
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FXTradInstr";
				businessArea_lazy = () -> OtherMessages.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02.mmTradeInformation,
						com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02.mmTradingSideIdentification, com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02.mmCounterpartySideIdentification,
						com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02.mmTradeAmounts, com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02.mmAgreedRate,
						com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02.mmTradingSideSettlementInstructions,
						com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02.mmCounterpartySideSettlementInstructions, com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02.mmOptionalGeneralInformation,
						com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02.mmRegulatoryReporting, com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "014";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeInstructionV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TradInf", required = true)
	public TradeAgreement7 getTradeInformation() {
		return tradeInformation;
	}

	public void setTradeInformation(TradeAgreement7 tradeInformation) {
		this.tradeInformation = tradeInformation;
	}

	@XmlElement(name = "TradgSdId", required = true)
	public TradePartyIdentification6 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public void setTradingSideIdentification(TradePartyIdentification6 tradingSideIdentification) {
		this.tradingSideIdentification = tradingSideIdentification;
	}

	@XmlElement(name = "CtrPtySdId", required = true)
	public TradePartyIdentification6 getCounterpartySideIdentification() {
		return counterpartySideIdentification;
	}

	public void setCounterpartySideIdentification(TradePartyIdentification6 counterpartySideIdentification) {
		this.counterpartySideIdentification = counterpartySideIdentification;
	}

	@XmlElement(name = "TradAmts", required = true)
	public AmountsAndValueDate1 getTradeAmounts() {
		return tradeAmounts;
	}

	public void setTradeAmounts(AmountsAndValueDate1 tradeAmounts) {
		this.tradeAmounts = tradeAmounts;
	}

	@XmlElement(name = "AgrdRate", required = true)
	public AgreedRate1 getAgreedRate() {
		return agreedRate;
	}

	public void setAgreedRate(AgreedRate1 agreedRate) {
		this.agreedRate = agreedRate;
	}

	@XmlElement(name = "TradgSdSttlmInstrs")
	public SettlementParties29 getTradingSideSettlementInstructions() {
		return tradingSideSettlementInstructions;
	}

	public void setTradingSideSettlementInstructions(SettlementParties29 tradingSideSettlementInstructions) {
		this.tradingSideSettlementInstructions = tradingSideSettlementInstructions;
	}

	@XmlElement(name = "CtrPtySdSttlmInstrs")
	public SettlementParties29 getCounterpartySideSettlementInstructions() {
		return counterpartySideSettlementInstructions;
	}

	public void setCounterpartySideSettlementInstructions(SettlementParties29 counterpartySideSettlementInstructions) {
		this.counterpartySideSettlementInstructions = counterpartySideSettlementInstructions;
	}

	@XmlElement(name = "OptnlGnlInf")
	public GeneralInformation4 getOptionalGeneralInformation() {
		return optionalGeneralInformation;
	}

	public void setOptionalGeneralInformation(GeneralInformation4 optionalGeneralInformation) {
		this.optionalGeneralInformation = optionalGeneralInformation;
	}

	@XmlElement(name = "RgltryRptg")
	public RegulatoryReporting1 getRegulatoryReporting() {
		return regulatoryReporting;
	}

	public void setRegulatoryReporting(RegulatoryReporting1 regulatoryReporting) {
		this.regulatoryReporting = regulatoryReporting;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.014.02.02")
	static public class Document {
		@XmlElement(name = "FXTradInstr", required = true)
		public ForeignExchangeTradeInstructionV02 messageBody;
	}
}
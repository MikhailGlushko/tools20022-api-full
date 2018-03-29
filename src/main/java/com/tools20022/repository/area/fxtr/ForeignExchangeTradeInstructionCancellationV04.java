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

package com.tools20022.repository.area.fxtr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ForeignExchangeTradeLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion;
import com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017;
import com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope <br>
 * The ForeignExchangeTradeInstructionCancellation message is sent by a
 * participant to a central settlement system to notify the cancellation of the
 * foreign exchange trade previously confirmed by the sender. <br>
 * Usage <br>
 * The ForeignExchangeTradeInstructionCancellation message is sent from a
 * participant to a central settlement system to advise of the cancellation of a
 * previously sent notification. The "Related Reference" must be used to link it
 * to the previous notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmTradeInformation
 * ForeignExchangeTradeInstructionCancellationV04.mmTradeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmTradingSideIdentification
 * ForeignExchangeTradeInstructionCancellationV04.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmCounterpartySideIdentification
 * ForeignExchangeTradeInstructionCancellationV04.
 * mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmAgreedRate
 * ForeignExchangeTradeInstructionCancellationV04.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmNonDeliverableForwardConditions
 * ForeignExchangeTradeInstructionCancellationV04.
 * mmNonDeliverableForwardConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmTradingSideSettlementInstructions
 * ForeignExchangeTradeInstructionCancellationV04.
 * mmTradingSideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmCounterpartySideSettlementInstructions
 * ForeignExchangeTradeInstructionCancellationV04.
 * mmCounterpartySideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmOptionalGeneralInformation
 * ForeignExchangeTradeInstructionCancellationV04.mmOptionalGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmTradeAmounts
 * ForeignExchangeTradeInstructionCancellationV04.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmRegulatoryReporting
 * ForeignExchangeTradeInstructionCancellationV04.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmSupplementaryData
 * ForeignExchangeTradeInstructionCancellationV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion
 * PostTradeForeignExchangeISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017
 * PostTradeForeignExchangeMaintenance20162017}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement
 * PostTradeForeignExchangeMaintenance20162017andSupplement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FXTradInstrCxl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.016.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeInstructionCancellationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\r\nThe ForeignExchangeTradeInstructionCancellation message is sent by a participant to a central settlement system to notify the cancellation of the foreign exchange trade previously confirmed by the sender.\r\r\nUsage\r\r\nThe ForeignExchangeTradeInstructionCancellation message is sent from a participant to a central settlement system to advise of the cancellation of a previously sent notification. The \"Related Reference\" must be used to link it to the previous notification."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTradeInstructionCancellationV04", propOrder = {"tradeInformation", "tradingSideIdentification", "counterpartySideIdentification", "agreedRate", "nonDeliverableForwardConditions",
		"tradingSideSettlementInstructions", "counterpartySideSettlementInstructions", "optionalGeneralInformation", "tradeAmounts", "regulatoryReporting", "supplementaryData"})
public class ForeignExchangeTradeInstructionCancellationV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradInf", required = true)
	protected TradeAgreement15 tradeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement15
	 * TradeAgreement15}</li>
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, TradeAgreement15> mmTradeInformation = new MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, TradeAgreement15>() {
		{
			xmlTag = "TradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeInformation";
			definition = "General information related to the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeAgreement15.mmObject();
		}

		@Override
		public TradeAgreement15 getValue(ForeignExchangeTradeInstructionCancellationV04 obj) {
			return obj.getTradeInformation();
		}

		@Override
		public void setValue(ForeignExchangeTradeInstructionCancellationV04 obj, TradeAgreement15 value) {
			obj.setTradeInformation(value);
		}
	};
	@XmlElement(name = "TradgSdId", required = true)
	protected TradePartyIdentification6 tradingSideIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, TradePartyIdentification6> mmTradingSideIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, TradePartyIdentification6>() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Party(ies) on the trading side of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification6.mmObject();
		}

		@Override
		public TradePartyIdentification6 getValue(ForeignExchangeTradeInstructionCancellationV04 obj) {
			return obj.getTradingSideIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeInstructionCancellationV04 obj, TradePartyIdentification6 value) {
			obj.setTradingSideIdentification(value);
		}
	};
	@XmlElement(name = "CtrPtySdId", required = true)
	protected TradePartyIdentification6 counterpartySideIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, TradePartyIdentification6> mmCounterpartySideIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, TradePartyIdentification6>() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Party(ies) on the counterparty side of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification6.mmObject();
		}

		@Override
		public TradePartyIdentification6 getValue(ForeignExchangeTradeInstructionCancellationV04 obj) {
			return obj.getCounterpartySideIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeInstructionCancellationV04 obj, TradePartyIdentification6 value) {
			obj.setCounterpartySideIdentification(value);
		}
	};
	@XmlElement(name = "AgrdRate")
	protected AgreedRate3 agreedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AgreedRate3
	 * AgreedRate3}</li>
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, Optional<AgreedRate3>> mmAgreedRate = new MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, Optional<AgreedRate3>>() {
		{
			xmlTag = "AgrdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedRate";
			definition = "Exchange rate as agreed by the traders.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AgreedRate3.mmObject();
		}

		@Override
		public Optional<AgreedRate3> getValue(ForeignExchangeTradeInstructionCancellationV04 obj) {
			return obj.getAgreedRate();
		}

		@Override
		public void setValue(ForeignExchangeTradeInstructionCancellationV04 obj, Optional<AgreedRate3> value) {
			obj.setAgreedRate(value.orElse(null));
		}
	};
	@XmlElement(name = "NDFConds")
	protected NonDeliverableForwardConditions1 nonDeliverableForwardConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions1
	 * NonDeliverableForwardConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NDFConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDeliverableForwardConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions for a non deliverable opening or fixing confirmation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, Optional<NonDeliverableForwardConditions1>> mmNonDeliverableForwardConditions = new MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, Optional<NonDeliverableForwardConditions1>>() {
		{
			xmlTag = "NDFConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDeliverableForwardConditions";
			definition = "Specifies the conditions for a non deliverable opening or fixing confirmation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NonDeliverableForwardConditions1.mmObject();
		}

		@Override
		public Optional<NonDeliverableForwardConditions1> getValue(ForeignExchangeTradeInstructionCancellationV04 obj) {
			return obj.getNonDeliverableForwardConditions();
		}

		@Override
		public void setValue(ForeignExchangeTradeInstructionCancellationV04 obj, Optional<NonDeliverableForwardConditions1> value) {
			obj.setNonDeliverableForwardConditions(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgSdSttlmInstrs")
	protected SettlementParties29 tradingSideSettlementInstructions;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, Optional<SettlementParties29>> mmTradingSideSettlementInstructions = new MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, Optional<SettlementParties29>>() {
		{
			xmlTag = "TradgSdSttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideSettlementInstructions";
			definition = "Settlement instructions for the amounts received by the trading side.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties29.mmObject();
		}

		@Override
		public Optional<SettlementParties29> getValue(ForeignExchangeTradeInstructionCancellationV04 obj) {
			return obj.getTradingSideSettlementInstructions();
		}

		@Override
		public void setValue(ForeignExchangeTradeInstructionCancellationV04 obj, Optional<SettlementParties29> value) {
			obj.setTradingSideSettlementInstructions(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrPtySdSttlmInstrs")
	protected SettlementParties29 counterpartySideSettlementInstructions;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, Optional<SettlementParties29>> mmCounterpartySideSettlementInstructions = new MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, Optional<SettlementParties29>>() {
		{
			xmlTag = "CtrPtySdSttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideSettlementInstructions";
			definition = "Settlement instructions for the amounts received by the counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties29.mmObject();
		}

		@Override
		public Optional<SettlementParties29> getValue(ForeignExchangeTradeInstructionCancellationV04 obj) {
			return obj.getCounterpartySideSettlementInstructions();
		}

		@Override
		public void setValue(ForeignExchangeTradeInstructionCancellationV04 obj, Optional<SettlementParties29> value) {
			obj.setCounterpartySideSettlementInstructions(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnlGnlInf")
	protected GeneralInformation5 optionalGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, Optional<GeneralInformation5>> mmOptionalGeneralInformation = new MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, Optional<GeneralInformation5>>() {
		{
			xmlTag = "OptnlGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionalGeneralInformation";
			definition = "Specifies whether the trade is a block or an individual trade. It also contains supplementary information such as free format information, broker's identification, dealing branches and references.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GeneralInformation5.mmObject();
		}

		@Override
		public Optional<GeneralInformation5> getValue(ForeignExchangeTradeInstructionCancellationV04 obj) {
			return obj.getOptionalGeneralInformation();
		}

		@Override
		public void setValue(ForeignExchangeTradeInstructionCancellationV04 obj, Optional<GeneralInformation5> value) {
			obj.setOptionalGeneralInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "TradAmts", required = true)
	protected AmountsAndValueDate1 tradeAmounts;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, AmountsAndValueDate1> mmTradeAmounts = new MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, AmountsAndValueDate1>() {
		{
			xmlTag = "TradAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmounts";
			definition = "Amounts of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountsAndValueDate1.mmObject();
		}

		@Override
		public AmountsAndValueDate1 getValue(ForeignExchangeTradeInstructionCancellationV04 obj) {
			return obj.getTradeAmounts();
		}

		@Override
		public void setValue(ForeignExchangeTradeInstructionCancellationV04 obj, AmountsAndValueDate1 value) {
			obj.setTradeAmounts(value);
		}
	};
	@XmlElement(name = "RgltryRptg")
	protected RegulatoryReporting6 regulatoryReporting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * "Information that is to be provided to trade repositories in the context of the regulatory standards around over-the-counter (OTC) derivatives, central counterparties and trade repositories."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, Optional<RegulatoryReporting6>> mmRegulatoryReporting = new MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, Optional<RegulatoryReporting6>>() {
		{
			xmlTag = "RgltryRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryReporting";
			definition = "Information that is to be provided to trade repositories in the context of the regulatory standards around over-the-counter (OTC) derivatives, central counterparties and trade repositories.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegulatoryReporting6.mmObject();
		}

		@Override
		public Optional<RegulatoryReporting6> getValue(ForeignExchangeTradeInstructionCancellationV04 obj) {
			return obj.getRegulatoryReporting();
		}

		@Override
		public void setValue(ForeignExchangeTradeInstructionCancellationV04 obj, Optional<RegulatoryReporting6> value) {
			obj.setRegulatoryReporting(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ForeignExchangeTradeInstructionCancellationV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ForeignExchangeTradeInstructionCancellationV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ForeignExchangeTradeInstructionCancellationV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTradeInstructionCancellationV04";
				definition = "Scope\r\r\nThe ForeignExchangeTradeInstructionCancellation message is sent by a participant to a central settlement system to notify the cancellation of the foreign exchange trade previously confirmed by the sender.\r\r\nUsage\r\r\nThe ForeignExchangeTradeInstructionCancellation message is sent from a participant to a central settlement system to advise of the cancellation of a previously sent notification. The \"Related Reference\" must be used to link it to the previous notification.";
				messageSet_lazy = () -> Arrays.asList(PostTradeForeignExchangeISOLatestversion.mmObject(), PostTradeForeignExchangeMaintenance20162017.mmObject(), PostTradeForeignExchangeMaintenance20162017andSupplement.mmObject());
				rootElement = "Document";
				xmlTag = "FXTradInstrCxl";
				businessArea_lazy = () -> ForeignExchangeTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmTradeInformation,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmTradingSideIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmCounterpartySideIdentification, com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmAgreedRate,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmNonDeliverableForwardConditions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmTradingSideSettlementInstructions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmCounterpartySideSettlementInstructions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmOptionalGeneralInformation, com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmTradeAmounts,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmRegulatoryReporting, com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "016";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeInstructionCancellationV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeAgreement15 getTradeInformation() {
		return tradeInformation;
	}

	public ForeignExchangeTradeInstructionCancellationV04 setTradeInformation(TradeAgreement15 tradeInformation) {
		this.tradeInformation = Objects.requireNonNull(tradeInformation);
		return this;
	}

	public TradePartyIdentification6 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public ForeignExchangeTradeInstructionCancellationV04 setTradingSideIdentification(TradePartyIdentification6 tradingSideIdentification) {
		this.tradingSideIdentification = Objects.requireNonNull(tradingSideIdentification);
		return this;
	}

	public TradePartyIdentification6 getCounterpartySideIdentification() {
		return counterpartySideIdentification;
	}

	public ForeignExchangeTradeInstructionCancellationV04 setCounterpartySideIdentification(TradePartyIdentification6 counterpartySideIdentification) {
		this.counterpartySideIdentification = Objects.requireNonNull(counterpartySideIdentification);
		return this;
	}

	public Optional<AgreedRate3> getAgreedRate() {
		return agreedRate == null ? Optional.empty() : Optional.of(agreedRate);
	}

	public ForeignExchangeTradeInstructionCancellationV04 setAgreedRate(AgreedRate3 agreedRate) {
		this.agreedRate = agreedRate;
		return this;
	}

	public Optional<NonDeliverableForwardConditions1> getNonDeliverableForwardConditions() {
		return nonDeliverableForwardConditions == null ? Optional.empty() : Optional.of(nonDeliverableForwardConditions);
	}

	public ForeignExchangeTradeInstructionCancellationV04 setNonDeliverableForwardConditions(NonDeliverableForwardConditions1 nonDeliverableForwardConditions) {
		this.nonDeliverableForwardConditions = nonDeliverableForwardConditions;
		return this;
	}

	public Optional<SettlementParties29> getTradingSideSettlementInstructions() {
		return tradingSideSettlementInstructions == null ? Optional.empty() : Optional.of(tradingSideSettlementInstructions);
	}

	public ForeignExchangeTradeInstructionCancellationV04 setTradingSideSettlementInstructions(SettlementParties29 tradingSideSettlementInstructions) {
		this.tradingSideSettlementInstructions = tradingSideSettlementInstructions;
		return this;
	}

	public Optional<SettlementParties29> getCounterpartySideSettlementInstructions() {
		return counterpartySideSettlementInstructions == null ? Optional.empty() : Optional.of(counterpartySideSettlementInstructions);
	}

	public ForeignExchangeTradeInstructionCancellationV04 setCounterpartySideSettlementInstructions(SettlementParties29 counterpartySideSettlementInstructions) {
		this.counterpartySideSettlementInstructions = counterpartySideSettlementInstructions;
		return this;
	}

	public Optional<GeneralInformation5> getOptionalGeneralInformation() {
		return optionalGeneralInformation == null ? Optional.empty() : Optional.of(optionalGeneralInformation);
	}

	public ForeignExchangeTradeInstructionCancellationV04 setOptionalGeneralInformation(GeneralInformation5 optionalGeneralInformation) {
		this.optionalGeneralInformation = optionalGeneralInformation;
		return this;
	}

	public AmountsAndValueDate1 getTradeAmounts() {
		return tradeAmounts;
	}

	public ForeignExchangeTradeInstructionCancellationV04 setTradeAmounts(AmountsAndValueDate1 tradeAmounts) {
		this.tradeAmounts = Objects.requireNonNull(tradeAmounts);
		return this;
	}

	public Optional<RegulatoryReporting6> getRegulatoryReporting() {
		return regulatoryReporting == null ? Optional.empty() : Optional.of(regulatoryReporting);
	}

	public ForeignExchangeTradeInstructionCancellationV04 setRegulatoryReporting(RegulatoryReporting6 regulatoryReporting) {
		this.regulatoryReporting = regulatoryReporting;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ForeignExchangeTradeInstructionCancellationV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.04")
	static public class Document {
		@XmlElement(name = "FXTradInstrCxl", required = true)
		public ForeignExchangeTradeInstructionCancellationV04 messageBody;
	}
}
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
import com.tools20022.repository.choice.PartyIdentification8Choice;
import com.tools20022.repository.codeset.OptionParty1Code;
import com.tools20022.repository.entity.SubmittingPartyRole;
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.entity.TreasuryTradingParty;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity involved in an activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4#mmFundInformation
 * TradePartyIdentification4.mmFundInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4#mmBuyerOrSellerIndicator
 * TradePartyIdentification4.mmBuyerOrSellerIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4#mmSubmittingParty
 * TradePartyIdentification4.mmSubmittingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4#mmTradeParty
 * TradePartyIdentification4.mmTradeParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02#mmTradingSideIdentification
 * CreateForeignExchangeOptionV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02#mmCounterpartySideIdentification
 * CreateForeignExchangeOptionV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02#mmTradingSideIdentification
 * AmendForeignExchangeOptionV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02#mmCounterpartySideIdentification
 * AmendForeignExchangeOptionV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelForeignExchangeOptionV02#mmTradingSideIdentification
 * CancelForeignExchangeOptionV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelForeignExchangeOptionV02#mmCounterpartySideIdentification
 * CancelForeignExchangeOptionV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02#mmTradingSideIdentification
 * ForeignExchangeOptionNotificationV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02#mmCounterpartySideIdentification
 * ForeignExchangeOptionNotificationV02.mmCounterpartySideIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradePartyIdentification4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * </ul>
 */
public class TradePartyIdentification4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FundIdentification2 fundInformation;
	/**
	 * Identifies the fund which is one of the parties in a treasury trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundIdentification2
	 * FundIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty#mmInvestmentFund
	 * TreasuryTradingParty.mmInvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4
	 * TradePartyIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the fund which is one of the parties in a treasury trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFundInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TreasuryTradingParty.mmInvestmentFund;
			componentContext_lazy = () -> TradePartyIdentification4.mmObject();
			isDerived = false;
			xmlTag = "FndInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundInformation";
			definition = "Identifies the fund which is one of the parties in a treasury trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundIdentification2.mmObject();
		}
	};
	protected OptionParty1Code buyerOrSellerIndicator;
	/**
	 * Specifies the party which is the buyer or the seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionParty1Code
	 * OptionParty1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmBuyerOrSeller
	 * TradePartyRole.mmBuyerOrSeller}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4
	 * TradePartyIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrOrSellrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerOrSellerIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the party which is the buyer or the seller."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBuyerOrSellerIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmBuyerOrSeller;
			componentContext_lazy = () -> TradePartyIdentification4.mmObject();
			isDerived = false;
			xmlTag = "BuyrOrSellrInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerOrSellerIndicator";
			definition = "Specifies the party which is the buyer or the seller.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionParty1Code.mmObject();
		}
	};
	protected PartyIdentification8Choice submittingParty;
	/**
	 * Specifies the party which submits a treasury trade to a matching system
	 * or to a settlement system or to a counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification8Choice
	 * PartyIdentification8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubmittingPartyRole
	 * SubmittingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4
	 * TradePartyIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmittingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party which submits a treasury trade to a matching system or to a settlement system or to a counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubmittingParty = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SubmittingPartyRole.mmObject();
			componentContext_lazy = () -> TradePartyIdentification4.mmObject();
			isDerived = false;
			xmlTag = "SubmitgPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittingParty";
			definition = "Specifies the party which submits a treasury trade to a matching system or to a settlement system or to a counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification8Choice.mmObject();
		}
	};
	protected PartyIdentification8Choice tradeParty;
	/**
	 * Specifies the party which originated a treasury trade. This party may be
	 * the same as the submitting party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification8Choice
	 * PartyIdentification8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty
	 * TreasuryTradingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4
	 * TradePartyIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party which originated a treasury trade. This party may be the same as the submitting party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeParty = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradingParty.mmObject();
			componentContext_lazy = () -> TradePartyIdentification4.mmObject();
			isDerived = false;
			xmlTag = "TradPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeParty";
			definition = "Specifies the party which originated a treasury trade. This party may be the same as the submitting party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification8Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradePartyIdentification4.mmFundInformation, com.tools20022.repository.msg.TradePartyIdentification4.mmBuyerOrSellerIndicator,
						com.tools20022.repository.msg.TradePartyIdentification4.mmSubmittingParty, com.tools20022.repository.msg.TradePartyIdentification4.mmTradeParty);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02.mmTradingSideIdentification,
						com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02.mmCounterpartySideIdentification, com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02.mmTradingSideIdentification,
						com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02.mmCounterpartySideIdentification, com.tools20022.repository.area.trea.CancelForeignExchangeOptionV02.mmTradingSideIdentification,
						com.tools20022.repository.area.trea.CancelForeignExchangeOptionV02.mmCounterpartySideIdentification, com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02.mmTradingSideIdentification,
						com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02.mmCounterpartySideIdentification);
				trace_lazy = () -> TradePartyRole.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradePartyIdentification4";
				definition = "Entity involved in an activity.";
			}
		});
		return mmObject_lazy.get();
	}

	public FundIdentification2 getFundInformation() {
		return fundInformation;
	}

	public void setFundInformation(com.tools20022.repository.msg.FundIdentification2 fundInformation) {
		this.fundInformation = fundInformation;
	}

	public OptionParty1Code getBuyerOrSellerIndicator() {
		return buyerOrSellerIndicator;
	}

	public void setBuyerOrSellerIndicator(OptionParty1Code buyerOrSellerIndicator) {
		this.buyerOrSellerIndicator = buyerOrSellerIndicator;
	}

	public PartyIdentification8Choice getSubmittingParty() {
		return submittingParty;
	}

	public void setSubmittingParty(PartyIdentification8Choice submittingParty) {
		this.submittingParty = submittingParty;
	}

	public PartyIdentification8Choice getTradeParty() {
		return tradeParty;
	}

	public void setTradeParty(PartyIdentification8Choice tradeParty) {
		this.tradeParty = tradeParty;
	}
}
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
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Other parties information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties27#mmInvestor
 * OtherParties27.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherParties27#mmQualifiedForeignIntermediary
 * OtherParties27.mmQualifiedForeignIntermediary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties27#mmStockExchange
 * OtherParties27.mmStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherParties27#mmTradeRegulator
 * OtherParties27.mmTradeRegulator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties27#mmTripartyAgent
 * OtherParties27.mmTripartyAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties27#mmBroker
 * OtherParties27.mmBroker}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06#mmOtherBusinessParties
 * SecuritiesSettlementTransactionInstructionV06.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmOtherBusinessParties
 * SecuritiesSettlementTransactionConfirmationV06.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06#mmOtherBusinessParties
 * SecuritiesFinancingInstructionV06.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmOtherBusinessParties
 * SecuritiesSettlementTransactionGenerationNotificationV06.
 * mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmOtherBusinessParties
 * SecuritiesSettlementTransactionReversalAdviceV05.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmOtherBusinessParties
 * SecuritiesFinancingConfirmationV06.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07#mmOtherBusinessParties
 * SecuritiesFinancingInstructionV07.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07#mmOtherBusinessParties
 * SecuritiesSettlementTransactionGenerationNotificationV07.
 * mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmOtherBusinessParties
 * SecuritiesSettlementTransactionConfirmationV07.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV06#mmOtherBusinessParties
 * SecuritiesSettlementTransactionReversalAdviceV06.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV07#mmOtherBusinessParties
 * SecuritiesFinancingConfirmationV07.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07#mmOtherBusinessParties
 * SecuritiesSettlementTransactionInstructionV07.mmOtherBusinessParties}</li>
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
 * "OtherParties27"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Other parties information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.OtherParties19
 * OtherParties19}</li>
 * </ul>
 */
public class OtherParties27 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.PartyIdentificationAndAccount108> investor;
	/**
	 * Party, either an individual or organisation, whose assets are being
	 * invested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108
	 * PartyIdentificationAndAccount108}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties27 OtherParties27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, either an individual or organisation, whose assets are being invested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties19#mmInvestor
	 * OtherParties19.mmInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> OtherParties27.mmObject();
			isDerived = false;
			xmlTag = "Invstr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherParties19.mmInvestor;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount108.mmObject();
		}
	};
	protected PartyIdentificationAndAccount107 qualifiedForeignIntermediary;
	/**
	 * Foreign Financial Institution which has been authorised by local
	 * authorities to act as account management institution in the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107
	 * PartyIdentificationAndAccount107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties27 OtherParties27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QlfdFrgnIntrmy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign Financial Institution which has been authorised by local authorities to act as account management institution in the country."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties19#mmQualifiedForeignIntermediary
	 * OtherParties19.mmQualifiedForeignIntermediary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQualifiedForeignIntermediary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> OtherParties27.mmObject();
			isDerived = false;
			xmlTag = "QlfdFrgnIntrmy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediary";
			definition = "Foreign Financial Institution which has been authorised by local authorities to act as account management institution in the country.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherParties19.mmQualifiedForeignIntermediary;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount107.mmObject();
		}
	};
	protected PartyIdentificationAndAccount109 stockExchange;
	/**
	 * Identification of the stock exchange to which transaction reporting will
	 * be done.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount109
	 * PartyIdentificationAndAccount109}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties27 OtherParties27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the stock exchange to which transaction reporting will be done."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties19#mmStockExchange
	 * OtherParties19.mmStockExchange}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStockExchange = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> OtherParties27.mmObject();
			isDerived = false;
			xmlTag = "StockXchg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchange";
			definition = "Identification of the stock exchange to which transaction reporting will be done.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherParties19.mmStockExchange;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount109.mmObject();
		}
	};
	protected PartyIdentificationAndAccount109 tradeRegulator;
	/**
	 * Institution to which a trade must be reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount109
	 * PartyIdentificationAndAccount109}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties27 OtherParties27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRgltr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Institution to which a trade must be reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties19#mmTradeRegulator
	 * OtherParties19.mmTradeRegulator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeRegulator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> OtherParties27.mmObject();
			isDerived = false;
			xmlTag = "TradRgltr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulator";
			definition = "Institution to which a trade must be reported.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherParties19.mmTradeRegulator;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount109.mmObject();
		}
	};
	protected PartyIdentificationAndAccount107 tripartyAgent;
	/**
	 * Party responsible for the administration of a tri-party collateral
	 * transaction including collateral allocation, marking to market and
	 * substitution of collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107
	 * PartyIdentificationAndAccount107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties27 OtherParties27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrptyAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party responsible for the administration of a tri-party collateral transaction including collateral allocation, marking to market and substitution of collateral."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties19#mmTripartyAgent
	 * OtherParties19.mmTripartyAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTripartyAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> OtherParties27.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgent";
			definition = "Party responsible for the administration of a tri-party collateral transaction including collateral allocation, marking to market and substitution of collateral.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherParties19.mmTripartyAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount107.mmObject();
		}
	};
	protected PartyIdentificationAndAccount107 broker;
	/**
	 * Party that identifies a broker when required (for example, authorised
	 * broker, prime broker, etc).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107
	 * PartyIdentificationAndAccount107}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties27 OtherParties27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Brkr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Broker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that identifies a broker when required (for example, authorised broker, prime broker, etc)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties19#mmBroker
	 * OtherParties19.mmBroker}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBroker = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> OtherParties27.mmObject();
			isDerived = false;
			xmlTag = "Brkr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Broker";
			definition = "Party that identifies a broker when required (for example, authorised broker, prime broker, etc).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OtherParties19.mmBroker;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount107.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherParties27.mmInvestor, com.tools20022.repository.msg.OtherParties27.mmQualifiedForeignIntermediary,
						com.tools20022.repository.msg.OtherParties27.mmStockExchange, com.tools20022.repository.msg.OtherParties27.mmTradeRegulator, com.tools20022.repository.msg.OtherParties27.mmTripartyAgent,
						com.tools20022.repository.msg.OtherParties27.mmBroker);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06.mmOtherBusinessParties, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05.mmOtherBusinessParties, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07.mmOtherBusinessParties, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmOtherBusinessParties, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV06.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV07.mmOtherBusinessParties, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07.mmOtherBusinessParties);
				trace_lazy = () -> Role.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OtherParties27";
				definition = "Other parties information.";
				previousVersion_lazy = () -> OtherParties19.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<PartyIdentificationAndAccount108> getInvestor() {
		return investor;
	}

	public void setInvestor(List<com.tools20022.repository.msg.PartyIdentificationAndAccount108> investor) {
		this.investor = investor;
	}

	public PartyIdentificationAndAccount107 getQualifiedForeignIntermediary() {
		return qualifiedForeignIntermediary;
	}

	public void setQualifiedForeignIntermediary(com.tools20022.repository.msg.PartyIdentificationAndAccount107 qualifiedForeignIntermediary) {
		this.qualifiedForeignIntermediary = qualifiedForeignIntermediary;
	}

	public PartyIdentificationAndAccount109 getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(com.tools20022.repository.msg.PartyIdentificationAndAccount109 stockExchange) {
		this.stockExchange = stockExchange;
	}

	public PartyIdentificationAndAccount109 getTradeRegulator() {
		return tradeRegulator;
	}

	public void setTradeRegulator(com.tools20022.repository.msg.PartyIdentificationAndAccount109 tradeRegulator) {
		this.tradeRegulator = tradeRegulator;
	}

	public PartyIdentificationAndAccount107 getTripartyAgent() {
		return tripartyAgent;
	}

	public void setTripartyAgent(com.tools20022.repository.msg.PartyIdentificationAndAccount107 tripartyAgent) {
		this.tripartyAgent = tripartyAgent;
	}

	public PartyIdentificationAndAccount107 getBroker() {
		return broker;
	}

	public void setBroker(com.tools20022.repository.msg.PartyIdentificationAndAccount107 broker) {
		this.broker = broker;
	}
}
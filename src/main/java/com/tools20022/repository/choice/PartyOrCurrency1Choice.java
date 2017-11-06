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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.msg.PartyIdentification63;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of a depostory or settlement currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyOrCurrency1Choice#mmDepository
 * PartyOrCurrency1Choice.mmDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyOrCurrency1Choice#mmSettlementCurrency
 * PartyOrCurrency1Choice.mmSettlementCurrency}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionCancellationV01#mmSettlementDetails
 * StandingSettlementInstructionCancellationV01.mmSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#mmSettlementDetails
 * StandingSettlementInstructionStatusAdviceV01.mmSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01#mmSettlementDetails
 * StandingSettlementInstructionDeletionV01.mmSettlementDetails}</li>
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
 * "PartyOrCurrency1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of a depostory or settlement currency."</li>
 * </ul>
 */
public class PartyOrCurrency1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification63 depository;
	/**
	 * First party in the settlement chain. In a plain vanilla settlement, it is
	 * the Central Securities Depository where the counterparty requests to
	 * receive the financial instrument or from where the counterparty delivers
	 * the financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification63
	 * PartyIdentification63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyOrCurrency1Choice
	 * PartyOrCurrency1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dpstry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Depository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First party in the settlement chain. In a plain vanilla settlement, it is the Central Securities Depository where the counterparty requests to receive the financial instrument or from where the counterparty delivers the financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDepository = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyOrCurrency1Choice.mmObject();
			isDerived = false;
			xmlTag = "Dpstry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Depository";
			definition = "First party in the settlement chain. In a plain vanilla settlement, it is the Central Securities Depository where the counterparty requests to receive the financial instrument or from where the counterparty delivers the financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification63.mmObject();
		}
	};
	protected ActiveCurrencyCode settlementCurrency;
	/**
	 * Currency for the settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyOrCurrency1Choice
	 * PartyOrCurrency1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency for the settlement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyOrCurrency1Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency for the settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyOrCurrency1Choice.mmDepository, com.tools20022.repository.choice.PartyOrCurrency1Choice.mmSettlementCurrency);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.StandingSettlementInstructionCancellationV01.mmSettlementDetails,
						com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01.mmSettlementDetails, com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01.mmSettlementDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyOrCurrency1Choice";
				definition = "Choice of a depostory or settlement currency.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification63 getDepository() {
		return depository;
	}

	public void setDepository(PartyIdentification63 depository) {
		this.depository = depository;
	}

	public ActiveCurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(ActiveCurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}
}
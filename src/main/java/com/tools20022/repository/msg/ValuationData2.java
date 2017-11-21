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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.trea.AmendNonDeliverableForwardValuationV02;
import com.tools20022.repository.area.trea.CancelNonDeliverableForwardValuationV02;
import com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02;
import com.tools20022.repository.choice.PartyIdentification8Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.FixingCondition;
import com.tools20022.repository.entity.NonDeliverableTrade;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of data which contains the link to the opening of the non deliverable
 * trade and supplementary information on its valuation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationData2#mmValuationReference
 * ValuationData2.mmValuationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationData2#mmSettlementCurrency
 * ValuationData2.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationData2#mmAdditionalValuationInformation
 * ValuationData2.mmAdditionalValuationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationData2#mmSettlementParty
 * ValuationData2.mmSettlementParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FixingCondition
 * FixingCondition}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02#mmValuationInformation
 * CreateNonDeliverableForwardValuationV02.mmValuationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardValuationV02#mmValuationInformation
 * AmendNonDeliverableForwardValuationV02.mmValuationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardValuationV02#mmValuationInformation
 * CancelNonDeliverableForwardValuationV02.mmValuationInformation}</li>
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
 * "ValuationData2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of data which contains the link to the opening of the non deliverable trade and supplementary information on its valuation."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ValuationData2", propOrder = {"valuationReference", "settlementCurrency", "additionalValuationInformation", "settlementParty"})
public class ValuationData2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text valuationReference;
	/**
	 * Reference to the latest trade identification of the NDF opening trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationData2 ValuationData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the latest trade identification of the NDF opening trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValuationReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ValuationData2.mmObject();
			isDerived = false;
			xmlTag = "ValtnRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationReference";
			definition = "Reference to the latest trade identification of the NDF opening trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode settlementCurrency;
	/**
	 * Specifies the currency in which the non deliverable trade has to be
	 * settled ie the deliverable currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmSettlementCurrency
	 * NonDeliverableTrade.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationData2 ValuationData2}</li>
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
	 * definition} =
	 * "Specifies the currency in which the non deliverable trade has to be settled ie the deliverable currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NonDeliverableTrade.mmSettlementCurrency;
			componentContext_lazy = () -> ValuationData2.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Specifies the currency in which the non deliverable trade has to be settled ie the deliverable currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected Max140Text additionalValuationInformation;
	/**
	 * Free format text that may contain information on the valuation such as
	 * the currency, the place, the time or the source of the rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationData2 ValuationData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlValtnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalValuationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Free format text that may contain information on the valuation such as the currency, the place, the time or the source of the rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalValuationInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ValuationData2.mmObject();
			isDerived = false;
			xmlTag = "AddtlValtnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalValuationInformation";
			definition = "Free format text that may contain information on the valuation such as the currency, the place, the time or the source of the rate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected PartyIdentification8Choice settlementParty;
	/**
	 * Party through which the settlement will take place. It may contain the
	 * BIC of a central settlement system eg CLSBUS33.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification8Choice
	 * PartyIdentification8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationData2 ValuationData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party through which the settlement will take place. It may contain the BIC of a central settlement system eg CLSBUS33."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementParty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> ValuationData2.mmObject();
			isDerived = false;
			xmlTag = "SttlmPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParty";
			definition = "Party through which the settlement will take place. It may contain the BIC of a central settlement system eg CLSBUS33.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification8Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ValuationData2.mmValuationReference, ValuationData2.mmSettlementCurrency, ValuationData2.mmAdditionalValuationInformation, ValuationData2.mmSettlementParty);
				messageBuildingBlock_lazy = () -> Arrays.asList(CreateNonDeliverableForwardValuationV02.mmValuationInformation, AmendNonDeliverableForwardValuationV02.mmValuationInformation,
						CancelNonDeliverableForwardValuationV02.mmValuationInformation);
				trace_lazy = () -> FixingCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ValuationData2";
				definition = "Set of data which contains the link to the opening of the non deliverable trade and supplementary information on its valuation.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ValtnRef", required = true)
	public Max35Text getValuationReference() {
		return valuationReference;
	}

	public void setValuationReference(Max35Text valuationReference) {
		this.valuationReference = valuationReference;
	}

	@XmlElement(name = "SttlmCcy")
	public ActiveOrHistoricCurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(ActiveOrHistoricCurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	@XmlElement(name = "AddtlValtnInf")
	public Max140Text getAdditionalValuationInformation() {
		return additionalValuationInformation;
	}

	public void setAdditionalValuationInformation(Max140Text additionalValuationInformation) {
		this.additionalValuationInformation = additionalValuationInformation;
	}

	@XmlElement(name = "SttlmPty")
	public PartyIdentification8Choice getSettlementParty() {
		return settlementParty;
	}

	public void setSettlementParty(PartyIdentification8Choice settlementParty) {
		this.settlementParty = settlementParty;
	}
}
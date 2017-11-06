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
import com.tools20022.repository.entity.CardPayment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Card transaction entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry1#mmCard
 * CardEntry1.mmCard}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry1#mmPOI
 * CardEntry1.mmPOI}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry1#mmAggregatedEntry
 * CardEntry1.mmAggregatedEntry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "CardEntry1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Card transaction entry."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2 CardEntry2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CardEntry1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentCard4 card;
	/**
	 * Electronic money product that provides the cardholder with a portable and
	 * specialised computer device, which typically contains a microprocessor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCard4
	 * PaymentCard4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CardEntry1
	 * CardEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#mmCard
	 * CardEntry2.mmCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCard = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPayment.mmPaymentCard;
			componentContext_lazy = () -> CardEntry1.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardEntry2.mmCard);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentCard4.mmObject();
		}
	};
	protected PointOfInteraction1 pOI;
	/**
	 * Physical or logical card payment terminal containing software and
	 * hardware components.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PointOfInteraction1
	 * PointOfInteraction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CardEntry1
	 * CardEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical or logical card payment terminal containing software and hardware components."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CardEntry2#mmPOI
	 * CardEntry2.mmPOI}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOI = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> CardEntry1.mmObject();
			isDerived = false;
			xmlTag = "POI";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POI";
			definition = "Physical or logical card payment terminal containing software and hardware components.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardEntry2.mmPOI);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PointOfInteraction1.mmObject();
		}
	};
	protected CardAggregated1 aggregatedEntry;
	/**
	 * Card entry details, based on card transaction aggregated data performed
	 * by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CardEntry1
	 * CardEntry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtdNtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregatedEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card entry details, based on card transaction aggregated data performed by the account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardEntry2#mmAggregatedEntry
	 * CardEntry2.mmAggregatedEntry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAggregatedEntry = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> CardEntry1.mmObject();
			isDerived = false;
			xmlTag = "AggtdNtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregatedEntry";
			definition = "Card entry details, based on card transaction aggregated data performed by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardEntry2.mmAggregatedEntry);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardAggregated1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardEntry1.mmCard, com.tools20022.repository.msg.CardEntry1.mmPOI, com.tools20022.repository.msg.CardEntry1.mmAggregatedEntry);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardEntry1";
				definition = "Card transaction entry.";
				nextVersions_lazy = () -> Arrays.asList(CardEntry2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentCard4 getCard() {
		return card;
	}

	public void setCard(com.tools20022.repository.msg.PaymentCard4 card) {
		this.card = card;
	}

	public PointOfInteraction1 getPOI() {
		return pOI;
	}

	public void setPOI(com.tools20022.repository.msg.PointOfInteraction1 pOI) {
		this.pOI = pOI;
	}

	public CardAggregated1 getAggregatedEntry() {
		return aggregatedEntry;
	}

	public void setAggregatedEntry(com.tools20022.repository.msg.CardAggregated1 aggregatedEntry) {
		this.aggregatedEntry = aggregatedEntry;
	}
}
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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentificationAndAccount52;
import com.tools20022.repository.msg.PartyIdentificationAndAccount54;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies cash parties in the framework of a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties10#mmCreditor
 * CashParties10.mmCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties10#mmCreditorAgent
 * CashParties10.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashParties10#mmMarketClaimCounterparty
 * CashParties10.mmMarketClaimCounterparty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
 * PaymentPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashParties10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies cash parties in the framework of a corporate action event."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashParties21 CashParties21}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashParties10", propOrder = {"creditor", "creditorAgent", "marketClaimCounterparty"})
public class CashParties10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cdtr")
	protected PartyIdentificationAndAccount52 creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount52
	 * PartyIdentificationAndAccount52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties10 CashParties10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to which an amount of money is due."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::BENM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashParties21#mmCreditor
	 * CashParties21.mmCreditor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashParties10, Optional<PartyIdentificationAndAccount52>> mmCreditor = new MMMessageAssociationEnd<CashParties10, Optional<PartyIdentificationAndAccount52>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties10.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::BENM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which an amount of money is due.";
			nextVersions_lazy = () -> Arrays.asList(CashParties21.mmCreditor);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount52.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount52> getValue(CashParties10 obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(CashParties10 obj, Optional<PartyIdentificationAndAccount52> value) {
			obj.setCreditor(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAgt")
	protected PartyIdentificationAndAccount54 creditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount54
	 * PartyIdentificationAndAccount54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties10 CashParties10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::ACCW</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties21#mmCreditorAgent
	 * CashParties21.mmCreditorAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashParties10, Optional<PartyIdentificationAndAccount54>> mmCreditorAgent = new MMMessageAssociationEnd<CashParties10, Optional<PartyIdentificationAndAccount54>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties10.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::ACCW"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			nextVersions_lazy = () -> Arrays.asList(CashParties21.mmCreditorAgent);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount54.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount54> getValue(CashParties10 obj) {
			return obj.getCreditorAgent();
		}

		@Override
		public void setValue(CashParties10 obj, Optional<PartyIdentificationAndAccount54> value) {
			obj.setCreditorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "MktClmCtrPty")
	protected PartyIdentificationAndAccount52 marketClaimCounterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount52
	 * PartyIdentificationAndAccount52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashParties10 CashParties10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktClmCtrPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaimCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that has reimbursed the account owner with funds to which they were legally entitled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::CLAM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashParties21#mmMarketClaimCounterparty
	 * CashParties21.mmMarketClaimCounterparty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashParties10, Optional<PartyIdentificationAndAccount52>> mmMarketClaimCounterparty = new MMMessageAssociationEnd<CashParties10, Optional<PartyIdentificationAndAccount52>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashParties10.mmObject();
			isDerived = false;
			xmlTag = "MktClmCtrPty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::CLAM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaimCounterparty";
			definition = "Party that has reimbursed the account owner with funds to which they were legally entitled.";
			nextVersions_lazy = () -> Arrays.asList(CashParties21.mmMarketClaimCounterparty);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount52.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount52> getValue(CashParties10 obj) {
			return obj.getMarketClaimCounterparty();
		}

		@Override
		public void setValue(CashParties10 obj, Optional<PartyIdentificationAndAccount52> value) {
			obj.setMarketClaimCounterparty(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashParties10.mmCreditor, com.tools20022.repository.msg.CashParties10.mmCreditorAgent,
						com.tools20022.repository.msg.CashParties10.mmMarketClaimCounterparty);
				trace_lazy = () -> PaymentPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CashParties10";
				definition = "Specifies cash parties in the framework of a corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CashParties21.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentificationAndAccount52> getCreditor() {
		return creditor == null ? Optional.empty() : Optional.of(creditor);
	}

	public CashParties10 setCreditor(PartyIdentificationAndAccount52 creditor) {
		this.creditor = creditor;
		return this;
	}

	public Optional<PartyIdentificationAndAccount54> getCreditorAgent() {
		return creditorAgent == null ? Optional.empty() : Optional.of(creditorAgent);
	}

	public CashParties10 setCreditorAgent(PartyIdentificationAndAccount54 creditorAgent) {
		this.creditorAgent = creditorAgent;
		return this;
	}

	public Optional<PartyIdentificationAndAccount52> getMarketClaimCounterparty() {
		return marketClaimCounterparty == null ? Optional.empty() : Optional.of(marketClaimCounterparty);
	}

	public CashParties10 setMarketClaimCounterparty(PartyIdentificationAndAccount52 marketClaimCounterparty) {
		this.marketClaimCounterparty = marketClaimCounterparty;
		return this;
	}
}
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
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.entity.TaxPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies an entity involved in a trade activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeParty2#mmPartyIdentification
 * TradeParty2.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeParty2#mmLegalOrganisation
 * TradeParty2.mmLegalOrganisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeParty2#mmTaxParty
 * TradeParty2.mmTaxParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
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
 * "TradeParty2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies an entity involved in a trade activity."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TradeParty1
 * TradeParty1}</li>
 * </ul>
 */
public class TradeParty2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification77 partyIdentification;
	/**
	 * Unique identification, as assigned by an organisation, to unambiguously
	 * identify a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification77
	 * PartyIdentification77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeParty2 TradeParty2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by an organisation, to unambiguously identify a party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeParty1#mmPartyIdentification
	 * TradeParty1.mmPartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartyIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> TradeParty2.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TradeParty1.mmPartyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification77.mmObject();
		}
	};
	protected LegalOrganisation2 legalOrganisation;
	/**
	 * Legally constituted organization specified for this trade party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LegalOrganisation2
	 * LegalOrganisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeParty2 TradeParty2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglOrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legally constituted organization specified for this trade party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeParty1#mmLegalOrganisation
	 * TradeParty1.mmLegalOrganisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegalOrganisation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> TradeParty2.mmObject();
			isDerived = false;
			xmlTag = "LglOrg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalOrganisation";
			definition = "Legally constituted organization specified for this trade party.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TradeParty1.mmLegalOrganisation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LegalOrganisation2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TaxParty3> taxParty;
	/**
	 * Entity involved in an activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxParty3 TaxParty3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole TaxPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeParty2 TradeParty2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity involved in an activity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeParty1#mmTaxParty
	 * TradeParty1.mmTaxParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxParty = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TaxPartyRole.mmObject();
			componentContext_lazy = () -> TradeParty2.mmObject();
			isDerived = false;
			xmlTag = "TaxPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxParty";
			definition = "Entity involved in an activity.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TradeParty1.mmTaxParty;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxParty3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeParty2.mmPartyIdentification, com.tools20022.repository.msg.TradeParty2.mmLegalOrganisation, com.tools20022.repository.msg.TradeParty2.mmTaxParty);
				trace_lazy = () -> Role.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradeParty2";
				definition = "Specifies an entity involved in a trade activity.";
				previousVersion_lazy = () -> TradeParty1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification77 getPartyIdentification() {
		return partyIdentification;
	}

	public void setPartyIdentification(com.tools20022.repository.msg.PartyIdentification77 partyIdentification) {
		this.partyIdentification = partyIdentification;
	}

	public LegalOrganisation2 getLegalOrganisation() {
		return legalOrganisation;
	}

	public void setLegalOrganisation(com.tools20022.repository.msg.LegalOrganisation2 legalOrganisation) {
		this.legalOrganisation = legalOrganisation;
	}

	public List<TaxParty3> getTaxParty() {
		return taxParty;
	}

	public void setTaxParty(List<com.tools20022.repository.msg.TaxParty3> taxParty) {
		this.taxParty = taxParty;
	}
}
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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.msg.IndividualPerson21;
import com.tools20022.repository.msg.Organisation15;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of formats for the specification of the party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party15Choice#mmOrganisation
 * Party15Choice.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party15Choice#mmIndividualPerson
 * Party15Choice.mmIndividualPerson}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
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
 * "Party15Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of formats for the specification of the party."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Party14Choice Party14Choice}</li>
 * </ul>
 */
public class Party15Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Organisation15 organisation;
	/**
	 * Organised structure that is set up for a particular purpose, eg, a
	 * business, government body, department, charity, or financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation15
	 * Organisation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Party15Choice Party15Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Org"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Party14Choice#mmOrganisation
	 * Party14Choice.mmOrganisation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrganisation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> Party15Choice.mmObject();
			isDerived = false;
			xmlTag = "Org";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Organisation";
			definition = "Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.Party14Choice.mmOrganisation;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Organisation15.mmObject();
		}
	};
	protected IndividualPerson21 individualPerson;
	/**
	 * Human entity, as distinguished from a corporate entity (which is
	 * sometimes referred to as an 'artificial person').
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson21
	 * IndividualPerson21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Party15Choice Party15Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Party14Choice#mmIndividualPerson
	 * Party14Choice.mmIndividualPerson}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndividualPerson = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> Party15Choice.mmObject();
			isDerived = false;
			xmlTag = "IndvPrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualPerson";
			definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
			previousVersion_lazy = () -> com.tools20022.repository.choice.Party14Choice.mmIndividualPerson;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndividualPerson21.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Party15Choice.mmOrganisation, com.tools20022.repository.choice.Party15Choice.mmIndividualPerson);
				trace_lazy = () -> Party.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Party15Choice";
				definition = "Choice of formats for the specification of the party.";
				previousVersion_lazy = () -> Party14Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Organisation15 getOrganisation() {
		return organisation;
	}

	public void setOrganisation(Organisation15 organisation) {
		this.organisation = organisation;
	}

	public IndividualPerson21 getIndividualPerson() {
		return individualPerson;
	}

	public void setIndividualPerson(IndividualPerson21 individualPerson) {
		this.individualPerson = individualPerson;
	}
}
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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information about a party's account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice#mmPrimaryOwner
 * AccountParties8Choice.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice#mmTrustee
 * AccountParties8Choice.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice#mmNominee
 * AccountParties8Choice.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice#mmJointOwner
 * AccountParties8Choice.mmJointOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
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
 * "AccountParties8Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a party's account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties10Choice
 * AccountParties10Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice
 * AccountParties5Choice}</li>
 * </ul>
 */
public class AccountParties8Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected InvestmentAccountOwnershipInformation12 primaryOwner;
	/**
	 * Single owner of the account or, when the ownership is split among several
	 * owners, the primary owner is the one giving its address and account
	 * details for the registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrimaryOwner PrimaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice
	 * AccountParties8Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Single owner of the account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties10Choice#mmPrimaryOwner
	 * AccountParties10Choice.mmPrimaryOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmPrimaryOwner
	 * AccountParties5Choice.mmPrimaryOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrimaryOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PrimaryOwner.mmObject();
			componentContext_lazy = () -> AccountParties8Choice.mmObject();
			isDerived = false;
			xmlTag = "PmryOwnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryOwner";
			definition = "Single owner of the account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties10Choice.mmPrimaryOwner);
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties5Choice.mmPrimaryOwner;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
		}
	};
	protected List<InvestmentAccountOwnershipInformation12> trustee;
	/**
	 * Legal owners of the property. However, the beneficiary has the equitable
	 * or beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TrusteeRole TrusteeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice
	 * AccountParties8Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trstee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trustee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties10Choice#mmTrustee
	 * AccountParties10Choice.mmTrustee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmTrustee
	 * AccountParties5Choice.mmTrustee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTrustee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TrusteeRole.mmObject();
			componentContext_lazy = () -> AccountParties8Choice.mmObject();
			isDerived = false;
			xmlTag = "Trstee";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trustee";
			definition = "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties10Choice.mmTrustee);
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties5Choice.mmTrustee;
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
		}
	};
	protected InvestmentAccountOwnershipInformation12 nominee;
	/**
	 * Entity named by the beneficial owner to act on its behalf, often to
	 * facilitate dealing, or to conceal the identity of the beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Nominee Nominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice
	 * AccountParties8Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nmnee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties10Choice#mmNominee
	 * AccountParties10Choice.mmNominee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmNominee
	 * AccountParties5Choice.mmNominee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNominee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Nominee.mmObject();
			componentContext_lazy = () -> AccountParties8Choice.mmObject();
			isDerived = false;
			xmlTag = "Nmnee";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nominee";
			definition = "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties10Choice.mmNominee);
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties5Choice.mmNominee;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
		}
	};
	protected List<InvestmentAccountOwnershipInformation12> jointOwner;
	/**
	 * Co-owner of the investment account when the ownership is assigned to more
	 * than one party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.JointOwner JointOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties8Choice
	 * AccountParties8Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "JntOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Co-owner of the investment account when the ownership is assigned to more than one party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties10Choice#mmJointOwner
	 * AccountParties10Choice.mmJointOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmJointOwner
	 * AccountParties5Choice.mmJointOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmJointOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> JointOwner.mmObject();
			componentContext_lazy = () -> AccountParties8Choice.mmObject();
			isDerived = false;
			xmlTag = "JntOwnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointOwner";
			definition = "Co-owner of the investment account when the ownership is assigned to more than one party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties10Choice.mmJointOwner);
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties5Choice.mmJointOwner;
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties8Choice.mmPrimaryOwner, com.tools20022.repository.choice.AccountParties8Choice.mmTrustee,
						com.tools20022.repository.choice.AccountParties8Choice.mmNominee, com.tools20022.repository.choice.AccountParties8Choice.mmJointOwner);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountParties8Choice";
				definition = "Information about a party's account.";
				nextVersions_lazy = () -> Arrays.asList(AccountParties10Choice.mmObject());
				previousVersion_lazy = () -> AccountParties5Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public InvestmentAccountOwnershipInformation12 getPrimaryOwner() {
		return primaryOwner;
	}

	public void setPrimaryOwner(InvestmentAccountOwnershipInformation12 primaryOwner) {
		this.primaryOwner = primaryOwner;
	}

	public List<InvestmentAccountOwnershipInformation12> getTrustee() {
		return trustee;
	}

	public void setTrustee(List<InvestmentAccountOwnershipInformation12> trustee) {
		this.trustee = trustee;
	}

	public InvestmentAccountOwnershipInformation12 getNominee() {
		return nominee;
	}

	public void setNominee(InvestmentAccountOwnershipInformation12 nominee) {
		this.nominee = nominee;
	}

	public List<InvestmentAccountOwnershipInformation12> getJointOwner() {
		return jointOwner;
	}

	public void setJointOwner(List<InvestmentAccountOwnershipInformation12> jointOwner) {
		this.jointOwner = jointOwner;
	}
}
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
import com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11;
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
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#mmPrimaryOwner
 * AccountParties6Choice.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#mmTrustee
 * AccountParties6Choice.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#mmCustodianForMinor
 * AccountParties6Choice.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#mmNominee
 * AccountParties6Choice.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice#mmJointOwner
 * AccountParties6Choice.mmJointOwner}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountParties6Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a party's account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties9Choice
 * AccountParties9Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice
 * AccountParties3Choice}</li>
 * </ul>
 */
public class AccountParties6Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected InvestmentAccountOwnershipInformation11 primaryOwner;
	/**
	 * Single owner of the investment account or, when the ownership is split
	 * among several owners, the primary owner is the one giving its address and
	 * account details for the registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11
	 * InvestmentAccountOwnershipInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrimaryOwner PrimaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice
	 * AccountParties6Choice}</li>
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
	 * "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties9Choice#mmPrimaryOwner
	 * AccountParties9Choice.mmPrimaryOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#mmPrimaryOwner
	 * AccountParties3Choice.mmPrimaryOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrimaryOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PrimaryOwner.mmObject();
			componentContext_lazy = () -> AccountParties6Choice.mmObject();
			isDerived = false;
			xmlTag = "PmryOwnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryOwner";
			definition = "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties9Choice.mmPrimaryOwner);
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties3Choice.mmPrimaryOwner;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation11.mmObject();
		}
	};
	protected List<InvestmentAccountOwnershipInformation11> trustee;
	/**
	 * Legal owners of the property. However, the beneficiary has the equitable
	 * or beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11
	 * InvestmentAccountOwnershipInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TrusteeRole TrusteeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice
	 * AccountParties6Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.AccountParties9Choice#mmTrustee
	 * AccountParties9Choice.mmTrustee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#mmTrustee
	 * AccountParties3Choice.mmTrustee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTrustee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TrusteeRole.mmObject();
			componentContext_lazy = () -> AccountParties6Choice.mmObject();
			isDerived = false;
			xmlTag = "Trstee";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trustee";
			definition = "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties9Choice.mmTrustee);
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties3Choice.mmTrustee;
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation11.mmObject();
		}
	};
	protected InvestmentAccountOwnershipInformation11 custodianForMinor;
	/**
	 * Entity that holds shares/units on behalf of a legal minor. Although the
	 * account is registered under the name of the minor, the custodian retains
	 * control of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11
	 * InvestmentAccountOwnershipInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CustodianForMinor
	 * CustodianForMinor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice
	 * AccountParties6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdnForMnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianForMinor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#mmCustodianForMinor
	 * AccountParties3Choice.mmCustodianForMinor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCustodianForMinor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CustodianForMinor.mmObject();
			componentContext_lazy = () -> AccountParties6Choice.mmObject();
			isDerived = false;
			xmlTag = "CtdnForMnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianForMinor";
			definition = "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties3Choice.mmCustodianForMinor;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation11.mmObject();
		}
	};
	protected InvestmentAccountOwnershipInformation11 nominee;
	/**
	 * Entity named by the beneficial owner to act on its behalf, often to
	 * facilitate dealing, or to conceal the identity of the beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11
	 * InvestmentAccountOwnershipInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Nominee Nominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice
	 * AccountParties6Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.AccountParties9Choice#mmNominee
	 * AccountParties9Choice.mmNominee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#mmNominee
	 * AccountParties3Choice.mmNominee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNominee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Nominee.mmObject();
			componentContext_lazy = () -> AccountParties6Choice.mmObject();
			isDerived = false;
			xmlTag = "Nmnee";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nominee";
			definition = "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties9Choice.mmNominee);
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties3Choice.mmNominee;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation11.mmObject();
		}
	};
	protected List<InvestmentAccountOwnershipInformation11> jointOwner;
	/**
	 * Co-owner of the investment account when the ownership is assigned to more
	 * than one party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11
	 * InvestmentAccountOwnershipInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.JointOwner JointOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties6Choice
	 * AccountParties6Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.AccountParties9Choice#mmJointOwner
	 * AccountParties9Choice.mmJointOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties3Choice#mmJointOwner
	 * AccountParties3Choice.mmJointOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmJointOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> JointOwner.mmObject();
			componentContext_lazy = () -> AccountParties6Choice.mmObject();
			isDerived = false;
			xmlTag = "JntOwnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointOwner";
			definition = "Co-owner of the investment account when the ownership is assigned to more than one party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties9Choice.mmJointOwner);
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties3Choice.mmJointOwner;
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation11.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties6Choice.mmPrimaryOwner, com.tools20022.repository.choice.AccountParties6Choice.mmTrustee,
						com.tools20022.repository.choice.AccountParties6Choice.mmCustodianForMinor, com.tools20022.repository.choice.AccountParties6Choice.mmNominee, com.tools20022.repository.choice.AccountParties6Choice.mmJointOwner);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountParties6Choice";
				definition = "Information about a party's account.";
				nextVersions_lazy = () -> Arrays.asList(AccountParties9Choice.mmObject());
				previousVersion_lazy = () -> AccountParties3Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public InvestmentAccountOwnershipInformation11 getPrimaryOwner() {
		return primaryOwner;
	}

	public void setPrimaryOwner(InvestmentAccountOwnershipInformation11 primaryOwner) {
		this.primaryOwner = primaryOwner;
	}

	public List<InvestmentAccountOwnershipInformation11> getTrustee() {
		return trustee;
	}

	public void setTrustee(List<InvestmentAccountOwnershipInformation11> trustee) {
		this.trustee = trustee;
	}

	public InvestmentAccountOwnershipInformation11 getCustodianForMinor() {
		return custodianForMinor;
	}

	public void setCustodianForMinor(InvestmentAccountOwnershipInformation11 custodianForMinor) {
		this.custodianForMinor = custodianForMinor;
	}

	public InvestmentAccountOwnershipInformation11 getNominee() {
		return nominee;
	}

	public void setNominee(InvestmentAccountOwnershipInformation11 nominee) {
		this.nominee = nominee;
	}

	public List<InvestmentAccountOwnershipInformation11> getJointOwner() {
		return jointOwner;
	}

	public void setJointOwner(List<InvestmentAccountOwnershipInformation11> jointOwner) {
		this.jointOwner = jointOwner;
	}
}
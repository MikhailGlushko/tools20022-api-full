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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV02;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ExtendedParty2;
import com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Any party who is related to an investment account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#AccountOwnerRule
 * AccountParties5.AccountOwnerRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmPrimaryOwner
 * AccountParties5.mmPrimaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmTrustee
 * AccountParties5.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmCustodianForMinor
 * AccountParties5.mmCustodianForMinor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmNominee
 * AccountParties5.mmNominee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmJointOwner
 * AccountParties5.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmSecondaryOwner
 * AccountParties5.mmSecondaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmBeneficiary
 * AccountParties5.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmPowerOfAttorney
 * AccountParties5.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmLegalGuardian
 * AccountParties5.mmLegalGuardian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmSuccessorOnDeath
 * AccountParties5.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmAdministrator
 * AccountParties5.mmAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmOtherParty
 * AccountParties5.mmOtherParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmGranter
 * AccountParties5.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmSettler
 * AccountParties5.mmSettler}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmAccountParties
 * AccountDetailsConfirmationV02.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02#mmAccountParties
 * AccountOpeningInstructionV02.mmAccountParties}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountParties5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Any party who is related to an investment account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBeneficiaryRule#forAccountParties5
 * ConstraintBeneficiaryRule.forAccountParties5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule#forAccountParties5
 * ConstraintRegistrationAddressIndicator1Rule.forAccountParties5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties5
 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6
 * AccountParties6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountParties5", propOrder = {"primaryOwner", "trustee", "custodianForMinor", "nominee", "jointOwner", "secondaryOwner", "beneficiary", "powerOfAttorney", "legalGuardian", "successorOnDeath", "administrator",
		"otherParty", "granter", "settler"})
public class AccountParties5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmryOwnr", required = true)
	protected InvestmentAccountOwnershipInformation5 primaryOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
	 * InvestmentAccountOwnershipInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrimaryOwner PrimaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, InvestmentAccountOwnershipInformation5> mmPrimaryOwner = new MMMessageAssociationEnd<AccountParties5, InvestmentAccountOwnershipInformation5>() {
		{
			businessComponentTrace_lazy = () -> PrimaryOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "PmryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryOwner";
			definition = "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation5.mmObject();
		}

		@Override
		public InvestmentAccountOwnershipInformation5 getValue(AccountParties5 obj) {
			return obj.getPrimaryOwner();
		}

		@Override
		public void setValue(AccountParties5 obj, InvestmentAccountOwnershipInformation5 value) {
			obj.setPrimaryOwner(value);
		}
	};
	@XmlElement(name = "Trstee", required = true)
	protected List<InvestmentAccountOwnershipInformation5> trustee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
	 * InvestmentAccountOwnershipInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TrusteeRole TrusteeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trstee"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trustee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>> mmTrustee = new MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>>() {
		{
			businessComponentTrace_lazy = () -> TrusteeRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "Trstee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trustee";
			definition = "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership.";
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation5.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation5> getValue(AccountParties5 obj) {
			return obj.getTrustee();
		}

		@Override
		public void setValue(AccountParties5 obj, List<InvestmentAccountOwnershipInformation5> value) {
			obj.setTrustee(value);
		}
	};
	@XmlElement(name = "CtdnForMnr", required = true)
	protected InvestmentAccountOwnershipInformation5 custodianForMinor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
	 * InvestmentAccountOwnershipInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CustodianForMinor
	 * CustodianForMinor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdnForMnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianForMinor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, InvestmentAccountOwnershipInformation5> mmCustodianForMinor = new MMMessageAssociationEnd<AccountParties5, InvestmentAccountOwnershipInformation5>() {
		{
			businessComponentTrace_lazy = () -> CustodianForMinor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "CtdnForMnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianForMinor";
			definition = "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation5.mmObject();
		}

		@Override
		public InvestmentAccountOwnershipInformation5 getValue(AccountParties5 obj) {
			return obj.getCustodianForMinor();
		}

		@Override
		public void setValue(AccountParties5 obj, InvestmentAccountOwnershipInformation5 value) {
			obj.setCustodianForMinor(value);
		}
	};
	@XmlElement(name = "Nmnee", required = true)
	protected InvestmentAccountOwnershipInformation5 nominee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
	 * InvestmentAccountOwnershipInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Nominee Nominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nmnee"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, InvestmentAccountOwnershipInformation5> mmNominee = new MMMessageAssociationEnd<AccountParties5, InvestmentAccountOwnershipInformation5>() {
		{
			businessComponentTrace_lazy = () -> Nominee.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "Nmnee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nominee";
			definition = "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation5.mmObject();
		}

		@Override
		public InvestmentAccountOwnershipInformation5 getValue(AccountParties5 obj) {
			return obj.getNominee();
		}

		@Override
		public void setValue(AccountParties5 obj, InvestmentAccountOwnershipInformation5 value) {
			obj.setNominee(value);
		}
	};
	@XmlElement(name = "JntOwnr", required = true)
	protected List<InvestmentAccountOwnershipInformation5> jointOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
	 * InvestmentAccountOwnershipInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.JointOwner JointOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "JntOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Co-owner of the investment account when the ownership is assigned to more than one party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>> mmJointOwner = new MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>>() {
		{
			businessComponentTrace_lazy = () -> JointOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "JntOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointOwner";
			definition = "Co-owner of the investment account when the ownership is assigned to more than one party.";
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation5.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation5> getValue(AccountParties5 obj) {
			return obj.getJointOwner();
		}

		@Override
		public void setValue(AccountParties5 obj, List<InvestmentAccountOwnershipInformation5> value) {
			obj.setJointOwner(value);
		}
	};
	@XmlElement(name = "ScndryOwnr")
	protected List<InvestmentAccountOwnershipInformation5> secondaryOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
	 * InvestmentAccountOwnershipInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecondaryOwner
	 * SecondaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that is not the primary owner when the ownership of the investment account is split among several owners."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>> mmSecondaryOwner = new MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>>() {
		{
			businessComponentTrace_lazy = () -> SecondaryOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "ScndryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryOwner";
			definition = "Entity that is not the primary owner when the ownership of the investment account is split among several owners.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation5.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation5> getValue(AccountParties5 obj) {
			return obj.getSecondaryOwner();
		}

		@Override
		public void setValue(AccountParties5 obj, List<InvestmentAccountOwnershipInformation5> value) {
			obj.setSecondaryOwner(value);
		}
	};
	@XmlElement(name = "Bnfcry")
	protected List<InvestmentAccountOwnershipInformation5> beneficiary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
	 * InvestmentAccountOwnershipInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bnfcry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>> mmBeneficiary = new MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>>() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation5.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation5> getValue(AccountParties5 obj) {
			return obj.getBeneficiary();
		}

		@Override
		public void setValue(AccountParties5 obj, List<InvestmentAccountOwnershipInformation5> value) {
			obj.setBeneficiary(value);
		}
	};
	@XmlElement(name = "PwrOfAttny")
	protected List<InvestmentAccountOwnershipInformation5> powerOfAttorney;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
	 * InvestmentAccountOwnershipInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MandateHolder MandateHolder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PwrOfAttny"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that was given the authority by another entity to act on its behalf."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>> mmPowerOfAttorney = new MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>>() {
		{
			businessComponentTrace_lazy = () -> MandateHolder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "PwrOfAttny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorney";
			definition = "Entity that was given the authority by another entity to act on its behalf.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation5.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation5> getValue(AccountParties5 obj) {
			return obj.getPowerOfAttorney();
		}

		@Override
		public void setValue(AccountParties5 obj, List<InvestmentAccountOwnershipInformation5> value) {
			obj.setPowerOfAttorney(value);
		}
	};
	@XmlElement(name = "LglGuardn")
	protected List<InvestmentAccountOwnershipInformation5> legalGuardian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
	 * InvestmentAccountOwnershipInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.LegalGuardianRole
	 * LegalGuardianRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglGuardn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalGuardian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>> mmLegalGuardian = new MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>>() {
		{
			businessComponentTrace_lazy = () -> LegalGuardianRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "LglGuardn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalGuardian";
			definition = "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation5.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation5> getValue(AccountParties5 obj) {
			return obj.getLegalGuardian();
		}

		@Override
		public void setValue(AccountParties5 obj, List<InvestmentAccountOwnershipInformation5> value) {
			obj.setLegalGuardian(value);
		}
	};
	@XmlElement(name = "SucssrOnDth")
	protected List<InvestmentAccountOwnershipInformation5> successorOnDeath;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
	 * InvestmentAccountOwnershipInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuccessorOnDeath
	 * SuccessorOnDeath}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SucssrOnDth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuccessorOnDeath"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>> mmSuccessorOnDeath = new MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>>() {
		{
			businessComponentTrace_lazy = () -> SuccessorOnDeath.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "SucssrOnDth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuccessorOnDeath";
			definition = "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation5.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation5> getValue(AccountParties5 obj) {
			return obj.getSuccessorOnDeath();
		}

		@Override
		public void setValue(AccountParties5 obj, List<InvestmentAccountOwnershipInformation5> value) {
			obj.setSuccessorOnDeath(value);
		}
	};
	@XmlElement(name = "Admstr")
	protected InvestmentAccountOwnershipInformation5 administrator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
	 * InvestmentAccountOwnershipInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdministratorRole
	 * AdministratorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Admstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Administrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that has been appointed by a legal authorithy to act on behalf of a person or organisation that has gone bankrupt."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, Optional<InvestmentAccountOwnershipInformation5>> mmAdministrator = new MMMessageAssociationEnd<AccountParties5, Optional<InvestmentAccountOwnershipInformation5>>() {
		{
			businessComponentTrace_lazy = () -> AdministratorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "Admstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Administrator";
			definition = "Entity that has been appointed by a legal authorithy to act on behalf of a person or organisation that has gone bankrupt.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation5.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation5> getValue(AccountParties5 obj) {
			return obj.getAdministrator();
		}

		@Override
		public void setValue(AccountParties5 obj, Optional<InvestmentAccountOwnershipInformation5> value) {
			obj.setAdministrator(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrPty")
	protected List<ExtendedParty2> otherParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExtendedParty2
	 * ExtendedParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other type of party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, List<ExtendedParty2>> mmOtherParty = new MMMessageAssociationEnd<AccountParties5, List<ExtendedParty2>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "OthrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParty";
			definition = "Other type of party.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExtendedParty2.mmObject();
		}

		@Override
		public List<ExtendedParty2> getValue(AccountParties5 obj) {
			return obj.getOtherParty();
		}

		@Override
		public void setValue(AccountParties5 obj, List<ExtendedParty2> value) {
			obj.setOtherParty(value);
		}
	};
	@XmlElement(name = "Grntr")
	protected List<InvestmentAccountOwnershipInformation5> granter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
	 * InvestmentAccountOwnershipInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Grantor Grantor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Granter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Granter role in the hedge funds industry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>> mmGranter = new MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>>() {
		{
			businessComponentTrace_lazy = () -> Grantor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "Grntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Granter";
			definition = "Granter role in the hedge funds industry.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation5.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation5> getValue(AccountParties5 obj) {
			return obj.getGranter();
		}

		@Override
		public void setValue(AccountParties5 obj, List<InvestmentAccountOwnershipInformation5> value) {
			obj.setGranter(value);
		}
	};
	@XmlElement(name = "Sttlr")
	protected List<InvestmentAccountOwnershipInformation5> settler;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5
	 * InvestmentAccountOwnershipInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlor Settlor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sttlr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settler"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settler role in the hedge funds industry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>> mmSettler = new MMMessageAssociationEnd<AccountParties5, List<InvestmentAccountOwnershipInformation5>>() {
		{
			businessComponentTrace_lazy = () -> Settlor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			isDerived = false;
			xmlTag = "Sttlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settler";
			definition = "Settler role in the hedge funds industry.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation5.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation5> getValue(AccountParties5 obj) {
			return obj.getSettler();
		}

		@Override
		public void setValue(AccountParties5 obj, List<InvestmentAccountOwnershipInformation5> value) {
			obj.setSettler(value);
		}
	};
	/**
	 * At least one occurrence of one and only one message element in the list
	 * (PrimaryOwner, Trustee, CustodianForMinor, Nominee, JointOwner) must be
	 * present. The chosen message element may be repeated, if repetitive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmPrimaryOwner
	 * AccountParties5.mmPrimaryOwner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmTrustee
	 * AccountParties5.mmTrustee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmCustodianForMinor
	 * AccountParties5.mmCustodianForMinor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties5#mmNominee
	 * AccountParties5.mmNominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties5#mmJointOwner
	 * AccountParties5.mmJointOwner}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of one and only one message element in the list (PrimaryOwner, Trustee, CustodianForMinor, Nominee, JointOwner) must be present. The chosen message element may be repeated, if repetitive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor AccountOwnerRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "At least one occurrence of one and only one message element in the list (PrimaryOwner, Trustee, CustodianForMinor, Nominee, JointOwner) must be present. The chosen message element may be repeated, if repetitive.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.AccountParties5.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties5.mmPrimaryOwner, com.tools20022.repository.msg.AccountParties5.mmTrustee,
					com.tools20022.repository.msg.AccountParties5.mmCustodianForMinor, com.tools20022.repository.msg.AccountParties5.mmNominee, com.tools20022.repository.msg.AccountParties5.mmJointOwner);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties5.mmPrimaryOwner, com.tools20022.repository.msg.AccountParties5.mmTrustee,
						com.tools20022.repository.msg.AccountParties5.mmCustodianForMinor, com.tools20022.repository.msg.AccountParties5.mmNominee, com.tools20022.repository.msg.AccountParties5.mmJointOwner,
						com.tools20022.repository.msg.AccountParties5.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties5.mmBeneficiary, com.tools20022.repository.msg.AccountParties5.mmPowerOfAttorney,
						com.tools20022.repository.msg.AccountParties5.mmLegalGuardian, com.tools20022.repository.msg.AccountParties5.mmSuccessorOnDeath, com.tools20022.repository.msg.AccountParties5.mmAdministrator,
						com.tools20022.repository.msg.AccountParties5.mmOtherParty, com.tools20022.repository.msg.AccountParties5.mmGranter, com.tools20022.repository.msg.AccountParties5.mmSettler);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV02.mmAccountParties, AccountOpeningInstructionV02.mmAccountParties);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBeneficiaryRule.forAccountParties5, com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule.forAccountParties5,
						com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties5);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AccountParties5";
				definition = "Any party who is related to an investment account.";
				nextVersions_lazy = () -> Arrays.asList(AccountParties6.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties5.AccountOwnerRule);
			}
		});
		return mmObject_lazy.get();
	}

	public InvestmentAccountOwnershipInformation5 getPrimaryOwner() {
		return primaryOwner;
	}

	public AccountParties5 setPrimaryOwner(InvestmentAccountOwnershipInformation5 primaryOwner) {
		this.primaryOwner = Objects.requireNonNull(primaryOwner);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation5> getTrustee() {
		return trustee == null ? trustee = new ArrayList<>() : trustee;
	}

	public AccountParties5 setTrustee(List<InvestmentAccountOwnershipInformation5> trustee) {
		this.trustee = Objects.requireNonNull(trustee);
		return this;
	}

	public InvestmentAccountOwnershipInformation5 getCustodianForMinor() {
		return custodianForMinor;
	}

	public AccountParties5 setCustodianForMinor(InvestmentAccountOwnershipInformation5 custodianForMinor) {
		this.custodianForMinor = Objects.requireNonNull(custodianForMinor);
		return this;
	}

	public InvestmentAccountOwnershipInformation5 getNominee() {
		return nominee;
	}

	public AccountParties5 setNominee(InvestmentAccountOwnershipInformation5 nominee) {
		this.nominee = Objects.requireNonNull(nominee);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation5> getJointOwner() {
		return jointOwner == null ? jointOwner = new ArrayList<>() : jointOwner;
	}

	public AccountParties5 setJointOwner(List<InvestmentAccountOwnershipInformation5> jointOwner) {
		this.jointOwner = Objects.requireNonNull(jointOwner);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation5> getSecondaryOwner() {
		return secondaryOwner == null ? secondaryOwner = new ArrayList<>() : secondaryOwner;
	}

	public AccountParties5 setSecondaryOwner(List<InvestmentAccountOwnershipInformation5> secondaryOwner) {
		this.secondaryOwner = Objects.requireNonNull(secondaryOwner);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation5> getBeneficiary() {
		return beneficiary == null ? beneficiary = new ArrayList<>() : beneficiary;
	}

	public AccountParties5 setBeneficiary(List<InvestmentAccountOwnershipInformation5> beneficiary) {
		this.beneficiary = Objects.requireNonNull(beneficiary);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation5> getPowerOfAttorney() {
		return powerOfAttorney == null ? powerOfAttorney = new ArrayList<>() : powerOfAttorney;
	}

	public AccountParties5 setPowerOfAttorney(List<InvestmentAccountOwnershipInformation5> powerOfAttorney) {
		this.powerOfAttorney = Objects.requireNonNull(powerOfAttorney);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation5> getLegalGuardian() {
		return legalGuardian == null ? legalGuardian = new ArrayList<>() : legalGuardian;
	}

	public AccountParties5 setLegalGuardian(List<InvestmentAccountOwnershipInformation5> legalGuardian) {
		this.legalGuardian = Objects.requireNonNull(legalGuardian);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation5> getSuccessorOnDeath() {
		return successorOnDeath == null ? successorOnDeath = new ArrayList<>() : successorOnDeath;
	}

	public AccountParties5 setSuccessorOnDeath(List<InvestmentAccountOwnershipInformation5> successorOnDeath) {
		this.successorOnDeath = Objects.requireNonNull(successorOnDeath);
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation5> getAdministrator() {
		return administrator == null ? Optional.empty() : Optional.of(administrator);
	}

	public AccountParties5 setAdministrator(InvestmentAccountOwnershipInformation5 administrator) {
		this.administrator = administrator;
		return this;
	}

	public List<ExtendedParty2> getOtherParty() {
		return otherParty == null ? otherParty = new ArrayList<>() : otherParty;
	}

	public AccountParties5 setOtherParty(List<ExtendedParty2> otherParty) {
		this.otherParty = Objects.requireNonNull(otherParty);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation5> getGranter() {
		return granter == null ? granter = new ArrayList<>() : granter;
	}

	public AccountParties5 setGranter(List<InvestmentAccountOwnershipInformation5> granter) {
		this.granter = Objects.requireNonNull(granter);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation5> getSettler() {
		return settler == null ? settler = new ArrayList<>() : settler;
	}

	public AccountParties5 setSettler(List<InvestmentAccountOwnershipInformation5> settler) {
		this.settler = Objects.requireNonNull(settler);
		return this;
	}
}
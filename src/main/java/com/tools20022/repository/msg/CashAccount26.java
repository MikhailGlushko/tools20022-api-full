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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.InvestmentAccountType1Choice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountIdentificationAndName3;
import com.tools20022.repository.msg.BranchData;
import com.tools20022.repository.msg.GenericIdentification46;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account to or from which a cash entry is made.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount26#mmIdentification
 * CashAccount26.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountOwner
 * CashAccount26.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountServicer
 * CashAccount26.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountServicerBranch
 * CashAccount26.mmAccountServicerBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmInvestmentAccountType
 * CashAccount26.mmInvestmentAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountOwnerOtherIdentification
 * CashAccount26.mmAccountOwnerOtherIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccount26"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a cash entry is made."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount32 CashAccount32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CashAccount4
 * CashAccount4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashAccount26", propOrder = {"identification", "accountOwner", "accountServicer", "accountServicerBranch", "investmentAccountType", "accountOwnerOtherIdentification"})
public class CashAccount26 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected AccountIdentificationAndName3 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName3
	 * AccountIdentificationAndName3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26 CashAccount26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount32#mmIdentification
	 * CashAccount32.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmIdentification
	 * CashAccount33.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount26, AccountIdentificationAndName3> mmIdentification = new MMMessageAttribute<CashAccount26, AccountIdentificationAndName3>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount26.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(CashAccount32.mmIdentification, CashAccount33.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentificationAndName3.mmObject();
		}

		@Override
		public AccountIdentificationAndName3 getValue(CashAccount26 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(CashAccount26 obj, AccountIdentificationAndName3 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification2Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26 CashAccount26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount32#mmAccountOwner
	 * CashAccount32.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmAccountOwner
	 * CashAccount33.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount26, Optional<PartyIdentification2Choice>> mmAccountOwner = new MMMessageAssociationEnd<CashAccount26, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount26.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(CashAccount32.mmAccountOwner, CashAccount33.mmAccountOwner);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(CashAccount26 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(CashAccount26 obj, Optional<PartyIdentification2Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected PartyIdentification2Choice accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26 CashAccount26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount32#mmAccountServicer
	 * CashAccount32.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmAccountServicer
	 * CashAccount33.mmAccountServicer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount26, Optional<PartyIdentification2Choice>> mmAccountServicer = new MMMessageAssociationEnd<CashAccount26, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount26.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			nextVersions_lazy = () -> Arrays.asList(CashAccount32.mmAccountServicer, CashAccount33.mmAccountServicer);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(CashAccount26 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(CashAccount26 obj, Optional<PartyIdentification2Choice> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcrBrnch")
	protected BranchData accountServicerBranch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BranchData
	 * BranchData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmBranch
	 * Organisation.mmBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26 CashAccount26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrBrnch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying a specific branch of a financial institution.\n\nUsage: this component should be used in case the identification information in the financial institution component does not provide identification up to branch level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount32#mmAccountServicerBranch
	 * CashAccount32.mmAccountServicerBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmAccountServicerBranch
	 * CashAccount33.mmAccountServicerBranch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount26, Optional<BranchData>> mmAccountServicerBranch = new MMMessageAttribute<CashAccount26, Optional<BranchData>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmBranch;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount26.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrBrnch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerBranch";
			definition = "Information identifying a specific branch of a financial institution.\n\nUsage: this component should be used in case the identification information in the financial institution component does not provide identification up to branch level.";
			nextVersions_lazy = () -> Arrays.asList(CashAccount32.mmAccountServicerBranch, CashAccount33.mmAccountServicerBranch);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BranchData.mmObject();
		}

		@Override
		public Optional<BranchData> getValue(CashAccount26 obj) {
			return obj.getAccountServicerBranch();
		}

		@Override
		public void setValue(CashAccount26 obj, Optional<BranchData> value) {
			obj.setAccountServicerBranch(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtAcctTp")
	protected InvestmentAccountType1Choice investmentAccountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountType1Choice
	 * InvestmentAccountType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedInvestmentAccount
	 * CashAccount.mmRelatedInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26 CashAccount26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, ISA."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmInvestmentAccountType
	 * CashAccount33.mmInvestmentAccountType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount26, Optional<InvestmentAccountType1Choice>> mmInvestmentAccountType = new MMMessageAttribute<CashAccount26, Optional<InvestmentAccountType1Choice>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmRelatedInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount26.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountType";
			definition = "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, ISA.";
			nextVersions_lazy = () -> Arrays.asList(CashAccount33.mmInvestmentAccountType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccountType1Choice.mmObject();
		}

		@Override
		public Optional<InvestmentAccountType1Choice> getValue(CashAccount26 obj) {
			return obj.getInvestmentAccountType();
		}

		@Override
		public void setValue(CashAccount26 obj, Optional<InvestmentAccountType1Choice> value) {
			obj.setInvestmentAccountType(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnrOthrId")
	protected List<GenericIdentification46> accountOwnerOtherIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification46
	 * GenericIdentification46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccount26 CashAccount26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrOthrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerOtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other identification such as national registration identification number, passport number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmAccountOwnerOtherIdentification
	 * CashAccount33.mmAccountOwnerOtherIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount26, List<GenericIdentification46>> mmAccountOwnerOtherIdentification = new MMMessageAttribute<CashAccount26, List<GenericIdentification46>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashAccount26.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrOthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerOtherIdentification";
			definition = "Other identification such as national registration identification number, passport number.";
			nextVersions_lazy = () -> Arrays.asList(CashAccount33.mmAccountOwnerOtherIdentification);
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification46.mmObject();
		}

		@Override
		public List<GenericIdentification46> getValue(CashAccount26 obj) {
			return obj.getAccountOwnerOtherIdentification();
		}

		@Override
		public void setValue(CashAccount26 obj, List<GenericIdentification46> value) {
			obj.setAccountOwnerOtherIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount26.mmIdentification, com.tools20022.repository.msg.CashAccount26.mmAccountOwner,
						com.tools20022.repository.msg.CashAccount26.mmAccountServicer, com.tools20022.repository.msg.CashAccount26.mmAccountServicerBranch, com.tools20022.repository.msg.CashAccount26.mmInvestmentAccountType,
						com.tools20022.repository.msg.CashAccount26.mmAccountOwnerOtherIdentification);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccount26";
				definition = "Account to or from which a cash entry is made.";
				nextVersions_lazy = () -> Arrays.asList(CashAccount32.mmObject(), CashAccount33.mmObject());
				previousVersion_lazy = () -> CashAccount4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentificationAndName3 getIdentification() {
		return identification;
	}

	public CashAccount26 setIdentification(AccountIdentificationAndName3 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<PartyIdentification2Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public CashAccount26 setAccountOwner(PartyIdentification2Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<PartyIdentification2Choice> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public CashAccount26 setAccountServicer(PartyIdentification2Choice accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public Optional<BranchData> getAccountServicerBranch() {
		return accountServicerBranch == null ? Optional.empty() : Optional.of(accountServicerBranch);
	}

	public CashAccount26 setAccountServicerBranch(BranchData accountServicerBranch) {
		this.accountServicerBranch = accountServicerBranch;
		return this;
	}

	public Optional<InvestmentAccountType1Choice> getInvestmentAccountType() {
		return investmentAccountType == null ? Optional.empty() : Optional.of(investmentAccountType);
	}

	public CashAccount26 setInvestmentAccountType(InvestmentAccountType1Choice investmentAccountType) {
		this.investmentAccountType = investmentAccountType;
		return this;
	}

	public List<GenericIdentification46> getAccountOwnerOtherIdentification() {
		return accountOwnerOtherIdentification == null ? accountOwnerOtherIdentification = new ArrayList<>() : accountOwnerOtherIdentification;
	}

	public CashAccount26 setAccountOwnerOtherIdentification(List<GenericIdentification46> accountOwnerOtherIdentification) {
		this.accountOwnerOtherIdentification = Objects.requireNonNull(accountOwnerOtherIdentification);
		return this;
	}
}
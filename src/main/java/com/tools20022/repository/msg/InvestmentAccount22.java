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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code;
import com.tools20022.repository.codeset.FormOfSecurity1Code;
import com.tools20022.repository.codeset.IncomePreference1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountIdentification1;
import com.tools20022.repository.msg.Intermediary11;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account between an investor(s) and a fund manager or a fund. The account can
 * contain holdings in any investment fund or investment fund class managed (or
 * distributed) by the fund manager, within the same fund family.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmOwnerIdentification
 * InvestmentAccount22.mmOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmAccountIdentification
 * InvestmentAccount22.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmAccountName
 * InvestmentAccount22.mmAccountName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmAccountDesignation
 * InvestmentAccount22.mmAccountDesignation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmIntermediaryInformation
 * InvestmentAccount22.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmSecuritiesForm
 * InvestmentAccount22.mmSecuritiesForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmDematerialisedIndicator
 * InvestmentAccount22.mmDematerialisedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmIncomePreference
 * InvestmentAccount22.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmBeneficiaryCertificationCompletion
 * InvestmentAccount22.mmBeneficiaryCertificationCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmSafekeepingPlace
 * InvestmentAccount22.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmAccountServicer
 * InvestmentAccount22.mmAccountServicer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02#mmAccountDetails
 * TransferInConfirmationV02.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03#mmAccountDetails
 * TransferInConfirmationV03.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#mmAccountDetails
 * TransferInConfirmationV04.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02#mmAccountDetails
 * TransferInInstructionV02.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03#mmAccountDetails
 * TransferInInstructionV03.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04#mmAccountDetails
 * TransferInInstructionV04.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02#mmAccountDetails
 * TransferOutConfirmationV02.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03#mmAccountDetails
 * TransferOutConfirmationV03.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04#mmAccountDetails
 * TransferOutConfirmationV04.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02#mmAccountDetails
 * TransferOutInstructionV02.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03#mmAccountDetails
 * TransferOutInstructionV03.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04#mmAccountDetails
 * TransferOutInstructionV04.mmAccountDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccount22"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount40
 * InvestmentAccount40}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccount22", propOrder = {"ownerIdentification", "accountIdentification", "accountName", "accountDesignation", "intermediaryInformation", "securitiesForm", "dematerialisedIndicator", "incomePreference",
		"beneficiaryCertificationCompletion", "safekeepingPlace", "accountServicer"})
public class InvestmentAccount22 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OwnrId")
	protected List<PartyIdentification2Choice> ownerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22
	 * InvestmentAccount22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnerIdentification"</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmOwnerIdentification
	 * InvestmentAccount40.mmOwnerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount22, List<PartyIdentification2Choice>> mmOwnerIdentification = new MMMessageAttribute<InvestmentAccount22, List<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount22.mmObject();
			isDerived = false;
			xmlTag = "OwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnerIdentification";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount40.mmOwnerIdentification);
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public List<PartyIdentification2Choice> getValue(InvestmentAccount22 obj) {
			return obj.getOwnerIdentification();
		}

		@Override
		public void setValue(InvestmentAccount22 obj, List<PartyIdentification2Choice> value) {
			obj.setOwnerIdentification(value);
		}
	};
	@XmlElement(name = "AcctId", required = true)
	protected AccountIdentification1 accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification1
	 * AccountIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22
	 * InvestmentAccount22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmAccountIdentification
	 * InvestmentAccount40.mmAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount22, AccountIdentification1> mmAccountIdentification = new MMMessageAttribute<InvestmentAccount22, AccountIdentification1>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount22.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount40.mmAccountIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification1.mmObject();
		}

		@Override
		public AccountIdentification1 getValue(InvestmentAccount22 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(InvestmentAccount22 obj, AccountIdentification1 value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "AcctNm")
	protected Max35Text accountName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22
	 * InvestmentAccount22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmAccountName
	 * InvestmentAccount40.mmAccountName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount22, Optional<Max35Text>> mmAccountName = new MMMessageAttribute<InvestmentAccount22, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount22.mmObject();
			isDerived = false;
			xmlTag = "AcctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountName";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount40.mmAccountName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentAccount22 obj) {
			return obj.getAccountName();
		}

		@Override
		public void setValue(InvestmentAccount22 obj, Optional<Max35Text> value) {
			obj.setAccountName(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctDsgnt")
	protected Max35Text accountDesignation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDesignation
	 * InvestmentAccount.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22
	 * InvestmentAccount22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDsgnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDesignation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmAccountDesignation
	 * InvestmentAccount40.mmAccountDesignation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount22, Optional<Max35Text>> mmAccountDesignation = new MMMessageAttribute<InvestmentAccount22, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmDesignation;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount22.mmObject();
			isDerived = false;
			xmlTag = "AcctDsgnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDesignation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount40.mmAccountDesignation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentAccount22 obj) {
			return obj.getAccountDesignation();
		}

		@Override
		public void setValue(InvestmentAccount22 obj, Optional<Max35Text> value) {
			obj.setAccountDesignation(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyInf")
	protected List<Intermediary11> intermediaryInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary11
	 * Intermediary11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryRole
	 * IntermediaryRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22
	 * InvestmentAccount22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that provides services relating to financial products to investors, eg, advice on products and placement of orders for the investment fund."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmIntermediaryInformation
	 * InvestmentAccount40.mmIntermediaryInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccount22, List<Intermediary11>> mmIntermediaryInformation = new MMMessageAssociationEnd<InvestmentAccount22, List<Intermediary11>>() {
		{
			businessComponentTrace_lazy = () -> IntermediaryRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount22.mmObject();
			isDerived = false;
			xmlTag = "IntrmyInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryInformation";
			definition = "Party that provides services relating to financial products to investors, eg, advice on products and placement of orders for the investment fund.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount40.mmIntermediaryInformation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary11.mmObject();
		}

		@Override
		public List<Intermediary11> getValue(InvestmentAccount22 obj) {
			return obj.getIntermediaryInformation();
		}

		@Override
		public void setValue(InvestmentAccount22 obj, List<Intermediary11> value) {
			obj.setIntermediaryInformation(value);
		}
	};
	@XmlElement(name = "SctiesForm")
	protected FormOfSecurity1Code securitiesForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurity1Code
	 * FormOfSecurity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
	 * Security.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22
	 * InvestmentAccount22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesForm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form, ie, ownership, of the security, eg, registered or bearer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmSecuritiesForm
	 * InvestmentAccount40.mmSecuritiesForm}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount22, Optional<FormOfSecurity1Code>> mmSecuritiesForm = new MMMessageAttribute<InvestmentAccount22, Optional<FormOfSecurity1Code>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount22.mmObject();
			isDerived = false;
			xmlTag = "SctiesForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesForm";
			definition = "Form, ie, ownership, of the security, eg, registered or bearer.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount40.mmSecuritiesForm);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FormOfSecurity1Code.mmObject();
		}

		@Override
		public Optional<FormOfSecurity1Code> getValue(InvestmentAccount22 obj) {
			return obj.getSecuritiesForm();
		}

		@Override
		public void setValue(InvestmentAccount22 obj, Optional<FormOfSecurity1Code> value) {
			obj.setSecuritiesForm(value.orElse(null));
		}
	};
	@XmlElement(name = "DmtrlsdInd")
	protected YesNoIndicator dematerialisedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDematerialisedIndicator
	 * Security.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22
	 * InvestmentAccount22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmtrlsdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmDematerialisedIndicator
	 * InvestmentAccount40.mmDematerialisedIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount22, Optional<YesNoIndicator>> mmDematerialisedIndicator = new MMMessageAttribute<InvestmentAccount22, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Security.mmDematerialisedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount22.mmObject();
			isDerived = false;
			xmlTag = "DmtrlsdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DematerialisedIndicator";
			definition = "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount40.mmDematerialisedIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvestmentAccount22 obj) {
			return obj.getDematerialisedIndicator();
		}

		@Override
		public void setValue(InvestmentAccount22 obj, Optional<YesNoIndicator> value) {
			obj.setDematerialisedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmPref")
	protected IncomePreference1Code incomePreference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference1Code
	 * IncomePreference1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22
	 * InvestmentAccount22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPref"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmIncomePreference
	 * InvestmentAccount40.mmIncomePreference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount22, Optional<IncomePreference1Code>> mmIncomePreference = new MMMessageAttribute<InvestmentAccount22, Optional<IncomePreference1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount22.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount40.mmIncomePreference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}

		@Override
		public Optional<IncomePreference1Code> getValue(InvestmentAccount22 obj) {
			return obj.getIncomePreference();
		}

		@Override
		public void setValue(InvestmentAccount22 obj, Optional<IncomePreference1Code> value) {
			obj.setIncomePreference(value.orElse(null));
		}
	};
	@XmlElement(name = "BnfcryCertfctnCmpltn")
	protected BeneficiaryCertificationCompletion1Code beneficiaryCertificationCompletion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code
	 * BeneficiaryCertificationCompletion1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmBeneficiaryCertificationCompletion
	 * InvestmentAccountService.mmBeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22
	 * InvestmentAccount22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryCertfctnCmpltn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryCertificationCompletion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmBeneficiaryCertificationCompletion
	 * InvestmentAccount40.mmBeneficiaryCertificationCompletion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount22, Optional<BeneficiaryCertificationCompletion1Code>> mmBeneficiaryCertificationCompletion = new MMMessageAttribute<InvestmentAccount22, Optional<BeneficiaryCertificationCompletion1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmBeneficiaryCertificationCompletion;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount22.mmObject();
			isDerived = false;
			xmlTag = "BnfcryCertfctnCmpltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryCertificationCompletion";
			definition = "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount40.mmBeneficiaryCertificationCompletion);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BeneficiaryCertificationCompletion1Code.mmObject();
		}

		@Override
		public Optional<BeneficiaryCertificationCompletion1Code> getValue(InvestmentAccount22 obj) {
			return obj.getBeneficiaryCertificationCompletion();
		}

		@Override
		public void setValue(InvestmentAccount22 obj, Optional<BeneficiaryCertificationCompletion1Code> value) {
			obj.setBeneficiaryCertificationCompletion(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected PartyIdentification2Choice safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22
	 * InvestmentAccount22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place requested as the place of safekeeping."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmSafekeepingPlace
	 * InvestmentAccount40.mmSafekeepingPlace}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount22, Optional<PartyIdentification2Choice>> mmSafekeepingPlace = new MMMessageAttribute<InvestmentAccount22, Optional<PartyIdentification2Choice>>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount22.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place requested as the place of safekeeping.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount40.mmSafekeepingPlace);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(InvestmentAccount22 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(InvestmentAccount22 obj, Optional<PartyIdentification2Choice> value) {
			obj.setSafekeepingPlace(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected PartyIdentification2Choice accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22
	 * InvestmentAccount22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party related to an account that is not the legal account owner, eg, the power of attorney."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmAccountServicer
	 * InvestmentAccount40.mmAccountServicer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount22, Optional<PartyIdentification2Choice>> mmAccountServicer = new MMMessageAttribute<InvestmentAccount22, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount22.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party related to an account that is not the legal account owner, eg, the power of attorney.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount40.mmAccountServicer);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(InvestmentAccount22 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(InvestmentAccount22 obj, Optional<PartyIdentification2Choice> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount22.mmOwnerIdentification, com.tools20022.repository.msg.InvestmentAccount22.mmAccountIdentification,
						com.tools20022.repository.msg.InvestmentAccount22.mmAccountName, com.tools20022.repository.msg.InvestmentAccount22.mmAccountDesignation, com.tools20022.repository.msg.InvestmentAccount22.mmIntermediaryInformation,
						com.tools20022.repository.msg.InvestmentAccount22.mmSecuritiesForm, com.tools20022.repository.msg.InvestmentAccount22.mmDematerialisedIndicator, com.tools20022.repository.msg.InvestmentAccount22.mmIncomePreference,
						com.tools20022.repository.msg.InvestmentAccount22.mmBeneficiaryCertificationCompletion, com.tools20022.repository.msg.InvestmentAccount22.mmSafekeepingPlace,
						com.tools20022.repository.msg.InvestmentAccount22.mmAccountServicer);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferInConfirmationV02.mmAccountDetails, TransferInConfirmationV03.mmAccountDetails, TransferInConfirmationV04.mmAccountDetails, TransferInInstructionV02.mmAccountDetails,
						TransferInInstructionV03.mmAccountDetails, TransferInInstructionV04.mmAccountDetails, TransferOutConfirmationV02.mmAccountDetails, TransferOutConfirmationV03.mmAccountDetails,
						TransferOutConfirmationV04.mmAccountDetails, TransferOutInstructionV02.mmAccountDetails, TransferOutInstructionV03.mmAccountDetails, TransferOutInstructionV04.mmAccountDetails);
				trace_lazy = () -> InvestmentAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccount22";
				definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentAccount40.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<PartyIdentification2Choice> getOwnerIdentification() {
		return ownerIdentification == null ? ownerIdentification = new ArrayList<>() : ownerIdentification;
	}

	public InvestmentAccount22 setOwnerIdentification(List<PartyIdentification2Choice> ownerIdentification) {
		this.ownerIdentification = Objects.requireNonNull(ownerIdentification);
		return this;
	}

	public AccountIdentification1 getAccountIdentification() {
		return accountIdentification;
	}

	public InvestmentAccount22 setAccountIdentification(AccountIdentification1 accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public Optional<Max35Text> getAccountName() {
		return accountName == null ? Optional.empty() : Optional.of(accountName);
	}

	public InvestmentAccount22 setAccountName(Max35Text accountName) {
		this.accountName = accountName;
		return this;
	}

	public Optional<Max35Text> getAccountDesignation() {
		return accountDesignation == null ? Optional.empty() : Optional.of(accountDesignation);
	}

	public InvestmentAccount22 setAccountDesignation(Max35Text accountDesignation) {
		this.accountDesignation = accountDesignation;
		return this;
	}

	public List<Intermediary11> getIntermediaryInformation() {
		return intermediaryInformation == null ? intermediaryInformation = new ArrayList<>() : intermediaryInformation;
	}

	public InvestmentAccount22 setIntermediaryInformation(List<Intermediary11> intermediaryInformation) {
		this.intermediaryInformation = Objects.requireNonNull(intermediaryInformation);
		return this;
	}

	public Optional<FormOfSecurity1Code> getSecuritiesForm() {
		return securitiesForm == null ? Optional.empty() : Optional.of(securitiesForm);
	}

	public InvestmentAccount22 setSecuritiesForm(FormOfSecurity1Code securitiesForm) {
		this.securitiesForm = securitiesForm;
		return this;
	}

	public Optional<YesNoIndicator> getDematerialisedIndicator() {
		return dematerialisedIndicator == null ? Optional.empty() : Optional.of(dematerialisedIndicator);
	}

	public InvestmentAccount22 setDematerialisedIndicator(YesNoIndicator dematerialisedIndicator) {
		this.dematerialisedIndicator = dematerialisedIndicator;
		return this;
	}

	public Optional<IncomePreference1Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public InvestmentAccount22 setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<BeneficiaryCertificationCompletion1Code> getBeneficiaryCertificationCompletion() {
		return beneficiaryCertificationCompletion == null ? Optional.empty() : Optional.of(beneficiaryCertificationCompletion);
	}

	public InvestmentAccount22 setBeneficiaryCertificationCompletion(BeneficiaryCertificationCompletion1Code beneficiaryCertificationCompletion) {
		this.beneficiaryCertificationCompletion = beneficiaryCertificationCompletion;
		return this;
	}

	public Optional<PartyIdentification2Choice> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public InvestmentAccount22 setSafekeepingPlace(PartyIdentification2Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public Optional<PartyIdentification2Choice> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public InvestmentAccount22 setAccountServicer(PartyIdentification2Choice accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}
}
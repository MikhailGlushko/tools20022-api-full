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
import com.tools20022.repository.choice.MoneyLaunderingCheck1Choice;
import com.tools20022.repository.choice.Party14Choice;
import com.tools20022.repository.codeset.InformationDistribution1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MiFIDClassification1;
import com.tools20022.repository.msg.ModificationScope14;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics of the ownership of an investment account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmParty
 * InvestmentAccountOwnershipInformation7.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmMoneyLaunderingCheck
 * InvestmentAccountOwnershipInformation7.mmMoneyLaunderingCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmOwnershipBeneficiaryRate
 * InvestmentAccountOwnershipInformation7.mmOwnershipBeneficiaryRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmClientIdentification
 * InvestmentAccountOwnershipInformation7.mmClientIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmFiscalExemption
 * InvestmentAccountOwnershipInformation7.mmFiscalExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmSignatoryRightIndicator
 * InvestmentAccountOwnershipInformation7.mmSignatoryRightIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmModifiedInvestorProfileValidation
 * InvestmentAccountOwnershipInformation7.mmModifiedInvestorProfileValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmMiFIDClassification
 * InvestmentAccountOwnershipInformation7.mmMiFIDClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmInformationDistribution
 * InvestmentAccountOwnershipInformation7.mmInformationDistribution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccountOwnershipInformation7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of the ownership of an investment account."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8
 * InvestmentAccountOwnershipInformation8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
 * InvestmentAccountOwnershipInformation4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccountOwnershipInformation7", propOrder = {"party", "moneyLaunderingCheck", "ownershipBeneficiaryRate", "clientIdentification", "fiscalExemption", "signatoryRightIndicator", "modifiedInvestorProfileValidation",
		"miFIDClassification", "informationDistribution"})
public class InvestmentAccountOwnershipInformation7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pty", required = true)
	protected Party14Choice party;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Party14Choice Party14Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the organisation or individual person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmParty
	 * InvestmentAccountOwnershipInformation8.mmParty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation7, Party14Choice> mmParty = new MMMessageAttribute<InvestmentAccountOwnershipInformation7, Party14Choice>() {
		{
			businessComponentTrace_lazy = () -> Party.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Information about the organisation or individual person.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation8.mmParty);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Party14Choice.mmObject();
		}

		@Override
		public Party14Choice getValue(InvestmentAccountOwnershipInformation7 obj) {
			return obj.getParty();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation7 obj, Party14Choice value) {
			obj.setParty(value);
		}
	};
	@XmlElement(name = "MnyLndrgChck")
	protected MoneyLaunderingCheck1Choice moneyLaunderingCheck;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MoneyLaunderingCheck1Choice
	 * MoneyLaunderingCheck1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
	 * Party.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnyLndrgChck"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of an identity check to prevent money laundering. This includes the counter-terrorism check."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation8.mmMoneyLaunderingCheck}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<MoneyLaunderingCheck1Choice>> mmMoneyLaunderingCheck = new MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<MoneyLaunderingCheck1Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
			isDerived = false;
			xmlTag = "MnyLndrgChck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation8.mmMoneyLaunderingCheck);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MoneyLaunderingCheck1Choice.mmObject();
		}

		@Override
		public Optional<MoneyLaunderingCheck1Choice> getValue(InvestmentAccountOwnershipInformation7 obj) {
			return obj.getMoneyLaunderingCheck();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation7 obj, Optional<MoneyLaunderingCheck1Choice> value) {
			obj.setMoneyLaunderingCheck(value.orElse(null));
		}
	};
	@XmlElement(name = "OwnrshBnfcryRate")
	protected PercentageRate ownershipBeneficiaryRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmOwnershipBeneficiaryRate
	 * InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnrshBnfcryRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipBeneficiaryRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of ownership or beneficiary ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation8.mmOwnershipBeneficiaryRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<PercentageRate>> mmOwnershipBeneficiaryRate = new MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
			isDerived = false;
			xmlTag = "OwnrshBnfcryRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnershipBeneficiaryRate";
			definition = "Percentage of ownership or beneficiary ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation8.mmOwnershipBeneficiaryRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(InvestmentAccountOwnershipInformation7 obj) {
			return obj.getOwnershipBeneficiaryRate();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation7 obj, Optional<PercentageRate> value) {
			obj.setOwnershipBeneficiaryRate(value.orElse(null));
		}
	};
	@XmlElement(name = "ClntId")
	protected Max35Text clientIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by an organisation, to unambiguously identify a party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmClientIdentification
	 * InvestmentAccountOwnershipInformation8.mmClientIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<Max35Text>> mmClientIdentification = new MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
			isDerived = false;
			xmlTag = "ClntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientIdentification";
			definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation8.mmClientIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentAccountOwnershipInformation7 obj) {
			return obj.getClientIdentification();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation7 obj, Optional<Max35Text> value) {
			obj.setClientIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FsclXmptn")
	protected YesNoIndicator fiscalExemption;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmFiscalExemption
	 * InvestmentFundTax.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FsclXmptn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalExemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an owner of an investment account may benefit from a fiscal exemption or amnesty for instance for declaring overseas investments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation8.mmFiscalExemption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<YesNoIndicator>> mmFiscalExemption = new MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmFiscalExemption;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
			isDerived = false;
			xmlTag = "FsclXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalExemption";
			definition = "Indicates whether an owner of an investment account may benefit from a fiscal exemption or amnesty for instance for declaring overseas investments.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation8.mmFiscalExemption);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvestmentAccountOwnershipInformation7 obj) {
			return obj.getFiscalExemption();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation7 obj, Optional<YesNoIndicator> value) {
			obj.setFiscalExemption(value.orElse(null));
		}
	};
	@XmlElement(name = "SgntryRghtInd")
	protected YesNoIndicator signatoryRightIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignatoryRightIndicator
	 * SignatureCondition.mmSignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntryRghtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatoryRightIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account owner signature is required to authorise transactions on the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmSignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation8.mmSignatoryRightIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<YesNoIndicator>> mmSignatoryRightIndicator = new MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmSignatoryRightIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
			isDerived = false;
			xmlTag = "SgntryRghtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatoryRightIndicator";
			definition = "Indicates whether the account owner signature is required to authorise transactions on the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation8.mmSignatoryRightIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvestmentAccountOwnershipInformation7 obj) {
			return obj.getSignatoryRightIndicator();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation7 obj, Optional<YesNoIndicator> value) {
			obj.setSignatoryRightIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ModfdInvstrPrflVldtn")
	protected List<ModificationScope14> modifiedInvestorProfileValidation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ModificationScope14
	 * ModificationScope14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmProfileCertification
	 * PersonProfile.mmProfileCertification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdInvstrPrflVldtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedInvestorProfileValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the party profile to be inserted or deleted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmModifiedInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation8.
	 * mmModifiedInvestorProfileValidation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation7, List<ModificationScope14>> mmModifiedInvestorProfileValidation = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation7, List<ModificationScope14>>() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmProfileCertification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
			isDerived = false;
			xmlTag = "ModfdInvstrPrflVldtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedInvestorProfileValidation";
			definition = "Information related to the party profile to be inserted or deleted.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation8.mmModifiedInvestorProfileValidation);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ModificationScope14.mmObject();
		}

		@Override
		public List<ModificationScope14> getValue(InvestmentAccountOwnershipInformation7 obj) {
			return obj.getModifiedInvestorProfileValidation();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation7 obj, List<ModificationScope14> value) {
			obj.setModifiedInvestorProfileValidation(value);
		}
	};
	@XmlElement(name = "MiFIDClssfctn")
	protected MiFIDClassification1 miFIDClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MiFIDClassification1
	 * MiFIDClassification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MiFIDClssfctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiFIDClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details about the MiFID classification of the account owner."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmMiFIDClassification
	 * InvestmentAccountOwnershipInformation8.mmMiFIDClassification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<MiFIDClassification1>> mmMiFIDClassification = new MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<MiFIDClassification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
			isDerived = false;
			xmlTag = "MiFIDClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiFIDClassification";
			definition = "Details about the MiFID classification of the account owner.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation8.mmMiFIDClassification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MiFIDClassification1.mmObject();
		}

		@Override
		public Optional<MiFIDClassification1> getValue(InvestmentAccountOwnershipInformation7 obj) {
			return obj.getMiFIDClassification();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation7 obj, Optional<MiFIDClassification1> value) {
			obj.setMiFIDClassification(value.orElse(null));
		}
	};
	@XmlElement(name = "InfDstrbtn")
	protected InformationDistribution1Code informationDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InformationDistribution1Code
	 * InformationDistribution1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfDstrbtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how information is sent to the account holder."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmInformationDistribution
	 * InvestmentAccountOwnershipInformation8.mmInformationDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<InformationDistribution1Code>> mmInformationDistribution = new MMMessageAttribute<InvestmentAccountOwnershipInformation7, Optional<InformationDistribution1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
			isDerived = false;
			xmlTag = "InfDstrbtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationDistribution";
			definition = "Specifies how information is sent to the account holder.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation8.mmInformationDistribution);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InformationDistribution1Code.mmObject();
		}

		@Override
		public Optional<InformationDistribution1Code> getValue(InvestmentAccountOwnershipInformation7 obj) {
			return obj.getInformationDistribution();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation7 obj, Optional<InformationDistribution1Code> value) {
			obj.setInformationDistribution(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmParty, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmMoneyLaunderingCheck,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmOwnershipBeneficiaryRate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmClientIdentification,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmFiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmSignatoryRightIndicator,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmModifiedInvestorProfileValidation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmMiFIDClassification,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmInformationDistribution);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountOwnershipInformation7";
				definition = "Characteristics of the ownership of an investment account.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation8.mmObject());
				previousVersion_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Party14Choice getParty() {
		return party;
	}

	public InvestmentAccountOwnershipInformation7 setParty(Party14Choice party) {
		this.party = Objects.requireNonNull(party);
		return this;
	}

	public Optional<MoneyLaunderingCheck1Choice> getMoneyLaunderingCheck() {
		return moneyLaunderingCheck == null ? Optional.empty() : Optional.of(moneyLaunderingCheck);
	}

	public InvestmentAccountOwnershipInformation7 setMoneyLaunderingCheck(MoneyLaunderingCheck1Choice moneyLaunderingCheck) {
		this.moneyLaunderingCheck = moneyLaunderingCheck;
		return this;
	}

	public Optional<PercentageRate> getOwnershipBeneficiaryRate() {
		return ownershipBeneficiaryRate == null ? Optional.empty() : Optional.of(ownershipBeneficiaryRate);
	}

	public InvestmentAccountOwnershipInformation7 setOwnershipBeneficiaryRate(PercentageRate ownershipBeneficiaryRate) {
		this.ownershipBeneficiaryRate = ownershipBeneficiaryRate;
		return this;
	}

	public Optional<Max35Text> getClientIdentification() {
		return clientIdentification == null ? Optional.empty() : Optional.of(clientIdentification);
	}

	public InvestmentAccountOwnershipInformation7 setClientIdentification(Max35Text clientIdentification) {
		this.clientIdentification = clientIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getFiscalExemption() {
		return fiscalExemption == null ? Optional.empty() : Optional.of(fiscalExemption);
	}

	public InvestmentAccountOwnershipInformation7 setFiscalExemption(YesNoIndicator fiscalExemption) {
		this.fiscalExemption = fiscalExemption;
		return this;
	}

	public Optional<YesNoIndicator> getSignatoryRightIndicator() {
		return signatoryRightIndicator == null ? Optional.empty() : Optional.of(signatoryRightIndicator);
	}

	public InvestmentAccountOwnershipInformation7 setSignatoryRightIndicator(YesNoIndicator signatoryRightIndicator) {
		this.signatoryRightIndicator = signatoryRightIndicator;
		return this;
	}

	public List<ModificationScope14> getModifiedInvestorProfileValidation() {
		return modifiedInvestorProfileValidation == null ? modifiedInvestorProfileValidation = new ArrayList<>() : modifiedInvestorProfileValidation;
	}

	public InvestmentAccountOwnershipInformation7 setModifiedInvestorProfileValidation(List<ModificationScope14> modifiedInvestorProfileValidation) {
		this.modifiedInvestorProfileValidation = Objects.requireNonNull(modifiedInvestorProfileValidation);
		return this;
	}

	public Optional<MiFIDClassification1> getMiFIDClassification() {
		return miFIDClassification == null ? Optional.empty() : Optional.of(miFIDClassification);
	}

	public InvestmentAccountOwnershipInformation7 setMiFIDClassification(MiFIDClassification1 miFIDClassification) {
		this.miFIDClassification = miFIDClassification;
		return this;
	}

	public Optional<InformationDistribution1Code> getInformationDistribution() {
		return informationDistribution == null ? Optional.empty() : Optional.of(informationDistribution);
	}

	public InvestmentAccountOwnershipInformation7 setInformationDistribution(InformationDistribution1Code informationDistribution) {
		this.informationDistribution = informationDistribution;
		return this;
	}
}
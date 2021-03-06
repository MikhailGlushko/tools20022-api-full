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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateAndDateTimeSearch2Choice;
import com.tools20022.repository.choice.PriorityNumeric1Choice;
import com.tools20022.repository.choice.QuantitySearch1Choice;
import com.tools20022.repository.choice.References36Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria based on which information is included.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmReferences
 * IntraPositionQueryCriteria1.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmStatus
 * IntraPositionQueryCriteria1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmFinancialInstrumentIdentification
 * IntraPositionQueryCriteria1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmSafekeepingAccountOwner
 * IntraPositionQueryCriteria1.mmSafekeepingAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmSafekeepingAccount
 * IntraPositionQueryCriteria1.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmBalanceType
 * IntraPositionQueryCriteria1.mmBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmSecuritiesSubBalanceIdentification
 * IntraPositionQueryCriteria1.mmSecuritiesSubBalanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmSettlementQuantity
 * IntraPositionQueryCriteria1.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmSettledQuantity
 * IntraPositionQueryCriteria1.mmSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmIntendedSettlementDate
 * IntraPositionQueryCriteria1.mmIntendedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmEffectiveSettlementDate
 * IntraPositionQueryCriteria1.mmEffectiveSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmPriority
 * IntraPositionQueryCriteria1.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmCountryOfIssue
 * IntraPositionQueryCriteria1.mmCountryOfIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmMessageOriginator
 * IntraPositionQueryCriteria1.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmCreationDateTime
 * IntraPositionQueryCriteria1.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionQueryCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria based on which information is included."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6
 * IntraPositionQueryCriteria6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraPositionQueryCriteria1", propOrder = {"references", "status", "financialInstrumentIdentification", "safekeepingAccountOwner", "safekeepingAccount", "balanceType", "securitiesSubBalanceIdentification",
		"settlementQuantity", "settledQuantity", "intendedSettlementDate", "effectiveSettlementDate", "priority", "countryOfIssue", "messageOriginator", "creationDateTime"})
public class IntraPositionQueryCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Refs")
	protected List<References36Choice> references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.References36Choice
	 * References36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
	 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::POOL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmReferences
	 * IntraPositionQueryCriteria6.mmReferences}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionQueryCriteria1, List<References36Choice>> mmReferences = new MMMessageAttribute<IntraPositionQueryCriteria1, List<References36Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Refs";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::POOL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Collective reference identifying a set of messages.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmReferences);
			minOccurs = 0;
			complexType_lazy = () -> References36Choice.mmObject();
		}

		@Override
		public List<References36Choice> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getReferences();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, List<References36Choice> value) {
			obj.setReferences(value);
		}
	};
	@XmlElement(name = "Sts")
	protected IntraPositionQueryStatus1 status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryStatus1
	 * IntraPositionQueryStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmStatus
	 * SecuritiesTransfer.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of settlement of a transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmStatus
	 * IntraPositionQueryCriteria6.mmStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionQueryCriteria1, Optional<IntraPositionQueryStatus1>> mmStatus = new MMMessageAttribute<IntraPositionQueryCriteria1, Optional<IntraPositionQueryStatus1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Provides the status of settlement of a transaction.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmStatus);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IntraPositionQueryStatus1.mmObject();
		}

		@Override
		public Optional<IntraPositionQueryStatus1> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, Optional<IntraPositionQueryStatus1> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected List<SecurityIdentification14> financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmFinancialInstrumentIdentification
	 * IntraPositionQueryCriteria6.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionQueryCriteria1, List<SecurityIdentification14>> mmFinancialInstrumentIdentification = new MMMessageAttribute<IntraPositionQueryCriteria1, List<SecurityIdentification14>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmFinancialInstrumentIdentification);
			minOccurs = 0;
			complexType_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public List<SecurityIdentification14> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, List<SecurityIdentification14> value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "SfkpgAcctOwnr")
	protected List<SystemPartyIdentification5> safekeepingAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5
	 * SystemPartyIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.System#mmPartyRole
	 * System.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmSafekeepingAccountOwner
	 * IntraPositionQueryCriteria6.mmSafekeepingAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionQueryCriteria1, List<SystemPartyIdentification5>> mmSafekeepingAccountOwner = new MMMessageAssociationEnd<IntraPositionQueryCriteria1, List<SystemPartyIdentification5>>() {
		{
			businessElementTrace_lazy = () -> System.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountOwner";
			definition = "Party that owns the account.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmSafekeepingAccountOwner);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification5.mmObject();
		}

		@Override
		public List<SystemPartyIdentification5> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getSafekeepingAccountOwner();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, List<SystemPartyIdentification5> value) {
			obj.setSafekeepingAccountOwner(value);
		}
	};
	@XmlElement(name = "SfkpgAcct")
	protected List<SecuritiesAccount13> safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmAccount
	 * SecuritiesTransfer.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmSafekeepingAccount
	 * IntraPositionQueryCriteria6.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionQueryCriteria1, List<SecuritiesAccount13>> mmSafekeepingAccount = new MMMessageAssociationEnd<IntraPositionQueryCriteria1, List<SecuritiesAccount13>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmSafekeepingAccount);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public List<SecuritiesAccount13> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, List<SecuritiesAccount13> value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "BalTp")
	protected List<IntraPositionType1> balanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IntraPositionType1
	 * IntraPositionType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmSecuritiesBalance
	 * IntraPositionTransfer.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance to which the amount of money is moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::TOBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmBalanceType
	 * IntraPositionQueryCriteria6.mmBalanceType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionQueryCriteria1, List<IntraPositionType1>> mmBalanceType = new MMMessageAssociationEnd<IntraPositionQueryCriteria1, List<IntraPositionType1>>() {
		{
			businessElementTrace_lazy = () -> IntraPositionTransfer.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "BalTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::TOBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceType";
			definition = "Balance to which the amount of money is moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmBalanceType);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IntraPositionType1.mmObject();
		}

		@Override
		public List<IntraPositionType1> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getBalanceType();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, List<IntraPositionType1> value) {
			obj.setBalanceType(value);
		}
	};
	@XmlElement(name = "SctiesSubBalId")
	protected List<GenericIdentification37> securitiesSubBalanceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification37
	 * GenericIdentification37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSubBalId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSubBalanceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number identifying a lot constituting the sub-balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmSecuritiesSubBalanceIdentification
	 * IntraPositionQueryCriteria6.mmSecuritiesSubBalanceIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionQueryCriteria1, List<GenericIdentification37>> mmSecuritiesSubBalanceIdentification = new MMMessageAssociationEnd<IntraPositionQueryCriteria1, List<GenericIdentification37>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SctiesSubBalId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSubBalanceIdentification";
			definition = "Number identifying a lot constituting the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmSecuritiesSubBalanceIdentification);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification37.mmObject();
		}

		@Override
		public List<GenericIdentification37> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getSecuritiesSubBalanceIdentification();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, List<GenericIdentification37> value) {
			obj.setSecuritiesSubBalanceIdentification(value);
		}
	};
	@XmlElement(name = "SttlmQty")
	protected QuantitySearch1Choice settlementQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.QuantitySearch1Choice
	 * QuantitySearch1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities to be settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmSettlementQuantity
	 * IntraPositionQueryCriteria6.mmSettlementQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionQueryCriteria1, Optional<QuantitySearch1Choice>> mmSettlementQuantity = new MMMessageAssociationEnd<IntraPositionQueryCriteria1, Optional<QuantitySearch1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SttlmQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmSettlementQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QuantitySearch1Choice.mmObject();
		}

		@Override
		public Optional<QuantitySearch1Choice> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getSettlementQuantity();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, Optional<QuantitySearch1Choice> value) {
			obj.setSettlementQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "SttldQty")
	protected QuantitySearch1Choice settledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.QuantitySearch1Choice
	 * QuantitySearch1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument effectively settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmSettledQuantity
	 * IntraPositionQueryCriteria6.mmSettledQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionQueryCriteria1, Optional<QuantitySearch1Choice>> mmSettledQuantity = new MMMessageAssociationEnd<IntraPositionQueryCriteria1, Optional<QuantitySearch1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SttldQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledQuantity";
			definition = "Quantity of financial instrument effectively settled.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmSettledQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QuantitySearch1Choice.mmObject();
		}

		@Override
		public Optional<QuantitySearch1Choice> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getSettledQuantity();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, Optional<QuantitySearch1Choice> value) {
			obj.setSettledQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "IntnddSttlmDt")
	protected DateAndDateTimeSearch2Choice intendedSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch2Choice
	 * DateAndDateTimeSearch2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntnddSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntendedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are intended to be moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmIntendedSettlementDate
	 * IntraPositionQueryCriteria6.mmIntendedSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionQueryCriteria1, Optional<DateAndDateTimeSearch2Choice>> mmIntendedSettlementDate = new MMMessageAttribute<IntraPositionQueryCriteria1, Optional<DateAndDateTimeSearch2Choice>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "IntnddSttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntendedSettlementDate";
			definition = "Date and time at which the securities are intended to be moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmIntendedSettlementDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeSearch2Choice> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getIntendedSettlementDate();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, Optional<DateAndDateTimeSearch2Choice> value) {
			obj.setIntendedSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FctvSttlmDt")
	protected DateAndDateTimeSearch2Choice effectiveSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch2Choice
	 * DateAndDateTimeSearch2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the securities are moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::EXSE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmEffectiveSettlementDate
	 * IntraPositionQueryCriteria6.mmEffectiveSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionQueryCriteria1, Optional<DateAndDateTimeSearch2Choice>> mmEffectiveSettlementDate = new MMMessageAttribute<IntraPositionQueryCriteria1, Optional<DateAndDateTimeSearch2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FctvSttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EXSE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDate";
			definition = "Date and time at which the securities are moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmEffectiveSettlementDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeSearch2Choice> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getEffectiveSettlementDate();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, Optional<DateAndDateTimeSearch2Choice> value) {
			obj.setEffectiveSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Prty")
	protected List<PriorityNumeric1Choice> priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric1Choice
	 * PriorityNumeric1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmPriority
	 * IntraPositionQueryCriteria6.mmPriority}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionQueryCriteria1, List<PriorityNumeric1Choice>> mmPriority = new MMMessageAttribute<IntraPositionQueryCriteria1, List<PriorityNumeric1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmPriority);
			minOccurs = 0;
			complexType_lazy = () -> PriorityNumeric1Choice.mmObject();
		}

		@Override
		public List<PriorityNumeric1Choice> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, List<PriorityNumeric1Choice> value) {
			obj.setPriority(value);
		}
	};
	@XmlElement(name = "CtryOfIsse")
	protected List<CountryCode> countryOfIssue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfIsse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Primary market or country where a security is issued by the issuer or its agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 470</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmCountryOfIssue
	 * IntraPositionQueryCriteria6.mmCountryOfIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionQueryCriteria1, List<CountryCode>> mmCountryOfIssue = new MMMessageAttribute<IntraPositionQueryCriteria1, List<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIsse";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "470"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Primary market or country where a security is issued by the issuer or its agent.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmCountryOfIssue);
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public List<CountryCode> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getCountryOfIssue();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, List<CountryCode> value) {
			obj.setCountryOfIssue(value);
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected List<SystemPartyIdentification5> messageOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5
	 * SystemPartyIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgOrgtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that originated the message, if other than the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmMessageOriginator
	 * IntraPositionQueryCriteria6.mmMessageOriginator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionQueryCriteria1, List<SystemPartyIdentification5>> mmMessageOriginator = new MMMessageAssociationEnd<IntraPositionQueryCriteria1, List<SystemPartyIdentification5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmMessageOriginator);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification5.mmObject();
		}

		@Override
		public List<SystemPartyIdentification5> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getMessageOriginator();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, List<SystemPartyIdentification5> value) {
			obj.setMessageOriginator(value);
		}
	};
	@XmlElement(name = "CreDtTm")
	protected DateAndDateTimeSearch2Choice creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch2Choice
	 * DateAndDateTimeSearch2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
	 * IntraPositionQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the creation date/time of the intra-position movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria6#mmCreationDateTime
	 * IntraPositionQueryCriteria6.mmCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionQueryCriteria1, Optional<DateAndDateTimeSearch2Choice>> mmCreationDateTime = new MMMessageAttribute<IntraPositionQueryCriteria1, Optional<DateAndDateTimeSearch2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Specifies the creation date/time of the intra-position movement.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmCreationDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeSearch2Choice> getValue(IntraPositionQueryCriteria1 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(IntraPositionQueryCriteria1 obj, Optional<DateAndDateTimeSearch2Choice> value) {
			obj.setCreationDateTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmReferences, com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmStatus,
						com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmSafekeepingAccountOwner,
						com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmSafekeepingAccount, com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmBalanceType,
						com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmSecuritiesSubBalanceIdentification, com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmSettlementQuantity,
						com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmIntendedSettlementDate,
						com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmEffectiveSettlementDate, com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmPriority,
						com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmCountryOfIssue, com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmMessageOriginator,
						com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmCreationDateTime);
				trace_lazy = () -> IntraPositionTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraPositionQueryCriteria1";
				definition = "Defines the criteria based on which information is included.";
				nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryCriteria6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<References36Choice> getReferences() {
		return references == null ? references = new ArrayList<>() : references;
	}

	public IntraPositionQueryCriteria1 setReferences(List<References36Choice> references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public Optional<IntraPositionQueryStatus1> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public IntraPositionQueryCriteria1 setStatus(IntraPositionQueryStatus1 status) {
		this.status = status;
		return this;
	}

	public List<SecurityIdentification14> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? financialInstrumentIdentification = new ArrayList<>() : financialInstrumentIdentification;
	}

	public IntraPositionQueryCriteria1 setFinancialInstrumentIdentification(List<SecurityIdentification14> financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public List<SystemPartyIdentification5> getSafekeepingAccountOwner() {
		return safekeepingAccountOwner == null ? safekeepingAccountOwner = new ArrayList<>() : safekeepingAccountOwner;
	}

	public IntraPositionQueryCriteria1 setSafekeepingAccountOwner(List<SystemPartyIdentification5> safekeepingAccountOwner) {
		this.safekeepingAccountOwner = Objects.requireNonNull(safekeepingAccountOwner);
		return this;
	}

	public List<SecuritiesAccount13> getSafekeepingAccount() {
		return safekeepingAccount == null ? safekeepingAccount = new ArrayList<>() : safekeepingAccount;
	}

	public IntraPositionQueryCriteria1 setSafekeepingAccount(List<SecuritiesAccount13> safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public List<IntraPositionType1> getBalanceType() {
		return balanceType == null ? balanceType = new ArrayList<>() : balanceType;
	}

	public IntraPositionQueryCriteria1 setBalanceType(List<IntraPositionType1> balanceType) {
		this.balanceType = Objects.requireNonNull(balanceType);
		return this;
	}

	public List<GenericIdentification37> getSecuritiesSubBalanceIdentification() {
		return securitiesSubBalanceIdentification == null ? securitiesSubBalanceIdentification = new ArrayList<>() : securitiesSubBalanceIdentification;
	}

	public IntraPositionQueryCriteria1 setSecuritiesSubBalanceIdentification(List<GenericIdentification37> securitiesSubBalanceIdentification) {
		this.securitiesSubBalanceIdentification = Objects.requireNonNull(securitiesSubBalanceIdentification);
		return this;
	}

	public Optional<QuantitySearch1Choice> getSettlementQuantity() {
		return settlementQuantity == null ? Optional.empty() : Optional.of(settlementQuantity);
	}

	public IntraPositionQueryCriteria1 setSettlementQuantity(QuantitySearch1Choice settlementQuantity) {
		this.settlementQuantity = settlementQuantity;
		return this;
	}

	public Optional<QuantitySearch1Choice> getSettledQuantity() {
		return settledQuantity == null ? Optional.empty() : Optional.of(settledQuantity);
	}

	public IntraPositionQueryCriteria1 setSettledQuantity(QuantitySearch1Choice settledQuantity) {
		this.settledQuantity = settledQuantity;
		return this;
	}

	public Optional<DateAndDateTimeSearch2Choice> getIntendedSettlementDate() {
		return intendedSettlementDate == null ? Optional.empty() : Optional.of(intendedSettlementDate);
	}

	public IntraPositionQueryCriteria1 setIntendedSettlementDate(DateAndDateTimeSearch2Choice intendedSettlementDate) {
		this.intendedSettlementDate = intendedSettlementDate;
		return this;
	}

	public Optional<DateAndDateTimeSearch2Choice> getEffectiveSettlementDate() {
		return effectiveSettlementDate == null ? Optional.empty() : Optional.of(effectiveSettlementDate);
	}

	public IntraPositionQueryCriteria1 setEffectiveSettlementDate(DateAndDateTimeSearch2Choice effectiveSettlementDate) {
		this.effectiveSettlementDate = effectiveSettlementDate;
		return this;
	}

	public List<PriorityNumeric1Choice> getPriority() {
		return priority == null ? priority = new ArrayList<>() : priority;
	}

	public IntraPositionQueryCriteria1 setPriority(List<PriorityNumeric1Choice> priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public List<CountryCode> getCountryOfIssue() {
		return countryOfIssue == null ? countryOfIssue = new ArrayList<>() : countryOfIssue;
	}

	public IntraPositionQueryCriteria1 setCountryOfIssue(List<CountryCode> countryOfIssue) {
		this.countryOfIssue = Objects.requireNonNull(countryOfIssue);
		return this;
	}

	public List<SystemPartyIdentification5> getMessageOriginator() {
		return messageOriginator == null ? messageOriginator = new ArrayList<>() : messageOriginator;
	}

	public IntraPositionQueryCriteria1 setMessageOriginator(List<SystemPartyIdentification5> messageOriginator) {
		this.messageOriginator = Objects.requireNonNull(messageOriginator);
		return this;
	}

	public Optional<DateAndDateTimeSearch2Choice> getCreationDateTime() {
		return creationDateTime == null ? Optional.empty() : Optional.of(creationDateTime);
	}

	public IntraPositionQueryCriteria1 setCreationDateTime(DateAndDateTimeSearch2Choice creationDateTime) {
		this.creationDateTime = creationDateTime;
		return this;
	}
}
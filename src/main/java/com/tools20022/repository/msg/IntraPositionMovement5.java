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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.IntraPositionTransfer;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IntraPositionMovement6;
import com.tools20022.repository.msg.IntraPositionStatusAndReason2;
import com.tools20022.repository.msg.SecuritiesAccount19;
import com.tools20022.repository.msg.SystemPartyIdentification6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the details of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5#mmAccountOwner
 * IntraPositionMovement5.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5#mmSafekeepingAccount
 * IntraPositionMovement5.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5#mmStatusAndReason
 * IntraPositionMovement5.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5#mmAccountOwnerTransactionIdentification
 * IntraPositionMovement5.mmAccountOwnerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5#mmAccountServicerTransactionIdentification
 * IntraPositionMovement5.mmAccountServicerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5#mmMarketInfrastructureTransactionIdentification
 * IntraPositionMovement5.mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5#mmProcessorTransactionIdentification
 * IntraPositionMovement5.mmProcessorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5#mmPoolIdentification
 * IntraPositionMovement5.mmPoolIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5#mmCorporateActionEventIdentification
 * IntraPositionMovement5.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5#mmMovementDetails
 * IntraPositionMovement5.mmMovementDetails}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraPositionMovement5
 * ConstraintNoAccountOwnerTransactionIdentificationRule.
 * forIntraPositionMovement5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionMovement5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the details of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement3
 * IntraPositionMovement3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraPositionMovement5", propOrder = {"accountOwner", "safekeepingAccount", "statusAndReason", "accountOwnerTransactionIdentification", "accountServicerTransactionIdentification",
		"marketInfrastructureTransactionIdentification", "processorTransactionIdentification", "poolIdentification", "corporateActionEventIdentification", "movementDetails"})
public class IntraPositionMovement5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctOwnr")
	protected SystemPartyIdentification6 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification6
	 * SystemPartyIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.System#mmPartyRole
	 * System.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5
	 * IntraPositionMovement5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement3#mmAccountOwner
	 * IntraPositionMovement3.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovement5, Optional<SystemPartyIdentification6>> mmAccountOwner = new MMMessageAssociationEnd<IntraPositionMovement5, Optional<SystemPartyIdentification6>>() {
		{
			businessElementTrace_lazy = () -> System.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement5.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that owns the account.";
			previousVersion_lazy = () -> IntraPositionMovement3.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification6.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification6> getValue(IntraPositionMovement5 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(IntraPositionMovement5 obj, Optional<SystemPartyIdentification6> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct")
	protected SecuritiesAccount19 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5
	 * IntraPositionMovement5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement3#mmSafekeepingAccount
	 * IntraPositionMovement3.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovement5, Optional<SecuritiesAccount19>> mmSafekeepingAccount = new MMMessageAssociationEnd<IntraPositionMovement5, Optional<SecuritiesAccount19>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement5.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			previousVersion_lazy = () -> IntraPositionMovement3.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount19.mmObject();
		}

		@Override
		public Optional<SecuritiesAccount19> getValue(IntraPositionMovement5 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(IntraPositionMovement5 obj, Optional<SecuritiesAccount19> value) {
			obj.setSafekeepingAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "StsAndRsn")
	protected IntraPositionStatusAndReason2 statusAndReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusAndReason2
	 * IntraPositionStatusAndReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5
	 * IntraPositionMovement5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsAndRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:STAT [and 16R:REAS]</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status and status reason of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement3#mmStatusAndReason
	 * IntraPositionMovement3.mmStatusAndReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovement5, Optional<IntraPositionStatusAndReason2>> mmStatusAndReason = new MMMessageAssociationEnd<IntraPositionMovement5, Optional<IntraPositionStatusAndReason2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement5.mmObject();
			isDerived = false;
			xmlTag = "StsAndRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:STAT [and 16R:REAS]"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReason";
			definition = "Status and status reason of the transaction.";
			previousVersion_lazy = () -> IntraPositionMovement3.mmStatusAndReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IntraPositionStatusAndReason2.mmObject();
		}

		@Override
		public Optional<IntraPositionStatusAndReason2> getValue(IntraPositionMovement5 obj) {
			return obj.getStatusAndReason();
		}

		@Override
		public void setValue(IntraPositionMovement5 obj, Optional<IntraPositionStatusAndReason2> value) {
			obj.setStatusAndReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnrTxId", required = true)
	protected Max35Text accountOwnerTransactionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5
	 * IntraPositionMovement5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement3#mmAccountOwnerTransactionIdentification
	 * IntraPositionMovement3.mmAccountOwnerTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement5, Max35Text> mmAccountOwnerTransactionIdentification = new MMMessageAttribute<IntraPositionMovement5, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement5.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account).";
			previousVersion_lazy = () -> IntraPositionMovement3.mmAccountOwnerTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IntraPositionMovement5 obj) {
			return obj.getAccountOwnerTransactionIdentification();
		}

		@Override
		public void setValue(IntraPositionMovement5 obj, Max35Text value) {
			obj.setAccountOwnerTransactionIdentification(value);
		}
	};
	@XmlElement(name = "AcctSvcrTxId")
	protected Max35Text accountServicerTransactionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5
	 * IntraPositionMovement5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::ASRF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement3#mmAccountServicerTransactionIdentification
	 * IntraPositionMovement3.mmAccountServicerTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement5, Optional<Max35Text>> mmAccountServicerTransactionIdentification = new MMMessageAttribute<IntraPositionMovement5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement5.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::ASRF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account servicer.";
			previousVersion_lazy = () -> IntraPositionMovement3.mmAccountServicerTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraPositionMovement5 obj) {
			return obj.getAccountServicerTransactionIdentification();
		}

		@Override
		public void setValue(IntraPositionMovement5 obj, Optional<Max35Text> value) {
			obj.setAccountServicerTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MktInfrstrctrTxId")
	protected Max35Text marketInfrastructureTransactionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5
	 * IntraPositionMovement5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktInfrstrctrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::MITI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructureTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement3#mmMarketInfrastructureTransactionIdentification
	 * IntraPositionMovement3.mmMarketInfrastructureTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement5, Optional<Max35Text>> mmMarketInfrastructureTransactionIdentification = new MMMessageAttribute<IntraPositionMovement5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement5.mmObject();
			isDerived = false;
			xmlTag = "MktInfrstrctrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::MITI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities.";
			previousVersion_lazy = () -> IntraPositionMovement3.mmMarketInfrastructureTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraPositionMovement5 obj) {
			return obj.getMarketInfrastructureTransactionIdentification();
		}

		@Override
		public void setValue(IntraPositionMovement5 obj, Optional<Max35Text> value) {
			obj.setMarketInfrastructureTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcrTxId")
	protected Max35Text processorTransactionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5
	 * IntraPositionMovement5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessorTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction as assigned by the processor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement3#mmProcessorTransactionIdentification
	 * IntraPositionMovement3.mmProcessorTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement5, Optional<Max35Text>> mmProcessorTransactionIdentification = new MMMessageAttribute<IntraPositionMovement5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement5.mmObject();
			isDerived = false;
			xmlTag = "PrcrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessorTransactionIdentification";
			definition = "Identification of the transaction as assigned by the processor.";
			previousVersion_lazy = () -> IntraPositionMovement3.mmProcessorTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraPositionMovement5 obj) {
			return obj.getProcessorTransactionIdentification();
		}

		@Override
		public void setValue(IntraPositionMovement5 obj, Optional<Max35Text> value) {
			obj.setProcessorTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PoolId")
	protected Max35Text poolIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5
	 * IntraPositionMovement5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::POOL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement3#mmPoolIdentification
	 * IntraPositionMovement3.mmPoolIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement5, Optional<Max35Text>> mmPoolIdentification = new MMMessageAttribute<IntraPositionMovement5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement5.mmObject();
			isDerived = false;
			xmlTag = "PoolId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::POOL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
			previousVersion_lazy = () -> IntraPositionMovement3.mmPoolIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraPositionMovement5 obj) {
			return obj.getPoolIdentification();
		}

		@Override
		public void setValue(IntraPositionMovement5 obj, Optional<Max35Text> value) {
			obj.setPoolIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnEvtId")
	protected Max35Text corporateActionEventIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5
	 * IntraPositionMovement5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::CORP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the account servicer to unambiguously identify a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement3#mmCorporateActionEventIdentification
	 * IntraPositionMovement3.mmCorporateActionEventIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement5, Optional<Max35Text>> mmCorporateActionEventIdentification = new MMMessageAttribute<IntraPositionMovement5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement5.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::CORP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Identification assigned by the account servicer to unambiguously identify a corporate action event.";
			previousVersion_lazy = () -> IntraPositionMovement3.mmCorporateActionEventIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraPositionMovement5 obj) {
			return obj.getCorporateActionEventIdentification();
		}

		@Override
		public void setValue(IntraPositionMovement5 obj, Optional<Max35Text> value) {
			obj.setCorporateActionEventIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MvmntDtls")
	protected IntraPositionMovement6 movementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IntraPositionMovement6
	 * IntraPositionMovement6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement5
	 * IntraPositionMovement5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:TRANSDET</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies additional details of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement3#mmMovementDetails
	 * IntraPositionMovement3.mmMovementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovement5, Optional<IntraPositionMovement6>> mmMovementDetails = new MMMessageAssociationEnd<IntraPositionMovement5, Optional<IntraPositionMovement6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement5.mmObject();
			isDerived = false;
			xmlTag = "MvmntDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:TRANSDET"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementDetails";
			definition = "Identifies additional details of the transaction.";
			previousVersion_lazy = () -> IntraPositionMovement3.mmMovementDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IntraPositionMovement6.mmObject();
		}

		@Override
		public Optional<IntraPositionMovement6> getValue(IntraPositionMovement5 obj) {
			return obj.getMovementDetails();
		}

		@Override
		public void setValue(IntraPositionMovement5 obj, Optional<IntraPositionMovement6> value) {
			obj.setMovementDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraPositionMovement5.mmAccountOwner, com.tools20022.repository.msg.IntraPositionMovement5.mmSafekeepingAccount,
						com.tools20022.repository.msg.IntraPositionMovement5.mmStatusAndReason, com.tools20022.repository.msg.IntraPositionMovement5.mmAccountOwnerTransactionIdentification,
						com.tools20022.repository.msg.IntraPositionMovement5.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.IntraPositionMovement5.mmMarketInfrastructureTransactionIdentification,
						com.tools20022.repository.msg.IntraPositionMovement5.mmProcessorTransactionIdentification, com.tools20022.repository.msg.IntraPositionMovement5.mmPoolIdentification,
						com.tools20022.repository.msg.IntraPositionMovement5.mmCorporateActionEventIdentification, com.tools20022.repository.msg.IntraPositionMovement5.mmMovementDetails);
				trace_lazy = () -> IntraPositionTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraPositionMovement5);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraPositionMovement5";
				definition = "Identifies the details of the transaction.";
				previousVersion_lazy = () -> IntraPositionMovement3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SystemPartyIdentification6> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public IntraPositionMovement5 setAccountOwner(SystemPartyIdentification6 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<SecuritiesAccount19> getSafekeepingAccount() {
		return safekeepingAccount == null ? Optional.empty() : Optional.of(safekeepingAccount);
	}

	public IntraPositionMovement5 setSafekeepingAccount(SecuritiesAccount19 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
		return this;
	}

	public Optional<IntraPositionStatusAndReason2> getStatusAndReason() {
		return statusAndReason == null ? Optional.empty() : Optional.of(statusAndReason);
	}

	public IntraPositionMovement5 setStatusAndReason(IntraPositionStatusAndReason2 statusAndReason) {
		this.statusAndReason = statusAndReason;
		return this;
	}

	public Max35Text getAccountOwnerTransactionIdentification() {
		return accountOwnerTransactionIdentification;
	}

	public IntraPositionMovement5 setAccountOwnerTransactionIdentification(Max35Text accountOwnerTransactionIdentification) {
		this.accountOwnerTransactionIdentification = Objects.requireNonNull(accountOwnerTransactionIdentification);
		return this;
	}

	public Optional<Max35Text> getAccountServicerTransactionIdentification() {
		return accountServicerTransactionIdentification == null ? Optional.empty() : Optional.of(accountServicerTransactionIdentification);
	}

	public IntraPositionMovement5 setAccountServicerTransactionIdentification(Max35Text accountServicerTransactionIdentification) {
		this.accountServicerTransactionIdentification = accountServicerTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getMarketInfrastructureTransactionIdentification() {
		return marketInfrastructureTransactionIdentification == null ? Optional.empty() : Optional.of(marketInfrastructureTransactionIdentification);
	}

	public IntraPositionMovement5 setMarketInfrastructureTransactionIdentification(Max35Text marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = marketInfrastructureTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getProcessorTransactionIdentification() {
		return processorTransactionIdentification == null ? Optional.empty() : Optional.of(processorTransactionIdentification);
	}

	public IntraPositionMovement5 setProcessorTransactionIdentification(Max35Text processorTransactionIdentification) {
		this.processorTransactionIdentification = processorTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getPoolIdentification() {
		return poolIdentification == null ? Optional.empty() : Optional.of(poolIdentification);
	}

	public IntraPositionMovement5 setPoolIdentification(Max35Text poolIdentification) {
		this.poolIdentification = poolIdentification;
		return this;
	}

	public Optional<Max35Text> getCorporateActionEventIdentification() {
		return corporateActionEventIdentification == null ? Optional.empty() : Optional.of(corporateActionEventIdentification);
	}

	public IntraPositionMovement5 setCorporateActionEventIdentification(Max35Text corporateActionEventIdentification) {
		this.corporateActionEventIdentification = corporateActionEventIdentification;
		return this;
	}

	public Optional<IntraPositionMovement6> getMovementDetails() {
		return movementDetails == null ? Optional.empty() : Optional.of(movementDetails);
	}

	public IntraPositionMovement5 setMovementDetails(IntraPositionMovement6 movementDetails) {
		this.movementDetails = movementDetails;
		return this;
	}
}
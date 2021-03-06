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
import com.tools20022.repository.choice.ProcessingStatus69Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount24;
import com.tools20022.repository.msg.IntraBalance3;
import com.tools20022.repository.msg.References14;
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
 * Provides the details of the cancellation requests.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4#mmAccountOwner
 * IntraBalanceCancellation4.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4#mmCashAccount
 * IntraBalanceCancellation4.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4#mmProcessingStatus
 * IntraBalanceCancellation4.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4#mmRequestReference
 * IntraBalanceCancellation4.mmRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4#mmStatusDate
 * IntraBalanceCancellation4.mmStatusDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4#mmTransactionIdentification
 * IntraBalanceCancellation4.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4#mmUnderlyingIntraBalance
 * IntraBalanceCancellation4.mmUnderlyingIntraBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraBalanceCancellation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the details of the cancellation requests."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2
 * IntraBalanceCancellation2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraBalanceCancellation4", propOrder = {"accountOwner", "cashAccount", "processingStatus", "requestReference", "statusDate", "transactionIdentification", "underlyingIntraBalance"})
public class IntraBalanceCancellation4 {

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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4
	 * IntraBalanceCancellation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmAccountOwner
	 * IntraBalanceCancellation2.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalanceCancellation4, Optional<SystemPartyIdentification6>> mmAccountOwner = new MMMessageAssociationEnd<IntraBalanceCancellation4, Optional<SystemPartyIdentification6>>() {
		{
			businessElementTrace_lazy = () -> System.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceCancellation4.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that owns the account.";
			previousVersion_lazy = () -> IntraBalanceCancellation2.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification6.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification6> getValue(IntraBalanceCancellation4 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(IntraBalanceCancellation4 obj, Optional<SystemPartyIdentification6> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAcct")
	protected CashAccount24 cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
	 * CashEntry.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4
	 * IntraBalanceCancellation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmCashAccount
	 * IntraBalanceCancellation2.mmCashAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalanceCancellation4, Optional<CashAccount24>> mmCashAccount = new MMMessageAssociationEnd<IntraBalanceCancellation4, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceCancellation4.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account to or from which a cash entry is made.";
			previousVersion_lazy = () -> IntraBalanceCancellation2.mmCashAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(IntraBalanceCancellation4 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(IntraBalanceCancellation4 obj, Optional<CashAccount24> value) {
			obj.setCashAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgSts")
	protected ProcessingStatus69Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus69Choice
	 * ProcessingStatus69Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
	 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4
	 * IntraBalanceCancellation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status and status reason of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:STAT [and 16R:REAS]</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmProcessingStatus
	 * IntraBalanceCancellation2.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalanceCancellation4, Optional<ProcessingStatus69Choice>> mmProcessingStatus = new MMMessageAssociationEnd<IntraBalanceCancellation4, Optional<ProcessingStatus69Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTradeStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceCancellation4.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:STAT [and 16R:REAS]"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Status and status reason of the transaction.";
			previousVersion_lazy = () -> IntraBalanceCancellation2.mmProcessingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingStatus69Choice.mmObject();
		}

		@Override
		public Optional<ProcessingStatus69Choice> getValue(IntraBalanceCancellation4 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(IntraBalanceCancellation4 obj, Optional<ProcessingStatus69Choice> value) {
			obj.setProcessingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqRef", required = true)
	protected Max35Text requestReference;
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4
	 * IntraBalanceCancellation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of the cancellation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmRequestReference
	 * IntraBalanceCancellation2.mmRequestReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceCancellation4, Max35Text> mmRequestReference = new MMMessageAttribute<IntraBalanceCancellation4, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceCancellation4.mmObject();
			isDerived = false;
			xmlTag = "ReqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestReference";
			definition = "Unambiguous identification of the cancellation request.";
			previousVersion_lazy = () -> IntraBalanceCancellation2.mmRequestReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IntraBalanceCancellation4 obj) {
			return obj.getRequestReference();
		}

		@Override
		public void setValue(IntraBalanceCancellation4 obj, Max35Text value) {
			obj.setRequestReference(value);
		}
	};
	@XmlElement(name = "StsDt")
	protected ISODateTime statusDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
	 * Status.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4
	 * IntraBalanceCancellation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the status was assigned."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmStatusDate
	 * IntraBalanceCancellation2.mmStatusDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceCancellation4, Optional<ISODateTime>> mmStatusDate = new MMMessageAttribute<IntraBalanceCancellation4, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceCancellation4.mmObject();
			isDerived = false;
			xmlTag = "StsDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDate";
			definition = "Date and time at which the status was assigned.";
			previousVersion_lazy = () -> IntraBalanceCancellation2.mmStatusDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(IntraBalanceCancellation4 obj) {
			return obj.getStatusDate();
		}

		@Override
		public void setValue(IntraBalanceCancellation4 obj, Optional<ISODateTime> value) {
			obj.setStatusDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TxId")
	protected References14 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.References14
	 * References14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4
	 * IntraBalanceCancellation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "References of the transaction for which the intra-balance modification is requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmTransactionIdentification
	 * IntraBalanceCancellation2.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceCancellation4, Optional<References14>> mmTransactionIdentification = new MMMessageAttribute<IntraBalanceCancellation4, Optional<References14>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceCancellation4.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "References of the transaction for which the intra-balance modification is requested.";
			previousVersion_lazy = () -> IntraBalanceCancellation2.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> References14.mmObject();
		}

		@Override
		public Optional<References14> getValue(IntraBalanceCancellation4 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(IntraBalanceCancellation4 obj, Optional<References14> value) {
			obj.setTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygIntraBal")
	protected IntraBalance3 underlyingIntraBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.IntraBalance3
	 * IntraBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation4
	 * IntraBalanceCancellation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygIntraBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingIntraBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies additional details of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:TRANSDET</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmUnderlyingIntraBalance
	 * IntraBalanceCancellation2.mmUnderlyingIntraBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceCancellation4, Optional<IntraBalance3>> mmUnderlyingIntraBalance = new MMMessageAttribute<IntraBalanceCancellation4, Optional<IntraBalance3>>() {
		{
			businessComponentTrace_lazy = () -> BookEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceCancellation4.mmObject();
			isDerived = false;
			xmlTag = "UndrlygIntraBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:TRANSDET"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingIntraBalance";
			definition = "Identifies additional details of the transaction.";
			previousVersion_lazy = () -> IntraBalanceCancellation2.mmUnderlyingIntraBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IntraBalance3.mmObject();
		}

		@Override
		public Optional<IntraBalance3> getValue(IntraBalanceCancellation4 obj) {
			return obj.getUnderlyingIntraBalance();
		}

		@Override
		public void setValue(IntraBalanceCancellation4 obj, Optional<IntraBalance3> value) {
			obj.setUnderlyingIntraBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraBalanceCancellation4.mmAccountOwner, com.tools20022.repository.msg.IntraBalanceCancellation4.mmCashAccount,
						com.tools20022.repository.msg.IntraBalanceCancellation4.mmProcessingStatus, com.tools20022.repository.msg.IntraBalanceCancellation4.mmRequestReference,
						com.tools20022.repository.msg.IntraBalanceCancellation4.mmStatusDate, com.tools20022.repository.msg.IntraBalanceCancellation4.mmTransactionIdentification,
						com.tools20022.repository.msg.IntraBalanceCancellation4.mmUnderlyingIntraBalance);
				trace_lazy = () -> BookEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraBalanceCancellation4";
				definition = "Provides the details of the cancellation requests.";
				previousVersion_lazy = () -> IntraBalanceCancellation2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SystemPartyIdentification6> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public IntraBalanceCancellation4 setAccountOwner(SystemPartyIdentification6 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<CashAccount24> getCashAccount() {
		return cashAccount == null ? Optional.empty() : Optional.of(cashAccount);
	}

	public IntraBalanceCancellation4 setCashAccount(CashAccount24 cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}

	public Optional<ProcessingStatus69Choice> getProcessingStatus() {
		return processingStatus == null ? Optional.empty() : Optional.of(processingStatus);
	}

	public IntraBalanceCancellation4 setProcessingStatus(ProcessingStatus69Choice processingStatus) {
		this.processingStatus = processingStatus;
		return this;
	}

	public Max35Text getRequestReference() {
		return requestReference;
	}

	public IntraBalanceCancellation4 setRequestReference(Max35Text requestReference) {
		this.requestReference = Objects.requireNonNull(requestReference);
		return this;
	}

	public Optional<ISODateTime> getStatusDate() {
		return statusDate == null ? Optional.empty() : Optional.of(statusDate);
	}

	public IntraBalanceCancellation4 setStatusDate(ISODateTime statusDate) {
		this.statusDate = statusDate;
		return this;
	}

	public Optional<References14> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public IntraBalanceCancellation4 setTransactionIdentification(References14 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public Optional<IntraBalance3> getUnderlyingIntraBalance() {
		return underlyingIntraBalance == null ? Optional.empty() : Optional.of(underlyingIntraBalance);
	}

	public IntraBalanceCancellation4 setUnderlyingIntraBalance(IntraBalance3 underlyingIntraBalance) {
		this.underlyingIntraBalance = underlyingIntraBalance;
		return this;
	}
}
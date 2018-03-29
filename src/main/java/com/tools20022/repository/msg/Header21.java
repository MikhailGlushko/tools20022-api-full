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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV01;
import com.tools20022.repository.area.caam.ATMReconciliationAdviceV01;
import com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV01;
import com.tools20022.repository.area.catp.ATMCompletionAdviceV01;
import com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01;
import com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV01;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMMessageFunction1;
import com.tools20022.repository.msg.Traceability4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the protocol management on a segment of the path from
 * the ATM to the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Header21#mmMessageFunction
 * Header21.mmMessageFunction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header21#mmProtocolVersion
 * Header21.mmProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Header21#mmExchangeIdentification
 * Header21.mmExchangeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Header21#mmReTransmissionCounter
 * Header21.mmReTransmissionCounter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header21#mmCreationDateTime
 * Header21.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header21#mmInitiatingParty
 * Header21.mmInitiatingParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header21#mmRecipientParty
 * Header21.mmRecipientParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header21#mmProcessState
 * Header21.mmProcessState}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header21#mmTraceability
 * Header21.mmTraceability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV01#mmHeader
 * ATMReconciliationAdviceV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV01#mmHeader
 * ATMReconciliationAcknowledgementV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV01#mmHeader
 * ATMCompletionAdviceV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV01#mmHeader
 * ATMCompletionAcknowledgementV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV01#mmHeader
 * ATMWithdrawalCompletionAdviceV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01#mmHeader
 * ATMWithdrawalCompletionAcknowledgementV01.mmHeader}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Header21"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the protocol management on a segment of the path from the ATM to the acquirer."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Header20
 * Header20}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Header21", propOrder = {"messageFunction", "protocolVersion", "exchangeIdentification", "reTransmissionCounter", "creationDateTime", "initiatingParty", "recipientParty", "processState", "traceability"})
public class Header21 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgFctn", required = true)
	protected ATMMessageFunction1 messageFunction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMMessageFunction1
	 * ATMMessageFunction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header21
	 * Header21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgFctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageFunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of process related to the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header20#mmMessageFunction
	 * Header20.mmMessageFunction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header21, ATMMessageFunction1> mmMessageFunction = new MMMessageAttribute<Header21, ATMMessageFunction1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header21.mmObject();
			isDerived = false;
			xmlTag = "MsgFctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageFunction";
			definition = "Identifies the type of process related to the message.";
			previousVersion_lazy = () -> Header20.mmMessageFunction;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ATMMessageFunction1.mmObject();
		}

		@Override
		public ATMMessageFunction1 getValue(Header21 obj) {
			return obj.getMessageFunction();
		}

		@Override
		public void setValue(Header21 obj, ATMMessageFunction1 value) {
			obj.setMessageFunction(value);
		}
	};
	@XmlElement(name = "PrtcolVrsn", required = true)
	protected Max6Text protocolVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header21
	 * Header21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtcolVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtocolVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the ATM protocol specifications."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header20#mmProtocolVersion
	 * Header20.mmProtocolVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header21, Max6Text> mmProtocolVersion = new MMMessageAttribute<Header21, Max6Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header21.mmObject();
			isDerived = false;
			xmlTag = "PrtcolVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtocolVersion";
			definition = "Version of the ATM protocol specifications.";
			previousVersion_lazy = () -> Header20.mmProtocolVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}

		@Override
		public Max6Text getValue(Header21 obj) {
			return obj.getProtocolVersion();
		}

		@Override
		public void setValue(Header21 obj, Max6Text value) {
			obj.setProtocolVersion(value);
		}
	};
	@XmlElement(name = "XchgId", required = true)
	protected Max3NumericText exchangeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header21
	 * Header21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of an exchange occurrence."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header20#mmExchangeIdentification
	 * Header20.mmExchangeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header21, Max3NumericText> mmExchangeIdentification = new MMMessageAttribute<Header21, Max3NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header21.mmObject();
			isDerived = false;
			xmlTag = "XchgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeIdentification";
			definition = "Unique identification of an exchange occurrence.";
			previousVersion_lazy = () -> Header20.mmExchangeIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Max3NumericText getValue(Header21 obj) {
			return obj.getExchangeIdentification();
		}

		@Override
		public void setValue(Header21 obj, Max3NumericText value) {
			obj.setExchangeIdentification(value);
		}
	};
	@XmlElement(name = "ReTrnsmssnCntr")
	protected Number reTransmissionCounter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header21
	 * Header21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReTrnsmssnCntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReTransmissionCounter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * " Retransmission counter of this advice, 0 for the first transmission."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header21, Optional<Number>> mmReTransmissionCounter = new MMMessageAttribute<Header21, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header21.mmObject();
			isDerived = false;
			xmlTag = "ReTrnsmssnCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTransmissionCounter";
			definition = " Retransmission counter of this advice, 0 for the first transmission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Header21 obj) {
			return obj.getReTransmissionCounter();
		}

		@Override
		public void setValue(Header21 obj, Optional<Number> value) {
			obj.setReTransmissionCounter(value.orElse(null));
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header21
	 * Header21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the message was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header20#mmCreationDateTime
	 * Header20.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header21, ISODateTime> mmCreationDateTime = new MMMessageAttribute<Header21, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header21.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			previousVersion_lazy = () -> Header20.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Header21 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(Header21 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "InitgPty", required = true)
	protected Max35Text initiatingParty;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header21
	 * Header21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the partner that has initiated the exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header20#mmInitiatingParty
	 * Header20.mmInitiatingParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header21, Max35Text> mmInitiatingParty = new MMMessageAttribute<Header21, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header21.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Unique identification of the partner that has initiated the exchange.";
			previousVersion_lazy = () -> Header20.mmInitiatingParty;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Header21 obj) {
			return obj.getInitiatingParty();
		}

		@Override
		public void setValue(Header21 obj, Max35Text value) {
			obj.setInitiatingParty(value);
		}
	};
	@XmlElement(name = "RcptPty")
	protected Max35Text recipientParty;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header21
	 * Header21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the partner that is the recipient of the message exchange."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header20#mmRecipientParty
	 * Header20.mmRecipientParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header21, Optional<Max35Text>> mmRecipientParty = new MMMessageAttribute<Header21, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header21.mmObject();
			isDerived = false;
			xmlTag = "RcptPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientParty";
			definition = "Unique identification of the partner that is the recipient of the message exchange.";
			previousVersion_lazy = () -> Header20.mmRecipientParty;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Header21 obj) {
			return obj.getRecipientParty();
		}

		@Override
		public void setValue(Header21 obj, Optional<Max35Text> value) {
			obj.setRecipientParty(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcStat")
	protected Max35Text processState;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header21
	 * Header21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcStat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessState"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of the sender of the message inside the process flow."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header21, Optional<Max35Text>> mmProcessState = new MMMessageAttribute<Header21, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header21.mmObject();
			isDerived = false;
			xmlTag = "PrcStat";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessState";
			definition = "State of the sender of the message inside the process flow.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Header21 obj) {
			return obj.getProcessState();
		}

		@Override
		public void setValue(Header21 obj, Optional<Max35Text> value) {
			obj.setProcessState(value.orElse(null));
		}
	};
	@XmlElement(name = "Tracblt")
	protected List<Traceability4> traceability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Traceability4
	 * Traceability4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header21
	 * Header21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tracblt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traceability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header20#mmTraceability
	 * Header20.mmTraceability}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header21, List<Traceability4>> mmTraceability = new MMMessageAttribute<Header21, List<Traceability4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header21.mmObject();
			isDerived = false;
			xmlTag = "Tracblt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traceability";
			definition = "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.";
			previousVersion_lazy = () -> Header20.mmTraceability;
			minOccurs = 0;
			complexType_lazy = () -> Traceability4.mmObject();
		}

		@Override
		public List<Traceability4> getValue(Header21 obj) {
			return obj.getTraceability();
		}

		@Override
		public void setValue(Header21 obj, List<Traceability4> value) {
			obj.setTraceability(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Header21.mmMessageFunction, com.tools20022.repository.msg.Header21.mmProtocolVersion, com.tools20022.repository.msg.Header21.mmExchangeIdentification,
						com.tools20022.repository.msg.Header21.mmReTransmissionCounter, com.tools20022.repository.msg.Header21.mmCreationDateTime, com.tools20022.repository.msg.Header21.mmInitiatingParty,
						com.tools20022.repository.msg.Header21.mmRecipientParty, com.tools20022.repository.msg.Header21.mmProcessState, com.tools20022.repository.msg.Header21.mmTraceability);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMReconciliationAdviceV01.mmHeader, ATMReconciliationAcknowledgementV01.mmHeader, ATMCompletionAdviceV01.mmHeader, ATMCompletionAcknowledgementV01.mmHeader,
						ATMWithdrawalCompletionAdviceV01.mmHeader, ATMWithdrawalCompletionAcknowledgementV01.mmHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Header21";
				definition = "Information related to the protocol management on a segment of the path from the ATM to the acquirer.";
				previousVersion_lazy = () -> Header20.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ATMMessageFunction1 getMessageFunction() {
		return messageFunction;
	}

	public Header21 setMessageFunction(ATMMessageFunction1 messageFunction) {
		this.messageFunction = Objects.requireNonNull(messageFunction);
		return this;
	}

	public Max6Text getProtocolVersion() {
		return protocolVersion;
	}

	public Header21 setProtocolVersion(Max6Text protocolVersion) {
		this.protocolVersion = Objects.requireNonNull(protocolVersion);
		return this;
	}

	public Max3NumericText getExchangeIdentification() {
		return exchangeIdentification;
	}

	public Header21 setExchangeIdentification(Max3NumericText exchangeIdentification) {
		this.exchangeIdentification = Objects.requireNonNull(exchangeIdentification);
		return this;
	}

	public Optional<Number> getReTransmissionCounter() {
		return reTransmissionCounter == null ? Optional.empty() : Optional.of(reTransmissionCounter);
	}

	public Header21 setReTransmissionCounter(Number reTransmissionCounter) {
		this.reTransmissionCounter = reTransmissionCounter;
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public Header21 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Max35Text getInitiatingParty() {
		return initiatingParty;
	}

	public Header21 setInitiatingParty(Max35Text initiatingParty) {
		this.initiatingParty = Objects.requireNonNull(initiatingParty);
		return this;
	}

	public Optional<Max35Text> getRecipientParty() {
		return recipientParty == null ? Optional.empty() : Optional.of(recipientParty);
	}

	public Header21 setRecipientParty(Max35Text recipientParty) {
		this.recipientParty = recipientParty;
		return this;
	}

	public Optional<Max35Text> getProcessState() {
		return processState == null ? Optional.empty() : Optional.of(processState);
	}

	public Header21 setProcessState(Max35Text processState) {
		this.processState = processState;
		return this;
	}

	public List<Traceability4> getTraceability() {
		return traceability == null ? traceability = new ArrayList<>() : traceability;
	}

	public Header21 setTraceability(List<Traceability4> traceability) {
		this.traceability = Objects.requireNonNull(traceability);
		return this;
	}
}
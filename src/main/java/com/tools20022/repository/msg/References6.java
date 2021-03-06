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
import com.tools20022.repository.area.acmt.AccountRequestRejectionV01;
import com.tools20022.repository.area.acmt.AccountRequestRejectionV02;
import com.tools20022.repository.codeset.UseCases1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MessageIdentification1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements for the identification of the message and related references.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References6#mmRejectedRequestType
 * References6.mmRejectedRequestType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References6#mmRejectionReason
 * References6.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References6#mmRejectedRequestIdentification
 * References6.mmRejectedRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References6#mmMessageIdentification
 * References6.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References6#mmProcessIdentification
 * References6.mmProcessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References6#mmAttachedDocumentName
 * References6.mmAttachedDocumentName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV01#mmReferences
 * AccountRequestRejectionV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV02#mmReferences
 * AccountRequestRejectionV02.mmReferences}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "References6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements for the identification of the message and related references."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "References6", propOrder = {"rejectedRequestType", "rejectionReason", "rejectedRequestIdentification", "messageIdentification", "processIdentification", "attachedDocumentName"})
public class References6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RjctdReqTp", required = true)
	protected UseCases1Code rejectedRequestType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UseCases1Code
	 * UseCases1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References6 References6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdReqTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedRequestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identify the type of rejected request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References6, UseCases1Code> mmRejectedRequestType = new MMMessageAttribute<References6, UseCases1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.References6.mmObject();
			isDerived = false;
			xmlTag = "RjctdReqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedRequestType";
			definition = "Identify the type of rejected request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UseCases1Code.mmObject();
		}

		@Override
		public UseCases1Code getValue(References6 obj) {
			return obj.getRejectedRequestType();
		}

		@Override
		public void setValue(References6 obj, UseCases1Code value) {
			obj.setRejectedRequestType(value);
		}
	};
	@XmlElement(name = "RjctnRsn", required = true)
	protected List<Max350Text> rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References6 References6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason of the message rejection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References6, List<Max350Text>> mmRejectionReason = new MMMessageAttribute<References6, List<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.References6.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Reason of the message rejection.";
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public List<Max350Text> getValue(References6 obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(References6 obj, List<Max350Text> value) {
			obj.setRejectionReason(value);
		}
	};
	@XmlElement(name = "RjctdReqId", required = true)
	protected MessageIdentification1 rejectedRequestIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References6 References6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdReqId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the rejected request message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References6, MessageIdentification1> mmRejectedRequestIdentification = new MMMessageAssociationEnd<References6, MessageIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.References6.mmObject();
			isDerived = false;
			xmlTag = "RjctdReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedRequestIdentification";
			definition = "Identification of the rejected request message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(References6 obj) {
			return obj.getRejectedRequestIdentification();
		}

		@Override
		public void setValue(References6 obj, MessageIdentification1 value) {
			obj.setRejectedRequestIdentification(value);
		}
	};
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References6 References6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a message by a unique identifier and the date and time when the message was created by the sender."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References6, MessageIdentification1> mmMessageIdentification = new MMMessageAssociationEnd<References6, MessageIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.References6.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies a message by a unique identifier and the date and time when the message was created by the sender.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(References6 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(References6 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "PrcId", required = true)
	protected MessageIdentification1 processIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References6 References6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a process by a unique identifier and the date and time when the first message belonging to the process was created by the sender. The process identification remains the same in all messages belonging to the same process, from the initial request message to the final account report closing the process."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References6, MessageIdentification1> mmProcessIdentification = new MMMessageAssociationEnd<References6, MessageIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.References6.mmObject();
			isDerived = false;
			xmlTag = "PrcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessIdentification";
			definition = "Identifies a process by a unique identifier and the date and time when the first message belonging to the process was created by the sender. The process identification remains the same in all messages belonging to the same process, from the initial request message to the final account report closing the process.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(References6 obj) {
			return obj.getProcessIdentification();
		}

		@Override
		public void setValue(References6 obj, MessageIdentification1 value) {
			obj.setProcessIdentification(value);
		}
	};
	@XmlElement(name = "AttchdDocNm")
	protected List<Max70Text> attachedDocumentName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References6 References6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttchdDocNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachedDocumentName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File name of a document logically related to the request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References6, List<Max70Text>> mmAttachedDocumentName = new MMMessageAttribute<References6, List<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.References6.mmObject();
			isDerived = false;
			xmlTag = "AttchdDocNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedDocumentName";
			definition = "File name of a document logically related to the request.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(References6 obj) {
			return obj.getAttachedDocumentName();
		}

		@Override
		public void setValue(References6 obj, List<Max70Text> value) {
			obj.setAttachedDocumentName(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.References6.mmRejectedRequestType, com.tools20022.repository.msg.References6.mmRejectionReason,
						com.tools20022.repository.msg.References6.mmRejectedRequestIdentification, com.tools20022.repository.msg.References6.mmMessageIdentification, com.tools20022.repository.msg.References6.mmProcessIdentification,
						com.tools20022.repository.msg.References6.mmAttachedDocumentName);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountRequestRejectionV01.mmReferences, AccountRequestRejectionV02.mmReferences);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "References6";
				definition = "Set of elements for the identification of the message and related references.";
			}
		});
		return mmObject_lazy.get();
	}

	public UseCases1Code getRejectedRequestType() {
		return rejectedRequestType;
	}

	public References6 setRejectedRequestType(UseCases1Code rejectedRequestType) {
		this.rejectedRequestType = Objects.requireNonNull(rejectedRequestType);
		return this;
	}

	public List<Max350Text> getRejectionReason() {
		return rejectionReason == null ? rejectionReason = new ArrayList<>() : rejectionReason;
	}

	public References6 setRejectionReason(List<Max350Text> rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	public MessageIdentification1 getRejectedRequestIdentification() {
		return rejectedRequestIdentification;
	}

	public References6 setRejectedRequestIdentification(MessageIdentification1 rejectedRequestIdentification) {
		this.rejectedRequestIdentification = Objects.requireNonNull(rejectedRequestIdentification);
		return this;
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public References6 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public MessageIdentification1 getProcessIdentification() {
		return processIdentification;
	}

	public References6 setProcessIdentification(MessageIdentification1 processIdentification) {
		this.processIdentification = Objects.requireNonNull(processIdentification);
		return this;
	}

	public List<Max70Text> getAttachedDocumentName() {
		return attachedDocumentName == null ? attachedDocumentName = new ArrayList<>() : attachedDocumentName;
	}

	public References6 setAttachedDocumentName(List<Max70Text> attachedDocumentName) {
		this.attachedDocumentName = Objects.requireNonNull(attachedDocumentName);
		return this;
	}
}
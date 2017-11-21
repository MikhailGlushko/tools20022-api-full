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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.References4#mmMessageIdentification
 * References4.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References4#mmProcessIdentification
 * References4.mmProcessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.References4#mmAttachedDocumentName
 * References4.mmAttachedDocumentName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV01#mmReferences
 * AccountClosingAmendmentRequestV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#mmReferences
 * AccountClosingAmendmentRequestV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV01#mmReferences
 * AccountClosingRequestV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02#mmReferences
 * AccountClosingRequestV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV01#mmReferences
 * AccountExcludedMandateMaintenanceAmendmentRequestV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02#mmReferences
 * AccountExcludedMandateMaintenanceAmendmentRequestV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV01#mmReferences
 * AccountExcludedMandateMaintenanceRequestV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmReferences
 * AccountExcludedMandateMaintenanceRequestV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV01#mmReferences
 * AccountMandateMaintenanceAmendmentRequestV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmReferences
 * AccountMandateMaintenanceAmendmentRequestV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01#mmReferences
 * AccountMandateMaintenanceRequestV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02#mmReferences
 * AccountMandateMaintenanceRequestV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01#mmReferences
 * AccountOpeningAmendmentRequestV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02#mmReferences
 * AccountOpeningAmendmentRequestV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV01#mmReferences
 * AccountOpeningRequestV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02#mmReferences
 * AccountOpeningRequestV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV01#mmReferences
 * AccountReportRequestV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV02#mmReferences
 * AccountReportRequestV02.mmReferences}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "References4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements for the identification of the message and related references."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "References4", propOrder = {"messageIdentification", "processIdentification", "attachedDocumentName"})
public class References4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Identifies a message by a unique identifier and the date and time when
	 * the message was created by the sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References4 References4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a message by a unique identifier and the date and time when the message was created by the sender."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> References4.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies a message by a unique identifier and the date and time when the message was created by the sender.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MessageIdentification1.mmObject();
		}
	};
	protected MessageIdentification1 processIdentification;
	/**
	 * Identifies a process by a unique identifier and the date and time when
	 * the first message belonging to the process was created by the sender. The
	 * process identification remains the same in all messages belonging to the
	 * same process, from the initial request message to the final account
	 * report closing the process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References4 References4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a process by a unique identifier and the date and time when the first message belonging to the process was created by the sender. The process identification remains the same in all messages belonging to the same process, from the initial request message to the final account report closing the process."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProcessIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> References4.mmObject();
			isDerived = false;
			xmlTag = "PrcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessIdentification";
			definition = "Identifies a process by a unique identifier and the date and time when the first message belonging to the process was created by the sender. The process identification remains the same in all messages belonging to the same process, from the initial request message to the final account report closing the process.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MessageIdentification1.mmObject();
		}
	};
	protected List<Max70Text> attachedDocumentName;
	/**
	 * File name of a document logically related to the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.References4 References4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttchdDocNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachedDocumentName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File name of a document logically related to the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttachedDocumentName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> References4.mmObject();
			isDerived = false;
			xmlTag = "AttchdDocNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedDocumentName";
			definition = "File name of a document logically related to the request.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(References4.mmMessageIdentification, References4.mmProcessIdentification, References4.mmAttachedDocumentName);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountClosingAmendmentRequestV01.mmReferences, AccountClosingAmendmentRequestV02.mmReferences, AccountClosingRequestV01.mmReferences, AccountClosingRequestV02.mmReferences,
						AccountExcludedMandateMaintenanceAmendmentRequestV01.mmReferences, AccountExcludedMandateMaintenanceAmendmentRequestV02.mmReferences, AccountExcludedMandateMaintenanceRequestV01.mmReferences,
						AccountExcludedMandateMaintenanceRequestV02.mmReferences, AccountMandateMaintenanceAmendmentRequestV01.mmReferences, AccountMandateMaintenanceAmendmentRequestV02.mmReferences,
						AccountMandateMaintenanceRequestV01.mmReferences, AccountMandateMaintenanceRequestV02.mmReferences, AccountOpeningAmendmentRequestV01.mmReferences, AccountOpeningAmendmentRequestV02.mmReferences,
						AccountOpeningRequestV01.mmReferences, AccountOpeningRequestV02.mmReferences, AccountReportRequestV01.mmReferences, AccountReportRequestV02.mmReferences);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "References4";
				definition = "Set of elements for the identification of the message and related references.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgId", required = true)
	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(com.tools20022.repository.msg.MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	@XmlElement(name = "PrcId", required = true)
	public MessageIdentification1 getProcessIdentification() {
		return processIdentification;
	}

	public void setProcessIdentification(com.tools20022.repository.msg.MessageIdentification1 processIdentification) {
		this.processIdentification = processIdentification;
	}

	@XmlElement(name = "AttchdDocNm")
	public List<Max70Text> getAttachedDocumentName() {
		return attachedDocumentName;
	}

	public void setAttachedDocumentName(List<Max70Text> attachedDocumentName) {
		this.attachedDocumentName = attachedDocumentName;
	}
}
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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.semt.SecuritiesMessageRejection;
import com.tools20022.repository.codeset.MessageRejectedReason1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reason to reject the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason1#mmPreviousOrOtherOrRelatedReferenceRule
 * RejectionReason1.mmPreviousOrOtherOrRelatedReferenceRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason1#mmReason
 * RejectionReason1.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason1#mmAdditionalInformation
 * RejectionReason1.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason1#mmLinkedMessagePreviousReference
 * RejectionReason1.mmLinkedMessagePreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason1#mmLinkedMessageOtherReference
 * RejectionReason1.mmLinkedMessageOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason1#mmLinkedMessageRelatedReference
 * RejectionReason1.mmLinkedMessageRelatedReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejection#mmReason
 * SecuritiesMessageRejection.mmReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason to reject the message."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RejectionReason1", propOrder = {"reason", "additionalInformation", "linkedMessagePreviousReference", "linkedMessageOtherReference", "linkedMessageRelatedReference"})
public class RejectionReason1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected MessageRejectedReason1Code reason;
	/**
	 * Reason to reject the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageRejectedReason1Code
	 * MessageRejectedReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectedStatusReason
	 * StatusReason.mmRejectedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason1
	 * RejectionReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason to reject the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectedStatusReason;
			componentContext_lazy = () -> RejectionReason1.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason to reject the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MessageRejectedReason1Code.mmObject();
		}
	};
	protected Max140Text additionalInformation;
	/**
	 * Additional information about the rejection reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason1
	 * RejectionReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the rejection reason."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> RejectionReason1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the rejection reason.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected AdditionalReference2 linkedMessagePreviousReference;
	/**
	 * Linked previous reference that is invalid or unrecognised, of the message
	 * being rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason1
	 * RejectionReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdMsgPrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedMessagePreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Linked previous reference that is invalid or unrecognised, of the message being rejected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLinkedMessagePreviousReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RejectionReason1.mmObject();
			isDerived = false;
			xmlTag = "LkdMsgPrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedMessagePreviousReference";
			definition = "Linked previous reference that is invalid or unrecognised, of the message being rejected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalReference2.mmObject();
		}
	};
	protected AdditionalReference2 linkedMessageOtherReference;
	/**
	 * Linked other reference that is invalid or unrecognised, of the message
	 * being rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason1
	 * RejectionReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdMsgOthrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedMessageOtherReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Linked other reference that is invalid or unrecognised, of the message being rejected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLinkedMessageOtherReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RejectionReason1.mmObject();
			isDerived = false;
			xmlTag = "LkdMsgOthrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedMessageOtherReference";
			definition = "Linked other reference that is invalid or unrecognised, of the message being rejected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalReference2.mmObject();
		}
	};
	protected AdditionalReference2 linkedMessageRelatedReference;
	/**
	 * Linked related reference that is invalid or unrecognised, of the message
	 * being rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason1
	 * RejectionReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdMsgRltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedMessageRelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Linked related reference that is invalid or unrecognised, of the message being rejected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLinkedMessageRelatedReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RejectionReason1.mmObject();
			isDerived = false;
			xmlTag = "LkdMsgRltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedMessageRelatedReference";
			definition = "Linked related reference that is invalid or unrecognised, of the message being rejected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalReference2.mmObject();
		}
	};
	/**
	 * One and only one message element in the list
	 * (LinkedMessagePreviousReference, LinkedMessageOtherReference,
	 * LinkedMessageRelatedReference) may be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason1
	 * RejectionReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason1#mmLinkedMessagePreviousReference
	 * RejectionReason1.mmLinkedMessagePreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason1#mmLinkedMessageOtherReference
	 * RejectionReason1.mmLinkedMessageOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason1#mmLinkedMessageRelatedReference
	 * RejectionReason1.mmLinkedMessageRelatedReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousOrOtherOrRelatedReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (LinkedMessagePreviousReference, LinkedMessageOtherReference, LinkedMessageRelatedReference) may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmPreviousOrOtherOrRelatedReferenceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousOrOtherOrRelatedReferenceRule";
			definition = "One and only one message element in the list (LinkedMessagePreviousReference, LinkedMessageOtherReference, LinkedMessageRelatedReference) may be present.";
			messageComponent_lazy = () -> RejectionReason1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(RejectionReason1.mmLinkedMessagePreviousReference, RejectionReason1.mmLinkedMessageOtherReference, RejectionReason1.mmLinkedMessageRelatedReference);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RejectionReason1.mmReason, RejectionReason1.mmAdditionalInformation, RejectionReason1.mmLinkedMessagePreviousReference, RejectionReason1.mmLinkedMessageOtherReference,
						RejectionReason1.mmLinkedMessageRelatedReference);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesMessageRejection.mmReason);
				trace_lazy = () -> StatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "RejectionReason1";
				definition = "Reason to reject the message.";
				xors_lazy = () -> Arrays.asList(RejectionReason1.mmPreviousOrOtherOrRelatedReferenceRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Rsn", required = true)
	public MessageRejectedReason1Code getReason() {
		return reason;
	}

	public void setReason(MessageRejectedReason1Code reason) {
		this.reason = reason;
	}

	@XmlElement(name = "AddtlInf")
	public Max140Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max140Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@XmlElement(name = "LkdMsgPrvsRef")
	public AdditionalReference2 getLinkedMessagePreviousReference() {
		return linkedMessagePreviousReference;
	}

	public void setLinkedMessagePreviousReference(com.tools20022.repository.msg.AdditionalReference2 linkedMessagePreviousReference) {
		this.linkedMessagePreviousReference = linkedMessagePreviousReference;
	}

	@XmlElement(name = "LkdMsgOthrRef")
	public AdditionalReference2 getLinkedMessageOtherReference() {
		return linkedMessageOtherReference;
	}

	public void setLinkedMessageOtherReference(com.tools20022.repository.msg.AdditionalReference2 linkedMessageOtherReference) {
		this.linkedMessageOtherReference = linkedMessageOtherReference;
	}

	@XmlElement(name = "LkdMsgRltdRef")
	public AdditionalReference2 getLinkedMessageRelatedReference() {
		return linkedMessageRelatedReference;
	}

	public void setLinkedMessageRelatedReference(com.tools20022.repository.msg.AdditionalReference2 linkedMessageRelatedReference) {
		this.linkedMessageRelatedReference = linkedMessageRelatedReference;
	}
}
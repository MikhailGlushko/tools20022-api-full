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
import com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV04;
import com.tools20022.repository.datatype.GroupCancellationIndicator;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalNotificationReference6;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the original notification, to which the cancellation advice
 * refers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification8#mmOriginalMessageIdentification
 * OriginalNotification8.mmOriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification8#mmOriginalCreationDateTime
 * OriginalNotification8.mmOriginalCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification8#mmOriginalNotificationIdentification
 * OriginalNotification8.mmOriginalNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification8#mmNotificationCancellation
 * OriginalNotification8.mmNotificationCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotification8#mmOriginalNotificationReference
 * OriginalNotification8.mmOriginalNotificationReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV04#mmOriginalNotification
 * NotificationToReceiveCancellationAdviceV04.mmOriginalNotification}</li>
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
 * "OriginalNotification8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the original notification, to which the cancellation advice refers."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalNotification10
 * OriginalNotification10}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.OriginalNotification6
 * OriginalNotification6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalNotification8", propOrder = {"originalMessageIdentification", "originalCreationDateTime", "originalNotificationIdentification", "notificationCancellation", "originalNotificationReference"})
public class OriginalNotification8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMsgId", required = true)
	protected Max35Text originalMessageIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification8
	 * OriginalNotification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference, as assigned by the original sender, to unambiguously identify the original notification to receive message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#mmOriginalMessageIdentification
	 * OriginalNotification10.mmOriginalMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification6#mmOriginalMessageIdentification
	 * OriginalNotification6.mmOriginalMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalNotification8, Max35Text> mmOriginalMessageIdentification = new MMMessageAttribute<OriginalNotification8, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotification8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Point to point reference, as assigned by the original sender, to unambiguously identify the original notification to receive message.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotification10.mmOriginalMessageIdentification);
			previousVersion_lazy = () -> OriginalNotification6.mmOriginalMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalNotification8 obj) {
			return obj.getOriginalMessageIdentification();
		}

		@Override
		public void setValue(OriginalNotification8 obj, Max35Text value) {
			obj.setOriginalMessageIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlCreDtTm")
	protected ISODateTime originalCreationDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreationDate
	 * PaymentExecution.mmCreationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification8
	 * OriginalNotification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the original message was created."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#mmOriginalCreationDateTime
	 * OriginalNotification10.mmOriginalCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification6#mmOriginalCreationDateTime
	 * OriginalNotification6.mmOriginalCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalNotification8, Optional<ISODateTime>> mmOriginalCreationDateTime = new MMMessageAttribute<OriginalNotification8, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotification8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreationDateTime";
			definition = "Date and time at which the original message was created.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotification10.mmOriginalCreationDateTime);
			previousVersion_lazy = () -> OriginalNotification6.mmOriginalCreationDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(OriginalNotification8 obj) {
			return obj.getOriginalCreationDateTime();
		}

		@Override
		public void setValue(OriginalNotification8 obj, Optional<ISODateTime> value) {
			obj.setOriginalCreationDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlNtfctnId", required = true)
	protected Max35Text originalNotificationIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification8
	 * OriginalNotification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlNtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the original notification."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#mmOriginalNotificationIdentification
	 * OriginalNotification10.mmOriginalNotificationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification6#mmOriginalNotificationIdentification
	 * OriginalNotification6.mmOriginalNotificationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalNotification8, Max35Text> mmOriginalNotificationIdentification = new MMMessageAttribute<OriginalNotification8, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotification8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNotificationIdentification";
			definition = "Identification of the original notification.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotification10.mmOriginalNotificationIdentification);
			previousVersion_lazy = () -> OriginalNotification6.mmOriginalNotificationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalNotification8 obj) {
			return obj.getOriginalNotificationIdentification();
		}

		@Override
		public void setValue(OriginalNotification8 obj, Max35Text value) {
			obj.setOriginalNotificationIdentification(value);
		}
	};
	@XmlElement(name = "NtfctnCxl")
	protected GroupCancellationIndicator notificationCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.GroupCancellationIndicator
	 * GroupCancellationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification8
	 * OriginalNotification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnCxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cancellation applies to the complete original notification or to individual items within the original notification."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#mmNotificationCancellation
	 * OriginalNotification10.mmNotificationCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification6#mmNotificationCancellation
	 * OriginalNotification6.mmNotificationCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalNotification8, Optional<GroupCancellationIndicator>> mmNotificationCancellation = new MMMessageAttribute<OriginalNotification8, Optional<GroupCancellationIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotification8.mmObject();
			isDerived = false;
			xmlTag = "NtfctnCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationCancellation";
			definition = "Indicates whether the cancellation applies to the complete original notification or to individual items within the original notification.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotification10.mmNotificationCancellation);
			previousVersion_lazy = () -> OriginalNotification6.mmNotificationCancellation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> GroupCancellationIndicator.mmObject();
		}

		@Override
		public Optional<GroupCancellationIndicator> getValue(OriginalNotification8 obj) {
			return obj.getNotificationCancellation();
		}

		@Override
		public void setValue(OriginalNotification8 obj, Optional<GroupCancellationIndicator> value) {
			obj.setNotificationCancellation(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlNtfctnRef")
	protected List<OriginalNotificationReference6> originalNotificationReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6
	 * OriginalNotificationReference6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification8
	 * OriginalNotification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlNtfctnRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalNotificationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the original notification item, to which the cancellation advice refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification10#mmOriginalNotificationReference
	 * OriginalNotification10.mmOriginalNotificationReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalNotification6#mmOriginalNotificationReference
	 * OriginalNotification6.mmOriginalNotificationReference}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalNotification8, List<OriginalNotificationReference6>> mmOriginalNotificationReference = new MMMessageAssociationEnd<OriginalNotification8, List<OriginalNotificationReference6>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalNotification8.mmObject();
			isDerived = false;
			xmlTag = "OrgnlNtfctnRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNotificationReference";
			definition = "Identifies the original notification item, to which the cancellation advice refers.";
			nextVersions_lazy = () -> Arrays.asList(OriginalNotification10.mmOriginalNotificationReference);
			previousVersion_lazy = () -> OriginalNotification6.mmOriginalNotificationReference;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalNotificationReference6.mmObject();
		}

		@Override
		public List<OriginalNotificationReference6> getValue(OriginalNotification8 obj) {
			return obj.getOriginalNotificationReference();
		}

		@Override
		public void setValue(OriginalNotification8 obj, List<OriginalNotificationReference6> value) {
			obj.setOriginalNotificationReference(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalNotification8.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalNotification8.mmOriginalCreationDateTime,
						com.tools20022.repository.msg.OriginalNotification8.mmOriginalNotificationIdentification, com.tools20022.repository.msg.OriginalNotification8.mmNotificationCancellation,
						com.tools20022.repository.msg.OriginalNotification8.mmOriginalNotificationReference);
				messageBuildingBlock_lazy = () -> Arrays.asList(NotificationToReceiveCancellationAdviceV04.mmOriginalNotification);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalNotification8";
				definition = "Identifies the original notification, to which the cancellation advice refers.";
				nextVersions_lazy = () -> Arrays.asList(OriginalNotification10.mmObject());
				previousVersion_lazy = () -> OriginalNotification6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalMessageIdentification() {
		return originalMessageIdentification;
	}

	public OriginalNotification8 setOriginalMessageIdentification(Max35Text originalMessageIdentification) {
		this.originalMessageIdentification = Objects.requireNonNull(originalMessageIdentification);
		return this;
	}

	public Optional<ISODateTime> getOriginalCreationDateTime() {
		return originalCreationDateTime == null ? Optional.empty() : Optional.of(originalCreationDateTime);
	}

	public OriginalNotification8 setOriginalCreationDateTime(ISODateTime originalCreationDateTime) {
		this.originalCreationDateTime = originalCreationDateTime;
		return this;
	}

	public Max35Text getOriginalNotificationIdentification() {
		return originalNotificationIdentification;
	}

	public OriginalNotification8 setOriginalNotificationIdentification(Max35Text originalNotificationIdentification) {
		this.originalNotificationIdentification = Objects.requireNonNull(originalNotificationIdentification);
		return this;
	}

	public Optional<GroupCancellationIndicator> getNotificationCancellation() {
		return notificationCancellation == null ? Optional.empty() : Optional.of(notificationCancellation);
	}

	public OriginalNotification8 setNotificationCancellation(GroupCancellationIndicator notificationCancellation) {
		this.notificationCancellation = notificationCancellation;
		return this;
	}

	public List<OriginalNotificationReference6> getOriginalNotificationReference() {
		return originalNotificationReference == null ? originalNotificationReference = new ArrayList<>() : originalNotificationReference;
	}

	public OriginalNotification8 setOriginalNotificationReference(List<OriginalNotificationReference6> originalNotificationReference) {
		this.originalNotificationReference = Objects.requireNonNull(originalNotificationReference);
		return this;
	}
}
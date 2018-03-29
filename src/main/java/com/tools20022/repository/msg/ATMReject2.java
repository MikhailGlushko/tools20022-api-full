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
import com.tools20022.repository.area.catp.ATMRejectV02;
import com.tools20022.repository.codeset.RejectReason1Code;
import com.tools20022.repository.datatype.Max100KBinary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCommand7;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the reject of a message from an ATM or an ATM manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReject2#mmRejectInitiatorIdentification
 * ATMReject2.mmRejectInitiatorIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMReject2#mmRejectReason
 * ATMReject2.mmRejectReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReject2#mmAdditionalInformation
 * ATMReject2.mmAdditionalInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMReject2#mmCommand
 * ATMReject2.mmCommand}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMReject2#mmMessageInError
 * ATMReject2.mmMessageInError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMRejectV02#mmATMReject
 * ATMRejectV02.mmATMReject}</li>
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
 * "ATMReject2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the reject of a message from an ATM or an ATM manager."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMReject2", propOrder = {"rejectInitiatorIdentification", "rejectReason", "additionalInformation", "command", "messageInError"})
public class ATMReject2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RjctInitrId")
	protected Max35Text rejectInitiatorIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMReject2
	 * ATMReject2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctInitrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectInitiatorIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the entity sending the reject message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMReject2, Optional<Max35Text>> mmRejectInitiatorIdentification = new MMMessageAttribute<ATMReject2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReject2.mmObject();
			isDerived = false;
			xmlTag = "RjctInitrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectInitiatorIdentification";
			definition = "Identification of the entity sending the reject message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMReject2 obj) {
			return obj.getRejectInitiatorIdentification();
		}

		@Override
		public void setValue(ATMReject2 obj, Optional<Max35Text> value) {
			obj.setRejectInitiatorIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RjctRsn", required = true)
	protected RejectReason1Code rejectReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code
	 * RejectReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMReject2
	 * ATMReject2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "High level information allowing the sender of a request or an advice to know the types of error, and handle them accordingly."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMReject2, RejectReason1Code> mmRejectReason = new MMMessageAttribute<ATMReject2, RejectReason1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReject2.mmObject();
			isDerived = false;
			xmlTag = "RjctRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectReason";
			definition = "High level information allowing the sender of a request or an advice to know the types of error, and handle them accordingly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectReason1Code.mmObject();
		}

		@Override
		public RejectReason1Code getValue(ATMReject2 obj) {
			return obj.getRejectReason();
		}

		@Override
		public void setValue(ATMReject2 obj, RejectReason1Code value) {
			obj.setRejectReason(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max500Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMReject2
	 * ATMReject2}</li>
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
	 * definition} =
	 * "Additional information related to the sending of a reject message in response to a request or an advice.\r\nFor logging purpose, in order to allow further analysis, statistics and deferred processing on the success or the failure of the request processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMReject2, Optional<Max500Text>> mmAdditionalInformation = new MMMessageAttribute<ATMReject2, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReject2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the sending of a reject message in response to a request or an advice.\r\nFor logging purpose, in order to allow further analysis, statistics and deferred processing on the success or the failure of the request processing.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(ATMReject2 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(ATMReject2 obj, Optional<Max500Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "Cmd")
	protected List<ATMCommand7> command;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand7
	 * ATMCommand7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMReject2
	 * ATMReject2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Command"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance command to perform on the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMReject2, List<ATMCommand7>> mmCommand = new MMMessageAssociationEnd<ATMReject2, List<ATMCommand7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReject2.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand7.mmObject();
		}

		@Override
		public List<ATMCommand7> getValue(ATMReject2 obj) {
			return obj.getCommand();
		}

		@Override
		public void setValue(ATMReject2 obj, List<ATMCommand7> value) {
			obj.setCommand(value);
		}
	};
	@XmlElement(name = "MsgInErr")
	protected Max100KBinary messageInError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max100KBinary
	 * Max100KBinary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMReject2
	 * ATMReject2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgInErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageInError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Received message that has been rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMReject2, Optional<Max100KBinary>> mmMessageInError = new MMMessageAttribute<ATMReject2, Optional<Max100KBinary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReject2.mmObject();
			isDerived = false;
			xmlTag = "MsgInErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageInError";
			definition = "Received message that has been rejected.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max100KBinary.mmObject();
		}

		@Override
		public Optional<Max100KBinary> getValue(ATMReject2 obj) {
			return obj.getMessageInError();
		}

		@Override
		public void setValue(ATMReject2 obj, Optional<Max100KBinary> value) {
			obj.setMessageInError(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMReject2.mmRejectInitiatorIdentification, com.tools20022.repository.msg.ATMReject2.mmRejectReason,
						com.tools20022.repository.msg.ATMReject2.mmAdditionalInformation, com.tools20022.repository.msg.ATMReject2.mmCommand, com.tools20022.repository.msg.ATMReject2.mmMessageInError);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMRejectV02.mmATMReject);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMReject2";
				definition = "Information related to the reject of a message from an ATM or an ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getRejectInitiatorIdentification() {
		return rejectInitiatorIdentification == null ? Optional.empty() : Optional.of(rejectInitiatorIdentification);
	}

	public ATMReject2 setRejectInitiatorIdentification(Max35Text rejectInitiatorIdentification) {
		this.rejectInitiatorIdentification = rejectInitiatorIdentification;
		return this;
	}

	public RejectReason1Code getRejectReason() {
		return rejectReason;
	}

	public ATMReject2 setRejectReason(RejectReason1Code rejectReason) {
		this.rejectReason = Objects.requireNonNull(rejectReason);
		return this;
	}

	public Optional<Max500Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public ATMReject2 setAdditionalInformation(Max500Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<ATMCommand7> getCommand() {
		return command == null ? command = new ArrayList<>() : command;
	}

	public ATMReject2 setCommand(List<ATMCommand7> command) {
		this.command = Objects.requireNonNull(command);
		return this;
	}

	public Optional<Max100KBinary> getMessageInError() {
		return messageInError == null ? Optional.empty() : Optional.of(messageInError);
	}

	public ATMReject2 setMessageInError(Max100KBinary messageInError) {
		this.messageInError = messageInError;
		return this;
	}
}
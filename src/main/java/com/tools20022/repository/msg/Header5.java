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
import com.tools20022.repository.area.caaa.AcceptorRejectionV02;
import com.tools20022.repository.codeset.MessageFunction1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.datatype.Max6Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification32;
import com.tools20022.repository.msg.Traceability1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics related to the protocol after a rejection.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Header5#mmMessageFunction
 * Header5.mmMessageFunction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header5#mmProtocolVersion
 * Header5.mmProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Header5#mmExchangeIdentification
 * Header5.mmExchangeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header5#mmCreationDateTime
 * Header5.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header5#mmInitiatingParty
 * Header5.mmInitiatingParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header5#mmRecipientParty
 * Header5.mmRecipientParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header5#mmTraceability
 * Header5.mmTraceability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV02#mmHeader
 * AcceptorRejectionV02.mmHeader}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Header5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics related to the protocol after a rejection."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Header9 Header9}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Header1 Header1}
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Header5", propOrder = {"messageFunction", "protocolVersion", "exchangeIdentification", "creationDateTime", "initiatingParty", "recipientParty", "traceability"})
public class Header5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgFctn", required = true)
	protected MessageFunction1Code messageFunction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header5
	 * Header5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgFctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageFunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of process related to the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header9#mmMessageFunction
	 * Header9.mmMessageFunction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header5, MessageFunction1Code> mmMessageFunction = new MMMessageAttribute<Header5, MessageFunction1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header5.mmObject();
			isDerived = false;
			xmlTag = "MsgFctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageFunction";
			definition = "Identifies the type of process related to the message.";
			nextVersions_lazy = () -> Arrays.asList(Header9.mmMessageFunction);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MessageFunction1Code.mmObject();
		}

		@Override
		public MessageFunction1Code getValue(Header5 obj) {
			return obj.getMessageFunction();
		}

		@Override
		public void setValue(Header5 obj, MessageFunction1Code value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header5
	 * Header5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtcolVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtocolVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the acquirer protocol specifications."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header9#mmProtocolVersion
	 * Header9.mmProtocolVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header5, Max6Text> mmProtocolVersion = new MMMessageAttribute<Header5, Max6Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header5.mmObject();
			isDerived = false;
			xmlTag = "PrtcolVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtocolVersion";
			definition = "Version of the acquirer protocol specifications.";
			nextVersions_lazy = () -> Arrays.asList(Header9.mmProtocolVersion);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}

		@Override
		public Max6Text getValue(Header5 obj) {
			return obj.getProtocolVersion();
		}

		@Override
		public void setValue(Header5 obj, Max6Text value) {
			obj.setProtocolVersion(value);
		}
	};
	@XmlElement(name = "XchgId")
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header5
	 * Header5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of an exchange occurrence."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header9#mmExchangeIdentification
	 * Header9.mmExchangeIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header5, Optional<Max3NumericText>> mmExchangeIdentification = new MMMessageAttribute<Header5, Optional<Max3NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header5.mmObject();
			isDerived = false;
			xmlTag = "XchgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeIdentification";
			definition = "Unique identification of an exchange occurrence.";
			nextVersions_lazy = () -> Arrays.asList(Header9.mmExchangeIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Optional<Max3NumericText> getValue(Header5 obj) {
			return obj.getExchangeIdentification();
		}

		@Override
		public void setValue(Header5 obj, Optional<Max3NumericText> value) {
			obj.setExchangeIdentification(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header5
	 * Header5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the message was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header9#mmCreationDateTime
	 * Header9.mmCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header5, ISODateTime> mmCreationDateTime = new MMMessageAttribute<Header5, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header5.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			nextVersions_lazy = () -> Arrays.asList(Header9.mmCreationDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Header5 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(Header5 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "InitgPty")
	protected GenericIdentification32 initiatingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header5
	 * Header5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the partner that has initiated the exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header9#mmInitiatingParty
	 * Header9.mmInitiatingParty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Header5, Optional<GenericIdentification32>> mmInitiatingParty = new MMMessageAssociationEnd<Header5, Optional<GenericIdentification32>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header5.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Unique identification of the partner that has initiated the exchange.";
			nextVersions_lazy = () -> Arrays.asList(Header9.mmInitiatingParty);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public Optional<GenericIdentification32> getValue(Header5 obj) {
			return obj.getInitiatingParty();
		}

		@Override
		public void setValue(Header5 obj, Optional<GenericIdentification32> value) {
			obj.setInitiatingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "RcptPty")
	protected GenericIdentification32 recipientParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header5
	 * Header5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the partner that is the recipient of the message exchange."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header9#mmRecipientParty
	 * Header9.mmRecipientParty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Header5, Optional<GenericIdentification32>> mmRecipientParty = new MMMessageAssociationEnd<Header5, Optional<GenericIdentification32>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header5.mmObject();
			isDerived = false;
			xmlTag = "RcptPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientParty";
			definition = "Unique identification of the partner that is the recipient of the message exchange.";
			nextVersions_lazy = () -> Arrays.asList(Header9.mmRecipientParty);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public Optional<GenericIdentification32> getValue(Header5 obj) {
			return obj.getRecipientParty();
		}

		@Override
		public void setValue(Header5 obj, Optional<GenericIdentification32> value) {
			obj.setRecipientParty(value.orElse(null));
		}
	};
	@XmlElement(name = "Tracblt")
	protected List<Traceability1> traceability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Traceability1
	 * Traceability1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header5
	 * Header5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tracblt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traceability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header9#mmTraceability
	 * Header9.mmTraceability}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Header5, List<Traceability1>> mmTraceability = new MMMessageAttribute<Header5, List<Traceability1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header5.mmObject();
			isDerived = false;
			xmlTag = "Tracblt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traceability";
			definition = "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.";
			nextVersions_lazy = () -> Arrays.asList(Header9.mmTraceability);
			minOccurs = 0;
			complexType_lazy = () -> Traceability1.mmObject();
		}

		@Override
		public List<Traceability1> getValue(Header5 obj) {
			return obj.getTraceability();
		}

		@Override
		public void setValue(Header5 obj, List<Traceability1> value) {
			obj.setTraceability(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Header5.mmMessageFunction, com.tools20022.repository.msg.Header5.mmProtocolVersion, com.tools20022.repository.msg.Header5.mmExchangeIdentification,
						com.tools20022.repository.msg.Header5.mmCreationDateTime, com.tools20022.repository.msg.Header5.mmInitiatingParty, com.tools20022.repository.msg.Header5.mmRecipientParty,
						com.tools20022.repository.msg.Header5.mmTraceability);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorRejectionV02.mmHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Header5";
				definition = "Set of characteristics related to the protocol after a rejection.";
				nextVersions_lazy = () -> Arrays.asList(Header9.mmObject());
				previousVersion_lazy = () -> Header1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public MessageFunction1Code getMessageFunction() {
		return messageFunction;
	}

	public Header5 setMessageFunction(MessageFunction1Code messageFunction) {
		this.messageFunction = Objects.requireNonNull(messageFunction);
		return this;
	}

	public Max6Text getProtocolVersion() {
		return protocolVersion;
	}

	public Header5 setProtocolVersion(Max6Text protocolVersion) {
		this.protocolVersion = Objects.requireNonNull(protocolVersion);
		return this;
	}

	public Optional<Max3NumericText> getExchangeIdentification() {
		return exchangeIdentification == null ? Optional.empty() : Optional.of(exchangeIdentification);
	}

	public Header5 setExchangeIdentification(Max3NumericText exchangeIdentification) {
		this.exchangeIdentification = exchangeIdentification;
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public Header5 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<GenericIdentification32> getInitiatingParty() {
		return initiatingParty == null ? Optional.empty() : Optional.of(initiatingParty);
	}

	public Header5 setInitiatingParty(GenericIdentification32 initiatingParty) {
		this.initiatingParty = initiatingParty;
		return this;
	}

	public Optional<GenericIdentification32> getRecipientParty() {
		return recipientParty == null ? Optional.empty() : Optional.of(recipientParty);
	}

	public Header5 setRecipientParty(GenericIdentification32 recipientParty) {
		this.recipientParty = recipientParty;
		return this;
	}

	public List<Traceability1> getTraceability() {
		return traceability == null ? traceability = new ArrayList<>() : traceability;
	}

	public Header5 setTraceability(List<Traceability1> traceability) {
		this.traceability = Objects.requireNonNull(traceability);
		return this;
	}
}
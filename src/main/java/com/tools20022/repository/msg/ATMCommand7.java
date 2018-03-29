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
import com.tools20022.repository.choice.ATMCommandParameters1Choice;
import com.tools20022.repository.codeset.ATMCommand4Code;
import com.tools20022.repository.codeset.TMSContactLevel2Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCommandIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Maintenance command to perform on an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand7#mmType
 * ATMCommand7.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand7#mmUrgency
 * ATMCommand7.mmUrgency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand7#mmDateTime
 * ATMCommand7.mmDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCommand7#mmCommandIdentification
 * ATMCommand7.mmCommandIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCommand7#mmCommandParameters
 * ATMCommand7.mmCommandParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
 * TerminalManagementSystem}</li>
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
 * "ATMCommand7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Maintenance command to perform on an ATM."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand13 ATMCommand13}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMCommand7", propOrder = {"type", "urgency", "dateTime", "commandIdentification", "commandParameters"})
public class ATMCommand7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected ATMCommand4Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand4Code
	 * ATMCommand4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand7 ATMCommand7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of command to be performed by the ATM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand13#mmType
	 * ATMCommand13.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand7, ATMCommand4Code> mmType = new MMMessageAttribute<ATMCommand7, ATMCommand4Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand7.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of command to be performed by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand13.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMCommand4Code.mmObject();
		}

		@Override
		public ATMCommand4Code getValue(ATMCommand7 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(ATMCommand7 obj, ATMCommand4Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Urgcy", required = true)
	protected TMSContactLevel2Code urgency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel2Code
	 * TMSContactLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmContactLevel
	 * TerminalManagementSystem.mmContactLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand7 ATMCommand7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Urgcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Urgency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Urgency of the command."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand13#mmUrgency
	 * ATMCommand13.mmUrgency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand7, TMSContactLevel2Code> mmUrgency = new MMMessageAttribute<ATMCommand7, TMSContactLevel2Code>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementSystem.mmContactLevel;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand7.mmObject();
			isDerived = false;
			xmlTag = "Urgcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Urgency";
			definition = "Urgency of the command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand13.mmUrgency);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TMSContactLevel2Code.mmObject();
		}

		@Override
		public TMSContactLevel2Code getValue(ATMCommand7 obj) {
			return obj.getUrgency();
		}

		@Override
		public void setValue(ATMCommand7 obj, TMSContactLevel2Code value) {
			obj.setUrgency(value);
		}
	};
	@XmlElement(name = "DtTm")
	protected ISODateTime dateTime;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand7 ATMCommand7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date time on which the command must be performed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand13#mmDateTime
	 * ATMCommand13.mmDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand7, Optional<ISODateTime>> mmDateTime = new MMMessageAttribute<ATMCommand7, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand7.mmObject();
			isDerived = false;
			xmlTag = "DtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTime";
			definition = "Date time on which the command must be performed.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand13.mmDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(ATMCommand7 obj) {
			return obj.getDateTime();
		}

		@Override
		public void setValue(ATMCommand7 obj, Optional<ISODateTime> value) {
			obj.setDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "CmdId")
	protected ATMCommandIdentification1 commandIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommandIdentification1
	 * ATMCommandIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand7 ATMCommand7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the entity issuing the command."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand13#mmCommandIdentification
	 * ATMCommand13.mmCommandIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMCommand7, Optional<ATMCommandIdentification1>> mmCommandIdentification = new MMMessageAssociationEnd<ATMCommand7, Optional<ATMCommandIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand7.mmObject();
			isDerived = false;
			xmlTag = "CmdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandIdentification";
			definition = "Identification of the entity issuing the command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand13.mmCommandIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommandIdentification1.mmObject();
		}

		@Override
		public Optional<ATMCommandIdentification1> getValue(ATMCommand7 obj) {
			return obj.getCommandIdentification();
		}

		@Override
		public void setValue(ATMCommand7 obj, Optional<ATMCommandIdentification1> value) {
			obj.setCommandIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CmdParams")
	protected ATMCommandParameters1Choice commandParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice
	 * ATMCommandParameters1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand7 ATMCommand7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific parameters attached to the command."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand13#mmCommandParameters
	 * ATMCommand13.mmCommandParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMCommand7, Optional<ATMCommandParameters1Choice>> mmCommandParameters = new MMMessageAssociationEnd<ATMCommand7, Optional<ATMCommandParameters1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand7.mmObject();
			isDerived = false;
			xmlTag = "CmdParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandParameters";
			definition = "Specific parameters attached to the command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand13.mmCommandParameters);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommandParameters1Choice.mmObject();
		}

		@Override
		public Optional<ATMCommandParameters1Choice> getValue(ATMCommand7 obj) {
			return obj.getCommandParameters();
		}

		@Override
		public void setValue(ATMCommand7 obj, Optional<ATMCommandParameters1Choice> value) {
			obj.setCommandParameters(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMCommand7.mmType, com.tools20022.repository.msg.ATMCommand7.mmUrgency, com.tools20022.repository.msg.ATMCommand7.mmDateTime,
						com.tools20022.repository.msg.ATMCommand7.mmCommandIdentification, com.tools20022.repository.msg.ATMCommand7.mmCommandParameters);
				trace_lazy = () -> TerminalManagementSystem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCommand7";
				definition = "Maintenance command to perform on an ATM.";
				nextVersions_lazy = () -> Arrays.asList(ATMCommand13.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ATMCommand4Code getType() {
		return type;
	}

	public ATMCommand7 setType(ATMCommand4Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public TMSContactLevel2Code getUrgency() {
		return urgency;
	}

	public ATMCommand7 setUrgency(TMSContactLevel2Code urgency) {
		this.urgency = Objects.requireNonNull(urgency);
		return this;
	}

	public Optional<ISODateTime> getDateTime() {
		return dateTime == null ? Optional.empty() : Optional.of(dateTime);
	}

	public ATMCommand7 setDateTime(ISODateTime dateTime) {
		this.dateTime = dateTime;
		return this;
	}

	public Optional<ATMCommandIdentification1> getCommandIdentification() {
		return commandIdentification == null ? Optional.empty() : Optional.of(commandIdentification);
	}

	public ATMCommand7 setCommandIdentification(ATMCommandIdentification1 commandIdentification) {
		this.commandIdentification = commandIdentification;
		return this;
	}

	public Optional<ATMCommandParameters1Choice> getCommandParameters() {
		return commandParameters == null ? Optional.empty() : Optional.of(commandParameters);
	}

	public ATMCommand7 setCommandParameters(ATMCommandParameters1Choice commandParameters) {
		this.commandParameters = commandParameters;
		return this;
	}
}
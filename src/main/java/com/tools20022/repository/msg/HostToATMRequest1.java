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
import com.tools20022.repository.area.caam.HostToATMRequestV01;
import com.tools20022.repository.codeset.MessageFunction8Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCommandIdentification1;
import com.tools20022.repository.msg.ATMEnvironment9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the request to an ATM to contact the ATM manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostToATMRequest1#mmEnvironment
 * HostToATMRequest1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostToATMRequest1#mmCommandIdentification
 * HostToATMRequest1.mmCommandIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostToATMRequest1#mmExpectedMessageFunction
 * HostToATMRequest1.mmExpectedMessageFunction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMRequestV01#mmHostToATMRequest
 * HostToATMRequestV01.mmHostToATMRequest}</li>
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
 * "HostToATMRequest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request to an ATM to contact the ATM manager."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "HostToATMRequest1", propOrder = {"environment", "commandIdentification", "expectedMessageFunction"})
public class HostToATMRequest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment9 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment9
	 * ATMEnvironment9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HostToATMRequest1
	 * HostToATMRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<HostToATMRequest1, ATMEnvironment9> mmEnvironment = new MMMessageAssociationEnd<HostToATMRequest1, ATMEnvironment9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HostToATMRequest1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment9.mmObject();
		}

		@Override
		public ATMEnvironment9 getValue(HostToATMRequest1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(HostToATMRequest1 obj, ATMEnvironment9 value) {
			obj.setEnvironment(value);
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
	 * {@linkplain com.tools20022.repository.msg.HostToATMRequest1
	 * HostToATMRequest1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<HostToATMRequest1, Optional<ATMCommandIdentification1>> mmCommandIdentification = new MMMessageAssociationEnd<HostToATMRequest1, Optional<ATMCommandIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HostToATMRequest1.mmObject();
			isDerived = false;
			xmlTag = "CmdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandIdentification";
			definition = "Identification of the entity issuing the command.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommandIdentification1.mmObject();
		}

		@Override
		public Optional<ATMCommandIdentification1> getValue(HostToATMRequest1 obj) {
			return obj.getCommandIdentification();
		}

		@Override
		public void setValue(HostToATMRequest1 obj, Optional<ATMCommandIdentification1> value) {
			obj.setCommandIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdMsgFctn", required = true)
	protected MessageFunction8Code expectedMessageFunction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code
	 * MessageFunction8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HostToATMRequest1
	 * HostToATMRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdMsgFctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedMessageFunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message that have to be sent by the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<HostToATMRequest1, MessageFunction8Code> mmExpectedMessageFunction = new MMMessageAttribute<HostToATMRequest1, MessageFunction8Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HostToATMRequest1.mmObject();
			isDerived = false;
			xmlTag = "XpctdMsgFctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedMessageFunction";
			definition = "Message that have to be sent by the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MessageFunction8Code.mmObject();
		}

		@Override
		public MessageFunction8Code getValue(HostToATMRequest1 obj) {
			return obj.getExpectedMessageFunction();
		}

		@Override
		public void setValue(HostToATMRequest1 obj, MessageFunction8Code value) {
			obj.setExpectedMessageFunction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.HostToATMRequest1.mmEnvironment, com.tools20022.repository.msg.HostToATMRequest1.mmCommandIdentification,
						com.tools20022.repository.msg.HostToATMRequest1.mmExpectedMessageFunction);
				messageBuildingBlock_lazy = () -> Arrays.asList(HostToATMRequestV01.mmHostToATMRequest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HostToATMRequest1";
				definition = "Information related to the request to an ATM to contact the ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment9 getEnvironment() {
		return environment;
	}

	public HostToATMRequest1 setEnvironment(ATMEnvironment9 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public Optional<ATMCommandIdentification1> getCommandIdentification() {
		return commandIdentification == null ? Optional.empty() : Optional.of(commandIdentification);
	}

	public HostToATMRequest1 setCommandIdentification(ATMCommandIdentification1 commandIdentification) {
		this.commandIdentification = commandIdentification;
		return this;
	}

	public MessageFunction8Code getExpectedMessageFunction() {
		return expectedMessageFunction;
	}

	public HostToATMRequest1 setExpectedMessageFunction(MessageFunction8Code expectedMessageFunction) {
		this.expectedMessageFunction = Objects.requireNonNull(expectedMessageFunction);
		return this;
	}
}
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
import com.tools20022.repository.codeset.ATMStatus2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMSecurityConfiguration1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters to be used to update the configuration or the status security
 * device.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCommandParameters1#mmSerialNumber
 * ATMCommandParameters1.mmSerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCommandParameters1#mmRequiredConfiguration
 * ATMCommandParameters1.mmRequiredConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCommandParameters1#mmRequiredStatus
 * ATMCommandParameters1.mmRequiredStatus}</li>
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
 * "ATMCommandParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters to be used to update the configuration or the status security device."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMCommandParameters1", propOrder = {"serialNumber", "requiredConfiguration", "requiredStatus"})
public class ATMCommandParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SrlNb")
	protected Max35Text serialNumber;
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
	 * {@linkplain com.tools20022.repository.msg.ATMCommandParameters1
	 * ATMCommandParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Serial number of the device."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommandParameters1, Optional<Max35Text>> mmSerialNumber = new MMMessageAttribute<ATMCommandParameters1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommandParameters1.mmObject();
			isDerived = false;
			xmlTag = "SrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerialNumber";
			definition = "Serial number of the device.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMCommandParameters1 obj) {
			return obj.getSerialNumber();
		}

		@Override
		public void setValue(ATMCommandParameters1 obj, Optional<Max35Text> value) {
			obj.setSerialNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqrdCfgtn")
	protected ATMSecurityConfiguration1 requiredConfiguration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1
	 * ATMSecurityConfiguration1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommandParameters1
	 * ATMCommandParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqrdCfgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Update of the security configuration to apply on the security module of the ATM."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMCommandParameters1, Optional<ATMSecurityConfiguration1>> mmRequiredConfiguration = new MMMessageAssociationEnd<ATMCommandParameters1, Optional<ATMSecurityConfiguration1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommandParameters1.mmObject();
			isDerived = false;
			xmlTag = "ReqrdCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredConfiguration";
			definition = "Update of the security configuration to apply on the security module of the ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMSecurityConfiguration1.mmObject();
		}

		@Override
		public Optional<ATMSecurityConfiguration1> getValue(ATMCommandParameters1 obj) {
			return obj.getRequiredConfiguration();
		}

		@Override
		public void setValue(ATMCommandParameters1 obj, Optional<ATMSecurityConfiguration1> value) {
			obj.setRequiredConfiguration(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqrdSts")
	protected ATMStatus2Code requiredStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMStatus2Code
	 * ATMStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommandParameters1
	 * ATMCommandParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqrdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New status to apply on the security module of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommandParameters1, Optional<ATMStatus2Code>> mmRequiredStatus = new MMMessageAttribute<ATMCommandParameters1, Optional<ATMStatus2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommandParameters1.mmObject();
			isDerived = false;
			xmlTag = "ReqrdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredStatus";
			definition = "New status to apply on the security module of the ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMStatus2Code.mmObject();
		}

		@Override
		public Optional<ATMStatus2Code> getValue(ATMCommandParameters1 obj) {
			return obj.getRequiredStatus();
		}

		@Override
		public void setValue(ATMCommandParameters1 obj, Optional<ATMStatus2Code> value) {
			obj.setRequiredStatus(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMCommandParameters1.mmSerialNumber, com.tools20022.repository.msg.ATMCommandParameters1.mmRequiredConfiguration,
						com.tools20022.repository.msg.ATMCommandParameters1.mmRequiredStatus);
				trace_lazy = () -> TerminalManagementSystem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCommandParameters1";
				definition = "Parameters to be used to update the configuration or the status security device.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getSerialNumber() {
		return serialNumber == null ? Optional.empty() : Optional.of(serialNumber);
	}

	public ATMCommandParameters1 setSerialNumber(Max35Text serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	public Optional<ATMSecurityConfiguration1> getRequiredConfiguration() {
		return requiredConfiguration == null ? Optional.empty() : Optional.of(requiredConfiguration);
	}

	public ATMCommandParameters1 setRequiredConfiguration(ATMSecurityConfiguration1 requiredConfiguration) {
		this.requiredConfiguration = requiredConfiguration;
		return this;
	}

	public Optional<ATMStatus2Code> getRequiredStatus() {
		return requiredStatus == null ? Optional.empty() : Optional.of(requiredStatus);
	}

	public ATMCommandParameters1 setRequiredStatus(ATMStatus2Code requiredStatus) {
		this.requiredStatus = requiredStatus;
		return this;
	}
}
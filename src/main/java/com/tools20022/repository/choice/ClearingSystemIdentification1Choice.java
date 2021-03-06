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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CashClearingSystem3Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashClearingSystem;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information used to identify a cash clearing system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification1Choice#mmClearingSystemIdentification
 * ClearingSystemIdentification1Choice.mmClearingSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification1Choice#mmProprietary
 * ClearingSystemIdentification1Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashClearingSystem
 * CashClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingSystemIdentification1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information used to identify a cash clearing system."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClearingSystemIdentification1Choice", propOrder = {"clearingSystemIdentification", "proprietary"})
public class ClearingSystemIdentification1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClrSysId", required = true)
	protected CashClearingSystem3Code clearingSystemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystem3Code
	 * CashClearingSystem3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmIdentification
	 * CashClearingSystem.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification1Choice
	 * ClearingSystemIdentification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSysId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Infrastructure through which the payment instruction is processed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemIdentification1Choice, CashClearingSystem3Code> mmClearingSystemIdentification = new MMMessageAttribute<ClearingSystemIdentification1Choice, CashClearingSystem3Code>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystem.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "ClrSysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemIdentification";
			definition = "Infrastructure through which the payment instruction is processed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashClearingSystem3Code.mmObject();
		}

		@Override
		public CashClearingSystem3Code getValue(ClearingSystemIdentification1Choice obj) {
			return obj.getClearingSystemIdentification();
		}

		@Override
		public void setValue(ClearingSystemIdentification1Choice obj, CashClearingSystem3Code value) {
			obj.setClearingSystemIdentification(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected Max35Text proprietary;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmIdentification
	 * CashClearingSystem.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification1Choice
	 * ClearingSystemIdentification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary clearing system service selected for a transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingSystemIdentification1Choice, Max35Text> mmProprietary = new MMMessageAttribute<ClearingSystemIdentification1Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> CashClearingSystem.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClearingSystemIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary clearing system service selected for a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ClearingSystemIdentification1Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(ClearingSystemIdentification1Choice obj, Max35Text value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClearingSystemIdentification1Choice.mmClearingSystemIdentification,
						com.tools20022.repository.choice.ClearingSystemIdentification1Choice.mmProprietary);
				trace_lazy = () -> CashClearingSystem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingSystemIdentification1Choice";
				definition = "Information used to identify a cash clearing system.";
			}
		});
		return mmObject_lazy.get();
	}

	public CashClearingSystem3Code getClearingSystemIdentification() {
		return clearingSystemIdentification;
	}

	public ClearingSystemIdentification1Choice setClearingSystemIdentification(CashClearingSystem3Code clearingSystemIdentification) {
		this.clearingSystemIdentification = Objects.requireNonNull(clearingSystemIdentification);
		return this;
	}

	public Max35Text getProprietary() {
		return proprietary;
	}

	public ClearingSystemIdentification1Choice setProprietary(Max35Text proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}
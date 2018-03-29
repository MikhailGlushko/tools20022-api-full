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
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification15;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between quantity formats for the balance information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceQuantity3Choice#mmQuantity
 * BalanceQuantity3Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceQuantity3Choice#mmProprietary
 * BalanceQuantity3Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceQuantity3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between quantity formats for the balance information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BalanceQuantity3Choice", propOrder = {"quantity", "proprietary"})
public class BalanceQuantity3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Qty", required = true)
	protected FinancialInstrumentQuantity1Choice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
	 * SecuritiesBalance.mmAggregateQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity3Choice
	 * BalanceQuantity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of financial instruments of the balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceQuantity3Choice, FinancialInstrumentQuantity1Choice> mmQuantity = new MMMessageAttribute<BalanceQuantity3Choice, FinancialInstrumentQuantity1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAggregateQuantity;
			componentContext_lazy = () -> com.tools20022.repository.choice.BalanceQuantity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Total quantity of financial instruments of the balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1Choice getValue(BalanceQuantity3Choice obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(BalanceQuantity3Choice obj, FinancialInstrumentQuantity1Choice value) {
			obj.setQuantity(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification15 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification15
	 * GenericIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
	 * SecuritiesBalance.mmAggregateQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity3Choice
	 * BalanceQuantity3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of financial instruments of the balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceQuantity3Choice, GenericIdentification15> mmProprietary = new MMMessageAttribute<BalanceQuantity3Choice, GenericIdentification15>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAggregateQuantity;
			componentContext_lazy = () -> com.tools20022.repository.choice.BalanceQuantity3Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Total quantity of financial instruments of the balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification15.mmObject();
		}

		@Override
		public GenericIdentification15 getValue(BalanceQuantity3Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(BalanceQuantity3Choice obj, GenericIdentification15 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BalanceQuantity3Choice.mmQuantity, com.tools20022.repository.choice.BalanceQuantity3Choice.mmProprietary);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BalanceQuantity3Choice";
				definition = "Choice between quantity formats for the balance information.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentQuantity1Choice getQuantity() {
		return quantity;
	}

	public BalanceQuantity3Choice setQuantity(FinancialInstrumentQuantity1Choice quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public GenericIdentification15 getProprietary() {
		return proprietary;
	}

	public BalanceQuantity3Choice setProprietary(GenericIdentification15 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}
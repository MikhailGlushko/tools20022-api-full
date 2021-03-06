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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AmountRange;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange2;
import com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a range of amount values with or without the currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange2Choice#mmImpliedCurrencyAndAmountRange
 * ActiveOrHistoricAmountRange2Choice.mmImpliedCurrencyAndAmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange2Choice#mmCurrencyAndAmountRange
 * ActiveOrHistoricAmountRange2Choice.mmCurrencyAndAmountRange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmountRange
 * AmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ActiveOrHistoricAmountRange2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a range of amount values with or without the currency."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange1Choice
 * ActiveOrHistoricAmountRange1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ActiveOrHistoricAmountRange2Choice", propOrder = {"impliedCurrencyAndAmountRange", "currencyAndAmountRange"})
public class ActiveOrHistoricAmountRange2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ImpldCcyAndAmtRg", required = true)
	protected ImpliedCurrencyAndAmountRange1 impliedCurrencyAndAmountRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange1
	 * ImpliedCurrencyAndAmountRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange2Choice
	 * ActiveOrHistoricAmountRange2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ImpldCcyAndAmtRg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpliedCurrencyAndAmountRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expresses an amount or an amount range with an explicit debit/credit indicator and where the currency is implied."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange1Choice#mmImpliedCurrencyAndAmountRange
	 * ActiveOrHistoricAmountRange1Choice.mmImpliedCurrencyAndAmountRange}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ActiveOrHistoricAmountRange2Choice, ImpliedCurrencyAndAmountRange1> mmImpliedCurrencyAndAmountRange = new MMMessageAssociationEnd<ActiveOrHistoricAmountRange2Choice, ImpliedCurrencyAndAmountRange1>() {
		{
			businessComponentTrace_lazy = () -> AmountRange.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ActiveOrHistoricAmountRange2Choice.mmObject();
			isDerived = false;
			xmlTag = "ImpldCcyAndAmtRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpliedCurrencyAndAmountRange";
			definition = "Expresses an amount or an amount range with an explicit debit/credit indicator and where the currency is implied.";
			previousVersion_lazy = () -> ActiveOrHistoricAmountRange1Choice.mmImpliedCurrencyAndAmountRange;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ImpliedCurrencyAndAmountRange1.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmountRange1 getValue(ActiveOrHistoricAmountRange2Choice obj) {
			return obj.getImpliedCurrencyAndAmountRange();
		}

		@Override
		public void setValue(ActiveOrHistoricAmountRange2Choice obj, ImpliedCurrencyAndAmountRange1 value) {
			obj.setImpliedCurrencyAndAmountRange(value);
		}
	};
	@XmlElement(name = "CcyAndAmtRg", required = true)
	protected ActiveOrHistoricCurrencyAndAmountRange2 currencyAndAmountRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ActiveOrHistoricCurrencyAndAmountRange2
	 * ActiveOrHistoricCurrencyAndAmountRange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange2Choice
	 * ActiveOrHistoricAmountRange2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyAndAmtRg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyAndAmountRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expresses an amount or an amount range with the currency and where the credit/debit indicator is explicit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ActiveOrHistoricAmountRange1Choice#mmCurrencyAndAmountRange
	 * ActiveOrHistoricAmountRange1Choice.mmCurrencyAndAmountRange}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ActiveOrHistoricAmountRange2Choice, ActiveOrHistoricCurrencyAndAmountRange2> mmCurrencyAndAmountRange = new MMMessageAssociationEnd<ActiveOrHistoricAmountRange2Choice, ActiveOrHistoricCurrencyAndAmountRange2>() {
		{
			businessComponentTrace_lazy = () -> AmountRange.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ActiveOrHistoricAmountRange2Choice.mmObject();
			isDerived = false;
			xmlTag = "CcyAndAmtRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyAndAmountRange";
			definition = "Expresses an amount or an amount range with the currency and where the credit/debit indicator is explicit.";
			previousVersion_lazy = () -> ActiveOrHistoricAmountRange1Choice.mmCurrencyAndAmountRange;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ActiveOrHistoricCurrencyAndAmountRange2.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmountRange2 getValue(ActiveOrHistoricAmountRange2Choice obj) {
			return obj.getCurrencyAndAmountRange();
		}

		@Override
		public void setValue(ActiveOrHistoricAmountRange2Choice obj, ActiveOrHistoricCurrencyAndAmountRange2 value) {
			obj.setCurrencyAndAmountRange(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ActiveOrHistoricAmountRange2Choice.mmImpliedCurrencyAndAmountRange,
						com.tools20022.repository.choice.ActiveOrHistoricAmountRange2Choice.mmCurrencyAndAmountRange);
				trace_lazy = () -> AmountRange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActiveOrHistoricAmountRange2Choice";
				definition = "Choice between a range of amount values with or without the currency.";
				previousVersion_lazy = () -> ActiveOrHistoricAmountRange1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ImpliedCurrencyAndAmountRange1 getImpliedCurrencyAndAmountRange() {
		return impliedCurrencyAndAmountRange;
	}

	public ActiveOrHistoricAmountRange2Choice setImpliedCurrencyAndAmountRange(ImpliedCurrencyAndAmountRange1 impliedCurrencyAndAmountRange) {
		this.impliedCurrencyAndAmountRange = Objects.requireNonNull(impliedCurrencyAndAmountRange);
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmountRange2 getCurrencyAndAmountRange() {
		return currencyAndAmountRange;
	}

	public ActiveOrHistoricAmountRange2Choice setCurrencyAndAmountRange(ActiveOrHistoricCurrencyAndAmountRange2 currencyAndAmountRange) {
		this.currencyAndAmountRange = Objects.requireNonNull(currencyAndAmountRange);
		return this;
	}
}
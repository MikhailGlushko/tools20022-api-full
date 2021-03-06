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
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.entity.AmountRange;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountRangeBoundary1;
import com.tools20022.repository.msg.FromToAmountRange;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between ranges of values in which an amount is considered valid or a
 * specified amount value which has to be matched or unmatched to be valid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmFromAmount
 * ImpliedCurrencyAmountRangeChoice.mmFromAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmToAmount
 * ImpliedCurrencyAmountRangeChoice.mmToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmFromToAmount
 * ImpliedCurrencyAmountRangeChoice.mmFromToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmEqualAmount
 * ImpliedCurrencyAmountRangeChoice.mmEqualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice#mmNotEqualAmount
 * ImpliedCurrencyAmountRangeChoice.mmNotEqualAmount}</li>
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
 * "ImpliedCurrencyAmountRangeChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between ranges of values in which an amount is considered valid or a specified amount value which has to be matched or unmatched to be valid."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2018</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice
 * ImpliedCurrencyAmountRange1Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ImpliedCurrencyAmountRangeChoice", propOrder = {"fromAmount", "toAmount", "fromToAmount", "equalAmount", "notEqualAmount"})
public class ImpliedCurrencyAmountRangeChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FrAmt", required = true)
	protected AmountRangeBoundary1 fromAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountRangeBoundary1
	 * AmountRangeBoundary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmFromAmount
	 * AmountRange.mmFromAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lower boundary of a range of amount values."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmFromAmount
	 * ImpliedCurrencyAmountRange1Choice.mmFromAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ImpliedCurrencyAmountRangeChoice, AmountRangeBoundary1> mmFromAmount = new MMMessageAttribute<ImpliedCurrencyAmountRangeChoice, AmountRangeBoundary1>() {
		{
			businessElementTrace_lazy = () -> AmountRange.mmFromAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.mmObject();
			isDerived = false;
			xmlTag = "FrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromAmount";
			definition = "Lower boundary of a range of amount values.";
			nextVersions_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRange1Choice.mmFromAmount);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountRangeBoundary1.mmObject();
		}

		@Override
		public AmountRangeBoundary1 getValue(ImpliedCurrencyAmountRangeChoice obj) {
			return obj.getFromAmount();
		}

		@Override
		public void setValue(ImpliedCurrencyAmountRangeChoice obj, AmountRangeBoundary1 value) {
			obj.setFromAmount(value);
		}
	};
	@XmlElement(name = "ToAmt", required = true)
	protected AmountRangeBoundary1 toAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountRangeBoundary1
	 * AmountRangeBoundary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmToAmount
	 * AmountRange.mmToAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ToAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Upper boundary of a range of amount values."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmToAmount
	 * ImpliedCurrencyAmountRange1Choice.mmToAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ImpliedCurrencyAmountRangeChoice, AmountRangeBoundary1> mmToAmount = new MMMessageAttribute<ImpliedCurrencyAmountRangeChoice, AmountRangeBoundary1>() {
		{
			businessElementTrace_lazy = () -> AmountRange.mmToAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.mmObject();
			isDerived = false;
			xmlTag = "ToAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAmount";
			definition = "Upper boundary of a range of amount values.";
			nextVersions_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRange1Choice.mmToAmount);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountRangeBoundary1.mmObject();
		}

		@Override
		public AmountRangeBoundary1 getValue(ImpliedCurrencyAmountRangeChoice obj) {
			return obj.getToAmount();
		}

		@Override
		public void setValue(ImpliedCurrencyAmountRangeChoice obj, AmountRangeBoundary1 value) {
			obj.setToAmount(value);
		}
	};
	@XmlElement(name = "FrToAmt", required = true)
	protected FromToAmountRange fromToAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FromToAmountRange
	 * FromToAmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of valid amount values."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmFromToAmount
	 * ImpliedCurrencyAmountRange1Choice.mmFromToAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ImpliedCurrencyAmountRangeChoice, FromToAmountRange> mmFromToAmount = new MMMessageAttribute<ImpliedCurrencyAmountRangeChoice, FromToAmountRange>() {
		{
			businessComponentTrace_lazy = () -> AmountRange.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.mmObject();
			isDerived = false;
			xmlTag = "FrToAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToAmount";
			definition = "Range of valid amount values.";
			nextVersions_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRange1Choice.mmFromToAmount);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FromToAmountRange.mmObject();
		}

		@Override
		public FromToAmountRange getValue(ImpliedCurrencyAmountRangeChoice obj) {
			return obj.getFromToAmount();
		}

		@Override
		public void setValue(ImpliedCurrencyAmountRangeChoice obj, FromToAmountRange value) {
			obj.setFromToAmount(value);
		}
	};
	@XmlElement(name = "EQAmt", required = true)
	protected ImpliedCurrencyAndAmount equalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmEqualAmount
	 * AmountRange.mmEqualAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EQAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exact value an amount must match to be considered valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmEqualAmount
	 * ImpliedCurrencyAmountRange1Choice.mmEqualAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ImpliedCurrencyAmountRangeChoice, ImpliedCurrencyAndAmount> mmEqualAmount = new MMMessageAttribute<ImpliedCurrencyAmountRangeChoice, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AmountRange.mmEqualAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.mmObject();
			isDerived = false;
			xmlTag = "EQAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualAmount";
			definition = "Exact value an amount must match to be considered valid.";
			nextVersions_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRange1Choice.mmEqualAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(ImpliedCurrencyAmountRangeChoice obj) {
			return obj.getEqualAmount();
		}

		@Override
		public void setValue(ImpliedCurrencyAmountRangeChoice obj, ImpliedCurrencyAndAmount value) {
			obj.setEqualAmount(value);
		}
	};
	@XmlElement(name = "NEQAmt", required = true)
	protected ImpliedCurrencyAndAmount notEqualAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmNotEqualAmount
	 * AmountRange.mmNotEqualAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NEQAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEqualAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value that an amount must not match to be considered valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice#mmNotEqualAmount
	 * ImpliedCurrencyAmountRange1Choice.mmNotEqualAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ImpliedCurrencyAmountRangeChoice, ImpliedCurrencyAndAmount> mmNotEqualAmount = new MMMessageAttribute<ImpliedCurrencyAmountRangeChoice, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AmountRange.mmNotEqualAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.mmObject();
			isDerived = false;
			xmlTag = "NEQAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEqualAmount";
			definition = "Value that an amount must not match to be considered valid.";
			nextVersions_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRange1Choice.mmNotEqualAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(ImpliedCurrencyAmountRangeChoice obj) {
			return obj.getNotEqualAmount();
		}

		@Override
		public void setValue(ImpliedCurrencyAmountRangeChoice obj, ImpliedCurrencyAndAmount value) {
			obj.setNotEqualAmount(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.mmFromAmount, com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.mmToAmount,
						com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.mmFromToAmount, com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.mmEqualAmount,
						com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.mmNotEqualAmount);
				trace_lazy = () -> AmountRange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ImpliedCurrencyAmountRangeChoice";
				definition = "Choice between ranges of values in which an amount is considered valid or a specified amount value which has to be matched or unmatched to be valid.";
				nextVersions_lazy = () -> Arrays.asList(ImpliedCurrencyAmountRange1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AmountRangeBoundary1 getFromAmount() {
		return fromAmount;
	}

	public ImpliedCurrencyAmountRangeChoice setFromAmount(AmountRangeBoundary1 fromAmount) {
		this.fromAmount = Objects.requireNonNull(fromAmount);
		return this;
	}

	public AmountRangeBoundary1 getToAmount() {
		return toAmount;
	}

	public ImpliedCurrencyAmountRangeChoice setToAmount(AmountRangeBoundary1 toAmount) {
		this.toAmount = Objects.requireNonNull(toAmount);
		return this;
	}

	public FromToAmountRange getFromToAmount() {
		return fromToAmount;
	}

	public ImpliedCurrencyAmountRangeChoice setFromToAmount(FromToAmountRange fromToAmount) {
		this.fromToAmount = Objects.requireNonNull(fromToAmount);
		return this;
	}

	public ImpliedCurrencyAndAmount getEqualAmount() {
		return equalAmount;
	}

	public ImpliedCurrencyAmountRangeChoice setEqualAmount(ImpliedCurrencyAndAmount equalAmount) {
		this.equalAmount = Objects.requireNonNull(equalAmount);
		return this;
	}

	public ImpliedCurrencyAndAmount getNotEqualAmount() {
		return notEqualAmount;
	}

	public ImpliedCurrencyAmountRangeChoice setNotEqualAmount(ImpliedCurrencyAndAmount notEqualAmount) {
		this.notEqualAmount = Objects.requireNonNull(notEqualAmount);
		return this;
	}
}
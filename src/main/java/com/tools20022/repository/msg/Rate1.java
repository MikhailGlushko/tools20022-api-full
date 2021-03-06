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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.RateTypeChoice;
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CurrencyAndAmountRange;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements qualifying the interest rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Rate1#mmRate Rate1.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Rate1#mmValidityRange
 * Rate1.mmValidityRange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InterestCalculation
 * InterestCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Rate1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of elements qualifying the interest rate."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Rate1", propOrder = {"rate", "validityRange"})
public class Rate1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rate", required = true)
	protected RateTypeChoice rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateTypeChoice
	 * RateTypeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRate
	 * InterestCalculation.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Rate1
	 * Rate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument. \nExample percentage rate: Rate expressed as a percentage, ie, in hundredths, eg, 0.7 is 7/10 of a percent, and 7.0 is 7%.\nExample Textual rate: Rate is expressed as a text."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Rate1, RateTypeChoice> mmRate = new MMMessageAssociationEnd<Rate1, RateTypeChoice>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Rate1.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument. \nExample percentage rate: Rate expressed as a percentage, ie, in hundredths, eg, 0.7 is 7/10 of a percent, and 7.0 is 7%.\nExample Textual rate: Rate is expressed as a text.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RateTypeChoice.mmObject();
		}

		@Override
		public RateTypeChoice getValue(Rate1 obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(Rate1 obj, RateTypeChoice value) {
			obj.setRate(value);
		}
	};
	@XmlElement(name = "VldtyRg")
	protected CurrencyAndAmountRange validityRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyAndAmountRange
	 * CurrencyAndAmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateValidityRange
	 * InterestCalculation.mmRateValidityRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Rate1
	 * Rate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyRg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "An amount range where the interest rate is applicable."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Rate1, Optional<CurrencyAndAmountRange>> mmValidityRange = new MMMessageAssociationEnd<Rate1, Optional<CurrencyAndAmountRange>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRateValidityRange;
			componentContext_lazy = () -> com.tools20022.repository.msg.Rate1.mmObject();
			isDerived = false;
			xmlTag = "VldtyRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityRange";
			definition = "An amount range where the interest rate is applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyAndAmountRange.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmountRange> getValue(Rate1 obj) {
			return obj.getValidityRange();
		}

		@Override
		public void setValue(Rate1 obj, Optional<CurrencyAndAmountRange> value) {
			obj.setValidityRange(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Rate1.mmRate, com.tools20022.repository.msg.Rate1.mmValidityRange);
				trace_lazy = () -> InterestCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Rate1";
				definition = "Set of elements qualifying the interest rate.";
			}
		});
		return mmObject_lazy.get();
	}

	public RateTypeChoice getRate() {
		return rate;
	}

	public Rate1 setRate(RateTypeChoice rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public Optional<CurrencyAndAmountRange> getValidityRange() {
		return validityRange == null ? Optional.empty() : Optional.of(validityRange);
	}

	public Rate1 setValidityRange(CurrencyAndAmountRange validityRange) {
		this.validityRange = validityRange;
		return this;
	}
}
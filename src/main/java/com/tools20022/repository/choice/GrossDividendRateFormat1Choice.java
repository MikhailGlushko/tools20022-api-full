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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RateType12Code;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.entity.Dividend;
import com.tools20022.repository.entity.RateAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RateTypeAndAmountAndStatus1;
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
 * Choice between an amount or an unspecified rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat1Choice#mmAmount
 * GrossDividendRateFormat1Choice.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat1Choice#mmRateTypeAndAmountAndRateStatus
 * GrossDividendRateFormat1Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat1Choice#mmNotSpecifiedRate
 * GrossDividendRateFormat1Choice.mmNotSpecifiedRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GrossDividendRateFormat1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between an amount or an unspecified rate."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forGrossDividendRateFormat1Choice
 * ConstraintCoexistenceAmountRule.forGrossDividendRateFormat1Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GrossDividendRateFormat1Choice", propOrder = {"amount", "rateTypeAndAmountAndRateStatus", "notSpecifiedRate"})
public class GrossDividendRateFormat1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt", required = true)
	protected ActiveCurrencyAnd13DecimalAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmAmount
	 * RateAndAmount.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat1Choice
	 * GrossDividendRateFormat1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of monetary units specified in a currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92F:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GrossDividendRateFormat1Choice, ActiveCurrencyAnd13DecimalAmount> mmAmount = new MMMessageAttribute<GrossDividendRateFormat1Choice, ActiveCurrencyAnd13DecimalAmount>() {
		{
			businessElementTrace_lazy = () -> RateAndAmount.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.GrossDividendRateFormat1Choice.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92F:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Number of monetary units specified in a currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAnd13DecimalAmount getValue(GrossDividendRateFormat1Choice obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(GrossDividendRateFormat1Choice obj, ActiveCurrencyAnd13DecimalAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "RateTpAndAmtAndRateSts", required = true)
	protected RateTypeAndAmountAndStatus1 rateTypeAndAmountAndRateStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus1
	 * RateTypeAndAmountAndStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat1Choice
	 * GrossDividendRateFormat1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTpAndAmtAndRateSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateTypeAndAmountAndRateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies different formats for the gross dividend rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92J:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GrossDividendRateFormat1Choice, RateTypeAndAmountAndStatus1> mmRateTypeAndAmountAndRateStatus = new MMMessageAssociationEnd<GrossDividendRateFormat1Choice, RateTypeAndAmountAndStatus1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.GrossDividendRateFormat1Choice.mmObject();
			isDerived = false;
			xmlTag = "RateTpAndAmtAndRateSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92J:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateTypeAndAmountAndRateStatus";
			definition = "Specifies different formats for the gross dividend rate.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RateTypeAndAmountAndStatus1.mmObject();
		}

		@Override
		public RateTypeAndAmountAndStatus1 getValue(GrossDividendRateFormat1Choice obj) {
			return obj.getRateTypeAndAmountAndRateStatus();
		}

		@Override
		public void setValue(GrossDividendRateFormat1Choice obj, RateTypeAndAmountAndStatus1 value) {
			obj.setRateTypeAndAmountAndRateStatus(value);
		}
	};
	@XmlElement(name = "NotSpcfdRate", required = true)
	protected RateType12Code notSpecifiedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RateType12Code
	 * RateType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat1Choice
	 * GrossDividendRateFormat1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the rate not specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92K:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GrossDividendRateFormat1Choice, RateType12Code> mmNotSpecifiedRate = new MMMessageAttribute<GrossDividendRateFormat1Choice, RateType12Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.GrossDividendRateFormat1Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92K:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedRate";
			definition = "Value of the rate not specified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateType12Code.mmObject();
		}

		@Override
		public RateType12Code getValue(GrossDividendRateFormat1Choice obj) {
			return obj.getNotSpecifiedRate();
		}

		@Override
		public void setValue(GrossDividendRateFormat1Choice obj, RateType12Code value) {
			obj.setNotSpecifiedRate(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.GrossDividendRateFormat1Choice.mmAmount, com.tools20022.repository.choice.GrossDividendRateFormat1Choice.mmRateTypeAndAmountAndRateStatus,
						com.tools20022.repository.choice.GrossDividendRateFormat1Choice.mmNotSpecifiedRate);
				trace_lazy = () -> Dividend.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forGrossDividendRateFormat1Choice);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "GrossDividendRateFormat1Choice";
				definition = "Choice between an amount or an unspecified rate.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public GrossDividendRateFormat1Choice setAmount(ActiveCurrencyAnd13DecimalAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public RateTypeAndAmountAndStatus1 getRateTypeAndAmountAndRateStatus() {
		return rateTypeAndAmountAndRateStatus;
	}

	public GrossDividendRateFormat1Choice setRateTypeAndAmountAndRateStatus(RateTypeAndAmountAndStatus1 rateTypeAndAmountAndRateStatus) {
		this.rateTypeAndAmountAndRateStatus = Objects.requireNonNull(rateTypeAndAmountAndRateStatus);
		return this;
	}

	public RateType12Code getNotSpecifiedRate() {
		return notSpecifiedRate;
	}

	public GrossDividendRateFormat1Choice setNotSpecifiedRate(RateType12Code notSpecifiedRate) {
		this.notSpecifiedRate = Objects.requireNonNull(notSpecifiedRate);
		return this;
	}
}
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
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.entity.Dividend;
import com.tools20022.repository.entity.RateAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndRateStatus1;
import com.tools20022.repository.msg.RateTypeAndAmountAndStatus29;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between different formats to express a net dividend.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat24Choice#mmAmount
 * NetDividendRateFormat24Choice.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat24Choice#mmAmountAndRateStatus
 * NetDividendRateFormat24Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat24Choice#mmRateTypeAndAmountAndRateStatus
 * NetDividendRateFormat24Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
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
 * "NetDividendRateFormat24Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between different formats to express a net dividend."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat32Choice
 * NetDividendRateFormat32Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NetDividendRateFormat24Choice", propOrder = {"amount", "amountAndRateStatus", "rateTypeAndAmountAndRateStatus"})
public class NetDividendRateFormat24Choice {

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
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
	 * Dividend.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat24Choice
	 * NetDividendRateFormat24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value expressed as an amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat32Choice#mmAmount
	 * NetDividendRateFormat32Choice.mmAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetDividendRateFormat24Choice, ActiveCurrencyAnd13DecimalAmount> mmAmount = new MMMessageAttribute<NetDividendRateFormat24Choice, ActiveCurrencyAnd13DecimalAmount>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNetDividend;
			componentContext_lazy = () -> com.tools20022.repository.choice.NetDividendRateFormat24Choice.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Value expressed as an amount.";
			nextVersions_lazy = () -> Arrays.asList(NetDividendRateFormat32Choice.mmAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAnd13DecimalAmount getValue(NetDividendRateFormat24Choice obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(NetDividendRateFormat24Choice obj, ActiveCurrencyAnd13DecimalAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "AmtAndRateSts", required = true)
	protected AmountAndRateStatus1 amountAndRateStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndRateStatus1
	 * AmountAndRateStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat24Choice
	 * NetDividendRateFormat24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtAndRateSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountAndRateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies an amount and a rate status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat32Choice#mmAmountAndRateStatus
	 * NetDividendRateFormat32Choice.mmAmountAndRateStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NetDividendRateFormat24Choice, AmountAndRateStatus1> mmAmountAndRateStatus = new MMMessageAssociationEnd<NetDividendRateFormat24Choice, AmountAndRateStatus1>() {
		{
			businessComponentTrace_lazy = () -> RateAndAmount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.NetDividendRateFormat24Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtAndRateSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountAndRateStatus";
			definition = "Specifies an amount and a rate status.";
			nextVersions_lazy = () -> Arrays.asList(NetDividendRateFormat32Choice.mmAmountAndRateStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndRateStatus1.mmObject();
		}

		@Override
		public AmountAndRateStatus1 getValue(NetDividendRateFormat24Choice obj) {
			return obj.getAmountAndRateStatus();
		}

		@Override
		public void setValue(NetDividendRateFormat24Choice obj, AmountAndRateStatus1 value) {
			obj.setAmountAndRateStatus(value);
		}
	};
	@XmlElement(name = "RateTpAndAmtAndRateSts", required = true)
	protected RateTypeAndAmountAndStatus29 rateTypeAndAmountAndRateStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus29
	 * RateTypeAndAmountAndStatus29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat24Choice
	 * NetDividendRateFormat24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTpAndAmtAndRateSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92J:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateTypeAndAmountAndRateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies different formats for the net dividend rate."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat32Choice#mmRateTypeAndAmountAndRateStatus
	 * NetDividendRateFormat32Choice.mmRateTypeAndAmountAndRateStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NetDividendRateFormat24Choice, RateTypeAndAmountAndStatus29> mmRateTypeAndAmountAndRateStatus = new MMMessageAssociationEnd<NetDividendRateFormat24Choice, RateTypeAndAmountAndStatus29>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.NetDividendRateFormat24Choice.mmObject();
			isDerived = false;
			xmlTag = "RateTpAndAmtAndRateSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92J:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateTypeAndAmountAndRateStatus";
			definition = "Specifies different formats for the net dividend rate.";
			nextVersions_lazy = () -> Arrays.asList(NetDividendRateFormat32Choice.mmRateTypeAndAmountAndRateStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RateTypeAndAmountAndStatus29.mmObject();
		}

		@Override
		public RateTypeAndAmountAndStatus29 getValue(NetDividendRateFormat24Choice obj) {
			return obj.getRateTypeAndAmountAndRateStatus();
		}

		@Override
		public void setValue(NetDividendRateFormat24Choice obj, RateTypeAndAmountAndStatus29 value) {
			obj.setRateTypeAndAmountAndRateStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NetDividendRateFormat24Choice.mmAmount, com.tools20022.repository.choice.NetDividendRateFormat24Choice.mmAmountAndRateStatus,
						com.tools20022.repository.choice.NetDividendRateFormat24Choice.mmRateTypeAndAmountAndRateStatus);
				trace_lazy = () -> Dividend.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetDividendRateFormat24Choice";
				definition = "Choice between different formats to express a net dividend.";
				nextVersions_lazy = () -> Arrays.asList(NetDividendRateFormat32Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public NetDividendRateFormat24Choice setAmount(ActiveCurrencyAnd13DecimalAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public AmountAndRateStatus1 getAmountAndRateStatus() {
		return amountAndRateStatus;
	}

	public NetDividendRateFormat24Choice setAmountAndRateStatus(AmountAndRateStatus1 amountAndRateStatus) {
		this.amountAndRateStatus = Objects.requireNonNull(amountAndRateStatus);
		return this;
	}

	public RateTypeAndAmountAndStatus29 getRateTypeAndAmountAndRateStatus() {
		return rateTypeAndAmountAndRateStatus;
	}

	public NetDividendRateFormat24Choice setRateTypeAndAmountAndRateStatus(RateTypeAndAmountAndStatus29 rateTypeAndAmountAndRateStatus) {
		this.rateTypeAndAmountAndRateStatus = Objects.requireNonNull(rateTypeAndAmountAndRateStatus);
		return this;
	}
}
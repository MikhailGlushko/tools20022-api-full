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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RateValueType7Code;
import com.tools20022.repository.entity.AmountAndQuantity;
import com.tools20022.repository.entity.AmountRatio;
import com.tools20022.repository.entity.QuantityRatio;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndQuantityRatio5;
import com.tools20022.repository.msg.AmountToAmountRatio3;
import com.tools20022.repository.msg.QuantityToQuantityRatio2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format to express a ratio.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmQuantityToQuantity
 * RatioFormat24Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmNotSpecifiedRate
 * RatioFormat24Choice.mmNotSpecifiedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmAmountToAmount
 * RatioFormat24Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmAmountToQuantity
 * RatioFormat24Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmQuantityToAmount
 * RatioFormat24Choice.mmQuantityToAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RatioFormat24Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format to express a ratio."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RatioFormat24Choice", propOrder = {"quantityToQuantity", "notSpecifiedRate", "amountToAmount", "amountToQuantity", "quantityToAmount"})
public class RatioFormat24Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected QuantityToQuantityRatio2 quantityToQuantity;
	/**
	 * Ratio expressed as a quotient of quantities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio2
	 * QuantityToQuantityRatio2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice
	 * RatioFormat24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyToQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio expressed as a quotient of quantities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantityToQuantity = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> QuantityRatio.mmObject();
			componentContext_lazy = () -> RatioFormat24Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyToQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToQuantity";
			definition = "Ratio expressed as a quotient of quantities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> QuantityToQuantityRatio2.mmObject();
		}
	};
	protected RateValueType7Code notSpecifiedRate;
	/**
	 * Value of the ratio not specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RateValueType7Code
	 * RateValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice
	 * RatioFormat24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the ratio not specified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotSpecifiedRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RatioFormat24Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedRate";
			definition = "Value of the ratio not specified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateValueType7Code.mmObject();
		}
	};
	protected AmountToAmountRatio3 amountToAmount;
	/**
	 * Ratio expressed as a quotient of amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountToAmountRatio3
	 * AmountToAmountRatio3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio AmountRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice
	 * RatioFormat24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio expressed as a quotient of amounts."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmountToAmount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AmountRatio.mmObject();
			componentContext_lazy = () -> RatioFormat24Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtToAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToAmount";
			definition = "Ratio expressed as a quotient of amounts.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountToAmountRatio3.mmObject();
		}
	};
	protected AmountAndQuantityRatio5 amountToQuantity;
	/**
	 * Ratio expressed as an amount to quantity ratio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio5
	 * AmountAndQuantityRatio5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice
	 * RatioFormat24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio expressed as an amount to quantity ratio."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmountToQuantity = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AmountAndQuantity.mmObject();
			componentContext_lazy = () -> RatioFormat24Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtToQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToQuantity";
			definition = "Ratio expressed as an amount to quantity ratio.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndQuantityRatio5.mmObject();
		}
	};
	protected AmountAndQuantityRatio5 quantityToAmount;
	/**
	 * Ratio expressed as a quantity to amount ratio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio5
	 * AmountAndQuantityRatio5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice
	 * RatioFormat24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyToAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio expressed as a quantity to amount ratio."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantityToAmount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AmountAndQuantity.mmObject();
			componentContext_lazy = () -> RatioFormat24Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyToAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToAmount";
			definition = "Ratio expressed as a quantity to amount ratio.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndQuantityRatio5.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RatioFormat24Choice.mmQuantityToQuantity, RatioFormat24Choice.mmNotSpecifiedRate, RatioFormat24Choice.mmAmountToAmount, RatioFormat24Choice.mmAmountToQuantity,
						RatioFormat24Choice.mmQuantityToAmount);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RatioFormat24Choice";
				definition = "Choice of format to express a ratio.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "QtyToQty", required = true)
	public QuantityToQuantityRatio2 getQuantityToQuantity() {
		return quantityToQuantity;
	}

	public void setQuantityToQuantity(QuantityToQuantityRatio2 quantityToQuantity) {
		this.quantityToQuantity = quantityToQuantity;
	}

	@XmlElement(name = "NotSpcfdRate", required = true)
	public RateValueType7Code getNotSpecifiedRate() {
		return notSpecifiedRate;
	}

	public void setNotSpecifiedRate(RateValueType7Code notSpecifiedRate) {
		this.notSpecifiedRate = notSpecifiedRate;
	}

	@XmlElement(name = "AmtToAmt", required = true)
	public AmountToAmountRatio3 getAmountToAmount() {
		return amountToAmount;
	}

	public void setAmountToAmount(AmountToAmountRatio3 amountToAmount) {
		this.amountToAmount = amountToAmount;
	}

	@XmlElement(name = "AmtToQty", required = true)
	public AmountAndQuantityRatio5 getAmountToQuantity() {
		return amountToQuantity;
	}

	public void setAmountToQuantity(AmountAndQuantityRatio5 amountToQuantity) {
		this.amountToQuantity = amountToQuantity;
	}

	@XmlElement(name = "QtyToAmt", required = true)
	public AmountAndQuantityRatio5 getQuantityToAmount() {
		return quantityToAmount;
	}

	public void setQuantityToAmount(AmountAndQuantityRatio5 quantityToAmount) {
		this.quantityToAmount = quantityToAmount;
	}
}
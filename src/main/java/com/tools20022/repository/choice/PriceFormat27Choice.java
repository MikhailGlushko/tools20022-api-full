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
import com.tools20022.repository.codeset.PriceValueType10Code;
import com.tools20022.repository.datatype.RestrictedFINDecimalNumber;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.msg.AmountPrice5;
import com.tools20022.repository.msg.PercentagePrice1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Choice between a percentage price or an amount price or an unspecified price
 * or index points.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice#mmPercentagePrice
 * PriceFormat27Choice.mmPercentagePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice#mmAmountPrice
 * PriceFormat27Choice.mmAmountPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice#mmNotSpecifiedPrice
 * PriceFormat27Choice.mmNotSpecifiedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice#mmIndexPoints
 * PriceFormat27Choice.mmIndexPoints}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceFormat27Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a percentage price or an amount price or an unspecified price or index points."
 * </li>
 * </ul>
 */
public class PriceFormat27Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentagePrice1 percentagePrice;
	/**
	 * Price expressed as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PercentagePrice1
	 * PercentagePrice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRate
	 * SecuritiesPricing.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice
	 * PriceFormat27Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentagePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a percentage."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPercentagePrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRate;
			componentContext_lazy = () -> PriceFormat27Choice.mmObject();
			isDerived = false;
			xmlTag = "PctgPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentagePrice";
			definition = "Price expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PercentagePrice1.mmObject();
		}
	};
	protected AmountPrice5 amountPrice;
	/**
	 * Price expressed as a currency and amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountPrice5
	 * AmountPrice5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmAmount
	 * Price.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice
	 * PriceFormat27Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a currency and amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmountPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Price.mmAmount;
			componentContext_lazy = () -> PriceFormat27Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPrice";
			definition = "Price expressed as a currency and amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountPrice5.mmObject();
		}
	};
	protected PriceValueType10Code notSpecifiedPrice;
	/**
	 * Value of the price not specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType10Code
	 * PriceValueType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice
	 * PriceFormat27Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price not specified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotSpecifiedPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PriceFormat27Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedPrice";
			definition = "Value of the price not specified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceValueType10Code.mmObject();
		}
	};
	protected RestrictedFINDecimalNumber indexPoints;
	/**
	 * Price expressed as an index points.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINDecimalNumber
	 * RestrictedFINDecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexPoints
	 * Index.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice
	 * PriceFormat27Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxPts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexPoints"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as an index points."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndexPoints = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Index.mmIndexPoints;
			componentContext_lazy = () -> PriceFormat27Choice.mmObject();
			isDerived = false;
			xmlTag = "IndxPts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexPoints";
			definition = "Price expressed as an index points.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINDecimalNumber.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceFormat27Choice.mmPercentagePrice, com.tools20022.repository.choice.PriceFormat27Choice.mmAmountPrice,
						com.tools20022.repository.choice.PriceFormat27Choice.mmNotSpecifiedPrice, com.tools20022.repository.choice.PriceFormat27Choice.mmIndexPoints);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PriceFormat27Choice";
				definition = "Choice between a percentage price or an amount price or an unspecified price or index points.";
			}
		});
		return mmObject_lazy.get();
	}

	public PercentagePrice1 getPercentagePrice() {
		return percentagePrice;
	}

	public void setPercentagePrice(PercentagePrice1 percentagePrice) {
		this.percentagePrice = percentagePrice;
	}

	public AmountPrice5 getAmountPrice() {
		return amountPrice;
	}

	public void setAmountPrice(AmountPrice5 amountPrice) {
		this.amountPrice = amountPrice;
	}

	public PriceValueType10Code getNotSpecifiedPrice() {
		return notSpecifiedPrice;
	}

	public void setNotSpecifiedPrice(PriceValueType10Code notSpecifiedPrice) {
		this.notSpecifiedPrice = notSpecifiedPrice;
	}

	public RestrictedFINDecimalNumber getIndexPoints() {
		return indexPoints;
	}

	public void setIndexPoints(RestrictedFINDecimalNumber indexPoints) {
		this.indexPoints = indexPoints;
	}
}
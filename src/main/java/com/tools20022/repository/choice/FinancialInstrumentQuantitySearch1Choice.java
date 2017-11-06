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
import com.tools20022.repository.entity.SecuritiesQuantity;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice between formats for the quantity of security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice#mmUnit
 * FinancialInstrumentQuantitySearch1Choice.mmUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice#mmFaceAmount
 * FinancialInstrumentQuantitySearch1Choice.mmFaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice#mmAmortisedValue
 * FinancialInstrumentQuantitySearch1Choice.mmAmortisedValue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
 * SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentQuantitySearch1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between formats for the quantity of security."</li>
 * </ul>
 */
public class FinancialInstrumentQuantitySearch1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected QuantityRange1Choice unit;
	/**
	 * Quantity expressed as a number, for example a number of shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.QuantityRange1Choice
	 * QuantityRange1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
	 * SecuritiesQuantity.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice
	 * FinancialInstrumentQuantitySearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as a number, for example a number of shares."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> FinancialInstrumentQuantitySearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "Unit";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit";
			definition = "Quantity expressed as a number, for example a number of shares.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.QuantityRange1Choice.mmObject();
		}
	};
	protected ImpliedCurrencyAmountRangeChoice faceAmount;
	/**
	 * Quantity expressed as an amount representing the face amount, that is the
	 * principal, of a debt instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmFaceAmount
	 * AssetHolding.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice
	 * FinancialInstrumentQuantitySearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FaceAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount representing the face amount, that is the principal, of a debt instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFaceAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmFaceAmount;
			componentContext_lazy = () -> FinancialInstrumentQuantitySearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "FaceAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaceAmount";
			definition = "Quantity expressed as an amount representing the face amount, that is the principal, of a debt instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.mmObject();
		}
	};
	protected ImpliedCurrencyAmountRangeChoice amortisedValue;
	/**
	 * Quantity expressed as an amount representing the current amortised face
	 * amount of a bond, for example, a periodic reduction/increase of a bond's
	 * principal amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmAmortisedFaceValue
	 * AssetHolding.mmAmortisedFaceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice
	 * FinancialInstrumentQuantitySearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtsdVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmortisedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmortisedValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmAmortisedFaceValue;
			componentContext_lazy = () -> FinancialInstrumentQuantitySearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtsdVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmortisedValue";
			definition = "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice.mmUnit, com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice.mmFaceAmount,
						com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice.mmAmortisedValue);
				trace_lazy = () -> SecuritiesQuantity.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrumentQuantitySearch1Choice";
				definition = "Choice between formats for the quantity of security.";
			}
		});
		return mmObject_lazy.get();
	}

	public QuantityRange1Choice getUnit() {
		return unit;
	}

	public void setUnit(com.tools20022.repository.choice.QuantityRange1Choice unit) {
		this.unit = unit;
	}

	public ImpliedCurrencyAmountRangeChoice getFaceAmount() {
		return faceAmount;
	}

	public void setFaceAmount(com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice faceAmount) {
		this.faceAmount = faceAmount;
	}

	public ImpliedCurrencyAmountRangeChoice getAmortisedValue() {
		return amortisedValue;
	}

	public void setAmortisedValue(com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice amortisedValue) {
		this.amortisedValue = amortisedValue;
	}
}
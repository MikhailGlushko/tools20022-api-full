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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.UnitOfMeasure3Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ProductQuantity;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Specifies the quantity of a product in a trade transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quantity2#mmUnitOfMeasureCodeOrOtherUnitOfMeasureRule
 * Quantity2.mmUnitOfMeasureCodeOrOtherUnitOfMeasureRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity2#mmUnitOfMeasureCode
 * Quantity2.mmUnitOfMeasureCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity2#mmOtherUnitOfMeasure
 * Quantity2.mmOtherUnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity2#mmValue
 * Quantity2.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity2#mmFactor
 * Quantity2.mmFactor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ProductQuantity
 * ProductQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Quantity2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the quantity of a product in a trade transaction."</li>
 * </ul>
 */
public class Quantity2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected UnitOfMeasure3Code unitOfMeasureCode;
	/**
	 * Specifies the unit of measurement. For example, kilo, tons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmUnitOfMeasure
	 * ProductQuantity.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quantity2
	 * Quantity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitOfMeasrCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasureCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the unit of measurement. For example, kilo, tons."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitOfMeasureCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmUnitOfMeasure;
			componentContext_lazy = () -> Quantity2.mmObject();
			isDerived = false;
			xmlTag = "UnitOfMeasrCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitOfMeasureCode";
			definition = "Specifies the unit of measurement. For example, kilo, tons.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnitOfMeasure3Code.mmObject();
		}
	};
	protected Max35Text otherUnitOfMeasure;
	/**
	 * Identifies the unit of measure not present in the code list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmUnitOfMeasure
	 * ProductQuantity.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quantity2
	 * Quantity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrUnitOfMeasr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherUnitOfMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the unit of measure not present in the code list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherUnitOfMeasure = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmUnitOfMeasure;
			componentContext_lazy = () -> Quantity2.mmObject();
			isDerived = false;
			xmlTag = "OthrUnitOfMeasr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherUnitOfMeasure";
			definition = "Identifies the unit of measure not present in the code list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DecimalNumber value;
	/**
	 * Quantity of a product on a line specified by a number. For example, 100
	 * (kgs), 50 (pieces).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
	 * SecuritiesQuantity.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quantity2
	 * Quantity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Val"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of a product on a line specified by a number. For example, 100 (kgs), 50 (pieces)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> Quantity2.mmObject();
			isDerived = false;
			xmlTag = "Val";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Quantity of a product on a line specified by a number. For example, 100 (kgs), 50 (pieces).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected Max15NumericText factor;
	/**
	 * Multiplication factor of measurement values. For example: goods that can
	 * be ordered by 36 pieces.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmFactor
	 * ProductQuantity.mmFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quantity2
	 * Quantity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Factor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multiplication factor of measurement values. For example: goods that can be ordered by 36 pieces."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmFactor;
			componentContext_lazy = () -> Quantity2.mmObject();
			isDerived = false;
			xmlTag = "Fctr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Factor";
			definition = "Multiplication factor of measurement values. For example: goods that can be ordered by 36 pieces.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * If UnitOfMeasureCode is present, then OtherUnitOfMeasure is not allowed.
	 * If UnitOfMeasureCode is not present, then OtherUnitOfMeasure is
	 * mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity2#mmUnitOfMeasureCode
	 * Quantity2.mmUnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity2#mmOtherUnitOfMeasure
	 * Quantity2.mmOtherUnitOfMeasure}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} = {@linkplain com.tools20022.repository.msg.Quantity2
	 * Quantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasureCodeOrOtherUnitOfMeasureRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If UnitOfMeasureCode is present, then OtherUnitOfMeasure is not allowed. If UnitOfMeasureCode is not present, then OtherUnitOfMeasure is mandatory."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmUnitOfMeasureCodeOrOtherUnitOfMeasureRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitOfMeasureCodeOrOtherUnitOfMeasureRule";
			definition = "If UnitOfMeasureCode is present, then OtherUnitOfMeasure is not allowed. If UnitOfMeasureCode is not present, then OtherUnitOfMeasure is mandatory.";
			messageComponent_lazy = () -> Quantity2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quantity2.mmUnitOfMeasureCode, com.tools20022.repository.msg.Quantity2.mmOtherUnitOfMeasure);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quantity2.mmUnitOfMeasureCode, com.tools20022.repository.msg.Quantity2.mmOtherUnitOfMeasure, com.tools20022.repository.msg.Quantity2.mmValue,
						com.tools20022.repository.msg.Quantity2.mmFactor);
				trace_lazy = () -> ProductQuantity.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Quantity2";
				definition = "Specifies the quantity of a product in a trade transaction.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quantity2.mmUnitOfMeasureCodeOrOtherUnitOfMeasureRule);
			}
		});
		return mmObject_lazy.get();
	}

	public UnitOfMeasure3Code getUnitOfMeasureCode() {
		return unitOfMeasureCode;
	}

	public void setUnitOfMeasureCode(UnitOfMeasure3Code unitOfMeasureCode) {
		this.unitOfMeasureCode = unitOfMeasureCode;
	}

	public Max35Text getOtherUnitOfMeasure() {
		return otherUnitOfMeasure;
	}

	public void setOtherUnitOfMeasure(Max35Text otherUnitOfMeasure) {
		this.otherUnitOfMeasure = otherUnitOfMeasure;
	}

	public DecimalNumber getValue() {
		return value;
	}

	public void setValue(DecimalNumber value) {
		this.value = value;
	}

	public Max15NumericText getFactor() {
		return factor;
	}

	public void setFactor(Max15NumericText factor) {
		this.factor = factor;
	}
}
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
import com.tools20022.repository.codeset.AdjustmentDirection1Code;
import com.tools20022.repository.codeset.AdjustmentType2Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Adjustment;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Modification on the value of goods and / or services. For example: rebate,
 * discount, surcharge
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Adjustment4#mmTypeOrOtherAdjustmentTypeRule
 * Adjustment4.mmTypeOrOtherAdjustmentTypeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment4#mmType
 * Adjustment4.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Adjustment4#mmOtherAdjustmentType
 * Adjustment4.mmOtherAdjustmentType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment4#mmDirection
 * Adjustment4.mmDirection}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment4#mmAmount
 * Adjustment4.mmAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
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
 * "Adjustment4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Modification on the value of goods and / or services. For example: rebate, discount, surcharge"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment6 Adjustment6}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class Adjustment4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AdjustmentType2Code type;
	/**
	 * Specifies the type of adjustment applied to the amount of goods/services
	 * by means of a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentType2Code
	 * AdjustmentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmType
	 * Adjustment.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Adjustment4 Adjustment4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of adjustment applied to the amount of goods/services by means of a code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Adjustment.mmType;
			componentContext_lazy = () -> Adjustment4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of adjustment applied to the amount of goods/services by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdjustmentType2Code.mmObject();
		}
	};
	protected Max35Text otherAdjustmentType;
	/**
	 * Specifies a type of adjustment not present in the code list.
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmType
	 * Adjustment.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Adjustment4 Adjustment4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAdjstmntTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAdjustmentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a type of adjustment not present in the code list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherAdjustmentType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Adjustment.mmType;
			componentContext_lazy = () -> Adjustment4.mmObject();
			isDerived = false;
			xmlTag = "OthrAdjstmntTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAdjustmentType";
			definition = "Specifies a type of adjustment not present in the code list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AdjustmentDirection1Code direction;
	/**
	 * Specifies whether the adjustment must be subtracted or added to the total
	 * amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentDirection1Code
	 * AdjustmentDirection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmDirection
	 * Adjustment.mmDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Adjustment4 Adjustment4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Drctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Direction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the adjustment must be subtracted or added to the total amount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment6#mmDirection
	 * Adjustment6.mmDirection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDirection = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Adjustment.mmDirection;
			componentContext_lazy = () -> Adjustment4.mmObject();
			isDerived = false;
			xmlTag = "Drctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Direction";
			definition = "Specifies whether the adjustment must be subtracted or added to the total amount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Adjustment6.mmDirection);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdjustmentDirection1Code.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * Specifies the monetary amount of the adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Adjustment4 Adjustment4}</li>
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
	 * definition} = "Specifies the monetary amount of the adjustment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment6#mmAmount
	 * Adjustment6.mmAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Adjustment.mmAmount;
			componentContext_lazy = () -> Adjustment4.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Specifies the monetary amount of the adjustment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Adjustment6.mmAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * If Type is present, then OtherAdjustmentType is not allowed. If Type is
	 * not present, then OtherAdjustmentType is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment4#mmType
	 * Adjustment4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Adjustment4#mmOtherAdjustmentType
	 * Adjustment4.mmOtherAdjustmentType}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.Adjustment4 Adjustment4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOrOtherAdjustmentTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is present, then OtherAdjustmentType is not allowed. If Type is not present, then OtherAdjustmentType is mandatory."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmTypeOrOtherAdjustmentTypeRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOrOtherAdjustmentTypeRule";
			definition = "If Type is present, then OtherAdjustmentType is not allowed. If Type is not present, then OtherAdjustmentType is mandatory.";
			messageComponent_lazy = () -> Adjustment4.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Adjustment4.mmType, com.tools20022.repository.msg.Adjustment4.mmOtherAdjustmentType);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Adjustment4.mmType, com.tools20022.repository.msg.Adjustment4.mmOtherAdjustmentType, com.tools20022.repository.msg.Adjustment4.mmDirection,
						com.tools20022.repository.msg.Adjustment4.mmAmount);
				trace_lazy = () -> Adjustment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Adjustment4";
				definition = "Modification on the value of goods and / or services. For example: rebate, discount, surcharge";
				nextVersions_lazy = () -> Arrays.asList(Adjustment6.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Adjustment4.mmTypeOrOtherAdjustmentTypeRule);
			}
		});
		return mmObject_lazy.get();
	}

	public AdjustmentType2Code getType() {
		return type;
	}

	public void setType(AdjustmentType2Code type) {
		this.type = type;
	}

	public Max35Text getOtherAdjustmentType() {
		return otherAdjustmentType;
	}

	public void setOtherAdjustmentType(Max35Text otherAdjustmentType) {
		this.otherAdjustmentType = otherAdjustmentType;
	}

	public AdjustmentDirection1Code getDirection() {
		return direction;
	}

	public void setDirection(AdjustmentDirection1Code direction) {
		this.direction = direction;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}
}
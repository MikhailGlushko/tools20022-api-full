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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max4Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Tax;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the subtotal calculated tax applicable for this settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmTypeCode
 * SettlementSubTotalCalculatedTax1.mmTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmCategoryCode
 * SettlementSubTotalCalculatedTax1.mmCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmCalculatedAmount
 * SettlementSubTotalCalculatedTax1.mmCalculatedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmBasisAmount
 * SettlementSubTotalCalculatedTax1.mmBasisAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmCalculatedRate
 * SettlementSubTotalCalculatedTax1.mmCalculatedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmExemptionReason
 * SettlementSubTotalCalculatedTax1.mmExemptionReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
 * "SettlementSubTotalCalculatedTax1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies  the subtotal calculated tax applicable for this settlement."</li>
 * </ul>
 */
public class SettlementSubTotalCalculatedTax1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max4Text typeCode;
	/**
	 * Type of tax applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTypeCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmType;
			componentContext_lazy = () -> SettlementSubTotalCalculatedTax1.mmObject();
			isDerived = false;
			xmlTag = "TpCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeCode";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};
	protected Max4Text categoryCode;
	/**
	 * Reference used to identify the nature of tax levied, such as Value Added
	 * Tax (VAT).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmIdentification
	 * Tax.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCategoryCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmIdentification;
			componentContext_lazy = () -> SettlementSubTotalCalculatedTax1.mmObject();
			isDerived = false;
			xmlTag = "CtgyCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryCode";
			definition = "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};
	protected List<CurrencyAndAmount> calculatedAmount;
	/**
	 * Monetary value resulting from the calculation of this tax, levy or duty.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculatedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value resulting from the calculation of this tax, levy or duty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCalculatedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmAmount;
			componentContext_lazy = () -> SettlementSubTotalCalculatedTax1.mmObject();
			isDerived = false;
			xmlTag = "ClctdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculatedAmount";
			definition = "Monetary value resulting from the calculation of this tax, levy or duty.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<CurrencyAndAmount> basisAmount;
	/**
	 * Monetary value used as the basis on which this tax, levy or duty is
	 * calculated.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsisAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value used as the basis on which this tax, levy or duty is calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBasisAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmAmount;
			componentContext_lazy = () -> SettlementSubTotalCalculatedTax1.mmObject();
			isDerived = false;
			xmlTag = "BsisAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisAmount";
			definition = "Monetary value used as the basis on which this tax, levy or duty is calculated.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate calculatedRate;
	/**
	 * Rate used to calculate the amount of this tax, levy or duty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculatedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the amount of this tax, levy or duty."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCalculatedRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmRate;
			componentContext_lazy = () -> SettlementSubTotalCalculatedTax1.mmObject();
			isDerived = false;
			xmlTag = "ClctdRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculatedRate";
			definition = "Rate used to calculate the amount of this tax, levy or duty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected TaxExemptionReason1 exemptionReason;
	/**
	 * Reason for a tax exemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TaxExemptionReason1
	 * TaxExemptionReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmExemptionReason
	 * Tax.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for a tax exemption."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExemptionReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmExemptionReason;
			componentContext_lazy = () -> SettlementSubTotalCalculatedTax1.mmObject();
			isDerived = false;
			xmlTag = "XmptnRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for a tax exemption.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TaxExemptionReason1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmTypeCode, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmCategoryCode,
						com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmCalculatedAmount, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmBasisAmount,
						com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmCalculatedRate, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmExemptionReason);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementSubTotalCalculatedTax1";
				definition = "Specifies  the subtotal calculated tax applicable for this settlement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max4Text getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(Max4Text typeCode) {
		this.typeCode = typeCode;
	}

	public Max4Text getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(Max4Text categoryCode) {
		this.categoryCode = categoryCode;
	}

	public List<CurrencyAndAmount> getCalculatedAmount() {
		return calculatedAmount;
	}

	public void setCalculatedAmount(List<CurrencyAndAmount> calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}

	public List<CurrencyAndAmount> getBasisAmount() {
		return basisAmount;
	}

	public void setBasisAmount(List<CurrencyAndAmount> basisAmount) {
		this.basisAmount = basisAmount;
	}

	public PercentageRate getCalculatedRate() {
		return calculatedRate;
	}

	public void setCalculatedRate(PercentageRate calculatedRate) {
		this.calculatedRate = calculatedRate;
	}

	public TaxExemptionReason1 getExemptionReason() {
		return exemptionReason;
	}

	public void setExemptionReason(com.tools20022.repository.msg.TaxExemptionReason1 exemptionReason) {
		this.exemptionReason = exemptionReason;
	}
}
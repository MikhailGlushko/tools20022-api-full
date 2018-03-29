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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Allowance;
import com.tools20022.repository.entity.LineItem;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Trade settlement monetary summation specified for this supply chain trade
 * settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1#mmLineTotalAmount
 * LineItemMonetarySummation1.mmLineTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1#mmAllowanceTotalAmount
 * LineItemMonetarySummation1.mmAllowanceTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1#mmChargeTotalAmount
 * LineItemMonetarySummation1.mmChargeTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1#mmTaxTotalAmount
 * LineItemMonetarySummation1.mmTaxTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1#mmTaxBasisTotalAmount
 * LineItemMonetarySummation1.mmTaxBasisTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1#mmInformationAmount
 * LineItemMonetarySummation1.mmInformationAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
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
 * "LineItemMonetarySummation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Trade settlement monetary summation specified for this supply chain trade settlement."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LineItemMonetarySummation1", propOrder = {"lineTotalAmount", "allowanceTotalAmount", "chargeTotalAmount", "taxTotalAmount", "taxBasisTotalAmount", "informationAmount"})
public class LineItemMonetarySummation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LineTtlAmt")
	protected List<CurrencyAndAmount> lineTotalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1
	 * LineItemMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the line amount total being reported in this trade settlement monetary summation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemMonetarySummation1, List<CurrencyAndAmount>> mmLineTotalAmount = new MMMessageAttribute<LineItemMonetarySummation1, List<CurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "LineTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineTotalAmount";
			definition = "Monetary value of the line amount total being reported in this trade settlement monetary summation.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(LineItemMonetarySummation1 obj) {
			return obj.getLineTotalAmount();
		}

		@Override
		public void setValue(LineItemMonetarySummation1 obj, List<CurrencyAndAmount> value) {
			obj.setLineTotalAmount(value);
		}
	};
	@XmlElement(name = "AllwncTtlAmt")
	protected List<CurrencyAndAmount> allowanceTotalAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Allowance#mmTotalAllowance
	 * Allowance.mmTotalAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1
	 * LineItemMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllwncTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowanceTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the total of all allowance amounts being reported in this line item monetary summation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemMonetarySummation1, List<CurrencyAndAmount>> mmAllowanceTotalAmount = new MMMessageAttribute<LineItemMonetarySummation1, List<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Allowance.mmTotalAllowance;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "AllwncTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowanceTotalAmount";
			definition = "Monetary value of the total of all allowance amounts being reported in this line item monetary summation.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(LineItemMonetarySummation1 obj) {
			return obj.getAllowanceTotalAmount();
		}

		@Override
		public void setValue(LineItemMonetarySummation1 obj, List<CurrencyAndAmount> value) {
			obj.setAllowanceTotalAmount(value);
		}
	};
	@XmlElement(name = "ChrgTtlAmt")
	protected List<CurrencyAndAmount> chargeTotalAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1
	 * LineItemMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the total of all charge amounts being reported in this line item monetary summation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemMonetarySummation1, List<CurrencyAndAmount>> mmChargeTotalAmount = new MMMessageAttribute<LineItemMonetarySummation1, List<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "ChrgTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeTotalAmount";
			definition = "Monetary value of the total of all charge amounts being reported in this line item monetary summation.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(LineItemMonetarySummation1 obj) {
			return obj.getChargeTotalAmount();
		}

		@Override
		public void setValue(LineItemMonetarySummation1 obj, List<CurrencyAndAmount> value) {
			obj.setChargeTotalAmount(value);
		}
	};
	@XmlElement(name = "TaxTtlAmt")
	protected List<CurrencyAndAmount> taxTotalAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1
	 * LineItemMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the total of all tax amounts being reported in this line item monetary summation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemMonetarySummation1, List<CurrencyAndAmount>> mmTaxTotalAmount = new MMMessageAttribute<LineItemMonetarySummation1, List<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "TaxTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxTotalAmount";
			definition = "Monetary value of the total of all tax amounts being reported in this line item monetary summation.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(LineItemMonetarySummation1 obj) {
			return obj.getTaxTotalAmount();
		}

		@Override
		public void setValue(LineItemMonetarySummation1 obj, List<CurrencyAndAmount> value) {
			obj.setTaxTotalAmount(value);
		}
	};
	@XmlElement(name = "TaxBsisTtlAmt")
	protected List<CurrencyAndAmount> taxBasisTotalAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxableBaseAmount
	 * Tax.mmTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1
	 * LineItemMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxBsisTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxBasisTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the total of all tax basis amounts being reported in this line item monetary summation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemMonetarySummation1, List<CurrencyAndAmount>> mmTaxBasisTotalAmount = new MMMessageAttribute<LineItemMonetarySummation1, List<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxableBaseAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "TaxBsisTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxBasisTotalAmount";
			definition = "Monetary value of the total of all tax basis amounts being reported in this line item monetary summation.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(LineItemMonetarySummation1 obj) {
			return obj.getTaxBasisTotalAmount();
		}

		@Override
		public void setValue(LineItemMonetarySummation1 obj, List<CurrencyAndAmount> value) {
			obj.setTaxBasisTotalAmount(value);
		}
	};
	@XmlElement(name = "InfAmt")
	protected List<CurrencyAndAmount> informationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1
	 * LineItemMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of an amount being reported for information in this line item monetary summation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemMonetarySummation1, List<CurrencyAndAmount>> mmInformationAmount = new MMMessageAttribute<LineItemMonetarySummation1, List<CurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "InfAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationAmount";
			definition = "Monetary value of an amount being reported for information in this line item monetary summation.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(LineItemMonetarySummation1 obj) {
			return obj.getInformationAmount();
		}

		@Override
		public void setValue(LineItemMonetarySummation1 obj, List<CurrencyAndAmount> value) {
			obj.setInformationAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemMonetarySummation1.mmLineTotalAmount, com.tools20022.repository.msg.LineItemMonetarySummation1.mmAllowanceTotalAmount,
						com.tools20022.repository.msg.LineItemMonetarySummation1.mmChargeTotalAmount, com.tools20022.repository.msg.LineItemMonetarySummation1.mmTaxTotalAmount,
						com.tools20022.repository.msg.LineItemMonetarySummation1.mmTaxBasisTotalAmount, com.tools20022.repository.msg.LineItemMonetarySummation1.mmInformationAmount);
				trace_lazy = () -> LineItem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItemMonetarySummation1";
				definition = "Trade settlement monetary summation specified for this supply chain trade settlement.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<CurrencyAndAmount> getLineTotalAmount() {
		return lineTotalAmount == null ? lineTotalAmount = new ArrayList<>() : lineTotalAmount;
	}

	public LineItemMonetarySummation1 setLineTotalAmount(List<CurrencyAndAmount> lineTotalAmount) {
		this.lineTotalAmount = Objects.requireNonNull(lineTotalAmount);
		return this;
	}

	public List<CurrencyAndAmount> getAllowanceTotalAmount() {
		return allowanceTotalAmount == null ? allowanceTotalAmount = new ArrayList<>() : allowanceTotalAmount;
	}

	public LineItemMonetarySummation1 setAllowanceTotalAmount(List<CurrencyAndAmount> allowanceTotalAmount) {
		this.allowanceTotalAmount = Objects.requireNonNull(allowanceTotalAmount);
		return this;
	}

	public List<CurrencyAndAmount> getChargeTotalAmount() {
		return chargeTotalAmount == null ? chargeTotalAmount = new ArrayList<>() : chargeTotalAmount;
	}

	public LineItemMonetarySummation1 setChargeTotalAmount(List<CurrencyAndAmount> chargeTotalAmount) {
		this.chargeTotalAmount = Objects.requireNonNull(chargeTotalAmount);
		return this;
	}

	public List<CurrencyAndAmount> getTaxTotalAmount() {
		return taxTotalAmount == null ? taxTotalAmount = new ArrayList<>() : taxTotalAmount;
	}

	public LineItemMonetarySummation1 setTaxTotalAmount(List<CurrencyAndAmount> taxTotalAmount) {
		this.taxTotalAmount = Objects.requireNonNull(taxTotalAmount);
		return this;
	}

	public List<CurrencyAndAmount> getTaxBasisTotalAmount() {
		return taxBasisTotalAmount == null ? taxBasisTotalAmount = new ArrayList<>() : taxBasisTotalAmount;
	}

	public LineItemMonetarySummation1 setTaxBasisTotalAmount(List<CurrencyAndAmount> taxBasisTotalAmount) {
		this.taxBasisTotalAmount = Objects.requireNonNull(taxBasisTotalAmount);
		return this;
	}

	public List<CurrencyAndAmount> getInformationAmount() {
		return informationAmount == null ? informationAmount = new ArrayList<>() : informationAmount;
	}

	public LineItemMonetarySummation1 setInformationAmount(List<CurrencyAndAmount> informationAmount) {
		this.informationAmount = Objects.requireNonNull(informationAmount);
		return this;
	}
}
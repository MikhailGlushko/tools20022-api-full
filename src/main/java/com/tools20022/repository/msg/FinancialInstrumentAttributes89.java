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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.PhysicalTransferType4Code;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.PhysicalDelivery;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContractSize1;
import com.tools20022.repository.msg.GenericIdentification168;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Elements characterising a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes89#mmContractSize
 * FinancialInstrumentAttributes89.mmContractSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes89#mmDeliveryType
 * FinancialInstrumentAttributes89.mmDeliveryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes89#mmUnderlyingIdentification
 * FinancialInstrumentAttributes89.mmUnderlyingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes89#mmPriceCurrency
 * FinancialInstrumentAttributes89.mmPriceCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentAttributes89"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Elements characterising a financial instrument."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributes89", propOrder = {"contractSize", "deliveryType", "underlyingIdentification", "priceCurrency"})
public class FinancialInstrumentAttributes89 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtrctSz", required = true)
	protected ContractSize1 contractSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContractSize1
	 * ContractSize1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes89
	 * FinancialInstrumentAttributes89}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctSz"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of product defined in the contract.\r\n\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes89, ContractSize1> mmContractSize = new MMMessageAssociationEnd<FinancialInstrumentAttributes89, ContractSize1>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes89.mmObject();
			isDerived = false;
			xmlTag = "CtrctSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSize";
			definition = "Quantity of product defined in the contract.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ContractSize1.mmObject();
		}

		@Override
		public ContractSize1 getValue(FinancialInstrumentAttributes89 obj) {
			return obj.getContractSize();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes89 obj, ContractSize1 value) {
			obj.setContractSize(value);
		}
	};
	@XmlElement(name = "DlvryTp", required = true)
	protected PhysicalTransferType4Code deliveryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferType4Code
	 * PhysicalTransferType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmType
	 * PhysicalDelivery.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes89
	 * FinancialInstrumentAttributes89}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the contract is cash/physical/optional settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes89, PhysicalTransferType4Code> mmDeliveryType = new MMMessageAttribute<FinancialInstrumentAttributes89, PhysicalTransferType4Code>() {
		{
			businessElementTrace_lazy = () -> PhysicalDelivery.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes89.mmObject();
			isDerived = false;
			xmlTag = "DlvryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryType";
			definition = "Indicates whether the contract is cash/physical/optional settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PhysicalTransferType4Code.mmObject();
		}

		@Override
		public PhysicalTransferType4Code getValue(FinancialInstrumentAttributes89 obj) {
			return obj.getDeliveryType();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes89 obj, PhysicalTransferType4Code value) {
			obj.setDeliveryType(value);
		}
	};
	@XmlElement(name = "UndrlygId", required = true)
	protected GenericIdentification168 underlyingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification168
	 * GenericIdentification168}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes89
	 * FinancialInstrumentAttributes89}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for underlying or deliverable financial product on which final settlement price or equivalent is calculated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes89, GenericIdentification168> mmUnderlyingIdentification = new MMMessageAssociationEnd<FinancialInstrumentAttributes89, GenericIdentification168>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes89.mmObject();
			isDerived = false;
			xmlTag = "UndrlygId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingIdentification";
			definition = "Unique identifier for underlying or deliverable financial product on which final settlement price or equivalent is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification168.mmObject();
		}

		@Override
		public GenericIdentification168 getValue(FinancialInstrumentAttributes89 obj) {
			return obj.getUnderlyingIdentification();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes89 obj, GenericIdentification168 value) {
			obj.setUnderlyingIdentification(value);
		}
	};
	@XmlElement(name = "PricCcy", required = true)
	protected ActiveCurrencyCode priceCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmUnitCurrency
	 * CurrencyExchange.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes89
	 * FinancialInstrumentAttributes89}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the currency of price of underlying.\r\n\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes89, ActiveCurrencyCode> mmPriceCurrency = new MMMessageAttribute<FinancialInstrumentAttributes89, ActiveCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmUnitCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes89.mmObject();
			isDerived = false;
			xmlTag = "PricCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCurrency";
			definition = "Specifies the currency of price of underlying.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(FinancialInstrumentAttributes89 obj) {
			return obj.getPriceCurrency();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes89 obj, ActiveCurrencyCode value) {
			obj.setPriceCurrency(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes89.mmContractSize, com.tools20022.repository.msg.FinancialInstrumentAttributes89.mmDeliveryType,
						com.tools20022.repository.msg.FinancialInstrumentAttributes89.mmUnderlyingIdentification, com.tools20022.repository.msg.FinancialInstrumentAttributes89.mmPriceCurrency);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrumentAttributes89";
				definition = "Elements characterising a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public ContractSize1 getContractSize() {
		return contractSize;
	}

	public FinancialInstrumentAttributes89 setContractSize(ContractSize1 contractSize) {
		this.contractSize = Objects.requireNonNull(contractSize);
		return this;
	}

	public PhysicalTransferType4Code getDeliveryType() {
		return deliveryType;
	}

	public FinancialInstrumentAttributes89 setDeliveryType(PhysicalTransferType4Code deliveryType) {
		this.deliveryType = Objects.requireNonNull(deliveryType);
		return this;
	}

	public GenericIdentification168 getUnderlyingIdentification() {
		return underlyingIdentification;
	}

	public FinancialInstrumentAttributes89 setUnderlyingIdentification(GenericIdentification168 underlyingIdentification) {
		this.underlyingIdentification = Objects.requireNonNull(underlyingIdentification);
		return this;
	}

	public ActiveCurrencyCode getPriceCurrency() {
		return priceCurrency;
	}

	public FinancialInstrumentAttributes89 setPriceCurrency(ActiveCurrencyCode priceCurrency) {
		this.priceCurrency = Objects.requireNonNull(priceCurrency);
		return this;
	}
}
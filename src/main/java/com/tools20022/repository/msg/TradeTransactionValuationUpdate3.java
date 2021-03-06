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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CommonTradeDataReport24;
import com.tools20022.repository.msg.CounterpartySpecificData20;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TechnicalAttributes1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details of a valuation update report on a trade transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransactionValuationUpdate3#mmCounterpartySpecificData
 * TradeTransactionValuationUpdate3.mmCounterpartySpecificData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransactionValuationUpdate3#mmCommonTradeData
 * TradeTransactionValuationUpdate3.mmCommonTradeData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransactionValuationUpdate3#mmTechnicalAttributes
 * TradeTransactionValuationUpdate3.mmTechnicalAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransactionValuationUpdate3#mmSupplementaryData
 * TradeTransactionValuationUpdate3.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeTransactionValuationUpdate3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details of a valuation update report on a trade transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeTransactionValuationUpdate3", propOrder = {"counterpartySpecificData", "commonTradeData", "technicalAttributes", "supplementaryData"})
public class TradeTransactionValuationUpdate3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtrPtySpcfcData", required = true)
	protected List<CounterpartySpecificData20> counterpartySpecificData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartySpecificData20
	 * CounterpartySpecificData20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionValuationUpdate3
	 * TradeTransactionValuationUpdate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySpcfcData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySpecificData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade transaction data details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransactionValuationUpdate3, List<CounterpartySpecificData20>> mmCounterpartySpecificData = new MMMessageAssociationEnd<TradeTransactionValuationUpdate3, List<CounterpartySpecificData20>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransactionValuationUpdate3.mmObject();
			isDerived = false;
			xmlTag = "CtrPtySpcfcData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySpecificData";
			definition = "Trade transaction data details.";
			maxOccurs = 2;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CounterpartySpecificData20.mmObject();
		}

		@Override
		public List<CounterpartySpecificData20> getValue(TradeTransactionValuationUpdate3 obj) {
			return obj.getCounterpartySpecificData();
		}

		@Override
		public void setValue(TradeTransactionValuationUpdate3 obj, List<CounterpartySpecificData20> value) {
			obj.setCounterpartySpecificData(value);
		}
	};
	@XmlElement(name = "CmonTradData")
	protected CommonTradeDataReport24 commonTradeData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport24
	 * CommonTradeDataReport24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionValuationUpdate3
	 * TradeTransactionValuationUpdate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonTradData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonTradeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade transaction data details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransactionValuationUpdate3, Optional<CommonTradeDataReport24>> mmCommonTradeData = new MMMessageAssociationEnd<TradeTransactionValuationUpdate3, Optional<CommonTradeDataReport24>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransactionValuationUpdate3.mmObject();
			isDerived = false;
			xmlTag = "CmonTradData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonTradeData";
			definition = "Trade transaction data details.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommonTradeDataReport24.mmObject();
		}

		@Override
		public Optional<CommonTradeDataReport24> getValue(TradeTransactionValuationUpdate3 obj) {
			return obj.getCommonTradeData();
		}

		@Override
		public void setValue(TradeTransactionValuationUpdate3 obj, Optional<CommonTradeDataReport24> value) {
			obj.setCommonTradeData(value.orElse(null));
		}
	};
	@XmlElement(name = "TechAttrbts")
	protected TechnicalAttributes1 technicalAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TechnicalAttributes1
	 * TechnicalAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionValuationUpdate3
	 * TradeTransactionValuationUpdate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies technical attributes of the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransactionValuationUpdate3, Optional<TechnicalAttributes1>> mmTechnicalAttributes = new MMMessageAssociationEnd<TradeTransactionValuationUpdate3, Optional<TechnicalAttributes1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransactionValuationUpdate3.mmObject();
			isDerived = false;
			xmlTag = "TechAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalAttributes";
			definition = "Specifies technical attributes of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TechnicalAttributes1.mmObject();
		}

		@Override
		public Optional<TechnicalAttributes1> getValue(TradeTransactionValuationUpdate3 obj) {
			return obj.getTechnicalAttributes();
		}

		@Override
		public void setValue(TradeTransactionValuationUpdate3 obj, Optional<TechnicalAttributes1> value) {
			obj.setTechnicalAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionValuationUpdate3
	 * TradeTransactionValuationUpdate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeTransactionValuationUpdate3, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<TradeTransactionValuationUpdate3, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeTransactionValuationUpdate3.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(TradeTransactionValuationUpdate3 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(TradeTransactionValuationUpdate3 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeTransactionValuationUpdate3.mmCounterpartySpecificData, com.tools20022.repository.msg.TradeTransactionValuationUpdate3.mmCommonTradeData,
						com.tools20022.repository.msg.TradeTransactionValuationUpdate3.mmTechnicalAttributes, com.tools20022.repository.msg.TradeTransactionValuationUpdate3.mmSupplementaryData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeTransactionValuationUpdate3";
				definition = "Provides details of a valuation update report on a trade transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<CounterpartySpecificData20> getCounterpartySpecificData() {
		return counterpartySpecificData == null ? counterpartySpecificData = new ArrayList<>() : counterpartySpecificData;
	}

	public TradeTransactionValuationUpdate3 setCounterpartySpecificData(List<CounterpartySpecificData20> counterpartySpecificData) {
		this.counterpartySpecificData = Objects.requireNonNull(counterpartySpecificData);
		return this;
	}

	public Optional<CommonTradeDataReport24> getCommonTradeData() {
		return commonTradeData == null ? Optional.empty() : Optional.of(commonTradeData);
	}

	public TradeTransactionValuationUpdate3 setCommonTradeData(CommonTradeDataReport24 commonTradeData) {
		this.commonTradeData = commonTradeData;
		return this;
	}

	public Optional<TechnicalAttributes1> getTechnicalAttributes() {
		return technicalAttributes == null ? Optional.empty() : Optional.of(technicalAttributes);
	}

	public TradeTransactionValuationUpdate3 setTechnicalAttributes(TechnicalAttributes1 technicalAttributes) {
		this.technicalAttributes = technicalAttributes;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public TradeTransactionValuationUpdate3 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}
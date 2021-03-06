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
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContractType6;
import com.tools20022.repository.msg.TradeTransaction18;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to contract and transaction details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport25#mmContractData
 * CommonTradeDataReport25.mmContractData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport25#mmTransactionData
 * CommonTradeDataReport25.mmTransactionData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommonTradeDataReport25"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to contract and transaction details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CommonTradeDataReport25", propOrder = {"contractData", "transactionData"})
public class CommonTradeDataReport25 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtrctData")
	protected ContractType6 contractData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContractType6
	 * ContractType6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport25
	 * CommonTradeDataReport25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data related to a trade contract."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonTradeDataReport25, Optional<ContractType6>> mmContractData = new MMMessageAssociationEnd<CommonTradeDataReport25, Optional<ContractType6>>() {
		{
			businessComponentTrace_lazy = () -> Derivative.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonTradeDataReport25.mmObject();
			isDerived = false;
			xmlTag = "CtrctData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractData";
			definition = "Data related to a trade contract.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContractType6.mmObject();
		}

		@Override
		public Optional<ContractType6> getValue(CommonTradeDataReport25 obj) {
			return obj.getContractData();
		}

		@Override
		public void setValue(CommonTradeDataReport25 obj, Optional<ContractType6> value) {
			obj.setContractData(value.orElse(null));
		}
	};
	@XmlElement(name = "TxData", required = true)
	protected TradeTransaction18 transactionData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeTransaction18
	 * TradeTransaction18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CommonTradeDataReport25
	 * CommonTradeDataReport25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data related to a trade transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CommonTradeDataReport25, TradeTransaction18> mmTransactionData = new MMMessageAssociationEnd<CommonTradeDataReport25, TradeTransaction18>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTrade.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CommonTradeDataReport25.mmObject();
			isDerived = false;
			xmlTag = "TxData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionData";
			definition = "Data related to a trade transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeTransaction18.mmObject();
		}

		@Override
		public TradeTransaction18 getValue(CommonTradeDataReport25 obj) {
			return obj.getTransactionData();
		}

		@Override
		public void setValue(CommonTradeDataReport25 obj, TradeTransaction18 value) {
			obj.setTransactionData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommonTradeDataReport25.mmContractData, com.tools20022.repository.msg.CommonTradeDataReport25.mmTransactionData);
				trace_lazy = () -> Trade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CommonTradeDataReport25";
				definition = "Information related to contract and transaction details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ContractType6> getContractData() {
		return contractData == null ? Optional.empty() : Optional.of(contractData);
	}

	public CommonTradeDataReport25 setContractData(ContractType6 contractData) {
		this.contractData = contractData;
		return this;
	}

	public TradeTransaction18 getTransactionData() {
		return transactionData;
	}

	public CommonTradeDataReport25 setTransactionData(TradeTransaction18 transactionData) {
		this.transactionData = Objects.requireNonNull(transactionData);
		return this;
	}
}
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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Status of the transactions sent in a previous batch of card payment
 * transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse2#mmTransactionTotals
 * CardPaymentBatchTransferResponse2.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse2#mmDataSet
 * CardPaymentBatchTransferResponse2.mmDataSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV03#mmBatchTransferResponse
 * AcceptorBatchTransferResponseV03.mmBatchTransferResponse}</li>
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
 * "CardPaymentBatchTransferResponse2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of the transactions sent in a previous batch of card payment transactions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse3
 * CardPaymentBatchTransferResponse3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse1
 * CardPaymentBatchTransferResponse1}</li>
 * </ul>
 */
public class CardPaymentBatchTransferResponse2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.TransactionTotals2> transactionTotals;
	/**
	 * Totals of transactions of all the data sets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals2
	 * TransactionTotals2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse2
	 * CardPaymentBatchTransferResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Totals of transactions of all the data sets."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse3#mmTransactionTotals
	 * CardPaymentBatchTransferResponse3.mmTransactionTotals}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse1#mmTransactionTotals
	 * CardPaymentBatchTransferResponse1.mmTransactionTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionTotals = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentBatchTransferResponse2.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Totals of transactions of all the data sets.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentBatchTransferResponse3.mmTransactionTotals);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentBatchTransferResponse1.mmTransactionTotals;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TransactionTotals2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CardPaymentDataSet9> dataSet;
	/**
	 * Information related to the previously sent set of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet9
	 * CardPaymentDataSet9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse2
	 * CardPaymentBatchTransferResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the previously sent set of transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse3#mmDataSet
	 * CardPaymentBatchTransferResponse3.mmDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse1#mmDataSet
	 * CardPaymentBatchTransferResponse1.mmDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDataSet = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentBatchTransferResponse2.mmObject();
			isDerived = false;
			xmlTag = "DataSet";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSet";
			definition = "Information related to the previously sent set of transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentBatchTransferResponse3.mmDataSet);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CardPaymentBatchTransferResponse1.mmDataSet;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentBatchTransferResponse2.mmTransactionTotals, com.tools20022.repository.msg.CardPaymentBatchTransferResponse2.mmDataSet);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV03.mmBatchTransferResponse);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentBatchTransferResponse2";
				definition = "Status of the transactions sent in a previous batch of card payment transactions.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentBatchTransferResponse3.mmObject());
				previousVersion_lazy = () -> CardPaymentBatchTransferResponse1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<TransactionTotals2> getTransactionTotals() {
		return transactionTotals;
	}

	public void setTransactionTotals(List<com.tools20022.repository.msg.TransactionTotals2> transactionTotals) {
		this.transactionTotals = transactionTotals;
	}

	public List<CardPaymentDataSet9> getDataSet() {
		return dataSet;
	}

	public void setDataSet(List<com.tools20022.repository.msg.CardPaymentDataSet9> dataSet) {
		this.dataSet = dataSet;
	}
}
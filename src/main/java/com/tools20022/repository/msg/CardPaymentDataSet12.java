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
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Result of the captured set of transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12#mmDataSetIdentification
 * CardPaymentDataSet12.mmDataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12#mmDataSetResult
 * CardPaymentDataSet12.mmDataSetResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12#mmRemoveDataSet
 * CardPaymentDataSet12.mmRemoveDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12#mmDataSetInitiator
 * CardPaymentDataSet12.mmDataSetInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12#mmTransactionTotals
 * CardPaymentDataSet12.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12#mmRejectedTransaction
 * CardPaymentDataSet12.mmRejectedTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentDataSet12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of the captured set of transactions."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSet14
 * CardPaymentDataSet14}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet9
 * CardPaymentDataSet9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentDataSet12", propOrder = {"dataSetIdentification", "dataSetResult", "removeDataSet", "dataSetInitiator", "transactionTotals", "rejectedTransaction"})
public class CardPaymentDataSet12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataSetId", required = true)
	protected DataSetIdentification1 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification1
	 * DataSetIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12
	 * CardPaymentDataSet12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmDataSetIdentification
	 * CardPaymentDataSet14.mmDataSetIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet9#mmDataSetIdentification
	 * CardPaymentDataSet9.mmDataSetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet12, DataSetIdentification1> mmDataSetIdentification = new MMMessageAssociationEnd<CardPaymentDataSet12, DataSetIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet12.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Identification of the data set.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet14.mmDataSetIdentification);
			previousVersion_lazy = () -> CardPaymentDataSet9.mmDataSetIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DataSetIdentification1.mmObject();
		}

		@Override
		public DataSetIdentification1 getValue(CardPaymentDataSet12 obj) {
			return obj.getDataSetIdentification();
		}

		@Override
		public void setValue(CardPaymentDataSet12 obj, DataSetIdentification1 value) {
			obj.setDataSetIdentification(value);
		}
	};
	@XmlElement(name = "DataSetRslt", required = true)
	protected ResponseType1 dataSetResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType1
	 * ResponseType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12
	 * CardPaymentDataSet12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the data set capture."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmDataSetResult
	 * CardPaymentDataSet14.mmDataSetResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet9#mmDataSetResult
	 * CardPaymentDataSet9.mmDataSetResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet12, ResponseType1> mmDataSetResult = new MMMessageAssociationEnd<CardPaymentDataSet12, ResponseType1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet12.mmObject();
			isDerived = false;
			xmlTag = "DataSetRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetResult";
			definition = "Result of the data set capture.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet14.mmDataSetResult);
			previousVersion_lazy = () -> CardPaymentDataSet9.mmDataSetResult;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ResponseType1.mmObject();
		}

		@Override
		public ResponseType1 getValue(CardPaymentDataSet12 obj) {
			return obj.getDataSetResult();
		}

		@Override
		public void setValue(CardPaymentDataSet12 obj, ResponseType1 value) {
			obj.setDataSetResult(value);
		}
	};
	@XmlElement(name = "RmvDataSet", required = true)
	protected TrueFalseIndicator removeDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12
	 * CardPaymentDataSet12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmvDataSet"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemoveDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the data set must be removed from the POI (Point Of Interaction)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmRemoveDataSet
	 * CardPaymentDataSet14.mmRemoveDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet9#mmRemoveDataSet
	 * CardPaymentDataSet9.mmRemoveDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentDataSet12, TrueFalseIndicator> mmRemoveDataSet = new MMMessageAttribute<CardPaymentDataSet12, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet12.mmObject();
			isDerived = false;
			xmlTag = "RmvDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemoveDataSet";
			definition = "Indicates if the data set must be removed from the POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet14.mmRemoveDataSet);
			previousVersion_lazy = () -> CardPaymentDataSet9.mmRemoveDataSet;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(CardPaymentDataSet12 obj) {
			return obj.getRemoveDataSet();
		}

		@Override
		public void setValue(CardPaymentDataSet12 obj, TrueFalseIndicator value) {
			obj.setRemoveDataSet(value);
		}
	};
	@XmlElement(name = "DataSetInitr")
	protected GenericIdentification53 dataSetInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53
	 * GenericIdentification53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12
	 * CardPaymentDataSet12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetInitr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initiator of the data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmDataSetInitiator
	 * CardPaymentDataSet14.mmDataSetInitiator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet9#mmDataSetInitiator
	 * CardPaymentDataSet9.mmDataSetInitiator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet12, Optional<GenericIdentification53>> mmDataSetInitiator = new MMMessageAssociationEnd<CardPaymentDataSet12, Optional<GenericIdentification53>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet12.mmObject();
			isDerived = false;
			xmlTag = "DataSetInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetInitiator";
			definition = "Initiator of the data set.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet14.mmDataSetInitiator);
			previousVersion_lazy = () -> CardPaymentDataSet9.mmDataSetInitiator;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification53.mmObject();
		}

		@Override
		public Optional<GenericIdentification53> getValue(CardPaymentDataSet12 obj) {
			return obj.getDataSetInitiator();
		}

		@Override
		public void setValue(CardPaymentDataSet12 obj, Optional<GenericIdentification53> value) {
			obj.setDataSetInitiator(value.orElse(null));
		}
	};
	@XmlElement(name = "TxTtls", required = true)
	protected List<TransactionTotals3> transactionTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionTotals3
	 * TransactionTotals3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12
	 * CardPaymentDataSet12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction totals of the batch."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmTransactionTotals
	 * CardPaymentDataSet14.mmTransactionTotals}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet9#mmTransactionTotals
	 * CardPaymentDataSet9.mmTransactionTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet12, List<TransactionTotals3>> mmTransactionTotals = new MMMessageAssociationEnd<CardPaymentDataSet12, List<TransactionTotals3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet12.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Transaction totals of the batch.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet14.mmTransactionTotals);
			previousVersion_lazy = () -> CardPaymentDataSet9.mmTransactionTotals;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionTotals3.mmObject();
		}

		@Override
		public List<TransactionTotals3> getValue(CardPaymentDataSet12 obj) {
			return obj.getTransactionTotals();
		}

		@Override
		public void setValue(CardPaymentDataSet12 obj, List<TransactionTotals3> value) {
			obj.setTransactionTotals(value);
		}
	};
	@XmlElement(name = "RjctdTx")
	protected List<CardPaymentDataSet11> rejectedTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentDataSet11
	 * CardPaymentDataSet11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet12
	 * CardPaymentDataSet12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdTx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction in the batch, whose capture has been rejected."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmRejectedTransaction
	 * CardPaymentDataSet14.mmRejectedTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet9#mmRejectedTransaction
	 * CardPaymentDataSet9.mmRejectedTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet12, List<CardPaymentDataSet11>> mmRejectedTransaction = new MMMessageAssociationEnd<CardPaymentDataSet12, List<CardPaymentDataSet11>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet12.mmObject();
			isDerived = false;
			xmlTag = "RjctdTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedTransaction";
			definition = "Transaction in the batch, whose capture has been rejected.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet14.mmRejectedTransaction);
			previousVersion_lazy = () -> CardPaymentDataSet9.mmRejectedTransaction;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardPaymentDataSet11.mmObject();
		}

		@Override
		public List<CardPaymentDataSet11> getValue(CardPaymentDataSet12 obj) {
			return obj.getRejectedTransaction();
		}

		@Override
		public void setValue(CardPaymentDataSet12 obj, List<CardPaymentDataSet11> value) {
			obj.setRejectedTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentDataSet12.mmDataSetIdentification, com.tools20022.repository.msg.CardPaymentDataSet12.mmDataSetResult,
						com.tools20022.repository.msg.CardPaymentDataSet12.mmRemoveDataSet, com.tools20022.repository.msg.CardPaymentDataSet12.mmDataSetInitiator, com.tools20022.repository.msg.CardPaymentDataSet12.mmTransactionTotals,
						com.tools20022.repository.msg.CardPaymentDataSet12.mmRejectedTransaction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSet12";
				definition = "Result of the captured set of transactions.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet14.mmObject());
				previousVersion_lazy = () -> CardPaymentDataSet9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DataSetIdentification1 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public CardPaymentDataSet12 setDataSetIdentification(DataSetIdentification1 dataSetIdentification) {
		this.dataSetIdentification = Objects.requireNonNull(dataSetIdentification);
		return this;
	}

	public ResponseType1 getDataSetResult() {
		return dataSetResult;
	}

	public CardPaymentDataSet12 setDataSetResult(ResponseType1 dataSetResult) {
		this.dataSetResult = Objects.requireNonNull(dataSetResult);
		return this;
	}

	public TrueFalseIndicator getRemoveDataSet() {
		return removeDataSet;
	}

	public CardPaymentDataSet12 setRemoveDataSet(TrueFalseIndicator removeDataSet) {
		this.removeDataSet = Objects.requireNonNull(removeDataSet);
		return this;
	}

	public Optional<GenericIdentification53> getDataSetInitiator() {
		return dataSetInitiator == null ? Optional.empty() : Optional.of(dataSetInitiator);
	}

	public CardPaymentDataSet12 setDataSetInitiator(GenericIdentification53 dataSetInitiator) {
		this.dataSetInitiator = dataSetInitiator;
		return this;
	}

	public List<TransactionTotals3> getTransactionTotals() {
		return transactionTotals == null ? transactionTotals = new ArrayList<>() : transactionTotals;
	}

	public CardPaymentDataSet12 setTransactionTotals(List<TransactionTotals3> transactionTotals) {
		this.transactionTotals = Objects.requireNonNull(transactionTotals);
		return this;
	}

	public List<CardPaymentDataSet11> getRejectedTransaction() {
		return rejectedTransaction == null ? rejectedTransaction = new ArrayList<>() : rejectedTransaction;
	}

	public CardPaymentDataSet12 setRejectedTransaction(List<CardPaymentDataSet11> rejectedTransaction) {
		this.rejectedTransaction = Objects.requireNonNull(rejectedTransaction);
		return this;
	}
}
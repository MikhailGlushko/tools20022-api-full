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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.ReconciliationTransaction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TransactionIdentifier1;
import com.tools20022.repository.msg.TransactionTotals2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reconciliation transaction between an acceptor and an acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2#mmClosePeriod
 * TransactionReconciliation2.mmClosePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2#mmReconciliationTransactionIdentification
 * TransactionReconciliation2.mmReconciliationTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2#mmReconciliationIdentification
 * TransactionReconciliation2.mmReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2#mmTransactionTotals
 * TransactionReconciliation2.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2#mmAdditionalTransactionData
 * TransactionReconciliation2.mmAdditionalTransactionData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
 * ReconciliationTransaction}</li>
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
 * "TransactionReconciliation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reconciliation transaction between an acceptor and an acquirer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReconciliation3
 * TransactionReconciliation3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation1
 * TransactionReconciliation1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionReconciliation2", propOrder = {"closePeriod", "reconciliationTransactionIdentification", "reconciliationIdentification", "transactionTotals", "additionalTransactionData"})
public class TransactionReconciliation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClsPrd")
	protected TrueFalseIndicator closePeriod;
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2
	 * TransactionReconciliation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the transaction requires a closure of the reconciliation period."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#mmClosePeriod
	 * TransactionReconciliation3.mmClosePeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReconciliation2, Optional<TrueFalseIndicator>> mmClosePeriod = new MMMessageAttribute<TransactionReconciliation2, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReconciliation2.mmObject();
			isDerived = false;
			xmlTag = "ClsPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosePeriod";
			definition = "Indicates if the transaction requires a closure of the reconciliation period.";
			nextVersions_lazy = () -> Arrays.asList(TransactionReconciliation3.mmClosePeriod);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(TransactionReconciliation2 obj) {
			return obj.getClosePeriod();
		}

		@Override
		public void setValue(TransactionReconciliation2 obj, Optional<TrueFalseIndicator> value) {
			obj.setClosePeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "RcncltnTxId", required = true)
	protected TransactionIdentifier1 reconciliationTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2
	 * TransactionReconciliation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of a reconciliation transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#mmReconciliationTransactionIdentification
	 * TransactionReconciliation3.mmReconciliationTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionReconciliation2, TransactionIdentifier1> mmReconciliationTransactionIdentification = new MMMessageAssociationEnd<TransactionReconciliation2, TransactionIdentifier1>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReconciliation2.mmObject();
			isDerived = false;
			xmlTag = "RcncltnTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationTransactionIdentification";
			definition = "Unique identification of a reconciliation transaction.";
			nextVersions_lazy = () -> Arrays.asList(TransactionReconciliation3.mmReconciliationTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public TransactionIdentifier1 getValue(TransactionReconciliation2 obj) {
			return obj.getReconciliationTransactionIdentification();
		}

		@Override
		public void setValue(TransactionReconciliation2 obj, TransactionIdentifier1 value) {
			obj.setReconciliationTransactionIdentification(value);
		}
	};
	@XmlElement(name = "RcncltnId", required = true)
	protected Max35Text reconciliationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmReconciliationIdentification
	 * ReconciliationTransaction.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2
	 * TransactionReconciliation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the reconciliation period between the acceptor and the acquirer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#mmReconciliationIdentification
	 * TransactionReconciliation3.mmReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReconciliation2, Max35Text> mmReconciliationIdentification = new MMMessageAttribute<TransactionReconciliation2, Max35Text>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReconciliation2.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Unique identification of the reconciliation period between the acceptor and the acquirer.";
			nextVersions_lazy = () -> Arrays.asList(TransactionReconciliation3.mmReconciliationIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TransactionReconciliation2 obj) {
			return obj.getReconciliationIdentification();
		}

		@Override
		public void setValue(TransactionReconciliation2 obj, Max35Text value) {
			obj.setReconciliationIdentification(value);
		}
	};
	@XmlElement(name = "TxTtls")
	protected List<TransactionTotals2> transactionTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionTotals2
	 * TransactionTotals2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2
	 * TransactionReconciliation2}</li>
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
	 * definition} =
	 * "Transaction totals during the reconciliation period for a certain type of transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#mmTransactionTotals
	 * TransactionReconciliation3.mmTransactionTotals}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionReconciliation2, List<TransactionTotals2>> mmTransactionTotals = new MMMessageAssociationEnd<TransactionReconciliation2, List<TransactionTotals2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReconciliation2.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Transaction totals during the reconciliation period for a certain type of transaction.";
			nextVersions_lazy = () -> Arrays.asList(TransactionReconciliation3.mmTransactionTotals);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionTotals2.mmObject();
		}

		@Override
		public List<TransactionTotals2> getValue(TransactionReconciliation2 obj) {
			return obj.getTransactionTotals();
		}

		@Override
		public void setValue(TransactionReconciliation2 obj, List<TransactionTotals2> value) {
			obj.setTransactionTotals(value);
		}
	};
	@XmlElement(name = "AddtlTxData")
	protected Max70Text additionalTransactionData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2
	 * TransactionReconciliation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTransactionData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the reconciliation transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation3#mmAdditionalTransactionData
	 * TransactionReconciliation3.mmAdditionalTransactionData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReconciliation2, Optional<Max70Text>> mmAdditionalTransactionData = new MMMessageAttribute<TransactionReconciliation2, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReconciliation2.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTransactionData";
			definition = "Additional information related to the reconciliation transaction.";
			nextVersions_lazy = () -> Arrays.asList(TransactionReconciliation3.mmAdditionalTransactionData);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(TransactionReconciliation2 obj) {
			return obj.getAdditionalTransactionData();
		}

		@Override
		public void setValue(TransactionReconciliation2 obj, Optional<Max70Text> value) {
			obj.setAdditionalTransactionData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReconciliation2.mmClosePeriod, com.tools20022.repository.msg.TransactionReconciliation2.mmReconciliationTransactionIdentification,
						com.tools20022.repository.msg.TransactionReconciliation2.mmReconciliationIdentification, com.tools20022.repository.msg.TransactionReconciliation2.mmTransactionTotals,
						com.tools20022.repository.msg.TransactionReconciliation2.mmAdditionalTransactionData);
				trace_lazy = () -> ReconciliationTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionReconciliation2";
				definition = "Reconciliation transaction between an acceptor and an acquirer.";
				nextVersions_lazy = () -> Arrays.asList(TransactionReconciliation3.mmObject());
				previousVersion_lazy = () -> TransactionReconciliation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getClosePeriod() {
		return closePeriod == null ? Optional.empty() : Optional.of(closePeriod);
	}

	public TransactionReconciliation2 setClosePeriod(TrueFalseIndicator closePeriod) {
		this.closePeriod = closePeriod;
		return this;
	}

	public TransactionIdentifier1 getReconciliationTransactionIdentification() {
		return reconciliationTransactionIdentification;
	}

	public TransactionReconciliation2 setReconciliationTransactionIdentification(TransactionIdentifier1 reconciliationTransactionIdentification) {
		this.reconciliationTransactionIdentification = Objects.requireNonNull(reconciliationTransactionIdentification);
		return this;
	}

	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public TransactionReconciliation2 setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = Objects.requireNonNull(reconciliationIdentification);
		return this;
	}

	public List<TransactionTotals2> getTransactionTotals() {
		return transactionTotals == null ? transactionTotals = new ArrayList<>() : transactionTotals;
	}

	public TransactionReconciliation2 setTransactionTotals(List<TransactionTotals2> transactionTotals) {
		this.transactionTotals = Objects.requireNonNull(transactionTotals);
		return this;
	}

	public Optional<Max70Text> getAdditionalTransactionData() {
		return additionalTransactionData == null ? Optional.empty() : Optional.of(additionalTransactionData);
	}

	public TransactionReconciliation2 setAdditionalTransactionData(Max70Text additionalTransactionData) {
		this.additionalTransactionData = additionalTransactionData;
		return this;
	}
}
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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.Min3Max4Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CardPayment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Transaction information in the cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#mmTransactionCapture
 * CardPaymentTransaction15.mmTransactionCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#mmMerchantCategoryCode
 * CardPaymentTransaction15.mmMerchantCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#mmTransactionIdentification
 * CardPaymentTransaction15.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#mmOriginalTransaction
 * CardPaymentTransaction15.mmOriginalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#mmReconciliationIdentification
 * CardPaymentTransaction15.mmReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#mmTransactionDetails
 * CardPaymentTransaction15.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#mmAdditionalTransactionData
 * CardPaymentTransaction15.mmAdditionalTransactionData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "CardPaymentTransaction15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transaction information in the cancellation request."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction26
 * CardPaymentTransaction26}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction5
 * CardPaymentTransaction5}</li>
 * </ul>
 */
public class CardPaymentTransaction15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TrueFalseIndicator transactionCapture;
	/**
	 * Flag indicating whether the transaction data must be captured or not in
	 * addition to the message process.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15
	 * CardPaymentTransaction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCaptr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flag indicating whether the transaction data must be captured or not in addition to the message process."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#mmTransactionCapture
	 * CardPaymentTransaction26.mmTransactionCapture}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionCapture = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction15.mmObject();
			isDerived = false;
			xmlTag = "TxCaptr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCapture";
			definition = "Flag indicating whether the transaction data must be captured or not in addition to the message process.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction26.mmTransactionCapture);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected Min3Max4Text merchantCategoryCode;
	/**
	 * Category code conform to ISO 18245, related to the type of services or
	 * goods the merchant provides for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min3Max4Text Min3Max4Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole#mmMerchantCategoryCode
	 * MerchantRole.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15
	 * CardPaymentTransaction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntCtgyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantCategoryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#mmMerchantCategoryCode
	 * CardPaymentTransaction26.mmMerchantCategoryCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMerchantCategoryCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.MerchantRole.mmMerchantCategoryCode;
			componentContext_lazy = () -> CardPaymentTransaction15.mmObject();
			isDerived = false;
			xmlTag = "MrchntCtgyCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantCategoryCode";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction26.mmMerchantCategoryCode);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Min3Max4Text.mmObject();
		}
	};
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * Unique identification of the transaction assigned by the POI (Point Of
	 * Interaction).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionIdentification
	 * CardPaymentAcquiring.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15
	 * CardPaymentTransaction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the transaction assigned by the POI (Point Of Interaction)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#mmTransactionIdentification
	 * CardPaymentTransaction26.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> CardPaymentTransaction15.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification of the transaction assigned by the POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction26.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier1.mmObject();
		}
	};
	protected CardPaymentTransaction17 originalTransaction;
	/**
	 * Identification of the original transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17
	 * CardPaymentTransaction17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15
	 * CardPaymentTransaction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the original transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#mmOriginalTransaction
	 * CardPaymentTransaction26.mmOriginalTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> CardPaymentTransaction15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransaction";
			definition = "Identification of the original transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction26.mmOriginalTransaction);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction17.mmObject();
		}
	};
	protected Max35Text reconciliationIdentification;
	/**
	 * Unique identification of the reconciliation period between the acceptor
	 * and the acquirer. This identification might be linked to the
	 * identification of the settlement for further verification by the
	 * merchant.
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
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmReconciliationIdentification
	 * ReconciliationTransaction.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15
	 * CardPaymentTransaction15}</li>
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
	 * "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#mmReconciliationIdentification
	 * CardPaymentTransaction26.mmReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> CardPaymentTransaction15.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction26.mmReconciliationIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CardPaymentTransactionDetails5 transactionDetails;
	/**
	 * Details of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails5
	 * CardPaymentTransactionDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15
	 * CardPaymentTransaction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#mmTransactionDetails
	 * CardPaymentTransaction26.mmTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> CardPaymentTransaction15.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Details of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction26.mmTransactionDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionDetails5.mmObject();
		}
	};
	protected List<Max70Text> additionalTransactionData;
	/**
	 * Additional information related to the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15
	 * CardPaymentTransaction15}</li>
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
	 * definition} = "Additional information related to the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#mmAdditionalTransactionData
	 * CardPaymentTransaction26.mmAdditionalTransactionData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalTransactionData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransaction15.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTransactionData";
			definition = "Additional information related to the transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction26.mmAdditionalTransactionData);
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction15.mmTransactionCapture, com.tools20022.repository.msg.CardPaymentTransaction15.mmMerchantCategoryCode,
						com.tools20022.repository.msg.CardPaymentTransaction15.mmTransactionIdentification, com.tools20022.repository.msg.CardPaymentTransaction15.mmOriginalTransaction,
						com.tools20022.repository.msg.CardPaymentTransaction15.mmReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransaction15.mmTransactionDetails,
						com.tools20022.repository.msg.CardPaymentTransaction15.mmAdditionalTransactionData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentTransaction15";
				definition = "Transaction information in the cancellation request.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction26.mmObject());
				previousVersion_lazy = () -> CardPaymentTransaction5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getTransactionCapture() {
		return transactionCapture;
	}

	public void setTransactionCapture(TrueFalseIndicator transactionCapture) {
		this.transactionCapture = transactionCapture;
	}

	public Min3Max4Text getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(Min3Max4Text merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(com.tools20022.repository.msg.TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public CardPaymentTransaction17 getOriginalTransaction() {
		return originalTransaction;
	}

	public void setOriginalTransaction(com.tools20022.repository.msg.CardPaymentTransaction17 originalTransaction) {
		this.originalTransaction = originalTransaction;
	}

	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public void setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
	}

	public CardPaymentTransactionDetails5 getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(com.tools20022.repository.msg.CardPaymentTransactionDetails5 transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public List<Max70Text> getAdditionalTransactionData() {
		return additionalTransactionData;
	}

	public void setAdditionalTransactionData(List<Max70Text> additionalTransactionData) {
		this.additionalTransactionData = additionalTransactionData;
	}
}
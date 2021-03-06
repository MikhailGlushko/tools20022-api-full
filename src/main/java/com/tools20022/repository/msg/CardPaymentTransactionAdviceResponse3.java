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
import com.tools20022.repository.codeset.Response1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CardPaymentValidation;
import com.tools20022.repository.entity.Response;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TransactionIdentifier1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card payment completion advice response from the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3#mmTransactionIdentification
 * CardPaymentTransactionAdviceResponse3.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3#mmReconciliationIdentification
 * CardPaymentTransactionAdviceResponse3.mmReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3#mmResponse
 * CardPaymentTransactionAdviceResponse3.mmResponse}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Response Response}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentTransactionAdviceResponse3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Card payment completion advice response from the acquirer."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse4
 * CardPaymentTransactionAdviceResponse4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse1
 * CardPaymentTransactionAdviceResponse1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentTransactionAdviceResponse3", propOrder = {"transactionIdentification", "reconciliationIdentification", "response"})
public class CardPaymentTransactionAdviceResponse3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected TransactionIdentifier1 transactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmCardPayment
	 * CardPaymentValidation.mmCardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3
	 * CardPaymentTransactionAdviceResponse3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the transaction by the POI."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse4#mmTransactionIdentification
	 * CardPaymentTransactionAdviceResponse4.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransactionAdviceResponse3, TransactionIdentifier1> mmTransactionIdentification = new MMMessageAssociationEnd<CardPaymentTransactionAdviceResponse3, TransactionIdentifier1>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmCardPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification of the transaction by the POI.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionAdviceResponse4.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public TransactionIdentifier1 getValue(CardPaymentTransactionAdviceResponse3 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(CardPaymentTransactionAdviceResponse3 obj, TransactionIdentifier1 value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "RcncltnId")
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3
	 * CardPaymentTransactionAdviceResponse3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse4#mmReconciliationIdentification
	 * CardPaymentTransactionAdviceResponse4.mmReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionAdviceResponse3, Optional<Max35Text>> mmReconciliationIdentification = new MMMessageAttribute<CardPaymentTransactionAdviceResponse3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Unique identification of the reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionAdviceResponse4.mmReconciliationIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardPaymentTransactionAdviceResponse3 obj) {
			return obj.getReconciliationIdentification();
		}

		@Override
		public void setValue(CardPaymentTransactionAdviceResponse3 obj, Optional<Max35Text> value) {
			obj.setReconciliationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Rspn", required = true)
	protected Response1Code response;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Response1Code
	 * Response1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Response#mmResponseToAuthorisation
	 * Response.mmResponseToAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3
	 * CardPaymentTransactionAdviceResponse3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Response"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of a requested service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse4#mmResponse
	 * CardPaymentTransactionAdviceResponse4.mmResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransactionAdviceResponse3, Response1Code> mmResponse = new MMMessageAttribute<CardPaymentTransactionAdviceResponse3, Response1Code>() {
		{
			businessElementTrace_lazy = () -> Response.mmResponseToAuthorisation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3.mmObject();
			isDerived = false;
			xmlTag = "Rspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Result of a requested service.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionAdviceResponse4.mmResponse);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Response1Code.mmObject();
		}

		@Override
		public Response1Code getValue(CardPaymentTransactionAdviceResponse3 obj) {
			return obj.getResponse();
		}

		@Override
		public void setValue(CardPaymentTransactionAdviceResponse3 obj, Response1Code value) {
			obj.setResponse(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3.mmTransactionIdentification,
						com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3.mmReconciliationIdentification, com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse3.mmResponse);
				trace_lazy = () -> Response.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentTransactionAdviceResponse3";
				definition = "Card payment completion advice response from the acquirer.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionAdviceResponse4.mmObject());
				previousVersion_lazy = () -> CardPaymentTransactionAdviceResponse1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public CardPaymentTransactionAdviceResponse3 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<Max35Text> getReconciliationIdentification() {
		return reconciliationIdentification == null ? Optional.empty() : Optional.of(reconciliationIdentification);
	}

	public CardPaymentTransactionAdviceResponse3 setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
		return this;
	}

	public Response1Code getResponse() {
		return response;
	}

	public CardPaymentTransactionAdviceResponse3 setResponse(Response1Code response) {
		this.response = Objects.requireNonNull(response);
		return this;
	}
}
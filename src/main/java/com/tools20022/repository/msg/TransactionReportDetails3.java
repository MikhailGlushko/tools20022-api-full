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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.PaymentIdentification2Choice;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ErrorHandling2;
import com.tools20022.repository.msg.Transaction3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports either on the transaction information or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3#TransactionOrBusinessErrorRule
 * TransactionReportDetails3.TransactionOrBusinessErrorRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3#mmInstructionReference
 * TransactionReportDetails3.mmInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3#mmTransaction
 * TransactionReportDetails3.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3#mmBusinessError
 * TransactionReportDetails3.mmBusinessError}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionReportDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on the transaction information or on a business error."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionReportDetails3", propOrder = {"instructionReference", "transaction", "businessError"})
public class TransactionReportDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstrRef", required = true)
	protected PaymentIdentification2Choice instructionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice
	 * PaymentIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
	 * Payment.mmPaymentRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3
	 * TransactionReportDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the instruction related to the payment for which information is requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReportDetails3, PaymentIdentification2Choice> mmInstructionReference = new MMMessageAttribute<TransactionReportDetails3, PaymentIdentification2Choice>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportDetails3.mmObject();
			isDerived = false;
			xmlTag = "InstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionReference";
			definition = "Reference to the instruction related to the payment for which information is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentIdentification2Choice.mmObject();
		}

		@Override
		public PaymentIdentification2Choice getValue(TransactionReportDetails3 obj) {
			return obj.getInstructionReference();
		}

		@Override
		public void setValue(TransactionReportDetails3 obj, PaymentIdentification2Choice value) {
			obj.setInstructionReference(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected Transaction3 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Transaction3
	 * Transaction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3
	 * TransactionReportDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested information on the payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionReportDetails3, Transaction3> mmTransaction = new MMMessageAssociationEnd<TransactionReportDetails3, Transaction3>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportDetails3.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Requested information on the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Transaction3.mmObject();
		}

		@Override
		public Transaction3 getValue(TransactionReportDetails3 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(TransactionReportDetails3 obj, Transaction3 value) {
			obj.setTransaction(value);
		}
	};
	@XmlElement(name = "BizErr", required = true)
	protected ErrorHandling2 businessError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling2
	 * ErrorHandling2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3
	 * TransactionReportDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason why the requested business information is not given."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionReportDetails3, ErrorHandling2> mmBusinessError = new MMMessageAssociationEnd<TransactionReportDetails3, ErrorHandling2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionReportDetails3.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason why the requested business information is not given.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling2.mmObject();
		}

		@Override
		public ErrorHandling2 getValue(TransactionReportDetails3 obj) {
			return obj.getBusinessError();
		}

		@Override
		public void setValue(TransactionReportDetails3 obj, ErrorHandling2 value) {
			obj.setBusinessError(value);
		}
	};
	/**
	 * Either Transaction or BusinessError must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3
	 * TransactionReportDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3#mmTransaction
	 * TransactionReportDetails3.mmTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReportDetails3#mmBusinessError
	 * TransactionReportDetails3.mmBusinessError}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOrBusinessErrorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Transaction or BusinessError must be present, but not both."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor TransactionOrBusinessErrorRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOrBusinessErrorRule";
			definition = "Either Transaction or BusinessError must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.TransactionReportDetails3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReportDetails3.mmTransaction, com.tools20022.repository.msg.TransactionReportDetails3.mmBusinessError);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReportDetails3.mmInstructionReference, com.tools20022.repository.msg.TransactionReportDetails3.mmTransaction,
						com.tools20022.repository.msg.TransactionReportDetails3.mmBusinessError);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransactionReportDetails3";
				definition = "Reports either on the transaction information or on a business error.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReportDetails3.TransactionOrBusinessErrorRule);
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentIdentification2Choice getInstructionReference() {
		return instructionReference;
	}

	public TransactionReportDetails3 setInstructionReference(PaymentIdentification2Choice instructionReference) {
		this.instructionReference = Objects.requireNonNull(instructionReference);
		return this;
	}

	public Transaction3 getTransaction() {
		return transaction;
	}

	public TransactionReportDetails3 setTransaction(Transaction3 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}

	public ErrorHandling2 getBusinessError() {
		return businessError;
	}

	public TransactionReportDetails3 setBusinessError(ErrorHandling2 businessError) {
		this.businessError = Objects.requireNonNull(businessError);
		return this;
	}
}
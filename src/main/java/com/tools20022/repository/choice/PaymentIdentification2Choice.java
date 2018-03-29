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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentInstructionReferenceDetails2;
import com.tools20022.repository.msg.PaymentInstructionReferenceDetails3;
import com.tools20022.repository.msg.QueueTransactionIdentificationDetails;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between ways of identifying a payment instruction by its references
 * and business identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice#mmPaymentInstructionReference
 * PaymentIdentification2Choice.mmPaymentInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice#mmQueueIdentification
 * PaymentIdentification2Choice.mmQueueIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice#mmLongBusinessIdentification
 * PaymentIdentification2Choice.mmLongBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice#mmShortBusinessIdentification
 * PaymentIdentification2Choice.mmShortBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice#mmProprietaryReference
 * PaymentIdentification2Choice.mmProprietaryReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentIdentification
 * PaymentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentIdentification2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between ways of identifying a payment instruction by its references and business identification."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentIdentification2Choice", propOrder = {"paymentInstructionReference", "queueIdentification", "longBusinessIdentification", "shortBusinessIdentification", "proprietaryReference"})
public class PaymentIdentification2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtInstrRef", required = true)
	protected Max35Text paymentInstructionReference;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice
	 * PaymentIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentIdentification2Choice, Max35Text> mmPaymentInstructionReference = new MMMessageAttribute<PaymentIdentification2Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification2Choice obj) {
			return obj.getPaymentInstructionReference();
		}

		@Override
		public void setValue(PaymentIdentification2Choice obj, Max35Text value) {
			obj.setPaymentInstructionReference(value);
		}
	};
	@XmlElement(name = "QId", required = true)
	protected QueueTransactionIdentificationDetails queueIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QueueTransactionIdentificationDetails
	 * QueueTransactionIdentificationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice
	 * PaymentIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueueIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the payment instruction by its position in a queue managed by the clearing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentIdentification2Choice, QueueTransactionIdentificationDetails> mmQueueIdentification = new MMMessageAttribute<PaymentIdentification2Choice, QueueTransactionIdentificationDetails>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "QId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueueIdentification";
			definition = "Identification of the payment instruction by its position in a queue managed by the clearing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QueueTransactionIdentificationDetails.mmObject();
		}

		@Override
		public QueueTransactionIdentificationDetails getValue(PaymentIdentification2Choice obj) {
			return obj.getQueueIdentification();
		}

		@Override
		public void setValue(PaymentIdentification2Choice obj, QueueTransactionIdentificationDetails value) {
			obj.setQueueIdentification(value);
		}
	};
	@XmlElement(name = "LngBizId", required = true)
	protected PaymentInstructionReferenceDetails3 longBusinessIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3
	 * PaymentInstructionReferenceDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice
	 * PaymentIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LngBizId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongBusinessIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business identification of the payment instruction given by the clearing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentIdentification2Choice, PaymentInstructionReferenceDetails3> mmLongBusinessIdentification = new MMMessageAttribute<PaymentIdentification2Choice, PaymentInstructionReferenceDetails3>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "LngBizId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongBusinessIdentification";
			definition = "Business identification of the payment instruction given by the clearing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstructionReferenceDetails3.mmObject();
		}

		@Override
		public PaymentInstructionReferenceDetails3 getValue(PaymentIdentification2Choice obj) {
			return obj.getLongBusinessIdentification();
		}

		@Override
		public void setValue(PaymentIdentification2Choice obj, PaymentInstructionReferenceDetails3 value) {
			obj.setLongBusinessIdentification(value);
		}
	};
	@XmlElement(name = "ShrtBizId", required = true)
	protected PaymentInstructionReferenceDetails2 shortBusinessIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails2
	 * PaymentInstructionReferenceDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice
	 * PaymentIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtBizId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortBusinessIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business identification of the payment instruction given by the clearing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentIdentification2Choice, PaymentInstructionReferenceDetails2> mmShortBusinessIdentification = new MMMessageAttribute<PaymentIdentification2Choice, PaymentInstructionReferenceDetails2>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "ShrtBizId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortBusinessIdentification";
			definition = "Business identification of the payment instruction given by the clearing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstructionReferenceDetails2.mmObject();
		}

		@Override
		public PaymentInstructionReferenceDetails2 getValue(PaymentIdentification2Choice obj) {
			return obj.getShortBusinessIdentification();
		}

		@Override
		public void setValue(PaymentIdentification2Choice obj, PaymentInstructionReferenceDetails2 value) {
			obj.setShortBusinessIdentification(value);
		}
	};
	@XmlElement(name = "PrtryRef", required = true)
	protected Max70Text proprietaryReference;
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
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice
	 * PaymentIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference of the underlying payment instruction assigned by Target2 SSP."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentIdentification2Choice, Max70Text> mmProprietaryReference = new MMMessageAttribute<PaymentIdentification2Choice, Max70Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryReference";
			definition = "Unique reference of the underlying payment instruction assigned by Target2 SSP.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(PaymentIdentification2Choice obj) {
			return obj.getProprietaryReference();
		}

		@Override
		public void setValue(PaymentIdentification2Choice obj, Max70Text value) {
			obj.setProprietaryReference(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentIdentification2Choice.mmPaymentInstructionReference, com.tools20022.repository.choice.PaymentIdentification2Choice.mmQueueIdentification,
						com.tools20022.repository.choice.PaymentIdentification2Choice.mmLongBusinessIdentification, com.tools20022.repository.choice.PaymentIdentification2Choice.mmShortBusinessIdentification,
						com.tools20022.repository.choice.PaymentIdentification2Choice.mmProprietaryReference);
				trace_lazy = () -> PaymentIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentIdentification2Choice";
				definition = "Choice between ways of identifying a payment instruction by its references and business identification.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPaymentInstructionReference() {
		return paymentInstructionReference;
	}

	public PaymentIdentification2Choice setPaymentInstructionReference(Max35Text paymentInstructionReference) {
		this.paymentInstructionReference = Objects.requireNonNull(paymentInstructionReference);
		return this;
	}

	public QueueTransactionIdentificationDetails getQueueIdentification() {
		return queueIdentification;
	}

	public PaymentIdentification2Choice setQueueIdentification(QueueTransactionIdentificationDetails queueIdentification) {
		this.queueIdentification = Objects.requireNonNull(queueIdentification);
		return this;
	}

	public PaymentInstructionReferenceDetails3 getLongBusinessIdentification() {
		return longBusinessIdentification;
	}

	public PaymentIdentification2Choice setLongBusinessIdentification(PaymentInstructionReferenceDetails3 longBusinessIdentification) {
		this.longBusinessIdentification = Objects.requireNonNull(longBusinessIdentification);
		return this;
	}

	public PaymentInstructionReferenceDetails2 getShortBusinessIdentification() {
		return shortBusinessIdentification;
	}

	public PaymentIdentification2Choice setShortBusinessIdentification(PaymentInstructionReferenceDetails2 shortBusinessIdentification) {
		this.shortBusinessIdentification = Objects.requireNonNull(shortBusinessIdentification);
		return this;
	}

	public Max70Text getProprietaryReference() {
		return proprietaryReference;
	}

	public PaymentIdentification2Choice setProprietaryReference(Max70Text proprietaryReference) {
		this.proprietaryReference = Objects.requireNonNull(proprietaryReference);
		return this;
	}
}
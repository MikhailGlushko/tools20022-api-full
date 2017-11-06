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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.PaymentInstruction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information supplied to enable the matching/reconciliation of an entry with
 * the items that the payment is intended to settle, such as commercial invoices
 * in an accounts' receivable system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#mmRemittanceIdentification
 * RemittanceInformation13.mmRemittanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#mmUnstructured
 * RemittanceInformation13.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#mmStructured
 * RemittanceInformation13.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#mmOriginalPaymentInformation
 * RemittanceInformation13.mmOriginalPaymentInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.remt.RemittanceAdviceV03#mmRemittanceInformation
 * RemittanceAdviceV03.mmRemittanceInformation}</li>
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
 * "RemittanceInformation13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation12
 * RemittanceInformation12}</li>
 * </ul>
 */
public class RemittanceInformation13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text remittanceIdentification;
	/**
	 * Unique identification, assigned by the originator, to unambiguously
	 * identify the remittance information within the message.
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13
	 * RemittanceInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, assigned by the originator, to unambiguously identify the remittance information within the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation12#mmRemittanceIdentification
	 * RemittanceInformation12.mmRemittanceIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemittanceIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentification;
			componentContext_lazy = () -> RemittanceInformation13.mmObject();
			isDerived = false;
			xmlTag = "RmtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceIdentification";
			definition = "Unique identification, assigned by the originator, to unambiguously identify the remittance information within the message.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceInformation12.mmRemittanceIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<Max140Text> unstructured;
	/**
	 * Information supplied to enable the matching/reconciliation of an entry
	 * with the items that the payment is intended to settle, such as commercial
	 * invoices in an accounts' receivable system, in an unstructured form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13
	 * RemittanceInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ustrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unstructured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation12#mmUnstructured
	 * RemittanceInformation12.mmUnstructured}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnstructured = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RemittanceInformation13.mmObject();
			isDerived = false;
			xmlTag = "Ustrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unstructured";
			definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceInformation12.mmUnstructured;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.StructuredRemittanceInformation13> structured;
	/**
	 * Information supplied to enable the matching/reconciliation of an entry
	 * with the items that the payment is intended to settle, such as commercial
	 * invoices in an accounts' receivable system, in a structured form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13
	 * StructuredRemittanceInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13
	 * RemittanceInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Strd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Structured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation12#mmStructured
	 * RemittanceInformation12.mmStructured}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStructured = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> RemittanceInformation13.mmObject();
			isDerived = false;
			xmlTag = "Strd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Structured";
			definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceInformation12.mmStructured;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation13.mmObject();
		}
	};
	protected OriginalPaymentInformation7 originalPaymentInformation;
	/**
	 * Set of elements used to provide information on the original transactions,
	 * to which the remittance message refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation7
	 * OriginalPaymentInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13
	 * RemittanceInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the original transactions, to which the remittance message refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation12#mmOriginalPaymentInformation
	 * RemittanceInformation12.mmOriginalPaymentInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalPaymentInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> RemittanceInformation13.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformation";
			definition = "Set of elements used to provide information on the original transactions, to which the remittance message refers.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceInformation12.mmOriginalPaymentInformation;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInformation7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceInformation13.mmRemittanceIdentification, com.tools20022.repository.msg.RemittanceInformation13.mmUnstructured,
						com.tools20022.repository.msg.RemittanceInformation13.mmStructured, com.tools20022.repository.msg.RemittanceInformation13.mmOriginalPaymentInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.remt.RemittanceAdviceV03.mmRemittanceInformation);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RemittanceInformation13";
				definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system.";
				previousVersion_lazy = () -> RemittanceInformation12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getRemittanceIdentification() {
		return remittanceIdentification;
	}

	public void setRemittanceIdentification(Max35Text remittanceIdentification) {
		this.remittanceIdentification = remittanceIdentification;
	}

	public List<Max140Text> getUnstructured() {
		return unstructured;
	}

	public void setUnstructured(List<Max140Text> unstructured) {
		this.unstructured = unstructured;
	}

	public List<StructuredRemittanceInformation13> getStructured() {
		return structured;
	}

	public void setStructured(List<com.tools20022.repository.msg.StructuredRemittanceInformation13> structured) {
		this.structured = structured;
	}

	public OriginalPaymentInformation7 getOriginalPaymentInformation() {
		return originalPaymentInformation;
	}

	public void setOriginalPaymentInformation(com.tools20022.repository.msg.OriginalPaymentInformation7 originalPaymentInformation) {
		this.originalPaymentInformation = originalPaymentInformation;
	}
}
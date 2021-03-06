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
import com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV01;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalGroupInformation23;
import com.tools20022.repository.msg.OriginalPaymentInformation4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to identify the underlying (group of) transaction(s) to
 * which the investigation applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction1#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction1.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction1#mmOriginalPaymentInformationAndCancellation
 * UnderlyingTransaction1.mmOriginalPaymentInformationAndCancellation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV01#mmUnderlying
 * CustomerPaymentCancellationRequestV01.mmUnderlying}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingTransaction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to identify the underlying (group of) transaction(s) to which the investigation applies."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationAndReasonRule#forUnderlyingTransaction1
 * ConstraintGroupCancellationAndReasonRule.forUnderlyingTransaction1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationAndNumberOfTransactionsRule#forUnderlyingTransaction1
 * ConstraintGroupCancellationAndNumberOfTransactionsRule.
 * forUnderlyingTransaction1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndPaymentInformationRule#forUnderlyingTransaction1
 * ConstraintGroupCancellationTrueAndPaymentInformationRule.
 * forUnderlyingTransaction1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationFalseAndPaymentInformationRule#forUnderlyingTransaction1
 * ConstraintGroupCancellationFalseAndPaymentInformationRule.
 * forUnderlyingTransaction1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationCaseRule#forUnderlyingTransaction1
 * ConstraintGroupOrPaymentInformationCaseRule.forUnderlyingTransaction1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrTransactionCaseRule#forUnderlyingTransaction1
 * ConstraintGroupOrTransactionCaseRule.forUnderlyingTransaction1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingTransaction1", propOrder = {"originalGroupInformationAndCancellation", "originalPaymentInformationAndCancellation"})
public class UnderlyingTransaction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlGrpInfAndCxl")
	protected OriginalGroupInformation23 originalGroupInformationAndCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation23
	 * OriginalGroupInformation23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction1
	 * UnderlyingTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInfAndCxl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformationAndCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the original messsage, to which the cancellation refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction1, Optional<OriginalGroupInformation23>> mmOriginalGroupInformationAndCancellation = new MMMessageAssociationEnd<UnderlyingTransaction1, Optional<OriginalGroupInformation23>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInfAndCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndCancellation";
			definition = "Set of elements used to provide information on the original messsage, to which the cancellation refers.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalGroupInformation23.mmObject();
		}

		@Override
		public Optional<OriginalGroupInformation23> getValue(UnderlyingTransaction1 obj) {
			return obj.getOriginalGroupInformationAndCancellation();
		}

		@Override
		public void setValue(UnderlyingTransaction1 obj, Optional<OriginalGroupInformation23> value) {
			obj.setOriginalGroupInformationAndCancellation(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlPmtInfAndCxl")
	protected List<OriginalPaymentInformation4> originalPaymentInformationAndCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation4
	 * OriginalPaymentInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction1
	 * UnderlyingTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfAndCxl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationAndCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the original (group of) transactions, to which the cancellation request refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction1, List<OriginalPaymentInformation4>> mmOriginalPaymentInformationAndCancellation = new MMMessageAssociationEnd<UnderlyingTransaction1, List<OriginalPaymentInformation4>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfAndCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationAndCancellation";
			definition = "Set of elements used to provide information on the original (group of) transactions, to which the cancellation request refers.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalPaymentInformation4.mmObject();
		}

		@Override
		public List<OriginalPaymentInformation4> getValue(UnderlyingTransaction1 obj) {
			return obj.getOriginalPaymentInformationAndCancellation();
		}

		@Override
		public void setValue(UnderlyingTransaction1 obj, List<OriginalPaymentInformation4> value) {
			obj.setOriginalPaymentInformationAndCancellation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingTransaction1.mmOriginalGroupInformationAndCancellation,
						com.tools20022.repository.msg.UnderlyingTransaction1.mmOriginalPaymentInformationAndCancellation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerPaymentCancellationRequestV01.mmUnderlying);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupCancellationAndReasonRule.forUnderlyingTransaction1,
						com.tools20022.repository.constraints.ConstraintGroupCancellationAndNumberOfTransactionsRule.forUnderlyingTransaction1,
						com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndPaymentInformationRule.forUnderlyingTransaction1,
						com.tools20022.repository.constraints.ConstraintGroupCancellationFalseAndPaymentInformationRule.forUnderlyingTransaction1,
						com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationCaseRule.forUnderlyingTransaction1, com.tools20022.repository.constraints.ConstraintGroupOrTransactionCaseRule.forUnderlyingTransaction1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction1";
				definition = "Set of elements used to identify the underlying (group of) transaction(s) to which the investigation applies.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalGroupInformation23> getOriginalGroupInformationAndCancellation() {
		return originalGroupInformationAndCancellation == null ? Optional.empty() : Optional.of(originalGroupInformationAndCancellation);
	}

	public UnderlyingTransaction1 setOriginalGroupInformationAndCancellation(OriginalGroupInformation23 originalGroupInformationAndCancellation) {
		this.originalGroupInformationAndCancellation = originalGroupInformationAndCancellation;
		return this;
	}

	public List<OriginalPaymentInformation4> getOriginalPaymentInformationAndCancellation() {
		return originalPaymentInformationAndCancellation == null ? originalPaymentInformationAndCancellation = new ArrayList<>() : originalPaymentInformationAndCancellation;
	}

	public UnderlyingTransaction1 setOriginalPaymentInformationAndCancellation(List<OriginalPaymentInformation4> originalPaymentInformationAndCancellation) {
		this.originalPaymentInformationAndCancellation = Objects.requireNonNull(originalPaymentInformationAndCancellation);
		return this;
	}
}
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
import com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalGroupHeader6;
import com.tools20022.repository.msg.PaymentTransaction75;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the underlying (group of) transaction(s) to which the
 * investigation applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction16.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16#mmTransactionInformation
 * UnderlyingTransaction16.mmTransactionInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06#mmUnderlying
 * FIToFIPaymentCancellationRequestV06.mmUnderlying}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingTransaction16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the underlying (group of) transaction(s) to which the investigation applies."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationAndReasonRule#forUnderlyingTransaction16
 * ConstraintGroupCancellationAndReasonRule.forUnderlyingTransaction16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationAndNumberOfTransactionsRule#forUnderlyingTransaction16
 * ConstraintGroupCancellationAndNumberOfTransactionsRule.
 * forUnderlyingTransaction16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule#forUnderlyingTransaction16
 * ConstraintGroupCancellationTrueAndTransactionInformationRule.
 * forUnderlyingTransaction16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationFalseAndTransactionInformationRule#forUnderlyingTransaction16
 * ConstraintGroupCancellationFalseAndTransactionInformationRule.
 * forUnderlyingTransaction16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrTransactionCaseRule#forUnderlyingTransaction16
 * ConstraintGroupOrTransactionCaseRule.forUnderlyingTransaction16}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction20
 * UnderlyingTransaction20}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction13
 * UnderlyingTransaction13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingTransaction16", propOrder = {"originalGroupInformationAndCancellation", "transactionInformation"})
public class UnderlyingTransaction16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlGrpInfAndCxl")
	protected OriginalGroupHeader6 originalGroupInformationAndCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
	 * OriginalGroupHeader6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16
	 * UnderlyingTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInfAndCxl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformationAndCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original message, to which the cancellation refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction20#mmOriginalGroupInformationAndCancellation
	 * UnderlyingTransaction20.mmOriginalGroupInformationAndCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction13#mmOriginalGroupInformationAndCancellation
	 * UnderlyingTransaction13.mmOriginalGroupInformationAndCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction16, Optional<OriginalGroupHeader6>> mmOriginalGroupInformationAndCancellation = new MMMessageAssociationEnd<UnderlyingTransaction16, Optional<OriginalGroupHeader6>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction16.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInfAndCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndCancellation";
			definition = "Provides information on the original message, to which the cancellation refers.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction20.mmOriginalGroupInformationAndCancellation);
			previousVersion_lazy = () -> UnderlyingTransaction13.mmOriginalGroupInformationAndCancellation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalGroupHeader6.mmObject();
		}

		@Override
		public Optional<OriginalGroupHeader6> getValue(UnderlyingTransaction16 obj) {
			return obj.getOriginalGroupInformationAndCancellation();
		}

		@Override
		public void setValue(UnderlyingTransaction16 obj, Optional<OriginalGroupHeader6> value) {
			obj.setOriginalGroupInformationAndCancellation(value.orElse(null));
		}
	};
	@XmlElement(name = "TxInf")
	protected List<PaymentTransaction75> transactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction75
	 * PaymentTransaction75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
	 * PaymentExecution.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16
	 * UnderlyingTransaction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original transactions to which the cancellation request message refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction20#mmTransactionInformation
	 * UnderlyingTransaction20.mmTransactionInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction13#mmTransactionInformation
	 * UnderlyingTransaction13.mmTransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction16, List<PaymentTransaction75>> mmTransactionInformation = new MMMessageAssociationEnd<UnderlyingTransaction16, List<PaymentTransaction75>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction16.mmObject();
			isDerived = false;
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Provides information on the original transactions to which the cancellation request message refers.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction20.mmTransactionInformation);
			previousVersion_lazy = () -> UnderlyingTransaction13.mmTransactionInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction75.mmObject();
		}

		@Override
		public List<PaymentTransaction75> getValue(UnderlyingTransaction16 obj) {
			return obj.getTransactionInformation();
		}

		@Override
		public void setValue(UnderlyingTransaction16 obj, List<PaymentTransaction75> value) {
			obj.setTransactionInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingTransaction16.mmOriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction16.mmTransactionInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(FIToFIPaymentCancellationRequestV06.mmUnderlying);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupCancellationAndReasonRule.forUnderlyingTransaction16,
						com.tools20022.repository.constraints.ConstraintGroupCancellationAndNumberOfTransactionsRule.forUnderlyingTransaction16,
						com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule.forUnderlyingTransaction16,
						com.tools20022.repository.constraints.ConstraintGroupCancellationFalseAndTransactionInformationRule.forUnderlyingTransaction16,
						com.tools20022.repository.constraints.ConstraintGroupOrTransactionCaseRule.forUnderlyingTransaction16);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction16";
				definition = "Identifies the underlying (group of) transaction(s) to which the investigation applies.";
				nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction20.mmObject());
				previousVersion_lazy = () -> UnderlyingTransaction13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalGroupHeader6> getOriginalGroupInformationAndCancellation() {
		return originalGroupInformationAndCancellation == null ? Optional.empty() : Optional.of(originalGroupInformationAndCancellation);
	}

	public UnderlyingTransaction16 setOriginalGroupInformationAndCancellation(OriginalGroupHeader6 originalGroupInformationAndCancellation) {
		this.originalGroupInformationAndCancellation = originalGroupInformationAndCancellation;
		return this;
	}

	public List<PaymentTransaction75> getTransactionInformation() {
		return transactionInformation == null ? transactionInformation = new ArrayList<>() : transactionInformation;
	}

	public UnderlyingTransaction16 setTransactionInformation(List<PaymentTransaction75> transactionInformation) {
		this.transactionInformation = Objects.requireNonNull(transactionInformation);
		return this;
	}
}
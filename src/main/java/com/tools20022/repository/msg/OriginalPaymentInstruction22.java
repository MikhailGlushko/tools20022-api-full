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
import com.tools20022.repository.codeset.GroupCancellationStatus1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details on the reference and status of the original
 * transactions, included in the original instruction, to which the cancellation
 * request message applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmOriginalPaymentInformationCancellationIdentification
 * OriginalPaymentInstruction22.
 * mmOriginalPaymentInformationCancellationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmResolvedCase
 * OriginalPaymentInstruction22.mmResolvedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmOriginalPaymentInformationIdentification
 * OriginalPaymentInstruction22.mmOriginalPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmOriginalGroupInformation
 * OriginalPaymentInstruction22.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmOriginalNumberOfTransactions
 * OriginalPaymentInstruction22.mmOriginalNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmOriginalControlSum
 * OriginalPaymentInstruction22.mmOriginalControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmPaymentInformationCancellationStatus
 * OriginalPaymentInstruction22.mmPaymentInformationCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmCancellationStatusReasonInformation
 * OriginalPaymentInstruction22.mmCancellationStatusReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmNumberOfTransactionsPerCancellationStatus
 * OriginalPaymentInstruction22.mmNumberOfTransactionsPerCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction22.mmTransactionInformationAndStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule#forOriginalPaymentInstruction22
 * ConstraintCancellationStatusReasonInformationRule.
 * forOriginalPaymentInstruction22}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline#forOriginalPaymentInstruction22
 * ConstraintNumberOfTransactionsPerCancellationStatusGuideline.
 * forOriginalPaymentInstruction22}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationOrTransactionResolvedCaseRule#forOriginalPaymentInstruction22
 * ConstraintPaymentInformationOrTransactionResolvedCaseRule.
 * forOriginalPaymentInstruction22}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginalPaymentInstruction22"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details on the reference and status of the original transactions, included in the original instruction, to which the cancellation request message applies."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26
 * OriginalPaymentInstruction26}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17
 * OriginalPaymentInstruction17}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalPaymentInstruction22", propOrder = {"originalPaymentInformationCancellationIdentification", "resolvedCase", "originalPaymentInformationIdentification", "originalGroupInformation", "originalNumberOfTransactions",
		"originalControlSum", "paymentInformationCancellationStatus", "cancellationStatusReasonInformation", "numberOfTransactionsPerCancellationStatus", "transactionInformationAndStatus"})
public class OriginalPaymentInstruction22 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlPmtInfCxlId")
	protected Max35Text originalPaymentInformationCancellationIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
	 * OriginalPaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfCxlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationCancellationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original assigner, to unambiguously identify the original payment information cancellation request."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction26.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction17.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction22, Optional<Max35Text>> mmOriginalPaymentInformationCancellationIdentification = new MMMessageAttribute<OriginalPaymentInstruction22, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction22.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfCxlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationCancellationIdentification";
			definition = "Unique identification, as assigned by the original assigner, to unambiguously identify the original payment information cancellation request.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction26.mmOriginalPaymentInformationCancellationIdentification);
			previousVersion_lazy = () -> OriginalPaymentInstruction17.mmOriginalPaymentInformationCancellationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OriginalPaymentInstruction22 obj) {
			return obj.getOriginalPaymentInformationCancellationIdentification();
		}

		@Override
		public void setValue(OriginalPaymentInstruction22 obj, Optional<Max35Text> value) {
			obj.setOriginalPaymentInformationCancellationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RslvdCase")
	protected Case3 resolvedCase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationResolution#mmInvestigationCase
	 * InvestigationResolution.mmInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
	 * OriginalPaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RslvdCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolvedCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the resolved case."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmResolvedCase
	 * OriginalPaymentInstruction26.mmResolvedCase}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmResolvedCase
	 * OriginalPaymentInstruction17.mmResolvedCase}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalPaymentInstruction22, Optional<Case3>> mmResolvedCase = new MMMessageAssociationEnd<OriginalPaymentInstruction22, Optional<Case3>>() {
		{
			businessElementTrace_lazy = () -> InvestigationResolution.mmInvestigationCase;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction22.mmObject();
			isDerived = false;
			xmlTag = "RslvdCase";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolvedCase";
			definition = "Identifies the resolved case.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction26.mmResolvedCase);
			previousVersion_lazy = () -> OriginalPaymentInstruction17.mmResolvedCase;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Case3.mmObject();
		}

		@Override
		public Optional<Case3> getValue(OriginalPaymentInstruction22 obj) {
			return obj.getResolvedCase();
		}

		@Override
		public void setValue(OriginalPaymentInstruction22 obj, Optional<Case3> value) {
			obj.setResolvedCase(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlPmtInfId", required = true)
	protected Max35Text originalPaymentInformationIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
	 * OriginalPaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original sending party, to unambiguously identify the original payment information group."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction26.mmOriginalPaymentInformationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction17.mmOriginalPaymentInformationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction22, Max35Text> mmOriginalPaymentInformationIdentification = new MMMessageAttribute<OriginalPaymentInstruction22, Max35Text>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction22.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationIdentification";
			definition = "Unique identification, as assigned by the original sending party, to unambiguously identify the original payment information group.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction26.mmOriginalPaymentInformationIdentification);
			previousVersion_lazy = () -> OriginalPaymentInstruction17.mmOriginalPaymentInformationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalPaymentInstruction22 obj) {
			return obj.getOriginalPaymentInformationIdentification();
		}

		@Override
		public void setValue(OriginalPaymentInstruction22 obj, Max35Text value) {
			obj.setOriginalPaymentInformationIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlGrpInf")
	protected OriginalGroupInformation3 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3
	 * OriginalGroupInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
	 * OriginalPaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information on the original message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmOriginalGroupInformation
	 * OriginalPaymentInstruction26.mmOriginalGroupInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmOriginalGroupInformation
	 * OriginalPaymentInstruction17.mmOriginalGroupInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalPaymentInstruction22, Optional<OriginalGroupInformation3>> mmOriginalGroupInformation = new MMMessageAssociationEnd<OriginalPaymentInstruction22, Optional<OriginalGroupInformation3>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction22.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Provides information on the original message.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction26.mmOriginalGroupInformation);
			previousVersion_lazy = () -> OriginalPaymentInstruction17.mmOriginalGroupInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalGroupInformation3.mmObject();
		}

		@Override
		public Optional<OriginalGroupInformation3> getValue(OriginalPaymentInstruction22 obj) {
			return obj.getOriginalGroupInformation();
		}

		@Override
		public void setValue(OriginalPaymentInstruction22 obj, Optional<OriginalGroupInformation3> value) {
			obj.setOriginalGroupInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlNbOfTxs")
	protected Max15NumericText originalNumberOfTransactions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
	 * OriginalPaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlNbOfTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalNumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual transactions contained in the original payment information group."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmOriginalNumberOfTransactions
	 * OriginalPaymentInstruction26.mmOriginalNumberOfTransactions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmOriginalNumberOfTransactions
	 * OriginalPaymentInstruction17.mmOriginalNumberOfTransactions}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction22, Optional<Max15NumericText>> mmOriginalNumberOfTransactions = new MMMessageAttribute<OriginalPaymentInstruction22, Optional<Max15NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction22.mmObject();
			isDerived = false;
			xmlTag = "OrgnlNbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNumberOfTransactions";
			definition = "Number of individual transactions contained in the original payment information group.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction26.mmOriginalNumberOfTransactions);
			previousVersion_lazy = () -> OriginalPaymentInstruction17.mmOriginalNumberOfTransactions;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(OriginalPaymentInstruction22 obj) {
			return obj.getOriginalNumberOfTransactions();
		}

		@Override
		public void setValue(OriginalPaymentInstruction22 obj, Optional<Max15NumericText> value) {
			obj.setOriginalNumberOfTransactions(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlCtrlSum")
	protected DecimalNumber originalControlSum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
	 * OriginalPaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in the original payment information group, irrespective of currencies."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmOriginalControlSum
	 * OriginalPaymentInstruction26.mmOriginalControlSum}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmOriginalControlSum
	 * OriginalPaymentInstruction17.mmOriginalControlSum}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction22, Optional<DecimalNumber>> mmOriginalControlSum = new MMMessageAttribute<OriginalPaymentInstruction22, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction22.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalControlSum";
			definition = "Total of all individual amounts included in the original payment information group, irrespective of currencies.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction26.mmOriginalControlSum);
			previousVersion_lazy = () -> OriginalPaymentInstruction17.mmOriginalControlSum;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(OriginalPaymentInstruction22 obj) {
			return obj.getOriginalControlSum();
		}

		@Override
		public void setValue(OriginalPaymentInstruction22 obj, Optional<DecimalNumber> value) {
			obj.setOriginalControlSum(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtInfCxlSts")
	protected GroupCancellationStatus1Code paymentInformationCancellationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GroupCancellationStatus1Code
	 * GroupCancellationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmStatus
	 * PaymentStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
	 * OriginalPaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInfCxlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of a cancellation request, related to a payment information group."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmPaymentInformationCancellationStatus
	 * OriginalPaymentInstruction26.mmPaymentInformationCancellationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmPaymentInformationCancellationStatus
	 * OriginalPaymentInstruction17.mmPaymentInformationCancellationStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction22, Optional<GroupCancellationStatus1Code>> mmPaymentInformationCancellationStatus = new MMMessageAttribute<OriginalPaymentInstruction22, Optional<GroupCancellationStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction22.mmObject();
			isDerived = false;
			xmlTag = "PmtInfCxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationCancellationStatus";
			definition = "Specifies the status of a cancellation request, related to a payment information group.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction26.mmPaymentInformationCancellationStatus);
			previousVersion_lazy = () -> OriginalPaymentInstruction17.mmPaymentInformationCancellationStatus;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> GroupCancellationStatus1Code.mmObject();
		}

		@Override
		public Optional<GroupCancellationStatus1Code> getValue(OriginalPaymentInstruction22 obj) {
			return obj.getPaymentInformationCancellationStatus();
		}

		@Override
		public void setValue(OriginalPaymentInstruction22 obj, Optional<GroupCancellationStatus1Code> value) {
			obj.setPaymentInformationCancellationStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlStsRsnInf")
	protected List<CancellationStatusReason2> cancellationStatusReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusReason2
	 * CancellationStatusReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmStatus
	 * InvestigationCase.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
	 * OriginalPaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlStsRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides detailed information on the cancellation status reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmCancellationStatusReasonInformation
	 * OriginalPaymentInstruction26.mmCancellationStatusReasonInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmCancellationStatusReasonInformation
	 * OriginalPaymentInstruction17.mmCancellationStatusReasonInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalPaymentInstruction22, List<CancellationStatusReason2>> mmCancellationStatusReasonInformation = new MMMessageAssociationEnd<OriginalPaymentInstruction22, List<CancellationStatusReason2>>() {
		{
			businessElementTrace_lazy = () -> InvestigationCase.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction22.mmObject();
			isDerived = false;
			xmlTag = "CxlStsRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReasonInformation";
			definition = "Provides detailed information on the cancellation status reason.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction26.mmCancellationStatusReasonInformation);
			previousVersion_lazy = () -> OriginalPaymentInstruction17.mmCancellationStatusReasonInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CancellationStatusReason2.mmObject();
		}

		@Override
		public List<CancellationStatusReason2> getValue(OriginalPaymentInstruction22 obj) {
			return obj.getCancellationStatusReasonInformation();
		}

		@Override
		public void setValue(OriginalPaymentInstruction22 obj, List<CancellationStatusReason2> value) {
			obj.setCancellationStatusReasonInformation(value);
		}
	};
	@XmlElement(name = "NbOfTxsPerCxlSts")
	protected List<NumberOfCancellationsPerStatus1> numberOfTransactionsPerCancellationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfCancellationsPerStatus1
	 * NumberOfCancellationsPerStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
	 * OriginalPaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfTxsPerCxlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information on the number of transactions for each identical cancellation status."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmNumberOfTransactionsPerCancellationStatus
	 * OriginalPaymentInstruction26.mmNumberOfTransactionsPerCancellationStatus}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmNumberOfTransactionsPerCancellationStatus
	 * OriginalPaymentInstruction17.mmNumberOfTransactionsPerCancellationStatus}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalPaymentInstruction22, List<NumberOfCancellationsPerStatus1>> mmNumberOfTransactionsPerCancellationStatus = new MMMessageAssociationEnd<OriginalPaymentInstruction22, List<NumberOfCancellationsPerStatus1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction22.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxsPerCxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerCancellationStatus";
			definition = "Detailed information on the number of transactions for each identical cancellation status.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction26.mmNumberOfTransactionsPerCancellationStatus);
			previousVersion_lazy = () -> OriginalPaymentInstruction17.mmNumberOfTransactionsPerCancellationStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NumberOfCancellationsPerStatus1.mmObject();
		}

		@Override
		public List<NumberOfCancellationsPerStatus1> getValue(OriginalPaymentInstruction22 obj) {
			return obj.getNumberOfTransactionsPerCancellationStatus();
		}

		@Override
		public void setValue(OriginalPaymentInstruction22 obj, List<NumberOfCancellationsPerStatus1> value) {
			obj.setNumberOfTransactionsPerCancellationStatus(value);
		}
	};
	@XmlElement(name = "TxInfAndSts")
	protected List<PaymentTransaction78> transactionInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction78
	 * PaymentTransaction78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
	 * OriginalPaymentInstruction22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original transactions to which the cancellation request message refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26#mmTransactionInformationAndStatus
	 * OriginalPaymentInstruction26.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmTransactionInformationAndStatus
	 * OriginalPaymentInstruction17.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalPaymentInstruction22, List<PaymentTransaction78>> mmTransactionInformationAndStatus = new MMMessageAssociationEnd<OriginalPaymentInstruction22, List<PaymentTransaction78>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction22.mmObject();
			isDerived = false;
			xmlTag = "TxInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformationAndStatus";
			definition = "Provides information on the original transactions to which the cancellation request message refers.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction26.mmTransactionInformationAndStatus);
			previousVersion_lazy = () -> OriginalPaymentInstruction17.mmTransactionInformationAndStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction78.mmObject();
		}

		@Override
		public List<PaymentTransaction78> getValue(OriginalPaymentInstruction22 obj) {
			return obj.getTransactionInformationAndStatus();
		}

		@Override
		public void setValue(OriginalPaymentInstruction22 obj, List<PaymentTransaction78> value) {
			obj.setTransactionInformationAndStatus(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction22.mmOriginalPaymentInformationCancellationIdentification,
						com.tools20022.repository.msg.OriginalPaymentInstruction22.mmResolvedCase, com.tools20022.repository.msg.OriginalPaymentInstruction22.mmOriginalPaymentInformationIdentification,
						com.tools20022.repository.msg.OriginalPaymentInstruction22.mmOriginalGroupInformation, com.tools20022.repository.msg.OriginalPaymentInstruction22.mmOriginalNumberOfTransactions,
						com.tools20022.repository.msg.OriginalPaymentInstruction22.mmOriginalControlSum, com.tools20022.repository.msg.OriginalPaymentInstruction22.mmPaymentInformationCancellationStatus,
						com.tools20022.repository.msg.OriginalPaymentInstruction22.mmCancellationStatusReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction22.mmNumberOfTransactionsPerCancellationStatus,
						com.tools20022.repository.msg.OriginalPaymentInstruction22.mmTransactionInformationAndStatus);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCancellationStatusReasonInformationRule.forOriginalPaymentInstruction22,
						com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline.forOriginalPaymentInstruction22,
						com.tools20022.repository.constraints.ConstraintPaymentInformationOrTransactionResolvedCaseRule.forOriginalPaymentInstruction22);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalPaymentInstruction22";
				definition = "Provides the details on the reference and status of the original transactions, included in the original instruction, to which the cancellation request message applies.";
				nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction26.mmObject());
				previousVersion_lazy = () -> OriginalPaymentInstruction17.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getOriginalPaymentInformationCancellationIdentification() {
		return originalPaymentInformationCancellationIdentification == null ? Optional.empty() : Optional.of(originalPaymentInformationCancellationIdentification);
	}

	public OriginalPaymentInstruction22 setOriginalPaymentInformationCancellationIdentification(Max35Text originalPaymentInformationCancellationIdentification) {
		this.originalPaymentInformationCancellationIdentification = originalPaymentInformationCancellationIdentification;
		return this;
	}

	public Optional<Case3> getResolvedCase() {
		return resolvedCase == null ? Optional.empty() : Optional.of(resolvedCase);
	}

	public OriginalPaymentInstruction22 setResolvedCase(Case3 resolvedCase) {
		this.resolvedCase = resolvedCase;
		return this;
	}

	public Max35Text getOriginalPaymentInformationIdentification() {
		return originalPaymentInformationIdentification;
	}

	public OriginalPaymentInstruction22 setOriginalPaymentInformationIdentification(Max35Text originalPaymentInformationIdentification) {
		this.originalPaymentInformationIdentification = Objects.requireNonNull(originalPaymentInformationIdentification);
		return this;
	}

	public Optional<OriginalGroupInformation3> getOriginalGroupInformation() {
		return originalGroupInformation == null ? Optional.empty() : Optional.of(originalGroupInformation);
	}

	public OriginalPaymentInstruction22 setOriginalGroupInformation(OriginalGroupInformation3 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
		return this;
	}

	public Optional<Max15NumericText> getOriginalNumberOfTransactions() {
		return originalNumberOfTransactions == null ? Optional.empty() : Optional.of(originalNumberOfTransactions);
	}

	public OriginalPaymentInstruction22 setOriginalNumberOfTransactions(Max15NumericText originalNumberOfTransactions) {
		this.originalNumberOfTransactions = originalNumberOfTransactions;
		return this;
	}

	public Optional<DecimalNumber> getOriginalControlSum() {
		return originalControlSum == null ? Optional.empty() : Optional.of(originalControlSum);
	}

	public OriginalPaymentInstruction22 setOriginalControlSum(DecimalNumber originalControlSum) {
		this.originalControlSum = originalControlSum;
		return this;
	}

	public Optional<GroupCancellationStatus1Code> getPaymentInformationCancellationStatus() {
		return paymentInformationCancellationStatus == null ? Optional.empty() : Optional.of(paymentInformationCancellationStatus);
	}

	public OriginalPaymentInstruction22 setPaymentInformationCancellationStatus(GroupCancellationStatus1Code paymentInformationCancellationStatus) {
		this.paymentInformationCancellationStatus = paymentInformationCancellationStatus;
		return this;
	}

	public List<CancellationStatusReason2> getCancellationStatusReasonInformation() {
		return cancellationStatusReasonInformation == null ? cancellationStatusReasonInformation = new ArrayList<>() : cancellationStatusReasonInformation;
	}

	public OriginalPaymentInstruction22 setCancellationStatusReasonInformation(List<CancellationStatusReason2> cancellationStatusReasonInformation) {
		this.cancellationStatusReasonInformation = Objects.requireNonNull(cancellationStatusReasonInformation);
		return this;
	}

	public List<NumberOfCancellationsPerStatus1> getNumberOfTransactionsPerCancellationStatus() {
		return numberOfTransactionsPerCancellationStatus == null ? numberOfTransactionsPerCancellationStatus = new ArrayList<>() : numberOfTransactionsPerCancellationStatus;
	}

	public OriginalPaymentInstruction22 setNumberOfTransactionsPerCancellationStatus(List<NumberOfCancellationsPerStatus1> numberOfTransactionsPerCancellationStatus) {
		this.numberOfTransactionsPerCancellationStatus = Objects.requireNonNull(numberOfTransactionsPerCancellationStatus);
		return this;
	}

	public List<PaymentTransaction78> getTransactionInformationAndStatus() {
		return transactionInformationAndStatus == null ? transactionInformationAndStatus = new ArrayList<>() : transactionInformationAndStatus;
	}

	public OriginalPaymentInstruction22 setTransactionInformationAndStatus(List<PaymentTransaction78> transactionInformationAndStatus) {
		this.transactionInformationAndStatus = Objects.requireNonNull(transactionInformationAndStatus);
		return this;
	}
}
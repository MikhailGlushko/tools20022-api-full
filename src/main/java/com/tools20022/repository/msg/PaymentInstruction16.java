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
import com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV06;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.codeset.PaymentMethod3Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics that apply to the debit side of the payment transactions
 * included in the credit transfer initiation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmPaymentInformationIdentification
 * PaymentInstruction16.mmPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmPaymentMethod
 * PaymentInstruction16.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmBatchBooking
 * PaymentInstruction16.mmBatchBooking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmNumberOfTransactions
 * PaymentInstruction16.mmNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmControlSum
 * PaymentInstruction16.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmPaymentTypeInformation
 * PaymentInstruction16.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmRequestedExecutionDate
 * PaymentInstruction16.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmPoolingAdjustmentDate
 * PaymentInstruction16.mmPoolingAdjustmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmDebtor
 * PaymentInstruction16.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmDebtorAccount
 * PaymentInstruction16.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmDebtorAgent
 * PaymentInstruction16.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmDebtorAgentAccount
 * PaymentInstruction16.mmDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmInstructionForDebtorAgent
 * PaymentInstruction16.mmInstructionForDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmUltimateDebtor
 * PaymentInstruction16.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmChargeBearer
 * PaymentInstruction16.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmChargesAccount
 * PaymentInstruction16.mmChargesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmChargesAccountAgent
 * PaymentInstruction16.mmChargesAccountAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16#mmCreditTransferTransactionInformation
 * PaymentInstruction16.mmCreditTransferTransactionInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV06#mmPaymentInformation
 * CustomerCreditTransferInitiationV06.mmPaymentInformation}</li>
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
 * "PaymentInstruction16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics that apply to the debit side of the payment transactions included in the credit transfer initiation."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction20
 * PaymentInstruction20}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9
 * PaymentInstruction9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentInstruction16", propOrder = {"paymentInformationIdentification", "paymentMethod", "batchBooking", "numberOfTransactions", "controlSum", "paymentTypeInformation", "requestedExecutionDate", "poolingAdjustmentDate",
		"debtor", "debtorAccount", "debtorAgent", "debtorAgentAccount", "instructionForDebtorAgent", "ultimateDebtor", "chargeBearer", "chargesAccount", "chargesAccountAgent", "creditTransferTransactionInformation"})
public class PaymentInstruction16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text paymentInformationIdentification;
	/**
	 * Unique identification, as assigned by a sending party, to unambiguously
	 * identify the payment information group within the message.
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by a sending party, to unambiguously identify the payment information group within the message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmPaymentInformationIdentification
	 * PaymentInstruction20.mmPaymentInformationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmPaymentInformationIdentification
	 * PaymentInstruction9.mmPaymentInformationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInformationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "PmtInfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationIdentification";
			definition = "Unique identification, as assigned by a sending party, to unambiguously identify the payment information group within the message.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmPaymentInformationIdentification);
			previousVersion_lazy = () -> PaymentInstruction9.mmPaymentInformationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PaymentMethod3Code paymentMethod;
	/**
	 * Specifies the means of payment that will be used to move the amount of
	 * money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentMethod3Code
	 * PaymentMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmMethod
	 * CreditInstrument.mmMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the means of payment that will be used to move the amount of money."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmPaymentMethod
	 * PaymentInstruction20.mmPaymentMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmPaymentMethod
	 * PaymentInstruction9.mmPaymentMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CreditInstrument.mmMethod;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Specifies the means of payment that will be used to move the amount of money.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmPaymentMethod);
			previousVersion_lazy = () -> PaymentInstruction9.mmPaymentMethod;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentMethod3Code.mmObject();
		}
	};
	protected BatchBookingIndicator batchBooking;
	/**
	 * Identifies whether a single entry per individual transaction or a batch
	 * entry for the sum of the amounts of all transactions within the group of
	 * a message is requested. Usage: Batch booking is used to request and not
	 * order a possible batch booking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BatchBookingIndicator
	 * BatchBookingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchBookg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchBooking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether a single entry per individual transaction or a batch entry for the sum of the amounts of all transactions within the group of a message is requested.\nUsage: Batch booking is used to request and not order a possible batch booking."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmBatchBooking
	 * PaymentInstruction20.mmBatchBooking}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmBatchBooking
	 * PaymentInstruction9.mmBatchBooking}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBatchBooking = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "BtchBookg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchBooking";
			definition = "Identifies whether a single entry per individual transaction or a batch entry for the sum of the amounts of all transactions within the group of a message is requested.\nUsage: Batch booking is used to request and not order a possible batch booking.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmBatchBooking);
			previousVersion_lazy = () -> PaymentInstruction9.mmBatchBooking;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BatchBookingIndicator.mmObject();
		}
	};
	protected Max15NumericText numberOfTransactions;
	/**
	 * Number of individual transactions contained in the payment information
	 * group.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual transactions contained in the payment information group."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmNumberOfTransactions
	 * PaymentInstruction20.mmNumberOfTransactions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmNumberOfTransactions
	 * PaymentInstruction9.mmNumberOfTransactions}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactions";
			definition = "Number of individual transactions contained in the payment information group.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmNumberOfTransactions);
			previousVersion_lazy = () -> PaymentInstruction9.mmNumberOfTransactions;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected DecimalNumber controlSum;
	/**
	 * Total of all individual amounts included in the group, irrespective of
	 * currencies.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in the group, irrespective of currencies."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmControlSum
	 * PaymentInstruction20.mmControlSum}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmControlSum
	 * PaymentInstruction9.mmControlSum}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in the group, irrespective of currencies.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmControlSum);
			previousVersion_lazy = () -> PaymentInstruction9.mmControlSum;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected PaymentTypeInformation19 paymentTypeInformation;
	/**
	 * Set of elements used to further specify the type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19
	 * PaymentTypeInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
	 * PaymentExecution.mmProcessingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTypeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to further specify the type of transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmPaymentTypeInformation
	 * PaymentInstruction20.mmPaymentTypeInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmPaymentTypeInformation
	 * PaymentInstruction9.mmPaymentTypeInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTypeInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmProcessingInstructions;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformation";
			definition = "Set of elements used to further specify the type of transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmPaymentTypeInformation);
			previousVersion_lazy = () -> PaymentInstruction9.mmPaymentTypeInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation19.mmObject();
		}
	};
	protected ISODate requestedExecutionDate;
	/**
	 * Date at which the initiating party requests the clearing agent to process
	 * the payment. Usage: This is the date on which the debtor's account is to
	 * be debited. If payment by cheque, the date when the cheque must be
	 * generated by the bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRequestedExecutionDate
	 * PaymentExecution.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdExctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the initiating party requests the clearing agent to process the payment. \nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmRequestedExecutionDate
	 * PaymentInstruction20.mmRequestedExecutionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmRequestedExecutionDate
	 * PaymentInstruction9.mmRequestedExecutionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedExecutionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmRequestedExecutionDate;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the initiating party requests the clearing agent to process the payment. \nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmRequestedExecutionDate);
			previousVersion_lazy = () -> PaymentInstruction9.mmRequestedExecutionDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate poolingAdjustmentDate;
	/**
	 * Date used for the correction of the value date of a cash pool movement
	 * that has been posted with a different value date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPoolingAdjustmentDate
	 * Payment.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolgAdjstmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolingAdjustmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmPoolingAdjustmentDate
	 * PaymentInstruction20.mmPoolingAdjustmentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmPoolingAdjustmentDate
	 * PaymentInstruction9.mmPoolingAdjustmentDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolingAdjustmentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmPoolingAdjustmentDate;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "PoolgAdjstmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolingAdjustmentDate";
			definition = "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmPoolingAdjustmentDate);
			previousVersion_lazy = () -> PaymentInstruction9.mmPoolingAdjustmentDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected PartyIdentification43 debtor;
	/**
	 * Party that owes an amount of money to the (ultimate) creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes an amount of money to the (ultimate) creditor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmDebtor
	 * PaymentInstruction20.mmDebtor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmDebtor
	 * PaymentInstruction9.mmDebtor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmDebtor);
			previousVersion_lazy = () -> PaymentInstruction9.mmDebtor;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected CashAccount24 debtorAccount;
	/**
	 * Unambiguous identification of the account of the debtor to which a debit
	 * entry will be made as a result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmDebtorAccount
	 * PaymentInstruction20.mmDebtorAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmDebtorAccount
	 * PaymentInstruction9.mmDebtorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmDebtorAccount);
			previousVersion_lazy = () -> PaymentInstruction9.mmDebtorAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification5 debtorAgent;
	/**
	 * Financial institution servicing an account for the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the debtor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmDebtorAgent
	 * PaymentInstruction20.mmDebtorAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmDebtorAgent
	 * PaymentInstruction9.mmDebtorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmDebtorAgent);
			previousVersion_lazy = () -> PaymentInstruction9.mmDebtorAgent;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	protected CashAccount24 debtorAgentAccount;
	/**
	 * Unambiguous identification of the account of the debtor agent at its
	 * servicing agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the debtor agent at its servicing agent in the payment chain."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmDebtorAgentAccount
	 * PaymentInstruction20.mmDebtorAgentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmDebtorAgentAccount
	 * PaymentInstruction9.mmDebtorAgentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentAccount";
			definition = "Unambiguous identification of the account of the debtor agent at its servicing agent in the payment chain.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmDebtorAgentAccount);
			previousVersion_lazy = () -> PaymentInstruction9.mmDebtorAgentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	protected Max140Text instructionForDebtorAgent;
	/**
	 * Further information related to the processing of the payment instruction,
	 * that may need to be acted upon by the debtor agent, depending on
	 * agreement between debtor and the debtor agent.<br>
	 * <br>
	 * Usage: when present, then the instructions for the debtor agent apply for
	 * all credit transfer transaction information occurrences, present in the
	 * payment information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForDebtorAgent
	 * Payment.mmInstructionForDebtorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrForDbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction, that may need to be acted upon by the debtor agent, depending on agreement between debtor and the debtor agent.\r\n\r\nUsage: when present, then the instructions for the debtor agent apply for all credit transfer transaction information occurrences, present in the payment information."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmInstructionForDebtorAgent
	 * PaymentInstruction20.mmInstructionForDebtorAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmInstructionForDebtorAgent
	 * PaymentInstruction9.mmInstructionForDebtorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionForDebtorAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructionForDebtorAgent;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "InstrForDbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForDebtorAgent";
			definition = "Further information related to the processing of the payment instruction, that may need to be acted upon by the debtor agent, depending on agreement between debtor and the debtor agent.\r\n\r\nUsage: when present, then the instructions for the debtor agent apply for all credit transfer transaction information occurrences, present in the payment information.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmInstructionForDebtorAgent);
			previousVersion_lazy = () -> PaymentInstruction9.mmInstructionForDebtorAgent;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected PartyIdentification43 ultimateDebtor;
	/**
	 * Ultimate party that owes an amount of money to the (ultimate) creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtDbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that owes an amount of money to the (ultimate) creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmUltimateDebtor
	 * PaymentInstruction20.mmUltimateDebtor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmUltimateDebtor
	 * PaymentInstruction9.mmUltimateDebtor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUltimateDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmUltimateDebtor);
			previousVersion_lazy = () -> PaymentInstruction9.mmUltimateDebtor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected ChargeBearerType1Code chargeBearer;
	/**
	 * Specifies which party/parties will bear the charges associated with the
	 * processing of the payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmBearerType
	 * Charges.mmBearerType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgBr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which party/parties will bear the charges associated with the processing of the payment transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmChargeBearer
	 * PaymentInstruction20.mmChargeBearer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmChargeBearer
	 * PaymentInstruction9.mmChargeBearer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeBearer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Charges.mmBearerType;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmChargeBearer);
			previousVersion_lazy = () -> PaymentInstruction9.mmChargeBearer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};
	protected CashAccount24 chargesAccount;
	/**
	 * Account used to process charges associated with a transaction.
	 * 
	 * Usage: Charges account should be used when charges have to be booked to
	 * an account different from the account identified in debtor's account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmChargesDebitAccount
	 * Charges.mmChargesDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used to process charges associated with a transaction.\n\nUsage: Charges account should be used when charges have to be booked to an account different from the account identified in debtor's account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmChargesAccount
	 * PaymentInstruction20.mmChargesAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmChargesAccount
	 * PaymentInstruction9.mmChargesAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargesAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Charges.mmChargesDebitAccount;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAccount";
			definition = "Account used to process charges associated with a transaction.\n\nUsage: Charges account should be used when charges have to be booked to an account different from the account identified in debtor's account.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmChargesAccount);
			previousVersion_lazy = () -> PaymentInstruction9.mmChargesAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification5 chargesAccountAgent;
	/**
	 * Agent that services a charges account.
	 * 
	 * Usage: Charges account agent should only be used when the charges account
	 * agent is different from the debtor agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsAcctAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAccountAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that services a charges account.\n\nUsage: Charges account agent should only be used when the charges account agent is different from the debtor agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmChargesAccountAgent
	 * PaymentInstruction20.mmChargesAccountAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmChargesAccountAgent
	 * PaymentInstruction9.mmChargesAccountAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargesAccountAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAcctAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAccountAgent";
			definition = "Agent that services a charges account.\n\nUsage: Charges account agent should only be used when the charges account agent is different from the debtor agent.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmChargesAccountAgent);
			previousVersion_lazy = () -> PaymentInstruction9.mmChargesAccountAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CreditTransferTransaction20> creditTransferTransactionInformation;
	/**
	 * Provides information on the individual transaction(s) included in the
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20
	 * CreditTransferTransaction20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction16
	 * PaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtTrfTxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransferTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the individual transaction(s) included in the message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction20#mmCreditTransferTransactionInformation
	 * PaymentInstruction20.mmCreditTransferTransactionInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction9#mmCreditTransferTransactionInformation
	 * PaymentInstruction9.mmCreditTransferTransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditTransferTransactionInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CreditTransfer.mmObject();
			componentContext_lazy = () -> PaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "CdtTrfTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransactionInformation";
			definition = "Provides information on the individual transaction(s) included in the message.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmCreditTransferTransactionInformation);
			previousVersion_lazy = () -> PaymentInstruction9.mmCreditTransferTransactionInformation;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction20.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentInstruction16.mmPaymentInformationIdentification, PaymentInstruction16.mmPaymentMethod, PaymentInstruction16.mmBatchBooking, PaymentInstruction16.mmNumberOfTransactions,
						PaymentInstruction16.mmControlSum, PaymentInstruction16.mmPaymentTypeInformation, PaymentInstruction16.mmRequestedExecutionDate, PaymentInstruction16.mmPoolingAdjustmentDate, PaymentInstruction16.mmDebtor,
						PaymentInstruction16.mmDebtorAccount, PaymentInstruction16.mmDebtorAgent, PaymentInstruction16.mmDebtorAgentAccount, PaymentInstruction16.mmInstructionForDebtorAgent, PaymentInstruction16.mmUltimateDebtor,
						PaymentInstruction16.mmChargeBearer, PaymentInstruction16.mmChargesAccount, PaymentInstruction16.mmChargesAccountAgent, PaymentInstruction16.mmCreditTransferTransactionInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerCreditTransferInitiationV06.mmPaymentInformation);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstruction16";
				definition = "Characteristics that apply to the debit side of the payment transactions included in the credit transfer initiation.";
				nextVersions_lazy = () -> Arrays.asList(PaymentInstruction20.mmObject());
				previousVersion_lazy = () -> PaymentInstruction9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PmtInfId", required = true)
	public Max35Text getPaymentInformationIdentification() {
		return paymentInformationIdentification;
	}

	public void setPaymentInformationIdentification(Max35Text paymentInformationIdentification) {
		this.paymentInformationIdentification = paymentInformationIdentification;
	}

	@XmlElement(name = "PmtMtd", required = true)
	public PaymentMethod3Code getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod3Code paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@XmlElement(name = "BtchBookg")
	public BatchBookingIndicator getBatchBooking() {
		return batchBooking;
	}

	public void setBatchBooking(BatchBookingIndicator batchBooking) {
		this.batchBooking = batchBooking;
	}

	@XmlElement(name = "NbOfTxs")
	public Max15NumericText getNumberOfTransactions() {
		return numberOfTransactions;
	}

	public void setNumberOfTransactions(Max15NumericText numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
	}

	@XmlElement(name = "CtrlSum")
	public DecimalNumber getControlSum() {
		return controlSum;
	}

	public void setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
	}

	@XmlElement(name = "PmtTpInf")
	public PaymentTypeInformation19 getPaymentTypeInformation() {
		return paymentTypeInformation;
	}

	public void setPaymentTypeInformation(com.tools20022.repository.msg.PaymentTypeInformation19 paymentTypeInformation) {
		this.paymentTypeInformation = paymentTypeInformation;
	}

	@XmlElement(name = "ReqdExctnDt", required = true)
	public ISODate getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(ISODate requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
	}

	@XmlElement(name = "PoolgAdjstmntDt")
	public ISODate getPoolingAdjustmentDate() {
		return poolingAdjustmentDate;
	}

	public void setPoolingAdjustmentDate(ISODate poolingAdjustmentDate) {
		this.poolingAdjustmentDate = poolingAdjustmentDate;
	}

	@XmlElement(name = "Dbtr", required = true)
	public PartyIdentification43 getDebtor() {
		return debtor;
	}

	public void setDebtor(com.tools20022.repository.msg.PartyIdentification43 debtor) {
		this.debtor = debtor;
	}

	@XmlElement(name = "DbtrAcct", required = true)
	public CashAccount24 getDebtorAccount() {
		return debtorAccount;
	}

	public void setDebtorAccount(com.tools20022.repository.msg.CashAccount24 debtorAccount) {
		this.debtorAccount = debtorAccount;
	}

	@XmlElement(name = "DbtrAgt", required = true)
	public BranchAndFinancialInstitutionIdentification5 getDebtorAgent() {
		return debtorAgent;
	}

	public void setDebtorAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 debtorAgent) {
		this.debtorAgent = debtorAgent;
	}

	@XmlElement(name = "DbtrAgtAcct")
	public CashAccount24 getDebtorAgentAccount() {
		return debtorAgentAccount;
	}

	public void setDebtorAgentAccount(com.tools20022.repository.msg.CashAccount24 debtorAgentAccount) {
		this.debtorAgentAccount = debtorAgentAccount;
	}

	@XmlElement(name = "InstrForDbtrAgt")
	public Max140Text getInstructionForDebtorAgent() {
		return instructionForDebtorAgent;
	}

	public void setInstructionForDebtorAgent(Max140Text instructionForDebtorAgent) {
		this.instructionForDebtorAgent = instructionForDebtorAgent;
	}

	@XmlElement(name = "UltmtDbtr")
	public PartyIdentification43 getUltimateDebtor() {
		return ultimateDebtor;
	}

	public void setUltimateDebtor(com.tools20022.repository.msg.PartyIdentification43 ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
	}

	@XmlElement(name = "ChrgBr")
	public ChargeBearerType1Code getChargeBearer() {
		return chargeBearer;
	}

	public void setChargeBearer(ChargeBearerType1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
	}

	@XmlElement(name = "ChrgsAcct")
	public CashAccount24 getChargesAccount() {
		return chargesAccount;
	}

	public void setChargesAccount(com.tools20022.repository.msg.CashAccount24 chargesAccount) {
		this.chargesAccount = chargesAccount;
	}

	@XmlElement(name = "ChrgsAcctAgt")
	public BranchAndFinancialInstitutionIdentification5 getChargesAccountAgent() {
		return chargesAccountAgent;
	}

	public void setChargesAccountAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 chargesAccountAgent) {
		this.chargesAccountAgent = chargesAccountAgent;
	}

	@XmlElement(name = "CdtTrfTxInf", required = true)
	public List<CreditTransferTransaction20> getCreditTransferTransactionInformation() {
		return creditTransferTransactionInformation;
	}

	public void setCreditTransferTransactionInformation(List<com.tools20022.repository.msg.CreditTransferTransaction20> creditTransferTransactionInformation) {
		this.creditTransferTransactionInformation = creditTransferTransactionInformation;
	}
}
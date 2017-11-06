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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.PaymentIdentification2Choice;
import com.tools20022.repository.choice.PaymentIdentification3Choice;
import com.tools20022.repository.choice.PaymentIdentification4Choice;
import com.tools20022.repository.choice.PaymentIdentificationChoice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different identifications associated with a payment
 * transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentIdentification"
 * src="doc-files/PaymentIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
 * PaymentIdentification.mmExecutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
 * PaymentIdentification.mmEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmInstructionIdentification
 * PaymentIdentification.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmTransactionIdentification
 * PaymentIdentification.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmClearingSystemReference
 * PaymentIdentification.mmClearingSystemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmCreditorReference
 * PaymentIdentification.mmCreditorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmPayment
 * PaymentIdentification.mmPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
 * Payment.mmPaymentRelatedIdentifications}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.TradeIdentification
 * TradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice
 * PaymentIdentificationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice
 * PaymentIdentification2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification3Choice
 * PaymentIdentification3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice
 * PaymentIdentification4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentIdentification1
 * PaymentIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditorReferenceInformation1
 * CreditorReferenceInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2
 * CreditorReferenceInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentIdentification2
 * PaymentIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentIdentification3
 * PaymentIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentIdentification4
 * PaymentIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReferences4
 * TransactionReferences4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CertificateIdentification1
 * CertificateIdentification1}</li>
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
 * "PaymentIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a payment transaction."
 * </li>
 * </ul>
 */
public class PaymentIdentification extends TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text executionIdentification;
	/**
	 * Unique and unambiguous identifier for a payment execution, as assigned by
	 * the clearing agent or the initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice#mmPaymentInstructionReference
	 * PaymentIdentificationChoice.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmPaymentInstructionReference
	 * PaymentInstructionReferenceDetails3.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails2#mmPaymentInstructionReference
	 * PaymentInstructionReferenceDetails2.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification2Choice#mmPaymentInstructionReference
	 * PaymentIdentification2Choice.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails4#mmPaymentInstructionReference
	 * PaymentInstructionReferenceDetails4.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification3Choice#mmPaymentInstructionReference
	 * PaymentIdentification3Choice.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1#mmTransactionIdentification
	 * ShortPaymentIdentification1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#mmInstructionReference
	 * PaymentSearch2.mmInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#mmPaymentInstructionReference
	 * PaymentSearch2.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInstructionReference
	 * PaymentSearch3.mmInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmPaymentInstructionReference
	 * PaymentSearch3.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmPaymentIdentification
	 * PaymentSearch4.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmTransactionIdentification
	 * PaymentSearch4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPaymentInstructionReference
	 * PaymentDetails5.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmPaymentInstructionReference
	 * PaymentDetails6.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmPaymentInstructionReference
	 * PaymentDetails7.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader23#mmMessageIdentification
	 * GroupHeader23.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader42#mmMessageIdentification
	 * GroupHeader42.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader58#mmMessageIdentification
	 * GroupHeader58.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader1#mmMessageIdentification
	 * GroupHeader1.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader32#mmMessageIdentification
	 * GroupHeader32.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader48#mmMessageIdentification
	 * GroupHeader48.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader39#mmMessageIdentification
	 * GroupHeader39.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader55#mmMessageIdentification
	 * GroupHeader55.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader7#mmMessageIdentification
	 * GroupHeader7.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation4#mmOriginalMessageIdentification
	 * OriginalGroupInformation4.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation3.mmOriginalPaymentInformationIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation23#mmOriginalMessageIdentification
	 * OriginalGroupInformation23.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3#mmOriginalMessageIdentification
	 * OriginalGroupInformation3.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader4#mmOriginalMessageIdentification
	 * OriginalGroupHeader4.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction4#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction4.mmPaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction8#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction8.mmPaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader8#mmMessageIdentification
	 * GroupHeader8.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation5#mmOriginalMessageIdentification
	 * OriginalGroupInformation5.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation4.mmOriginalPaymentInformationIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader40#mmMessageIdentification
	 * GroupHeader40.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation22#mmOriginalMessageIdentification
	 * OriginalGroupInformation22.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader56#mmMessageIdentification
	 * GroupHeader56.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3#mmOriginalMessageIdentification
	 * OriginalGroupHeader3.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader5#mmMessageIdentification
	 * GroupHeader5.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation1#mmOriginalMessageIdentification
	 * OriginalGroupInformation1.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation1.mmOriginalPaymentInformationIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader36#mmMessageIdentification
	 * GroupHeader36.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation20#mmOriginalMessageIdentification
	 * OriginalGroupInformation20.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader52#mmMessageIdentification
	 * GroupHeader52.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmOriginalMessageIdentification
	 * OriginalGroupHeader1.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader2#mmMessageIdentification
	 * GroupHeader2.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader33#mmMessageIdentification
	 * GroupHeader33.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader49#mmMessageIdentification
	 * GroupHeader49.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader3#mmMessageIdentification
	 * GroupHeader3.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader34#mmMessageIdentification
	 * GroupHeader34.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader50#mmMessageIdentification
	 * GroupHeader50.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader9#mmMessageIdentification
	 * GroupHeader9.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation5.mmOriginalPaymentInformationIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader41#mmMessageIdentification
	 * GroupHeader41.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader57#mmMessageIdentification
	 * GroupHeader57.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader37#mmMessageIdentification
	 * GroupHeader37.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader53#mmMessageIdentification
	 * GroupHeader53.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader4#mmMessageIdentification
	 * GroupHeader4.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader35#mmMessageIdentification
	 * GroupHeader35.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader51#mmMessageIdentification
	 * GroupHeader51.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader31#mmMessageIdentification
	 * GroupHeader31.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader47#mmMessageIdentification
	 * GroupHeader47.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6#mmMessageIdentification
	 * GroupHeader6.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation2#mmOriginalMessageIdentification
	 * OriginalGroupInformation2.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader38#mmMessageIdentification
	 * GroupHeader38.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation21#mmOriginalMessageIdentification
	 * OriginalGroupInformation21.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader54#mmMessageIdentification
	 * GroupHeader54.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2#mmOriginalMessageIdentification
	 * OriginalGroupHeader2.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader46#mmMessageIdentification
	 * GroupHeader46.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmOriginalMessageIdentification
	 * OriginalGroupInformation25.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader45#mmMessageIdentification
	 * GroupHeader45.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#mmAssignerInstructionIdentification
	 * PaymentInstructionExtract.mmAssignerInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract#mmAssigneeInstructionIdentification
	 * PaymentInstructionExtract.mmAssigneeInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmOriginalInstructionIdentification
	 * PaymentInstructionExtract2.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader43#mmMessageIdentification
	 * GroupHeader43.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader59#mmMessageIdentification
	 * GroupHeader59.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader44#mmMessageIdentification
	 * GroupHeader44.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#mmOriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction1.mmOriginalPaymentInformationIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmInstructionIdentification
	 * RequestedModification2.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24#mmOriginalGroupCancellationIdentification
	 * OriginalGroupInformation24.mmOriginalGroupCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24#mmOriginalMessageIdentification
	 * OriginalGroupInformation24.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmOriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction2.mmOriginalPaymentInformationIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#mmOriginalGroupCancellationIdentification
	 * OriginalGroupHeader5.mmOriginalGroupCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5#mmOriginalMessageIdentification
	 * OriginalGroupHeader5.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction3.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmInstructionIdentification
	 * RequestedModification3.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem3#mmOriginalItemIdentification
	 * OriginalItem3.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader60#mmMessageIdentification
	 * GroupHeader60.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader63#mmMessageIdentification
	 * GroupHeader63.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#mmOriginalMessageIdentification
	 * OriginalGroupInformation13.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation17#mmOriginalMessageIdentification
	 * OriginalGroupInformation17.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmOriginalMessageIdentification
	 * OriginalGroupInformation15.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation19#mmOriginalMessageIdentification
	 * OriginalGroupInformation19.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation11#mmOriginalMessageIdentification
	 * OriginalGroupInformation11.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation18#mmOriginalMessageIdentification
	 * OriginalGroupInformation18.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation8#mmOriginalMessageIdentification
	 * OriginalGroupInformation8.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation15.
	 * mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation22.
	 * mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation17.
	 * mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalPaymentInformationIdentification
	 * PaymentTransactionInformation24.
	 * mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader19#mmMessageIdentification
	 * GroupHeader19.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader24#mmMessageIdentification
	 * GroupHeader24.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader20#mmMessageIdentification
	 * GroupHeader20.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader25#mmMessageIdentification
	 * GroupHeader25.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader15#mmMessageIdentification
	 * GroupHeader15.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader26#mmMessageIdentification
	 * GroupHeader26.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17#mmMessageIdentification
	 * GroupHeader17.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27#mmMessageIdentification
	 * GroupHeader27.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader22#mmMessageIdentification
	 * GroupHeader22.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader28#mmMessageIdentification
	 * GroupHeader28.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader16#mmMessageIdentification
	 * GroupHeader16.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader29#mmMessageIdentification
	 * GroupHeader29.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader18#mmMessageIdentification
	 * GroupHeader18.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader30#mmMessageIdentification
	 * GroupHeader30.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation16#mmOriginalMessageIdentification
	 * OriginalGroupInformation16.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation14#mmOriginalMessageIdentification
	 * OriginalGroupInformation14.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation7#mmOriginalMessageIdentification
	 * OriginalGroupInformation7.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader12#mmMessageIdentification
	 * GroupHeader12.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader21#mmMessageIdentification
	 * GroupHeader21.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmPaymentIdentification
	 * PaymentSearch5.mmPaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmTransactionIdentification
	 * PaymentSearch5.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader62#mmMessageIdentification
	 * GroupHeader62.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader67#mmMessageIdentification
	 * GroupHeader67.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem4#mmOriginalItemIdentification
	 * OriginalItem4.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmInstructionIdentification
	 * RequestedModification4.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction13.mmPaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction10.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader70#mmMessageIdentification
	 * GroupHeader70.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmInstructionIdentification
	 * RequestedModification5.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader72#mmMessageIdentification
	 * GroupHeader72.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GroupHeader71#mmMessageIdentification
	 * GroupHeader71.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction15.mmPaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#mmOriginalItemIdentification
	 * OriginalItem5.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction17.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage2#mmOriginalMessageIdentification
	 * OriginalMessage2.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalMessage3#mmOriginalMessageIdentification
	 * OriginalMessage3.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation27#mmOriginalMessageIdentification
	 * OriginalGroupInformation27.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmOriginalMessageIdentification
	 * OriginalGroupHeader7.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmInstructionIdentification
	 * RequestedModification6.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmOriginalMessageIdentification
	 * OriginalGroupInformation28.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmOriginalPaymentInformationCancellationIdentification
	 * OriginalPaymentInstruction22.
	 * mmOriginalPaymentInformationCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction20.mmPaymentCancellationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalPaymentInformationIdentification
	 * UnderlyingPaymentInstruction3.mmOriginalPaymentInformationIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmOriginalMessageIdentification
	 * OriginalGroupHeader6.mmOriginalMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExecutionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentIdentificationChoice.mmPaymentInstructionReference, com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmPaymentInstructionReference,
					com.tools20022.repository.msg.PaymentInstructionReferenceDetails2.mmPaymentInstructionReference, com.tools20022.repository.choice.PaymentIdentification2Choice.mmPaymentInstructionReference,
					com.tools20022.repository.msg.PaymentInstructionReferenceDetails4.mmPaymentInstructionReference, com.tools20022.repository.choice.PaymentIdentification3Choice.mmPaymentInstructionReference,
					com.tools20022.repository.msg.ShortPaymentIdentification1.mmTransactionIdentification, com.tools20022.repository.msg.PaymentSearch2.mmInstructionReference,
					com.tools20022.repository.msg.PaymentSearch2.mmPaymentInstructionReference, com.tools20022.repository.msg.PaymentSearch3.mmInstructionReference,
					com.tools20022.repository.msg.PaymentSearch3.mmPaymentInstructionReference, com.tools20022.repository.msg.PaymentSearch4.mmPaymentIdentification, com.tools20022.repository.msg.PaymentSearch4.mmTransactionIdentification,
					com.tools20022.repository.msg.PaymentDetails5.mmPaymentInstructionReference, com.tools20022.repository.msg.PaymentDetails6.mmPaymentInstructionReference,
					com.tools20022.repository.msg.PaymentDetails7.mmPaymentInstructionReference, com.tools20022.repository.msg.GroupHeader23.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader42.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader58.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader1.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader32.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader48.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader39.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader55.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader7.mmMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation4.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation3.mmOriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalGroupInformation23.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation3.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupHeader4.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction4.mmPaymentCancellationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction8.mmPaymentCancellationIdentification,
					com.tools20022.repository.msg.GroupHeader8.mmMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation5.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation4.mmOriginalPaymentInformationIdentification, com.tools20022.repository.msg.GroupHeader40.mmMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation22.mmOriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader56.mmMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupHeader3.mmOriginalMessageIdentification, com.tools20022.repository.msg.GroupHeader5.mmMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation1.mmOriginalMessageIdentification, com.tools20022.repository.msg.PaymentTransactionInformation1.mmOriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.GroupHeader36.mmMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation20.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.GroupHeader52.mmMessageIdentification, com.tools20022.repository.msg.OriginalGroupHeader1.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.GroupHeader2.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader33.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader49.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader3.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader34.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader50.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader9.mmMessageIdentification, com.tools20022.repository.msg.PaymentTransactionInformation5.mmOriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.GroupHeader41.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader57.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader37.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader53.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader4.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader35.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader51.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader31.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader47.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader6.mmMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation2.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.GroupHeader38.mmMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation21.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.GroupHeader54.mmMessageIdentification, com.tools20022.repository.msg.OriginalGroupHeader2.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.GroupHeader46.mmMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation25.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.GroupHeader45.mmMessageIdentification, com.tools20022.repository.msg.PaymentInstructionExtract.mmAssignerInstructionIdentification,
					com.tools20022.repository.msg.PaymentInstructionExtract.mmAssigneeInstructionIdentification, com.tools20022.repository.msg.PaymentInstructionExtract2.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.GroupHeader43.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader59.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader44.mmMessageIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction1.mmOriginalPaymentInformationIdentification, com.tools20022.repository.msg.RequestedModification2.mmInstructionIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation24.mmOriginalGroupCancellationIdentification, com.tools20022.repository.msg.OriginalGroupInformation24.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction2.mmOriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalGroupHeader5.mmOriginalGroupCancellationIdentification,
					com.tools20022.repository.msg.OriginalGroupHeader5.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction3.mmOriginalPaymentInformationCancellationIdentification,
					com.tools20022.repository.msg.RequestedModification3.mmInstructionIdentification, com.tools20022.repository.msg.OriginalItem3.mmOriginalItemIdentification,
					com.tools20022.repository.msg.GroupHeader60.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader63.mmMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation13.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation17.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation15.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation19.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation11.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation18.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation8.mmOriginalMessageIdentification, com.tools20022.repository.msg.PaymentTransactionInformation15.mmOriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation22.mmOriginalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentTransactionInformation17.mmOriginalPaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation24.mmOriginalPaymentInformationIdentification, com.tools20022.repository.msg.GroupHeader19.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader24.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader20.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader25.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader15.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader26.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader17.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader27.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader22.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader28.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader16.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader29.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader18.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader30.mmMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation16.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation14.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation7.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.GroupHeader12.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader21.mmMessageIdentification, com.tools20022.repository.msg.PaymentSearch5.mmPaymentIdentification,
					com.tools20022.repository.msg.PaymentSearch5.mmTransactionIdentification, com.tools20022.repository.msg.GroupHeader62.mmMessageIdentification, com.tools20022.repository.msg.GroupHeader67.mmMessageIdentification,
					com.tools20022.repository.msg.OriginalItem4.mmOriginalItemIdentification, com.tools20022.repository.msg.RequestedModification4.mmInstructionIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction13.mmPaymentCancellationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction10.mmOriginalPaymentInformationCancellationIdentification,
					com.tools20022.repository.msg.GroupHeader70.mmMessageIdentification, com.tools20022.repository.msg.RequestedModification5.mmInstructionIdentification, com.tools20022.repository.msg.GroupHeader72.mmMessageIdentification,
					com.tools20022.repository.msg.GroupHeader71.mmMessageIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction15.mmPaymentCancellationIdentification,
					com.tools20022.repository.msg.OriginalItem5.mmOriginalItemIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction17.mmOriginalPaymentInformationCancellationIdentification,
					com.tools20022.repository.msg.OriginalMessage2.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalMessage3.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalGroupInformation27.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupHeader7.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.RequestedModification6.mmInstructionIdentification, com.tools20022.repository.msg.OriginalGroupInformation28.mmOriginalMessageIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction22.mmOriginalPaymentInformationCancellationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction20.mmPaymentCancellationIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction3.mmOriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalGroupHeader6.mmOriginalMessageIdentification);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionIdentification";
			definition = "Unique and unambiguous identifier for a payment execution, as assigned by the clearing agent or the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text endToEndIdentification;
	/**
	 * Unique and unambiguous identifier for a payment as assigned by the
	 * originator. The payment transaction reference is used for reconciliation
	 * or to link tasks relating to the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#mmEndToEndIdentification
	 * LongPaymentIdentification1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch2#mmTransactionReference
	 * PaymentSearch2.mmTransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmTransactionReference
	 * PaymentSearch3.mmTransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmMessageIdentification
	 * PaymentSearch4.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmEndToEndIdentification
	 * PaymentSearch4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification1#mmEndToEndIdentification
	 * PaymentIdentification1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails6#mmTransactionReference
	 * PaymentDetails6.mmTransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmMessageIdentification
	 * PaymentInstruction1.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmEndToEndIdentification
	 * PaymentInstruction1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#mmEndToEndIdentification
	 * TransactionReferences1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#mmEndToEndIdentification
	 * TransactionReferences2.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmEndToEndIdentification
	 * TransactionReferences3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation3.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation30.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#mmOriginalEndToEndIdentification
	 * PaymentTransaction37.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#mmOriginalEndToEndIdentification
	 * PaymentTransaction47.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation4.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation28.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#mmOriginalEndToEndIdentification
	 * PaymentTransaction35.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#mmOriginalEndToEndIdentification
	 * PaymentTransaction42.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation1.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation25.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#mmOriginalEndToEndIdentification
	 * PaymentTransaction32.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#mmOriginalEndToEndIdentification
	 * PaymentTransaction46.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification2#mmEndToEndIdentification
	 * PaymentIdentification2.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#mmEndToEndIdentification
	 * PaymentIdentification3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation31.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalEndToEndIdentification
	 * PaymentTransaction38.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalEndToEndIdentification
	 * PaymentTransaction48.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation5.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation29.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmOriginalEndToEndIdentification
	 * PaymentTransaction36.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalEndToEndIdentification
	 * PaymentTransaction45.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation26.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmOriginalEndToEndIdentification
	 * PaymentTransaction33.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmOriginalEndToEndIdentification
	 * PaymentTransaction43.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation2.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation27.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmOriginalEndToEndIdentification
	 * PaymentTransaction34.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmOriginalEndToEndIdentification
	 * PaymentTransaction44.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation34.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#mmOriginalEndToEndIdentification
	 * PaymentTransaction41.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#mmOriginalEndToEndIdentification
	 * PaymentTransaction49.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#mmEndToEndIdentification
	 * PaymentIdentification4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry2#mmEndToEndIdentification
	 * NotificationEntry2.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#mmEndToEndIdentification
	 * NotificationItem3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem1#mmOriginalEndToEndIdentification
	 * OriginalItem1.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus1#mmOriginalEndToEndIdentification
	 * OriginalItemAndStatus1.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus2#mmOriginalEndToEndIdentification
	 * OriginalItemAndStatus2.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction1.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentTransaction1.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmEndToEndIdentification
	 * RequestedModification2.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmTransactionIdentification
	 * RequestedModification2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmEndToEndIdentification
	 * PaymentComplementaryInformation2.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation32.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation33.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#mmEndToEndIdentification
	 * CorrectivePaymentInitiation1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmEndToEndIdentification
	 * CorrectiveInterbankTransaction1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPaymentReference
	 * TradeSettlement1.mmPaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#mmTransactionIdentification
	 * ReportSpecification3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction2.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentTransaction2.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmEndToEndIdentification
	 * PaymentComplementaryInformation3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#mmOriginalEndToEndIdentification
	 * PaymentTransaction39.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalEndToEndIdentification
	 * PaymentTransaction40.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmEndToEndIdentification
	 * RequestedModification3.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmTransactionIdentification
	 * RequestedModification3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#mmEndToEndIdentification
	 * NotificationItem4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem3#mmOriginalEndToEndIdentification
	 * OriginalItem3.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmOriginalEndToEndIdentification
	 * OriginalItemAndStatus3.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3#mmPaymentReference
	 * ExpectedExecutionDetails3.mmPaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmPaymentReference
	 * RedemptionExecution10.mmPaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder9#mmPaymentReference
	 * RedemptionOrder9.mmPaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmPaymentReference
	 * SubscriptionExecution7.mmPaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder9#mmPaymentReference
	 * SubscriptionOrder9.mmPaymentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation13.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation18.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation15.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation22.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation12.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation19.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation14.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation20.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation16.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation23.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation17.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation24.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmOriginalEndToEndIdentification
	 * PaymentTransactionInformation21.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmMessageIdentification
	 * PaymentSearch5.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmEndToEndIdentification
	 * PaymentSearch5.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmMessageIdentification
	 * PaymentInstruction14.mmMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmEndToEndIdentification
	 * PaymentInstruction14.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmEndToEndIdentification
	 * TransactionReferences4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmEndToEndIdentification
	 * PaymentComplementaryInformation4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmOriginalEndToEndIdentification
	 * PaymentTransaction50.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmOriginalEndToEndIdentification
	 * PaymentTransaction52.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalEndToEndIdentification
	 * PaymentTransaction51.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem4#mmOriginalEndToEndIdentification
	 * OriginalItem4.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmEndToEndIdentification
	 * RequestedModification4.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmTransactionIdentification
	 * RequestedModification4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#mmOriginalEndToEndIdentification
	 * PaymentTransaction58.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#mmOriginalEndToEndIdentification
	 * PaymentTransaction54.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmOriginalEndToEndIdentification
	 * OriginalItemAndStatus4.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalEndToEndIdentification
	 * PaymentTransaction53.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#mmOriginalEndToEndIdentification
	 * PaymentTransaction57.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#mmOriginalEndToEndIdentification
	 * PaymentTransaction56.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalEndToEndIdentification
	 * PaymentTransaction55.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#mmEndToEndIdentification
	 * NotificationItem5.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#mmOriginalEndToEndIdentification
	 * PaymentTransaction59.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#mmEndToEndIdentification
	 * CertificateIdentification1.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmEndToEndIdentification
	 * RequestedModification5.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmTransactionIdentification
	 * RequestedModification5.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmOriginalEndToEndIdentification
	 * PaymentTransaction65.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmEndToEndIdentification
	 * PaymentComplementaryInformation5.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmOriginalEndToEndIdentification
	 * PaymentTransaction63.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalEndToEndIdentification
	 * PaymentTransaction60.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#mmOriginalEndToEndIdentification
	 * PaymentTransaction68.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#mmOriginalEndToEndIdentification
	 * PaymentTransaction61.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem5#mmOriginalEndToEndIdentification
	 * OriginalItem5.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmOriginalEndToEndIdentification
	 * OriginalItemAndStatus5.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalEndToEndIdentification
	 * PaymentTransaction66.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalEndToEndIdentification
	 * PaymentTransaction67.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalEndToEndIdentification
	 * PaymentTransaction62.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#mmOriginalEndToEndIdentification
	 * PaymentTransaction64.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmEndToEndIdentification
	 * NotificationItem6.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#mmOriginalEndToEndIdentification
	 * PaymentTransaction69.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmOriginalEndToEndIdentification
	 * PaymentTransaction73.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmOriginalEndToEndIdentification
	 * PaymentTransaction80.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalEndToEndIdentification
	 * PaymentTransaction81.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmEndToEndIdentification
	 * RequestedModification6.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmTransactionIdentification
	 * RequestedModification6.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalEndToEndIdentification
	 * PaymentTransaction76.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalEndToEndIdentification
	 * PaymentTransaction78.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#mmOriginalEndToEndIdentification
	 * PaymentTransaction74.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmOriginalEndToEndIdentification
	 * PaymentTransaction83.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#mmOriginalEndToEndIdentification
	 * PaymentTransaction77.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#mmEndToEndIdentification
	 * CorrectivePaymentInitiation2.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentInstruction3.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalEndToEndIdentification
	 * PaymentTransaction75.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmOriginalEndToEndIdentification
	 * PaymentTransaction82.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalEndToEndIdentification
	 * PaymentTransaction79.mmOriginalEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmEndToEndIdentification
	 * PaymentComplementaryInformation6.mmEndToEndIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEndToEndIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LongPaymentIdentification1.mmEndToEndIdentification, com.tools20022.repository.msg.PaymentSearch2.mmTransactionReference,
					com.tools20022.repository.msg.PaymentSearch3.mmTransactionReference, com.tools20022.repository.msg.PaymentSearch4.mmMessageIdentification, com.tools20022.repository.msg.PaymentSearch4.mmEndToEndIdentification,
					com.tools20022.repository.msg.PaymentIdentification1.mmEndToEndIdentification, com.tools20022.repository.msg.PaymentDetails6.mmTransactionReference,
					com.tools20022.repository.msg.PaymentInstruction1.mmMessageIdentification, com.tools20022.repository.msg.PaymentInstruction1.mmEndToEndIdentification,
					com.tools20022.repository.msg.TransactionReferences1.mmEndToEndIdentification, com.tools20022.repository.msg.TransactionReferences2.mmEndToEndIdentification,
					com.tools20022.repository.msg.TransactionReferences3.mmEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation3.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation30.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction37.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction47.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation4.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation28.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction35.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction42.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation1.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation25.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction32.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction46.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentIdentification2.mmEndToEndIdentification,
					com.tools20022.repository.msg.PaymentIdentification3.mmEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation31.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction38.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction48.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation5.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation29.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction36.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction45.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation26.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction33.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction43.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation2.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation27.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction34.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction44.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation34.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction41.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction49.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentIdentification4.mmEndToEndIdentification, com.tools20022.repository.msg.NotificationEntry2.mmEndToEndIdentification,
					com.tools20022.repository.msg.NotificationItem3.mmEndToEndIdentification, com.tools20022.repository.msg.OriginalItem1.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.OriginalItemAndStatus1.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.OriginalItemAndStatus2.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction1.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.UnderlyingPaymentTransaction1.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.RequestedModification2.mmEndToEndIdentification, com.tools20022.repository.msg.RequestedModification2.mmTransactionIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation2.mmEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation32.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation33.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.CorrectivePaymentInitiation1.mmEndToEndIdentification,
					com.tools20022.repository.msg.CorrectiveInterbankTransaction1.mmEndToEndIdentification, com.tools20022.repository.msg.TradeSettlement1.mmPaymentReference,
					com.tools20022.repository.msg.ReportSpecification3.mmTransactionIdentification, com.tools20022.repository.msg.UnderlyingPaymentInstruction2.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation3.mmEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction39.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction40.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.RequestedModification3.mmEndToEndIdentification, com.tools20022.repository.msg.RequestedModification3.mmTransactionIdentification,
					com.tools20022.repository.msg.NotificationItem4.mmEndToEndIdentification, com.tools20022.repository.msg.OriginalItem3.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.OriginalItemAndStatus3.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.ExpectedExecutionDetails3.mmPaymentReference,
					com.tools20022.repository.msg.RedemptionExecution10.mmPaymentReference, com.tools20022.repository.msg.RedemptionOrder9.mmPaymentReference, com.tools20022.repository.msg.SubscriptionExecution7.mmPaymentReference,
					com.tools20022.repository.msg.SubscriptionOrder9.mmPaymentReference, com.tools20022.repository.msg.PaymentTransactionInformation13.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation18.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation15.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation22.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation12.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation19.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation14.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation20.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation16.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation23.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation17.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation24.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransactionInformation21.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentSearch5.mmMessageIdentification, com.tools20022.repository.msg.PaymentSearch5.mmEndToEndIdentification, com.tools20022.repository.msg.PaymentInstruction14.mmMessageIdentification,
					com.tools20022.repository.msg.PaymentInstruction14.mmEndToEndIdentification, com.tools20022.repository.msg.TransactionReferences4.mmEndToEndIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation4.mmEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction50.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction52.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction51.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.OriginalItem4.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.RequestedModification4.mmEndToEndIdentification,
					com.tools20022.repository.msg.RequestedModification4.mmTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction58.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction54.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.OriginalItemAndStatus4.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction53.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction57.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction56.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction55.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.NotificationItem5.mmEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction59.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.CertificateIdentification1.mmEndToEndIdentification, com.tools20022.repository.msg.RequestedModification5.mmEndToEndIdentification,
					com.tools20022.repository.msg.RequestedModification5.mmTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction65.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation5.mmEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction63.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction60.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction68.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction61.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.OriginalItem5.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.OriginalItemAndStatus5.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction66.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction67.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction62.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction64.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.NotificationItem6.mmEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction69.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction73.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction80.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction81.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.RequestedModification6.mmEndToEndIdentification, com.tools20022.repository.msg.RequestedModification6.mmTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction76.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction78.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction74.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction83.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction77.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.CorrectivePaymentInitiation2.mmEndToEndIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction3.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction75.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentTransaction82.mmOriginalEndToEndIdentification, com.tools20022.repository.msg.PaymentTransaction79.mmOriginalEndToEndIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.mmEndToEndIdentification);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique and unambiguous identifier for a payment as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text instructionIdentification;
	/**
	 * Unique identification assigned by an instructing party for an instructed
	 * party to unambiguously identify the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmPaymentInstructionReference
	 * PaymentInstructionReference1Details.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmPaymentInstructionReference
	 * PaymentInstructionReference2Details.mmPaymentInstructionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification1#mmInstructionIdentification
	 * PaymentIdentification1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#mmInstructionIdentification
	 * TransactionReferences1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#mmInstructionIdentification
	 * TransactionReferences2.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmInstructionIdentification
	 * TransactionReferences3.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation3.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation30#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation30.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction37#mmOriginalInstructionIdentification
	 * PaymentTransaction37.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction47#mmOriginalInstructionIdentification
	 * PaymentTransaction47.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation4#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation4.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation28#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation28.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation2#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInformation2.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction35#mmOriginalInstructionIdentification
	 * PaymentTransaction35.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction2#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction2.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction42#mmOriginalInstructionIdentification
	 * PaymentTransaction42.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction7#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction7.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation1.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation25.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#mmOriginalInstructionIdentification
	 * PaymentTransaction32.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#mmOriginalInstructionIdentification
	 * PaymentTransaction46.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification2#mmInstructionIdentification
	 * PaymentIdentification2.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#mmInstructionIdentification
	 * PaymentIdentification3.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation31.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalInstructionIdentification
	 * PaymentTransaction38.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalInstructionIdentification
	 * PaymentTransaction48.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation5.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation29.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmOriginalInstructionIdentification
	 * PaymentTransaction36.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalInstructionIdentification
	 * PaymentTransaction45.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation26.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmOriginalInstructionIdentification
	 * PaymentTransaction33.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmOriginalInstructionIdentification
	 * PaymentTransaction43.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation2.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation27.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmOriginalInstructionIdentification
	 * PaymentTransaction34.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmOriginalInstructionIdentification
	 * PaymentTransaction44.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation34.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#mmOriginalInstructionIdentification
	 * PaymentTransaction41.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#mmOriginalInstructionIdentification
	 * PaymentTransaction49.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInstructionExtract#mmInstructionIdentification
	 * CorrectivePaymentInstructionExtract.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#mmInstructionIdentification
	 * PaymentIdentification4.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction1#mmOriginalInstructionIdentification
	 * UnderlyingPaymentInstruction1.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#mmOriginalInstructionIdentification
	 * UnderlyingPaymentTransaction1.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmInstructionIdentification
	 * PaymentComplementaryInformation2.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation32#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation32.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation33.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation1#mmInstructionIdentification
	 * CorrectivePaymentInitiation1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmInstructionIdentification
	 * CorrectiveInterbankTransaction1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction2#mmOriginalInstructionIdentification
	 * UnderlyingPaymentInstruction2.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalInstructionIdentification
	 * UnderlyingPaymentTransaction2.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmInstructionIdentification
	 * PaymentComplementaryInformation3.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction39#mmOriginalInstructionIdentification
	 * PaymentTransaction39.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalInstructionIdentification
	 * PaymentTransaction40.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation13.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation18.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation15.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation22.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation12.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation19.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation14.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation20.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation16.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation23.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation17.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation24.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmOriginalInstructionIdentification
	 * PaymentTransactionInformation21.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmInstructionIdentification
	 * TransactionReferences4.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmInstructionIdentification
	 * PaymentComplementaryInformation4.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmOriginalInstructionIdentification
	 * PaymentTransaction50.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction11.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmOriginalInstructionIdentification
	 * PaymentTransaction52.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalInstructionIdentification
	 * PaymentTransaction51.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction58#mmOriginalInstructionIdentification
	 * PaymentTransaction58.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction54#mmOriginalInstructionIdentification
	 * PaymentTransaction54.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalInstructionIdentification
	 * PaymentTransaction53.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#mmOriginalInstructionIdentification
	 * PaymentTransaction57.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction56#mmOriginalInstructionIdentification
	 * PaymentTransaction56.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalInstructionIdentification
	 * PaymentTransaction55.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#mmOriginalInstructionIdentification
	 * PaymentTransaction59.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#mmInstructionIdentification
	 * CertificateIdentification1.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction16.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmOriginalInstructionIdentification
	 * PaymentTransaction65.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmInstructionIdentification
	 * PaymentComplementaryInformation5.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmOriginalInstructionIdentification
	 * PaymentTransaction63.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalInstructionIdentification
	 * PaymentTransaction60.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#mmOriginalInstructionIdentification
	 * PaymentTransaction68.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction61#mmOriginalInstructionIdentification
	 * PaymentTransaction61.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction66#mmOriginalInstructionIdentification
	 * PaymentTransaction66.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalInstructionIdentification
	 * PaymentTransaction67.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalInstructionIdentification
	 * PaymentTransaction62.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction64#mmOriginalInstructionIdentification
	 * PaymentTransaction64.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#mmOriginalInstructionIdentification
	 * PaymentTransaction69.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmOriginalInstructionIdentification
	 * PaymentTransaction73.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmOriginalInstructionIdentification
	 * PaymentTransaction80.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalInstructionIdentification
	 * PaymentTransaction81.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction21.mmReversalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalInstructionIdentification
	 * PaymentTransaction76.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction78#mmOriginalInstructionIdentification
	 * PaymentTransaction78.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction74#mmOriginalInstructionIdentification
	 * PaymentTransaction74.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmOriginalInstructionIdentification
	 * PaymentTransaction83.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction77#mmOriginalInstructionIdentification
	 * PaymentTransaction77.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#mmInstructionIdentification
	 * CorrectivePaymentInitiation2.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentInstruction3#mmOriginalInstructionIdentification
	 * UnderlyingPaymentInstruction3.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalInstructionIdentification
	 * PaymentTransaction75.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmOriginalInstructionIdentification
	 * PaymentTransaction82.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalInstructionIdentification
	 * PaymentTransaction79.mmOriginalInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmInstructionIdentification
	 * PaymentComplementaryInformation6.mmInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by an instructing party for an instructed party to unambiguously identify the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInstructionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReference1Details.mmPaymentInstructionReference,
					com.tools20022.repository.msg.PaymentInstructionReference2Details.mmPaymentInstructionReference, com.tools20022.repository.msg.PaymentIdentification1.mmInstructionIdentification,
					com.tools20022.repository.msg.TransactionReferences1.mmInstructionIdentification, com.tools20022.repository.msg.TransactionReferences2.mmInstructionIdentification,
					com.tools20022.repository.msg.TransactionReferences3.mmInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation3.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation30.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction37.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction47.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation4.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation28.mmOriginalInstructionIdentification, com.tools20022.repository.msg.OriginalPaymentInformation2.mmReversalPaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentTransaction35.mmOriginalInstructionIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction2.mmReversalPaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentTransaction42.mmOriginalInstructionIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction7.mmReversalPaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation1.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation25.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction32.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction46.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentIdentification2.mmInstructionIdentification, com.tools20022.repository.msg.PaymentIdentification3.mmInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation31.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction38.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction48.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation5.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation29.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction36.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction45.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation26.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction33.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction43.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation2.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation27.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction34.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction44.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation34.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction41.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction49.mmOriginalInstructionIdentification, com.tools20022.repository.msg.CorrectivePaymentInstructionExtract.mmInstructionIdentification,
					com.tools20022.repository.msg.PaymentIdentification4.mmInstructionIdentification, com.tools20022.repository.msg.UnderlyingPaymentInstruction1.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentTransaction1.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation2.mmInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation32.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation33.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.CorrectivePaymentInitiation1.mmInstructionIdentification, com.tools20022.repository.msg.CorrectiveInterbankTransaction1.mmInstructionIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction2.mmOriginalInstructionIdentification, com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation3.mmInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction39.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction40.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation13.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation18.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation15.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation22.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation12.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation19.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation14.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation20.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation16.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation23.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation17.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation24.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation21.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.TransactionReferences4.mmInstructionIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation4.mmInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction50.mmOriginalInstructionIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction11.mmReversalPaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentTransaction52.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction51.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction58.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction54.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction53.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction57.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction56.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction55.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction59.mmOriginalInstructionIdentification, com.tools20022.repository.msg.CertificateIdentification1.mmInstructionIdentification,
					com.tools20022.repository.msg.OriginalPaymentInstruction16.mmReversalPaymentInformationIdentification, com.tools20022.repository.msg.PaymentTransaction65.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation5.mmInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction63.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction60.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction68.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction61.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction66.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction67.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction62.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction64.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction69.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction73.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction80.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction81.mmOriginalInstructionIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction21.mmReversalPaymentInformationIdentification,
					com.tools20022.repository.msg.PaymentTransaction76.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction78.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction74.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction83.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction77.mmOriginalInstructionIdentification, com.tools20022.repository.msg.CorrectivePaymentInitiation2.mmInstructionIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentInstruction3.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction75.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentTransaction82.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentTransaction79.mmOriginalInstructionIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.mmInstructionIdentification);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionIdentification";
			definition = "Unique identification assigned by an instructing party for an instructed party to unambiguously identify the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text transactionIdentification;
	/**
	 * Unique identification assigned by the first instructing agent to
	 * unambiguously identify the transaction and passed on, unchanged,
	 * throughout the entire interbank chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1#mmTransactionIdentification
	 * LongPaymentIdentification1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice#mmTransactionIdentification
	 * PaymentIdentification4Choice.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmTransactionReference
	 * PaymentDetails5.mmTransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails7#mmTransactionReference
	 * PaymentDetails7.mmTransactionReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmTransactionIdentification
	 * PaymentInstruction1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#mmTransactionIdentification
	 * TransactionReferences1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#mmTransactionIdentification
	 * TransactionReferences2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmTransactionIdentification
	 * TransactionReferences3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation3.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation1.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification2#mmTransactionIdentification
	 * PaymentIdentification2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#mmTransactionIdentification
	 * PaymentIdentification3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation31.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalTransactionIdentification
	 * PaymentTransaction38.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalTransactionIdentification
	 * PaymentTransaction48.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation5.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation29.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmOriginalTransactionIdentification
	 * PaymentTransaction36.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalTransactionIdentification
	 * PaymentTransaction45.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation26.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmOriginalTransactionIdentification
	 * PaymentTransaction33.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmOriginalTransactionIdentification
	 * PaymentTransaction43.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation2.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation27.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmOriginalTransactionIdentification
	 * PaymentTransaction34.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmOriginalTransactionIdentification
	 * PaymentTransaction44.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#mmTransactionIdentification
	 * PaymentIdentification4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction1#mmOriginalTransactionIdentification
	 * UnderlyingPaymentTransaction1.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmTransactionIdentification
	 * PaymentComplementaryInformation2.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation33.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectiveInterbankTransaction1#mmTransactionIdentification
	 * CorrectiveInterbankTransaction1.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalTransactionIdentification
	 * UnderlyingPaymentTransaction2.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmTransactionIdentification
	 * PaymentComplementaryInformation3.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalTransactionIdentification
	 * PaymentTransaction40.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation13#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation13.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation18#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation18.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation15#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation15.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation22#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation22.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation12#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation12.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation19#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation19.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation14#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation14.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation20#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation20.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation16.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation23.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation17.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation24.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmOriginalTransactionIdentification
	 * PaymentTransactionInformation21.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmTransactionIdentification
	 * PaymentInstruction14.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmTransactionIdentification
	 * TransactionReferences4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmTransactionIdentification
	 * PaymentComplementaryInformation4.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmOriginalTransactionIdentification
	 * PaymentTransaction50.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmOriginalTransactionIdentification
	 * PaymentTransaction52.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalTransactionIdentification
	 * PaymentTransaction51.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalTransactionIdentification
	 * PaymentTransaction53.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalTransactionIdentification
	 * PaymentTransaction55.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RelatedReference1#mmTransactionUniqueIdentifier
	 * RelatedReference1.mmTransactionUniqueIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RelatedReference1#mmMessageReference
	 * RelatedReference1.mmMessageReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmOriginalTransactionIdentification
	 * PaymentTransaction65.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmTransactionIdentification
	 * PaymentComplementaryInformation5.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmOriginalTransactionIdentification
	 * PaymentTransaction63.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalTransactionIdentification
	 * PaymentTransaction60.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalTransactionIdentification
	 * PaymentTransaction67.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalTransactionIdentification
	 * PaymentTransaction62.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmOriginalTransactionIdentification
	 * PaymentTransaction73.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmOriginalTransactionIdentification
	 * PaymentTransaction80.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalTransactionIdentification
	 * PaymentTransaction81.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalTransactionIdentification
	 * PaymentTransaction76.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalTransactionIdentification
	 * PaymentTransaction75.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalTransactionIdentification
	 * PaymentTransaction79.mmOriginalTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmTransactionIdentification
	 * PaymentComplementaryInformation6.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the first instructing agent to unambiguously identify the transaction and passed on, unchanged, throughout the entire interbank chain. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LongPaymentIdentification1.mmTransactionIdentification, com.tools20022.repository.choice.PaymentIdentification4Choice.mmTransactionIdentification,
					com.tools20022.repository.msg.PaymentDetails5.mmTransactionReference, com.tools20022.repository.msg.PaymentDetails7.mmTransactionReference, com.tools20022.repository.msg.PaymentInstruction1.mmTransactionIdentification,
					com.tools20022.repository.msg.TransactionReferences1.mmTransactionIdentification, com.tools20022.repository.msg.TransactionReferences2.mmTransactionIdentification,
					com.tools20022.repository.msg.TransactionReferences3.mmTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation3.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation1.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentIdentification2.mmTransactionIdentification,
					com.tools20022.repository.msg.PaymentIdentification3.mmTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation31.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction38.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction48.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation5.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation29.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction36.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction45.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation26.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction33.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction43.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation2.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation27.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction34.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction44.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentIdentification4.mmTransactionIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentTransaction1.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation2.mmTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation33.mmOriginalTransactionIdentification, com.tools20022.repository.msg.CorrectiveInterbankTransaction1.mmTransactionIdentification,
					com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation3.mmTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction40.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation13.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation18.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation15.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation22.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation12.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation19.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation14.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation20.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation16.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation23.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation17.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransactionInformation24.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransactionInformation21.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentInstruction14.mmTransactionIdentification, com.tools20022.repository.msg.TransactionReferences4.mmTransactionIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation4.mmTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction50.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction52.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction51.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction53.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction55.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.RelatedReference1.mmTransactionUniqueIdentifier, com.tools20022.repository.msg.RelatedReference1.mmMessageReference,
					com.tools20022.repository.msg.PaymentTransaction65.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentComplementaryInformation5.mmTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction63.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction60.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction67.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction62.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction73.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction80.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction81.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction76.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentTransaction75.mmOriginalTransactionIdentification, com.tools20022.repository.msg.PaymentTransaction79.mmOriginalTransactionIdentification,
					com.tools20022.repository.msg.PaymentComplementaryInformation6.mmTransactionIdentification);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the first instructing agent to unambiguously identify the transaction and passed on, unchanged, throughout the entire interbank chain. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clearingSystemReference;
	/**
	 * Unique and unambiguous identifier for a payment instruction, as assigned
	 * by the clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences1#mmClearingSystemReference
	 * TransactionReferences1.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences2#mmClearingSystemReference
	 * TransactionReferences2.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmClearingSystemReference
	 * TransactionReferences3.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation25#mmClearingSystemReference
	 * PaymentTransactionInformation25.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction32#mmClearingSystemReference
	 * PaymentTransaction32.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction46#mmClearingSystemReference
	 * PaymentTransaction46.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification3#mmClearingSystemReference
	 * PaymentIdentification3.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation31#mmOriginalClearingSystemReference
	 * PaymentTransactionInformation31.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction38#mmOriginalClearingSystemReference
	 * PaymentTransaction38.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction48#mmOriginalClearingSystemReference
	 * PaymentTransaction48.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmOriginalClearingSystemReference
	 * PaymentTransactionInformation29.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmOriginalClearingSystemReference
	 * PaymentTransaction36.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmOriginalClearingSystemReference
	 * PaymentTransaction45.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation26#mmClearingSystemReference
	 * PaymentTransactionInformation26.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction33#mmClearingSystemReference
	 * PaymentTransaction33.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction43#mmClearingSystemReference
	 * PaymentTransaction43.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmOriginalClearingSystemReference
	 * PaymentTransactionInformation27.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmOriginalClearingSystemReference
	 * PaymentTransaction34.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmOriginalClearingSystemReference
	 * PaymentTransaction44.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation34#mmClearingSystemReference
	 * PaymentTransactionInformation34.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction41#mmClearingSystemReference
	 * PaymentTransaction41.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction49#mmClearingSystemReference
	 * PaymentTransaction49.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentIdentification4#mmClearingSystemReference
	 * PaymentIdentification4.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation33#mmOriginalClearingSystemReference
	 * PaymentTransactionInformation33.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction40#mmOriginalClearingSystemReference
	 * PaymentTransaction40.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmOriginalClearingSystemReference
	 * PaymentTransaction50.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction52#mmClearingSystemReference
	 * PaymentTransaction52.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmOriginalClearingSystemReference
	 * PaymentTransaction51.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction53#mmOriginalClearingSystemReference
	 * PaymentTransaction53.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction57#mmClearingSystemReference
	 * PaymentTransaction57.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction55#mmOriginalClearingSystemReference
	 * PaymentTransaction55.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction59#mmClearingSystemReference
	 * PaymentTransaction59.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmOriginalClearingSystemReference
	 * PaymentTransaction65.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63#mmClearingSystemReference
	 * PaymentTransaction63.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmOriginalClearingSystemReference
	 * PaymentTransaction60.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction68#mmClearingSystemReference
	 * PaymentTransaction68.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction67#mmOriginalClearingSystemReference
	 * PaymentTransaction67.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction62#mmOriginalClearingSystemReference
	 * PaymentTransaction62.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction69#mmClearingSystemReference
	 * PaymentTransaction69.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction73#mmClearingSystemReference
	 * PaymentTransaction73.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction80#mmClearingSystemReference
	 * PaymentTransaction80.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmOriginalClearingSystemReference
	 * PaymentTransaction81.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmOriginalClearingSystemReference
	 * PaymentTransaction76.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction83#mmClearingSystemReference
	 * PaymentTransaction83.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction75#mmOriginalClearingSystemReference
	 * PaymentTransaction75.mmOriginalClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction82#mmClearingSystemReference
	 * PaymentTransaction82.mmClearingSystemReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction79#mmOriginalClearingSystemReference
	 * PaymentTransaction79.mmOriginalClearingSystemReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClearingSystemReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionReferences1.mmClearingSystemReference, com.tools20022.repository.msg.TransactionReferences2.mmClearingSystemReference,
					com.tools20022.repository.msg.TransactionReferences3.mmClearingSystemReference, com.tools20022.repository.msg.PaymentTransactionInformation25.mmClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction32.mmClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction46.mmClearingSystemReference,
					com.tools20022.repository.msg.PaymentIdentification3.mmClearingSystemReference, com.tools20022.repository.msg.PaymentTransactionInformation31.mmOriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction38.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction48.mmOriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransactionInformation29.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction36.mmOriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction45.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransactionInformation26.mmClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction33.mmClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction43.mmClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransactionInformation27.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction34.mmOriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction44.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransactionInformation34.mmClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction41.mmClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction49.mmClearingSystemReference,
					com.tools20022.repository.msg.PaymentIdentification4.mmClearingSystemReference, com.tools20022.repository.msg.PaymentTransactionInformation33.mmOriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction40.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction50.mmOriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction52.mmClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction51.mmOriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction53.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction57.mmClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction55.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction59.mmClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction65.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction63.mmClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction60.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction68.mmClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction67.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction62.mmOriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction69.mmClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction73.mmClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction80.mmClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction81.mmOriginalClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction76.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction83.mmClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction75.mmOriginalClearingSystemReference, com.tools20022.repository.msg.PaymentTransaction82.mmClearingSystemReference,
					com.tools20022.repository.msg.PaymentTransaction79.mmOriginalClearingSystemReference);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text creditorReference;
	/**
	 * Unique and unambiguous reference assigned by the creditor to refer to the
	 * payment obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation1#mmCreditorReference
	 * CreditorReferenceInformation1.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation6.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2#mmReference
	 * CreditorReferenceInformation2.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation7.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation9.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation8.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer3#mmReference
	 * CreditTransfer3.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer4#mmReference
	 * CreditTransfer4.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer6#mmReference
	 * CreditTransfer6.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmCreditorReference
	 * StructuredRemittanceInformation2.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmCreditorReference
	 * TradeSettlement1.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation10.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation12.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation13.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmReference
	 * CreditTransfer8.mmReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous reference assigned by the creditor to refer to the payment obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditorReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditorReferenceInformation1.mmCreditorReference, com.tools20022.repository.msg.StructuredRemittanceInformation6.mmCreditorReferenceInformation,
					com.tools20022.repository.msg.CreditorReferenceInformation2.mmReference, com.tools20022.repository.msg.StructuredRemittanceInformation7.mmCreditorReferenceInformation,
					com.tools20022.repository.msg.StructuredRemittanceInformation9.mmCreditorReferenceInformation, com.tools20022.repository.msg.StructuredRemittanceInformation8.mmCreditorReferenceInformation,
					com.tools20022.repository.msg.CreditTransfer3.mmReference, com.tools20022.repository.msg.CreditTransfer4.mmReference, com.tools20022.repository.msg.CreditTransfer6.mmReference,
					com.tools20022.repository.msg.StructuredRemittanceInformation2.mmCreditorReference, com.tools20022.repository.msg.TradeSettlement1.mmCreditorReference,
					com.tools20022.repository.msg.StructuredRemittanceInformation10.mmCreditorReferenceInformation, com.tools20022.repository.msg.StructuredRemittanceInformation12.mmCreditorReferenceInformation,
					com.tools20022.repository.msg.StructuredRemittanceInformation13.mmCreditorReferenceInformation, com.tools20022.repository.msg.CreditTransfer8.mmReference);
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditorReference";
			definition = "Unique and unambiguous reference assigned by the creditor to refer to the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Payment payment;
	/**
	 * Payment for which identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
	 * Payment.mmPaymentRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification
	 * PaymentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which identifications are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PaymentIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which identifications are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmPaymentRelatedIdentifications;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentIdentification";
				definition = "Specifies the different identifications associated with a payment transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.mmPaymentRelatedIdentifications);
				superType_lazy = () -> TradeIdentification.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentIdentification.mmExecutionIdentification, com.tools20022.repository.entity.PaymentIdentification.mmEndToEndIdentification,
						com.tools20022.repository.entity.PaymentIdentification.mmInstructionIdentification, com.tools20022.repository.entity.PaymentIdentification.mmTransactionIdentification,
						com.tools20022.repository.entity.PaymentIdentification.mmClearingSystemReference, com.tools20022.repository.entity.PaymentIdentification.mmCreditorReference,
						com.tools20022.repository.entity.PaymentIdentification.mmPayment);
				derivationComponent_lazy = () -> Arrays.asList(PaymentIdentificationChoice.mmObject(), PaymentIdentification2Choice.mmObject(), PaymentIdentification3Choice.mmObject(), PaymentIdentification4Choice.mmObject(),
						PaymentIdentification1.mmObject(), CreditorReferenceInformation1.mmObject(), CreditorReferenceInformation2.mmObject(), PaymentIdentification2.mmObject(), PaymentIdentification3.mmObject(),
						PaymentIdentification4.mmObject(), TransactionReferences4.mmObject(), CertificateIdentification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getExecutionIdentification() {
		return executionIdentification;
	}

	public void setExecutionIdentification(Max35Text executionIdentification) {
		this.executionIdentification = executionIdentification;
	}

	public Max35Text getEndToEndIdentification() {
		return endToEndIdentification;
	}

	public void setEndToEndIdentification(Max35Text endToEndIdentification) {
		this.endToEndIdentification = endToEndIdentification;
	}

	public Max35Text getInstructionIdentification() {
		return instructionIdentification;
	}

	public void setInstructionIdentification(Max35Text instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public Max35Text getClearingSystemReference() {
		return clearingSystemReference;
	}

	public void setClearingSystemReference(Max35Text clearingSystemReference) {
		this.clearingSystemReference = clearingSystemReference;
	}

	public Max35Text getCreditorReference() {
		return creditorReference;
	}

	public void setCreditorReference(Max35Text creditorReference) {
		this.creditorReference = creditorReference;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = payment;
	}
}
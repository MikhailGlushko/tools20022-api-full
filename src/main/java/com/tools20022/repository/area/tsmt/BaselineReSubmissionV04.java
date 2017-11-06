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

package com.tools20022.repository.area.tsmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.TradeServicesManagementPreviousVersion;
import com.tools20022.repository.choice.BankContactPerson1Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * The BaselineReSubmission message is sent by either the counterparty or the
 * initiator of a transaction (baseline) to the matching application.<br>
 * This message is used by the counterparty to respond on the registration of a
 * push-through transaction in the matching application or by the initiator or
 * counterparty to re-send earlier mis-matched baseline information.<br>
 * <b>Usage</b><br>
 * The BaselineReSubmission message can be sent by the counterparty of a
 * transaction to the matching application in response to a
 * FullPushThroughReport message received from the matching application
 * conveying the details of an InitialBaselineSubmission message. The objective
 * of the BaselineReSubmission message sent in the outlined scenario is to
 * achieve a successful match of two baseline initiation messages in order to
 * establish a transaction in the matching application.<br>
 * or<br>
 * The BaselineReSubmission message can be sent by the initiator of a
 * transaction to the matching application in response to a BaselineMatchReport
 * message indicating mis-matches. The objective of the BaselineReSubmission
 * message sent in the outlined scenario is to correct an
 * InitialBaselineSubmission or BaselineReSubmission message submitted earlier
 * in order to achieve the establishment of a transaction in the matching
 * application.<br>
 * or<br>
 * The BaselineReSubmission message can be sent by the counterparty of a
 * transaction to the matching application in response to a BaselineMatchReport
 * message indicating mis-matches. The objective of the BaselineReSubmission
 * message sent in the outlined scenario is to correct a BaselineReSubmission
 * message submitted earlier in order to achieve the establishment of a
 * transaction in the matching application.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementPreviousVersion
 * TradeServicesManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion
 * TradeServicesManagementISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BaselnReSubmissn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmSubmissionIdentification
 * BaselineReSubmissionV04.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmTransactionIdentification
 * BaselineReSubmissionV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmSubmitterTransactionReference
 * BaselineReSubmissionV04.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmBaseline
 * BaselineReSubmissionV04.mmBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmBuyerContactPerson
 * BaselineReSubmissionV04.mmBuyerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmSellerContactPerson
 * BaselineReSubmissionV04.mmSellerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmBankContactPerson
 * BaselineReSubmissionV04.mmBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmOtherBankContactPerson
 * BaselineReSubmissionV04.mmOtherBankContactPerson}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.012.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BaselineReSubmissionV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe BaselineReSubmission message is sent by either the counterparty or the initiator of a transaction (baseline) to the matching application.\r\nThis message is used by the counterparty to respond on the registration of a push-through transaction in the matching application or by the initiator or counterparty to re-send earlier mis-matched baseline information.\r\nUsage\r\nThe BaselineReSubmission message can be sent by the counterparty of a transaction to the matching application in response to a FullPushThroughReport message received from the matching application conveying the details of an InitialBaselineSubmission message. The objective of the BaselineReSubmission message sent in the outlined scenario is to achieve a successful match of two baseline initiation messages in order to establish a transaction in the matching application.\r\nor\r\nThe BaselineReSubmission message can be sent by the initiator of a transaction to the matching application in response to a BaselineMatchReport message indicating mis-matches. The objective of the BaselineReSubmission message sent in the outlined scenario is to correct an InitialBaselineSubmission or BaselineReSubmission message submitted earlier in order to achieve the establishment of a transaction in the matching application.\r\nor\r\nThe BaselineReSubmission message can be sent by the counterparty of a transaction to the matching application in response to a BaselineMatchReport message indicating mis-matches. The objective of the BaselineReSubmission message sent in the outlined scenario is to correct a BaselineReSubmission message submitted earlier in order to achieve the establishment of a transaction in the matching application."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05
 * BaselineReSubmissionV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03
 * BaselineReSubmissionV03}</li>
 * </ul>
 */
public class BaselineReSubmissionV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 submissionIdentification;
	/**
	 * Identifies the submitted information
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmissnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the submitted information"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmSubmissionIdentification
	 * BaselineReSubmissionV05.mmSubmissionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmSubmissionIdentification
	 * BaselineReSubmissionV03.mmSubmissionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubmissionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubmissnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmissionIdentification";
			definition = "Identifies the submitted information";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReSubmissionV05.mmSubmissionIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmSubmissionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	protected SimpleIdentificationInformation transactionIdentification;
	/**
	 * Unique identification assigned by the matching application to the
	 * transaction. This identification is to be used in any communication
	 * between the parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
	 * SimpleIdentificationInformation}</li>
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
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmTransactionIdentification
	 * BaselineReSubmissionV05.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmTransactionIdentification
	 * BaselineReSubmissionV03.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReSubmissionV05.mmTransactionIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}
	};
	protected SimpleIdentificationInformation submitterTransactionReference;
	/**
	 * Reference to the transaction for the requesting financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
	 * SimpleIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitrTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitterTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction for the requesting financial institution."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmSubmitterTransactionReference
	 * BaselineReSubmissionV05.mmSubmitterTransactionReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmSubmitterTransactionReference
	 * BaselineReSubmissionV03.mmSubmitterTransactionReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubmitterTransactionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubmitrTxRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterTransactionReference";
			definition = "Reference to the transaction for the requesting financial institution.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReSubmissionV05.mmSubmitterTransactionReference);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmSubmitterTransactionReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}
	};
	protected Baseline4 baseline;
	/**
	 * Specifies the commercial details of the underlying transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Baseline4
	 * Baseline4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Baseln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Baseline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the commercial details of the underlying transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmBaseline
	 * BaselineReSubmissionV05.mmBaseline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmBaseline
	 * BaselineReSubmissionV03.mmBaseline}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBaseline = new MMMessageBuildingBlock() {
		{
			xmlTag = "Baseln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Baseline";
			definition = "Specifies the commercial details of the underlying transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReSubmissionV05.mmBaseline);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmBaseline;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Baseline4.mmObject();
		}
	};
	protected List<ContactIdentification1> buyerContactPerson;
	/**
	 * Person to be contacted in the organisation of the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the organisation of the buyer. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmBuyerContactPerson
	 * BaselineReSubmissionV05.mmBuyerContactPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmBuyerContactPerson
	 * BaselineReSubmissionV03.mmBuyerContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyerContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyrCtctPrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerContactPerson";
			definition = "Person to be contacted in the organisation of the buyer. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReSubmissionV05.mmBuyerContactPerson);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmBuyerContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}
	};
	protected List<ContactIdentification1> sellerContactPerson;
	/**
	 * Person to be contacted in the organisation of the seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person to be contacted in the organisation of the seller. "</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmSellerContactPerson
	 * BaselineReSubmissionV05.mmSellerContactPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmSellerContactPerson
	 * BaselineReSubmissionV03.mmSellerContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSellerContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "SellrCtctPrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerContactPerson";
			definition = "Person to be contacted in the organisation of the seller. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReSubmissionV05.mmSellerContactPerson);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmSellerContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}
	};
	protected BankContactPerson1Choice bankContactPerson;
	/**
	 * Person to be contacted in the seller's bank or buyer's bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BankContactPerson1Choice
	 * BankContactPerson1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person to be contacted in the seller's bank or buyer's bank."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmBankContactPerson
	 * BaselineReSubmissionV05.mmBankContactPerson}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "BkCtctPrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankContactPerson";
			definition = "Person to be contacted in the seller's bank or buyer's bank.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReSubmissionV05.mmBankContactPerson);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BankContactPerson1Choice.mmObject();
		}
	};
	protected List<ContactIdentification3> otherBankContactPerson;
	/**
	 * Person to be contacted in another bank than the seller or buyer's bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3
	 * ContactIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person to be contacted in another bank than the seller or buyer's bank."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmOtherBankContactPerson
	 * BaselineReSubmissionV05.mmOtherBankContactPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmOtherBankContactPerson
	 * BaselineReSubmissionV03.mmOtherBankContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrBkCtctPrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBankContactPerson";
			definition = "Person to be contacted in another bank than the seller or buyer's bank.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReSubmissionV05.mmOtherBankContactPerson);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmOtherBankContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification3.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BaselineReSubmissionV04";
				definition = "Scope\r\nThe BaselineReSubmission message is sent by either the counterparty or the initiator of a transaction (baseline) to the matching application.\r\nThis message is used by the counterparty to respond on the registration of a push-through transaction in the matching application or by the initiator or counterparty to re-send earlier mis-matched baseline information.\r\nUsage\r\nThe BaselineReSubmission message can be sent by the counterparty of a transaction to the matching application in response to a FullPushThroughReport message received from the matching application conveying the details of an InitialBaselineSubmission message. The objective of the BaselineReSubmission message sent in the outlined scenario is to achieve a successful match of two baseline initiation messages in order to establish a transaction in the matching application.\r\nor\r\nThe BaselineReSubmission message can be sent by the initiator of a transaction to the matching application in response to a BaselineMatchReport message indicating mis-matches. The objective of the BaselineReSubmission message sent in the outlined scenario is to correct an InitialBaselineSubmission or BaselineReSubmission message submitted earlier in order to achieve the establishment of a transaction in the matching application.\r\nor\r\nThe BaselineReSubmission message can be sent by the counterparty of a transaction to the matching application in response to a BaselineMatchReport message indicating mis-matches. The objective of the BaselineReSubmission message sent in the outlined scenario is to correct a BaselineReSubmission message submitted earlier in order to achieve the establishment of a transaction in the matching application.";
				nextVersions_lazy = () -> Arrays.asList(BaselineReSubmissionV05.mmObject());
				previousVersion_lazy = () -> BaselineReSubmissionV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "BaselnReSubmissn";
				businessArea_lazy = () -> TradeServicesManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReSubmissionV04.mmSubmissionIdentification,
						com.tools20022.repository.area.tsmt.BaselineReSubmissionV04.mmTransactionIdentification, com.tools20022.repository.area.tsmt.BaselineReSubmissionV04.mmSubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.BaselineReSubmissionV04.mmBaseline, com.tools20022.repository.area.tsmt.BaselineReSubmissionV04.mmBuyerContactPerson,
						com.tools20022.repository.area.tsmt.BaselineReSubmissionV04.mmSellerContactPerson, com.tools20022.repository.area.tsmt.BaselineReSubmissionV04.mmBankContactPerson,
						com.tools20022.repository.area.tsmt.BaselineReSubmissionV04.mmOtherBankContactPerson);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "012";
						version = "04";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getSubmissionIdentification() {
		return submissionIdentification;
	}

	public void setSubmissionIdentification(MessageIdentification1 submissionIdentification) {
		this.submissionIdentification = submissionIdentification;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public SimpleIdentificationInformation getSubmitterTransactionReference() {
		return submitterTransactionReference;
	}

	public void setSubmitterTransactionReference(SimpleIdentificationInformation submitterTransactionReference) {
		this.submitterTransactionReference = submitterTransactionReference;
	}

	public Baseline4 getBaseline() {
		return baseline;
	}

	public void setBaseline(Baseline4 baseline) {
		this.baseline = baseline;
	}

	public List<ContactIdentification1> getBuyerContactPerson() {
		return buyerContactPerson;
	}

	public void setBuyerContactPerson(List<ContactIdentification1> buyerContactPerson) {
		this.buyerContactPerson = buyerContactPerson;
	}

	public List<ContactIdentification1> getSellerContactPerson() {
		return sellerContactPerson;
	}

	public void setSellerContactPerson(List<ContactIdentification1> sellerContactPerson) {
		this.sellerContactPerson = sellerContactPerson;
	}

	public BankContactPerson1Choice getBankContactPerson() {
		return bankContactPerson;
	}

	public void setBankContactPerson(BankContactPerson1Choice bankContactPerson) {
		this.bankContactPerson = bankContactPerson;
	}

	public List<ContactIdentification3> getOtherBankContactPerson() {
		return otherBankContactPerson;
	}

	public void setOtherBankContactPerson(List<ContactIdentification3> otherBankContactPerson) {
		this.otherBankContactPerson = otherBankContactPerson;
	}
}
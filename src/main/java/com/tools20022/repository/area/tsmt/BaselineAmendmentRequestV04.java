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
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * The BaselineAmendmentRequest message is sent by a primary party involved in a
 * transaction to the matching application.<br>
 * The message is used to request the amendment of an established baseline.<br>
 * <b>Usage</b><br>
 * The BaselineAmendmentRequest message may only be sent if the transaction is
 * in the state Established or Active.<br>
 * The BaselineAmendmentRequest message can be sent to the matching application
 * by one of the primary parties involved in a transaction established in the
 * push-through mode to request the amendment of an established baseline.<br>
 * The matching application acknowledges the receipt of the amendment request by
 * sending a DeltaReport message to the submitter of the
 * BaselineAmendmentRequest message. It passes on the newly proposed baseline to
 * the counterparty by sending a FullPushThroughReport message, a DeltaReport
 * message and a pre-calculated BaselineReport message.<br>
 * The counterparty is expected to either accept or reject the amendment request
 * by submitting an AmendmentAcceptance or AmendmentRejection message.<br>
 * or<br>
 * The BaselineAmendmentRequest message can be sent by the party involved in a
 * transaction established in the lodge mode to the matching application to
 * amend an established baseline.<br>
 * The matching application amends the baseline according to the
 * BaselineAmendmentRequest message and confirms the execution of the request by
 * sending a DeltaReport and calculated BaselineReport message to the requester
 * of the amendment.
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
 * xmlTag} = "BaselnAmdmntReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#mmRequestIdentification
 * BaselineAmendmentRequestV04.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#mmTransactionIdentification
 * BaselineAmendmentRequestV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#mmSubmitterTransactionReference
 * BaselineAmendmentRequestV04.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#mmBaseline
 * BaselineAmendmentRequestV04.mmBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#mmBuyerContactPerson
 * BaselineAmendmentRequestV04.mmBuyerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#mmSellerContactPerson
 * BaselineAmendmentRequestV04.mmSellerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#mmBuyerBankContactPerson
 * BaselineAmendmentRequestV04.mmBuyerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#mmSellerBankContactPerson
 * BaselineAmendmentRequestV04.mmSellerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#mmOtherBankContactPerson
 * BaselineAmendmentRequestV04.mmOtherBankContactPerson}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.009.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BaselineAmendmentRequestV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe BaselineAmendmentRequest message is sent by a primary party involved in a transaction to the matching application.\r\nThe message is used to request the amendment of an established baseline.\r\nUsage\r\nThe BaselineAmendmentRequest message may only be sent if the transaction is in the state Established or Active.\r\nThe BaselineAmendmentRequest message can be sent to the matching application by one of the primary parties involved in a transaction established in the push-through mode to request the amendment of an established baseline.\r\nThe matching application acknowledges the receipt of the amendment request by sending a DeltaReport message to the submitter of the BaselineAmendmentRequest message. It passes on the newly proposed baseline to the counterparty by sending a FullPushThroughReport message, a DeltaReport message and a pre-calculated BaselineReport message.\r\nThe counterparty is expected to either accept or reject the amendment request by submitting an AmendmentAcceptance or AmendmentRejection message.\r\nor\r\nThe BaselineAmendmentRequest message can be sent by the party involved in a transaction established in the lodge mode to the matching application to amend an established baseline.\r\nThe matching application amends the baseline according to the BaselineAmendmentRequest message and confirms the execution of the request by sending a DeltaReport and calculated BaselineReport message to the requester of the amendment."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05
 * BaselineAmendmentRequestV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03
 * BaselineAmendmentRequestV03}</li>
 * </ul>
 */
public class BaselineAmendmentRequestV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 requestIdentification;
	/**
	 * Identifies the request message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the request message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmRequestIdentification
	 * BaselineAmendmentRequestV05.mmRequestIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmRequestIdentification
	 * BaselineAmendmentRequestV03.mmRequestIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestIdentification";
			definition = "Identifies the request message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmRequestIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03.mmRequestIdentification;
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
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmTransactionIdentification
	 * BaselineAmendmentRequestV05.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmTransactionIdentification
	 * BaselineAmendmentRequestV03.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmTransactionIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03.mmTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmSubmitterTransactionReference
	 * BaselineAmendmentRequestV05.mmSubmitterTransactionReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmSubmitterTransactionReference
	 * BaselineAmendmentRequestV03.mmSubmitterTransactionReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubmitterTransactionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubmitrTxRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterTransactionReference";
			definition = "Reference to the transaction for the requesting financial institution.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmSubmitterTransactionReference);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03.mmSubmitterTransactionReference;
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
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmBaseline
	 * BaselineAmendmentRequestV05.mmBaseline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmBaseline
	 * BaselineAmendmentRequestV03.mmBaseline}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBaseline = new MMMessageBuildingBlock() {
		{
			xmlTag = "Baseln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Baseline";
			definition = "Specifies the commercial details of the underlying transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmBaseline);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03.mmBaseline;
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
	 * definition} = "Person to be contacted in the organisation of the buyer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmBuyerContactPerson
	 * BaselineAmendmentRequestV05.mmBuyerContactPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmBuyerContactPerson
	 * BaselineAmendmentRequestV03.mmBuyerContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyerContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyrCtctPrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerContactPerson";
			definition = "Person to be contacted in the organisation of the buyer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmBuyerContactPerson);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03.mmBuyerContactPerson;
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
	 * definition} = "Person to be contacted in the organisation of the seller."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmSellerContactPerson
	 * BaselineAmendmentRequestV05.mmSellerContactPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmSellerContactPerson
	 * BaselineAmendmentRequestV03.mmSellerContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSellerContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "SellrCtctPrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerContactPerson";
			definition = "Person to be contacted in the organisation of the seller.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmSellerContactPerson);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03.mmSellerContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}
	};
	protected List<ContactIdentification1> buyerBankContactPerson;
	/**
	 * Person to be contacted in the buyer's bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrBkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the buyer's bank."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmBuyerBankContactPerson
	 * BaselineAmendmentRequestV05.mmBuyerBankContactPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmBuyerBankContactPerson
	 * BaselineAmendmentRequestV03.mmBuyerBankContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyerBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyrBkCtctPrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBankContactPerson";
			definition = "Person to be contacted in the buyer's bank.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmBuyerBankContactPerson);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03.mmBuyerBankContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}
	};
	protected List<ContactIdentification1> sellerBankContactPerson;
	/**
	 * Person to be contacted in the seller's bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrBkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the seller's bank."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmSellerBankContactPerson
	 * BaselineAmendmentRequestV05.mmSellerBankContactPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmSellerBankContactPerson
	 * BaselineAmendmentRequestV03.mmSellerBankContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSellerBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "SellrBkCtctPrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBankContactPerson";
			definition = "Person to be contacted in the seller's bank.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmSellerBankContactPerson);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03.mmSellerBankContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
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
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmOtherBankContactPerson
	 * BaselineAmendmentRequestV05.mmOtherBankContactPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmOtherBankContactPerson
	 * BaselineAmendmentRequestV03.mmOtherBankContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrBkCtctPrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBankContactPerson";
			definition = "Person to be contacted in another bank than the seller or buyer's bank.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.mmOtherBankContactPerson);
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03.mmOtherBankContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification3.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BaselineAmendmentRequestV04";
				definition = "Scope\r\nThe BaselineAmendmentRequest message is sent by a primary party involved in a transaction to the matching application.\r\nThe message is used to request the amendment of an established baseline.\r\nUsage\r\nThe BaselineAmendmentRequest message may only be sent if the transaction is in the state Established or Active.\r\nThe BaselineAmendmentRequest message can be sent to the matching application by one of the primary parties involved in a transaction established in the push-through mode to request the amendment of an established baseline.\r\nThe matching application acknowledges the receipt of the amendment request by sending a DeltaReport message to the submitter of the BaselineAmendmentRequest message. It passes on the newly proposed baseline to the counterparty by sending a FullPushThroughReport message, a DeltaReport message and a pre-calculated BaselineReport message.\r\nThe counterparty is expected to either accept or reject the amendment request by submitting an AmendmentAcceptance or AmendmentRejection message.\r\nor\r\nThe BaselineAmendmentRequest message can be sent by the party involved in a transaction established in the lodge mode to the matching application to amend an established baseline.\r\nThe matching application amends the baseline according to the BaselineAmendmentRequest message and confirms the execution of the request by sending a DeltaReport and calculated BaselineReport message to the requester of the amendment.";
				nextVersions_lazy = () -> Arrays.asList(BaselineAmendmentRequestV05.mmObject());
				previousVersion_lazy = () -> BaselineAmendmentRequestV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "BaselnAmdmntReq";
				businessArea_lazy = () -> TradeServicesManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04.mmRequestIdentification,
						com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04.mmTransactionIdentification, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04.mmSubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04.mmBaseline, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04.mmBuyerContactPerson,
						com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04.mmSellerContactPerson, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04.mmBuyerBankContactPerson,
						com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04.mmSellerBankContactPerson, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04.mmOtherBankContactPerson);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "009";
						version = "04";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getRequestIdentification() {
		return requestIdentification;
	}

	public void setRequestIdentification(MessageIdentification1 requestIdentification) {
		this.requestIdentification = requestIdentification;
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

	public List<ContactIdentification1> getBuyerBankContactPerson() {
		return buyerBankContactPerson;
	}

	public void setBuyerBankContactPerson(List<ContactIdentification1> buyerBankContactPerson) {
		this.buyerBankContactPerson = buyerBankContactPerson;
	}

	public List<ContactIdentification1> getSellerBankContactPerson() {
		return sellerBankContactPerson;
	}

	public void setSellerBankContactPerson(List<ContactIdentification1> sellerBankContactPerson) {
		this.sellerBankContactPerson = sellerBankContactPerson;
	}

	public List<ContactIdentification3> getOtherBankContactPerson() {
		return otherBankContactPerson;
	}

	public void setOtherBankContactPerson(List<ContactIdentification3> otherBankContactPerson) {
		this.otherBankContactPerson = otherBankContactPerson;
	}
}
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
import com.tools20022.repository.area.TradeServicesManagementLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * The BaselineReport message is sent by the matching application to the parties
 * involved in an amendment request or to the parties involved in a data set
 * match.<br>
 * The message is used to report either a pre-calculation or final calculation
 * of the dynamic part of an established baseline.<br>
 * <b>Usage</b><br>
 * The BaselineReport message can be sent by the matching application to the
 * parties involved in an amendment request for a transaction established in the
 * push-through mode. In the outlined scenario, the message is sent<br>
 * - to the party requested to accept or reject an amendment request after the
 * matching application has received a BaselineAmendmentRequest message. The
 * message informs about the provisional status of the dynamic part of the
 * baseline.<br>
 * - to the requester and the accepter of an amendment request after the
 * matching application has received an AmendmentAcceptance message conveying
 * the acceptance of the amendment request. The message informs about the actual
 * status of the dynamic part of the baseline.<br>
 * or<br>
 * The BaselineReport message can be sent by the matching application to the
 * party which has sent an amendment request for a transaction established in
 * the lodge mode. In the outlined scenario the message is used to inform about
 * the actual status of the dynamic part of the baseline.<br>
 * or<br>
 * The BaselineReport message can be sent by the matching application to the
 * parties involved in a data set match. In the outlined scenario, the message
 * is sent<br>
 * - to the submitter of the data set(s) in the case of a data set match for a
 * transaction established in the lodge mode.<br>
 * - to the submitter of the data set(s) and to the counterparty in case of a
 * data set match for a transaction established in the push-through mode.The
 * message can be sent after a successful data-set match or after the acceptance
 * of mis-matched data sets to inform about the actual status of the dynamic
 * part of the baseline.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion
 * TradeServicesManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BaselnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmReportIdentification
 * BaselineReportV04.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmRelatedMessageReference
 * BaselineReportV04.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmReportType
 * BaselineReportV04.mmReportType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmTransactionIdentification
 * BaselineReportV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmEstablishedBaselineIdentification
 * BaselineReportV04.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmTransactionStatus
 * BaselineReportV04.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmUserTransactionReference
 * BaselineReportV04.mmUserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmBuyer
 * BaselineReportV04.mmBuyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmSeller
 * BaselineReportV04.mmSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmBuyerBank
 * BaselineReportV04.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmSellerBank
 * BaselineReportV04.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmReportedLineItem
 * BaselineReportV04.mmReportedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmRequestForAction
 * BaselineReportV04.mmRequestForAction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.011.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BaselineReportV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe BaselineReport message is sent by the matching application to the parties involved in an amendment request or to the parties involved in a data set match.\r\nThe message is used to report either a pre-calculation or final calculation of the dynamic part of an established baseline.\r\nUsage\r\nThe BaselineReport message can be sent by the matching application to the parties involved in an amendment request for a transaction established in the push-through mode. In the outlined scenario, the message is sent\r\n- to the party requested to accept or reject an amendment request after the matching application has received a BaselineAmendmentRequest message. The message informs about the provisional status of the dynamic part of the baseline.\r\n- to the requester and the accepter of an amendment request after the matching application has received an AmendmentAcceptance message conveying the acceptance of the amendment request. The message informs about the actual status of the dynamic part of the baseline.\r\nor\r\nThe BaselineReport message can be sent by the matching application to the party which has sent an amendment request for a transaction established in the lodge mode. In the outlined scenario the message is used to inform about the actual status of the dynamic part of the baseline.\r\nor\r\nThe BaselineReport message can be sent by the matching application to the parties involved in a data set match. In the outlined scenario, the message is sent\r\n- to the submitter of the data set(s) in the case of a data set match for a transaction established in the lodge mode.\r\n- to the submitter of the data set(s) and to the counterparty in case of a data set match for a transaction established in the push-through mode.The message can be sent after a successful data-set match or after the acceptance of mis-matched data sets to inform about the actual status of the dynamic part of the baseline."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03
 * BaselineReportV03}</li>
 * </ul>
 */
public class BaselineReportV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 reportIdentification;
	/**
	 * Identifies the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the report. "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmReportIdentification
	 * BaselineReportV03.mmReportIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Identifies the report. ";
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReportV03.mmReportIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	protected MessageIdentification1 relatedMessageReference;
	/**
	 * Reference to the related message at the origin of the report or sent at
	 * the same time than the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdMsgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMessageReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the related message at the origin of the report or sent at the same time than the report."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmRelatedMessageReference
	 * BaselineReportV03.mmRelatedMessageReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedMessageReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdMsgRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMessageReference";
			definition = "Reference to the related message at the origin of the report or sent at the same time than the report.";
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReportV03.mmRelatedMessageReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	protected ReportType2 reportType;
	/**
	 * Type of baseline report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReportType2
	 * ReportType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of baseline report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmReportType
	 * BaselineReportV03.mmReportType}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportType = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportType";
			definition = "Type of baseline report.";
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReportV03.mmReportType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportType2.mmObject();
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
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmTransactionIdentification
	 * BaselineReportV03.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.\n";
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReportV03.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}
	};
	protected DocumentIdentification6 establishedBaselineIdentification;
	/**
	 * Unique identification assigned by the matching application to the
	 * baseline when it is established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification6
	 * DocumentIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstblishdBaselnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstablishedBaselineIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the matching application to the baseline when it is established.  "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmEstablishedBaselineIdentification
	 * BaselineReportV03.mmEstablishedBaselineIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEstablishedBaselineIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "EstblishdBaselnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstablishedBaselineIdentification";
			definition = "Unique identification assigned by the matching application to the baseline when it is established.  ";
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReportV03.mmEstablishedBaselineIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification6.mmObject();
		}
	};
	protected TransactionStatus4 transactionStatus;
	/**
	 * Identifies the status of the transaction by means of a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus4
	 * TransactionStatus4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the status of the transaction by means of a code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmTransactionStatus
	 * BaselineReportV03.mmTransactionStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionStatus";
			definition = "Identifies the status of the transaction by means of a code.";
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReportV03.mmTransactionStatus;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionStatus4.mmObject();
		}
	};
	protected List<DocumentIdentification5> userTransactionReference;
	/**
	 * Reference to the transaction for each financial institution which is a
	 * party to the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5
	 * DocumentIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction for each financial institution which is a party to the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmUserTransactionReference
	 * BaselineReportV03.mmUserTransactionReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUserTransactionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "UsrTxRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserTransactionReference";
			definition = "Reference to the transaction for each financial institution which is a party to the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReportV03.mmUserTransactionReference;
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification5.mmObject();
		}
	};
	protected PartyIdentification26 buyer;
	/**
	 * Party that buys goods or services, or a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that buys goods or services, or a financial instrument. "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmBuyer
	 * BaselineReportV03.mmBuyer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyer = new MMMessageBuildingBlock() {
		{
			xmlTag = "Buyr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument. ";
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReportV03.mmBuyer;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification26.mmObject();
		}
	};
	protected PartyIdentification26 seller;
	/**
	 * Party that sells goods or services, or a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sells goods or services, or a financial instrument. "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmSeller
	 * BaselineReportV03.mmSeller}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSeller = new MMMessageBuildingBlock() {
		{
			xmlTag = "Sellr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument. ";
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReportV03.mmSeller;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification26.mmObject();
		}
	};
	protected BICIdentification1 buyerBank;
	/**
	 * The financial institution of the buyer, uniquely identified by its BIC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The financial institution of the buyer, uniquely identified by its BIC. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmBuyerBank
	 * BaselineReportV03.mmBuyerBank}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyerBank = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyrBk";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBank";
			definition = "The financial institution of the buyer, uniquely identified by its BIC. ";
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReportV03.mmBuyerBank;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}
	};
	protected BICIdentification1 sellerBank;
	/**
	 * The financial institution of the seller, uniquely identified by its BIC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The financial institution of the seller, uniquely identified by its BIC. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmSellerBank
	 * BaselineReportV03.mmSellerBank}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSellerBank = new MMMessageBuildingBlock() {
		{
			xmlTag = "SellrBk";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBank";
			definition = "The financial institution of the seller, uniquely identified by its BIC. ";
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReportV03.mmSellerBank;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}
	};
	protected LineItem14 reportedLineItem;
	/**
	 * Information on the goods
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.LineItem14
	 * LineItem14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptdLineItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the goods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmReportedLineItem
	 * BaselineReportV03.mmReportedLineItem}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportedLineItem = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptdLineItm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedLineItem";
			definition = "Information on the goods";
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReportV03.mmReportedLineItem;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> LineItem14.mmObject();
		}
	};
	protected PendingActivity2 requestForAction;
	/**
	 * Information on the next processing step required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PendingActivity2
	 * PendingActivity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqForActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestForAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the next processing step required."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmRequestForAction
	 * BaselineReportV03.mmRequestForAction}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestForAction = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqForActn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestForAction";
			definition = "Information on the next processing step required.";
			previousVersion_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReportV03.mmRequestForAction;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PendingActivity2.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BaselineReportV04";
				definition = "Scope\r\nThe BaselineReport message is sent by the matching application to the parties involved in an amendment request or to the parties involved in a data set match.\r\nThe message is used to report either a pre-calculation or final calculation of the dynamic part of an established baseline.\r\nUsage\r\nThe BaselineReport message can be sent by the matching application to the parties involved in an amendment request for a transaction established in the push-through mode. In the outlined scenario, the message is sent\r\n- to the party requested to accept or reject an amendment request after the matching application has received a BaselineAmendmentRequest message. The message informs about the provisional status of the dynamic part of the baseline.\r\n- to the requester and the accepter of an amendment request after the matching application has received an AmendmentAcceptance message conveying the acceptance of the amendment request. The message informs about the actual status of the dynamic part of the baseline.\r\nor\r\nThe BaselineReport message can be sent by the matching application to the party which has sent an amendment request for a transaction established in the lodge mode. In the outlined scenario the message is used to inform about the actual status of the dynamic part of the baseline.\r\nor\r\nThe BaselineReport message can be sent by the matching application to the parties involved in a data set match. In the outlined scenario, the message is sent\r\n- to the submitter of the data set(s) in the case of a data set match for a transaction established in the lodge mode.\r\n- to the submitter of the data set(s) and to the counterparty in case of a data set match for a transaction established in the push-through mode.The message can be sent after a successful data-set match or after the acceptance of mis-matched data sets to inform about the actual status of the dynamic part of the baseline.";
				previousVersion_lazy = () -> BaselineReportV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "BaselnRpt";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReportV04.mmReportIdentification, com.tools20022.repository.area.tsmt.BaselineReportV04.mmRelatedMessageReference,
						com.tools20022.repository.area.tsmt.BaselineReportV04.mmReportType, com.tools20022.repository.area.tsmt.BaselineReportV04.mmTransactionIdentification,
						com.tools20022.repository.area.tsmt.BaselineReportV04.mmEstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.BaselineReportV04.mmTransactionStatus,
						com.tools20022.repository.area.tsmt.BaselineReportV04.mmUserTransactionReference, com.tools20022.repository.area.tsmt.BaselineReportV04.mmBuyer, com.tools20022.repository.area.tsmt.BaselineReportV04.mmSeller,
						com.tools20022.repository.area.tsmt.BaselineReportV04.mmBuyerBank, com.tools20022.repository.area.tsmt.BaselineReportV04.mmSellerBank, com.tools20022.repository.area.tsmt.BaselineReportV04.mmReportedLineItem,
						com.tools20022.repository.area.tsmt.BaselineReportV04.mmRequestForAction);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "011";
						version = "04";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getReportIdentification() {
		return reportIdentification;
	}

	public void setReportIdentification(MessageIdentification1 reportIdentification) {
		this.reportIdentification = reportIdentification;
	}

	public MessageIdentification1 getRelatedMessageReference() {
		return relatedMessageReference;
	}

	public void setRelatedMessageReference(MessageIdentification1 relatedMessageReference) {
		this.relatedMessageReference = relatedMessageReference;
	}

	public ReportType2 getReportType() {
		return reportType;
	}

	public void setReportType(ReportType2 reportType) {
		this.reportType = reportType;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public DocumentIdentification6 getEstablishedBaselineIdentification() {
		return establishedBaselineIdentification;
	}

	public void setEstablishedBaselineIdentification(DocumentIdentification6 establishedBaselineIdentification) {
		this.establishedBaselineIdentification = establishedBaselineIdentification;
	}

	public TransactionStatus4 getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatus4 transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public List<DocumentIdentification5> getUserTransactionReference() {
		return userTransactionReference;
	}

	public void setUserTransactionReference(List<DocumentIdentification5> userTransactionReference) {
		this.userTransactionReference = userTransactionReference;
	}

	public PartyIdentification26 getBuyer() {
		return buyer;
	}

	public void setBuyer(PartyIdentification26 buyer) {
		this.buyer = buyer;
	}

	public PartyIdentification26 getSeller() {
		return seller;
	}

	public void setSeller(PartyIdentification26 seller) {
		this.seller = seller;
	}

	public BICIdentification1 getBuyerBank() {
		return buyerBank;
	}

	public void setBuyerBank(BICIdentification1 buyerBank) {
		this.buyerBank = buyerBank;
	}

	public BICIdentification1 getSellerBank() {
		return sellerBank;
	}

	public void setSellerBank(BICIdentification1 sellerBank) {
		this.sellerBank = sellerBank;
	}

	public LineItem14 getReportedLineItem() {
		return reportedLineItem;
	}

	public void setReportedLineItem(LineItem14 reportedLineItem) {
		this.reportedLineItem = reportedLineItem;
	}

	public PendingActivity2 getRequestForAction() {
		return requestForAction;
	}

	public void setRequestForAction(PendingActivity2 requestForAction) {
		this.requestForAction = requestForAction;
	}
}
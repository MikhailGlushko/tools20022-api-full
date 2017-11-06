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

package com.tools20022.repository.area.setr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.area.SecuritiesTradePreviousVersion;
import com.tools20022.repository.msg.AdditionalReference3;
import com.tools20022.repository.msg.Extension1;
import com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * An instructing party, for example, an investment manager or its authorised
 * representative, sends the OrderConfirmationStatusReport message to the
 * executing party, for example, a transfer agent, to report the status of an
 * order confirmation or an order confirmation amendment.<br>
 * <b>Usage</b><br>
 * The OrderConfirmationStatusReport message is used to report on the status of
 * one or more individual:<br>
 * - subscription confirmations,<br>
 * - subscription confirmation amendments,<br>
 * - redemption confirmations,<br>
 * - redemption confirmation amendments,<br>
 * - switch order confirmations,<br>
 * - switch order confirmation amendments.<br>
 * One of the following statuses can be reported:<br>
 * - confirmation rejected, or,<br>
 * - amendment rejected, or,<br>
 * - sent to next party, or,<br>
 * - communication problem with next party, or,<br>
 * - confirmation accepted, or,<br>
 * - confirmation received.<br>
 * It is likely that the OrderConfirmationStatusReport is only sent by the order
 * instructing party to the order executing party to reject an order
 * confirmation or to reject an order confirmation amendment, although if an
 * intermediary party is used, the statuses sent to next party and communication
 * problem with next party are also likely be used. The statuses confirmation
 * accepted and confirmation received would only be used in the event the order
 * executing party sends a RequestForOrderConfirmationStatusReport message and
 * one of the other statuses does not apply.<br>
 * If the status being reported is either confirmation rejected or amendment
 * rejected, then a reason for the rejection must be given.<br>
 * The individual order confirmation or confirmation amendment for which the
 * status is given is identified with its order reference. The message
 * identification of the message in which the individual order confirmation or
 * confirmation amendment was conveyed may also be quoted in RelatedReference,
 * but this is not recommended.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradePreviousVersion
 * SecuritiesTradePreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "OrdrConfStsRptV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#mmRelatedReferenceOrOtherReferenceRule
 * OrderConfirmationStatusReportV01.mmRelatedReferenceOrOtherReferenceRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#mmMessageIdentification
 * OrderConfirmationStatusReportV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#mmOtherReference
 * OrderConfirmationStatusReportV01.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#mmRelatedReference
 * OrderConfirmationStatusReportV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#mmIndividualOrderConfirmationDetailsReport
 * OrderConfirmationStatusReportV01.mmIndividualOrderConfirmationDetailsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#mmExtension
 * OrderConfirmationStatusReportV01.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.057.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderConfirmationStatusReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party, for example, an investment manager or its authorised representative, sends the OrderConfirmationStatusReport message to the executing party, for example, a transfer agent, to report the status of an order confirmation or an order confirmation amendment.\r\nUsage\r\nThe OrderConfirmationStatusReport message is used to report on the status of one or more individual:\r\n- subscription confirmations,\r\n- subscription confirmation amendments,\r\n- redemption confirmations,\r\n- redemption confirmation amendments,\r\n- switch order confirmations,\r\n- switch order confirmation amendments.\r\nOne of the following statuses can be reported:\r\n- confirmation rejected, or,\r\n- amendment rejected, or,\r\n- sent to next party, or,\r\n- communication problem with next party, or,\r\n- confirmation accepted, or,\r\n- confirmation received.\r\nIt is likely that the OrderConfirmationStatusReport is only sent by the order instructing party to the order executing party to reject an order confirmation or to reject an order confirmation amendment, although if an intermediary party is used, the statuses sent to next party and communication problem with next party are also likely be used. The statuses confirmation accepted and confirmation received would only be used in the event the order executing party sends a RequestForOrderConfirmationStatusReport message and one of the other statuses does not apply.\r\nIf the status being reported is either confirmation rejected or amendment rejected, then a reason for the rejection must be given.\r\nThe individual order confirmation or confirmation amendment for which the status is given is identified with its order reference. The message identification of the message in which the individual order confirmation or confirmation amendment was conveyed may also be quoted in RelatedReference, but this is not recommended."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02
 * OrderConfirmationStatusReportV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class OrderConfirmationStatusReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Occurrences of either RelatedReference or OtherReference may be present,
	 * but not occurrences of both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#mmOtherReference
	 * OrderConfirmationStatusReportV01.mmOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#mmRelatedReference
	 * OrderConfirmationStatusReportV01.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01
	 * OrderConfirmationStatusReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceOrOtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Occurrences of either RelatedReference or OtherReference may be present, but not occurrences of both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmRelatedReferenceOrOtherReferenceRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceOrOtherReferenceRule";
			definition = "Occurrences of either RelatedReference or OtherReference may be present, but not occurrences of both.";
			messageDefinition_lazy = () -> OrderConfirmationStatusReportV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01.mmOtherReference,
					com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01.mmRelatedReference);
		}
	};
	protected MessageIdentification1 messageIdentification;
	/**
	 * Reference that uniquely identifies a message from a business application
	 * standpoint.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#mmMessageIdentification
	 * OrderConfirmationStatusReportV02.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	protected List<AdditionalReference3> otherReference;
	/**
	 * Reference to a linked message sent in a proprietary way or reference of a
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message sent in a proprietary way or reference of a system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReference";
			definition = "Reference to a linked message sent in a proprietary way or reference of a system.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
	protected List<AdditionalReference3> relatedReference;
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
	protected List<IndividualOrderConfirmationStatusAndReason1> individualOrderConfirmationDetailsReport;
	/**
	 * Status report details of an individual order confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1
	 * IndividualOrderConfirmationStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvOrdrConfDtlsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualOrderConfirmationDetailsReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status report details of an individual order confirmation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#mmIndividualOrderConfirmationDetailsReport
	 * OrderConfirmationStatusReportV02.
	 * mmIndividualOrderConfirmationDetailsReport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIndividualOrderConfirmationDetailsReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "IndvOrdrConfDtlsRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOrderConfirmationDetailsReport";
			definition = "Status report details of an individual order confirmation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02.mmIndividualOrderConfirmationDetailsReport);
			minOccurs = 1;
			complexType_lazy = () -> IndividualOrderConfirmationStatusAndReason1.mmObject();
		}
	};
	protected List<Extension1> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#mmExtension
	 * OrderConfirmationStatusReportV02.mmExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02.mmExtension);
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrderConfirmationStatusReportV01";
				definition = "Scope\r\nAn instructing party, for example, an investment manager or its authorised representative, sends the OrderConfirmationStatusReport message to the executing party, for example, a transfer agent, to report the status of an order confirmation or an order confirmation amendment.\r\nUsage\r\nThe OrderConfirmationStatusReport message is used to report on the status of one or more individual:\r\n- subscription confirmations,\r\n- subscription confirmation amendments,\r\n- redemption confirmations,\r\n- redemption confirmation amendments,\r\n- switch order confirmations,\r\n- switch order confirmation amendments.\r\nOne of the following statuses can be reported:\r\n- confirmation rejected, or,\r\n- amendment rejected, or,\r\n- sent to next party, or,\r\n- communication problem with next party, or,\r\n- confirmation accepted, or,\r\n- confirmation received.\r\nIt is likely that the OrderConfirmationStatusReport is only sent by the order instructing party to the order executing party to reject an order confirmation or to reject an order confirmation amendment, although if an intermediary party is used, the statuses sent to next party and communication problem with next party are also likely be used. The statuses confirmation accepted and confirmation received would only be used in the event the order executing party sends a RequestForOrderConfirmationStatusReport message and one of the other statuses does not apply.\r\nIf the status being reported is either confirmation rejected or amendment rejected, then a reason for the rejection must be given.\r\nThe individual order confirmation or confirmation amendment for which the status is given is identified with its order reference. The message identification of the message in which the individual order confirmation or confirmation amendment was conveyed may also be quoted in RelatedReference, but this is not recommended.";
				nextVersions_lazy = () -> Arrays.asList(OrderConfirmationStatusReportV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01.mmRelatedReferenceOrOtherReferenceRule);
				rootElement = "Document";
				xmlTag = "OrdrConfStsRptV01";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01.mmMessageIdentification,
						com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01.mmOtherReference, com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01.mmRelatedReference,
						com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01.mmIndividualOrderConfirmationDetailsReport, com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "057";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	public List<AdditionalReference3> getOtherReference() {
		return otherReference;
	}

	public void setOtherReference(List<AdditionalReference3> otherReference) {
		this.otherReference = otherReference;
	}

	public List<AdditionalReference3> getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(List<AdditionalReference3> relatedReference) {
		this.relatedReference = relatedReference;
	}

	public List<IndividualOrderConfirmationStatusAndReason1> getIndividualOrderConfirmationDetailsReport() {
		return individualOrderConfirmationDetailsReport;
	}

	public void setIndividualOrderConfirmationDetailsReport(List<IndividualOrderConfirmationStatusAndReason1> individualOrderConfirmationDetailsReport) {
		this.individualOrderConfirmationDetailsReport = individualOrderConfirmationDetailsReport;
	}

	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}
}
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

package com.tools20022.repository.area.admi;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.AdministrationLatestVersion;
import com.tools20022.repository.datatype.Exact4AlphaNumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.Event1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion;
import com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * The SystemEventAcknowledgement message is sent by a participant of a central
 * system to the central system to acknowledge the notification of an occurrence
 * of an event in a central system.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AdministrationLatestVersion
 * AdministrationLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion
 * PostTradeForeignExchangeISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement
 * PostTradeForeignExchangeMaintenance20162017andSupplement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SysEvtAck"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventAcknowledgementV01#mmMessageIdentification
 * SystemEventAcknowledgementV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventAcknowledgementV01#mmOriginatorReference
 * SystemEventAcknowledgementV01.mmOriginatorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventAcknowledgementV01#mmSettlementSessionIdentifier
 * SystemEventAcknowledgementV01.mmSettlementSessionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventAcknowledgementV01#mmAcknowledgementDetails
 * SystemEventAcknowledgementV01.mmAcknowledgementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventAcknowledgementV01#mmSupplementaryData
 * SystemEventAcknowledgementV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code admi.011.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemEventAcknowledgementV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The SystemEventAcknowledgement message is sent by a participant of a central system to the central system to acknowledge the notification of an occurrence of an event in a central system.\r\n"
 * </li>
 * </ul>
 */
public class SystemEventAcknowledgementV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Max35Text messageIdentification;
	/**
	 * Unique and unambiguous identifier for the message, as assigned by the
	 * sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
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
	 * "Unique and unambiguous identifier for the message, as assigned by the sender."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique and unambiguous identifier for the message, as assigned by the sender.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text originatorReference;
	/**
	 * Represents the original reference of the system event notification for
	 * which the acknowledgement is given, as assigned by the central system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgtrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatorReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the original reference of the system event notification for which the acknowledgement is given, as assigned by the central system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginatorReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgtrRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatorReference";
			definition = "Represents the original reference of the system event notification for which the acknowledgement is given, as assigned by the central system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Exact4AlphaNumericText settlementSessionIdentifier;
	/**
	 * To indicate the requested CLS Settlement Session that the related trade
	 * is part of.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4AlphaNumericText
	 * Exact4AlphaNumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSsnIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSessionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "To indicate the requested CLS Settlement Session that the related trade is part of."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementSessionIdentifier = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmSsnIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSessionIdentifier";
			definition = "To indicate the requested CLS Settlement Session that the related trade is part of.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}
	};
	protected Event1 acknowledgementDetails;
	/**
	 * Details of the system event being acknowledged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Event1 Event1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the system event being acknowledged."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAcknowledgementDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AckDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementDetails";
			definition = "Details of the system event being acknowledged.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Event1.mmObject();
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemEventAcknowledgementV01";
				definition = "The SystemEventAcknowledgement message is sent by a participant of a central system to the central system to acknowledge the notification of an occurrence of an event in a central system.\r\n";
				messageSet_lazy = () -> Arrays.asList(PostTradeForeignExchangeISOLatestversion.mmObject(), PostTradeForeignExchangeMaintenance20162017andSupplement.mmObject());
				rootElement = "Document";
				xmlTag = "SysEvtAck";
				businessArea_lazy = () -> AdministrationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.admi.SystemEventAcknowledgementV01.mmMessageIdentification,
						com.tools20022.repository.area.admi.SystemEventAcknowledgementV01.mmOriginatorReference, com.tools20022.repository.area.admi.SystemEventAcknowledgementV01.mmSettlementSessionIdentifier,
						com.tools20022.repository.area.admi.SystemEventAcknowledgementV01.mmAcknowledgementDetails, com.tools20022.repository.area.admi.SystemEventAcknowledgementV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "admi";
						messageFunctionality = "011";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	public Max35Text getOriginatorReference() {
		return originatorReference;
	}

	public void setOriginatorReference(Max35Text originatorReference) {
		this.originatorReference = originatorReference;
	}

	public Exact4AlphaNumericText getSettlementSessionIdentifier() {
		return settlementSessionIdentifier;
	}

	public void setSettlementSessionIdentifier(Exact4AlphaNumericText settlementSessionIdentifier) {
		this.settlementSessionIdentifier = settlementSessionIdentifier;
	}

	public Event1 getAcknowledgementDetails() {
		return acknowledgementDetails;
	}

	public void setAcknowledgementDetails(Event1 acknowledgementDetails) {
		this.acknowledgementDetails = acknowledgementDetails;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}
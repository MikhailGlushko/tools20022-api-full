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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.SecuritiesEventsPreviousVersion;
import com.tools20022.repository.choice.PartyIdentification9Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import com.tools20022.repository.msgset.ProxyVotingISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * A notifying party, eg, an issuer, its agent or an intermediary, sends the
 * MeetingNotification message to a party holding the right to vote, to announce
 * a shareholders meeting.<br>
 * <b>Usage</b><br>
 * The MeetingNotification message is used to announce a shareholders meeting,
 * for example, it provides information on the participation details and
 * requirements for the meeting, the vote parameters and the resolutions. The
 * MeetingNotification message may also be used to announce an update.<br>
 * To notify an update, the Amendment building block must be filled in. Any
 * building block that is modified must be included in the amendment message.
 * The information previously notified and not repeated in the amendment message
 * remains valid.<br>
 * To update the resolutions of the agenda, the complete list of resolutions
 * must be repeated in the amendment message. The resolutions that are deleted
 * should be assigned the status Withdrawn.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsPreviousVersion
 * SecuritiesEventsPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ProxyVotingISOPreviousversion
 * ProxyVotingISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MtgNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmIdentification
 * MeetingNotificationV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmAmendment
 * MeetingNotificationV04.mmAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmNotificationStatus
 * MeetingNotificationV04.mmNotificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmMeeting
 * MeetingNotificationV04.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmMeetingDetails
 * MeetingNotificationV04.mmMeetingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmNotifyingParty
 * MeetingNotificationV04.mmNotifyingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmIssuer
 * MeetingNotificationV04.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmIssuerAgent
 * MeetingNotificationV04.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmSecurity
 * MeetingNotificationV04.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmResolution
 * MeetingNotificationV04.mmResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmVote
 * MeetingNotificationV04.mmVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmEntitlementSpecification
 * MeetingNotificationV04.mmEntitlementSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmPowerOfAttorneyRequirements
 * MeetingNotificationV04.mmPowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmAdditionalInformation
 * MeetingNotificationV04.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmExtension
 * MeetingNotificationV04.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.001.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingNotificationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA notifying party, eg, an issuer, its agent or an intermediary, sends the MeetingNotification message to a party holding the right to vote, to announce a shareholders meeting.\r\nUsage\r\nThe MeetingNotification message is used to announce a shareholders meeting, for example, it provides information on the participation details and requirements for the meeting, the vote parameters and the resolutions. The MeetingNotification message may also be used to announce an update.\r\nTo notify an update, the Amendment building block must be filled in. Any building block that is modified must be included in the amendment message. The information previously notified and not repeated in the amendment message remains valid.\r\nTo update the resolutions of the agenda, the complete list of resolutions must be repeated in the amendment message. The resolutions that are deleted should be assigned the status Withdrawn."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05
 * MeetingNotificationV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03
 * MeetingNotificationV03}</li>
 * </ul>
 */
public class MeetingNotificationV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 identification;
	/**
	 * Identifies the meeting notification message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the meeting notification message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the meeting notification message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	protected AmendInformation1 amendment;
	/**
	 * Information specific to an amendment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmendInformation1
	 * AmendInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amdmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specific to an amendment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmAmendment
	 * MeetingNotificationV05.mmAmendment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAmendment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Amdmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendment";
			definition = "Information specific to an amendment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.mmAmendment);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmendInformation1.mmObject();
		}
	};
	protected NotificationStatus1 notificationStatus;
	/**
	 * Defines the global status of the event contained in the notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NotificationStatus1
	 * NotificationStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the global status of the event contained in the notification."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmNotificationStatus
	 * MeetingNotificationV05.mmNotificationStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNotificationStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "NtfctnSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationStatus";
			definition = "Defines the global status of the event contained in the notification.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.mmNotificationStatus);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NotificationStatus1.mmObject();
		}
	};
	protected MeetingNotice3 meeting;
	/**
	 * Specifies information about the meeting. This component contains meeting
	 * identifications, various deadlines, contact persons, electronic and
	 * postal locations for accessing information and proxy assignment
	 * parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MeetingNotice3
	 * MeetingNotice3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information about the meeting. This component contains meeting identifications, various deadlines, contact persons, electronic and postal locations for accessing information and proxy assignment parameters."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmMeeting
	 * MeetingNotificationV05.mmMeeting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMeeting = new MMMessageBuildingBlock() {
		{
			xmlTag = "Mtg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Meeting";
			definition = "Specifies information about the meeting. This component contains meeting identifications, various deadlines, contact persons, electronic and postal locations for accessing information and proxy assignment parameters.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.mmMeeting);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingNotice3.mmObject();
		}
	};
	protected List<Meeting3> meetingDetails;
	/**
	 * Dates and details of the shareholders meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Meeting3
	 * Meeting3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dates and details of the shareholders meeting."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmMeetingDetails
	 * MeetingNotificationV05.mmMeetingDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMeetingDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtgDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingDetails";
			definition = "Dates and details of the shareholders meeting.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.mmMeetingDetails);
			maxOccurs = 5;
			minOccurs = 1;
			complexType_lazy = () -> Meeting3.mmObject();
		}
	};
	protected PartyIdentification9Choice notifyingParty;
	/**
	 * Party notifying the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice
	 * PartyIdentification9Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtifngPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotifyingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party notifying the meeting."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNotifyingParty = new MMMessageBuildingBlock() {
		{
			xmlTag = "NtifngPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyingParty";
			definition = "Party notifying the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification9Choice.mmObject();
		}
	};
	protected IssuerInformation1 issuer;
	/**
	 * Specifies the institution that is the issuer of the security to which the
	 * meeting applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IssuerInformation1
	 * IssuerInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the institution that is the issuer of the security to which the meeting applies."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmIssuer
	 * MeetingNotificationV05.mmIssuer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIssuer = new MMMessageBuildingBlock() {
		{
			xmlTag = "Issr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Specifies the institution that is the issuer of the security to which the meeting applies.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.mmIssuer);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IssuerInformation1.mmObject();
		}
	};
	protected List<IssuerAgent1> issuerAgent;
	/**
	 * Agents of the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.IssuerAgent1
	 * IssuerAgent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agents of the issuer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmIssuerAgent
	 * MeetingNotificationV05.mmIssuerAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIssuerAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Agents of the issuer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.mmIssuerAgent);
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> IssuerAgent1.mmObject();
		}
	};
	protected List<SecurityPosition6> security;
	/**
	 * Net position of a segregated holding, in a single security, within the
	 * overall position held in a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition6
	 * SecurityPosition6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Scty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmSecurity
	 * MeetingNotificationV05.mmSecurity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurity = new MMMessageBuildingBlock() {
		{
			xmlTag = "Scty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.mmSecurity);
			maxOccurs = 200;
			minOccurs = 1;
			complexType_lazy = () -> SecurityPosition6.mmObject();
		}
	};
	protected List<Resolution2> resolution;
	/**
	 * Detailed information of a resolution proposed to the vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Resolution2
	 * Resolution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Resolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information of a resolution proposed to the vote."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmResolution
	 * MeetingNotificationV05.mmResolution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmResolution = new MMMessageBuildingBlock() {
		{
			xmlTag = "Rsltn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Resolution";
			definition = "Detailed information of a resolution proposed to the vote.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.mmResolution);
			maxOccurs = 1000;
			minOccurs = 0;
			complexType_lazy = () -> Resolution2.mmObject();
		}
	};
	protected VoteParameters3 vote;
	/**
	 * Specifies the conditions to be allowed to vote, the different voting
	 * methods and options, the voting deadlines and the parameters of the
	 * incentive premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.VoteParameters3
	 * VoteParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions to be allowed to vote, the different voting methods and options, the voting deadlines and the parameters of the incentive premium."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmVote
	 * MeetingNotificationV05.mmVote}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmVote = new MMMessageBuildingBlock() {
		{
			xmlTag = "Vote";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vote";
			definition = "Specifies the conditions to be allowed to vote, the different voting methods and options, the voting deadlines and the parameters of the incentive premium.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.mmVote);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> VoteParameters3.mmObject();
		}
	};
	protected EntitlementAssessment2 entitlementSpecification;
	/**
	 * Specifies the entitlement ratio and the different deadlines for
	 * calculating the entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntSpcfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementSpecification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the entitlement ratio and the different deadlines for calculating the entitlement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmEntitlementSpecification
	 * MeetingNotificationV05.mmEntitlementSpecification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEntitlementSpecification = new MMMessageBuildingBlock() {
		{
			xmlTag = "EntitlmntSpcfctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementSpecification";
			definition = "Specifies the entitlement ratio and the different deadlines for calculating the entitlement.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.mmEntitlementSpecification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> EntitlementAssessment2.mmObject();
		}
	};
	protected PowerOfAttorneyRequirements2 powerOfAttorneyRequirements;
	/**
	 * Specifies requirements relative to the use of Power of Attorney.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements2
	 * PowerOfAttorneyRequirements2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PwrOfAttnyRqrmnts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorneyRequirements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies requirements relative to the use of Power of Attorney."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmPowerOfAttorneyRequirements
	 * MeetingNotificationV05.mmPowerOfAttorneyRequirements}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPowerOfAttorneyRequirements = new MMMessageBuildingBlock() {
		{
			xmlTag = "PwrOfAttnyRqrmnts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorneyRequirements";
			definition = "Specifies requirements relative to the use of Power of Attorney.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.mmPowerOfAttorneyRequirements);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PowerOfAttorneyRequirements2.mmObject();
		}
	};
	protected CorporateEventNarrative2 additionalInformation;
	/**
	 * Provides additional narrative information about the corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateEventNarrative2
	 * CorporateEventNarrative2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional narrative information about the corporate event."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmAdditionalInformation
	 * MeetingNotificationV05.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional narrative information about the corporate event.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.mmAdditionalInformation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateEventNarrative2.mmObject();
		}
	};
	protected List<Extension2> extension;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension2
	 * Extension2}</li>
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension2.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingNotificationV04";
				definition = "Scope\r\nA notifying party, eg, an issuer, its agent or an intermediary, sends the MeetingNotification message to a party holding the right to vote, to announce a shareholders meeting.\r\nUsage\r\nThe MeetingNotification message is used to announce a shareholders meeting, for example, it provides information on the participation details and requirements for the meeting, the vote parameters and the resolutions. The MeetingNotification message may also be used to announce an update.\r\nTo notify an update, the Amendment building block must be filled in. Any building block that is modified must be included in the amendment message. The information previously notified and not repeated in the amendment message remains valid.\r\nTo update the resolutions of the agenda, the complete list of resolutions must be repeated in the amendment message. The resolutions that are deleted should be assigned the status Withdrawn.";
				nextVersions_lazy = () -> Arrays.asList(MeetingNotificationV05.mmObject());
				previousVersion_lazy = () -> MeetingNotificationV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ProxyVotingISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgNtfctn";
				businessArea_lazy = () -> SecuritiesEventsPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV04.mmIdentification, com.tools20022.repository.area.seev.MeetingNotificationV04.mmAmendment,
						com.tools20022.repository.area.seev.MeetingNotificationV04.mmNotificationStatus, com.tools20022.repository.area.seev.MeetingNotificationV04.mmMeeting,
						com.tools20022.repository.area.seev.MeetingNotificationV04.mmMeetingDetails, com.tools20022.repository.area.seev.MeetingNotificationV04.mmNotifyingParty,
						com.tools20022.repository.area.seev.MeetingNotificationV04.mmIssuer, com.tools20022.repository.area.seev.MeetingNotificationV04.mmIssuerAgent, com.tools20022.repository.area.seev.MeetingNotificationV04.mmSecurity,
						com.tools20022.repository.area.seev.MeetingNotificationV04.mmResolution, com.tools20022.repository.area.seev.MeetingNotificationV04.mmVote,
						com.tools20022.repository.area.seev.MeetingNotificationV04.mmEntitlementSpecification, com.tools20022.repository.area.seev.MeetingNotificationV04.mmPowerOfAttorneyRequirements,
						com.tools20022.repository.area.seev.MeetingNotificationV04.mmAdditionalInformation, com.tools20022.repository.area.seev.MeetingNotificationV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "001";
						version = "04";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getIdentification() {
		return identification;
	}

	public void setIdentification(MessageIdentification1 identification) {
		this.identification = identification;
	}

	public AmendInformation1 getAmendment() {
		return amendment;
	}

	public void setAmendment(AmendInformation1 amendment) {
		this.amendment = amendment;
	}

	public NotificationStatus1 getNotificationStatus() {
		return notificationStatus;
	}

	public void setNotificationStatus(NotificationStatus1 notificationStatus) {
		this.notificationStatus = notificationStatus;
	}

	public MeetingNotice3 getMeeting() {
		return meeting;
	}

	public void setMeeting(MeetingNotice3 meeting) {
		this.meeting = meeting;
	}

	public List<Meeting3> getMeetingDetails() {
		return meetingDetails;
	}

	public void setMeetingDetails(List<Meeting3> meetingDetails) {
		this.meetingDetails = meetingDetails;
	}

	public PartyIdentification9Choice getNotifyingParty() {
		return notifyingParty;
	}

	public void setNotifyingParty(PartyIdentification9Choice notifyingParty) {
		this.notifyingParty = notifyingParty;
	}

	public IssuerInformation1 getIssuer() {
		return issuer;
	}

	public void setIssuer(IssuerInformation1 issuer) {
		this.issuer = issuer;
	}

	public List<IssuerAgent1> getIssuerAgent() {
		return issuerAgent;
	}

	public void setIssuerAgent(List<IssuerAgent1> issuerAgent) {
		this.issuerAgent = issuerAgent;
	}

	public List<SecurityPosition6> getSecurity() {
		return security;
	}

	public void setSecurity(List<SecurityPosition6> security) {
		this.security = security;
	}

	public List<Resolution2> getResolution() {
		return resolution;
	}

	public void setResolution(List<Resolution2> resolution) {
		this.resolution = resolution;
	}

	public VoteParameters3 getVote() {
		return vote;
	}

	public void setVote(VoteParameters3 vote) {
		this.vote = vote;
	}

	public EntitlementAssessment2 getEntitlementSpecification() {
		return entitlementSpecification;
	}

	public void setEntitlementSpecification(EntitlementAssessment2 entitlementSpecification) {
		this.entitlementSpecification = entitlementSpecification;
	}

	public PowerOfAttorneyRequirements2 getPowerOfAttorneyRequirements() {
		return powerOfAttorneyRequirements;
	}

	public void setPowerOfAttorneyRequirements(PowerOfAttorneyRequirements2 powerOfAttorneyRequirements) {
		this.powerOfAttorneyRequirements = powerOfAttorneyRequirements;
	}

	public CorporateEventNarrative2 getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(CorporateEventNarrative2 additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public List<Extension2> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension2> extension) {
		this.extension = extension;
	}
}
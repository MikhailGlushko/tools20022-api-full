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
 * An account servicer sends the MeetingEntitlementNotification to an issuer,
 * its agent, an intermediary or an account owner to advise the entitlement in
 * relation to a shareholders meeting.<br>
 * <b>Usage</b><br>
 * This message is sent to advise the quantity of securities held by an account
 * owner. The balance is specified for the securities for which the meeting is
 * taking place.<br>
 * This entitlement message is sent by the account servicer or the registrar to
 * an intermediary, the issuer's agent or the issuer. It is also sent between
 * the account servicer and the account owner or the party holding the right to
 * vote.<br>
 * The message is also used to amend a previously sent
 * MeetingEntitlementNotification. To notify an update, the RelatedReference
 * must be included in the message.
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
 * xmlTag} = "MtgEntitlmntNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04#mmIdentification
 * MeetingEntitlementNotificationV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04#mmRelatedReference
 * MeetingEntitlementNotificationV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04#mmMeetingReference
 * MeetingEntitlementNotificationV04.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04#mmNotifyingParty
 * MeetingEntitlementNotificationV04.mmNotifyingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04#mmSecurity
 * MeetingEntitlementNotificationV04.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04#mmEligibility
 * MeetingEntitlementNotificationV04.mmEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04#mmExtension
 * MeetingEntitlementNotificationV04.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.003.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingEntitlementNotificationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the MeetingEntitlementNotification to an issuer, its agent, an intermediary or an account owner to advise the entitlement in relation to a shareholders meeting.\r\nUsage\r\nThis message is sent to advise the quantity of securities held by an account owner. The balance is specified for the securities for which the meeting is taking place.\r\nThis entitlement message is sent by the account servicer or the registrar to an intermediary, the issuer's agent or the issuer. It is also sent between the account servicer and the account owner or the party holding the right to vote.\r\nThe message is also used to amend a previously sent MeetingEntitlementNotification. To notify an update, the RelatedReference must be included in the message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05
 * MeetingEntitlementNotificationV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV03
 * MeetingEntitlementNotificationV03}</li>
 * </ul>
 */
public class MeetingEntitlementNotificationV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 identification;
	/**
	 * Identifies the notification of entitlement instruction.
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
	 * definition} = "Identifies the notification of entitlement instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the notification of entitlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	protected MessageIdentification relatedReference;
	/**
	 * Identifies the meeting entitlement message to be modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification
	 * MessageIdentification}</li>
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
	 * "Identifies the meeting entitlement message to be modified."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05#mmRelatedReference
	 * MeetingEntitlementNotificationV05.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Identifies the meeting entitlement message to be modified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05.mmRelatedReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageIdentification.mmObject();
		}
	};
	protected MeetingReference4 meetingReference;
	/**
	 * Series of elements which allow to identify a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference4
	 * MeetingReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Series of elements which allow to identify a meeting."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05#mmMeetingReference
	 * MeetingEntitlementNotificationV05.mmMeetingReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMeetingReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtgRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05.mmMeetingReference);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingReference4.mmObject();
		}
	};
	protected PartyIdentification9Choice notifyingParty;
	/**
	 * Party notifying the entitlement.
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
	 * definition} = "Party notifying the entitlement."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNotifyingParty = new MMMessageBuildingBlock() {
		{
			xmlTag = "NtifngPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyingParty";
			definition = "Party notifying the entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification9Choice.mmObject();
		}
	};
	protected List<SecurityPosition7> security;
	/**
	 * Identifies the security for which the meeting is organised, the account
	 * and the positions of the security holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition7
	 * SecurityPosition7}</li>
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
	 * "Identifies the security for which the meeting is organised, the account and the positions of the security holder."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05#mmSecurity
	 * MeetingEntitlementNotificationV05.mmSecurity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurity = new MMMessageBuildingBlock() {
		{
			xmlTag = "Scty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Identifies the security for which the meeting is organised, the account and the positions of the security holder.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05.mmSecurity);
			maxOccurs = 200;
			minOccurs = 1;
			complexType_lazy = () -> SecurityPosition7.mmObject();
		}
	};
	protected EligibilityDates1 eligibility;
	/**
	 * Defines the dates determining eligibility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EligibilityDates1
	 * EligibilityDates1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Elgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Eligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the dates determining eligibility."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05#mmEligibility
	 * MeetingEntitlementNotificationV05.mmEligibility}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEligibility = new MMMessageBuildingBlock() {
		{
			xmlTag = "Elgblty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Eligibility";
			definition = "Defines the dates determining eligibility.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05.mmEligibility);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> EligibilityDates1.mmObject();
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
				name = "MeetingEntitlementNotificationV04";
				definition = "Scope\r\nAn account servicer sends the MeetingEntitlementNotification to an issuer, its agent, an intermediary or an account owner to advise the entitlement in relation to a shareholders meeting.\r\nUsage\r\nThis message is sent to advise the quantity of securities held by an account owner. The balance is specified for the securities for which the meeting is taking place.\r\nThis entitlement message is sent by the account servicer or the registrar to an intermediary, the issuer's agent or the issuer. It is also sent between the account servicer and the account owner or the party holding the right to vote.\r\nThe message is also used to amend a previously sent MeetingEntitlementNotification. To notify an update, the RelatedReference must be included in the message.";
				nextVersions_lazy = () -> Arrays.asList(MeetingEntitlementNotificationV05.mmObject());
				previousVersion_lazy = () -> MeetingEntitlementNotificationV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ProxyVotingISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgEntitlmntNtfctn";
				businessArea_lazy = () -> SecuritiesEventsPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04.mmIdentification,
						com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04.mmRelatedReference, com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04.mmMeetingReference,
						com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04.mmNotifyingParty, com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04.mmSecurity,
						com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04.mmEligibility, com.tools20022.repository.area.seev.MeetingEntitlementNotificationV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "003";
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

	public MessageIdentification getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(MessageIdentification relatedReference) {
		this.relatedReference = relatedReference;
	}

	public MeetingReference4 getMeetingReference() {
		return meetingReference;
	}

	public void setMeetingReference(MeetingReference4 meetingReference) {
		this.meetingReference = meetingReference;
	}

	public PartyIdentification9Choice getNotifyingParty() {
		return notifyingParty;
	}

	public void setNotifyingParty(PartyIdentification9Choice notifyingParty) {
		this.notifyingParty = notifyingParty;
	}

	public List<SecurityPosition7> getSecurity() {
		return security;
	}

	public void setSecurity(List<SecurityPosition7> security) {
		this.security = security;
	}

	public EligibilityDates1 getEligibility() {
		return eligibility;
	}

	public void setEligibility(EligibilityDates1 eligibility) {
		this.eligibility = eligibility;
	}

	public List<Extension2> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension2> extension) {
		this.extension = extension;
	}
}
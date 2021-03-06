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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsPreviousVersion;
import com.tools20022.repository.choice.PartyIdentification9Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import com.tools20022.repository.msgset.ProxyVotingISOPreviousversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An issuer, its agent or an intermediary sends the
 * MeetingVoteExecutionConfirmation message to confirm to the Sender of the
 * MeetingInstruction message, the execution of their voting instruction.<br>
 * <b>Usage</b><br>
 * This message is sent after the shareholders meeting has taken place. The
 * Sender of this message confirms the execution of the vote at the meeting and
 * confirms that the vote has been processed as instructed via the
 * MeetingInstruction message.<br>
 * This messages is sent if the Sender of the MeetingInstruction message has
 * requested such a confirmation or if market practice or regulation stipulates
 * the need for a full audit trail.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.007.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsPreviousVersion
 * SecuritiesEventsPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04#mmIdentification
 * MeetingVoteExecutionConfirmationV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04#mmRelatedReference
 * MeetingVoteExecutionConfirmationV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04#mmMeetingReference
 * MeetingVoteExecutionConfirmationV04.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04#mmReportingParty
 * MeetingVoteExecutionConfirmationV04.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04#mmSecurityIdentification
 * MeetingVoteExecutionConfirmationV04.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04#mmVoteInstructions
 * MeetingVoteExecutionConfirmationV04.mmVoteInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04#mmExtension
 * MeetingVoteExecutionConfirmationV04.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ProxyVotingISOPreviousversion
 * ProxyVotingISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MtgVoteExctnConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingVoteExecutionConfirmationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn issuer, its agent or an intermediary sends the MeetingVoteExecutionConfirmation message to confirm to the Sender of the MeetingInstruction message, the execution of their voting instruction.\r\nUsage\r\nThis message is sent after the shareholders meeting has taken place. The Sender of this message confirms the execution of the vote at the meeting and confirms that the vote has been processed as instructed via the MeetingInstruction message.\r\nThis messages is sent if the Sender of the MeetingInstruction message has requested such a confirmation or if market practice or regulation stipulates the need for a full audit trail."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV05
 * MeetingVoteExecutionConfirmationV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV03
 * MeetingVoteExecutionConfirmationV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingVoteExecutionConfirmationV04", propOrder = {"identification", "relatedReference", "meetingReference", "reportingParty", "securityIdentification", "voteInstructions", "extension"})
public class MeetingVoteExecutionConfirmationV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected MessageIdentification1 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the vote execution confirmation message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, MessageIdentification1> mmIdentification = new MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, MessageIdentification1>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the vote execution confirmation message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(MeetingVoteExecutionConfirmationV04 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(MeetingVoteExecutionConfirmationV04 obj, MessageIdentification1 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "RltdRef", required = true)
	protected MessageIdentification relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification
	 * MessageIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the meeting instruction message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV05#mmRelatedReference
	 * MeetingVoteExecutionConfirmationV05.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, MessageIdentification> mmRelatedReference = new MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, MessageIdentification>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Identifies the meeting instruction message.";
			nextVersions_lazy = () -> Arrays.asList(MeetingVoteExecutionConfirmationV05.mmRelatedReference);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification.mmObject();
		}

		@Override
		public MessageIdentification getValue(MeetingVoteExecutionConfirmationV04 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(MeetingVoteExecutionConfirmationV04 obj, MessageIdentification value) {
			obj.setRelatedReference(value);
		}
	};
	@XmlElement(name = "MtgRef", required = true)
	protected MeetingReference4 meetingReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference4
	 * MeetingReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Series of elements which allow to identify a meeting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV05#mmMeetingReference
	 * MeetingVoteExecutionConfirmationV05.mmMeetingReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, MeetingReference4> mmMeetingReference = new MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, MeetingReference4>() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			nextVersions_lazy = () -> Arrays.asList(MeetingVoteExecutionConfirmationV05.mmMeetingReference);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingReference4.mmObject();
		}

		@Override
		public MeetingReference4 getValue(MeetingVoteExecutionConfirmationV04 obj) {
			return obj.getMeetingReference();
		}

		@Override
		public void setValue(MeetingVoteExecutionConfirmationV04 obj, MeetingReference4 value) {
			obj.setMeetingReference(value);
		}
	};
	@XmlElement(name = "RptgPty", required = true)
	protected PartyIdentification9Choice reportingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice
	 * PartyIdentification9Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party confirming the votes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, PartyIdentification9Choice> mmReportingParty = new MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, PartyIdentification9Choice>() {
		{
			xmlTag = "RptgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingParty";
			definition = "Party confirming the votes.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification9Choice.mmObject();
		}

		@Override
		public PartyIdentification9Choice getValue(MeetingVoteExecutionConfirmationV04 obj) {
			return obj.getReportingParty();
		}

		@Override
		public void setValue(MeetingVoteExecutionConfirmationV04 obj, PartyIdentification9Choice value) {
			obj.setReportingParty(value);
		}
	};
	@XmlElement(name = "SctyId", required = true)
	protected SecurityIdentification11 securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11
	 * SecurityIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the securities for which the meeting is organised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV05#mmFinancialInstrumentIdentification
	 * MeetingVoteExecutionConfirmationV05.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, SecurityIdentification11> mmSecurityIdentification = new MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, SecurityIdentification11>() {
		{
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the securities for which the meeting is organised.";
			nextVersions_lazy = () -> Arrays.asList(MeetingVoteExecutionConfirmationV05.mmFinancialInstrumentIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification11.mmObject();
		}

		@Override
		public SecurityIdentification11 getValue(MeetingVoteExecutionConfirmationV04 obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(MeetingVoteExecutionConfirmationV04 obj, SecurityIdentification11 value) {
			obj.setSecurityIdentification(value);
		}
	};
	@XmlElement(name = "VoteInstrs", required = true)
	protected List<DetailedInstructionStatus9> voteInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9
	 * DetailedInstructionStatus9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteInstrs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how a party has voted for each agenda item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV05#mmVoteInstructions
	 * MeetingVoteExecutionConfirmationV05.mmVoteInstructions}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, List<DetailedInstructionStatus9>> mmVoteInstructions = new MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, List<DetailedInstructionStatus9>>() {
		{
			xmlTag = "VoteInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructions";
			definition = "Specifies how a party has voted for each agenda item.";
			nextVersions_lazy = () -> Arrays.asList(MeetingVoteExecutionConfirmationV05.mmVoteInstructions);
			minOccurs = 1;
			complexType_lazy = () -> DetailedInstructionStatus9.mmObject();
		}

		@Override
		public List<DetailedInstructionStatus9> getValue(MeetingVoteExecutionConfirmationV04 obj) {
			return obj.getVoteInstructions();
		}

		@Override
		public void setValue(MeetingVoteExecutionConfirmationV04 obj, List<DetailedInstructionStatus9> value) {
			obj.setVoteInstructions(value);
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension2> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension2
	 * Extension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, List<Extension2>> mmExtension = new MMMessageBuildingBlock<MeetingVoteExecutionConfirmationV04, List<Extension2>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension2.mmObject();
		}

		@Override
		public List<Extension2> getValue(MeetingVoteExecutionConfirmationV04 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(MeetingVoteExecutionConfirmationV04 obj, List<Extension2> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingVoteExecutionConfirmationV04";
				definition = "Scope\r\nAn issuer, its agent or an intermediary sends the MeetingVoteExecutionConfirmation message to confirm to the Sender of the MeetingInstruction message, the execution of their voting instruction.\r\nUsage\r\nThis message is sent after the shareholders meeting has taken place. The Sender of this message confirms the execution of the vote at the meeting and confirms that the vote has been processed as instructed via the MeetingInstruction message.\r\nThis messages is sent if the Sender of the MeetingInstruction message has requested such a confirmation or if market practice or regulation stipulates the need for a full audit trail.";
				nextVersions_lazy = () -> Arrays.asList(MeetingVoteExecutionConfirmationV05.mmObject());
				previousVersion_lazy = () -> MeetingVoteExecutionConfirmationV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ProxyVotingISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgVoteExctnConf";
				businessArea_lazy = () -> SecuritiesEventsPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04.mmIdentification,
						com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04.mmRelatedReference, com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04.mmMeetingReference,
						com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04.mmReportingParty, com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04.mmSecurityIdentification,
						com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04.mmVoteInstructions, com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "007";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingVoteExecutionConfirmationV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getIdentification() {
		return identification;
	}

	public MeetingVoteExecutionConfirmationV04 setIdentification(MessageIdentification1 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public MessageIdentification getRelatedReference() {
		return relatedReference;
	}

	public MeetingVoteExecutionConfirmationV04 setRelatedReference(MessageIdentification relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public MeetingReference4 getMeetingReference() {
		return meetingReference;
	}

	public MeetingVoteExecutionConfirmationV04 setMeetingReference(MeetingReference4 meetingReference) {
		this.meetingReference = Objects.requireNonNull(meetingReference);
		return this;
	}

	public PartyIdentification9Choice getReportingParty() {
		return reportingParty;
	}

	public MeetingVoteExecutionConfirmationV04 setReportingParty(PartyIdentification9Choice reportingParty) {
		this.reportingParty = Objects.requireNonNull(reportingParty);
		return this;
	}

	public SecurityIdentification11 getSecurityIdentification() {
		return securityIdentification;
	}

	public MeetingVoteExecutionConfirmationV04 setSecurityIdentification(SecurityIdentification11 securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public List<DetailedInstructionStatus9> getVoteInstructions() {
		return voteInstructions == null ? voteInstructions = new ArrayList<>() : voteInstructions;
	}

	public MeetingVoteExecutionConfirmationV04 setVoteInstructions(List<DetailedInstructionStatus9> voteInstructions) {
		this.voteInstructions = Objects.requireNonNull(voteInstructions);
		return this;
	}

	public List<Extension2> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public MeetingVoteExecutionConfirmationV04 setExtension(List<Extension2> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.007.001.04")
	static public class Document {
		@XmlElement(name = "MtgVoteExctnConf", required = true)
		public MeetingVoteExecutionConfirmationV04 messageBody;
	}
}
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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.ResolutionStatus1Code;
import com.tools20022.repository.codeset.ResolutionType1Code;
import com.tools20022.repository.codeset.VoteInstruction1Code;
import com.tools20022.repository.codeset.VoteInstruction2Code;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Resolution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies an item in the agenda of the meeting. Some resolutions are
 * submitted to the vote of the security holders, some are presented for
 * information only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution2#mmIssuerLabel
 * Resolution2.mmIssuerLabel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution2#mmDescription
 * Resolution2.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution2#mmTitle
 * Resolution2.mmTitle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution2#mmType
 * Resolution2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution2#mmForInformationOnly
 * Resolution2.mmForInformationOnly}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution2#mmStatus
 * Resolution2.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution2#mmSubmittedBySecurityHolder
 * Resolution2.mmSubmittedBySecurityHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution2#mmVoteInstructionType
 * Resolution2.mmVoteInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution2#mmManagementRecommendation
 * Resolution2.mmManagementRecommendation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution2#mmNotifyingPartyRecommendation
 * Resolution2.mmNotifyingPartyRecommendation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmResolution
 * MeetingNotificationV02.mmResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmResolution
 * MeetingNotificationV03.mmResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmResolution
 * MeetingNotificationV04.mmResolution}</li>
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
 * "Resolution2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an item in the agenda of the meeting. Some resolutions are submitted to the vote of the security holders, some are presented for information only."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution3 Resolution3}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class Resolution2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text issuerLabel;
	/**
	 * Numbering of the resolution as specified by the issuer or its agent.
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
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmIssuerLabel
	 * Resolution.mmIssuerLabel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2 Resolution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrLabl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numbering of the resolution as specified by the issuer or  its agent."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#mmIssuerLabel
	 * Resolution3.mmIssuerLabel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerLabel = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Resolution.mmIssuerLabel;
			componentContext_lazy = () -> Resolution2.mmObject();
			isDerived = false;
			xmlTag = "IssrLabl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerLabel";
			definition = "Numbering of the resolution as specified by the issuer or  its agent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution3.mmIssuerLabel);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max1025Text description;
	/**
	 * Free text description of the resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1025Text
	 * Max1025Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmDescription
	 * Resolution.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2 Resolution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free text description of the resolution."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#mmDescription
	 * Resolution3.mmDescription}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDescription = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Resolution.mmDescription;
			componentContext_lazy = () -> Resolution2.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Free text description of the resolution.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution3.mmDescription);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};
	protected Max350Text title;
	/**
	 * Abbreviated description of the resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmTitle
	 * Resolution.mmTitle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2 Resolution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Titl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Title"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Abbreviated description of the resolution."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#mmTitle
	 * Resolution3.mmTitle}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTitle = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Resolution.mmTitle;
			componentContext_lazy = () -> Resolution2.mmObject();
			isDerived = false;
			xmlTag = "Titl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Title";
			definition = "Abbreviated description of the resolution.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution3.mmTitle);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ResolutionType1Code type;
	/**
	 * Indicates whether a resolution is ordinary, extraordinary or special.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionType1Code
	 * ResolutionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmType
	 * Resolution.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2 Resolution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a resolution is ordinary, extraordinary or special."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#mmType
	 * Resolution3.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Resolution.mmType;
			componentContext_lazy = () -> Resolution2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates whether a resolution is ordinary, extraordinary or special.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution3.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResolutionType1Code.mmObject();
		}
	};
	protected YesNoIndicator forInformationOnly;
	/**
	 * Indicates whether the resolution is listed for information or for voting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmForInformationOnly
	 * Resolution.mmForInformationOnly}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2 Resolution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ForInfOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForInformationOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resolution is listed for information or for voting."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution3#mmForInformationOnly
	 * Resolution3.mmForInformationOnly}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForInformationOnly = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Resolution.mmForInformationOnly;
			componentContext_lazy = () -> Resolution2.mmObject();
			isDerived = false;
			xmlTag = "ForInfOnly";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForInformationOnly";
			definition = "Indicates whether the resolution is listed for information or for voting.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution3.mmForInformationOnly);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ResolutionStatus1Code status;
	/**
	 * Indicates whether the resolution is active or withdrawn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionStatus1Code
	 * ResolutionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmMeetingResolutionStatus
	 * MeetingStatus.mmMeetingResolutionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2 Resolution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the resolution is active or withdrawn."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#mmStatus
	 * Resolution3.mmStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmMeetingResolutionStatus;
			componentContext_lazy = () -> Resolution2.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Indicates whether the resolution is active or withdrawn.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution3.mmStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResolutionStatus1Code.mmObject();
		}
	};
	protected YesNoIndicator submittedBySecurityHolder;
	/**
	 * Indicates whether the resolution has been submitted by the security
	 * holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmSubmittedBySecurityHolder
	 * Resolution.mmSubmittedBySecurityHolder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2 Resolution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmittdBySctyHldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmittedBySecurityHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resolution has been submitted by the security holder."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution3#mmSubmittedBySecurityHolder
	 * Resolution3.mmSubmittedBySecurityHolder}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubmittedBySecurityHolder = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Resolution.mmSubmittedBySecurityHolder;
			componentContext_lazy = () -> Resolution2.mmObject();
			isDerived = false;
			xmlTag = "SubmittdBySctyHldr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittedBySecurityHolder";
			definition = "Indicates whether the resolution has been submitted by the security holder.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution3.mmSubmittedBySecurityHolder);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<VoteInstruction2Code> voteInstructionType;
	/**
	 * Vote options allowed at the resolution level. When specified, it
	 * supersedes the vote options given for the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction2Code
	 * VoteInstruction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2 Resolution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteInstrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote options allowed at the resolution level. When specified, it supersedes the vote options given for the meeting."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution3#mmVoteInstructionType
	 * Resolution3.mmVoteInstructionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteInstructionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Resolution2.mmObject();
			isDerived = false;
			xmlTag = "VoteInstrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionType";
			definition = "Vote options allowed at the resolution level. When specified, it supersedes the vote options given for the meeting.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution3.mmVoteInstructionType);
			maxOccurs = 8;
			minOccurs = 0;
			simpleType_lazy = () -> VoteInstruction2Code.mmObject();
		}
	};
	protected VoteInstruction1Code managementRecommendation;
	/**
	 * Indicates how the management of the issuing company wishes the security
	 * holders to vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction1Code
	 * VoteInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmManagementRecommendation
	 * Resolution.mmManagementRecommendation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2 Resolution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MgmtRcmmndtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementRecommendation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how the management of the issuing company wishes the security holders to vote."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution3#mmManagementRecommendation
	 * Resolution3.mmManagementRecommendation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmManagementRecommendation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Resolution.mmManagementRecommendation;
			componentContext_lazy = () -> Resolution2.mmObject();
			isDerived = false;
			xmlTag = "MgmtRcmmndtn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManagementRecommendation";
			definition = "Indicates how the management of the issuing company wishes the security holders to vote.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution3.mmManagementRecommendation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> VoteInstruction1Code.mmObject();
		}
	};
	protected VoteInstruction1Code notifyingPartyRecommendation;
	/**
	 * Indicates how the notifying party recommends that the security holders
	 * vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction1Code
	 * VoteInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmNotifyingPartyRecommendation
	 * Resolution.mmNotifyingPartyRecommendation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2 Resolution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtifngPtyRcmmndtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotifyingPartyRecommendation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how the notifying party recommends that the security holders vote."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Resolution3#mmNotifyingPartyRecommendation
	 * Resolution3.mmNotifyingPartyRecommendation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotifyingPartyRecommendation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Resolution.mmNotifyingPartyRecommendation;
			componentContext_lazy = () -> Resolution2.mmObject();
			isDerived = false;
			xmlTag = "NtifngPtyRcmmndtn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyingPartyRecommendation";
			definition = "Indicates how the notifying party recommends that the security holders vote.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution3.mmNotifyingPartyRecommendation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> VoteInstruction1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution2.mmIssuerLabel, com.tools20022.repository.msg.Resolution2.mmDescription, com.tools20022.repository.msg.Resolution2.mmTitle,
						com.tools20022.repository.msg.Resolution2.mmType, com.tools20022.repository.msg.Resolution2.mmForInformationOnly, com.tools20022.repository.msg.Resolution2.mmStatus,
						com.tools20022.repository.msg.Resolution2.mmSubmittedBySecurityHolder, com.tools20022.repository.msg.Resolution2.mmVoteInstructionType, com.tools20022.repository.msg.Resolution2.mmManagementRecommendation,
						com.tools20022.repository.msg.Resolution2.mmNotifyingPartyRecommendation);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV02.mmResolution, com.tools20022.repository.area.seev.MeetingNotificationV03.mmResolution,
						com.tools20022.repository.area.seev.MeetingNotificationV04.mmResolution);
				trace_lazy = () -> Resolution.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Resolution2";
				definition = "Specifies an item in the agenda of the meeting. Some resolutions are submitted to the vote of the security holders, some are presented for information only.";
				nextVersions_lazy = () -> Arrays.asList(Resolution3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIssuerLabel() {
		return issuerLabel;
	}

	public void setIssuerLabel(Max35Text issuerLabel) {
		this.issuerLabel = issuerLabel;
	}

	public Max1025Text getDescription() {
		return description;
	}

	public void setDescription(Max1025Text description) {
		this.description = description;
	}

	public Max350Text getTitle() {
		return title;
	}

	public void setTitle(Max350Text title) {
		this.title = title;
	}

	public ResolutionType1Code getType() {
		return type;
	}

	public void setType(ResolutionType1Code type) {
		this.type = type;
	}

	public YesNoIndicator getForInformationOnly() {
		return forInformationOnly;
	}

	public void setForInformationOnly(YesNoIndicator forInformationOnly) {
		this.forInformationOnly = forInformationOnly;
	}

	public ResolutionStatus1Code getStatus() {
		return status;
	}

	public void setStatus(ResolutionStatus1Code status) {
		this.status = status;
	}

	public YesNoIndicator getSubmittedBySecurityHolder() {
		return submittedBySecurityHolder;
	}

	public void setSubmittedBySecurityHolder(YesNoIndicator submittedBySecurityHolder) {
		this.submittedBySecurityHolder = submittedBySecurityHolder;
	}

	public List<VoteInstruction2Code> getVoteInstructionType() {
		return voteInstructionType;
	}

	public void setVoteInstructionType(List<VoteInstruction2Code> voteInstructionType) {
		this.voteInstructionType = voteInstructionType;
	}

	public VoteInstruction1Code getManagementRecommendation() {
		return managementRecommendation;
	}

	public void setManagementRecommendation(VoteInstruction1Code managementRecommendation) {
		this.managementRecommendation = managementRecommendation;
	}

	public VoteInstruction1Code getNotifyingPartyRecommendation() {
		return notifyingPartyRecommendation;
	}

	public void setNotifyingPartyRecommendation(VoteInstruction1Code notifyingPartyRecommendation) {
		this.notifyingPartyRecommendation = notifyingPartyRecommendation;
	}
}
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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.DateFormat2Choice;
import com.tools20022.repository.choice.LocationFormat1Choice;
import com.tools20022.repository.choice.QuorumQuantity1Choice;
import com.tools20022.repository.codeset.MeetingDateStatus1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Meeting;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the physical parameters of a shareholders meeting. Several dates
 * and places can be defined for a meeting
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting3#mmDateAndTime
 * Meeting3.mmDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting3#mmDateStatus
 * Meeting3.mmDateStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting3#mmQuorumRequired
 * Meeting3.mmQuorumRequired}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting3#mmLocation
 * Meeting3.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting3#mmQuorumQuantity
 * Meeting3.mmQuorumQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmMeetingDetails
 * MeetingNotificationV03.mmMeetingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmMeetingDetails
 * MeetingNotificationV04.mmMeetingDetails}</li>
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
 * "Meeting3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the physical parameters of a shareholders meeting. Several dates and places can be defined for a meeting"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting4 Meeting4}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class Meeting3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateFormat2Choice dateAndTime;
	/**
	 * Date and time at which the meeting will take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDateAndTime
	 * Meeting.mmDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting3
	 * Meeting3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the meeting will take place."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting4#mmDateAndTime
	 * Meeting4.mmDateAndTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateAndTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Meeting.mmDateAndTime;
			componentContext_lazy = () -> Meeting3.mmObject();
			isDerived = false;
			xmlTag = "DtAndTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAndTime";
			definition = "Date and time at which the meeting will take place.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Meeting4.mmDateAndTime);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	protected MeetingDateStatus1Code dateStatus;
	/**
	 * Indicates the status of a meeting date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatus1Code
	 * MeetingDateStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDateStatus
	 * Meeting.mmDateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting3
	 * Meeting3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the status of a meeting date."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting4#mmDateStatus
	 * Meeting4.mmDateStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Meeting.mmDateStatus;
			componentContext_lazy = () -> Meeting3.mmObject();
			isDerived = false;
			xmlTag = "DtSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateStatus";
			definition = "Indicates the status of a meeting date.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Meeting4.mmDateStatus);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MeetingDateStatus1Code.mmObject();
		}
	};
	protected YesNoIndicator quorumRequired;
	/**
	 * Specifies whether a minimum number of security representation is required
	 * to hold a meeting.
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
	 * {@linkplain com.tools20022.repository.entity.Quorum#mmQuorumRequired
	 * Quorum.mmQuorumRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting3
	 * Meeting3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QrmReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuorumRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a minimum number of security representation is required to hold a meeting."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting4#mmQuorumRequired
	 * Meeting4.mmQuorumRequired}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuorumRequired = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Quorum.mmQuorumRequired;
			componentContext_lazy = () -> Meeting3.mmObject();
			isDerived = false;
			xmlTag = "QrmReqrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuorumRequired";
			definition = "Specifies whether a minimum number of security representation is required to hold a meeting.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Meeting4.mmQuorumRequired);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<LocationFormat1Choice> location;
	/**
	 * Specifies location where meeting will take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LocationFormat1Choice
	 * LocationFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmMeetingLocation
	 * Meeting.mmMeetingLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting3
	 * Meeting3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies location where meeting will take place."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting4#mmLocation
	 * Meeting4.mmLocation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Meeting.mmMeetingLocation;
			componentContext_lazy = () -> Meeting3.mmObject();
			isDerived = false;
			xmlTag = "Lctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Location";
			definition = "Specifies location where meeting will take place.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Meeting4.mmLocation);
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LocationFormat1Choice.mmObject();
		}
	};
	protected QuorumQuantity1Choice quorumQuantity;
	/**
	 * Minimum quantity of securities required to hold a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.QuorumQuantity1Choice
	 * QuorumQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quorum#mmQuantity
	 * Quorum.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting3
	 * Meeting3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QrmQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuorumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities required to hold a meeting."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting4#mmQuorumQuantity
	 * Meeting4.mmQuorumQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuorumQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Quorum.mmQuantity;
			componentContext_lazy = () -> Meeting3.mmObject();
			isDerived = false;
			xmlTag = "QrmQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuorumQuantity";
			definition = "Minimum quantity of securities required to hold a meeting.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Meeting4.mmQuorumQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> QuorumQuantity1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Meeting3.mmDateAndTime, com.tools20022.repository.msg.Meeting3.mmDateStatus, com.tools20022.repository.msg.Meeting3.mmQuorumRequired,
						com.tools20022.repository.msg.Meeting3.mmLocation, com.tools20022.repository.msg.Meeting3.mmQuorumQuantity);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV03.mmMeetingDetails, com.tools20022.repository.area.seev.MeetingNotificationV04.mmMeetingDetails);
				trace_lazy = () -> Meeting.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Meeting3";
				definition = "Specifies the physical parameters of a shareholders meeting. Several dates and places can be defined for a meeting";
				nextVersions_lazy = () -> Arrays.asList(Meeting4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DateFormat2Choice getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(DateFormat2Choice dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public MeetingDateStatus1Code getDateStatus() {
		return dateStatus;
	}

	public void setDateStatus(MeetingDateStatus1Code dateStatus) {
		this.dateStatus = dateStatus;
	}

	public YesNoIndicator getQuorumRequired() {
		return quorumRequired;
	}

	public void setQuorumRequired(YesNoIndicator quorumRequired) {
		this.quorumRequired = quorumRequired;
	}

	public List<LocationFormat1Choice> getLocation() {
		return location;
	}

	public void setLocation(List<LocationFormat1Choice> location) {
		this.location = location;
	}

	public QuorumQuantity1Choice getQuorumQuantity() {
		return quorumQuantity;
	}

	public void setQuorumQuantity(QuorumQuantity1Choice quorumQuantity) {
		this.quorumQuantity = quorumQuantity;
	}
}
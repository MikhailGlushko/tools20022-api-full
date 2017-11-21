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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.EventWorkflowStatus1Code;
import com.tools20022.repository.codeset.IssuerStatus1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding notification general information
 * details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmPlaceAndName
 * NotificationGeneralInformationExtension1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmEventStatus
 * NotificationGeneralInformationExtension1.mmEventStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmCreateDateAndTime
 * NotificationGeneralInformationExtension1.mmCreateDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmUpdateDateAndTime
 * NotificationGeneralInformationExtension1.mmUpdateDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmApprovedDate
 * NotificationGeneralInformationExtension1.mmApprovedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmMatchDate
 * NotificationGeneralInformationExtension1.mmMatchDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmActiveUntilDate
 * NotificationGeneralInformationExtension1.mmActiveUntilDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmServiceLevelAgreementPeriod
 * NotificationGeneralInformationExtension1.mmServiceLevelAgreementPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmIssuerStatus
 * NotificationGeneralInformationExtension1.mmIssuerStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1#mmValidationNotSupportedReason
 * NotificationGeneralInformationExtension1.mmValidationNotSupportedReason}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationGeneralInformationExtension1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding notification general information details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NotificationGeneralInformationExtension1", propOrder = {"placeAndName", "eventStatus", "createDateAndTime", "updateDateAndTime", "approvedDate", "matchDate", "activeUntilDate", "serviceLevelAgreementPeriod",
		"issuerStatus", "validationNotSupportedReason"})
public class NotificationGeneralInformationExtension1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected EventWorkflowStatus1Code eventStatus;
	/**
	 * Workflow status of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
	 * EventWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Workflow status of the event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "EvtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStatus";
			definition = "Workflow status of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventWorkflowStatus1Code.mmObject();
		}
	};
	protected ISODateTime createDateAndTime;
	/**
	 * Date and time when DTCC (The Depository Trust and Clearing Corporation)
	 * created the announcement record.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CretDtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreateDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when DTCC  (The Depository Trust and Clearing Corporation) created the announcement record."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreateDateAndTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "CretDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreateDateAndTime";
			definition = "Date and time when DTCC  (The Depository Trust and Clearing Corporation) created the announcement record.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime updateDateAndTime;
	/**
	 * Date and time when DTCC (The Depository Trust and Clearing Corporation)
	 * last updated the announcement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdDtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when DTCC  (The Depository Trust and Clearing Corporation) last updated the announcement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUpdateDateAndTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "UpdDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateDateAndTime";
			definition = "Date and time when DTCC  (The Depository Trust and Clearing Corporation) last updated the announcement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODate approvedDate;
	/**
	 * Date by which the announcement is set to approve event status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApprvdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the announcement is set to approve event status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApprovedDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "ApprvdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovedDate";
			definition = "Date by which the announcement is set to approve event status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate matchDate;
	/**
	 * Date used to match records from multiple vendors to the same event. It is
	 * typically the first key date on the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used to match records from multiple vendors to the same event. It is typically the first key date on the event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "MtchDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchDate";
			definition = "Date used to match records from multiple vendors to the same event. It is typically the first key date on the event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate activeUntilDate;
	/**
	 * Date until which the event will remain in an active status on DTCC (The
	 * Depository Trust and Clearing Corporation) system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvUntilDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveUntilDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date until which the event will remain in an active status on DTCC  (The Depository Trust and Clearing Corporation) system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActiveUntilDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "ActvUntilDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveUntilDate";
			definition = "Date until which the event will remain in an active status on DTCC  (The Depository Trust and Clearing Corporation) system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Period3 serviceLevelAgreementPeriod;
	/**
	 * Start date and end date of the service level agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period3 Period3}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvlAgrmtPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevelAgreementPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Start date and end date of the service level agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceLevelAgreementPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "SvcLvlAgrmtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreementPeriod";
			definition = "Start date and end date of the service level agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period3.mmObject();
		}
	};
	protected IssuerStatus1Code issuerStatus;
	/**
	 * Status of the event as announced by the issuer/offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerStatus1Code
	 * IssuerStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the event as announced by the issuer/offeror."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "IssrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerStatus";
			definition = "Status of the event as announced by the issuer/offeror.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IssuerStatus1Code.mmObject();
		}
	};
	protected Max4AlphaNumericText validationNotSupportedReason;
	/**
	 * Specifies a reason why a corporate action will not be supported by the
	 * validation service. This is usually due to the event type or the product
	 * (security) type. The list of values will be provided externally to the
	 * schema.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NotificationGeneralInformationExtension1
	 * NotificationGeneralInformationExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnNotSpprtdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationNotSupportedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a reason why a corporate action will not be supported by the validation service. This is usually due to the event type or the product (security) type. The list of values will be provided externally to the schema."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidationNotSupportedReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NotificationGeneralInformationExtension1.mmObject();
			isDerived = false;
			xmlTag = "VldtnNotSpprtdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationNotSupportedReason";
			definition = "Specifies a reason why a corporate action will not be supported by the validation service. This is usually due to the event type or the product (security) type. The list of values will be provided externally to the schema.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NotificationGeneralInformationExtension1.mmPlaceAndName, NotificationGeneralInformationExtension1.mmEventStatus, NotificationGeneralInformationExtension1.mmCreateDateAndTime,
						NotificationGeneralInformationExtension1.mmUpdateDateAndTime, NotificationGeneralInformationExtension1.mmApprovedDate, NotificationGeneralInformationExtension1.mmMatchDate,
						NotificationGeneralInformationExtension1.mmActiveUntilDate, NotificationGeneralInformationExtension1.mmServiceLevelAgreementPeriod, NotificationGeneralInformationExtension1.mmIssuerStatus,
						NotificationGeneralInformationExtension1.mmValidationNotSupportedReason);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NotificationGeneralInformationExtension1";
				definition = "Provides additional information regarding notification general information details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "EvtSts", required = true)
	public EventWorkflowStatus1Code getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(EventWorkflowStatus1Code eventStatus) {
		this.eventStatus = eventStatus;
	}

	@XmlElement(name = "CretDtAndTm", required = true)
	public ISODateTime getCreateDateAndTime() {
		return createDateAndTime;
	}

	public void setCreateDateAndTime(ISODateTime createDateAndTime) {
		this.createDateAndTime = createDateAndTime;
	}

	@XmlElement(name = "UpdDtAndTm")
	public ISODateTime getUpdateDateAndTime() {
		return updateDateAndTime;
	}

	public void setUpdateDateAndTime(ISODateTime updateDateAndTime) {
		this.updateDateAndTime = updateDateAndTime;
	}

	@XmlElement(name = "ApprvdDt")
	public ISODate getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(ISODate approvedDate) {
		this.approvedDate = approvedDate;
	}

	@XmlElement(name = "MtchDt")
	public ISODate getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(ISODate matchDate) {
		this.matchDate = matchDate;
	}

	@XmlElement(name = "ActvUntilDt")
	public ISODate getActiveUntilDate() {
		return activeUntilDate;
	}

	public void setActiveUntilDate(ISODate activeUntilDate) {
		this.activeUntilDate = activeUntilDate;
	}

	@XmlElement(name = "SvcLvlAgrmtPrd")
	public Period3 getServiceLevelAgreementPeriod() {
		return serviceLevelAgreementPeriod;
	}

	public void setServiceLevelAgreementPeriod(com.tools20022.repository.msg.Period3 serviceLevelAgreementPeriod) {
		this.serviceLevelAgreementPeriod = serviceLevelAgreementPeriod;
	}

	@XmlElement(name = "IssrSts")
	public IssuerStatus1Code getIssuerStatus() {
		return issuerStatus;
	}

	public void setIssuerStatus(IssuerStatus1Code issuerStatus) {
		this.issuerStatus = issuerStatus;
	}

	@XmlElement(name = "VldtnNotSpprtdRsn")
	public Max4AlphaNumericText getValidationNotSupportedReason() {
		return validationNotSupportedReason;
	}

	public void setValidationNotSupportedReason(Max4AlphaNumericText validationNotSupportedReason) {
		this.validationNotSupportedReason = validationNotSupportedReason;
	}
}
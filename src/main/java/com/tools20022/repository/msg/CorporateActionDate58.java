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
import com.tools20022.repository.choice.DateFormat34Choice;
import com.tools20022.repository.choice.DateFormat41Choice;
import com.tools20022.repository.entity.CorporateActionEvent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies corporate action dates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmAnnouncementDate
 * CorporateActionDate58.mmAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmCertificationDeadline
 * CorporateActionDate58.mmCertificationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmCourtApprovalDate
 * CorporateActionDate58.mmCourtApprovalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmEarlyClosingDate
 * CorporateActionDate58.mmEarlyClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmEffectiveDate
 * CorporateActionDate58.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmEqualisationDate
 * CorporateActionDate58.mmEqualisationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmFurtherDetailedAnnouncementDate
 * CorporateActionDate58.mmFurtherDetailedAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmFixingDate
 * CorporateActionDate58.mmFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmLotteryDate
 * CorporateActionDate58.mmLotteryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmNewMaturityDate
 * CorporateActionDate58.mmNewMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmMeetingDate
 * CorporateActionDate58.mmMeetingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmMarginFixingDate
 * CorporateActionDate58.mmMarginFixingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmProrationDate
 * CorporateActionDate58.mmProrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmRecordDate
 * CorporateActionDate58.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmRegistrationDeadline
 * CorporateActionDate58.mmRegistrationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmResultsPublicationDate
 * CorporateActionDate58.mmResultsPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmDeadlineToSplit
 * CorporateActionDate58.mmDeadlineToSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmDeadlineForTaxBreakdownInstruction
 * CorporateActionDate58.mmDeadlineForTaxBreakdownInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmTradingSuspendedDate
 * CorporateActionDate58.mmTradingSuspendedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmUnconditionalDate
 * CorporateActionDate58.mmUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmWhollyUnconditionalDate
 * CorporateActionDate58.mmWhollyUnconditionalDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmExDividendDate
 * CorporateActionDate58.mmExDividendDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmOfficialAnnouncementPublicationDate
 * CorporateActionDate58.mmOfficialAnnouncementPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmSpecialExDate
 * CorporateActionDate58.mmSpecialExDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmGuaranteedParticipationDate
 * CorporateActionDate58.mmGuaranteedParticipationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmElectionToCounterpartyMarketDeadline
 * CorporateActionDate58.mmElectionToCounterpartyMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmElectionToCounterpartyResponseDeadline
 * CorporateActionDate58.mmElectionToCounterpartyResponseDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmLapsedDate
 * CorporateActionDate58.mmLapsedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmPaymentDate
 * CorporateActionDate58.mmPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmThirdPartyDeadline
 * CorporateActionDate58.mmThirdPartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmEarlyThirdPartyDeadline
 * CorporateActionDate58.mmEarlyThirdPartyDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmMarketClaimTrackingEndDate
 * CorporateActionDate58.mmMarketClaimTrackingEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmLeadPlaintiffDeadline
 * CorporateActionDate58.mmLeadPlaintiffDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmFilingDate
 * CorporateActionDate58.mmFilingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmHearingDate
 * CorporateActionDate58.mmHearingDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "CorporateActionDate58"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies corporate action dates."</li>
 * </ul>
 */
public class CorporateActionDate58 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateFormat34Choice announcementDate;
	/**
	 * Date/time at which the issuer announced that a corporate action event
	 * will occur.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAnnouncementDate
	 * CorporateActionEvent.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the issuer announced that a corporate action event will occur."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAnnouncementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmAnnouncementDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Date/time at which the issuer announced that a corporate action event will occur.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice certificationDeadline;
	/**
	 * Deadline by which the beneficial ownership of securities must be
	 * declared.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmCertificationDeadline
	 * CorporateActionDeadline.mmCertificationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which the beneficial ownership of securities must be declared."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCertificationDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmCertificationDeadline;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "CertfctnDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationDeadline";
			definition = "Deadline by which the beneficial ownership of securities must be declared.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice courtApprovalDate;
	/**
	 * Date upon which the court provided approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmCourtApprovalDate
	 * ClassAction.mmCourtApprovalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrtApprvlDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtApprovalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date upon which the court provided approval."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCourtApprovalDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ClassAction.mmCourtApprovalDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "CrtApprvlDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourtApprovalDate";
			definition = "Date upon which the court provided approval.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice earlyClosingDate;
	/**
	 * First possible early closing date of an offer if different from the
	 * expiry date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyClosingDate
	 * CorporateActionDeadline.mmEarlyClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First possible early closing date of an offer if different from the expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEarlyClosingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmEarlyClosingDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "EarlyClsgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyClosingDate";
			definition = "First possible early closing date of an offer if different from the expiry date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice effectiveDate;
	/**
	 * Date/time at which an event is officially effective from the issuer's
	 * perspective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEffectiveDate
	 * CorporateActionEvent.mmEffectiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an event is officially effective from the issuer's perspective."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEffectiveDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmEffectiveDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time at which an event is officially effective from the issuer's perspective.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice equalisationDate;
	/**
	 * Date/Time on which all or part of any holding bought in a unit trust is
	 * subject to being treated as capital rather than income. This is normally
	 * one day after the previous distribution's ex date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation#mmDate
	 * Equalisation.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EqulstnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualisationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEqualisationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Equalisation.mmDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "EqulstnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualisationDate";
			definition = "Date/Time on which all or part of any holding bought in a unit trust is subject to being treated as capital rather than income. This is normally one day after the previous distribution's ex date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice furtherDetailedAnnouncementDate;
	/**
	 * Date/time at which additional information on the event will be announced,
	 * for example, exchange ratio announcement date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmFurtherDetailsAnnouncementDate
	 * CorporateActionEvent.mmFurtherDetailsAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrthrDtldAnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FurtherDetailedAnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which additional information on the event will be announced, for example, exchange ratio announcement date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFurtherDetailedAnnouncementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmFurtherDetailsAnnouncementDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "FrthrDtldAnncmntDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FurtherDetailedAnnouncementDate";
			definition = "Date/time at which additional information on the event will be announced, for example, exchange ratio announcement date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice fixingDate;
	/**
	 * Date/time at which an index / rate / price / value will be determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmOfferPriceFixingDate
	 * ProceedsDefinition.mmOfferPriceFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an index / rate / price / value will be determined."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFixingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmOfferPriceFixingDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "FxgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixingDate";
			definition = "Date/time at which an index / rate / price / value will be determined.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice lotteryDate;
	/**
	 * Date/time on which the lottery is run and applied to the holder's
	 * positions. This is also applicable to partial calls.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmLotteryDate
	 * Lottery.mmLotteryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLotteryDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Lottery.mmLotteryDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "LtryDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryDate";
			definition = "Date/time on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice newMaturityDate;
	/**
	 * Date/time to which the maturity date of an interest bearing security is
	 * extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewMtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewMaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time to which the maturity date of an interest bearing security is extended."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewMaturityDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Asset.mmMaturityDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "NewMtrtyDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewMaturityDate";
			definition = "Date/time to which the maturity date of an interest bearing security is extended.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice meetingDate;
	/**
	 * Date/time on which the bondholder's or shareholder's meeting will take
	 * place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDateAndTime
	 * Meeting.mmDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the bondholder's or shareholder's meeting will take place."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMeetingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Meeting.mmDateAndTime;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "MtgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingDate";
			definition = "Date/time on which the bondholder's or shareholder's meeting will take place.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice marginFixingDate;
	/**
	 * Date/time at which the margin rate will be determined .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmMarginFixingDate
	 * CorporateActionEvent.mmMarginFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnFxgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the margin rate will be determined ."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarginFixingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmMarginFixingDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "MrgnFxgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginFixingDate";
			definition = "Date/time at which the margin rate will be determined .";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice prorationDate;
	/**
	 * Date/time (and time) at which an issuer will determine the proration
	 * amount/quantity of an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProrationDate
	 * BiddingConditions.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrratnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time (and time) at which an issuer will determine the proration amount/quantity of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProrationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmProrationDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "PrratnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProrationDate";
			definition = "Date/time (and time) at which an issuer will determine the proration amount/quantity of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice recordDate;
	/**
	 * Date/time at which positions are struck at the end of the day to note
	 * which parties will receive the relevant amount of entitlement, due to be
	 * distributed on payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRecordDate
	 * CorporateActionDeadline.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which positions are struck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecordDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmRecordDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date/time at which positions are struck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice registrationDeadline;
	/**
	 * Date/time on which instructions to register or registration details will
	 * be accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRegistrationDeadline
	 * CorporateActionDeadline.mmRegistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which instructions to register or registration details will be accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegistrationDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmRegistrationDeadline;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "RegnDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDeadline";
			definition = "Date/time on which instructions to register or registration details will be accepted.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice resultsPublicationDate;
	/**
	 * Date/time on which results are published, for example, results of an
	 * offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmResultPublicationDate
	 * CorporateActionEvent.mmResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltsPblctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultsPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which results are published, for example, results of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResultsPublicationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmResultPublicationDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "RsltsPblctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultsPublicationDate";
			definition = "Date/time on which results are published, for example, results of an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice deadlineToSplit;
	/**
	 * Deadline by which instructions must be received to split securities, for
	 * example, of physical certificates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDeadlineToSplit
	 * CorporateActionDeadline.mmDeadlineToSplit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DdlnToSplt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineToSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which instructions must be received to split securities, for example, of physical certificates."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeadlineToSplit = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmDeadlineToSplit;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "DdlnToSplt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineToSplit";
			definition = "Deadline by which instructions must be received to split securities, for example, of physical certificates.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice deadlineForTaxBreakdownInstruction;
	/**
	 * Date/time on until which tax breakdown instructions will be accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmDeadlineForTaxBreakdownInstruction
	 * CorporateActionDeadline.mmDeadlineForTaxBreakdownInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DdlnForTaxBrkdwnInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineForTaxBreakdownInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on until which tax breakdown instructions will be accepted."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeadlineForTaxBreakdownInstruction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmDeadlineForTaxBreakdownInstruction;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "DdlnForTaxBrkdwnInstr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineForTaxBreakdownInstruction";
			definition = "Date/time on until which tax breakdown instructions will be accepted.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice tradingSuspendedDate;
	/**
	 * Date/time at which trading of a security is suspended as the result of an
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmTradingSuspendedDate
	 * CorporateActionDeadline.mmTradingSuspendedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSspdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSuspendedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which trading of a security is suspended as the result of an event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingSuspendedDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmTradingSuspendedDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "TradgSspdDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSuspendedDate";
			definition = "Date/time at which trading of a security is suspended as the result of an event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice unconditionalDate;
	/**
	 * Date/time upon which the terms of the take-over become unconditional as
	 * to acceptances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnconditionalDate
	 * CorporateActionEvent.mmUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UcondlDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time upon which the terms of the take-over become unconditional as to acceptances."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnconditionalDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmUnconditionalDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "UcondlDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnconditionalDate";
			definition = "Date/time upon which the terms of the take-over become unconditional as to acceptances.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice whollyUnconditionalDate;
	/**
	 * Date/time at on which all conditions, including regulatory, legal etc.
	 * pertaining to the take-over, have been met.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmWhollyUnconditionalDate
	 * CorporateActionEvent.mmWhollyUnconditionalDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhlyUcondlDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhollyUnconditionalDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWhollyUnconditionalDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmWhollyUnconditionalDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "WhlyUcondlDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhollyUnconditionalDate";
			definition = "Date/time at on which all conditions, including regulatory, legal etc. pertaining to the take-over, have been met.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice exDividendDate;
	/**
	 * Date/time as from which trading (including exchange and OTC trading)
	 * occurs on the underlying security without the benefit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmExDividendDate
	 * Dividend.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExDvddDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExDividendDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExDividendDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Dividend.mmExDividendDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "ExDvddDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExDividendDate";
			definition = "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice officialAnnouncementPublicationDate;
	/**
	 * Date/time at which the corporate action is legally announced by an
	 * official body, for example, publication by a governmental administration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmOfficialAnnouncementPublicationDate
	 * CorporateActionEventRegistration.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffclAnncmntPblctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialAnnouncementPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the corporate action is legally announced by an official body, for example, publication by a governmental administration."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOfficialAnnouncementPublicationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmOfficialAnnouncementPublicationDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "OffclAnncmntPblctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialAnnouncementPublicationDate";
			definition = "Date/time at which the corporate action is legally announced by an official body, for example, publication by a governmental administration.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice specialExDate;
	/**
	 * Date/time as from which 'special processing' can start to be used by
	 * participants for that event. Special processing is a means of marking a
	 * transaction, that would normally be traded ex or cum, as being traded cum
	 * or ex respectively, for example, a transaction dealt 'special' after the
	 * ex date would result in the buyer being eligible for the entitlement.
	 * This is typically used in the UK and Irish markets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmSpecialExDate
	 * CorporateActionDeadline.mmSpecialExDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpclExDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively,  for example, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSpecialExDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmSpecialExDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "SpclExDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExDate";
			definition = "Date/time as from which 'special processing' can start to be used by participants for that event. Special processing is a means of marking a transaction, that would normally be traded ex or cum, as being traded cum or ex respectively,  for example, a transaction dealt 'special' after the ex date would result in the buyer being eligible for the entitlement. This is typically used in the UK and Irish markets.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice guaranteedParticipationDate;
	/**
	 * Last date/time by which a buying counterparty to a trade can be sure that
	 * it will have the right to participate in an event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmGuaranteedParticipationDate
	 * CorporateActionDeadline.mmGuaranteedParticipationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntedPrtcptnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedParticipationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGuaranteedParticipationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmGuaranteedParticipationDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "GrntedPrtcptnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedParticipationDate";
			definition = "Last date/time by which a buying counterparty to a trade can be sure that it will have the right to participate in an event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice electionToCounterpartyMarketDeadline;
	/**
	 * Deadline by which an entitled holder needs to advise their counterparty
	 * to a transaction of their election for a corporate action event, also
	 * known as Buyer Protection Deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmElectionToCounterpartyDeadline
	 * CorporateActionDeadline.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnToCtrPtyMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionToCounterpartyMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event, also known as Buyer Protection Deadline."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmElectionToCounterpartyMarketDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmElectionToCounterpartyDeadline;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "ElctnToCtrPtyMktDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionToCounterpartyMarketDeadline";
			definition = "Deadline by which an entitled holder needs to advise their counterparty to a transaction of their election for a corporate action event, also known as Buyer Protection Deadline.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice electionToCounterpartyResponseDeadline;
	/**
	 * Date/time the account servicer has set as the deadline to respond, with
	 * instructions, prior to the election to counterparty market deadline
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmElectionToCounterpartyDeadline
	 * CorporateActionDeadline.mmElectionToCounterpartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnToCtrPtyRspnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionToCounterpartyResponseDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time the account servicer has set as the deadline to respond, with instructions, prior to the election to counterparty market deadline "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmElectionToCounterpartyResponseDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmElectionToCounterpartyDeadline;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "ElctnToCtrPtyRspnDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionToCounterpartyResponseDeadline";
			definition = "Date/time the account servicer has set as the deadline to respond, with instructions, prior to the election to counterparty market deadline ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice lapsedDate;
	/**
	 * Date/time at which an event/offer is terminated or lapsed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLapsedDate
	 * CorporateActionEvent.mmLapsedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LpsdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LapsedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an event/offer is terminated or lapsed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLapsedDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmLapsedDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "LpsdDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LapsedDate";
			definition = "Date/time at which an event/offer is terminated or lapsed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice paymentDate;
	/**
	 * Date/time at which the movement is due to take place (cash and/or
	 * securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementDate
	 * CorporateActionDistribution.mmMovementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the movement is due to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmMovementDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date/time at which the movement is due to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice thirdPartyDeadline;
	/**
	 * Date/Time by which the account owner must instruct directly another
	 * party, for example to provide documentation to an issuer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmThirdPartyDeadline
	 * CorporateActionDeadline.mmThirdPartyDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdPtyDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdPartyDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time by which the account owner must instruct directly another party, for example to provide documentation to an issuer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmThirdPartyDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmThirdPartyDeadline;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "ThrdPtyDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdPartyDeadline";
			definition = "Date/Time by which the account owner must instruct directly another party, for example to provide documentation to an issuer agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice earlyThirdPartyDeadline;
	/**
	 * Date/Time set by the issuer agent as a first early deadline by which the
	 * account owner must instruct directly another party, possibly giving the
	 * holder eligibility to incentives. For example, to provide documentation
	 * to an issuer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmEarlyResponseDeadline
	 * CorporateActionDeadline.mmEarlyResponseDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyThrdPtyDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyThirdPartyDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time set by the issuer agent as a first early deadline by which the account owner must instruct directly another party, possibly giving the holder eligibility to incentives. For example, to provide documentation to an issuer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEarlyThirdPartyDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionDeadline.mmEarlyResponseDeadline;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "EarlyThrdPtyDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyThirdPartyDeadline";
			definition = "Date/Time set by the issuer agent as a first early deadline by which the account owner must instruct directly another party, possibly giving the holder eligibility to incentives. For example, to provide documentation to an issuer agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice marketClaimTrackingEndDate;
	/**
	 * Date by which the depository stops monitoring activities of the event,
	 * for instance, accounting and tracking activities for due bills end.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmMarketClaimTrackingEndDate
	 * MarketClaim.mmMarketClaimTrackingEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktClmTrckgEndDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaimTrackingEndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the depository stops monitoring activities of the event, for instance, accounting and tracking activities for due bills end."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarketClaimTrackingEndDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.MarketClaim.mmMarketClaimTrackingEndDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "MktClmTrckgEndDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaimTrackingEndDate";
			definition = "Date by which the depository stops monitoring activities of the event, for instance, accounting and tracking activities for due bills end.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat34Choice leadPlaintiffDeadline;
	/**
	 * Last day an investor can become a lead plaintiff.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat34Choice
	 * DateFormat34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmLeadPlaintiffDeadline
	 * ClassAction.mmLeadPlaintiffDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LeadPlntffDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LeadPlaintiffDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last day an investor can become a lead plaintiff."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLeadPlaintiffDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ClassAction.mmLeadPlaintiffDeadline;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "LeadPlntffDdln";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LeadPlaintiffDeadline";
			definition = "Last day an investor can become a lead plaintiff.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat34Choice.mmObject();
		}
	};
	protected DateFormat41Choice filingDate;
	/**
	 * Date on which the action was filed at the applicable court.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat41Choice
	 * DateFormat41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmFilingDate
	 * ClassAction.mmFilingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FilgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FilingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the action was filed at the applicable court."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFilingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ClassAction.mmFilingDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "FilgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FilingDate";
			definition = "Date on which the action was filed at the applicable court.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat41Choice.mmObject();
		}
	};
	protected DateFormat41Choice hearingDate;
	/**
	 * Date for the hearing between the plaintiff and defendant, as set by the
	 * court.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat41Choice
	 * DateFormat41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmHearingDate
	 * ClassAction.mmHearingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58
	 * CorporateActionDate58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HrgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HearingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date for the hearing between the plaintiff and defendant, as set by the court."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHearingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ClassAction.mmHearingDate;
			componentContext_lazy = () -> CorporateActionDate58.mmObject();
			isDerived = false;
			xmlTag = "HrgDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HearingDate";
			definition = "Date for the hearing between the plaintiff and defendant, as set by the court.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat41Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate58.mmAnnouncementDate, com.tools20022.repository.msg.CorporateActionDate58.mmCertificationDeadline,
						com.tools20022.repository.msg.CorporateActionDate58.mmCourtApprovalDate, com.tools20022.repository.msg.CorporateActionDate58.mmEarlyClosingDate, com.tools20022.repository.msg.CorporateActionDate58.mmEffectiveDate,
						com.tools20022.repository.msg.CorporateActionDate58.mmEqualisationDate, com.tools20022.repository.msg.CorporateActionDate58.mmFurtherDetailedAnnouncementDate,
						com.tools20022.repository.msg.CorporateActionDate58.mmFixingDate, com.tools20022.repository.msg.CorporateActionDate58.mmLotteryDate, com.tools20022.repository.msg.CorporateActionDate58.mmNewMaturityDate,
						com.tools20022.repository.msg.CorporateActionDate58.mmMeetingDate, com.tools20022.repository.msg.CorporateActionDate58.mmMarginFixingDate, com.tools20022.repository.msg.CorporateActionDate58.mmProrationDate,
						com.tools20022.repository.msg.CorporateActionDate58.mmRecordDate, com.tools20022.repository.msg.CorporateActionDate58.mmRegistrationDeadline,
						com.tools20022.repository.msg.CorporateActionDate58.mmResultsPublicationDate, com.tools20022.repository.msg.CorporateActionDate58.mmDeadlineToSplit,
						com.tools20022.repository.msg.CorporateActionDate58.mmDeadlineForTaxBreakdownInstruction, com.tools20022.repository.msg.CorporateActionDate58.mmTradingSuspendedDate,
						com.tools20022.repository.msg.CorporateActionDate58.mmUnconditionalDate, com.tools20022.repository.msg.CorporateActionDate58.mmWhollyUnconditionalDate,
						com.tools20022.repository.msg.CorporateActionDate58.mmExDividendDate, com.tools20022.repository.msg.CorporateActionDate58.mmOfficialAnnouncementPublicationDate,
						com.tools20022.repository.msg.CorporateActionDate58.mmSpecialExDate, com.tools20022.repository.msg.CorporateActionDate58.mmGuaranteedParticipationDate,
						com.tools20022.repository.msg.CorporateActionDate58.mmElectionToCounterpartyMarketDeadline, com.tools20022.repository.msg.CorporateActionDate58.mmElectionToCounterpartyResponseDeadline,
						com.tools20022.repository.msg.CorporateActionDate58.mmLapsedDate, com.tools20022.repository.msg.CorporateActionDate58.mmPaymentDate, com.tools20022.repository.msg.CorporateActionDate58.mmThirdPartyDeadline,
						com.tools20022.repository.msg.CorporateActionDate58.mmEarlyThirdPartyDeadline, com.tools20022.repository.msg.CorporateActionDate58.mmMarketClaimTrackingEndDate,
						com.tools20022.repository.msg.CorporateActionDate58.mmLeadPlaintiffDeadline, com.tools20022.repository.msg.CorporateActionDate58.mmFilingDate, com.tools20022.repository.msg.CorporateActionDate58.mmHearingDate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDate58";
				definition = "Specifies corporate action dates.";
			}
		});
		return mmObject_lazy.get();
	}

	public DateFormat34Choice getAnnouncementDate() {
		return announcementDate;
	}

	public void setAnnouncementDate(DateFormat34Choice announcementDate) {
		this.announcementDate = announcementDate;
	}

	public DateFormat34Choice getCertificationDeadline() {
		return certificationDeadline;
	}

	public void setCertificationDeadline(DateFormat34Choice certificationDeadline) {
		this.certificationDeadline = certificationDeadline;
	}

	public DateFormat34Choice getCourtApprovalDate() {
		return courtApprovalDate;
	}

	public void setCourtApprovalDate(DateFormat34Choice courtApprovalDate) {
		this.courtApprovalDate = courtApprovalDate;
	}

	public DateFormat34Choice getEarlyClosingDate() {
		return earlyClosingDate;
	}

	public void setEarlyClosingDate(DateFormat34Choice earlyClosingDate) {
		this.earlyClosingDate = earlyClosingDate;
	}

	public DateFormat34Choice getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(DateFormat34Choice effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public DateFormat34Choice getEqualisationDate() {
		return equalisationDate;
	}

	public void setEqualisationDate(DateFormat34Choice equalisationDate) {
		this.equalisationDate = equalisationDate;
	}

	public DateFormat34Choice getFurtherDetailedAnnouncementDate() {
		return furtherDetailedAnnouncementDate;
	}

	public void setFurtherDetailedAnnouncementDate(DateFormat34Choice furtherDetailedAnnouncementDate) {
		this.furtherDetailedAnnouncementDate = furtherDetailedAnnouncementDate;
	}

	public DateFormat34Choice getFixingDate() {
		return fixingDate;
	}

	public void setFixingDate(DateFormat34Choice fixingDate) {
		this.fixingDate = fixingDate;
	}

	public DateFormat34Choice getLotteryDate() {
		return lotteryDate;
	}

	public void setLotteryDate(DateFormat34Choice lotteryDate) {
		this.lotteryDate = lotteryDate;
	}

	public DateFormat34Choice getNewMaturityDate() {
		return newMaturityDate;
	}

	public void setNewMaturityDate(DateFormat34Choice newMaturityDate) {
		this.newMaturityDate = newMaturityDate;
	}

	public DateFormat34Choice getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(DateFormat34Choice meetingDate) {
		this.meetingDate = meetingDate;
	}

	public DateFormat34Choice getMarginFixingDate() {
		return marginFixingDate;
	}

	public void setMarginFixingDate(DateFormat34Choice marginFixingDate) {
		this.marginFixingDate = marginFixingDate;
	}

	public DateFormat34Choice getProrationDate() {
		return prorationDate;
	}

	public void setProrationDate(DateFormat34Choice prorationDate) {
		this.prorationDate = prorationDate;
	}

	public DateFormat34Choice getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(DateFormat34Choice recordDate) {
		this.recordDate = recordDate;
	}

	public DateFormat34Choice getRegistrationDeadline() {
		return registrationDeadline;
	}

	public void setRegistrationDeadline(DateFormat34Choice registrationDeadline) {
		this.registrationDeadline = registrationDeadline;
	}

	public DateFormat34Choice getResultsPublicationDate() {
		return resultsPublicationDate;
	}

	public void setResultsPublicationDate(DateFormat34Choice resultsPublicationDate) {
		this.resultsPublicationDate = resultsPublicationDate;
	}

	public DateFormat34Choice getDeadlineToSplit() {
		return deadlineToSplit;
	}

	public void setDeadlineToSplit(DateFormat34Choice deadlineToSplit) {
		this.deadlineToSplit = deadlineToSplit;
	}

	public DateFormat34Choice getDeadlineForTaxBreakdownInstruction() {
		return deadlineForTaxBreakdownInstruction;
	}

	public void setDeadlineForTaxBreakdownInstruction(DateFormat34Choice deadlineForTaxBreakdownInstruction) {
		this.deadlineForTaxBreakdownInstruction = deadlineForTaxBreakdownInstruction;
	}

	public DateFormat34Choice getTradingSuspendedDate() {
		return tradingSuspendedDate;
	}

	public void setTradingSuspendedDate(DateFormat34Choice tradingSuspendedDate) {
		this.tradingSuspendedDate = tradingSuspendedDate;
	}

	public DateFormat34Choice getUnconditionalDate() {
		return unconditionalDate;
	}

	public void setUnconditionalDate(DateFormat34Choice unconditionalDate) {
		this.unconditionalDate = unconditionalDate;
	}

	public DateFormat34Choice getWhollyUnconditionalDate() {
		return whollyUnconditionalDate;
	}

	public void setWhollyUnconditionalDate(DateFormat34Choice whollyUnconditionalDate) {
		this.whollyUnconditionalDate = whollyUnconditionalDate;
	}

	public DateFormat34Choice getExDividendDate() {
		return exDividendDate;
	}

	public void setExDividendDate(DateFormat34Choice exDividendDate) {
		this.exDividendDate = exDividendDate;
	}

	public DateFormat34Choice getOfficialAnnouncementPublicationDate() {
		return officialAnnouncementPublicationDate;
	}

	public void setOfficialAnnouncementPublicationDate(DateFormat34Choice officialAnnouncementPublicationDate) {
		this.officialAnnouncementPublicationDate = officialAnnouncementPublicationDate;
	}

	public DateFormat34Choice getSpecialExDate() {
		return specialExDate;
	}

	public void setSpecialExDate(DateFormat34Choice specialExDate) {
		this.specialExDate = specialExDate;
	}

	public DateFormat34Choice getGuaranteedParticipationDate() {
		return guaranteedParticipationDate;
	}

	public void setGuaranteedParticipationDate(DateFormat34Choice guaranteedParticipationDate) {
		this.guaranteedParticipationDate = guaranteedParticipationDate;
	}

	public DateFormat34Choice getElectionToCounterpartyMarketDeadline() {
		return electionToCounterpartyMarketDeadline;
	}

	public void setElectionToCounterpartyMarketDeadline(DateFormat34Choice electionToCounterpartyMarketDeadline) {
		this.electionToCounterpartyMarketDeadline = electionToCounterpartyMarketDeadline;
	}

	public DateFormat34Choice getElectionToCounterpartyResponseDeadline() {
		return electionToCounterpartyResponseDeadline;
	}

	public void setElectionToCounterpartyResponseDeadline(DateFormat34Choice electionToCounterpartyResponseDeadline) {
		this.electionToCounterpartyResponseDeadline = electionToCounterpartyResponseDeadline;
	}

	public DateFormat34Choice getLapsedDate() {
		return lapsedDate;
	}

	public void setLapsedDate(DateFormat34Choice lapsedDate) {
		this.lapsedDate = lapsedDate;
	}

	public DateFormat34Choice getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(DateFormat34Choice paymentDate) {
		this.paymentDate = paymentDate;
	}

	public DateFormat34Choice getThirdPartyDeadline() {
		return thirdPartyDeadline;
	}

	public void setThirdPartyDeadline(DateFormat34Choice thirdPartyDeadline) {
		this.thirdPartyDeadline = thirdPartyDeadline;
	}

	public DateFormat34Choice getEarlyThirdPartyDeadline() {
		return earlyThirdPartyDeadline;
	}

	public void setEarlyThirdPartyDeadline(DateFormat34Choice earlyThirdPartyDeadline) {
		this.earlyThirdPartyDeadline = earlyThirdPartyDeadline;
	}

	public DateFormat34Choice getMarketClaimTrackingEndDate() {
		return marketClaimTrackingEndDate;
	}

	public void setMarketClaimTrackingEndDate(DateFormat34Choice marketClaimTrackingEndDate) {
		this.marketClaimTrackingEndDate = marketClaimTrackingEndDate;
	}

	public DateFormat34Choice getLeadPlaintiffDeadline() {
		return leadPlaintiffDeadline;
	}

	public void setLeadPlaintiffDeadline(DateFormat34Choice leadPlaintiffDeadline) {
		this.leadPlaintiffDeadline = leadPlaintiffDeadline;
	}

	public DateFormat41Choice getFilingDate() {
		return filingDate;
	}

	public void setFilingDate(DateFormat41Choice filingDate) {
		this.filingDate = filingDate;
	}

	public DateFormat41Choice getHearingDate() {
		return hearingDate;
	}

	public void setHearingDate(DateFormat41Choice hearingDate) {
		this.hearingDate = hearingDate;
	}
}
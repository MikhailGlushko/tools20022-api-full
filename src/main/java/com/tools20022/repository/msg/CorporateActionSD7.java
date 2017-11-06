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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides additional information regarding corporate action details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmPlaceAndName
 * CorporateActionSD7.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmNoticeType
 * CorporateActionSD7.mmNoticeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmEventCashValue
 * CorporateActionSD7.mmEventCashValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmNumberOfSharesToBeIssued
 * CorporateActionSD7.mmNumberOfSharesToBeIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmTotalNumberOfSharesOffered
 * CorporateActionSD7.mmTotalNumberOfSharesOffered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmCutOffDays
 * CorporateActionSD7.mmCutOffDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmDTCAutomatedOfferProgram
 * CorporateActionSD7.mmDTCAutomatedOfferProgram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmDTCRecycleCutOffIndicator
 * CorporateActionSD7.mmDTCRecycleCutOffIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmLongShortPaymentIndicator
 * CorporateActionSD7.mmLongShortPaymentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmOversubscriptionType
 * CorporateActionSD7.mmOversubscriptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmConditionalPaymentApplicableFlag
 * CorporateActionSD7.mmConditionalPaymentApplicableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmSolicitationDealerFeeFlag
 * CorporateActionSD7.mmSolicitationDealerFeeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmDTCCustodyEligibleFlag
 * CorporateActionSD7.mmDTCCustodyEligibleFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmDTCReorganisationCustodyEligibleFlag
 * CorporateActionSD7.mmDTCReorganisationCustodyEligibleFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmDTCReorganisationDepositEligibleFlag
 * CorporateActionSD7.mmDTCReorganisationDepositEligibleFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmSurrenderSharesToAgentFlag
 * CorporateActionSD7.mmSurrenderSharesToAgentFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmStepUpPrivilegeFlag
 * CorporateActionSD7.mmStepUpPrivilegeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmRightsOversubscriptionFlag
 * CorporateActionSD7.mmRightsOversubscriptionFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmRightsRoundUpPrivilegeFlag
 * CorporateActionSD7.mmRightsRoundUpPrivilegeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmRightsTransferableFlag
 * CorporateActionSD7.mmRightsTransferableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmCertificateDetails
 * CorporateActionSD7.mmCertificateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7#mmEDSMessagingCountryCode
 * CorporateActionSD7.mmEDSMessagingCountryCode}</li>
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
 * "CorporateActionSD7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionSD1
 * CorporateActionSD1}</li>
 * </ul>
 */
public class CorporateActionSD7 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
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
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected NoticeType1Code noticeType;
	/**
	 * Indicates whether the notice received was universal or specific to
	 * securities registered in DTC's nominee name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NoticeType1Code
	 * NoticeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtceTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoticeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the notice received was universal or specific to securities registered in DTC's nominee name."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNoticeType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "NtceTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoticeType";
			definition = "Indicates whether the notice received was universal or specific to securities registered in DTC's nominee name.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NoticeType1Code.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount eventCashValue;
	/**
	 * Amount of cash set aside by the offeror. This is the maximum amount that
	 * the offeror is willing to pay out to the holders who elect to take part
	 * in the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtCshVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventCashValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash set aside by the offeror. This is the maximum amount that the offeror is willing to pay out to the holders who elect to take part in the offer. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventCashValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "EvtCshVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventCashValue";
			definition = "Amount of cash set aside by the offeror. This is the maximum amount that the offeror is willing to pay out to the holders who elect to take part in the offer. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected DecimalNumber numberOfSharesToBeIssued;
	/**
	 * Number of shares the issuer is creating as part of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfShrsToBeIssd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfSharesToBeIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of shares the issuer is creating as part of the event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfSharesToBeIssued = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "NbOfShrsToBeIssd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfSharesToBeIssued";
			definition = "Number of shares the issuer is creating as part of the event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber totalNumberOfSharesOffered;
	/**
	 * Total number of shares that are part of the offer for example
	 * subscription offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfShrsOfferd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfSharesOffered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of shares that are part of the offer for example subscription offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfSharesOffered = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfShrsOfferd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfSharesOffered";
			definition = "Total number of shares that are part of the offer for example subscription offer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected Max3Number cutOffDays;
	/**
	 * Number of additional days used to establish a DTC processing cut-off
	 * date. For example, DTC typically adds a cut-off off day (making it one
	 * business day prior) to the record date for issues with agents outside
	 * NYC. This allows time for DTC to deliver the securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CutOffDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of additional days used to establish a DTC processing cut-off date. For example, DTC typically adds a cut-off off day (making it one business day prior) to the record date for issues with agents outside NYC. This allows time for DTC to deliver the securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCutOffDays = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "CutOffDays";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffDays";
			definition = "Number of additional days used to establish a DTC processing cut-off date. For example, DTC typically adds a cut-off off day (making it one business day prior) to the record date for issues with agents outside NYC. This allows time for DTC to deliver the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	protected DTCAutoOfferProgram1Code dTCAutomatedOfferProgram;
	/**
	 * Indicator that identifies the type of interface an event agent has with
	 * DTC (The Depository Trust Corporation). It defines how time sensitive
	 * instruction and withdrawal process is. Offline (non automated) agent will
	 * have earlier deadlines which will be reflected in response deadlines but
	 * importantly withdrawal procedures for manual agent require hard copy sign
	 * off from the agent that has to be delivered to DTC to proceed with
	 * withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAutoOfferProgram1Code
	 * DTCAutoOfferProgram1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAutomtdOfferPrgm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCAutomatedOfferProgram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator that identifies the type of interface an event agent has with DTC (The Depository Trust Corporation). It defines how time sensitive instruction and withdrawal process is. Offline (non automated) agent will have earlier deadlines which will be reflected in response deadlines but importantly withdrawal procedures for manual agent require hard copy sign off from the agent that has to be delivered to DTC to proceed with withdrawal."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCAutomatedOfferProgram = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCAutomtdOfferPrgm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAutomatedOfferProgram";
			definition = "Indicator that identifies the type of interface an event agent has with DTC (The Depository Trust Corporation). It defines how time sensitive instruction and withdrawal process is. Offline (non automated) agent will have earlier deadlines which will be reflected in response deadlines but importantly withdrawal procedures for manual agent require hard copy sign off from the agent that has to be delivered to DTC to proceed with withdrawal.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAutoOfferProgram1Code.mmObject();
		}
	};
	protected CutOff1Code dTCRecycleCutOffIndicator;
	/**
	 * Indicates whether the recycling of instructions for eligible positions is
	 * set to end early or late at DTC (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CutOff1Code
	 * CutOff1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCRcyclCutOffInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCRecycleCutOffIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the recycling of instructions for eligible positions is set to end early or late at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCRecycleCutOffIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCRcyclCutOffInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCRecycleCutOffIndicator";
			definition = "Indicates whether the recycling of instructions for eligible positions is set to end early or late at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CutOff1Code.mmObject();
		}
	};
	protected AccrualPeriodType1Code longShortPaymentIndicator;
	/**
	 * Denotes whether the first accrual period for debt instruments is either
	 * long or short, compared to the normal accrual period of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code
	 * AccrualPeriodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LngShrtPmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongShortPaymentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Denotes whether the first accrual period for debt instruments is either long or short, compared to the normal accrual period of the security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLongShortPaymentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "LngShrtPmtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongShortPaymentIndicator";
			definition = "Denotes whether the first accrual period for debt instruments is either long or short, compared to the normal accrual period of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccrualPeriodType1Code.mmObject();
		}
	};
	protected OversubscriptionType1Code oversubscriptionType;
	/**
	 * Type of oversubscription on the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OversubscriptionType1Code
	 * OversubscriptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OvrsbcptTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of oversubscription on the event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOversubscriptionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionType";
			definition = "Type of oversubscription on the event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OversubscriptionType1Code.mmObject();
		}
	};
	protected YesNoIndicator conditionalPaymentApplicableFlag;
	/**
	 * Indicates whether the payment made by the issuer is based on a stated
	 * condition.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondlPmtAplblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalPaymentApplicableFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the payment made by the issuer is based on a stated condition."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConditionalPaymentApplicableFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "CondlPmtAplblFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalPaymentApplicableFlag";
			definition = "Indicates whether the payment made by the issuer is based on a stated condition.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator solicitationDealerFeeFlag;
	/**
	 * Indicates whether there is a solicitation fee on the event. This fee is
	 * paid by the soliciting dealer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnDealrFeeFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationDealerFeeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is a solicitation fee on the event. This fee is paid by the soliciting dealer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSolicitationDealerFeeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "SlctnDealrFeeFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationDealerFeeFlag";
			definition = "Indicates whether there is a solicitation fee on the event. This fee is paid by the soliciting dealer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator dTCCustodyEligibleFlag;
	/**
	 * Indicates whether positions held in Custody program are eligible for
	 * instruction processing at DTC (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCCtdyElgblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCustodyEligibleFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether positions held in Custody program are eligible for instruction processing at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCCustodyEligibleFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCCtdyElgblFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCustodyEligibleFlag";
			definition = "Indicates whether positions held in Custody program are eligible for instruction processing at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator dTCReorganisationCustodyEligibleFlag;
	/**
	 * Indicates whether the event is eligible for Custody Reorganisation
	 * service at DTC (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCReorgCtdyElgblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCReorganisationCustodyEligibleFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event is eligible for Custody Reorganisation service at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCReorganisationCustodyEligibleFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCReorgCtdyElgblFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCReorganisationCustodyEligibleFlag";
			definition = "Indicates whether the event is eligible for Custody Reorganisation service at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator dTCReorganisationDepositEligibleFlag;
	/**
	 * Indicates whether the event is eligible for Reorganisation Deposit
	 * Service at DTC (The Depository Trust Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCReorgDpstElgblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCReorganisationDepositEligibleFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event is eligible for Reorganisation Deposit Service at DTC (The Depository Trust Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCReorganisationDepositEligibleFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCReorgDpstElgblFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCReorganisationDepositEligibleFlag";
			definition = "Indicates whether the event is eligible for Reorganisation Deposit Service at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator surrenderSharesToAgentFlag;
	/**
	 * Indicates whether shares outside of DTC need to be delivered to the agent
	 * in order to receive entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrrndrShrsToAgtFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurrenderSharesToAgentFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether shares outside of DTC need to be delivered to the agent in order to receive entitlement. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSurrenderSharesToAgentFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "SrrndrShrsToAgtFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurrenderSharesToAgentFlag";
			definition = "Indicates whether shares outside of DTC need to be delivered to the agent in order to receive entitlement. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator stepUpPrivilegeFlag;
	/**
	 * Indicates that the holder has the privilege to buy additional rights.
	 * Upon exercising this privilege, the holder may subscribe to one
	 * additional share of the new security in lieu of fractional shares to
	 * which the holder might otherwise be entitled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StepUpPrvlgFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepUpPrivilegeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the holder has the privilege to buy additional rights. Upon exercising this privilege, the holder may subscribe to one additional share of the new security in lieu of fractional shares to which the holder might otherwise be entitled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStepUpPrivilegeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "StepUpPrvlgFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepUpPrivilegeFlag";
			definition = "Indicates that the holder has the privilege to buy additional rights. Upon exercising this privilege, the holder may subscribe to one additional share of the new security in lieu of fractional shares to which the holder might otherwise be entitled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator rightsOversubscriptionFlag;
	/**
	 * Indicates whether holders of rights will be afforded the opportunity to
	 * subscribe to purchase extra shares that are not picked up by the
	 * remaining holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RghtsOvrsbcptFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsOversubscriptionFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether holders of rights will be afforded the opportunity to subscribe to purchase extra shares that are not picked up by the remaining holders."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRightsOversubscriptionFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "RghtsOvrsbcptFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsOversubscriptionFlag";
			definition = "Indicates whether holders of rights will be afforded the opportunity to subscribe to purchase extra shares that are not picked up by the remaining holders.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator rightsRoundUpPrivilegeFlag;
	/**
	 * Indicates whether the shareholder will be able to round up his/her
	 * subscription in the event his/her rights are less than the requirement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RghtsRndUpPrvlgFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsRoundUpPrivilegeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the shareholder will be able to round up his/her subscription in the event his/her rights are less than the requirement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRightsRoundUpPrivilegeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "RghtsRndUpPrvlgFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsRoundUpPrivilegeFlag";
			definition = "Indicates whether the shareholder will be able to round up his/her subscription in the event his/her rights are less than the requirement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator rightsTransferableFlag;
	/**
	 * Indicates whether rights can be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RghtsTrfblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsTransferableFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether rights can be transferred."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRightsTransferableFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "RghtsTrfblFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsTransferableFlag";
			definition = "Indicates whether rights can be transferred.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CorporateActionSD5> certificateDetails;
	/**
	 * Provides details of certificates that have been called for redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionSD5
	 * CorporateActionSD5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of certificates that have been  called  for redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCertificateDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "CertDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateDetails";
			definition = "Provides details of certificates that have been  called  for redemption.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionSD5.mmObject();
		}
	};
	protected CountryCode eDSMessagingCountryCode;
	/**
	 * Country of Issue used to determine whether the electable option requires
	 * Tax Exempt or Wire information when sending EDS elections via the CAIN
	 * message type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EDSMsggCtryCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingCountryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of Issue used to determine whether the electable option requires Tax Exempt or Wire information when sending EDS elections via the CAIN message type."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEDSMessagingCountryCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionSD7.mmObject();
			isDerived = false;
			xmlTag = "EDSMsggCtryCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingCountryCode";
			definition = "Country of Issue used to determine whether the electable option requires Tax Exempt or Wire information when sending EDS elections via the CAIN message type.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionSD7.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionSD7.mmNoticeType,
						com.tools20022.repository.msg.CorporateActionSD7.mmEventCashValue, com.tools20022.repository.msg.CorporateActionSD7.mmNumberOfSharesToBeIssued,
						com.tools20022.repository.msg.CorporateActionSD7.mmTotalNumberOfSharesOffered, com.tools20022.repository.msg.CorporateActionSD7.mmCutOffDays,
						com.tools20022.repository.msg.CorporateActionSD7.mmDTCAutomatedOfferProgram, com.tools20022.repository.msg.CorporateActionSD7.mmDTCRecycleCutOffIndicator,
						com.tools20022.repository.msg.CorporateActionSD7.mmLongShortPaymentIndicator, com.tools20022.repository.msg.CorporateActionSD7.mmOversubscriptionType,
						com.tools20022.repository.msg.CorporateActionSD7.mmConditionalPaymentApplicableFlag, com.tools20022.repository.msg.CorporateActionSD7.mmSolicitationDealerFeeFlag,
						com.tools20022.repository.msg.CorporateActionSD7.mmDTCCustodyEligibleFlag, com.tools20022.repository.msg.CorporateActionSD7.mmDTCReorganisationCustodyEligibleFlag,
						com.tools20022.repository.msg.CorporateActionSD7.mmDTCReorganisationDepositEligibleFlag, com.tools20022.repository.msg.CorporateActionSD7.mmSurrenderSharesToAgentFlag,
						com.tools20022.repository.msg.CorporateActionSD7.mmStepUpPrivilegeFlag, com.tools20022.repository.msg.CorporateActionSD7.mmRightsOversubscriptionFlag,
						com.tools20022.repository.msg.CorporateActionSD7.mmRightsRoundUpPrivilegeFlag, com.tools20022.repository.msg.CorporateActionSD7.mmRightsTransferableFlag,
						com.tools20022.repository.msg.CorporateActionSD7.mmCertificateDetails, com.tools20022.repository.msg.CorporateActionSD7.mmEDSMessagingCountryCode);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionSD7";
				definition = "Provides additional information regarding corporate action details.";
				previousVersion_lazy = () -> CorporateActionSD1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public NoticeType1Code getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(NoticeType1Code noticeType) {
		this.noticeType = noticeType;
	}

	public RestrictedFINActiveCurrencyAnd13DecimalAmount getEventCashValue() {
		return eventCashValue;
	}

	public void setEventCashValue(RestrictedFINActiveCurrencyAnd13DecimalAmount eventCashValue) {
		this.eventCashValue = eventCashValue;
	}

	public DecimalNumber getNumberOfSharesToBeIssued() {
		return numberOfSharesToBeIssued;
	}

	public void setNumberOfSharesToBeIssued(DecimalNumber numberOfSharesToBeIssued) {
		this.numberOfSharesToBeIssued = numberOfSharesToBeIssued;
	}

	public DecimalNumber getTotalNumberOfSharesOffered() {
		return totalNumberOfSharesOffered;
	}

	public void setTotalNumberOfSharesOffered(DecimalNumber totalNumberOfSharesOffered) {
		this.totalNumberOfSharesOffered = totalNumberOfSharesOffered;
	}

	public Max3Number getCutOffDays() {
		return cutOffDays;
	}

	public void setCutOffDays(Max3Number cutOffDays) {
		this.cutOffDays = cutOffDays;
	}

	public DTCAutoOfferProgram1Code getDTCAutomatedOfferProgram() {
		return dTCAutomatedOfferProgram;
	}

	public void setDTCAutomatedOfferProgram(DTCAutoOfferProgram1Code dTCAutomatedOfferProgram) {
		this.dTCAutomatedOfferProgram = dTCAutomatedOfferProgram;
	}

	public CutOff1Code getDTCRecycleCutOffIndicator() {
		return dTCRecycleCutOffIndicator;
	}

	public void setDTCRecycleCutOffIndicator(CutOff1Code dTCRecycleCutOffIndicator) {
		this.dTCRecycleCutOffIndicator = dTCRecycleCutOffIndicator;
	}

	public AccrualPeriodType1Code getLongShortPaymentIndicator() {
		return longShortPaymentIndicator;
	}

	public void setLongShortPaymentIndicator(AccrualPeriodType1Code longShortPaymentIndicator) {
		this.longShortPaymentIndicator = longShortPaymentIndicator;
	}

	public OversubscriptionType1Code getOversubscriptionType() {
		return oversubscriptionType;
	}

	public void setOversubscriptionType(OversubscriptionType1Code oversubscriptionType) {
		this.oversubscriptionType = oversubscriptionType;
	}

	public YesNoIndicator getConditionalPaymentApplicableFlag() {
		return conditionalPaymentApplicableFlag;
	}

	public void setConditionalPaymentApplicableFlag(YesNoIndicator conditionalPaymentApplicableFlag) {
		this.conditionalPaymentApplicableFlag = conditionalPaymentApplicableFlag;
	}

	public YesNoIndicator getSolicitationDealerFeeFlag() {
		return solicitationDealerFeeFlag;
	}

	public void setSolicitationDealerFeeFlag(YesNoIndicator solicitationDealerFeeFlag) {
		this.solicitationDealerFeeFlag = solicitationDealerFeeFlag;
	}

	public YesNoIndicator getDTCCustodyEligibleFlag() {
		return dTCCustodyEligibleFlag;
	}

	public void setDTCCustodyEligibleFlag(YesNoIndicator dTCCustodyEligibleFlag) {
		this.dTCCustodyEligibleFlag = dTCCustodyEligibleFlag;
	}

	public YesNoIndicator getDTCReorganisationCustodyEligibleFlag() {
		return dTCReorganisationCustodyEligibleFlag;
	}

	public void setDTCReorganisationCustodyEligibleFlag(YesNoIndicator dTCReorganisationCustodyEligibleFlag) {
		this.dTCReorganisationCustodyEligibleFlag = dTCReorganisationCustodyEligibleFlag;
	}

	public YesNoIndicator getDTCReorganisationDepositEligibleFlag() {
		return dTCReorganisationDepositEligibleFlag;
	}

	public void setDTCReorganisationDepositEligibleFlag(YesNoIndicator dTCReorganisationDepositEligibleFlag) {
		this.dTCReorganisationDepositEligibleFlag = dTCReorganisationDepositEligibleFlag;
	}

	public YesNoIndicator getSurrenderSharesToAgentFlag() {
		return surrenderSharesToAgentFlag;
	}

	public void setSurrenderSharesToAgentFlag(YesNoIndicator surrenderSharesToAgentFlag) {
		this.surrenderSharesToAgentFlag = surrenderSharesToAgentFlag;
	}

	public YesNoIndicator getStepUpPrivilegeFlag() {
		return stepUpPrivilegeFlag;
	}

	public void setStepUpPrivilegeFlag(YesNoIndicator stepUpPrivilegeFlag) {
		this.stepUpPrivilegeFlag = stepUpPrivilegeFlag;
	}

	public YesNoIndicator getRightsOversubscriptionFlag() {
		return rightsOversubscriptionFlag;
	}

	public void setRightsOversubscriptionFlag(YesNoIndicator rightsOversubscriptionFlag) {
		this.rightsOversubscriptionFlag = rightsOversubscriptionFlag;
	}

	public YesNoIndicator getRightsRoundUpPrivilegeFlag() {
		return rightsRoundUpPrivilegeFlag;
	}

	public void setRightsRoundUpPrivilegeFlag(YesNoIndicator rightsRoundUpPrivilegeFlag) {
		this.rightsRoundUpPrivilegeFlag = rightsRoundUpPrivilegeFlag;
	}

	public YesNoIndicator getRightsTransferableFlag() {
		return rightsTransferableFlag;
	}

	public void setRightsTransferableFlag(YesNoIndicator rightsTransferableFlag) {
		this.rightsTransferableFlag = rightsTransferableFlag;
	}

	public List<CorporateActionSD5> getCertificateDetails() {
		return certificateDetails;
	}

	public void setCertificateDetails(List<com.tools20022.repository.msg.CorporateActionSD5> certificateDetails) {
		this.certificateDetails = certificateDetails;
	}

	public CountryCode getEDSMessagingCountryCode() {
		return eDSMessagingCountryCode;
	}

	public void setEDSMessagingCountryCode(CountryCode eDSMessagingCountryCode) {
		this.eDSMessagingCountryCode = eDSMessagingCountryCode;
	}
}
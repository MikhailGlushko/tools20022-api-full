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
import com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code;
import com.tools20022.repository.codeset.DTCCSubEventType1Code;
import com.tools20022.repository.codeset.DTCServiceType1Code;
import com.tools20022.repository.codeset.ExtendedEventType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides additional information regarding corporate action instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmPlaceAndName
 * CorporateActionInstructionExtension1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmInstructionType
 * CorporateActionInstructionExtension1.mmInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmEventType
 * CorporateActionInstructionExtension1.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmSubEventType
 * CorporateActionInstructionExtension1.mmSubEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmDTCCOptionType
 * CorporateActionInstructionExtension1.mmDTCCOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmProtectIdentification
 * CorporateActionInstructionExtension1.mmProtectIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmProtectDate
 * CorporateActionInstructionExtension1.mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmAcknowledgementFlag
 * CorporateActionInstructionExtension1.mmAcknowledgementFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmSolicitationDealerFeeFlag
 * CorporateActionInstructionExtension1.mmSolicitationDealerFeeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmConditionsAcceptance
 * CorporateActionInstructionExtension1.mmConditionsAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmOddLotFlag
 * CorporateActionInstructionExtension1.mmOddLotFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmExemptFromInterestPenaltyFlag
 * CorporateActionInstructionExtension1.mmExemptFromInterestPenaltyFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmDeclaredPayableDate
 * CorporateActionInstructionExtension1.mmDeclaredPayableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmRecordDate
 * CorporateActionInstructionExtension1.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmServiceTypeIndicator
 * CorporateActionInstructionExtension1.mmServiceTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmCustomerCount
 * CorporateActionInstructionExtension1.mmCustomerCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1#mmPayoutNumber
 * CorporateActionInstructionExtension1.mmPayoutNumber}</li>
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
 * "CorporateActionInstructionExtension1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action instruction."</li>
 * </ul>
 */
public class CorporateActionInstructionExtension1 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
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
	protected DTCCorporateActionInstructionType1Code instructionType;
	/**
	 * Type of instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code
	 * DTCCorporateActionInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "InstrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionType";
			definition = "Type of instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCorporateActionInstructionType1Code.mmObject();
		}
	};
	protected ExtendedEventType1Code eventType;
	/**
	 * DTCC (The Depository Trust and Clearing Corporation) native corporate
	 * action event type name. Used in place for the events that cannot be
	 * classified by ISO Code and are marked as OTHR. Can be used in combination
	 * with DTCC sub event type (when provided) to identify the event. For an
	 * example: a distribution based on recapitalisation event will be presented
	 * as event type: OTHR in standard message. DTCC native event type would be
	 * Distribution (DIST) and DTCC sub event type would be Recapitalisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code
	 * ExtendedEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO Code and are marked as OTHR. Can be used in combination with DTCC sub event type (when provided) to identify the event. For an example: a distribution based on recapitalisation event will be presented as event type: OTHR in standard message. DTCC native event type would be Distribution (DIST) and DTCC sub event type would be Recapitalisation. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO Code and are marked as OTHR. Can be used in combination with DTCC sub event type (when provided) to identify the event. For an example: a distribution based on recapitalisation event will be presented as event type: OTHR in standard message. DTCC native event type would be Distribution (DIST) and DTCC sub event type would be Recapitalisation. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedEventType1Code.mmObject();
		}
	};
	protected DTCCSubEventType1Code subEventType;
	/**
	 * DTCC (The Depository Trust and Clearing Corporation) native corporate
	 * action sub event type name further defines the event type. For an
	 * example: a cash dividend event with currency election will be noted as
	 * event type: Cash Dividend (DVCA) and DTCC sub event type: Currency
	 * Election(CURR).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. For an example: a cash dividend event with currency election will be noted as event type: Cash Dividend (DVCA) and DTCC sub event type: Currency Election(CURR)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "SubEvtTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubEventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. For an example: a cash dividend event with currency election will be noted as event type: Cash Dividend (DVCA) and DTCC sub event type: Currency Election(CURR).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCSubEventType1Code.mmObject();
		}
	};
	protected Max4AlphaNumericText dTCCOptionType;
	/**
	 * Used for the option types that cannot be classified in ISO and marked as
	 * Option Type: OTHR. Options like convert and dividend reinvestment, or DTC
	 * (The Depository Trust Corporation) special option types for the instances
	 * where the event and security are eligible for DTC (The Depository Trust
	 * Corporation) services like Foreign Tax, Foreign Currency Payments, etc.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCCOptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCOptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for the option types that cannot be classified in ISO and marked as Option Type: OTHR. Options like convert and dividend reinvestment, or DTC (The Depository Trust Corporation)  special option types for the instances where the event and security are eligible for DTC (The Depository Trust Corporation) services like Foreign Tax, Foreign Currency Payments, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCCOptionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "DTCCOptnTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCOptionType";
			definition = "Used for the option types that cannot be classified in ISO and marked as Option Type: OTHR. Options like convert and dividend reinvestment, or DTC (The Depository Trust Corporation)  special option types for the instances where the event and security are eligible for DTC (The Depository Trust Corporation) services like Foreign Tax, Foreign Currency Payments, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected Max16Text protectIdentification;
	/**
	 * Identifies the protect that was submitted. Required when instruction type
	 * is Cover Protect. This identification is either from DTC system which was
	 * assigned upon the submission of the protect instruction or is an
	 * identification that pertains to a cover protect submitted directly to the
	 * agent (indicated by instruction type).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the protect that was submitted. Required when instruction type is Cover Protect. This identification is either from DTC system which was assigned upon the submission of the protect instruction or is an identification that pertains to a cover protect submitted directly to the agent (indicated by instruction type)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "PrtctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentification";
			definition = "Identifies the protect that was submitted. Required when instruction type is Cover Protect. This identification is either from DTC system which was assigned upon the submission of the protect instruction or is an identification that pertains to a cover protect submitted directly to the agent (indicated by instruction type).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected ISODate protectDate;
	/**
	 * Date at which the protect was created.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the protect was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Date at which the protect was created.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected YesNoIndicator acknowledgementFlag;
	/**
	 * Indicates that submitter has agreed to all terms and conditions.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that submitter has agreed to all terms and conditions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAcknowledgementFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "AckFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementFlag";
			definition = "Indicates that submitter has agreed to all terms and conditions.";
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
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
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
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
	protected List<com.tools20022.repository.msg.ConditionAcceptance1> conditionsAcceptance;
	/**
	 * Provides an acceptance flag for the identified conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ConditionAcceptance1
	 * ConditionAcceptance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondsAccptnc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionsAcceptance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides an acceptance flag for the identified conditions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConditionsAcceptance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "CondsAccptnc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionsAcceptance";
			definition = "Provides an acceptance flag for the identified conditions.";
			maxOccurs = 9;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ConditionAcceptance1.mmObject();
		}
	};
	protected YesNoIndicator oddLotFlag;
	/**
	 * Indicates whether the odd lot is accepted for tender offers.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OddLotFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the odd lot is accepted for tender offers."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOddLotFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "OddLotFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotFlag";
			definition = "Indicates whether the odd lot is accepted for tender offers.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator exemptFromInterestPenaltyFlag;
	/**
	 * Indicates whether the instruction is exempt from interest penalties.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptFrIntrstPnltyFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptFromInterestPenaltyFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the instruction is exempt from interest penalties."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExemptFromInterestPenaltyFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "XmptFrIntrstPnltyFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptFromInterestPenaltyFlag";
			definition = "Indicates whether the instruction is exempt from interest penalties.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ISODate declaredPayableDate;
	/**
	 * Date at which the movement has been declared payable by the issuer to
	 * take place (cash and/or securities).
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdPyblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredPayableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the movement has been declared payable by the issuer to take place (cash and/or securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredPayableDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "DclrdPyblDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredPayableDate";
			definition = "Date at which the movement has been declared payable by the issuer to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate recordDate;
	/**
	 * Date at which positions are stuck at the end of the day to note which
	 * parties will receive the relevant amount of entitlement, due to be
	 * distributed on payment date. DTC (The Depository Trust Corporation) uses
	 * a reference match. This is why it is extended to general Information.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
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
	 * "Date at which positions are stuck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date. DTC  (The Depository Trust Corporation) uses a reference match. This is why it is extended to general Information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecordDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date at which positions are stuck at the end of the day to note which parties will receive the relevant amount of entitlement, due to be distributed on payment date. DTC  (The Depository Trust Corporation) uses a reference match. This is why it is extended to general Information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected DTCServiceType1Code serviceTypeIndicator;
	/**
	 * Type of specific DTC service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCServiceType1Code
	 * DTCServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcTpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceTypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of specific DTC service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceTypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "SvcTpInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceTypeIndicator";
			definition = "Type of specific DTC service.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCServiceType1Code.mmObject();
		}
	};
	protected Number customerCount;
	/**
	 * Number of customers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of customers."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerCount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "CstmrCnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCount";
			definition = "Number of customers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Exact3NumericText payoutNumber;
	/**
	 * Number of the payout cash selected for election.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension1
	 * CorporateActionInstructionExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyoutNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayoutNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of the payout cash selected for election."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayoutNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionInstructionExtension1.mmObject();
			isDerived = false;
			xmlTag = "PyoutNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutNumber";
			definition = "Number of the payout cash selected for election.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmInstructionType,
						com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmEventType, com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmSubEventType,
						com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmDTCCOptionType, com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmProtectIdentification,
						com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmProtectDate, com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmAcknowledgementFlag,
						com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmSolicitationDealerFeeFlag, com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmConditionsAcceptance,
						com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmOddLotFlag, com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmExemptFromInterestPenaltyFlag,
						com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmDeclaredPayableDate, com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmRecordDate,
						com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmServiceTypeIndicator, com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmCustomerCount,
						com.tools20022.repository.msg.CorporateActionInstructionExtension1.mmPayoutNumber);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionInstructionExtension1";
				definition = "Provides additional information regarding corporate action instruction.";
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

	public DTCCorporateActionInstructionType1Code getInstructionType() {
		return instructionType;
	}

	public void setInstructionType(DTCCorporateActionInstructionType1Code instructionType) {
		this.instructionType = instructionType;
	}

	public ExtendedEventType1Code getEventType() {
		return eventType;
	}

	public void setEventType(ExtendedEventType1Code eventType) {
		this.eventType = eventType;
	}

	public DTCCSubEventType1Code getSubEventType() {
		return subEventType;
	}

	public void setSubEventType(DTCCSubEventType1Code subEventType) {
		this.subEventType = subEventType;
	}

	public Max4AlphaNumericText getDTCCOptionType() {
		return dTCCOptionType;
	}

	public void setDTCCOptionType(Max4AlphaNumericText dTCCOptionType) {
		this.dTCCOptionType = dTCCOptionType;
	}

	public Max16Text getProtectIdentification() {
		return protectIdentification;
	}

	public void setProtectIdentification(Max16Text protectIdentification) {
		this.protectIdentification = protectIdentification;
	}

	public ISODate getProtectDate() {
		return protectDate;
	}

	public void setProtectDate(ISODate protectDate) {
		this.protectDate = protectDate;
	}

	public YesNoIndicator getAcknowledgementFlag() {
		return acknowledgementFlag;
	}

	public void setAcknowledgementFlag(YesNoIndicator acknowledgementFlag) {
		this.acknowledgementFlag = acknowledgementFlag;
	}

	public YesNoIndicator getSolicitationDealerFeeFlag() {
		return solicitationDealerFeeFlag;
	}

	public void setSolicitationDealerFeeFlag(YesNoIndicator solicitationDealerFeeFlag) {
		this.solicitationDealerFeeFlag = solicitationDealerFeeFlag;
	}

	public List<ConditionAcceptance1> getConditionsAcceptance() {
		return conditionsAcceptance;
	}

	public void setConditionsAcceptance(List<com.tools20022.repository.msg.ConditionAcceptance1> conditionsAcceptance) {
		this.conditionsAcceptance = conditionsAcceptance;
	}

	public YesNoIndicator getOddLotFlag() {
		return oddLotFlag;
	}

	public void setOddLotFlag(YesNoIndicator oddLotFlag) {
		this.oddLotFlag = oddLotFlag;
	}

	public YesNoIndicator getExemptFromInterestPenaltyFlag() {
		return exemptFromInterestPenaltyFlag;
	}

	public void setExemptFromInterestPenaltyFlag(YesNoIndicator exemptFromInterestPenaltyFlag) {
		this.exemptFromInterestPenaltyFlag = exemptFromInterestPenaltyFlag;
	}

	public ISODate getDeclaredPayableDate() {
		return declaredPayableDate;
	}

	public void setDeclaredPayableDate(ISODate declaredPayableDate) {
		this.declaredPayableDate = declaredPayableDate;
	}

	public ISODate getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(ISODate recordDate) {
		this.recordDate = recordDate;
	}

	public DTCServiceType1Code getServiceTypeIndicator() {
		return serviceTypeIndicator;
	}

	public void setServiceTypeIndicator(DTCServiceType1Code serviceTypeIndicator) {
		this.serviceTypeIndicator = serviceTypeIndicator;
	}

	public Number getCustomerCount() {
		return customerCount;
	}

	public void setCustomerCount(Number customerCount) {
		this.customerCount = customerCount;
	}

	public Exact3NumericText getPayoutNumber() {
		return payoutNumber;
	}

	public void setPayoutNumber(Exact3NumericText payoutNumber) {
		this.payoutNumber = payoutNumber;
	}
}
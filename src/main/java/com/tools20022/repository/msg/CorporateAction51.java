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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionNotification002V08;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max3Number;
import com.tools20022.repository.datatype.RestrictedFINXMax350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmDateDetails
 * CorporateAction51.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmPeriodDetails
 * CorporateAction51.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmRateAndAmountDetails
 * CorporateAction51.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmPriceDetails
 * CorporateAction51.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmSecuritiesQuantity
 * CorporateAction51.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmInterestAccruedNumberOfDays
 * CorporateAction51.mmInterestAccruedNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmCouponNumber
 * CorporateAction51.mmCouponNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmCertificationBreakdownIndicator
 * CorporateAction51.mmCertificationBreakdownIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmChargesAppliedIndicator
 * CorporateAction51.mmChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmRestrictionIndicator
 * CorporateAction51.mmRestrictionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmAccruedInterestIndicator
 * CorporateAction51.mmAccruedInterestIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmLetterOfGuaranteedDeliveryIndicator
 * CorporateAction51.mmLetterOfGuaranteedDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmDividendType
 * CorporateAction51.mmDividendType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmConversionType
 * CorporateAction51.mmConversionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmOccurrenceType
 * CorporateAction51.mmOccurrenceType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction51#mmOfferType
 * CorporateAction51.mmOfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmRenounceableEntitlementStatusType
 * CorporateAction51.mmRenounceableEntitlementStatusType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction51#mmEventStage
 * CorporateAction51.mmEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmAdditionalBusinessProcessIndicator
 * CorporateAction51.mmAdditionalBusinessProcessIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction51#mmChangeType
 * CorporateAction51.mmChangeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmIntermediateSecuritiesDistributionType
 * CorporateAction51.mmIntermediateSecuritiesDistributionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmCapitalGainInOutIndicator
 * CorporateAction51.mmCapitalGainInOutIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmTaxableIncomePerShareCalculated
 * CorporateAction51.mmTaxableIncomePerShareCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmElectionType
 * CorporateAction51.mmElectionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmLotteryType
 * CorporateAction51.mmLotteryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmCertificationType
 * CorporateAction51.mmCertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmConsentType
 * CorporateAction51.mmConsentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmInformationType
 * CorporateAction51.mmInformationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmTaxOnNonDistributedProceedsIndicator
 * CorporateAction51.mmTaxOnNonDistributedProceedsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmNewPlaceOfIncorporation
 * CorporateAction51.mmNewPlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmAdditionalInformation
 * CorporateAction51.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmCorporateActionDetails
 * CorporateActionNotification002V08.mmCorporateActionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateAction51"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action event."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateAction51", propOrder = {"dateDetails", "periodDetails", "rateAndAmountDetails", "priceDetails", "securitiesQuantity", "interestAccruedNumberOfDays", "couponNumber", "certificationBreakdownIndicator",
		"chargesAppliedIndicator", "restrictionIndicator", "accruedInterestIndicator", "letterOfGuaranteedDeliveryIndicator", "dividendType", "conversionType", "occurrenceType", "offerType", "renounceableEntitlementStatusType",
		"eventStage", "additionalBusinessProcessIndicator", "changeType", "intermediateSecuritiesDistributionType", "capitalGainInOutIndicator", "taxableIncomePerShareCalculated", "electionType", "lotteryType", "certificationType",
		"consentType", "informationType", "taxOnNonDistributedProceedsIndicator", "newPlaceOfIncorporation", "additionalInformation"})
public class CorporateAction51 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtDtls")
	protected CorporateActionDate74 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate74
	 * CorporateActionDate74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<CorporateActionDate74>> mmDateDetails = new MMMessageAssociationEnd<CorporateAction51, Optional<CorporateActionDate74>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionDate74.mmObject();
		}

		@Override
		public Optional<CorporateActionDate74> getValue(CorporateAction51 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<CorporateActionDate74> value) {
			obj.setDateDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PrdDtls")
	protected CorporateActionPeriod14 periodDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrdDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the periods related to a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<CorporateActionPeriod14>> mmPeriodDetails = new MMMessageAssociationEnd<CorporateAction51, Optional<CorporateActionPeriod14>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPeriod14.mmObject();
		}

		@Override
		public Optional<CorporateActionPeriod14> getValue(CorporateAction51 obj) {
			return obj.getPeriodDetails();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<CorporateActionPeriod14> value) {
			obj.setPeriodDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RateAndAmtDtls")
	protected CorporateActionRate96 rateAndAmountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate96
	 * CorporateActionRate96}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateAndAmtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndAmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about rates and amounts related to a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<CorporateActionRate96>> mmRateAndAmountDetails = new MMMessageAssociationEnd<CorporateAction51, Optional<CorporateActionRate96>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionRate96.mmObject();
		}

		@Override
		public Optional<CorporateActionRate96> getValue(CorporateAction51 obj) {
			return obj.getRateAndAmountDetails();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<CorporateActionRate96> value) {
			obj.setRateAndAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected CorporateActionPrice67 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice67
	 * CorporateActionPrice67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the prices related to a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<CorporateActionPrice67>> mmPriceDetails = new MMMessageAssociationEnd<CorporateAction51, Optional<CorporateActionPrice67>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPrice67.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice67> getValue(CorporateAction51 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<CorporateActionPrice67> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesQty")
	protected CorporateActionQuantity8 securitiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8
	 * CorporateActionQuantity8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantity
	 * CorporateActionEvent.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about securities quantity linked to a corporate action."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<CorporateActionQuantity8>> mmSecuritiesQuantity = new MMMessageAssociationEnd<CorporateAction51, Optional<CorporateActionQuantity8>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "SctiesQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionQuantity8.mmObject();
		}

		@Override
		public Optional<CorporateActionQuantity8> getValue(CorporateAction51 obj) {
			return obj.getSecuritiesQuantity();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<CorporateActionQuantity8> value) {
			obj.setSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstAcrdNbOfDays")
	protected Max3Number interestAccruedNumberOfDays;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstAcrdNbOfDays"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAccruedNumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of days used for calculating the accrued interest amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99A::DAAC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction51, Optional<Max3Number>> mmInterestAccruedNumberOfDays = new MMMessageAttribute<CorporateAction51, Optional<Max3Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "IntrstAcrdNbOfDays";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99A::DAAC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAccruedNumberOfDays";
			definition = "Number of days used for calculating the accrued interest amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}

		@Override
		public Optional<Max3Number> getValue(CorporateAction51 obj) {
			return obj.getInterestAccruedNumberOfDays();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<Max3Number> value) {
			obj.setInterestAccruedNumberOfDays(value.orElse(null));
		}
	};
	@XmlElement(name = "CpnNb")
	protected List<IdentificationFormat4Choice> couponNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationFormat4Choice
	 * IdentificationFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmNumber
	 * CouponAttached.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of the coupon attached/associated with a security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::COUP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, List<IdentificationFormat4Choice>> mmCouponNumber = new MMMessageAssociationEnd<CorporateAction51, List<IdentificationFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "CpnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::COUP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponNumber";
			definition = "Number of the coupon attached/associated with a security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IdentificationFormat4Choice.mmObject();
		}

		@Override
		public List<IdentificationFormat4Choice> getValue(CorporateAction51 obj) {
			return obj.getCouponNumber();
		}

		@Override
		public void setValue(CorporateAction51 obj, List<IdentificationFormat4Choice> value) {
			obj.setCouponNumber(value);
		}
	};
	@XmlElement(name = "CertfctnBrkdwnInd")
	protected YesNoIndicator certificationBreakdownIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationIndicator
	 * BeneficialOwner.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnBrkdwnInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationBreakdownIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether certification/breakdown is required. \r\nYes = certification required.\r\nNo = no certification required."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CEFI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction51, Optional<YesNoIndicator>> mmCertificationBreakdownIndicator = new MMMessageAttribute<CorporateAction51, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "CertfctnBrkdwnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CEFI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationBreakdownIndicator";
			definition = "Indicates whether certification/breakdown is required. \r\nYes = certification required.\r\nNo = no certification required.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction51 obj) {
			return obj.getCertificationBreakdownIndicator();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<YesNoIndicator> value) {
			obj.setCertificationBreakdownIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgsApldInd")
	protected YesNoIndicator chargesAppliedIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChargesAppliedIndicator
	 * CorporateActionOption.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsApldInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAppliedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether charges apply to the holder, for instance redemption charges."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::RCHG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction51, Optional<YesNoIndicator>> mmChargesAppliedIndicator = new MMMessageAttribute<CorporateAction51, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChargesAppliedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "ChrgsApldInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::RCHG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction51 obj) {
			return obj.getChargesAppliedIndicator();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<YesNoIndicator> value) {
			obj.setChargesAppliedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "RstrctnInd")
	protected YesNoIndicator restrictionIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRestrictionIndicator
	 * CorporateActionEvent.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctnInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is restrictions apply to the corporate action event or not.\nYes = There is restrictions.\nNo = There is no restrictions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::COMP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction51, Optional<YesNoIndicator>> mmRestrictionIndicator = new MMMessageAttribute<CorporateAction51, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRestrictionIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "RstrctnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::COMP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there is restrictions apply to the corporate action event or not.\nYes = There is restrictions.\nNo = There is no restrictions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction51 obj) {
			return obj.getRestrictionIndicator();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<YesNoIndicator> value) {
			obj.setRestrictionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstInd")
	protected YesNoIndicator accruedInterestIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterestIndicator
	 * SecuritiesSettlement.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the holder is entitled to accrued interest."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::ACRU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction51, Optional<YesNoIndicator>> mmAccruedInterestIndicator = new MMMessageAttribute<CorporateAction51, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmAccruedInterestIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::ACRU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestIndicator";
			definition = "Indicates whether the holder is entitled to accrued interest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction51 obj) {
			return obj.getAccruedInterestIndicator();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<YesNoIndicator> value) {
			obj.setAccruedInterestIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "LttrOfGrntedDlvryInd")
	protected YesNoIndicator letterOfGuaranteedDeliveryIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfGrntedDlvryInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuaranteedDeliveryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a letter of guaranteed delivery can be submitted in order to participate in the offer on full eligible position. It is not intended for use in situations arising from failed or late trades."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction51, Optional<YesNoIndicator>> mmLetterOfGuaranteedDeliveryIndicator = new MMMessageAttribute<CorporateAction51, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "LttrOfGrntedDlvryInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuaranteedDeliveryIndicator";
			definition = "Indicates whether a letter of guaranteed delivery can be submitted in order to participate in the offer on full eligible position. It is not intended for use in situations arising from failed or late trades.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction51 obj) {
			return obj.getLetterOfGuaranteedDeliveryIndicator();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<YesNoIndicator> value) {
			obj.setLetterOfGuaranteedDeliveryIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "DvddTp")
	protected DividendTypeFormat10Choice dividendType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat10Choice
	 * DividendTypeFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDividend
	 * Security.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conditions in which a dividend is paid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DIVI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<DividendTypeFormat10Choice>> mmDividendType = new MMMessageAssociationEnd<CorporateAction51, Optional<DividendTypeFormat10Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "DvddTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DIVI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendType";
			definition = "Specifies the conditions in which a dividend is paid.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DividendTypeFormat10Choice.mmObject();
		}

		@Override
		public Optional<DividendTypeFormat10Choice> getValue(CorporateAction51 obj) {
			return obj.getDividendType();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<DividendTypeFormat10Choice> value) {
			obj.setDividendType(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvsTp")
	protected ConversionTypeFormat4Choice conversionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat4Choice
	 * ConversionTypeFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionType
	 * SecuritiesConversion.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conversion type of an instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CONV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<ConversionTypeFormat4Choice>> mmConversionType = new MMMessageAssociationEnd<CorporateAction51, Optional<ConversionTypeFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "ConvsTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CONV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionType";
			definition = "Specifies the conversion type of an instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ConversionTypeFormat4Choice.mmObject();
		}

		@Override
		public Optional<ConversionTypeFormat4Choice> getValue(CorporateAction51 obj) {
			return obj.getConversionType();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<ConversionTypeFormat4Choice> value) {
			obj.setConversionType(value.orElse(null));
		}
	};
	@XmlElement(name = "OcrncTp")
	protected DistributionTypeFormat8Choice occurrenceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat8Choice
	 * DistributionTypeFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionDistribution
	 * CorporateActionServicing.mmCorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OcrncTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OccurrenceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions in which the instructions and/or payment of the proceeds occurs."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DITY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<DistributionTypeFormat8Choice>> mmOccurrenceType = new MMMessageAssociationEnd<CorporateAction51, Optional<DistributionTypeFormat8Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionServicing.mmCorporateActionDistribution;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "OcrncTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DITY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OccurrenceType";
			definition = "Specifies the conditions in which the instructions and/or payment of the proceeds occurs.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DistributionTypeFormat8Choice.mmObject();
		}

		@Override
		public Optional<DistributionTypeFormat8Choice> getValue(CorporateAction51 obj) {
			return obj.getOccurrenceType();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<DistributionTypeFormat8Choice> value) {
			obj.setOccurrenceType(value.orElse(null));
		}
	};
	@XmlElement(name = "OfferTp")
	protected List<OfferTypeFormat11Choice> offerType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat11Choice
	 * OfferTypeFormat11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOfferType
	 * CorporateActionOption.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OfferTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conditions that apply to the offer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::OFFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, List<OfferTypeFormat11Choice>> mmOfferType = new MMMessageAssociationEnd<CorporateAction51, List<OfferTypeFormat11Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOfferType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "OfferTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::OFFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferType";
			definition = "Specifies the conditions that apply to the offer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OfferTypeFormat11Choice.mmObject();
		}

		@Override
		public List<OfferTypeFormat11Choice> getValue(CorporateAction51 obj) {
			return obj.getOfferType();
		}

		@Override
		public void setValue(CorporateAction51 obj, List<OfferTypeFormat11Choice> value) {
			obj.setOfferType(value);
		}
	};
	@XmlElement(name = "RnncblEntitlmntStsTp")
	protected RenounceableEntitlementStatusTypeFormat4Choice renounceableEntitlementStatusType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat4Choice
	 * RenounceableEntitlementStatusTypeFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmRenounceableEntitlementStatusType
	 * CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RnncblEntitlmntStsTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenounceableEntitlementStatusType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether terms of the event allow resale of the rights."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<RenounceableEntitlementStatusTypeFormat4Choice>> mmRenounceableEntitlementStatusType = new MMMessageAssociationEnd<CorporateAction51, Optional<RenounceableEntitlementStatusTypeFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "RnncblEntitlmntStsTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenounceableEntitlementStatusType";
			definition = "Specifies whether terms of the event allow resale of the rights.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RenounceableEntitlementStatusTypeFormat4Choice.mmObject();
		}

		@Override
		public Optional<RenounceableEntitlementStatusTypeFormat4Choice> getValue(CorporateAction51 obj) {
			return obj.getRenounceableEntitlementStatusType();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<RenounceableEntitlementStatusTypeFormat4Choice> value) {
			obj.setRenounceableEntitlementStatusType(value.orElse(null));
		}
	};
	@XmlElement(name = "EvtStag")
	protected List<CorporateActionEventStageFormat20Choice> eventStage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat20Choice
	 * CorporateActionEventStageFormat20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventStage
	 * CorporateActionEvent.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtStag"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ESTA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, List<CorporateActionEventStageFormat20Choice>> mmEventStage = new MMMessageAssociationEnd<CorporateAction51, List<CorporateActionEventStageFormat20Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "EvtStag";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ESTA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionEventStageFormat20Choice.mmObject();
		}

		@Override
		public List<CorporateActionEventStageFormat20Choice> getValue(CorporateAction51 obj) {
			return obj.getEventStage();
		}

		@Override
		public void setValue(CorporateAction51 obj, List<CorporateActionEventStageFormat20Choice> value) {
			obj.setEventStage(value);
		}
	};
	@XmlElement(name = "AddtlBizPrcInd")
	protected List<AdditionalBusinessProcessFormat12Choice> additionalBusinessProcessIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat12Choice
	 * AdditionalBusinessProcessFormat12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAdditionalBusinessProcess
	 * CorporateActionEvent.mmAdditionalBusinessProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBizPrcInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBusinessProcessIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ADDB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, List<AdditionalBusinessProcessFormat12Choice>> mmAdditionalBusinessProcessIndicator = new MMMessageAssociationEnd<CorporateAction51, List<AdditionalBusinessProcessFormat12Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAdditionalBusinessProcess;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "AddtlBizPrcInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ADDB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBusinessProcessIndicator";
			definition = "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalBusinessProcessFormat12Choice.mmObject();
		}

		@Override
		public List<AdditionalBusinessProcessFormat12Choice> getValue(CorporateAction51 obj) {
			return obj.getAdditionalBusinessProcessIndicator();
		}

		@Override
		public void setValue(CorporateAction51 obj, List<AdditionalBusinessProcessFormat12Choice> value) {
			obj.setAdditionalBusinessProcessIndicator(value);
		}
	};
	@XmlElement(name = "ChngTp")
	protected List<CorporateActionChangeTypeFormat8Choice> changeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat8Choice
	 * CorporateActionChangeTypeFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmChangeType
	 * SecuritiesModification.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChngTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of change announced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CHAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, List<CorporateActionChangeTypeFormat8Choice>> mmChangeType = new MMMessageAssociationEnd<CorporateAction51, List<CorporateActionChangeTypeFormat8Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmChangeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "ChngTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CHAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeType";
			definition = "Specifies the type of change announced.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionChangeTypeFormat8Choice.mmObject();
		}

		@Override
		public List<CorporateActionChangeTypeFormat8Choice> getValue(CorporateAction51 obj) {
			return obj.getChangeType();
		}

		@Override
		public void setValue(CorporateAction51 obj, List<CorporateActionChangeTypeFormat8Choice> value) {
			obj.setChangeType(value);
		}
	};
	@XmlElement(name = "IntrmdtSctiesDstrbtnTp")
	protected IntermediateSecuritiesDistributionTypeFormat18Choice intermediateSecuritiesDistributionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat18Choice
	 * IntermediateSecuritiesDistributionTypeFormat18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesDistributionType
	 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmdtSctiesDstrbtnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistributionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of intermediates securities distribution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RHDI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<IntermediateSecuritiesDistributionTypeFormat18Choice>> mmIntermediateSecuritiesDistributionType = new MMMessageAssociationEnd<CorporateAction51, Optional<IntermediateSecuritiesDistributionTypeFormat18Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "IntrmdtSctiesDstrbtnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RHDI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Type of intermediates securities distribution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IntermediateSecuritiesDistributionTypeFormat18Choice.mmObject();
		}

		@Override
		public Optional<IntermediateSecuritiesDistributionTypeFormat18Choice> getValue(CorporateAction51 obj) {
			return obj.getIntermediateSecuritiesDistributionType();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<IntermediateSecuritiesDistributionTypeFormat18Choice> value) {
			obj.setIntermediateSecuritiesDistributionType(value.orElse(null));
		}
	};
	@XmlElement(name = "CptlGnInOutInd")
	protected CapitalGainFormat4Choice capitalGainInOutIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat4Choice
	 * CapitalGainFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUCapitalGain
	 * SecuritiesTax.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CptlGnInOutInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainInOutIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the capital gain is in the scope of the EU Savings directive for the income realised upon the sale, refund or redemption of shares and units (.) (Article 6(1d))."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ECIO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<CapitalGainFormat4Choice>> mmCapitalGainInOutIndicator = new MMMessageAssociationEnd<CorporateAction51, Optional<CapitalGainFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "CptlGnInOutInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ECIO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainInOutIndicator";
			definition = "Specifies whether the capital gain is in the scope of the EU Savings directive for the income realised upon the sale, refund or redemption of shares and units (.) (Article 6(1d)).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CapitalGainFormat4Choice.mmObject();
		}

		@Override
		public Optional<CapitalGainFormat4Choice> getValue(CorporateAction51 obj) {
			return obj.getCapitalGainInOutIndicator();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<CapitalGainFormat4Choice> value) {
			obj.setCapitalGainInOutIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblIncmPerShrClctd")
	protected TaxableIncomePerShareCalculatedFormat4Choice taxableIncomePerShareCalculated;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat4Choice
	 * TaxableIncomePerShareCalculatedFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShareCalculated
	 * SecuritiesTax.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerShrClctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShareCalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the financial instrument calculates the taxable income per dividend/taxable income per share."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TDTA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<TaxableIncomePerShareCalculatedFormat4Choice>> mmTaxableIncomePerShareCalculated = new MMMessageAssociationEnd<CorporateAction51, Optional<TaxableIncomePerShareCalculatedFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShareCalculated;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShrClctd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TDTA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the financial instrument calculates the taxable income per dividend/taxable income per share.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxableIncomePerShareCalculatedFormat4Choice.mmObject();
		}

		@Override
		public Optional<TaxableIncomePerShareCalculatedFormat4Choice> getValue(CorporateAction51 obj) {
			return obj.getTaxableIncomePerShareCalculated();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<TaxableIncomePerShareCalculatedFormat4Choice> value) {
			obj.setTaxableIncomePerShareCalculated(value.orElse(null));
		}
	};
	@XmlElement(name = "ElctnTp")
	protected ElectionTypeFormat4Choice electionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat4Choice
	 * ElectionTypeFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmElectionType
	 * CorporateActionElection.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the effect on the holdings of electing a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ELCT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<ElectionTypeFormat4Choice>> mmElectionType = new MMMessageAssociationEnd<CorporateAction51, Optional<ElectionTypeFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionElection.mmElectionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "ElctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ELCT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionType";
			definition = "Specifies the effect on the holdings of electing a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ElectionTypeFormat4Choice.mmObject();
		}

		@Override
		public Optional<ElectionTypeFormat4Choice> getValue(CorporateAction51 obj) {
			return obj.getElectionType();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<ElectionTypeFormat4Choice> value) {
			obj.setElectionType(value.orElse(null));
		}
	};
	@XmlElement(name = "LtryTp")
	protected LotteryTypeFormat5Choice lotteryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat5Choice
	 * LotteryTypeFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmLotteryType
	 * Lottery.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of lottery announced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LOTO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<LotteryTypeFormat5Choice>> mmLotteryType = new MMMessageAssociationEnd<CorporateAction51, Optional<LotteryTypeFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> Lottery.mmLotteryType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "LtryTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LOTO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LotteryTypeFormat5Choice.mmObject();
		}

		@Override
		public Optional<LotteryTypeFormat5Choice> getValue(CorporateAction51 obj) {
			return obj.getLotteryType();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<LotteryTypeFormat5Choice> value) {
			obj.setLotteryType(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnTp")
	protected CertificationTypeFormat4Choice certificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat4Choice
	 * CertificationTypeFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the certification format required, this is, physical or electronic format."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CETI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<CertificationTypeFormat4Choice>> mmCertificationType = new MMMessageAssociationEnd<CorporateAction51, Optional<CertificationTypeFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "CertfctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CETI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationType";
			definition = "Specifies the certification format required, this is, physical or electronic format.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CertificationTypeFormat4Choice.mmObject();
		}

		@Override
		public Optional<CertificationTypeFormat4Choice> getValue(CorporateAction51 obj) {
			return obj.getCertificationType();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<CertificationTypeFormat4Choice> value) {
			obj.setCertificationType(value.orElse(null));
		}
	};
	@XmlElement(name = "CnsntTp")
	protected ConsentTypeFormat5Choice consentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat5Choice
	 * ConsentTypeFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmConsentType
	 * CorporateActionEvent.mmConsentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnsntTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of consent announced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<ConsentTypeFormat5Choice>> mmConsentType = new MMMessageAssociationEnd<CorporateAction51, Optional<ConsentTypeFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmConsentType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "CnsntTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentType";
			definition = "Specifies the type of consent announced.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ConsentTypeFormat5Choice.mmObject();
		}

		@Override
		public Optional<ConsentTypeFormat5Choice> getValue(CorporateAction51 obj) {
			return obj.getConsentType();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<ConsentTypeFormat5Choice> value) {
			obj.setConsentType(value.orElse(null));
		}
	};
	@XmlElement(name = "InfTp")
	protected InformationTypeFormat5Choice informationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InformationTypeFormat5Choice
	 * InformationTypeFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of information event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<InformationTypeFormat5Choice>> mmInformationType = new MMMessageAssociationEnd<CorporateAction51, Optional<InformationTypeFormat5Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "InfTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationType";
			definition = "Specifies the type of information event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InformationTypeFormat5Choice.mmObject();
		}

		@Override
		public Optional<InformationTypeFormat5Choice> getValue(CorporateAction51 obj) {
			return obj.getInformationType();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<InformationTypeFormat5Choice> value) {
			obj.setInformationType(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxOnNonDstrbtdPrcdsInd")
	protected GenericIdentification47 taxOnNonDistributedProceedsIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification47
	 * GenericIdentification47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTaxOnNonDistributedProceedsIndicator
	 * CorporateActionEvent.mmTaxOnNonDistributedProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxOnNonDstrbtdPrcdsInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnNonDistributedProceedsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the tax regulation being attributed to the non-distributed proceeds event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<GenericIdentification47>> mmTaxOnNonDistributedProceedsIndicator = new MMMessageAssociationEnd<CorporateAction51, Optional<GenericIdentification47>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmTaxOnNonDistributedProceedsIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "TaxOnNonDstrbtdPrcdsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnNonDistributedProceedsIndicator";
			definition = "Specifies the tax regulation being attributed to the non-distributed proceeds event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification47.mmObject();
		}

		@Override
		public Optional<GenericIdentification47> getValue(CorporateAction51 obj) {
			return obj.getTaxOnNonDistributedProceedsIndicator();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<GenericIdentification47> value) {
			obj.setTaxOnNonDistributedProceedsIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NewPlcOfIncorprtn")
	protected RestrictedFINXMax350Text newPlaceOfIncorporation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax350Text
	 * RestrictedFINXMax350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewOrganisationInformation
	 * SecuritiesModification.mmNewOrganisationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewPlcOfIncorprtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPlaceOfIncorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New company's place of incorporation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94G::NPLI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction51, Optional<RestrictedFINXMax350Text>> mmNewPlaceOfIncorporation = new MMMessageAttribute<CorporateAction51, Optional<RestrictedFINXMax350Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmNewOrganisationInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "NewPlcOfIncorprtn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94G::NPLI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPlaceOfIncorporation";
			definition = "New company's place of incorporation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax350Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax350Text> getValue(CorporateAction51 obj) {
			return obj.getNewPlaceOfIncorporation();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<RestrictedFINXMax350Text> value) {
			obj.setNewPlaceOfIncorporation(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative39 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative39
	 * CorporateActionNarrative39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51
	 * CorporateAction51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information. This field may only be used when the information to be transmitted, cannot be coded."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction51, Optional<CorporateActionNarrative39>> mmAdditionalInformation = new MMMessageAssociationEnd<CorporateAction51, Optional<CorporateActionNarrative39>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction51.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information. This field may only be used when the information to be transmitted, cannot be coded.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionNarrative39.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative39> getValue(CorporateAction51 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateAction51 obj, Optional<CorporateActionNarrative39> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction51.mmDateDetails, com.tools20022.repository.msg.CorporateAction51.mmPeriodDetails,
						com.tools20022.repository.msg.CorporateAction51.mmRateAndAmountDetails, com.tools20022.repository.msg.CorporateAction51.mmPriceDetails, com.tools20022.repository.msg.CorporateAction51.mmSecuritiesQuantity,
						com.tools20022.repository.msg.CorporateAction51.mmInterestAccruedNumberOfDays, com.tools20022.repository.msg.CorporateAction51.mmCouponNumber,
						com.tools20022.repository.msg.CorporateAction51.mmCertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateAction51.mmChargesAppliedIndicator,
						com.tools20022.repository.msg.CorporateAction51.mmRestrictionIndicator, com.tools20022.repository.msg.CorporateAction51.mmAccruedInterestIndicator,
						com.tools20022.repository.msg.CorporateAction51.mmLetterOfGuaranteedDeliveryIndicator, com.tools20022.repository.msg.CorporateAction51.mmDividendType,
						com.tools20022.repository.msg.CorporateAction51.mmConversionType, com.tools20022.repository.msg.CorporateAction51.mmOccurrenceType, com.tools20022.repository.msg.CorporateAction51.mmOfferType,
						com.tools20022.repository.msg.CorporateAction51.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction51.mmEventStage,
						com.tools20022.repository.msg.CorporateAction51.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction51.mmChangeType,
						com.tools20022.repository.msg.CorporateAction51.mmIntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateAction51.mmCapitalGainInOutIndicator,
						com.tools20022.repository.msg.CorporateAction51.mmTaxableIncomePerShareCalculated, com.tools20022.repository.msg.CorporateAction51.mmElectionType, com.tools20022.repository.msg.CorporateAction51.mmLotteryType,
						com.tools20022.repository.msg.CorporateAction51.mmCertificationType, com.tools20022.repository.msg.CorporateAction51.mmConsentType, com.tools20022.repository.msg.CorporateAction51.mmInformationType,
						com.tools20022.repository.msg.CorporateAction51.mmTaxOnNonDistributedProceedsIndicator, com.tools20022.repository.msg.CorporateAction51.mmNewPlaceOfIncorporation,
						com.tools20022.repository.msg.CorporateAction51.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotification002V08.mmCorporateActionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateAction51";
				definition = "Provides information about the corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CorporateActionDate74> getDateDetails() {
		return dateDetails == null ? Optional.empty() : Optional.of(dateDetails);
	}

	public CorporateAction51 setDateDetails(CorporateActionDate74 dateDetails) {
		this.dateDetails = dateDetails;
		return this;
	}

	public Optional<CorporateActionPeriod14> getPeriodDetails() {
		return periodDetails == null ? Optional.empty() : Optional.of(periodDetails);
	}

	public CorporateAction51 setPeriodDetails(CorporateActionPeriod14 periodDetails) {
		this.periodDetails = periodDetails;
		return this;
	}

	public Optional<CorporateActionRate96> getRateAndAmountDetails() {
		return rateAndAmountDetails == null ? Optional.empty() : Optional.of(rateAndAmountDetails);
	}

	public CorporateAction51 setRateAndAmountDetails(CorporateActionRate96 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
		return this;
	}

	public Optional<CorporateActionPrice67> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public CorporateAction51 setPriceDetails(CorporateActionPrice67 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}

	public Optional<CorporateActionQuantity8> getSecuritiesQuantity() {
		return securitiesQuantity == null ? Optional.empty() : Optional.of(securitiesQuantity);
	}

	public CorporateAction51 setSecuritiesQuantity(CorporateActionQuantity8 securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
		return this;
	}

	public Optional<Max3Number> getInterestAccruedNumberOfDays() {
		return interestAccruedNumberOfDays == null ? Optional.empty() : Optional.of(interestAccruedNumberOfDays);
	}

	public CorporateAction51 setInterestAccruedNumberOfDays(Max3Number interestAccruedNumberOfDays) {
		this.interestAccruedNumberOfDays = interestAccruedNumberOfDays;
		return this;
	}

	public List<IdentificationFormat4Choice> getCouponNumber() {
		return couponNumber == null ? couponNumber = new ArrayList<>() : couponNumber;
	}

	public CorporateAction51 setCouponNumber(List<IdentificationFormat4Choice> couponNumber) {
		this.couponNumber = Objects.requireNonNull(couponNumber);
		return this;
	}

	public Optional<YesNoIndicator> getCertificationBreakdownIndicator() {
		return certificationBreakdownIndicator == null ? Optional.empty() : Optional.of(certificationBreakdownIndicator);
	}

	public CorporateAction51 setCertificationBreakdownIndicator(YesNoIndicator certificationBreakdownIndicator) {
		this.certificationBreakdownIndicator = certificationBreakdownIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getChargesAppliedIndicator() {
		return chargesAppliedIndicator == null ? Optional.empty() : Optional.of(chargesAppliedIndicator);
	}

	public CorporateAction51 setChargesAppliedIndicator(YesNoIndicator chargesAppliedIndicator) {
		this.chargesAppliedIndicator = chargesAppliedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getRestrictionIndicator() {
		return restrictionIndicator == null ? Optional.empty() : Optional.of(restrictionIndicator);
	}

	public CorporateAction51 setRestrictionIndicator(YesNoIndicator restrictionIndicator) {
		this.restrictionIndicator = restrictionIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getAccruedInterestIndicator() {
		return accruedInterestIndicator == null ? Optional.empty() : Optional.of(accruedInterestIndicator);
	}

	public CorporateAction51 setAccruedInterestIndicator(YesNoIndicator accruedInterestIndicator) {
		this.accruedInterestIndicator = accruedInterestIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getLetterOfGuaranteedDeliveryIndicator() {
		return letterOfGuaranteedDeliveryIndicator == null ? Optional.empty() : Optional.of(letterOfGuaranteedDeliveryIndicator);
	}

	public CorporateAction51 setLetterOfGuaranteedDeliveryIndicator(YesNoIndicator letterOfGuaranteedDeliveryIndicator) {
		this.letterOfGuaranteedDeliveryIndicator = letterOfGuaranteedDeliveryIndicator;
		return this;
	}

	public Optional<DividendTypeFormat10Choice> getDividendType() {
		return dividendType == null ? Optional.empty() : Optional.of(dividendType);
	}

	public CorporateAction51 setDividendType(DividendTypeFormat10Choice dividendType) {
		this.dividendType = dividendType;
		return this;
	}

	public Optional<ConversionTypeFormat4Choice> getConversionType() {
		return conversionType == null ? Optional.empty() : Optional.of(conversionType);
	}

	public CorporateAction51 setConversionType(ConversionTypeFormat4Choice conversionType) {
		this.conversionType = conversionType;
		return this;
	}

	public Optional<DistributionTypeFormat8Choice> getOccurrenceType() {
		return occurrenceType == null ? Optional.empty() : Optional.of(occurrenceType);
	}

	public CorporateAction51 setOccurrenceType(DistributionTypeFormat8Choice occurrenceType) {
		this.occurrenceType = occurrenceType;
		return this;
	}

	public List<OfferTypeFormat11Choice> getOfferType() {
		return offerType == null ? offerType = new ArrayList<>() : offerType;
	}

	public CorporateAction51 setOfferType(List<OfferTypeFormat11Choice> offerType) {
		this.offerType = Objects.requireNonNull(offerType);
		return this;
	}

	public Optional<RenounceableEntitlementStatusTypeFormat4Choice> getRenounceableEntitlementStatusType() {
		return renounceableEntitlementStatusType == null ? Optional.empty() : Optional.of(renounceableEntitlementStatusType);
	}

	public CorporateAction51 setRenounceableEntitlementStatusType(RenounceableEntitlementStatusTypeFormat4Choice renounceableEntitlementStatusType) {
		this.renounceableEntitlementStatusType = renounceableEntitlementStatusType;
		return this;
	}

	public List<CorporateActionEventStageFormat20Choice> getEventStage() {
		return eventStage == null ? eventStage = new ArrayList<>() : eventStage;
	}

	public CorporateAction51 setEventStage(List<CorporateActionEventStageFormat20Choice> eventStage) {
		this.eventStage = Objects.requireNonNull(eventStage);
		return this;
	}

	public List<AdditionalBusinessProcessFormat12Choice> getAdditionalBusinessProcessIndicator() {
		return additionalBusinessProcessIndicator == null ? additionalBusinessProcessIndicator = new ArrayList<>() : additionalBusinessProcessIndicator;
	}

	public CorporateAction51 setAdditionalBusinessProcessIndicator(List<AdditionalBusinessProcessFormat12Choice> additionalBusinessProcessIndicator) {
		this.additionalBusinessProcessIndicator = Objects.requireNonNull(additionalBusinessProcessIndicator);
		return this;
	}

	public List<CorporateActionChangeTypeFormat8Choice> getChangeType() {
		return changeType == null ? changeType = new ArrayList<>() : changeType;
	}

	public CorporateAction51 setChangeType(List<CorporateActionChangeTypeFormat8Choice> changeType) {
		this.changeType = Objects.requireNonNull(changeType);
		return this;
	}

	public Optional<IntermediateSecuritiesDistributionTypeFormat18Choice> getIntermediateSecuritiesDistributionType() {
		return intermediateSecuritiesDistributionType == null ? Optional.empty() : Optional.of(intermediateSecuritiesDistributionType);
	}

	public CorporateAction51 setIntermediateSecuritiesDistributionType(IntermediateSecuritiesDistributionTypeFormat18Choice intermediateSecuritiesDistributionType) {
		this.intermediateSecuritiesDistributionType = intermediateSecuritiesDistributionType;
		return this;
	}

	public Optional<CapitalGainFormat4Choice> getCapitalGainInOutIndicator() {
		return capitalGainInOutIndicator == null ? Optional.empty() : Optional.of(capitalGainInOutIndicator);
	}

	public CorporateAction51 setCapitalGainInOutIndicator(CapitalGainFormat4Choice capitalGainInOutIndicator) {
		this.capitalGainInOutIndicator = capitalGainInOutIndicator;
		return this;
	}

	public Optional<TaxableIncomePerShareCalculatedFormat4Choice> getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated == null ? Optional.empty() : Optional.of(taxableIncomePerShareCalculated);
	}

	public CorporateAction51 setTaxableIncomePerShareCalculated(TaxableIncomePerShareCalculatedFormat4Choice taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = taxableIncomePerShareCalculated;
		return this;
	}

	public Optional<ElectionTypeFormat4Choice> getElectionType() {
		return electionType == null ? Optional.empty() : Optional.of(electionType);
	}

	public CorporateAction51 setElectionType(ElectionTypeFormat4Choice electionType) {
		this.electionType = electionType;
		return this;
	}

	public Optional<LotteryTypeFormat5Choice> getLotteryType() {
		return lotteryType == null ? Optional.empty() : Optional.of(lotteryType);
	}

	public CorporateAction51 setLotteryType(LotteryTypeFormat5Choice lotteryType) {
		this.lotteryType = lotteryType;
		return this;
	}

	public Optional<CertificationTypeFormat4Choice> getCertificationType() {
		return certificationType == null ? Optional.empty() : Optional.of(certificationType);
	}

	public CorporateAction51 setCertificationType(CertificationTypeFormat4Choice certificationType) {
		this.certificationType = certificationType;
		return this;
	}

	public Optional<ConsentTypeFormat5Choice> getConsentType() {
		return consentType == null ? Optional.empty() : Optional.of(consentType);
	}

	public CorporateAction51 setConsentType(ConsentTypeFormat5Choice consentType) {
		this.consentType = consentType;
		return this;
	}

	public Optional<InformationTypeFormat5Choice> getInformationType() {
		return informationType == null ? Optional.empty() : Optional.of(informationType);
	}

	public CorporateAction51 setInformationType(InformationTypeFormat5Choice informationType) {
		this.informationType = informationType;
		return this;
	}

	public Optional<GenericIdentification47> getTaxOnNonDistributedProceedsIndicator() {
		return taxOnNonDistributedProceedsIndicator == null ? Optional.empty() : Optional.of(taxOnNonDistributedProceedsIndicator);
	}

	public CorporateAction51 setTaxOnNonDistributedProceedsIndicator(GenericIdentification47 taxOnNonDistributedProceedsIndicator) {
		this.taxOnNonDistributedProceedsIndicator = taxOnNonDistributedProceedsIndicator;
		return this;
	}

	public Optional<RestrictedFINXMax350Text> getNewPlaceOfIncorporation() {
		return newPlaceOfIncorporation == null ? Optional.empty() : Optional.of(newPlaceOfIncorporation);
	}

	public CorporateAction51 setNewPlaceOfIncorporation(RestrictedFINXMax350Text newPlaceOfIncorporation) {
		this.newPlaceOfIncorporation = newPlaceOfIncorporation;
		return this;
	}

	public Optional<CorporateActionNarrative39> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateAction51 setAdditionalInformation(CorporateActionNarrative39 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}
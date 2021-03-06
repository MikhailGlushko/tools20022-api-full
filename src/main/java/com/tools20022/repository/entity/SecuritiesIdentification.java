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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Unique and unambiguous identifier of a security, assigned under a formal or
 * proprietary identification scheme.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesIdentification"
 * src="doc-files/SecuritiesIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentifiedSecurity
 * SecuritiesIdentification.mmIdentifiedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
 * SecuritiesIdentification.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRIC
 * SecuritiesIdentification.mmRIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmTickerSymbol
 * SecuritiesIdentification.mmTickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmBloomberg
 * SecuritiesIdentification.mmBloomberg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCTA
 * SecuritiesIdentification.mmCTA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCommon
 * SecuritiesIdentification.mmCommon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmName
 * SecuritiesIdentification.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSEDOL
 * SecuritiesIdentification.mmSEDOL}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCUSIP
 * SecuritiesIdentification.mmCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmQUICK
 * SecuritiesIdentification.mmQUICK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmWertpapier
 * SecuritiesIdentification.mmWertpapier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmDutch
 * SecuritiesIdentification.mmDutch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValoren
 * SecuritiesIdentification.mmValoren}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSicovam
 * SecuritiesIdentification.mmSicovam}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmBelgian
 * SecuritiesIdentification.mmBelgian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentificationSuffix
 * SecuritiesIdentification.mmIdentificationSuffix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmGenericIdentification
 * SecuritiesIdentification.mmGenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValidityPeriod
 * SecuritiesIdentification.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmApplicableTradingMarket
 * SecuritiesIdentification.mmApplicableTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmPrimeIdentification
 * SecuritiesIdentification.mmPrimeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRelatedOtherIdentification
 * SecuritiesIdentification.mmRelatedOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmTradingIdentification
 * SecuritiesIdentification.mmTradingIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmIdentification
 * Security.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmPrimeIdentification
 * SecuritiesIdentification.mmPrimeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRelatedOtherIdentification
 * SecuritiesIdentification.mmRelatedOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSecuritiesIdentification
 * GenericIdentification.mmRelatedSecuritiesIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#mmRelatedSecurity
 * LocalName.mmRelatedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurityTradingIdentification
 * TradingMarket.mmListedSecurityTradingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesIdentification
 * DateTimePeriod.mmRelatedSecuritiesIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7#mmOtherIdentification
 * SecurityIdentification7.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7#mmDescription
 * SecurityIdentification7.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#mmIdentification
 * SecurityIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmAlternateIdentification
 * SecurityIdentification1Choice.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmOtherProprietaryIdentification
 * SecurityIdentification3Choice.mmOtherProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification1#mmIdentificationSource
 * AlternateIdentification1.mmIdentificationSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification11Choice#mmOtherIdentification
 * SecurityIdentification11Choice.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11#mmIdentification
 * SecurityIdentification11.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11#mmDescription
 * SecurityIdentification11.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmOtherIdentification
 * SecurityIdentification14.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmDescription
 * SecurityIdentification14.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15#mmOtherIdentification
 * SecurityIdentification15.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15#mmDescription
 * SecurityIdentification15.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification2#mmIdentificationSource
 * AlternateIdentification2.mmIdentificationSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification12Choice#mmOtherIdentification
 * SecurityIdentification12Choice.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification12#mmIdentification
 * SecurityIdentification12.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification12#mmDescription
 * SecurityIdentification12.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification16#mmOtherIdentification
 * SecurityIdentification16.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification16#mmDescription
 * SecurityIdentification16.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification2#mmType
 * AlternateSecurityIdentification2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification4Choice#mmProprietary
 * SecurityIdentification4Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#mmOtherIdentification
 * SecurityIdentification3.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification5Choice#mmOtherIdentification
 * SecurityIdentification5Choice.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification6Choice#mmOtherIdentification
 * SecurityIdentification6Choice.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification10Choice#mmOtherIdentification
 * SecurityIdentification10Choice.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification9#mmSecurityIdentification
 * SecurityIdentification9.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification9#mmDescription
 * SecurityIdentification9.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification7Choice#mmOtherProprietaryIdentification
 * SecurityIdentification7Choice.mmOtherProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification8#mmSecurityIdentification
 * SecurityIdentification8.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification8#mmDescription
 * SecurityIdentification8.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity1#mmFinancialInstrumentIdentification
 * FinancialInstrumentIdentificationValidity1.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TriggeringInstructions#mmTriggerSecurityDetails
 * TriggeringInstructions.mmTriggerSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportItem1#mmFinancialInstrumentIdentification
 * ReportItem1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#mmFinancialInstrumentIdentification
 * AggregateHoldingBalance1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification3#mmIdentificationSource
 * AlternateIdentification3.mmIdentificationSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentificationQueryCriteria1#mmAlternativeInstrumentIdentification
 * SecurityIdentificationQueryCriteria1.mmAlternativeInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification18Choice#mmAlternativeInstrumentIdentification
 * SecurityIdentification18Choice.mmAlternativeInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice#mmAlternativeInstrumentIdentification
 * SecurityIdentification19Choice.mmAlternativeInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmAlternateIdentification
 * SecurityIdentification22Choice.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmOtherProprietaryIdentification
 * SecurityIdentification23Choice.mmOtherProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmOtherIdentification
 * SecurityIdentification19.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmDescription
 * SecurityIdentification19.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20#mmOtherIdentification
 * SecurityIdentification20.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20#mmDescription
 * SecurityIdentification20.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32#mmOtherIdentification
 * SecurityIdentification32.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32#mmDescription
 * SecurityIdentification32.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification21#mmOtherIdentification
 * SecurityIdentification21.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification21#mmDescription
 * SecurityIdentification21.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification24Choice#mmOtherIdentification
 * SecurityIdentification24Choice.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity2#mmFinancialInstrumentIdentification
 * FinancialInstrumentIdentificationValidity2.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmOtherProprietaryIdentification
 * SecurityIdentification25Choice.mmOtherProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwapLegIdentification2#mmSwapIn
 * SwapLegIdentification2.mmSwapIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwapLegIdentification2#mmSwapOut
 * SwapLegIdentification2.mmSwapOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice#mmAlternativeInstrumentIdentification
 * SecurityIdentificationQuery3Choice.mmAlternativeInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice#mmIndex
 * SecurityIdentificationQuery3Choice.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SpecificCollateral2#mmFinancialInstrumentIdentification
 * SpecificCollateral2.mmFinancialInstrumentIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification3
 * AlternateSecurityIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification7
 * SecurityIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification1
 * SecurityIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1
 * AlternateSecurityIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice
 * SecurityIdentification1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
 * SecurityIdentification3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification2Choice
 * SecurityIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternateIdentification1
 * AlternateIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification11Choice
 * SecurityIdentification11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification11
 * SecurityIdentification11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification1
 * OtherIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification14
 * SecurityIdentification14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification2
 * OtherIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification15
 * SecurityIdentification15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternateIdentification2
 * AlternateIdentification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification12Choice
 * SecurityIdentification12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification12
 * SecurityIdentification12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification3
 * OtherIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification16
 * SecurityIdentification16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification2
 * AlternateSecurityIdentification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification4Choice
 * SecurityIdentification4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1
 * AlternateFinancialInstrumentIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification3
 * SecurityIdentification3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification5Choice
 * SecurityIdentification5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification6Choice
 * SecurityIdentification6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification10Choice
 * SecurityIdentification10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification9
 * SecurityIdentification9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4
 * AlternateSecurityIdentification4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification7Choice
 * SecurityIdentification7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification8
 * SecurityIdentification8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity1
 * FinancialInstrumentIdentificationValidity1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification2SD1
 * OtherIdentification2SD1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification14SD1
 * SecurityIdentification14SD1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification4
 * OtherIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternateIdentification3
 * AlternateIdentification3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentificationQueryCriteria1
 * SecurityIdentificationQueryCriteria1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification18Choice
 * SecurityIdentification18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice
 * SecurityIdentification19Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification20Choice
 * SecurityIdentification20Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice
 * SecurityIdentification22Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification7
 * AlternateSecurityIdentification7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice
 * SecurityIdentification23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification19
 * SecurityIdentification19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification20
 * SecurityIdentification20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification32
 * SecurityIdentification32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification21
 * SecurityIdentification21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification24Choice
 * SecurityIdentification24Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity2
 * FinancialInstrumentIdentificationValidity2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
 * SecurityIdentification25Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice
 * FinancialInstrumentIdentification6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BasketDescription3
 * BasketDescription3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice
 * FinancialInstrumentIdentification7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice
 * FinancialInstrumentIdentification5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice
 * SecurityIdentificationQuery3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument59
 * FinancialInstrument59}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SpecificCollateral2
 * SpecificCollateral2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralCollateral3
 * GeneralCollateral3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralCollateral2
 * GeneralCollateral2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SecuritiesIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Security> identifiedSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification5Choice#mmInstrumentDescription
	 * SecurityIdentification5Choice.mmInstrumentDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification6Choice#mmInstrumentDescription
	 * SecurityIdentification6Choice.mmInstrumentDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice#mmIndex
	 * FinancialInstrumentIdentification6Choice.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice#mmSingle
	 * FinancialInstrumentIdentification7Choice.mmSingle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification7Choice#mmBasket
	 * FinancialInstrumentIdentification7Choice.mmBasket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice#mmSingle
	 * FinancialInstrumentIdentification5Choice.mmSingle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification5Choice#mmBasket
	 * FinancialInstrumentIdentification5Choice.mmBasket}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which an identification is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, List<Security>> mmIdentifiedSecurity = new MMBusinessAssociationEnd<SecuritiesIdentification, List<Security>>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification5Choice.mmInstrumentDescription, SecurityIdentification6Choice.mmInstrumentDescription, FinancialInstrumentIdentification6Choice.mmIndex,
					FinancialInstrumentIdentification7Choice.mmSingle, FinancialInstrumentIdentification7Choice.mmBasket, FinancialInstrumentIdentification5Choice.mmSingle, FinancialInstrumentIdentification5Choice.mmBasket);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedSecurity";
			definition = "Security for which an identification is provided.";
			minOccurs = 1;
			opposite_lazy = () -> Security.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public List<Security> getValue(SecuritiesIdentification obj) {
			return obj.getIdentifiedSecurity();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, List<Security> value) {
			obj.setIdentifiedSecurity(value);
		}
	};
	protected ISINOct2015Identifier securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7#mmISIN
	 * SecurityIdentification7.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmISIN
	 * SecurityIdentification1Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmISIN
	 * SecurityIdentification3Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification2Choice#mmISIN
	 * SecurityIdentification2Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification11Choice#mmISIN
	 * SecurityIdentification11Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14#mmISIN
	 * SecurityIdentification14.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15#mmISIN
	 * SecurityIdentification15.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification12Choice#mmISIN
	 * SecurityIdentification12Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification16#mmISIN
	 * SecurityIdentification16.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification4Choice#mmISIN
	 * SecurityIdentification4Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmIdentification
	 * InvestmentFundTransactionsByFund1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#mmIdentification
	 * InvestmentFundTransactionsByFund2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#mmISIN
	 * SecurityIdentification3.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification5Choice#mmISIN
	 * SecurityIdentification5Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification6Choice#mmISIN
	 * SecurityIdentification6Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification10Choice#mmISIN
	 * SecurityIdentification10Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification7Choice#mmISIN
	 * SecurityIdentification7Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkIdentification
	 * BenchmarkCurve2.mmBenchmarkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#mmSecurityIdentification
	 * CollateralValue1.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve1#mmBenchmarkIdentification
	 * BenchmarkCurve1.mmBenchmarkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmIdentification
	 * InvestmentFundTransactionsByFund3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation3#mmISIN
	 * CollateralValuation3.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InflationIndex1Choice#mmISIN
	 * InflationIndex1Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#mmISIN
	 * BenchmarkCurveName4Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentificationQueryCriteria1#mmISIN
	 * SecurityIdentificationQueryCriteria1.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification18Choice#mmISIN
	 * SecurityIdentification18Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice#mmISIN
	 * SecurityIdentification19Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification20Choice#mmISIN
	 * SecurityIdentification20Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmISIN
	 * SecurityIdentification22Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmISIN
	 * SecurityIdentification23Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmISIN
	 * SecurityIdentification19.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20#mmISIN
	 * SecurityIdentification20.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification32#mmISIN
	 * SecurityIdentification32.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification21#mmISIN
	 * SecurityIdentification21.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation6#mmISIN
	 * CollateralValuation6.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport2#mmIdentification
	 * VolumeCapReport2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument46Choice#mmISIN
	 * FinancialInstrument46Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument53#mmISIN
	 * FinancialInstrument53.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#mmISIN
	 * BenchmarkCurveName6Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValue2#mmSecurityIdentification
	 * CollateralValue2.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4#mmBenchmarkIdentification
	 * BenchmarkCurve4.mmBenchmarkIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification24Choice#mmISIN
	 * SecurityIdentification24Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmISIN
	 * SecurityIdentification25Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmIdentification
	 * TransparencyDataReport11.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13#mmIdentification
	 * TransparencyDataReport13.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmIdentification
	 * TransparencyDataReport12.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport15#mmIdentification
	 * TransparencyDataReport15.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmIdentification
	 * TransparencyDataReport10.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmIdentification
	 * TransparencyDataReport14.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentIdentification6Choice#mmISIN
	 * FinancialInstrumentIdentification6Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument58#mmISIN
	 * FinancialInstrument58.mmISIN}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BasketDescription3#mmISIN
	 * BasketDescription3.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument48Choice#mmISIN
	 * FinancialInstrument48Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4#mmUnderlyingNameIdentification
	 * CreditDefaultSwapDerivative4.mmUnderlyingNameIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapDerivative4#mmObligationIdentification
	 * CreditDefaultSwapDerivative4.mmObligationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice#mmIdentification
	 * FinancialInstrumentAttributes3Choice.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentificationQuery3Choice#mmISIN
	 * SecurityIdentificationQuery3Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument59#mmIdentification
	 * FinancialInstrument59.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentificationAndAmount1#mmIdentification
	 * SecurityIdentificationAndAmount1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralCollateral3#mmEligibleFinancialInstrumentIdentification
	 * GeneralCollateral3.mmEligibleFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security by an ISIN."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, ISINOct2015Identifier> mmSecurityIdentification = new MMBusinessAttribute<SecuritiesIdentification, ISINOct2015Identifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification7.mmISIN, SecurityIdentification1Choice.mmISIN, SecurityIdentification3Choice.mmISIN, SecurityIdentification2Choice.mmISIN, SecurityIdentification11Choice.mmISIN,
					SecurityIdentification14.mmISIN, SecurityIdentification15.mmISIN, SecurityIdentification12Choice.mmISIN, SecurityIdentification16.mmISIN, SecurityIdentification4Choice.mmISIN,
					InvestmentFundTransactionsByFund1.mmIdentification, InvestmentFundTransactionsByFund2.mmIdentification, SecurityIdentification3.mmISIN, SecurityIdentification5Choice.mmISIN, SecurityIdentification6Choice.mmISIN,
					SecurityIdentification10Choice.mmISIN, SecurityIdentification7Choice.mmISIN, BenchmarkCurve2.mmBenchmarkIdentification, CollateralValue1.mmSecurityIdentification, BenchmarkCurve1.mmBenchmarkIdentification,
					InvestmentFundTransactionsByFund3.mmIdentification, CollateralValuation3.mmISIN, InflationIndex1Choice.mmISIN, BenchmarkCurveName4Choice.mmISIN, SecurityIdentificationQueryCriteria1.mmISIN,
					SecurityIdentification18Choice.mmISIN, SecurityIdentification19Choice.mmISIN, SecurityIdentification20Choice.mmISIN, SecurityIdentification22Choice.mmISIN, SecurityIdentification23Choice.mmISIN,
					SecurityIdentification19.mmISIN, SecurityIdentification20.mmISIN, SecurityIdentification32.mmISIN, SecurityIdentification21.mmISIN, CollateralValuation6.mmISIN, VolumeCapReport2.mmIdentification,
					FinancialInstrument46Choice.mmISIN, FinancialInstrument53.mmISIN, BenchmarkCurveName6Choice.mmISIN, CollateralValue2.mmSecurityIdentification, BenchmarkCurve4.mmBenchmarkIdentification,
					SecurityIdentification24Choice.mmISIN, SecurityIdentification25Choice.mmISIN, TransparencyDataReport11.mmIdentification, TransparencyDataReport13.mmIdentification, TransparencyDataReport12.mmIdentification,
					TransparencyDataReport15.mmIdentification, TransparencyDataReport10.mmIdentification, TransparencyDataReport14.mmIdentification, FinancialInstrumentIdentification6Choice.mmISIN, FinancialInstrument58.mmISIN,
					BasketDescription3.mmISIN, FinancialInstrument48Choice.mmISIN, CreditDefaultSwapDerivative4.mmUnderlyingNameIdentification, CreditDefaultSwapDerivative4.mmObligationIdentification,
					FinancialInstrumentAttributes3Choice.mmIdentification, SecurityIdentificationQuery3Choice.mmISIN, FinancialInstrument59.mmIdentification, SecurityIdentificationAndAmount1.mmIdentification,
					GeneralCollateral3.mmEligibleFinancialInstrumentIdentification);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of a security by an ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public ISINOct2015Identifier getValue(SecuritiesIdentification obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, ISINOct2015Identifier value) {
			obj.setSecurityIdentification(value);
		}
	};
	protected RICIdentifier rIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RICIdentifier
	 * RICIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmRIC
	 * SecurityIdentification1Choice.mmRIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmRIC
	 * SecurityIdentification3Choice.mmRIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmRIC
	 * SecurityIdentification22Choice.mmRIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmRIC
	 * SecurityIdentification23Choice.mmRIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmRIC
	 * SecurityIdentification25Choice.mmRIC}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, RICIdentifier> mmRIC = new MMBusinessAttribute<SecuritiesIdentification, RICIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1Choice.mmRIC, SecurityIdentification3Choice.mmRIC, SecurityIdentification22Choice.mmRIC, SecurityIdentification23Choice.mmRIC, SecurityIdentification25Choice.mmRIC);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RIC";
			definition = "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RICIdentifier.mmObject();
		}

		@Override
		public RICIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getRIC();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, RICIdentifier value) {
			obj.setRIC(value);
		}
	};
	protected TickerIdentifier tickerSymbol;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TickerIdentifier
	 * TickerIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmTickerSymbol
	 * SecurityIdentification1Choice.mmTickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmTickerSymbol
	 * SecurityIdentification3Choice.mmTickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#mmTickerSymbol
	 * SecurityIdentification3.mmTickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmTickerSymbol
	 * SecurityIdentification22Choice.mmTickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmTickerSymbol
	 * SecurityIdentification23Choice.mmTickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmTickerSymbol
	 * SecurityIdentification25Choice.mmTickerSymbol}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TickerSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, eg, RTR.L for Reuters quoted in London."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, TickerIdentifier> mmTickerSymbol = new MMBusinessAttribute<SecuritiesIdentification, TickerIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1Choice.mmTickerSymbol, SecurityIdentification3Choice.mmTickerSymbol, SecurityIdentification3.mmTickerSymbol, SecurityIdentification22Choice.mmTickerSymbol,
					SecurityIdentification23Choice.mmTickerSymbol, SecurityIdentification25Choice.mmTickerSymbol);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TickerSymbol";
			definition = "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, eg, RTR.L for Reuters quoted in London.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TickerIdentifier.mmObject();
		}

		@Override
		public TickerIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getTickerSymbol();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, TickerIdentifier value) {
			obj.setTickerSymbol(value);
		}
	};
	protected Bloomberg2Identifier bloomberg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Bloomberg2Identifier
	 * Bloomberg2Identifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmBloomberg
	 * SecurityIdentification1Choice.mmBloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmBloomberg
	 * SecurityIdentification3Choice.mmBloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmBloomberg
	 * SecurityIdentification22Choice.mmBloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmBloomberg
	 * SecurityIdentification23Choice.mmBloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmBloomberg
	 * SecurityIdentification25Choice.mmBloomberg}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bloomberg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Bloomberg organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, Bloomberg2Identifier> mmBloomberg = new MMBusinessAttribute<SecuritiesIdentification, Bloomberg2Identifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1Choice.mmBloomberg, SecurityIdentification3Choice.mmBloomberg, SecurityIdentification22Choice.mmBloomberg, SecurityIdentification23Choice.mmBloomberg,
					SecurityIdentification25Choice.mmBloomberg);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bloomberg";
			definition = "Identifier of a security assigned by the Bloomberg organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Bloomberg2Identifier.mmObject();
		}

		@Override
		public Bloomberg2Identifier getValue(SecuritiesIdentification obj) {
			return obj.getBloomberg();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, Bloomberg2Identifier value) {
			obj.setBloomberg(value);
		}
	};
	protected ConsolidatedTapeAssociationIdentifier cTA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ConsolidatedTapeAssociationIdentifier
	 * ConsolidatedTapeAssociationIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmCTA
	 * SecurityIdentification1Choice.mmCTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmCTA
	 * SecurityIdentification3Choice.mmCTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmCTA
	 * SecurityIdentification22Choice.mmCTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmCTA
	 * SecurityIdentification23Choice.mmCTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmCTA
	 * SecurityIdentification25Choice.mmCTA}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Consolidated Tape Association."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, ConsolidatedTapeAssociationIdentifier> mmCTA = new MMBusinessAttribute<SecuritiesIdentification, ConsolidatedTapeAssociationIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1Choice.mmCTA, SecurityIdentification3Choice.mmCTA, SecurityIdentification22Choice.mmCTA, SecurityIdentification23Choice.mmCTA, SecurityIdentification25Choice.mmCTA);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CTA";
			definition = "Identifier of a security assigned by the Consolidated Tape Association.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConsolidatedTapeAssociationIdentifier.mmObject();
		}

		@Override
		public ConsolidatedTapeAssociationIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getCTA();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, ConsolidatedTapeAssociationIdentifier value) {
			obj.setCTA(value);
		}
	};
	protected EuroclearClearstreamIdentifier common;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EuroclearClearstreamIdentifier
	 * EuroclearClearstreamIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmCommon
	 * SecurityIdentification1Choice.mmCommon}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmCommon
	 * SecurityIdentification3Choice.mmCommon}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmCommon
	 * SecurityIdentification22Choice.mmCommon}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmCommon
	 * SecurityIdentification23Choice.mmCommon}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmCommon
	 * SecurityIdentification25Choice.mmCommon}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Common"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of securities issued in Luxembourg.  The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, EuroclearClearstreamIdentifier> mmCommon = new MMBusinessAttribute<SecuritiesIdentification, EuroclearClearstreamIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1Choice.mmCommon, SecurityIdentification3Choice.mmCommon, SecurityIdentification22Choice.mmCommon, SecurityIdentification23Choice.mmCommon,
					SecurityIdentification25Choice.mmCommon);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Common";
			definition = "Identifier of securities issued in Luxembourg.  The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EuroclearClearstreamIdentifier.mmObject();
		}

		@Override
		public EuroclearClearstreamIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getCommon();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, EuroclearClearstreamIdentifier value) {
			obj.setCommon(value);
		}
	};
	protected LocalName name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LocalName LocalName}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmRelatedSecurity
	 * LocalName.mmRelatedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount1#mmFinancialInstrumentName
	 * SecuritiesAccount1.mmFinancialInstrumentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount4#mmFinancialInstrumentName
	 * SecuritiesAccount4.mmFinancialInstrumentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund1#mmName
	 * InvestmentFundTransactionsByFund1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#mmName
	 * InvestmentFundTransactionsByFund2.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmName
	 * InvestmentFundTransactionsByFund3.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification20Choice#mmName
	 * SecurityIdentification20Choice.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the financial instrument in free format text."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a::FIAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, LocalName> mmName = new MMBusinessAssociationEnd<SecuritiesIdentification, LocalName>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesAccount1.mmFinancialInstrumentName, SecuritiesAccount4.mmFinancialInstrumentName, InvestmentFundTransactionsByFund1.mmName, InvestmentFundTransactionsByFund2.mmName,
					InvestmentFundTransactionsByFund3.mmName, SecurityIdentification20Choice.mmName);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a::FIAN"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> LocalName.mmRelatedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LocalName.mmObject();
		}

		@Override
		public LocalName getValue(SecuritiesIdentification obj) {
			return obj.getName();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, LocalName value) {
			obj.setName(value);
		}
	};
	protected SEDOLIdentifier sEDOL;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SEDOLIdentifier
	 * SEDOLIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmSEDOL
	 * SecurityIdentification3Choice.mmSEDOL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification2Choice#mmSedol
	 * SecurityIdentification2Choice.mmSedol}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#mmSEDOL
	 * SecurityIdentification3.mmSEDOL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmSEDOL
	 * SecurityIdentification23Choice.mmSEDOL}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmSEDOL
	 * SecurityIdentification25Choice.mmSEDOL}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEDOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, SEDOLIdentifier> mmSEDOL = new MMBusinessAttribute<SecuritiesIdentification, SEDOLIdentifier>() {
		{
			derivation_lazy = () -> Arrays
					.asList(SecurityIdentification3Choice.mmSEDOL, SecurityIdentification2Choice.mmSedol, SecurityIdentification3.mmSEDOL, SecurityIdentification23Choice.mmSEDOL, SecurityIdentification25Choice.mmSEDOL);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SEDOL";
			definition = "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SEDOLIdentifier.mmObject();
		}

		@Override
		public SEDOLIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getSEDOL();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, SEDOLIdentifier value) {
			obj.setSEDOL(value);
		}
	};
	protected CUSIPIdentifier cUSIP;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CUSIPIdentifier
	 * CUSIPIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmCUSIP
	 * SecurityIdentification3Choice.mmCUSIP}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#mmCUSIP
	 * SecurityIdentification3.mmCUSIP}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmCUSIP
	 * SecurityIdentification23Choice.mmCUSIP}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmCUSIP
	 * SecurityIdentification25Choice.mmCUSIP}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security.  Non-US securities have a similar number called the CINS number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, CUSIPIdentifier> mmCUSIP = new MMBusinessAttribute<SecuritiesIdentification, CUSIPIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmCUSIP, SecurityIdentification3.mmCUSIP, SecurityIdentification23Choice.mmCUSIP, SecurityIdentification25Choice.mmCUSIP);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CUSIP";
			definition = "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security.  Non-US securities have a similar number called the CINS number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CUSIPIdentifier.mmObject();
		}

		@Override
		public CUSIPIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getCUSIP();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, CUSIPIdentifier value) {
			obj.setCUSIP(value);
		}
	};
	protected QUICKIdentifier qUICK;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.QUICKIdentifier
	 * QUICKIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmQUICK
	 * SecurityIdentification3Choice.mmQUICK}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3#mmQUICK
	 * SecurityIdentification3.mmQUICK}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmQUICK
	 * SecurityIdentification23Choice.mmQUICK}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmQUICK
	 * SecurityIdentification25Choice.mmQUICK}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QUICK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, QUICKIdentifier> mmQUICK = new MMBusinessAttribute<SecuritiesIdentification, QUICKIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmQUICK, SecurityIdentification3.mmQUICK, SecurityIdentification23Choice.mmQUICK, SecurityIdentification25Choice.mmQUICK);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QUICK";
			definition = "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QUICKIdentifier.mmObject();
		}

		@Override
		public QUICKIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getQUICK();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, QUICKIdentifier value) {
			obj.setQUICK(value);
		}
	};
	protected WertpapierIdentifier wertpapier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.WertpapierIdentifier
	 * WertpapierIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmWertpapier
	 * SecurityIdentification3Choice.mmWertpapier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmWertpapier
	 * SecurityIdentification23Choice.mmWertpapier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmWertpapier
	 * SecurityIdentification25Choice.mmWertpapier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wertpapier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, WertpapierIdentifier> mmWertpapier = new MMBusinessAttribute<SecuritiesIdentification, WertpapierIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmWertpapier, SecurityIdentification23Choice.mmWertpapier, SecurityIdentification25Choice.mmWertpapier);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Wertpapier";
			definition = "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WertpapierIdentifier.mmObject();
		}

		@Override
		public WertpapierIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getWertpapier();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, WertpapierIdentifier value) {
			obj.setWertpapier(value);
		}
	};
	protected DutchIdentifier dutch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DutchIdentifier
	 * DutchIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmDutch
	 * SecurityIdentification3Choice.mmDutch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmDutch
	 * SecurityIdentification23Choice.mmDutch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmDutch
	 * SecurityIdentification25Choice.mmDutch}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dutch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for Dutch securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, DutchIdentifier> mmDutch = new MMBusinessAttribute<SecuritiesIdentification, DutchIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmDutch, SecurityIdentification23Choice.mmDutch, SecurityIdentification25Choice.mmDutch);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dutch";
			definition = "Identifier for Dutch securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DutchIdentifier.mmObject();
		}

		@Override
		public DutchIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getDutch();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, DutchIdentifier value) {
			obj.setDutch(value);
		}
	};
	protected ValorenIdentifier valoren;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ValorenIdentifier
	 * ValorenIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmValoren
	 * SecurityIdentification3Choice.mmValoren}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmValoren
	 * SecurityIdentification23Choice.mmValoren}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmValoren
	 * SecurityIdentification25Choice.mmValoren}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valoren"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, ValorenIdentifier> mmValoren = new MMBusinessAttribute<SecuritiesIdentification, ValorenIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmValoren, SecurityIdentification23Choice.mmValoren, SecurityIdentification25Choice.mmValoren);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Valoren";
			definition = "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ValorenIdentifier.mmObject();
		}

		@Override
		public ValorenIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getValoren();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, ValorenIdentifier value) {
			obj.setValoren(value);
		}
	};
	protected SicovamIdentifier sicovam;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SicovamIdentifier
	 * SicovamIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmSicovam
	 * SecurityIdentification3Choice.mmSicovam}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmSicovam
	 * SecurityIdentification23Choice.mmSicovam}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmSicovam
	 * SecurityIdentification25Choice.mmSicovam}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sicovam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France.  The Sicovam is composed of 5-digits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, SicovamIdentifier> mmSicovam = new MMBusinessAttribute<SecuritiesIdentification, SicovamIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmSicovam, SecurityIdentification23Choice.mmSicovam, SecurityIdentification25Choice.mmSicovam);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sicovam";
			definition = "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France.  The Sicovam is composed of 5-digits.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SicovamIdentifier.mmObject();
		}

		@Override
		public SicovamIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getSicovam();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, SicovamIdentifier value) {
			obj.setSicovam(value);
		}
	};
	protected BelgianIdentifier belgian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BelgianIdentifier
	 * BelgianIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmBelgian
	 * SecurityIdentification3Choice.mmBelgian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmBelgian
	 * SecurityIdentification23Choice.mmBelgian}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice#mmBelgian
	 * SecurityIdentification25Choice.mmBelgian}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Belgian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for Belgian securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, BelgianIdentifier> mmBelgian = new MMBusinessAttribute<SecuritiesIdentification, BelgianIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification3Choice.mmBelgian, SecurityIdentification23Choice.mmBelgian, SecurityIdentification25Choice.mmBelgian);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Belgian";
			definition = "Identifier for Belgian securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BelgianIdentifier.mmObject();
		}

		@Override
		public BelgianIdentifier getValue(SecuritiesIdentification obj) {
			return obj.getBelgian();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, BelgianIdentifier value) {
			obj.setBelgian(value);
		}
	};
	protected Max35Text identificationSuffix;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification1#mmSuffix
	 * OtherIdentification1.mmSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification2#mmSuffix
	 * OtherIdentification2.mmSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification3#mmSuffix
	 * OtherIdentification3.mmSuffix}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationSuffix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the suffix of the security identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, Max35Text> mmIdentificationSuffix = new MMBusinessAttribute<SecuritiesIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(OtherIdentification1.mmSuffix, OtherIdentification2.mmSuffix, OtherIdentification3.mmSuffix);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationSuffix";
			definition = "Identifies the suffix of the security identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesIdentification obj) {
			return obj.getIdentificationSuffix();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, Max35Text value) {
			obj.setIdentificationSuffix(value);
		}
	};
	protected GenericIdentification genericIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSecuritiesIdentification
	 * GenericIdentification.mmRelatedSecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification7#mmIdentificationSource
	 * AlternateSecurityIdentification7.mmIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAttributes3Choice#mmOther
	 * FinancialInstrumentAttributes3Choice.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralCollateral3#mmFinancialInstrumentIdentification
	 * GeneralCollateral3.mmFinancialInstrumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralCollateral2#mmEligibleFinancialInstrumentIdentification
	 * GeneralCollateral2.mmEligibleFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of a security assigned by an institution or organisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, GenericIdentification> mmGenericIdentification = new MMBusinessAssociationEnd<SecuritiesIdentification, GenericIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(AlternateSecurityIdentification7.mmIdentificationSource, FinancialInstrumentAttributes3Choice.mmOther, GeneralCollateral3.mmFinancialInstrumentIdentification,
					GeneralCollateral2.mmEligibleFinancialInstrumentIdentification);
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericIdentification";
			definition = "Proprietary identification of a security assigned by an institution or organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmRelatedSecuritiesIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(SecuritiesIdentification obj) {
			return obj.getGenericIdentification();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, GenericIdentification value) {
			obj.setGenericIdentification(value);
		}
	};
	protected List<DateTimePeriod> validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesIdentification
	 * DateTimePeriod.mmRelatedSecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period during which an identification is valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, List<DateTimePeriod>> mmValidityPeriod = new MMBusinessAssociationEnd<SecuritiesIdentification, List<DateTimePeriod>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which an identification is valid.";
			minOccurs = 0;
			opposite_lazy = () -> DateTimePeriod.mmRelatedSecuritiesIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public List<DateTimePeriod> getValue(SecuritiesIdentification obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, List<DateTimePeriod> value) {
			obj.setValidityPeriod(value);
		}
	};
	protected List<TradingMarket> applicableTradingMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurityTradingIdentification
	 * TradingMarket.mmListedSecurityTradingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableTradingMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the trading identification is used."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, List<TradingMarket>> mmApplicableTradingMarket = new MMBusinessAssociationEnd<SecuritiesIdentification, List<TradingMarket>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicableTradingMarket";
			definition = "Market(s) on which the trading identification is used.";
			minOccurs = 0;
			opposite_lazy = () -> TradingMarket.mmListedSecurityTradingIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}

		@Override
		public List<TradingMarket> getValue(SecuritiesIdentification obj) {
			return obj.getApplicableTradingMarket();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, List<TradingMarket> value) {
			obj.setApplicableTradingMarket(value);
		}
	};
	protected SecuritiesIdentification primeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRelatedOtherIdentification
	 * SecuritiesIdentification.mmRelatedOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the main identification of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, SecuritiesIdentification> mmPrimeIdentification = new MMBusinessAssociationEnd<SecuritiesIdentification, SecuritiesIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrimeIdentification";
			definition = "Specifies the main identification of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesIdentification.mmRelatedOtherIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}

		@Override
		public SecuritiesIdentification getValue(SecuritiesIdentification obj) {
			return obj.getPrimeIdentification();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, SecuritiesIdentification value) {
			obj.setPrimeIdentification(value);
		}
	};
	protected List<SecuritiesIdentification> relatedOtherIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmPrimeIdentification
	 * SecuritiesIdentification.mmPrimeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alternate security identification(s) related to the security trading identification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesIdentification, List<SecuritiesIdentification>> mmRelatedOtherIdentification = new MMBusinessAssociationEnd<SecuritiesIdentification, List<SecuritiesIdentification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOtherIdentification";
			definition = "Alternate security identification(s) related to the security trading identification.";
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesIdentification.mmPrimeIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}

		@Override
		public List<SecuritiesIdentification> getValue(SecuritiesIdentification obj) {
			return obj.getRelatedOtherIdentification();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, List<SecuritiesIdentification> value) {
			obj.setRelatedOtherIdentification(value);
		}
	};
	protected Max70Text tradingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security identifier specific to a trading market or markets, for example, Ticker."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesIdentification, Max70Text> mmTradingIdentification = new MMBusinessAttribute<SecuritiesIdentification, Max70Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingIdentification";
			definition = "Security identifier specific to a trading market or markets, for example, Ticker.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(SecuritiesIdentification obj) {
			return obj.getTradingIdentification();
		}

		@Override
		public void setValue(SecuritiesIdentification obj, Max70Text value) {
			obj.setTradingIdentification(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesIdentification";
				definition = "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmIdentification, SecuritiesIdentification.mmPrimeIdentification, SecuritiesIdentification.mmRelatedOtherIdentification,
						GenericIdentification.mmRelatedSecuritiesIdentification, LocalName.mmRelatedSecurity, TradingMarket.mmListedSecurityTradingIdentification, DateTimePeriod.mmRelatedSecuritiesIdentification);
				derivationElement_lazy = () -> Arrays.asList(SecurityIdentification7.mmOtherIdentification, SecurityIdentification7.mmDescription, SecurityIdentification1.mmIdentification,
						SecurityIdentification1Choice.mmAlternateIdentification, SecurityIdentification3Choice.mmOtherProprietaryIdentification, AlternateIdentification1.mmIdentificationSource,
						SecurityIdentification11Choice.mmOtherIdentification, SecurityIdentification11.mmIdentification, SecurityIdentification11.mmDescription, SecurityIdentification14.mmOtherIdentification,
						SecurityIdentification14.mmDescription, SecurityIdentification15.mmOtherIdentification, SecurityIdentification15.mmDescription, AlternateIdentification2.mmIdentificationSource,
						SecurityIdentification12Choice.mmOtherIdentification, SecurityIdentification12.mmIdentification, SecurityIdentification12.mmDescription, SecurityIdentification16.mmOtherIdentification,
						SecurityIdentification16.mmDescription, AlternateSecurityIdentification2.mmType, SecurityIdentification4Choice.mmProprietary, SecurityIdentification3.mmOtherIdentification,
						SecurityIdentification5Choice.mmOtherIdentification, SecurityIdentification6Choice.mmOtherIdentification, SecurityIdentification10Choice.mmOtherIdentification, SecurityIdentification9.mmSecurityIdentification,
						SecurityIdentification9.mmDescription, SecurityIdentification7Choice.mmOtherProprietaryIdentification, SecurityIdentification8.mmSecurityIdentification, SecurityIdentification8.mmDescription,
						FinancialInstrumentIdentificationValidity1.mmFinancialInstrumentIdentification, TriggeringInstructions.mmTriggerSecurityDetails, ReportItem1.mmFinancialInstrumentIdentification,
						AggregateHoldingBalance1.mmFinancialInstrumentIdentification, AlternateIdentification3.mmIdentificationSource, SecurityIdentificationQueryCriteria1.mmAlternativeInstrumentIdentification,
						SecurityIdentification18Choice.mmAlternativeInstrumentIdentification, SecurityIdentification19Choice.mmAlternativeInstrumentIdentification, SecurityIdentification22Choice.mmAlternateIdentification,
						SecurityIdentification23Choice.mmOtherProprietaryIdentification, SecurityIdentification19.mmOtherIdentification, SecurityIdentification19.mmDescription, SecurityIdentification20.mmOtherIdentification,
						SecurityIdentification20.mmDescription, SecurityIdentification32.mmOtherIdentification, SecurityIdentification32.mmDescription, SecurityIdentification21.mmOtherIdentification, SecurityIdentification21.mmDescription,
						SecurityIdentification24Choice.mmOtherIdentification, FinancialInstrumentIdentificationValidity2.mmFinancialInstrumentIdentification, SecurityIdentification25Choice.mmOtherProprietaryIdentification,
						SwapLegIdentification2.mmSwapIn, SwapLegIdentification2.mmSwapOut, SecurityIdentificationQuery3Choice.mmAlternativeInstrumentIdentification, SecurityIdentificationQuery3Choice.mmIndex,
						SpecificCollateral2.mmFinancialInstrumentIdentification);
				element_lazy = () -> Arrays.asList(SecuritiesIdentification.mmIdentifiedSecurity, SecuritiesIdentification.mmSecurityIdentification, SecuritiesIdentification.mmRIC, SecuritiesIdentification.mmTickerSymbol,
						SecuritiesIdentification.mmBloomberg, SecuritiesIdentification.mmCTA, SecuritiesIdentification.mmCommon, SecuritiesIdentification.mmName, SecuritiesIdentification.mmSEDOL, SecuritiesIdentification.mmCUSIP,
						SecuritiesIdentification.mmQUICK, SecuritiesIdentification.mmWertpapier, SecuritiesIdentification.mmDutch, SecuritiesIdentification.mmValoren, SecuritiesIdentification.mmSicovam, SecuritiesIdentification.mmBelgian,
						SecuritiesIdentification.mmIdentificationSuffix, SecuritiesIdentification.mmGenericIdentification, SecuritiesIdentification.mmValidityPeriod, SecuritiesIdentification.mmApplicableTradingMarket,
						SecuritiesIdentification.mmPrimeIdentification, SecuritiesIdentification.mmRelatedOtherIdentification, SecuritiesIdentification.mmTradingIdentification);
				derivationComponent_lazy = () -> Arrays.asList(AlternateSecurityIdentification3.mmObject(), SecurityIdentification7.mmObject(), SecurityIdentification1.mmObject(), AlternateSecurityIdentification1.mmObject(),
						SecurityIdentification1Choice.mmObject(), SecurityIdentification3Choice.mmObject(), SecurityIdentification2Choice.mmObject(), AlternateIdentification1.mmObject(), SecurityIdentification11Choice.mmObject(),
						SecurityIdentification11.mmObject(), OtherIdentification1.mmObject(), SecurityIdentification14.mmObject(), OtherIdentification2.mmObject(), SecurityIdentification15.mmObject(), AlternateIdentification2.mmObject(),
						SecurityIdentification12Choice.mmObject(), SecurityIdentification12.mmObject(), OtherIdentification3.mmObject(), SecurityIdentification16.mmObject(), AlternateSecurityIdentification2.mmObject(),
						SecurityIdentification4Choice.mmObject(), AlternateFinancialInstrumentIdentification1.mmObject(), SecurityIdentification3.mmObject(), SecurityIdentification5Choice.mmObject(),
						SecurityIdentification6Choice.mmObject(), SecurityIdentification10Choice.mmObject(), SecurityIdentification9.mmObject(), AlternateSecurityIdentification4.mmObject(), SecurityIdentification7Choice.mmObject(),
						SecurityIdentification8.mmObject(), FinancialInstrumentIdentificationValidity1.mmObject(), OtherIdentification2SD1.mmObject(), SecurityIdentification14SD1.mmObject(), OtherIdentification4.mmObject(),
						AlternateIdentification3.mmObject(), SecurityIdentificationQueryCriteria1.mmObject(), SecurityIdentification18Choice.mmObject(), SecurityIdentification19Choice.mmObject(), SecurityIdentification20Choice.mmObject(),
						SecurityIdentification22Choice.mmObject(), AlternateSecurityIdentification7.mmObject(), SecurityIdentification23Choice.mmObject(), SecurityIdentification19.mmObject(), SecurityIdentification20.mmObject(),
						SecurityIdentification32.mmObject(), SecurityIdentification21.mmObject(), SecurityIdentification24Choice.mmObject(), FinancialInstrumentIdentificationValidity2.mmObject(), SecurityIdentification25Choice.mmObject(),
						FinancialInstrumentIdentification6Choice.mmObject(), BasketDescription3.mmObject(), FinancialInstrumentIdentification7Choice.mmObject(), FinancialInstrumentIdentification5Choice.mmObject(),
						SecurityIdentificationQuery3Choice.mmObject(), FinancialInstrument59.mmObject(), SpecificCollateral2.mmObject(), GeneralCollateral3.mmObject(), GeneralCollateral2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Security> getIdentifiedSecurity() {
		return identifiedSecurity == null ? identifiedSecurity = new ArrayList<>() : identifiedSecurity;
	}

	public SecuritiesIdentification setIdentifiedSecurity(List<Security> identifiedSecurity) {
		this.identifiedSecurity = Objects.requireNonNull(identifiedSecurity);
		return this;
	}

	public ISINOct2015Identifier getSecurityIdentification() {
		return securityIdentification;
	}

	public SecuritiesIdentification setSecurityIdentification(ISINOct2015Identifier securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public RICIdentifier getRIC() {
		return rIC;
	}

	public SecuritiesIdentification setRIC(RICIdentifier rIC) {
		this.rIC = Objects.requireNonNull(rIC);
		return this;
	}

	public TickerIdentifier getTickerSymbol() {
		return tickerSymbol;
	}

	public SecuritiesIdentification setTickerSymbol(TickerIdentifier tickerSymbol) {
		this.tickerSymbol = Objects.requireNonNull(tickerSymbol);
		return this;
	}

	public Bloomberg2Identifier getBloomberg() {
		return bloomberg;
	}

	public SecuritiesIdentification setBloomberg(Bloomberg2Identifier bloomberg) {
		this.bloomberg = Objects.requireNonNull(bloomberg);
		return this;
	}

	public ConsolidatedTapeAssociationIdentifier getCTA() {
		return cTA;
	}

	public SecuritiesIdentification setCTA(ConsolidatedTapeAssociationIdentifier cTA) {
		this.cTA = Objects.requireNonNull(cTA);
		return this;
	}

	public EuroclearClearstreamIdentifier getCommon() {
		return common;
	}

	public SecuritiesIdentification setCommon(EuroclearClearstreamIdentifier common) {
		this.common = Objects.requireNonNull(common);
		return this;
	}

	public LocalName getName() {
		return name;
	}

	public SecuritiesIdentification setName(LocalName name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public SEDOLIdentifier getSEDOL() {
		return sEDOL;
	}

	public SecuritiesIdentification setSEDOL(SEDOLIdentifier sEDOL) {
		this.sEDOL = Objects.requireNonNull(sEDOL);
		return this;
	}

	public CUSIPIdentifier getCUSIP() {
		return cUSIP;
	}

	public SecuritiesIdentification setCUSIP(CUSIPIdentifier cUSIP) {
		this.cUSIP = Objects.requireNonNull(cUSIP);
		return this;
	}

	public QUICKIdentifier getQUICK() {
		return qUICK;
	}

	public SecuritiesIdentification setQUICK(QUICKIdentifier qUICK) {
		this.qUICK = Objects.requireNonNull(qUICK);
		return this;
	}

	public WertpapierIdentifier getWertpapier() {
		return wertpapier;
	}

	public SecuritiesIdentification setWertpapier(WertpapierIdentifier wertpapier) {
		this.wertpapier = Objects.requireNonNull(wertpapier);
		return this;
	}

	public DutchIdentifier getDutch() {
		return dutch;
	}

	public SecuritiesIdentification setDutch(DutchIdentifier dutch) {
		this.dutch = Objects.requireNonNull(dutch);
		return this;
	}

	public ValorenIdentifier getValoren() {
		return valoren;
	}

	public SecuritiesIdentification setValoren(ValorenIdentifier valoren) {
		this.valoren = Objects.requireNonNull(valoren);
		return this;
	}

	public SicovamIdentifier getSicovam() {
		return sicovam;
	}

	public SecuritiesIdentification setSicovam(SicovamIdentifier sicovam) {
		this.sicovam = Objects.requireNonNull(sicovam);
		return this;
	}

	public BelgianIdentifier getBelgian() {
		return belgian;
	}

	public SecuritiesIdentification setBelgian(BelgianIdentifier belgian) {
		this.belgian = Objects.requireNonNull(belgian);
		return this;
	}

	public Max35Text getIdentificationSuffix() {
		return identificationSuffix;
	}

	public SecuritiesIdentification setIdentificationSuffix(Max35Text identificationSuffix) {
		this.identificationSuffix = Objects.requireNonNull(identificationSuffix);
		return this;
	}

	public GenericIdentification getGenericIdentification() {
		return genericIdentification;
	}

	public SecuritiesIdentification setGenericIdentification(GenericIdentification genericIdentification) {
		this.genericIdentification = Objects.requireNonNull(genericIdentification);
		return this;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod == null ? validityPeriod = new ArrayList<>() : validityPeriod;
	}

	public SecuritiesIdentification setValidityPeriod(List<DateTimePeriod> validityPeriod) {
		this.validityPeriod = Objects.requireNonNull(validityPeriod);
		return this;
	}

	public List<TradingMarket> getApplicableTradingMarket() {
		return applicableTradingMarket == null ? applicableTradingMarket = new ArrayList<>() : applicableTradingMarket;
	}

	public SecuritiesIdentification setApplicableTradingMarket(List<TradingMarket> applicableTradingMarket) {
		this.applicableTradingMarket = Objects.requireNonNull(applicableTradingMarket);
		return this;
	}

	public SecuritiesIdentification getPrimeIdentification() {
		return primeIdentification;
	}

	public SecuritiesIdentification setPrimeIdentification(SecuritiesIdentification primeIdentification) {
		this.primeIdentification = Objects.requireNonNull(primeIdentification);
		return this;
	}

	public List<SecuritiesIdentification> getRelatedOtherIdentification() {
		return relatedOtherIdentification == null ? relatedOtherIdentification = new ArrayList<>() : relatedOtherIdentification;
	}

	public SecuritiesIdentification setRelatedOtherIdentification(List<SecuritiesIdentification> relatedOtherIdentification) {
		this.relatedOtherIdentification = Objects.requireNonNull(relatedOtherIdentification);
		return this;
	}

	public Max70Text getTradingIdentification() {
		return tradingIdentification;
	}

	public SecuritiesIdentification setTradingIdentification(Max70Text tradingIdentification) {
		this.tradingIdentification = Objects.requireNonNull(tradingIdentification);
		return this;
	}
}
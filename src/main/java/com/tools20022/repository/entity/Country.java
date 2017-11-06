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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.CountryCodeAndName1;
import com.tools20022.repository.msg.CountryCodeAndName3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Nation with its own government.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Country" src="doc-files/Country.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmDomiciledFunds
 * Country.mmDomiciledFunds}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmCode
 * Country.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmCitizen
 * Country.mmCitizen}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmTax Country.mmTax}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForSafekeepingPlace
 * Country.mmCountryForSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForBeneficialOwner
 * Country.mmCountryForBeneficialOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmProducedProducts
 * Country.mmProducedProducts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmNationalRegulatoryAuthority
 * Country.mmNationalRegulatoryAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedCardPayment
 * Country.mmRelatedCardPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmName
 * Country.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmPostalAddressSpecification
 * Country.mmPostalAddressSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmCountryRelatedInvestmentFundProcessing
 * Country.mmCountryRelatedInvestmentFundProcessing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmMarket
 * Country.mmMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmRelatedPaymentCard
 * Country.mmRelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmDomicileCountry
 * InvestmentFund.mmDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmCountry
 * InvestmentFundClassProcessingCharacteristics.mmCountry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PostalAddress#mmCountry
 * PostalAddress.mmCountry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmOrigin
 * Product.mmOrigin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCountry Tax.mmCountry}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmNationality
 * Person.mmNationality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCountryCode
 * PaymentCard.mmCardCountryCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmCountry
 * SafekeepingPlace.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmNonDomicileCountry
 * BeneficialOwner.mmNonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCountry
 * CardPaymentAcquiring.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#mmCountry
 * RegulatoryAuthorityRole.mmCountry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#mmCountry
 * Market.mmCountry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification3#mmCorrespondentCountry
 * ReportSpecification3.mmCorrespondentCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification4#mmCorrespondentCountry
 * ReportSpecification4.mmCorrespondentCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportSpecification2#mmCorrespondentCountry
 * ReportSpecification2.mmCorrespondentCountry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CountryCodeAndName1
 * CountryCodeAndName1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CountryCodeAndName3
 * CountryCodeAndName3}</li>
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
 * "Country"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Nation with its own government."</li>
 * </ul>
 */
public class Country {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.InvestmentFund> domiciledFunds;
	/**
	 * Investment funds which are domiciled in a specific country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmDomicileCountry
	 * InvestmentFund.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomiciledFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment funds which are domiciled in a specific country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDomiciledFunds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomiciledFunds";
			definition = "Investment funds which are domiciled in a specific country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmDomicileCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
		}
	};
	protected CountryCode code;
	/**
	 * Identifies a nation with its own government (ISO 3166).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress1#mmCountry
	 * PostalAddress1.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LocalMarketAnnex#mmCountry
	 * LocalMarketAnnex.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmCountry
	 * LocalMarketAnnex2.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredLongPostalAddress1#mmCountry
	 * StructuredLongPostalAddress1.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation2#mmTaxationCountry
	 * Organisation2.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation2#mmRegistrationCountry
	 * Organisation2.mmRegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType1#mmCountry
	 * CountryAndResidentialStatusType1.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#mmTaxationCountry
	 * IndividualPerson5.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmTaxationCountry
	 * IndividualPerson10.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation13#mmRegistrationCountry
	 * Organisation13.mmRegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmTaxationCountry
	 * Organisation4.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmRegistrationCountry
	 * Organisation4.mmRegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#mmTaxationCountry
	 * Organisation3.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#mmRegistrationCountry
	 * Organisation3.mmRegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#mmTaxationCountry
	 * IndividualPerson6.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmTaxationCountry
	 * IndividualPerson11.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemIdentificationChoice#mmCountry
	 * SystemIdentificationChoice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SystemIdentification2Choice#mmCountry
	 * SystemIdentification2Choice.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmCountry
	 * PostalAddress6.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth#mmCountryOfBirth
	 * DateAndPlaceOfBirth.mmCountryOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification8#mmCountryOfResidence
	 * PartyIdentification8.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification32#mmCountryOfResidence
	 * PartyIdentification32.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#mmCountryOfResidence
	 * PartyIdentification43.mmCountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemSearch3#mmCountry
	 * SystemSearch3.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemDetails2#mmCountry
	 * SystemDetails2.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.System1#mmCountry
	 * System1.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification12Choice#mmCountry
	 * PartyIdentification12Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification14Choice#mmCountry
	 * PartyIdentification14Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification44Choice#mmCountry
	 * PartyIdentification44Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification37Choice#mmCountry
	 * PartyIdentification37Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification1#mmCountry
	 * AlternatePartyIdentification1.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification2#mmCountry
	 * AlternatePartyIdentification2.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount19#mmCountryOfResidence
	 * PartyIdentificationAndAccount19.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount40#mmCountryOfResidence
	 * PartyIdentificationAndAccount40.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount81#mmNationality
	 * PartyIdentificationAndAccount81.mmNationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification58Choice#mmCountry
	 * PartyIdentification58Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification60Choice#mmCountry
	 * PartyIdentification60Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification3#mmCountry
	 * AlternatePartyIdentification3.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount88#mmNationality
	 * PartyIdentificationAndAccount88.mmNationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmDomicileCountry
	 * PartyIdentification33.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmNonDomicileCountry
	 * PartyIdentification33.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#mmDomicileCountry
	 * PartyIdentification34.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#mmNonDomicileCountry
	 * PartyIdentification34.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#mmDomicileCountry
	 * PartyIdentification50.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#mmNonDomicileCountry
	 * PartyIdentification50.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#mmDomicileCountry
	 * PartyIdentification51.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#mmNonDomicileCountry
	 * PartyIdentification51.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#mmDomicileCountry
	 * PartyIdentification56.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#mmNonDomicileCountry
	 * PartyIdentification56.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#mmDomicileCountry
	 * PartyIdentification57.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#mmNonDomicileCountry
	 * PartyIdentification57.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification17Choice#mmCountry
	 * PartyIdentification17Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification39Choice#mmCountry
	 * PartyIdentification39Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification53Choice#mmCountry
	 * PartyIdentification53Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice#mmIdentificationAsCountry
	 * SafekeepingPlaceFormatChoice.mmIdentificationAsCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification15#mmCountry
	 * PartyIdentification15.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount28#mmCountryOfResidence
	 * PartyIdentificationAndAccount28.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount36#mmCountryOfResidence
	 * PartyIdentificationAndAccount36.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount61#mmCountryOfResidence
	 * PartyIdentificationAndAccount61.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount65#mmCountryOfResidence
	 * PartyIdentificationAndAccount65.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification15Choice#mmCountry
	 * PartyIdentification15Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount9#mmCountryOfResidence
	 * PartyIdentificationAndAccount9.mmCountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress8#mmCountry
	 * PostalAddress8.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification5#mmCountry
	 * AlternatePartyIdentification5.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#mmCountryOfResidence
	 * PartyIdentificationAndAccount79.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification6#mmCountry
	 * AlternatePartyIdentification6.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BICOrCountryCodeChoice#mmCountry
	 * BICOrCountryCodeChoice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmCountryOfIssue
	 * FinancialInstrumentAttributes1.mmCountryOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification68Choice#mmCountry
	 * PartyIdentification68Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification41#mmCountryOfResidence
	 * PartyIdentification41.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#mmCountryOfResidence
	 * PartyIdentification40.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmCountryOfOperation
	 * Organisation12.mmCountryOfOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmCountryOfOperation
	 * OrganisationModification1.mmCountryOfOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryAuthority#mmAuthorityCountry
	 * RegulatoryAuthority.mmAuthorityCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryAuthority2#mmCountry
	 * RegulatoryAuthority2.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRegulatoryReporting3#mmCountry
	 * StructuredRegulatoryReporting3.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmCountryOfResidence
	 * PartyIdentification42.mmCountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Location1#mmCountry
	 * Location1.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress12#mmCountry
	 * PostalAddress12.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlaceOfPresentation1#mmCountry
	 * PlaceOfPresentation1.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation5#mmCountryCode
	 * Organisation5.mmCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation8#mmCountryCode
	 * Organisation8.mmCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation9#mmCountryCode
	 * Organisation9.mmCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder2#mmPlaceOfTrade
	 * RedemptionBulkOrder2.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice#mmCountry
	 * PlaceOfTradeIdentification1Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution2#mmPlaceOfTrade
	 * RedemptionBulkExecution2.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmPlaceOfTrade
	 * RedemptionBulkExecution3.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2#mmPlaceOfTrade
	 * RedemptionMultipleOrder2.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3#mmPlaceOfTrade
	 * RedemptionMultipleOrder3.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution2#mmPlaceOfTrade
	 * RedemptionMultipleExecution2.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2#mmPlaceOfTrade
	 * SubscriptionBulkOrder2.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution2#mmPlaceOfTrade
	 * SubscriptionBulkExecution2.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder2#mmPlaceOfTrade
	 * SubscriptionMultipleOrder2.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution2#mmPlaceOfTrade
	 * SubscriptionMultipleExecution2.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmNationality
	 * BeneficialOwner1.mmNationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount46#mmCountryOfResidence
	 * PartyIdentificationAndAccount46.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification45#mmCountryOfResidence
	 * PartyIdentification45.mmCountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CountryCodeAndName1#mmCode
	 * CountryCodeAndName1.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress2#mmCountry
	 * PostalAddress2.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmProductOrigin
	 * LineItemDetails4.mmProductOrigin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress5#mmCountry
	 * PostalAddress5.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmProductOrigin
	 * LineItemDetails7.mmProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification27#mmCountry
	 * PartyIdentification27.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmProductOrigin
	 * LineItemDetails6.mmProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmProductOrigin
	 * LineItemDetails9.mmProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount73#mmCountryOfResidence
	 * PartyIdentificationAndAccount73.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification67Choice#mmCountry
	 * PartyIdentification67Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification4#mmCountry
	 * AlternatePartyIdentification4.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification34Choice#mmCountry
	 * PartyIdentification34Choice.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress11#mmCountry
	 * PostalAddress11.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#mmCountryOfResidence
	 * PartyIdentification58.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ResidenceLocation1Choice#mmCountry
	 * ResidenceLocation1Choice.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress4#mmCountry
	 * PostalAddress4.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification18#mmCountryOfResidence
	 * PartyIdentification18.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification20#mmCountryOfResidence
	 * PartyIdentification20.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification31#mmCountryOfResidence
	 * PartyIdentification31.mmCountryOfResidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification16#mmCountryOfResidence
	 * PartyIdentification16.mmCountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress7#mmCountry
	 * PostalAddress7.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification3Choice#mmCountry
	 * PlaceOfTradeIdentification3Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmCountryOfIssue
	 * TransactionDetails51.mmCountryOfIssue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmCountryOfIssue
	 * Issuance1.mmCountryOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmCountryOfIssue
	 * IntraPositionQueryCriteria1.mmCountryOfIssue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress10#mmCountry
	 * PostalAddress10.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress9#mmCountry
	 * PostalAddress9.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice1#mmCountry
	 * BidResponsePrice1.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation15#mmRegistrationCountry
	 * Organisation15.mmRegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmRailCarrierCountry
	 * TransportByRail4.mmRailCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmCarrierAgentCountry
	 * TransportByRail4.mmCarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmAirCarrierCountry
	 * TransportByAir4.mmAirCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmCarrierAgentCountry
	 * TransportByAir4.mmCarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#mmRoadCarrierCountry
	 * TransportByRoad4.mmRoadCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#mmCarrierAgentCountry
	 * TransportByRoad4.mmCarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmProductOrigin
	 * LineItemDetails10.mmProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmSeaCarrierCountry
	 * TransportBySea5.mmSeaCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmCarrierAgentCountry
	 * TransportBySea5.mmCarrierAgentCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Location2#mmCountry
	 * Location2.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmAirCarrierCountry
	 * TransportByAir5.mmAirCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmCarrierAgentCountry
	 * TransportByAir5.mmCarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmSeaCarrierCountry
	 * TransportBySea6.mmSeaCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmCarrierAgentCountry
	 * TransportBySea6.mmCarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmProductOrigin
	 * LineItemDetails11.mmProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification75Choice#mmCountry
	 * PartyIdentification75Choice.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress13#mmCountry
	 * PostalAddress13.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmRailCarrierCountry
	 * TransportByRail5.mmRailCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmCarrierAgentCountry
	 * TransportByRail5.mmCarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#mmRoadCarrierCountry
	 * TransportByRoad5.mmRoadCarrierCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#mmCarrierAgentCountry
	 * TransportByRoad5.mmCarrierAgentCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation16#mmRegistrationCountry
	 * Organisation16.mmRegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation17#mmRegistrationCountry
	 * Organisation17.mmRegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmProductOrigin
	 * LineItemDetails13.mmProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmProductOrigin
	 * LineItemDetails14.mmProductOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmNationality
	 * BeneficialOwner2.mmNationality}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress17#mmCountry
	 * PostalAddress17.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification7#mmCountry
	 * AlternatePartyIdentification7.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108#mmNationality
	 * PartyIdentificationAndAccount108.mmNationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#mmCountryOfResidence
	 * PartyIdentification77.mmCountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress19#mmCountry
	 * PostalAddress19.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification93Choice#mmCountry
	 * PartyIdentification93Choice.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress18#mmCountry
	 * PostalAddress18.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#mmDomicileCountry
	 * PartyIdentification93.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#mmNonDomicileCountry
	 * PartyIdentification93.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmTaxationCountry
	 * Organisation21.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmRegistrationCountry
	 * Organisation21.mmRegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#mmRegistrationCountry
	 * Organisation22.mmRegistrationCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress21#mmCountry
	 * PostalAddress21.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation24#mmRegistrationCountry
	 * Organisation24.mmRegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType2#mmCountry
	 * CountryAndResidentialStatusType2.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification102Choice#mmCountry
	 * PartyIdentification102Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification8#mmCountry
	 * AlternatePartyIdentification8.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification101#mmDomicileCountry
	 * PartyIdentification101.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification101#mmNonDomicileCountry
	 * PartyIdentification101.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification111Choice#mmCountry
	 * PartyIdentification111Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification9#mmCountry
	 * AlternatePartyIdentification9.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount135#mmNationality
	 * PartyIdentificationAndAccount135.mmNationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification115Choice#mmCountry
	 * PartyIdentification115Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification112#mmCountryOfResidence
	 * PartyIdentification112.mmCountryOfResidence}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CountryCodeAndName3#mmCode
	 * CountryCodeAndName3.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification12#mmCountryOfBranch
	 * PersonIdentification12.mmCountryOfBranch}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmPlaceOfTrade
	 * RedemptionBulkExecution5.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#mmRegistrationCountry
	 * Organisation30.mmRegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation29#mmRegistrationCountry
	 * Organisation29.mmRegistrationCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a nation with its own government (ISO 3166)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress1.mmCountry, com.tools20022.repository.msg.LocalMarketAnnex.mmCountry, com.tools20022.repository.msg.LocalMarketAnnex2.mmCountry,
					com.tools20022.repository.msg.StructuredLongPostalAddress1.mmCountry, com.tools20022.repository.msg.Organisation2.mmTaxationCountry, com.tools20022.repository.msg.Organisation2.mmRegistrationCountry,
					com.tools20022.repository.msg.CountryAndResidentialStatusType1.mmCountry, com.tools20022.repository.msg.IndividualPerson5.mmTaxationCountry, com.tools20022.repository.msg.IndividualPerson10.mmTaxationCountry,
					com.tools20022.repository.msg.Organisation13.mmRegistrationCountry, com.tools20022.repository.msg.Organisation4.mmTaxationCountry, com.tools20022.repository.msg.Organisation4.mmRegistrationCountry,
					com.tools20022.repository.msg.Organisation3.mmTaxationCountry, com.tools20022.repository.msg.Organisation3.mmRegistrationCountry, com.tools20022.repository.msg.IndividualPerson6.mmTaxationCountry,
					com.tools20022.repository.msg.IndividualPerson11.mmTaxationCountry, com.tools20022.repository.choice.SystemIdentificationChoice.mmCountry, com.tools20022.repository.choice.SystemIdentification2Choice.mmCountry,
					com.tools20022.repository.msg.PostalAddress6.mmCountry, com.tools20022.repository.msg.DateAndPlaceOfBirth.mmCountryOfBirth, com.tools20022.repository.msg.PartyIdentification8.mmCountryOfResidence,
					com.tools20022.repository.msg.PartyIdentification32.mmCountryOfResidence, com.tools20022.repository.msg.PartyIdentification43.mmCountryOfResidence, com.tools20022.repository.msg.SystemSearch3.mmCountry,
					com.tools20022.repository.msg.SystemDetails2.mmCountry, com.tools20022.repository.msg.System1.mmCountry, com.tools20022.repository.choice.PartyIdentification12Choice.mmCountry,
					com.tools20022.repository.choice.PartyIdentification14Choice.mmCountry, com.tools20022.repository.choice.PartyIdentification44Choice.mmCountry, com.tools20022.repository.choice.PartyIdentification37Choice.mmCountry,
					com.tools20022.repository.msg.AlternatePartyIdentification1.mmCountry, com.tools20022.repository.msg.AlternatePartyIdentification2.mmCountry,
					com.tools20022.repository.msg.PartyIdentificationAndAccount19.mmCountryOfResidence, com.tools20022.repository.msg.PartyIdentificationAndAccount40.mmCountryOfResidence,
					com.tools20022.repository.msg.PartyIdentificationAndAccount81.mmNationality, com.tools20022.repository.choice.PartyIdentification58Choice.mmCountry,
					com.tools20022.repository.choice.PartyIdentification60Choice.mmCountry, com.tools20022.repository.msg.AlternatePartyIdentification3.mmCountry, com.tools20022.repository.msg.PartyIdentificationAndAccount88.mmNationality,
					com.tools20022.repository.msg.PartyIdentification33.mmDomicileCountry, com.tools20022.repository.msg.PartyIdentification33.mmNonDomicileCountry, com.tools20022.repository.msg.PartyIdentification34.mmDomicileCountry,
					com.tools20022.repository.msg.PartyIdentification34.mmNonDomicileCountry, com.tools20022.repository.msg.PartyIdentification50.mmDomicileCountry, com.tools20022.repository.msg.PartyIdentification50.mmNonDomicileCountry,
					com.tools20022.repository.msg.PartyIdentification51.mmDomicileCountry, com.tools20022.repository.msg.PartyIdentification51.mmNonDomicileCountry, com.tools20022.repository.msg.PartyIdentification56.mmDomicileCountry,
					com.tools20022.repository.msg.PartyIdentification56.mmNonDomicileCountry, com.tools20022.repository.msg.PartyIdentification57.mmDomicileCountry, com.tools20022.repository.msg.PartyIdentification57.mmNonDomicileCountry,
					com.tools20022.repository.choice.PartyIdentification17Choice.mmCountry, com.tools20022.repository.choice.PartyIdentification39Choice.mmCountry, com.tools20022.repository.choice.PartyIdentification53Choice.mmCountry,
					com.tools20022.repository.choice.SafekeepingPlaceFormatChoice.mmIdentificationAsCountry, com.tools20022.repository.msg.PartyIdentification15.mmCountry,
					com.tools20022.repository.msg.PartyIdentificationAndAccount28.mmCountryOfResidence, com.tools20022.repository.msg.PartyIdentificationAndAccount36.mmCountryOfResidence,
					com.tools20022.repository.msg.PartyIdentificationAndAccount61.mmCountryOfResidence, com.tools20022.repository.msg.PartyIdentificationAndAccount65.mmCountryOfResidence,
					com.tools20022.repository.choice.PartyIdentification15Choice.mmCountry, com.tools20022.repository.msg.PartyIdentificationAndAccount9.mmCountryOfResidence, com.tools20022.repository.msg.PostalAddress8.mmCountry,
					com.tools20022.repository.msg.AlternatePartyIdentification5.mmCountry, com.tools20022.repository.msg.PartyIdentificationAndAccount79.mmCountryOfResidence,
					com.tools20022.repository.msg.AlternatePartyIdentification6.mmCountry, com.tools20022.repository.choice.BICOrCountryCodeChoice.mmCountry, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmCountryOfIssue,
					com.tools20022.repository.choice.PartyIdentification68Choice.mmCountry, com.tools20022.repository.msg.PartyIdentification41.mmCountryOfResidence, com.tools20022.repository.msg.PartyIdentification40.mmCountryOfResidence,
					com.tools20022.repository.msg.Organisation12.mmCountryOfOperation, com.tools20022.repository.msg.OrganisationModification1.mmCountryOfOperation, com.tools20022.repository.msg.RegulatoryAuthority.mmAuthorityCountry,
					com.tools20022.repository.msg.RegulatoryAuthority2.mmCountry, com.tools20022.repository.msg.StructuredRegulatoryReporting3.mmCountry, com.tools20022.repository.msg.PartyIdentification42.mmCountryOfResidence,
					com.tools20022.repository.msg.Location1.mmCountry, com.tools20022.repository.msg.PostalAddress12.mmCountry, com.tools20022.repository.msg.PlaceOfPresentation1.mmCountry,
					com.tools20022.repository.msg.Organisation5.mmCountryCode, com.tools20022.repository.msg.Organisation8.mmCountryCode, com.tools20022.repository.msg.Organisation9.mmCountryCode,
					com.tools20022.repository.msg.RedemptionBulkOrder2.mmPlaceOfTrade, com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice.mmCountry, com.tools20022.repository.msg.RedemptionBulkExecution2.mmPlaceOfTrade,
					com.tools20022.repository.msg.RedemptionBulkExecution3.mmPlaceOfTrade, com.tools20022.repository.msg.RedemptionMultipleOrder2.mmPlaceOfTrade, com.tools20022.repository.msg.RedemptionMultipleOrder3.mmPlaceOfTrade,
					com.tools20022.repository.msg.RedemptionMultipleExecution2.mmPlaceOfTrade, com.tools20022.repository.msg.SubscriptionBulkOrder2.mmPlaceOfTrade, com.tools20022.repository.msg.SubscriptionBulkExecution2.mmPlaceOfTrade,
					com.tools20022.repository.msg.SubscriptionMultipleOrder2.mmPlaceOfTrade, com.tools20022.repository.msg.SubscriptionMultipleExecution2.mmPlaceOfTrade, com.tools20022.repository.msg.BeneficialOwner1.mmNationality,
					com.tools20022.repository.msg.PartyIdentificationAndAccount46.mmCountryOfResidence, com.tools20022.repository.msg.PartyIdentification45.mmCountryOfResidence, com.tools20022.repository.msg.CountryCodeAndName1.mmCode,
					com.tools20022.repository.msg.PostalAddress2.mmCountry, com.tools20022.repository.msg.LineItemDetails4.mmProductOrigin, com.tools20022.repository.msg.PostalAddress5.mmCountry,
					com.tools20022.repository.msg.LineItemDetails7.mmProductOrigin, com.tools20022.repository.msg.PartyIdentification27.mmCountry, com.tools20022.repository.msg.LineItemDetails6.mmProductOrigin,
					com.tools20022.repository.msg.LineItemDetails9.mmProductOrigin, com.tools20022.repository.msg.PartyIdentificationAndAccount73.mmCountryOfResidence, com.tools20022.repository.choice.PartyIdentification67Choice.mmCountry,
					com.tools20022.repository.msg.AlternatePartyIdentification4.mmCountry, com.tools20022.repository.choice.PartyIdentification34Choice.mmCountry, com.tools20022.repository.msg.PostalAddress11.mmCountry,
					com.tools20022.repository.msg.PartyIdentification58.mmCountryOfResidence, com.tools20022.repository.choice.ResidenceLocation1Choice.mmCountry, com.tools20022.repository.msg.PostalAddress4.mmCountry,
					com.tools20022.repository.msg.PartyIdentification18.mmCountryOfResidence, com.tools20022.repository.msg.PartyIdentification20.mmCountryOfResidence,
					com.tools20022.repository.msg.PartyIdentification31.mmCountryOfResidence, com.tools20022.repository.msg.PartyIdentification16.mmCountryOfResidence, com.tools20022.repository.msg.PostalAddress7.mmCountry,
					com.tools20022.repository.choice.PlaceOfTradeIdentification3Choice.mmCountry, com.tools20022.repository.msg.TransactionDetails51.mmCountryOfIssue, com.tools20022.repository.msg.Issuance1.mmCountryOfIssue,
					com.tools20022.repository.msg.IntraPositionQueryCriteria1.mmCountryOfIssue, com.tools20022.repository.msg.PostalAddress10.mmCountry, com.tools20022.repository.msg.PostalAddress9.mmCountry,
					com.tools20022.repository.msg.BidResponsePrice1.mmCountry, com.tools20022.repository.msg.Organisation15.mmRegistrationCountry, com.tools20022.repository.msg.TransportByRail4.mmRailCarrierCountry,
					com.tools20022.repository.msg.TransportByRail4.mmCarrierAgentCountry, com.tools20022.repository.msg.TransportByAir4.mmAirCarrierCountry, com.tools20022.repository.msg.TransportByAir4.mmCarrierAgentCountry,
					com.tools20022.repository.msg.TransportByRoad4.mmRoadCarrierCountry, com.tools20022.repository.msg.TransportByRoad4.mmCarrierAgentCountry, com.tools20022.repository.msg.LineItemDetails10.mmProductOrigin,
					com.tools20022.repository.msg.TransportBySea5.mmSeaCarrierCountry, com.tools20022.repository.msg.TransportBySea5.mmCarrierAgentCountry, com.tools20022.repository.msg.Location2.mmCountry,
					com.tools20022.repository.msg.TransportByAir5.mmAirCarrierCountry, com.tools20022.repository.msg.TransportByAir5.mmCarrierAgentCountry, com.tools20022.repository.msg.TransportBySea6.mmSeaCarrierCountry,
					com.tools20022.repository.msg.TransportBySea6.mmCarrierAgentCountry, com.tools20022.repository.msg.LineItemDetails11.mmProductOrigin, com.tools20022.repository.choice.PartyIdentification75Choice.mmCountry,
					com.tools20022.repository.msg.PostalAddress13.mmCountry, com.tools20022.repository.msg.TransportByRail5.mmRailCarrierCountry, com.tools20022.repository.msg.TransportByRail5.mmCarrierAgentCountry,
					com.tools20022.repository.msg.TransportByRoad5.mmRoadCarrierCountry, com.tools20022.repository.msg.TransportByRoad5.mmCarrierAgentCountry, com.tools20022.repository.msg.Organisation16.mmRegistrationCountry,
					com.tools20022.repository.msg.Organisation17.mmRegistrationCountry, com.tools20022.repository.msg.LineItemDetails13.mmProductOrigin, com.tools20022.repository.msg.LineItemDetails14.mmProductOrigin,
					com.tools20022.repository.msg.BeneficialOwner2.mmNationality, com.tools20022.repository.msg.PostalAddress17.mmCountry, com.tools20022.repository.msg.AlternatePartyIdentification7.mmCountry,
					com.tools20022.repository.msg.PartyIdentificationAndAccount108.mmNationality, com.tools20022.repository.msg.PartyIdentification77.mmCountryOfResidence, com.tools20022.repository.msg.PostalAddress19.mmCountry,
					com.tools20022.repository.choice.PartyIdentification93Choice.mmCountry, com.tools20022.repository.msg.PostalAddress18.mmCountry, com.tools20022.repository.msg.PartyIdentification93.mmDomicileCountry,
					com.tools20022.repository.msg.PartyIdentification93.mmNonDomicileCountry, com.tools20022.repository.msg.Organisation21.mmTaxationCountry, com.tools20022.repository.msg.Organisation21.mmRegistrationCountry,
					com.tools20022.repository.msg.Organisation22.mmRegistrationCountry, com.tools20022.repository.msg.PostalAddress21.mmCountry, com.tools20022.repository.msg.Organisation24.mmRegistrationCountry,
					com.tools20022.repository.msg.CountryAndResidentialStatusType2.mmCountry, com.tools20022.repository.choice.PartyIdentification102Choice.mmCountry, com.tools20022.repository.msg.AlternatePartyIdentification8.mmCountry,
					com.tools20022.repository.msg.PartyIdentification101.mmDomicileCountry, com.tools20022.repository.msg.PartyIdentification101.mmNonDomicileCountry, com.tools20022.repository.choice.PartyIdentification111Choice.mmCountry,
					com.tools20022.repository.msg.AlternatePartyIdentification9.mmCountry, com.tools20022.repository.msg.PartyIdentificationAndAccount135.mmNationality,
					com.tools20022.repository.choice.PartyIdentification115Choice.mmCountry, com.tools20022.repository.msg.PartyIdentification112.mmCountryOfResidence, com.tools20022.repository.msg.CountryCodeAndName3.mmCode,
					com.tools20022.repository.msg.PersonIdentification12.mmCountryOfBranch, com.tools20022.repository.msg.RedemptionBulkExecution5.mmPlaceOfTrade, com.tools20022.repository.msg.Organisation30.mmRegistrationCountry,
					com.tools20022.repository.msg.Organisation29.mmRegistrationCountry);
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Identifies a nation with its own government (ISO 3166).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected Person citizen;
	/**
	 * Specifies a person which is a citizen of a country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmNationality
	 * Person.mmNationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Citizen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a person which is a citizen of a country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCitizen = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Citizen";
			definition = "Specifies a person which is a citizen of a country.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.mmNationality;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
		}
	};
	protected Tax tax;
	/**
	 * Tax parameters applicable in a country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmCountry
	 * Tax.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax parameters applicable in a country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax parameters applicable in a country.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SafekeepingPlace> countryForSafekeepingPlace;
	/**
	 * Specifies the safekeeping places located in a specific country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmCountry
	 * SafekeepingPlace.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryForSafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the safekeeping places located in a specific country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCountryForSafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryForSafekeepingPlace";
			definition = "Specifies the safekeeping places located in a specific country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
		}
	};
	protected BeneficialOwner countryForBeneficialOwner;
	/**
	 * Specifies the beneficial owner which has certified that it is not
	 * domiciled in the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmNonDomicileCountry
	 * BeneficialOwner.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryForBeneficialOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the beneficial owner which has certified that it is not domiciled in the country."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCountryForBeneficialOwner = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountryForBeneficialOwner";
			definition = "Specifies the beneficial owner which has certified that it is not domiciled in the country.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.mmNonDomicileCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Product> producedProducts;
	/**
	 * Specifies the product for which an origin is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmOrigin
	 * Product.mmOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProducedProducts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the product for which an origin is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProducedProducts = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProducedProducts";
			definition = "Specifies the product for which an origin is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmOrigin;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.RegulatoryAuthorityRole> nationalRegulatoryAuthority;
	/**
	 * Regulatory authority of the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole#mmCountry
	 * RegulatoryAuthorityRole.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole
	 * RegulatoryAuthorityRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegulatoryAuthority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory authority of the country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNationalRegulatoryAuthority = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NationalRegulatoryAuthority";
			definition = "Regulatory authority of the country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryAuthorityRole.mmCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegulatoryAuthorityRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CardPaymentAcquiring> relatedCardPayment;
	/**
	 * Card payment which took place in the specified country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCountry
	 * CardPaymentAcquiring.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment which took place in the specified country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCardPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPayment";
			definition = "Card payment which took place in the specified country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
		}
	};
	protected Max35Text name;
	/**
	 * Name by which a country is known. It is normally the name attached to the
	 * ISO country code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CountryCodeAndName1#mmName
	 * CountryCodeAndName1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CountryCodeAndName3#mmName
	 * CountryCodeAndName3.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a country is known. It is normally the name attached to the ISO country code."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CountryCodeAndName1.mmName, com.tools20022.repository.msg.CountryCodeAndName3.mmName);
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name by which a country is known. It is normally the name attached to the ISO country code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PostalAddress> postalAddressSpecification;
	/**
	 * Specifies the representation of a postal address per country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmCountry
	 * PostalAddress.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PostalAddress
	 * PostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalAddressSpecification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the representation of a postal address per country."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPostalAddressSpecification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalAddressSpecification";
			definition = "Specifies the representation of a postal address per country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
		}
	};
	protected InvestmentFundClassProcessingCharacteristics countryRelatedInvestmentFundProcessing;
	/**
	 * Specifies the other parameters of the investment fund class which apply
	 * in that country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmCountry
	 * InvestmentFundClassProcessingCharacteristics.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryRelatedInvestmentFundProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the other parameters of the investment fund class which apply in that country."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCountryRelatedInvestmentFundProcessing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountryRelatedInvestmentFundProcessing";
			definition = "Specifies the other parameters of the investment fund class which apply in that country.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};
	protected Market market;
	/**
	 * Market for which a country is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Market#mmCountry
	 * Market.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which a country is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market for which a country is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Market.mmCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
		}
	};
	protected PaymentCard relatedPaymentCard;
	/**
	 * Payment card for which a country code is attached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCountryCode
	 * PaymentCard.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Country
	 * Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card for which a country code is attached."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Country.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which a country code is attached.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmCardCountryCode;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Country";
				definition = "Nation with its own government.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.mmDomicileCountry, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmCountry,
						com.tools20022.repository.entity.PostalAddress.mmCountry, com.tools20022.repository.entity.Product.mmOrigin, com.tools20022.repository.entity.Tax.mmCountry, com.tools20022.repository.entity.Person.mmNationality,
						com.tools20022.repository.entity.PaymentCard.mmCardCountryCode, com.tools20022.repository.entity.SafekeepingPlace.mmCountry, com.tools20022.repository.entity.BeneficialOwner.mmNonDomicileCountry,
						com.tools20022.repository.entity.CardPaymentAcquiring.mmCountry, com.tools20022.repository.entity.RegulatoryAuthorityRole.mmCountry, com.tools20022.repository.entity.Market.mmCountry);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportSpecification3.mmCorrespondentCountry, com.tools20022.repository.msg.ReportSpecification4.mmCorrespondentCountry,
						com.tools20022.repository.msg.ReportSpecification2.mmCorrespondentCountry);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmDomiciledFunds, com.tools20022.repository.entity.Country.mmCode, com.tools20022.repository.entity.Country.mmCitizen,
						com.tools20022.repository.entity.Country.mmTax, com.tools20022.repository.entity.Country.mmCountryForSafekeepingPlace, com.tools20022.repository.entity.Country.mmCountryForBeneficialOwner,
						com.tools20022.repository.entity.Country.mmProducedProducts, com.tools20022.repository.entity.Country.mmNationalRegulatoryAuthority, com.tools20022.repository.entity.Country.mmRelatedCardPayment,
						com.tools20022.repository.entity.Country.mmName, com.tools20022.repository.entity.Country.mmPostalAddressSpecification, com.tools20022.repository.entity.Country.mmCountryRelatedInvestmentFundProcessing,
						com.tools20022.repository.entity.Country.mmMarket, com.tools20022.repository.entity.Country.mmRelatedPaymentCard);
				derivationComponent_lazy = () -> Arrays.asList(CountryCodeAndName1.mmObject(), CountryCodeAndName3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<InvestmentFund> getDomiciledFunds() {
		return domiciledFunds;
	}

	public void setDomiciledFunds(List<com.tools20022.repository.entity.InvestmentFund> domiciledFunds) {
		this.domiciledFunds = domiciledFunds;
	}

	public CountryCode getCode() {
		return code;
	}

	public void setCode(CountryCode code) {
		this.code = code;
	}

	public Person getCitizen() {
		return citizen;
	}

	public void setCitizen(com.tools20022.repository.entity.Person citizen) {
		this.citizen = citizen;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(com.tools20022.repository.entity.Tax tax) {
		this.tax = tax;
	}

	public List<SafekeepingPlace> getCountryForSafekeepingPlace() {
		return countryForSafekeepingPlace;
	}

	public void setCountryForSafekeepingPlace(List<com.tools20022.repository.entity.SafekeepingPlace> countryForSafekeepingPlace) {
		this.countryForSafekeepingPlace = countryForSafekeepingPlace;
	}

	public BeneficialOwner getCountryForBeneficialOwner() {
		return countryForBeneficialOwner;
	}

	public void setCountryForBeneficialOwner(com.tools20022.repository.entity.BeneficialOwner countryForBeneficialOwner) {
		this.countryForBeneficialOwner = countryForBeneficialOwner;
	}

	public List<Product> getProducedProducts() {
		return producedProducts;
	}

	public void setProducedProducts(List<com.tools20022.repository.entity.Product> producedProducts) {
		this.producedProducts = producedProducts;
	}

	public List<RegulatoryAuthorityRole> getNationalRegulatoryAuthority() {
		return nationalRegulatoryAuthority;
	}

	public void setNationalRegulatoryAuthority(List<com.tools20022.repository.entity.RegulatoryAuthorityRole> nationalRegulatoryAuthority) {
		this.nationalRegulatoryAuthority = nationalRegulatoryAuthority;
	}

	public List<CardPaymentAcquiring> getRelatedCardPayment() {
		return relatedCardPayment;
	}

	public void setRelatedCardPayment(List<com.tools20022.repository.entity.CardPaymentAcquiring> relatedCardPayment) {
		this.relatedCardPayment = relatedCardPayment;
	}

	public Max35Text getName() {
		return name;
	}

	public void setName(Max35Text name) {
		this.name = name;
	}

	public List<PostalAddress> getPostalAddressSpecification() {
		return postalAddressSpecification;
	}

	public void setPostalAddressSpecification(List<com.tools20022.repository.entity.PostalAddress> postalAddressSpecification) {
		this.postalAddressSpecification = postalAddressSpecification;
	}

	public InvestmentFundClassProcessingCharacteristics getCountryRelatedInvestmentFundProcessing() {
		return countryRelatedInvestmentFundProcessing;
	}

	public void setCountryRelatedInvestmentFundProcessing(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics countryRelatedInvestmentFundProcessing) {
		this.countryRelatedInvestmentFundProcessing = countryRelatedInvestmentFundProcessing;
	}

	public Market getMarket() {
		return market;
	}

	public void setMarket(com.tools20022.repository.entity.Market market) {
		this.market = market;
	}

	public PaymentCard getRelatedPaymentCard() {
		return relatedPaymentCard;
	}

	public void setRelatedPaymentCard(com.tools20022.repository.entity.PaymentCard relatedPaymentCard) {
		this.relatedPaymentCard = relatedPaymentCard;
	}
}
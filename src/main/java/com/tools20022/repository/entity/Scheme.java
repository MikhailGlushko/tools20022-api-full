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
import com.tools20022.repository.choice.AccountSchemeName1Choice;
import com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice;
import com.tools20022.repository.choice.MandateStatus1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information regarding an enumerated code list and its owner.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Scheme" src="doc-files/Scheme.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmNameShort
 * Scheme.mmNameShort}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmCode Scheme.mmCode}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmIdentification
 * Scheme.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmRating
 * Scheme.mmRating}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmCreditorRole
 * Scheme.mmCreditorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Scheme#mmInformationPartyRole
 * Scheme.mmInformationPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmVersion
 * Scheme.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Scheme#mmAssessmentValidityPeriod
 * Scheme.mmAssessmentValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmNameLong
 * Scheme.mmNameLong}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmDescription
 * Scheme.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmDomainValueCode
 * Scheme.mmDomainValueCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmDomainValueName
 * Scheme.mmDomainValueName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmSector
 * Scheme.mmSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Scheme#mmAssetClassification
 * Scheme.mmAssetClassification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmScheme
 * InformationPartyRole.mmScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmScheme
 * GenericIdentification.mmScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAssessmentValidityScheme
 * DateTimePeriod.mmAssessmentValidityScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmAssetClassScheme
 * AssetClassification.mmAssetClassScheme}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Rating#mmRatingScheme
 * Rating.mmRatingScheme}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sector#mmScheme
 * Sector.mmScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditorRole#mmSchemeIdentification
 * CreditorRole.mmSchemeIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice
 * FinancialIdentificationSchemeName1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountSchemeName1Choice
 * AccountSchemeName1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MandateStatus1Choice
 * MandateStatus1Choice}</li>
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
 * "Scheme"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information regarding an enumerated code list and its owner."</li>
 * </ul>
 */
public class Scheme {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text nameShort;
	/**
	 * Short textual description of the scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification1#mmSchemeName
	 * GenericIdentification1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification13#mmSchemeName
	 * GenericIdentification13.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20#mmSchemeName
	 * GenericIdentification20.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification25#mmSchemeName
	 * GenericIdentification25.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification47#mmSchemeName
	 * GenericIdentification47.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification41#mmSchemeName
	 * GenericIdentification41.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice#mmProprietary
	 * PersonIdentificationSchemeName1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification19#mmSchemeName
	 * GenericIdentification19.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification24#mmSchemeName
	 * GenericIdentification24.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate1#mmSchemeName
	 * SecuritiesCertificate1.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification23#mmSchemeName
	 * GenericIdentification23.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification18#mmSchemeName
	 * GenericIdentification18.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate2#mmSchemeName
	 * SecuritiesCertificate2.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification27#mmSchemeName
	 * GenericIdentification27.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3#mmSchemeName
	 * ProprietaryQuantity3.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity2#mmSchemeName
	 * ProprietaryQuantity2.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity5#mmSchemeName
	 * ProprietaryQuantity5.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity4#mmSchemeName
	 * ProprietaryQuantity4.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification22#mmSchemeName
	 * GenericIdentification22.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification28#mmSchemeName
	 * GenericIdentification28.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification34#mmSchemeName
	 * GenericIdentification34.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification38#mmSchemeName
	 * GenericIdentification38.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification29#mmSchemeName
	 * GenericIdentification29.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate3#mmSchemeName
	 * SecuritiesCertificate3.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification36#mmSchemeName
	 * GenericIdentification36.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification2#mmSchemeName
	 * GenericIdentification2.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30#mmSchemeName
	 * GenericIdentification30.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification40#mmSchemeName
	 * GenericIdentification40.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification15#mmSchemeName
	 * GenericIdentification15.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification42#mmSchemeName
	 * GenericIdentification42.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity6#mmSchemeName
	 * ProprietaryQuantity6.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification51#mmSchemeName
	 * GenericIdentification51.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification56#mmSchemeName
	 * GenericIdentification56.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification65#mmSchemeName
	 * GenericIdentification65.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification63#mmSchemeName
	 * GenericIdentification63.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification66#mmSchemeName
	 * GenericIdentification66.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification62#mmSchemeName
	 * GenericIdentification62.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification60#mmSchemeName
	 * GenericIdentification60.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification64#mmSchemeName
	 * GenericIdentification64.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification67#mmSchemeName
	 * GenericIdentification67.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate4#mmSchemeName
	 * SecuritiesCertificate4.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity8#mmSchemeName
	 * ProprietaryQuantity8.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity7#mmSchemeName
	 * ProprietaryQuantity7.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification84#mmSchemeName
	 * GenericIdentification84.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity10#mmSchemeName
	 * ProprietaryQuantity10.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity9#mmSchemeName
	 * ProprietaryQuantity9.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification86#mmSchemeName
	 * GenericIdentification86.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate5#mmSchemeName
	 * SecuritiesCertificate5.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification144#mmSchemeName
	 * GenericIdentification144.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification163#mmSchemeName
	 * GenericIdentification163.mmSchemeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification79#mmSchemeName
	 * GenericIdentification79.mmSchemeName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameShort"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short textual description of the scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNameShort = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentification1.mmSchemeName, com.tools20022.repository.msg.GenericIdentification13.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification20.mmSchemeName, com.tools20022.repository.msg.GenericIdentification25.mmSchemeName, com.tools20022.repository.msg.GenericIdentification47.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification41.mmSchemeName, com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice.mmProprietary,
					com.tools20022.repository.msg.GenericIdentification19.mmSchemeName, com.tools20022.repository.msg.GenericIdentification24.mmSchemeName, com.tools20022.repository.msg.SecuritiesCertificate1.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification23.mmSchemeName, com.tools20022.repository.msg.GenericIdentification18.mmSchemeName, com.tools20022.repository.msg.SecuritiesCertificate2.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification27.mmSchemeName, com.tools20022.repository.msg.ProprietaryQuantity3.mmSchemeName, com.tools20022.repository.msg.ProprietaryQuantity2.mmSchemeName,
					com.tools20022.repository.msg.ProprietaryQuantity5.mmSchemeName, com.tools20022.repository.msg.ProprietaryQuantity4.mmSchemeName, com.tools20022.repository.msg.GenericIdentification22.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification28.mmSchemeName, com.tools20022.repository.msg.GenericIdentification34.mmSchemeName, com.tools20022.repository.msg.GenericIdentification38.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification29.mmSchemeName, com.tools20022.repository.msg.SecuritiesCertificate3.mmSchemeName, com.tools20022.repository.msg.GenericIdentification36.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification2.mmSchemeName, com.tools20022.repository.msg.GenericIdentification30.mmSchemeName, com.tools20022.repository.msg.GenericIdentification40.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification15.mmSchemeName, com.tools20022.repository.msg.GenericIdentification42.mmSchemeName, com.tools20022.repository.msg.ProprietaryQuantity6.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification51.mmSchemeName, com.tools20022.repository.msg.GenericIdentification56.mmSchemeName, com.tools20022.repository.msg.GenericIdentification65.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification63.mmSchemeName, com.tools20022.repository.msg.GenericIdentification66.mmSchemeName, com.tools20022.repository.msg.GenericIdentification62.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification60.mmSchemeName, com.tools20022.repository.msg.GenericIdentification64.mmSchemeName, com.tools20022.repository.msg.GenericIdentification67.mmSchemeName,
					com.tools20022.repository.msg.SecuritiesCertificate4.mmSchemeName, com.tools20022.repository.msg.ProprietaryQuantity8.mmSchemeName, com.tools20022.repository.msg.ProprietaryQuantity7.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification84.mmSchemeName, com.tools20022.repository.msg.ProprietaryQuantity10.mmSchemeName, com.tools20022.repository.msg.ProprietaryQuantity9.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification86.mmSchemeName, com.tools20022.repository.msg.SecuritiesCertificate5.mmSchemeName, com.tools20022.repository.msg.GenericIdentification144.mmSchemeName,
					com.tools20022.repository.msg.GenericIdentification163.mmSchemeName, com.tools20022.repository.msg.GenericIdentification79.mmSchemeName);
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NameShort";
			definition = "Short textual description of the scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text code;
	/**
	 * Code that represents the enumerated list, for example, ISO 6166 for ISIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification8#mmIdentificationType
	 * GenericIdentification8.mmIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice#mmCode
	 * FinancialIdentificationSchemeName1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice#mmProprietary
	 * FinancialIdentificationSchemeName1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountSchemeName1Choice#mmCode
	 * AccountSchemeName1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountSchemeName1Choice#mmProprietary
	 * AccountSchemeName1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification4#mmIdentificationType
	 * GenericIdentification4.mmIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice#mmCode
	 * OrganisationIdentificationSchemeName1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice#mmProprietary
	 * OrganisationIdentificationSchemeName1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice#mmCode
	 * PersonIdentificationSchemeName1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName2Choice#mmCode
	 * OrganisationIdentificationSchemeName2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentificationSchemeName2Choice#mmProprietary
	 * OrganisationIdentificationSchemeName2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource3Choice#mmCode
	 * IdentificationSource3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource4Choice#mmCode
	 * IdentificationSource4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RestrictedIdentification2#mmIdentificationType
	 * RestrictedIdentification2.mmIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification49#mmIdentificationType
	 * GenericIdentification49.mmIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource5Choice#mmDomesticIdentificationSource
	 * IdentificationSource5Choice.mmDomesticIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateStatus1Choice#mmCode
	 * MandateStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MandateStatus1Choice#mmProprietary
	 * MandateStatus1Choice.mmProprietary}</li>
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
	 * definition} =
	 * "Code that represents the enumerated list, for example, ISO 6166 for ISIN."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentification8.mmIdentificationType, com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice.mmCode,
					com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice.mmProprietary, com.tools20022.repository.choice.AccountSchemeName1Choice.mmCode,
					com.tools20022.repository.choice.AccountSchemeName1Choice.mmProprietary, com.tools20022.repository.msg.GenericIdentification4.mmIdentificationType,
					com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice.mmCode, com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice.mmProprietary,
					com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice.mmCode, com.tools20022.repository.choice.OrganisationIdentificationSchemeName2Choice.mmCode,
					com.tools20022.repository.choice.OrganisationIdentificationSchemeName2Choice.mmProprietary, com.tools20022.repository.choice.IdentificationSource3Choice.mmCode,
					com.tools20022.repository.choice.IdentificationSource4Choice.mmCode, com.tools20022.repository.msg.RestrictedIdentification2.mmIdentificationType,
					com.tools20022.repository.msg.GenericIdentification49.mmIdentificationType, com.tools20022.repository.choice.IdentificationSource5Choice.mmDomesticIdentificationSource,
					com.tools20022.repository.choice.MandateStatus1Choice.mmCode, com.tools20022.repository.choice.MandateStatus1Choice.mmProprietary);
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Code that represents the enumerated list, for example, ISO 6166 for ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.GenericIdentification> identification;
	/**
	 * Identification information for which a scheme is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmScheme
	 * GenericIdentification.mmScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification1#mmType
	 * OtherIdentification1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification2#mmType
	 * OtherIdentification2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification3#mmType
	 * OtherIdentification3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification4#mmType
	 * OtherIdentification4.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification information for which a scheme is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherIdentification1.mmType, com.tools20022.repository.msg.OtherIdentification2.mmType, com.tools20022.repository.msg.OtherIdentification3.mmType,
					com.tools20022.repository.msg.OtherIdentification4.mmType);
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification information for which a scheme is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected Rating rating;
	/**
	 * Rating for which an identification by scheme is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Rating#mmRatingScheme
	 * Rating.mmRatingScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Rating Rating}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rating"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rating for which an identification by scheme is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRating = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rating";
			definition = "Rating for which an identification by scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Rating.mmRatingScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Rating.mmObject();
		}
	};
	protected CreditorRole creditorRole;
	/**
	 * Creditor for which an identification by scheme is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CreditorRole#mmSchemeIdentification
	 * CreditorRole.mmSchemeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CreditorRole
	 * CreditorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creditor for which an identification by scheme is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCreditorRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditorRole";
			definition = "Creditor for which an identification by scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CreditorRole.mmSchemeIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CreditorRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InformationPartyRole> informationPartyRole;
	/**
	 * Role played by a party as source of a scheme code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmScheme
	 * InformationPartyRole.mmScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party as source of a scheme code."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInformationPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationPartyRole";
			definition = "Role played by a party as source of a scheme code.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
		}
	};
	protected Max35Text version;
	/**
	 * Version number of the scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version number of the scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmVersion = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Version";
			definition = "Version number of the scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateTimePeriod assessmentValidityPeriod;
	/**
	 * Period during which the version of the scheme applies (see ISO-8601).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAssessmentValidityScheme
	 * DateTimePeriod.mmAssessmentValidityScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssessmentValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the version of the scheme applies (see ISO-8601)."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAssessmentValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssessmentValidityPeriod";
			definition = "Period during which the version of the scheme applies (see ISO-8601).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmAssessmentValidityScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Max70Text nameLong;
	/**
	 * Long textual description of the scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameLong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Long textual description of the scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNameLong = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NameLong";
			definition = "Long textual description of the scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max350Text description;
	/**
	 * Textual description of the scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Textual description of the scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDescription = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Textual description of the scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text domainValueCode;
	/**
	 * Code for a specific instance of an entry within the enumerated list, for
	 * example, ISIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomainValueCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code for a specific instance of an entry within the enumerated list, for example, ISIN."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDomainValueCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomainValueCode";
			definition = "Code for a specific instance of an entry within the enumerated list, for example, ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max70Text domainValueName;
	/**
	 * Textual description of the DomainValueCode, for example, International
	 * Securities Identification Number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomainValueName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Textual description of the DomainValueCode, for example, International Securities Identification Number."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDomainValueName = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomainValueName";
			definition = "Textual description of the DomainValueCode, for example, International Securities Identification Number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Sector sector;
	/**
	 * Specifies the sector to which the scheme applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Sector#mmScheme
	 * Sector.mmScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Sector Sector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the sector to which the scheme applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSector = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Specifies the sector to which the scheme applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.mmScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
		}
	};
	protected AssetClassification assetClassification;
	/**
	 * Asset for which a classification by scheme is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmAssetClassScheme
	 * AssetClassification.mmAssetClassScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Scheme
	 * Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset for which a classification by scheme is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAssetClassification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Scheme.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetClassification";
			definition = "Asset for which a classification by scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmAssetClassScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Scheme";
				definition = "Information regarding an enumerated code list and its owner.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InformationPartyRole.mmScheme, com.tools20022.repository.entity.GenericIdentification.mmScheme,
						com.tools20022.repository.entity.DateTimePeriod.mmAssessmentValidityScheme, com.tools20022.repository.entity.AssetClassification.mmAssetClassScheme, com.tools20022.repository.entity.Rating.mmRatingScheme,
						com.tools20022.repository.entity.Sector.mmScheme, com.tools20022.repository.entity.CreditorRole.mmSchemeIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Scheme.mmNameShort, com.tools20022.repository.entity.Scheme.mmCode, com.tools20022.repository.entity.Scheme.mmIdentification,
						com.tools20022.repository.entity.Scheme.mmRating, com.tools20022.repository.entity.Scheme.mmCreditorRole, com.tools20022.repository.entity.Scheme.mmInformationPartyRole,
						com.tools20022.repository.entity.Scheme.mmVersion, com.tools20022.repository.entity.Scheme.mmAssessmentValidityPeriod, com.tools20022.repository.entity.Scheme.mmNameLong,
						com.tools20022.repository.entity.Scheme.mmDescription, com.tools20022.repository.entity.Scheme.mmDomainValueCode, com.tools20022.repository.entity.Scheme.mmDomainValueName,
						com.tools20022.repository.entity.Scheme.mmSector, com.tools20022.repository.entity.Scheme.mmAssetClassification);
				derivationComponent_lazy = () -> Arrays.asList(FinancialIdentificationSchemeName1Choice.mmObject(), AccountSchemeName1Choice.mmObject(), MandateStatus1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getNameShort() {
		return nameShort;
	}

	public void setNameShort(Max35Text nameShort) {
		this.nameShort = nameShort;
	}

	public Max35Text getCode() {
		return code;
	}

	public void setCode(Max35Text code) {
		this.code = code;
	}

	public List<GenericIdentification> getIdentification() {
		return identification;
	}

	public void setIdentification(List<com.tools20022.repository.entity.GenericIdentification> identification) {
		this.identification = identification;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(com.tools20022.repository.entity.Rating rating) {
		this.rating = rating;
	}

	public CreditorRole getCreditorRole() {
		return creditorRole;
	}

	public void setCreditorRole(com.tools20022.repository.entity.CreditorRole creditorRole) {
		this.creditorRole = creditorRole;
	}

	public List<InformationPartyRole> getInformationPartyRole() {
		return informationPartyRole;
	}

	public void setInformationPartyRole(List<com.tools20022.repository.entity.InformationPartyRole> informationPartyRole) {
		this.informationPartyRole = informationPartyRole;
	}

	public Max35Text getVersion() {
		return version;
	}

	public void setVersion(Max35Text version) {
		this.version = version;
	}

	public DateTimePeriod getAssessmentValidityPeriod() {
		return assessmentValidityPeriod;
	}

	public void setAssessmentValidityPeriod(com.tools20022.repository.entity.DateTimePeriod assessmentValidityPeriod) {
		this.assessmentValidityPeriod = assessmentValidityPeriod;
	}

	public Max70Text getNameLong() {
		return nameLong;
	}

	public void setNameLong(Max70Text nameLong) {
		this.nameLong = nameLong;
	}

	public Max350Text getDescription() {
		return description;
	}

	public void setDescription(Max350Text description) {
		this.description = description;
	}

	public Max35Text getDomainValueCode() {
		return domainValueCode;
	}

	public void setDomainValueCode(Max35Text domainValueCode) {
		this.domainValueCode = domainValueCode;
	}

	public Max70Text getDomainValueName() {
		return domainValueName;
	}

	public void setDomainValueName(Max70Text domainValueName) {
		this.domainValueName = domainValueName;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(com.tools20022.repository.entity.Sector sector) {
		this.sector = sector;
	}

	public AssetClassification getAssetClassification() {
		return assetClassification;
	}

	public void setAssetClassification(com.tools20022.repository.entity.AssetClassification assetClassification) {
		this.assetClassification = assetClassification;
	}
}
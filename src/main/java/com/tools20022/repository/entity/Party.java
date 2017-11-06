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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.MoneyLaunderingCheckCode;
import com.tools20022.repository.entity.RolePlayer;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Entity involved in an activity.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Party" src="doc-files/Party.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmContactPoint
 * Party.mmContactPoint}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmIdentification
 * Party.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
 * Party.mmMoneyLaunderingCheck}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
 * Party.mmTaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmDomicile
 * Party.mmDomicile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmResidence
 * Party.mmResidence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmPowerOfAttorney
 * Party.mmPowerOfAttorney}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmLocation
 * Party.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmCloseLinkSecurity
 * Party.mmCloseLinkSecurity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Person Person}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmCloseLink
 * Security.mmCloseLink}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedParty
 * ContactPoint.mmRelatedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
 * PartyIdentificationInformation.mmIdentifiedParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmDomiciledParty
 * Location.mmDomiciledParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmParty
 * Location.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmTaxableParty
 * Location.mmTaxableParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
 * Tax.mmTaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedParty
 * PowerOfAttorney.mmAuthorisedParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#mmParty
 * InvestmentAccountOwnershipInformation6.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmParty
 * InvestmentAccountOwnershipInformation7.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OperationMandate1#mmMandateHolder
 * OperationMandate1.mmMandateHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1#mmPartyOrGroup
 * PartyAndAuthorisation1.mmPartyOrGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3#mmPartyOrGroup
 * PartyAndAuthorisation3.mmPartyOrGroup}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report2#mmNonClearingMember
 * Report2.mmNonClearingMember}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition1#mmDepository
 * NetPosition1.mmDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmParty
 * InvestmentAccountOwnershipInformation8.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmParty
 * InvestmentAccountOwnershipInformation9.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmParty
 * InvestmentAccountOwnershipInformation10.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmParty
 * InvestmentAccountOwnershipInformation11.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Report5#mmNonClearingMember
 * Report5.mmNonClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmParty
 * InvestmentAccountOwnershipInformation12.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmParty
 * InvestmentAccountOwnershipInformation13.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmParty
 * InvestmentAccountOwnershipInformation15.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmParty
 * InvestmentAccountOwnershipInformation14.mmParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.RolePlayer
 * RolePlayer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType1
 * CountryAndResidentialStatusType1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party14Choice Party14Choice}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount93
 * PartyIdentificationAndAccount93}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty1Choice
 * Counterparty1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty4Choice
 * Counterparty4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount81
 * PartyIdentificationAndAccount81}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount86
 * PartyIdentificationAndAccount86}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty7Choice
 * Counterparty7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount88
 * PartyIdentificationAndAccount88}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount92
 * PartyIdentificationAndAccount92}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty2Choice
 * Counterparty2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty3Choice
 * Counterparty3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty6Choice
 * Counterparty6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradingPartyCapacity1Choice
 * TradingPartyCapacity1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradingPartyCapacity2Choice
 * TradingPartyCapacity2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature1
 * PartyAndSignature1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndAuthorisation1
 * PartyAndAuthorisation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndAuthorisation3
 * PartyAndAuthorisation3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AddressOrParty1Choice
 * AddressOrParty1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndType1 PartyAndType1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty5Choice
 * Counterparty5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1
 * PartyAndAccountIdentificationAndContactInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty8Choice
 * Counterparty8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party15Choice Party15Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Party16Choice Party16Choice}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQualifiedPartyIdentification1
 * SingleQualifiedPartyIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party24Choice Party24Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Party23Choice Party23Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty9Choice
 * Counterparty9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108
 * PartyIdentificationAndAccount108}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount109
 * PartyIdentificationAndAccount109}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party30Choice Party30Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Party31Choice Party31Choice}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType2
 * CountryAndResidentialStatusType2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount125
 * PartyIdentificationAndAccount125}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount135
 * PartyIdentificationAndAccount135}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount137
 * PartyIdentificationAndAccount137}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Counterparty10Choice
 * Counterparty10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party33Choice Party33Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Party32Choice Party32Choice}
 * </li>
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
 * "Party"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * </ul>
 */
public class Party extends RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.ContactPoint> contactPoint;
	/**
	 * Number, physical or virtual address, used for communication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedParty
	 * ContactPoint.mmRelatedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex#mmLocalOrderDesk
	 * LocalMarketAnnex.mmLocalOrderDesk}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LocalMarketAnnex2#mmLocalOrderDesk
	 * LocalMarketAnnex2.mmLocalOrderDesk}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundProcessingPassport1#mmFundManagementCompany
	 * FundProcessingPassport1.mmFundManagementCompany}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation2#mmPrimaryCommunicationAddress
	 * Organisation2.mmPrimaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation2#mmSecondaryCommunicationAddress
	 * Organisation2.mmSecondaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#mmPrimaryCommunicationAddress
	 * Organisation3.mmPrimaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#mmSecondaryCommunicationAddress
	 * Organisation3.mmSecondaryCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification32#mmContactDetails
	 * PartyIdentification32.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#mmContactDetails
	 * PartyIdentification43.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation1#mmPartyContactDetails
	 * PartyTextInformation1.mmPartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation2#mmPartyContactDetails
	 * PartyTextInformation2.mmPartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation3#mmPartyContactDetails
	 * PartyTextInformation3.mmPartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation4#mmPartyContactDetails
	 * PartyTextInformation4.mmPartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation5#mmPartyContactDetails
	 * PartyTextInformation5.mmPartyContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification41#mmContactDetails
	 * PartyIdentification41.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#mmContactDetails
	 * PartyIdentification40.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExtendOrPayQuery1#mmBankContact
	 * ExtendOrPayQuery1.mmBankContact}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmContactDetails
	 * PartyIdentification42.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation1#mmContactInformation
	 * GeneralInformation1.mmContactInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmContactInformation
	 * GeneralInformation4.mmContactInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation2#mmContactInformation
	 * GeneralInformation2.mmContactInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1#mmContactInformation
	 * PartyAndAccountIdentificationAndContactInformation1.mmContactInformation}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification45#mmContactDetails
	 * PartyIdentification45.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentificationAndAddress#mmCommunicationAddress
	 * ContactIdentificationAndAddress.mmCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberDetails#mmCommunicationAddress
	 * MemberDetails.mmCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberDetails1#mmCommunicationAddress
	 * MemberDetails1.mmCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails3#mmPreferredMethod
	 * ContactDetails3.mmPreferredMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#mmContactDetails
	 * PartyIdentification58.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountTax1#mmNonResidenceCountry
	 * AccountTax1.mmNonResidenceCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary16#mmCommunicationInformation
	 * Intermediary16.mmCommunicationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Member1#mmCommunicationAddress
	 * Member1.mmCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Member2#mmCommunicationAddress
	 * Member2.mmCommunicationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#mmContactDetails
	 * PartyIdentification77.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification112#mmContactDetails
	 * PartyIdentification112.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification28#mmContactDetails
	 * OrganisationIdentification28.mmContactDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmContactInformation
	 * GeneralInformation5.mmContactInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number, physical or virtual address, used for communication."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmContactPoint = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LocalMarketAnnex.mmLocalOrderDesk, com.tools20022.repository.msg.LocalMarketAnnex2.mmLocalOrderDesk,
					com.tools20022.repository.msg.FundProcessingPassport1.mmFundManagementCompany, com.tools20022.repository.msg.Organisation2.mmPrimaryCommunicationAddress,
					com.tools20022.repository.msg.Organisation2.mmSecondaryCommunicationAddress, com.tools20022.repository.msg.Organisation3.mmPrimaryCommunicationAddress,
					com.tools20022.repository.msg.Organisation3.mmSecondaryCommunicationAddress, com.tools20022.repository.msg.PartyIdentification32.mmContactDetails, com.tools20022.repository.msg.PartyIdentification43.mmContactDetails,
					com.tools20022.repository.msg.PartyTextInformation1.mmPartyContactDetails, com.tools20022.repository.msg.PartyTextInformation2.mmPartyContactDetails,
					com.tools20022.repository.msg.PartyTextInformation3.mmPartyContactDetails, com.tools20022.repository.msg.PartyTextInformation4.mmPartyContactDetails,
					com.tools20022.repository.msg.PartyTextInformation5.mmPartyContactDetails, com.tools20022.repository.msg.PartyIdentification41.mmContactDetails, com.tools20022.repository.msg.PartyIdentification40.mmContactDetails,
					com.tools20022.repository.msg.ExtendOrPayQuery1.mmBankContact, com.tools20022.repository.msg.PartyIdentification42.mmContactDetails, com.tools20022.repository.msg.GeneralInformation1.mmContactInformation,
					com.tools20022.repository.msg.GeneralInformation4.mmContactInformation, com.tools20022.repository.msg.GeneralInformation2.mmContactInformation,
					com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1.mmContactInformation, com.tools20022.repository.msg.PartyIdentification45.mmContactDetails,
					com.tools20022.repository.msg.ContactIdentificationAndAddress.mmCommunicationAddress, com.tools20022.repository.msg.MemberDetails.mmCommunicationAddress,
					com.tools20022.repository.msg.MemberDetails1.mmCommunicationAddress, com.tools20022.repository.msg.ContactDetails3.mmPreferredMethod, com.tools20022.repository.msg.PartyIdentification58.mmContactDetails,
					com.tools20022.repository.msg.AccountTax1.mmNonResidenceCountry, com.tools20022.repository.msg.Intermediary16.mmCommunicationInformation, com.tools20022.repository.msg.Member1.mmCommunicationAddress,
					com.tools20022.repository.msg.Member2.mmCommunicationAddress, com.tools20022.repository.msg.PartyIdentification77.mmContactDetails, com.tools20022.repository.msg.PartyIdentification112.mmContactDetails,
					com.tools20022.repository.msg.OrganisationIdentification28.mmContactDetails, com.tools20022.repository.msg.GeneralInformation5.mmContactInformation);
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Number, physical or virtual address, used for communication.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRelatedParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PartyIdentificationInformation> identification;
	/**
	 * Specific identification assigned to a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
	 * PartyIdentificationInformation.mmIdentifiedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} = List of 2363 elements</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific identification assigned to a party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> ListBuilderForParty_00.addElems(new ArrayList<>());
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Specific identification assigned to a party.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
		}
	};
	protected MoneyLaunderingCheckCode moneyLaunderingCheck;
	/**
	 * Status of an identity check to prevent money laundering. This includes
	 * the counter-terrorism check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode
	 * MoneyLaunderingCheckCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation5.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#mmExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation5.mmExtendedMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation2.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#mmExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation2.mmExtendedMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MoneyLaunderingCheck1Choice#mmCode
	 * MoneyLaunderingCheck1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MoneyLaunderingCheck1Choice#mmProprietary
	 * MoneyLaunderingCheck1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation6.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation3.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation3.mmExtendedMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation4.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation4.mmExtendedMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation7.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmMoneyLaunderingStatus
	 * OrderParameters1.mmMoneyLaunderingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.List1#mmMoneyLaunderingStatus
	 * List1.mmMoneyLaunderingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation8.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation9.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation10.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation11.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation12.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation13.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation15.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation14.mmMoneyLaunderingCheck}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of an identity check to prevent money laundering. This includes the counter-terrorism check."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMoneyLaunderingCheck = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5.mmMoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5.mmExtendedMoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.mmMoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.mmExtendedMoneyLaunderingCheck, com.tools20022.repository.choice.MoneyLaunderingCheck1Choice.mmCode,
					com.tools20022.repository.choice.MoneyLaunderingCheck1Choice.mmProprietary, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.mmMoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmMoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmExtendedMoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4.mmMoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4.mmExtendedMoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmMoneyLaunderingCheck, com.tools20022.repository.msg.OrderParameters1.mmMoneyLaunderingStatus,
					com.tools20022.repository.msg.List1.mmMoneyLaunderingStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8.mmMoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9.mmMoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmMoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.mmMoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmMoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.mmMoneyLaunderingCheck, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmMoneyLaunderingCheck,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmMoneyLaunderingCheck);
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoneyLaunderingCheckCode.mmObject();
		}
	};
	protected Tax taxationConditions;
	/**
	 * Taxation parameters which apply to an individual person or to an
	 * organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
	 * Tax.mmTaxableParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax8#mmCountry
	 * Tax8.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#mmCountry
	 * Tax17.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax16#mmCountry
	 * Tax16.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax14#mmCountry
	 * Tax14.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax18#mmCountry
	 * Tax18.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax19#mmCountry
	 * Tax19.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxIdentification1#mmTaxationCountry
	 * TaxIdentification1.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxIdentification2#mmIssuerCountry
	 * TaxIdentification2.mmIssuerCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmCountry
	 * Tax32.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmCountry
	 * Tax30.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmCountry
	 * Tax31.mmCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxation parameters which apply to an individual person or to an organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxationConditions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax8.mmCountry, com.tools20022.repository.msg.Tax17.mmCountry, com.tools20022.repository.msg.Tax16.mmCountry, com.tools20022.repository.msg.Tax14.mmCountry,
					com.tools20022.repository.msg.Tax18.mmCountry, com.tools20022.repository.msg.Tax19.mmCountry, com.tools20022.repository.msg.TaxIdentification1.mmTaxationCountry,
					com.tools20022.repository.msg.TaxIdentification2.mmIssuerCountry, com.tools20022.repository.msg.Tax32.mmCountry, com.tools20022.repository.msg.Tax30.mmCountry, com.tools20022.repository.msg.Tax31.mmCountry);
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Taxation parameters which apply to an individual person or to an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmTaxableParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected Location domicile;
	/**
	 * Location in which a person is permanently domiciled (the place of a
	 * person's permanent home).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmDomiciledParty
	 * Location.mmDomiciledParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmDomicileCountry
	 * BeneficialOwner1.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmDomicileCountry
	 * BeneficialOwner2.mmDomicileCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domicile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location in which a person is permanently domiciled (the place of a person's permanent home)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDomicile = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BeneficialOwner1.mmDomicileCountry, com.tools20022.repository.msg.BeneficialOwner2.mmDomicileCountry);
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Domicile";
			definition = "Location in which a person is permanently domiciled (the place of a person's permanent home).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmDomiciledParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Location> residence;
	/**
	 * Location from which the affairs of a company are directed or location in
	 * which a person resides (the place of a person's home).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmParty
	 * Location.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification4#mmBuyerCountry
	 * ReportSpecification4.mmBuyerCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportSpecification4#mmSellerCountry
	 * ReportSpecification4.mmSellerCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmResidence = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportSpecification4.mmBuyerCountry, com.tools20022.repository.msg.ReportSpecification4.mmSellerCountry);
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Residence";
			definition = "Location from which the affairs of a company are directed or location in which a person resides (the place of a person's home).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected PowerOfAttorney powerOfAttorney;
	/**
	 * Power of attorney which is held by the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedParty
	 * PowerOfAttorney.mmAuthorisedParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Power of attorney which is held by the party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPowerOfAttorney = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorney";
			definition = "Power of attorney which is held by the party.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorney.mmObject();
		}
	};
	protected Location location;
	/**
	 * Location of the taxable party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmTaxableParty
	 * Location.mmTaxableParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location of the taxable party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location of the taxable party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmTaxableParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Security closeLinkSecurity;
	/**
	 * Security for which a close link with a party is identified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCloseLink
	 * Security.mmCloseLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Party
	 * Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseLinkSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security for which a close link with a party is identified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCloseLinkSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Party.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CloseLinkSecurity";
			definition = "Security for which a close link with a party is identified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmCloseLink;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Party";
				definition = "Entity involved in an activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmCloseLink, com.tools20022.repository.entity.ContactPoint.mmRelatedParty,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedParty, com.tools20022.repository.entity.Location.mmDomiciledParty, com.tools20022.repository.entity.Location.mmParty,
						com.tools20022.repository.entity.Location.mmTaxableParty, com.tools20022.repository.entity.Tax.mmTaxableParty, com.tools20022.repository.entity.PowerOfAttorney.mmAuthorisedParty);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.mmParty, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmParty,
						com.tools20022.repository.msg.OperationMandate1.mmMandateHolder, com.tools20022.repository.msg.PartyAndAuthorisation1.mmPartyOrGroup, com.tools20022.repository.msg.PartyAndAuthorisation3.mmPartyOrGroup,
						com.tools20022.repository.msg.Report2.mmNonClearingMember, com.tools20022.repository.msg.NetPosition1.mmDepository, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8.mmParty,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9.mmParty, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmParty,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.mmParty, com.tools20022.repository.msg.Report5.mmNonClearingMember,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmParty, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.mmParty,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmParty, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmParty);
				subType_lazy = () -> Arrays.asList(Organisation.mmObject(), Person.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Party.mmContactPoint, com.tools20022.repository.entity.Party.mmIdentification, com.tools20022.repository.entity.Party.mmMoneyLaunderingCheck,
						com.tools20022.repository.entity.Party.mmTaxationConditions, com.tools20022.repository.entity.Party.mmDomicile, com.tools20022.repository.entity.Party.mmResidence,
						com.tools20022.repository.entity.Party.mmPowerOfAttorney, com.tools20022.repository.entity.Party.mmLocation, com.tools20022.repository.entity.Party.mmCloseLinkSecurity);
				derivationComponent_lazy = () -> Arrays.asList(CountryAndResidentialStatusType1.mmObject(), Party14Choice.mmObject(), PartyIdentificationAndAccount93.mmObject(), Counterparty1Choice.mmObject(),
						Counterparty4Choice.mmObject(), PartyIdentificationAndAccount81.mmObject(), PartyIdentificationAndAccount86.mmObject(), Counterparty7Choice.mmObject(), PartyIdentificationAndAccount88.mmObject(),
						PartyIdentificationAndAccount92.mmObject(), Counterparty2Choice.mmObject(), Counterparty3Choice.mmObject(), Counterparty6Choice.mmObject(), TradingPartyCapacity1Choice.mmObject(),
						TradingPartyCapacity2Choice.mmObject(), PartyAndSignature1.mmObject(), PartyAndAuthorisation1.mmObject(), PartyAndAuthorisation3.mmObject(), AddressOrParty1Choice.mmObject(), PartyAndType1.mmObject(),
						Counterparty5Choice.mmObject(), PartyAndAccountIdentificationAndContactInformation1.mmObject(), Counterparty8Choice.mmObject(), Party15Choice.mmObject(), Party16Choice.mmObject(),
						SingleQualifiedPartyIdentification1.mmObject(), Party24Choice.mmObject(), Party23Choice.mmObject(), Counterparty9Choice.mmObject(), PartyIdentificationAndAccount108.mmObject(),
						PartyIdentificationAndAccount109.mmObject(), Party30Choice.mmObject(), Party31Choice.mmObject(), CountryAndResidentialStatusType2.mmObject(), PartyIdentificationAndAccount125.mmObject(),
						PartyIdentificationAndAccount135.mmObject(), PartyIdentificationAndAccount137.mmObject(), Counterparty10Choice.mmObject(), Party33Choice.mmObject(), Party32Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<ContactPoint> getContactPoint() {
		return contactPoint;
	}

	public void setContactPoint(List<com.tools20022.repository.entity.ContactPoint> contactPoint) {
		this.contactPoint = contactPoint;
	}

	public List<PartyIdentificationInformation> getIdentification() {
		return identification;
	}

	public void setIdentification(List<com.tools20022.repository.entity.PartyIdentificationInformation> identification) {
		this.identification = identification;
	}

	public MoneyLaunderingCheckCode getMoneyLaunderingCheck() {
		return moneyLaunderingCheck;
	}

	public void setMoneyLaunderingCheck(MoneyLaunderingCheckCode moneyLaunderingCheck) {
		this.moneyLaunderingCheck = moneyLaunderingCheck;
	}

	public Tax getTaxationConditions() {
		return taxationConditions;
	}

	public void setTaxationConditions(com.tools20022.repository.entity.Tax taxationConditions) {
		this.taxationConditions = taxationConditions;
	}

	public Location getDomicile() {
		return domicile;
	}

	public void setDomicile(com.tools20022.repository.entity.Location domicile) {
		this.domicile = domicile;
	}

	public List<Location> getResidence() {
		return residence;
	}

	public void setResidence(List<com.tools20022.repository.entity.Location> residence) {
		this.residence = residence;
	}

	public PowerOfAttorney getPowerOfAttorney() {
		return powerOfAttorney;
	}

	public void setPowerOfAttorney(com.tools20022.repository.entity.PowerOfAttorney powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(com.tools20022.repository.entity.Location location) {
		this.location = location;
	}

	public Security getCloseLinkSecurity() {
		return closeLinkSecurity;
	}

	public void setCloseLinkSecurity(com.tools20022.repository.entity.Security closeLinkSecurity) {
		this.closeLinkSecurity = closeLinkSecurity;
	}
}
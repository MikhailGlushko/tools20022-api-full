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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.EligibilityCode;
import com.tools20022.repository.codeset.InvestorTypeCode;
import com.tools20022.repository.codeset.RankCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.TradePartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that makes investment decisions. Identifies the beneficiary or its
 * broker.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestorRole" src="doc-files/InvestorRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestorRole#mmIndividualInvestor
 * InvestorRole.mmIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestorRole#mmCorporateInvestor
 * InvestorRole.mmCorporateInvestor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestorRole#mmCapacity
 * InvestorRole.mmCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestorRole#mmInvestorProtectionAssociationMembership
 * InvestorRole.mmInvestorProtectionAssociationMembership}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestorRole#mmType
 * InvestorRole.mmType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.InvestorCapacity1Choice
 * InvestorCapacity1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InvestorCapacity2Choice
 * InvestorCapacity2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InvestorCapacity3Choice
 * InvestorCapacity3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InvestorType2Choice
 * InvestorType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InvestorCapacity4Choice
 * InvestorCapacity4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountDesignation1Choice
 * AccountDesignation1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InvestorCapacity5Choice
 * InvestorCapacity5Choice}</li>
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
 * "InvestorRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that makes investment decisions. Identifies the beneficiary or its broker."
 * </li>
 * </ul>
 */
public class InvestorRole extends TradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected RankCode individualInvestor;
	/**
	 * Specifies whether the investor is a primary or the secondary individual
	 * investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.RankCode
	 * RankCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole InvestorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investor is a primary or the secondary individual investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIndividualInvestor = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestorRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndividualInvestor";
			definition = "Specifies whether the investor is a primary or the secondary individual investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RankCode.mmObject();
		}
	};
	protected RankCode corporateInvestor;
	/**
	 * Specifies whether the investor is a primary or a secondary corporate
	 * investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.RankCode
	 * RankCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole InvestorRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmCashAccountDesignation
	 * CashAccount33.mmCashAccountDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountDesignation1Choice#mmCode
	 * AccountDesignation1Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investor is a primary or a secondary corporate investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCorporateInvestor = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount33.mmCashAccountDesignation, com.tools20022.repository.choice.AccountDesignation1Choice.mmCode);
			elementContext_lazy = () -> InvestorRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateInvestor";
			definition = "Specifies whether the investor is a primary or a secondary corporate investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RankCode.mmObject();
		}
	};
	protected EligibilityCode capacity;
	/**
	 * Specifies whether the investor is the primary, or the secondary account
	 * owner or another account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EligibilityCode
	 * EligibilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole InvestorRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity1Choice#mmCode
	 * InvestorCapacity1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity1Choice#mmProprietary
	 * InvestorCapacity1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmInvestorCapacity
	 * SecuritiesTradeDetails25.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmInvestorCapacity
	 * SecuritiesTradeDetails26.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity2Choice#mmCode
	 * InvestorCapacity2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity2Choice#mmProprietary
	 * InvestorCapacity2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmInvestorCapacity
	 * SecuritiesTradeDetails27.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmInvestorCapacity
	 * SecuritiesTradeDetails28.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmInvestorCapacity
	 * SecuritiesTradeDetails6.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#mmInvestorCapacity
	 * SecuritiesTradeDetails13.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmInvestorCapacity
	 * SecuritiesTradeDetails3.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmInvestorCapacity
	 * SecuritiesTradeDetails11.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmInvestorCapacity
	 * SecuritiesTradeDetails2.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmInvestorCapacity
	 * SecuritiesTradeDetails16.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmInvestorCapacity
	 * SecuritiesTradeDetails1.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmInvestorCapacity
	 * SecuritiesTradeDetails15.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity3Choice#mmCode
	 * InvestorCapacity3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity3Choice#mmProprietary
	 * InvestorCapacity3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#mmInvestorCapacity
	 * ConfirmationPartyDetails2.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary8#mmOrderOriginatorEligibility
	 * Intermediary8.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary9#mmOrderOriginatorEligibility
	 * Intermediary9.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmInvestorCapacity
	 * SecuritiesTradeDetails31.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmInvestorCapacity
	 * SecuritiesTradeDetails33.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmInvestorCapacity
	 * SecuritiesTradeDetails38.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmInvestorCapacity
	 * SecuritiesTradeDetails37.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmInvestorCapacity
	 * SecuritiesTradeDetails34.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmInvestorCapacity
	 * SecuritiesTradeDetails32.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmInvestorCapacity
	 * SecuritiesTradeDetails44.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#mmInvestorCapacity
	 * SecuritiesTradeDetails39.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmInvestorCapacity
	 * SecuritiesTradeDetails43.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmInvestorCapacity
	 * SecuritiesTradeDetails40.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmInvestorCapacity
	 * SecuritiesTradeDetails46.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmInvestorCapacity
	 * SecuritiesTradeDetails47.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary29#mmOrderOriginatorEligibility
	 * Intermediary29.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmInvestorCapacity
	 * SecuritiesTradeDetails51.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmInvestorCapacity
	 * SecuritiesTradeDetails53.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmInvestorCapacity
	 * SecuritiesTradeDetails55.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmInvestorCapacity
	 * SecuritiesTradeDetails56.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity4Choice#mmCode
	 * InvestorCapacity4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity4Choice#mmProprietary
	 * InvestorCapacity4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmInvestorCapacity
	 * SecuritiesTradeDetails52.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmInvestorCapacity
	 * SecuritiesTradeDetails50.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmInvestorCapacity
	 * SecuritiesTradeDetails59.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#mmInvestorCapacity
	 * SecuritiesTradeDetails58.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmInvestorCapacity
	 * SecuritiesTradeDetails63.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmInvestorCapacity
	 * SecuritiesTradeDetails62.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity5Choice#mmCode
	 * InvestorCapacity5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity5Choice#mmProprietary
	 * InvestorCapacity5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmInvestorCapacity
	 * SecuritiesTradeDetails65.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmInvestorCapacity
	 * SecuritiesTradeDetails66.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary39#mmOrderOriginatorEligibility
	 * Intermediary39.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary40#mmOrderOriginatorEligibility
	 * Intermediary40.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmInvestorCapacity
	 * SecuritiesTradeDetails67.mmInvestorCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmInvestorCapacity
	 * SecuritiesTradeDetails70.mmInvestorCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investor is the primary, or the secondary account owner or another account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCapacity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InvestorCapacity1Choice.mmCode, com.tools20022.repository.choice.InvestorCapacity1Choice.mmProprietary,
					com.tools20022.repository.msg.SecuritiesTradeDetails25.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails26.mmInvestorCapacity, com.tools20022.repository.choice.InvestorCapacity2Choice.mmCode,
					com.tools20022.repository.choice.InvestorCapacity2Choice.mmProprietary, com.tools20022.repository.msg.SecuritiesTradeDetails27.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails28.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails6.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails13.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails3.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails11.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails2.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails16.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails1.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails15.mmInvestorCapacity, com.tools20022.repository.choice.InvestorCapacity3Choice.mmCode, com.tools20022.repository.choice.InvestorCapacity3Choice.mmProprietary,
					com.tools20022.repository.msg.ConfirmationPartyDetails2.mmInvestorCapacity, com.tools20022.repository.msg.Intermediary8.mmOrderOriginatorEligibility,
					com.tools20022.repository.msg.Intermediary9.mmOrderOriginatorEligibility, com.tools20022.repository.msg.SecuritiesTradeDetails31.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails33.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails38.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails37.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails34.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails32.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails44.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails39.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails43.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails40.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails46.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails47.mmInvestorCapacity, com.tools20022.repository.msg.Intermediary29.mmOrderOriginatorEligibility,
					com.tools20022.repository.msg.SecuritiesTradeDetails51.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails53.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails55.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails56.mmInvestorCapacity, com.tools20022.repository.choice.InvestorCapacity4Choice.mmCode,
					com.tools20022.repository.choice.InvestorCapacity4Choice.mmProprietary, com.tools20022.repository.msg.SecuritiesTradeDetails52.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails50.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails59.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails58.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmInvestorCapacity,
					com.tools20022.repository.msg.SecuritiesTradeDetails62.mmInvestorCapacity, com.tools20022.repository.choice.InvestorCapacity5Choice.mmCode, com.tools20022.repository.choice.InvestorCapacity5Choice.mmProprietary,
					com.tools20022.repository.msg.SecuritiesTradeDetails65.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails66.mmInvestorCapacity,
					com.tools20022.repository.msg.Intermediary39.mmOrderOriginatorEligibility, com.tools20022.repository.msg.Intermediary40.mmOrderOriginatorEligibility,
					com.tools20022.repository.msg.SecuritiesTradeDetails67.mmInvestorCapacity, com.tools20022.repository.msg.SecuritiesTradeDetails70.mmInvestorCapacity);
			elementContext_lazy = () -> InvestorRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Capacity";
			definition = "Specifies whether the investor is the primary, or the secondary account owner or another account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EligibilityCode.mmObject();
		}
	};
	protected YesNoIndicator investorProtectionAssociationMembership;
	/**
	 * Indicates whether the confirmation party is a member of the investor
	 * protection association required, eg, as per regulation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole InvestorRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#mmInvestorProtectionAssociationMembership
	 * ConfirmationPartyDetails6.mmInvestorProtectionAssociationMembership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails5#mmInvestorProtectionAssociationMembership
	 * ConfirmationPartyDetails5.mmInvestorProtectionAssociationMembership}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorProtectionAssociationMembership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the confirmation party is a member of the investor protection association required, eg, as per regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInvestorProtectionAssociationMembership = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConfirmationPartyDetails6.mmInvestorProtectionAssociationMembership,
					com.tools20022.repository.msg.ConfirmationPartyDetails5.mmInvestorProtectionAssociationMembership);
			elementContext_lazy = () -> InvestorRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestorProtectionAssociationMembership";
			definition = "Indicates whether the confirmation party is a member of the investor protection association required, eg, as per regulation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected InvestorTypeCode type;
	/**
	 * Specifies whether the investor is a corporate or an individual
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorTypeCode
	 * InvestorTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole InvestorRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorType2Choice#mmCode
	 * InvestorType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InvestorType2Choice#mmProprietary
	 * InvestorType2Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investor is a corporate or an individual"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InvestorType2Choice.mmCode, com.tools20022.repository.choice.InvestorType2Choice.mmProprietary);
			elementContext_lazy = () -> InvestorRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies whether the investor is a corporate or an individual";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestorTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestorRole";
				definition = "Party that makes investment decisions. Identifies the beneficiary or its broker.";
				superType_lazy = () -> TradePartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestorRole.mmIndividualInvestor, com.tools20022.repository.entity.InvestorRole.mmCorporateInvestor,
						com.tools20022.repository.entity.InvestorRole.mmCapacity, com.tools20022.repository.entity.InvestorRole.mmInvestorProtectionAssociationMembership, com.tools20022.repository.entity.InvestorRole.mmType);
				derivationComponent_lazy = () -> Arrays.asList(InvestorCapacity1Choice.mmObject(), InvestorCapacity2Choice.mmObject(), InvestorCapacity3Choice.mmObject(), InvestorType2Choice.mmObject(), InvestorCapacity4Choice.mmObject(),
						AccountDesignation1Choice.mmObject(), InvestorCapacity5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public RankCode getIndividualInvestor() {
		return individualInvestor;
	}

	public void setIndividualInvestor(RankCode individualInvestor) {
		this.individualInvestor = individualInvestor;
	}

	public RankCode getCorporateInvestor() {
		return corporateInvestor;
	}

	public void setCorporateInvestor(RankCode corporateInvestor) {
		this.corporateInvestor = corporateInvestor;
	}

	public EligibilityCode getCapacity() {
		return capacity;
	}

	public void setCapacity(EligibilityCode capacity) {
		this.capacity = capacity;
	}

	public YesNoIndicator getInvestorProtectionAssociationMembership() {
		return investorProtectionAssociationMembership;
	}

	public void setInvestorProtectionAssociationMembership(YesNoIndicator investorProtectionAssociationMembership) {
		this.investorProtectionAssociationMembership = investorProtectionAssociationMembership;
	}

	public InvestorTypeCode getType() {
		return type;
	}

	public void setType(InvestorTypeCode type) {
		this.type = type;
	}
}
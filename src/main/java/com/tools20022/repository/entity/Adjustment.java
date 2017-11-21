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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.AdjustmentDirectionCode;
import com.tools20022.repository.codeset.AdjustmentTypeCode;
import com.tools20022.repository.codeset.TaxationBasisCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Modification on the value of goods and / or services. For example: rebate,
 * discount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Adjustment" src="doc-files/Adjustment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
 * Adjustment.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
 * Adjustment.mmChargeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCalculationMethod
 * Adjustment.mmCalculationMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmPayment
 * Adjustment.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmDirection
 * Adjustment.mmDirection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmReason
 * Adjustment.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmRelatedLineItem
 * Adjustment.mmRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAllowanceChargeIndicator
 * Adjustment.mmAllowanceChargeIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmPrice
 * Adjustment.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeIndicator
 * Adjustment.mmChargeIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmType
 * Adjustment.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCollateralManagement
 * Adjustment.mmCollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAdjustedBalance
 * Adjustment.mmAdjustedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargesPartyRole
 * Adjustment.mmChargesPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmEffectivePeriod
 * Adjustment.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCurrencyExchange
 * Adjustment.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmSecuritiesOrder
 * Adjustment.mmSecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmTax
 * Adjustment.mmTax}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Commission Commission}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges Charges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discount Discount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allowance Allowance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Penalty Penalty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ChargeTaxBasisType1Choice
 * ChargeTaxBasisType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentAdjustment1
 * DocumentAdjustment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment5 Adjustment5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DiscountOrChargeType1Choice
 * DiscountOrChargeType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentAdjustment2
 * DocumentAdjustment2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1
 * LineItemAllowanceCharge1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment4 Adjustment4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3 Adjustment3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment6 Adjustment6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Adjustment7 Adjustment7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AdjustmentType1Choice
 * AdjustmentType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ChargeBasisType1Choice
 * ChargeBasisType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2
 * LineItemAllowanceCharge2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAdjustment
 * DateTimePeriod.mmRelatedAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAdjustment
 * Tax.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAdjustments
 * Payment.mmAdjustments}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAdjustment
 * Balance.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
 * Price.mmPriceAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmAdjustment
 * CurrencyExchange.mmAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmAdjustments
 * SecuritiesOrder.mmAdjustments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ChargePartyRole#mmAdjustment
 * ChargePartyRole.mmAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmFinancialAdjustment
 * LineItem.mmFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmFeesAndCommissions
 * CollateralManagement.mmFeesAndCommissions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmAdjustmentAmountAndReason
 * RemittanceAmount3.mmAdjustmentAmountAndReason}</li>
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
 * "Adjustment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Modification on the value of goods and / or services. For example: rebate, discount."
 * </li>
 * </ul>
 */
public class Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount amount;
	/**
	 * Amount of money that results from the application of an adjustment
	 * (charges. fees, discount or allowance) to the amount due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge9#mmAmount
	 * Charge9.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge15#mmAmount
	 * Charge15.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge4#mmAmount
	 * Charge4.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge20#mmAmount
	 * Charge20.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission12#mmAmount
	 * Commission12.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#mmChargesFees
	 * OtherAmounts12.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#mmExecutingBrokerAmount
	 * OtherAmounts12.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#mmLocalBrokerCommission
	 * OtherAmounts12.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#mmChargesFees
	 * OtherAmounts14.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#mmExecutingBrokerAmount
	 * OtherAmounts14.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#mmLocalBrokerCommission
	 * OtherAmounts14.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#mmChargesFees
	 * OtherAmounts20.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#mmExecutingBrokerAmount
	 * OtherAmounts20.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#mmLocalBrokerCommission
	 * OtherAmounts20.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmExecutingBrokerAmount
	 * CorporateActionAmounts2.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts2.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts2.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmChargesAmount
	 * CorporateActionAmounts2.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmExecutingBrokerAmount
	 * CorporateActionAmounts5.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts5.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts5.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmChargesAmount
	 * CorporateActionAmounts5.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmExecutingBrokerAmount
	 * CorporateActionAmounts11.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts11.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts11.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmChargesAmount
	 * CorporateActionAmounts11.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmExecutingBrokerAmount
	 * CorporateActionAmounts12.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts12.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts12.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmChargesAmount
	 * CorporateActionAmounts12.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmExecutingBrokerAmount
	 * CorporateActionAmounts17.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts17.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts17.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmChargesAmount
	 * CorporateActionAmounts17.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmExecutingBrokerAmount
	 * CorporateActionAmounts20.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts20.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts20.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmChargesAmount
	 * CorporateActionAmounts20.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmExecutingBrokerAmount
	 * CorporateActionAmounts23.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts23.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts23.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmChargesAmount
	 * CorporateActionAmounts23.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmExecutingBrokerAmount
	 * CorporateActionAmounts24.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts24.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts24.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmChargesAmount
	 * CorporateActionAmounts24.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmExecutingBrokerAmount
	 * CorporateActionAmounts3.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts3.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts3.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmChargesAmount
	 * CorporateActionAmounts3.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmExecutingBrokerAmount
	 * CorporateActionAmounts6.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts6.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts6.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmChargesAmount
	 * CorporateActionAmounts6.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmExecutingBrokerAmount
	 * CorporateActionAmounts9.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts9.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts9.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmChargesAmount
	 * CorporateActionAmounts9.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmExecutingBrokerAmount
	 * CorporateActionAmounts13.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts13.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts13.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmChargesAmount
	 * CorporateActionAmounts13.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmExecutingBrokerAmount
	 * CorporateActionAmounts16.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts16.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts16.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmChargesAmount
	 * CorporateActionAmounts16.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmExecutingBrokerAmount
	 * CorporateActionAmounts19.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts19.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts19.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmChargesAmount
	 * CorporateActionAmounts19.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmExecutingBrokerAmount
	 * CorporateActionAmounts22.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts22.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts22.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmChargesAmount
	 * CorporateActionAmounts22.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmExecutingBrokerAmount
	 * CorporateActionAmounts25.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts25.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts25.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmChargesAmount
	 * CorporateActionAmounts25.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmExecutingBrokerAmount
	 * CorporateActionAmounts4.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts4.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts4.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmChargesAmount
	 * CorporateActionAmounts4.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmExecutingBrokerAmount
	 * CorporateActionAmounts7.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts7.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts7.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmChargesAmount
	 * CorporateActionAmounts7.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmExecutingBrokerAmount
	 * CorporateActionAmounts10.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts10.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts10.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmChargesAmount
	 * CorporateActionAmounts10.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmExecutingBrokerAmount
	 * CorporateActionAmounts14.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts14.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts14.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmChargesAmount
	 * CorporateActionAmounts14.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmExecutingBrokerAmount
	 * CorporateActionAmounts15.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts15.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts15.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmChargesAmount
	 * CorporateActionAmounts15.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmExecutingBrokerAmount
	 * CorporateActionAmounts18.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts18.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts18.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmChargesAmount
	 * CorporateActionAmounts18.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmExecutingBrokerAmount
	 * CorporateActionAmounts21.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts21.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts21.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmChargesAmount
	 * CorporateActionAmounts21.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmExecutingBrokerAmount
	 * CorporateActionAmounts26.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts26.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts26.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmChargesAmount
	 * CorporateActionAmounts26.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#mmChargesFees
	 * OtherAmounts4.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#mmExecutingBrokerAmount
	 * OtherAmounts4.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#mmLocalBrokerCommission
	 * OtherAmounts4.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#mmChargesFees
	 * OtherAmounts5.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#mmExecutingBrokerAmount
	 * OtherAmounts5.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#mmLocalBrokerCommission
	 * OtherAmounts5.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmChargesFees
	 * OtherAmounts17.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmExecutingBrokerAmount
	 * OtherAmounts17.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmLocalBrokerCommission
	 * OtherAmounts17.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#mmChargesFees
	 * OtherAmounts23.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#mmExecutingBrokerAmount
	 * OtherAmounts23.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#mmLocalBrokerCommission
	 * OtherAmounts23.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#mmChargesFees
	 * OtherAmounts3.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#mmExecutingBrokerAmount
	 * OtherAmounts3.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#mmLocalBrokerCommission
	 * OtherAmounts3.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmChargesFees
	 * OtherAmounts7.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmExecutingBrokerAmount
	 * OtherAmounts7.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmLocalBrokerCommission
	 * OtherAmounts7.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmChargesFees
	 * OtherAmounts9.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmExecutingBrokerAmount
	 * OtherAmounts9.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmLocalBrokerCommission
	 * OtherAmounts9.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmChargesFees
	 * OtherAmounts10.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmExecutingBrokerAmount
	 * OtherAmounts10.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmLocalBrokerCommission
	 * OtherAmounts10.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#mmChargesFees
	 * OtherAmounts18.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#mmExecutingBrokerAmount
	 * OtherAmounts18.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#mmLocalBrokerCommission
	 * OtherAmounts18.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#mmChargesFees
	 * OtherAmounts24.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#mmExecutingBrokerAmount
	 * OtherAmounts24.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#mmLocalBrokerCommission
	 * OtherAmounts24.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#mmChargesFees
	 * OtherAmounts13.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#mmExecutingBrokerAmount
	 * OtherAmounts13.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#mmLocalBrokerCommission
	 * OtherAmounts13.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#mmChargesFees
	 * OtherAmounts1.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#mmExecutingBrokerAmount
	 * OtherAmounts1.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#mmLocalBrokerCommission
	 * OtherAmounts1.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission16#mmTotalCommission
	 * Commission16.mmTotalCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmChargesFees
	 * OtherAmounts16.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmExecutingBrokerAmount
	 * OtherAmounts16.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmLocalBrokerCommission
	 * OtherAmounts16.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmSharedBrokerageAmount
	 * OtherAmounts16.mmSharedBrokerageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmClearingBrokerCommission
	 * OtherAmounts16.mmClearingBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation3#mmTotalChargesAndTaxAmount
	 * ChargesInformation3.mmTotalChargesAndTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation3#mmAmount
	 * ChargesInformation3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation6#mmTotalChargesAndTaxAmount
	 * ChargesInformation6.mmTotalChargesAndTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation6#mmAmount
	 * ChargesInformation6.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment1#mmAmount
	 * DocumentAdjustment1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#mmAmount
	 * ChargesRecord1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charges3#mmTotalChargesAndTaxAmount
	 * Charges3.mmTotalChargesAndTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DiscountAmountAndType1#mmAmount
	 * DiscountAmountAndType1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#mmAmount
	 * ChargesRecord2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charges4#mmTotalChargesAndTaxAmount
	 * Charges4.mmTotalChargesAndTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation1#mmChargesAmount
	 * ChargesInformation1.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation5#mmAmount
	 * ChargesInformation5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation7#mmAmount
	 * ChargesInformation7.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges2#mmAmount
	 * Charges2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmCompensationAmount
	 * PaymentTransaction45.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmCompensationAmount
	 * PaymentTransaction34.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmCompensationAmount
	 * PaymentTransaction44.mmCompensationAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission4#mmAmount
	 * Commission4.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge16#mmAmount
	 * Charge16.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission9#mmAmount
	 * Commission9.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge11#mmAmount
	 * Charge11.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission7#mmAmount
	 * Commission7.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge19#mmAmount
	 * Charge19.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission11#mmAmount
	 * Commission11.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge8#mmAmount
	 * Charge8.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission6#mmAmount
	 * Commission6.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge17#mmAmount
	 * Charge17.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission10#mmAmount
	 * Commission10.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge10#mmAmount
	 * Charge10.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalCharges2#mmTotalAmountOfCharges
	 * TotalCharges2.mmTotalAmountOfCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalCommissions2#mmTotalAmountOfCommissions
	 * TotalCommissions2.mmTotalAmountOfCommissions}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge18#mmAmount
	 * Charge18.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalCharges3#mmTotalAmountOfCharges
	 * TotalCharges3.mmTotalAmountOfCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalCommissions3#mmTotalAmountOfCommissions
	 * TotalCommissions3.mmTotalAmountOfCommissions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmExecutingBrokerAmount
	 * CorporateActionAmounts1.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts1.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts1.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmChargesAmount
	 * CorporateActionAmounts1.mmChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges1#mmAmount
	 * Charges1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmChargeAmount
	 * TaxVoucher1.mmChargeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmCommissionAmount
	 * TaxVoucher1.mmCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#mmChargesFees
	 * OtherAmounts2.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts8#mmChargesFees
	 * OtherAmounts8.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts8#mmExecutingBrokerAmount
	 * OtherAmounts8.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts8#mmLocalBrokerCommission
	 * OtherAmounts8.mmLocalBrokerCommission}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment5#mmAmount
	 * Adjustment5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1#mmActualAmount
	 * SettlementAllowanceCharge1.mmActualAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails2#mmAmount
	 * ChargesDetails2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDiscountAmount
	 * PaymentTerms3.mmDiscountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmPenaltyAmount
	 * PaymentTerms3.mmPenaltyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment2#mmAmount
	 * DocumentAdjustment2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1#mmActualAmount
	 * LineItemAllowanceCharge1.mmActualAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment4#mmAmount
	 * Adjustment4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1#mmChargeTotalAmount
	 * LineItemMonetarySummation1.mmChargeTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#mmAmount
	 * Adjustment3.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails1#mmAmount
	 * ChargesDetails1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmChargesAmount
	 * PaymentObligation1.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts11#mmChargesFees
	 * OtherAmounts11.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts11#mmExecutingBrokerAmount
	 * OtherAmounts11.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts11#mmLocalBrokerCommission
	 * OtherAmounts11.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts6#mmChargesFees
	 * OtherAmounts6.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmChargesFees
	 * OtherAmounts15.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts22#mmChargesFees
	 * OtherAmounts22.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountRate1Choice#mmAmount
	 * AmountRate1Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalCharges4#mmTotalAmountOfCharges
	 * TotalCharges4.mmTotalAmountOfCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation2#mmChargesAmount
	 * ChargesInformation2.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargesInformation4#mmChargesAmount
	 * ChargesInformation4.mmChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge23#mmAmount
	 * Charge23.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge22#mmAmount
	 * Charge22.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission14#mmAmount
	 * Commission14.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges5#mmAmount
	 * Charges5.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission17#mmAmount
	 * Commission17.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmExecutingBrokerAmount
	 * CorporateActionAmounts29.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts29.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts29.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmChargesAmount
	 * CorporateActionAmounts29.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmExecutingBrokerAmount
	 * CorporateActionAmounts27.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts27.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts27.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmChargesAmount
	 * CorporateActionAmounts27.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmExecutingBrokerAmount
	 * CorporateActionAmounts28.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts28.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts28.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmChargesAmount
	 * CorporateActionAmounts28.mmChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment6#mmAmount
	 * Adjustment6.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Adjustment7#mmAmountOrPercentage
	 * Adjustment7.mmAmountOrPercentage}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails4#mmAmount
	 * ChargesDetails4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmExecutingBrokerAmount
	 * CorporateActionAmounts33.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts33.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts33.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmChargesAmount
	 * CorporateActionAmounts33.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmExecutingBrokerAmount
	 * CorporateActionAmounts32.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts32.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts32.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmChargesAmount
	 * CorporateActionAmounts32.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmExecutingBrokerAmount
	 * CorporateActionAmounts35.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts35.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts35.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmChargesAmount
	 * CorporateActionAmounts35.mmChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission19#mmAmount
	 * Commission19.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge26#mmChargeApplied
	 * Charge26.mmChargeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountOrRate3Choice#mmAmount
	 * AmountOrRate3Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission21#mmCommissionApplied
	 * Commission21.mmCommissionApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmCompensationAmount
	 * PaymentTransaction50.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmCompensationAmount
	 * PaymentTransaction51.mmCompensationAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission22#mmAmount
	 * Commission22.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge27#mmAmount
	 * Charge27.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#mmPenaltyAmount
	 * PaymentTerms6.mmPenaltyAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialItem1#mmDueAmount
	 * FinancialItem1.mmDueAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmChargesFees
	 * OtherAmounts28.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmExecutingBrokerAmount
	 * OtherAmounts28.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmLocalBrokerCommission
	 * OtherAmounts28.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmChargesFees
	 * OtherAmounts30.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmExecutingBrokerAmount
	 * OtherAmounts30.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmLocalBrokerCommission
	 * OtherAmounts30.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmChargesFees
	 * OtherAmounts31.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmExecutingBrokerAmount
	 * OtherAmounts31.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmLocalBrokerCommission
	 * OtherAmounts31.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmChargesFees
	 * OtherAmounts32.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmExecutingBrokerAmount
	 * OtherAmounts32.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmLocalBrokerCommission
	 * OtherAmounts32.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmChargesFees
	 * OtherAmounts29.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmCompensationAmount
	 * PaymentTransaction65.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmCompensationAmount
	 * PaymentTransaction60.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmExecutingBrokerAmount
	 * CorporateActionAmounts37.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts37.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts37.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmChargesAmount
	 * CorporateActionAmounts37.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmExecutingBrokerAmount
	 * CorporateActionAmounts36.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts36.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts36.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmChargesAmount
	 * CorporateActionAmounts36.mmChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission23#mmAmount
	 * Commission23.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge29#mmAmount
	 * Charge29.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmExecutingBrokerAmount
	 * CorporateActionAmounts38.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts38.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts38.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmChargesAmount
	 * CorporateActionAmounts38.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmExecutingBrokerAmount
	 * CorporateActionAmounts39.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts39.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts39.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmChargesAmount
	 * CorporateActionAmounts39.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmExecutingBrokerAmount
	 * CorporateActionAmounts41.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts41.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts41.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmChargesAmount
	 * CorporateActionAmounts41.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmExecutingBrokerAmount
	 * CorporateActionAmounts40.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts40.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts40.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmChargesAmount
	 * CorporateActionAmounts40.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#mmChargesFees
	 * OtherAmounts35.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#mmExecutingBrokerAmount
	 * OtherAmounts35.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#mmLocalBrokerCommission
	 * OtherAmounts35.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#mmChargesFees
	 * OtherAmounts34.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#mmExecutingBrokerAmount
	 * OtherAmounts34.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#mmLocalBrokerCommission
	 * OtherAmounts34.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#mmChargesFees
	 * OtherAmounts38.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#mmExecutingBrokerAmount
	 * OtherAmounts38.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#mmLocalBrokerCommission
	 * OtherAmounts38.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts36#mmChargesFees
	 * OtherAmounts36.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts36#mmExecutingBrokerAmount
	 * OtherAmounts36.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts36#mmLocalBrokerCommission
	 * OtherAmounts36.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts33#mmChargesFees
	 * OtherAmounts33.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#mmActualAmount
	 * LineItemAllowanceCharge2.mmActualAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmTotalOverheadApplied
	 * TotalFeesAndTaxes40.mmTotalOverheadApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#mmRepairedStandardAmount
	 * Fee3.mmRepairedStandardAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#mmRepairedDiscountAmount
	 * Fee3.mmRepairedDiscountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#mmRepairedRequestedAmount
	 * Fee3.mmRepairedRequestedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmStandardAmount
	 * Fee2.mmStandardAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmAppliedAmount
	 * Fee2.mmAppliedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#mmStandardAmount
	 * Fee1.mmStandardAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#mmRequestedAmount
	 * Fee1.mmRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmCompensationAmount
	 * PaymentTransaction81.mmCompensationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmCompensationAmount
	 * PaymentTransaction76.mmCompensationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that results from the application of an adjustment (charges. fees, discount or allowance) to the amount due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Charge9.mmAmount, Charge15.mmAmount, Charge4.mmAmount, Charge20.mmAmount, Commission12.mmAmount, OtherAmounts12.mmChargesFees, OtherAmounts12.mmExecutingBrokerAmount,
					OtherAmounts12.mmLocalBrokerCommission, OtherAmounts14.mmChargesFees, OtherAmounts14.mmExecutingBrokerAmount, OtherAmounts14.mmLocalBrokerCommission, OtherAmounts20.mmChargesFees, OtherAmounts20.mmExecutingBrokerAmount,
					OtherAmounts20.mmLocalBrokerCommission, CorporateActionAmounts2.mmExecutingBrokerAmount, CorporateActionAmounts2.mmPayingAgentCommissionAmount, CorporateActionAmounts2.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts2.mmChargesAmount, CorporateActionAmounts5.mmExecutingBrokerAmount, CorporateActionAmounts5.mmPayingAgentCommissionAmount, CorporateActionAmounts5.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts5.mmChargesAmount, CorporateActionAmounts11.mmExecutingBrokerAmount, CorporateActionAmounts11.mmPayingAgentCommissionAmount, CorporateActionAmounts11.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts11.mmChargesAmount, CorporateActionAmounts12.mmExecutingBrokerAmount, CorporateActionAmounts12.mmPayingAgentCommissionAmount, CorporateActionAmounts12.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts12.mmChargesAmount, CorporateActionAmounts17.mmExecutingBrokerAmount, CorporateActionAmounts17.mmPayingAgentCommissionAmount, CorporateActionAmounts17.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts17.mmChargesAmount, CorporateActionAmounts20.mmExecutingBrokerAmount, CorporateActionAmounts20.mmPayingAgentCommissionAmount, CorporateActionAmounts20.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts20.mmChargesAmount, CorporateActionAmounts23.mmExecutingBrokerAmount, CorporateActionAmounts23.mmPayingAgentCommissionAmount, CorporateActionAmounts23.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts23.mmChargesAmount, CorporateActionAmounts24.mmExecutingBrokerAmount, CorporateActionAmounts24.mmPayingAgentCommissionAmount, CorporateActionAmounts24.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts24.mmChargesAmount, CorporateActionAmounts3.mmExecutingBrokerAmount, CorporateActionAmounts3.mmPayingAgentCommissionAmount, CorporateActionAmounts3.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts3.mmChargesAmount, CorporateActionAmounts6.mmExecutingBrokerAmount, CorporateActionAmounts6.mmPayingAgentCommissionAmount, CorporateActionAmounts6.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts6.mmChargesAmount, CorporateActionAmounts9.mmExecutingBrokerAmount, CorporateActionAmounts9.mmPayingAgentCommissionAmount, CorporateActionAmounts9.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts9.mmChargesAmount, CorporateActionAmounts13.mmExecutingBrokerAmount, CorporateActionAmounts13.mmPayingAgentCommissionAmount, CorporateActionAmounts13.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts13.mmChargesAmount, CorporateActionAmounts16.mmExecutingBrokerAmount, CorporateActionAmounts16.mmPayingAgentCommissionAmount, CorporateActionAmounts16.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts16.mmChargesAmount, CorporateActionAmounts19.mmExecutingBrokerAmount, CorporateActionAmounts19.mmPayingAgentCommissionAmount, CorporateActionAmounts19.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts19.mmChargesAmount, CorporateActionAmounts22.mmExecutingBrokerAmount, CorporateActionAmounts22.mmPayingAgentCommissionAmount, CorporateActionAmounts22.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts22.mmChargesAmount, CorporateActionAmounts25.mmExecutingBrokerAmount, CorporateActionAmounts25.mmPayingAgentCommissionAmount, CorporateActionAmounts25.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts25.mmChargesAmount, CorporateActionAmounts4.mmExecutingBrokerAmount, CorporateActionAmounts4.mmPayingAgentCommissionAmount, CorporateActionAmounts4.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts4.mmChargesAmount, CorporateActionAmounts7.mmExecutingBrokerAmount, CorporateActionAmounts7.mmPayingAgentCommissionAmount, CorporateActionAmounts7.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts7.mmChargesAmount, CorporateActionAmounts10.mmExecutingBrokerAmount, CorporateActionAmounts10.mmPayingAgentCommissionAmount, CorporateActionAmounts10.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts10.mmChargesAmount, CorporateActionAmounts14.mmExecutingBrokerAmount, CorporateActionAmounts14.mmPayingAgentCommissionAmount, CorporateActionAmounts14.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts14.mmChargesAmount, CorporateActionAmounts15.mmExecutingBrokerAmount, CorporateActionAmounts15.mmPayingAgentCommissionAmount, CorporateActionAmounts15.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts15.mmChargesAmount, CorporateActionAmounts18.mmExecutingBrokerAmount, CorporateActionAmounts18.mmPayingAgentCommissionAmount, CorporateActionAmounts18.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts18.mmChargesAmount, CorporateActionAmounts21.mmExecutingBrokerAmount, CorporateActionAmounts21.mmPayingAgentCommissionAmount, CorporateActionAmounts21.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts21.mmChargesAmount, CorporateActionAmounts26.mmExecutingBrokerAmount, CorporateActionAmounts26.mmPayingAgentCommissionAmount, CorporateActionAmounts26.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts26.mmChargesAmount, OtherAmounts4.mmChargesFees, OtherAmounts4.mmExecutingBrokerAmount, OtherAmounts4.mmLocalBrokerCommission, OtherAmounts5.mmChargesFees, OtherAmounts5.mmExecutingBrokerAmount,
					OtherAmounts5.mmLocalBrokerCommission, OtherAmounts17.mmChargesFees, OtherAmounts17.mmExecutingBrokerAmount, OtherAmounts17.mmLocalBrokerCommission, OtherAmounts23.mmChargesFees, OtherAmounts23.mmExecutingBrokerAmount,
					OtherAmounts23.mmLocalBrokerCommission, OtherAmounts3.mmChargesFees, OtherAmounts3.mmExecutingBrokerAmount, OtherAmounts3.mmLocalBrokerCommission, OtherAmounts7.mmChargesFees, OtherAmounts7.mmExecutingBrokerAmount,
					OtherAmounts7.mmLocalBrokerCommission, OtherAmounts9.mmChargesFees, OtherAmounts9.mmExecutingBrokerAmount, OtherAmounts9.mmLocalBrokerCommission, OtherAmounts10.mmChargesFees, OtherAmounts10.mmExecutingBrokerAmount,
					OtherAmounts10.mmLocalBrokerCommission, OtherAmounts18.mmChargesFees, OtherAmounts18.mmExecutingBrokerAmount, OtherAmounts18.mmLocalBrokerCommission, OtherAmounts24.mmChargesFees, OtherAmounts24.mmExecutingBrokerAmount,
					OtherAmounts24.mmLocalBrokerCommission, OtherAmounts13.mmChargesFees, OtherAmounts13.mmExecutingBrokerAmount, OtherAmounts13.mmLocalBrokerCommission, OtherAmounts1.mmChargesFees, OtherAmounts1.mmExecutingBrokerAmount,
					OtherAmounts1.mmLocalBrokerCommission, Commission16.mmTotalCommission, OtherAmounts16.mmChargesFees, OtherAmounts16.mmExecutingBrokerAmount, OtherAmounts16.mmLocalBrokerCommission,
					OtherAmounts16.mmSharedBrokerageAmount, OtherAmounts16.mmClearingBrokerCommission, ChargesInformation3.mmTotalChargesAndTaxAmount, ChargesInformation3.mmAmount, ChargesInformation6.mmTotalChargesAndTaxAmount,
					ChargesInformation6.mmAmount, DocumentAdjustment1.mmAmount, ChargesRecord1.mmAmount, Charges3.mmTotalChargesAndTaxAmount, DiscountAmountAndType1.mmAmount, ChargesRecord2.mmAmount, Charges4.mmTotalChargesAndTaxAmount,
					ChargesInformation1.mmChargesAmount, ChargesInformation5.mmAmount, ChargesInformation7.mmAmount, Charges2.mmAmount, PaymentTransaction45.mmCompensationAmount, PaymentTransaction34.mmCompensationAmount,
					PaymentTransaction44.mmCompensationAmount, Commission4.mmAmount, Charge16.mmAmount, Commission9.mmAmount, Charge11.mmAmount, Commission7.mmAmount, Charge19.mmAmount, Commission11.mmAmount, Charge8.mmAmount,
					Commission6.mmAmount, Charge17.mmAmount, Commission10.mmAmount, Charge10.mmAmount, TotalCharges2.mmTotalAmountOfCharges, TotalCommissions2.mmTotalAmountOfCommissions, Charge18.mmAmount,
					TotalCharges3.mmTotalAmountOfCharges, TotalCommissions3.mmTotalAmountOfCommissions, CorporateActionAmounts1.mmExecutingBrokerAmount, CorporateActionAmounts1.mmPayingAgentCommissionAmount,
					CorporateActionAmounts1.mmLocalBrokerCommissionAmount, CorporateActionAmounts1.mmChargesAmount, Charges1.mmAmount, TaxVoucher1.mmChargeAmount, TaxVoucher1.mmCommissionAmount, OtherAmounts2.mmChargesFees,
					OtherAmounts8.mmChargesFees, OtherAmounts8.mmExecutingBrokerAmount, OtherAmounts8.mmLocalBrokerCommission, Adjustment5.mmAmount, SettlementAllowanceCharge1.mmActualAmount, ChargesDetails2.mmAmount,
					PaymentTerms3.mmDiscountAmount, PaymentTerms3.mmPenaltyAmount, DocumentAdjustment2.mmAmount, LineItemAllowanceCharge1.mmActualAmount, Adjustment4.mmAmount, LineItemMonetarySummation1.mmChargeTotalAmount,
					Adjustment3.mmAmount, ChargesDetails1.mmAmount, PaymentObligation1.mmChargesAmount, OtherAmounts11.mmChargesFees, OtherAmounts11.mmExecutingBrokerAmount, OtherAmounts11.mmLocalBrokerCommission,
					OtherAmounts6.mmChargesFees, OtherAmounts15.mmChargesFees, OtherAmounts22.mmChargesFees, AmountRate1Choice.mmAmount, TotalCharges4.mmTotalAmountOfCharges, ChargesInformation2.mmChargesAmount,
					ChargesInformation4.mmChargesAmount, Charge23.mmAmount, Charge22.mmAmount, Commission14.mmAmount, Charges5.mmAmount, Commission17.mmAmount, CorporateActionAmounts29.mmExecutingBrokerAmount,
					CorporateActionAmounts29.mmPayingAgentCommissionAmount, CorporateActionAmounts29.mmLocalBrokerCommissionAmount, CorporateActionAmounts29.mmChargesAmount, CorporateActionAmounts27.mmExecutingBrokerAmount,
					CorporateActionAmounts27.mmPayingAgentCommissionAmount, CorporateActionAmounts27.mmLocalBrokerCommissionAmount, CorporateActionAmounts27.mmChargesAmount, CorporateActionAmounts28.mmExecutingBrokerAmount,
					CorporateActionAmounts28.mmPayingAgentCommissionAmount, CorporateActionAmounts28.mmLocalBrokerCommissionAmount, CorporateActionAmounts28.mmChargesAmount, Adjustment6.mmAmount, Adjustment7.mmAmountOrPercentage,
					ChargesDetails4.mmAmount, CorporateActionAmounts33.mmExecutingBrokerAmount, CorporateActionAmounts33.mmPayingAgentCommissionAmount, CorporateActionAmounts33.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts33.mmChargesAmount, CorporateActionAmounts32.mmExecutingBrokerAmount, CorporateActionAmounts32.mmPayingAgentCommissionAmount, CorporateActionAmounts32.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts32.mmChargesAmount, CorporateActionAmounts35.mmExecutingBrokerAmount, CorporateActionAmounts35.mmPayingAgentCommissionAmount, CorporateActionAmounts35.mmLocalBrokerCommissionAmount,
					CorporateActionAmounts35.mmChargesAmount, Commission19.mmAmount, Charge26.mmChargeApplied, AmountOrRate3Choice.mmAmount, Commission21.mmCommissionApplied, PaymentTransaction50.mmCompensationAmount,
					PaymentTransaction51.mmCompensationAmount, Commission22.mmAmount, Charge27.mmAmount, PaymentTerms6.mmPenaltyAmount, FinancialItem1.mmDueAmount, OtherAmounts28.mmChargesFees, OtherAmounts28.mmExecutingBrokerAmount,
					OtherAmounts28.mmLocalBrokerCommission, OtherAmounts30.mmChargesFees, OtherAmounts30.mmExecutingBrokerAmount, OtherAmounts30.mmLocalBrokerCommission, OtherAmounts31.mmChargesFees, OtherAmounts31.mmExecutingBrokerAmount,
					OtherAmounts31.mmLocalBrokerCommission, OtherAmounts32.mmChargesFees, OtherAmounts32.mmExecutingBrokerAmount, OtherAmounts32.mmLocalBrokerCommission, OtherAmounts29.mmChargesFees,
					PaymentTransaction65.mmCompensationAmount, PaymentTransaction60.mmCompensationAmount, CorporateActionAmounts37.mmExecutingBrokerAmount, CorporateActionAmounts37.mmPayingAgentCommissionAmount,
					CorporateActionAmounts37.mmLocalBrokerCommissionAmount, CorporateActionAmounts37.mmChargesAmount, CorporateActionAmounts36.mmExecutingBrokerAmount, CorporateActionAmounts36.mmPayingAgentCommissionAmount,
					CorporateActionAmounts36.mmLocalBrokerCommissionAmount, CorporateActionAmounts36.mmChargesAmount, Commission23.mmAmount, Charge29.mmAmount, CorporateActionAmounts38.mmExecutingBrokerAmount,
					CorporateActionAmounts38.mmPayingAgentCommissionAmount, CorporateActionAmounts38.mmLocalBrokerCommissionAmount, CorporateActionAmounts38.mmChargesAmount, CorporateActionAmounts39.mmExecutingBrokerAmount,
					CorporateActionAmounts39.mmPayingAgentCommissionAmount, CorporateActionAmounts39.mmLocalBrokerCommissionAmount, CorporateActionAmounts39.mmChargesAmount, CorporateActionAmounts41.mmExecutingBrokerAmount,
					CorporateActionAmounts41.mmPayingAgentCommissionAmount, CorporateActionAmounts41.mmLocalBrokerCommissionAmount, CorporateActionAmounts41.mmChargesAmount, CorporateActionAmounts40.mmExecutingBrokerAmount,
					CorporateActionAmounts40.mmPayingAgentCommissionAmount, CorporateActionAmounts40.mmLocalBrokerCommissionAmount, CorporateActionAmounts40.mmChargesAmount, OtherAmounts35.mmChargesFees,
					OtherAmounts35.mmExecutingBrokerAmount, OtherAmounts35.mmLocalBrokerCommission, OtherAmounts34.mmChargesFees, OtherAmounts34.mmExecutingBrokerAmount, OtherAmounts34.mmLocalBrokerCommission, OtherAmounts38.mmChargesFees,
					OtherAmounts38.mmExecutingBrokerAmount, OtherAmounts38.mmLocalBrokerCommission, OtherAmounts36.mmChargesFees, OtherAmounts36.mmExecutingBrokerAmount, OtherAmounts36.mmLocalBrokerCommission, OtherAmounts33.mmChargesFees,
					LineItemAllowanceCharge2.mmActualAmount, TotalFeesAndTaxes40.mmTotalOverheadApplied, Fee3.mmRepairedStandardAmount, Fee3.mmRepairedDiscountAmount, Fee3.mmRepairedRequestedAmount, Fee2.mmStandardAmount,
					Fee2.mmAppliedAmount, Fee1.mmStandardAmount, Fee1.mmRequestedAmount, PaymentTransaction81.mmCompensationAmount, PaymentTransaction76.mmCompensationAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money that results from the application of an adjustment (charges. fees, discount or allowance) to the amount due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate chargeRate;
	/**
	 * Rate used to calculate the amount of the adjustment, allowance, charge or
	 * fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge15#mmRate
	 * Charge15.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation3#mmRate
	 * ChargesInformation3.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation6#mmRate
	 * ChargesInformation6.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#mmRate
	 * ChargesRecord1.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#mmRate
	 * ChargesRecord2.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge16#mmRate
	 * Charge16.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge11#mmRate
	 * Charge11.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge19#mmRate
	 * Charge19.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge8#mmRate
	 * Charge8.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge17#mmRate
	 * Charge17.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge10#mmRate
	 * Charge10.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge18#mmRate
	 * Charge18.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDiscountPercentRate
	 * PaymentTerms3.mmDiscountPercentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms3#mmPenaltyPercentRate
	 * PaymentTerms3.mmPenaltyPercentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1#mmCalculationPercent
	 * LineItemAllowanceCharge1.mmCalculationPercent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#mmRate
	 * Adjustment3.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesDetails1#mmRate
	 * ChargesDetails1.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmChargesPercentage
	 * PaymentObligation1.mmChargesPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountRate1Choice#mmRate
	 * AmountRate1Choice.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge23#mmRate
	 * Charge23.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge22#mmRate
	 * Charge22.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges5#mmPercentage
	 * Charges5.mmPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountOrRate3Choice#mmRate
	 * AmountOrRate3Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#mmDiscountPercentRate
	 * PaymentTerms6.mmDiscountPercentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms6#mmPenaltyPercentRate
	 * PaymentTerms6.mmPenaltyPercentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EarlyPayment1#mmDiscountPercent
	 * EarlyPayment1.mmDiscountPercent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#mmCalculationPercent
	 * LineItemAllowanceCharge2.mmCalculationPercent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#mmRepairedStandardRate
	 * Fee3.mmRepairedStandardRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#mmRepairedDiscountRate
	 * Fee3.mmRepairedDiscountRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#mmRepairedRequestedRate
	 * Fee3.mmRepairedRequestedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmStandardRate
	 * Fee2.mmStandardRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmAppliedRate
	 * Fee2.mmAppliedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount1#mmRate
	 * ChargeOrCommissionDiscount1.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#mmStandardRate
	 * Fee1.mmStandardRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#mmRequestedRate
	 * Fee1.mmRequestedRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the amount of the adjustment, allowance, charge or fee."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmChargeRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Charge15.mmRate, ChargesInformation3.mmRate, ChargesInformation6.mmRate, ChargesRecord1.mmRate, ChargesRecord2.mmRate, Charge16.mmRate, Charge11.mmRate, Charge19.mmRate, Charge8.mmRate,
					Charge17.mmRate, Charge10.mmRate, Charge18.mmRate, PaymentTerms3.mmDiscountPercentRate, PaymentTerms3.mmPenaltyPercentRate, LineItemAllowanceCharge1.mmCalculationPercent, Adjustment3.mmRate, ChargesDetails1.mmRate,
					PaymentObligation1.mmChargesPercentage, AmountRate1Choice.mmRate, Charge23.mmRate, Charge22.mmRate, Charges5.mmPercentage, AmountOrRate3Choice.mmRate, PaymentTerms6.mmDiscountPercentRate,
					PaymentTerms6.mmPenaltyPercentRate, EarlyPayment1.mmDiscountPercent, LineItemAllowanceCharge2.mmCalculationPercent, Fee3.mmRepairedStandardRate, Fee3.mmRepairedDiscountRate, Fee3.mmRepairedRequestedRate,
					Fee2.mmStandardRate, Fee2.mmAppliedRate, ChargeOrCommissionDiscount1.mmRate, Fee1.mmStandardRate, Fee1.mmRequestedRate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeRate";
			definition = "Rate used to calculate the amount of the adjustment, allowance, charge or fee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getChargeRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TaxationBasisCode calculationMethod;
	/**
	 * Method used to calculate an adjustment (financial adjustment, charge or
	 * allowance).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge4#mmChargeBasis
	 * Charge4.mmChargeBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge20#mmChargeBasis
	 * Charge20.mmChargeBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charge20#mmExtendedChargeBasis
	 * Charge20.mmExtendedChargeBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge8#mmChargeBasis
	 * Charge8.mmChargeBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge17#mmChargeBasis
	 * Charge17.mmChargeBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charge17#mmExtendedChargeBasis
	 * Charge17.mmExtendedChargeBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge10#mmChargeBasis
	 * Charge10.mmChargeBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge18#mmChargeBasis
	 * Charge18.mmChargeBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charge18#mmExtendedChargeBasis
	 * Charge18.mmExtendedChargeBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionBasis1Choice#mmCode
	 * CommissionBasis1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionBasis1Choice#mmProprietary
	 * CommissionBasis1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge27#mmChargeBasis
	 * Charge27.mmChargeBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge29#mmChargeBasis
	 * Charge29.mmChargeBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeBasis2Choice#mmCode
	 * ChargeBasis2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeBasis2Choice#mmProprietary
	 * ChargeBasis2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmBasis Fee2.mmBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#mmBasis Fee1.mmBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to calculate an adjustment (financial adjustment, charge or allowance)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Charge4.mmChargeBasis, Charge20.mmChargeBasis, Charge20.mmExtendedChargeBasis, Charge8.mmChargeBasis, Charge17.mmChargeBasis, Charge17.mmExtendedChargeBasis, Charge10.mmChargeBasis,
					Charge18.mmChargeBasis, Charge18.mmExtendedChargeBasis, CommissionBasis1Choice.mmCode, CommissionBasis1Choice.mmProprietary, Charge27.mmChargeBasis, Charge29.mmChargeBasis, ChargeBasis2Choice.mmCode,
					ChargeBasis2Choice.mmProprietary, Fee2.mmBasis, Fee1.mmBasis);
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "Method used to calculate an adjustment (financial adjustment, charge or allowance).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getCalculationMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Payment> payment;
	/**
	 * Specifies the payment resulting from charges due by one party to another
	 * or the payment to which adjustements (for instance charges) are applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAdjustments
	 * Payment.mmAdjustments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the payment resulting from charges due by one party to another or the payment to which adjustements (for instance charges) are applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the payment resulting from charges due by one party to another or the payment to which adjustements (for instance charges) are applied.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmAdjustments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected AdjustmentDirectionCode direction;
	/**
	 * Specifies whether the adjustment must be subtracted or added to the total
	 * amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentDirectionCode
	 * AdjustmentDirectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment1#mmCreditDebitIndicator
	 * DocumentAdjustment1.mmCreditDebitIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment5#mmDirection
	 * Adjustment5.mmDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment2#mmCreditDebitIndicator
	 * DocumentAdjustment2.mmCreditDebitIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment4#mmDirection
	 * Adjustment4.mmDirection}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#mmDirection
	 * Adjustment3.mmDirection}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment6#mmDirection
	 * Adjustment6.mmDirection}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment7#mmDirection
	 * Adjustment7.mmDirection}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Direction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the adjustment must be subtracted or added to the total amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDirection = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentAdjustment1.mmCreditDebitIndicator, Adjustment5.mmDirection, DocumentAdjustment2.mmCreditDebitIndicator, Adjustment4.mmDirection, Adjustment3.mmDirection, Adjustment6.mmDirection,
					Adjustment7.mmDirection);
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Direction";
			definition = "Specifies whether the adjustment must be subtracted or added to the total amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdjustmentDirectionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getDirection", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max4AlphaNumericText reason;
	/**
	 * Reason for the amount adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment1#mmReason
	 * DocumentAdjustment1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1#mmReason
	 * SettlementAllowanceCharge1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment2#mmReason
	 * DocumentAdjustment2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1#mmReason
	 * LineItemAllowanceCharge1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#mmReason
	 * LineItemAllowanceCharge2.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the amount adjustment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentAdjustment1.mmReason, SettlementAllowanceCharge1.mmReason, DocumentAdjustment2.mmReason, LineItemAllowanceCharge1.mmReason, LineItemAllowanceCharge2.mmReason);
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Reason for the amount adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LineItem relatedLineItem;
	/**
	 * Specifies the line item on which a financial adjustment took place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmFinancialAdjustment
	 * LineItem.mmFinancialAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the line item on which a financial adjustment took place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedLineItem";
			definition = "Specifies the line item on which a financial adjustment took place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmFinancialAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected YesNoIndicator allowanceChargeIndicator;
	/**
	 * Indication of whether or not this allowance charge is a charge (Indicator
	 * is Yes) that should be added or an allowance that should be subtracted
	 * (Indicator is No).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1#mmAllowanceChargeIndicator
	 * SettlementAllowanceCharge1.mmAllowanceChargeIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowanceChargeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of whether or not this allowance charge is a charge (Indicator is Yes) that should be added or an allowance that should be subtracted (Indicator is No)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAllowanceChargeIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementAllowanceCharge1.mmAllowanceChargeIndicator);
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllowanceChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge (Indicator is Yes) that should be added or an allowance that should be subtracted (Indicator is No).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getAllowanceChargeIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Price price;
	/**
	 * Specifies the price which is adjusted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
	 * Price.mmPriceAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmMarketBrokerCommission
	 * OtherPrices1.mmMarketBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmMarketBrokerCommission
	 * OtherPrices2.mmMarketBrokerCommission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the price which is adjusted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OtherPrices1.mmMarketBrokerCommission, OtherPrices2.mmMarketBrokerCommission);
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Specifies the price which is adjusted.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.mmPriceAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};
	protected YesNoIndicator chargeIndicator;
	/**
	 * Indication of whether or not this allowance charge is a charge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge1#mmChargeIndicator
	 * LineItemAllowanceCharge1.mmChargeIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#mmChargeIndicator
	 * LineItemAllowanceCharge2.mmChargeIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of whether or not this allowance charge is a charge."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmChargeIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemAllowanceCharge1.mmChargeIndicator, LineItemAllowanceCharge2.mmChargeIndicator);
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getChargeIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdjustmentTypeCode type;
	/**
	 * Specifies the type of adjustment applied to the amount of goods/services
	 * by means of a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentTypeCode
	 * AdjustmentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment4#mmType
	 * Adjustment4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Adjustment4#mmOtherAdjustmentType
	 * Adjustment4.mmOtherAdjustmentType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment3#mmType
	 * Adjustment3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Adjustment3#mmOtherAdjustmentType
	 * Adjustment3.mmOtherAdjustmentType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment6#mmType
	 * Adjustment6.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Adjustment7#mmType
	 * Adjustment7.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdjustmentType1Choice#mmType
	 * AdjustmentType1Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdjustmentType1Choice#mmOtherAdjustmentType
	 * AdjustmentType1Choice.mmOtherAdjustmentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of adjustment applied to the amount of goods/services by means of a code."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Adjustment4.mmType, Adjustment4.mmOtherAdjustmentType, Adjustment3.mmType, Adjustment3.mmOtherAdjustmentType, Adjustment6.mmType, Adjustment7.mmType, AdjustmentType1Choice.mmType,
					AdjustmentType1Choice.mmOtherAdjustmentType);
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of adjustment applied to the amount of goods/services by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdjustmentTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Adjustment.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CollateralManagement collateralManagement;
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmFeesAndCommissions
	 * CollateralManagement.mmFeesAndCommissions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCollateralManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmFeesAndCommissions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};
	protected Balance adjustedBalance;
	/**
	 * Balance for which adjustments are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAdjustment
	 * Balance.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance for which adjustments are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdjustedBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdjustedBalance";
			definition = "Balance for which adjustments are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.mmAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ChargePartyRole> chargesPartyRole;
	/**
	 * Role played by a party in the context of charges due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChargePartyRole#mmAdjustment
	 * ChargePartyRole.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ChargePartyRole
	 * ChargePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in the context of charges due."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmChargesPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargesPartyRole";
			definition = "Role played by a party in the context of charges due.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ChargePartyRole.mmAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ChargePartyRole.mmObject();
		}
	};
	protected DateTimePeriod effectivePeriod;
	/**
	 * Period during which the adjustment is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAdjustment
	 * DateTimePeriod.mmRelatedAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the adjustment is applicable."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEffectivePeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the adjustment is applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected CurrencyExchange currencyExchange;
	/**
	 * Currency exchange for which adjustments such as fees or commissions are
	 * applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmAdjustment
	 * CurrencyExchange.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency exchange for which adjustments such as fees or commissions are applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Currency exchange for which adjustments such as fees or commissions are applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * Order for which adjustments are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmAdjustments
	 * SecuritiesOrder.mmAdjustments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which adjustments are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which adjustments are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmAdjustments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected Tax tax;
	/**
	 * Information on the calculation method resulting in the tax amount
	 * included in the charge transfer. The tax is expressed as a fixed amount,
	 * or as a percentage of the charge amount, upon which the tax is applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAdjustment
	 * Tax.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation3#mmTax
	 * ChargesInformation3.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesInformation6#mmTax
	 * ChargesInformation6.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord1#mmTax
	 * ChargesRecord1.mmTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ChargesRecord2#mmTax
	 * ChargesRecord2.mmTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the calculation method resulting in the tax amount included in the charge transfer. The tax is expressed as a fixed amount, or as a percentage of the charge amount, upon which the tax is applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ChargesInformation3.mmTax, ChargesInformation6.mmTax, ChargesRecord1.mmTax, ChargesRecord2.mmTax);
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Information on the calculation method resulting in the tax amount included in the charge transfer. The tax is expressed as a fixed amount, or as a percentage of the charge amount, upon which the tax is applied.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Adjustment";
				definition = "Modification on the value of goods and / or services. For example: rebate, discount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmRelatedAdjustment, com.tools20022.repository.entity.Tax.mmAdjustment, com.tools20022.repository.entity.Payment.mmAdjustments,
						com.tools20022.repository.entity.Balance.mmAdjustment, com.tools20022.repository.entity.Price.mmPriceAdjustment, com.tools20022.repository.entity.CurrencyExchange.mmAdjustment,
						com.tools20022.repository.entity.SecuritiesOrder.mmAdjustments, com.tools20022.repository.entity.ChargePartyRole.mmAdjustment, com.tools20022.repository.entity.LineItem.mmFinancialAdjustment,
						com.tools20022.repository.entity.CollateralManagement.mmFeesAndCommissions);
				derivationElement_lazy = () -> Arrays.asList(RemittanceAmount3.mmAdjustmentAmountAndReason);
				subType_lazy = () -> Arrays.asList(Commission.mmObject(), Charges.mmObject(), Discount.mmObject(), Allowance.mmObject(), Penalty.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Adjustment.mmAmount, com.tools20022.repository.entity.Adjustment.mmChargeRate, com.tools20022.repository.entity.Adjustment.mmCalculationMethod,
						com.tools20022.repository.entity.Adjustment.mmPayment, com.tools20022.repository.entity.Adjustment.mmDirection, com.tools20022.repository.entity.Adjustment.mmReason,
						com.tools20022.repository.entity.Adjustment.mmRelatedLineItem, com.tools20022.repository.entity.Adjustment.mmAllowanceChargeIndicator, com.tools20022.repository.entity.Adjustment.mmPrice,
						com.tools20022.repository.entity.Adjustment.mmChargeIndicator, com.tools20022.repository.entity.Adjustment.mmType, com.tools20022.repository.entity.Adjustment.mmCollateralManagement,
						com.tools20022.repository.entity.Adjustment.mmAdjustedBalance, com.tools20022.repository.entity.Adjustment.mmChargesPartyRole, com.tools20022.repository.entity.Adjustment.mmEffectivePeriod,
						com.tools20022.repository.entity.Adjustment.mmCurrencyExchange, com.tools20022.repository.entity.Adjustment.mmSecuritiesOrder, com.tools20022.repository.entity.Adjustment.mmTax);
				derivationComponent_lazy = () -> Arrays.asList(ChargeTaxBasisType1Choice.mmObject(), DocumentAdjustment1.mmObject(), Adjustment5.mmObject(), DiscountOrChargeType1Choice.mmObject(), DocumentAdjustment2.mmObject(),
						LineItemAllowanceCharge1.mmObject(), Adjustment4.mmObject(), Adjustment3.mmObject(), Adjustment6.mmObject(), Adjustment7.mmObject(), AdjustmentType1Choice.mmObject(), ChargeBasisType1Choice.mmObject(),
						LineItemAllowanceCharge2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Adjustment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public PercentageRate getChargeRate() {
		return chargeRate;
	}

	public void setChargeRate(PercentageRate chargeRate) {
		this.chargeRate = chargeRate;
	}

	public TaxationBasisCode getCalculationMethod() {
		return calculationMethod;
	}

	public void setCalculationMethod(TaxationBasisCode calculationMethod) {
		this.calculationMethod = calculationMethod;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<com.tools20022.repository.entity.Payment> payment) {
		this.payment = payment;
	}

	public AdjustmentDirectionCode getDirection() {
		return direction;
	}

	public void setDirection(AdjustmentDirectionCode direction) {
		this.direction = direction;
	}

	public Max4AlphaNumericText getReason() {
		return reason;
	}

	public void setReason(Max4AlphaNumericText reason) {
		this.reason = reason;
	}

	public LineItem getRelatedLineItem() {
		return relatedLineItem;
	}

	public void setRelatedLineItem(com.tools20022.repository.entity.LineItem relatedLineItem) {
		this.relatedLineItem = relatedLineItem;
	}

	public YesNoIndicator getAllowanceChargeIndicator() {
		return allowanceChargeIndicator;
	}

	public void setAllowanceChargeIndicator(YesNoIndicator allowanceChargeIndicator) {
		this.allowanceChargeIndicator = allowanceChargeIndicator;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.entity.Price price) {
		this.price = price;
	}

	public YesNoIndicator getChargeIndicator() {
		return chargeIndicator;
	}

	public void setChargeIndicator(YesNoIndicator chargeIndicator) {
		this.chargeIndicator = chargeIndicator;
	}

	public AdjustmentTypeCode getType() {
		return type;
	}

	public void setType(AdjustmentTypeCode type) {
		this.type = type;
	}

	public CollateralManagement getCollateralManagement() {
		return collateralManagement;
	}

	public void setCollateralManagement(com.tools20022.repository.entity.CollateralManagement collateralManagement) {
		this.collateralManagement = collateralManagement;
	}

	public Balance getAdjustedBalance() {
		return adjustedBalance;
	}

	public void setAdjustedBalance(com.tools20022.repository.entity.Balance adjustedBalance) {
		this.adjustedBalance = adjustedBalance;
	}

	public List<ChargePartyRole> getChargesPartyRole() {
		return chargesPartyRole;
	}

	public void setChargesPartyRole(List<com.tools20022.repository.entity.ChargePartyRole> chargesPartyRole) {
		this.chargesPartyRole = chargesPartyRole;
	}

	public DateTimePeriod getEffectivePeriod() {
		return effectivePeriod;
	}

	public void setEffectivePeriod(com.tools20022.repository.entity.DateTimePeriod effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
	}

	public CurrencyExchange getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(com.tools20022.repository.entity.CurrencyExchange currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return securitiesOrder;
	}

	public void setSecuritiesOrder(com.tools20022.repository.entity.SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = securitiesOrder;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(com.tools20022.repository.entity.Tax tax) {
		this.tax = tax;
	}
}
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
import com.tools20022.repository.choice.TaxCalculationBasisType1Choice;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Tax related to an investment fund order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundTax" src="doc-files/InvestmentFundTax.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmFiscalExemption
 * InvestmentFundTax.mmFiscalExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmInvestmentAccount
 * InvestmentFundTax.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmPercentageOfDebtClaim
 * InvestmentFundTax.mmPercentageOfDebtClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmPercentageGrandfatheredDebt
 * InvestmentFundTax.mmPercentageGrandfatheredDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmExemptionIndicator
 * InvestmentFundTax.mmExemptionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmTransaction
 * InvestmentFundTax.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTax
 * InvestmentAccount.mmInvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionTax
 * InvestmentFundTransaction.mmTransactionTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax8#mmTaxCalculationDetails
 * Tax8.mmTaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax17#mmTaxCalculationDetails
 * Tax17.mmTaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation2#mmTaxDetails
 * DeliverInformation2.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation4#mmTaxDetails
 * DeliverInformation4.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#mmTaxDetails
 * DeliverInformation7.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation2#mmTaxDetails
 * ReceiveInformation2.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4#mmTaxDetails
 * ReceiveInformation4.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#mmTaxDetails
 * ReceiveInformation8.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#mmTaxDetails
 * ReceiveInformation6.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#mmTaxDetails
 * ReceiveInformation11.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#mmTaxDetails
 * DeliverInformation11.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation3#mmTaxDetails
 * DeliverInformation3.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#mmTaxDetails
 * DeliverInformation8.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3#mmTaxDetails
 * ReceiveInformation3.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#mmTaxDetails
 * ReceiveInformation7.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#mmTaxDetails
 * ReceiveInformation5.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmTaxDetails
 * ReceiveInformation9.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#mmTaxDetails
 * DeliverInformation5.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmTaxDetails
 * DeliverInformation9.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#mmTaxDetails
 * DeliverInformation6.mmTaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmTaxCalculationDetails
 * Tax6.mmTaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax16#mmTaxCalculationDetails
 * Tax16.mmTaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax7#mmTaxCalculationDetails
 * Tax7.mmTaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes2#mmTaxDetails
 * TotalTaxes2.mmTaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax14#mmTaxCalculationDetails
 * Tax14.mmTaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes3#mmTaxDetails
 * TotalTaxes3.mmTaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax18#mmEUCapitalGainType
 * Tax18.mmEUCapitalGainType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax18#mmTaxCalculationDetails
 * Tax18.mmTaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes4#mmTaxDetails
 * TotalTaxes4.mmTaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax19#mmEUCapitalGainType
 * Tax19.mmEUCapitalGainType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes5#mmTaxDetails
 * TotalTaxes5.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmTaxDetails
 * ReceiveInformation13.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#mmTaxDetails
 * ReceiveInformation12.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#mmTaxDetails
 * DeliverInformation12.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmTaxDetails
 * DeliverInformation13.mmTaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax21#mmTaxCalculationDetails
 * Tax21.mmTaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmTaxDetails
 * DeliverInformation15.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#mmTaxDetails
 * DeliverInformation14.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmTaxDetails
 * ReceiveInformation15.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#mmTaxDetails
 * ReceiveInformation14.mmTaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax25#mmTaxCalculationDetails
 * Tax25.mmTaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmTaxDetails
 * ReceiveInformation17.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmTaxDetails
 * ReceiveInformation16.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmTaxDetails
 * DeliverInformation16.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmTaxDetails
 * DeliverInformation17.mmTaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax28#mmTaxCalculationDetails
 * Tax28.mmTaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmTaxExemption
 * InvestmentAccountOwnershipInformation12.mmTaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmTaxExemption
 * InvestmentAccountOwnershipInformation13.mmTaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmTransactionOverhead
 * RedemptionOrder14.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmTransactionOverhead
 * SwitchSubscriptionLegOrder6.mmTransactionOverhead}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FeeAndTax1#mmIndividualTax
 * FeeAndTax1.mmIndividualTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InformativeTax1#mmIndividualTax
 * InformativeTax1.mmIndividualTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmTaxCalculationDetails
 * Tax32.mmTaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmTransactionOverhead
 * SubscriptionExecution13.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmTotalTaxes
 * TotalFeesAndTaxes40.mmTotalTaxes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmIndividualTax
 * TotalFeesAndTaxes40.mmIndividualTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmTransactionOverhead
 * SubscriptionExecution12.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmTransactionOverhead
 * SubscriptionOrder15.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmTaxExemption
 * InvestmentAccountOwnershipInformation15.mmTaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmTransactionOverhead
 * SwitchRedemptionLegOrder6.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmTransactionOverhead
 * RedemptionOrder15.mmTransactionOverhead}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmTaxCalculationDetails
 * Tax30.mmTaxCalculationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmTaxCalculationDetails
 * Tax31.mmTaxCalculationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmTransactionOverhead
 * RedemptionExecution16.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmTaxExemption
 * InvestmentAccountOwnershipInformation14.mmTaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmTransactionOverhead
 * SubscriptionOrder14.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmTransactionOverhead
 * SwitchSubscriptionLegExecution4.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmTransactionOverhead
 * RedemptionExecution15.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmTransactionOverhead
 * SwitchRedemptionLegExecution4.mmTransactionOverhead}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTax
 * SecuritiesTax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation2
 * TaxCalculationInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax8 Tax8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation4
 * TaxCalculationInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax17 Tax17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax15 Tax15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation1
 * TaxCalculationInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax6 Tax6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation5
 * TaxCalculationInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax16 Tax16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation3
 * TaxCalculationInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax7 Tax7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes2 TotalTaxes2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation6
 * TaxCalculationInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax14 Tax14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes3 TotalTaxes3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxCalculationBasisType1Choice
 * TaxCalculationBasisType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation7
 * TaxCalculationInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax18 Tax18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes4 TotalTaxes4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax19 Tax19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax20 Tax20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes5 TotalTaxes5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax21 Tax21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation8
 * TaxCalculationInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax25 Tax25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax28 Tax28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FeeAndTax1 FeeAndTax1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax32 Tax32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40
 * TotalFeesAndTaxes40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax30 Tax30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation9
 * TaxCalculationInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax31 Tax31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculationInformation10
 * TaxCalculationInformation10}</li>
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
 * "InvestmentFundTax"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tax related to an investment fund order."</li>
 * </ul>
 */
public class InvestmentFundTax extends SecuritiesTax {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator fiscalExemption;
	/**
	 * Indicates whether an owner of an investment account may benefit from a
	 * fiscal exemption or amnesty for instance for declaring overseas
	 * investments.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation5.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation2.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation6.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation3.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation4.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation7.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation8.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation9.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation10.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation11.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation12.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation13.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation15.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation14.mmFiscalExemption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalExemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an owner of an investment account may benefit from a fiscal exemption or amnesty for instance for declaring overseas investments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFiscalExemption = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation5.mmFiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2.mmFiscalExemption,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.mmFiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmFiscalExemption,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4.mmFiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmFiscalExemption,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8.mmFiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9.mmFiscalExemption,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmFiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.mmFiscalExemption,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmFiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.mmFiscalExemption,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmFiscalExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmFiscalExemption);
			elementContext_lazy = () -> InvestmentFundTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FiscalExemption";
			definition = "Indicates whether an owner of an investment account may benefit from a fiscal exemption or amnesty for instance for declaring overseas investments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected InvestmentAccount investmentAccount;
	/**
	 * Investment account for which taxes are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTax
	 * InvestmentAccount.mmInvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment account for which taxes are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Investment account for which taxes are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected PercentageRate percentageOfDebtClaim;
	/**
	 * Percentage of the underlying assets of the funds that represents a debt
	 * and is in the scope of the European directive on taxation of savings
	 * income in the form of interest payments (Council Directive 2003/48/EC 3
	 * June).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation2#mmPercentageOfDebtClaim
	 * TaxCalculationInformation2.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmPercentageOfDebtClaim
	 * TaxCalculationInformation4.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmPercentageOfDebtClaim
	 * TotalTaxes3.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes4#mmPercentageOfDebtClaim
	 * TotalTaxes4.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes5#mmPercentageOfDebtClaim
	 * TotalTaxes5.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformativeTax1#mmPercentageOfDebtClaim
	 * InformativeTax1.mmPercentageOfDebtClaim}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfDebtClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the underlying assets of the funds that represents a debt and is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPercentageOfDebtClaim = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculationInformation2.mmPercentageOfDebtClaim, com.tools20022.repository.msg.TaxCalculationInformation4.mmPercentageOfDebtClaim,
					com.tools20022.repository.msg.TotalTaxes3.mmPercentageOfDebtClaim, com.tools20022.repository.msg.TotalTaxes4.mmPercentageOfDebtClaim, com.tools20022.repository.msg.TotalTaxes5.mmPercentageOfDebtClaim,
					com.tools20022.repository.msg.InformativeTax1.mmPercentageOfDebtClaim);
			elementContext_lazy = () -> InvestmentFundTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of the funds that represents a debt and is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate percentageGrandfatheredDebt;
	/**
	 * Percentage of grandfathered debt claim.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation2#mmPercentageGrandfatheredDebt
	 * TaxCalculationInformation2.mmPercentageGrandfatheredDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmPercentageGrandfatheredDebt
	 * TaxCalculationInformation4.mmPercentageGrandfatheredDebt}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageGrandfatheredDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of grandfathered debt claim."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPercentageGrandfatheredDebt = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculationInformation2.mmPercentageGrandfatheredDebt, com.tools20022.repository.msg.TaxCalculationInformation4.mmPercentageGrandfatheredDebt);
			elementContext_lazy = () -> InvestmentFundTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageGrandfatheredDebt";
			definition = "Percentage of grandfathered debt claim.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected YesNoIndicator exemptionIndicator;
	/**
	 * Indicates whether a tax exemption applies.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax3#mmExemptionIndicator
	 * Tax3.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmExemptionIndicator
	 * Tax15.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmExemptionIndicator
	 * Tax6.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax16#mmExemptionIndicator
	 * Tax16.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax7#mmExemptionIndicator
	 * Tax7.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax14#mmExemptionIndicator
	 * Tax14.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax18#mmExemptionIndicator
	 * Tax18.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax19#mmExemptionIndicator
	 * Tax19.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax20#mmExemptionIndicator
	 * Tax20.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax21#mmExemptionIndicator
	 * Tax21.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax25#mmExemptionIndicator
	 * Tax25.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax28#mmExemptionIndicator
	 * Tax28.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmExemptionIndicator
	 * Tax32.mmExemptionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmExemptionIndicator
	 * Tax30.mmExemptionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether a tax exemption applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExemptionIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax3.mmExemptionIndicator, com.tools20022.repository.msg.Tax15.mmExemptionIndicator, com.tools20022.repository.msg.Tax6.mmExemptionIndicator,
					com.tools20022.repository.msg.Tax16.mmExemptionIndicator, com.tools20022.repository.msg.Tax7.mmExemptionIndicator, com.tools20022.repository.msg.Tax14.mmExemptionIndicator,
					com.tools20022.repository.msg.Tax18.mmExemptionIndicator, com.tools20022.repository.msg.Tax19.mmExemptionIndicator, com.tools20022.repository.msg.Tax20.mmExemptionIndicator,
					com.tools20022.repository.msg.Tax21.mmExemptionIndicator, com.tools20022.repository.msg.Tax25.mmExemptionIndicator, com.tools20022.repository.msg.Tax28.mmExemptionIndicator,
					com.tools20022.repository.msg.Tax32.mmExemptionIndicator, com.tools20022.repository.msg.Tax30.mmExemptionIndicator);
			elementContext_lazy = () -> InvestmentFundTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExemptionIndicator";
			definition = "Indicates whether a tax exemption applies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected InvestmentFundTransaction transaction;
	/**
	 * Transaction for which the tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionTax
	 * InvestmentFundTransaction.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
	 * InvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction for which the tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transaction";
			definition = "Transaction for which the tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTax";
				definition = "Tax related to an investment fund order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.mmInvestmentFundTax, com.tools20022.repository.entity.InvestmentFundTransaction.mmTransactionTax);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax8.mmTaxCalculationDetails, com.tools20022.repository.msg.Tax17.mmTaxCalculationDetails,
						com.tools20022.repository.msg.DeliverInformation2.mmTaxDetails, com.tools20022.repository.msg.DeliverInformation4.mmTaxDetails, com.tools20022.repository.msg.DeliverInformation7.mmTaxDetails,
						com.tools20022.repository.msg.ReceiveInformation2.mmTaxDetails, com.tools20022.repository.msg.ReceiveInformation4.mmTaxDetails, com.tools20022.repository.msg.ReceiveInformation8.mmTaxDetails,
						com.tools20022.repository.msg.ReceiveInformation6.mmTaxDetails, com.tools20022.repository.msg.ReceiveInformation11.mmTaxDetails, com.tools20022.repository.msg.DeliverInformation11.mmTaxDetails,
						com.tools20022.repository.msg.DeliverInformation3.mmTaxDetails, com.tools20022.repository.msg.DeliverInformation8.mmTaxDetails, com.tools20022.repository.msg.ReceiveInformation3.mmTaxDetails,
						com.tools20022.repository.msg.ReceiveInformation7.mmTaxDetails, com.tools20022.repository.msg.ReceiveInformation5.mmTaxDetails, com.tools20022.repository.msg.ReceiveInformation9.mmTaxDetails,
						com.tools20022.repository.msg.DeliverInformation5.mmTaxDetails, com.tools20022.repository.msg.DeliverInformation9.mmTaxDetails, com.tools20022.repository.msg.DeliverInformation6.mmTaxDetails,
						com.tools20022.repository.msg.Tax6.mmTaxCalculationDetails, com.tools20022.repository.msg.Tax16.mmTaxCalculationDetails, com.tools20022.repository.msg.Tax7.mmTaxCalculationDetails,
						com.tools20022.repository.msg.TotalTaxes2.mmTaxDetails, com.tools20022.repository.msg.Tax14.mmTaxCalculationDetails, com.tools20022.repository.msg.TotalTaxes3.mmTaxDetails,
						com.tools20022.repository.msg.Tax18.mmEUCapitalGainType, com.tools20022.repository.msg.Tax18.mmTaxCalculationDetails, com.tools20022.repository.msg.TotalTaxes4.mmTaxDetails,
						com.tools20022.repository.msg.Tax19.mmEUCapitalGainType, com.tools20022.repository.msg.TotalTaxes5.mmTaxDetails, com.tools20022.repository.msg.ReceiveInformation13.mmTaxDetails,
						com.tools20022.repository.msg.ReceiveInformation12.mmTaxDetails, com.tools20022.repository.msg.DeliverInformation12.mmTaxDetails, com.tools20022.repository.msg.DeliverInformation13.mmTaxDetails,
						com.tools20022.repository.msg.Tax21.mmTaxCalculationDetails, com.tools20022.repository.msg.DeliverInformation15.mmTaxDetails, com.tools20022.repository.msg.DeliverInformation14.mmTaxDetails,
						com.tools20022.repository.msg.ReceiveInformation15.mmTaxDetails, com.tools20022.repository.msg.ReceiveInformation14.mmTaxDetails, com.tools20022.repository.msg.Tax25.mmTaxCalculationDetails,
						com.tools20022.repository.msg.ReceiveInformation17.mmTaxDetails, com.tools20022.repository.msg.ReceiveInformation16.mmTaxDetails, com.tools20022.repository.msg.DeliverInformation16.mmTaxDetails,
						com.tools20022.repository.msg.DeliverInformation17.mmTaxDetails, com.tools20022.repository.msg.Tax28.mmTaxCalculationDetails, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmTaxExemption,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.mmTaxExemption, com.tools20022.repository.msg.RedemptionOrder14.mmTransactionOverhead,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.mmTransactionOverhead, com.tools20022.repository.msg.FeeAndTax1.mmIndividualTax, com.tools20022.repository.msg.InformativeTax1.mmIndividualTax,
						com.tools20022.repository.msg.Tax32.mmTaxCalculationDetails, com.tools20022.repository.msg.SubscriptionExecution13.mmTransactionOverhead, com.tools20022.repository.msg.TotalFeesAndTaxes40.mmTotalTaxes,
						com.tools20022.repository.msg.TotalFeesAndTaxes40.mmIndividualTax, com.tools20022.repository.msg.SubscriptionExecution12.mmTransactionOverhead,
						com.tools20022.repository.msg.SubscriptionOrder15.mmTransactionOverhead, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmTaxExemption,
						com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmTransactionOverhead, com.tools20022.repository.msg.RedemptionOrder15.mmTransactionOverhead, com.tools20022.repository.msg.Tax30.mmTaxCalculationDetails,
						com.tools20022.repository.msg.Tax31.mmTaxCalculationDetails, com.tools20022.repository.msg.RedemptionExecution16.mmTransactionOverhead,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmTaxExemption, com.tools20022.repository.msg.SubscriptionOrder14.mmTransactionOverhead,
						com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.mmTransactionOverhead, com.tools20022.repository.msg.RedemptionExecution15.mmTransactionOverhead,
						com.tools20022.repository.msg.SwitchRedemptionLegExecution4.mmTransactionOverhead);
				superType_lazy = () -> SecuritiesTax.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundTax.mmFiscalExemption, com.tools20022.repository.entity.InvestmentFundTax.mmInvestmentAccount,
						com.tools20022.repository.entity.InvestmentFundTax.mmPercentageOfDebtClaim, com.tools20022.repository.entity.InvestmentFundTax.mmPercentageGrandfatheredDebt,
						com.tools20022.repository.entity.InvestmentFundTax.mmExemptionIndicator, com.tools20022.repository.entity.InvestmentFundTax.mmTransaction);
				derivationComponent_lazy = () -> Arrays.asList(TaxCalculationInformation2.mmObject(), Tax8.mmObject(), TaxCalculationInformation4.mmObject(), Tax17.mmObject(), Tax15.mmObject(), TaxCalculationInformation1.mmObject(),
						Tax6.mmObject(), TaxCalculationInformation5.mmObject(), Tax16.mmObject(), TaxCalculationInformation3.mmObject(), Tax7.mmObject(), TotalTaxes2.mmObject(), TaxCalculationInformation6.mmObject(), Tax14.mmObject(),
						TotalTaxes3.mmObject(), TaxCalculationBasisType1Choice.mmObject(), TaxCalculationInformation7.mmObject(), Tax18.mmObject(), TotalTaxes4.mmObject(), Tax19.mmObject(), Tax20.mmObject(), TotalTaxes5.mmObject(),
						Tax21.mmObject(), TaxCalculationInformation8.mmObject(), Tax25.mmObject(), Tax28.mmObject(), FeeAndTax1.mmObject(), Tax32.mmObject(), TotalFeesAndTaxes40.mmObject(), Tax30.mmObject(),
						TaxCalculationInformation9.mmObject(), Tax31.mmObject(), TaxCalculationInformation10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getFiscalExemption() {
		return fiscalExemption;
	}

	public void setFiscalExemption(YesNoIndicator fiscalExemption) {
		this.fiscalExemption = fiscalExemption;
	}

	public InvestmentAccount getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(com.tools20022.repository.entity.InvestmentAccount investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public PercentageRate getPercentageOfDebtClaim() {
		return percentageOfDebtClaim;
	}

	public void setPercentageOfDebtClaim(PercentageRate percentageOfDebtClaim) {
		this.percentageOfDebtClaim = percentageOfDebtClaim;
	}

	public PercentageRate getPercentageGrandfatheredDebt() {
		return percentageGrandfatheredDebt;
	}

	public void setPercentageGrandfatheredDebt(PercentageRate percentageGrandfatheredDebt) {
		this.percentageGrandfatheredDebt = percentageGrandfatheredDebt;
	}

	public YesNoIndicator getExemptionIndicator() {
		return exemptionIndicator;
	}

	public void setExemptionIndicator(YesNoIndicator exemptionIndicator) {
		this.exemptionIndicator = exemptionIndicator;
	}

	public InvestmentFundTransaction getTransaction() {
		return transaction;
	}

	public void setTransaction(com.tools20022.repository.entity.InvestmentFundTransaction transaction) {
		this.transaction = transaction;
	}
}
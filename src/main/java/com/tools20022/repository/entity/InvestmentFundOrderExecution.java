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
import com.tools20022.repository.codeset.BestExecutionCode;
import com.tools20022.repository.codeset.LateReportCode;
import com.tools20022.repository.codeset.SourceOfCashCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Creation/cancellation of investment units on the books of the fund or its
 * designated agent, as a result of executing an investment fund order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundOrderExecution"
 * src="doc-files/InvestmentFundOrderExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmOrder
 * InvestmentFundOrderExecution.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmDealIdentification
 * InvestmentFundOrderExecution.mmDealIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartiallyExecutedIndicator
 * InvestmentFundOrderExecution.mmPartiallyExecutedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInterimProfitAmount
 * InvestmentFundOrderExecution.mmInterimProfitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInformativePrice
 * InvestmentFundOrderExecution.mmInformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmBestExecution
 * InvestmentFundOrderExecution.mmBestExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartialSettlementOfUnits
 * InvestmentFundOrderExecution.mmPartialSettlementOfUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartialSettlementOfCash
 * InvestmentFundOrderExecution.mmPartialSettlementOfCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmLateReport
 * InvestmentFundOrderExecution.mmLateReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmSettledIndicator
 * InvestmentFundOrderExecution.mmSettledIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmRegisteredIndicator
 * InvestmentFundOrderExecution.mmRegisteredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedAmount
 * InvestmentFundOrderExecution.mmExecutedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInvestmentFundTransaction
 * InvestmentFundOrderExecution.mmInvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmCashFlow
 * InvestmentFundOrderExecution.mmCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmSourceOfCash
 * InvestmentFundOrderExecution.mmSourceOfCash}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SubscriptionExecution
 * SubscriptionExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionExecution
 * RedemptionExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchExecution
 * SwitchExecution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToExecutedPrice
 * SecuritiesPricing.mmFundOrderRelatedToExecutedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToInformativePrice
 * SecuritiesPricing.mmFundOrderRelatedToInformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderExecution
 * SecuritiesQuantity.mmRelatedOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrderExecution
 * InvestmentFundTransaction.mmInvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmRelatedOrder
 * FundsCashFlow.mmRelatedOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2#mmTransactionDetails
 * InvestmentFundTransactionsByFund2.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund3#mmTransactionDetails
 * InvestmentFundTransactionsByFund3.mmTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
 * SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails1
 * ExpectedExecutionDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails2
 * ExpectedExecutionDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution2
 * InvestmentFundOrderExecution2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1
 * InvestmentFundOrderExecution1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails3
 * ExpectedExecutionDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3
 * InvestmentFundOrderExecution3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitsAndCash UnitsAndCash}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedExecutionDetails4
 * ExpectedExecutionDetails4}</li>
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
 * "InvestmentFundOrderExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order."
 * </li>
 * </ul>
 */
public class InvestmentFundOrderExecution extends SecuritiesTradeExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesQuantity unitsNumber;
	/**
	 * Number of investment fund units subscribed or redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedOrderExecution
	 * SecuritiesQuantity.mmRelatedOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast2.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#mmPreviousEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast2.mmPreviousEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast4.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#mmPreviousTotalUnitsNumber
	 * EstimatedFundCashForecast4.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast1.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmPreviousEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast1.mmPreviousEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast3.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmPreviousTotalUnitsNumber
	 * EstimatedFundCashForecast3.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmUnitsNumber
	 * RedemptionExecution3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmUnitsNumber
	 * RedemptionExecution5.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmUnitsNumber
	 * RedemptionExecution4.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmUnitsNumber
	 * RedemptionExecution6.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmUnitsQuantity
	 * InvestmentFundTransaction2.mmUnitsQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmUnitsQuantity
	 * InvestmentFundTransaction3.mmUnitsQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmUnitsNumber
	 * SubscriptionExecution3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmUnitsNumber
	 * SubscriptionExecution5.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmUnitsNumber
	 * SubscriptionExecution4.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmUnitsNumber
	 * SubscriptionExecution6.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmUnitsNumber
	 * SwitchRedemptionLegExecution2.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmUnitsNumber
	 * SwitchSubscriptionLegExecution2.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmUnitsNumber
	 * SwitchRedemptionLegExecution3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmUnitsNumber
	 * SwitchSubscriptionLegExecution3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmUnitsNumber
	 * RedemptionExecution10.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice#mmUnitsNumber
	 * SidePocketUnitsOrAmountOrRate1Choice.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmUnitsNumber
	 * SubscriptionExecution7.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmUnitsNumber
	 * RedemptionExecution12.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmUnitsNumber
	 * SubscriptionExecution9.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash#mmGroup1Number
	 * UnitsAndCash.mmGroup1Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash#mmGroup2Number
	 * UnitsAndCash.mmGroup2Number}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmTotalUnitsNumber
	 * Fund2.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund2#mmPreviousTotalUnitsNumber
	 * Fund2.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast6.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPreviousTotalUnitsNumber
	 * EstimatedFundCashForecast6.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedTotalUnitsNumber
	 * Fund1.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmPreviousTotalUnitsNumber
	 * Fund1.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedTotalUnitsNumber
	 * EstimatedFundCashForecast5.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPreviousTotalUnitsNumber
	 * EstimatedFundCashForecast5.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalUnitsFromUnitOrders
	 * FundBalance1.mmTotalUnitsFromUnitOrders}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalUnitsFromCashOrders
	 * FundBalance1.mmTotalUnitsFromCashOrders}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmUnitsQuantity
	 * InvestmentFundTransaction4.mmUnitsQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#mmEstimatedTotalUnitsNumber
	 * Fund3.mmEstimatedTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#mmPreviousTotalUnitsNumber
	 * Fund3.mmPreviousTotalUnitsNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund4#mmTotalUnitsNumber
	 * Fund4.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund4#mmPreviousTotalUnitsNumber
	 * Fund4.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmUnitsNumber
	 * SubscriptionExecution13.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmUnitsNumber
	 * SubscriptionExecution12.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmUnitsNumber
	 * RedemptionExecution16.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmUnitsNumber
	 * SwitchSubscriptionLegExecution4.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmUnitsNumber
	 * RedemptionExecution15.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmUnitsNumber
	 * SwitchRedemptionLegExecution4.mmUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of investment fund units subscribed or redeemed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUnitsNumber = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EstimatedFundCashForecast2.mmEstimatedTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast2.mmPreviousEstimatedTotalUnitsNumber,
					com.tools20022.repository.msg.EstimatedFundCashForecast4.mmEstimatedTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast4.mmPreviousTotalUnitsNumber,
					com.tools20022.repository.msg.EstimatedFundCashForecast1.mmEstimatedTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast1.mmPreviousEstimatedTotalUnitsNumber,
					com.tools20022.repository.msg.EstimatedFundCashForecast3.mmEstimatedTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast3.mmPreviousTotalUnitsNumber,
					com.tools20022.repository.msg.RedemptionExecution3.mmUnitsNumber, com.tools20022.repository.msg.RedemptionExecution5.mmUnitsNumber, com.tools20022.repository.msg.RedemptionExecution4.mmUnitsNumber,
					com.tools20022.repository.msg.RedemptionExecution6.mmUnitsNumber, com.tools20022.repository.msg.InvestmentFundTransaction2.mmUnitsQuantity, com.tools20022.repository.msg.InvestmentFundTransaction3.mmUnitsQuantity,
					com.tools20022.repository.msg.SubscriptionExecution3.mmUnitsNumber, com.tools20022.repository.msg.SubscriptionExecution5.mmUnitsNumber, com.tools20022.repository.msg.SubscriptionExecution4.mmUnitsNumber,
					com.tools20022.repository.msg.SubscriptionExecution6.mmUnitsNumber, com.tools20022.repository.msg.SwitchRedemptionLegExecution2.mmUnitsNumber, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.mmUnitsNumber,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.mmUnitsNumber, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.mmUnitsNumber, com.tools20022.repository.msg.RedemptionExecution10.mmUnitsNumber,
					com.tools20022.repository.choice.SidePocketUnitsOrAmountOrRate1Choice.mmUnitsNumber, com.tools20022.repository.msg.SubscriptionExecution7.mmUnitsNumber, com.tools20022.repository.msg.RedemptionExecution12.mmUnitsNumber,
					com.tools20022.repository.msg.SubscriptionExecution9.mmUnitsNumber, com.tools20022.repository.msg.UnitsAndCash.mmGroup1Number, com.tools20022.repository.msg.UnitsAndCash.mmGroup2Number,
					com.tools20022.repository.msg.Fund2.mmTotalUnitsNumber, com.tools20022.repository.msg.Fund2.mmPreviousTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast6.mmEstimatedTotalUnitsNumber,
					com.tools20022.repository.msg.EstimatedFundCashForecast6.mmPreviousTotalUnitsNumber, com.tools20022.repository.msg.Fund1.mmEstimatedTotalUnitsNumber, com.tools20022.repository.msg.Fund1.mmPreviousTotalUnitsNumber,
					com.tools20022.repository.msg.EstimatedFundCashForecast5.mmEstimatedTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmPreviousTotalUnitsNumber,
					com.tools20022.repository.msg.FundBalance1.mmTotalUnitsFromUnitOrders, com.tools20022.repository.msg.FundBalance1.mmTotalUnitsFromCashOrders, com.tools20022.repository.msg.InvestmentFundTransaction4.mmUnitsQuantity,
					com.tools20022.repository.msg.Fund3.mmEstimatedTotalUnitsNumber, com.tools20022.repository.msg.Fund3.mmPreviousTotalUnitsNumber, com.tools20022.repository.msg.Fund4.mmTotalUnitsNumber,
					com.tools20022.repository.msg.Fund4.mmPreviousTotalUnitsNumber, com.tools20022.repository.msg.SubscriptionExecution13.mmUnitsNumber, com.tools20022.repository.msg.SubscriptionExecution12.mmUnitsNumber,
					com.tools20022.repository.msg.RedemptionExecution16.mmUnitsNumber, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.mmUnitsNumber, com.tools20022.repository.msg.RedemptionExecution15.mmUnitsNumber,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.mmUnitsNumber);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitsNumber";
			definition = "Number of investment fund units subscribed or redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected Max350Text nonStandardSettlementInformation;
	/**
	 * Additional specific settlement information for non-regulated traded
	 * funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer7#mmNonStandardSettlementInformation
	 * Transfer7.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer17#mmNonStandardSettlementInformation
	 * Transfer17.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer10#mmNonStandardSettlementInformation
	 * Transfer10.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer14#mmNonStandardSettlementInformation
	 * Transfer14.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer24#mmNonStandardSettlementInformation
	 * Transfer24.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer25#mmNonStandardSettlementInformation
	 * Transfer25.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer6#mmNonStandardSettlementInformation
	 * Transfer6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer16#mmNonStandardSettlementInformation
	 * Transfer16.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer9#mmNonStandardSettlementInformation
	 * Transfer9.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer12#mmNonStandardSettlementInformation
	 * Transfer12.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer20#mmNonStandardSettlementInformation
	 * Transfer20.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer22#mmNonStandardSettlementInformation
	 * Transfer22.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#mmNonStandardSettlementInformation
	 * Transfer18.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#mmNonStandardSettlementInformation
	 * Transfer26.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer5#mmNonStandardSettlementInformation
	 * Transfer5.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer15#mmNonStandardSettlementInformation
	 * Transfer15.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer21#mmNonStandardSettlementInformation
	 * Transfer21.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#mmNonStandardSettlementInformation
	 * Transfer13.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#mmNonStandardSettlementInformation
	 * Transfer23.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer8#mmNonStandardSettlementInformation
	 * Transfer8.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#mmNonStandardSettlementInformation
	 * Transfer11.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#mmNonStandardSettlementInformation
	 * Transfer19.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmNonStandardSettlementInformation
	 * RedemptionOrder5.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmNonStandardSettlementInformation
	 * RedemptionExecution5.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmNonStandardSettlementInformation
	 * RedemptionOrder7.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmNonStandardSettlementInformation
	 * RedemptionOrder6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmNonStandardSettlementInformation
	 * RedemptionExecution6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmNonStandardSettlementInformation
	 * RedemptionOrder8.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmNonStandardSettlementInformation
	 * SubscriptionOrder5.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmNonStandardSettlementInformation
	 * SubscriptionExecution5.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmNonStandardSettlementInformation
	 * SubscriptionOrder7.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmNonStandardSettlementInformation
	 * SubscriptionOrder6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmNonStandardSettlementInformation
	 * SubscriptionExecution6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmNonStandardSettlementInformation
	 * SubscriptionOrder8.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3#mmNonStandardSettlementInformation
	 * SwitchRedemptionLegOrder3.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmNonStandardSettlementInformation
	 * SwitchSubscriptionLegOrder3.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmNonStandardSettlementInformation
	 * SwitchRedemptionLegExecution3.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmNonStandardSettlementInformation
	 * SwitchSubscriptionLegExecution3.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#mmNonStandardSettlementInformation
	 * Transfer27.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmNonStandardSettlementInformation
	 * Transfer28.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmNonStandardSettlementInformation
	 * Transfer29.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmNonStandardSettlementInformation
	 * Transfer31.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmNonStandardSettlementInformation
	 * Transfer30.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer32#mmNonStandardSettlementInformation
	 * Transfer32.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmNonStandardSettlementInformation
	 * Transfer33.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmNonStandardSettlementInformation
	 * RedemptionOrder14.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmNonStandardSettlementInformation
	 * SwitchSubscriptionLegOrder6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmNonStandardSettlementInformation
	 * SubscriptionExecution13.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmNonStandardSettlementInformation
	 * SubscriptionExecution12.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmNonStandardSettlementInformation
	 * SubscriptionOrder15.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmNonStandardSettlementInformation
	 * SwitchRedemptionLegOrder6.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmNonStandardSettlementInformation
	 * RedemptionOrder15.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmNonStandardSettlementInformation
	 * RedemptionExecution16.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmNonStandardSettlementInformation
	 * SubscriptionOrder14.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmNonStandardSettlementInformation
	 * SwitchSubscriptionLegExecution4.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmNonStandardSettlementInformation
	 * RedemptionExecution15.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmNonStandardSettlementInformation
	 * SwitchRedemptionLegExecution4.mmNonStandardSettlementInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional specific settlement information for non-regulated traded funds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNonStandardSettlementInformation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer7.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer17.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer10.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer14.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer24.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer25.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer6.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer16.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer9.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer12.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer20.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer22.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer18.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer26.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer5.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer15.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer21.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer13.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer23.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer8.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer11.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer19.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.RedemptionOrder5.mmNonStandardSettlementInformation, com.tools20022.repository.msg.RedemptionExecution5.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.RedemptionOrder7.mmNonStandardSettlementInformation, com.tools20022.repository.msg.RedemptionOrder6.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.RedemptionExecution6.mmNonStandardSettlementInformation, com.tools20022.repository.msg.RedemptionOrder8.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.SubscriptionOrder5.mmNonStandardSettlementInformation, com.tools20022.repository.msg.SubscriptionExecution5.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.SubscriptionOrder7.mmNonStandardSettlementInformation, com.tools20022.repository.msg.SubscriptionOrder6.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.SubscriptionExecution6.mmNonStandardSettlementInformation, com.tools20022.repository.msg.SubscriptionOrder8.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder3.mmNonStandardSettlementInformation, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.mmNonStandardSettlementInformation, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer27.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer28.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer29.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer31.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer30.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer32.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.Transfer33.mmNonStandardSettlementInformation, com.tools20022.repository.msg.RedemptionOrder14.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.mmNonStandardSettlementInformation, com.tools20022.repository.msg.SubscriptionExecution13.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.SubscriptionExecution12.mmNonStandardSettlementInformation, com.tools20022.repository.msg.SubscriptionOrder15.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmNonStandardSettlementInformation, com.tools20022.repository.msg.RedemptionOrder15.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.RedemptionExecution16.mmNonStandardSettlementInformation, com.tools20022.repository.msg.SubscriptionOrder14.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.mmNonStandardSettlementInformation, com.tools20022.repository.msg.RedemptionExecution15.mmNonStandardSettlementInformation,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.mmNonStandardSettlementInformation);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected InvestmentFundOrder order;
	/**
	 * Order which is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmInvestmentFundOrderExecution
	 * InvestmentFundOrder.mmInvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
	 * InvestmentFundOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmTotalUnitsNumber
	 * FundCashForecast1.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmTotalUnitsNumber
	 * FundCashForecast3.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#mmTotalUnitsNumber
	 * FundCashForecast2.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmTotalUnitsNumber
	 * FundCashForecast4.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmTotalUnitsNumber
	 * FundCashForecast7.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmTotalUnitsNumber
	 * FundCashForecast6.mmTotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order which is executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashForecast1.mmTotalUnitsNumber, com.tools20022.repository.msg.FundCashForecast3.mmTotalUnitsNumber,
					com.tools20022.repository.msg.FundCashForecast2.mmTotalUnitsNumber, com.tools20022.repository.msg.FundCashForecast4.mmTotalUnitsNumber, com.tools20022.repository.msg.FundCashForecast7.mmTotalUnitsNumber,
					com.tools20022.repository.msg.FundCashForecast6.mmTotalUnitsNumber);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order which is executed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmInvestmentFundOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
		}
	};
	protected Max35Text dealIdentification;
	/**
	 * Unique and unambiguous identifier for an order execution, as assigned by
	 * a confirming party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1#mmDealReference
	 * SwitchOrderStatusAndReason1.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmDealReference
	 * RedemptionExecution3.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmDealReference
	 * RedemptionExecution5.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution2#mmDealReference
	 * InvestmentFundOrderExecution2.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmDealReference
	 * RedemptionExecution4.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmDealReference
	 * RedemptionExecution6.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder3#mmDealReference
	 * InvestmentFundOrder3.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#mmDealReference
	 * InvestmentFundOrder2.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmDealReference
	 * InvestmentFundTransaction2.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmDealReference
	 * InvestmentFundTransaction3.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmDealReference
	 * SubscriptionExecution3.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmDealReference
	 * SubscriptionExecution5.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmDealReference
	 * SubscriptionExecution4.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmDealReference
	 * SubscriptionExecution6.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmDealReference
	 * SwitchExecution3.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmDealReference
	 * SwitchExecution4.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LotDetails1#mmDealReference
	 * LotDetails1.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmDealReference
	 * RedemptionExecution10.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmDealReference
	 * SubscriptionExecution7.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#mmDealReference
	 * InvestmentFundOrderExecution3.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmDealReference
	 * RedemptionExecution12.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmDealReference
	 * SubscriptionExecution9.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmDealReference
	 * InvestmentFundTransaction4.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11#mmDealReference
	 * InvestmentFundOrder11.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmDealReference
	 * SwitchExecution7.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason2#mmDealReference
	 * SwitchOrderStatusAndReason2.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmDealReference
	 * SubscriptionExecution13.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmDealReference
	 * SubscriptionExecution12.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmDealReference
	 * RedemptionExecution16.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmDealReference
	 * InvestmentFundOrder8.mmDealReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmDealReference
	 * RedemptionExecution15.mmDealReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order execution, as assigned by a confirming party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDealIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchOrderStatusAndReason1.mmDealReference, com.tools20022.repository.msg.RedemptionExecution3.mmDealReference,
					com.tools20022.repository.msg.RedemptionExecution5.mmDealReference, com.tools20022.repository.msg.InvestmentFundOrderExecution2.mmDealReference, com.tools20022.repository.msg.RedemptionExecution4.mmDealReference,
					com.tools20022.repository.msg.RedemptionExecution6.mmDealReference, com.tools20022.repository.msg.InvestmentFundOrder3.mmDealReference, com.tools20022.repository.msg.InvestmentFundOrder2.mmDealReference,
					com.tools20022.repository.msg.InvestmentFundTransaction2.mmDealReference, com.tools20022.repository.msg.InvestmentFundTransaction3.mmDealReference, com.tools20022.repository.msg.SubscriptionExecution3.mmDealReference,
					com.tools20022.repository.msg.SubscriptionExecution5.mmDealReference, com.tools20022.repository.msg.SubscriptionExecution4.mmDealReference, com.tools20022.repository.msg.SubscriptionExecution6.mmDealReference,
					com.tools20022.repository.msg.SwitchExecution3.mmDealReference, com.tools20022.repository.msg.SwitchExecution4.mmDealReference, com.tools20022.repository.msg.LotDetails1.mmDealReference,
					com.tools20022.repository.msg.RedemptionExecution10.mmDealReference, com.tools20022.repository.msg.SubscriptionExecution7.mmDealReference, com.tools20022.repository.msg.InvestmentFundOrderExecution3.mmDealReference,
					com.tools20022.repository.msg.RedemptionExecution12.mmDealReference, com.tools20022.repository.msg.SubscriptionExecution9.mmDealReference, com.tools20022.repository.msg.InvestmentFundTransaction4.mmDealReference,
					com.tools20022.repository.msg.InvestmentFundOrder11.mmDealReference, com.tools20022.repository.msg.SwitchExecution7.mmDealReference, com.tools20022.repository.msg.SwitchOrderStatusAndReason2.mmDealReference,
					com.tools20022.repository.msg.SubscriptionExecution13.mmDealReference, com.tools20022.repository.msg.SubscriptionExecution12.mmDealReference, com.tools20022.repository.msg.RedemptionExecution16.mmDealReference,
					com.tools20022.repository.msg.InvestmentFundOrder8.mmDealReference, com.tools20022.repository.msg.RedemptionExecution15.mmDealReference);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealIdentification";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by a confirming party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected SecuritiesPricing executedTradePrice;
	/**
	 * Price at which the order was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToExecutedPrice
	 * SecuritiesPricing.mmFundOrderRelatedToExecutedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmPriceDetails
	 * RedemptionExecution3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmDealingPriceDetails
	 * RedemptionExecution5.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmPriceDetails
	 * RedemptionExecution4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmDealingPriceDetails
	 * RedemptionExecution6.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmPriceDetails
	 * InvestmentFundTransaction2.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmPriceDetails
	 * InvestmentFundTransaction3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmPriceDetails
	 * SubscriptionExecution3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmDealingPriceDetails
	 * SubscriptionExecution5.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmPriceDetails
	 * SubscriptionExecution4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmDealingPriceDetails
	 * SubscriptionExecution6.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmPriceDetails
	 * SwitchRedemptionLegExecution2.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmPriceDetails
	 * SwitchSubscriptionLegExecution2.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmPriceDetails
	 * SwitchRedemptionLegExecution3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmPriceDetails
	 * SwitchSubscriptionLegExecution3.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmDealingPriceDetails
	 * RedemptionExecution10.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmDealingPriceDetails
	 * SubscriptionExecution7.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmDealingPriceDetails
	 * RedemptionExecution12.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmDealingPriceDetails
	 * SubscriptionExecution9.mmDealingPriceDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast7#mmPrice
	 * FundCashForecast7.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPrice
	 * EstimatedFundCashForecast6.mmPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FundCashForecast6#mmPrice
	 * FundCashForecast6.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPrice
	 * EstimatedFundCashForecast5.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmPriceDetails
	 * InvestmentFundTransaction4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmDealingPriceDetails
	 * SubscriptionExecution13.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmDealingPriceDetails
	 * SubscriptionExecution12.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmDealingPriceDetails
	 * RedemptionExecution16.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmPriceDetails
	 * SwitchSubscriptionLegExecution4.mmPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmDealingPriceDetails
	 * RedemptionExecution15.mmDealingPriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmPriceDetails
	 * SwitchRedemptionLegExecution4.mmPriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedTradePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price at which the order was executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExecutedTradePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution3.mmPriceDetails, com.tools20022.repository.msg.RedemptionExecution5.mmDealingPriceDetails,
					com.tools20022.repository.msg.RedemptionExecution4.mmPriceDetails, com.tools20022.repository.msg.RedemptionExecution6.mmDealingPriceDetails, com.tools20022.repository.msg.InvestmentFundTransaction2.mmPriceDetails,
					com.tools20022.repository.msg.InvestmentFundTransaction3.mmPriceDetails, com.tools20022.repository.msg.SubscriptionExecution3.mmPriceDetails, com.tools20022.repository.msg.SubscriptionExecution5.mmDealingPriceDetails,
					com.tools20022.repository.msg.SubscriptionExecution4.mmPriceDetails, com.tools20022.repository.msg.SubscriptionExecution6.mmDealingPriceDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.mmPriceDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.mmPriceDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.mmPriceDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.mmPriceDetails,
					com.tools20022.repository.msg.RedemptionExecution10.mmDealingPriceDetails, com.tools20022.repository.msg.SubscriptionExecution7.mmDealingPriceDetails,
					com.tools20022.repository.msg.RedemptionExecution12.mmDealingPriceDetails, com.tools20022.repository.msg.SubscriptionExecution9.mmDealingPriceDetails, com.tools20022.repository.msg.FundCashForecast7.mmPrice,
					com.tools20022.repository.msg.EstimatedFundCashForecast6.mmPrice, com.tools20022.repository.msg.FundCashForecast6.mmPrice, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmPrice,
					com.tools20022.repository.msg.InvestmentFundTransaction4.mmPriceDetails, com.tools20022.repository.msg.SubscriptionExecution13.mmDealingPriceDetails,
					com.tools20022.repository.msg.SubscriptionExecution12.mmDealingPriceDetails, com.tools20022.repository.msg.RedemptionExecution16.mmDealingPriceDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.mmPriceDetails, com.tools20022.repository.msg.RedemptionExecution15.mmDealingPriceDetails,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.mmPriceDetails);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedTradePrice";
			definition = "Price at which the order was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToExecutedPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected YesNoIndicator partiallyExecutedIndicator;
	/**
	 * Indicates whether the order has been partially executed, ie, the
	 * confirmed quantity does not match the ordered quantity for a given
	 * financial instrument.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmPartiallyExecutedIndicator
	 * RedemptionExecution3.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmPartiallyExecutedIndicator
	 * RedemptionExecution5.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmPartiallyExecutedIndicator
	 * RedemptionExecution4.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPartiallyExecutedIndicator
	 * RedemptionExecution6.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmPartiallyExecutedIndicator
	 * InvestmentFundTransaction2.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmPartiallyExecutedIndicator
	 * InvestmentFundTransaction3.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmPartiallyExecutedIndicator
	 * SubscriptionExecution3.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmPartiallyExecutedIndicator
	 * SubscriptionExecution5.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmPartiallyExecutedIndicator
	 * SubscriptionExecution4.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmPartiallyExecutedIndicator
	 * SubscriptionExecution6.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmPartiallyExecutedIndicator
	 * RedemptionExecution10.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmPartiallyExecutedIndicator
	 * SubscriptionExecution7.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmPartiallyExecutedIndicator
	 * RedemptionExecution12.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmPartiallyExecutedIndicator
	 * SubscriptionExecution9.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmPartiallyExecutedIndicator
	 * InvestmentFundTransaction4.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPartiallyExecutedIndicator
	 * SubscriptionExecution13.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmPartiallyExecutedIndicator
	 * SubscriptionExecution12.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartiallyExecutedIndicator
	 * RedemptionExecution16.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartiallyExecutedIndicator
	 * RedemptionExecution15.mmPartiallyExecutedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyExecutedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPartiallyExecutedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution3.mmPartiallyExecutedIndicator, com.tools20022.repository.msg.RedemptionExecution5.mmPartiallyExecutedIndicator,
					com.tools20022.repository.msg.RedemptionExecution4.mmPartiallyExecutedIndicator, com.tools20022.repository.msg.RedemptionExecution6.mmPartiallyExecutedIndicator,
					com.tools20022.repository.msg.InvestmentFundTransaction2.mmPartiallyExecutedIndicator, com.tools20022.repository.msg.InvestmentFundTransaction3.mmPartiallyExecutedIndicator,
					com.tools20022.repository.msg.SubscriptionExecution3.mmPartiallyExecutedIndicator, com.tools20022.repository.msg.SubscriptionExecution5.mmPartiallyExecutedIndicator,
					com.tools20022.repository.msg.SubscriptionExecution4.mmPartiallyExecutedIndicator, com.tools20022.repository.msg.SubscriptionExecution6.mmPartiallyExecutedIndicator,
					com.tools20022.repository.msg.RedemptionExecution10.mmPartiallyExecutedIndicator, com.tools20022.repository.msg.SubscriptionExecution7.mmPartiallyExecutedIndicator,
					com.tools20022.repository.msg.RedemptionExecution12.mmPartiallyExecutedIndicator, com.tools20022.repository.msg.SubscriptionExecution9.mmPartiallyExecutedIndicator,
					com.tools20022.repository.msg.InvestmentFundTransaction4.mmPartiallyExecutedIndicator, com.tools20022.repository.msg.SubscriptionExecution13.mmPartiallyExecutedIndicator,
					com.tools20022.repository.msg.SubscriptionExecution12.mmPartiallyExecutedIndicator, com.tools20022.repository.msg.RedemptionExecution16.mmPartiallyExecutedIndicator,
					com.tools20022.repository.msg.RedemptionExecution15.mmPartiallyExecutedIndicator);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartiallyExecutedIndicator";
			definition = "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CurrencyAndAmount interimProfitAmount;
	/**
	 * Part of the price deemed as accrued income or profit rather than capital.
	 * The interim profit amount is used for tax purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss1Choice#mmProfit
	 * ProfitAndLoss1Choice.mmProfit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss1Choice#mmLoss
	 * ProfitAndLoss1Choice.mmLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmInterimProfitAmount
	 * RedemptionExecution3.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmInterimProfitAmount
	 * RedemptionExecution5.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmInterimProfitAmount
	 * RedemptionExecution4.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmInterimProfitAmount
	 * RedemptionExecution6.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmInterimProfitAmount
	 * SubscriptionExecution3.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmInterimProfitAmount
	 * SubscriptionExecution5.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmInterimProfitAmount
	 * SubscriptionExecution4.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmInterimProfitAmount
	 * SubscriptionExecution6.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmInterimProfitAmount
	 * SwitchRedemptionLegExecution2.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2#mmInterimProfitAmount
	 * SwitchSubscriptionLegExecution2.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmInterimProfitAmount
	 * SwitchRedemptionLegExecution3.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3#mmInterimProfitAmount
	 * SwitchSubscriptionLegExecution3.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmInterimProfitAmount
	 * RedemptionExecution10.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmInterimProfitAmount
	 * SubscriptionExecution7.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmInterimProfitAmount
	 * SubscriptionExecution13.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss2Choice#mmProfit
	 * ProfitAndLoss2Choice.mmProfit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss2Choice#mmLoss
	 * ProfitAndLoss2Choice.mmLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmInterimProfitAmount
	 * SubscriptionExecution12.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInterimProfitAmount
	 * RedemptionExecution16.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmInterimProfitAmount
	 * SwitchSubscriptionLegExecution4.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmInterimProfitAmount
	 * RedemptionExecution15.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmInterimProfitAmount
	 * SwitchRedemptionLegExecution4.mmInterimProfitAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimProfitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInterimProfitAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProfitAndLoss1Choice.mmProfit, com.tools20022.repository.choice.ProfitAndLoss1Choice.mmLoss,
					com.tools20022.repository.msg.RedemptionExecution3.mmInterimProfitAmount, com.tools20022.repository.msg.RedemptionExecution5.mmInterimProfitAmount,
					com.tools20022.repository.msg.RedemptionExecution4.mmInterimProfitAmount, com.tools20022.repository.msg.RedemptionExecution6.mmInterimProfitAmount,
					com.tools20022.repository.msg.SubscriptionExecution3.mmInterimProfitAmount, com.tools20022.repository.msg.SubscriptionExecution5.mmInterimProfitAmount,
					com.tools20022.repository.msg.SubscriptionExecution4.mmInterimProfitAmount, com.tools20022.repository.msg.SubscriptionExecution6.mmInterimProfitAmount,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution2.mmInterimProfitAmount, com.tools20022.repository.msg.SwitchSubscriptionLegExecution2.mmInterimProfitAmount,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution3.mmInterimProfitAmount, com.tools20022.repository.msg.SwitchSubscriptionLegExecution3.mmInterimProfitAmount,
					com.tools20022.repository.msg.RedemptionExecution10.mmInterimProfitAmount, com.tools20022.repository.msg.SubscriptionExecution7.mmInterimProfitAmount,
					com.tools20022.repository.msg.SubscriptionExecution13.mmInterimProfitAmount, com.tools20022.repository.choice.ProfitAndLoss2Choice.mmProfit, com.tools20022.repository.choice.ProfitAndLoss2Choice.mmLoss,
					com.tools20022.repository.msg.SubscriptionExecution12.mmInterimProfitAmount, com.tools20022.repository.msg.RedemptionExecution16.mmInterimProfitAmount,
					com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.mmInterimProfitAmount, com.tools20022.repository.msg.RedemptionExecution15.mmInterimProfitAmount,
					com.tools20022.repository.msg.SwitchRedemptionLegExecution4.mmInterimProfitAmount);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterimProfitAmount";
			definition = "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected SecuritiesPricing informativePrice;
	/**
	 * Other quoted price than the one at which the order was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToInformativePrice
	 * SecuritiesPricing.mmFundOrderRelatedToInformativePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmInformativePriceDetails
	 * RedemptionExecution5.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmInformativePriceDetails
	 * RedemptionExecution6.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmInformativePriceDetails
	 * SubscriptionExecution5.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmInformativePriceDetails
	 * SubscriptionExecution6.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmInformativePriceDetails
	 * RedemptionExecution10.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmInformativePriceDetails
	 * SubscriptionExecution7.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmInformativePriceDetails
	 * SubscriptionExecution13.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmInformativePriceDetails
	 * SubscriptionExecution12.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInformativePriceDetails
	 * RedemptionExecution16.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmInformativePriceDetails
	 * SwitchSubscriptionLegExecution4.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmInformativePriceDetails
	 * RedemptionExecution15.mmInformativePriceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmInformativePriceDetails
	 * SwitchRedemptionLegExecution4.mmInformativePriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformativePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other quoted price than the one at which the order was executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInformativePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution5.mmInformativePriceDetails, com.tools20022.repository.msg.RedemptionExecution6.mmInformativePriceDetails,
					com.tools20022.repository.msg.SubscriptionExecution5.mmInformativePriceDetails, com.tools20022.repository.msg.SubscriptionExecution6.mmInformativePriceDetails,
					com.tools20022.repository.msg.RedemptionExecution10.mmInformativePriceDetails, com.tools20022.repository.msg.SubscriptionExecution7.mmInformativePriceDetails,
					com.tools20022.repository.msg.SubscriptionExecution13.mmInformativePriceDetails, com.tools20022.repository.msg.SubscriptionExecution12.mmInformativePriceDetails,
					com.tools20022.repository.msg.RedemptionExecution16.mmInformativePriceDetails, com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.mmInformativePriceDetails,
					com.tools20022.repository.msg.RedemptionExecution15.mmInformativePriceDetails, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.mmInformativePriceDetails);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformativePrice";
			definition = "Other quoted price than the one at which the order was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToInformativePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected BestExecutionCode bestExecution;
	/**
	 * Specifies that the execution was subject to best execution rules as
	 * defined by MiFID.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BestExecutionCode
	 * BestExecutionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmBestExecution
	 * RedemptionExecution5.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmBestExecution
	 * RedemptionExecution6.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmBestExecution
	 * SubscriptionExecution5.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmBestExecution
	 * SubscriptionExecution6.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmBestExecution
	 * SwitchExecution4.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmBestExecution
	 * SwitchExecution7.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmBestExecution
	 * SubscriptionExecution13.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmBestExecution
	 * SubscriptionExecution12.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmBestExecution
	 * RedemptionExecution16.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmBestExecution
	 * RedemptionExecution15.mmBestExecution}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the execution was subject to best execution rules as defined by MiFID."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBestExecution = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution5.mmBestExecution, com.tools20022.repository.msg.RedemptionExecution6.mmBestExecution,
					com.tools20022.repository.msg.SubscriptionExecution5.mmBestExecution, com.tools20022.repository.msg.SubscriptionExecution6.mmBestExecution, com.tools20022.repository.msg.SwitchExecution4.mmBestExecution,
					com.tools20022.repository.msg.SwitchExecution7.mmBestExecution, com.tools20022.repository.msg.SubscriptionExecution13.mmBestExecution, com.tools20022.repository.msg.SubscriptionExecution12.mmBestExecution,
					com.tools20022.repository.msg.RedemptionExecution16.mmBestExecution, com.tools20022.repository.msg.RedemptionExecution15.mmBestExecution);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BestExecution";
			definition = "Specifies that the execution was subject to best execution rules as defined by MiFID.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BestExecutionCode.mmObject();
		}
	};
	protected PercentageRate partialSettlementOfUnits;
	/**
	 * Percentage of units partially settled.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmPartialSettlementOfUnits
	 * RedemptionExecution5.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPartialSettlementOfUnits
	 * RedemptionExecution6.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmPartialSettlementOfUnits
	 * SubscriptionExecution5.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmPartialSettlementOfUnits
	 * SubscriptionExecution6.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmPartialSettlementOfUnits
	 * RedemptionExecution10.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmPartialSettlementOfUnits
	 * SubscriptionExecution7.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPartialSettlementOfUnits
	 * SubscriptionExecution13.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmPartialSettlementOfUnits
	 * SubscriptionExecution12.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartialSettlementOfUnits
	 * RedemptionExecution16.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartialSettlementOfUnits
	 * RedemptionExecution15.mmPartialSettlementOfUnits}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementOfUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of units partially settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPartialSettlementOfUnits = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution5.mmPartialSettlementOfUnits, com.tools20022.repository.msg.RedemptionExecution6.mmPartialSettlementOfUnits,
					com.tools20022.repository.msg.SubscriptionExecution5.mmPartialSettlementOfUnits, com.tools20022.repository.msg.SubscriptionExecution6.mmPartialSettlementOfUnits,
					com.tools20022.repository.msg.RedemptionExecution10.mmPartialSettlementOfUnits, com.tools20022.repository.msg.SubscriptionExecution7.mmPartialSettlementOfUnits,
					com.tools20022.repository.msg.SubscriptionExecution13.mmPartialSettlementOfUnits, com.tools20022.repository.msg.SubscriptionExecution12.mmPartialSettlementOfUnits,
					com.tools20022.repository.msg.RedemptionExecution16.mmPartialSettlementOfUnits, com.tools20022.repository.msg.RedemptionExecution15.mmPartialSettlementOfUnits);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementOfUnits";
			definition = "Percentage of units partially settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate partialSettlementOfCash;
	/**
	 * Percentage of cash partially settled.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmPartialSettlementOfCash
	 * RedemptionExecution5.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmPartialSettlementOfCash
	 * RedemptionExecution6.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmPartialSettlementOfCash
	 * SubscriptionExecution5.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmPartialSettlementOfCash
	 * SubscriptionExecution6.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmPartialSettlementOfCash
	 * RedemptionExecution10.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmPartialSettlementOfCash
	 * SubscriptionExecution7.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmPartialSettlementOfCash
	 * SubscriptionExecution13.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmPartialSettlementOfCash
	 * SubscriptionExecution12.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartialSettlementOfCash
	 * RedemptionExecution16.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmPartialSettlementOfCash
	 * RedemptionExecution15.mmPartialSettlementOfCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementOfCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of cash partially settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPartialSettlementOfCash = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution5.mmPartialSettlementOfCash, com.tools20022.repository.msg.RedemptionExecution6.mmPartialSettlementOfCash,
					com.tools20022.repository.msg.SubscriptionExecution5.mmPartialSettlementOfCash, com.tools20022.repository.msg.SubscriptionExecution6.mmPartialSettlementOfCash,
					com.tools20022.repository.msg.RedemptionExecution10.mmPartialSettlementOfCash, com.tools20022.repository.msg.SubscriptionExecution7.mmPartialSettlementOfCash,
					com.tools20022.repository.msg.SubscriptionExecution13.mmPartialSettlementOfCash, com.tools20022.repository.msg.SubscriptionExecution12.mmPartialSettlementOfCash,
					com.tools20022.repository.msg.RedemptionExecution16.mmPartialSettlementOfCash, com.tools20022.repository.msg.RedemptionExecution15.mmPartialSettlementOfCash);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementOfCash";
			definition = "Percentage of cash partially settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected LateReportCode lateReport;
	/**
	 * Specifies whether the order execution confirmation is late.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LateReportCode
	 * LateReportCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmLateReport
	 * RedemptionExecution5.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmLateReport
	 * RedemptionExecution6.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmLateReport
	 * SubscriptionExecution5.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmLateReport
	 * SubscriptionExecution6.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmLateReport
	 * SwitchExecution4.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmLateReport
	 * SwitchExecution7.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmLateReport
	 * SubscriptionExecution13.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmLateReport
	 * SubscriptionExecution12.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmLateReport
	 * RedemptionExecution16.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmLateReport
	 * RedemptionExecution15.mmLateReport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the order execution confirmation is late."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLateReport = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution5.mmLateReport, com.tools20022.repository.msg.RedemptionExecution6.mmLateReport,
					com.tools20022.repository.msg.SubscriptionExecution5.mmLateReport, com.tools20022.repository.msg.SubscriptionExecution6.mmLateReport, com.tools20022.repository.msg.SwitchExecution4.mmLateReport,
					com.tools20022.repository.msg.SwitchExecution7.mmLateReport, com.tools20022.repository.msg.SubscriptionExecution13.mmLateReport, com.tools20022.repository.msg.SubscriptionExecution12.mmLateReport,
					com.tools20022.repository.msg.RedemptionExecution16.mmLateReport, com.tools20022.repository.msg.RedemptionExecution15.mmLateReport);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LateReport";
			definition = "Specifies whether the order execution confirmation is late.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LateReportCode.mmObject();
		}
	};
	protected YesNoIndicator settledIndicator;
	/**
	 * Indicates whether the cash payment with respect to the executed order is
	 * settled.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmSettledTransactionIndicator
	 * InvestmentFundTransaction2.mmSettledTransactionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmSettledTransactionIndicator
	 * InvestmentFundTransaction3.mmSettledTransactionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmSettledTransactionIndicator
	 * InvestmentFundTransaction4.mmSettledTransactionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cash payment with respect to the executed order is settled."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettledIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransaction2.mmSettledTransactionIndicator, com.tools20022.repository.msg.InvestmentFundTransaction3.mmSettledTransactionIndicator,
					com.tools20022.repository.msg.InvestmentFundTransaction4.mmSettledTransactionIndicator);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettledIndicator";
			definition = "Indicates whether the cash payment with respect to the executed order is settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator registeredIndicator;
	/**
	 * Indicates whether the executed order has a registered status on the books
	 * of the transfer agent.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmRegisteredTransactionIndicator
	 * InvestmentFundTransaction2.mmRegisteredTransactionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmRegisteredTransactionIndicator
	 * InvestmentFundTransaction3.mmRegisteredTransactionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmRegisteredTransactionIndicator
	 * InvestmentFundTransaction4.mmRegisteredTransactionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the executed order has a registered status on the books of the transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegisteredIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransaction2.mmRegisteredTransactionIndicator, com.tools20022.repository.msg.InvestmentFundTransaction3.mmRegisteredTransactionIndicator,
					com.tools20022.repository.msg.InvestmentFundTransaction4.mmRegisteredTransactionIndicator);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredIndicator";
			definition = "Indicates whether the executed order has a registered status on the books of the transfer agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CurrencyAndAmount executedAmount;
	/**
	 * Amount of money invested or redeemed as a result of an investment fund
	 * order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmExecutedAmount
	 * RedemptionExecution10.mmExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmExecutedAmount
	 * SubscriptionExecution7.mmExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity2#mmExecutedAmount
	 * FinancialInstrumentQuantity2.mmExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity3#mmExecutedAmount
	 * FinancialInstrumentQuantity3.mmExecutedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalCashFromUnitOrders
	 * FundBalance1.mmTotalCashFromUnitOrders}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundBalance1#mmTotalCashFromCashOrders
	 * FundBalance1.mmTotalCashFromCashOrders}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money invested or redeemed as a result of an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExecutedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution10.mmExecutedAmount, com.tools20022.repository.msg.SubscriptionExecution7.mmExecutedAmount,
					com.tools20022.repository.msg.FinancialInstrumentQuantity2.mmExecutedAmount, com.tools20022.repository.msg.FinancialInstrumentQuantity3.mmExecutedAmount,
					com.tools20022.repository.msg.FundBalance1.mmTotalCashFromUnitOrders, com.tools20022.repository.msg.FundBalance1.mmTotalCashFromCashOrders);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedAmount";
			definition = "Amount of money invested or redeemed as a result of an investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected InvestmentFundTransaction investmentFundTransaction;
	/**
	 * Transaction which is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundOrderExecution
	 * InvestmentFundTransaction.mmInvestmentFundOrderExecution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2#mmFinancialInstrumentDetails
	 * SwitchRedemptionLegExecution2.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3#mmFinancialInstrumentDetails
	 * SwitchRedemptionLegExecution3.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution3#mmOrderExecutionDetails
	 * InvestmentFundOrderExecution3.mmOrderExecutionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmFinancialInstrumentDetails
	 * SwitchRedemptionLegExecution4.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction which is executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchRedemptionLegExecution2.mmFinancialInstrumentDetails, com.tools20022.repository.msg.SwitchRedemptionLegExecution3.mmFinancialInstrumentDetails,
					com.tools20022.repository.msg.InvestmentFundOrderExecution3.mmOrderExecutionDetails, com.tools20022.repository.msg.SwitchRedemptionLegExecution4.mmFinancialInstrumentDetails);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Transaction which is executed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.FundsCashFlow> cashFlow;
	/**
	 * Specifies the cash flow resulting from the execution of an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmRelatedOrder
	 * FundsCashFlow.mmRelatedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
	 * FundsCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash flow resulting from the execution of an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashFlow = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashFlow";
			definition = "Specifies the cash flow resulting from the execution of an order.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmRelatedOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
		}
	};
	protected SourceOfCashCode sourceOfCash;
	/**
	 * Source of cash used for the settlement of the execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SourceOfCashCode
	 * SourceOfCashCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmSourceOfCash
	 * SubscriptionExecution13.mmSourceOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmSourceOfCash
	 * SubscriptionExecution12.mmSourceOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmSourceOfCash
	 * SubscriptionOrder15.mmSourceOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmSourceOfCash
	 * SubscriptionOrder14.mmSourceOfCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Source of cash used for the settlement of the execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSourceOfCash = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionExecution13.mmSourceOfCash, com.tools20022.repository.msg.SubscriptionExecution12.mmSourceOfCash,
					com.tools20022.repository.msg.SubscriptionOrder15.mmSourceOfCash, com.tools20022.repository.msg.SubscriptionOrder14.mmSourceOfCash);
			elementContext_lazy = () -> InvestmentFundOrderExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceOfCash";
			definition = "Source of cash used for the settlement of the execution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SourceOfCashCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundOrderExecution";
				definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToExecutedPrice, com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToInformativePrice,
						com.tools20022.repository.entity.InvestmentFundOrder.mmInvestmentFundOrderExecution, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedOrderExecution,
						com.tools20022.repository.entity.InvestmentFundTransaction.mmInvestmentFundOrderExecution, com.tools20022.repository.entity.FundsCashFlow.mmRelatedOrder);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransactionsByFund2.mmTransactionDetails, com.tools20022.repository.msg.InvestmentFundTransactionsByFund3.mmTransactionDetails);
				subType_lazy = () -> Arrays.asList(SubscriptionExecution.mmObject(), RedemptionExecution.mmObject(), SwitchExecution.mmObject());
				superType_lazy = () -> SecuritiesTradeExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrderExecution.mmUnitsNumber, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmNonStandardSettlementInformation,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmOrder, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmDealIdentification,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmExecutedTradePrice, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmPartiallyExecutedIndicator,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInterimProfitAmount, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInformativePrice,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmBestExecution, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmPartialSettlementOfUnits,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmPartialSettlementOfCash, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmLateReport,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmSettledIndicator, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmRegisteredIndicator,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmExecutedAmount, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInvestmentFundTransaction,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmCashFlow, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmSourceOfCash);
				derivationComponent_lazy = () -> Arrays.asList(ExpectedExecutionDetails1.mmObject(), ExpectedExecutionDetails2.mmObject(), InvestmentFundOrderExecution2.mmObject(), InvestmentFundOrderExecution1.mmObject(),
						ExpectedExecutionDetails3.mmObject(), InvestmentFundOrderExecution3.mmObject(), UnitsAndCash.mmObject(), ExpectedExecutionDetails4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getUnitsNumber() {
		return unitsNumber;
	}

	public void setUnitsNumber(com.tools20022.repository.entity.SecuritiesQuantity unitsNumber) {
		this.unitsNumber = unitsNumber;
	}

	public Max350Text getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation;
	}

	public void setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
	}

	public InvestmentFundOrder getOrder() {
		return order;
	}

	public void setOrder(com.tools20022.repository.entity.InvestmentFundOrder order) {
		this.order = order;
	}

	public Max35Text getDealIdentification() {
		return dealIdentification;
	}

	public void setDealIdentification(Max35Text dealIdentification) {
		this.dealIdentification = dealIdentification;
	}

	public SecuritiesPricing getExecutedTradePrice() {
		return executedTradePrice;
	}

	public void setExecutedTradePrice(com.tools20022.repository.entity.SecuritiesPricing executedTradePrice) {
		this.executedTradePrice = executedTradePrice;
	}

	public YesNoIndicator getPartiallyExecutedIndicator() {
		return partiallyExecutedIndicator;
	}

	public void setPartiallyExecutedIndicator(YesNoIndicator partiallyExecutedIndicator) {
		this.partiallyExecutedIndicator = partiallyExecutedIndicator;
	}

	public CurrencyAndAmount getInterimProfitAmount() {
		return interimProfitAmount;
	}

	public void setInterimProfitAmount(CurrencyAndAmount interimProfitAmount) {
		this.interimProfitAmount = interimProfitAmount;
	}

	public SecuritiesPricing getInformativePrice() {
		return informativePrice;
	}

	public void setInformativePrice(com.tools20022.repository.entity.SecuritiesPricing informativePrice) {
		this.informativePrice = informativePrice;
	}

	public BestExecutionCode getBestExecution() {
		return bestExecution;
	}

	public void setBestExecution(BestExecutionCode bestExecution) {
		this.bestExecution = bestExecution;
	}

	public PercentageRate getPartialSettlementOfUnits() {
		return partialSettlementOfUnits;
	}

	public void setPartialSettlementOfUnits(PercentageRate partialSettlementOfUnits) {
		this.partialSettlementOfUnits = partialSettlementOfUnits;
	}

	public PercentageRate getPartialSettlementOfCash() {
		return partialSettlementOfCash;
	}

	public void setPartialSettlementOfCash(PercentageRate partialSettlementOfCash) {
		this.partialSettlementOfCash = partialSettlementOfCash;
	}

	public LateReportCode getLateReport() {
		return lateReport;
	}

	public void setLateReport(LateReportCode lateReport) {
		this.lateReport = lateReport;
	}

	public YesNoIndicator getSettledIndicator() {
		return settledIndicator;
	}

	public void setSettledIndicator(YesNoIndicator settledIndicator) {
		this.settledIndicator = settledIndicator;
	}

	public YesNoIndicator getRegisteredIndicator() {
		return registeredIndicator;
	}

	public void setRegisteredIndicator(YesNoIndicator registeredIndicator) {
		this.registeredIndicator = registeredIndicator;
	}

	public CurrencyAndAmount getExecutedAmount() {
		return executedAmount;
	}

	public void setExecutedAmount(CurrencyAndAmount executedAmount) {
		this.executedAmount = executedAmount;
	}

	public InvestmentFundTransaction getInvestmentFundTransaction() {
		return investmentFundTransaction;
	}

	public void setInvestmentFundTransaction(com.tools20022.repository.entity.InvestmentFundTransaction investmentFundTransaction) {
		this.investmentFundTransaction = investmentFundTransaction;
	}

	public List<FundsCashFlow> getCashFlow() {
		return cashFlow;
	}

	public void setCashFlow(List<com.tools20022.repository.entity.FundsCashFlow> cashFlow) {
		this.cashFlow = cashFlow;
	}

	public SourceOfCashCode getSourceOfCash() {
		return sourceOfCash;
	}

	public void setSourceOfCash(SourceOfCashCode sourceOfCash) {
		this.sourceOfCash = sourceOfCash;
	}
}
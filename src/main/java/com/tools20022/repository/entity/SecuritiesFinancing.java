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
import com.tools20022.repository.codeset.RepurchaseTypeCode;
import com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Process of lending or borrowing cash or securities against securities or cash
 * collateral. It aims at optimising liquidity, support a trading strategy, or
 * increase settlement efficiency.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesFinancing" src="doc-files/SecuritiesFinancing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmReturnLegInstruction
 * SecuritiesFinancing.mmReturnLegInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmType
 * SecuritiesFinancing.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationDateTime
 * SecuritiesFinancing.mmTerminationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRateChangeDateTime
 * SecuritiesFinancing.mmRateChangeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRevaluationIndicator
 * SecuritiesFinancing.mmRevaluationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterestPayment
 * SecuritiesFinancing.mmInterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmVariableRateSupport
 * SecuritiesFinancing.mmVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseRate
 * SecuritiesFinancing.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmStockLoanMargin
 * SecuritiesFinancing.mmStockLoanMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
 * SecuritiesFinancing.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseSpread
 * SecuritiesFinancing.mmRepurchaseSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTransactionCallDelay
 * SecuritiesFinancing.mmTransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTotalNumberOfCollateralInstructions
 * SecuritiesFinancing.mmTotalNumberOfCollateralInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmDealAmount
 * SecuritiesFinancing.mmDealAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmForfeitRepurchaseAmount
 * SecuritiesFinancing.mmForfeitRepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmPremiumAmount
 * SecuritiesFinancing.mmPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationAmountPerPieceOfCollateral
 * SecuritiesFinancing.mmTerminationAmountPerPieceOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationTransactionAmount
 * SecuritiesFinancing.mmTerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmMaturityDateModification
 * SecuritiesFinancing.mmMaturityDateModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmEarliestCallBackDate
 * SecuritiesFinancing.mmEarliestCallBackDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningSettlementDate
 * SecuritiesFinancing.mmOpeningSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseType
 * SecuritiesFinancing.mmRepurchaseType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmEndPrice
 * SecuritiesFinancing.mmEndPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmSpreadTransaction
 * SecuritiesFinancing.mmSpreadTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmFinancingAgreement
 * SecuritiesFinancing.mmFinancingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningSettlementAmount
 * SecuritiesFinancing.mmOpeningSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmClosingLegExecution
 * SecuritiesFinancing.mmClosingLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningLegExecution
 * SecuritiesFinancing.mmOpeningLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRelatedIndicationOfInterest
 * SecuritiesFinancing.mmRelatedIndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmIdentification
 * SecuritiesFinancing.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesLending
 * SecuritiesLending}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RepurchaseAgreement
 * RepurchaseAgreement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesFinancing
 * SecuritiesPricing.mmRelatedSecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingClosingData
 * SecuritiesTrade.mmSecuritiesFinancingClosingData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingOpeningData
 * SecuritiesTrade.mmSecuritiesFinancingOpeningData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesFinancing
 * Interest.mmSecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Spread#mmSecuritiesFinancing
 * Spread.mmSecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmSecuritiesFinancingTrade
 * SecuritiesFinancingAgreement.mmSecuritiesFinancingTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmTwoLegTransaction
 * BuyOrSellIndicationOfInterest.mmTwoLegTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TwoLegTransactionType1Choice#mmSecuritiesFinancingDetails
 * TwoLegTransactionType1Choice.mmSecuritiesFinancingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmOtherAmounts
 * TwoLegTransactionDetails1.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmTwoLegTransactionType
 * TwoLegTransactionDetails1.mmTwoLegTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#mmTwoLegTransactionDetails
 * SingleQuote1.mmTwoLegTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleOrder1#mmTwoLegTransactionDetails
 * SingleOrder1.mmTwoLegTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order11#mmTwoLegTransactionDetails
 * Order11.mmTwoLegTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmTwoLegTransactionDetails
 * QuoteRequest1.mmTwoLegTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6
 * SecuritiesTradeDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RevaluationIndicator1Choice
 * RevaluationIndicator1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3
 * SecuritiesFinancingTransactionDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13
 * SecuritiesTradeDetails13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RevaluationIndicator2Choice
 * RevaluationIndicator2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5
 * SecuritiesFinancingTransactionDetails5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1
 * SecuritiesFinancingTransactionDetails1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11
 * SecuritiesFinancingTransactionDetails11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14
 * SecuritiesFinancingTransactionDetails14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3
 * SecuritiesTradeDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11
 * SecuritiesTradeDetails11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4
 * SecuritiesFinancingTransactionDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType3Choice
 * RepurchaseType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType6Choice
 * RepurchaseType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType1Choice
 * RepurchaseType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType4Choice
 * RepurchaseType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType11Choice
 * RepurchaseType11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClosingDate1Choice
 * ClosingDate1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Revaluation2Choice
 * Revaluation2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
 * SecuritiesFinancing10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
 * TwoLegTransactionDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType2Choice
 * RepurchaseType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails5
 * SecuritiesTradeDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType7Choice
 * RepurchaseType7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2
 * SecuritiesFinancingTransactionDetails2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8
 * SecuritiesFinancingTransactionDetails8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
 * SecuritiesFinancingTransactionDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType8Choice
 * RepurchaseType8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType5Choice
 * RepurchaseType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails12
 * SecuritiesTradeDetails12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType9Choice
 * RepurchaseType9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
 * SecuritiesFinancingTransactionDetails19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20
 * SecuritiesFinancingTransactionDetails20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6
 * SecuritiesFinancingTransactionDetails6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10
 * SecuritiesFinancingTransactionDetails10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17
 * SecuritiesFinancingTransactionDetails17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18
 * SecuritiesFinancingTransactionDetails18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
 * SecuritiesFinancingTransactionDetails9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType10Choice
 * RepurchaseType10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Revaluation1Choice
 * Revaluation1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
 * SecuritiesFinancing1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21
 * SecuritiesFinancingTransactionDetails21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
 * SecuritiesTradeDetails38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37
 * SecuritiesTradeDetails37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39
 * SecuritiesTradeDetails39}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22
 * SecuritiesFinancingTransactionDetails22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40
 * SecuritiesTradeDetails40}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24
 * SecuritiesFinancingTransactionDetails24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25
 * SecuritiesFinancingTransactionDetails25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26
 * SecuritiesFinancingTransactionDetails26}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28
 * SecuritiesFinancingTransactionDetails28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55
 * SecuritiesTradeDetails55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
 * SecuritiesTradeDetails56}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27
 * SecuritiesFinancingTransactionDetails27}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29
 * SecuritiesFinancingTransactionDetails29}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RevaluationIndicator3Choice
 * RevaluationIndicator3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType15Choice
 * RepurchaseType15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType12Choice
 * RepurchaseType12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType13Choice
 * RepurchaseType13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType14Choice
 * RepurchaseType14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59
 * SecuritiesTradeDetails59}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33
 * SecuritiesFinancingTransactionDetails33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32
 * SecuritiesFinancingTransactionDetails32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58
 * SecuritiesTradeDetails58}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30
 * SecuritiesFinancingTransactionDetails30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34
 * SecuritiesFinancingTransactionDetails34}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RevaluationIndicator4Choice
 * RevaluationIndicator4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType19Choice
 * RepurchaseType19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType16Choice
 * RepurchaseType16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType17Choice
 * RepurchaseType17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType20Choice
 * RepurchaseType20Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
 * SecuritiesFinancingTransactionDetails35}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType22Choice
 * RepurchaseType22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType21Choice
 * RepurchaseType21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType23Choice
 * RepurchaseType23Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36
 * SecuritiesFinancingTransactionDetails36}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType31Choice
 * RepurchaseType31Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType24Choice
 * RepurchaseType24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RepurchaseType26Choice
 * RepurchaseType26Choice}</li>
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
 * "SecuritiesFinancing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency."
 * </li>
 * </ul>
 */
public class SecuritiesFinancing extends SecuritiesTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator returnLegInstruction;
	/**
	 * Specifies whether, for a securities lending/borrowing settlement
	 * transaction, the lender will instruct the return leg as agreed with the
	 * borrower.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmReturnLeg
	 * SettlementDetails50.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmReturnLeg
	 * SettlementDetails51.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmReturnLeg
	 * SettlementDetails1.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmReturnLeg
	 * SettlementDetails19.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmReturnLeg
	 * SettlementDetails22.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmReturnLeg
	 * SettlementDetails35.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmReturnLeg
	 * SettlementDetails42.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmReturnLeg
	 * SettlementDetails52.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmReturnLeg
	 * SettlementDetails43.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmReturnLeg
	 * SettlementDetails67.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmReturnLeg
	 * SettlementDetails68.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmReturnLeg
	 * SettlementDetails81.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmReturnLeg
	 * SettlementDetails83.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmReturnLeg
	 * SettlementDetails93.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmReturnLeg
	 * SettlementDetails94.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmReturnLeg
	 * SettlementDetails101.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmReturnLeg
	 * SettlementDetails111.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmReturnLeg
	 * SettlementDetails112.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmReturnLeg
	 * SettlementDetails113.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmReturnLeg
	 * SettlementDetails120.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmReturnLeg
	 * SettlementDetails119.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmReturnLeg
	 * SettlementDetails122.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmReturnLeg
	 * SettlementDetails137.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmReturnLeg
	 * SettlementDetails132.mmReturnLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmReturnLeg
	 * SettlementDetails138.mmReturnLeg}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnLegInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReturnLegInstruction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails51.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails1.mmReturnLeg,
					com.tools20022.repository.msg.SettlementDetails19.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails22.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails35.mmReturnLeg,
					com.tools20022.repository.msg.SettlementDetails42.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails52.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails43.mmReturnLeg,
					com.tools20022.repository.msg.SettlementDetails67.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails68.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails81.mmReturnLeg,
					com.tools20022.repository.msg.SettlementDetails83.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails93.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails94.mmReturnLeg,
					com.tools20022.repository.msg.SettlementDetails101.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails111.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails112.mmReturnLeg,
					com.tools20022.repository.msg.SettlementDetails113.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails120.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails119.mmReturnLeg,
					com.tools20022.repository.msg.SettlementDetails122.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails137.mmReturnLeg, com.tools20022.repository.msg.SettlementDetails132.mmReturnLeg,
					com.tools20022.repository.msg.SettlementDetails138.mmReturnLeg);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReturnLegInstruction";
			definition = "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SecuritiesTransactionTypeV2Code type;
	/**
	 * Specifies the type of securities financing transaction, that is,
	 * repurchase agreement, reverse repurchase agreement, securities lending or
	 * securities borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of securities financing transaction, that is, repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of securities financing transaction, that is, repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
		}
	};
	protected ISODateTime terminationDateTime;
	/**
	 * Closing date/time or maturity date/time of the repo transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails3.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails5.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails1.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails11.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails14.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails4.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmClosingDate
	 * TwoLegTransactionDetails1.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails2.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails8.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails7.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails19.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails20.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails6.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails10.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails17.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails18.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails9.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmTerminationDateTime
	 * SecuritiesFinancing1.mmTerminationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails21.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails22.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails24.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails25.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails26.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails28.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails27.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails29.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails33.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails32.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails30.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails34.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails35.mmTerminationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails36.mmTerminationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing date/time or maturity date/time of the repo transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTerminationDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmTerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmTerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmTerminationDate,
					com.tools20022.repository.msg.TwoLegTransactionDetails1.mmClosingDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmTerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.mmTerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmTerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmTerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmTerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancing1.mmTerminationDateTime,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmTerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmTerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmTerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.mmTerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmTerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.mmTerminationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmTerminationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmTerminationDate);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationDateTime";
			definition = "Closing date/time or maturity date/time of the repo transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime rateChangeDateTime;
	/**
	 * Date/Time at which rate change has taken place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails3.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails5.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails1.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails11.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails14.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails4.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmRateChangeDate
	 * SecuritiesFinancing10.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails2.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails8.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails19.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails20.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails6.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails10.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails17.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails18.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmRateChangeDateTime
	 * SecuritiesFinancing1.mmRateChangeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails21.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails22.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails24.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails25.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails26.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails28.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails27.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails33.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails32.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails30.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails35.mmRateChangeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails36.mmRateChangeDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChangeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/Time at which rate change has taken place."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRateChangeDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmRateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmRateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmRateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancing10.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmRateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmRateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmRateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmRateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancing1.mmRateChangeDateTime,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmRateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmRateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmRateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmRateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmRateChangeDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmRateChangeDate);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateChangeDateTime";
			definition = "Date/Time at which rate change has taken place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected YesNoIndicator revaluationIndicator;
	/**
	 * Specifies whether the collateral position should be subject to automatic
	 * revaluation by the account servicer.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator1Choice#mmIndicator
	 * RevaluationIndicator1Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator1Choice#mmProprietary
	 * RevaluationIndicator1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmRevaluation
	 * SecuritiesFinancingTransactionDetails3.mmRevaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator2Choice#mmIndicator
	 * RevaluationIndicator2Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator2Choice#mmProprietary
	 * RevaluationIndicator2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmRevaluation
	 * SecuritiesFinancingTransactionDetails5.mmRevaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmRevaluation
	 * SecuritiesFinancingTransactionDetails1.mmRevaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmRevaluation
	 * SecuritiesFinancingTransactionDetails11.mmRevaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmRevaluation
	 * SecuritiesFinancingTransactionDetails14.mmRevaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmRevaluation
	 * SecuritiesFinancingTransactionDetails4.mmRevaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Revaluation2Choice#mmIndicator
	 * Revaluation2Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Revaluation2Choice#mmProprietary
	 * Revaluation2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmRevaluation
	 * SecuritiesFinancing10.mmRevaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmRevaluation
	 * SecuritiesFinancingTransactionDetails19.mmRevaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmRevaluation
	 * SecuritiesFinancingTransactionDetails20.mmRevaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Revaluation1Choice#mmIndicator
	 * Revaluation1Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Revaluation1Choice#mmProprietary
	 * Revaluation1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmRevaluationIndicator
	 * SecuritiesFinancing1.mmRevaluationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmRevaluation
	 * SecuritiesFinancingTransactionDetails28.mmRevaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmRevaluation
	 * SecuritiesFinancingTransactionDetails27.mmRevaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator3Choice#mmIndicator
	 * RevaluationIndicator3Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator3Choice#mmProprietary
	 * RevaluationIndicator3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmRevaluation
	 * SecuritiesFinancingTransactionDetails32.mmRevaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmRevaluation
	 * SecuritiesFinancingTransactionDetails30.mmRevaluation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator4Choice#mmIndicator
	 * RevaluationIndicator4Choice.mmIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator4Choice#mmProprietary
	 * RevaluationIndicator4Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevaluationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRevaluationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RevaluationIndicator1Choice.mmIndicator, com.tools20022.repository.choice.RevaluationIndicator1Choice.mmProprietary,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmRevaluation, com.tools20022.repository.choice.RevaluationIndicator2Choice.mmIndicator,
					com.tools20022.repository.choice.RevaluationIndicator2Choice.mmProprietary, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmRevaluation,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmRevaluation, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmRevaluation,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmRevaluation, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmRevaluation,
					com.tools20022.repository.choice.Revaluation2Choice.mmIndicator, com.tools20022.repository.choice.Revaluation2Choice.mmProprietary, com.tools20022.repository.msg.SecuritiesFinancing10.mmRevaluation,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmRevaluation, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmRevaluation,
					com.tools20022.repository.choice.Revaluation1Choice.mmIndicator, com.tools20022.repository.choice.Revaluation1Choice.mmProprietary, com.tools20022.repository.msg.SecuritiesFinancing1.mmRevaluationIndicator,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmRevaluation, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmRevaluation,
					com.tools20022.repository.choice.RevaluationIndicator3Choice.mmIndicator, com.tools20022.repository.choice.RevaluationIndicator3Choice.mmProprietary,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmRevaluation, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmRevaluation,
					com.tools20022.repository.choice.RevaluationIndicator4Choice.mmIndicator, com.tools20022.repository.choice.RevaluationIndicator4Choice.mmProprietary);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RevaluationIndicator";
			definition = "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator interestPayment;
	/**
	 * Specifies whether the interest is to be paid to the collateral taker. If
	 * set to no, the interest is paid to the collateral giver.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails3.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails5.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails1.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails11.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails14.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails4.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails7.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails19.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails20.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails9.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails28.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails27.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails29.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails32.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails30.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails34.mmInterestPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInterestPayment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmInterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmInterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmInterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmInterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmInterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmInterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.mmInterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmInterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmInterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmInterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmInterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmInterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.mmInterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmInterestPayment,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmInterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.mmInterestPayment);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestPayment";
			definition = "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max35Text variableRateSupport;
	/**
	 * Index or support rate used together with the spread to calculate the
	 * repurchase rate.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails3.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails5.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails1.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails11.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails14.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails4.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmVariableRateSupport
	 * SecuritiesFinancing10.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails2.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails8.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails7.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails19.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails20.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails6.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails10.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails17.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails18.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails9.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmVariableRateSupport
	 * SecuritiesFinancing1.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails21.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails22.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails24.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails25.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails26.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails28.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails27.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails29.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails33.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails32.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails30.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails34.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails35.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails36.mmVariableRateSupport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index or support rate used together with the spread to calculate the repurchase rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmVariableRateSupport = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancing10.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancing1.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.mmVariableRateSupport,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmVariableRateSupport);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the repurchase rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PercentageRate repurchaseRate;
	/**
	 * Rate to be used to recalculate the repurchase amount.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails3.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails5.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails1.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails11.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails14.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails4.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmRepurchaseRate
	 * SecuritiesFinancing10.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails2.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails8.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails7.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails19.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails20.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails6.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails10.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails17.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails18.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails9.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmRepurchase
	 * SecuritiesFinancing1.mmRepurchase}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails21.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails22.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails24.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails25.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails26.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails28.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails27.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails29.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails33.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails32.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails30.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails34.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails35.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails36.mmRepurchaseRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate to be used to recalculate the repurchase amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRepurchaseRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancing10.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancing1.mmRepurchase,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.mmRepurchaseRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmRepurchaseRate);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseRate";
			definition = "Rate to be used to recalculate the repurchase amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate stockLoanMargin;
	/**
	 * Percentage mark-up on a loan consideration used to reflect the lender's
	 * risk.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails3.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails5.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails1.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails11.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails14.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails4.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmStockLoanMargin
	 * SecuritiesFinancing10.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails2.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails8.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails19.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails20.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails6.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails10.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails17.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails18.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmStockLoanMargin
	 * SecuritiesFinancing1.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails21.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails22.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails24.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails25.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails26.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails28.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails27.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails33.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails32.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails30.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails35.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails36.mmStockLoanMargin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage mark-up on a loan consideration used to reflect the lender's risk."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStockLoanMargin = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmStockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmStockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmStockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancing10.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmStockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmStockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmStockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmStockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancing1.mmStockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmStockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmStockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmStockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmStockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmStockLoanMargin,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmStockLoanMargin, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmStockLoanMargin);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockLoanMargin";
			definition = "Percentage mark-up on a loan consideration used to reflect the lender's risk.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * Interest to be paid on the transaction amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesFinancing
	 * Interest.mmSecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmPricingRate
	 * SecuritiesFinancingTransactionDetails3.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmPricingRate
	 * SecuritiesFinancingTransactionDetails5.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmPricingRate
	 * SecuritiesFinancingTransactionDetails1.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmPricingRate
	 * SecuritiesFinancingTransactionDetails11.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmPricingRate
	 * SecuritiesFinancingTransactionDetails14.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmPricingRate
	 * SecuritiesFinancingTransactionDetails4.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmPricingRate
	 * SecuritiesFinancing10.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmPricingRate
	 * SecuritiesFinancingTransactionDetails2.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmPricingRate
	 * SecuritiesFinancingTransactionDetails8.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmPricingRate
	 * SecuritiesFinancingTransactionDetails19.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmPricingRate
	 * SecuritiesFinancingTransactionDetails20.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmPricingRate
	 * SecuritiesFinancingTransactionDetails6.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmPricingRate
	 * SecuritiesFinancingTransactionDetails10.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmPricingRate
	 * SecuritiesFinancingTransactionDetails17.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmPricingRate
	 * SecuritiesFinancingTransactionDetails18.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmPricing
	 * SecuritiesFinancing1.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmPricingRate
	 * SecuritiesFinancingTransactionDetails21.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmPricingRate
	 * SecuritiesFinancingTransactionDetails22.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmPricingRate
	 * SecuritiesFinancingTransactionDetails24.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmPricingRate
	 * SecuritiesFinancingTransactionDetails25.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmPricingRate
	 * SecuritiesFinancingTransactionDetails26.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmPricingRate
	 * SecuritiesFinancingTransactionDetails28.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmPricingRate
	 * SecuritiesFinancingTransactionDetails27.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmPricingRate
	 * SecuritiesFinancingTransactionDetails33.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmPricingRate
	 * SecuritiesFinancingTransactionDetails32.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmPricingRate
	 * SecuritiesFinancingTransactionDetails30.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmPricingRate
	 * SecuritiesFinancingTransactionDetails35.mmPricingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmPricingRate
	 * SecuritiesFinancingTransactionDetails36.mmPricingRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest to be paid on the transaction amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmPricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmPricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmPricingRate,
					com.tools20022.repository.msg.SecuritiesFinancing10.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmPricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmPricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmPricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmPricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancing1.mmPricing,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmPricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmPricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmPricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmPricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmPricingRate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmPricingRate);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest to be paid on the transaction amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmSecuritiesFinancing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected Spread repurchaseSpread;
	/**
	 * Repurchase spread expressed as a rate; margin over or under an index that
	 * determines the repurchase rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmSecuritiesFinancing
	 * Spread.mmSecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmSpread
	 * SecuritiesFinancingTransactionDetails3.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmSpread
	 * SecuritiesFinancingTransactionDetails5.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmSpread
	 * SecuritiesFinancingTransactionDetails1.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmSpread
	 * SecuritiesFinancingTransactionDetails11.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmSpread
	 * SecuritiesFinancingTransactionDetails14.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmSpread
	 * SecuritiesFinancingTransactionDetails4.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmSpread
	 * SecuritiesFinancingTransactionDetails2.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmSpread
	 * SecuritiesFinancingTransactionDetails8.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmSpread
	 * SecuritiesFinancingTransactionDetails19.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmSpread
	 * SecuritiesFinancingTransactionDetails20.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmSpread
	 * SecuritiesFinancingTransactionDetails6.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmSpread
	 * SecuritiesFinancingTransactionDetails10.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmSpread
	 * SecuritiesFinancingTransactionDetails17.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmSpread
	 * SecuritiesFinancingTransactionDetails18.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmSpread
	 * SecuritiesFinancingTransactionDetails21.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmSpread
	 * SecuritiesFinancingTransactionDetails22.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmSpread
	 * SecuritiesFinancingTransactionDetails24.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmSpread
	 * SecuritiesFinancingTransactionDetails25.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSpread
	 * SecuritiesFinancingTransactionDetails26.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmSpread
	 * SecuritiesFinancingTransactionDetails28.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmSpread
	 * SecuritiesFinancingTransactionDetails27.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSpread
	 * SecuritiesFinancingTransactionDetails33.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmSpread
	 * SecuritiesFinancingTransactionDetails32.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmSpread
	 * SecuritiesFinancingTransactionDetails30.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSpread
	 * SecuritiesFinancingTransactionDetails35.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmSpread
	 * SecuritiesFinancingTransactionDetails36.mmSpread}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseSpread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRepurchaseSpread = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmSpread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmSpread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmSpread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmSpread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmSpread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmSpread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmSpread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmSpread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmSpread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmSpread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmSpread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmSpread,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmSpread, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmSpread);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseSpread";
			definition = "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmSecuritiesFinancing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	protected Max3NumericText transactionCallDelay;
	/**
	 * Minimum number of days' notice a counterparty needs for terminating the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails3.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails5.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails1.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails11.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails14.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails4.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmTransactionCallDelay
	 * SecuritiesFinancing10.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails7.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails19.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails20.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails9.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmTransactionCallDelay
	 * SecuritiesFinancing1.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails28.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails27.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails29.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails32.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails30.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails34.mmTransactionCallDelay}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days' notice a counterparty needs for terminating the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionCallDelay = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmTransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmTransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmTransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancing10.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.mmTransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmTransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancing1.mmTransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmTransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmTransactionCallDelay,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.mmTransactionCallDelay);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionCallDelay";
			definition = "Minimum number of days' notice a counterparty needs for terminating the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	protected Max3NumericText totalNumberOfCollateralInstructions;
	/**
	 * Indicates the total Number of collateral instructions involved in the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails3.
	 * mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails5.
	 * mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails1.
	 * mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails11.
	 * mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails14.
	 * mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails4.
	 * mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancing10.mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails19.
	 * mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails20.
	 * mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancing1.mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails28.
	 * mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails27.
	 * mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails32.
	 * mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails30.
	 * mmTotalNumberOfCollateralInstructions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfCollateralInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the total Number of collateral instructions involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalNumberOfCollateralInstructions = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmTotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmTotalNumberOfCollateralInstructions, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmTotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmTotalNumberOfCollateralInstructions, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmTotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmTotalNumberOfCollateralInstructions, com.tools20022.repository.msg.SecuritiesFinancing10.mmTotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmTotalNumberOfCollateralInstructions, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmTotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancing1.mmTotalNumberOfCollateralInstructions, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmTotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmTotalNumberOfCollateralInstructions, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmTotalNumberOfCollateralInstructions,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmTotalNumberOfCollateralInstructions);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfCollateralInstructions";
			definition = "Indicates the total Number of collateral instructions involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	protected CurrencyAndAmount dealAmount;
	/**
	 * Deal amount of the second leg.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmDealAmount
	 * SecuritiesFinancingTransactionDetails3.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmDealAmount
	 * SecuritiesFinancingTransactionDetails5.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmDealAmount
	 * SecuritiesFinancingTransactionDetails1.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmDealAmount
	 * SecuritiesFinancingTransactionDetails11.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmDealAmount
	 * SecuritiesFinancingTransactionDetails14.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmDealAmount
	 * SecuritiesFinancingTransactionDetails4.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmDealAmount
	 * SecuritiesFinancingTransactionDetails19.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmDealAmount
	 * SecuritiesFinancingTransactionDetails20.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmDealAmount
	 * SecuritiesFinancing1.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmDealAmount
	 * SecuritiesFinancingTransactionDetails28.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmDealAmount
	 * SecuritiesFinancingTransactionDetails27.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmDealAmount
	 * SecuritiesFinancingTransactionDetails32.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmDealAmount
	 * SecuritiesFinancingTransactionDetails30.mmDealAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deal amount of the second leg."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDealAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmDealAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmDealAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmDealAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmDealAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmDealAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmDealAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmDealAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmDealAmount,
					com.tools20022.repository.msg.SecuritiesFinancing1.mmDealAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmDealAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmDealAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmDealAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmDealAmount);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealAmount";
			definition = "Deal amount of the second leg.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount forfeitRepurchaseAmount;
	/**
	 * Fixed amount which has to be paid (instead of interest) in the case of a
	 * recall.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmForfeitAmount
	 * SecuritiesFinancingTransactionDetails3.mmForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmForfeitAmount
	 * SecuritiesFinancingTransactionDetails5.mmForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmForfeitAmount
	 * SecuritiesFinancingTransactionDetails1.mmForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmForfeitAmount
	 * SecuritiesFinancingTransactionDetails11.mmForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmForfeitAmount
	 * SecuritiesFinancingTransactionDetails14.mmForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmForfeitAmount
	 * SecuritiesFinancingTransactionDetails4.mmForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmForfeitAmount
	 * SecuritiesFinancing10.mmForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmForfeitAmount
	 * SecuritiesFinancingTransactionDetails19.mmForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmForfeitAmount
	 * SecuritiesFinancingTransactionDetails20.mmForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmForfeitAmount
	 * SecuritiesFinancing1.mmForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmForfeitAmount
	 * SecuritiesFinancingTransactionDetails28.mmForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmForfeitAmount
	 * SecuritiesFinancingTransactionDetails27.mmForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmForfeitAmount
	 * SecuritiesFinancingTransactionDetails32.mmForfeitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmForfeitAmount
	 * SecuritiesFinancingTransactionDetails30.mmForfeitAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitRepurchaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed amount which has to be paid (instead of interest) in the case of a recall."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmForfeitRepurchaseAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmForfeitAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmForfeitAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmForfeitAmount,
					com.tools20022.repository.msg.SecuritiesFinancing10.mmForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmForfeitAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancing1.mmForfeitAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmForfeitAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmForfeitAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmForfeitAmount);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForfeitRepurchaseAmount";
			definition = "Fixed amount which has to be paid (instead of interest) in the case of a recall.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount premiumAmount;
	/**
	 * Difference between the cash amount of the first leg and the cash amount
	 * of the second leg of the repurchase agreement.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmPremiumAmount
	 * SecuritiesFinancingTransactionDetails3.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmPremiumAmount
	 * SecuritiesFinancingTransactionDetails5.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmPremiumAmount
	 * SecuritiesFinancingTransactionDetails1.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmPremiumAmount
	 * SecuritiesFinancingTransactionDetails11.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmPremiumAmount
	 * SecuritiesFinancingTransactionDetails14.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmPremiumAmount
	 * SecuritiesFinancingTransactionDetails4.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmPremiumAmount
	 * SecuritiesFinancing10.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmPremiumAmount
	 * SecuritiesFinancingTransactionDetails19.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmPremiumAmount
	 * SecuritiesFinancingTransactionDetails20.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmPremiumAmount
	 * SecuritiesFinancing1.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmPremiumAmount
	 * SecuritiesFinancingTransactionDetails28.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmPremiumAmount
	 * SecuritiesFinancingTransactionDetails27.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmPremiumAmount
	 * SecuritiesFinancingTransactionDetails32.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmPremiumAmount
	 * SecuritiesFinancingTransactionDetails30.mmPremiumAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the cash amount of the first leg and the cash amount of the \nsecond leg of the repurchase agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPremiumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmPremiumAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmPremiumAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmPremiumAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmPremiumAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmPremiumAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmPremiumAmount,
					com.tools20022.repository.msg.SecuritiesFinancing10.mmPremiumAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmPremiumAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmPremiumAmount, com.tools20022.repository.msg.SecuritiesFinancing1.mmPremiumAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmPremiumAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmPremiumAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmPremiumAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmPremiumAmount);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PremiumAmount";
			definition = "Difference between the cash amount of the first leg and the cash amount of the \nsecond leg of the repurchase agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount terminationAmountPerPieceOfCollateral;
	/**
	 * Amount of money to be settled per piece of collateral to terminate the
	 * transaction.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails3.
	 * mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails5.
	 * mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails1.
	 * mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails11.
	 * mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails14.
	 * mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails4.
	 * mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails19.
	 * mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails20.
	 * mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmTerminationAmountPerPiecesOfCollateral
	 * SecuritiesFinancing1.mmTerminationAmountPerPiecesOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails28.
	 * mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails27.
	 * mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails32.
	 * mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails30.
	 * mmTerminationAmountPerPieceOfCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationAmountPerPieceOfCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be settled per piece of collateral to terminate the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTerminationAmountPerPieceOfCollateral = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmTerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmTerminationAmountPerPieceOfCollateral, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmTerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmTerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmTerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmTerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmTerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmTerminationAmountPerPieceOfCollateral, com.tools20022.repository.msg.SecuritiesFinancing1.mmTerminationAmountPerPiecesOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmTerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmTerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmTerminationAmountPerPieceOfCollateral,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmTerminationAmountPerPieceOfCollateral);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationAmountPerPieceOfCollateral";
			definition = "Amount of money to be settled per piece of collateral to terminate the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount terminationTransactionAmount;
	/**
	 * Total amount of money to be settled to terminate the transaction.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails3.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails5.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails1.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails11.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails14.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails4.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmClosingSettlementAmount
	 * TwoLegTransactionDetails1.mmClosingSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails2.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails8.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails7.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails19.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails20.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails6.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails10.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails17.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails18.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails9.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmTerminationTransactionAmount
	 * SecuritiesFinancing1.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails21.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails22.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails24.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails25.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails26.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails28.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails27.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails29.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails33.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails32.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails30.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails34.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails35.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails36.mmTerminationTransactionAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be settled to terminate the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTerminationTransactionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmTerminationTransactionAmount, com.tools20022.repository.msg.TwoLegTransactionDetails1.mmClosingSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancing1.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmTerminationTransactionAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmTerminationTransactionAmount);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Total amount of money to be settled to terminate the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected YesNoIndicator maturityDateModification;
	/**
	 * Specifies whether the maturity date of the securities financing
	 * transaction may be modified.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails1.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails11.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails14.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails4.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails7.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails19.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails20.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails9.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails28.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails27.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails29.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails32.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails30.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails34.mmMaturityDateModification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDateModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the maturity date of the securities financing transaction may be modified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaturityDateModification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.mmMaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmMaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmMaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.mmMaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7.mmMaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmMaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmMaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmMaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmMaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmMaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29.mmMaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmMaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmMaturityDateModification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails34.mmMaturityDateModification);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaturityDateModification";
			definition = "Specifies whether the maturity date of the securities financing transaction may be modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ISODateTime earliestCallBackDate;
	/**
	 * Earliest date/time at which the call back can take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmEarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails11.mmEarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmEarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails14.mmEarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmEarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails19.mmEarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmEarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails20.mmEarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmEarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails28.mmEarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmEarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails27.mmEarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmEarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails32.mmEarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmEarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails30.mmEarliestCallBackDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestCallBackDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Earliest date/time at which the call back can take place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEarliestCallBackDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.mmEarliestCallBackDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.mmEarliestCallBackDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmEarliestCallBackDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.mmEarliestCallBackDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.mmEarliestCallBackDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.mmEarliestCallBackDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.mmEarliestCallBackDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.mmEarliestCallBackDate);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarliestCallBackDate";
			definition = "Earliest date/time at which the call back can take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime openingSettlementDate;
	/**
	 * Date and time at which the securities are to be delivered or received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmOpeningSettlementDate
	 * SecuritiesTradeDetails3.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmOpeningSettlementDate
	 * SecuritiesTradeDetails11.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails5#mmOpeningSettlementDate
	 * SecuritiesTradeDetails5.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails2.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails8.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails12#mmOpeningSettlementDate
	 * SecuritiesTradeDetails12.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails6.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails10.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails17.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails18.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails21.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmOpeningSettlementDate
	 * SecuritiesTradeDetails37.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails22.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmOpeningSettlementDate
	 * SecuritiesTradeDetails40.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails24.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails25.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails26.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmOpeningSettlementDate
	 * SecuritiesTradeDetails56.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmOpeningSettlementDate
	 * SecuritiesTradeDetails59.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails33.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails35.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmOpeningSettlementDate
	 * SecuritiesFinancingTransactionDetails36.mmOpeningSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be delivered or received."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOpeningSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails3.mmOpeningSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails11.mmOpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails5.mmOpeningSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmOpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmOpeningSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails12.mmOpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmOpeningSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmOpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmOpeningSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmOpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmOpeningSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails37.mmOpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmOpeningSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails40.mmOpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmOpeningSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmOpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmOpeningSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails56.mmOpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesTradeDetails59.mmOpeningSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmOpeningSettlementDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmOpeningSettlementDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmOpeningSettlementDate);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningSettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected RepurchaseTypeCode repurchaseType;
	/**
	 * Specifies the type of repurchase transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeCode
	 * RepurchaseTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType3Choice#mmCode
	 * RepurchaseType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType3Choice#mmProprietary
	 * RepurchaseType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmRepurchaseType
	 * SettlementDetails6.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType6Choice#mmCode
	 * RepurchaseType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType6Choice#mmProprietary
	 * RepurchaseType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmRepurchaseType
	 * SettlementDetails20.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmRepurchaseType
	 * SettlementDetails24.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmRepurchaseType
	 * SettlementDetails33.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmRepurchaseType
	 * SettlementDetails45.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmRepurchaseType
	 * SettlementDetails54.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType1Choice#mmCode
	 * RepurchaseType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType1Choice#mmProprietary
	 * RepurchaseType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmRepurchaseType
	 * SettlementDetails1.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType4Choice#mmCode
	 * RepurchaseType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType4Choice#mmProprietary
	 * RepurchaseType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmRepurchaseType
	 * SettlementDetails19.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmRepurchaseType
	 * SettlementDetails22.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmRepurchaseType
	 * SettlementDetails35.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmRepurchaseType
	 * SettlementDetails42.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmRepurchaseType
	 * SettlementDetails52.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmRepurchaseType
	 * SettlementDetails8.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmRepurchaseType
	 * SettlementDetails11.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmRepurchaseType
	 * SettlementDetails23.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmRepurchaseType
	 * SettlementDetails37.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmRepurchaseType
	 * SettlementDetails44.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmRepurchaseType
	 * SettlementDetails53.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmRepurchaseType
	 * SettlementDetails7.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmRepurchaseType
	 * SettlementDetails12.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmRepurchaseType
	 * SettlementDetails28.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmRepurchaseType
	 * SettlementDetails38.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmRepurchaseType
	 * SettlementDetails47.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmRepurchaseType
	 * SettlementDetails56.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmRepurchaseType
	 * SettlementDetails2.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmRepurchaseType
	 * SettlementDetails13.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmRepurchaseType
	 * SettlementDetails27.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmRepurchaseType
	 * SettlementDetails39.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmRepurchaseType
	 * SettlementDetails48.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmRepurchaseType
	 * SettlementDetails57.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType11Choice#mmCode
	 * RepurchaseType11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType11Choice#mmProprietary
	 * RepurchaseType11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmRepurchaseType
	 * SettlementDetails43.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType2Choice#mmCode
	 * RepurchaseType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType2Choice#mmProprietary
	 * RepurchaseType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType7Choice#mmCode
	 * RepurchaseType7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType7Choice#mmProprietary
	 * RepurchaseType7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmRepurchaseType
	 * SettlementDetails5.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType8Choice#mmCode
	 * RepurchaseType8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType8Choice#mmProprietary
	 * RepurchaseType8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#mmRepurchaseType
	 * SettlementDetails25.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmRepurchaseType
	 * SettlementDetails26.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType5Choice#mmCode
	 * RepurchaseType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType5Choice#mmProprietary
	 * RepurchaseType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType9Choice#mmCode
	 * RepurchaseType9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType9Choice#mmProprietary
	 * RepurchaseType9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmRepurchaseType
	 * SettlementDetails15.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType10Choice#mmCode
	 * RepurchaseType10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType10Choice#mmProprietary
	 * RepurchaseType10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#mmRepurchaseType
	 * SettlementDetails34.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#mmRepurchaseType
	 * SettlementDetails49.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#mmRepurchaseType
	 * SettlementDetails58.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmRepurchaseType
	 * SettlementDetails36.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmRepurchaseType
	 * SettlementDetails66.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmRepurchaseType
	 * SettlementDetails67.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmRepurchaseType
	 * SettlementDetails70.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmRepurchaseType
	 * SettlementDetails69.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmRepurchaseType
	 * SettlementDetails75.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmRepurchaseType
	 * SettlementDetails74.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmRepurchaseType
	 * SettlementDetails81.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmRepurchaseType
	 * SettlementDetails80.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmRepurchaseType
	 * SettlementDetails87.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmRepurchaseType
	 * SettlementDetails86.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmRepurchaseType
	 * SettlementDetails85.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmRepurchaseType
	 * SettlementDetails93.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmRepurchaseType
	 * SettlementDetails90.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#mmRepurchaseType
	 * SettlementDetails99.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType15Choice#mmCode
	 * RepurchaseType15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType15Choice#mmProprietary
	 * RepurchaseType15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType12Choice#mmCode
	 * RepurchaseType12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType12Choice#mmProprietary
	 * RepurchaseType12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmRepurchaseType
	 * SettlementDetails95.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmRepurchaseType
	 * SettlementDetails91.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType13Choice#mmCode
	 * RepurchaseType13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType13Choice#mmProprietary
	 * RepurchaseType13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmRepurchaseType
	 * SettlementDetails92.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType14Choice#mmCode
	 * RepurchaseType14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType14Choice#mmProprietary
	 * RepurchaseType14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmRepurchaseType
	 * SettlementDetails101.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmRepurchaseType
	 * SettlementDetails111.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmRepurchaseType
	 * SettlementDetails112.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmRepurchaseType
	 * SettlementDetails110.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#mmRepurchaseType
	 * SettlementDetails108.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmRepurchaseType
	 * SettlementDetails115.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType19Choice#mmCode
	 * RepurchaseType19Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType19Choice#mmProprietary
	 * RepurchaseType19Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmRepurchaseType
	 * SettlementDetails117.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType16Choice#mmCode
	 * RepurchaseType16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType16Choice#mmProprietary
	 * RepurchaseType16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType17Choice#mmCode
	 * RepurchaseType17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType17Choice#mmProprietary
	 * RepurchaseType17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmRepurchaseType
	 * SettlementDetails116.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType20Choice#mmCode
	 * RepurchaseType20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType20Choice#mmProprietary
	 * RepurchaseType20Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmRepurchaseType
	 * SettlementDetails128.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmRepurchaseType
	 * SettlementDetails120.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmRepurchaseType
	 * SettlementDetails119.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmRepurchaseType
	 * SettlementDetails125.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmRepurchaseType
	 * SettlementDetails126.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType22Choice#mmCode
	 * RepurchaseType22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType22Choice#mmProprietary
	 * RepurchaseType22Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmRepurchaseType
	 * SettlementDetails127.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType21Choice#mmCode
	 * RepurchaseType21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType21Choice#mmProprietary
	 * RepurchaseType21Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType23Choice#mmCode
	 * RepurchaseType23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType23Choice#mmProprietary
	 * RepurchaseType23Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmRepurchaseType
	 * SettlementDetails121.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmRepurchaseType
	 * SettlementDetails134.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmRepurchaseType
	 * SettlementDetails137.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmRepurchaseType
	 * SettlementDetails132.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType31Choice#mmCode
	 * RepurchaseType31Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType31Choice#mmProprietary
	 * RepurchaseType31Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmRepurchaseType
	 * SettlementDetails130.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType24Choice#mmCode
	 * RepurchaseType24Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType24Choice#mmProprietary
	 * RepurchaseType24Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType26Choice#mmCode
	 * RepurchaseType26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType26Choice#mmProprietary
	 * RepurchaseType26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#mmRepurchaseType
	 * SettlementDetails131.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmRepurchaseType
	 * SettlementDetails133.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmRepurchaseType
	 * SettlementDetails139.mmRepurchaseType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of repurchase transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRepurchaseType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RepurchaseType3Choice.mmCode, com.tools20022.repository.choice.RepurchaseType3Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails6.mmRepurchaseType, com.tools20022.repository.choice.RepurchaseType6Choice.mmCode, com.tools20022.repository.choice.RepurchaseType6Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails20.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails24.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails33.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails45.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails54.mmRepurchaseType, com.tools20022.repository.choice.RepurchaseType1Choice.mmCode,
					com.tools20022.repository.choice.RepurchaseType1Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails1.mmRepurchaseType, com.tools20022.repository.choice.RepurchaseType4Choice.mmCode,
					com.tools20022.repository.choice.RepurchaseType4Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails19.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails22.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails35.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails42.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails52.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails8.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails11.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails23.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails37.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails44.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails53.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails7.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails12.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails28.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails38.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails47.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails56.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails2.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails13.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails27.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails39.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails48.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails57.mmRepurchaseType,
					com.tools20022.repository.choice.RepurchaseType11Choice.mmCode, com.tools20022.repository.choice.RepurchaseType11Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails43.mmRepurchaseType,
					com.tools20022.repository.choice.RepurchaseType2Choice.mmCode, com.tools20022.repository.choice.RepurchaseType2Choice.mmProprietary, com.tools20022.repository.choice.RepurchaseType7Choice.mmCode,
					com.tools20022.repository.choice.RepurchaseType7Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails5.mmRepurchaseType, com.tools20022.repository.choice.RepurchaseType8Choice.mmCode,
					com.tools20022.repository.choice.RepurchaseType8Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails25.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails26.mmRepurchaseType,
					com.tools20022.repository.choice.RepurchaseType5Choice.mmCode, com.tools20022.repository.choice.RepurchaseType5Choice.mmProprietary, com.tools20022.repository.choice.RepurchaseType9Choice.mmCode,
					com.tools20022.repository.choice.RepurchaseType9Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails15.mmRepurchaseType, com.tools20022.repository.choice.RepurchaseType10Choice.mmCode,
					com.tools20022.repository.choice.RepurchaseType10Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails34.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails49.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails58.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails36.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails66.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails67.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails70.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails69.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails75.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails74.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails81.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails80.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails87.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails86.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails85.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails93.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails90.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails99.mmRepurchaseType, com.tools20022.repository.choice.RepurchaseType15Choice.mmCode, com.tools20022.repository.choice.RepurchaseType15Choice.mmProprietary,
					com.tools20022.repository.choice.RepurchaseType12Choice.mmCode, com.tools20022.repository.choice.RepurchaseType12Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails95.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails91.mmRepurchaseType, com.tools20022.repository.choice.RepurchaseType13Choice.mmCode, com.tools20022.repository.choice.RepurchaseType13Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails92.mmRepurchaseType, com.tools20022.repository.choice.RepurchaseType14Choice.mmCode, com.tools20022.repository.choice.RepurchaseType14Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails101.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails111.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails112.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails110.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails108.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails115.mmRepurchaseType,
					com.tools20022.repository.choice.RepurchaseType19Choice.mmCode, com.tools20022.repository.choice.RepurchaseType19Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails117.mmRepurchaseType,
					com.tools20022.repository.choice.RepurchaseType16Choice.mmCode, com.tools20022.repository.choice.RepurchaseType16Choice.mmProprietary, com.tools20022.repository.choice.RepurchaseType17Choice.mmCode,
					com.tools20022.repository.choice.RepurchaseType17Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails116.mmRepurchaseType, com.tools20022.repository.choice.RepurchaseType20Choice.mmCode,
					com.tools20022.repository.choice.RepurchaseType20Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails128.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails120.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails119.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails125.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails126.mmRepurchaseType,
					com.tools20022.repository.choice.RepurchaseType22Choice.mmCode, com.tools20022.repository.choice.RepurchaseType22Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails127.mmRepurchaseType,
					com.tools20022.repository.choice.RepurchaseType21Choice.mmCode, com.tools20022.repository.choice.RepurchaseType21Choice.mmProprietary, com.tools20022.repository.choice.RepurchaseType23Choice.mmCode,
					com.tools20022.repository.choice.RepurchaseType23Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails121.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails134.mmRepurchaseType,
					com.tools20022.repository.msg.SettlementDetails137.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails132.mmRepurchaseType, com.tools20022.repository.choice.RepurchaseType31Choice.mmCode,
					com.tools20022.repository.choice.RepurchaseType31Choice.mmProprietary, com.tools20022.repository.msg.SettlementDetails130.mmRepurchaseType, com.tools20022.repository.choice.RepurchaseType24Choice.mmCode,
					com.tools20022.repository.choice.RepurchaseType24Choice.mmProprietary, com.tools20022.repository.choice.RepurchaseType26Choice.mmCode, com.tools20022.repository.choice.RepurchaseType26Choice.mmProprietary,
					com.tools20022.repository.msg.SettlementDetails131.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails133.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails139.mmRepurchaseType);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseType";
			definition = "Specifies the type of repurchase transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RepurchaseTypeCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPricing> endPrice;
	/**
	 * Negotiated fixed price of the security to buy it back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesFinancing
	 * SecuritiesPricing.mmRelatedSecuritiesFinancing}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1#mmEndPrice
	 * TwoLegTransactionDetails1.mmEndPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Negotiated fixed price of the security to buy it back."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEndPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TwoLegTransactionDetails1.mmEndPrice);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndPrice";
			definition = "Negotiated fixed price of the security to buy it back.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRelatedSecuritiesFinancing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected YesNoIndicator spreadTransaction;
	/**
	 * Specifies that there will be one price and one transaction when two
	 * contracts are carried out simultaneously, one to buy and the other one to
	 * sell with two different expiration dates.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmSpreadTransaction
	 * FutureOrOptionDetails1.mmSpreadTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that there will be one price and one transaction when two contracts are carried out simultaneously, one to buy and the other one to sell with two different expiration dates."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSpreadTransaction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FutureOrOptionDetails1.mmSpreadTransaction);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpreadTransaction";
			definition = "Specifies that there will be one price and one transaction when two contracts are carried out simultaneously, one to buy and the other one to sell with two different expiration dates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SecuritiesFinancingAgreement financingAgreement;
	/**
	 * Provides the contractual details related to the agreement between
	 * parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmSecuritiesFinancingTrade
	 * SecuritiesFinancingAgreement.mmSecuritiesFinancingTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
	 * SecuritiesFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmFinancingAgreement
	 * SecuritiesFinancing10.mmFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmFinancingAgreement
	 * SecuritiesFinancing1.mmFinancingAgreement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the contractual details related to the agreement between parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFinancingAgreement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancing10.mmFinancingAgreement, com.tools20022.repository.msg.SecuritiesFinancing1.mmFinancingAgreement);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancingAgreement";
			definition = "Provides the contractual details related to the agreement between parties.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancingAgreement.mmSecuritiesFinancingTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancingAgreement.mmObject();
		}
	};
	protected CurrencyAndAmount openingSettlementAmount;
	/**
	 * Total amount of money to be paid or received in exchange for the
	 * securities at the opening of a securities financing transaction.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails2.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails8.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails6.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails10.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails17.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails18.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails21.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails22.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails24.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails25.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails26.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails33.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails35.mmOpeningSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmOpeningSettlementAmount
	 * SecuritiesFinancingTransactionDetails36.mmOpeningSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOpeningSettlementAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmOpeningSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmOpeningSettlementAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmOpeningSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmOpeningSettlementAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmOpeningSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmOpeningSettlementAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmOpeningSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmOpeningSettlementAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmOpeningSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmOpeningSettlementAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmOpeningSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmOpeningSettlementAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmOpeningSettlementAmount,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmOpeningSettlementAmount);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningSettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected SecuritiesTrade closingLegExecution;
	/**
	 * Repayment of the previously received cash by one party in exchange of the
	 * return of the security by the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingClosingData
	 * SecuritiesTrade.mmSecuritiesFinancingClosingData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingLegExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repayment of the previously received cash by one party in exchange of the return of the security by the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClosingLegExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingLegExecution";
			definition = "Repayment of the previously received cash by one party in exchange of the return of the security by the counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesFinancingClosingData;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTrade.mmObject();
		}
	};
	protected SecuritiesTrade openingLegExecution;
	/**
	 * Transfer of cash to a party against the legal transfer of securities. The
	 * cash receiver agrees to buy the same security from the counterparty at a
	 * fixed price at some later date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingOpeningData
	 * SecuritiesTrade.mmSecuritiesFinancingOpeningData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningLegExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer of cash to a party against the legal transfer of securities. The cash receiver agrees to buy the same security from the counterparty at a fixed price at some later date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOpeningLegExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningLegExecution";
			definition = "Transfer of cash to a party against the legal transfer of securities. The cash receiver agrees to buy the same security from the counterparty at a fixed price at some later date.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesFinancingOpeningData;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTrade.mmObject();
		}
	};
	protected BuyOrSellIndicationOfInterest relatedIndicationOfInterest;
	/**
	 * Indication of interest process which is the source of a securities
	 * financing process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmTwoLegTransaction
	 * BuyOrSellIndicationOfInterest.mmTwoLegTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIndicationOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of interest process which is the source of a securities financing process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process which is the source of a securities financing process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmTwoLegTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Unique identification of the repurchase agreement.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmIdentification
	 * SecuritiesFinancing1.mmIdentification}</li>
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
	 * definition} = "Unique identification of the repurchase agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancing1.mmIdentification);
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identification of the repurchase agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancing";
				definition = "Process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmRelatedSecuritiesFinancing, com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesFinancingClosingData,
						com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesFinancingOpeningData, com.tools20022.repository.entity.Interest.mmSecuritiesFinancing, com.tools20022.repository.entity.Spread.mmSecuritiesFinancing,
						com.tools20022.repository.entity.SecuritiesFinancingAgreement.mmSecuritiesFinancingTrade, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmTwoLegTransaction);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TwoLegTransactionType1Choice.mmSecuritiesFinancingDetails, com.tools20022.repository.msg.TwoLegTransactionDetails1.mmOtherAmounts,
						com.tools20022.repository.msg.TwoLegTransactionDetails1.mmTwoLegTransactionType, com.tools20022.repository.msg.SingleQuote1.mmTwoLegTransactionDetails,
						com.tools20022.repository.msg.SingleOrder1.mmTwoLegTransactionDetails, com.tools20022.repository.msg.Order11.mmTwoLegTransactionDetails, com.tools20022.repository.msg.QuoteRequest1.mmTwoLegTransactionDetails);
				subType_lazy = () -> Arrays.asList(SecuritiesLending.mmObject(), RepurchaseAgreement.mmObject());
				superType_lazy = () -> SecuritiesTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesFinancing.mmReturnLegInstruction, com.tools20022.repository.entity.SecuritiesFinancing.mmType,
						com.tools20022.repository.entity.SecuritiesFinancing.mmTerminationDateTime, com.tools20022.repository.entity.SecuritiesFinancing.mmRateChangeDateTime,
						com.tools20022.repository.entity.SecuritiesFinancing.mmRevaluationIndicator, com.tools20022.repository.entity.SecuritiesFinancing.mmInterestPayment,
						com.tools20022.repository.entity.SecuritiesFinancing.mmVariableRateSupport, com.tools20022.repository.entity.SecuritiesFinancing.mmRepurchaseRate,
						com.tools20022.repository.entity.SecuritiesFinancing.mmStockLoanMargin, com.tools20022.repository.entity.SecuritiesFinancing.mmInterest, com.tools20022.repository.entity.SecuritiesFinancing.mmRepurchaseSpread,
						com.tools20022.repository.entity.SecuritiesFinancing.mmTransactionCallDelay, com.tools20022.repository.entity.SecuritiesFinancing.mmTotalNumberOfCollateralInstructions,
						com.tools20022.repository.entity.SecuritiesFinancing.mmDealAmount, com.tools20022.repository.entity.SecuritiesFinancing.mmForfeitRepurchaseAmount,
						com.tools20022.repository.entity.SecuritiesFinancing.mmPremiumAmount, com.tools20022.repository.entity.SecuritiesFinancing.mmTerminationAmountPerPieceOfCollateral,
						com.tools20022.repository.entity.SecuritiesFinancing.mmTerminationTransactionAmount, com.tools20022.repository.entity.SecuritiesFinancing.mmMaturityDateModification,
						com.tools20022.repository.entity.SecuritiesFinancing.mmEarliestCallBackDate, com.tools20022.repository.entity.SecuritiesFinancing.mmOpeningSettlementDate,
						com.tools20022.repository.entity.SecuritiesFinancing.mmRepurchaseType, com.tools20022.repository.entity.SecuritiesFinancing.mmEndPrice, com.tools20022.repository.entity.SecuritiesFinancing.mmSpreadTransaction,
						com.tools20022.repository.entity.SecuritiesFinancing.mmFinancingAgreement, com.tools20022.repository.entity.SecuritiesFinancing.mmOpeningSettlementAmount,
						com.tools20022.repository.entity.SecuritiesFinancing.mmClosingLegExecution, com.tools20022.repository.entity.SecuritiesFinancing.mmOpeningLegExecution,
						com.tools20022.repository.entity.SecuritiesFinancing.mmRelatedIndicationOfInterest, com.tools20022.repository.entity.SecuritiesFinancing.mmIdentification);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesTradeDetails6.mmObject(), RevaluationIndicator1Choice.mmObject(), SecuritiesFinancingTransactionDetails3.mmObject(), SecuritiesTradeDetails13.mmObject(),
						RevaluationIndicator2Choice.mmObject(), SecuritiesFinancingTransactionDetails5.mmObject(), SecuritiesFinancingTransactionDetails1.mmObject(), SecuritiesFinancingTransactionDetails11.mmObject(),
						SecuritiesFinancingTransactionDetails14.mmObject(), SecuritiesTradeDetails3.mmObject(), SecuritiesTradeDetails11.mmObject(), SecuritiesFinancingTransactionDetails4.mmObject(), RepurchaseType3Choice.mmObject(),
						RepurchaseType6Choice.mmObject(), RepurchaseType1Choice.mmObject(), RepurchaseType4Choice.mmObject(), RepurchaseType11Choice.mmObject(), ClosingDate1Choice.mmObject(), Revaluation2Choice.mmObject(),
						SecuritiesFinancing10.mmObject(), TwoLegTransactionDetails1.mmObject(), RepurchaseType2Choice.mmObject(), SecuritiesTradeDetails5.mmObject(), RepurchaseType7Choice.mmObject(),
						SecuritiesFinancingTransactionDetails2.mmObject(), SecuritiesFinancingTransactionDetails8.mmObject(), SecuritiesFinancingTransactionDetails7.mmObject(), RepurchaseType8Choice.mmObject(),
						RepurchaseType5Choice.mmObject(), SecuritiesTradeDetails12.mmObject(), RepurchaseType9Choice.mmObject(), SecuritiesFinancingTransactionDetails19.mmObject(), SecuritiesFinancingTransactionDetails20.mmObject(),
						SecuritiesFinancingTransactionDetails6.mmObject(), SecuritiesFinancingTransactionDetails10.mmObject(), SecuritiesFinancingTransactionDetails17.mmObject(), SecuritiesFinancingTransactionDetails18.mmObject(),
						SecuritiesFinancingTransactionDetails9.mmObject(), RepurchaseType10Choice.mmObject(), Revaluation1Choice.mmObject(), SecuritiesFinancing1.mmObject(), SecuritiesFinancingTransactionDetails21.mmObject(),
						SecuritiesTradeDetails38.mmObject(), SecuritiesTradeDetails37.mmObject(), SecuritiesTradeDetails39.mmObject(), SecuritiesFinancingTransactionDetails22.mmObject(), SecuritiesTradeDetails40.mmObject(),
						SecuritiesFinancingTransactionDetails24.mmObject(), SecuritiesFinancingTransactionDetails25.mmObject(), SecuritiesFinancingTransactionDetails26.mmObject(), SecuritiesFinancingTransactionDetails28.mmObject(),
						SecuritiesTradeDetails55.mmObject(), SecuritiesTradeDetails56.mmObject(), SecuritiesFinancingTransactionDetails27.mmObject(), SecuritiesFinancingTransactionDetails29.mmObject(),
						RevaluationIndicator3Choice.mmObject(), RepurchaseType15Choice.mmObject(), RepurchaseType12Choice.mmObject(), RepurchaseType13Choice.mmObject(), RepurchaseType14Choice.mmObject(),
						SecuritiesTradeDetails59.mmObject(), SecuritiesFinancingTransactionDetails33.mmObject(), SecuritiesFinancingTransactionDetails32.mmObject(), SecuritiesTradeDetails58.mmObject(),
						SecuritiesFinancingTransactionDetails30.mmObject(), SecuritiesFinancingTransactionDetails34.mmObject(), RevaluationIndicator4Choice.mmObject(), RepurchaseType19Choice.mmObject(), RepurchaseType16Choice.mmObject(),
						RepurchaseType17Choice.mmObject(), RepurchaseType20Choice.mmObject(), SecuritiesFinancingTransactionDetails35.mmObject(), RepurchaseType22Choice.mmObject(), RepurchaseType21Choice.mmObject(),
						RepurchaseType23Choice.mmObject(), SecuritiesFinancingTransactionDetails36.mmObject(), RepurchaseType31Choice.mmObject(), RepurchaseType24Choice.mmObject(), RepurchaseType26Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getReturnLegInstruction() {
		return returnLegInstruction;
	}

	public void setReturnLegInstruction(YesNoIndicator returnLegInstruction) {
		this.returnLegInstruction = returnLegInstruction;
	}

	public SecuritiesTransactionTypeV2Code getType() {
		return type;
	}

	public void setType(SecuritiesTransactionTypeV2Code type) {
		this.type = type;
	}

	public ISODateTime getTerminationDateTime() {
		return terminationDateTime;
	}

	public void setTerminationDateTime(ISODateTime terminationDateTime) {
		this.terminationDateTime = terminationDateTime;
	}

	public ISODateTime getRateChangeDateTime() {
		return rateChangeDateTime;
	}

	public void setRateChangeDateTime(ISODateTime rateChangeDateTime) {
		this.rateChangeDateTime = rateChangeDateTime;
	}

	public YesNoIndicator getRevaluationIndicator() {
		return revaluationIndicator;
	}

	public void setRevaluationIndicator(YesNoIndicator revaluationIndicator) {
		this.revaluationIndicator = revaluationIndicator;
	}

	public YesNoIndicator getInterestPayment() {
		return interestPayment;
	}

	public void setInterestPayment(YesNoIndicator interestPayment) {
		this.interestPayment = interestPayment;
	}

	public Max35Text getVariableRateSupport() {
		return variableRateSupport;
	}

	public void setVariableRateSupport(Max35Text variableRateSupport) {
		this.variableRateSupport = variableRateSupport;
	}

	public PercentageRate getRepurchaseRate() {
		return repurchaseRate;
	}

	public void setRepurchaseRate(PercentageRate repurchaseRate) {
		this.repurchaseRate = repurchaseRate;
	}

	public PercentageRate getStockLoanMargin() {
		return stockLoanMargin;
	}

	public void setStockLoanMargin(PercentageRate stockLoanMargin) {
		this.stockLoanMargin = stockLoanMargin;
	}

	public List<Interest> getInterest() {
		return interest;
	}

	public void setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = interest;
	}

	public Spread getRepurchaseSpread() {
		return repurchaseSpread;
	}

	public void setRepurchaseSpread(com.tools20022.repository.entity.Spread repurchaseSpread) {
		this.repurchaseSpread = repurchaseSpread;
	}

	public Max3NumericText getTransactionCallDelay() {
		return transactionCallDelay;
	}

	public void setTransactionCallDelay(Max3NumericText transactionCallDelay) {
		this.transactionCallDelay = transactionCallDelay;
	}

	public Max3NumericText getTotalNumberOfCollateralInstructions() {
		return totalNumberOfCollateralInstructions;
	}

	public void setTotalNumberOfCollateralInstructions(Max3NumericText totalNumberOfCollateralInstructions) {
		this.totalNumberOfCollateralInstructions = totalNumberOfCollateralInstructions;
	}

	public CurrencyAndAmount getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(CurrencyAndAmount dealAmount) {
		this.dealAmount = dealAmount;
	}

	public CurrencyAndAmount getForfeitRepurchaseAmount() {
		return forfeitRepurchaseAmount;
	}

	public void setForfeitRepurchaseAmount(CurrencyAndAmount forfeitRepurchaseAmount) {
		this.forfeitRepurchaseAmount = forfeitRepurchaseAmount;
	}

	public CurrencyAndAmount getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(CurrencyAndAmount premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public CurrencyAndAmount getTerminationAmountPerPieceOfCollateral() {
		return terminationAmountPerPieceOfCollateral;
	}

	public void setTerminationAmountPerPieceOfCollateral(CurrencyAndAmount terminationAmountPerPieceOfCollateral) {
		this.terminationAmountPerPieceOfCollateral = terminationAmountPerPieceOfCollateral;
	}

	public CurrencyAndAmount getTerminationTransactionAmount() {
		return terminationTransactionAmount;
	}

	public void setTerminationTransactionAmount(CurrencyAndAmount terminationTransactionAmount) {
		this.terminationTransactionAmount = terminationTransactionAmount;
	}

	public YesNoIndicator getMaturityDateModification() {
		return maturityDateModification;
	}

	public void setMaturityDateModification(YesNoIndicator maturityDateModification) {
		this.maturityDateModification = maturityDateModification;
	}

	public ISODateTime getEarliestCallBackDate() {
		return earliestCallBackDate;
	}

	public void setEarliestCallBackDate(ISODateTime earliestCallBackDate) {
		this.earliestCallBackDate = earliestCallBackDate;
	}

	public ISODateTime getOpeningSettlementDate() {
		return openingSettlementDate;
	}

	public void setOpeningSettlementDate(ISODateTime openingSettlementDate) {
		this.openingSettlementDate = openingSettlementDate;
	}

	public RepurchaseTypeCode getRepurchaseType() {
		return repurchaseType;
	}

	public void setRepurchaseType(RepurchaseTypeCode repurchaseType) {
		this.repurchaseType = repurchaseType;
	}

	public List<SecuritiesPricing> getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(List<com.tools20022.repository.entity.SecuritiesPricing> endPrice) {
		this.endPrice = endPrice;
	}

	public YesNoIndicator getSpreadTransaction() {
		return spreadTransaction;
	}

	public void setSpreadTransaction(YesNoIndicator spreadTransaction) {
		this.spreadTransaction = spreadTransaction;
	}

	public SecuritiesFinancingAgreement getFinancingAgreement() {
		return financingAgreement;
	}

	public void setFinancingAgreement(com.tools20022.repository.entity.SecuritiesFinancingAgreement financingAgreement) {
		this.financingAgreement = financingAgreement;
	}

	public CurrencyAndAmount getOpeningSettlementAmount() {
		return openingSettlementAmount;
	}

	public void setOpeningSettlementAmount(CurrencyAndAmount openingSettlementAmount) {
		this.openingSettlementAmount = openingSettlementAmount;
	}

	public SecuritiesTrade getClosingLegExecution() {
		return closingLegExecution;
	}

	public void setClosingLegExecution(SecuritiesTrade closingLegExecution) {
		this.closingLegExecution = closingLegExecution;
	}

	public SecuritiesTrade getOpeningLegExecution() {
		return openingLegExecution;
	}

	public void setOpeningLegExecution(SecuritiesTrade openingLegExecution) {
		this.openingLegExecution = openingLegExecution;
	}

	public BuyOrSellIndicationOfInterest getRelatedIndicationOfInterest() {
		return relatedIndicationOfInterest;
	}

	public void setRelatedIndicationOfInterest(com.tools20022.repository.entity.BuyOrSellIndicationOfInterest relatedIndicationOfInterest) {
		this.relatedIndicationOfInterest = relatedIndicationOfInterest;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}
}
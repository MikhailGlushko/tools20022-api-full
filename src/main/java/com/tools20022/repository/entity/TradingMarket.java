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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.MarketTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Context or geographic environment in which trading parties may meet in order
 * to negotiate and execute trades among themselves. It also identifies the
 * primary market where an asset is issued.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradingMarket" src="doc-files/TradingMarket.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradedSecurity
 * TradingMarket.mmTradedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmType
 * TradingMarket.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurity
 * TradingMarket.mmListedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmSourceOfPrice
 * TradingMarket.mmSourceOfPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradeLotSize
 * TradingMarket.mmTradeLotSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMinimumTradedNominalQuantity
 * TradingMarket.mmMinimumTradedNominalQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmListingDate
 * TradingMarket.mmListingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmRelatedOrder
 * TradingMarket.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradingCurrency
 * TradingMarket.mmTradingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmMaximumTradedNominalQuantity
 * TradingMarket.mmMaximumTradedNominalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmStockExchange
 * TradingMarket.mmStockExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmQuoteLot
 * TradingMarket.mmQuoteLot}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmRoundLot
 * TradingMarket.mmRoundLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradingSession
 * TradingMarket.mmTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurityTradingIdentification
 * TradingMarket.mmListedSecurityTradingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmDefaultCurrency
 * TradingMarket.mmDefaultCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmFirstTradingDate
 * TradingMarket.mmFirstTradingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmLastTradingDate
 * TradingMarket.mmLastTradingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmIssuance
 * TradingMarket.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmRelatedPlaceOfSettlement
 * TradingMarket.mmRelatedPlaceOfSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
 * Security.mmTradingMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
 * Security.mmPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmApplicableTradingMarket
 * SecuritiesIdentification.mmApplicableTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumTradedQuantityMarket
 * SecuritiesQuantity.mmMinimumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumTradedQuantityMarket
 * SecuritiesQuantity.mmMaximumTradedQuantityMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmTradeLotMarket
 * LotBreakdown.mmTradeLotMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmQuoteLotMarket
 * LotBreakdown.mmQuoteLotMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmRoundLotMarket
 * LotBreakdown.mmRoundLotMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmIssuePlace
 * Issuance.mmIssuePlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#mmMarketIdentification
 * SourceOfPrice.mmMarketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPlaceOfTrade
 * SecuritiesOrder.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingSession#mmMarket
 * TradingSession.mmMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PlaceOfSettlement#mmSettlementMarket
 * PlaceOfSettlement.mmSettlementMarket}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StockExchange#mmMarket
 * StockExchange.mmMarket}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification4#mmIdentification
 * MarketIdentification4.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification5#mmIdentification
 * MarketIdentification5.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification8#mmIdentification
 * MarketIdentification8.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification2#mmIdentification
 * MarketIdentification2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification7#mmIdentification
 * MarketIdentification7.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification9#mmIdentification
 * MarketIdentification9.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification6#mmIdentification
 * MarketIdentification6.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification10#mmIdentification
 * MarketIdentification10.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification13#mmIdentification
 * MarketIdentification13.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartialFill1#mmPlaceOfTrade
 * PartialFill1.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder3#mmPlaceOfTrade
 * RedemptionBulkOrder3.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder4#mmPlaceOfTrade
 * RedemptionBulkOrder4.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmPlaceOfTrade
 * RedemptionMultipleExecution3.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder4#mmPlaceOfTrade
 * RedemptionMultipleOrder4.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3#mmPlaceOfTrade
 * SubscriptionBulkOrder3.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution3#mmPlaceOfTrade
 * SubscriptionBulkExecution3.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4#mmPlaceOfTrade
 * SubscriptionBulkOrder4.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder3#mmPlaceOfTrade
 * SubscriptionMultipleOrder3.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution3#mmPlaceOfTrade
 * SubscriptionMultipleExecution3.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder4#mmPlaceOfTrade
 * SubscriptionMultipleOrder4.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification20#mmIdentification
 * MarketIdentification20.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation2#mmPlaceOfTrade
 * SettlementObligation2.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmPlaceOfTrade
 * SettlementObligation4.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification21#mmIdentification
 * MarketIdentification21.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg2#mmPlaceOfTrade
 * TradeLeg2.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg5#mmPlaceOfTrade
 * TradeLeg5.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg1#mmPlaceOfTrade
 * TradeLeg1.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#mmPlaceOfTrade
 * TradeLeg3.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#mmPlaceOfTrade
 * TradeLeg6.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg4#mmPlaceOfTrade
 * TradeLeg4.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg7#mmPlaceOfTrade
 * TradeLeg7.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder5#mmPlaceOfTrade
 * RedemptionMultipleOrder5.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution4#mmPlaceOfTrade
 * RedemptionMultipleExecution4.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder5#mmPlaceOfTrade
 * SubscriptionMultipleOrder5.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution4#mmPlaceOfTrade
 * SubscriptionMultipleExecution4.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification3#mmIdentification
 * MarketIdentification3.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification78#mmIdentification
 * MarketIdentification78.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification79#mmIdentification
 * MarketIdentification79.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification80#mmIdentification
 * MarketIdentification80.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification82#mmIdentification
 * MarketIdentification82.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmPlaceOfTrade
 * TradeLeg8.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification84#mmIdentification
 * MarketIdentification84.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#mmPlaceOfTrade
 * TradeLeg10.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification85#mmIdentification
 * MarketIdentification85.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmPlaceOfTrade
 * TradeLeg9.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmPlaceOfTrade
 * SettlementObligation8.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransaction1#mmTradeVenue
 * SecuritiesTransaction1.mmTradeVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification89#mmIdentification
 * MarketIdentification89.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification90#mmIdentification
 * MarketIdentification90.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketIdentification91#mmIdentification
 * MarketIdentification91.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmPlaceOfTrade
 * SwitchExecution7.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5#mmPlaceOfTrade
 * SubscriptionBulkOrder5.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmPlaceOfTrade
 * RedemptionMultipleExecution5.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder6#mmPlaceOfTrade
 * RedemptionMultipleOrder6.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleOrder6#mmPlaceOfTrade
 * SubscriptionMultipleOrder6.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkExecution4#mmPlaceOfTrade
 * SubscriptionBulkExecution4.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder7#mmPlaceOfTrade
 * SwitchOrder7.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkOrder6#mmPlaceOfTrade
 * RedemptionBulkOrder6.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionMultipleExecution5#mmPlaceOfTrade
 * SubscriptionMultipleExecution5.mmPlaceOfTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LocalMarketAnnex
 * LocalMarketAnnex}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LocalMarketAnnex2
 * LocalMarketAnnex2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketIdentification1Choice
 * MarketIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType3Choice
 * MarketType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification4
 * MarketIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType2Choice
 * MarketType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification5
 * MarketIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketIdentification3Choice
 * MarketIdentification3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketIdentification2Choice
 * MarketIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType6Choice
 * MarketType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification8
 * MarketIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketIdentification4Choice
 * MarketIdentification4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketTypeFormat1Choice
 * MarketTypeFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification2
 * MarketIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketTypeFormat2Choice
 * MarketTypeFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification7
 * MarketIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType5Choice
 * MarketType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification9
 * MarketIdentification9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType4Choice
 * MarketType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification6
 * MarketIdentification6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType7Choice
 * MarketType7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification10
 * MarketIdentification10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification1
 * MarketIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType11Choice
 * MarketType11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification77
 * MarketIdentification77}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType12Choice
 * MarketType12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification13
 * MarketIdentification13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice
 * PlaceOfTradeIdentification1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification2Choice
 * PlaceOfTradeIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType8Choice
 * MarketType8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification20
 * MarketIdentification20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType9Choice
 * MarketType9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification21
 * MarketIdentification21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification3Choice
 * PlaceOfTradeIdentification3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradingParameters1
 * TradingParameters1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType1Choice
 * MarketType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification3
 * MarketIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification78
 * MarketIdentification78}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification79
 * MarketIdentification79}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification80
 * MarketIdentification80}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification82
 * MarketIdentification82}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification84
 * MarketIdentification84}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification85
 * MarketIdentification85}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradingVenueAttributes1
 * TradingVenueAttributes1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification89
 * MarketIdentification89}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType15Choice
 * MarketType15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification90
 * MarketIdentification90}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType16Choice
 * MarketType16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarketType17Choice
 * MarketType17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketIdentification91
 * MarketIdentification91}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketDetail2 MarketDetail2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractSize1 ContractSize1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingMarket"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Context or geographic environment in which trading parties may meet in order to negotiate and execute trades among themselves. It also identifies the primary market where an asset is issued."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class TradingMarket extends Market {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Security> tradedSecurity;
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
	 * Security.mmTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security which is traded on a specific market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, List<Security>> mmTradedSecurity = new MMBusinessAssociationEnd<TradingMarket, List<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradedSecurity";
			definition = "Security which is traded on a specific market.";
			minOccurs = 0;
			opposite_lazy = () -> Security.mmTradingMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public List<Security> getValue(TradingMarket obj) {
			return obj.getTradedSecurity();
		}

		@Override
		public void setValue(TradingMarket obj, List<Security> value) {
			obj.setTradedSecurity(value);
		}
	};
	protected MarketTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode
	 * MarketTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType3Choice#mmCode
	 * MarketType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType3Choice#mmProprietary
	 * MarketType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification4#mmType
	 * MarketIdentification4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType2Choice#mmCode
	 * MarketType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType2Choice#mmProprietary
	 * MarketType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification5#mmType
	 * MarketIdentification5.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType6Choice#mmCode
	 * MarketType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType6Choice#mmProprietary
	 * MarketType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification8#mmType
	 * MarketIdentification8.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketTypeFormat1Choice#mmCode
	 * MarketTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketTypeFormat1Choice#mmProprietary
	 * MarketTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification2#mmType
	 * MarketIdentification2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketTypeFormat2Choice#mmCode
	 * MarketTypeFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketTypeFormat2Choice#mmProprietary
	 * MarketTypeFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification7#mmType
	 * MarketIdentification7.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType5Choice#mmCode
	 * MarketType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType5Choice#mmProprietary
	 * MarketType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification9#mmType
	 * MarketIdentification9.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType4Choice#mmCode
	 * MarketType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType4Choice#mmProprietary
	 * MarketType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification6#mmType
	 * MarketIdentification6.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType7Choice#mmCode
	 * MarketType7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType7Choice#mmProprietary
	 * MarketType7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification10#mmType
	 * MarketIdentification10.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification1#mmType
	 * MarketIdentification1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType11Choice#mmCode
	 * MarketType11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType11Choice#mmProprietary
	 * MarketType11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification77#mmType
	 * MarketIdentification77.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType12Choice#mmCode
	 * MarketType12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType12Choice#mmProprietary
	 * MarketType12Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification13#mmType
	 * MarketIdentification13.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType8Choice#mmCode
	 * MarketType8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType8Choice#mmProprietary
	 * MarketType8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification20#mmType
	 * MarketIdentification20.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType9Choice#mmCode
	 * MarketType9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType9Choice#mmProprietary
	 * MarketType9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification21#mmType
	 * MarketIdentification21.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType1Choice#mmCode
	 * MarketType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType1Choice#mmProprietary
	 * MarketType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification3#mmType
	 * MarketIdentification3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification78#mmType
	 * MarketIdentification78.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification79#mmType
	 * MarketIdentification79.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification80#mmType
	 * MarketIdentification80.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification82#mmType
	 * MarketIdentification82.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification84#mmType
	 * MarketIdentification84.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification85#mmType
	 * MarketIdentification85.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification89#mmType
	 * MarketIdentification89.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType15Choice#mmCode
	 * MarketType15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType15Choice#mmProprietary
	 * MarketType15Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification90#mmType
	 * MarketIdentification90.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType16Choice#mmCode
	 * MarketType16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType16Choice#mmProprietary
	 * MarketType16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType17Choice#mmCode
	 * MarketType17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MarketType17Choice#mmProprietary
	 * MarketType17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification91#mmType
	 * MarketIdentification91.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmCategory
	 * MarketIdentification92.mmCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of a market in which transactions take place."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradingMarket, MarketTypeCode> mmType = new MMBusinessAttribute<TradingMarket, MarketTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(MarketType3Choice.mmCode, MarketType3Choice.mmProprietary, MarketIdentification4.mmType, MarketType2Choice.mmCode, MarketType2Choice.mmProprietary, MarketIdentification5.mmType,
					MarketType6Choice.mmCode, MarketType6Choice.mmProprietary, MarketIdentification8.mmType, MarketTypeFormat1Choice.mmCode, MarketTypeFormat1Choice.mmProprietary, MarketIdentification2.mmType,
					MarketTypeFormat2Choice.mmCode, MarketTypeFormat2Choice.mmProprietary, MarketIdentification7.mmType, MarketType5Choice.mmCode, MarketType5Choice.mmProprietary, MarketIdentification9.mmType, MarketType4Choice.mmCode,
					MarketType4Choice.mmProprietary, MarketIdentification6.mmType, MarketType7Choice.mmCode, MarketType7Choice.mmProprietary, MarketIdentification10.mmType, MarketIdentification1.mmType, MarketType11Choice.mmCode,
					MarketType11Choice.mmProprietary, MarketIdentification77.mmType, MarketType12Choice.mmCode, MarketType12Choice.mmProprietary, MarketIdentification13.mmType, MarketType8Choice.mmCode, MarketType8Choice.mmProprietary,
					MarketIdentification20.mmType, MarketType9Choice.mmCode, MarketType9Choice.mmProprietary, MarketIdentification21.mmType, MarketType1Choice.mmCode, MarketType1Choice.mmProprietary, MarketIdentification3.mmType,
					MarketIdentification78.mmType, MarketIdentification79.mmType, MarketIdentification80.mmType, MarketIdentification82.mmType, MarketIdentification84.mmType, MarketIdentification85.mmType, MarketIdentification89.mmType,
					MarketType15Choice.mmCode, MarketType15Choice.mmProprietary, MarketIdentification90.mmType, MarketType16Choice.mmCode, MarketType16Choice.mmProprietary, MarketType17Choice.mmCode, MarketType17Choice.mmProprietary,
					MarketIdentification91.mmType, MarketIdentification92.mmCategory);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of a market in which transactions take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarketTypeCode.mmObject();
		}

		@Override
		public MarketTypeCode getValue(TradingMarket obj) {
			return obj.getType();
		}

		@Override
		public void setValue(TradingMarket obj, MarketTypeCode value) {
			obj.setType(value);
		}
	};
	protected List<Security> listedSecurity;
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security whch is listed on a specific market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, List<Security>> mmListedSecurity = new MMBusinessAssociationEnd<TradingMarket, List<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListedSecurity";
			definition = "Security whch is listed on a specific market.";
			minOccurs = 0;
			opposite_lazy = () -> Security.mmPlaceOfListing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public List<Security> getValue(TradingMarket obj) {
			return obj.getListedSecurity();
		}

		@Override
		public void setValue(TradingMarket obj, List<Security> value) {
			obj.setListedSecurity(value);
		}
	};
	protected SourceOfPrice sourceOfPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SourceOfPrice
	 * SourceOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#mmMarketIdentification
	 * SourceOfPrice.mmMarketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which provides a price on a market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, Optional<SourceOfPrice>> mmSourceOfPrice = new MMBusinessAssociationEnd<TradingMarket, Optional<SourceOfPrice>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SourceOfPrice";
			definition = "Party which provides a price on a market.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SourceOfPrice.mmMarketIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SourceOfPrice.mmObject();
		}

		@Override
		public Optional<SourceOfPrice> getValue(TradingMarket obj) {
			return obj.getSourceOfPrice();
		}

		@Override
		public void setValue(TradingMarket obj, Optional<SourceOfPrice> value) {
			obj.setSourceOfPrice(value.orElse(null));
		}
	};
	protected LotBreakdown tradeLotSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmTradeLotMarket
	 * LotBreakdown.mmTradeLotMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmTradeLotSize
	 * FinancialInstrumentAttributes1.mmTradeLotSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmTradeLotSize
	 * TradingParameters1.mmTradeLotSize}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContractSize1#mmLotSize
	 * ContractSize1.mmLotSize}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLotSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of securities that have to be traded in one lot ."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, LotBreakdown> mmTradeLotSize = new MMBusinessAssociationEnd<TradingMarket, LotBreakdown>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmTradeLotSize, TradingParameters1.mmTradeLotSize, ContractSize1.mmLotSize);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeLotSize";
			definition = "Specifies the number of securities that have to be traded in one lot .";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> LotBreakdown.mmTradeLotMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LotBreakdown.mmObject();
		}

		@Override
		public LotBreakdown getValue(TradingMarket obj) {
			return obj.getTradeLotSize();
		}

		@Override
		public void setValue(TradingMarket obj, LotBreakdown value) {
			obj.setTradeLotSize(value);
		}
	};
	protected SecuritiesQuantity minimumTradedNominalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumTradedQuantityMarket
	 * SecuritiesQuantity.mmMinimumTradedQuantityMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmMinimumTradedNominalQuantity
	 * FinancialInstrumentAttributes1.mmMinimumTradedNominalQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmMinimumQuantity
	 * Debt2.mmMinimumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmMinimumTradedNominalQuantity
	 * TradingParameters1.mmMinimumTradedNominalQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmMinimumQuantity
	 * Debt3.mmMinimumQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTradedNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum number of securities that can be traded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, SecuritiesQuantity> mmMinimumTradedNominalQuantity = new MMBusinessAssociationEnd<TradingMarket, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmMinimumTradedNominalQuantity, Debt2.mmMinimumQuantity, TradingParameters1.mmMinimumTradedNominalQuantity, Debt3.mmMinimumQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumTradedNominalQuantity";
			definition = "Minimum number of securities that can be traded.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmMinimumTradedQuantityMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(TradingMarket obj) {
			return obj.getMinimumTradedNominalQuantity();
		}

		@Override
		public void setValue(TradingMarket obj, SecuritiesQuantity value) {
			obj.setMinimumTradedNominalQuantity(value);
		}
	};
	protected ISODateTime listingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmListingDate
	 * FinancialInstrumentAttributes1.mmListingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmListingDate
	 * CommonFinancialInstrumentAttributes1.mmListingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmListingDate
	 * CommonFinancialInstrumentAttributes4.mmListingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the security is listed at the specific exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradingMarket, ISODateTime> mmListingDate = new MMBusinessAttribute<TradingMarket, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmListingDate, CommonFinancialInstrumentAttributes1.mmListingDate, CommonFinancialInstrumentAttributes4.mmListingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListingDate";
			definition = "Date/time at which the security is listed at the specific exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(TradingMarket obj) {
			return obj.getListingDate();
		}

		@Override
		public void setValue(TradingMarket obj, ISODateTime value) {
			obj.setListingDate(value);
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPlaceOfTrade
	 * SecuritiesOrder.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a place of trade is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, Optional<SecuritiesOrder>> mmRelatedOrder = new MMBusinessAssociationEnd<TradingMarket, Optional<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a place of trade is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmPlaceOfTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public Optional<SecuritiesOrder> getValue(TradingMarket obj) {
			return obj.getRelatedOrder();
		}

		@Override
		public void setValue(TradingMarket obj, Optional<SecuritiesOrder> value) {
			obj.setRelatedOrder(value.orElse(null));
		}
	};
	protected CurrencyCode tradingCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation3#mmTradingCurrency
	 * SettlementObligation3.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation5#mmTradingCurrency
	 * SettlementObligation5.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg2#mmTradingCurrency
	 * TradeLeg2.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradingCurrency
	 * TradeLeg5.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg1#mmTradingCurrency
	 * TradeLeg1.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg3#mmTradingCurrency
	 * TradeLeg3.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradingCurrency
	 * TradeLeg6.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg4#mmTradingCurrency
	 * TradeLeg4.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg7#mmTradingCurrency
	 * TradeLeg7.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingCurrency
	 * TradeLeg8.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradingCurrency
	 * TradeLeg10.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradingCurrency
	 * TradeLeg9.mmTradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmTradingCurrency
	 * Trade2.mmTradingCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade1#mmTradingCurrency
	 * Trade1.mmTradingCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the trading."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradingMarket, CurrencyCode> mmTradingCurrency = new MMBusinessAttribute<TradingMarket, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation3.mmTradingCurrency, SettlementObligation5.mmTradingCurrency, TradeLeg2.mmTradingCurrency, TradeLeg5.mmTradingCurrency, TradeLeg1.mmTradingCurrency,
					TradeLeg3.mmTradingCurrency, TradeLeg6.mmTradingCurrency, TradeLeg4.mmTradingCurrency, TradeLeg7.mmTradingCurrency, TradeLeg8.mmTradingCurrency, TradeLeg10.mmTradingCurrency, TradeLeg9.mmTradingCurrency,
					Trade2.mmTradingCurrency, Trade1.mmTradingCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingCurrency";
			definition = "Currency of the trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(TradingMarket obj) {
			return obj.getTradingCurrency();
		}

		@Override
		public void setValue(TradingMarket obj, CurrencyCode value) {
			obj.setTradingCurrency(value);
		}
	};
	protected SecuritiesQuantity maximumTradedNominalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumTradedQuantityMarket
	 * SecuritiesQuantity.mmMaximumTradedQuantityMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmMaximumTradedNominalQuantity
	 * TradingParameters1.mmMaximumTradedNominalQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumTradedNominalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Miaximum number of securities that can be traded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, SecuritiesQuantity> mmMaximumTradedNominalQuantity = new MMBusinessAssociationEnd<TradingMarket, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(TradingParameters1.mmMaximumTradedNominalQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumTradedNominalQuantity";
			definition = "Miaximum number of securities that can be traded.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmMaximumTradedQuantityMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(TradingMarket obj) {
			return obj.getMaximumTradedNominalQuantity();
		}

		@Override
		public void setValue(TradingMarket obj, SecuritiesQuantity value) {
			obj.setMaximumTradedNominalQuantity(value);
		}
	};
	protected StockExchange stockExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StockExchange
	 * StockExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StockExchange#mmMarket
	 * StockExchange.mmMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stock exchange which operates on a specific market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, Optional<StockExchange>> mmStockExchange = new MMBusinessAssociationEnd<TradingMarket, Optional<StockExchange>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockExchange";
			definition = "Stock exchange which operates on a specific market.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StockExchange.mmMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StockExchange.mmObject();
		}

		@Override
		public Optional<StockExchange> getValue(TradingMarket obj) {
			return obj.getStockExchange();
		}

		@Override
		public void setValue(TradingMarket obj, Optional<StockExchange> value) {
			obj.setStockExchange(value.orElse(null));
		}
	};
	protected LotBreakdown quoteLot;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmQuoteLotMarket
	 * LotBreakdown.mmQuoteLotMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Lot size associated with the price. Most exchanges require that pricing be quoted in round lot size. However, some exchanges have pricing quoted in many different lot sizes, for example, Latin America, some Asian markets, Turkey."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, LotBreakdown> mmQuoteLot = new MMBusinessAssociationEnd<TradingMarket, LotBreakdown>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuoteLot";
			definition = "Lot size associated with the price. Most exchanges require that pricing be quoted in round lot size. However, some exchanges have pricing quoted in many different lot sizes, for example, Latin America, some Asian markets, Turkey.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> LotBreakdown.mmQuoteLotMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LotBreakdown.mmObject();
		}

		@Override
		public LotBreakdown getValue(TradingMarket obj) {
			return obj.getQuoteLot();
		}

		@Override
		public void setValue(TradingMarket obj, LotBreakdown value) {
			obj.setQuoteLot(value);
		}
	};
	protected LotBreakdown roundLot;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmRoundLotMarket
	 * LotBreakdown.mmRoundLotMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingParameters1#mmRoundLot
	 * TradingParameters1.mmRoundLot}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, LotBreakdown> mmRoundLot = new MMBusinessAssociationEnd<TradingMarket, LotBreakdown>() {
		{
			derivation_lazy = () -> Arrays.asList(TradingParameters1.mmRoundLot);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundLot";
			definition = "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> LotBreakdown.mmRoundLotMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LotBreakdown.mmObject();
		}

		@Override
		public LotBreakdown getValue(TradingMarket obj) {
			return obj.getRoundLot();
		}

		@Override
		public void setValue(TradingMarket obj, LotBreakdown value) {
			obj.setRoundLot(value);
		}
	};
	protected List<com.tools20022.repository.entity.TradingSession> tradingSession;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmMarket
	 * TradingSession.mmMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading session associated with a market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, List<TradingSession>> mmTradingSession = new MMBusinessAssociationEnd<TradingMarket, List<TradingSession>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingSession";
			definition = "Trading session associated with a market.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.mmMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
		}

		@Override
		public List<TradingSession> getValue(TradingMarket obj) {
			return obj.getTradingSession();
		}

		@Override
		public void setValue(TradingMarket obj, List<TradingSession> value) {
			obj.setTradingSession(value);
		}
	};
	protected SecuritiesIdentification listedSecurityTradingIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmApplicableTradingMarket
	 * SecuritiesIdentification.mmApplicableTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListedSecurityTradingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading identification used on this trading market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, SecuritiesIdentification> mmListedSecurityTradingIdentification = new MMBusinessAssociationEnd<TradingMarket, SecuritiesIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ListedSecurityTradingIdentification";
			definition = "Trading identification used on this trading market.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesIdentification.mmApplicableTradingMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}

		@Override
		public SecuritiesIdentification getValue(TradingMarket obj) {
			return obj.getListedSecurityTradingIdentification();
		}

		@Override
		public void setValue(TradingMarket obj, SecuritiesIdentification value) {
			obj.setListedSecurityTradingIdentification(value);
		}
	};
	protected CurrencyCode defaultCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Default currency for the securities trading on this market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradingMarket, CurrencyCode> mmDefaultCurrency = new MMBusinessAttribute<TradingMarket, CurrencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefaultCurrency";
			definition = "Default currency for the securities trading on this market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(TradingMarket obj) {
			return obj.getDefaultCurrency();
		}

		@Override
		public void setValue(TradingMarket obj, CurrencyCode value) {
			obj.setDefaultCurrency(value);
		}
	};
	protected ISODateTime firstTradingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstTradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First date/time at which the security is eligible for trading."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradingMarket, ISODateTime> mmFirstTradingDate = new MMBusinessAttribute<TradingMarket, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstTradingDate";
			definition = "First date/time at which the security is eligible for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(TradingMarket obj) {
			return obj.getFirstTradingDate();
		}

		@Override
		public void setValue(TradingMarket obj, ISODateTime value) {
			obj.setFirstTradingDate(value);
		}
	};
	protected ISODateTime lastTradingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastTradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time at which the security is eligible for trading."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradingMarket, ISODateTime> mmLastTradingDate = new MMBusinessAttribute<TradingMarket, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LastTradingDate";
			definition = "Last date/time at which the security is eligible for trading.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(TradingMarket obj) {
			return obj.getLastTradingDate();
		}

		@Override
		public void setValue(TradingMarket obj, ISODateTime value) {
			obj.setLastTradingDate(value);
		}
	};
	protected Issuance issuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssuePlace
	 * Issuance.mmIssuePlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which the place has been defined."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, com.tools20022.repository.entity.Issuance> mmIssuance = new MMBusinessAssociationEnd<TradingMarket, com.tools20022.repository.entity.Issuance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Issuance for which the place has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmIssuePlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Issuance getValue(TradingMarket obj) {
			return obj.getIssuance();
		}

		@Override
		public void setValue(TradingMarket obj, com.tools20022.repository.entity.Issuance value) {
			obj.setIssuance(value);
		}
	};
	protected PlaceOfSettlement relatedPlaceOfSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PlaceOfSettlement
	 * PlaceOfSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PlaceOfSettlement#mmSettlementMarket
	 * PlaceOfSettlement.mmSettlementMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPlaceOfSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of settlement for which a settlement market is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradingMarket, PlaceOfSettlement> mmRelatedPlaceOfSettlement = new MMBusinessAssociationEnd<TradingMarket, PlaceOfSettlement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPlaceOfSettlement";
			definition = "Place of settlement for which a settlement market is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PlaceOfSettlement.mmSettlementMarket;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PlaceOfSettlement.mmObject();
		}

		@Override
		public PlaceOfSettlement getValue(TradingMarket obj) {
			return obj.getRelatedPlaceOfSettlement();
		}

		@Override
		public void setValue(TradingMarket obj, PlaceOfSettlement value) {
			obj.setRelatedPlaceOfSettlement(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingMarket";
				definition = "Context or geographic environment in which trading parties may meet in order to negotiate and execute trades among themselves. It also identifies the primary market where an asset is issued.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmTradingMarket, Security.mmPlaceOfListing, SecuritiesIdentification.mmApplicableTradingMarket, SecuritiesQuantity.mmMinimumTradedQuantityMarket,
						SecuritiesQuantity.mmMaximumTradedQuantityMarket, LotBreakdown.mmTradeLotMarket, LotBreakdown.mmQuoteLotMarket, LotBreakdown.mmRoundLotMarket, com.tools20022.repository.entity.Issuance.mmIssuePlace,
						com.tools20022.repository.entity.SourceOfPrice.mmMarketIdentification, SecuritiesOrder.mmPlaceOfTrade, com.tools20022.repository.entity.TradingSession.mmMarket, PlaceOfSettlement.mmSettlementMarket,
						com.tools20022.repository.entity.StockExchange.mmMarket);
				derivationElement_lazy = () -> Arrays.asList(MarketIdentification4.mmIdentification, MarketIdentification5.mmIdentification, MarketIdentification8.mmIdentification, MarketIdentification2.mmIdentification,
						MarketIdentification7.mmIdentification, MarketIdentification9.mmIdentification, MarketIdentification6.mmIdentification, MarketIdentification10.mmIdentification, MarketIdentification13.mmIdentification,
						PartialFill1.mmPlaceOfTrade, RedemptionBulkOrder3.mmPlaceOfTrade, RedemptionBulkOrder4.mmPlaceOfTrade, RedemptionMultipleExecution3.mmPlaceOfTrade, RedemptionMultipleOrder4.mmPlaceOfTrade,
						SubscriptionBulkOrder3.mmPlaceOfTrade, SubscriptionBulkExecution3.mmPlaceOfTrade, SubscriptionBulkOrder4.mmPlaceOfTrade, SubscriptionMultipleOrder3.mmPlaceOfTrade, SubscriptionMultipleExecution3.mmPlaceOfTrade,
						SubscriptionMultipleOrder4.mmPlaceOfTrade, MarketIdentification20.mmIdentification, SettlementObligation2.mmPlaceOfTrade, SettlementObligation4.mmPlaceOfTrade, MarketIdentification21.mmIdentification,
						TradeLeg2.mmPlaceOfTrade, TradeLeg5.mmPlaceOfTrade, TradeLeg1.mmPlaceOfTrade, TradeLeg3.mmPlaceOfTrade, TradeLeg6.mmPlaceOfTrade, TradeLeg4.mmPlaceOfTrade, TradeLeg7.mmPlaceOfTrade,
						RedemptionMultipleOrder5.mmPlaceOfTrade, RedemptionMultipleExecution4.mmPlaceOfTrade, SubscriptionMultipleOrder5.mmPlaceOfTrade, SubscriptionMultipleExecution4.mmPlaceOfTrade, MarketIdentification3.mmIdentification,
						MarketIdentification78.mmIdentification, MarketIdentification79.mmIdentification, MarketIdentification80.mmIdentification, MarketIdentification82.mmIdentification, TradeLeg8.mmPlaceOfTrade,
						MarketIdentification84.mmIdentification, TradeLeg10.mmPlaceOfTrade, MarketIdentification85.mmIdentification, TradeLeg9.mmPlaceOfTrade, SettlementObligation8.mmPlaceOfTrade, SecuritiesTransaction1.mmTradeVenue,
						MarketIdentification89.mmIdentification, MarketIdentification90.mmIdentification, MarketIdentification91.mmIdentification, SwitchExecution7.mmPlaceOfTrade, SubscriptionBulkOrder5.mmPlaceOfTrade,
						RedemptionMultipleExecution5.mmPlaceOfTrade, RedemptionMultipleOrder6.mmPlaceOfTrade, SubscriptionMultipleOrder6.mmPlaceOfTrade, SubscriptionBulkExecution4.mmPlaceOfTrade, SwitchOrder7.mmPlaceOfTrade,
						RedemptionBulkOrder6.mmPlaceOfTrade, SubscriptionMultipleExecution5.mmPlaceOfTrade);
				superType_lazy = () -> Market.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradingMarket.mmTradedSecurity, com.tools20022.repository.entity.TradingMarket.mmType, com.tools20022.repository.entity.TradingMarket.mmListedSecurity,
						com.tools20022.repository.entity.TradingMarket.mmSourceOfPrice, com.tools20022.repository.entity.TradingMarket.mmTradeLotSize, com.tools20022.repository.entity.TradingMarket.mmMinimumTradedNominalQuantity,
						com.tools20022.repository.entity.TradingMarket.mmListingDate, com.tools20022.repository.entity.TradingMarket.mmRelatedOrder, com.tools20022.repository.entity.TradingMarket.mmTradingCurrency,
						com.tools20022.repository.entity.TradingMarket.mmMaximumTradedNominalQuantity, com.tools20022.repository.entity.TradingMarket.mmStockExchange, com.tools20022.repository.entity.TradingMarket.mmQuoteLot,
						com.tools20022.repository.entity.TradingMarket.mmRoundLot, com.tools20022.repository.entity.TradingMarket.mmTradingSession, com.tools20022.repository.entity.TradingMarket.mmListedSecurityTradingIdentification,
						com.tools20022.repository.entity.TradingMarket.mmDefaultCurrency, com.tools20022.repository.entity.TradingMarket.mmFirstTradingDate, com.tools20022.repository.entity.TradingMarket.mmLastTradingDate,
						com.tools20022.repository.entity.TradingMarket.mmIssuance, com.tools20022.repository.entity.TradingMarket.mmRelatedPlaceOfSettlement);
				derivationComponent_lazy = () -> Arrays.asList(LocalMarketAnnex.mmObject(), LocalMarketAnnex2.mmObject(), MarketIdentification1Choice.mmObject(), MarketType3Choice.mmObject(), MarketIdentification4.mmObject(),
						MarketType2Choice.mmObject(), MarketIdentification5.mmObject(), MarketIdentification3Choice.mmObject(), MarketIdentification2Choice.mmObject(), MarketType6Choice.mmObject(), MarketIdentification8.mmObject(),
						MarketIdentification4Choice.mmObject(), MarketTypeFormat1Choice.mmObject(), MarketIdentification2.mmObject(), MarketTypeFormat2Choice.mmObject(), MarketIdentification7.mmObject(), MarketType5Choice.mmObject(),
						MarketIdentification9.mmObject(), MarketType4Choice.mmObject(), MarketIdentification6.mmObject(), MarketType7Choice.mmObject(), MarketIdentification10.mmObject(), MarketIdentification1.mmObject(),
						MarketType11Choice.mmObject(), MarketIdentification77.mmObject(), MarketType12Choice.mmObject(), MarketIdentification13.mmObject(), PlaceOfTradeIdentification1Choice.mmObject(),
						PlaceOfTradeIdentification2Choice.mmObject(), MarketType8Choice.mmObject(), MarketIdentification20.mmObject(), MarketType9Choice.mmObject(), MarketIdentification21.mmObject(),
						PlaceOfTradeIdentification3Choice.mmObject(), TradingParameters1.mmObject(), MarketType1Choice.mmObject(), MarketIdentification3.mmObject(), MarketIdentification78.mmObject(), MarketIdentification79.mmObject(),
						MarketIdentification80.mmObject(), MarketIdentification82.mmObject(), MarketIdentification84.mmObject(), MarketIdentification85.mmObject(), TradingVenueAttributes1.mmObject(), MarketIdentification89.mmObject(),
						MarketType15Choice.mmObject(), MarketIdentification90.mmObject(), MarketType16Choice.mmObject(), MarketType17Choice.mmObject(), MarketIdentification91.mmObject(), MarketDetail2.mmObject(), ContractSize1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradingMarket.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Security> getTradedSecurity() {
		return tradedSecurity == null ? tradedSecurity = new ArrayList<>() : tradedSecurity;
	}

	public TradingMarket setTradedSecurity(List<Security> tradedSecurity) {
		this.tradedSecurity = Objects.requireNonNull(tradedSecurity);
		return this;
	}

	public MarketTypeCode getType() {
		return type;
	}

	public TradingMarket setType(MarketTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public List<Security> getListedSecurity() {
		return listedSecurity == null ? listedSecurity = new ArrayList<>() : listedSecurity;
	}

	public TradingMarket setListedSecurity(List<Security> listedSecurity) {
		this.listedSecurity = Objects.requireNonNull(listedSecurity);
		return this;
	}

	public Optional<SourceOfPrice> getSourceOfPrice() {
		return sourceOfPrice == null ? Optional.empty() : Optional.of(sourceOfPrice);
	}

	public TradingMarket setSourceOfPrice(com.tools20022.repository.entity.SourceOfPrice sourceOfPrice) {
		this.sourceOfPrice = sourceOfPrice;
		return this;
	}

	public LotBreakdown getTradeLotSize() {
		return tradeLotSize;
	}

	public TradingMarket setTradeLotSize(LotBreakdown tradeLotSize) {
		this.tradeLotSize = Objects.requireNonNull(tradeLotSize);
		return this;
	}

	public SecuritiesQuantity getMinimumTradedNominalQuantity() {
		return minimumTradedNominalQuantity;
	}

	public TradingMarket setMinimumTradedNominalQuantity(SecuritiesQuantity minimumTradedNominalQuantity) {
		this.minimumTradedNominalQuantity = Objects.requireNonNull(minimumTradedNominalQuantity);
		return this;
	}

	public ISODateTime getListingDate() {
		return listingDate;
	}

	public TradingMarket setListingDate(ISODateTime listingDate) {
		this.listingDate = Objects.requireNonNull(listingDate);
		return this;
	}

	public Optional<SecuritiesOrder> getRelatedOrder() {
		return relatedOrder == null ? Optional.empty() : Optional.of(relatedOrder);
	}

	public TradingMarket setRelatedOrder(SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
		return this;
	}

	public CurrencyCode getTradingCurrency() {
		return tradingCurrency;
	}

	public TradingMarket setTradingCurrency(CurrencyCode tradingCurrency) {
		this.tradingCurrency = Objects.requireNonNull(tradingCurrency);
		return this;
	}

	public SecuritiesQuantity getMaximumTradedNominalQuantity() {
		return maximumTradedNominalQuantity;
	}

	public TradingMarket setMaximumTradedNominalQuantity(SecuritiesQuantity maximumTradedNominalQuantity) {
		this.maximumTradedNominalQuantity = Objects.requireNonNull(maximumTradedNominalQuantity);
		return this;
	}

	public Optional<StockExchange> getStockExchange() {
		return stockExchange == null ? Optional.empty() : Optional.of(stockExchange);
	}

	public TradingMarket setStockExchange(com.tools20022.repository.entity.StockExchange stockExchange) {
		this.stockExchange = stockExchange;
		return this;
	}

	public LotBreakdown getQuoteLot() {
		return quoteLot;
	}

	public TradingMarket setQuoteLot(LotBreakdown quoteLot) {
		this.quoteLot = Objects.requireNonNull(quoteLot);
		return this;
	}

	public LotBreakdown getRoundLot() {
		return roundLot;
	}

	public TradingMarket setRoundLot(LotBreakdown roundLot) {
		this.roundLot = Objects.requireNonNull(roundLot);
		return this;
	}

	public List<TradingSession> getTradingSession() {
		return tradingSession == null ? tradingSession = new ArrayList<>() : tradingSession;
	}

	public TradingMarket setTradingSession(List<com.tools20022.repository.entity.TradingSession> tradingSession) {
		this.tradingSession = Objects.requireNonNull(tradingSession);
		return this;
	}

	public SecuritiesIdentification getListedSecurityTradingIdentification() {
		return listedSecurityTradingIdentification;
	}

	public TradingMarket setListedSecurityTradingIdentification(SecuritiesIdentification listedSecurityTradingIdentification) {
		this.listedSecurityTradingIdentification = Objects.requireNonNull(listedSecurityTradingIdentification);
		return this;
	}

	public CurrencyCode getDefaultCurrency() {
		return defaultCurrency;
	}

	public TradingMarket setDefaultCurrency(CurrencyCode defaultCurrency) {
		this.defaultCurrency = Objects.requireNonNull(defaultCurrency);
		return this;
	}

	public ISODateTime getFirstTradingDate() {
		return firstTradingDate;
	}

	public TradingMarket setFirstTradingDate(ISODateTime firstTradingDate) {
		this.firstTradingDate = Objects.requireNonNull(firstTradingDate);
		return this;
	}

	public ISODateTime getLastTradingDate() {
		return lastTradingDate;
	}

	public TradingMarket setLastTradingDate(ISODateTime lastTradingDate) {
		this.lastTradingDate = Objects.requireNonNull(lastTradingDate);
		return this;
	}

	public Issuance getIssuance() {
		return issuance;
	}

	public TradingMarket setIssuance(com.tools20022.repository.entity.Issuance issuance) {
		this.issuance = Objects.requireNonNull(issuance);
		return this;
	}

	public PlaceOfSettlement getRelatedPlaceOfSettlement() {
		return relatedPlaceOfSettlement;
	}

	public TradingMarket setRelatedPlaceOfSettlement(PlaceOfSettlement relatedPlaceOfSettlement) {
		this.relatedPlaceOfSettlement = Objects.requireNonNull(relatedPlaceOfSettlement);
		return this;
	}
}
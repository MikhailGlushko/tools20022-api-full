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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3Number;
import com.tools20022.repository.entity.SecuritiesFinancing;
import com.tools20022.repository.entity.TradeOriginatorRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Details of the securities trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmPlaceOfTrade
 * SecuritiesTradeDetails56.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmPlaceOfClearing
 * SecuritiesTradeDetails56.mmPlaceOfClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmTradeDate
 * SecuritiesTradeDetails56.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmOpeningSettlementDate
 * SecuritiesTradeDetails56.mmOpeningSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmDealPrice
 * SecuritiesTradeDetails56.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmNumberOfDaysAccrued
 * SecuritiesTradeDetails56.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmReporting
 * SecuritiesTradeDetails56.mmReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmTradeTransactionCondition
 * SecuritiesTradeDetails56.mmTradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmInvestorCapacity
 * SecuritiesTradeDetails56.mmInvestorCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmTradeOriginatorRole
 * SecuritiesTradeDetails56.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmCurrencyToBuyOrSell
 * SecuritiesTradeDetails56.mmCurrencyToBuyOrSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmAffirmationStatus
 * SecuritiesTradeDetails56.mmAffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmMatchingStatus
 * SecuritiesTradeDetails56.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmSettlementInstructionProcessingAdditionalDetails
 * SecuritiesTradeDetails56.mmSettlementInstructionProcessingAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmFXAdditionalDetails
 * SecuritiesTradeDetails56.mmFXAdditionalDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
 * SecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06#mmTradeDetails
 * SecuritiesFinancingInstructionV06.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07#mmTradeDetails
 * SecuritiesFinancingInstructionV07.mmTradeDetails}</li>
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
 * "SecuritiesTradeDetails56"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the securities trade."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37
 * SecuritiesTradeDetails37}</li>
 * </ul>
 */
public class SecuritiesTradeDetails56 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PlaceOfTradeIdentification1 placeOfTrade;
	/**
	 * Market in which a trade transaction has been executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification1
	 * PlaceOfTradeIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTradingMarket
	 * Security.mmTradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market in which a trade transaction has been executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmPlaceOfTrade
	 * SecuritiesTradeDetails37.mmPlaceOfTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfTrade = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.mmTradingMarket;
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which a trade transaction has been executed.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmPlaceOfTrade;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PlaceOfTradeIdentification1.mmObject();
		}
	};
	protected PlaceOfClearingIdentification1 placeOfClearing;
	/**
	 * Infrastructure which may be a component of a clearing house and wich
	 * facilitates clearing and settlement for its members by standing between
	 * the buyer and the seller. It may net transactions and it substitutes
	 * itself as settlement counterparty for each position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PlaceOfClearingIdentification1
	 * PlaceOfClearingIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfClr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Infrastructure which may be a component of a clearing house and wich facilitates clearing and settlement for its members by standing between the buyer and the seller. It may net transactions and it substitutes itself as settlement counterparty for each position."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmPlaceOfClearing
	 * SecuritiesTradeDetails37.mmPlaceOfClearing}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfClearing = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "PlcOfClr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfClearing";
			definition = "Infrastructure which may be a component of a clearing house and wich facilitates clearing and settlement for its members by standing between the buyer and the seller. It may net transactions and it substitutes itself as settlement counterparty for each position.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmPlaceOfClearing;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PlaceOfClearingIdentification1.mmObject();
		}
	};
	protected TradeDate5Choice tradeDate;
	/**
	 * Specifies the date/time on which the trade was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.TradeDate5Choice
	 * TradeDate5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmTradeDate
	 * SecuritiesTradeDetails37.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.mmTradeDateTime;
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeDate5Choice.mmObject();
		}
	};
	protected DateAndDateTimeChoice openingSettlementDate;
	/**
	 * Date and time at which the securities are to be delivered or received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningSettlementDate
	 * SecuritiesFinancing.mmOpeningSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be delivered or received."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmOpeningSettlementDate
	 * SecuritiesTradeDetails37.mmOpeningSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOpeningSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmOpeningSettlementDate;
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "OpngSttlmDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningSettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmOpeningSettlementDate;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected Price2 dealPrice;
	/**
	 * Specifies the price of the traded financial instrument. This is the deal
	 * price of the individual trade transaction. If there is only one trade
	 * transaction for the execution of the trade, then the deal price could
	 * equal the executed trade price (unless, for example, the price includes
	 * commissions or rounding, or some other factor has been applied to the
	 * deal price or the executed trade price, or both).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price2 Price2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
	 * SecuritiesTradeExecution.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmDealPrice
	 * SecuritiesTradeDetails37.mmDealPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDealPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "DealPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Specifies the price of the traded financial instrument.\nThis is the deal price of the individual trade transaction. \nIf there is only one trade transaction for the execution of the trade, then the deal price could equal the executed trade price (unless, for example, the price includes commissions or rounding, or some other factor has been applied to the deal price or the executed trade price, or both).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmDealPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price2.mmObject();
		}
	};
	protected Max3Number numberOfDaysAccrued;
	/**
	 * Number of days on which the interest rate accrues (daily accrual note).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDaysAcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of days on which the interest rate accrues (daily accrual note)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails37.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfDaysAccrued = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Number of days on which the interest rate accrues (daily accrual note).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmNumberOfDaysAccrued;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}
	};
	protected List<Reporting6Choice> reporting;
	/**
	 * Specifies that a trade is to be reported to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Reporting6Choice
	 * Reporting6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a trade is to be reported to a third party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmReporting
	 * SecuritiesTradeDetails37.mmReporting}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReporting = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "Rptg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Specifies that a trade is to be reported to a third party.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmReporting;
			minOccurs = 0;
			complexType_lazy = () -> Reporting6Choice.mmObject();
		}
	};
	protected List<TradeTransactionCondition5Choice> tradeTransactionCondition;
	/**
	 * Indicates the conditions under which the order/trade is to be/was
	 * executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition5Choice
	 * TradeTransactionCondition5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeTransactionCondition
	 * SecuritiesTrade.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradTxCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmTradeTransactionCondition
	 * SecuritiesTradeDetails37.mmTradeTransactionCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeTransactionCondition = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmTradeTransactionCondition;
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "TradTxCond";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmTradeTransactionCondition;
			minOccurs = 0;
			complexType_lazy = () -> TradeTransactionCondition5Choice.mmObject();
		}
	};
	protected InvestorCapacity4Choice investorCapacity;
	/**
	 * Specifies the role of the investor in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity4Choice
	 * InvestorCapacity4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole#mmCapacity
	 * InvestorRole.mmCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role of the investor in the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmInvestorCapacity
	 * SecuritiesTradeDetails37.mmInvestorCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestorCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestorRole.mmCapacity;
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "InvstrCpcty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCapacity";
			definition = "Specifies the role of the investor in the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmInvestorCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestorCapacity4Choice.mmObject();
		}
	};
	protected TradeOriginator3Choice tradeOriginatorRole;
	/**
	 * Specifies the role of the trading party in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator3Choice
	 * TradeOriginator3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeOriginatorRole
	 * TradeOriginatorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradOrgtrRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeOriginatorRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role of the trading party in the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmTradeOriginatorRole
	 * SecuritiesTradeDetails37.mmTradeOriginatorRole}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeOriginatorRole = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TradeOriginatorRole.mmObject();
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "TradOrgtrRole";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeOriginatorRole";
			definition = "Specifies the role of the trading party in the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmTradeOriginatorRole;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradeOriginator3Choice.mmObject();
		}
	};
	protected CurrencyToBuyOrSell1Choice currencyToBuyOrSell;
	/**
	 * Account servicer is instructed to buy the indicated currency after the
	 * receipt of cash proceeds or to sell the indicated currency in order to
	 * obtain the necessary currency to fund the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CurrencyToBuyOrSell1Choice
	 * CurrencyToBuyOrSell1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyToBuyOrSell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds or to sell the indicated currency in order to obtain the necessary currency to fund the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmCurrencyToBuyOrSell
	 * SecuritiesTradeDetails37.mmCurrencyToBuyOrSell}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyToBuyOrSell = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "CcyToBuyOrSell";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSell";
			definition = "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds or to sell the indicated currency in order to obtain the necessary currency to fund the transaction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmCurrencyToBuyOrSell;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CurrencyToBuyOrSell1Choice.mmObject();
		}
	};
	protected AffirmationStatus8Choice affirmationStatus;
	/**
	 * Status of affirmation of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus8Choice
	 * AffirmationStatus8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAffirmationStatus
	 * SecuritiesTradeStatus.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AffirmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of affirmation of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmAffirmationStatus
	 * SecuritiesTradeDetails37.mmAffirmationStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAffirmationStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmAffirmationStatus;
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "AffirmSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmAffirmationStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AffirmationStatus8Choice.mmObject();
		}
	};
	protected MatchingStatus27Choice matchingStatus;
	/**
	 * Provides the matching status of the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus27Choice
	 * MatchingStatus27Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the matching status of the instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmMatchingStatus
	 * SecuritiesTradeDetails37.mmMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchingStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "MtchgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmMatchingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus27Choice.mmObject();
		}
	};
	protected Max350Text settlementInstructionProcessingAdditionalDetails;
	/**
	 * Provides additional settlement processing information which can not be
	 * included within the structured fields of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmInstrPrcgAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionProcessingAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional settlement processing information which can not be included within the structured fields of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmSettlementInstructionProcessingAdditionalDetails
	 * SecuritiesTradeDetails37.
	 * mmSettlementInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementInstructionProcessingAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "SttlmInstrPrcgAddtlDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmSettlementInstructionProcessingAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max350Text fXAdditionalDetails;
	/**
	 * Provides additional details pertaining to foreign exchange instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExchangeRateInformation
	 * PaymentObligation.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional details pertaining to foreign exchange instructions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmFXAdditionalDetails
	 * SecuritiesTradeDetails37.mmFXAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFXAdditionalDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmExchangeRateInformation;
			componentContext_lazy = () -> SecuritiesTradeDetails56.mmObject();
			isDerived = false;
			xmlTag = "FxAddtlDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXAdditionalDetails";
			definition = "Provides additional details pertaining to foreign exchange instructions.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails37.mmFXAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails56.mmPlaceOfTrade, com.tools20022.repository.msg.SecuritiesTradeDetails56.mmPlaceOfClearing,
						com.tools20022.repository.msg.SecuritiesTradeDetails56.mmTradeDate, com.tools20022.repository.msg.SecuritiesTradeDetails56.mmOpeningSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails56.mmDealPrice,
						com.tools20022.repository.msg.SecuritiesTradeDetails56.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails56.mmReporting,
						com.tools20022.repository.msg.SecuritiesTradeDetails56.mmTradeTransactionCondition, com.tools20022.repository.msg.SecuritiesTradeDetails56.mmInvestorCapacity,
						com.tools20022.repository.msg.SecuritiesTradeDetails56.mmTradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails56.mmCurrencyToBuyOrSell,
						com.tools20022.repository.msg.SecuritiesTradeDetails56.mmAffirmationStatus, com.tools20022.repository.msg.SecuritiesTradeDetails56.mmMatchingStatus,
						com.tools20022.repository.msg.SecuritiesTradeDetails56.mmSettlementInstructionProcessingAdditionalDetails, com.tools20022.repository.msg.SecuritiesTradeDetails56.mmFXAdditionalDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06.mmTradeDetails, com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07.mmTradeDetails);
				trace_lazy = () -> SecuritiesFinancing.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeDetails56";
				definition = "Details of the securities trade.";
				previousVersion_lazy = () -> SecuritiesTradeDetails37.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PlaceOfTradeIdentification1 getPlaceOfTrade() {
		return placeOfTrade;
	}

	public void setPlaceOfTrade(com.tools20022.repository.msg.PlaceOfTradeIdentification1 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
	}

	public PlaceOfClearingIdentification1 getPlaceOfClearing() {
		return placeOfClearing;
	}

	public void setPlaceOfClearing(com.tools20022.repository.msg.PlaceOfClearingIdentification1 placeOfClearing) {
		this.placeOfClearing = placeOfClearing;
	}

	public TradeDate5Choice getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(TradeDate5Choice tradeDate) {
		this.tradeDate = tradeDate;
	}

	public DateAndDateTimeChoice getOpeningSettlementDate() {
		return openingSettlementDate;
	}

	public void setOpeningSettlementDate(DateAndDateTimeChoice openingSettlementDate) {
		this.openingSettlementDate = openingSettlementDate;
	}

	public Price2 getDealPrice() {
		return dealPrice;
	}

	public void setDealPrice(com.tools20022.repository.msg.Price2 dealPrice) {
		this.dealPrice = dealPrice;
	}

	public Max3Number getNumberOfDaysAccrued() {
		return numberOfDaysAccrued;
	}

	public void setNumberOfDaysAccrued(Max3Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
	}

	public List<Reporting6Choice> getReporting() {
		return reporting;
	}

	public void setReporting(List<Reporting6Choice> reporting) {
		this.reporting = reporting;
	}

	public List<TradeTransactionCondition5Choice> getTradeTransactionCondition() {
		return tradeTransactionCondition;
	}

	public void setTradeTransactionCondition(List<TradeTransactionCondition5Choice> tradeTransactionCondition) {
		this.tradeTransactionCondition = tradeTransactionCondition;
	}

	public InvestorCapacity4Choice getInvestorCapacity() {
		return investorCapacity;
	}

	public void setInvestorCapacity(InvestorCapacity4Choice investorCapacity) {
		this.investorCapacity = investorCapacity;
	}

	public TradeOriginator3Choice getTradeOriginatorRole() {
		return tradeOriginatorRole;
	}

	public void setTradeOriginatorRole(TradeOriginator3Choice tradeOriginatorRole) {
		this.tradeOriginatorRole = tradeOriginatorRole;
	}

	public CurrencyToBuyOrSell1Choice getCurrencyToBuyOrSell() {
		return currencyToBuyOrSell;
	}

	public void setCurrencyToBuyOrSell(CurrencyToBuyOrSell1Choice currencyToBuyOrSell) {
		this.currencyToBuyOrSell = currencyToBuyOrSell;
	}

	public AffirmationStatus8Choice getAffirmationStatus() {
		return affirmationStatus;
	}

	public void setAffirmationStatus(AffirmationStatus8Choice affirmationStatus) {
		this.affirmationStatus = affirmationStatus;
	}

	public MatchingStatus27Choice getMatchingStatus() {
		return matchingStatus;
	}

	public void setMatchingStatus(MatchingStatus27Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
	}

	public Max350Text getSettlementInstructionProcessingAdditionalDetails() {
		return settlementInstructionProcessingAdditionalDetails;
	}

	public void setSettlementInstructionProcessingAdditionalDetails(Max350Text settlementInstructionProcessingAdditionalDetails) {
		this.settlementInstructionProcessingAdditionalDetails = settlementInstructionProcessingAdditionalDetails;
	}

	public Max350Text getFXAdditionalDetails() {
		return fXAdditionalDetails;
	}

	public void setFXAdditionalDetails(Max350Text fXAdditionalDetails) {
		this.fXAdditionalDetails = fXAdditionalDetails;
	}
}
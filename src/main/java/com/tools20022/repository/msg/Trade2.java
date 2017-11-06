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
import com.tools20022.repository.choice.SecurityIdentification22Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.TreasuryTrade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Details of the foreign exchange trade including spot\forward\NDF\swap that is
 * confirmed .
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmTradeIdentification
 * Trade2.mmTradeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmTradeDate
 * Trade2.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Trade2#mmForeignExchangeTradeProduct
 * Trade2.mmForeignExchangeTradeProduct}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmTradingCurrency
 * Trade2.mmTradingCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmSettlementCurrency
 * Trade2.mmSettlementCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmTradingMethod
 * Trade2.mmTradingMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmTradingMode
 * Trade2.mmTradingMode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmClearingMethod
 * Trade2.mmClearingMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmSymbol
 * Trade2.mmSymbol}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmPlaceOfConfirmation
 * Trade2.mmPlaceOfConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Trade2#mmForeignExchangeDetails
 * Trade2.mmForeignExchangeDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmSwapLeg
 * Trade2.mmSwapLeg}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trade2#mmProductIdentification
 * Trade2.mmProductIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Trade2#mmAssociatedTradeReference
 * Trade2.mmAssociatedTradeReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
 * TreasuryTrade}</li>
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
 * "Trade2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the foreign exchange trade including spot\\forward\\NDF\\swap that is confirmed ."
 * </li>
 * </ul>
 */
public class Trade2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text tradeIdentification;
	/**
	 * Unique reference identification assigned to the trade by the instructing
	 * party. This reference will be used throughout the trade life cycle to
	 * identify the particular trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identification assigned to the trade by the instructing party. This reference will be used throughout the trade life cycle to identify the particular trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "TradId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeIdentification";
			definition = "Unique reference identification assigned to the trade by the instructing party. This reference will be used throughout the trade life cycle to identify the particular trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODate tradeDate;
	/**
	 * Specifies the date on which the trade was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
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
	 * definition} = "Specifies the date on which the trade was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.mmTradeDateTime;
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected UnderlyingProductIdentifier1Code foreignExchangeTradeProduct;
	/**
	 * Specifies the underlying product type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code
	 * UnderlyingProductIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXTradPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeTradeProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying product type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignExchangeTradeProduct = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "FXTradPdct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeTradeProduct";
			definition = "Specifies the underlying product type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingProductIdentifier1Code.mmObject();
		}
	};
	protected CurrencyCode tradingCurrency;
	/**
	 * Specifies the ISO code of the trade currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradingCurrency
	 * TradingMarket.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the ISO code of the trade currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmTradingCurrency;
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "TradgCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCurrency";
			definition = "Specifies the ISO code of the trade currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected CurrencyCode settlementCurrency;
	/**
	 * Settlement currency of the trade, agreed by both sides of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement currency of the trade, agreed by both sides of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Settlement currency of the trade, agreed by both sides of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected TradingMethodType1Code tradingMethod;
	/**
	 * Identifies the type of trading method.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code
	 * TradingMethodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of trading method."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "TradgMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingMethod";
			definition = "Identifies the type of trading method.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradingMethodType1Code.mmObject();
		}
	};
	protected TradingModeType1Code tradingMode;
	/**
	 * Identifies the type of the trade mode.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code
	 * TradingModeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgMd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingMode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of the trade mode."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingMode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "TradgMd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingMode";
			definition = "Identifies the type of the trade mode.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingModeType1Code.mmObject();
		}
	};
	protected ClearingMethod1Code clearingMethod;
	/**
	 * Clearing method of the trade, agreed by both sides of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingMethod1Code
	 * ClearingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing method of the trade, agreed by both sides of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "ClrMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMethod";
			definition = "Clearing method of the trade, agreed by both sides of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingMethod1Code.mmObject();
		}
	};
	protected Max35Text symbol;
	/**
	 * Symbol of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Symb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Symbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Symbol of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSymbol = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "Symb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Symbol";
			definition = "Symbol of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AnyBICIdentifier placeOfConfirmation;
	/**
	 * Infrastructure where the trade confirmation will take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Market#mmGeographicalEnvironment
	 * Market.mmGeographicalEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Infrastructure where the trade confirmation will take place."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfConfirmation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Market.mmGeographicalEnvironment;
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "PlcOfConf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfConfirmation";
			definition = "Infrastructure where the trade confirmation will take place.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	protected Trade3 foreignExchangeDetails;
	/**
	 * Provides details of the foreign exchange trade including Spot Forward and
	 * NDF.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Trade3 Trade3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the foreign exchange trade including Spot Forward and NDF."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForeignExchangeDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Provides details of the foreign exchange trade including Spot Forward and NDF.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Trade3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InstrumentLeg6> swapLeg;
	/**
	 * Provides details about each leg of the multileg instrument (foreign
	 * exchange swap).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InstrumentLeg6
	 * InstrumentLeg6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwpLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwapLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about each leg of the multileg instrument (foreign exchange swap)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSwapLeg = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "SwpLeg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwapLeg";
			definition = "Provides details about each leg of the multileg instrument (foreign exchange swap).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstrumentLeg6.mmObject();
		}
	};
	protected SecurityIdentification22Choice productIdentification;
	/**
	 * Identification of the treasury trade product, as assigned under a formal
	 * or proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice
	 * SecurityIdentification22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the treasury trade product, as assigned under a formal or proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProductIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmIdentification;
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "PdctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductIdentification";
			definition = "Identification of the treasury trade product, as assigned under a formal or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification22Choice.mmObject();
		}
	};
	protected List<Max70Text> associatedTradeReference;
	/**
	 * Some associated trade reference needs to be specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trade2
	 * Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssoctdTradRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedTradeReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Some associated trade reference needs to be specified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAssociatedTradeReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Trade2.mmObject();
			isDerived = false;
			xmlTag = "AssoctdTradRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedTradeReference";
			definition = "Some associated trade reference needs to be specified.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Trade2.mmTradeIdentification, com.tools20022.repository.msg.Trade2.mmTradeDate, com.tools20022.repository.msg.Trade2.mmForeignExchangeTradeProduct,
						com.tools20022.repository.msg.Trade2.mmTradingCurrency, com.tools20022.repository.msg.Trade2.mmSettlementCurrency, com.tools20022.repository.msg.Trade2.mmTradingMethod,
						com.tools20022.repository.msg.Trade2.mmTradingMode, com.tools20022.repository.msg.Trade2.mmClearingMethod, com.tools20022.repository.msg.Trade2.mmSymbol, com.tools20022.repository.msg.Trade2.mmPlaceOfConfirmation,
						com.tools20022.repository.msg.Trade2.mmForeignExchangeDetails, com.tools20022.repository.msg.Trade2.mmSwapLeg, com.tools20022.repository.msg.Trade2.mmProductIdentification,
						com.tools20022.repository.msg.Trade2.mmAssociatedTradeReference);
				trace_lazy = () -> TreasuryTrade.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Trade2";
				definition = "Details of the foreign exchange trade including spot\\forward\\NDF\\swap that is confirmed .";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTradeIdentification() {
		return tradeIdentification;
	}

	public void setTradeIdentification(Max35Text tradeIdentification) {
		this.tradeIdentification = tradeIdentification;
	}

	public ISODate getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(ISODate tradeDate) {
		this.tradeDate = tradeDate;
	}

	public UnderlyingProductIdentifier1Code getForeignExchangeTradeProduct() {
		return foreignExchangeTradeProduct;
	}

	public void setForeignExchangeTradeProduct(UnderlyingProductIdentifier1Code foreignExchangeTradeProduct) {
		this.foreignExchangeTradeProduct = foreignExchangeTradeProduct;
	}

	public CurrencyCode getTradingCurrency() {
		return tradingCurrency;
	}

	public void setTradingCurrency(CurrencyCode tradingCurrency) {
		this.tradingCurrency = tradingCurrency;
	}

	public CurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(CurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	public TradingMethodType1Code getTradingMethod() {
		return tradingMethod;
	}

	public void setTradingMethod(TradingMethodType1Code tradingMethod) {
		this.tradingMethod = tradingMethod;
	}

	public TradingModeType1Code getTradingMode() {
		return tradingMode;
	}

	public void setTradingMode(TradingModeType1Code tradingMode) {
		this.tradingMode = tradingMode;
	}

	public ClearingMethod1Code getClearingMethod() {
		return clearingMethod;
	}

	public void setClearingMethod(ClearingMethod1Code clearingMethod) {
		this.clearingMethod = clearingMethod;
	}

	public Max35Text getSymbol() {
		return symbol;
	}

	public void setSymbol(Max35Text symbol) {
		this.symbol = symbol;
	}

	public AnyBICIdentifier getPlaceOfConfirmation() {
		return placeOfConfirmation;
	}

	public void setPlaceOfConfirmation(AnyBICIdentifier placeOfConfirmation) {
		this.placeOfConfirmation = placeOfConfirmation;
	}

	public Trade3 getForeignExchangeDetails() {
		return foreignExchangeDetails;
	}

	public void setForeignExchangeDetails(com.tools20022.repository.msg.Trade3 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
	}

	public List<InstrumentLeg6> getSwapLeg() {
		return swapLeg;
	}

	public void setSwapLeg(List<com.tools20022.repository.msg.InstrumentLeg6> swapLeg) {
		this.swapLeg = swapLeg;
	}

	public SecurityIdentification22Choice getProductIdentification() {
		return productIdentification;
	}

	public void setProductIdentification(SecurityIdentification22Choice productIdentification) {
		this.productIdentification = productIdentification;
	}

	public List<Max70Text> getAssociatedTradeReference() {
		return associatedTradeReference;
	}

	public void setAssociatedTradeReference(List<Max70Text> associatedTradeReference) {
		this.associatedTradeReference = associatedTradeReference;
	}
}
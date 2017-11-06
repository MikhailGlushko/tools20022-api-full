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
import com.tools20022.repository.choice.RateType1Choice;
import com.tools20022.repository.choice.RateType2Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.ExchangeRateTypeCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information needed to process a currency exchange or conversion.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CurrencyExchange" src="doc-files/CurrencyExchange.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmOriginalAmount
 * CurrencyExchange.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForForeignExchangeTrade
 * CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmUnitCurrency
 * CurrencyExchange.mmUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotedCurrency
 * CurrencyExchange.mmQuotedCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
 * CurrencyExchange.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmResultingAmount
 * CurrencyExchange.mmResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedCorporateActionEvent
 * CurrencyExchange.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesBalance
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotationDate
 * CurrencyExchange.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCalculatedAssetValue
 * CurrencyExchange.mmCalculatedAssetValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmSourceCurrency
 * CurrencyExchange.mmSourceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTargetCurrency
 * CurrencyExchange.mmTargetCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCashEntry
 * CurrencyExchange.mmCurrencyExchangeForCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedPayment
 * CurrencyExchange.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRateType
 * CurrencyExchange.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedLimitManagement
 * CurrencyExchange.mmRelatedLimitManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmFixingConditions
 * CurrencyExchange.mmFixingConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTax
 * CurrencyExchange.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedInvoice
 * CurrencyExchange.mmRelatedInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForTransactionAdministrator
 * CurrencyExchange.mmCurrencyExchangeForTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmReportedAccount
 * CurrencyExchange.mmReportedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCorporateActionCashEntitlement
 * CurrencyExchange.mmCurrencyExchangeForCorporateActionCashEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmPaymentExecution
 * CurrencyExchange.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesQuote
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesConversion
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCashDistribution
 * CurrencyExchange.mmCurrencyExchangeForCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmAdjustment
 * CurrencyExchange.mmAdjustment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmCurrencyExchange
 * Account.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCurrencyExchange
 * Tax.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCurrencyExchange
 * Adjustment.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
 * Payment.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCurrencyExchange
 * CashEntry.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
 * AssetHolding.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCurrencyExchange
 * PaymentExecution.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCurrencyExchange
 * TransactionAdministrator.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
 * ForeignExchangeTrade.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionUnitCurrency
 * SecuritiesConversion.mmConversionUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
 * SecuritiesBalance.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
 * CorporateActionEvent.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmExchangeRate
 * CorporateActionCashEntitlement.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFixingRate
 * FixingCondition.mmFixingRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmCurrencyExchange
 * Invoice.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmCurrencyExchange
 * LiquidityManagementLimit.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmDistributionCurrencyExchangeInformation
 * CashDistribution.mmDistributionCurrencyExchangeInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmQuotedRate
 * Quote.mmQuotedRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmForeignExchangeDetails
 * TaxVoucher1.mmForeignExchangeDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11
 * ForeignExchangeTerms11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12
 * ForeignExchangeTerms12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13
 * ForeignExchangeTerms13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15
 * ForeignExchangeTerms15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19
 * ForeignExchangeTerms19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5
 * ForeignExchangeTerms5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1
 * ForeignExchangeTerms1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2
 * ForeignExchangeTerms2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3
 * ForeignExchangeTerms3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6
 * ForeignExchangeTerms6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14
 * ForeignExchangeTerms14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16
 * ForeignExchangeTerms16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyReferenceDetails
 * CurrencyReferenceDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchange4
 * CurrencyExchange4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18
 * ForeignExchangeTerms18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchange3
 * CurrencyExchange3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchange5
 * CurrencyExchange5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRateInformation1
 * ExchangeRateInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRate1 ExchangeRate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate1 AgreedRate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate2 AgreedRate2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4
 * ForeignExchangeTerms4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7
 * ForeignExchangeTerms7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8
 * ForeignExchangeTerms8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9
 * ForeignExchangeTerms9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyReference2
 * CurrencyReference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchangeSearchCriteria
 * CurrencyExchangeSearchCriteria}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchangeDetails
 * CurrencyExchangeDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17
 * ForeignExchangeTerms17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchange6
 * CurrencyExchange6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10
 * ForeignExchangeTerms10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType1Choice
 * RateType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType2Choice
 * RateType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencySourceTarget1
 * CurrencySourceTarget1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchange7
 * CurrencyExchange7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion1
 * CurrencyConversion1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDesignation1
 * CurrencyDesignation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion3
 * CurrencyConversion3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion2
 * CurrencyConversion2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchange1
 * ForeignExchange1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion4
 * CurrencyConversion4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion5
 * CurrencyConversion5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22
 * ForeignExchangeTerms22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23
 * ForeignExchangeTerms23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24
 * ForeignExchangeTerms24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate3 AgreedRate3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26
 * ForeignExchangeTerms26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28
 * ForeignExchangeTerms28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27
 * ForeignExchangeTerms27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31
 * ForeignExchangeTerms31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion7
 * CurrencyConversion7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion6
 * CurrencyConversion6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion8
 * CurrencyConversion8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion9
 * CurrencyConversion9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion10
 * CurrencyConversion10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33
 * ForeignExchangeTerms33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32
 * ForeignExchangeTerms32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyReference3
 * CurrencyReference3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion13
 * CurrencyConversion13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion12
 * CurrencyConversion12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion11
 * CurrencyConversion11}</li>
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
 * "CurrencyExchange"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information needed to process a currency exchange or conversion."</li>
 * </ul>
 */
public class CurrencyExchange {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount originalAmount;
	/**
	 * Amount in its original currency when conversion from/into another
	 * currency has occurred.
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection8#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection8.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection32.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection9.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection12#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection12.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection33.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection17#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection17.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmOriginalAmount
	 * CorporateActionAmounts2.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmOriginalAmount
	 * CorporateActionAmounts5.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmOriginalAmount
	 * CorporateActionAmounts11.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmOriginalAmount
	 * CorporateActionAmounts12.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmOriginalAmount
	 * CorporateActionAmounts17.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmOriginalAmount
	 * CorporateActionAmounts20.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmOriginalAmount
	 * CorporateActionAmounts23.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmOriginalAmount
	 * CorporateActionAmounts24.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmOriginalAmount
	 * CorporateActionAmounts3.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmOriginalAmount
	 * CorporateActionAmounts6.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmOriginalAmount
	 * CorporateActionAmounts9.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmOriginalAmount
	 * CorporateActionAmounts13.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmOriginalAmount
	 * CorporateActionAmounts16.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmOriginalAmount
	 * CorporateActionAmounts19.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmOriginalAmount
	 * CorporateActionAmounts22.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmOriginalAmount
	 * CorporateActionAmounts25.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmOriginalAmount
	 * CorporateActionAmounts4.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmOriginalAmount
	 * CorporateActionAmounts7.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmOriginalAmount
	 * CorporateActionAmounts10.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmOriginalAmount
	 * CorporateActionAmounts14.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmOriginalAmount
	 * CorporateActionAmounts15.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmOriginalAmount
	 * CorporateActionAmounts18.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmOriginalAmount
	 * CorporateActionAmounts21.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmOriginalAmount
	 * CorporateActionAmounts26.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection24#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection24.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection2.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection16.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection1#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection1.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection29.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection28.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmOriginalCurrencyAmount
	 * OtherAmounts16.mmOriginalCurrencyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#mmTransactionAmount
	 * AmountAndCurrencyExchange2.mmTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmTransactionAmount
	 * AmountAndCurrencyExchange3.mmTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmOriginalAmount
	 * CorporateActionRate2.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmOriginalAmount
	 * CorporateActionAmounts1.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#mmOriginalAmount
	 * ForeignExchangeTerms9.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection10#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection10.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection22#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection22.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection11#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection11.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection25#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection25.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection27#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection27.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection36.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection37.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmOriginalAmount
	 * CorporateActionAmounts29.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmOriginalAmount
	 * CorporateActionAmounts27.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmOriginalAmount
	 * CorporateActionAmounts28.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmOriginalAmount
	 * CorporateActionAmounts33.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmOriginalAmount
	 * CorporateActionAmounts32.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmOriginalAmount
	 * CorporateActionAmounts35.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection38.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection40.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmOriginalAmount
	 * CurrencyConversion1.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmOriginalAmount
	 * CurrencyConversion2.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#mmTransactionNominalAmount
	 * ForeignExchangeSwapTransaction1.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmOriginalAmount
	 * CurrencyConversion4.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection46.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection49#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection49.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection48#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection48.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection44.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection45.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection51#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection51.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmOriginalAmount
	 * CorporateActionAmounts37.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmOriginalAmount
	 * CorporateActionAmounts36.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmOriginalAmount
	 * CorporateActionAmounts38.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmOriginalAmount
	 * CorporateActionAmounts39.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmOriginalAmount
	 * CorporateActionAmounts41.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmOriginalAmount
	 * CorporateActionAmounts40.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection66#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection66.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection60.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection71#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection71.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection85.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection55#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection55.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection58#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection58.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection67#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection67.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#mmTransactionNominalAmount
	 * ForeignExchangeSwapTransaction2.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmOriginalAmount
	 * CurrencyConversion6.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmOriginalAmount
	 * CurrencyConversion9.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmTransactionNominalAmount
	 * ForeignExchangeSwapTransaction3.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmOriginalAmount
	 * CurrencyConversion12.mmOriginalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount in its original currency when conversion from/into another currency has occurred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOriginalAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndDirection8.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection32.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection9.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection12.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection33.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection17.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts2.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts5.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts11.mmOriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts12.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts17.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts20.mmOriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts24.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts3.mmOriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts6.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts9.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts13.mmOriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts16.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts19.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts22.mmOriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts25.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts4.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts7.mmOriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts10.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts14.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts15.mmOriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts18.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts21.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts26.mmOriginalAmount,
					com.tools20022.repository.msg.AmountAndDirection24.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection2.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection16.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection1.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection29.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection28.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.OtherAmounts16.mmOriginalCurrencyAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange2.mmTransactionAmount,
					com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmTransactionAmount, com.tools20022.repository.msg.CorporateActionRate2.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts1.mmOriginalAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms9.mmOriginalAmount, com.tools20022.repository.msg.AmountAndDirection10.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection22.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection11.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection25.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection27.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection36.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection37.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts29.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts27.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts28.mmOriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts33.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts32.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts35.mmOriginalAmount,
					com.tools20022.repository.msg.AmountAndDirection38.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection40.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.CurrencyConversion1.mmOriginalAmount, com.tools20022.repository.msg.CurrencyConversion2.mmOriginalAmount,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.mmTransactionNominalAmount, com.tools20022.repository.msg.CurrencyConversion4.mmOriginalAmount,
					com.tools20022.repository.msg.AmountAndDirection46.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection49.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection48.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection44.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection45.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection51.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts37.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts36.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts38.mmOriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts39.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts41.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts40.mmOriginalAmount,
					com.tools20022.repository.msg.AmountAndDirection66.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection60.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection71.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection85.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection55.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection58.mmOriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection67.mmOriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.mmTransactionNominalAmount,
					com.tools20022.repository.msg.CurrencyConversion6.mmOriginalAmount, com.tools20022.repository.msg.CurrencyConversion9.mmOriginalAmount,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.mmTransactionNominalAmount, com.tools20022.repository.msg.CurrencyConversion12.mmOriginalAmount);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalAmount";
			definition = "Amount in its original currency when conversion from/into another currency has occurred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected ForeignExchangeTrade currencyExchangeForForeignExchangeTrade;
	/**
	 * Trade which uses the specified exchange rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForForeignExchangeTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which uses the specified exchange rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForForeignExchangeTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForForeignExchangeTrade";
			definition = "Trade which uses the specified exchange rate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmAgreedRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
		}
	};
	protected CurrencyCode unitCurrency;
	/**
	 * Currency in which the rate of exchange is expressed in a currency
	 * exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11#mmUnitCurrency
	 * ForeignExchangeTerms11.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12#mmUnitCurrency
	 * ForeignExchangeTerms12.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13#mmUnitCurrency
	 * ForeignExchangeTerms13.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15#mmUnitCurrency
	 * ForeignExchangeTerms15.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19#mmUnitCurrency
	 * ForeignExchangeTerms19.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#mmUnitCurrency
	 * ForeignExchangeTerms5.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1#mmUnitCurrency
	 * ForeignExchangeTerms1.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2#mmUnitCurrency
	 * ForeignExchangeTerms2.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3#mmUnitCurrency
	 * ForeignExchangeTerms3.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6#mmUnitCurrency
	 * ForeignExchangeTerms6.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14#mmUnitCurrency
	 * ForeignExchangeTerms14.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16#mmUnitCurrency
	 * ForeignExchangeTerms16.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18#mmUnitCurrency
	 * ForeignExchangeTerms18.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#mmUnitCurrency
	 * CurrencyExchange3.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmUnitCurrency
	 * CurrencyExchange5.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRate1#mmUnitCurrency
	 * ExchangeRate1.mmUnitCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate1#mmUnitCurrency
	 * AgreedRate1.mmUnitCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate2#mmUnitCurrency
	 * AgreedRate2.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmUnitCurrency
	 * FundOrderData1.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#mmUnitCurrency
	 * FundOrderData2.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#mmUnitCurrency
	 * ForeignExchangeTerms4.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmUnitCurrency
	 * ForeignExchangeTerms7.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8#mmUnitCurrency
	 * ForeignExchangeTerms8.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#mmUnitCurrency
	 * ForeignExchangeTerms9.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17#mmUnitCurrency
	 * ForeignExchangeTerms17.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmUnitCurrency
	 * CurrencyExchange6.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10#mmUnitCurrency
	 * ForeignExchangeTerms10.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22#mmUnitCurrency
	 * ForeignExchangeTerms22.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23#mmUnitCurrency
	 * ForeignExchangeTerms23.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24#mmUnitCurrency
	 * ForeignExchangeTerms24.mmUnitCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate3#mmUnitCurrency
	 * AgreedRate3.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmUnitCurrency
	 * ForeignExchangeTerms26.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28#mmUnitCurrency
	 * ForeignExchangeTerms28.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27#mmUnitCurrency
	 * ForeignExchangeTerms27.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31#mmUnitCurrency
	 * ForeignExchangeTerms31.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmUnitCurrency
	 * ForeignExchangeTerms33.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32#mmUnitCurrency
	 * ForeignExchangeTerms32.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmUnitCurrency
	 * FundOrderData5.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#mmUnitCurrency
	 * FundOrderData6.mmUnitCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnitCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForeignExchangeTerms11.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms12.mmUnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms13.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms15.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms19.mmUnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms5.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms1.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms2.mmUnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms3.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms6.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms14.mmUnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms16.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms18.mmUnitCurrency, com.tools20022.repository.msg.CurrencyExchange3.mmUnitCurrency,
					com.tools20022.repository.msg.CurrencyExchange5.mmUnitCurrency, com.tools20022.repository.msg.ExchangeRate1.mmUnitCurrency, com.tools20022.repository.msg.AgreedRate1.mmUnitCurrency,
					com.tools20022.repository.msg.AgreedRate2.mmUnitCurrency, com.tools20022.repository.msg.FundOrderData1.mmUnitCurrency, com.tools20022.repository.msg.FundOrderData2.mmUnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms4.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms7.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms8.mmUnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms9.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms17.mmUnitCurrency, com.tools20022.repository.msg.CurrencyExchange6.mmUnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms10.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms22.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms23.mmUnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms24.mmUnitCurrency, com.tools20022.repository.msg.AgreedRate3.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms26.mmUnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms28.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms27.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms31.mmUnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms33.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms32.mmUnitCurrency, com.tools20022.repository.msg.FundOrderData5.mmUnitCurrency,
					com.tools20022.repository.msg.FundOrderData6.mmUnitCurrency);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected CurrencyCode quotedCurrency;
	/**
	 * Currency into which the base currency is converted, in a currency
	 * exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11#mmQuotedCurrency
	 * ForeignExchangeTerms11.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12#mmQuotedCurrency
	 * ForeignExchangeTerms12.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13#mmQuotedCurrency
	 * ForeignExchangeTerms13.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15#mmQuotedCurrency
	 * ForeignExchangeTerms15.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19#mmQuotedCurrency
	 * ForeignExchangeTerms19.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#mmQuotedCurrency
	 * ForeignExchangeTerms5.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1#mmQuotedCurrency
	 * ForeignExchangeTerms1.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2#mmQuotedCurrency
	 * ForeignExchangeTerms2.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3#mmQuotedCurrency
	 * ForeignExchangeTerms3.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6#mmQuotedCurrency
	 * ForeignExchangeTerms6.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14#mmQuotedCurrency
	 * ForeignExchangeTerms14.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16#mmQuotedCurrency
	 * ForeignExchangeTerms16.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18#mmQuotedCurrency
	 * ForeignExchangeTerms18.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreedRate1#mmQuotedCurrency
	 * AgreedRate1.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreedRate2#mmQuotedCurrency
	 * AgreedRate2.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmQuotedCurrency
	 * FundOrderData1.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#mmQuotedCurrency
	 * FundOrderData2.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#mmQuotedCurrency
	 * ForeignExchangeTerms4.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmQuotedCurrency
	 * ForeignExchangeTerms7.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8#mmQuotedCurrency
	 * ForeignExchangeTerms8.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#mmQuotedCurrency
	 * ForeignExchangeTerms9.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeDetails#mmQuotedCurrency
	 * CurrencyExchangeDetails.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17#mmQuotedCurrency
	 * ForeignExchangeTerms17.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10#mmQuotedCurrency
	 * ForeignExchangeTerms10.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange7#mmQuotedCurrency
	 * CurrencyExchange7.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22#mmQuotedCurrency
	 * ForeignExchangeTerms22.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23#mmQuotedCurrency
	 * ForeignExchangeTerms23.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24#mmQuotedCurrency
	 * ForeignExchangeTerms24.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreedRate3#mmQuotedCurrency
	 * AgreedRate3.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmQuotedCurrency
	 * ForeignExchangeTerms26.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28#mmQuotedCurrency
	 * ForeignExchangeTerms28.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27#mmQuotedCurrency
	 * ForeignExchangeTerms27.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31#mmQuotedCurrency
	 * ForeignExchangeTerms31.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmQuotedCurrency
	 * ForeignExchangeTerms33.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32#mmQuotedCurrency
	 * ForeignExchangeTerms32.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmQuotedCurrency
	 * FundOrderData5.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#mmQuotedCurrency
	 * FundOrderData6.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningConditions1#mmSettlementCurrency
	 * OpeningConditions1.mmSettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotedCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the base currency is converted, in a currency exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuotedCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForeignExchangeTerms11.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms12.mmQuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms13.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms15.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms19.mmQuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms5.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms1.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms2.mmQuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms3.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms6.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms14.mmQuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms16.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms18.mmQuotedCurrency, com.tools20022.repository.msg.AgreedRate1.mmQuotedCurrency,
					com.tools20022.repository.msg.AgreedRate2.mmQuotedCurrency, com.tools20022.repository.msg.FundOrderData1.mmQuotedCurrency, com.tools20022.repository.msg.FundOrderData2.mmQuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms4.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms7.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms8.mmQuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms9.mmQuotedCurrency, com.tools20022.repository.msg.CurrencyExchangeDetails.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms17.mmQuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms10.mmQuotedCurrency, com.tools20022.repository.msg.CurrencyExchange7.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms22.mmQuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms23.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms24.mmQuotedCurrency, com.tools20022.repository.msg.AgreedRate3.mmQuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms26.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms28.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms27.mmQuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms31.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms33.mmQuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms32.mmQuotedCurrency,
					com.tools20022.repository.msg.FundOrderData5.mmQuotedCurrency, com.tools20022.repository.msg.FundOrderData6.mmQuotedCurrency, com.tools20022.repository.msg.OpeningConditions1.mmSettlementCurrency);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected BaseOneRate exchangeRate;
	/**
	 * The value of one currency expressed in relation to another currency.
	 * ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency
	 * (ExchangeRate = UnitCurrency/QuotedCurrency).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11#mmExchangeRate
	 * ForeignExchangeTerms11.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12#mmExchangeRate
	 * ForeignExchangeTerms12.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13#mmExchangeRate
	 * ForeignExchangeTerms13.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15#mmExchangeRate
	 * ForeignExchangeTerms15.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19#mmExchangeRate
	 * ForeignExchangeTerms19.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#mmExchangeRate
	 * ForeignExchangeTerms5.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1#mmExchangeRate
	 * ForeignExchangeTerms1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2#mmExchangeRate
	 * ForeignExchangeTerms2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3#mmExchangeRate
	 * ForeignExchangeTerms3.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6#mmExchangeRate
	 * ForeignExchangeTerms6.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14#mmExchangeRate
	 * ForeignExchangeTerms14.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16#mmExchangeRate
	 * ForeignExchangeTerms16.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange4#mmExchangeRate
	 * CurrencyExchange4.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18#mmExchangeRate
	 * ForeignExchangeTerms18.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#mmExchangeRate
	 * CurrencyExchange3.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmExchangeRate
	 * CurrencyExchange5.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRateInformation1#mmExchangeRate
	 * ExchangeRateInformation1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRate1#mmExchangeRate
	 * ExchangeRate1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmExchangeRate
	 * CreditTransferTransaction2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmExchangeRate
	 * DirectDebitTransactionInformation2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmExchangeRate
	 * DirectDebitTransactionInformation10.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmExchangeRate
	 * DirectDebitTransactionInformation12.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmExchangeRate
	 * DirectDebitTransactionInformation14.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmExchangeRate
	 * PaymentTransactionInformation5.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmExchangeRate
	 * PaymentTransactionInformation29.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmExchangeRate
	 * PaymentTransaction36.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmExchangeRate
	 * PaymentTransaction45.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmExchangeRate
	 * PaymentTransactionInformation2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmExchangeRate
	 * PaymentTransactionInformation27.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmExchangeRate
	 * PaymentTransaction34.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmExchangeRate
	 * PaymentTransaction44.mmExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate1#mmExchangeRate
	 * AgreedRate1.mmExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate2#mmExchangeRate
	 * AgreedRate2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#mmExchangeRate
	 * ForeignExchangeTerms4.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmExchangeRate
	 * ForeignExchangeTerms7.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8#mmExchangeRate
	 * ForeignExchangeTerms8.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#mmExchangeRate
	 * ForeignExchangeTerms9.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference2#mmExchangeRateInformation
	 * CurrencyReference2.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmExchangeRate
	 * CollateralValuation1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeDetails#mmExchangeRate
	 * CurrencyExchangeDetails.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmForeignExchangeRate
	 * SecuritiesAccount21.mmForeignExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17#mmExchangeRate
	 * ForeignExchangeTerms17.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmExchangeRate
	 * CurrencyExchange6.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmExchangeRate
	 * PaymentTransactionInformation16.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmExchangeRate
	 * PaymentTransactionInformation23.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmExchangeRate
	 * PaymentTransactionInformation17.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmExchangeRate
	 * PaymentTransactionInformation24.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmExchangeRate
	 * PaymentTransactionInformation21.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmExchangeRate
	 * DirectDebitTransactionInformation6.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmExchangeRate
	 * DirectDebitTransactionInformation8.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10#mmExchangeRate
	 * ForeignExchangeTerms10.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange7#mmExchangeRate
	 * CurrencyExchange7.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmExchangeRate
	 * CurrencyConversion1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmInvertedExchangeRate
	 * CurrencyConversion1.mmInvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmExchangeRate
	 * PaymentTransaction50.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmExchangeRate
	 * DirectDebitTransactionInformation17.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmExchangeRate
	 * PaymentTransaction51.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmExchangeRate
	 * CollateralValuation2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmExchangeRate
	 * CurrencyConversion2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmInvertedExchangeRate
	 * CurrencyConversion2.mmInvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchange1#mmExchangeSpotRate
	 * ForeignExchange1.mmExchangeSpotRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmExchangeRate
	 * CurrencyConversion4.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmInvertedExchangeRate
	 * CurrencyConversion4.mmInvertedExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmRate
	 * CurrencyConversion5.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount8#mmExchangeRate
	 * DetailedAmount8.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22#mmExchangeRate
	 * ForeignExchangeTerms22.mmExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmValuationRate
	 * Trade3.mmValuationRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmStrikePrice
	 * Option10.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23#mmExchangeRate
	 * ForeignExchangeTerms23.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmExchangeRate
	 * PaymentTransaction65.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmExchangeRate
	 * DirectDebitTransactionInformation20.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmExchangeRate
	 * PaymentTransaction60.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24#mmExchangeRate
	 * ForeignExchangeTerms24.mmExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate3#mmExchangeRate
	 * AgreedRate3.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmExchangeRate
	 * ForeignExchangeTerms26.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmExchangeRate
	 * CollateralValuation5.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28#mmExchangeRate
	 * ForeignExchangeTerms28.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27#mmExchangeRate
	 * ForeignExchangeTerms27.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31#mmExchangeRate
	 * ForeignExchangeTerms31.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmExchangeRate
	 * CurrencyConversion6.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmInvertedExchangeRate
	 * CurrencyConversion6.mmInvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmExchangeRate
	 * CurrencyConversion9.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmInvertedExchangeRate
	 * CurrencyConversion9.mmInvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmExchangeRate
	 * ForeignExchangeTerms33.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32#mmExchangeRate
	 * ForeignExchangeTerms32.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference3#mmExchangeRateInformation
	 * CurrencyReference3.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmExchangeRate
	 * DirectDebitTransactionInformation21.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmExchangeRate
	 * PaymentTransaction81.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmExchangeRate
	 * PaymentTransaction76.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmExchangeRate
	 * FixingConditions1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmExchangeRate
	 * CurrencyConversion12.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmInvertedExchangeRate
	 * CurrencyConversion12.mmInvertedExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExchangeRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForeignExchangeTerms11.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms12.mmExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms13.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms15.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms19.mmExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms5.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms1.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms2.mmExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms3.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms6.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms14.mmExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms16.mmExchangeRate, com.tools20022.repository.msg.CurrencyExchange4.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms18.mmExchangeRate,
					com.tools20022.repository.msg.CurrencyExchange3.mmExchangeRate, com.tools20022.repository.msg.CurrencyExchange5.mmExchangeRate, com.tools20022.repository.msg.ExchangeRateInformation1.mmExchangeRate,
					com.tools20022.repository.msg.ExchangeRate1.mmExchangeRate, com.tools20022.repository.msg.CreditTransferTransaction2.mmExchangeRate, com.tools20022.repository.msg.DirectDebitTransactionInformation2.mmExchangeRate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation10.mmExchangeRate, com.tools20022.repository.msg.DirectDebitTransactionInformation12.mmExchangeRate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation14.mmExchangeRate, com.tools20022.repository.msg.PaymentTransactionInformation5.mmExchangeRate,
					com.tools20022.repository.msg.PaymentTransactionInformation29.mmExchangeRate, com.tools20022.repository.msg.PaymentTransaction36.mmExchangeRate, com.tools20022.repository.msg.PaymentTransaction45.mmExchangeRate,
					com.tools20022.repository.msg.PaymentTransactionInformation2.mmExchangeRate, com.tools20022.repository.msg.PaymentTransactionInformation27.mmExchangeRate,
					com.tools20022.repository.msg.PaymentTransaction34.mmExchangeRate, com.tools20022.repository.msg.PaymentTransaction44.mmExchangeRate, com.tools20022.repository.msg.AgreedRate1.mmExchangeRate,
					com.tools20022.repository.msg.AgreedRate2.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms4.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms7.mmExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms8.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms9.mmExchangeRate, com.tools20022.repository.msg.CurrencyReference2.mmExchangeRateInformation,
					com.tools20022.repository.msg.CollateralValuation1.mmExchangeRate, com.tools20022.repository.msg.CurrencyExchangeDetails.mmExchangeRate, com.tools20022.repository.msg.SecuritiesAccount21.mmForeignExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms17.mmExchangeRate, com.tools20022.repository.msg.CurrencyExchange6.mmExchangeRate, com.tools20022.repository.msg.PaymentTransactionInformation16.mmExchangeRate,
					com.tools20022.repository.msg.PaymentTransactionInformation23.mmExchangeRate, com.tools20022.repository.msg.PaymentTransactionInformation17.mmExchangeRate,
					com.tools20022.repository.msg.PaymentTransactionInformation24.mmExchangeRate, com.tools20022.repository.msg.PaymentTransactionInformation21.mmExchangeRate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation6.mmExchangeRate, com.tools20022.repository.msg.DirectDebitTransactionInformation8.mmExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms10.mmExchangeRate, com.tools20022.repository.msg.CurrencyExchange7.mmExchangeRate, com.tools20022.repository.msg.CurrencyConversion1.mmExchangeRate,
					com.tools20022.repository.msg.CurrencyConversion1.mmInvertedExchangeRate, com.tools20022.repository.msg.PaymentTransaction50.mmExchangeRate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation17.mmExchangeRate, com.tools20022.repository.msg.PaymentTransaction51.mmExchangeRate, com.tools20022.repository.msg.CollateralValuation2.mmExchangeRate,
					com.tools20022.repository.msg.CurrencyConversion2.mmExchangeRate, com.tools20022.repository.msg.CurrencyConversion2.mmInvertedExchangeRate, com.tools20022.repository.msg.ForeignExchange1.mmExchangeSpotRate,
					com.tools20022.repository.msg.CurrencyConversion4.mmExchangeRate, com.tools20022.repository.msg.CurrencyConversion4.mmInvertedExchangeRate, com.tools20022.repository.msg.CurrencyConversion5.mmRate,
					com.tools20022.repository.msg.DetailedAmount8.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms22.mmExchangeRate, com.tools20022.repository.msg.Trade3.mmValuationRate,
					com.tools20022.repository.msg.Option10.mmStrikePrice, com.tools20022.repository.msg.ForeignExchangeTerms23.mmExchangeRate, com.tools20022.repository.msg.PaymentTransaction65.mmExchangeRate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation20.mmExchangeRate, com.tools20022.repository.msg.PaymentTransaction60.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms24.mmExchangeRate,
					com.tools20022.repository.msg.AgreedRate3.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms26.mmExchangeRate, com.tools20022.repository.msg.CollateralValuation5.mmExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms28.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms27.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms31.mmExchangeRate,
					com.tools20022.repository.msg.CurrencyConversion6.mmExchangeRate, com.tools20022.repository.msg.CurrencyConversion6.mmInvertedExchangeRate, com.tools20022.repository.msg.CurrencyConversion9.mmExchangeRate,
					com.tools20022.repository.msg.CurrencyConversion9.mmInvertedExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms33.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms32.mmExchangeRate,
					com.tools20022.repository.msg.CurrencyReference3.mmExchangeRateInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation21.mmExchangeRate,
					com.tools20022.repository.msg.PaymentTransaction81.mmExchangeRate, com.tools20022.repository.msg.PaymentTransaction76.mmExchangeRate, com.tools20022.repository.msg.FixingConditions1.mmExchangeRate,
					com.tools20022.repository.msg.CurrencyConversion12.mmExchangeRate, com.tools20022.repository.msg.CurrencyConversion12.mmInvertedExchangeRate);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected CurrencyAndAmount resultingAmount;
	/**
	 * Amount of money resulting from a foreign exchange transaction.
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11#mmResultingAmount
	 * ForeignExchangeTerms11.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12#mmResultingAmount
	 * ForeignExchangeTerms12.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13#mmResultingAmount
	 * ForeignExchangeTerms13.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15#mmResultingAmount
	 * ForeignExchangeTerms15.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange4#mmResultingAmount
	 * CurrencyExchange4.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18#mmConvertedAmount
	 * ForeignExchangeTerms18.mmConvertedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmConvertedAmount
	 * OtherAmounts16.mmConvertedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#mmCounterValueAmount
	 * AmountAndCurrencyExchange2.mmCounterValueAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmCounterValueAmount
	 * AmountAndCurrencyExchange3.mmCounterValueAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Value#mmAlternateCurrencyItem
	 * Value.mmAlternateCurrencyItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8#mmResultingAmount
	 * ForeignExchangeTerms8.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#mmResultingAmount
	 * ForeignExchangeTerms9.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17#mmResultingAmount
	 * ForeignExchangeTerms17.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmResultingAmount
	 * CurrencyConversion1.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmResultingAmount
	 * CurrencyConversion2.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmResultingAmount
	 * CurrencyConversion4.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmCalculatedAmount
	 * CurrencyConversion5.mmCalculatedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23#mmResultingAmount
	 * ForeignExchangeTerms23.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24#mmResultingAmount
	 * ForeignExchangeTerms24.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28#mmResultingAmount
	 * ForeignExchangeTerms28.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27#mmResultingAmount
	 * ForeignExchangeTerms27.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmResultingAmount
	 * CurrencyConversion6.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmResultingAmount
	 * CurrencyConversion9.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmResultingAmount
	 * CurrencyConversion12.mmResultingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from a foreign exchange transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmResultingAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForeignExchangeTerms11.mmResultingAmount, com.tools20022.repository.msg.ForeignExchangeTerms12.mmResultingAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms13.mmResultingAmount, com.tools20022.repository.msg.ForeignExchangeTerms15.mmResultingAmount, com.tools20022.repository.msg.CurrencyExchange4.mmResultingAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms18.mmConvertedAmount, com.tools20022.repository.msg.OtherAmounts16.mmConvertedAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange2.mmCounterValueAmount,
					com.tools20022.repository.msg.AmountAndCurrencyExchange3.mmCounterValueAmount, com.tools20022.repository.msg.Value.mmAlternateCurrencyItem, com.tools20022.repository.msg.ForeignExchangeTerms8.mmResultingAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms9.mmResultingAmount, com.tools20022.repository.msg.ForeignExchangeTerms17.mmResultingAmount, com.tools20022.repository.msg.CurrencyConversion1.mmResultingAmount,
					com.tools20022.repository.msg.CurrencyConversion2.mmResultingAmount, com.tools20022.repository.msg.CurrencyConversion4.mmResultingAmount, com.tools20022.repository.msg.CurrencyConversion5.mmCalculatedAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms23.mmResultingAmount, com.tools20022.repository.msg.ForeignExchangeTerms24.mmResultingAmount, com.tools20022.repository.msg.ForeignExchangeTerms28.mmResultingAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms27.mmResultingAmount, com.tools20022.repository.msg.CurrencyConversion6.mmResultingAmount, com.tools20022.repository.msg.CurrencyConversion9.mmResultingAmount,
					com.tools20022.repository.msg.CurrencyConversion12.mmResultingAmount);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingAmount";
			definition = "Amount of money resulting from a foreign exchange transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CorporateActionEvent relatedCorporateActionEvent;
	/**
	 * Corporate action for which the offeror/issuer has specified an exchange
	 * rate for the payment in a currency different from the announced one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
	 * CorporateActionEvent.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which the offeror/issuer has specified an exchange rate for the payment in a currency different from the announced one."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action for which the offeror/issuer has specified an exchange rate for the payment in a currency different from the announced one.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected SecuritiesBalance currencyExchangeForSecuritiesBalance;
	/**
	 * Specifies a securities balance which used a specific exchange rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
	 * SecuritiesBalance.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForSecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a securities balance which used a specific exchange rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesBalance";
			definition = "Specifies a securities balance which used a specific exchange rate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected ISODateTime quotationDate;
	/**
	 * Date and time at which an exchange rate is quoted.
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#mmQuotationDate
	 * ForeignExchangeTerms5.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1#mmQuotationDate
	 * ForeignExchangeTerms1.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2#mmQuotationDate
	 * ForeignExchangeTerms2.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3#mmQuotationDate
	 * ForeignExchangeTerms3.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6#mmQuotationDate
	 * ForeignExchangeTerms6.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14#mmQuotationDate
	 * ForeignExchangeTerms14.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16#mmQuotationDate
	 * ForeignExchangeTerms16.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#mmQuotationDate
	 * CurrencyExchange3.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmQuotationDate
	 * CurrencyExchange5.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#mmQuotationDate
	 * ForeignExchangeTerms4.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmQuotationDate
	 * ForeignExchangeTerms7.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeDetails#mmQuotationDate
	 * CurrencyExchangeDetails.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmQuotationDate
	 * CurrencyExchange6.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange7#mmQuotationDate
	 * CurrencyExchange7.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmQuotationDate
	 * CurrencyConversion1.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmQuotationDate
	 * CurrencyConversion2.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmQuotationDate
	 * CurrencyConversion4.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount8#mmQuotationDate
	 * DetailedAmount8.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22#mmQuotationDate
	 * ForeignExchangeTerms22.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmQuotationDate
	 * ForeignExchangeTerms26.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31#mmQuotationDate
	 * ForeignExchangeTerms31.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmQuotationDate
	 * CurrencyConversion6.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmQuotationDate
	 * CurrencyConversion9.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmQuotationDate
	 * ForeignExchangeTerms33.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32#mmQuotationDate
	 * ForeignExchangeTerms32.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmQuotationDate
	 * CurrencyConversion12.mmQuotationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which an exchange rate is quoted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuotationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForeignExchangeTerms5.mmQuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms1.mmQuotationDate,
					com.tools20022.repository.msg.ForeignExchangeTerms2.mmQuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms3.mmQuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms6.mmQuotationDate,
					com.tools20022.repository.msg.ForeignExchangeTerms14.mmQuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms16.mmQuotationDate, com.tools20022.repository.msg.CurrencyExchange3.mmQuotationDate,
					com.tools20022.repository.msg.CurrencyExchange5.mmQuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms4.mmQuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms7.mmQuotationDate,
					com.tools20022.repository.msg.CurrencyExchangeDetails.mmQuotationDate, com.tools20022.repository.msg.CurrencyExchange6.mmQuotationDate, com.tools20022.repository.msg.CurrencyExchange7.mmQuotationDate,
					com.tools20022.repository.msg.CurrencyConversion1.mmQuotationDate, com.tools20022.repository.msg.CurrencyConversion2.mmQuotationDate, com.tools20022.repository.msg.CurrencyConversion4.mmQuotationDate,
					com.tools20022.repository.msg.DetailedAmount8.mmQuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms22.mmQuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms26.mmQuotationDate,
					com.tools20022.repository.msg.ForeignExchangeTerms31.mmQuotationDate, com.tools20022.repository.msg.CurrencyConversion6.mmQuotationDate, com.tools20022.repository.msg.CurrencyConversion9.mmQuotationDate,
					com.tools20022.repository.msg.ForeignExchangeTerms33.mmQuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms32.mmQuotationDate, com.tools20022.repository.msg.CurrencyConversion12.mmQuotationDate);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which an exchange rate is quoted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AssetHolding> calculatedAssetValue;
	/**
	 * Asset value calculated in a different currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
	 * AssetHolding.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculatedAssetValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset value calculated in a different currency."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCalculatedAssetValue = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculatedAssetValue";
			definition = "Asset value calculated in a different currency.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	protected CurrencyCode sourceCurrency;
	/**
	 * Currency of the amount to be converted in a currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReferenceDetails#mmSourceCurrency
	 * CurrencyReferenceDetails.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange4#mmSourceAndTargetCurrency
	 * CurrencyExchange4.mmSourceAndTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#mmSourceCurrency
	 * CurrencyExchange3.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmSourceCurrency
	 * CurrencyExchange5.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference2#mmSourceCurrency
	 * CurrencyReference2.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeSearchCriteria#mmSourceCurrency
	 * CurrencyExchangeSearchCriteria.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmSourceCurrency
	 * CurrencyExchange6.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencySourceTarget1#mmSourceCurrency
	 * CurrencySourceTarget1.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmSourceCurrency
	 * CurrencyConversion1.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmSourceCurrency
	 * CurrencyConversion2.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmSourceCurrency
	 * CurrencyConversion4.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmSourceCurrency
	 * CurrencyConversion5.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmSourceCurrency
	 * CurrencyConversion6.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmSourceCurrency
	 * CurrencyConversion9.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference3#mmSourceCurrency
	 * CurrencyReference3.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmSourceCurrency
	 * CurrencyConversion12.mmSourceCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency of the amount to be converted in a currency conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSourceCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyReferenceDetails.mmSourceCurrency, com.tools20022.repository.msg.CurrencyExchange4.mmSourceAndTargetCurrency,
					com.tools20022.repository.msg.CurrencyExchange3.mmSourceCurrency, com.tools20022.repository.msg.CurrencyExchange5.mmSourceCurrency, com.tools20022.repository.msg.CurrencyReference2.mmSourceCurrency,
					com.tools20022.repository.msg.CurrencyExchangeSearchCriteria.mmSourceCurrency, com.tools20022.repository.msg.CurrencyExchange6.mmSourceCurrency, com.tools20022.repository.msg.CurrencySourceTarget1.mmSourceCurrency,
					com.tools20022.repository.msg.CurrencyConversion1.mmSourceCurrency, com.tools20022.repository.msg.CurrencyConversion2.mmSourceCurrency, com.tools20022.repository.msg.CurrencyConversion4.mmSourceCurrency,
					com.tools20022.repository.msg.CurrencyConversion5.mmSourceCurrency, com.tools20022.repository.msg.CurrencyConversion6.mmSourceCurrency, com.tools20022.repository.msg.CurrencyConversion9.mmSourceCurrency,
					com.tools20022.repository.msg.CurrencyReference3.mmSourceCurrency, com.tools20022.repository.msg.CurrencyConversion12.mmSourceCurrency);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceCurrency";
			definition = "Currency of the amount to be converted in a currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected CurrencyCode targetCurrency;
	/**
	 * Currency into which an amount is to be converted in a currency
	 * conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReferenceDetails#mmTargetCurrency
	 * CurrencyReferenceDetails.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#mmTargetCurrency
	 * CurrencyExchange3.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmTargetCurrency
	 * CurrencyExchange5.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference2#mmTargetCurrency
	 * CurrencyReference2.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeSearchCriteria#mmTargetCurrency
	 * CurrencyExchangeSearchCriteria.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmTargetCurrency
	 * CurrencyExchange6.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencySourceTarget1#mmTargetCurrency
	 * CurrencySourceTarget1.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmTargetCurrency
	 * CurrencyConversion1.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmTargetCurrency
	 * CurrencyConversion2.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchange1#mmForeignCurrency
	 * ForeignExchange1.mmForeignCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmTargetCurrency
	 * CurrencyConversion4.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmTargetCurrency
	 * CurrencyConversion5.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmSettlementCurrency
	 * CashAccount33.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmSettlementCurrency
	 * PaymentInstrument13.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmTargetCurrency
	 * CurrencyConversion6.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmTargetCurrency
	 * CurrencyConversion9.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference3#mmTargetCurrency
	 * CurrencyReference3.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmTargetCurrency
	 * CurrencyConversion12.mmTargetCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which an amount is to be converted in a currency conversion."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTargetCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyReferenceDetails.mmTargetCurrency, com.tools20022.repository.msg.CurrencyExchange3.mmTargetCurrency,
					com.tools20022.repository.msg.CurrencyExchange5.mmTargetCurrency, com.tools20022.repository.msg.CurrencyReference2.mmTargetCurrency, com.tools20022.repository.msg.CurrencyExchangeSearchCriteria.mmTargetCurrency,
					com.tools20022.repository.msg.CurrencyExchange6.mmTargetCurrency, com.tools20022.repository.msg.CurrencySourceTarget1.mmTargetCurrency, com.tools20022.repository.msg.CurrencyConversion1.mmTargetCurrency,
					com.tools20022.repository.msg.CurrencyConversion2.mmTargetCurrency, com.tools20022.repository.msg.ForeignExchange1.mmForeignCurrency, com.tools20022.repository.msg.CurrencyConversion4.mmTargetCurrency,
					com.tools20022.repository.msg.CurrencyConversion5.mmTargetCurrency, com.tools20022.repository.msg.CashAccount33.mmSettlementCurrency, com.tools20022.repository.msg.PaymentInstrument13.mmSettlementCurrency,
					com.tools20022.repository.msg.CurrencyConversion6.mmTargetCurrency, com.tools20022.repository.msg.CurrencyConversion9.mmTargetCurrency, com.tools20022.repository.msg.CurrencyReference3.mmTargetCurrency,
					com.tools20022.repository.msg.CurrencyConversion12.mmTargetCurrency);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which an amount is to be converted in a currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashEntry> currencyExchangeForCashEntry;
	/**
	 * Cash entry to which the currency exchange parameters apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCurrencyExchange
	 * CashEntry.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForCashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash entry to which the currency exchange parameters apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForCashEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCashEntry";
			definition = "Cash entry to which the currency exchange parameters apply.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmCurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected Payment relatedPayment;
	/**
	 * Payment for which currency exchange parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment for which currency exchange parameters are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which currency exchange parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmCurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected ExchangeRateTypeCode rateType;
	/**
	 * Specifies the type used to complete the currency exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangeRateTypeCode
	 * ExchangeRateTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRateInformation1#mmRateType
	 * ExchangeRateInformation1.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRate1#mmRateType
	 * ExchangeRate1.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType1Choice#mmCode
	 * RateType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType1Choice#mmProprietary
	 * RateType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType2Choice#mmCode
	 * RateType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType2Choice#mmProprietary
	 * RateType2Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type used to complete the currency exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeRateInformation1.mmRateType, com.tools20022.repository.msg.ExchangeRate1.mmRateType, com.tools20022.repository.choice.RateType1Choice.mmCode,
					com.tools20022.repository.choice.RateType1Choice.mmProprietary, com.tools20022.repository.choice.RateType2Choice.mmCode, com.tools20022.repository.choice.RateType2Choice.mmProprietary);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type used to complete the currency exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExchangeRateTypeCode.mmObject();
		}
	};
	protected LiquidityManagementLimit relatedLimitManagement;
	/**
	 * Limit for which an exchange rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmCurrencyExchange
	 * LiquidityManagementLimit.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
	 * LiquidityManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedLimitManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit for which an exchange rate is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedLimitManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLimitManagement";
			definition = "Limit for which an exchange rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmCurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.FixingCondition> fixingConditions;
	/**
	 * Set of parameters used to calculate a rate for instance, the fixing rate
	 * to be applied to a non-deliverable agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFixingRate
	 * FixingCondition.mmFixingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of parameters used to calculate a rate for instance, the fixing rate to be applied to a non-deliverable agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFixingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixingConditions";
			definition = "Set of parameters used to calculate a rate for instance, the fixing rate to be applied to a non-deliverable agreement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FixingCondition.mmFixingRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FixingCondition.mmObject();
		}
	};
	protected Tax tax;
	/**
	 * Tax for which exchange information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCurrencyExchange
	 * Tax.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax for which exchange information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax for which exchange information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmCurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected Invoice relatedInvoice;
	/**
	 * Invoice for which currency exchange information is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmCurrencyExchange
	 * Invoice.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Invoice for which currency exchange information is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvoice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Invoice for which currency exchange information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.mmCurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	protected TransactionAdministrator currencyExchangeForTransactionAdministrator;
	/**
	 * Set of applications which use currency exchange information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCurrencyExchange
	 * TransactionAdministrator.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForTransactionAdministrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of applications which use currency exchange information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForTransactionAdministrator";
			definition = "Set of applications which use currency exchange information.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmCurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
		}
	};
	protected Account reportedAccount;
	/**
	 * Specifies the account which uses an exchange rate to report entries and
	 * balances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmCurrencyExchange
	 * Account.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account which uses an exchange rate to report entries and balances."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReportedAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedAccount";
			definition = "Specifies the account which uses an exchange rate to report entries and balances.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmCurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected CorporateActionCashEntitlement currencyExchangeForCorporateActionCashEntitlement;
	/**
	 * Cash entitlement for which an exchange rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmExchangeRate
	 * CorporateActionCashEntitlement.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForCorporateActionCashEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash entitlement for which an exchange rate is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForCorporateActionCashEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCorporateActionCashEntitlement";
			definition = "Cash entitlement for which an exchange rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.mmExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.mmObject();
		}
	};
	protected PaymentExecution paymentExecution;
	/**
	 * Payment execution process for which currrency exchange information is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCurrencyExchange
	 * PaymentExecution.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment execution process for which currrency exchange information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Payment execution process for which currrency exchange information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmCurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
		}
	};
	protected Quote currencyExchangeForSecuritiesQuote;
	/**
	 * Quote which uses currency exchange information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuotedRate
	 * Quote.mmQuotedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForSecuritiesQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which uses currency exchange information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForSecuritiesQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesQuote";
			definition = "Quote which uses currency exchange information.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmQuotedRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected SecuritiesConversion currencyExchangeForSecuritiesConversion;
	/**
	 * Securities conversion for which a conversion currency is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionUnitCurrency
	 * SecuritiesConversion.mmConversionUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForSecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion for which a conversion currency is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesConversion";
			definition = "Securities conversion for which a conversion currency is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmConversionUnitCurrency;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected CashDistribution currencyExchangeForCashDistribution;
	/**
	 * Cash distribution for which a conversion currency is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmDistributionCurrencyExchangeInformation
	 * CashDistribution.mmDistributionCurrencyExchangeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForCashDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash distribution for which a conversion currency is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForCashDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCashDistribution";
			definition = "Cash distribution for which a conversion currency is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmDistributionCurrencyExchangeInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
		}
	};
	protected Adjustment adjustment;
	/**
	 * Fees or commission applied to the currency exchange.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCurrencyExchange
	 * Adjustment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fees or commission applied to the currency exchange.\r\n"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdjustment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Fees or commission applied to the currency exchange.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmCurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrencyExchange";
				definition = "Information needed to process a currency exchange or conversion.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmCurrencyExchange, com.tools20022.repository.entity.Tax.mmCurrencyExchange,
						com.tools20022.repository.entity.Adjustment.mmCurrencyExchange, com.tools20022.repository.entity.Payment.mmCurrencyExchange, com.tools20022.repository.entity.CashEntry.mmCurrencyExchange,
						com.tools20022.repository.entity.AssetHolding.mmExchangeRate, com.tools20022.repository.entity.PaymentExecution.mmCurrencyExchange, com.tools20022.repository.entity.TransactionAdministrator.mmCurrencyExchange,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmAgreedRate, com.tools20022.repository.entity.SecuritiesConversion.mmConversionUnitCurrency, com.tools20022.repository.entity.SecuritiesBalance.mmExchangeRate,
						com.tools20022.repository.entity.CorporateActionEvent.mmExchangeRate, com.tools20022.repository.entity.CorporateActionCashEntitlement.mmExchangeRate, com.tools20022.repository.entity.FixingCondition.mmFixingRate,
						com.tools20022.repository.entity.Invoice.mmCurrencyExchange, com.tools20022.repository.entity.LiquidityManagementLimit.mmCurrencyExchange,
						com.tools20022.repository.entity.CashDistribution.mmDistributionCurrencyExchangeInformation, com.tools20022.repository.entity.Quote.mmQuotedRate);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher1.mmForeignExchangeDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.mmOriginalAmount, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade,
						com.tools20022.repository.entity.CurrencyExchange.mmUnitCurrency, com.tools20022.repository.entity.CurrencyExchange.mmQuotedCurrency, com.tools20022.repository.entity.CurrencyExchange.mmExchangeRate,
						com.tools20022.repository.entity.CurrencyExchange.mmResultingAmount, com.tools20022.repository.entity.CurrencyExchange.mmRelatedCorporateActionEvent,
						com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance, com.tools20022.repository.entity.CurrencyExchange.mmQuotationDate,
						com.tools20022.repository.entity.CurrencyExchange.mmCalculatedAssetValue, com.tools20022.repository.entity.CurrencyExchange.mmSourceCurrency, com.tools20022.repository.entity.CurrencyExchange.mmTargetCurrency,
						com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCashEntry, com.tools20022.repository.entity.CurrencyExchange.mmRelatedPayment, com.tools20022.repository.entity.CurrencyExchange.mmRateType,
						com.tools20022.repository.entity.CurrencyExchange.mmRelatedLimitManagement, com.tools20022.repository.entity.CurrencyExchange.mmFixingConditions, com.tools20022.repository.entity.CurrencyExchange.mmTax,
						com.tools20022.repository.entity.CurrencyExchange.mmRelatedInvoice, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForTransactionAdministrator,
						com.tools20022.repository.entity.CurrencyExchange.mmReportedAccount, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCorporateActionCashEntitlement,
						com.tools20022.repository.entity.CurrencyExchange.mmPaymentExecution, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesQuote,
						com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCashDistribution,
						com.tools20022.repository.entity.CurrencyExchange.mmAdjustment);
				derivationComponent_lazy = () -> Arrays.asList(ForeignExchangeTerms11.mmObject(), ForeignExchangeTerms12.mmObject(), ForeignExchangeTerms13.mmObject(), ForeignExchangeTerms15.mmObject(), ForeignExchangeTerms19.mmObject(),
						ForeignExchangeTerms5.mmObject(), ForeignExchangeTerms1.mmObject(), ForeignExchangeTerms2.mmObject(), ForeignExchangeTerms3.mmObject(), ForeignExchangeTerms6.mmObject(), ForeignExchangeTerms14.mmObject(),
						ForeignExchangeTerms16.mmObject(), CurrencyReferenceDetails.mmObject(), CurrencyExchange4.mmObject(), ForeignExchangeTerms18.mmObject(), CurrencyExchange3.mmObject(), CurrencyExchange5.mmObject(),
						ExchangeRateInformation1.mmObject(), ExchangeRate1.mmObject(), AgreedRate1.mmObject(), AgreedRate2.mmObject(), ForeignExchangeTerms4.mmObject(), ForeignExchangeTerms7.mmObject(), ForeignExchangeTerms8.mmObject(),
						ForeignExchangeTerms9.mmObject(), CurrencyReference2.mmObject(), CurrencyExchangeSearchCriteria.mmObject(), CurrencyExchangeDetails.mmObject(), ForeignExchangeTerms17.mmObject(), CurrencyExchange6.mmObject(),
						ForeignExchangeTerms10.mmObject(), RateType1Choice.mmObject(), RateType2Choice.mmObject(), CurrencySourceTarget1.mmObject(), CurrencyExchange7.mmObject(), CurrencyConversion1.mmObject(),
						CurrencyDesignation1.mmObject(), CurrencyConversion3.mmObject(), CurrencyConversion2.mmObject(), ForeignExchange1.mmObject(), CurrencyConversion4.mmObject(), CurrencyConversion5.mmObject(),
						ForeignExchangeTerms22.mmObject(), ForeignExchangeTerms23.mmObject(), ForeignExchangeTerms24.mmObject(), AgreedRate3.mmObject(), ForeignExchangeTerms26.mmObject(), ForeignExchangeTerms28.mmObject(),
						ForeignExchangeTerms27.mmObject(), ForeignExchangeTerms31.mmObject(), CurrencyConversion7.mmObject(), CurrencyConversion6.mmObject(), CurrencyConversion8.mmObject(), CurrencyConversion9.mmObject(),
						CurrencyConversion10.mmObject(), ForeignExchangeTerms33.mmObject(), ForeignExchangeTerms32.mmObject(), CurrencyReference3.mmObject(), CurrencyConversion13.mmObject(), CurrencyConversion12.mmObject(),
						CurrencyConversion11.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(CurrencyAndAmount originalAmount) {
		this.originalAmount = originalAmount;
	}

	public ForeignExchangeTrade getCurrencyExchangeForForeignExchangeTrade() {
		return currencyExchangeForForeignExchangeTrade;
	}

	public void setCurrencyExchangeForForeignExchangeTrade(com.tools20022.repository.entity.ForeignExchangeTrade currencyExchangeForForeignExchangeTrade) {
		this.currencyExchangeForForeignExchangeTrade = currencyExchangeForForeignExchangeTrade;
	}

	public CurrencyCode getUnitCurrency() {
		return unitCurrency;
	}

	public void setUnitCurrency(CurrencyCode unitCurrency) {
		this.unitCurrency = unitCurrency;
	}

	public CurrencyCode getQuotedCurrency() {
		return quotedCurrency;
	}

	public void setQuotedCurrency(CurrencyCode quotedCurrency) {
		this.quotedCurrency = quotedCurrency;
	}

	public BaseOneRate getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public CurrencyAndAmount getResultingAmount() {
		return resultingAmount;
	}

	public void setResultingAmount(CurrencyAndAmount resultingAmount) {
		this.resultingAmount = resultingAmount;
	}

	public CorporateActionEvent getRelatedCorporateActionEvent() {
		return relatedCorporateActionEvent;
	}

	public void setRelatedCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateActionEvent) {
		this.relatedCorporateActionEvent = relatedCorporateActionEvent;
	}

	public SecuritiesBalance getCurrencyExchangeForSecuritiesBalance() {
		return currencyExchangeForSecuritiesBalance;
	}

	public void setCurrencyExchangeForSecuritiesBalance(com.tools20022.repository.entity.SecuritiesBalance currencyExchangeForSecuritiesBalance) {
		this.currencyExchangeForSecuritiesBalance = currencyExchangeForSecuritiesBalance;
	}

	public ISODateTime getQuotationDate() {
		return quotationDate;
	}

	public void setQuotationDate(ISODateTime quotationDate) {
		this.quotationDate = quotationDate;
	}

	public List<AssetHolding> getCalculatedAssetValue() {
		return calculatedAssetValue;
	}

	public void setCalculatedAssetValue(List<com.tools20022.repository.entity.AssetHolding> calculatedAssetValue) {
		this.calculatedAssetValue = calculatedAssetValue;
	}

	public CurrencyCode getSourceCurrency() {
		return sourceCurrency;
	}

	public void setSourceCurrency(CurrencyCode sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}

	public CurrencyCode getTargetCurrency() {
		return targetCurrency;
	}

	public void setTargetCurrency(CurrencyCode targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

	public List<CashEntry> getCurrencyExchangeForCashEntry() {
		return currencyExchangeForCashEntry;
	}

	public void setCurrencyExchangeForCashEntry(List<com.tools20022.repository.entity.CashEntry> currencyExchangeForCashEntry) {
		this.currencyExchangeForCashEntry = currencyExchangeForCashEntry;
	}

	public Payment getRelatedPayment() {
		return relatedPayment;
	}

	public void setRelatedPayment(com.tools20022.repository.entity.Payment relatedPayment) {
		this.relatedPayment = relatedPayment;
	}

	public ExchangeRateTypeCode getRateType() {
		return rateType;
	}

	public void setRateType(ExchangeRateTypeCode rateType) {
		this.rateType = rateType;
	}

	public LiquidityManagementLimit getRelatedLimitManagement() {
		return relatedLimitManagement;
	}

	public void setRelatedLimitManagement(com.tools20022.repository.entity.LiquidityManagementLimit relatedLimitManagement) {
		this.relatedLimitManagement = relatedLimitManagement;
	}

	public List<FixingCondition> getFixingConditions() {
		return fixingConditions;
	}

	public void setFixingConditions(List<com.tools20022.repository.entity.FixingCondition> fixingConditions) {
		this.fixingConditions = fixingConditions;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(com.tools20022.repository.entity.Tax tax) {
		this.tax = tax;
	}

	public Invoice getRelatedInvoice() {
		return relatedInvoice;
	}

	public void setRelatedInvoice(com.tools20022.repository.entity.Invoice relatedInvoice) {
		this.relatedInvoice = relatedInvoice;
	}

	public TransactionAdministrator getCurrencyExchangeForTransactionAdministrator() {
		return currencyExchangeForTransactionAdministrator;
	}

	public void setCurrencyExchangeForTransactionAdministrator(com.tools20022.repository.entity.TransactionAdministrator currencyExchangeForTransactionAdministrator) {
		this.currencyExchangeForTransactionAdministrator = currencyExchangeForTransactionAdministrator;
	}

	public Account getReportedAccount() {
		return reportedAccount;
	}

	public void setReportedAccount(com.tools20022.repository.entity.Account reportedAccount) {
		this.reportedAccount = reportedAccount;
	}

	public CorporateActionCashEntitlement getCurrencyExchangeForCorporateActionCashEntitlement() {
		return currencyExchangeForCorporateActionCashEntitlement;
	}

	public void setCurrencyExchangeForCorporateActionCashEntitlement(com.tools20022.repository.entity.CorporateActionCashEntitlement currencyExchangeForCorporateActionCashEntitlement) {
		this.currencyExchangeForCorporateActionCashEntitlement = currencyExchangeForCorporateActionCashEntitlement;
	}

	public PaymentExecution getPaymentExecution() {
		return paymentExecution;
	}

	public void setPaymentExecution(com.tools20022.repository.entity.PaymentExecution paymentExecution) {
		this.paymentExecution = paymentExecution;
	}

	public Quote getCurrencyExchangeForSecuritiesQuote() {
		return currencyExchangeForSecuritiesQuote;
	}

	public void setCurrencyExchangeForSecuritiesQuote(com.tools20022.repository.entity.Quote currencyExchangeForSecuritiesQuote) {
		this.currencyExchangeForSecuritiesQuote = currencyExchangeForSecuritiesQuote;
	}

	public SecuritiesConversion getCurrencyExchangeForSecuritiesConversion() {
		return currencyExchangeForSecuritiesConversion;
	}

	public void setCurrencyExchangeForSecuritiesConversion(com.tools20022.repository.entity.SecuritiesConversion currencyExchangeForSecuritiesConversion) {
		this.currencyExchangeForSecuritiesConversion = currencyExchangeForSecuritiesConversion;
	}

	public CashDistribution getCurrencyExchangeForCashDistribution() {
		return currencyExchangeForCashDistribution;
	}

	public void setCurrencyExchangeForCashDistribution(com.tools20022.repository.entity.CashDistribution currencyExchangeForCashDistribution) {
		this.currencyExchangeForCashDistribution = currencyExchangeForCashDistribution;
	}

	public Adjustment getAdjustment() {
		return adjustment;
	}

	public void setAdjustment(com.tools20022.repository.entity.Adjustment adjustment) {
		this.adjustment = adjustment;
	}
}
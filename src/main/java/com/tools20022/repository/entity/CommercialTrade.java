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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Commercial details of a trade transaction between a buyer and a seller.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CommercialTrade" src="doc-files/CommercialTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPurchaseAccount
 * CommercialTrade.mmPurchaseAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
 * CommercialTrade.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTotalAcceptedAmount
 * CommercialTrade.mmTotalAcceptedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#mmPartyRole
 * CommercialTrade.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTradeSettlement
 * CommercialTrade.mmTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmProductDeliveryObligation
 * CommercialTrade.mmProductDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPurchaseOrder
 * CommercialTrade.mmPurchaseOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#mmDocuments
 * CommercialTrade.mmDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmRelatedUndertaking
 * CommercialTrade.mmRelatedUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTransactionStatus
 * CommercialTrade.mmTransactionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#mmAgreement
 * CommercialTrade.mmAgreement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCommercialTrade
 * CashAccount.mmRelatedCommercialTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmTrade
 * Agreement.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmCommercialTrade
 * Document.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmCommercialTrade
 * PaymentObligation.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmCommercialTrade
 * UnderlyingTransaction.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradePartyRole#mmCommercialTrade
 * CommercialTradePartyRole.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmCommercialTrade
 * CommercialTradeSettlement.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BaselineStatus#mmCommercialTrade
 * BaselineStatus.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmResultingCommercialTrade
 * PurchaseOrder.mmResultingCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#mmCommercialTrade
 * ProductDeliveryObligation.mmCommercialTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmGoods
 * Baseline2.mmGoods}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmGoods
 * Baseline3.mmGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingContract1Choice#mmTrade
 * UnderlyingContract1Choice.mmTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10 LineItem10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem5 LineItem5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2 Baseline2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem7 LineItem7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3 Baseline3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem4 LineItem4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommercialDataSet2
 * CommercialDataSet2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem9 LineItem9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommercialDataSet3
 * CommercialDataSet3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline4 Baseline4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommercialDataSet4
 * CommercialDataSet4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem11 LineItem11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem12 LineItem12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentInvoice1
 * CardPaymentInvoice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5 Baseline5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommercialDataSet5
 * CommercialDataSet5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem13 LineItem13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem15 LineItem15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement2
 * TradeSettlement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentInvoice2
 * CardPaymentInvoice2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem16 LineItem16}</li>
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
 * "CommercialTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Commercial details of a trade transaction between a buyer and a seller."</li>
 * </ul>
 */
public class CommercialTrade extends Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashAccount> purchaseAccount;
	/**
	 * Specific purchase account for recording debits and credits for accounting
	 * purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCommercialTrade
	 * CashAccount.mmRelatedCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPurchaseAccountingAccount
	 * TradeSettlement1.mmPurchaseAccountingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmPurchaseAccountingAccount
	 * LineItem10.mmPurchaseAccountingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmPurchaseAccountingAccount
	 * LineItem16.mmPurchaseAccountingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific purchase account for recording debits and credits for accounting purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPurchaseAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSettlement1.mmPurchaseAccountingAccount, com.tools20022.repository.msg.LineItem10.mmPurchaseAccountingAccount,
					com.tools20022.repository.msg.LineItem16.mmPurchaseAccountingAccount);
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseAccount";
			definition = "Specific purchase account for recording debits and credits for accounting purposes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedCommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> paymentObligation;
	/**
	 * Obligation for the buyer to settle the value of the products bought.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmCommercialTrade
	 * PaymentObligation.mmCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmPaymentTerms
	 * Baseline2.mmPaymentTerms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmPaymentTerms
	 * Baseline3.mmPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline3#mmPaymentObligation
	 * Baseline3.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet2#mmPaymentTerms
	 * CommercialDataSet2.mmPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet3#mmPaymentTerms
	 * CommercialDataSet3.mmPaymentTerms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#mmPaymentTerms
	 * Baseline4.mmPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline4#mmPaymentObligation
	 * Baseline4.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet4#mmPaymentTerms
	 * CommercialDataSet4.mmPaymentTerms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmPaymentTerms
	 * Baseline5.mmPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Baseline5#mmPaymentObligation
	 * Baseline5.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5#mmPaymentTerms
	 * CommercialDataSet5.mmPaymentTerms}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligation for the buyer to settle the value of the products bought."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentObligation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Baseline2.mmPaymentTerms, com.tools20022.repository.msg.Baseline3.mmPaymentTerms, com.tools20022.repository.msg.Baseline3.mmPaymentObligation,
					com.tools20022.repository.msg.CommercialDataSet2.mmPaymentTerms, com.tools20022.repository.msg.CommercialDataSet3.mmPaymentTerms, com.tools20022.repository.msg.Baseline4.mmPaymentTerms,
					com.tools20022.repository.msg.Baseline4.mmPaymentObligation, com.tools20022.repository.msg.CommercialDataSet4.mmPaymentTerms, com.tools20022.repository.msg.Baseline5.mmPaymentTerms,
					com.tools20022.repository.msg.Baseline5.mmPaymentObligation, com.tools20022.repository.msg.CommercialDataSet5.mmPaymentTerms);
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Obligation for the buyer to settle the value of the products bought.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmCommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected CurrencyAndAmount totalAcceptedAmount;
	/**
	 * Total amount of a trade, that is the sum of the accepted items.
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
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem6#mmAcceptedLineItemsTotalAmount
	 * LineItem6.mmAcceptedLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmAcceptedLineItemsTotalAmount
	 * LineItem8.mmAcceptedLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmAcceptedLineItemsTotalAmount
	 * LineItem14.mmAcceptedLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmTaxTotalAmount
	 * TradeSettlement2.mmTaxTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAcceptedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of a trade, that is the sum of the accepted items."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalAcceptedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem6.mmAcceptedLineItemsTotalAmount, com.tools20022.repository.msg.LineItem8.mmAcceptedLineItemsTotalAmount,
					com.tools20022.repository.msg.LineItem14.mmAcceptedLineItemsTotalAmount, com.tools20022.repository.msg.TradeSettlement2.mmTaxTotalAmount);
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalAcceptedAmount";
			definition = "Total amount of a trade, that is the sum of the accepted items.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CommercialTradePartyRole> partyRole;
	/**
	 * Role played by a party in the context of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradePartyRole#mmCommercialTrade
	 * CommercialTradePartyRole.mmCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradePartyRole
	 * CommercialTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in the context of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradePartyRole.mmCommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTradePartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CommercialTradeSettlement> tradeSettlement;
	/**
	 * Process of settling a commercial trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmCommercialTrade
	 * CommercialTradeSettlement.mmCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Process of settling a commercial trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradeSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Process of settling a commercial trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmCommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ProductDeliveryObligation> productDeliveryObligation;
	/**
	 * Obligation for the seller to deliver the products to the buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#mmCommercialTrade
	 * ProductDeliveryObligation.mmCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation
	 * ProductDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Obligation for the seller to deliver the products to the buyer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProductDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductDeliveryObligation";
			definition = "Obligation for the seller to deliver the products to the buyer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.mmCommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.mmObject();
		}
	};
	protected PurchaseOrder purchaseOrder;
	/**
	 * Specifies the purchase order related to a commercial trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmResultingCommercialTrade
	 * PurchaseOrder.mmResultingCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PurchaseOrder
	 * PurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemAndPOIdentification1#mmPurchaseOrderReference
	 * LineItemAndPOIdentification1.mmPurchaseOrderReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the purchase order related to a commercial trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPurchaseOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemAndPOIdentification1.mmPurchaseOrderReference);
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseOrder";
			definition = "Specifies the purchase order related to a commercial trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmResultingCommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmObject();
		}
	};
	protected Document documents;
	/**
	 * Documents related to a commercial trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmCommercialTrade
	 * Document.mmCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Documents"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Documents related to                             a commercial trade transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDocuments = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Documents";
			definition = "Documents related to                             a commercial trade transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmCommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	protected UnderlyingTransaction relatedUndertaking;
	/**
	 * Undertaking related to the commercial trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction#mmCommercialTrade
	 * UnderlyingTransaction.mmCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingTransaction
	 * UnderlyingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking related to the commercial trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedUndertaking = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedUndertaking";
			definition = "Undertaking related to the commercial trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmCommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmObject();
		}
	};
	protected BaselineStatus transactionStatus;
	/**
	 * Status of a commercial trade processed in a central system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BaselineStatus#mmCommercialTrade
	 * BaselineStatus.mmCommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BaselineStatus
	 * BaselineStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of a commercial trade processed in a central system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransactionStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Status of a commercial trade processed in a central system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BaselineStatus.mmCommercialTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BaselineStatus.mmObject();
		}
	};
	protected Agreement agreement;
	/**
	 * Agreement between trade parties which describes the conditions under
	 * which they agree to execute trades amongst themselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmTrade
	 * Agreement.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Agreement Agreement}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement between trade parties which describes the conditions under which they agree to execute trades amongst themselves."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommercialTrade.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Agreement";
			definition = "Agreement between trade parties which describes the conditions under which they agree to execute trades amongst themselves.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.mmTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CommercialTrade";
				definition = "Commercial details of a trade transaction between a buyer and a seller.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmRelatedCommercialTrade, com.tools20022.repository.entity.Agreement.mmTrade,
						com.tools20022.repository.entity.Document.mmCommercialTrade, com.tools20022.repository.entity.PaymentObligation.mmCommercialTrade, com.tools20022.repository.entity.UnderlyingTransaction.mmCommercialTrade,
						com.tools20022.repository.entity.CommercialTradePartyRole.mmCommercialTrade, com.tools20022.repository.entity.CommercialTradeSettlement.mmCommercialTrade,
						com.tools20022.repository.entity.BaselineStatus.mmCommercialTrade, com.tools20022.repository.entity.PurchaseOrder.mmResultingCommercialTrade,
						com.tools20022.repository.entity.ProductDeliveryObligation.mmCommercialTrade);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Baseline2.mmGoods, com.tools20022.repository.msg.Baseline3.mmGoods, com.tools20022.repository.choice.UnderlyingContract1Choice.mmTrade);
				superType_lazy = () -> Trade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CommercialTrade.mmPurchaseAccount, com.tools20022.repository.entity.CommercialTrade.mmPaymentObligation,
						com.tools20022.repository.entity.CommercialTrade.mmTotalAcceptedAmount, com.tools20022.repository.entity.CommercialTrade.mmPartyRole, com.tools20022.repository.entity.CommercialTrade.mmTradeSettlement,
						com.tools20022.repository.entity.CommercialTrade.mmProductDeliveryObligation, com.tools20022.repository.entity.CommercialTrade.mmPurchaseOrder, com.tools20022.repository.entity.CommercialTrade.mmDocuments,
						com.tools20022.repository.entity.CommercialTrade.mmRelatedUndertaking, com.tools20022.repository.entity.CommercialTrade.mmTransactionStatus, com.tools20022.repository.entity.CommercialTrade.mmAgreement);
				derivationComponent_lazy = () -> Arrays.asList(LineItem10.mmObject(), LineItem5.mmObject(), Baseline2.mmObject(), LineItem7.mmObject(), Baseline3.mmObject(), LineItem4.mmObject(), CommercialDataSet2.mmObject(),
						LineItem9.mmObject(), CommercialDataSet3.mmObject(), Baseline4.mmObject(), CommercialDataSet4.mmObject(), LineItem11.mmObject(), LineItem12.mmObject(), CardPaymentInvoice1.mmObject(), Baseline5.mmObject(),
						CommercialDataSet5.mmObject(), LineItem13.mmObject(), LineItem15.mmObject(), TradeSettlement2.mmObject(), CardPaymentInvoice2.mmObject(), LineItem16.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccount> getPurchaseAccount() {
		return purchaseAccount;
	}

	public void setPurchaseAccount(List<com.tools20022.repository.entity.CashAccount> purchaseAccount) {
		this.purchaseAccount = purchaseAccount;
	}

	public List<PaymentObligation> getPaymentObligation() {
		return paymentObligation;
	}

	public void setPaymentObligation(List<com.tools20022.repository.entity.PaymentObligation> paymentObligation) {
		this.paymentObligation = paymentObligation;
	}

	public CurrencyAndAmount getTotalAcceptedAmount() {
		return totalAcceptedAmount;
	}

	public void setTotalAcceptedAmount(CurrencyAndAmount totalAcceptedAmount) {
		this.totalAcceptedAmount = totalAcceptedAmount;
	}

	public List<CommercialTradePartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.CommercialTradePartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public List<CommercialTradeSettlement> getTradeSettlement() {
		return tradeSettlement;
	}

	public void setTradeSettlement(List<com.tools20022.repository.entity.CommercialTradeSettlement> tradeSettlement) {
		this.tradeSettlement = tradeSettlement;
	}

	public List<ProductDeliveryObligation> getProductDeliveryObligation() {
		return productDeliveryObligation;
	}

	public void setProductDeliveryObligation(List<com.tools20022.repository.entity.ProductDeliveryObligation> productDeliveryObligation) {
		this.productDeliveryObligation = productDeliveryObligation;
	}

	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(com.tools20022.repository.entity.PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public Document getDocuments() {
		return documents;
	}

	public void setDocuments(com.tools20022.repository.entity.Document documents) {
		this.documents = documents;
	}

	public UnderlyingTransaction getRelatedUndertaking() {
		return relatedUndertaking;
	}

	public void setRelatedUndertaking(com.tools20022.repository.entity.UnderlyingTransaction relatedUndertaking) {
		this.relatedUndertaking = relatedUndertaking;
	}

	public BaselineStatus getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(com.tools20022.repository.entity.BaselineStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public Agreement getAgreement() {
		return agreement;
	}

	public void setAgreement(com.tools20022.repository.entity.Agreement agreement) {
		this.agreement = agreement;
	}
}
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
import com.tools20022.repository.codeset.AccountLevelCode;
import com.tools20022.repository.codeset.CashAccountTypeCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Account to or from which a cash entry is made.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashAccount" src="doc-files/CashAccount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountType
 * CashAccount.mmCashAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedInvestmentAccount
 * CashAccount.mmRelatedInvestmentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmCashEntry
 * CashAccount.mmCashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
 * CashAccount.mmCashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmPaymentPartyRole
 * CashAccount.mmPaymentPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCreditStandingOrder
 * CashAccount.mmRelatedCreditStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedDebitStandingOrder
 * CashAccount.mmRelatedDebitStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountContract
 * CashAccount.mmCashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCorporateActionElection
 * CashAccount.mmRelatedCorporateActionElection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmCharges
 * CashAccount.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmTax
 * CashAccount.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedSettlementInstruction
 * CashAccount.mmRelatedSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashSettlementPartyRole
 * CashAccount.mmCashSettlementPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmUltimateObligor
 * CashAccount.mmUltimateObligor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedPaymentCard
 * CashAccount.mmRelatedPaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmSecuritiesPartyRole
 * CashAccount.mmSecuritiesPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedInvoiceFinancingPartyRole
 * CashAccount.mmRelatedInvoiceFinancingPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCommercialTrade
 * CashAccount.mmRelatedCommercialTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmLevel
 * CashAccount.mmLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmSettlementCurrency
 * CashAccount.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmReportedMovements
 * CashAccount.mmReportedMovements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmClosedAccountContract
 * CashAccount.mmClosedAccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmAccountLink
 * CashAccount.mmAccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashStandingOrder
 * CashAccount.mmCashStandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmCheque
 * CashAccount.mmCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountService
 * CashAccount.mmCashAccountService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmPayment
 * CashAccount.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmCommission
 * CashAccount.mmCommission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCashAccount
 * InvestmentAccount.mmCashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxAccount
 * Tax.mmTaxAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmAccount
 * Commission.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAccount
 * Payment.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmRelatedAccount
 * PaymentCard.mmRelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
 * CashEntry.mmCashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Cheque#mmCashAccount
 * Cheque.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementAccount
 * CashSettlement.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
 * PaymentPartyRole.mmCashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#mmCashAccount
 * CashBalance.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmCreditAccount
 * StandingOrder.mmCreditAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmDebitAccount
 * StandingOrder.mmDebitAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmCashAccount
 * CashStandingOrder.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmCashAccount
 * SecuritiesPartyRole.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Charges#mmChargesDebitAccount
 * Charges.mmChargesDebitAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccount
 * CashAccountContract.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmTransferCashAccount
 * CashAccountContract.mmTransferCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccount
 * CashAccountService.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmCashAccount
 * CashSettlementInstructionPartyRole.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmCashAccount
 * CorporateActionElection.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmReportedCashAccount
 * AccountReportedMovement.mmReportedCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor#mmCashAccount
 * UndertakingUltimateObligor.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#mmCashAccount
 * InvoiceFinancingPartyRole.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPurchaseAccount
 * CommercialTrade.mmPurchaseAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountLink#mmCashAccount
 * AccountLink.mmCashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderDeskContactDetails#mmSettlementDetails
 * OrderDeskContactDetails.mmSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentInstrument17Choice#mmCashAccountDetails
 * PaymentInstrument17Choice.mmCashAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError1Choice#mmAccount
 * AccountOrBusinessError1Choice.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountAndEntry1#mmAccount
 * CashAccountAndEntry1.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#mmCashAccount
 * CorporateActionOption9.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#mmCashAccount
 * CorporateActionOption18.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#mmCashAccount
 * CorporateActionOption22.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmCashAccount
 * CorporateActionOption27.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#mmCashAccount
 * CorporateActionOption26.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#mmCashAccount
 * CorporateActionOption41.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#mmCashAccount
 * CorporateActionOption50.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#mmCashAccount
 * CorporateActionOption29.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Account8Choice#mmCashAccount
 * Account8Choice.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Account9Choice#mmCashAccount
 * Account9Choice.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails4#mmCashDetails
 * ConfirmationPartyDetails4.mmCashDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary14#mmCashDetails
 * Intermediary14.mmCashDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount1#mmType
 * CustomerAccount1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount5#mmType
 * CustomerAccount5.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmType
 * CustomerAccountModification1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount4#mmType
 * CustomerAccount4.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport9#mmRelatedAccount
 * AccountReport9.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport11#mmRelatedAccount
 * AccountReport11.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport12#mmRelatedAccount
 * AccountReport12.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport16#mmRelatedAccount
 * AccountReport16.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement1#mmRelatedAccount
 * AccountStatement1.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement2#mmRelatedAccount
 * AccountStatement2.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement3#mmRelatedAccount
 * AccountStatement3.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmRelatedAccount
 * AccountStatement4.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmInstructingReimbursementAgentAccount
 * SettlementInformation3.mmInstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmInstructedReimbursementAgentAccount
 * SettlementInformation3.mmInstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation1#mmInstructingReimbursementAgentAccount
 * SettlementInformation1.mmInstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation1#mmInstructedReimbursementAgentAccount
 * SettlementInformation1.mmInstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmInstructingReimbursementAgentAccount
 * SettlementInformation13.mmInstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmInstructedReimbursementAgentAccount
 * SettlementInformation13.mmInstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation16#mmInstructingReimbursementAgentAccount
 * SettlementInformation16.mmInstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation16#mmInstructedReimbursementAgentAccount
 * SettlementInformation16.mmInstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmBeneficiaryInstitutionAccount
 * RequestedModification.mmBeneficiaryInstitutionAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashProceeds1#mmAccountDetails
 * CashProceeds1.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1#mmCashDistributionDetails
 * CorporateActionStandingInstruction1.mmCashDistributionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationItem3#mmRelatedAccount
 * NotificationItem3.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#mmRelatedAccount
 * OriginalItemReference1.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference1#mmRelatedAccount
 * OriginalNotificationReference1.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference2#mmRelatedAccount
 * OriginalNotificationReference2.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation15#mmInstructingReimbursementAgentAccount
 * SettlementInformation15.mmInstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation15#mmInstructedReimbursementAgentAccount
 * SettlementInformation15.mmInstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationItem4#mmRelatedAccount
 * NotificationItem4.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#mmRelatedAccount
 * OriginalItemReference2.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference4#mmRelatedAccount
 * OriginalNotificationReference4.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference3#mmRelatedAccount
 * OriginalNotificationReference3.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndParties1#mmIdentification
 * AccountAndParties1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParentCashAccount1#mmIdentification
 * ParentCashAccount1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmCashAccount
 * CashAccountCharacteristics1.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmInstructingReimbursementAgentAccount
 * SettlementInformation6.mmInstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmInstructedReimbursementAgentAccount
 * SettlementInformation6.mmInstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation8#mmInstructingReimbursementAgentAccount
 * SettlementInformation8.mmInstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation8#mmInstructedReimbursementAgentAccount
 * SettlementInformation8.mmInstructedReimbursementAgentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferOut4#mmCashAccount
 * TransferOut4.mmCashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member1#mmAccount
 * Member1.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#mmType
 * CustomerAccount2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3#mmType
 * CustomerAccount3.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#mmCashAccount
 * CorporateActionOption8.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError2Choice#mmAccount
 * AccountOrBusinessError2Choice.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndParties2#mmAccount
 * AccountAndParties2.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport18#mmRelatedAccount
 * AccountReport18.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmRelatedAccount
 * AccountStatement5.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference6#mmRelatedAccount
 * OriginalNotificationReference6.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#mmRelatedAccount
 * OriginalItemReference3.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference5#mmRelatedAccount
 * OriginalNotificationReference5.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationItem5#mmRelatedAccount
 * NotificationItem5.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmRelatedAccount
 * AccountStatement6.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport19#mmRelatedAccount
 * AccountReport19.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmCashAccount
 * CashAccountCharacteristics2.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParentCashAccount2#mmIdentification
 * ParentCashAccount2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference8#mmRelatedAccount
 * OriginalNotificationReference8.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmRelatedAccount
 * OriginalItemReference4.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalNotificationReference7#mmRelatedAccount
 * OriginalNotificationReference7.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmRelatedAccount
 * NotificationItem6.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmCashAccount
 * CorporateActionOption116.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSettlement1#mmCashAccountDetails
 * CashSettlement1.mmCashAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashSettlement2#mmCashAccountDetails
 * CashSettlement2.mmCashAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#mmCashAccount
 * CorporateActionOption121.mmCashAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount15 CashAccount15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount14 CashAccount14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount21 CashAccount21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount22 CashAccount22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount5 CashAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount4 CashAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount12 CashAccount12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount26 CashAccount26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria2
 * CashAccountSearchCriteria2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria3
 * CashAccountSearchCriteria3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria4
 * CashAccountSearchCriteria4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountType2
 * CashAccountType2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashAccountType2Choice
 * CashAccountType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5
 * CashAccountSearchCriteria5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount7 CashAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount16 CashAccount16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount24 CashAccount24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount6 CashAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount11 CashAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails1
 * CashAccountDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Accounts2 Accounts2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails3
 * CashAccountDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Accounts3 Accounts3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails4
 * CashAccountDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Accounts4 Accounts4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount23 CashAccount23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError1Choice
 * AccountOrBusinessError1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount13 CashAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount20 CashAccount20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25 CashAccount25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountAndEntry1
 * CashAccountAndEntry1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Account8Choice
 * Account8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Account9Choice
 * Account9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction1
 * AccountForAction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountForAction2
 * AccountForAction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount1
 * CustomerAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount5
 * CustomerAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PurposeModification1
 * PurposeModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccountModification1
 * CustomerAccountModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount4
 * CustomerAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount28 CashAccount28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount27 CashAccount27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountType1
 * CashAccountType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount3 CashAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount19 CashAccount19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount18 CashAccount18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount17 CashAccount17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndParties1
 * AccountAndParties1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount1
 * ParentCashAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
 * CashAccountCharacteristics1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount10 CashAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount8 CashAccount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
 * CustomerAccountReturnCriteria1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2
 * CustomerAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount3
 * CustomerAccount3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOrBusinessError2Choice
 * AccountOrBusinessError2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount29 CashAccount29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount3 CardAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount1 CardAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount6 CardAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount4 CardAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount5 CardAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount2 CardAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
 * CashAccountCharacteristics2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount2
 * ParentCashAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount34 CashAccount34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount32 CashAccount32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccount33 CashAccount33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount10 CardAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount9 CardAccount9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount8 CardAccount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount11 CardAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount13 CardAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount7 CardAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount12 CardAccount12}</li>
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
 * "CashAccount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a cash entry is made."</li>
 * </ul>
 */
public class CashAccount extends Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CashAccountTypeCode cashAccountType;
	/**
	 * Specifies the nature, or use, of the cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount22#mmAccountTypeDescription
	 * CashAccount22.mmAccountTypeDescription}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount5#mmType
	 * CashAccount5.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount12#mmType
	 * CashAccount12.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount12#mmExtendedType
	 * CashAccount12.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria2#mmType
	 * CashAccountSearchCriteria2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria3#mmType
	 * CashAccountSearchCriteria3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria4#mmType
	 * CashAccountSearchCriteria4.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountType2#mmCode
	 * CashAccountType2.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountType2#mmProprietary
	 * CashAccountType2.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountType2Choice#mmCode
	 * CashAccountType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAccountType2Choice#mmProprietary
	 * CashAccountType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#mmType
	 * CashAccountSearchCriteria5.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount7#mmType
	 * CashAccount7.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount16#mmType
	 * CashAccount16.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount24#mmType
	 * CashAccount24.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationDetails#mmType
	 * AccountIdentificationDetails.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification1#mmAccountType
	 * StandingOrderIdentification1.mmAccountType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmType
	 * CashAccountDetails1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmType
	 * CashAccountDetails3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails4#mmType
	 * CashAccountDetails4.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount23#mmType
	 * CashAccount23.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmAccountType
	 * AccountCashEntryDetails3.mmAccountType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount13#mmType
	 * CashAccount13.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount20#mmType
	 * CashAccount20.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount25#mmType
	 * CashAccount25.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount27#mmType
	 * CashAccount27.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashAccount3#mmType
	 * CashAccount3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmCashAccountPurpose
	 * CashAccount33.mmCashAccountPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the nature, or use, of the cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCashAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.CashAccount22.mmAccountTypeDescription, com.tools20022.repository.msg.CashAccount5.mmType, com.tools20022.repository.msg.CashAccount12.mmType,
							com.tools20022.repository.msg.CashAccount12.mmExtendedType, com.tools20022.repository.msg.CashAccountSearchCriteria2.mmType, com.tools20022.repository.msg.CashAccountSearchCriteria3.mmType,
							com.tools20022.repository.msg.CashAccountSearchCriteria4.mmType, com.tools20022.repository.msg.CashAccountType2.mmCode, com.tools20022.repository.msg.CashAccountType2.mmProprietary,
							com.tools20022.repository.choice.CashAccountType2Choice.mmCode, com.tools20022.repository.choice.CashAccountType2Choice.mmProprietary, com.tools20022.repository.msg.CashAccountSearchCriteria5.mmType,
							com.tools20022.repository.msg.CashAccount7.mmType, com.tools20022.repository.msg.CashAccount16.mmType, com.tools20022.repository.msg.CashAccount24.mmType,
							com.tools20022.repository.msg.AccountIdentificationDetails.mmType, com.tools20022.repository.msg.StandingOrderIdentification1.mmAccountType, com.tools20022.repository.msg.CashAccountDetails1.mmType,
							com.tools20022.repository.msg.CashAccountDetails3.mmType, com.tools20022.repository.msg.CashAccountDetails4.mmType, com.tools20022.repository.msg.CashAccount23.mmType,
							com.tools20022.repository.msg.AccountCashEntryDetails3.mmAccountType, com.tools20022.repository.msg.CashAccount13.mmType, com.tools20022.repository.msg.CashAccount20.mmType,
							com.tools20022.repository.msg.CashAccount25.mmType, com.tools20022.repository.msg.CashAccount27.mmType, com.tools20022.repository.msg.CashAccount3.mmType,
							com.tools20022.repository.msg.CashAccount33.mmCashAccountPurpose);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountType";
			definition = "Specifies the nature, or use, of the cash account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashAccountTypeCode.mmObject();
		}
	};
	protected InvestmentAccount relatedInvestmentAccount;
	/**
	 * Investment account for which a cash branch is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCashAccount
	 * InvestmentAccount.mmCashAccount}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmInvestmentAccountType
	 * CashAccount26.mmInvestmentAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmInvestmentAccountType
	 * CashAccount33.mmInvestmentAccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment account for which a cash branch is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount26.mmInvestmentAccountType, com.tools20022.repository.msg.CashAccount33.mmInvestmentAccountType);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccount";
			definition = "Investment account for which a cash branch is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashEntry> cashEntry;
	/**
	 * Record of the cash movements into or out of a cash account. It is derived
	 * from the association between Account and Entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
	 * CashEntry.mmCashAccount}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountAndEntry1#mmEntry
	 * CashAccountAndEntry1.mmEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest1#mmRequestedTransactionType
	 * ReportingRequest1.mmRequestedTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest2#mmRequestedTransactionType
	 * ReportingRequest2.mmRequestedTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmRequestedTransactionType
	 * ReportingRequest3.mmRequestedTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Record of the cash movements into or out of a cash account. It is derived from the association between Account and Entry."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashEntry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountAndEntry1.mmEntry, com.tools20022.repository.msg.ReportingRequest1.mmRequestedTransactionType,
					com.tools20022.repository.msg.ReportingRequest2.mmRequestedTransactionType, com.tools20022.repository.msg.ReportingRequest3.mmRequestedTransactionType);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Record of the cash movements into or out of a cash account. It is derived from the association between Account and Entry.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashBalance> cashBalance;
	/**
	 * Overall position representing the net debits and credits in an account at
	 * a specific point in time. It is derived from the association between
	 * Account and Balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashAccount
	 * CashBalance.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashBalance
	 * CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria2#mmBalance
	 * CashAccountSearchCriteria2.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria3#mmBalance
	 * CashAccountSearchCriteria3.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria4#mmBalance
	 * CashAccountSearchCriteria4.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountSearchCriteria5#mmBalance
	 * CashAccountSearchCriteria5.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails1#mmBilateralBalance
	 * BilateralLimitDetails1.mmBilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmMultilateralBalance
	 * CashAccountDetails1.mmMultilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails2#mmBilateralBalance
	 * BilateralLimitDetails2.mmBilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmMultilateralBalance
	 * CashAccountDetails3.mmMultilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimitDetails3#mmBilateralBalance
	 * BilateralLimitDetails3.mmBilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails4#mmMultilateralBalance
	 * CashAccountDetails4.mmMultilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BilateralLimit1#mmBilateralBalance
	 * BilateralLimit1.mmBilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount23#mmMultilateralBalance
	 * CashAccount23.mmMultilateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmBalance
	 * BillingStatement1.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmBalanceAdjustment
	 * BillingStatement1.mmBalanceAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmBalance
	 * BillingStatement2.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmBalanceAdjustment
	 * BillingStatement2.mmBalanceAdjustment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Overall position representing the net debits and credits in an account at a specific point in time. It is derived from the association between Account and Balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountSearchCriteria2.mmBalance, com.tools20022.repository.msg.CashAccountSearchCriteria3.mmBalance,
					com.tools20022.repository.msg.CashAccountSearchCriteria4.mmBalance, com.tools20022.repository.msg.CashAccountSearchCriteria5.mmBalance, com.tools20022.repository.msg.BilateralLimitDetails1.mmBilateralBalance,
					com.tools20022.repository.msg.CashAccountDetails1.mmMultilateralBalance, com.tools20022.repository.msg.BilateralLimitDetails2.mmBilateralBalance, com.tools20022.repository.msg.CashAccountDetails3.mmMultilateralBalance,
					com.tools20022.repository.msg.BilateralLimitDetails3.mmBilateralBalance, com.tools20022.repository.msg.CashAccountDetails4.mmMultilateralBalance, com.tools20022.repository.msg.BilateralLimit1.mmBilateralBalance,
					com.tools20022.repository.msg.CashAccount23.mmMultilateralBalance, com.tools20022.repository.msg.BillingStatement1.mmBalance, com.tools20022.repository.msg.BillingStatement1.mmBalanceAdjustment,
					com.tools20022.repository.msg.BillingStatement2.mmBalance, com.tools20022.repository.msg.BillingStatement2.mmBalanceAdjustment);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Overall position representing the net debits and credits in an account at a specific point in time. It is derived from the association between Account and Balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
		}
	};
	protected PaymentPartyRole paymentPartyRole;
	/**
	 * Specifies each role linked to a payment and using a specific cash account
	 * in the payment context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a payment and using a specific cash account in the payment context. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentPartyRole";
			definition = "Specifies each role linked to a payment and using a specific cash account in the payment context. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmObject();
		}
	};
	protected StandingOrder relatedCreditStandingOrder;
	/**
	 * Instruction given by an account holder to an account servicer to make
	 * regular transfers on given dates to the same beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmCreditAccount
	 * StandingOrder.mmCreditAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCreditStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCreditStandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCreditStandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmCreditAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
		}
	};
	protected StandingOrder relatedDebitStandingOrder;
	/**
	 * Instruction given by an account holder to an account servicer to make
	 * regular transfers on given dates to the same beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmDebitAccount
	 * StandingOrder.mmDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedDebitStandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDebitStandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmDebitAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashAccountContract> cashAccountContract;
	/**
	 * Contract which manages the account. It is derived from the relation
	 * between AccountContract and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccount
	 * CashAccountContract.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Accounts2#mmAccountReport
	 * Accounts2.mmAccountReport}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Accounts3#mmAccountReport
	 * Accounts3.mmAccountReport}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Accounts4#mmAccountReport
	 * Accounts4.mmAccountReport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract which manages the account. It is derived from the relation between AccountContract and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccountContract = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Accounts2.mmAccountReport, com.tools20022.repository.msg.Accounts3.mmAccountReport, com.tools20022.repository.msg.Accounts4.mmAccountReport);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountContract";
			definition = "Contract which manages the account. It is derived from the relation between AccountContract and Account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
		}
	};
	protected CorporateActionElection relatedCorporateActionElection;
	/**
	 * Election process which uses specific cash accounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmCashAccount
	 * CorporateActionElection.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionElection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Election process which uses specific cash accounts."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionElection = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionElection";
			definition = "Election process which uses specific cash accounts.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Charges> charges;
	/**
	 * Specifies the charges which are debited from the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmChargesDebitAccount
	 * Charges.mmChargesDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the charges which are debited from the account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCharges = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Specifies the charges which are debited from the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.mmChargesDebitAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	protected Tax tax;
	/**
	 * Tax charged on a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxAccount
	 * Tax.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmTax
	 * CashAccountCharacteristics1.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmTax
	 * CashAccountCharacteristics2.mmTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax charged on a cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics1.mmTax, com.tools20022.repository.msg.CashAccountCharacteristics2.mmTax);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax charged on a cash account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmTaxAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected CashSettlement relatedSettlementInstruction;
	/**
	 * Settlement process which uses specific cash accounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementAccount
	 * CashSettlement.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmSettlementInstructionReason
	 * CashAccount33.mmSettlementInstructionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement process which uses specific cash accounts."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount33.mmSettlementInstructionReason);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSettlementInstruction";
			definition = "Settlement process which uses specific cash accounts.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmSettlementAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
		}
	};
	protected CashSettlementInstructionPartyRole cashSettlementPartyRole;
	/**
	 * Specifies each role linked to a payment settlement and using a specific
	 * cash account in the payment context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmCashAccount
	 * CashSettlementInstructionPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
	 * CashSettlementInstructionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a payment settlement and using a specific cash account in the payment context. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashSettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashSettlementPartyRole";
			definition = "Specifies each role linked to a payment settlement and using a specific cash account in the payment context. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmObject();
		}
	};
	protected UndertakingUltimateObligor ultimateObligor;
	/**
	 * Party for which different types of cash accounts are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor#mmCashAccount
	 * UndertakingUltimateObligor.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingUltimateObligor
	 * UndertakingUltimateObligor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateObligor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party for which different types of cash accounts are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUltimateObligor = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UltimateObligor";
			definition = "Party for which different types of cash accounts are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingUltimateObligor.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingUltimateObligor.mmObject();
		}
	};
	protected PaymentCard relatedPaymentCard;
	/**
	 * Payment card for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmRelatedAccount
	 * PaymentCard.mmRelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmRelatedAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmObject();
		}
	};
	protected SecuritiesPartyRole securitiesPartyRole;
	/**
	 * Specifies the role which uses a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmCashAccount
	 * SecuritiesPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
	 * SecuritiesPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role which uses a cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPartyRole";
			definition = "Specifies the role which uses a cash account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
		}
	};
	protected InvoiceFinancingPartyRole relatedInvoiceFinancingPartyRole;
	/**
	 * Specifies each role using a specific account in the context of invoice
	 * financing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole#mmCashAccount
	 * InvoiceFinancingPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole
	 * InvoiceFinancingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvoiceFinancingPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role using a specific account in the context of invoice financing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvoiceFinancingPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoiceFinancingPartyRole";
			definition = "Specifies each role using a specific account in the context of invoice financing.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingPartyRole.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingPartyRole.mmObject();
		}
	};
	protected CommercialTrade relatedCommercialTrade;
	/**
	 * Commercial trade for which a purchase account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPurchaseAccount
	 * CommercialTrade.mmPurchaseAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commercial trade for which a purchase account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCommercialTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCommercialTrade";
			definition = "Commercial trade for which a purchase account is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmPurchaseAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};
	protected AccountLevelCode level;
	/**
	 * Defines the level of an account within the account hierarchy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountLevelCode
	 * AccountLevelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount1#mmLevel
	 * ParentCashAccount1.mmLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmAccountLevel
	 * CashAccountCharacteristics1.mmAccountLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountLevel
	 * CashAccountCharacteristics2.mmAccountLevel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount2#mmLevel
	 * ParentCashAccount2.mmLevel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the level of an account within the account hierarchy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLevel = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ParentCashAccount1.mmLevel, com.tools20022.repository.msg.CashAccountCharacteristics1.mmAccountLevel,
					com.tools20022.repository.msg.CashAccountCharacteristics2.mmAccountLevel, com.tools20022.repository.msg.ParentCashAccount2.mmLevel);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Level";
			definition = "Defines the level of an account within the account hierarchy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountLevelCode.mmObject();
		}
	};
	protected CurrencyCode settlementCurrency;
	/**
	 * Specifies the currency used for settlement, if different from the account
	 * currency.
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
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmSettlementCurrencyCode
	 * CashAccountCharacteristics1.mmSettlementCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmSettlementCurrencyCode
	 * CashAccountCharacteristics2.mmSettlementCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the currency used for settlement, if different from the account currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSettlementCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics1.mmSettlementCurrencyCode, com.tools20022.repository.msg.CashAccountCharacteristics2.mmSettlementCurrencyCode);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Specifies the currency used for settlement, if different from the account currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AccountReportedMovement> reportedMovements;
	/**
	 * Provides statistical information on the number of movements and their
	 * value for a particular account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmReportedCashAccount
	 * AccountReportedMovement.mmReportedCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement
	 * AccountReportedMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedMovements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides statistical information on the number of movements and their value for a particular account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReportedMovements = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportedMovements";
			definition = "Provides statistical information on the number of movements and their value for a particular account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountReportedMovement.mmReportedCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountReportedMovement.mmObject();
		}
	};
	protected CashAccountContract closedAccountContract;
	/**
	 * Contract which specifies the cash account to/from which the balance of a
	 * closed account must be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmTransferCashAccount
	 * CashAccountContract.mmTransferCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract which specifies the cash account to/from which the balance of a closed account must be transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClosedAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosedAccountContract";
			definition = "Contract which specifies the cash account to/from which the balance of a closed account must be transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmTransferCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AccountLink> accountLink;
	/**
	 * Defines the link between a cash account and a securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#mmCashAccount
	 * AccountLink.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountLink
	 * AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the link between a cash account and a securities account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountLink = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountLink";
			definition = "Defines the link between a cash account and a securities account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
		}
	};
	protected CashStandingOrder cashStandingOrder;
	/**
	 * Standing order which applies on a specific account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmCashAccount
	 * CashStandingOrder.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails3#mmStandingOrder
	 * CashAccountDetails3.mmStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails4#mmStandingOrder
	 * CashAccountDetails4.mmStandingOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing order which applies on a specific account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashStandingOrder = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountDetails3.mmStandingOrder, com.tools20022.repository.msg.CashAccountDetails4.mmStandingOrder);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashStandingOrder";
			definition = "Standing order which applies on a specific account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashStandingOrder.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashStandingOrder.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Cheque> cheque;
	/**
	 * Cheques drawn on a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Cheque#mmCashAccount
	 * Cheque.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Cheque Cheque}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cheques drawn on a cash account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCheque = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Cheques drawn on a cash account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Cheque.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
		}
	};
	protected CashAccountService cashAccountService;
	/**
	 * Services linked to the cash account and specified in the cash account
	 * contract. It is derived from the association between Account and
	 * AccountService.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccount
	 * CashAccountService.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Services linked to the cash account and specified in the cash account contract. It is derived from the association between Account and AccountService."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountService";
			definition = "Services linked to the cash account and specified in the cash account contract. It is derived from the association between Account and AccountService.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
		}
	};
	protected Payment payment;
	/**
	 * Payment for which an account is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAccount
	 * Payment.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment for which an account is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected Commission commission;
	/**
	 * Amount of money due to a party as compensation for a service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmAccount
	 * Commission.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FeeAndTax1#mmCommercialAgreementReference
	 * FeeAndTax1.mmCommercialAgreementReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to a party as compensation for a service."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCommission = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FeeAndTax1.mmCommercialAgreementReference);
			elementContext_lazy = () -> CashAccount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Amount of money due to a party as compensation for a service.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.mmAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccount";
				definition = "Account to or from which a cash entry is made.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.mmCashAccount, com.tools20022.repository.entity.Tax.mmTaxAccount, com.tools20022.repository.entity.Commission.mmAccount,
						com.tools20022.repository.entity.Payment.mmAccount, com.tools20022.repository.entity.PaymentCard.mmRelatedAccount, com.tools20022.repository.entity.CashEntry.mmCashAccount,
						com.tools20022.repository.entity.Cheque.mmCashAccount, com.tools20022.repository.entity.CashSettlement.mmSettlementAccount, com.tools20022.repository.entity.PaymentPartyRole.mmCashAccount,
						com.tools20022.repository.entity.CashBalance.mmCashAccount, com.tools20022.repository.entity.StandingOrder.mmCreditAccount, com.tools20022.repository.entity.StandingOrder.mmDebitAccount,
						com.tools20022.repository.entity.CashStandingOrder.mmCashAccount, com.tools20022.repository.entity.SecuritiesPartyRole.mmCashAccount, com.tools20022.repository.entity.Charges.mmChargesDebitAccount,
						com.tools20022.repository.entity.CashAccountContract.mmCashAccount, com.tools20022.repository.entity.CashAccountContract.mmTransferCashAccount, com.tools20022.repository.entity.CashAccountService.mmCashAccount,
						com.tools20022.repository.entity.CashSettlementInstructionPartyRole.mmCashAccount, com.tools20022.repository.entity.CorporateActionElection.mmCashAccount,
						com.tools20022.repository.entity.AccountReportedMovement.mmReportedCashAccount, com.tools20022.repository.entity.UndertakingUltimateObligor.mmCashAccount,
						com.tools20022.repository.entity.InvoiceFinancingPartyRole.mmCashAccount, com.tools20022.repository.entity.CommercialTrade.mmPurchaseAccount, com.tools20022.repository.entity.AccountLink.mmCashAccount);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderDeskContactDetails.mmSettlementDetails, com.tools20022.repository.choice.PaymentInstrument17Choice.mmCashAccountDetails,
						com.tools20022.repository.choice.AccountOrBusinessError1Choice.mmAccount, com.tools20022.repository.msg.CashAccountAndEntry1.mmAccount, com.tools20022.repository.msg.CorporateActionOption9.mmCashAccount,
						com.tools20022.repository.msg.CorporateActionOption18.mmCashAccount, com.tools20022.repository.msg.CorporateActionOption22.mmCashAccount, com.tools20022.repository.msg.CorporateActionOption27.mmCashAccount,
						com.tools20022.repository.msg.CorporateActionOption26.mmCashAccount, com.tools20022.repository.msg.CorporateActionOption41.mmCashAccount, com.tools20022.repository.msg.CorporateActionOption50.mmCashAccount,
						com.tools20022.repository.msg.CorporateActionOption29.mmCashAccount, com.tools20022.repository.choice.Account8Choice.mmCashAccount, com.tools20022.repository.choice.Account9Choice.mmCashAccount,
						com.tools20022.repository.msg.ConfirmationPartyDetails4.mmCashDetails, com.tools20022.repository.msg.Intermediary14.mmCashDetails, com.tools20022.repository.msg.CustomerAccount1.mmType,
						com.tools20022.repository.msg.CustomerAccount5.mmType, com.tools20022.repository.msg.CustomerAccountModification1.mmType, com.tools20022.repository.msg.CustomerAccount4.mmType,
						com.tools20022.repository.msg.AccountReport9.mmRelatedAccount, com.tools20022.repository.msg.AccountReport11.mmRelatedAccount, com.tools20022.repository.msg.AccountReport12.mmRelatedAccount,
						com.tools20022.repository.msg.AccountReport16.mmRelatedAccount, com.tools20022.repository.msg.AccountStatement1.mmRelatedAccount, com.tools20022.repository.msg.AccountStatement2.mmRelatedAccount,
						com.tools20022.repository.msg.AccountStatement3.mmRelatedAccount, com.tools20022.repository.msg.AccountStatement4.mmRelatedAccount,
						com.tools20022.repository.msg.SettlementInformation3.mmInstructingReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation3.mmInstructedReimbursementAgentAccount,
						com.tools20022.repository.msg.SettlementInformation1.mmInstructingReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation1.mmInstructedReimbursementAgentAccount,
						com.tools20022.repository.msg.SettlementInformation13.mmInstructingReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation13.mmInstructedReimbursementAgentAccount,
						com.tools20022.repository.msg.SettlementInformation16.mmInstructingReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation16.mmInstructedReimbursementAgentAccount,
						com.tools20022.repository.msg.RequestedModification.mmBeneficiaryInstitutionAccount, com.tools20022.repository.msg.CashProceeds1.mmAccountDetails,
						com.tools20022.repository.msg.CorporateActionStandingInstruction1.mmCashDistributionDetails, com.tools20022.repository.msg.NotificationItem3.mmRelatedAccount,
						com.tools20022.repository.msg.OriginalItemReference1.mmRelatedAccount, com.tools20022.repository.msg.OriginalNotificationReference1.mmRelatedAccount,
						com.tools20022.repository.msg.OriginalNotificationReference2.mmRelatedAccount, com.tools20022.repository.msg.SettlementInformation15.mmInstructingReimbursementAgentAccount,
						com.tools20022.repository.msg.SettlementInformation15.mmInstructedReimbursementAgentAccount, com.tools20022.repository.msg.NotificationItem4.mmRelatedAccount,
						com.tools20022.repository.msg.OriginalItemReference2.mmRelatedAccount, com.tools20022.repository.msg.OriginalNotificationReference4.mmRelatedAccount,
						com.tools20022.repository.msg.OriginalNotificationReference3.mmRelatedAccount, com.tools20022.repository.msg.AccountAndParties1.mmIdentification, com.tools20022.repository.msg.ParentCashAccount1.mmIdentification,
						com.tools20022.repository.msg.CashAccountCharacteristics1.mmCashAccount, com.tools20022.repository.msg.SettlementInformation6.mmInstructingReimbursementAgentAccount,
						com.tools20022.repository.msg.SettlementInformation6.mmInstructedReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation8.mmInstructingReimbursementAgentAccount,
						com.tools20022.repository.msg.SettlementInformation8.mmInstructedReimbursementAgentAccount, com.tools20022.repository.msg.TransferOut4.mmCashAccount, com.tools20022.repository.msg.Member1.mmAccount,
						com.tools20022.repository.msg.CustomerAccount2.mmType, com.tools20022.repository.msg.CustomerAccount3.mmType, com.tools20022.repository.msg.CorporateActionOption8.mmCashAccount,
						com.tools20022.repository.choice.AccountOrBusinessError2Choice.mmAccount, com.tools20022.repository.msg.AccountAndParties2.mmAccount, com.tools20022.repository.msg.AccountReport18.mmRelatedAccount,
						com.tools20022.repository.msg.AccountStatement5.mmRelatedAccount, com.tools20022.repository.msg.OriginalNotificationReference6.mmRelatedAccount, com.tools20022.repository.msg.OriginalItemReference3.mmRelatedAccount,
						com.tools20022.repository.msg.OriginalNotificationReference5.mmRelatedAccount, com.tools20022.repository.msg.NotificationItem5.mmRelatedAccount, com.tools20022.repository.msg.AccountStatement6.mmRelatedAccount,
						com.tools20022.repository.msg.AccountReport19.mmRelatedAccount, com.tools20022.repository.msg.CashAccountCharacteristics2.mmCashAccount, com.tools20022.repository.msg.ParentCashAccount2.mmIdentification,
						com.tools20022.repository.msg.OriginalNotificationReference8.mmRelatedAccount, com.tools20022.repository.msg.OriginalItemReference4.mmRelatedAccount,
						com.tools20022.repository.msg.OriginalNotificationReference7.mmRelatedAccount, com.tools20022.repository.msg.NotificationItem6.mmRelatedAccount, com.tools20022.repository.msg.CorporateActionOption116.mmCashAccount,
						com.tools20022.repository.msg.CashSettlement1.mmCashAccountDetails, com.tools20022.repository.msg.CashSettlement2.mmCashAccountDetails, com.tools20022.repository.msg.CorporateActionOption121.mmCashAccount);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmCashAccountType, com.tools20022.repository.entity.CashAccount.mmRelatedInvestmentAccount,
						com.tools20022.repository.entity.CashAccount.mmCashEntry, com.tools20022.repository.entity.CashAccount.mmCashBalance, com.tools20022.repository.entity.CashAccount.mmPaymentPartyRole,
						com.tools20022.repository.entity.CashAccount.mmRelatedCreditStandingOrder, com.tools20022.repository.entity.CashAccount.mmRelatedDebitStandingOrder,
						com.tools20022.repository.entity.CashAccount.mmCashAccountContract, com.tools20022.repository.entity.CashAccount.mmRelatedCorporateActionElection, com.tools20022.repository.entity.CashAccount.mmCharges,
						com.tools20022.repository.entity.CashAccount.mmTax, com.tools20022.repository.entity.CashAccount.mmRelatedSettlementInstruction, com.tools20022.repository.entity.CashAccount.mmCashSettlementPartyRole,
						com.tools20022.repository.entity.CashAccount.mmUltimateObligor, com.tools20022.repository.entity.CashAccount.mmRelatedPaymentCard, com.tools20022.repository.entity.CashAccount.mmSecuritiesPartyRole,
						com.tools20022.repository.entity.CashAccount.mmRelatedInvoiceFinancingPartyRole, com.tools20022.repository.entity.CashAccount.mmRelatedCommercialTrade, com.tools20022.repository.entity.CashAccount.mmLevel,
						com.tools20022.repository.entity.CashAccount.mmSettlementCurrency, com.tools20022.repository.entity.CashAccount.mmReportedMovements, com.tools20022.repository.entity.CashAccount.mmClosedAccountContract,
						com.tools20022.repository.entity.CashAccount.mmAccountLink, com.tools20022.repository.entity.CashAccount.mmCashStandingOrder, com.tools20022.repository.entity.CashAccount.mmCheque,
						com.tools20022.repository.entity.CashAccount.mmCashAccountService, com.tools20022.repository.entity.CashAccount.mmPayment, com.tools20022.repository.entity.CashAccount.mmCommission);
				derivationComponent_lazy = () -> Arrays.asList(CashAccount15.mmObject(), CashAccount14.mmObject(), CashAccount21.mmObject(), CashAccount22.mmObject(), CashAccount5.mmObject(), CashAccount4.mmObject(),
						CashAccount12.mmObject(), CashAccount26.mmObject(), CashAccountSearchCriteria2.mmObject(), CashAccountSearchCriteria3.mmObject(), CashAccountSearchCriteria4.mmObject(), CashAccountType2.mmObject(),
						CashAccountType2Choice.mmObject(), CashAccountSearchCriteria5.mmObject(), CashAccount7.mmObject(), CashAccount16.mmObject(), CashAccount24.mmObject(), CashAccount6.mmObject(), CashAccount11.mmObject(),
						CashAccountDetails1.mmObject(), Accounts2.mmObject(), CashAccountDetails3.mmObject(), Accounts3.mmObject(), CashAccountDetails4.mmObject(), Accounts4.mmObject(), CashAccount23.mmObject(),
						AccountOrBusinessError1Choice.mmObject(), CashAccount13.mmObject(), CashAccount20.mmObject(), CashAccount25.mmObject(), CashAccountAndEntry1.mmObject(), Account8Choice.mmObject(), Account9Choice.mmObject(),
						AccountForAction1.mmObject(), AccountForAction2.mmObject(), CustomerAccount1.mmObject(), CustomerAccount5.mmObject(), PurposeModification1.mmObject(), CustomerAccountModification1.mmObject(),
						CustomerAccount4.mmObject(), CashAccount28.mmObject(), CashAccount27.mmObject(), CashAccountType1.mmObject(), CashAccount3.mmObject(), CashAccount19.mmObject(), CashAccount18.mmObject(), CashAccount17.mmObject(),
						AccountAndParties1.mmObject(), ParentCashAccount1.mmObject(), CashAccountCharacteristics1.mmObject(), CashAccount10.mmObject(), CashAccount8.mmObject(), CustomerAccountReturnCriteria1.mmObject(),
						CustomerAccount2.mmObject(), CustomerAccount3.mmObject(), AccountOrBusinessError2Choice.mmObject(), CashAccount29.mmObject(), CardAccount3.mmObject(), CardAccount1.mmObject(), CardAccount6.mmObject(),
						CardAccount4.mmObject(), CardAccount5.mmObject(), CardAccount2.mmObject(), CashAccountCharacteristics2.mmObject(), ParentCashAccount2.mmObject(), CashAccount34.mmObject(), CashAccount32.mmObject(),
						CashAccount33.mmObject(), CardAccount10.mmObject(), CardAccount9.mmObject(), CardAccount8.mmObject(), CardAccount11.mmObject(), CardAccount13.mmObject(), CardAccount7.mmObject(), CardAccount12.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CashAccountTypeCode getCashAccountType() {
		return cashAccountType;
	}

	public void setCashAccountType(CashAccountTypeCode cashAccountType) {
		this.cashAccountType = cashAccountType;
	}

	public InvestmentAccount getRelatedInvestmentAccount() {
		return relatedInvestmentAccount;
	}

	public void setRelatedInvestmentAccount(com.tools20022.repository.entity.InvestmentAccount relatedInvestmentAccount) {
		this.relatedInvestmentAccount = relatedInvestmentAccount;
	}

	public List<CashEntry> getCashEntry() {
		return cashEntry;
	}

	public void setCashEntry(List<com.tools20022.repository.entity.CashEntry> cashEntry) {
		this.cashEntry = cashEntry;
	}

	public List<CashBalance> getCashBalance() {
		return cashBalance;
	}

	public void setCashBalance(List<com.tools20022.repository.entity.CashBalance> cashBalance) {
		this.cashBalance = cashBalance;
	}

	public PaymentPartyRole getPaymentPartyRole() {
		return paymentPartyRole;
	}

	public void setPaymentPartyRole(com.tools20022.repository.entity.PaymentPartyRole paymentPartyRole) {
		this.paymentPartyRole = paymentPartyRole;
	}

	public StandingOrder getRelatedCreditStandingOrder() {
		return relatedCreditStandingOrder;
	}

	public void setRelatedCreditStandingOrder(com.tools20022.repository.entity.StandingOrder relatedCreditStandingOrder) {
		this.relatedCreditStandingOrder = relatedCreditStandingOrder;
	}

	public StandingOrder getRelatedDebitStandingOrder() {
		return relatedDebitStandingOrder;
	}

	public void setRelatedDebitStandingOrder(com.tools20022.repository.entity.StandingOrder relatedDebitStandingOrder) {
		this.relatedDebitStandingOrder = relatedDebitStandingOrder;
	}

	public List<CashAccountContract> getCashAccountContract() {
		return cashAccountContract;
	}

	public void setCashAccountContract(List<com.tools20022.repository.entity.CashAccountContract> cashAccountContract) {
		this.cashAccountContract = cashAccountContract;
	}

	public CorporateActionElection getRelatedCorporateActionElection() {
		return relatedCorporateActionElection;
	}

	public void setRelatedCorporateActionElection(com.tools20022.repository.entity.CorporateActionElection relatedCorporateActionElection) {
		this.relatedCorporateActionElection = relatedCorporateActionElection;
	}

	public List<Charges> getCharges() {
		return charges;
	}

	public void setCharges(List<com.tools20022.repository.entity.Charges> charges) {
		this.charges = charges;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(com.tools20022.repository.entity.Tax tax) {
		this.tax = tax;
	}

	public CashSettlement getRelatedSettlementInstruction() {
		return relatedSettlementInstruction;
	}

	public void setRelatedSettlementInstruction(com.tools20022.repository.entity.CashSettlement relatedSettlementInstruction) {
		this.relatedSettlementInstruction = relatedSettlementInstruction;
	}

	public CashSettlementInstructionPartyRole getCashSettlementPartyRole() {
		return cashSettlementPartyRole;
	}

	public void setCashSettlementPartyRole(com.tools20022.repository.entity.CashSettlementInstructionPartyRole cashSettlementPartyRole) {
		this.cashSettlementPartyRole = cashSettlementPartyRole;
	}

	public UndertakingUltimateObligor getUltimateObligor() {
		return ultimateObligor;
	}

	public void setUltimateObligor(com.tools20022.repository.entity.UndertakingUltimateObligor ultimateObligor) {
		this.ultimateObligor = ultimateObligor;
	}

	public PaymentCard getRelatedPaymentCard() {
		return relatedPaymentCard;
	}

	public void setRelatedPaymentCard(com.tools20022.repository.entity.PaymentCard relatedPaymentCard) {
		this.relatedPaymentCard = relatedPaymentCard;
	}

	public SecuritiesPartyRole getSecuritiesPartyRole() {
		return securitiesPartyRole;
	}

	public void setSecuritiesPartyRole(com.tools20022.repository.entity.SecuritiesPartyRole securitiesPartyRole) {
		this.securitiesPartyRole = securitiesPartyRole;
	}

	public InvoiceFinancingPartyRole getRelatedInvoiceFinancingPartyRole() {
		return relatedInvoiceFinancingPartyRole;
	}

	public void setRelatedInvoiceFinancingPartyRole(com.tools20022.repository.entity.InvoiceFinancingPartyRole relatedInvoiceFinancingPartyRole) {
		this.relatedInvoiceFinancingPartyRole = relatedInvoiceFinancingPartyRole;
	}

	public CommercialTrade getRelatedCommercialTrade() {
		return relatedCommercialTrade;
	}

	public void setRelatedCommercialTrade(com.tools20022.repository.entity.CommercialTrade relatedCommercialTrade) {
		this.relatedCommercialTrade = relatedCommercialTrade;
	}

	public AccountLevelCode getLevel() {
		return level;
	}

	public void setLevel(AccountLevelCode level) {
		this.level = level;
	}

	public CurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(CurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	public List<AccountReportedMovement> getReportedMovements() {
		return reportedMovements;
	}

	public void setReportedMovements(List<com.tools20022.repository.entity.AccountReportedMovement> reportedMovements) {
		this.reportedMovements = reportedMovements;
	}

	public CashAccountContract getClosedAccountContract() {
		return closedAccountContract;
	}

	public void setClosedAccountContract(com.tools20022.repository.entity.CashAccountContract closedAccountContract) {
		this.closedAccountContract = closedAccountContract;
	}

	public List<AccountLink> getAccountLink() {
		return accountLink;
	}

	public void setAccountLink(List<com.tools20022.repository.entity.AccountLink> accountLink) {
		this.accountLink = accountLink;
	}

	public CashStandingOrder getCashStandingOrder() {
		return cashStandingOrder;
	}

	public void setCashStandingOrder(com.tools20022.repository.entity.CashStandingOrder cashStandingOrder) {
		this.cashStandingOrder = cashStandingOrder;
	}

	public List<Cheque> getCheque() {
		return cheque;
	}

	public void setCheque(List<com.tools20022.repository.entity.Cheque> cheque) {
		this.cheque = cheque;
	}

	public CashAccountService getCashAccountService() {
		return cashAccountService;
	}

	public void setCashAccountService(com.tools20022.repository.entity.CashAccountService cashAccountService) {
		this.cashAccountService = cashAccountService;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = payment;
	}

	public Commission getCommission() {
		return commission;
	}

	public void setCommission(com.tools20022.repository.entity.Commission commission) {
		this.commission = commission;
	}
}
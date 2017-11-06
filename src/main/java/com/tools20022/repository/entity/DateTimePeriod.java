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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Time span defined by a start date and time, and an end date and time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DateTimePeriod" src="doc-files/DateTimePeriod.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
 * DateTimePeriod.mmFromDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmToDateTime
 * DateTimePeriod.mmToDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedStandingOrder
 * DateTimePeriod.mmRelatedStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPaymentInstruction
 * DateTimePeriod.mmPaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
 * DateTimePeriod.mmNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmValuationStatistics
 * DateTimePeriod.mmValuationStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPerformanceFactors
 * DateTimePeriod.mmPerformanceFactors}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmStatus
 * DateTimePeriod.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceCalculationRelatedPricing
 * DateTimePeriod.mmPriceCalculationRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCorporateActionOption
 * DateTimePeriod.mmCorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmParallelTradingProceedsDefinition
 * DateTimePeriod.mmParallelTradingProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPrivilegeSuspensionCorporateAction
 * DateTimePeriod.mmPrivilegeSuspensionCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInterestCalculation
 * DateTimePeriod.mmRelatedInterestCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBiddingConditions
 * DateTimePeriod.mmBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmClassAction
 * DateTimePeriod.mmClassAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBookEntryTransferSuspensionRelatedEvent
 * DateTimePeriod.mmBookEntryTransferSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmDepositAtAgentSuspensionRelatedEvent
 * DateTimePeriod.mmDepositAtAgentSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmDepositSuspensionRelatedEvent
 * DateTimePeriod.mmDepositSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPledgeSuspensionRelatedEvent
 * DateTimePeriod.mmPledgeSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSegregationPeriodRelatedEvent
 * DateTimePeriod.mmSegregationPeriodRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalAtAgentSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalAtAgentSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalInNomineeNameSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalInNomineeNameSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalInStreetNameSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalInStreetNameSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBookClosureCorporateAction
 * DateTimePeriod.mmBookClosureCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCoDepositoriesSuspensionRelatedEvent
 * DateTimePeriod.mmCoDepositoriesSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmExtendiblePeriodDebt
 * DateTimePeriod.mmExtendiblePeriodDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSecuritiesConversion
 * DateTimePeriod.mmSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmYieldCalculation
 * DateTimePeriod.mmYieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCustomDateDebt
 * DateTimePeriod.mmCustomDateDebt}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTaxPeriod
 * DateTimePeriod.mmTaxPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAccount
 * DateTimePeriod.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAgreement
 * DateTimePeriod.mmRelatedAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAssentedLinePeriodProceedsDefinition
 * DateTimePeriod.mmAssentedLinePeriodProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSellThruIssuerProceedsDefinition
 * DateTimePeriod.mmSellThruIssuerProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedProductDelivery
 * DateTimePeriod.mmRelatedProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInvoice
 * DateTimePeriod.mmRelatedInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTradeCertificate
 * DateTimePeriod.mmTradeCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPortfolioValuation
 * DateTimePeriod.mmRelatedPortfolioValuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSystem
 * DateTimePeriod.mmSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAccountRestriction
 * DateTimePeriod.mmAccountRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBankOperation
 * DateTimePeriod.mmBankOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedCorporateAction
 * DateTimePeriod.mmRelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedLimit
 * DateTimePeriod.mmRelatedLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedIdentification
 * DateTimePeriod.mmRelatedIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAssessmentValidityScheme
 * DateTimePeriod.mmAssessmentValidityScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmExercisePeriodDistribution
 * DateTimePeriod.mmExercisePeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmOfferPeriodDistribution
 * DateTimePeriod.mmOfferPeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTradingPeriodDistribution
 * DateTimePeriod.mmTradingPeriodDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBlockingPeriodDistribution
 * DateTimePeriod.mmBlockingPeriodDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmGuarantee
 * DateTimePeriod.mmGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceFactRelatedPricing
 * DateTimePeriod.mmPriceFactRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCashDistribution
 * DateTimePeriod.mmCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmComponentSecurity
 * DateTimePeriod.mmComponentSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTradingSession
 * DateTimePeriod.mmTradingSession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFinancialInstrumentSwap
 * DateTimePeriod.mmFinancialInstrumentSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPostalAddress
 * DateTimePeriod.mmRelatedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRedemptionSchedule
 * DateTimePeriod.mmRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAccountLink
 * DateTimePeriod.mmRelatedAccountLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAdjustment
 * DateTimePeriod.mmRelatedAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesIdentification
 * DateTimePeriod.mmRelatedSecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedStandingSettlementInstruction
 * DateTimePeriod.mmRelatedStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesRegistration
 * DateTimePeriod.mmRelatedSecuritiesRegistration}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmAmount
 * DateTimePeriod.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInvestmentPlan
 * DateTimePeriod.mmRelatedInvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmIssuance
 * DateTimePeriod.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedPaymentTerms
 * DateTimePeriod.mmRelatedPaymentTerms}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPercentage
 * DateTimePeriod.mmPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedRolePlayer
 * DateTimePeriod.mmRelatedRolePlayer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSystemAvailability
 * DateTimePeriod.mmRelatedSystemAvailability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValidityPeriod
 * SecuritiesIdentification.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceFactPeriod
 * SecuritiesPricing.mmPriceFactPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RolePlayer#mmValidityPeriod
 * RolePlayer.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmValidityPeriod
 * PostalAddress.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmValidityPeriod
 * PartyIdentificationInformation.mmValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmReportedPeriod
 * Account.mmReportedPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmEffectivePeriod
 * RedemptionSchedule.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Scheme#mmAssessmentValidityPeriod
 * Scheme.mmAssessmentValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Status#mmValidityTime
 * Status.mmValidityTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmValidityPeriod
 * Agreement.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmEffectivePeriod
 * Adjustment.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInvestmentPeriod
 * InvestmentPlan.mmInvestmentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmProcessingValidityTime
 * PaymentInstruction.mmProcessingValidityTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#mmVersionValidityPeriod
 * System.mmVersionValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Limit#mmValidityPeriod
 * Limit.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmValidityPeriod
 * StandingOrder.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPeriod
 * ValuationStatistics.mmPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmAccumulationPeriod
 * PerformanceFactors.mmAccumulationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountRestriction#mmValidityPeriod
 * AccountRestriction.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmClosurePeriod
 * SystemAvailability.mmClosurePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
 * InterestCalculation.mmInterestPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmExtendiblePeriod
 * Debt.mmExtendiblePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Debt#mmCustomDate
 * Debt.mmCustomDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmSubscriptionPeriod
 * Issuance.mmSubscriptionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPeriod
 * SecuritiesConversion.mmConversionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmValidityPeriod
 * StandingSettlementInstruction.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSplitPeriod
 * BasicSecuritiesRegistration.mmSplitPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBookClosurePeriod
 * CorporateActionEvent.mmBookClosurePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingPeriod
 * CorporateActionEvent.mmTradingPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClassAction#mmClaimPeriod
 * ClassAction.mmClaimPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmActionPeriod
 * CorporateActionOption.mmActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmParallelTradingPeriod
 * SecuritiesProceedsDefinition.mmParallelTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAssentedLinePeriod
 * SecuritiesProceedsDefinition.mmAssentedLinePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSellThruIssuerPeriod
 * SecuritiesProceedsDefinition.mmSellThruIssuerPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmCompulsoryPurchasePeriod
 * BiddingConditions.mmCompulsoryPurchasePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmPrivilegeSuspensionPeriod
 * SuspensionPeriod.mmPrivilegeSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawal
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForBookEntryTransfer
 * SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDepositAtAgent
 * SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDeposit
 * SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForPledge
 * SuspensionPeriod.mmDepositorySuspensionPeriodForPledge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForSegregation
 * SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalAtAgent
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInStreetName
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCoDepositoriesSuspensionPeriod
 * SuspensionPeriod.mmCoDepositoriesSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingSession#mmTimeBracket
 * TradingSession.mmTimeBracket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmValuePeriod
 * YieldCalculation.mmValuePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankOperation#mmApplicablePeriod
 * BankOperation.mmApplicablePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmPeriodCovered
 * Invoice.mmPeriodCovered}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPeriod#mmFromToDate
 * TaxPeriod.mmFromToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmExercisePeriod
 * Distribution.mmExercisePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmOfferPeriod
 * Distribution.mmOfferPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmTradingPeriod
 * Distribution.mmTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmBlockingPeriod
 * Distribution.mmBlockingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmInterestPeriod
 * Distribution.mmInterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmDeliveryPeriod
 * ProductDelivery.mmDeliveryPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmInspectionDate
 * TradeCertificate.mmInspectionDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmEffectivePeriod
 * Guarantee.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmValuationPeriod
 * PortfolioValuation.mmValuationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmValidityPeriod
 * AccountLink.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSeparationPeriod
 * ComponentSecurity.mmSeparationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmMaturity
 * FinancialInstrumentSwap.mmMaturity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountAndPeriod#mmPeriod
 * AmountAndPeriod.mmPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmPaymentPeriod
 * PaymentTerms.mmPaymentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PercentageAndPeriod#mmPeriod
 * PercentageAndPeriod.mmPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice#mmDateTimeRange
 * DateTimePeriodChoice.mmDateTimeRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateAndPeriod2Choice#mmPeriod
 * DateAndPeriod2Choice.mmPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DatePeriodDetails2Choice#mmFromToDate
 * DatePeriodDetails2Choice.mmFromToDate}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Period1Choice#mmPeriod
 * Period1Choice.mmPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Period3Choice#mmPeriod
 * Period3Choice.mmPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Period2Choice#mmFromDateTimeToDateTime
 * Period2Choice.mmFromDateTimeToDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Period2Choice#mmFromDateToDate
 * Period2Choice.mmFromDateToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmReportingPeriod
 * ReportingRequest3.mmReportingPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Period4Choice#mmDate
 * Period4Choice.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Period4Choice#mmFromDateToDate
 * Period4Choice.mmFromDateToDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DatePeriodDetails
 * DatePeriodDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
 * DateTimePeriodDetails}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
 * DateTimePeriodChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Period2 Period2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DatePeriodDetails2Choice
 * DatePeriodDetails2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DatePeriodDetails1
 * DatePeriodDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Period3 Period3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Period5 Period5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Period1Choice Period1Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.Period4 Period4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Period3Choice Period3Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Period2Choice Period2Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.DateTimePeriodDetails1
 * DateTimePeriodDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Period1 Period1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingPeriod1
 * ReportingPeriod1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch2Choice
 * DateAndDateTimeSearch2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Period4Choice Period4Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.DateTimePeriod1
 * DateTimePeriod1}</li>
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
 * "DateTimePeriod"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Time span defined by a start date and time, and an end date and time."</li>
 * </ul>
 */
public class DateTimePeriod {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime fromDateTime;
	/**
	 * Date and time at which the range starts.
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails#mmFromDate
	 * DatePeriodDetails.mmFromDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#mmStartDate
	 * InvestmentPlan2.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#mmStartDate
	 * InvestmentPlan4.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#mmStartDate
	 * InvestmentPlan6.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation#mmDateOfFirstSubscription
	 * SubscriptionInformation.mmDateOfFirstSubscription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#mmDateOfFirstSubscription
	 * SubscriptionInformation1.mmDateOfFirstSubscription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#mmStartDate
	 * InvestmentPlan5.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#mmStartDate
	 * InvestmentPlan3.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmStartDate
	 * InvestmentPlan7.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetails2#mmStartDateTime
	 * LimitDetails2.mmStartDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetails4#mmStartDateTime
	 * LimitDetails4.mmStartDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails#mmFromDateTime
	 * DateTimePeriodDetails.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice#mmFromDateTime
	 * DateTimePeriodChoice.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice#mmFromDate
	 * DateSearchChoice.mmFromDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period2#mmFromDate
	 * Period2.mmFromDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateAndPeriod2Choice#mmFromDate
	 * DateAndPeriod2Choice.mmFromDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria3#mmLimitValidAsOfDate
	 * LimitSearchCriteria3.mmLimitValidAsOfDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DatePeriodDetails2Choice#mmFromDate
	 * DatePeriodDetails2Choice.mmFromDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit6#mmStartDateTime
	 * Limit6.mmStartDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationDetails2#mmStartDateTime
	 * ReservationDetails2.mmStartDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Reservation2#mmStartDateTime
	 * Reservation2.mmStartDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails1#mmFromDate
	 * DatePeriodDetails1.mmFromDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetails3#mmStartDateTime
	 * LimitDetails3.mmStartDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Limit4#mmStartDateTime
	 * Limit4.mmStartDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationDetails1#mmStartDateTime
	 * ReservationDetails1.mmStartDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Reservation1#mmStartDateTime
	 * Reservation1.mmStartDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period3#mmStartDate
	 * Period3.mmStartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period5#mmStartDate
	 * Period5.mmStartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period4#mmStartDate
	 * Period4.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails1#mmFromDateTime
	 * DateTimePeriodDetails1.mmFromDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmStartDate
	 * Agreement3.mmStartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Restriction1#mmValidFrom
	 * Restriction1.mmValidFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate1#mmStartDate
	 * OperationMandate1.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2#mmStartDate
	 * OperationMandate2.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate3#mmStartDate
	 * OperationMandate3.mmStartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period1#mmStartDate
	 * Period1.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod1#mmFromToDate
	 * ReportingPeriod1.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod1#mmFromToTime
	 * ReportingPeriod1.mmFromToTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DatePeriod1#mmFromDate
	 * DatePeriod1.mmFromDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmISINValidFrom
	 * Issuance1.mmISINValidFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmNameValidFrom
	 * CommonFinancialInstrumentAttributes1.mmNameValidFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification1#mmValidFrom
	 * SystemPartyIdentification1.mmValidFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PostalAddress10#mmValidFrom
	 * PostalAddress10.mmValidFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentName1#mmValidFrom
	 * FinancialInstrumentName1.mmValidFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity1#mmISINValidFrom
	 * FinancialInstrumentIdentificationValidity1.mmISINValidFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification2#mmValidFrom
	 * SystemPartyIdentification2.mmValidFrom}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress9#mmValidFrom
	 * PostalAddress9.mmValidFrom}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement1#mmStartDate
	 * Agreement1.mmStartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountLink1#mmValidFrom
	 * AccountLink1.mmValidFrom}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountLink2#mmValidFrom
	 * AccountLink2.mmValidFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#mmStartDate
	 * InvestmentPlan9.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmStartDate
	 * InvestmentPlan8.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmStartDate
	 * InvestmentPlan10.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmStartDate
	 * InvestmentPlan11.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndPeriod1#mmStartDate
	 * AmountAndPeriod1.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PercentageAndPeriod1#mmStartDate
	 * PercentageAndPeriod1.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PercentageAndPeriod1#mmEndDate
	 * PercentageAndPeriod1.mmEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Period4Choice#mmFromDate
	 * Period4Choice.mmFromDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriod1#mmFromDateTime
	 * DateTimePeriod1.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmStartDate
	 * InvestmentPlan12.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmStartDate
	 * InvestmentPlan13.mmStartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DateAndAmount1#mmDate
	 * DateAndAmount1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmStartDate
	 * InvestmentPlan14.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmStartDate
	 * InvestmentPlan15.mmStartDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the range starts."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFromDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DatePeriodDetails.mmFromDate, com.tools20022.repository.msg.InvestmentPlan2.mmStartDate, com.tools20022.repository.msg.InvestmentPlan4.mmStartDate,
					com.tools20022.repository.msg.InvestmentPlan6.mmStartDate, com.tools20022.repository.msg.SubscriptionInformation.mmDateOfFirstSubscription,
					com.tools20022.repository.msg.SubscriptionInformation1.mmDateOfFirstSubscription, com.tools20022.repository.msg.InvestmentPlan5.mmStartDate, com.tools20022.repository.msg.InvestmentPlan3.mmStartDate,
					com.tools20022.repository.msg.InvestmentPlan7.mmStartDate, com.tools20022.repository.msg.LimitDetails2.mmStartDateTime, com.tools20022.repository.msg.LimitDetails4.mmStartDateTime,
					com.tools20022.repository.msg.DateTimePeriodDetails.mmFromDateTime, com.tools20022.repository.choice.DateTimePeriodChoice.mmFromDateTime, com.tools20022.repository.choice.DateSearchChoice.mmFromDate,
					com.tools20022.repository.msg.Period2.mmFromDate, com.tools20022.repository.choice.DateAndPeriod2Choice.mmFromDate, com.tools20022.repository.msg.LimitSearchCriteria3.mmLimitValidAsOfDate,
					com.tools20022.repository.choice.DatePeriodDetails2Choice.mmFromDate, com.tools20022.repository.msg.Limit6.mmStartDateTime, com.tools20022.repository.msg.ReservationDetails2.mmStartDateTime,
					com.tools20022.repository.msg.Reservation2.mmStartDateTime, com.tools20022.repository.msg.DatePeriodDetails1.mmFromDate, com.tools20022.repository.msg.LimitDetails3.mmStartDateTime,
					com.tools20022.repository.msg.Limit4.mmStartDateTime, com.tools20022.repository.msg.ReservationDetails1.mmStartDateTime, com.tools20022.repository.msg.Reservation1.mmStartDateTime,
					com.tools20022.repository.msg.Period3.mmStartDate, com.tools20022.repository.msg.Period5.mmStartDate, com.tools20022.repository.msg.Period4.mmStartDate,
					com.tools20022.repository.msg.DateTimePeriodDetails1.mmFromDateTime, com.tools20022.repository.msg.Agreement3.mmStartDate, com.tools20022.repository.msg.Restriction1.mmValidFrom,
					com.tools20022.repository.msg.OperationMandate1.mmStartDate, com.tools20022.repository.msg.OperationMandate2.mmStartDate, com.tools20022.repository.msg.OperationMandate3.mmStartDate,
					com.tools20022.repository.msg.Period1.mmStartDate, com.tools20022.repository.msg.ReportingPeriod1.mmFromToDate, com.tools20022.repository.msg.ReportingPeriod1.mmFromToTime,
					com.tools20022.repository.msg.DatePeriod1.mmFromDate, com.tools20022.repository.msg.Issuance1.mmISINValidFrom, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.mmNameValidFrom,
					com.tools20022.repository.msg.SystemPartyIdentification1.mmValidFrom, com.tools20022.repository.msg.PostalAddress10.mmValidFrom, com.tools20022.repository.msg.FinancialInstrumentName1.mmValidFrom,
					com.tools20022.repository.msg.FinancialInstrumentIdentificationValidity1.mmISINValidFrom, com.tools20022.repository.msg.SystemPartyIdentification2.mmValidFrom, com.tools20022.repository.msg.PostalAddress9.mmValidFrom,
					com.tools20022.repository.msg.Agreement1.mmStartDate, com.tools20022.repository.msg.AccountLink1.mmValidFrom, com.tools20022.repository.msg.AccountLink2.mmValidFrom,
					com.tools20022.repository.msg.InvestmentPlan9.mmStartDate, com.tools20022.repository.msg.InvestmentPlan8.mmStartDate, com.tools20022.repository.msg.InvestmentPlan10.mmStartDate,
					com.tools20022.repository.msg.InvestmentPlan11.mmStartDate, com.tools20022.repository.msg.AmountAndPeriod1.mmStartDate, com.tools20022.repository.msg.PercentageAndPeriod1.mmStartDate,
					com.tools20022.repository.msg.PercentageAndPeriod1.mmEndDate, com.tools20022.repository.choice.Period4Choice.mmFromDate, com.tools20022.repository.msg.DateTimePeriod1.mmFromDateTime,
					com.tools20022.repository.msg.InvestmentPlan12.mmStartDate, com.tools20022.repository.msg.InvestmentPlan13.mmStartDate, com.tools20022.repository.msg.DateAndAmount1.mmDate,
					com.tools20022.repository.msg.InvestmentPlan14.mmStartDate, com.tools20022.repository.msg.InvestmentPlan15.mmStartDate);
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FromDateTime";
			definition = "Date and time at which the range starts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime toDateTime;
	/**
	 * Date and time at which the range ends.
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DatePeriodDetails#mmToDate
	 * DatePeriodDetails.mmToDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan2#mmEndDate
	 * InvestmentPlan2.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan4#mmEndDate
	 * InvestmentPlan4.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan6#mmEndDate
	 * InvestmentPlan6.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan5#mmEndDate
	 * InvestmentPlan5.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan3#mmEndDate
	 * InvestmentPlan3.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmEndDate
	 * InvestmentPlan7.mmEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails#mmToDateTime
	 * DateTimePeriodDetails.mmToDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice#mmToDateTime
	 * DateTimePeriodChoice.mmToDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice#mmToDate
	 * DateSearchChoice.mmToDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period2#mmToDate
	 * Period2.mmToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DateAndPeriod2Choice#mmToDate
	 * DateAndPeriod2Choice.mmToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DatePeriodDetails2Choice#mmToDate
	 * DatePeriodDetails2Choice.mmToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails1#mmToDate
	 * DatePeriodDetails1.mmToDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period3#mmEndDate
	 * Period3.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period5#mmEndDate
	 * Period5.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period4#mmEndDate
	 * Period4.mmEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails1#mmToDateTime
	 * DateTimePeriodDetails1.mmToDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Restriction1#mmValidUntil
	 * Restriction1.mmValidUntil}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate1#mmEndDate
	 * OperationMandate1.mmEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate2#mmEndDate
	 * OperationMandate2.mmEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OperationMandate3#mmEndDate
	 * OperationMandate3.mmEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesBlockingPeriodEndDate
	 * EntitlementAssessment.mmSecuritiesBlockingPeriodEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmSecuritiesBlockingPeriodEndDate
	 * EntitlementAssessment1.mmSecuritiesBlockingPeriodEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmSecuritiesBlockingPeriodEndDate
	 * EntitlementAssessment2.mmSecuritiesBlockingPeriodEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Period1#mmEndDate
	 * Period1.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DatePeriod1#mmToDate
	 * DatePeriod1.mmToDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountLink1#mmValidTo
	 * AccountLink1.mmValidTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountLinkUpdate1#mmValidTo
	 * AccountLinkUpdate1.mmValidTo}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan9#mmEndDate
	 * InvestmentPlan9.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmEndDate
	 * InvestmentPlan8.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmEndDate
	 * InvestmentPlan10.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmEndDate
	 * InvestmentPlan11.mmEndDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingPeriodEndDate
	 * EntitlementAssessment3.mmSecuritiesBlockingPeriodEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountAndPeriod1#mmEndDate
	 * AmountAndPeriod1.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Period4Choice#mmToDate
	 * Period4Choice.mmToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DateTimePeriod1#mmToDateTime
	 * DateTimePeriod1.mmToDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmEndDate
	 * InvestmentPlan12.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmEndDate
	 * InvestmentPlan13.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmEndDate
	 * InvestmentPlan14.mmEndDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmEndDate
	 * InvestmentPlan15.mmEndDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the range ends."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmToDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DatePeriodDetails.mmToDate, com.tools20022.repository.msg.InvestmentPlan2.mmEndDate, com.tools20022.repository.msg.InvestmentPlan4.mmEndDate,
					com.tools20022.repository.msg.InvestmentPlan6.mmEndDate, com.tools20022.repository.msg.InvestmentPlan5.mmEndDate, com.tools20022.repository.msg.InvestmentPlan3.mmEndDate,
					com.tools20022.repository.msg.InvestmentPlan7.mmEndDate, com.tools20022.repository.msg.DateTimePeriodDetails.mmToDateTime, com.tools20022.repository.choice.DateTimePeriodChoice.mmToDateTime,
					com.tools20022.repository.choice.DateSearchChoice.mmToDate, com.tools20022.repository.msg.Period2.mmToDate, com.tools20022.repository.choice.DateAndPeriod2Choice.mmToDate,
					com.tools20022.repository.choice.DatePeriodDetails2Choice.mmToDate, com.tools20022.repository.msg.DatePeriodDetails1.mmToDate, com.tools20022.repository.msg.Period3.mmEndDate,
					com.tools20022.repository.msg.Period5.mmEndDate, com.tools20022.repository.msg.Period4.mmEndDate, com.tools20022.repository.msg.DateTimePeriodDetails1.mmToDateTime,
					com.tools20022.repository.msg.Restriction1.mmValidUntil, com.tools20022.repository.msg.OperationMandate1.mmEndDate, com.tools20022.repository.msg.OperationMandate2.mmEndDate,
					com.tools20022.repository.msg.OperationMandate3.mmEndDate, com.tools20022.repository.msg.EntitlementAssessment.mmSecuritiesBlockingPeriodEndDate,
					com.tools20022.repository.msg.EntitlementAssessment1.mmSecuritiesBlockingPeriodEndDate, com.tools20022.repository.msg.EntitlementAssessment2.mmSecuritiesBlockingPeriodEndDate,
					com.tools20022.repository.msg.Period1.mmEndDate, com.tools20022.repository.msg.DatePeriod1.mmToDate, com.tools20022.repository.msg.AccountLink1.mmValidTo, com.tools20022.repository.msg.AccountLinkUpdate1.mmValidTo,
					com.tools20022.repository.msg.InvestmentPlan9.mmEndDate, com.tools20022.repository.msg.InvestmentPlan8.mmEndDate, com.tools20022.repository.msg.InvestmentPlan10.mmEndDate,
					com.tools20022.repository.msg.InvestmentPlan11.mmEndDate, com.tools20022.repository.msg.EntitlementAssessment3.mmSecuritiesBlockingPeriodEndDate, com.tools20022.repository.msg.AmountAndPeriod1.mmEndDate,
					com.tools20022.repository.choice.Period4Choice.mmToDate, com.tools20022.repository.msg.DateTimePeriod1.mmToDateTime, com.tools20022.repository.msg.InvestmentPlan12.mmEndDate,
					com.tools20022.repository.msg.InvestmentPlan13.mmEndDate, com.tools20022.repository.msg.InvestmentPlan14.mmEndDate, com.tools20022.repository.msg.InvestmentPlan15.mmEndDate);
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ToDateTime";
			definition = "Date and time at which the range ends.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected StandingOrder relatedStandingOrder;
	/**
	 * Standing order for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmValidityPeriod
	 * StandingOrder.mmValidityPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing order for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedStandingOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedStandingOrder";
			definition = "Standing order for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
		}
	};
	protected PaymentInstruction paymentInstruction;
	/**
	 * Payment instruction for which a processing validity time is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmProcessingValidityTime
	 * PaymentInstruction.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instruction for which a processing validity time is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentInstruction";
			definition = "Payment instruction for which a processing validity time is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmProcessingValidityTime;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
		}
	};
	protected Number numberOfDays;
	/**
	 * Period specified as a number of days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmNumberOfDaysAccrued
	 * UnitPrice6.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmNumberOfDaysAccrued
	 * UnitPrice15.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice3#mmNumberOfDaysAccrued
	 * UnitPrice3.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice12#mmNumberOfDaysAccrued
	 * UnitPrice12.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails25.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails26.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails27.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails28.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmInterestAccruedNumberOfDays
	 * CorporateAction3.mmInterestAccruedNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmInterestAccruedNumberOfDays
	 * CorporateAction4.mmInterestAccruedNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmInterestAccruedNumberOfDays
	 * CorporateAction5.mmInterestAccruedNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmInterestAccruedNumberOfDays
	 * CorporateAction6.mmInterestAccruedNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmInterestAccruedNumberOfDays
	 * CorporateAction7.mmInterestAccruedNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmInterestAccruedNumberOfDays
	 * CorporateAction8.mmInterestAccruedNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmInterestAccruedNumberOfDays
	 * CorporateAction10.mmInterestAccruedNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmInterestAccruedNumberOfDays
	 * CorporateAction11.mmInterestAccruedNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace7.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmDaysAccrued
	 * AggregateBalanceInformation8.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace10.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmDaysAccrued
	 * AggregateBalanceInformation11.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace2.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#mmDaysAccrued
	 * AggregateBalanceInformation2.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace4.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmDaysAccrued
	 * AggregateBalanceInformation3.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace12.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmDaysAccrued
	 * AggregateBalanceInformation13.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace14.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmDaysAccrued
	 * AggregateBalanceInformation15.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace16.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmDaysAccrued
	 * AggregateBalanceInformation17.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace18.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmDaysAccrued
	 * AggregateBalanceInformation19.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace21.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmDaysAccrued
	 * AggregateBalanceInformation22.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace22.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmDaysAccrued
	 * AggregateBalanceInformation23.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace8.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmDaysAccrued
	 * AggregateBalanceInformation9.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace9.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmDaysAccrued
	 * AggregateBalanceInformation10.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace1.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmDaysAccrued
	 * AggregateBalanceInformation1.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace3.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmDaysAccrued
	 * AggregateBalanceInformation4.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace11.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmDaysAccrued
	 * AggregateBalanceInformation12.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace13.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmDaysAccrued
	 * AggregateBalanceInformation14.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace15.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmDaysAccrued
	 * AggregateBalanceInformation16.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace17.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmDaysAccrued
	 * AggregateBalanceInformation18.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace20.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmDaysAccrued
	 * AggregateBalanceInformation21.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace23.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmDaysAccrued
	 * AggregateBalanceInformation24.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails6.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails13.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails3.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails11.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails2.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails16.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails1.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails15.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmNumberOfDaysAccrued
	 * TransactionDetails6.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmNumberOfDaysAccrued
	 * TransactionDetails18.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmNumberOfDaysAccrued
	 * TransactionDetails24.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmNumberOfDaysAccrued
	 * TransactionDetails34.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmNumberOfDaysAccrued
	 * TransactionDetails37.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmNumberOfDaysAccrued
	 * TransactionDetails48.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmNumberOfDaysAccrued
	 * TransactionDetails57.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmNumberOfDaysAccrued
	 * TransactionDetails60.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmNumberOfDaysAccrued
	 * Order16.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmNumberOfDaysAccrued
	 * Order14.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice5#mmNumberOfDaysAccrued
	 * UnitPrice5.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10#mmNumberOfDaysAccrued
	 * UnitPrice10.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmInterestAccruedNumberOfDays
	 * CorporateAction2.mmInterestAccruedNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails7.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails19.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails5#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails5.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails8.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails18.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails4.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails17.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentPeriod1#mmNumberOfDays
	 * PaymentPeriod1.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentPeriod2#mmNumberOfDays
	 * PaymentPeriod2.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmNumberOfDays
	 * InterestCalculation2.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmNumberOfDaysAccrued
	 * CollateralValuation1.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails12#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails12.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails9.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails21.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails10.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails22.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails23.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails29.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails14.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails20.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails24.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails30.mmNumberOfDaysAccrued}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmDays
	 * BalanceAdjustment1.mmDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmNumberOfDaysAccrued
	 * TransactionDetails51.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace19.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmDaysAccrued
	 * AggregateBalanceInformation20.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace6.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmDaysAccrued
	 * AggregateBalanceInformation6.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace5.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmDaysAccrued
	 * AggregateBalanceInformation7.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentPeriod4#mmNumberOfDays
	 * PaymentPeriod4.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentPeriod3#mmNumberOfDays
	 * PaymentPeriod3.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmNumberOfDaysAccrued
	 * TransactionDetails63.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmInterestAccruedNumberOfDays
	 * CorporateAction12.mmInterestAccruedNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails31.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails33.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails35.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails38.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails37.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails36.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails34.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails32.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmNumberOfDaysAccrued
	 * Order17.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmNumberOfDaysAccrued
	 * Order18.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmInterestAccruedNumberOfDays
	 * CorporateAction17.mmInterestAccruedNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails44.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails39.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails43.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails41.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails40.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails42.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmNumberOfDaysAccrued
	 * TransactionDetails68.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails46.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails47.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmDaysAccrued
	 * AggregateBalanceInformation26.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmDaysAccrued
	 * AggregateBalanceInformation25.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace24.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace25.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmNumberOfDaysAccrued
	 * CollateralValuation2.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmNumberOfDays
	 * InterestCalculation3.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmDaysAccrued
	 * AggregateBalanceInformation28.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmDaysAccrued
	 * AggregateBalanceInformation27.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace26.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace27.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmDaysAccrued
	 * AggregateBalanceInformation30.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails49.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails48.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmDaysAccrued
	 * AggregateBalanceInformation31.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace28.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace29.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmNumberOfDaysAccrued
	 * TransactionDetails78.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails51.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails53.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails55.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails56.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails54.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails52.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails50.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmInterestAccruedNumberOfDays
	 * CorporateAction31.mmInterestAccruedNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice21#mmNumberOfDaysAccrued
	 * UnitPrice21.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmNumberOfDaysAccrued
	 * CollateralValuation5.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmNumberOfDays
	 * InterestCalculation4.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmInterestAccruedNumberOfDays
	 * CorporateAction40.mmInterestAccruedNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails57.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails59.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmDaysAccrued
	 * AggregateBalanceInformation32.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails58.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails61.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmDaysAccrued
	 * AggregateBalanceInformation33.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails63.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails62.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails60.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace31.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmNumberOfDaysAccrued
	 * TransactionDetails91.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmDaysAccrued
	 * AggregateBalancePerSafekeepingPlace30.mmDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails65.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails66.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice22#mmNumberOfDaysAccrued
	 * UnitPrice22.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails67.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails68.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmNumberOfDaysAccrued
	 * TransactionDetails95.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails69.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails70.mmNumberOfDaysAccrued}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmNumberOfDaysAccrued
	 * TransactionDetails98.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period specified as a number of days."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNumberOfDays = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice6.mmNumberOfDaysAccrued, com.tools20022.repository.msg.UnitPrice15.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.UnitPrice3.mmNumberOfDaysAccrued, com.tools20022.repository.msg.UnitPrice12.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails25.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails26.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails27.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails28.mmNumberOfDaysAccrued, com.tools20022.repository.msg.CorporateAction3.mmInterestAccruedNumberOfDays,
					com.tools20022.repository.msg.CorporateAction4.mmInterestAccruedNumberOfDays, com.tools20022.repository.msg.CorporateAction5.mmInterestAccruedNumberOfDays,
					com.tools20022.repository.msg.CorporateAction6.mmInterestAccruedNumberOfDays, com.tools20022.repository.msg.CorporateAction7.mmInterestAccruedNumberOfDays,
					com.tools20022.repository.msg.CorporateAction8.mmInterestAccruedNumberOfDays, com.tools20022.repository.msg.CorporateAction10.mmInterestAccruedNumberOfDays,
					com.tools20022.repository.msg.CorporateAction11.mmInterestAccruedNumberOfDays, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation8.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation11.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation2.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation3.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation13.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation15.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation17.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation19.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation22.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation23.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation9.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation10.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation1.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation4.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation12.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation14.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation16.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation18.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation21.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation24.mmDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails6.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails13.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails3.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails11.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails2.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails16.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails1.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails15.mmNumberOfDaysAccrued, com.tools20022.repository.msg.TransactionDetails6.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.TransactionDetails18.mmNumberOfDaysAccrued, com.tools20022.repository.msg.TransactionDetails24.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.TransactionDetails34.mmNumberOfDaysAccrued, com.tools20022.repository.msg.TransactionDetails37.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.TransactionDetails48.mmNumberOfDaysAccrued, com.tools20022.repository.msg.TransactionDetails57.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.TransactionDetails60.mmNumberOfDaysAccrued, com.tools20022.repository.msg.Order16.mmNumberOfDaysAccrued, com.tools20022.repository.msg.Order14.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.UnitPrice5.mmNumberOfDaysAccrued, com.tools20022.repository.msg.UnitPrice10.mmNumberOfDaysAccrued, com.tools20022.repository.msg.CorporateAction2.mmInterestAccruedNumberOfDays,
					com.tools20022.repository.msg.SecuritiesTradeDetails7.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails19.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails5.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails8.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails18.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails4.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.mmNumberOfDaysAccrued, com.tools20022.repository.msg.PaymentPeriod1.mmNumberOfDays, com.tools20022.repository.msg.PaymentPeriod2.mmNumberOfDays,
					com.tools20022.repository.msg.InterestCalculation2.mmNumberOfDays, com.tools20022.repository.msg.CollateralValuation1.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails12.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails9.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails21.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails22.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails29.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails14.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails20.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails24.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails30.mmNumberOfDaysAccrued, com.tools20022.repository.msg.BalanceAdjustment1.mmDays,
					com.tools20022.repository.msg.TransactionDetails51.mmNumberOfDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation20.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation6.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation7.mmDaysAccrued, com.tools20022.repository.msg.PaymentPeriod4.mmNumberOfDays, com.tools20022.repository.msg.PaymentPeriod3.mmNumberOfDays,
					com.tools20022.repository.msg.TransactionDetails63.mmNumberOfDaysAccrued, com.tools20022.repository.msg.CorporateAction12.mmInterestAccruedNumberOfDays,
					com.tools20022.repository.msg.SecuritiesTradeDetails31.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails33.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails38.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails37.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails36.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails34.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails32.mmNumberOfDaysAccrued, com.tools20022.repository.msg.Order17.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.Order18.mmNumberOfDaysAccrued, com.tools20022.repository.msg.CorporateAction17.mmInterestAccruedNumberOfDays, com.tools20022.repository.msg.SecuritiesTradeDetails44.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails39.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails43.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails41.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails40.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails42.mmNumberOfDaysAccrued, com.tools20022.repository.msg.TransactionDetails68.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails46.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails47.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation26.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalanceInformation25.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.mmDaysAccrued,
					com.tools20022.repository.msg.CollateralValuation2.mmNumberOfDaysAccrued, com.tools20022.repository.msg.InterestCalculation3.mmNumberOfDays, com.tools20022.repository.msg.AggregateBalanceInformation28.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation27.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalanceInformation30.mmDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation31.mmDaysAccrued, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.mmDaysAccrued,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.mmDaysAccrued, com.tools20022.repository.msg.TransactionDetails78.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails51.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails53.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails55.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails56.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails54.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails52.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails50.mmNumberOfDaysAccrued, com.tools20022.repository.msg.CorporateAction31.mmInterestAccruedNumberOfDays,
					com.tools20022.repository.msg.UnitPrice21.mmNumberOfDaysAccrued, com.tools20022.repository.msg.CollateralValuation5.mmNumberOfDaysAccrued, com.tools20022.repository.msg.InterestCalculation4.mmNumberOfDays,
					com.tools20022.repository.msg.CorporateAction40.mmInterestAccruedNumberOfDays, com.tools20022.repository.msg.SecuritiesTradeDetails57.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails59.mmNumberOfDaysAccrued, com.tools20022.repository.msg.AggregateBalanceInformation32.mmDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails58.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails61.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.AggregateBalanceInformation33.mmDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails63.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails62.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails60.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.mmDaysAccrued, com.tools20022.repository.msg.TransactionDetails91.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.mmDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails65.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails66.mmNumberOfDaysAccrued, com.tools20022.repository.msg.UnitPrice22.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails67.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails68.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.TransactionDetails95.mmNumberOfDaysAccrued, com.tools20022.repository.msg.SecuritiesTradeDetails69.mmNumberOfDaysAccrued,
					com.tools20022.repository.msg.SecuritiesTradeDetails70.mmNumberOfDaysAccrued, com.tools20022.repository.msg.TransactionDetails98.mmNumberOfDaysAccrued);
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfDays";
			definition = "Period specified as a number of days.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ValuationStatistics valuationStatistics;
	/**
	 * Valuation statistics for which a reference period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPeriod
	 * ValuationStatistics.mmPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a reference period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmValuationStatistics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuationStatistics";
			definition = "Valuation statistics for which a reference period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmObject();
		}
	};
	protected PerformanceFactors performanceFactors;
	/**
	 * Performance factors for which an accumulation period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmAccumulationPeriod
	 * PerformanceFactors.mmAccumulationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PerformanceFactors
	 * PerformanceFactors}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerformanceFactors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Performance factors for which an accumulation period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPerformanceFactors = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerformanceFactors";
			definition = "Performance factors for which an accumulation period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.mmAccumulationPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.mmObject();
		}
	};
	protected Status status;
	/**
	 * Status for which a validity time is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmValidityTime
	 * Status.mmValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status for which a validity time is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status for which a validity time is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Status.mmValidityTime;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
		}
	};
	protected SecuritiesPricing priceCalculationRelatedPricing;
	/**
	 * Securities pricing for which a price calculation period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
	 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCalculationRelatedPricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities pricing for which a price calculation period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceCalculationRelatedPricing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceCalculationRelatedPricing";
			definition = "Securities pricing for which a price calculation period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmPriceCalculationPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected CorporateActionOption corporateActionOption;
	/**
	 * Corporate action option for which an action period is defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmActionPeriod
	 * CorporateActionOption.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action option for which an action period is defined."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOption";
			definition = "Corporate action option for which an action period is defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmActionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition parallelTradingProceedsDefinition;
	/**
	 * Securities proceeds for which a parallel trading period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmParallelTradingPeriod
	 * SecuritiesProceedsDefinition.mmParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParallelTradingProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a parallel trading period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmParallelTradingProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParallelTradingProceedsDefinition";
			definition = "Securities proceeds for which a parallel trading period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmParallelTradingPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected SuspensionPeriod privilegeSuspensionCorporateAction;
	/**
	 * Corporate event for which a privilege suspension period has been defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmPrivilegeSuspensionPeriod
	 * SuspensionPeriod.mmPrivilegeSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivilegeSuspensionCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a privilege suspension period has been defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPrivilegeSuspensionCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrivilegeSuspensionCorporateAction";
			definition = "Corporate event for which a privilege suspension period has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmPrivilegeSuspensionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	protected SuspensionPeriod withdrawalSuspensionRelatedEvent;
	/**
	 * Corporate event for which a suspension period for withdrawals is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawal
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for withdrawals is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmWithdrawalSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	protected InterestCalculation relatedInterestCalculation;
	/**
	 * Interest calculation process for which an interest period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
	 * InterestCalculation.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterestCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest calculation process for which an interest period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInterestCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestCalculation";
			definition = "Interest calculation process for which an interest period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmInterestPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
		}
	};
	protected BiddingConditions biddingConditions;
	/**
	 * Bidding conditions for which a compulsory purchase period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmCompulsoryPurchasePeriod
	 * BiddingConditions.mmCompulsoryPurchasePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a compulsory purchase period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Bidding conditions for which a compulsory purchase period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmCompulsoryPurchasePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	protected ClassAction classAction;
	/**
	 * Class action for which a claim period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClassAction#mmClaimPeriod
	 * ClassAction.mmClaimPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClassAction
	 * ClassAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Class action for which a claim period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClassAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClassAction";
			definition = "Class action for which a claim period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClassAction.mmClaimPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClassAction.mmObject();
		}
	};
	protected SuspensionPeriod bookEntryTransferSuspensionRelatedEvent;
	/**
	 * Corporate event for which a suspension period for book entry transfers is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForBookEntryTransfer
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookEntryTransferSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for book entry transfers is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBookEntryTransferSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookEntryTransferSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for book entry transfers is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	protected SuspensionPeriod depositAtAgentSuspensionRelatedEvent;
	/**
	 * Corporate event for which a suspension period for deposits at agent is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDepositAtAgent
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAtAgentSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for deposits at agent is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositAtAgentSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositAtAgentSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for deposits at agent is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	protected SuspensionPeriod depositSuspensionRelatedEvent;
	/**
	 * Corporate event for which a suspension period for deposits is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDeposit
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for deposits is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for deposits is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	protected SuspensionPeriod pledgeSuspensionRelatedEvent;
	/**
	 * Corporate event for which a suspension period for pledges is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForPledge
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForPledge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for pledges is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPledgeSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PledgeSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for pledges is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForPledge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	protected SuspensionPeriod segregationPeriodRelatedEvent;
	/**
	 * Corporate event for which a suspension period for segregation is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForSegregation
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregationPeriodRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for segregation is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSegregationPeriodRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SegregationPeriodRelatedEvent";
			definition = "Corporate event for which a suspension period for segregation is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	protected SuspensionPeriod withdrawalAtAgentSuspensionRelatedEvent;
	/**
	 * Corporate event for which a suspension period for withdrawals at agent is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalAtAgent
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAtAgentSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for withdrawals at agent is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmWithdrawalAtAgentSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalAtAgentSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals at agent is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	protected SuspensionPeriod withdrawalInNomineeNameSuspensionRelatedEvent;
	/**
	 * Corporate event for which a suspension period for withdrawals in nominee
	 * name is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalInNomineeNameSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for withdrawals in nominee name is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmWithdrawalInNomineeNameSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalInNomineeNameSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals in nominee name is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	protected SuspensionPeriod withdrawalInStreetNameSuspensionRelatedEvent;
	/**
	 * Corporate event for which a suspension period for withdrawals in street
	 * name is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInStreetName
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalInStreetNameSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for withdrawals in street name is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmWithdrawalInStreetNameSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalInStreetNameSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals in street name is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	protected CorporateActionEvent bookClosureCorporateAction;
	/**
	 * Corporate action for which a book closure period has been specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBookClosurePeriod
	 * CorporateActionEvent.mmBookClosurePeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookClosureCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which a book closure period has been specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBookClosureCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookClosureCorporateAction";
			definition = "Corporate action for which a book closure period has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmBookClosurePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected SuspensionPeriod coDepositoriesSuspensionRelatedEvent;
	/**
	 * Corporate event for which a suspension period for co-depositories is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCoDepositoriesSuspensionPeriod
	 * SuspensionPeriod.mmCoDepositoriesSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoDepositoriesSuspensionRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a suspension period for co-depositories is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCoDepositoriesSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoDepositoriesSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for co-depositories is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmCoDepositoriesSuspensionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
		}
	};
	protected Debt extendiblePeriodDebt;
	/**
	 * Debt for which an extendible period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmExtendiblePeriod
	 * Debt.mmExtendiblePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendiblePeriodDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debt for which an extendible period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExtendiblePeriodDebt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendiblePeriodDebt";
			definition = "Debt for which an extendible period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.mmExtendiblePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
		}
	};
	protected SecuritiesConversion securitiesConversion;
	/**
	 * Securities conversion process for which a conversion period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPeriod
	 * SecuritiesConversion.mmConversionPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a conversion period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesConversion";
			definition = "Securities conversion process for which a conversion period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmConversionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected YieldCalculation yieldCalculation;
	/**
	 * Yield calculation for which a value period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmValuePeriod
	 * YieldCalculation.mmValuePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Yield calculation for which a value period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmYieldCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Yield calculation for which a value period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmValuePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
		}
	};
	protected Debt customDateDebt;
	/**
	 * Debt for which a custom date is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmCustomDate
	 * Debt.mmCustomDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomDateDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debt for which a custom date is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCustomDateDebt = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomDateDebt";
			definition = "Debt for which a custom date is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.mmCustomDate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
		}
	};
	protected TaxPeriod taxPeriod;
	/**
	 * Tax period for which a from/to date is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxPeriod#mmFromToDate
	 * TaxPeriod.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxPeriod TaxPeriod}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax period for which a from/to date is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxPeriod";
			definition = "Tax period for which a from/to date is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmFromToDate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
		}
	};
	protected Account account;
	/**
	 * Account for which a reported period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmReportedPeriod
	 * Account.mmReportedPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account for which a reported period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which a reported period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmReportedPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected Agreement relatedAgreement;
	/**
	 * Agreement for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmValidityPeriod
	 * Agreement.mmValidityPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAgreement";
			definition = "Agreement for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.mmValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition assentedLinePeriodProceedsDefinition;
	/**
	 * Securities proceeds for which an assented line period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAssentedLinePeriod
	 * SecuritiesProceedsDefinition.mmAssentedLinePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssentedLinePeriodProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which an assented line period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAssentedLinePeriodProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssentedLinePeriodProceedsDefinition";
			definition = "Securities proceeds for which an assented line period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmAssentedLinePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition sellThruIssuerProceedsDefinition;
	/**
	 * Securities proceeds for which a sell thru issuer period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSellThruIssuerPeriod
	 * SecuritiesProceedsDefinition.mmSellThruIssuerPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellThruIssuerProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a sell thru issuer period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSellThruIssuerProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellThruIssuerProceedsDefinition";
			definition = "Securities proceeds for which a sell thru issuer period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmSellThruIssuerPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected ProductDelivery relatedProductDelivery;
	/**
	 * Trade delivery process for which a delivery period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmDeliveryPeriod
	 * ProductDelivery.mmDeliveryPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedProductDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade delivery process for which a delivery period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedProductDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedProductDelivery";
			definition = "Trade delivery process for which a delivery period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmDeliveryPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
		}
	};
	protected Invoice relatedInvoice;
	/**
	 * Invoice for which a period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmPeriodCovered
	 * Invoice.mmPeriodCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invoice for which a period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvoice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Invoice for which a period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.mmPeriodCovered;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	protected TradeCertificate tradeCertificate;
	/**
	 * Trade certificate for which an inspection date is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmInspectionDate
	 * TradeCertificate.mmInspectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradeCertificate
	 * TradeCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade certificate for which an inspection date is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradeCertificate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeCertificate";
			definition = "Trade certificate for which an inspection date is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmInspectionDate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmObject();
		}
	};
	protected PortfolioValuation relatedPortfolioValuation;
	/**
	 * Portfolio valuation process for which a valuation period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmValuationPeriod
	 * PortfolioValuation.mmValuationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPortfolioValuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio valuation process for which a valuation period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPortfolioValuation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPortfolioValuation";
			definition = "Portfolio valuation process for which a valuation period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.mmValuationPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.mmObject();
		}
	};
	protected System system;
	/**
	 * System for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmVersionValidityPeriod
	 * System.mmVersionValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmVersionValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	protected AccountRestriction accountRestriction;
	/**
	 * Account restriction for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountRestriction#mmValidityPeriod
	 * AccountRestriction.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountRestriction
	 * AccountRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountRestriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account restriction for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountRestriction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountRestriction";
			definition = "Account restriction for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmObject();
		}
	};
	protected BankOperation bankOperation;
	/**
	 * Bank operation for which an applicable period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation#mmApplicablePeriod
	 * BankOperation.mmApplicablePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankOperation
	 * BankOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bank operation for which an applicable period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBankOperation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankOperation";
			definition = "Bank operation for which an applicable period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BankOperation.mmApplicablePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankOperation.mmObject();
		}
	};
	protected CorporateActionEvent relatedCorporateAction;
	/**
	 * Corporate action event for which a trading period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingPeriod
	 * CorporateActionEvent.mmTradingPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a trading period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action event for which a trading period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmTradingPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Limit> relatedLimit;
	/**
	 * Limit for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmValidityPeriod
	 * Limit.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedLimit = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLimit";
			definition = "Limit for which a validity period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Limit.mmValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Limit.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PartyIdentificationInformation> relatedIdentification;
	/**
	 * Party identification for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmValidityPeriod
	 * PartyIdentificationInformation.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party identification for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIdentification";
			definition = "Party identification for which a validity period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
		}
	};
	protected Scheme assessmentValidityScheme;
	/**
	 * Scheme for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#mmAssessmentValidityPeriod
	 * Scheme.mmAssessmentValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Scheme Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssessmentValidityScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAssessmentValidityScheme = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssessmentValidityScheme";
			definition = "Scheme for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.mmAssessmentValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
		}
	};
	protected Distribution exercisePeriodDistribution;
	/**
	 * Cash and securities distribution information for which an exercise period
	 * is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmExercisePeriod
	 * Distribution.mmExercisePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePeriodDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which an exercise period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExercisePeriodDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExercisePeriodDistribution";
			definition = "Cash and securities distribution information for which an exercise period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.mmExercisePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};
	protected Distribution offerPeriodDistribution;
	/**
	 * Cash and securities distribution information for which an offer period is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmOfferPeriod
	 * Distribution.mmOfferPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferPeriodDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which an offer period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOfferPeriodDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferPeriodDistribution";
			definition = "Cash and securities distribution information for which an offer period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.mmOfferPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};
	protected Distribution tradingPeriodDistribution;
	/**
	 * Cash and securities distribution information for which a trading period
	 * is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmTradingPeriod
	 * Distribution.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPeriodDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a trading period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradingPeriodDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingPeriodDistribution";
			definition = "Cash and securities distribution information for which a trading period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.mmTradingPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};
	protected Distribution blockingPeriodDistribution;
	/**
	 * Cash and securities distribution information for which a blocking period
	 * is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmBlockingPeriod
	 * Distribution.mmBlockingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockingPeriodDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash and securities distribution information for which a blocking period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBlockingPeriodDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockingPeriodDistribution";
			definition = "Cash and securities distribution information for which a blocking period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.mmBlockingPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};
	protected Guarantee guarantee;
	/**
	 * Guarantee for which an effective period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmEffectivePeriod
	 * Guarantee.mmEffectivePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Guarantee Guarantee}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee for which an effective period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGuarantee = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee for which an effective period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Guarantee.mmEffectivePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
		}
	};
	protected SecuritiesPricing priceFactRelatedPricing;
	/**
	 * Securities pricing for which a price fact period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceFactPeriod
	 * SecuritiesPricing.mmPriceFactPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceFactRelatedPricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities pricing for which a price fact period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceFactRelatedPricing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceFactRelatedPricing";
			definition = "Securities pricing for which a price fact period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmPriceFactPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected Distribution cashDistribution;
	/**
	 * Cash distribution for which an interest period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmInterestPeriod
	 * Distribution.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash distribution for which an interest period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDistribution";
			definition = "Cash distribution for which an interest period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.mmInterestPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};
	protected ComponentSecurity componentSecurity;
	/**
	 * Security component for which a separation period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ComponentSecurity#mmSeparationPeriod
	 * ComponentSecurity.mmSeparationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ComponentSecurity
	 * ComponentSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComponentSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security component for which a separation period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmComponentSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ComponentSecurity";
			definition = "Security component for which a separation period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmSeparationPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
		}
	};
	protected TradingSession tradingSession;
	/**
	 * Trading session for which a time bracket is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession#mmTimeBracket
	 * TradingSession.mmTimeBracket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading session for which a time bracket is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradingSession = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSession";
			definition = "Trading session for which a time bracket is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.mmTimeBracket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
		}
	};
	protected FinancialInstrumentSwap financialInstrumentSwap;
	/**
	 * Swap for which a maturity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap#mmMaturity
	 * FinancialInstrumentSwap.mmMaturity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstrumentSwap
	 * FinancialInstrumentSwap}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Swap for which a maturity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFinancialInstrumentSwap = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentSwap";
			definition = "Swap for which a maturity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmMaturity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
		}
	};
	protected PostalAddress relatedPostalAddress;
	/**
	 * Postal address for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmValidityPeriod
	 * PostalAddress.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PostalAddress
	 * PostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal address for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPostalAddress = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPostalAddress";
			definition = "Postal address for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
		}
	};
	protected RedemptionSchedule redemptionSchedule;
	/**
	 * Redemption schedule for which a notice period is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmEffectivePeriod
	 * RedemptionSchedule.mmEffectivePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption schedule for which a notice period is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionSchedule";
			definition = "Redemption schedule for which a notice period is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmEffectivePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
		}
	};
	protected AccountLink relatedAccountLink;
	/**
	 * Link between two accounts for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#mmValidityPeriod
	 * AccountLink.mmValidityPeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccountLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link between two accounts for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedAccountLink = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountLink";
			definition = "Link between two accounts for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.mmValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
		}
	};
	protected Adjustment relatedAdjustment;
	/**
	 * Adjustment for which a validity period is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmEffectivePeriod
	 * Adjustment.mmEffectivePeriod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment for which a validity period is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedAdjustment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAdjustment";
			definition = "Adjustment for which a validity period is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmEffectivePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	protected SecuritiesIdentification relatedSecuritiesIdentification;
	/**
	 * Securities identification for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValidityPeriod
	 * SecuritiesIdentification.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities identification for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesIdentification";
			definition = "Securities identification for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.StandingSettlementInstruction> relatedStandingSettlementInstruction;
	/**
	 * SSI for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmValidityPeriod
	 * StandingSettlementInstruction.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedStandingSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SSI for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedStandingSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedStandingSettlementInstruction";
			definition = "SSI for which a validity period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
		}
	};
	protected BasicSecuritiesRegistration relatedSecuritiesRegistration;
	/**
	 * Securities registration process for which a split period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSplitPeriod
	 * BasicSecuritiesRegistration.mmSplitPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities registration process for which a split period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesRegistration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesRegistration";
			definition = "Securities registration process for which a split period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSplitPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
		}
	};
	protected AmountAndPeriod amount;
	/**
	 * Relationship with an amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndPeriod#mmPeriod
	 * AmountAndPeriod.mmPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountAndPeriod
	 * AmountAndPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relationship with an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAmount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Relationship with an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountAndPeriod.mmPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AmountAndPeriod.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentPlan> relatedInvestmentPlan;
	/**
	 * InvestmentPlan for which an investment period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInvestmentPeriod
	 * InvestmentPlan.mmInvestmentPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "InvestmentPlan for which an investment period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentPlan";
			definition = "InvestmentPlan for which an investment period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmInvestmentPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}
	};
	protected Issuance issuance;
	/**
	 * Issuance for which subscription information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmSubscriptionPeriod
	 * Issuance.mmSubscriptionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which subscription information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIssuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Issuance for which subscription information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmSubscriptionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	protected PaymentTerms relatedPaymentTerms;
	/**
	 * Payment terms for which a period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmPaymentPeriod
	 * PaymentTerms.mmPaymentPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentTerms
	 * PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment terms for which a period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPaymentTerms = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentTerms";
			definition = "Payment terms for which a period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmPaymentPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
		}
	};
	protected PercentageAndPeriod percentage;
	/**
	 * Relationship with a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PercentageAndPeriod#mmPeriod
	 * PercentageAndPeriod.mmPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PercentageAndPeriod
	 * PercentageAndPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relationship with a percentage."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPercentage = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Relationship with a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PercentageAndPeriod.mmPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PercentageAndPeriod.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.RolePlayer> relatedRolePlayer;
	/**
	 * Role player for which a validity period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer#mmValidityPeriod
	 * RolePlayer.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RolePlayer
	 * RolePlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRolePlayer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role player for which a validity period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedRolePlayer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRolePlayer";
			definition = "Role player for which a validity period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RolePlayer.mmValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RolePlayer.mmObject();
		}
	};
	protected SystemAvailability relatedSystemAvailability;
	/**
	 * System availability for which the closure period is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmClosurePeriod
	 * SystemAvailability.mmClosurePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemAvailability
	 * SystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSystemAvailability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "System availability for which the closure period is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSystemAvailability = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedSystemAvailability";
			definition = "System availability for which the closure period is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmClosurePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DateTimePeriod";
				definition = "Time span defined by a start date and time, and an end date and time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.mmValidityPeriod, com.tools20022.repository.entity.SecuritiesPricing.mmPriceCalculationPeriod,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceFactPeriod, com.tools20022.repository.entity.RolePlayer.mmValidityPeriod, com.tools20022.repository.entity.PostalAddress.mmValidityPeriod,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmValidityPeriod, com.tools20022.repository.entity.Account.mmReportedPeriod, com.tools20022.repository.entity.RedemptionSchedule.mmEffectivePeriod,
						com.tools20022.repository.entity.Scheme.mmAssessmentValidityPeriod, com.tools20022.repository.entity.Status.mmValidityTime, com.tools20022.repository.entity.Agreement.mmValidityPeriod,
						com.tools20022.repository.entity.Adjustment.mmEffectivePeriod, com.tools20022.repository.entity.InvestmentPlan.mmInvestmentPeriod, com.tools20022.repository.entity.PaymentInstruction.mmProcessingValidityTime,
						com.tools20022.repository.entity.System.mmVersionValidityPeriod, com.tools20022.repository.entity.Limit.mmValidityPeriod, com.tools20022.repository.entity.StandingOrder.mmValidityPeriod,
						com.tools20022.repository.entity.ValuationStatistics.mmPeriod, com.tools20022.repository.entity.PerformanceFactors.mmAccumulationPeriod, com.tools20022.repository.entity.AccountRestriction.mmValidityPeriod,
						com.tools20022.repository.entity.SystemAvailability.mmClosurePeriod, com.tools20022.repository.entity.InterestCalculation.mmInterestPeriod, com.tools20022.repository.entity.Debt.mmExtendiblePeriod,
						com.tools20022.repository.entity.Debt.mmCustomDate, com.tools20022.repository.entity.Issuance.mmSubscriptionPeriod, com.tools20022.repository.entity.SecuritiesConversion.mmConversionPeriod,
						com.tools20022.repository.entity.StandingSettlementInstruction.mmValidityPeriod, com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSplitPeriod,
						com.tools20022.repository.entity.CorporateActionEvent.mmBookClosurePeriod, com.tools20022.repository.entity.CorporateActionEvent.mmTradingPeriod, com.tools20022.repository.entity.ClassAction.mmClaimPeriod,
						com.tools20022.repository.entity.CorporateActionOption.mmActionPeriod, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmParallelTradingPeriod,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmAssentedLinePeriod, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmSellThruIssuerPeriod,
						com.tools20022.repository.entity.BiddingConditions.mmCompulsoryPurchasePeriod, com.tools20022.repository.entity.SuspensionPeriod.mmPrivilegeSuspensionPeriod,
						com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer,
						com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit,
						com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForPledge, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation,
						com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName,
						com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName, com.tools20022.repository.entity.SuspensionPeriod.mmCoDepositoriesSuspensionPeriod,
						com.tools20022.repository.entity.TradingSession.mmTimeBracket, com.tools20022.repository.entity.YieldCalculation.mmValuePeriod, com.tools20022.repository.entity.BankOperation.mmApplicablePeriod,
						com.tools20022.repository.entity.Invoice.mmPeriodCovered, com.tools20022.repository.entity.TaxPeriod.mmFromToDate, com.tools20022.repository.entity.Distribution.mmExercisePeriod,
						com.tools20022.repository.entity.Distribution.mmOfferPeriod, com.tools20022.repository.entity.Distribution.mmTradingPeriod, com.tools20022.repository.entity.Distribution.mmBlockingPeriod,
						com.tools20022.repository.entity.Distribution.mmInterestPeriod, com.tools20022.repository.entity.ProductDelivery.mmDeliveryPeriod, com.tools20022.repository.entity.TradeCertificate.mmInspectionDate,
						com.tools20022.repository.entity.Guarantee.mmEffectivePeriod, com.tools20022.repository.entity.PortfolioValuation.mmValuationPeriod, com.tools20022.repository.entity.AccountLink.mmValidityPeriod,
						com.tools20022.repository.entity.ComponentSecurity.mmSeparationPeriod, com.tools20022.repository.entity.FinancialInstrumentSwap.mmMaturity, com.tools20022.repository.entity.AmountAndPeriod.mmPeriod,
						com.tools20022.repository.entity.PaymentTerms.mmPaymentPeriod, com.tools20022.repository.entity.PercentageAndPeriod.mmPeriod);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DateTimePeriodChoice.mmDateTimeRange, com.tools20022.repository.choice.DateAndPeriod2Choice.mmPeriod,
						com.tools20022.repository.choice.DatePeriodDetails2Choice.mmFromToDate, com.tools20022.repository.choice.Period1Choice.mmPeriod, com.tools20022.repository.choice.Period3Choice.mmPeriod,
						com.tools20022.repository.choice.Period2Choice.mmFromDateTimeToDateTime, com.tools20022.repository.choice.Period2Choice.mmFromDateToDate, com.tools20022.repository.msg.ReportingRequest3.mmReportingPeriod,
						com.tools20022.repository.choice.Period4Choice.mmDate, com.tools20022.repository.choice.Period4Choice.mmFromDateToDate);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmFromDateTime, com.tools20022.repository.entity.DateTimePeriod.mmToDateTime,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedStandingOrder, com.tools20022.repository.entity.DateTimePeriod.mmPaymentInstruction, com.tools20022.repository.entity.DateTimePeriod.mmNumberOfDays,
						com.tools20022.repository.entity.DateTimePeriod.mmValuationStatistics, com.tools20022.repository.entity.DateTimePeriod.mmPerformanceFactors, com.tools20022.repository.entity.DateTimePeriod.mmStatus,
						com.tools20022.repository.entity.DateTimePeriod.mmPriceCalculationRelatedPricing, com.tools20022.repository.entity.DateTimePeriod.mmCorporateActionOption,
						com.tools20022.repository.entity.DateTimePeriod.mmParallelTradingProceedsDefinition, com.tools20022.repository.entity.DateTimePeriod.mmPrivilegeSuspensionCorporateAction,
						com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmRelatedInterestCalculation,
						com.tools20022.repository.entity.DateTimePeriod.mmBiddingConditions, com.tools20022.repository.entity.DateTimePeriod.mmClassAction,
						com.tools20022.repository.entity.DateTimePeriod.mmBookEntryTransferSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmDepositAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmDepositSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmPledgeSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmSegregationPeriodRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalInNomineeNameSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalInStreetNameSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmBookClosureCorporateAction, com.tools20022.repository.entity.DateTimePeriod.mmCoDepositoriesSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmExtendiblePeriodDebt, com.tools20022.repository.entity.DateTimePeriod.mmSecuritiesConversion, com.tools20022.repository.entity.DateTimePeriod.mmYieldCalculation,
						com.tools20022.repository.entity.DateTimePeriod.mmCustomDateDebt, com.tools20022.repository.entity.DateTimePeriod.mmTaxPeriod, com.tools20022.repository.entity.DateTimePeriod.mmAccount,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedAgreement, com.tools20022.repository.entity.DateTimePeriod.mmAssentedLinePeriodProceedsDefinition,
						com.tools20022.repository.entity.DateTimePeriod.mmSellThruIssuerProceedsDefinition, com.tools20022.repository.entity.DateTimePeriod.mmRelatedProductDelivery,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedInvoice, com.tools20022.repository.entity.DateTimePeriod.mmTradeCertificate, com.tools20022.repository.entity.DateTimePeriod.mmRelatedPortfolioValuation,
						com.tools20022.repository.entity.DateTimePeriod.mmSystem, com.tools20022.repository.entity.DateTimePeriod.mmAccountRestriction, com.tools20022.repository.entity.DateTimePeriod.mmBankOperation,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedCorporateAction, com.tools20022.repository.entity.DateTimePeriod.mmRelatedLimit, com.tools20022.repository.entity.DateTimePeriod.mmRelatedIdentification,
						com.tools20022.repository.entity.DateTimePeriod.mmAssessmentValidityScheme, com.tools20022.repository.entity.DateTimePeriod.mmExercisePeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.mmOfferPeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.mmTradingPeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.mmBlockingPeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.mmGuarantee, com.tools20022.repository.entity.DateTimePeriod.mmPriceFactRelatedPricing,
						com.tools20022.repository.entity.DateTimePeriod.mmCashDistribution, com.tools20022.repository.entity.DateTimePeriod.mmComponentSecurity, com.tools20022.repository.entity.DateTimePeriod.mmTradingSession,
						com.tools20022.repository.entity.DateTimePeriod.mmFinancialInstrumentSwap, com.tools20022.repository.entity.DateTimePeriod.mmRelatedPostalAddress,
						com.tools20022.repository.entity.DateTimePeriod.mmRedemptionSchedule, com.tools20022.repository.entity.DateTimePeriod.mmRelatedAccountLink, com.tools20022.repository.entity.DateTimePeriod.mmRelatedAdjustment,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedSecuritiesIdentification, com.tools20022.repository.entity.DateTimePeriod.mmRelatedStandingSettlementInstruction,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedSecuritiesRegistration, com.tools20022.repository.entity.DateTimePeriod.mmAmount, com.tools20022.repository.entity.DateTimePeriod.mmRelatedInvestmentPlan,
						com.tools20022.repository.entity.DateTimePeriod.mmIssuance, com.tools20022.repository.entity.DateTimePeriod.mmRelatedPaymentTerms, com.tools20022.repository.entity.DateTimePeriod.mmPercentage,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedRolePlayer, com.tools20022.repository.entity.DateTimePeriod.mmRelatedSystemAvailability);
				derivationComponent_lazy = () -> Arrays.asList(DatePeriodDetails.mmObject(), DateTimePeriodDetails.mmObject(), DateTimePeriodChoice.mmObject(), Period2.mmObject(), DatePeriodDetails2Choice.mmObject(),
						DatePeriodDetails1.mmObject(), Period3.mmObject(), Period5.mmObject(), Period1Choice.mmObject(), Period4.mmObject(), Period3Choice.mmObject(), Period2Choice.mmObject(), DateTimePeriodDetails1.mmObject(),
						Period1.mmObject(), ReportingPeriod1.mmObject(), DateAndDateTimeSearch2Choice.mmObject(), Period4Choice.mmObject(), DateTimePeriod1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getFromDateTime() {
		return fromDateTime;
	}

	public void setFromDateTime(ISODateTime fromDateTime) {
		this.fromDateTime = fromDateTime;
	}

	public ISODateTime getToDateTime() {
		return toDateTime;
	}

	public void setToDateTime(ISODateTime toDateTime) {
		this.toDateTime = toDateTime;
	}

	public StandingOrder getRelatedStandingOrder() {
		return relatedStandingOrder;
	}

	public void setRelatedStandingOrder(com.tools20022.repository.entity.StandingOrder relatedStandingOrder) {
		this.relatedStandingOrder = relatedStandingOrder;
	}

	public PaymentInstruction getPaymentInstruction() {
		return paymentInstruction;
	}

	public void setPaymentInstruction(com.tools20022.repository.entity.PaymentInstruction paymentInstruction) {
		this.paymentInstruction = paymentInstruction;
	}

	public Number getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(Number numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public ValuationStatistics getValuationStatistics() {
		return valuationStatistics;
	}

	public void setValuationStatistics(com.tools20022.repository.entity.ValuationStatistics valuationStatistics) {
		this.valuationStatistics = valuationStatistics;
	}

	public PerformanceFactors getPerformanceFactors() {
		return performanceFactors;
	}

	public void setPerformanceFactors(com.tools20022.repository.entity.PerformanceFactors performanceFactors) {
		this.performanceFactors = performanceFactors;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(com.tools20022.repository.entity.Status status) {
		this.status = status;
	}

	public SecuritiesPricing getPriceCalculationRelatedPricing() {
		return priceCalculationRelatedPricing;
	}

	public void setPriceCalculationRelatedPricing(com.tools20022.repository.entity.SecuritiesPricing priceCalculationRelatedPricing) {
		this.priceCalculationRelatedPricing = priceCalculationRelatedPricing;
	}

	public CorporateActionOption getCorporateActionOption() {
		return corporateActionOption;
	}

	public void setCorporateActionOption(com.tools20022.repository.entity.CorporateActionOption corporateActionOption) {
		this.corporateActionOption = corporateActionOption;
	}

	public SecuritiesProceedsDefinition getParallelTradingProceedsDefinition() {
		return parallelTradingProceedsDefinition;
	}

	public void setParallelTradingProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition parallelTradingProceedsDefinition) {
		this.parallelTradingProceedsDefinition = parallelTradingProceedsDefinition;
	}

	public SuspensionPeriod getPrivilegeSuspensionCorporateAction() {
		return privilegeSuspensionCorporateAction;
	}

	public void setPrivilegeSuspensionCorporateAction(com.tools20022.repository.entity.SuspensionPeriod privilegeSuspensionCorporateAction) {
		this.privilegeSuspensionCorporateAction = privilegeSuspensionCorporateAction;
	}

	public SuspensionPeriod getWithdrawalSuspensionRelatedEvent() {
		return withdrawalSuspensionRelatedEvent;
	}

	public void setWithdrawalSuspensionRelatedEvent(com.tools20022.repository.entity.SuspensionPeriod withdrawalSuspensionRelatedEvent) {
		this.withdrawalSuspensionRelatedEvent = withdrawalSuspensionRelatedEvent;
	}

	public InterestCalculation getRelatedInterestCalculation() {
		return relatedInterestCalculation;
	}

	public void setRelatedInterestCalculation(com.tools20022.repository.entity.InterestCalculation relatedInterestCalculation) {
		this.relatedInterestCalculation = relatedInterestCalculation;
	}

	public BiddingConditions getBiddingConditions() {
		return biddingConditions;
	}

	public void setBiddingConditions(com.tools20022.repository.entity.BiddingConditions biddingConditions) {
		this.biddingConditions = biddingConditions;
	}

	public ClassAction getClassAction() {
		return classAction;
	}

	public void setClassAction(com.tools20022.repository.entity.ClassAction classAction) {
		this.classAction = classAction;
	}

	public SuspensionPeriod getBookEntryTransferSuspensionRelatedEvent() {
		return bookEntryTransferSuspensionRelatedEvent;
	}

	public void setBookEntryTransferSuspensionRelatedEvent(com.tools20022.repository.entity.SuspensionPeriod bookEntryTransferSuspensionRelatedEvent) {
		this.bookEntryTransferSuspensionRelatedEvent = bookEntryTransferSuspensionRelatedEvent;
	}

	public SuspensionPeriod getDepositAtAgentSuspensionRelatedEvent() {
		return depositAtAgentSuspensionRelatedEvent;
	}

	public void setDepositAtAgentSuspensionRelatedEvent(com.tools20022.repository.entity.SuspensionPeriod depositAtAgentSuspensionRelatedEvent) {
		this.depositAtAgentSuspensionRelatedEvent = depositAtAgentSuspensionRelatedEvent;
	}

	public SuspensionPeriod getDepositSuspensionRelatedEvent() {
		return depositSuspensionRelatedEvent;
	}

	public void setDepositSuspensionRelatedEvent(com.tools20022.repository.entity.SuspensionPeriod depositSuspensionRelatedEvent) {
		this.depositSuspensionRelatedEvent = depositSuspensionRelatedEvent;
	}

	public SuspensionPeriod getPledgeSuspensionRelatedEvent() {
		return pledgeSuspensionRelatedEvent;
	}

	public void setPledgeSuspensionRelatedEvent(com.tools20022.repository.entity.SuspensionPeriod pledgeSuspensionRelatedEvent) {
		this.pledgeSuspensionRelatedEvent = pledgeSuspensionRelatedEvent;
	}

	public SuspensionPeriod getSegregationPeriodRelatedEvent() {
		return segregationPeriodRelatedEvent;
	}

	public void setSegregationPeriodRelatedEvent(com.tools20022.repository.entity.SuspensionPeriod segregationPeriodRelatedEvent) {
		this.segregationPeriodRelatedEvent = segregationPeriodRelatedEvent;
	}

	public SuspensionPeriod getWithdrawalAtAgentSuspensionRelatedEvent() {
		return withdrawalAtAgentSuspensionRelatedEvent;
	}

	public void setWithdrawalAtAgentSuspensionRelatedEvent(com.tools20022.repository.entity.SuspensionPeriod withdrawalAtAgentSuspensionRelatedEvent) {
		this.withdrawalAtAgentSuspensionRelatedEvent = withdrawalAtAgentSuspensionRelatedEvent;
	}

	public SuspensionPeriod getWithdrawalInNomineeNameSuspensionRelatedEvent() {
		return withdrawalInNomineeNameSuspensionRelatedEvent;
	}

	public void setWithdrawalInNomineeNameSuspensionRelatedEvent(com.tools20022.repository.entity.SuspensionPeriod withdrawalInNomineeNameSuspensionRelatedEvent) {
		this.withdrawalInNomineeNameSuspensionRelatedEvent = withdrawalInNomineeNameSuspensionRelatedEvent;
	}

	public SuspensionPeriod getWithdrawalInStreetNameSuspensionRelatedEvent() {
		return withdrawalInStreetNameSuspensionRelatedEvent;
	}

	public void setWithdrawalInStreetNameSuspensionRelatedEvent(com.tools20022.repository.entity.SuspensionPeriod withdrawalInStreetNameSuspensionRelatedEvent) {
		this.withdrawalInStreetNameSuspensionRelatedEvent = withdrawalInStreetNameSuspensionRelatedEvent;
	}

	public CorporateActionEvent getBookClosureCorporateAction() {
		return bookClosureCorporateAction;
	}

	public void setBookClosureCorporateAction(com.tools20022.repository.entity.CorporateActionEvent bookClosureCorporateAction) {
		this.bookClosureCorporateAction = bookClosureCorporateAction;
	}

	public SuspensionPeriod getCoDepositoriesSuspensionRelatedEvent() {
		return coDepositoriesSuspensionRelatedEvent;
	}

	public void setCoDepositoriesSuspensionRelatedEvent(com.tools20022.repository.entity.SuspensionPeriod coDepositoriesSuspensionRelatedEvent) {
		this.coDepositoriesSuspensionRelatedEvent = coDepositoriesSuspensionRelatedEvent;
	}

	public Debt getExtendiblePeriodDebt() {
		return extendiblePeriodDebt;
	}

	public void setExtendiblePeriodDebt(com.tools20022.repository.entity.Debt extendiblePeriodDebt) {
		this.extendiblePeriodDebt = extendiblePeriodDebt;
	}

	public SecuritiesConversion getSecuritiesConversion() {
		return securitiesConversion;
	}

	public void setSecuritiesConversion(com.tools20022.repository.entity.SecuritiesConversion securitiesConversion) {
		this.securitiesConversion = securitiesConversion;
	}

	public YieldCalculation getYieldCalculation() {
		return yieldCalculation;
	}

	public void setYieldCalculation(com.tools20022.repository.entity.YieldCalculation yieldCalculation) {
		this.yieldCalculation = yieldCalculation;
	}

	public Debt getCustomDateDebt() {
		return customDateDebt;
	}

	public void setCustomDateDebt(com.tools20022.repository.entity.Debt customDateDebt) {
		this.customDateDebt = customDateDebt;
	}

	public TaxPeriod getTaxPeriod() {
		return taxPeriod;
	}

	public void setTaxPeriod(com.tools20022.repository.entity.TaxPeriod taxPeriod) {
		this.taxPeriod = taxPeriod;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.entity.Account account) {
		this.account = account;
	}

	public Agreement getRelatedAgreement() {
		return relatedAgreement;
	}

	public void setRelatedAgreement(com.tools20022.repository.entity.Agreement relatedAgreement) {
		this.relatedAgreement = relatedAgreement;
	}

	public SecuritiesProceedsDefinition getAssentedLinePeriodProceedsDefinition() {
		return assentedLinePeriodProceedsDefinition;
	}

	public void setAssentedLinePeriodProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition assentedLinePeriodProceedsDefinition) {
		this.assentedLinePeriodProceedsDefinition = assentedLinePeriodProceedsDefinition;
	}

	public SecuritiesProceedsDefinition getSellThruIssuerProceedsDefinition() {
		return sellThruIssuerProceedsDefinition;
	}

	public void setSellThruIssuerProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition sellThruIssuerProceedsDefinition) {
		this.sellThruIssuerProceedsDefinition = sellThruIssuerProceedsDefinition;
	}

	public ProductDelivery getRelatedProductDelivery() {
		return relatedProductDelivery;
	}

	public void setRelatedProductDelivery(com.tools20022.repository.entity.ProductDelivery relatedProductDelivery) {
		this.relatedProductDelivery = relatedProductDelivery;
	}

	public Invoice getRelatedInvoice() {
		return relatedInvoice;
	}

	public void setRelatedInvoice(com.tools20022.repository.entity.Invoice relatedInvoice) {
		this.relatedInvoice = relatedInvoice;
	}

	public TradeCertificate getTradeCertificate() {
		return tradeCertificate;
	}

	public void setTradeCertificate(com.tools20022.repository.entity.TradeCertificate tradeCertificate) {
		this.tradeCertificate = tradeCertificate;
	}

	public PortfolioValuation getRelatedPortfolioValuation() {
		return relatedPortfolioValuation;
	}

	public void setRelatedPortfolioValuation(com.tools20022.repository.entity.PortfolioValuation relatedPortfolioValuation) {
		this.relatedPortfolioValuation = relatedPortfolioValuation;
	}

	public System getSystem() {
		return system;
	}

	public void setSystem(com.tools20022.repository.entity.System system) {
		this.system = system;
	}

	public AccountRestriction getAccountRestriction() {
		return accountRestriction;
	}

	public void setAccountRestriction(com.tools20022.repository.entity.AccountRestriction accountRestriction) {
		this.accountRestriction = accountRestriction;
	}

	public BankOperation getBankOperation() {
		return bankOperation;
	}

	public void setBankOperation(com.tools20022.repository.entity.BankOperation bankOperation) {
		this.bankOperation = bankOperation;
	}

	public CorporateActionEvent getRelatedCorporateAction() {
		return relatedCorporateAction;
	}

	public void setRelatedCorporateAction(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateAction) {
		this.relatedCorporateAction = relatedCorporateAction;
	}

	public List<Limit> getRelatedLimit() {
		return relatedLimit;
	}

	public void setRelatedLimit(List<com.tools20022.repository.entity.Limit> relatedLimit) {
		this.relatedLimit = relatedLimit;
	}

	public List<PartyIdentificationInformation> getRelatedIdentification() {
		return relatedIdentification;
	}

	public void setRelatedIdentification(List<com.tools20022.repository.entity.PartyIdentificationInformation> relatedIdentification) {
		this.relatedIdentification = relatedIdentification;
	}

	public Scheme getAssessmentValidityScheme() {
		return assessmentValidityScheme;
	}

	public void setAssessmentValidityScheme(com.tools20022.repository.entity.Scheme assessmentValidityScheme) {
		this.assessmentValidityScheme = assessmentValidityScheme;
	}

	public Distribution getExercisePeriodDistribution() {
		return exercisePeriodDistribution;
	}

	public void setExercisePeriodDistribution(com.tools20022.repository.entity.Distribution exercisePeriodDistribution) {
		this.exercisePeriodDistribution = exercisePeriodDistribution;
	}

	public Distribution getOfferPeriodDistribution() {
		return offerPeriodDistribution;
	}

	public void setOfferPeriodDistribution(com.tools20022.repository.entity.Distribution offerPeriodDistribution) {
		this.offerPeriodDistribution = offerPeriodDistribution;
	}

	public Distribution getTradingPeriodDistribution() {
		return tradingPeriodDistribution;
	}

	public void setTradingPeriodDistribution(com.tools20022.repository.entity.Distribution tradingPeriodDistribution) {
		this.tradingPeriodDistribution = tradingPeriodDistribution;
	}

	public Distribution getBlockingPeriodDistribution() {
		return blockingPeriodDistribution;
	}

	public void setBlockingPeriodDistribution(com.tools20022.repository.entity.Distribution blockingPeriodDistribution) {
		this.blockingPeriodDistribution = blockingPeriodDistribution;
	}

	public Guarantee getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(com.tools20022.repository.entity.Guarantee guarantee) {
		this.guarantee = guarantee;
	}

	public SecuritiesPricing getPriceFactRelatedPricing() {
		return priceFactRelatedPricing;
	}

	public void setPriceFactRelatedPricing(com.tools20022.repository.entity.SecuritiesPricing priceFactRelatedPricing) {
		this.priceFactRelatedPricing = priceFactRelatedPricing;
	}

	public Distribution getCashDistribution() {
		return cashDistribution;
	}

	public void setCashDistribution(com.tools20022.repository.entity.Distribution cashDistribution) {
		this.cashDistribution = cashDistribution;
	}

	public ComponentSecurity getComponentSecurity() {
		return componentSecurity;
	}

	public void setComponentSecurity(com.tools20022.repository.entity.ComponentSecurity componentSecurity) {
		this.componentSecurity = componentSecurity;
	}

	public TradingSession getTradingSession() {
		return tradingSession;
	}

	public void setTradingSession(com.tools20022.repository.entity.TradingSession tradingSession) {
		this.tradingSession = tradingSession;
	}

	public FinancialInstrumentSwap getFinancialInstrumentSwap() {
		return financialInstrumentSwap;
	}

	public void setFinancialInstrumentSwap(com.tools20022.repository.entity.FinancialInstrumentSwap financialInstrumentSwap) {
		this.financialInstrumentSwap = financialInstrumentSwap;
	}

	public PostalAddress getRelatedPostalAddress() {
		return relatedPostalAddress;
	}

	public void setRelatedPostalAddress(com.tools20022.repository.entity.PostalAddress relatedPostalAddress) {
		this.relatedPostalAddress = relatedPostalAddress;
	}

	public RedemptionSchedule getRedemptionSchedule() {
		return redemptionSchedule;
	}

	public void setRedemptionSchedule(com.tools20022.repository.entity.RedemptionSchedule redemptionSchedule) {
		this.redemptionSchedule = redemptionSchedule;
	}

	public AccountLink getRelatedAccountLink() {
		return relatedAccountLink;
	}

	public void setRelatedAccountLink(com.tools20022.repository.entity.AccountLink relatedAccountLink) {
		this.relatedAccountLink = relatedAccountLink;
	}

	public Adjustment getRelatedAdjustment() {
		return relatedAdjustment;
	}

	public void setRelatedAdjustment(com.tools20022.repository.entity.Adjustment relatedAdjustment) {
		this.relatedAdjustment = relatedAdjustment;
	}

	public SecuritiesIdentification getRelatedSecuritiesIdentification() {
		return relatedSecuritiesIdentification;
	}

	public void setRelatedSecuritiesIdentification(com.tools20022.repository.entity.SecuritiesIdentification relatedSecuritiesIdentification) {
		this.relatedSecuritiesIdentification = relatedSecuritiesIdentification;
	}

	public List<StandingSettlementInstruction> getRelatedStandingSettlementInstruction() {
		return relatedStandingSettlementInstruction;
	}

	public void setRelatedStandingSettlementInstruction(List<com.tools20022.repository.entity.StandingSettlementInstruction> relatedStandingSettlementInstruction) {
		this.relatedStandingSettlementInstruction = relatedStandingSettlementInstruction;
	}

	public BasicSecuritiesRegistration getRelatedSecuritiesRegistration() {
		return relatedSecuritiesRegistration;
	}

	public void setRelatedSecuritiesRegistration(com.tools20022.repository.entity.BasicSecuritiesRegistration relatedSecuritiesRegistration) {
		this.relatedSecuritiesRegistration = relatedSecuritiesRegistration;
	}

	public AmountAndPeriod getAmount() {
		return amount;
	}

	public void setAmount(com.tools20022.repository.entity.AmountAndPeriod amount) {
		this.amount = amount;
	}

	public List<InvestmentPlan> getRelatedInvestmentPlan() {
		return relatedInvestmentPlan;
	}

	public void setRelatedInvestmentPlan(List<com.tools20022.repository.entity.InvestmentPlan> relatedInvestmentPlan) {
		this.relatedInvestmentPlan = relatedInvestmentPlan;
	}

	public Issuance getIssuance() {
		return issuance;
	}

	public void setIssuance(com.tools20022.repository.entity.Issuance issuance) {
		this.issuance = issuance;
	}

	public PaymentTerms getRelatedPaymentTerms() {
		return relatedPaymentTerms;
	}

	public void setRelatedPaymentTerms(com.tools20022.repository.entity.PaymentTerms relatedPaymentTerms) {
		this.relatedPaymentTerms = relatedPaymentTerms;
	}

	public PercentageAndPeriod getPercentage() {
		return percentage;
	}

	public void setPercentage(com.tools20022.repository.entity.PercentageAndPeriod percentage) {
		this.percentage = percentage;
	}

	public List<RolePlayer> getRelatedRolePlayer() {
		return relatedRolePlayer;
	}

	public void setRelatedRolePlayer(List<com.tools20022.repository.entity.RolePlayer> relatedRolePlayer) {
		this.relatedRolePlayer = relatedRolePlayer;
	}

	public SystemAvailability getRelatedSystemAvailability() {
		return relatedSystemAvailability;
	}

	public void setRelatedSystemAvailability(com.tools20022.repository.entity.SystemAvailability relatedSystemAvailability) {
		this.relatedSystemAvailability = relatedSystemAvailability;
	}
}
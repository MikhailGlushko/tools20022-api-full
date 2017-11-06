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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional information that can not be captured in the structured fields
 * and/or any other specific block.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Extension1#mmPlaceAndName
 * Extension1.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Extension1#mmText
 * Extension1.mmText}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmExtension
 * AccountDetailsConfirmationV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmExtension
 * AccountDetailsConfirmationV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmExtension
 * PEPOrISAOrPortfolioInformationV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02#mmExtension
 * AccountHoldingInformationV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03#mmExtension
 * AccountHoldingInformationV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmExtension
 * AccountModificationInstructionV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmExtension
 * AccountModificationInstructionV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02#mmExtension
 * AccountOpeningInstructionV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmExtension
 * AccountOpeningInstructionV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#mmExtension
 * PEPOrISAOrPortfolioTransferConfirmationV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03#mmExtension
 * PortfolioTransferConfirmationV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04#mmExtension
 * PortfolioTransferConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmExtension
 * PEPOrISAOrPortfolioTransferInstructionV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03#mmExtension
 * PortfolioTransferInstructionV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04#mmExtension
 * PortfolioTransferInstructionV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmExtension
 * PriceReportCancellationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV02#mmExtension
 * PriceReportV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV03#mmExtension
 * PriceReportV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportV04#mmExtension
 * PriceReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmation#mmExtension
 * TransferInConfirmation.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02#mmExtension
 * TransferInConfirmationV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03#mmExtension
 * TransferInConfirmationV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04#mmExtension
 * TransferInConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstruction#mmExtension
 * TransferInInstruction.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02#mmExtension
 * TransferInInstructionV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03#mmExtension
 * TransferInInstructionV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04#mmExtension
 * TransferInInstructionV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmation#mmExtension
 * TransferOutConfirmation.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02#mmExtension
 * TransferOutConfirmationV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03#mmExtension
 * TransferOutConfirmationV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04#mmExtension
 * TransferOutConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstruction#mmExtension
 * TransferOutInstruction.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02#mmExtension
 * TransferOutInstructionV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03#mmExtension
 * TransferOutInstructionV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04#mmExtension
 * TransferOutInstructionV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldings#mmExtension
 * AccountingStatementOfHoldings.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02#mmExtension
 * AccountingStatementOfHoldingsV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#mmExtension
 * CustodyStatementOfHoldings.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmExtension
 * CustodyStatementOfHoldingsV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02#mmExtension
 * FundConfirmedCashForecastReportV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03#mmExtension
 * FundConfirmedCashForecastReportV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02#mmExtension
 * FundDetailedConfirmedCashForecastReportV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03#mmExtension
 * FundDetailedConfirmedCashForecastReportV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02#mmExtension
 * FundDetailedEstimatedCashForecastReportV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03#mmExtension
 * FundDetailedEstimatedCashForecastReportV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02#mmExtension
 * FundEstimatedCashForecastReportV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmExtension
 * FundEstimatedCashForecastReportV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmExtension
 * OrderCancellationStatusReportV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#mmExtension
 * OrderConfirmationStatusReportV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmExtension
 * OrderInstructionStatusReportV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmExtension
 * RedemptionBulkOrderConfirmationAmendmentV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02#mmExtension
 * RedemptionBulkOrderConfirmationV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03#mmExtension
 * RedemptionBulkOrderConfirmationV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV02#mmExtension
 * RedemptionBulkOrderV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03#mmExtension
 * RedemptionBulkOrderV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01#mmExtension
 * RedemptionOrderConfirmationAmendmentV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02#mmExtension
 * RedemptionMultipleOrderConfirmationV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmExtension
 * RedemptionOrderConfirmationV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderV02#mmExtension
 * RedemptionMultipleOrderV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#mmExtension
 * RedemptionOrderV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV01#mmExtension
 * RequestForOrderConfirmationStatusReportV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03#mmExtension
 * RequestForOrderStatusReportV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions#mmExtension
 * StatementOfInvestmentFundTransactions.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02#mmExtension
 * StatementOfInvestmentFundTransactionsV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01#mmExtension
 * SubscriptionBulkOrderConfirmationAmendmentV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02#mmExtension
 * SubscriptionBulkOrderConfirmationV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03#mmExtension
 * SubscriptionBulkOrderConfirmationV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV02#mmExtension
 * SubscriptionBulkOrderV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03#mmExtension
 * SubscriptionBulkOrderV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01#mmExtension
 * SubscriptionOrderConfirmationAmendmentV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02#mmExtension
 * SubscriptionMultipleOrderConfirmationV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03#mmExtension
 * SubscriptionOrderConfirmationV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02#mmExtension
 * SubscriptionMultipleOrderV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03#mmExtension
 * SubscriptionOrderV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01#mmExtension
 * SwitchOrderConfirmationAmendmentV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02#mmExtension
 * SwitchOrderConfirmationV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV03#mmExtension
 * SwitchOrderConfirmationV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV02#mmExtension
 * SwitchOrderV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV03#mmExtension
 * SwitchOrderV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV02#mmExtension
 * RequestForTransferStatusReportV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV03#mmExtension
 * RequestForTransferStatusReportV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV02#mmExtension
 * TransferCancellationStatusReportV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03#mmExtension
 * TransferCancellationStatusReportV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02#mmExtension
 * TransferInstructionStatusReportV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03#mmExtension
 * TransferInstructionStatusReportV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01#mmExtension
 * RequestForPEPOrISAOrPortfolioInformationV01.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02#mmExtension
 * AccountHoldingInformationRequestV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportV02#mmExtension
 * RegulatoryTransactionReportV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmExtension
 * AccountDetailsConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmExtension
 * AccountModificationInstructionV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmExtension
 * AccountOpeningInstructionV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05#mmExtension
 * TransferInConfirmationV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04#mmExtension
 * TransferInstructionStatusReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmExtension
 * AccountHoldingInformationRequestV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05#mmExtension
 * TransferOutInstructionV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmExtension
 * AccountHoldingInformationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04#mmExtension
 * TransferCancellationStatusReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05#mmExtension
 * PortfolioTransferInstructionV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05#mmExtension
 * TransferInInstructionV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmExtension
 * PortfolioTransferConfirmationV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05#mmExtension
 * TransferOutConfirmationV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV04#mmExtension
 * RequestForTransferStatusReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV04#mmExtension
 * AccountManagementStatusReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmExtension
 * FundDetailedEstimatedCashForecastReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV05#mmExtension
 * AccountOpeningInstructionV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmExtension
 * FundConfirmedCashForecastReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmExtension
 * FundEstimatedCashForecastReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV05#mmExtension
 * AccountModificationInstructionV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03#mmExtension
 * StatementOfInvestmentFundTransactionsV03.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmExtension
 * AccountDetailsConfirmationV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmExtension
 * FundDetailedConfirmedCashForecastReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmExtension
 * PortfolioTransferConfirmationV06.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#mmExtension
 * PortfolioTransferInstructionV06.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06#mmExtension
 * TransferInInstructionV06.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06#mmExtension
 * TransferOutConfirmationV06.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06#mmExtension
 * TransferOutInstructionV06.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06#mmExtension
 * TransferInConfirmationV06.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#mmExtension
 * PortfolioTransferInstructionV07.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmExtension
 * AccountHoldingInformationV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05#mmExtension
 * TransferInstructionStatusReportV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmExtension
 * TransferInConfirmationV07.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmExtension
 * AccountOpeningInstructionV06.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#mmExtension
 * TransferOutConfirmationV07.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV05#mmExtension
 * RequestForTransferStatusReportV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmExtension
 * AccountDetailsConfirmationV06.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmExtension
 * PortfolioTransferConfirmationV07.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05#mmExtension
 * TransferCancellationStatusReportV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#mmExtension
 * TransferOutInstructionV07.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05#mmExtension
 * AccountManagementStatusReportV05.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmExtension
 * AccountModificationInstructionV06.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#mmExtension
 * TransferInInstructionV07.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmExtension
 * AccountHoldingInformationRequestV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmExtension
 * SubscriptionBulkOrderConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04#mmExtension
 * RedemptionBulkOrderV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmExtension
 * RedemptionOrderV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04#mmExtension
 * RedemptionBulkOrderConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04#mmExtension
 * SwitchOrderConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04#mmExtension
 * RequestForOrderStatusReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmExtension
 * SubscriptionOrderConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#mmExtension
 * OrderCancellationStatusReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmExtension
 * SwitchOrderV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmExtension
 * RedemptionOrderConfirmationV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#mmExtension
 * OrderInstructionStatusReportV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02#mmExtension
 * RequestForOrderConfirmationStatusReportV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04#mmExtension
 * SubscriptionBulkOrderV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#mmExtension
 * OrderConfirmationStatusReportV02.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04#mmExtension
 * SubscriptionOrderV04.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmExtension
 * AccountDetailsConfirmationV07.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmExtension
 * AccountModificationInstructionV07.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmExtension
 * AccountOpeningInstructionV07.mmExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#mmExtension
 * AccountManagementStatusReportV06.mmExtension}</li>
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
 * "Extension1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional information that can not be captured in the structured fields and/or any other specific block."
 * </li>
 * </ul>
 */
public class Extension1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * Name qualifying the information provided in the Text field, and place
	 * where this information should be inserted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name qualifying the information provided in the Text field, and place where this information should be inserted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Extension1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Name qualifying the information provided in the Text field, and place where this information should be inserted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max350Text text;
	/**
	 * Text of the extension.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Txt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Text"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Text of the extension."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmText = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Extension1.mmObject();
			isDerived = false;
			xmlTag = "Txt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Text";
			definition = "Text of the extension.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Extension1.mmPlaceAndName, com.tools20022.repository.msg.Extension1.mmText);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmExtension, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03.mmExtension,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmExtension, com.tools20022.repository.area.sese.AccountHoldingInformationV02.mmExtension,
						com.tools20022.repository.area.sese.AccountHoldingInformationV03.mmExtension, com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmExtension,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmExtension, com.tools20022.repository.area.acmt.AccountOpeningInstructionV02.mmExtension,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV03.mmExtension, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02.mmExtension,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03.mmExtension, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04.mmExtension,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmExtension, com.tools20022.repository.area.sese.PortfolioTransferInstructionV03.mmExtension,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV04.mmExtension, com.tools20022.repository.area.reda.PriceReportCancellationV04.mmExtension,
						com.tools20022.repository.area.reda.PriceReportV02.mmExtension, com.tools20022.repository.area.reda.PriceReportV03.mmExtension, com.tools20022.repository.area.reda.PriceReportV04.mmExtension,
						com.tools20022.repository.area.sese.TransferInConfirmation.mmExtension, com.tools20022.repository.area.sese.TransferInConfirmationV02.mmExtension,
						com.tools20022.repository.area.sese.TransferInConfirmationV03.mmExtension, com.tools20022.repository.area.sese.TransferInConfirmationV04.mmExtension,
						com.tools20022.repository.area.sese.TransferInInstruction.mmExtension, com.tools20022.repository.area.sese.TransferInInstructionV02.mmExtension,
						com.tools20022.repository.area.sese.TransferInInstructionV03.mmExtension, com.tools20022.repository.area.sese.TransferInInstructionV04.mmExtension,
						com.tools20022.repository.area.sese.TransferOutConfirmation.mmExtension, com.tools20022.repository.area.sese.TransferOutConfirmationV02.mmExtension,
						com.tools20022.repository.area.sese.TransferOutConfirmationV03.mmExtension, com.tools20022.repository.area.sese.TransferOutConfirmationV04.mmExtension,
						com.tools20022.repository.area.sese.TransferOutInstruction.mmExtension, com.tools20022.repository.area.sese.TransferOutInstructionV02.mmExtension,
						com.tools20022.repository.area.sese.TransferOutInstructionV03.mmExtension, com.tools20022.repository.area.sese.TransferOutInstructionV04.mmExtension,
						com.tools20022.repository.area.semt.AccountingStatementOfHoldings.mmExtension, com.tools20022.repository.area.semt.AccountingStatementOfHoldingsV02.mmExtension,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldings.mmExtension, com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.mmExtension,
						com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02.mmExtension, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03.mmExtension,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02.mmExtension, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03.mmExtension,
						com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02.mmExtension, com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03.mmExtension,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02.mmExtension, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.mmExtension,
						com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.mmExtension, com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01.mmExtension,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmExtension, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01.mmExtension,
						com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV02.mmExtension, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03.mmExtension,
						com.tools20022.repository.area.setr.RedemptionBulkOrderV02.mmExtension, com.tools20022.repository.area.setr.RedemptionBulkOrderV03.mmExtension,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01.mmExtension, com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02.mmExtension,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.mmExtension, com.tools20022.repository.area.setr.RedemptionMultipleOrderV02.mmExtension,
						com.tools20022.repository.area.setr.RedemptionOrderV03.mmExtension, com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV01.mmExtension,
						com.tools20022.repository.area.setr.RequestForOrderStatusReportV03.mmExtension, com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactions.mmExtension,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV02.mmExtension, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationAmendmentV01.mmExtension,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV02.mmExtension, com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV03.mmExtension,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderV02.mmExtension, com.tools20022.repository.area.setr.SubscriptionBulkOrderV03.mmExtension,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationAmendmentV01.mmExtension, com.tools20022.repository.area.setr.SubscriptionMultipleOrderConfirmationV02.mmExtension,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV03.mmExtension, com.tools20022.repository.area.setr.SubscriptionMultipleOrderV02.mmExtension,
						com.tools20022.repository.area.setr.SubscriptionOrderV03.mmExtension, com.tools20022.repository.area.setr.SwitchOrderConfirmationAmendmentV01.mmExtension,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationV02.mmExtension, com.tools20022.repository.area.setr.SwitchOrderConfirmationV03.mmExtension, com.tools20022.repository.area.setr.SwitchOrderV02.mmExtension,
						com.tools20022.repository.area.setr.SwitchOrderV03.mmExtension, com.tools20022.repository.area.sese.RequestForTransferStatusReportV02.mmExtension,
						com.tools20022.repository.area.sese.RequestForTransferStatusReportV03.mmExtension, com.tools20022.repository.area.sese.TransferCancellationStatusReportV02.mmExtension,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV03.mmExtension, com.tools20022.repository.area.sese.TransferInstructionStatusReportV02.mmExtension,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV03.mmExtension, com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01.mmExtension,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02.mmExtension, com.tools20022.repository.area.auth.RegulatoryTransactionReportV02.mmExtension,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04.mmExtension, com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmExtension,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV04.mmExtension, com.tools20022.repository.area.sese.TransferInConfirmationV05.mmExtension,
						com.tools20022.repository.area.sese.TransferInstructionStatusReportV04.mmExtension, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03.mmExtension,
						com.tools20022.repository.area.sese.TransferOutInstructionV05.mmExtension, com.tools20022.repository.area.sese.AccountHoldingInformationV04.mmExtension,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV04.mmExtension, com.tools20022.repository.area.sese.PortfolioTransferInstructionV05.mmExtension,
						com.tools20022.repository.area.sese.TransferInInstructionV05.mmExtension, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05.mmExtension,
						com.tools20022.repository.area.sese.TransferOutConfirmationV05.mmExtension, com.tools20022.repository.area.sese.RequestForTransferStatusReportV04.mmExtension,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV04.mmExtension, com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04.mmExtension,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV05.mmExtension, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04.mmExtension,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.mmExtension, com.tools20022.repository.area.acmt.AccountModificationInstructionV05.mmExtension,
						com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsV03.mmExtension, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05.mmExtension,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.mmExtension, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmExtension,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV06.mmExtension, com.tools20022.repository.area.sese.TransferInInstructionV06.mmExtension,
						com.tools20022.repository.area.sese.TransferOutConfirmationV06.mmExtension, com.tools20022.repository.area.sese.TransferOutInstructionV06.mmExtension,
						com.tools20022.repository.area.sese.TransferInConfirmationV06.mmExtension, com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.mmExtension,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmExtension, com.tools20022.repository.area.sese.TransferInstructionStatusReportV05.mmExtension,
						com.tools20022.repository.area.sese.TransferInConfirmationV07.mmExtension, com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.mmExtension,
						com.tools20022.repository.area.sese.TransferOutConfirmationV07.mmExtension, com.tools20022.repository.area.sese.RequestForTransferStatusReportV05.mmExtension,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmExtension, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.mmExtension,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV05.mmExtension, com.tools20022.repository.area.sese.TransferOutInstructionV07.mmExtension,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV05.mmExtension, com.tools20022.repository.area.acmt.AccountModificationInstructionV06.mmExtension,
						com.tools20022.repository.area.sese.TransferInInstructionV07.mmExtension, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmExtension,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04.mmExtension, com.tools20022.repository.area.setr.RedemptionBulkOrderV04.mmExtension,
						com.tools20022.repository.area.setr.RedemptionOrderV04.mmExtension, com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04.mmExtension,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationV04.mmExtension, com.tools20022.repository.area.setr.RequestForOrderStatusReportV04.mmExtension,
						com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04.mmExtension, com.tools20022.repository.area.setr.OrderCancellationStatusReportV04.mmExtension,
						com.tools20022.repository.area.setr.SwitchOrderV04.mmExtension, com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04.mmExtension,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV04.mmExtension, com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02.mmExtension,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderV04.mmExtension, com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02.mmExtension,
						com.tools20022.repository.area.setr.SubscriptionOrderV04.mmExtension, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmExtension,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV07.mmExtension, com.tools20022.repository.area.acmt.AccountOpeningInstructionV07.mmExtension,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV06.mmExtension);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Extension1";
				definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public Max350Text getText() {
		return text;
	}

	public void setText(Max350Text text) {
		this.text = text;
	}
}
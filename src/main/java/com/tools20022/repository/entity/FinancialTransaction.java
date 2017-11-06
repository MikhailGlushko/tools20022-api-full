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
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Process which includes the order, the execution, the settlement of trades in
 * the financial domain.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FinancialTransaction" src="doc-files/FinancialTransaction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmCorporateActionDistribution
 * FinancialTransaction.mmCorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmInterestManagement
 * FinancialTransaction.mmInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmTrade
 * FinancialTransaction.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmCollateralMovement
 * FinancialTransaction.mmCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmBankingTransaction
 * FinancialTransaction.mmBankingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmRegulatoryReport
 * FinancialTransaction.mmRegulatoryReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#mmFinancialTransaction
 * Trade.mmFinancialTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmFinancialTransaction
 * CorporateActionDistribution.mmFinancialTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmReportedTransaction
 * RegulatoryReport.mmReportedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmFinancialTransaction
 * CollateralMovement.mmFinancialTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmFinancialTransaction
 * BankingTransaction.mmFinancialTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmFinancialTransaction
 * InterestManagement.mmFinancialTransaction}</li>
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
 * "FinancialTransaction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process which includes the order, the execution, the settlement of trades in the financial domain."
 * </li>
 * </ul>
 */
public class FinancialTransaction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionDistribution corporateActionDistribution;
	/**
	 * Distribution of the proceeds of a CA event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmFinancialTransaction
	 * CorporateActionDistribution.mmFinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution of the proceeds of a CA event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "Distribution of the proceeds of a CA event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmFinancialTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
		}
	};
	protected InterestManagement interestManagement;
	/**
	 * Management of interest which consists into calculating the interest,
	 * requesting its payment or distributing the interest proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmFinancialTransaction
	 * InterestManagement.mmFinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterestManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestManagement";
			definition = "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmFinancialTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmObject();
		}
	};
	protected Trade trade;
	/**
	 * Agreement between two parties to buy and sell assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmFinancialTransaction
	 * Trade.mmFinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement between two parties to buy and sell assets."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Agreement between two parties to buy and sell assets.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmFinancialTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected CollateralMovement collateralMovement;
	/**
	 * Collateral in or out as a result of collateral management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmFinancialTransaction
	 * CollateralMovement.mmFinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral in or out as a result of collateral management."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCollateralMovement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralMovement";
			definition = "Collateral in or out as a result of collateral management.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmFinancialTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
		}
	};
	protected BankingTransaction bankingTransaction;
	/**
	 * Transaction executed by the client of a financial institution from/to the
	 * account serviced by the financial institution, such as mortgage payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmFinancialTransaction
	 * BankingTransaction.mmFinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankingTransaction
	 * BankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBankingTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankingTransaction";
			definition = "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmFinancialTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.RegulatoryReport> regulatoryReport;
	/**
	 * Information related to a trade and that has to be reported to a
	 * regulatory authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmReportedTransaction
	 * RegulatoryReport.mmReportedTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmRegulatoryReporting
	 * CreditTransferTransactionInformation1.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmRegulatoryReporting
	 * CreditTransferTransactionInformation10.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmRegulatoryReporting
	 * CreditTransferTransaction1.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmRegulatoryReporting
	 * CreditTransferTransaction6.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#mmRegulatoryReporting
	 * DirectDebitTransactionInformation1.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmRegulatoryReporting
	 * DirectDebitTransactionInformation9.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#mmRegulatoryReporting
	 * DirectDebitTransactionInformation11.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#mmRegulatoryReporting
	 * DirectDebitTransactionInformation13.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmRegulatoryReporting
	 * CreditTransferTransactionInformation2.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmRegulatoryReporting
	 * CreditTransferTransactionInformation11.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmRegulatoryReporting
	 * CreditTransferTransaction2.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmRegulatoryReporting
	 * CreditTransferTransaction7.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmRegulatoryReporting
	 * DirectDebitTransactionInformation2.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmRegulatoryReporting
	 * DirectDebitTransactionInformation10.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmRegulatoryReporting
	 * DirectDebitTransactionInformation12.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmRegulatoryReporting
	 * DirectDebitTransactionInformation14.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData8#mmRegulatoryReporting
	 * TradeData8.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmRegulatoryReporting
	 * CreditTransferTransactionInformation14.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#mmRegulatoryReporting
	 * CreditTransferTransaction5.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmRegulatoryReporting
	 * CreditTransferTransaction10.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmRegulatoryReporting
	 * CreditTransferTransactionInformation7.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmRegulatoryReporting
	 * CreditTransferTransactionInformation9.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmRegulatoryReporting
	 * DirectDebitTransactionInformation6.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmRegulatoryReporting
	 * DirectDebitTransactionInformation8.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData11#mmRegulatoryReporting
	 * TradeData11.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmRegulatoryReporting
	 * CreditTransferTransaction19.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmRegulatoryReporting
	 * DirectDebitTransactionInformation17.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#mmRegulatoryReporting
	 * DirectDebitTransactionInformation18.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmRegulatoryReporting
	 * CreditTransferTransaction20.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmRegulatoryReporting
	 * CreditTransferTransaction21.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmRegulatoryReporting
	 * CreditTransferTransaction25.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmRegulatoryReporting
	 * DirectDebitTransactionInformation20.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmRegulatoryReporting
	 * CreditTransferTransaction26.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#mmRegulatoryReporting
	 * DirectDebitTransactionInformation19.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmRegulatoryReporting
	 * CreditTransferTransaction22.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmRegulatoryReporting
	 * DirectDebitTransactionInformation21.mmRegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmRegulatoryReporting
	 * DirectDebitTransactionInformation22.mmRegulatoryReporting}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to a trade and that has to be reported to a regulatory authority."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRegulatoryReport = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransactionInformation1.mmRegulatoryReporting, com.tools20022.repository.msg.CreditTransferTransactionInformation10.mmRegulatoryReporting,
					com.tools20022.repository.msg.CreditTransferTransaction1.mmRegulatoryReporting, com.tools20022.repository.msg.CreditTransferTransaction6.mmRegulatoryReporting,
					com.tools20022.repository.msg.DirectDebitTransactionInformation1.mmRegulatoryReporting, com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmRegulatoryReporting,
					com.tools20022.repository.msg.DirectDebitTransactionInformation11.mmRegulatoryReporting, com.tools20022.repository.msg.DirectDebitTransactionInformation13.mmRegulatoryReporting,
					com.tools20022.repository.msg.CreditTransferTransactionInformation2.mmRegulatoryReporting, com.tools20022.repository.msg.CreditTransferTransactionInformation11.mmRegulatoryReporting,
					com.tools20022.repository.msg.CreditTransferTransaction2.mmRegulatoryReporting, com.tools20022.repository.msg.CreditTransferTransaction7.mmRegulatoryReporting,
					com.tools20022.repository.msg.DirectDebitTransactionInformation2.mmRegulatoryReporting, com.tools20022.repository.msg.DirectDebitTransactionInformation10.mmRegulatoryReporting,
					com.tools20022.repository.msg.DirectDebitTransactionInformation12.mmRegulatoryReporting, com.tools20022.repository.msg.DirectDebitTransactionInformation14.mmRegulatoryReporting,
					com.tools20022.repository.msg.TradeData8.mmRegulatoryReporting, com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmRegulatoryReporting,
					com.tools20022.repository.msg.CreditTransferTransaction5.mmRegulatoryReporting, com.tools20022.repository.msg.CreditTransferTransaction10.mmRegulatoryReporting,
					com.tools20022.repository.msg.CreditTransferTransactionInformation7.mmRegulatoryReporting, com.tools20022.repository.msg.CreditTransferTransactionInformation9.mmRegulatoryReporting,
					com.tools20022.repository.msg.DirectDebitTransactionInformation6.mmRegulatoryReporting, com.tools20022.repository.msg.DirectDebitTransactionInformation8.mmRegulatoryReporting,
					com.tools20022.repository.msg.TradeData11.mmRegulatoryReporting, com.tools20022.repository.msg.CreditTransferTransaction19.mmRegulatoryReporting,
					com.tools20022.repository.msg.DirectDebitTransactionInformation17.mmRegulatoryReporting, com.tools20022.repository.msg.DirectDebitTransactionInformation18.mmRegulatoryReporting,
					com.tools20022.repository.msg.CreditTransferTransaction20.mmRegulatoryReporting, com.tools20022.repository.msg.CreditTransferTransaction21.mmRegulatoryReporting,
					com.tools20022.repository.msg.CreditTransferTransaction25.mmRegulatoryReporting, com.tools20022.repository.msg.DirectDebitTransactionInformation20.mmRegulatoryReporting,
					com.tools20022.repository.msg.CreditTransferTransaction26.mmRegulatoryReporting, com.tools20022.repository.msg.DirectDebitTransactionInformation19.mmRegulatoryReporting,
					com.tools20022.repository.msg.CreditTransferTransaction22.mmRegulatoryReporting, com.tools20022.repository.msg.DirectDebitTransactionInformation21.mmRegulatoryReporting,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.mmRegulatoryReporting);
			elementContext_lazy = () -> FinancialTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegulatoryReport";
			definition = "Information related to a trade and that has to be reported to a regulatory authority.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmReportedTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancialTransaction";
				definition = "Process which includes the order, the execution, the settlement of trades in the financial domain.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmFinancialTransaction, com.tools20022.repository.entity.CorporateActionDistribution.mmFinancialTransaction,
						com.tools20022.repository.entity.RegulatoryReport.mmReportedTransaction, com.tools20022.repository.entity.CollateralMovement.mmFinancialTransaction,
						com.tools20022.repository.entity.BankingTransaction.mmFinancialTransaction, com.tools20022.repository.entity.InterestManagement.mmFinancialTransaction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FinancialTransaction.mmCorporateActionDistribution, com.tools20022.repository.entity.FinancialTransaction.mmInterestManagement,
						com.tools20022.repository.entity.FinancialTransaction.mmTrade, com.tools20022.repository.entity.FinancialTransaction.mmCollateralMovement, com.tools20022.repository.entity.FinancialTransaction.mmBankingTransaction,
						com.tools20022.repository.entity.FinancialTransaction.mmRegulatoryReport);
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionDistribution getCorporateActionDistribution() {
		return corporateActionDistribution;
	}

	public void setCorporateActionDistribution(com.tools20022.repository.entity.CorporateActionDistribution corporateActionDistribution) {
		this.corporateActionDistribution = corporateActionDistribution;
	}

	public InterestManagement getInterestManagement() {
		return interestManagement;
	}

	public void setInterestManagement(com.tools20022.repository.entity.InterestManagement interestManagement) {
		this.interestManagement = interestManagement;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.entity.Trade trade) {
		this.trade = trade;
	}

	public CollateralMovement getCollateralMovement() {
		return collateralMovement;
	}

	public void setCollateralMovement(com.tools20022.repository.entity.CollateralMovement collateralMovement) {
		this.collateralMovement = collateralMovement;
	}

	public BankingTransaction getBankingTransaction() {
		return bankingTransaction;
	}

	public void setBankingTransaction(com.tools20022.repository.entity.BankingTransaction bankingTransaction) {
		this.bankingTransaction = bankingTransaction;
	}

	public List<RegulatoryReport> getRegulatoryReport() {
		return regulatoryReport;
	}

	public void setRegulatoryReport(List<com.tools20022.repository.entity.RegulatoryReport> regulatoryReport) {
		this.regulatoryReport = regulatoryReport;
	}
}
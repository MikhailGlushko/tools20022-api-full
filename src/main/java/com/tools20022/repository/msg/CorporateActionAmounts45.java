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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies amounts in the framework of a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmPostingAmount
 * CorporateActionAmounts45.mmPostingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmGrossCashAmount
 * CorporateActionAmounts45.mmGrossCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmNetCashAmount
 * CorporateActionAmounts45.mmNetCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmSolicitationFees
 * CorporateActionAmounts45.mmSolicitationFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmCashInLieuOfShare
 * CorporateActionAmounts45.mmCashInLieuOfShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmCapitalGain
 * CorporateActionAmounts45.mmCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmInterestAmount
 * CorporateActionAmounts45.mmInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmMarketClaimAmount
 * CorporateActionAmounts45.mmMarketClaimAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmIndemnityAmount
 * CorporateActionAmounts45.mmIndemnityAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmManufacturedDividendPaymentAmount
 * CorporateActionAmounts45.mmManufacturedDividendPaymentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmReinvestmentAmount
 * CorporateActionAmounts45.mmReinvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmFullyFrankedAmount
 * CorporateActionAmounts45.mmFullyFrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmUnfrankedAmount
 * CorporateActionAmounts45.mmUnfrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmSundryOrOtherAmount
 * CorporateActionAmounts45.mmSundryOrOtherAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmTaxFreeAmount
 * CorporateActionAmounts45.mmTaxFreeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmTaxDeferredAmount
 * CorporateActionAmounts45.mmTaxDeferredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmValueAddedTaxAmount
 * CorporateActionAmounts45.mmValueAddedTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmStampDutyAmount
 * CorporateActionAmounts45.mmStampDutyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmTaxReclaimAmount
 * CorporateActionAmounts45.mmTaxReclaimAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmTaxCreditAmount
 * CorporateActionAmounts45.mmTaxCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmAdditionalTaxAmount
 * CorporateActionAmounts45.mmAdditionalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmWithholdingTaxAmount
 * CorporateActionAmounts45.mmWithholdingTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmSecondLevelTaxAmount
 * CorporateActionAmounts45.mmSecondLevelTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmFiscalStampAmount
 * CorporateActionAmounts45.mmFiscalStampAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmExecutingBrokerAmount
 * CorporateActionAmounts45.mmExecutingBrokerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmPayingAgentCommissionAmount
 * CorporateActionAmounts45.mmPayingAgentCommissionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmLocalBrokerCommissionAmount
 * CorporateActionAmounts45.mmLocalBrokerCommissionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmRegulatoryFeesAmount
 * CorporateActionAmounts45.mmRegulatoryFeesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmShippingFeesAmount
 * CorporateActionAmounts45.mmShippingFeesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmChargesAmount
 * CorporateActionAmounts45.mmChargesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmCashAmountBroughtForward
 * CorporateActionAmounts45.mmCashAmountBroughtForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmCashAmountCarriedForward
 * CorporateActionAmounts45.mmCashAmountCarriedForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmNotionalDividendPayableAmount
 * CorporateActionAmounts45.mmNotionalDividendPayableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmNotionalTaxAmount
 * CorporateActionAmounts45.mmNotionalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmTaxArrearsAmount
 * CorporateActionAmounts45.mmTaxArrearsAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmOriginalAmount
 * CorporateActionAmounts45.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmPrincipalOrCorpus
 * CorporateActionAmounts45.mmPrincipalOrCorpus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmRedemptionPremiumAmount
 * CorporateActionAmounts45.mmRedemptionPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmIncomePortion
 * CorporateActionAmounts45.mmIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmStockExchangeTax
 * CorporateActionAmounts45.mmStockExchangeTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmEUTaxRetentionAmount
 * CorporateActionAmounts45.mmEUTaxRetentionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmAccruedInterestAmount
 * CorporateActionAmounts45.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmEqualisationAmount
 * CorporateActionAmounts45.mmEqualisationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmFATCATaxAmount
 * CorporateActionAmounts45.mmFATCATaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmNRATaxAmount
 * CorporateActionAmounts45.mmNRATaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmBackUpWithholdingTaxAmount
 * CorporateActionAmounts45.mmBackUpWithholdingTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmTaxOnIncomeAmount
 * CorporateActionAmounts45.mmTaxOnIncomeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmTransactionTax
 * CorporateActionAmounts45.mmTransactionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmDeemedAmount
 * CorporateActionAmounts45.mmDeemedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmConduitForeignIncomeAmount
 * CorporateActionAmounts45.mmConduitForeignIncomeAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionAmounts45"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies amounts in the framework of a corporate action event."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionAmounts45", propOrder = {"postingAmount", "grossCashAmount", "netCashAmount", "solicitationFees", "cashInLieuOfShare", "capitalGain", "interestAmount", "marketClaimAmount", "indemnityAmount",
		"manufacturedDividendPaymentAmount", "reinvestmentAmount", "fullyFrankedAmount", "unfrankedAmount", "sundryOrOtherAmount", "taxFreeAmount", "taxDeferredAmount", "valueAddedTaxAmount", "stampDutyAmount", "taxReclaimAmount",
		"taxCreditAmount", "additionalTaxAmount", "withholdingTaxAmount", "secondLevelTaxAmount", "fiscalStampAmount", "executingBrokerAmount", "payingAgentCommissionAmount", "localBrokerCommissionAmount", "regulatoryFeesAmount",
		"shippingFeesAmount", "chargesAmount", "cashAmountBroughtForward", "cashAmountCarriedForward", "notionalDividendPayableAmount", "notionalTaxAmount", "taxArrearsAmount", "originalAmount", "principalOrCorpus",
		"redemptionPremiumAmount", "incomePortion", "stockExchangeTax", "eUTaxRetentionAmount", "accruedInterestAmount", "equalisationAmount", "fATCATaxAmount", "nRATaxAmount", "backUpWithholdingTaxAmount", "taxOnIncomeAmount",
		"transactionTax", "deemedAmount", "conduitForeignIncomeAmount"})
public class CorporateActionAmounts45 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PstngAmt", required = true)
	protected RestrictedFINActiveCurrencyAndAmount postingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingAmount
	 * CorporateActionDistribution.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money that is to be/was posted to the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::PSTA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, RestrictedFINActiveCurrencyAndAmount> mmPostingAmount = new MMMessageAttribute<CorporateActionAmounts45, RestrictedFINActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmPostingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "PstngAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::PSTA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingAmount";
			definition = "Amount of money that is to be/was posted to the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public RestrictedFINActiveCurrencyAndAmount getValue(CorporateActionAmounts45 obj) {
			return obj.getPostingAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, RestrictedFINActiveCurrencyAndAmount value) {
			obj.setPostingAmount(value);
		}
	};
	@XmlElement(name = "GrssCshAmt")
	protected RestrictedFINActiveCurrencyAndAmount grossCashAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmGrossCashAmount
	 * CorporateActionCashEntitlement.mmGrossCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssCshAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money before any deductions and allowances have been made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::GRSS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmGrossCashAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmGrossCashAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "GrssCshAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::GRSS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossCashAmount";
			definition = "Amount of money before any deductions and allowances have been made.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getGrossCashAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setGrossCashAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "NetCshAmt")
	protected RestrictedFINActiveCurrencyAndAmount netCashAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmNetCashAmount
	 * CorporateActionCashEntitlement.mmNetCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetCshAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money after deductions and allowances have been made, if any, that is, the total amount +/- charges/fees."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::NETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmNetCashAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmNetCashAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "NetCshAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::NETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashAmount";
			definition = "Amount of money after deductions and allowances have been made, if any, that is, the total amount +/- charges/fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getNetCashAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setNetCashAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctnFees")
	protected RestrictedFINActiveCurrencyAndAmount solicitationFees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
	 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnFees"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash premium made available if the securities holder consents or participates to an event, for example consent fees or solicitation fees."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::SOFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmSolicitationFees = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmSolicitationFee;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "SlctnFees";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::SOFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFees";
			definition = "Cash premium made available if the securities holder consents or participates to an event, for example consent fees or solicitation fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getSolicitationFees();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setSolicitationFees(value.orElse(null));
		}
	};
	@XmlElement(name = "CshInLieuOfShr")
	protected RestrictedFINActiveCurrencyAndAmount cashInLieuOfShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmCashInLieuOfShare
	 * CorporateActionCashEntitlement.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieuOfShr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of a fractional quantity of, for example, equity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::CINL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmCashInLieuOfShare = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmCashInLieuOfShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::CINL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfShare";
			definition = "Cash disbursement in lieu of a fractional quantity of, for example, equity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getCashInLieuOfShare();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setCashInLieuOfShare(value.orElse(null));
		}
	};
	@XmlElement(name = "CptlGn")
	protected RestrictedFINActiveCurrencyAndAmount capitalGain;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmCapitalGain
	 * CorporateActionCashEntitlement.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CptlGn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money distributed as the result of a capital gain."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::CAPG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmCapitalGain = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmCapitalGain;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "CptlGn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::CAPG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGain";
			definition = "Amount of money distributed as the result of a capital gain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getCapitalGain();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setCapitalGain(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstAmt")
	protected RestrictedFINActiveCurrencyAndAmount interestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money representing a coupon payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::INTR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmInterestAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "IntrstAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::INTR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAmount";
			definition = "Amount of money representing a coupon payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getInterestAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setInterestAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "MktClmAmt")
	protected RestrictedFINActiveCurrencyAndAmount marketClaimAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarketClaim#mmMarketClaimAmount
	 * MarketClaim.mmMarketClaimAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktClmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaimAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money resulting from a market claim."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::MKTC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmMarketClaimAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> MarketClaim.mmMarketClaimAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "MktClmAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::MKTC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaimAmount";
			definition = "Amount of money resulting from a market claim.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getMarketClaimAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setMarketClaimAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "IndmntyAmt")
	protected RestrictedFINActiveCurrencyAndAmount indemnityAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIndemnityAmount
	 * CashProceedsDefinition.mmIndemnityAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndmntyAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndemnityAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::INDM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmIndemnityAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIndemnityAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "IndmntyAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::INDM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndemnityAmount";
			definition = "(Unique to France) Amount due to a buyer of securities dealt prior to ex date which may be subject to different rate of taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getIndemnityAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setIndemnityAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ManfctrdDvddPmtAmt")
	protected RestrictedFINActiveCurrencyAndAmount manufacturedDividendPaymentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmManufacturedDividendAmount
	 * Dividend.mmManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ManfctrdDvddPmtAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManufacturedDividendPaymentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender. Also covers compensation/indemnity of missed dividend concerning early/late settlements if applicable to a market."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmManufacturedDividendPaymentAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmManufacturedDividendAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "ManfctrdDvddPmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManufacturedDividendPaymentAmount";
			definition = "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender. Also covers compensation/indemnity of missed dividend concerning early/late settlements if applicable to a market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getManufacturedDividendPaymentAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setManufacturedDividendPaymentAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RinvstmtAmt")
	protected RestrictedFINActiveCurrencyAndAmount reinvestmentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmReinvestmentAmount
	 * SecuritiesProceedsDefinition.mmReinvestmentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money reinvested in additional securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::REIN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmReinvestmentAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmReinvestmentAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::REIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentAmount";
			definition = "Amount of money reinvested in additional securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getReinvestmentAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setReinvestmentAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FullyFrnkdAmt")
	protected RestrictedFINActiveCurrencyAndAmount fullyFrankedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmAmount
	 * RateAndAmount.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullyFrnkdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFrankedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::FLFR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmFullyFrankedAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> RateAndAmount.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "FullyFrnkdAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::FLFR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFrankedAmount";
			definition = "Amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getFullyFrankedAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setFullyFrankedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "UfrnkdAmt")
	protected RestrictedFINActiveCurrencyAndAmount unfrankedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmUnfrankedAmount
	 * Dividend.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UfrnkdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfrankedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::UNFR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmUnfrankedAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmUnfrankedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "UfrnkdAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::UNFR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfrankedAmount";
			definition = "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getUnfrankedAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setUnfrankedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "SndryOrOthrAmt")
	protected RestrictedFINActiveCurrencyAndAmount sundryOrOtherAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmSundryOrOtherAmount
	 * TaxVoucher.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndryOrOthrAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money related to taxable income that cannot be categorised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::SOIC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmSundryOrOtherAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmSundryOrOtherAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "SndryOrOthrAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::SOIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SundryOrOtherAmount";
			definition = "Amount of money related to taxable income that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getSundryOrOtherAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setSundryOrOtherAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxFreeAmt")
	protected RestrictedFINActiveCurrencyAndAmount taxFreeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxFreeAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxFreeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money that has not been subject to taxation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::TXFR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmTaxFreeAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "TaxFreeAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::TXFR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxFreeAmount";
			definition = "Amount of money that has not been subject to taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getTaxFreeAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setTaxFreeAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxDfrrdAmt")
	protected RestrictedFINActiveCurrencyAndAmount taxDeferredAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDfrrdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeferredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of income eligible for deferred taxation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::TXDF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmTaxDeferredAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "TaxDfrrdAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::TXDF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeferredAmount";
			definition = "Amount of income eligible for deferred taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getTaxDeferredAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setTaxDeferredAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ValAddedTaxAmt")
	protected RestrictedFINActiveCurrencyAndAmount valueAddedTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValAddedTaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax on value added."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::VATA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmValueAddedTaxAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTaxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::VATA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTaxAmount";
			definition = "Tax on value added.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getValueAddedTaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setValueAddedTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "StmpDtyAmt")
	protected RestrictedFINActiveCurrencyAndAmount stampDutyAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDtyAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of stamp duty."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::STAM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmStampDutyAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::STAM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyAmount";
			definition = "Amount of stamp duty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getStampDutyAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setStampDutyAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxRclmAmt")
	protected RestrictedFINActiveCurrencyAndAmount taxReclaimAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRclmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaimAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount that was paid in excess of actual tax obligation and was reclaimed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::TXRC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmTaxReclaimAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "TaxRclmAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::TXRC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaimAmount";
			definition = "Amount that was paid in excess of actual tax obligation and was reclaimed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getTaxReclaimAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setTaxReclaimAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxCdtAmt")
	protected RestrictedFINActiveCurrencyAndAmount taxCreditAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditAmount
	 * TaxVoucher.mmCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCdtAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of taxes that have been previously paid in relation to the taxable event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::TAXC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmTaxCreditAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCreditAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::TAXC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditAmount";
			definition = "Amount of taxes that have been previously paid in relation to the taxable event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getTaxCreditAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setTaxCreditAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlTaxAmt")
	protected RestrictedFINActiveCurrencyAndAmount additionalTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of additional taxes that cannot be categorised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::ATAX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmAdditionalTaxAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "AddtlTaxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::ATAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTaxAmount";
			definition = "Amount of additional taxes that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getAdditionalTaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setAdditionalTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "WhldgTaxAmt")
	protected RestrictedFINActiveCurrencyAndAmount withholdingTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of a cash distribution that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::TAXR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmWithholdingTaxAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::TAXR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxAmount";
			definition = "Amount of a cash distribution that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getWithholdingTaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setWithholdingTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndLvlTaxAmt")
	protected RestrictedFINActiveCurrencyAndAmount secondLevelTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndLvlTaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money withheld by the jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible. It is levied in complement or offset of the withholding tax rate levied by the jurisdiction of the issuer’s tax domicile."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmSecondLevelTaxAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "ScndLvlTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTaxAmount";
			definition = "Amount of money withheld by the jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible. It is levied in complement or offset of the withholding tax rate levied by the jurisdiction of the issuer’s tax domicile.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getSecondLevelTaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setSecondLevelTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FsclStmpAmt")
	protected RestrictedFINActiveCurrencyAndAmount fiscalStampAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FsclStmpAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalStampAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of fiscal tax to apply."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::FISC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmFiscalStampAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "FsclStmpAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::FISC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStampAmount";
			definition = "Amount of fiscal tax to apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getFiscalStampAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setFiscalStampAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctgBrkrAmt")
	protected RestrictedFINActiveCurrencyAndAmount executingBrokerAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctgBrkrAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingBrokerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid to an executing broker as a commission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::EXEC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmExecutingBrokerAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "ExctgBrkrAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::EXEC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBrokerAmount";
			definition = "Amount of money paid to an executing broker as a commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getExecutingBrokerAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setExecutingBrokerAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PngAgtComssnAmt")
	protected RestrictedFINActiveCurrencyAndAmount payingAgentCommissionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PngAgtComssnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgentCommissionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of paying/sub-paying agent commission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::PAMM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmPayingAgentCommissionAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "PngAgtComssnAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::PAMM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgentCommissionAmount";
			definition = "Amount of paying/sub-paying agent commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getPayingAgentCommissionAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setPayingAgentCommissionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "LclBrkrComssnAmt")
	protected RestrictedFINActiveCurrencyAndAmount localBrokerCommissionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclBrkrComssnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalBrokerCommissionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Local broker's commission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::LOCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmLocalBrokerCommissionAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "LclBrkrComssnAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::LOCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalBrokerCommissionAmount";
			definition = "Local broker's commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getLocalBrokerCommissionAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setLocalBrokerCommissionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RgltryFeesAmt")
	protected RestrictedFINActiveCurrencyAndAmount regulatoryFeesAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmRegulatoryFeesAmount
	 * SecuritiesRelatedFees.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryFeesAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryFeesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::REGF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmRegulatoryFeesAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmRegulatoryFeesAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "RgltryFeesAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::REGF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryFeesAmount";
			definition = "Amount of money charged by a regulatory authority, for example, Securities and Exchange fees.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getRegulatoryFeesAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setRegulatoryFeesAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ShppgFeesAmt")
	protected RestrictedFINActiveCurrencyAndAmount shippingFeesAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmShippingFeesAmount
	 * SecuritiesRelatedFees.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShppgFeesAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingFeesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All costs related to the physical delivery of documents such as stamps, postage, carrier fees, insurances or messenger services."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::SHIP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmShippingFeesAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesRelatedFees.mmShippingFeesAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "ShppgFeesAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::SHIP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingFeesAmount";
			definition = "All costs related to the physical delivery of documents such as stamps, postage, carrier fees, insurances or messenger services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getShippingFeesAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setShippingFeesAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgsAmt")
	protected RestrictedFINActiveCurrencyAndAmount chargesAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::CHAR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmChargesAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::CHAR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAmount";
			definition = "Amount of money paid for the provision of financial services that cannot be categorised by another qualifier.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getChargesAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setChargesAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAmtBrghtFwd")
	protected RestrictedFINActiveCurrencyAndAmount cashAmountBroughtForward;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountBroughtForward
	 * TaxVoucher.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAmtBrghtFwd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountBroughtForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates cash retained from previous dividend."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::CABF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmCashAmountBroughtForward = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCashAmountBroughtForward;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "CshAmtBrghtFwd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::CABF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmountBroughtForward";
			definition = "Indicates cash retained from previous dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getCashAmountBroughtForward();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setCashAmountBroughtForward(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAmtCrrdFwd")
	protected RestrictedFINActiveCurrencyAndAmount cashAmountCarriedForward;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountCarriedForward
	 * TaxVoucher.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAmtCrrdFwd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountCarriedForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the balance carried forward to next dividend."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::CACF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmCashAmountCarriedForward = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCashAmountCarriedForward;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "CshAmtCrrdFwd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::CACF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmountCarriedForward";
			definition = "Indicates the balance carried forward to next dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getCashAmountCarriedForward();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setCashAmountCarriedForward(value.orElse(null));
		}
	};
	@XmlElement(name = "NtnlDvddPyblAmt")
	protected RestrictedFINActiveCurrencyAndAmount notionalDividendPayableAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNotionalDividendPayableAmount
	 * Dividend.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlDvddPyblAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalDividendPayableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::NDIP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmNotionalDividendPayableAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNotionalDividendPayableAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "NtnlDvddPyblAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::NDIP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalDividendPayableAmount";
			definition = "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getNotionalDividendPayableAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setNotionalDividendPayableAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "NtnlTaxAmt")
	protected RestrictedFINActiveCurrencyAndAmount notionalTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmNotionalTaxAmount
	 * TaxVoucher.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlTaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Where new securities are issued in lieu of a cash dividend, the notional tax is the tax on the amount of cash that would have been paid."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::NTAX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmNotionalTaxAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmNotionalTaxAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "NtnlTaxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::NTAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalTaxAmount";
			definition = "Where new securities are issued in lieu of a cash dividend, the notional tax is the tax on the amount of cash that would have been paid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getNotionalTaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setNotionalTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxArrearsAmt")
	protected RestrictedFINActiveCurrencyAndAmount taxArrearsAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxArrearsAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxArrearsAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid by the tax authorities in addition to the payment of the tax refund itself."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::ARRE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmTaxArrearsAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "TaxArrearsAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::ARRE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxArrearsAmount";
			definition = "Amount of money paid by the tax authorities in addition to the payment of the tax refund itself.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getTaxArrearsAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setTaxArrearsAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlAmt")
	protected RestrictedFINActiveCurrencyAndAmount originalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmOriginalAmount
	 * CurrencyExchange.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Posting/settlement Amount in its original currency when conversion from/into another currency has occurred."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::OCMT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmOriginalAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::OCMT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAmount";
			definition = "Posting/settlement Amount in its original currency when conversion from/into another currency has occurred.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getOriginalAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setOriginalAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PrncplOrCrps")
	protected RestrictedFINActiveCurrencyAndAmount principalOrCorpus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmPrincipalOrCorpus
	 * CashProceedsDefinition.mmPrincipalOrCorpus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrncplOrCrps"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalOrCorpus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money representing a distribution of a bond's principal, for example, repayment of outstanding debt."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B:PRIN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmPrincipalOrCorpus = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmPrincipalOrCorpus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "PrncplOrCrps";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:PRIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalOrCorpus";
			definition = "Amount of money representing a distribution of a bond's principal, for example, repayment of outstanding debt.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getPrincipalOrCorpus();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setPrincipalOrCorpus(value.orElse(null));
		}
	};
	@XmlElement(name = "RedPrmAmt")
	protected RestrictedFINActiveCurrencyAndAmount redemptionPremiumAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmRedemptionPremiumAmount
	 * CashProceedsDefinition.mmRedemptionPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedPrmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money (not interest) in addition to the principal at the redemption of a bond."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B:REDP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmRedemptionPremiumAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmRedemptionPremiumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "RedPrmAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:REDP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPremiumAmount";
			definition = "Amount of money (not interest) in addition to the principal at the redemption of a bond.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getRedemptionPremiumAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setRedemptionPremiumAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmPrtn")
	protected RestrictedFINActiveCurrencyAndAmount incomePortion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomePortion
	 * CashProceedsDefinition.mmIncomePortion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPrtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount relating to the underlying security for which income is distributed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B:INCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmIncomePortion = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIncomePortion;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "IncmPrtn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:INCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePortion";
			definition = "Amount relating to the underlying security for which income is distributed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getIncomePortion();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setIncomePortion(value.orElse(null));
		}
	};
	@XmlElement(name = "StockXchgTax")
	protected RestrictedFINActiveCurrencyAndAmount stockExchangeTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockXchgTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchangeTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of stock exchange tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::STEX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmStockExchangeTax = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "StockXchgTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::STEX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchangeTax";
			definition = "Amount of stock exchange tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getStockExchangeTax();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setStockExchangeTax(value.orElse(null));
		}
	};
	@XmlElement(name = "EUTaxRtntnAmt")
	protected RestrictedFINActiveCurrencyAndAmount eUTaxRetentionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EUTaxRtntnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUTaxRetentionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of tax withheld at source in conformance with the EU Savings Directive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B:EUTR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmEUTaxRetentionAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "EUTaxRtntnAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:EUTR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUTaxRetentionAmount";
			definition = "Total amount of tax withheld at source in conformance with the EU Savings Directive.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getEUTaxRetentionAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setEUTaxRetentionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected RestrictedFINActiveCurrencyAndAmount accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of interest that has been accrued in between coupon payment periods."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B::ACRU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmAccruedInterestAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B::ACRU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Amount of interest that has been accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setAccruedInterestAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "EqulstnAmt")
	protected RestrictedFINActiveCurrencyAndAmount equalisationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation#mmAmount
	 * Equalisation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EqulstnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualisationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the fund distribution amount which represents the average accrued income included in the purchase price for units bought during the account period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmEqualisationAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Equalisation.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "EqulstnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualisationAmount";
			definition = "Portion of the fund distribution amount which represents the average accrued income included in the purchase price for units bought during the account period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getEqualisationAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setEqualisationAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FATCATaxAmt")
	protected RestrictedFINActiveCurrencyAndAmount fATCATaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FATCATaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCATaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FATCA (Foreign Account Tax Compliance Act) related tax amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmFATCATaxAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "FATCATaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCATaxAmount";
			definition = "FATCA (Foreign Account Tax Compliance Act) related tax amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getFATCATaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setFATCATaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "NRATaxAmt")
	protected RestrictedFINActiveCurrencyAndAmount nRATaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NRATaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NRATaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of tax related income subject to NRA (Non Resident Alien)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmNRATaxAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "NRATaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NRATaxAmount";
			definition = "Amount of tax related income subject to NRA (Non Resident Alien).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getNRATaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setNRATaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "BckUpWhldgTaxAmt")
	protected RestrictedFINActiveCurrencyAndAmount backUpWithholdingTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BckUpWhldgTaxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackUpWithholdingTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of tax related to back up withholding."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmBackUpWithholdingTaxAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "BckUpWhldgTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackUpWithholdingTaxAmount";
			definition = "Amount of tax related to back up withholding.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getBackUpWithholdingTaxAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setBackUpWithholdingTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxOnIncmAmt")
	protected RestrictedFINActiveCurrencyAndAmount taxOnIncomeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxOnIncmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnIncomeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of overall tax withheld at source by fund managers prior to considering the tax obligation of each unit holder."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmTaxOnIncomeAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "TaxOnIncmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnIncomeAmount";
			definition = "Amount of overall tax withheld at source by fund managers prior to considering the tax obligation of each unit holder.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getTaxOnIncomeAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setTaxOnIncomeAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TxTax")
	protected RestrictedFINActiveCurrencyAndAmount transactionTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of transaction tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmTransactionTax = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "TxTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTax";
			definition = "Amount of transaction tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getTransactionTax();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setTransactionTax(value.orElse(null));
		}
	};
	@XmlElement(name = "DmdAmt")
	protected RestrictedFINActiveCurrencyAndAmount deemedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmDeemedAmount
	 * Dividend.mmDeemedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of proceeds which is not actually paid to the security holder but on which withholding tax is applicable."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmDeemedAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmDeemedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "DmdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedAmount";
			definition = "Amount of proceeds which is not actually paid to the security holder but on which withholding tax is applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getDeemedAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setDeemedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "CndtFrgnIncmAmt")
	protected RestrictedFINActiveCurrencyAndAmount conduitForeignIncomeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmConduitForeignIncomeAmount
	 * Dividend.mmConduitForeignIncomeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45
	 * CorporateActionAmounts45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CndtFrgnIncmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConduitForeignIncomeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount relating to a conduit foreign income."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>> mmConduitForeignIncomeAmount = new MMMessageAttribute<CorporateActionAmounts45, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmConduitForeignIncomeAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionAmounts45.mmObject();
			isDerived = false;
			xmlTag = "CndtFrgnIncmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConduitForeignIncomeAmount";
			definition = "Amount relating to a conduit foreign income.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionAmounts45 obj) {
			return obj.getConduitForeignIncomeAmount();
		}

		@Override
		public void setValue(CorporateActionAmounts45 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setConduitForeignIncomeAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts45.mmPostingAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmGrossCashAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmNetCashAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmSolicitationFees,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmCashInLieuOfShare, com.tools20022.repository.msg.CorporateActionAmounts45.mmCapitalGain,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmInterestAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmMarketClaimAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmIndemnityAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmManufacturedDividendPaymentAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmReinvestmentAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmFullyFrankedAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmUnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmSundryOrOtherAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmTaxFreeAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmTaxDeferredAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmValueAddedTaxAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmStampDutyAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmTaxReclaimAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmTaxCreditAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmAdditionalTaxAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmWithholdingTaxAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmSecondLevelTaxAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmFiscalStampAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmExecutingBrokerAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmPayingAgentCommissionAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmLocalBrokerCommissionAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmRegulatoryFeesAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmChargesAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmCashAmountBroughtForward, com.tools20022.repository.msg.CorporateActionAmounts45.mmCashAmountCarriedForward,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmNotionalDividendPayableAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmNotionalTaxAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmTaxArrearsAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmOriginalAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmPrincipalOrCorpus, com.tools20022.repository.msg.CorporateActionAmounts45.mmRedemptionPremiumAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmIncomePortion, com.tools20022.repository.msg.CorporateActionAmounts45.mmStockExchangeTax,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmEUTaxRetentionAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmAccruedInterestAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmEqualisationAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmFATCATaxAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmNRATaxAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmBackUpWithholdingTaxAmount,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmTaxOnIncomeAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmTransactionTax,
						com.tools20022.repository.msg.CorporateActionAmounts45.mmDeemedAmount, com.tools20022.repository.msg.CorporateActionAmounts45.mmConduitForeignIncomeAmount);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionAmounts45";
				definition = "Specifies amounts in the framework of a corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINActiveCurrencyAndAmount getPostingAmount() {
		return postingAmount;
	}

	public CorporateActionAmounts45 setPostingAmount(RestrictedFINActiveCurrencyAndAmount postingAmount) {
		this.postingAmount = Objects.requireNonNull(postingAmount);
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getGrossCashAmount() {
		return grossCashAmount == null ? Optional.empty() : Optional.of(grossCashAmount);
	}

	public CorporateActionAmounts45 setGrossCashAmount(RestrictedFINActiveCurrencyAndAmount grossCashAmount) {
		this.grossCashAmount = grossCashAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getNetCashAmount() {
		return netCashAmount == null ? Optional.empty() : Optional.of(netCashAmount);
	}

	public CorporateActionAmounts45 setNetCashAmount(RestrictedFINActiveCurrencyAndAmount netCashAmount) {
		this.netCashAmount = netCashAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getSolicitationFees() {
		return solicitationFees == null ? Optional.empty() : Optional.of(solicitationFees);
	}

	public CorporateActionAmounts45 setSolicitationFees(RestrictedFINActiveCurrencyAndAmount solicitationFees) {
		this.solicitationFees = solicitationFees;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getCashInLieuOfShare() {
		return cashInLieuOfShare == null ? Optional.empty() : Optional.of(cashInLieuOfShare);
	}

	public CorporateActionAmounts45 setCashInLieuOfShare(RestrictedFINActiveCurrencyAndAmount cashInLieuOfShare) {
		this.cashInLieuOfShare = cashInLieuOfShare;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getCapitalGain() {
		return capitalGain == null ? Optional.empty() : Optional.of(capitalGain);
	}

	public CorporateActionAmounts45 setCapitalGain(RestrictedFINActiveCurrencyAndAmount capitalGain) {
		this.capitalGain = capitalGain;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getInterestAmount() {
		return interestAmount == null ? Optional.empty() : Optional.of(interestAmount);
	}

	public CorporateActionAmounts45 setInterestAmount(RestrictedFINActiveCurrencyAndAmount interestAmount) {
		this.interestAmount = interestAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getMarketClaimAmount() {
		return marketClaimAmount == null ? Optional.empty() : Optional.of(marketClaimAmount);
	}

	public CorporateActionAmounts45 setMarketClaimAmount(RestrictedFINActiveCurrencyAndAmount marketClaimAmount) {
		this.marketClaimAmount = marketClaimAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getIndemnityAmount() {
		return indemnityAmount == null ? Optional.empty() : Optional.of(indemnityAmount);
	}

	public CorporateActionAmounts45 setIndemnityAmount(RestrictedFINActiveCurrencyAndAmount indemnityAmount) {
		this.indemnityAmount = indemnityAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getManufacturedDividendPaymentAmount() {
		return manufacturedDividendPaymentAmount == null ? Optional.empty() : Optional.of(manufacturedDividendPaymentAmount);
	}

	public CorporateActionAmounts45 setManufacturedDividendPaymentAmount(RestrictedFINActiveCurrencyAndAmount manufacturedDividendPaymentAmount) {
		this.manufacturedDividendPaymentAmount = manufacturedDividendPaymentAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getReinvestmentAmount() {
		return reinvestmentAmount == null ? Optional.empty() : Optional.of(reinvestmentAmount);
	}

	public CorporateActionAmounts45 setReinvestmentAmount(RestrictedFINActiveCurrencyAndAmount reinvestmentAmount) {
		this.reinvestmentAmount = reinvestmentAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getFullyFrankedAmount() {
		return fullyFrankedAmount == null ? Optional.empty() : Optional.of(fullyFrankedAmount);
	}

	public CorporateActionAmounts45 setFullyFrankedAmount(RestrictedFINActiveCurrencyAndAmount fullyFrankedAmount) {
		this.fullyFrankedAmount = fullyFrankedAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getUnfrankedAmount() {
		return unfrankedAmount == null ? Optional.empty() : Optional.of(unfrankedAmount);
	}

	public CorporateActionAmounts45 setUnfrankedAmount(RestrictedFINActiveCurrencyAndAmount unfrankedAmount) {
		this.unfrankedAmount = unfrankedAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getSundryOrOtherAmount() {
		return sundryOrOtherAmount == null ? Optional.empty() : Optional.of(sundryOrOtherAmount);
	}

	public CorporateActionAmounts45 setSundryOrOtherAmount(RestrictedFINActiveCurrencyAndAmount sundryOrOtherAmount) {
		this.sundryOrOtherAmount = sundryOrOtherAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getTaxFreeAmount() {
		return taxFreeAmount == null ? Optional.empty() : Optional.of(taxFreeAmount);
	}

	public CorporateActionAmounts45 setTaxFreeAmount(RestrictedFINActiveCurrencyAndAmount taxFreeAmount) {
		this.taxFreeAmount = taxFreeAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getTaxDeferredAmount() {
		return taxDeferredAmount == null ? Optional.empty() : Optional.of(taxDeferredAmount);
	}

	public CorporateActionAmounts45 setTaxDeferredAmount(RestrictedFINActiveCurrencyAndAmount taxDeferredAmount) {
		this.taxDeferredAmount = taxDeferredAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getValueAddedTaxAmount() {
		return valueAddedTaxAmount == null ? Optional.empty() : Optional.of(valueAddedTaxAmount);
	}

	public CorporateActionAmounts45 setValueAddedTaxAmount(RestrictedFINActiveCurrencyAndAmount valueAddedTaxAmount) {
		this.valueAddedTaxAmount = valueAddedTaxAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getStampDutyAmount() {
		return stampDutyAmount == null ? Optional.empty() : Optional.of(stampDutyAmount);
	}

	public CorporateActionAmounts45 setStampDutyAmount(RestrictedFINActiveCurrencyAndAmount stampDutyAmount) {
		this.stampDutyAmount = stampDutyAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getTaxReclaimAmount() {
		return taxReclaimAmount == null ? Optional.empty() : Optional.of(taxReclaimAmount);
	}

	public CorporateActionAmounts45 setTaxReclaimAmount(RestrictedFINActiveCurrencyAndAmount taxReclaimAmount) {
		this.taxReclaimAmount = taxReclaimAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getTaxCreditAmount() {
		return taxCreditAmount == null ? Optional.empty() : Optional.of(taxCreditAmount);
	}

	public CorporateActionAmounts45 setTaxCreditAmount(RestrictedFINActiveCurrencyAndAmount taxCreditAmount) {
		this.taxCreditAmount = taxCreditAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getAdditionalTaxAmount() {
		return additionalTaxAmount == null ? Optional.empty() : Optional.of(additionalTaxAmount);
	}

	public CorporateActionAmounts45 setAdditionalTaxAmount(RestrictedFINActiveCurrencyAndAmount additionalTaxAmount) {
		this.additionalTaxAmount = additionalTaxAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getWithholdingTaxAmount() {
		return withholdingTaxAmount == null ? Optional.empty() : Optional.of(withholdingTaxAmount);
	}

	public CorporateActionAmounts45 setWithholdingTaxAmount(RestrictedFINActiveCurrencyAndAmount withholdingTaxAmount) {
		this.withholdingTaxAmount = withholdingTaxAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getSecondLevelTaxAmount() {
		return secondLevelTaxAmount == null ? Optional.empty() : Optional.of(secondLevelTaxAmount);
	}

	public CorporateActionAmounts45 setSecondLevelTaxAmount(RestrictedFINActiveCurrencyAndAmount secondLevelTaxAmount) {
		this.secondLevelTaxAmount = secondLevelTaxAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getFiscalStampAmount() {
		return fiscalStampAmount == null ? Optional.empty() : Optional.of(fiscalStampAmount);
	}

	public CorporateActionAmounts45 setFiscalStampAmount(RestrictedFINActiveCurrencyAndAmount fiscalStampAmount) {
		this.fiscalStampAmount = fiscalStampAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getExecutingBrokerAmount() {
		return executingBrokerAmount == null ? Optional.empty() : Optional.of(executingBrokerAmount);
	}

	public CorporateActionAmounts45 setExecutingBrokerAmount(RestrictedFINActiveCurrencyAndAmount executingBrokerAmount) {
		this.executingBrokerAmount = executingBrokerAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getPayingAgentCommissionAmount() {
		return payingAgentCommissionAmount == null ? Optional.empty() : Optional.of(payingAgentCommissionAmount);
	}

	public CorporateActionAmounts45 setPayingAgentCommissionAmount(RestrictedFINActiveCurrencyAndAmount payingAgentCommissionAmount) {
		this.payingAgentCommissionAmount = payingAgentCommissionAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getLocalBrokerCommissionAmount() {
		return localBrokerCommissionAmount == null ? Optional.empty() : Optional.of(localBrokerCommissionAmount);
	}

	public CorporateActionAmounts45 setLocalBrokerCommissionAmount(RestrictedFINActiveCurrencyAndAmount localBrokerCommissionAmount) {
		this.localBrokerCommissionAmount = localBrokerCommissionAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getRegulatoryFeesAmount() {
		return regulatoryFeesAmount == null ? Optional.empty() : Optional.of(regulatoryFeesAmount);
	}

	public CorporateActionAmounts45 setRegulatoryFeesAmount(RestrictedFINActiveCurrencyAndAmount regulatoryFeesAmount) {
		this.regulatoryFeesAmount = regulatoryFeesAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getShippingFeesAmount() {
		return shippingFeesAmount == null ? Optional.empty() : Optional.of(shippingFeesAmount);
	}

	public CorporateActionAmounts45 setShippingFeesAmount(RestrictedFINActiveCurrencyAndAmount shippingFeesAmount) {
		this.shippingFeesAmount = shippingFeesAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getChargesAmount() {
		return chargesAmount == null ? Optional.empty() : Optional.of(chargesAmount);
	}

	public CorporateActionAmounts45 setChargesAmount(RestrictedFINActiveCurrencyAndAmount chargesAmount) {
		this.chargesAmount = chargesAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getCashAmountBroughtForward() {
		return cashAmountBroughtForward == null ? Optional.empty() : Optional.of(cashAmountBroughtForward);
	}

	public CorporateActionAmounts45 setCashAmountBroughtForward(RestrictedFINActiveCurrencyAndAmount cashAmountBroughtForward) {
		this.cashAmountBroughtForward = cashAmountBroughtForward;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getCashAmountCarriedForward() {
		return cashAmountCarriedForward == null ? Optional.empty() : Optional.of(cashAmountCarriedForward);
	}

	public CorporateActionAmounts45 setCashAmountCarriedForward(RestrictedFINActiveCurrencyAndAmount cashAmountCarriedForward) {
		this.cashAmountCarriedForward = cashAmountCarriedForward;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getNotionalDividendPayableAmount() {
		return notionalDividendPayableAmount == null ? Optional.empty() : Optional.of(notionalDividendPayableAmount);
	}

	public CorporateActionAmounts45 setNotionalDividendPayableAmount(RestrictedFINActiveCurrencyAndAmount notionalDividendPayableAmount) {
		this.notionalDividendPayableAmount = notionalDividendPayableAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getNotionalTaxAmount() {
		return notionalTaxAmount == null ? Optional.empty() : Optional.of(notionalTaxAmount);
	}

	public CorporateActionAmounts45 setNotionalTaxAmount(RestrictedFINActiveCurrencyAndAmount notionalTaxAmount) {
		this.notionalTaxAmount = notionalTaxAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getTaxArrearsAmount() {
		return taxArrearsAmount == null ? Optional.empty() : Optional.of(taxArrearsAmount);
	}

	public CorporateActionAmounts45 setTaxArrearsAmount(RestrictedFINActiveCurrencyAndAmount taxArrearsAmount) {
		this.taxArrearsAmount = taxArrearsAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getOriginalAmount() {
		return originalAmount == null ? Optional.empty() : Optional.of(originalAmount);
	}

	public CorporateActionAmounts45 setOriginalAmount(RestrictedFINActiveCurrencyAndAmount originalAmount) {
		this.originalAmount = originalAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getPrincipalOrCorpus() {
		return principalOrCorpus == null ? Optional.empty() : Optional.of(principalOrCorpus);
	}

	public CorporateActionAmounts45 setPrincipalOrCorpus(RestrictedFINActiveCurrencyAndAmount principalOrCorpus) {
		this.principalOrCorpus = principalOrCorpus;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getRedemptionPremiumAmount() {
		return redemptionPremiumAmount == null ? Optional.empty() : Optional.of(redemptionPremiumAmount);
	}

	public CorporateActionAmounts45 setRedemptionPremiumAmount(RestrictedFINActiveCurrencyAndAmount redemptionPremiumAmount) {
		this.redemptionPremiumAmount = redemptionPremiumAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getIncomePortion() {
		return incomePortion == null ? Optional.empty() : Optional.of(incomePortion);
	}

	public CorporateActionAmounts45 setIncomePortion(RestrictedFINActiveCurrencyAndAmount incomePortion) {
		this.incomePortion = incomePortion;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getStockExchangeTax() {
		return stockExchangeTax == null ? Optional.empty() : Optional.of(stockExchangeTax);
	}

	public CorporateActionAmounts45 setStockExchangeTax(RestrictedFINActiveCurrencyAndAmount stockExchangeTax) {
		this.stockExchangeTax = stockExchangeTax;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getEUTaxRetentionAmount() {
		return eUTaxRetentionAmount == null ? Optional.empty() : Optional.of(eUTaxRetentionAmount);
	}

	public CorporateActionAmounts45 setEUTaxRetentionAmount(RestrictedFINActiveCurrencyAndAmount eUTaxRetentionAmount) {
		this.eUTaxRetentionAmount = eUTaxRetentionAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public CorporateActionAmounts45 setAccruedInterestAmount(RestrictedFINActiveCurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getEqualisationAmount() {
		return equalisationAmount == null ? Optional.empty() : Optional.of(equalisationAmount);
	}

	public CorporateActionAmounts45 setEqualisationAmount(RestrictedFINActiveCurrencyAndAmount equalisationAmount) {
		this.equalisationAmount = equalisationAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getFATCATaxAmount() {
		return fATCATaxAmount == null ? Optional.empty() : Optional.of(fATCATaxAmount);
	}

	public CorporateActionAmounts45 setFATCATaxAmount(RestrictedFINActiveCurrencyAndAmount fATCATaxAmount) {
		this.fATCATaxAmount = fATCATaxAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getNRATaxAmount() {
		return nRATaxAmount == null ? Optional.empty() : Optional.of(nRATaxAmount);
	}

	public CorporateActionAmounts45 setNRATaxAmount(RestrictedFINActiveCurrencyAndAmount nRATaxAmount) {
		this.nRATaxAmount = nRATaxAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getBackUpWithholdingTaxAmount() {
		return backUpWithholdingTaxAmount == null ? Optional.empty() : Optional.of(backUpWithholdingTaxAmount);
	}

	public CorporateActionAmounts45 setBackUpWithholdingTaxAmount(RestrictedFINActiveCurrencyAndAmount backUpWithholdingTaxAmount) {
		this.backUpWithholdingTaxAmount = backUpWithholdingTaxAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getTaxOnIncomeAmount() {
		return taxOnIncomeAmount == null ? Optional.empty() : Optional.of(taxOnIncomeAmount);
	}

	public CorporateActionAmounts45 setTaxOnIncomeAmount(RestrictedFINActiveCurrencyAndAmount taxOnIncomeAmount) {
		this.taxOnIncomeAmount = taxOnIncomeAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getTransactionTax() {
		return transactionTax == null ? Optional.empty() : Optional.of(transactionTax);
	}

	public CorporateActionAmounts45 setTransactionTax(RestrictedFINActiveCurrencyAndAmount transactionTax) {
		this.transactionTax = transactionTax;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getDeemedAmount() {
		return deemedAmount == null ? Optional.empty() : Optional.of(deemedAmount);
	}

	public CorporateActionAmounts45 setDeemedAmount(RestrictedFINActiveCurrencyAndAmount deemedAmount) {
		this.deemedAmount = deemedAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getConduitForeignIncomeAmount() {
		return conduitForeignIncomeAmount == null ? Optional.empty() : Optional.of(conduitForeignIncomeAmount);
	}

	public CorporateActionAmounts45 setConduitForeignIncomeAmount(RestrictedFINActiveCurrencyAndAmount conduitForeignIncomeAmount) {
		this.conduitForeignIncomeAmount = conduitForeignIncomeAmount;
		return this;
	}
}
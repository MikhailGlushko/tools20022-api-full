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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03;
import com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection4;
import com.tools20022.repository.msg.Rate2;
import com.tools20022.repository.msg.RateName1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the closing of the securities financing transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmSecuritiesFinancingTradeIdentification
 * SecuritiesFinancingTransactionDetails19.
 * mmSecuritiesFinancingTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmClosingLegIdentification
 * SecuritiesFinancingTransactionDetails19.mmClosingLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmTerminationDate
 * SecuritiesFinancingTransactionDetails19.mmTerminationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmRateChangeDate
 * SecuritiesFinancingTransactionDetails19.mmRateChangeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmEarliestCallBackDate
 * SecuritiesFinancingTransactionDetails19.mmEarliestCallBackDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmCommissionCalculationDate
 * SecuritiesFinancingTransactionDetails19.mmCommissionCalculationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmRateType
 * SecuritiesFinancingTransactionDetails19.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmRevaluation
 * SecuritiesFinancingTransactionDetails19.mmRevaluation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmLegalFramework
 * SecuritiesFinancingTransactionDetails19.mmLegalFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmInterestComputationMethod
 * SecuritiesFinancingTransactionDetails19.mmInterestComputationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmMaturityDateModification
 * SecuritiesFinancingTransactionDetails19.mmMaturityDateModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmInterestPayment
 * SecuritiesFinancingTransactionDetails19.mmInterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmVariableRateSupport
 * SecuritiesFinancingTransactionDetails19.mmVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmRepurchaseRate
 * SecuritiesFinancingTransactionDetails19.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmStockLoanMargin
 * SecuritiesFinancingTransactionDetails19.mmStockLoanMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmSecuritiesHaircut
 * SecuritiesFinancingTransactionDetails19.mmSecuritiesHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmChargesRate
 * SecuritiesFinancingTransactionDetails19.mmChargesRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmPricingRate
 * SecuritiesFinancingTransactionDetails19.mmPricingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmSpread
 * SecuritiesFinancingTransactionDetails19.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmTransactionCallDelay
 * SecuritiesFinancingTransactionDetails19.mmTransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmTotalNumberOfCollateralInstructions
 * SecuritiesFinancingTransactionDetails19.mmTotalNumberOfCollateralInstructions
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmLocalBrokerCommission
 * SecuritiesFinancingTransactionDetails19.mmLocalBrokerCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmDealAmount
 * SecuritiesFinancingTransactionDetails19.mmDealAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmAccruedInterestAmount
 * SecuritiesFinancingTransactionDetails19.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmForfeitAmount
 * SecuritiesFinancingTransactionDetails19.mmForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmPremiumAmount
 * SecuritiesFinancingTransactionDetails19.mmPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmTerminationAmountPerPieceOfCollateral
 * SecuritiesFinancingTransactionDetails19.
 * mmTerminationAmountPerPieceOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmTerminationTransactionAmount
 * SecuritiesFinancingTransactionDetails19.mmTerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmSecondLegNarrative
 * SecuritiesFinancingTransactionDetails19.mmSecondLegNarrative}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03#mmSecuritiesFinancingAdditionalDetails
 * SecuritiesFinancingModificationInstructionV03.
 * mmSecuritiesFinancingAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmSecuritiesFinancingAdditionalDetails
 * SecuritiesFinancingModificationInstructionV04.
 * mmSecuritiesFinancingAdditionalDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingTransactionDetails19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the closing of the securities financing transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forSecuritiesFinancingTransactionDetails19
 * ConstraintCoexistenceIdentificationRule.
 * forSecuritiesFinancingTransactionDetails19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesFinancingTransactionDetails19
 * ConstraintCoexistenceAmountRule.forSecuritiesFinancingTransactionDetails19}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27
 * SecuritiesFinancingTransactionDetails27}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1
 * SecuritiesFinancingTransactionDetails1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingTransactionDetails19", propOrder = {"securitiesFinancingTradeIdentification", "closingLegIdentification", "terminationDate", "rateChangeDate", "earliestCallBackDate", "commissionCalculationDate",
		"rateType", "revaluation", "legalFramework", "interestComputationMethod", "maturityDateModification", "interestPayment", "variableRateSupport", "repurchaseRate", "stockLoanMargin", "securitiesHaircut", "chargesRate", "pricingRate",
		"spread", "transactionCallDelay", "totalNumberOfCollateralInstructions", "localBrokerCommission", "dealAmount", "accruedInterestAmount", "forfeitAmount", "premiumAmount", "terminationAmountPerPieceOfCollateral",
		"terminationTransactionAmount", "secondLegNarrative"})
public class SecuritiesFinancingTransactionDetails19 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesFincgTradId")
	protected Max35Text securitiesFinancingTradeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgTradId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the underlying securities financing trade as assigned by the instructing party. The identification is common to all collateral pieces (one or many)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::REPO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmSecuritiesFinancingTradeIdentification
	 * SecuritiesFinancingTransactionDetails27.
	 * mmSecuritiesFinancingTradeIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Max35Text>> mmSecuritiesFinancingTradeIdentification = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTradId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::REPO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTradeIdentification";
			definition = "Unambiguous identification of the underlying securities financing trade as assigned by the instructing party. The identification is common to all collateral pieces (one or many).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmSecuritiesFinancingTradeIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getSecuritiesFinancingTradeIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<Max35Text> value) {
			obj.setSecuritiesFinancingTradeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClsgLegId")
	protected Max35Text closingLegIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgLegId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the second leg of the transaction as known by the account owner (or the instructing party acting on its behalf)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::SECO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmClosingLegIdentification
	 * SecuritiesFinancingTransactionDetails27.mmClosingLegIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Max35Text>> mmClosingLegIdentification = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "ClsgLegId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::SECO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingLegIdentification";
			definition = "Unambiguous identification of the second leg of the transaction as known by the account owner (or the instructing party acting on its behalf).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmClosingLegIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getClosingLegIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<Max35Text> value) {
			obj.setClosingLegIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TermntnDt")
	protected TerminationDate2Choice terminationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TerminationDate2Choice
	 * TerminationDate2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationDateTime
	 * SecuritiesFinancing.mmTerminationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing date/time or maturity date/time of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TERM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails27.mmTerminationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails19, Optional<TerminationDate2Choice>> mmTerminationDate = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails19, Optional<TerminationDate2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "TermntnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TERM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDate";
			definition = "Closing date/time or maturity date/time of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmTerminationDate);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminationDate2Choice.mmObject();
		}

		@Override
		public Optional<TerminationDate2Choice> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getTerminationDate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<TerminationDate2Choice> value) {
			obj.setTerminationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RateChngDt")
	protected DateAndDateTimeChoice rateChangeDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRateChangeDateTime
	 * SecuritiesFinancing.mmRateChangeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateChngDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChangeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/Time at which rate change has taken place."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::RERA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmRateChangeDate
	 * SecuritiesFinancingTransactionDetails27.mmRateChangeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<DateAndDateTimeChoice>> mmRateChangeDate = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRateChangeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "RateChngDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::RERA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChangeDate";
			definition = "Date/Time at which rate change has taken place.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmRateChangeDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getRateChangeDate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setRateChangeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "EarlstCallBckDt")
	protected DateAndDateTimeChoice earliestCallBackDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmEarliestCallBackDate
	 * SecuritiesFinancing.mmEarliestCallBackDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstCallBckDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestCallBackDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Earliest date/time at which the call back can take place."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmEarliestCallBackDate
	 * SecuritiesFinancingTransactionDetails27.mmEarliestCallBackDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<DateAndDateTimeChoice>> mmEarliestCallBackDate = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmEarliestCallBackDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "EarlstCallBckDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestCallBackDate";
			definition = "Earliest date/time at which the call back can take place.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmEarliestCallBackDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getEarliestCallBackDate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setEarliestCallBackDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ComssnClctnDt")
	protected DateAndDateTimeChoice commissionCalculationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCalculationDate
	 * Commission.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnClctnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionCalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the commission is calculated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmCommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails27.mmCommissionCalculationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<DateAndDateTimeChoice>> mmCommissionCalculationDate = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmCalculationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "ComssnClctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionCalculationDate";
			definition = "Date/time at which the commission is calculated.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmCommissionCalculationDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getCommissionCalculationDate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setCommissionCalculationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RateTp")
	protected RateType5Choice rateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateType5Choice
	 * RateType5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateType
	 * InterestCalculation.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the rate is fixed or variable."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RERT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmRateType
	 * SecuritiesFinancingTransactionDetails27.mmRateType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<RateType5Choice>> mmRateType = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<RateType5Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRateType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RERT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Specifies whether the rate is fixed or variable.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmRateType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateType5Choice.mmObject();
		}

		@Override
		public Optional<RateType5Choice> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getRateType();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<RateType5Choice> value) {
			obj.setRateType(value.orElse(null));
		}
	};
	@XmlElement(name = "Rvaltn")
	protected RevaluationIndicator1Choice revaluation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RevaluationIndicator1Choice
	 * RevaluationIndicator1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRevaluationIndicator
	 * SecuritiesFinancing.mmRevaluationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rvaltn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Revaluation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::REVA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmRevaluation
	 * SecuritiesFinancingTransactionDetails27.mmRevaluation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<RevaluationIndicator1Choice>> mmRevaluation = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<RevaluationIndicator1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRevaluationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "Rvaltn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::REVA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Revaluation";
			definition = "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmRevaluation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RevaluationIndicator1Choice.mmObject();
		}

		@Override
		public Optional<RevaluationIndicator1Choice> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getRevaluation();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<RevaluationIndicator1Choice> value) {
			obj.setRevaluation(value.orElse(null));
		}
	};
	@XmlElement(name = "LglFrmwk")
	protected LegalFramework1Choice legalFramework;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LegalFramework1Choice
	 * LegalFramework1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmLegalFramework
	 * SecuritiesTrade.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglFrmwk"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalFramework"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal framework of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LEGA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails27.mmLegalFramework}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<LegalFramework1Choice>> mmLegalFramework = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<LegalFramework1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmLegalFramework;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "LglFrmwk";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LEGA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalFramework";
			definition = "Legal framework of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmLegalFramework);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LegalFramework1Choice.mmObject();
		}

		@Override
		public Optional<LegalFramework1Choice> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getLegalFramework();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<LegalFramework1Choice> value) {
			obj.setLegalFramework(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstCmptnMtd")
	protected InterestComputationMethodFormat1Choice interestComputationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InterestComputationMethodFormat1Choice
	 * InterestComputationMethodFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstCmptnMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestComputationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the computation method of accrued interest of the related financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::MICO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmInterestComputationMethod
	 * SecuritiesFinancingTransactionDetails27.mmInterestComputationMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<InterestComputationMethodFormat1Choice>> mmInterestComputationMethod = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<InterestComputationMethodFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "IntrstCmptnMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::MICO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestComputationMethod";
			definition = "Identifies the computation method of accrued interest of the related financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmInterestComputationMethod);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestComputationMethodFormat1Choice.mmObject();
		}

		@Override
		public Optional<InterestComputationMethodFormat1Choice> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getInterestComputationMethod();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<InterestComputationMethodFormat1Choice> value) {
			obj.setInterestComputationMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "MtrtyDtMod")
	protected YesNoIndicator maturityDateModification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmMaturityDateModification
	 * SecuritiesFinancing.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDtMod"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDateModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the maturity date of the securities financing transaction may be modified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LEGA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails27.mmMaturityDateModification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<YesNoIndicator>> mmMaturityDateModification = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmMaturityDateModification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDtMod";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LEGA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDateModification";
			definition = "Specifies whether the maturity date of the securities financing transaction may be modified.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmMaturityDateModification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getMaturityDateModification();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<YesNoIndicator> value) {
			obj.setMaturityDateModification(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstPmt")
	protected YesNoIndicator interestPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterestPayment
	 * SecuritiesFinancing.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LEGA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails27.mmInterestPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<YesNoIndicator>> mmInterestPayment = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmInterestPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LEGA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			definition = "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmInterestPayment);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getInterestPayment();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<YesNoIndicator> value) {
			obj.setInterestPayment(value.orElse(null));
		}
	};
	@XmlElement(name = "VarblRateSpprt")
	protected RateName1 variableRateSupport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.RateName1
	 * RateName1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmVariableRateSupport
	 * SecuritiesFinancing.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VarblRateSpprt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index or support rate used together with the spread to calculate the\nrepurchase rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::VASU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails27.mmVariableRateSupport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<RateName1>> mmVariableRateSupport = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<RateName1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmVariableRateSupport;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "VarblRateSpprt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::VASU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the\nrepurchase rate.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmVariableRateSupport);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateName1.mmObject();
		}

		@Override
		public Optional<RateName1> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getVariableRateSupport();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<RateName1> value) {
			obj.setVariableRateSupport(value.orElse(null));
		}
	};
	@XmlElement(name = "RpRate")
	protected Rate2 repurchaseRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseRate
	 * SecuritiesFinancing.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RpRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate to be used to recalculate the repurchase amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::REPO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails27.mmRepurchaseRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Rate2>> mmRepurchaseRate = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "RpRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::REPO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Rate to be used to recalculate the repurchase amount.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmRepurchaseRate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getRepurchaseRate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<Rate2> value) {
			obj.setRepurchaseRate(value.orElse(null));
		}
	};
	@XmlElement(name = "StockLnMrgn")
	protected Rate2 stockLoanMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmStockLoanMargin
	 * SecuritiesFinancing.mmStockLoanMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockLnMrgn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage mark-up on a loan consideration used to reflect the lender's risk."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::SLMG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmStockLoanMargin
	 * SecuritiesFinancingTransactionDetails27.mmStockLoanMargin}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Rate2>> mmStockLoanMargin = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmStockLoanMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "StockLnMrgn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::SLMG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanMargin";
			definition = "Percentage mark-up on a loan consideration used to reflect the lender's risk.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmStockLoanMargin);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getStockLoanMargin();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<Rate2> value) {
			obj.setStockLoanMargin(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesHrcut")
	protected Rate2 securitiesHaircut;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHaircut
	 * AssetHolding.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesHrcut"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut or valuation factor on the security expressed as a percentage."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::SHAI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails27.mmSecuritiesHaircut}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Rate2>> mmSecuritiesHaircut = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHaircut;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "SctiesHrcut";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::SHAI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHaircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmSecuritiesHaircut);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getSecuritiesHaircut();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<Rate2> value) {
			obj.setSecuritiesHaircut(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgsRate")
	protected Rate2 chargesRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate paid in the context of a securities financing transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmChargesRate
	 * SecuritiesFinancingTransactionDetails27.mmChargesRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Rate2>> mmChargesRate = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "ChrgsRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesRate";
			definition = "Interest rate paid in the context of a securities financing transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmChargesRate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getChargesRate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<Rate2> value) {
			obj.setChargesRate(value.orElse(null));
		}
	};
	@XmlElement(name = "PricgRate")
	protected RateOrName1Choice pricingRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateOrName1Choice
	 * RateOrName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
	 * SecuritiesFinancing.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricgRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PricingRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate to be paid on the transaction amount, as agreed between the counterparties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::PRIC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmPricingRate
	 * SecuritiesFinancingTransactionDetails27.mmPricingRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<RateOrName1Choice>> mmPricingRate = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<RateOrName1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "PricgRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::PRIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingRate";
			definition = "Interest rate to be paid on the transaction amount, as agreed between the counterparties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmPricingRate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateOrName1Choice.mmObject();
		}

		@Override
		public Optional<RateOrName1Choice> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getPricingRate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<RateOrName1Choice> value) {
			obj.setPricingRate(value.orElse(null));
		}
	};
	@XmlElement(name = "Sprd")
	protected Rate2 spread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseSpread
	 * SecuritiesFinancing.mmRepurchaseSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sprd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::RSPR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmSpread
	 * SecuritiesFinancingTransactionDetails27.mmSpread}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Rate2>> mmSpread = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseSpread;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "Sprd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::RSPR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Spread";
			definition = "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmSpread);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getSpread();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<Rate2> value) {
			obj.setSpread(value.orElse(null));
		}
	};
	@XmlElement(name = "TxCallDely")
	protected Exact3NumericText transactionCallDelay;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTransactionCallDelay
	 * SecuritiesFinancing.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCallDely"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days' notice a counterparty needs for terminating the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99B::CADE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails27.mmTransactionCallDelay}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Exact3NumericText>> mmTransactionCallDelay = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Exact3NumericText>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTransactionCallDelay;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "TxCallDely";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99B::CADE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			definition = "Minimum number of days' notice a counterparty needs for terminating the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmTransactionCallDelay);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Optional<Exact3NumericText> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getTransactionCallDelay();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<Exact3NumericText> value) {
			obj.setTransactionCallDelay(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNbOfCollInstrs")
	protected Exact3NumericText totalNumberOfCollateralInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancing.mmTotalNumberOfCollateralInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfCollInstrs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfCollateralInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of collateral instructions involved in the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99B::TOCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmTotalNumberOfCollateralInstructions
	 * SecuritiesFinancingTransactionDetails27.
	 * mmTotalNumberOfCollateralInstructions}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Exact3NumericText>> mmTotalNumberOfCollateralInstructions = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Exact3NumericText>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTotalNumberOfCollateralInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfCollInstrs";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99B::TOCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfCollateralInstructions";
			definition = "Total number of collateral instructions involved in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmTotalNumberOfCollateralInstructions);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Optional<Exact3NumericText> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getTotalNumberOfCollateralInstructions();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<Exact3NumericText> value) {
			obj.setTotalNumberOfCollateralInstructions(value.orElse(null));
		}
	};
	@XmlElement(name = "LclBrkrComssn")
	protected AmountAndDirection4 localBrokerCommission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection4
	 * AmountAndDirection4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Broker#mmCommission
	 * Broker.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclBrkrComssn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalBrokerCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of commission paid to a local broker."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmLocalBrokerCommission
	 * SecuritiesFinancingTransactionDetails27.mmLocalBrokerCommission}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>> mmLocalBrokerCommission = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>>() {
		{
			businessElementTrace_lazy = () -> Broker.mmCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "LclBrkrComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalBrokerCommission";
			definition = "Amount of commission paid to a local broker.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmLocalBrokerCommission);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection4.mmObject();
		}

		@Override
		public Optional<AmountAndDirection4> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getLocalBrokerCommission();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<AmountAndDirection4> value) {
			obj.setLocalBrokerCommission(value.orElse(null));
		}
	};
	@XmlElement(name = "DealAmt")
	protected AmountAndDirection4 dealAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection4
	 * AmountAndDirection4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmDealAmount
	 * SecuritiesFinancing.mmDealAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Principal amount of a trade (for second leg)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::DEAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmDealAmount
	 * SecuritiesFinancingTransactionDetails27.mmDealAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>> mmDealAmount = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmDealAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "DealAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::DEAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealAmount";
			definition = "Principal amount of a trade (for second leg).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmDealAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection4.mmObject();
		}

		@Override
		public Optional<AmountAndDirection4> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getDealAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<AmountAndDirection4> value) {
			obj.setDealAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected AmountAndDirection4 accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection4
	 * AmountAndDirection4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount that has accrued in between coupon payment periods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACRU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails27.mmAccruedInterestAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>> mmAccruedInterestAmount = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACRU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmAccruedInterestAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection4.mmObject();
		}

		@Override
		public Optional<AmountAndDirection4> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<AmountAndDirection4> value) {
			obj.setAccruedInterestAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FrftAmt")
	protected AmountAndDirection4 forfeitAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection4
	 * AmountAndDirection4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmForfeitRepurchaseAmount
	 * SecuritiesFinancing.mmForfeitRepurchaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrftAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed amount of money that has to be paid (instead of interest) in the case of a recall or at the closing date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::FORF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmForfeitAmount
	 * SecuritiesFinancingTransactionDetails27.mmForfeitAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>> mmForfeitAmount = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmForfeitRepurchaseAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "FrftAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::FORF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			definition = "Fixed amount of money that has to be paid (instead of interest) in the case of a recall or at the closing date.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmForfeitAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection4.mmObject();
		}

		@Override
		public Optional<AmountAndDirection4> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getForfeitAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<AmountAndDirection4> value) {
			obj.setForfeitAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PrmAmt")
	protected AmountAndDirection4 premiumAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection4
	 * AmountAndDirection4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmPremiumAmount
	 * SecuritiesFinancing.mmPremiumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the amount of money of the first leg and the amount of the second leg of the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::REPP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmPremiumAmount
	 * SecuritiesFinancingTransactionDetails27.mmPremiumAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>> mmPremiumAmount = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmPremiumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "PrmAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::REPP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			definition = "Difference between the amount of money of the first leg and the amount of the second leg of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmPremiumAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection4.mmObject();
		}

		@Override
		public Optional<AmountAndDirection4> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getPremiumAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<AmountAndDirection4> value) {
			obj.setPremiumAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TermntnAmtPerPcOfColl")
	protected AmountAndDirection4 terminationAmountPerPieceOfCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection4
	 * AmountAndDirection4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancing.mmTerminationAmountPerPieceOfCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnAmtPerPcOfColl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationAmountPerPieceOfCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be settled per piece of collateral to terminate the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::TAPC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmTerminationAmountPerPieceOfCollateral
	 * SecuritiesFinancingTransactionDetails27.
	 * mmTerminationAmountPerPieceOfCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>> mmTerminationAmountPerPieceOfCollateral = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationAmountPerPieceOfCollateral;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "TermntnAmtPerPcOfColl";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TAPC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationAmountPerPieceOfCollateral";
			definition = "Amount of money to be settled per piece of collateral to terminate the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmTerminationAmountPerPieceOfCollateral);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection4.mmObject();
		}

		@Override
		public Optional<AmountAndDirection4> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getTerminationAmountPerPieceOfCollateral();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<AmountAndDirection4> value) {
			obj.setTerminationAmountPerPieceOfCollateral(value.orElse(null));
		}
	};
	@XmlElement(name = "TermntnTxAmt")
	protected AmountAndDirection4 terminationTransactionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection4
	 * AmountAndDirection4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationTransactionAmount
	 * SecuritiesFinancing.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnTxAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be settled to terminate the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::TRTE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails27.mmTerminationTransactionAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>> mmTerminationTransactionAmount = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<AmountAndDirection4>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationTransactionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "TermntnTxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TRTE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Total amount of money to be settled to terminate the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmTerminationTransactionAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection4.mmObject();
		}

		@Override
		public Optional<AmountAndDirection4> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getTerminationTransactionAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<AmountAndDirection4> value) {
			obj.setTerminationTransactionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndLegNrrtv")
	protected Max140Text secondLegNarrative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19
	 * SecuritiesFinancingTransactionDetails19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndLegNrrtv"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLegNarrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the second leg in narrative form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70C::SECO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmSecondLegNarrative
	 * SecuritiesFinancingTransactionDetails27.mmSecondLegNarrative}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Max140Text>> mmSecondLegNarrative = new MMMessageAttribute<SecuritiesFinancingTransactionDetails19, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmObject();
			isDerived = false;
			xmlTag = "ScndLegNrrtv";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70C::SECO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLegNarrative";
			definition = "Provides additional information about the second leg in narrative form.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmSecondLegNarrative);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(SecuritiesFinancingTransactionDetails19 obj) {
			return obj.getSecondLegNarrative();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails19 obj, Optional<Max140Text> value) {
			obj.setSecondLegNarrative(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmSecuritiesFinancingTradeIdentification,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmClosingLegIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmTerminationDate,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmRateChangeDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmEarliestCallBackDate,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmCommissionCalculationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmRateType,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmRevaluation, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmLegalFramework,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmInterestComputationMethod, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmMaturityDateModification,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmInterestPayment, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmVariableRateSupport,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmRepurchaseRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmStockLoanMargin,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmSecuritiesHaircut, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmChargesRate,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmPricingRate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmSpread,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmTotalNumberOfCollateralInstructions,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmLocalBrokerCommission, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmDealAmount,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmAccruedInterestAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmForfeitAmount,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmPremiumAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmTerminationAmountPerPieceOfCollateral,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.mmSecondLegNarrative);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesFinancingModificationInstructionV03.mmSecuritiesFinancingAdditionalDetails, SecuritiesFinancingModificationInstructionV04.mmSecuritiesFinancingAdditionalDetails);
				trace_lazy = () -> SecuritiesFinancing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forSecuritiesFinancingTransactionDetails19,
						com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesFinancingTransactionDetails19);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SecuritiesFinancingTransactionDetails19";
				definition = "Details of the closing of the securities financing transaction.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmObject());
				previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getSecuritiesFinancingTradeIdentification() {
		return securitiesFinancingTradeIdentification == null ? Optional.empty() : Optional.of(securitiesFinancingTradeIdentification);
	}

	public SecuritiesFinancingTransactionDetails19 setSecuritiesFinancingTradeIdentification(Max35Text securitiesFinancingTradeIdentification) {
		this.securitiesFinancingTradeIdentification = securitiesFinancingTradeIdentification;
		return this;
	}

	public Optional<Max35Text> getClosingLegIdentification() {
		return closingLegIdentification == null ? Optional.empty() : Optional.of(closingLegIdentification);
	}

	public SecuritiesFinancingTransactionDetails19 setClosingLegIdentification(Max35Text closingLegIdentification) {
		this.closingLegIdentification = closingLegIdentification;
		return this;
	}

	public Optional<TerminationDate2Choice> getTerminationDate() {
		return terminationDate == null ? Optional.empty() : Optional.of(terminationDate);
	}

	public SecuritiesFinancingTransactionDetails19 setTerminationDate(TerminationDate2Choice terminationDate) {
		this.terminationDate = terminationDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getRateChangeDate() {
		return rateChangeDate == null ? Optional.empty() : Optional.of(rateChangeDate);
	}

	public SecuritiesFinancingTransactionDetails19 setRateChangeDate(DateAndDateTimeChoice rateChangeDate) {
		this.rateChangeDate = rateChangeDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getEarliestCallBackDate() {
		return earliestCallBackDate == null ? Optional.empty() : Optional.of(earliestCallBackDate);
	}

	public SecuritiesFinancingTransactionDetails19 setEarliestCallBackDate(DateAndDateTimeChoice earliestCallBackDate) {
		this.earliestCallBackDate = earliestCallBackDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getCommissionCalculationDate() {
		return commissionCalculationDate == null ? Optional.empty() : Optional.of(commissionCalculationDate);
	}

	public SecuritiesFinancingTransactionDetails19 setCommissionCalculationDate(DateAndDateTimeChoice commissionCalculationDate) {
		this.commissionCalculationDate = commissionCalculationDate;
		return this;
	}

	public Optional<RateType5Choice> getRateType() {
		return rateType == null ? Optional.empty() : Optional.of(rateType);
	}

	public SecuritiesFinancingTransactionDetails19 setRateType(RateType5Choice rateType) {
		this.rateType = rateType;
		return this;
	}

	public Optional<RevaluationIndicator1Choice> getRevaluation() {
		return revaluation == null ? Optional.empty() : Optional.of(revaluation);
	}

	public SecuritiesFinancingTransactionDetails19 setRevaluation(RevaluationIndicator1Choice revaluation) {
		this.revaluation = revaluation;
		return this;
	}

	public Optional<LegalFramework1Choice> getLegalFramework() {
		return legalFramework == null ? Optional.empty() : Optional.of(legalFramework);
	}

	public SecuritiesFinancingTransactionDetails19 setLegalFramework(LegalFramework1Choice legalFramework) {
		this.legalFramework = legalFramework;
		return this;
	}

	public Optional<InterestComputationMethodFormat1Choice> getInterestComputationMethod() {
		return interestComputationMethod == null ? Optional.empty() : Optional.of(interestComputationMethod);
	}

	public SecuritiesFinancingTransactionDetails19 setInterestComputationMethod(InterestComputationMethodFormat1Choice interestComputationMethod) {
		this.interestComputationMethod = interestComputationMethod;
		return this;
	}

	public Optional<YesNoIndicator> getMaturityDateModification() {
		return maturityDateModification == null ? Optional.empty() : Optional.of(maturityDateModification);
	}

	public SecuritiesFinancingTransactionDetails19 setMaturityDateModification(YesNoIndicator maturityDateModification) {
		this.maturityDateModification = maturityDateModification;
		return this;
	}

	public Optional<YesNoIndicator> getInterestPayment() {
		return interestPayment == null ? Optional.empty() : Optional.of(interestPayment);
	}

	public SecuritiesFinancingTransactionDetails19 setInterestPayment(YesNoIndicator interestPayment) {
		this.interestPayment = interestPayment;
		return this;
	}

	public Optional<RateName1> getVariableRateSupport() {
		return variableRateSupport == null ? Optional.empty() : Optional.of(variableRateSupport);
	}

	public SecuritiesFinancingTransactionDetails19 setVariableRateSupport(RateName1 variableRateSupport) {
		this.variableRateSupport = variableRateSupport;
		return this;
	}

	public Optional<Rate2> getRepurchaseRate() {
		return repurchaseRate == null ? Optional.empty() : Optional.of(repurchaseRate);
	}

	public SecuritiesFinancingTransactionDetails19 setRepurchaseRate(Rate2 repurchaseRate) {
		this.repurchaseRate = repurchaseRate;
		return this;
	}

	public Optional<Rate2> getStockLoanMargin() {
		return stockLoanMargin == null ? Optional.empty() : Optional.of(stockLoanMargin);
	}

	public SecuritiesFinancingTransactionDetails19 setStockLoanMargin(Rate2 stockLoanMargin) {
		this.stockLoanMargin = stockLoanMargin;
		return this;
	}

	public Optional<Rate2> getSecuritiesHaircut() {
		return securitiesHaircut == null ? Optional.empty() : Optional.of(securitiesHaircut);
	}

	public SecuritiesFinancingTransactionDetails19 setSecuritiesHaircut(Rate2 securitiesHaircut) {
		this.securitiesHaircut = securitiesHaircut;
		return this;
	}

	public Optional<Rate2> getChargesRate() {
		return chargesRate == null ? Optional.empty() : Optional.of(chargesRate);
	}

	public SecuritiesFinancingTransactionDetails19 setChargesRate(Rate2 chargesRate) {
		this.chargesRate = chargesRate;
		return this;
	}

	public Optional<RateOrName1Choice> getPricingRate() {
		return pricingRate == null ? Optional.empty() : Optional.of(pricingRate);
	}

	public SecuritiesFinancingTransactionDetails19 setPricingRate(RateOrName1Choice pricingRate) {
		this.pricingRate = pricingRate;
		return this;
	}

	public Optional<Rate2> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public SecuritiesFinancingTransactionDetails19 setSpread(Rate2 spread) {
		this.spread = spread;
		return this;
	}

	public Optional<Exact3NumericText> getTransactionCallDelay() {
		return transactionCallDelay == null ? Optional.empty() : Optional.of(transactionCallDelay);
	}

	public SecuritiesFinancingTransactionDetails19 setTransactionCallDelay(Exact3NumericText transactionCallDelay) {
		this.transactionCallDelay = transactionCallDelay;
		return this;
	}

	public Optional<Exact3NumericText> getTotalNumberOfCollateralInstructions() {
		return totalNumberOfCollateralInstructions == null ? Optional.empty() : Optional.of(totalNumberOfCollateralInstructions);
	}

	public SecuritiesFinancingTransactionDetails19 setTotalNumberOfCollateralInstructions(Exact3NumericText totalNumberOfCollateralInstructions) {
		this.totalNumberOfCollateralInstructions = totalNumberOfCollateralInstructions;
		return this;
	}

	public Optional<AmountAndDirection4> getLocalBrokerCommission() {
		return localBrokerCommission == null ? Optional.empty() : Optional.of(localBrokerCommission);
	}

	public SecuritiesFinancingTransactionDetails19 setLocalBrokerCommission(AmountAndDirection4 localBrokerCommission) {
		this.localBrokerCommission = localBrokerCommission;
		return this;
	}

	public Optional<AmountAndDirection4> getDealAmount() {
		return dealAmount == null ? Optional.empty() : Optional.of(dealAmount);
	}

	public SecuritiesFinancingTransactionDetails19 setDealAmount(AmountAndDirection4 dealAmount) {
		this.dealAmount = dealAmount;
		return this;
	}

	public Optional<AmountAndDirection4> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public SecuritiesFinancingTransactionDetails19 setAccruedInterestAmount(AmountAndDirection4 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}

	public Optional<AmountAndDirection4> getForfeitAmount() {
		return forfeitAmount == null ? Optional.empty() : Optional.of(forfeitAmount);
	}

	public SecuritiesFinancingTransactionDetails19 setForfeitAmount(AmountAndDirection4 forfeitAmount) {
		this.forfeitAmount = forfeitAmount;
		return this;
	}

	public Optional<AmountAndDirection4> getPremiumAmount() {
		return premiumAmount == null ? Optional.empty() : Optional.of(premiumAmount);
	}

	public SecuritiesFinancingTransactionDetails19 setPremiumAmount(AmountAndDirection4 premiumAmount) {
		this.premiumAmount = premiumAmount;
		return this;
	}

	public Optional<AmountAndDirection4> getTerminationAmountPerPieceOfCollateral() {
		return terminationAmountPerPieceOfCollateral == null ? Optional.empty() : Optional.of(terminationAmountPerPieceOfCollateral);
	}

	public SecuritiesFinancingTransactionDetails19 setTerminationAmountPerPieceOfCollateral(AmountAndDirection4 terminationAmountPerPieceOfCollateral) {
		this.terminationAmountPerPieceOfCollateral = terminationAmountPerPieceOfCollateral;
		return this;
	}

	public Optional<AmountAndDirection4> getTerminationTransactionAmount() {
		return terminationTransactionAmount == null ? Optional.empty() : Optional.of(terminationTransactionAmount);
	}

	public SecuritiesFinancingTransactionDetails19 setTerminationTransactionAmount(AmountAndDirection4 terminationTransactionAmount) {
		this.terminationTransactionAmount = terminationTransactionAmount;
		return this;
	}

	public Optional<Max140Text> getSecondLegNarrative() {
		return secondLegNarrative == null ? Optional.empty() : Optional.of(secondLegNarrative);
	}

	public SecuritiesFinancingTransactionDetails19 setSecondLegNarrative(Max140Text secondLegNarrative) {
		this.secondLegNarrative = secondLegNarrative;
		return this;
	}
}
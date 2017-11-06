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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.TimeFrame3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * TimeFrame or period concept that allows definition of a period as number of
 * days before or after a defined activity.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TimeFrame" src="doc-files/TimeFrame.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TimeFrame#mmTradeMinus
 * TimeFrame.mmTradeMinus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmRenunciationMinus
 * TimeFrame.mmRenunciationMinus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmSubscriptionSettlementRelatedFundProcessing
 * TimeFrame.mmSubscriptionSettlementRelatedFundProcessing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TimeFrame#mmTradePlus
 * TimeFrame.mmTradePlus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmRenunciationPlus
 * TimeFrame.mmRenunciationPlus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TimeFrame#mmPrepayment
 * TimeFrame.mmPrepayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmOtherTimeFrameDescription
 * TimeFrame.mmOtherTimeFrameDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmRelatedProcessingCharacteristics
 * TimeFrame.mmRelatedProcessingCharacteristics}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementCycle
 * InvestmentFundClassProcessingCharacteristics.mmSettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmDealingCutOffTimeFrame
 * InvestmentFundClassProcessingCharacteristics.mmDealingCutOffTimeFrame}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics1#mmDealingCutOffTimeFrame
 * ProcessingCharacteristics1.mmDealingCutOffTimeFrame}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics2#mmDealingCutOffTimeFrame
 * ProcessingCharacteristics2.mmDealingCutOffTimeFrame}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProcessingCharacteristics3#mmDealingCutOffTimeFrame
 * ProcessingCharacteristics3.mmDealingCutOffTimeFrame}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.TimeFrame3Choice
 * TimeFrame3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Timeframe2Choice
 * Timeframe2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TimeFrame3 TimeFrame3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TimeFrame5Choice
 * TimeFrame5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TimeFrame4Choice
 * TimeFrame4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TimeFrame1Choice
 * TimeFrame1Choice}</li>
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
 * "TimeFrame"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "TimeFrame or period concept that allows definition of a period as number of days before or after a defined activity."
 * </li>
 * </ul>
 */
public class TimeFrame {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Number tradeMinus;
	/**
	 * An agreed number of days before the Trade date (T) used to define
	 * standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition<br>
	 * Where = T is the date that the price is applied to a transaction,
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TimeFrame3Choice#mmTradeMinus
	 * TimeFrame3Choice.mmTradeMinus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TimeFrame3#mmTradeMinus
	 * TimeFrame3.mmTradeMinus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TimeFrame1Choice#mmTradeMinus
	 * TimeFrame1Choice.mmTradeMinus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeMinus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\r\nWhere = T is the date that the price is applied to a transaction,"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeMinus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TimeFrame3Choice.mmTradeMinus, com.tools20022.repository.msg.TimeFrame3.mmTradeMinus, com.tools20022.repository.choice.TimeFrame1Choice.mmTradeMinus);
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeMinus";
			definition = "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\r\nWhere = T is the date that the price is applied to a transaction,";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number renunciationMinus;
	/**
	 * An agreed number of days before the Renunciation of Title documents are
	 * received used to define standard timeframes in redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TimeFrame3Choice#mmRenunciationMinus
	 * TimeFrame3Choice.mmRenunciationMinus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TimeFrame1Choice#mmRenunciationMinus
	 * TimeFrame1Choice.mmRenunciationMinus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenunciationMinus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days before the Renunciation of Title documents are received used to define standard timeframes in redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRenunciationMinus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TimeFrame3Choice.mmRenunciationMinus, com.tools20022.repository.choice.TimeFrame1Choice.mmRenunciationMinus);
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RenunciationMinus";
			definition = "An agreed number of days before the Renunciation of Title documents are received used to define standard timeframes in redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected InvestmentFundClassProcessingCharacteristics subscriptionSettlementRelatedFundProcessing;
	/**
	 * Fund processing characteristics related to a subscription cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementCycle
	 * InvestmentFundClassProcessingCharacteristics.mmSettlementCycle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionSettlementRelatedFundProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fund processing characteristics related to a subscription cycle."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSubscriptionSettlementRelatedFundProcessing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionSettlementRelatedFundProcessing";
			definition = "Fund processing characteristics related to a subscription cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmSettlementCycle;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};
	protected Number tradePlus;
	/**
	 * An agreed number of days after the Trade date (T) used to define standard
	 * timeframes e.g T+3 settlement period. <br>
	 * Where = T is the date that the price is applied to a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Timeframe2Choice#mmTradePlus
	 * Timeframe2Choice.mmTradePlus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TimeFrame5Choice#mmTradePlus
	 * TimeFrame5Choice.mmTradePlus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TimeFrame4Choice#mmTradePlus
	 * TimeFrame4Choice.mmTradePlus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TimeFrame1Choice#mmTradePlus
	 * TimeFrame1Choice.mmTradePlus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period. \r\nWhere = T is the date that the price is applied to a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradePlus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Timeframe2Choice.mmTradePlus, com.tools20022.repository.choice.TimeFrame5Choice.mmTradePlus, com.tools20022.repository.choice.TimeFrame4Choice.mmTradePlus,
					com.tools20022.repository.choice.TimeFrame1Choice.mmTradePlus);
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradePlus";
			definition = "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period. \r\nWhere = T is the date that the price is applied to a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number renunciationPlus;
	/**
	 * An agreed number of days after the renunciation of title documents are
	 * received used to define standard timeframes in Redemption e.g R+3
	 * Redemption settlement cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Timeframe2Choice#mmRenunciationPlus
	 * Timeframe2Choice.mmRenunciationPlus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TimeFrame4Choice#mmRenunciationPlus
	 * TimeFrame4Choice.mmRenunciationPlus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TimeFrame1Choice#mmRenunciationPlus
	 * TimeFrame1Choice.mmRenunciationPlus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenunciationPlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days after the renunciation of title documents are received used to define standard timeframes in Redemption e.g R+3 Redemption settlement cycle."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRenunciationPlus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Timeframe2Choice.mmRenunciationPlus, com.tools20022.repository.choice.TimeFrame4Choice.mmRenunciationPlus,
					com.tools20022.repository.choice.TimeFrame1Choice.mmRenunciationPlus);
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RenunciationPlus";
			definition = "An agreed number of days after the renunciation of title documents are received used to define standard timeframes in Redemption e.g R+3 Redemption settlement cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected YesNoIndicator prepayment;
	/**
	 * Indicates whether pre-payment is necessary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Timeframe2Choice#mmPrepayment
	 * Timeframe2Choice.mmPrepayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TimeFrame5Choice#mmPrepayment
	 * TimeFrame5Choice.mmPrepayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prepayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether pre-payment is necessary."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPrepayment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Timeframe2Choice.mmPrepayment, com.tools20022.repository.choice.TimeFrame5Choice.mmPrepayment);
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Prepayment";
			definition = "Indicates whether pre-payment is necessary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max350Text otherTimeFrameDescription;
	/**
	 * Specifies a description of any other TimeFrame that may be used for the
	 * DealingCutOffTimeFrame
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TimeFrame3#mmOtherTimeFrameDescription
	 * TimeFrame3.mmOtherTimeFrameDescription}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTimeFrameDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a description of any other TimeFrame that may be used for the DealingCutOffTimeFrame"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOtherTimeFrameDescription = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TimeFrame3.mmOtherTimeFrameDescription);
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherTimeFrameDescription";
			definition = "Specifies a description of any other TimeFrame that may be used for the DealingCutOffTimeFrame";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected InvestmentFundClassProcessingCharacteristics relatedProcessingCharacteristics;
	/**
	 * Processing characteristics for which a cut off time frame is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmDealingCutOffTimeFrame
	 * InvestmentFundClassProcessingCharacteristics.mmDealingCutOffTimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing characteristics for which a cut off time frame is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedProcessingCharacteristics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedProcessingCharacteristics";
			definition = "Processing characteristics for which a cut off time frame is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmDealingCutOffTimeFrame;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TimeFrame";
				definition = "TimeFrame or period concept that allows definition of a period as number of days before or after a defined activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmSettlementCycle,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmDealingCutOffTimeFrame);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProcessingCharacteristics1.mmDealingCutOffTimeFrame, com.tools20022.repository.msg.ProcessingCharacteristics2.mmDealingCutOffTimeFrame,
						com.tools20022.repository.msg.ProcessingCharacteristics3.mmDealingCutOffTimeFrame);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TimeFrame.mmTradeMinus, com.tools20022.repository.entity.TimeFrame.mmRenunciationMinus,
						com.tools20022.repository.entity.TimeFrame.mmSubscriptionSettlementRelatedFundProcessing, com.tools20022.repository.entity.TimeFrame.mmTradePlus, com.tools20022.repository.entity.TimeFrame.mmRenunciationPlus,
						com.tools20022.repository.entity.TimeFrame.mmPrepayment, com.tools20022.repository.entity.TimeFrame.mmOtherTimeFrameDescription, com.tools20022.repository.entity.TimeFrame.mmRelatedProcessingCharacteristics);
				derivationComponent_lazy = () -> Arrays.asList(TimeFrame3Choice.mmObject(), Timeframe2Choice.mmObject(), TimeFrame3.mmObject(), TimeFrame5Choice.mmObject(), TimeFrame4Choice.mmObject(), TimeFrame1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Number getTradeMinus() {
		return tradeMinus;
	}

	public void setTradeMinus(Number tradeMinus) {
		this.tradeMinus = tradeMinus;
	}

	public Number getRenunciationMinus() {
		return renunciationMinus;
	}

	public void setRenunciationMinus(Number renunciationMinus) {
		this.renunciationMinus = renunciationMinus;
	}

	public InvestmentFundClassProcessingCharacteristics getSubscriptionSettlementRelatedFundProcessing() {
		return subscriptionSettlementRelatedFundProcessing;
	}

	public void setSubscriptionSettlementRelatedFundProcessing(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics subscriptionSettlementRelatedFundProcessing) {
		this.subscriptionSettlementRelatedFundProcessing = subscriptionSettlementRelatedFundProcessing;
	}

	public Number getTradePlus() {
		return tradePlus;
	}

	public void setTradePlus(Number tradePlus) {
		this.tradePlus = tradePlus;
	}

	public Number getRenunciationPlus() {
		return renunciationPlus;
	}

	public void setRenunciationPlus(Number renunciationPlus) {
		this.renunciationPlus = renunciationPlus;
	}

	public YesNoIndicator getPrepayment() {
		return prepayment;
	}

	public void setPrepayment(YesNoIndicator prepayment) {
		this.prepayment = prepayment;
	}

	public Max350Text getOtherTimeFrameDescription() {
		return otherTimeFrameDescription;
	}

	public void setOtherTimeFrameDescription(Max350Text otherTimeFrameDescription) {
		this.otherTimeFrameDescription = otherTimeFrameDescription;
	}

	public InvestmentFundClassProcessingCharacteristics getRelatedProcessingCharacteristics() {
		return relatedProcessingCharacteristics;
	}

	public void setRelatedProcessingCharacteristics(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics relatedProcessingCharacteristics) {
		this.relatedProcessingCharacteristics = relatedProcessingCharacteristics;
	}
}
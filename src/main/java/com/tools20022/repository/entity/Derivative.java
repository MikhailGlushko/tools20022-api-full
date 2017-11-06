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
import com.tools20022.repository.choice.AssetClassAttributes1Choice;
import com.tools20022.repository.choice.CommodityDerivate2Choice;
import com.tools20022.repository.choice.Derivative2Choice;
import com.tools20022.repository.choice.EquityDerivative3Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the parameters of a derivative instrument based on a specific
 * asset.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Derivative" src="doc-files/Derivative.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
 * Derivative.mmUnderlyingAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#mmNotionalCurrencyAndAmount
 * Derivative.mmNotionalCurrencyAndAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#mmDerivativeCovered
 * Derivative.mmDerivativeCovered}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmExerciseDate
 * Derivative.mmExerciseDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#mmInterestIncludedInPrice
 * Derivative.mmInterestIncludedInPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmTick
 * Derivative.mmTick}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmExercisePrice
 * Derivative.mmExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#mmNotionalCurrency
 * Derivative.mmNotionalCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmVersionNumber
 * Derivative.mmVersionNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Option Option}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Future Future}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Swaps Swaps}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmDerivative
 * Asset.mmDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDerivative
 * SecuritiesPricing.mmDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedFuture
 * SecuritiesPricing.mmRelatedFuture}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice#mmBoth
 * AssetClassAttributes1Choice.mmBoth}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2#mmCommodity
 * AssetClass2.mmCommodity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2#mmInterest
 * AssetClass2.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2#mmForeignExchange
 * AssetClass2.mmForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmAssetClassSpecificAttributes
 * DerivativeInstrument6.mmAssetClassSpecificAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmEmissionAllowance
 * Derivative2Choice.mmEmissionAllowance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes1
 * DerivativeBasicAttributes1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes2
 * DerivativeBasicAttributes2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
 * FutureOrOptionDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
 * UnsecuredMarketTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2
 * UnsecuredMarketTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
 * UnsecuredMarketTransaction3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice
 * AssetClassAttributes1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeInterest2
 * DerivativeInterest2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClassAttributes1
 * AssetClassAttributes1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeForeignExchange2
 * DerivativeForeignExchange2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeInterest3
 * DerivativeInterest3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3
 * DerivativeForeignExchange3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeInstrument5
 * DerivativeInstrument5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EquityDerivative2
 * EquityDerivative2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.EquityDerivative3Choice
 * EquityDerivative3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeDerivative2
 * ForeignExchangeDerivative2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractForDifference2
 * ContractForDifference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestRateDerivative5
 * InterestRateDerivative5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BondDerivative2
 * BondDerivative2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommodityDerivate4
 * CommodityDerivate4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CommodityDerivate2Choice
 * CommodityDerivate2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeInstrument6
 * DerivativeInstrument6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Derivative2Choice
 * Derivative2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4
 * UnsecuredMarketTransaction4}</li>
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
 * "Derivative"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the parameters of a derivative instrument based on a specific asset."
 * </li>
 * </ul>
 */
public class Derivative extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Asset> underlyingAsset;
	/**
	 * Specifies the underlying asset of the derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmDerivative
	 * Asset.mmDerivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Future2#mmAdditionalUnderlyingAttributes
	 * Future2.mmAdditionalUnderlyingAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmUnderlyingInstrumentAssetClass
	 * TransparencyDataReport10.mmUnderlyingInstrumentAssetClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmUnderlyingInstrument
	 * DerivativeInstrument5.mmUnderlyingInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EquityDerivative2#mmUnderlyingType
	 * EquityDerivative2.mmUnderlyingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractForDifference2#mmUnderlyingType
	 * ContractForDifference2.mmUnderlyingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmUnderlyingType
	 * InterestRateDerivative5.mmUnderlyingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmUnderlyingInstrument
	 * DerivativeInstrument6.mmUnderlyingInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmCommodity
	 * Derivative2Choice.mmCommodity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmInterestRate
	 * Derivative2Choice.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmForeignExchange
	 * Derivative2Choice.mmForeignExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmEquity
	 * Derivative2Choice.mmEquity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingAsset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying asset of the derivative."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUnderlyingAsset = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Future2.mmAdditionalUnderlyingAttributes, com.tools20022.repository.msg.TransparencyDataReport10.mmUnderlyingInstrumentAssetClass,
					com.tools20022.repository.msg.DerivativeInstrument5.mmUnderlyingInstrument, com.tools20022.repository.msg.EquityDerivative2.mmUnderlyingType, com.tools20022.repository.msg.ContractForDifference2.mmUnderlyingType,
					com.tools20022.repository.msg.InterestRateDerivative5.mmUnderlyingType, com.tools20022.repository.msg.DerivativeInstrument6.mmUnderlyingInstrument, com.tools20022.repository.choice.Derivative2Choice.mmCommodity,
					com.tools20022.repository.choice.Derivative2Choice.mmInterestRate, com.tools20022.repository.choice.Derivative2Choice.mmForeignExchange, com.tools20022.repository.choice.Derivative2Choice.mmEquity);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingAsset";
			definition = "Specifies the underlying asset of the derivative.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.mmDerivative;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Asset.mmObject();
		}
	};
	protected CurrencyAndAmount notionalCurrencyAndAmount;
	/**
	 * Amount underlying a financial derivatives contract necessary for
	 * calculating payments or receipts.
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
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes1#mmNotionalCurrencyAndAmount
	 * DerivativeBasicAttributes1.mmNotionalCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes2#mmNotionalCurrencyAndAmount
	 * DerivativeBasicAttributes2.mmNotionalCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmCashAmount
	 * UnderlyingAttributes.mmCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#mmCashAmount
	 * UnderlyingAttributes2.mmCashAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrencyAndAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount underlying a financial derivatives contract necessary for calculating payments or receipts."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNotionalCurrencyAndAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DerivativeBasicAttributes1.mmNotionalCurrencyAndAmount, com.tools20022.repository.msg.DerivativeBasicAttributes2.mmNotionalCurrencyAndAmount,
					com.tools20022.repository.msg.UnderlyingAttributes.mmCashAmount, com.tools20022.repository.msg.UnderlyingAttributes2.mmCashAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotionalCurrencyAndAmount";
			definition = "Amount underlying a financial derivatives contract necessary for calculating payments or receipts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected YesNoIndicator derivativeCovered;
	/**
	 * Indicates whether the derivative product is covered or not by an
	 * underlying financial instrument position.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmCoveredIndicator
	 * FinancialInstrumentAttributes1.mmCoveredIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#mmDerivativeCovered
	 * Order3.mmDerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmDerivativeCovered
	 * Order16.mmDerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmDerivativeCovered
	 * Order14.mmDerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmCoveredIndicator
	 * FinancialInstrumentAttributes31.mmCoveredIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmDerivativeCovered
	 * Order9.mmDerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegDerivativeCoveredIndicator
	 * InstrumentLeg3.mmLegDerivativeCoveredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmCoveredIndicator
	 * FinancialInstrumentAttributes2.mmCoveredIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmDerivativeCovered
	 * Order6.mmDerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmDerivativeCovered
	 * Order17.mmDerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmDerivativeCovered
	 * Order18.mmDerivativeCovered}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeCovered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the derivative product is covered or not by an underlying financial instrument position."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDerivativeCovered = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmCoveredIndicator, com.tools20022.repository.msg.Order3.mmDerivativeCovered,
					com.tools20022.repository.msg.Order16.mmDerivativeCovered, com.tools20022.repository.msg.Order14.mmDerivativeCovered, com.tools20022.repository.msg.FinancialInstrumentAttributes31.mmCoveredIndicator,
					com.tools20022.repository.msg.Order9.mmDerivativeCovered, com.tools20022.repository.msg.InstrumentLeg3.mmLegDerivativeCoveredIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes2.mmCoveredIndicator,
					com.tools20022.repository.msg.Order6.mmDerivativeCovered, com.tools20022.repository.msg.Order17.mmDerivativeCovered, com.tools20022.repository.msg.Order18.mmDerivativeCovered);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DerivativeCovered";
			definition = "Indicates whether the derivative product is covered or not by an underlying financial instrument position.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ISODateTime exerciseDate;
	/**
	 * Date on which the derivative is exercised.
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
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1#mmExerciseDate
	 * SecurityInstrumentDescription1.mmExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription2#mmExerciseDate
	 * SecurityInstrumentDescription2.mmExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmExpiryDate
	 * DerivativeInstrument5.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmExpiryDate
	 * DerivativeInstrument6.mmExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExerciseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the derivative is exercised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExerciseDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityInstrumentDescription1.mmExerciseDate, com.tools20022.repository.msg.SecurityInstrumentDescription2.mmExerciseDate,
					com.tools20022.repository.msg.DerivativeInstrument5.mmExpiryDate, com.tools20022.repository.msg.DerivativeInstrument6.mmExpiryDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExerciseDate";
			definition = "Date on which the derivative is exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected YesNoIndicator interestIncludedInPrice;
	/**
	 * Indicates whether the given derivative price includes a prorated accrued
	 * interest component.
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestIncludedInPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the given derivative price includes a prorated accrued interest component."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInterestIncludedInPrice = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestIncludedInPrice";
			definition = "Indicates whether the given derivative price includes a prorated accrued interest component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SecuritiesPricing tick;
	/**
	 * Minimum price increment with which the contract may be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedFuture
	 * SecuritiesPricing.mmRelatedFuture}</li>
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
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tick"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum price increment with which the contract may be traded."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTick = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tick";
			definition = "Minimum price increment with which the contract may be traded.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRelatedFuture;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing exercisePrice;
	/**
	 * Predetermined price at which the holder of a derivative will have to buy
	 * or sell the underlying instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDerivative
	 * SecuritiesPricing.mmDerivative}</li>
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
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmExercisePrice
	 * FinancialInstrumentAttributes8.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmExercisePrice
	 * FinancialInstrumentAttributes20.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmExercisePrice
	 * FinancialInstrumentAttributes35.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmExercisePrice
	 * FinancialInstrumentAttributes41.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails2#mmExercisePrice
	 * PriceDetails2.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails4#mmExercisePrice
	 * PriceDetails4.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails3#mmExercisePrice
	 * PriceDetails3.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails5#mmExercisePrice
	 * PriceDetails5.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmExercisePrice
	 * FinancialInstrumentAttributes4.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmExercisePrice
	 * FinancialInstrumentAttributes13.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmExercisePrice
	 * FinancialInstrumentAttributes21.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmExercisePrice
	 * FinancialInstrumentAttributes26.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmExercisePrice
	 * FinancialInstrumentAttributes36.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmExercisePrice
	 * FinancialInstrumentAttributes42.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmExercisePrice
	 * FinancialInstrumentAttributes27.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmExercisePrice
	 * FinancialInstrumentAttributes14.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmExercisePrice
	 * FinancialInstrumentAttributes30.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmExercisePrice
	 * FinancialInstrumentAttributes28.mmExercisePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmExercisePrice
	 * Future1.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmExercisePrice
	 * FinancialInstrumentAttributes31.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmExercisePrice
	 * FinancialInstrumentAttributes44.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmExercisePrice
	 * FinancialInstrumentAttributes15.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmExercisePrice
	 * FinancialInstrumentAttributes29.mmExercisePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future2#mmExercisePrice
	 * Future2.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmExercisePrice
	 * FinancialInstrumentAttributes2.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmExercisePrice
	 * FinancialInstrumentAttributes63.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmExercisePrice
	 * FinancialInstrumentAttributes64.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmExercisePrice
	 * FinancialInstrumentAttributes75.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmExercisePrice
	 * FinancialInstrumentAttributes78.mmExercisePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder of a derivative will have to buy or sell the underlying instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExercisePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.mmExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes20.mmExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.mmExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes41.mmExercisePrice, com.tools20022.repository.msg.PriceDetails2.mmExercisePrice,
					com.tools20022.repository.msg.PriceDetails4.mmExercisePrice, com.tools20022.repository.msg.PriceDetails3.mmExercisePrice, com.tools20022.repository.msg.PriceDetails5.mmExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.mmExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes13.mmExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.mmExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes26.mmExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes42.mmExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.mmExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes14.mmExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.mmExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes28.mmExercisePrice, com.tools20022.repository.msg.Future1.mmExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.mmExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes44.mmExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.mmExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes29.mmExercisePrice, com.tools20022.repository.msg.Future2.mmExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.mmExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes63.mmExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.mmExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes75.mmExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.mmExercisePrice);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExercisePrice";
			definition = "Predetermined price at which the holder of a derivative will have to buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmDerivative;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected CurrencyCode notionalCurrency;
	/**
	 * Currency of the underlying a financial derivatives contract necessary for
	 * calculating payments or receipts.
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
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmNotionalCurrency
	 * SecurityInstrumentDescription9.mmNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest2#mmOtherNotionalCurrency
	 * DerivativeInterest2.mmOtherNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmNotionalCurrency
	 * SecurityInstrumentDescription11.mmNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange2#mmOtherNotionalCurrency
	 * DerivativeForeignExchange2.mmOtherNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmOtherNotionalCurrency
	 * DerivativeInterest3.mmOtherNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3#mmOtherNotionalCurrency
	 * DerivativeForeignExchange3.mmOtherNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2#mmNotionalCurrency
	 * CreditDefaultSwapSingleName2.mmNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#mmNotionalCurrency
	 * CreditDefaultSwapIndex2.mmNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommodityDerivate4#mmNotionalCurrency
	 * CommodityDerivate4.mmNotionalCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency of the underlying a financial derivatives contract necessary for calculating payments or receipts."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNotionalCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityInstrumentDescription9.mmNotionalCurrency, com.tools20022.repository.msg.DerivativeInterest2.mmOtherNotionalCurrency,
					com.tools20022.repository.msg.SecurityInstrumentDescription11.mmNotionalCurrency, com.tools20022.repository.msg.DerivativeForeignExchange2.mmOtherNotionalCurrency,
					com.tools20022.repository.msg.DerivativeInterest3.mmOtherNotionalCurrency, com.tools20022.repository.msg.DerivativeForeignExchange3.mmOtherNotionalCurrency,
					com.tools20022.repository.msg.CreditDefaultSwapSingleName2.mmNotionalCurrency, com.tools20022.repository.msg.CreditDefaultSwapIndex2.mmNotionalCurrency,
					com.tools20022.repository.msg.CommodityDerivate4.mmNotionalCurrency);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotionalCurrency";
			definition = "Currency of the underlying a financial derivatives contract necessary for calculating payments or receipts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected Number versionNumber;
	/**
	 * Number allocated by options exchanges to record that an option has
	 * undergone a change in its contract specifications (particularly
	 * adjustment of the strike price)
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
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmVersionNumber
	 * Option1.mmVersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmVersionNumber
	 * FinancialInstrumentAttributes31.mmVersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmVersionNumber
	 * FinancialInstrumentAttributes44.mmVersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmVersionNumber
	 * FinancialInstrumentAttributes2.mmVersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#mmVersion
	 * CreditDefaultSwapIndex2.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VersionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number allocated by options exchanges to record that an option has undergone a change in its contract specifications (particularly adjustment of the strike price)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmVersionNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.mmVersionNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes31.mmVersionNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.mmVersionNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes2.mmVersionNumber,
					com.tools20022.repository.msg.CreditDefaultSwapIndex2.mmVersion);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VersionNumber";
			definition = "Number allocated by options exchanges to record that an option has undergone a change in its contract specifications (particularly adjustment of the strike price)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Derivative";
				definition = "Specifies the parameters of a derivative instrument based on a specific asset.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.mmDerivative, com.tools20022.repository.entity.SecuritiesPricing.mmDerivative,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedFuture);
				derivationElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.choice.AssetClassAttributes1Choice.mmBoth, com.tools20022.repository.msg.AssetClass2.mmCommodity, com.tools20022.repository.msg.AssetClass2.mmInterest,
								com.tools20022.repository.msg.AssetClass2.mmForeignExchange, com.tools20022.repository.msg.DerivativeInstrument6.mmAssetClassSpecificAttributes,
								com.tools20022.repository.choice.Derivative2Choice.mmEmissionAllowance);
				subType_lazy = () -> Arrays.asList(Option.mmObject(), Future.mmObject(), Swaps.mmObject());
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Derivative.mmUnderlyingAsset, com.tools20022.repository.entity.Derivative.mmNotionalCurrencyAndAmount,
						com.tools20022.repository.entity.Derivative.mmDerivativeCovered, com.tools20022.repository.entity.Derivative.mmExerciseDate, com.tools20022.repository.entity.Derivative.mmInterestIncludedInPrice,
						com.tools20022.repository.entity.Derivative.mmTick, com.tools20022.repository.entity.Derivative.mmExercisePrice, com.tools20022.repository.entity.Derivative.mmNotionalCurrency,
						com.tools20022.repository.entity.Derivative.mmVersionNumber);
				derivationComponent_lazy = () -> Arrays.asList(DerivativeBasicAttributes1.mmObject(), DerivativeBasicAttributes2.mmObject(), FutureOrOptionDetails1.mmObject(), UnsecuredMarketTransaction1.mmObject(),
						UnsecuredMarketTransaction2.mmObject(), UnsecuredMarketTransaction3.mmObject(), AssetClassAttributes1Choice.mmObject(), DerivativeInterest2.mmObject(), AssetClassAttributes1.mmObject(),
						DerivativeForeignExchange2.mmObject(), DerivativeInterest3.mmObject(), DerivativeForeignExchange3.mmObject(), DerivativeInstrument5.mmObject(), EquityDerivative2.mmObject(), EquityDerivative3Choice.mmObject(),
						ForeignExchangeDerivative2.mmObject(), ContractForDifference2.mmObject(), InterestRateDerivative5.mmObject(), BondDerivative2.mmObject(), CommodityDerivate4.mmObject(), CommodityDerivate2Choice.mmObject(),
						DerivativeInstrument6.mmObject(), Derivative2Choice.mmObject(), UnsecuredMarketTransaction4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<Asset> getUnderlyingAsset() {
		return underlyingAsset;
	}

	public void setUnderlyingAsset(List<Asset> underlyingAsset) {
		this.underlyingAsset = underlyingAsset;
	}

	public CurrencyAndAmount getNotionalCurrencyAndAmount() {
		return notionalCurrencyAndAmount;
	}

	public void setNotionalCurrencyAndAmount(CurrencyAndAmount notionalCurrencyAndAmount) {
		this.notionalCurrencyAndAmount = notionalCurrencyAndAmount;
	}

	public YesNoIndicator getDerivativeCovered() {
		return derivativeCovered;
	}

	public void setDerivativeCovered(YesNoIndicator derivativeCovered) {
		this.derivativeCovered = derivativeCovered;
	}

	public ISODateTime getExerciseDate() {
		return exerciseDate;
	}

	public void setExerciseDate(ISODateTime exerciseDate) {
		this.exerciseDate = exerciseDate;
	}

	public YesNoIndicator getInterestIncludedInPrice() {
		return interestIncludedInPrice;
	}

	public void setInterestIncludedInPrice(YesNoIndicator interestIncludedInPrice) {
		this.interestIncludedInPrice = interestIncludedInPrice;
	}

	public SecuritiesPricing getTick() {
		return tick;
	}

	public void setTick(com.tools20022.repository.entity.SecuritiesPricing tick) {
		this.tick = tick;
	}

	public SecuritiesPricing getExercisePrice() {
		return exercisePrice;
	}

	public void setExercisePrice(com.tools20022.repository.entity.SecuritiesPricing exercisePrice) {
		this.exercisePrice = exercisePrice;
	}

	public CurrencyCode getNotionalCurrency() {
		return notionalCurrency;
	}

	public void setNotionalCurrency(CurrencyCode notionalCurrency) {
		this.notionalCurrency = notionalCurrency;
	}

	public Number getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(Number versionNumber) {
		this.versionNumber = versionNumber;
	}
}
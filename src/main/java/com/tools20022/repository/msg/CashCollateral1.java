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
import com.tools20022.repository.codeset.DepositType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Money;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides details about the cash posted as collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashCollateral1#mmDepositAmount
 * CashCollateral1.mmDepositAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral1#mmDepositType
 * CashCollateral1.mmDepositType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral1#mmMaturityDate
 * CashCollateral1.mmMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral1#mmValueDate
 * CashCollateral1.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral1#mmExchangeRate
 * CashCollateral1.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashCollateral1#mmCollateralValue
 * CashCollateral1.mmCollateralValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral1#mmHaircut
 * CashCollateral1.mmHaircut}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Money Money}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashCollateral1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details about the cash posted as collateral."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral3
 * CashCollateral3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral4
 * CashCollateral4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral2
 * CashCollateral2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CashCollateral1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount depositAmount;
	/**
	 * Amount of the deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Money#mmCashAmount
	 * Money.mmCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1
	 * CashCollateral1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the deposit."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#mmDepositAmount
	 * CashCollateral3.mmDepositAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmDepositAmount
	 * CashCollateral4.mmDepositAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#mmDepositAmount
	 * CashCollateral2.mmDepositAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDepositAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Money.mmCashAmount;
			componentContext_lazy = () -> CashCollateral1.mmObject();
			isDerived = false;
			xmlTag = "DpstAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAmount";
			definition = "Amount of the deposit.";
			nextVersions_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.CashCollateral3.mmDepositAmount, com.tools20022.repository.msg.CashCollateral4.mmDepositAmount, com.tools20022.repository.msg.CashCollateral2.mmDepositAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected DepositType1Code depositType;
	/**
	 * Specifies whether the deposit is fixed term or call/notice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DepositType1Code
	 * DepositType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deposit#mmDepositType
	 * Deposit.mmDepositType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1
	 * CashCollateral1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the deposit is fixed term or call/notice."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#mmDepositType
	 * CashCollateral3.mmDepositType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmDepositType
	 * CashCollateral4.mmDepositType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#mmDepositType
	 * CashCollateral2.mmDepositType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDepositType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Deposit.mmDepositType;
			componentContext_lazy = () -> CashCollateral1.mmObject();
			isDerived = false;
			xmlTag = "DpstTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositType";
			definition = "Specifies whether the deposit is fixed term or call/notice.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateral3.mmDepositType, com.tools20022.repository.msg.CashCollateral4.mmDepositType, com.tools20022.repository.msg.CashCollateral2.mmDepositType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DepositType1Code.mmObject();
		}
	};
	protected ISODate maturityDate;
	/**
	 * Planned final repayment date at the time of issuance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1
	 * CashCollateral1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned final repayment date at the time of issuance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#mmMaturityDate
	 * CashCollateral3.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmMaturityDate
	 * CashCollateral4.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#mmMaturityDate
	 * CashCollateral2.mmMaturityDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Asset.mmMaturityDate;
			componentContext_lazy = () -> CashCollateral1.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateral3.mmMaturityDate, com.tools20022.repository.msg.CashCollateral4.mmMaturityDate, com.tools20022.repository.msg.CashCollateral2.mmMaturityDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate valueDate;
	/**
	 * Valuation date of the cash taken as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateralValuationDate
	 * CollateralValuation.mmCollateralValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1
	 * CashCollateral1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Valuation date of the cash taken as collateral."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#mmValueDate
	 * CashCollateral3.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmValueDate
	 * CashCollateral4.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#mmValueDate
	 * CashCollateral2.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmCollateralValuationDate;
			componentContext_lazy = () -> CashCollateral1.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Valuation date of the cash taken as collateral.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateral3.mmValueDate, com.tools20022.repository.msg.CashCollateral4.mmValueDate, com.tools20022.repository.msg.CashCollateral2.mmValueDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected BaseOneRate exchangeRate;
	/**
	 * Exchange rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
	 * AssetHolding.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1
	 * CashCollateral1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange rate."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#mmExchangeRate
	 * CashCollateral3.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmExchangeRate
	 * CashCollateral4.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#mmExchangeRate
	 * CashCollateral2.mmExchangeRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmExchangeRate;
			componentContext_lazy = () -> CashCollateral1.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Exchange rate.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateral3.mmExchangeRate, com.tools20022.repository.msg.CashCollateral4.mmExchangeRate, com.tools20022.repository.msg.CashCollateral2.mmExchangeRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount collateralValue;
	/**
	 * Value of the collateral after taking into account the haircut.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmRiskAdjustedValue
	 * AssetHolding.mmRiskAdjustedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1
	 * CashCollateral1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral after taking into account the haircut."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#mmCollateralValue
	 * CashCollateral3.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmCollateralValue
	 * CashCollateral4.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#mmCollateralValue
	 * CashCollateral2.mmCollateralValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmRiskAdjustedValue;
			componentContext_lazy = () -> CashCollateral1.mmObject();
			isDerived = false;
			xmlTag = "CollVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValue";
			definition = "Value of the collateral after taking into account the haircut.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateral3.mmCollateralValue, com.tools20022.repository.msg.CashCollateral4.mmCollateralValue,
					com.tools20022.repository.msg.CashCollateral2.mmCollateralValue);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate haircut;
	/**
	 * Haircut or valuation factor on the collateral expressed as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmHaircut
	 * HaircutValuation.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1
	 * CashCollateral1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hrcut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Haircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut or valuation factor on the collateral expressed as a percentage."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral3#mmHaircut
	 * CashCollateral3.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral4#mmHaircut
	 * CashCollateral4.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral2#mmHaircut
	 * CashCollateral2.mmHaircut}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHaircut = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmHaircut;
			componentContext_lazy = () -> CashCollateral1.mmObject();
			isDerived = false;
			xmlTag = "Hrcut";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Haircut";
			definition = "Haircut or valuation factor on the collateral expressed as a percentage.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateral3.mmHaircut, com.tools20022.repository.msg.CashCollateral4.mmHaircut, com.tools20022.repository.msg.CashCollateral2.mmHaircut);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateral1.mmDepositAmount, com.tools20022.repository.msg.CashCollateral1.mmDepositType,
						com.tools20022.repository.msg.CashCollateral1.mmMaturityDate, com.tools20022.repository.msg.CashCollateral1.mmValueDate, com.tools20022.repository.msg.CashCollateral1.mmExchangeRate,
						com.tools20022.repository.msg.CashCollateral1.mmCollateralValue, com.tools20022.repository.msg.CashCollateral1.mmHaircut);
				trace_lazy = () -> Money.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CashCollateral1";
				definition = "Provides details about the cash posted as collateral.";
				nextVersions_lazy = () -> Arrays.asList(CashCollateral3.mmObject(), CashCollateral4.mmObject(), CashCollateral2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(ActiveCurrencyAndAmount depositAmount) {
		this.depositAmount = depositAmount;
	}

	public DepositType1Code getDepositType() {
		return depositType;
	}

	public void setDepositType(DepositType1Code depositType) {
		this.depositType = depositType;
	}

	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
	}

	public BaseOneRate getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public ActiveCurrencyAndAmount getCollateralValue() {
		return collateralValue;
	}

	public void setCollateralValue(ActiveCurrencyAndAmount collateralValue) {
		this.collateralValue = collateralValue;
	}

	public PercentageRate getHaircut() {
		return haircut;
	}

	public void setHaircut(PercentageRate haircut) {
		this.haircut = haircut;
	}
}
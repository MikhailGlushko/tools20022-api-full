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
import com.tools20022.repository.codeset.FlowDirectionType1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.entity.FundsCashFlow;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Net cash movement to a fund as a result of investment funds transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NetCashForecast3#mmNetAmount
 * NetCashForecast3.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetCashForecast3#mmNetUnitsNumber
 * NetCashForecast3.mmNetUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetCashForecast3#mmFlowDirection
 * NetCashForecast3.mmFlowDirection}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
 * FundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03#mmConsolidatedNetCashForecast
 * FundConfirmedCashForecastReportV03.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03#mmConsolidatedNetCashForecast
 * FundDetailedConfirmedCashForecastReportV03.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03#mmConsolidatedNetCashForecast
 * FundDetailedEstimatedCashForecastReportV03.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmConsolidatedNetCashForecast
 * FundEstimatedCashForecastReportV03.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmConsolidatedNetCashForecast
 * FundDetailedEstimatedCashForecastReportV04.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04#mmConsolidatedNetCashForecast
 * FundConfirmedCashForecastReportV04.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmConsolidatedNetCashForecast
 * FundEstimatedCashForecastReportV04.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04#mmConsolidatedNetCashForecast
 * FundDetailedConfirmedCashForecastReportV04.mmConsolidatedNetCashForecast}</li>
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
 * "NetCashForecast3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net cash movement to a fund as a result of investment funds transactions."</li>
 * </ul>
 */
public class NetCashForecast3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveOrHistoricCurrencyAndAmount netAmount;
	/**
	 * Net amount of the cash flow, expressed as an amount of money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAmount
	 * SecuritiesQuantity.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast3
	 * NetCashForecast3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net amount of the cash flow, expressed as an amount of money."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> NetCashForecast3.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Net amount of the cash flow, expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 netUnitsNumber;
	/**
	 * Net amount, expressed as a number of units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
	 * SecuritiesQuantity.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast3
	 * NetCashForecast3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net amount, expressed as a number of units."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> NetCashForecast3.mmObject();
			isDerived = false;
			xmlTag = "NetUnitsNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetUnitsNumber";
			definition = "Net amount, expressed as a number of units.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected FlowDirectionType1Code flowDirection;
	/**
	 * Specifies the direction of the cash flow from the perspective of the
	 * fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FlowDirectionType1Code
	 * FlowDirectionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFlowDirection
	 * FundsCashFlow.mmFlowDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast3
	 * NetCashForecast3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FlowDrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlowDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the direction of the cash flow from the perspective of the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFlowDirection = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmFlowDirection;
			componentContext_lazy = () -> NetCashForecast3.mmObject();
			isDerived = false;
			xmlTag = "FlowDrctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlowDirection";
			definition = "Specifies the direction of the cash flow from the perspective of the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FlowDirectionType1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetCashForecast3.mmNetAmount, com.tools20022.repository.msg.NetCashForecast3.mmNetUnitsNumber,
						com.tools20022.repository.msg.NetCashForecast3.mmFlowDirection);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03.mmConsolidatedNetCashForecast,
						com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03.mmConsolidatedNetCashForecast,
						com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03.mmConsolidatedNetCashForecast, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.mmConsolidatedNetCashForecast,
						com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04.mmConsolidatedNetCashForecast, com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04.mmConsolidatedNetCashForecast,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.mmConsolidatedNetCashForecast, com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04.mmConsolidatedNetCashForecast);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NetCashForecast3";
				definition = "Net cash movement to a fund as a result of investment funds transactions.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(ActiveOrHistoricCurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
	}

	public FinancialInstrumentQuantity1 getNetUnitsNumber() {
		return netUnitsNumber;
	}

	public void setNetUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 netUnitsNumber) {
		this.netUnitsNumber = netUnitsNumber;
	}

	public FlowDirectionType1Code getFlowDirection() {
		return flowDirection;
	}

	public void setFlowDirection(FlowDirectionType1Code flowDirection) {
		this.flowDirection = flowDirection;
	}
}
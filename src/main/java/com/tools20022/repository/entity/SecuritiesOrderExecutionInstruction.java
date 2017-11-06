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
import com.tools20022.repository.codeset.StayOnSideTypeCode;
import com.tools20022.repository.datatype.AllOrNoneIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.SecuritiesExecutionInstructions1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the instructions for order handling
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesOrderExecutionInstruction"
 * src="doc-files/SecuritiesOrderExecutionInstruction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmAllOrNone
 * SecuritiesOrderExecutionInstruction.mmAllOrNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCallFirst
 * SecuritiesOrderExecutionInstruction.mmCallFirst}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCross
 * SecuritiesOrderExecutionInstruction.mmCross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCustomerDisplay
 * SecuritiesOrderExecutionInstruction.mmCustomerDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmHold
 * SecuritiesOrderExecutionInstruction.mmHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmIncrease
 * SecuritiesOrderExecutionInstruction.mmIncrease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmInstitutionsOnly
 * SecuritiesOrderExecutionInstruction.mmInstitutionsOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmNonNegotiable
 * SecuritiesOrderExecutionInstruction.mmNonNegotiable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmOverTheDay
 * SecuritiesOrderExecutionInstruction.mmOverTheDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmParticipateDontInitiate
 * SecuritiesOrderExecutionInstruction.mmParticipateDontInitiate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmPercentOfVolume
 * SecuritiesOrderExecutionInstruction.mmPercentOfVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmScale
 * SecuritiesOrderExecutionInstruction.mmScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmStayOnSide
 * SecuritiesOrderExecutionInstruction.mmStayOnSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmWork
 * SecuritiesOrderExecutionInstruction.mmWork}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmGoAlong
 * SecuritiesOrderExecutionInstruction.mmGoAlong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmTryScale
 * SecuritiesOrderExecutionInstruction.mmTryScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmDoNotReduce
 * SecuritiesOrderExecutionInstruction.mmDoNotReduce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCancelOnSystemFailure
 * SecuritiesOrderExecutionInstruction.mmCancelOnSystemFailure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCancelOnTradingHalt
 * SecuritiesOrderExecutionInstruction.mmCancelOnTradingHalt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmTradeAlong
 * SecuritiesOrderExecutionInstruction.mmTradeAlong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmStrictLimit
 * SecuritiesOrderExecutionInstruction.mmStrictLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmIgnorePriceValidityChecks
 * SecuritiesOrderExecutionInstruction.mmIgnorePriceValidityChecks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmReinstateOnSystemFailure
 * SecuritiesOrderExecutionInstruction.mmReinstateOnSystemFailure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmReinstateOnTradingHalt
 * SecuritiesOrderExecutionInstruction.mmReinstateOnTradingHalt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCancelIfNotBest
 * SecuritiesOrderExecutionInstruction.mmCancelIfNotBest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmExternalRoutingAllowed
 * SecuritiesOrderExecutionInstruction.mmExternalRoutingAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmExternalRoutingNotAllowed
 * SecuritiesOrderExecutionInstruction.mmExternalRoutingNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmImbalanceOnly
 * SecuritiesOrderExecutionInstruction.mmImbalanceOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmIntermarketSweep
 * SecuritiesOrderExecutionInstruction.mmIntermarketSweep}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmNetting
 * SecuritiesOrderExecutionInstruction.mmNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmRelatedOrder
 * SecuritiesOrderExecutionInstruction.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmForeignExchangeNetting
 * SecuritiesOrderExecutionInstruction.mmForeignExchangeNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmStrictScale
 * SecuritiesOrderExecutionInstruction.mmStrictScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmSuspend
 * SecuritiesOrderExecutionInstruction.mmSuspend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmTryToStop
 * SecuritiesOrderExecutionInstruction.mmTryToStop}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmOrderPriceStrategy
 * SecuritiesOrderExecutionInstruction.mmOrderPriceStrategy}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmExecutionInstructions
 * SecuritiesOrder.mmExecutionInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discretion#mmRelatedOrderExecution
 * Discretion.mmRelatedOrderExecution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1
 * SecuritiesExecutionInstructions1}</li>
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
 * "SecuritiesOrderExecutionInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the instructions for order handling"</li>
 * </ul>
 */
public class SecuritiesOrderExecutionInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected AllOrNoneIndicator allOrNone;
	/**
	 * Round-lot market or limit-price order that must be executed in its
	 * entirety or not at all; unlike Fill or Kill orders, AON orders are not
	 * treated as canceled if they are not executed as soon as represented in
	 * the Trading Crowd.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AllOrNoneIndicator
	 * AllOrNoneIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmAllOrNone
	 * SecuritiesExecutionInstructions1.mmAllOrNone}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, AON orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAllOrNone = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmAllOrNone);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllOrNone";
			definition = "Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, AON orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AllOrNoneIndicator.mmObject();
		}
	};
	protected YesNoIndicator callFirst;
	/**
	 * Refers to the client before trading in order to catch all verbal
	 * instructions on trading strategy usually because the strategy is too
	 * complex or cannot be represented in the trading application.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmCallFirst
	 * SecuritiesExecutionInstructions1.mmCallFirst}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallFirst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Refers to the client before trading in order to catch all verbal instructions on trading strategy usually because the strategy is too complex or cannot be represented in the trading application."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCallFirst = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmCallFirst);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CallFirst";
			definition = "Refers to the client before trading in order to catch all verbal instructions on trading strategy usually because the strategy is too complex or cannot be represented in the trading application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator cross;
	/**
	 * Allow crossing of an order.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmCross
	 * SecuritiesExecutionInstructions1.mmCross}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allow crossing of an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCross = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmCross);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cross";
			definition = "Allow crossing of an order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator customerDisplay;
	/**
	 * Exchange or ECN required by the SEC to display limit orders in the public
	 * order book. A customer can choose not to have his limit order displayed
	 * to the public.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmCustomerDisplay
	 * SecuritiesExecutionInstructions1.mmCustomerDisplay}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDisplay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange or ECN required by the SEC to display limit orders in the public order book. A customer can choose not to have his limit order displayed to the public."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCustomerDisplay = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmCustomerDisplay);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerDisplay";
			definition = "Exchange or ECN required by the SEC to display limit orders in the public order book. A customer can choose not to have his limit order displayed to the public.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator hold;
	/**
	 * Indicates whether the firm executing the order is held to best execution
	 * requirements and may be able to make some discretionary decisions.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmHold
	 * SecuritiesExecutionInstructions1.mmHold}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the firm executing the order is held to best execution requirements and may be able to make some discretionary decisions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHold = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmHold);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Hold";
			definition = "Indicates whether the firm executing the order is held to best execution requirements and may be able to make some discretionary decisions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator increase;
	/**
	 * Indicates whether the order is to be increased in shares on the
	 * ex-dividend date as a result of a stock dividend or distribution.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmIncrease
	 * SecuritiesExecutionInstructions1.mmIncrease}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Increase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the order is to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIncrease = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmIncrease);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Increase";
			definition = "Indicates whether the order is to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator institutionsOnly;
	/**
	 * Identifies that the broker is restricted to dealing with other buy side
	 * firms.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmInstitutionsOnly
	 * SecuritiesExecutionInstructions1.mmInstitutionsOnly}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstitutionsOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies that the broker is restricted to dealing with other buy side firms."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInstitutionsOnly = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmInstitutionsOnly);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstitutionsOnly";
			definition = "Identifies that the broker is restricted to dealing with other buy side firms.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator nonNegotiable;
	/**
	 * Qualifies an asset (usually a payment instrument) of which rights cannot
	 * be transferred to a party other then the original debtor and creditor.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmNonNegotiable
	 * SecuritiesExecutionInstructions1.mmNonNegotiable}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonNegotiable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Qualifies an asset (usually a payment instrument) of which rights cannot be transferred to a party other then the original debtor and creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNonNegotiable = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmNonNegotiable);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonNegotiable";
			definition = "Qualifies an asset (usually a payment instrument) of which rights cannot be transferred to a party other then the original debtor and creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator overTheDay;
	/**
	 * Indicates whether to execute parts of the order over the course of the
	 * day. Usually done with large block orders.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmOverTheDay
	 * SecuritiesExecutionInstructions1.mmOverTheDay}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverTheDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether to execute parts of the order over the course of the day. Usually done with large block orders."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOverTheDay = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmOverTheDay);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverTheDay";
			definition = "Indicates whether to execute parts of the order over the course of the day. Usually done with large block orders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator participateDontInitiate;
	/**
	 * An order that may participate in a transaction initiated by another
	 * party, but may not initiate a transaction.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmParticipateDontInitiate
	 * SecuritiesExecutionInstructions1.mmParticipateDontInitiate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipateDontInitiate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order that may participate in a transaction initiated by another party, but may not initiate a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmParticipateDontInitiate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmParticipateDontInitiate);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParticipateDontInitiate";
			definition = "An order that may participate in a transaction initiated by another party, but may not initiate a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator percentOfVolume;
	/**
	 * Indicates that the Sender does not want all of the volume on the floor.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmPercentOfVolume
	 * SecuritiesExecutionInstructions1.mmPercentOfVolume}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentOfVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the Sender does not want all of the volume on the floor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPercentOfVolume = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmPercentOfVolume);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentOfVolume";
			definition = "Indicates that the Sender does not want all of the volume on the floor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator scale;
	/**
	 * An order to buy (or sell) a financial instrument which specifies the
	 * total amount to be bought (or sold) and the amount to be bought (or sold)
	 * at specified price variations.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmScale
	 * SecuritiesExecutionInstructions1.mmScale}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmScale = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmScale);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scale";
			definition = "An order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected StayOnSideTypeCode stayOnSide;
	/**
	 * Specifies the order limit based on the offer/bid at the time of the order
	 * submission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StayOnSideTypeCode
	 * StayOnSideTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmStayOnSide
	 * SecuritiesExecutionInstructions1.mmStayOnSide}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StayOnSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the order limit based on the offer/bid at the time of the order submission."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStayOnSide = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmStayOnSide);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StayOnSide";
			definition = "Specifies the order limit based on the offer/bid at the time of the order submission.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StayOnSideTypeCode.mmObject();
		}
	};
	protected YesNoIndicator work;
	/**
	 * Make the order active until notified.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmWork
	 * SecuritiesExecutionInstructions1.mmWork}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Work"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Make the order active until notified."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWork = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmWork);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Work";
			definition = "Make the order active until notified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator goAlong;
	/**
	 * Used for listed equity securities. Buy or sell at prices that randomly
	 * occur on the floor, participating in what trades the specialist and other
	 * players will allow.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmGoAlong
	 * SecuritiesExecutionInstructions1.mmGoAlong}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoAlong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for listed equity securities. Buy or sell at prices that randomly occur on the floor, participating in what\ntrades the specialist and other players will allow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmGoAlong = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmGoAlong);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GoAlong";
			definition = "Used for listed equity securities. Buy or sell at prices that randomly occur on the floor, participating in what\ntrades the specialist and other players will allow.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator tryScale;
	/**
	 * Order to buy (sell) a security that specifies the total amount to be
	 * bought (sold) and the amount to be bought (sold) at successively
	 * decreasing (increasing) price intervals; often placed in order to average
	 * the price.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmTryScale
	 * SecuritiesExecutionInstructions1.mmTryScale}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TryScale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order to buy (sell) a security that specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTryScale = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmTryScale);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TryScale";
			definition = "Order to buy (sell) a security that specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator doNotReduce;
	/**
	 * Indicates whether to buy, to stop order to sell, or to stop limit order
	 * to sell that is not to be reduced in price by the amount of an ordinary
	 * cash dividend on the ex-dividend date. A "do not reduce" order applies
	 * only to ordinary cash dividends; it should be reduced for other
	 * distributions - such as when a stock goes ex stock dividend or ex rights.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmDoNotReduce
	 * SecuritiesExecutionInstructions1.mmDoNotReduce}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoNotReduce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether to buy, to stop order to sell, or to stop limit order to sell that is not to be reduced in price by the amount of an ordinary cash dividend on the ex-dividend date.  A \"do not reduce\" order applies only to ordinary cash dividends; it should be reduced for other distributions - such as when a stock goes ex stock dividend or ex rights."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDoNotReduce = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmDoNotReduce);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DoNotReduce";
			definition = "Indicates whether to buy, to stop order to sell, or to stop limit order to sell that is not to be reduced in price by the amount of an ordinary cash dividend on the ex-dividend date.  A \"do not reduce\" order applies only to ordinary cash dividends; it should be reduced for other distributions - such as when a stock goes ex stock dividend or ex rights.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator cancelOnSystemFailure;
	/**
	 * If a system failure interrupts trading or order routing, attempt to
	 * cancel this order or attempt to reinstate this order, subject to time in
	 * force limitations. Note that depending on the type and severity of the
	 * failure, this might not be possible.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmCancelOnSystemFailure
	 * SecuritiesExecutionInstructions1.mmCancelOnSystemFailure}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelOnSystemFailure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a system failure interrupts trading or order routing, attempt to cancel this order or attempt to reinstate this order, subject to time in force limitations. Note that depending on the type and severity of the failure, this might not be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCancelOnSystemFailure = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmCancelOnSystemFailure);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelOnSystemFailure";
			definition = "If a system failure interrupts trading or order routing, attempt to cancel this order or attempt to reinstate this order, subject to time in force limitations. Note that depending on the type and severity of the failure, this might not be possible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator cancelOnTradingHalt;
	/**
	 * If trading in this instrument is halted, cancel this order or reinstate
	 * this order when/if trading resumes, subject to time in force limitations.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmCancelOnTradingHalt
	 * SecuritiesExecutionInstructions1.mmCancelOnTradingHalt}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelOnTradingHalt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If trading in this instrument is halted, cancel this order or reinstate this order when/if trading resumes, subject to time in force limitations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCancelOnTradingHalt = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmCancelOnTradingHalt);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelOnTradingHalt";
			definition = "If trading in this instrument is halted, cancel this order or reinstate this order when/if trading resumes, subject to time in force limitations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator tradeAlong;
	/**
	 * Indicates whether the broker has permission to handle and place the order
	 * in the market even if the broker already has its own proprietary orders
	 * for the same financial instrument placed in the market.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmTradeAlong
	 * SecuritiesExecutionInstructions1.mmTradeAlong}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAlong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the broker has permission to handle and place the order in the market even if  the broker already has its own proprietary orders for the same financial instrument placed in the market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeAlong = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmTradeAlong);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeAlong";
			definition = "Indicates whether the broker has permission to handle and place the order in the market even if  the broker already has its own proprietary orders for the same financial instrument placed in the market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator strictLimit;
	/**
	 * Limit order that must be traded at the exact limit price specified
	 * without any price improvement.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmStrictLimit
	 * SecuritiesExecutionInstructions1.mmStrictLimit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrictLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit order that must be traded at the exact limit price specified without any price improvement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStrictLimit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmStrictLimit);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrictLimit";
			definition = "Limit order that must be traded at the exact limit price specified without any price improvement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator ignorePriceValidityChecks;
	/**
	 * Disables validity checking of price fields for an order or change
	 * request.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmIgnorePriceValidityChecks
	 * SecuritiesExecutionInstructions1.mmIgnorePriceValidityChecks}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IgnorePriceValidityChecks"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disables validity checking of price fields for an order or change request."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIgnorePriceValidityChecks = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmIgnorePriceValidityChecks);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IgnorePriceValidityChecks";
			definition = "Disables validity checking of price fields for an order or change request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator reinstateOnSystemFailure;
	/**
	 * If a system failure interrupts trading or order routing, attempt to
	 * reinstate this order, subject to time in force limitations. Depending on
	 * the type and severity of the failure, this might not be possible.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmReinstateOnSystemFailure
	 * SecuritiesExecutionInstructions1.mmReinstateOnSystemFailure}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinstateOnSystemFailure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a system failure interrupts trading or order routing, attempt to reinstate this order, subject to time in force limitations. Depending on the type and severity of the failure, this might not be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReinstateOnSystemFailure = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmReinstateOnSystemFailure);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinstateOnSystemFailure";
			definition = "If a system failure interrupts trading or order routing, attempt to reinstate this order, subject to time in force limitations. Depending on the type and severity of the failure, this might not be possible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator reinstateOnTradingHalt;
	/**
	 * If trading in this instrument is halted, reinstate this order when/if
	 * trading resumes, subject to time in force limitations.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmReinstateOnTradingHalt
	 * SecuritiesExecutionInstructions1.mmReinstateOnTradingHalt}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinstateOnTradingHalt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If trading in this instrument is halted, reinstate this order when/if trading resumes, subject to time in force limitations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReinstateOnTradingHalt = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmReinstateOnTradingHalt);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinstateOnTradingHalt";
			definition = "If trading in this instrument is halted, reinstate this order when/if trading resumes, subject to time in force limitations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator cancelIfNotBest;
	/**
	 * Indicates that an order should be cancelled if it is no longer the best
	 * bid if buying, or the best offer if selling.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmCancelIfNotBest
	 * SecuritiesExecutionInstructions1.mmCancelIfNotBest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelIfNotBest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order should be cancelled if it is no longer the best bid if buying, or the best offer if selling."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCancelIfNotBest = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmCancelIfNotBest);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancelIfNotBest";
			definition = "Indicates that an order should be cancelled if it is no longer the best bid if buying, or the best offer if selling.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator externalRoutingAllowed;
	/**
	 * Indicates that an order sent to one market may be routed by that market
	 * to other external markets, especially in cases where the order locks or
	 * crosses the market and it can be executed against another markets
	 * superior price. The absence of this instruction does not imply that an
	 * order should not be routed externally; rather, the order receivers
	 * default will apply.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmExternalRoutingAllowed
	 * SecuritiesExecutionInstructions1.mmExternalRoutingAllowed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalRoutingAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order sent to one market may be routed by that market to other external markets, especially in cases where the order locks or crosses the market and it can be executed against another markets superior price. The absence of this instruction does not imply that an order should not be routed externally; rather, the order receivers default will apply."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExternalRoutingAllowed = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmExternalRoutingAllowed);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExternalRoutingAllowed";
			definition = "Indicates that an order sent to one market may be routed by that market to other external markets, especially in cases where the order locks or crosses the market and it can be executed against another markets superior price. The absence of this instruction does not imply that an order should not be routed externally; rather, the order receivers default will apply.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator externalRoutingNotAllowed;
	/**
	 * Indicates that an order sent to one market may never be routed by that
	 * market to other external markets. Should the order lock or cross the
	 * market but be unable to execute due to price protection reasons, a market
	 * may have to take alternate action, which might include rejecting the
	 * order, depending on the markets rules.The absence of this instruction
	 * does not imply that an order should be routed externally; rather, the
	 * order receivers default will apply.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmExternalRoutingNotAllowed
	 * SecuritiesExecutionInstructions1.mmExternalRoutingNotAllowed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalRoutingNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order sent to one market may never be routed by that market to other external markets. Should the order lock or cross the market but be unable to execute due to price protection reasons, a market may have to take alternate action, which might include rejecting the order, depending on the markets rules.The absence of this instruction does not imply that an order should be routed externally; rather, the order receivers default will apply."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExternalRoutingNotAllowed = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmExternalRoutingNotAllowed);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExternalRoutingNotAllowed";
			definition = "Indicates that an order sent to one market may never be routed by that market to other external markets. Should the order lock or cross the market but be unable to execute due to price protection reasons, a market may have to take alternate action, which might include rejecting the order, depending on the markets rules.The absence of this instruction does not imply that an order should be routed externally; rather, the order receivers default will apply.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator imbalanceOnly;
	/**
	 * Indicates that the order can only hit the imbalance during a call
	 * auction. The imbalance is the remaining quantity when other buy and sell
	 * orders are matched at the auction clearing price.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmImbalanceOnly
	 * SecuritiesExecutionInstructions1.mmImbalanceOnly}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImbalanceOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmImbalanceOnly = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmImbalanceOnly);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ImbalanceOnly";
			definition = "Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator intermarketSweep;
	/**
	 * Indicates that the party sending the order has taken responsibility for
	 * price protection, and the recipient of the order should execute it, if
	 * possible, without regard to protection of other markets prices. While
	 * the term "Intermarket sweep" is specific to the United States, it may be
	 * used in other markets, where appropriate, to indicate an order that
	 * should be executed without regard to price protection.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmIntermarketSweep
	 * SecuritiesExecutionInstructions1.mmIntermarketSweep}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermarketSweep"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the party sending the order has taken responsibility for price protection, and the recipient of the order should execute it, if possible, without regard to protection of other markets prices. While the term \"Intermarket sweep\" is specific to the United States, it may be used in other markets, where appropriate, to indicate an order that should be executed without regard to price protection."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIntermarketSweep = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmIntermarketSweep);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermarketSweep";
			definition = "Indicates that the party sending the order has taken responsibility for price protection, and the recipient of the order should execute it, if possible, without regard to protection of other markets prices. While the term \"Intermarket sweep\" is specific to the United States, it may be used in other markets, where appropriate, to indicate an order that should be executed without regard to price protection.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator netting;
	/**
	 * Used when sending multiple orders indicating that you would be 'netting'
	 * the F/X later.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesExecutionInstructions1#mmNetting
	 * SecuritiesExecutionInstructions1.mmNetting}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when sending multiple orders indicating that you would be 'netting' the F/X later."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNetting = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesExecutionInstructions1.mmNetting);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Used when sending multiple orders indicating that you would be 'netting' the F/X later.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * Order which is executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmExecutionInstructions
	 * SecuritiesOrder.mmExecutionInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order which is executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order which is executed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmExecutionInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected YesNoIndicator foreignExchangeNetting;
	/**
	 * Reduction of transfers of cash (resulting of a foreign exchange operation
	 * between subsidiaries or separate companies) to a net amount.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeNetting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reduction of transfers of cash (resulting of a foreign exchange operation between subsidiaries or separate companies) to a net amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmForeignExchangeNetting = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeNetting";
			definition = "Reduction of transfers of cash (resulting of a foreign exchange operation between subsidiaries or separate companies) to a net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator strictScale;
	/**
	 * Order to buy (sell) a security that strictly specifies the total amount
	 * to be bought (sold) and the amount to be bought (sold) at successively
	 * decreasing (increasing) price intervals; often placed in order to average
	 * the price.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrictScale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order to buy (sell) a security that strictly specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStrictScale = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrictScale";
			definition = "Order to buy (sell) a security that strictly specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator suspend;
	/**
	 * Used in specialist driven markets to direct the specialist to try to
	 * suspend the order.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used in specialist driven markets to direct the specialist to try to suspend the order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSuspend = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Suspend";
			definition = "Used in specialist driven markets to direct the specialist to try to suspend the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator tryToStop;
	/**
	 * Used in specialist driven markets to direct the specialist to try and
	 * stop the order.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TryToStop"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used in specialist driven markets to direct the specialist to try and stop the order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTryToStop = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TryToStop";
			definition = "Used in specialist driven markets to direct the specialist to try and stop the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Discretion orderPriceStrategy;
	/**
	 * Strategy used to obtain the order price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmRelatedOrderExecution
	 * Discretion.mmRelatedOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Discretion
	 * Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#mmDiscretion
	 * Order6.mmDiscretion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderPriceStrategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy used to obtain the order price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrderPriceStrategy = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order6.mmDiscretion);
			elementContext_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderPriceStrategy";
			definition = "Strategy used to obtain the order price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Discretion.mmRelatedOrderExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Discretion.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrderExecutionInstruction";
				definition = "Identifies the instructions for order handling";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrder.mmExecutionInstructions, com.tools20022.repository.entity.Discretion.mmRelatedOrderExecution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmAllOrNone, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCallFirst,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCross, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCustomerDisplay,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmHold, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmIncrease,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmInstitutionsOnly, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmNonNegotiable,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmOverTheDay, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmParticipateDontInitiate,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmPercentOfVolume, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmScale,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmStayOnSide, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmWork,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmGoAlong, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmTryScale,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmDoNotReduce, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCancelOnSystemFailure,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCancelOnTradingHalt, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmTradeAlong,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmStrictLimit, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmIgnorePriceValidityChecks,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmReinstateOnSystemFailure, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmReinstateOnTradingHalt,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCancelIfNotBest, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmExternalRoutingAllowed,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmExternalRoutingNotAllowed, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmImbalanceOnly,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmIntermarketSweep, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmNetting,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmForeignExchangeNetting,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmStrictScale, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmSuspend,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmTryToStop, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmOrderPriceStrategy);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesExecutionInstructions1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AllOrNoneIndicator getAllOrNone() {
		return allOrNone;
	}

	public void setAllOrNone(AllOrNoneIndicator allOrNone) {
		this.allOrNone = allOrNone;
	}

	public YesNoIndicator getCallFirst() {
		return callFirst;
	}

	public void setCallFirst(YesNoIndicator callFirst) {
		this.callFirst = callFirst;
	}

	public YesNoIndicator getCross() {
		return cross;
	}

	public void setCross(YesNoIndicator cross) {
		this.cross = cross;
	}

	public YesNoIndicator getCustomerDisplay() {
		return customerDisplay;
	}

	public void setCustomerDisplay(YesNoIndicator customerDisplay) {
		this.customerDisplay = customerDisplay;
	}

	public YesNoIndicator getHold() {
		return hold;
	}

	public void setHold(YesNoIndicator hold) {
		this.hold = hold;
	}

	public YesNoIndicator getIncrease() {
		return increase;
	}

	public void setIncrease(YesNoIndicator increase) {
		this.increase = increase;
	}

	public YesNoIndicator getInstitutionsOnly() {
		return institutionsOnly;
	}

	public void setInstitutionsOnly(YesNoIndicator institutionsOnly) {
		this.institutionsOnly = institutionsOnly;
	}

	public YesNoIndicator getNonNegotiable() {
		return nonNegotiable;
	}

	public void setNonNegotiable(YesNoIndicator nonNegotiable) {
		this.nonNegotiable = nonNegotiable;
	}

	public YesNoIndicator getOverTheDay() {
		return overTheDay;
	}

	public void setOverTheDay(YesNoIndicator overTheDay) {
		this.overTheDay = overTheDay;
	}

	public YesNoIndicator getParticipateDontInitiate() {
		return participateDontInitiate;
	}

	public void setParticipateDontInitiate(YesNoIndicator participateDontInitiate) {
		this.participateDontInitiate = participateDontInitiate;
	}

	public YesNoIndicator getPercentOfVolume() {
		return percentOfVolume;
	}

	public void setPercentOfVolume(YesNoIndicator percentOfVolume) {
		this.percentOfVolume = percentOfVolume;
	}

	public YesNoIndicator getScale() {
		return scale;
	}

	public void setScale(YesNoIndicator scale) {
		this.scale = scale;
	}

	public StayOnSideTypeCode getStayOnSide() {
		return stayOnSide;
	}

	public void setStayOnSide(StayOnSideTypeCode stayOnSide) {
		this.stayOnSide = stayOnSide;
	}

	public YesNoIndicator getWork() {
		return work;
	}

	public void setWork(YesNoIndicator work) {
		this.work = work;
	}

	public YesNoIndicator getGoAlong() {
		return goAlong;
	}

	public void setGoAlong(YesNoIndicator goAlong) {
		this.goAlong = goAlong;
	}

	public YesNoIndicator getTryScale() {
		return tryScale;
	}

	public void setTryScale(YesNoIndicator tryScale) {
		this.tryScale = tryScale;
	}

	public YesNoIndicator getDoNotReduce() {
		return doNotReduce;
	}

	public void setDoNotReduce(YesNoIndicator doNotReduce) {
		this.doNotReduce = doNotReduce;
	}

	public YesNoIndicator getCancelOnSystemFailure() {
		return cancelOnSystemFailure;
	}

	public void setCancelOnSystemFailure(YesNoIndicator cancelOnSystemFailure) {
		this.cancelOnSystemFailure = cancelOnSystemFailure;
	}

	public YesNoIndicator getCancelOnTradingHalt() {
		return cancelOnTradingHalt;
	}

	public void setCancelOnTradingHalt(YesNoIndicator cancelOnTradingHalt) {
		this.cancelOnTradingHalt = cancelOnTradingHalt;
	}

	public YesNoIndicator getTradeAlong() {
		return tradeAlong;
	}

	public void setTradeAlong(YesNoIndicator tradeAlong) {
		this.tradeAlong = tradeAlong;
	}

	public YesNoIndicator getStrictLimit() {
		return strictLimit;
	}

	public void setStrictLimit(YesNoIndicator strictLimit) {
		this.strictLimit = strictLimit;
	}

	public YesNoIndicator getIgnorePriceValidityChecks() {
		return ignorePriceValidityChecks;
	}

	public void setIgnorePriceValidityChecks(YesNoIndicator ignorePriceValidityChecks) {
		this.ignorePriceValidityChecks = ignorePriceValidityChecks;
	}

	public YesNoIndicator getReinstateOnSystemFailure() {
		return reinstateOnSystemFailure;
	}

	public void setReinstateOnSystemFailure(YesNoIndicator reinstateOnSystemFailure) {
		this.reinstateOnSystemFailure = reinstateOnSystemFailure;
	}

	public YesNoIndicator getReinstateOnTradingHalt() {
		return reinstateOnTradingHalt;
	}

	public void setReinstateOnTradingHalt(YesNoIndicator reinstateOnTradingHalt) {
		this.reinstateOnTradingHalt = reinstateOnTradingHalt;
	}

	public YesNoIndicator getCancelIfNotBest() {
		return cancelIfNotBest;
	}

	public void setCancelIfNotBest(YesNoIndicator cancelIfNotBest) {
		this.cancelIfNotBest = cancelIfNotBest;
	}

	public YesNoIndicator getExternalRoutingAllowed() {
		return externalRoutingAllowed;
	}

	public void setExternalRoutingAllowed(YesNoIndicator externalRoutingAllowed) {
		this.externalRoutingAllowed = externalRoutingAllowed;
	}

	public YesNoIndicator getExternalRoutingNotAllowed() {
		return externalRoutingNotAllowed;
	}

	public void setExternalRoutingNotAllowed(YesNoIndicator externalRoutingNotAllowed) {
		this.externalRoutingNotAllowed = externalRoutingNotAllowed;
	}

	public YesNoIndicator getImbalanceOnly() {
		return imbalanceOnly;
	}

	public void setImbalanceOnly(YesNoIndicator imbalanceOnly) {
		this.imbalanceOnly = imbalanceOnly;
	}

	public YesNoIndicator getIntermarketSweep() {
		return intermarketSweep;
	}

	public void setIntermarketSweep(YesNoIndicator intermarketSweep) {
		this.intermarketSweep = intermarketSweep;
	}

	public YesNoIndicator getNetting() {
		return netting;
	}

	public void setNetting(YesNoIndicator netting) {
		this.netting = netting;
	}

	public SecuritiesOrder getRelatedOrder() {
		return relatedOrder;
	}

	public void setRelatedOrder(com.tools20022.repository.entity.SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
	}

	public YesNoIndicator getForeignExchangeNetting() {
		return foreignExchangeNetting;
	}

	public void setForeignExchangeNetting(YesNoIndicator foreignExchangeNetting) {
		this.foreignExchangeNetting = foreignExchangeNetting;
	}

	public YesNoIndicator getStrictScale() {
		return strictScale;
	}

	public void setStrictScale(YesNoIndicator strictScale) {
		this.strictScale = strictScale;
	}

	public YesNoIndicator getSuspend() {
		return suspend;
	}

	public void setSuspend(YesNoIndicator suspend) {
		this.suspend = suspend;
	}

	public YesNoIndicator getTryToStop() {
		return tryToStop;
	}

	public void setTryToStop(YesNoIndicator tryToStop) {
		this.tryToStop = tryToStop;
	}

	public Discretion getOrderPriceStrategy() {
		return orderPriceStrategy;
	}

	public void setOrderPriceStrategy(com.tools20022.repository.entity.Discretion orderPriceStrategy) {
		this.orderPriceStrategy = orderPriceStrategy;
	}
}
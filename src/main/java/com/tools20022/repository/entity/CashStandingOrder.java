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
import com.tools20022.repository.choice.StandingOrderOrAll1Choice;
import com.tools20022.repository.choice.StandingOrderType1Choice;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.StandingOrder;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instruction given by a party that has explicit authority to instruct a debit
 * on the account, ie, either the debit account owner or originating party, to a
 * first agent, to process cash transfers at specified intervals during an
 * implicit or explicit period of time. A standing order is given once and is
 * valid for an open or closed period of time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashStandingOrder" src="doc-files/CashStandingOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmZeroSweepIndicator
 * CashStandingOrder.mmZeroSweepIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmRelatedCashServices
 * CashStandingOrder.mmRelatedCashServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmCreditDebitIndicator
 * CashStandingOrder.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmCreditTransfer
 * CashStandingOrder.mmCreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmFloorAmount
 * CashStandingOrder.mmFloorAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashStandingOrder#mmCashAccount
 * CashStandingOrder.mmCashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashStandingOrder
 * CashAccount.mmCashStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmStandingOrder
 * CashManagementService.mmStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CreditTransfer#mmRelatedStandingOrder
 * CreditTransfer.mmRelatedStandingOrder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmCreditorAccount
 * StandingOrder1.mmCreditorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder1#mmDebtorAccount
 * StandingOrder1.mmDebtorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2#mmCurrency
 * StandingOrder2.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmCreditorAccount
 * StandingOrder2.mmCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingOrderOrAll1Choice#mmStandingOrder
 * StandingOrderOrAll1Choice.mmStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StandingOrderOrAll1Choice#mmAllStandingOrders
 * StandingOrderOrAll1Choice.mmAllStandingOrders}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.StandingOrder
 * StandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.StandingOrderType1Choice
 * StandingOrderType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1
 * StandingOrderSearchCriteria1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrderIdentification1
 * StandingOrderIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrderDetails1
 * StandingOrderDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrderIdentification2
 * StandingOrderIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder1 StandingOrder1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrderDetails3
 * StandingOrderDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2 StandingOrder2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder3 StandingOrder3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrderIdentification3
 * StandingOrderIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.StandingOrderOrAll1Choice
 * StandingOrderOrAll1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder4 StandingOrder4}</li>
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
 * "CashStandingOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction given by a party that has explicit authority to instruct a debit on the account, ie, either the debit account owner or originating party, to a first agent, to process cash transfers at specified intervals during an implicit or explicit period of time. A standing order is given once and is valid for an open or closed period of time."
 * </li>
 * </ul>
 */
public class CashStandingOrder extends StandingOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TrueFalseIndicator zeroSweepIndicator;
	/**
	 * Indicates whether the liquidity transfer standing order is defined as a
	 * zero sweeping order. When true, the liquidity transfer standing order
	 * will transfer all amount of money out of the account so the resulting
	 * balance is zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmZeroSweepIndicator
	 * StandingOrderSearchCriteria1.mmZeroSweepIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmZeroSweepIndicator
	 * StandingOrder1.mmZeroSweepIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmZeroSweepIndicator
	 * StandingOrder2.mmZeroSweepIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroSweepIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the liquidity transfer standing order is defined as a zero sweeping order. When true, the liquidity transfer standing order will transfer all amount of money out of the account so the resulting balance is  zero."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmZeroSweepIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmZeroSweepIndicator, com.tools20022.repository.msg.StandingOrder1.mmZeroSweepIndicator,
					com.tools20022.repository.msg.StandingOrder2.mmZeroSweepIndicator);
			elementContext_lazy = () -> CashStandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ZeroSweepIndicator";
			definition = "Indicates whether the liquidity transfer standing order is defined as a zero sweeping order. When true, the liquidity transfer standing order will transfer all amount of money out of the account so the resulting balance is  zero.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected CashManagementService relatedCashServices;
	/**
	 * Cash management services which provide standing order facilities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmStandingOrder
	 * CashManagementService.mmStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService
	 * CashManagementService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCashServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash management services which provide standing order facilities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCashServices = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashStandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCashServices";
			definition = "Cash management services which provide standing order facilities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmStandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * Specifies if the account is debited or credited by the standing order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails3#mmCreditDebitIndicator
	 * StandingOrderDetails3.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmCreditDebitIndicator
	 * StandingOrder2.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the account is debited or credited by the standing order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingOrderDetails3.mmCreditDebitIndicator, com.tools20022.repository.msg.StandingOrder2.mmCreditDebitIndicator);
			elementContext_lazy = () -> CashStandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if the account is debited or credited by the standing order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	protected CreditTransfer creditTransfer;
	/**
	 * Standing order causes a payment instruction at regular intervals, eg, as
	 * specified by its frequency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer#mmRelatedStandingOrder
	 * CreditTransfer.mmRelatedStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standing order causes a payment instruction at regular intervals, eg, as specified by its frequency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCreditTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashStandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditTransfer";
			definition = "Standing order causes a payment instruction at regular intervals, eg, as specified by its frequency.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CreditTransfer.mmRelatedStandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CreditTransfer.mmObject();
		}
	};
	protected CurrencyAndAmount floorAmount;
	/**
	 * Minimum amount of money that should remain on the debtor's account, for
	 * cash management purposes.
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
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum amount of money that should remain on the debtor's account, for cash management purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFloorAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CashStandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FloorAmount";
			definition = "Minimum amount of money that should remain on the debtor's account, for cash management purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CashAccount cashAccount;
	/**
	 * Cash account for which a standing order applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashStandingOrder
	 * CashAccount.mmCashStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashStandingOrder
	 * CashStandingOrder}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmAccount
	 * StandingOrderSearchCriteria1.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification2#mmAccount
	 * StandingOrderIdentification2.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification3#mmAccount
	 * StandingOrderIdentification3.mmAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account for which a standing order applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingOrderSearchCriteria1.mmAccount, com.tools20022.repository.msg.StandingOrderIdentification2.mmAccount,
					com.tools20022.repository.msg.StandingOrderIdentification3.mmAccount);
			elementContext_lazy = () -> CashStandingOrder.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account for which a standing order applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCashStandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashStandingOrder";
				definition = "Instruction given by a party that has explicit authority to instruct a debit on the account, ie, either the debit account owner or originating party, to a first agent, to process cash transfers at specified intervals during an implicit or explicit period of time. A standing order is given once and is valid for an open or closed period of time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmCashStandingOrder, com.tools20022.repository.entity.CashManagementService.mmStandingOrder,
						com.tools20022.repository.entity.CreditTransfer.mmRelatedStandingOrder);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingOrder1.mmCreditorAccount, com.tools20022.repository.msg.StandingOrder1.mmDebtorAccount,
						com.tools20022.repository.msg.StandingOrder2.mmCurrency, com.tools20022.repository.msg.StandingOrder2.mmCreditorAccount, com.tools20022.repository.choice.StandingOrderOrAll1Choice.mmStandingOrder,
						com.tools20022.repository.choice.StandingOrderOrAll1Choice.mmAllStandingOrders);
				superType_lazy = () -> StandingOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashStandingOrder.mmZeroSweepIndicator, com.tools20022.repository.entity.CashStandingOrder.mmRelatedCashServices,
						com.tools20022.repository.entity.CashStandingOrder.mmCreditDebitIndicator, com.tools20022.repository.entity.CashStandingOrder.mmCreditTransfer, com.tools20022.repository.entity.CashStandingOrder.mmFloorAmount,
						com.tools20022.repository.entity.CashStandingOrder.mmCashAccount);
				derivationComponent_lazy = () -> Arrays.asList(StandingOrderType1Choice.mmObject(), StandingOrderSearchCriteria1.mmObject(), StandingOrderIdentification1.mmObject(), StandingOrderDetails1.mmObject(),
						StandingOrderIdentification2.mmObject(), StandingOrder1.mmObject(), StandingOrderDetails3.mmObject(), StandingOrder2.mmObject(), StandingOrder3.mmObject(), StandingOrderIdentification3.mmObject(),
						StandingOrderOrAll1Choice.mmObject(), StandingOrder4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getZeroSweepIndicator() {
		return zeroSweepIndicator;
	}

	public void setZeroSweepIndicator(TrueFalseIndicator zeroSweepIndicator) {
		this.zeroSweepIndicator = zeroSweepIndicator;
	}

	public CashManagementService getRelatedCashServices() {
		return relatedCashServices;
	}

	public void setRelatedCashServices(com.tools20022.repository.entity.CashManagementService relatedCashServices) {
		this.relatedCashServices = relatedCashServices;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public CreditTransfer getCreditTransfer() {
		return creditTransfer;
	}

	public void setCreditTransfer(com.tools20022.repository.entity.CreditTransfer creditTransfer) {
		this.creditTransfer = creditTransfer;
	}

	public CurrencyAndAmount getFloorAmount() {
		return floorAmount;
	}

	public void setFloorAmount(CurrencyAndAmount floorAmount) {
		this.floorAmount = floorAmount;
	}

	public CashAccount getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(com.tools20022.repository.entity.CashAccount cashAccount) {
		this.cashAccount = cashAccount;
	}
}
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
import com.tools20022.repository.choice.BalanceFormat1Choice;
import com.tools20022.repository.choice.BalanceFormat3Choice;
import com.tools20022.repository.choice.Quantity3Choice;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Eligible and not eligible balance of securities for a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmTotalEligibleBalance
 * CorporateActionBalanceDetails17.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmBlockedBalance
 * CorporateActionBalanceDetails17.mmBlockedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmBorrowedBalance
 * CorporateActionBalanceDetails17.mmBorrowedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmCollateralInBalance
 * CorporateActionBalanceDetails17.mmCollateralInBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmCollateralOutBalance
 * CorporateActionBalanceDetails17.mmCollateralOutBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmOnLoanBalance
 * CorporateActionBalanceDetails17.mmOnLoanBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmPendingDeliveryBalance
 * CorporateActionBalanceDetails17.mmPendingDeliveryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmPendingReceiptBalance
 * CorporateActionBalanceDetails17.mmPendingReceiptBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmOutForRegistrationBalance
 * CorporateActionBalanceDetails17.mmOutForRegistrationBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmSettlementPositionBalance
 * CorporateActionBalanceDetails17.mmSettlementPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmStreetPositionBalance
 * CorporateActionBalanceDetails17.mmStreetPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmTradeDatePositionBalance
 * CorporateActionBalanceDetails17.mmTradeDatePositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmInTransshipmentBalance
 * CorporateActionBalanceDetails17.mmInTransshipmentBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmRegisteredBalance
 * CorporateActionBalanceDetails17.mmRegisteredBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmObligatedBalance
 * CorporateActionBalanceDetails17.mmObligatedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmUninstructedBalance
 * CorporateActionBalanceDetails17.mmUninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmInstructedBalance
 * CorporateActionBalanceDetails17.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmAffectedBalance
 * CorporateActionBalanceDetails17.mmAffectedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmUnaffectedBalance
 * CorporateActionBalanceDetails17.mmUnaffectedBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
 * CorporateActionEntitlement}</li>
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
 * "CorporateActionBalanceDetails17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Eligible and not eligible balance of securities for a corporate action event."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21
 * CorporateActionBalanceDetails21}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
 * CorporateActionBalanceDetails10}</li>
 * </ul>
 */
public class CorporateActionBalanceDetails17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Quantity3Choice totalEligibleBalance;
	/**
	 * Total quantity of financial instruments of the balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity3Choice
	 * Quantity3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
	 * CorporateActionEntitlement.mmEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlElgblBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of financial instruments of the balance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails21.mmTotalEligibleBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalEligibleBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmEligibleBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total quantity of financial instruments of the balance.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmTotalEligibleBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity3Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice blockedBalance;
	/**
	 * Balance of financial instruments that are blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of financial instruments that are blocked."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmBlockedBalance
	 * CorporateActionBalanceDetails21.mmBlockedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBlockedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "BlckdBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedBalance";
			definition = "Balance of financial instruments that are blocked.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmBlockedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice borrowedBalance;
	/**
	 * Balance of financial instruments that have been borrowed from another
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrrwdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that have been borrowed from another party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmBorrowedBalance
	 * CorporateActionBalanceDetails21.mmBorrowedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBorrowedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "BrrwdBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowedBalance";
			definition = "Balance of financial instruments that have been borrowed from another party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmBorrowedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice collateralInBalance;
	/**
	 * Balance of securities that belong to a third party and that are held for
	 * the purpose of collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollInBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralInBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to a third party and that are held for the purpose of collateralisation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmCollateralInBalance
	 * CorporateActionBalanceDetails21.mmCollateralInBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralInBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "CollInBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInBalance";
			definition = "Balance of securities that belong to a third party and that are held for the purpose of collateralisation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmCollateralInBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice collateralOutBalance;
	/**
	 * Balance of securities that belong to the safekeeping account indicated
	 * within this message, and are deposited with a third party for the purpose
	 * of collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollOutBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOutBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmCollateralOutBalance
	 * CorporateActionBalanceDetails21.mmCollateralOutBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralOutBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "CollOutBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOutBalance";
			definition = "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmCollateralOutBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice onLoanBalance;
	/**
	 * Balance of financial instruments that have been loaned to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLnBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoanBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that have been loaned to a third party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmOnLoanBalance
	 * CorporateActionBalanceDetails21.mmOnLoanBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOnLoanBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "OnLnBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoanBalance";
			definition = "Balance of financial instruments that have been loaned to a third party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmOnLoanBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected List<BalanceFormat3Choice> pendingDeliveryBalance;
	/**
	 * Balance of financial instruments that are pending delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice
	 * BalanceFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgDlvryBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending delivery."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmPendingDeliveryBalance
	 * CorporateActionBalanceDetails21.mmPendingDeliveryBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingDeliveryBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "PdgDlvryBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryBalance";
			definition = "Balance of financial instruments that are pending delivery.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmPendingDeliveryBalance);
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat3Choice.mmObject();
		}
	};
	protected List<BalanceFormat3Choice> pendingReceiptBalance;
	/**
	 * Balance of financial instruments that are pending receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice
	 * BalanceFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgRctBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending receipt."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmPendingReceiptBalance
	 * CorporateActionBalanceDetails21.mmPendingReceiptBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingReceiptBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "PdgRctBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptBalance";
			definition = "Balance of financial instruments that are pending receipt.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmPendingReceiptBalance);
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat3Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice outForRegistrationBalance;
	/**
	 * Balance of financial instruments currently being processed by the
	 * institution responsible for registering the new beneficial owner (or
	 * nominee).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutForRegnBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistrationBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmOutForRegistrationBalance
	 * CorporateActionBalanceDetails21.mmOutForRegistrationBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOutForRegistrationBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "OutForRegnBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistrationBalance";
			definition = "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmOutForRegistrationBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected List<BalanceFormat3Choice> settlementPositionBalance;
	/**
	 * Balance of securities representing only settled transactions; pending
	 * transactions not included.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice
	 * BalanceFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPosBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities representing only settled transactions; pending transactions not included."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmSettlementPositionBalance
	 * CorporateActionBalanceDetails21.mmSettlementPositionBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementPositionBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "SttlmPosBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPositionBalance";
			definition = "Balance of securities representing only settled transactions; pending transactions not included.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmSettlementPositionBalance);
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat3Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice streetPositionBalance;
	/**
	 * Balance of financial instruments that remain registered in the name of
	 * the prior beneficial owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrtPosBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetPositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that remain registered in the name of the prior beneficial owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmStreetPositionBalance
	 * CorporateActionBalanceDetails21.mmStreetPositionBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStreetPositionBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "StrtPosBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPositionBalance";
			definition = "Balance of financial instruments that remain registered in the name of the prior beneficial owner.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmStreetPositionBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice tradeDatePositionBalance;
	/**
	 * Balance of securities based on trade date, for example, includes all
	 * pending transactions in addition to the balance of settled transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtPosBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDatePositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities based on trade date, for example, includes all pending transactions in addition to the balance of settled transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmTradeDatePositionBalance
	 * CorporateActionBalanceDetails21.mmTradeDatePositionBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDatePositionBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "TradDtPosBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDatePositionBalance";
			definition = "Balance of securities based on trade date, for example, includes all pending transactions in addition to the balance of settled transactions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmTradeDatePositionBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice inTransshipmentBalance;
	/**
	 * Balance of physical securities that are in the process of being
	 * transferred from one depository/agent to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InTrnsShipmntBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransshipmentBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of physical securities that are in the process of being transferred from one depository/agent to another."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmInTransshipmentBalance
	 * CorporateActionBalanceDetails21.mmInTransshipmentBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInTransshipmentBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "InTrnsShipmntBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipmentBalance";
			definition = "Balance of physical securities that are in the process of being transferred from one depository/agent to another.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmInTransshipmentBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice registeredBalance;
	/**
	 * Balance of financial instruments that are registered (in the name of a
	 * nominee name or of the beneficial owner).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are registered (in the name of a nominee name or of the beneficial owner)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmRegisteredBalance
	 * CorporateActionBalanceDetails21.mmRegisteredBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegisteredBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "RegdBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredBalance";
			definition = "Balance of financial instruments that are registered (in the name of a nominee name or of the beneficial owner).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmRegisteredBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice obligatedBalance;
	/**
	 * Position that account holders should return to the account servicer to
	 * participate in the event or to fulfil their obligation for the event to
	 * be complete, for example, return of securities for late announced
	 * drawing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgtdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligatedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position that account holders should return to the account servicer to participate in the event or to fulfil their obligation for the event to be complete, for example, return of securities for late announced drawing."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmObligatedBalance
	 * CorporateActionBalanceDetails21.mmObligatedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmObligatedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "OblgtdBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligatedBalance";
			definition = "Position that account holders should return to the account servicer to participate in the event or to fulfil their obligation for the event to be complete, for example, return of securities for late announced drawing.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmObligatedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice uninstructedBalance;
	/**
	 * Balance of uninstructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
	 * CorporateActionEntitlement.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UinstdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of uninstructed position."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmUninstructedBalance
	 * CorporateActionBalanceDetails21.mmUninstructedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUninstructedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmUninstructedBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "UinstdBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninstructedBalance";
			definition = "Balance of uninstructed position.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmUninstructedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice instructedBalance;
	/**
	 * Balance of instructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of instructed position."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmInstructedBalance
	 * CorporateActionBalanceDetails21.mmInstructedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "InstdBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of instructed position.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmInstructedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice affectedBalance;
	/**
	 * Balance that has been affected by the process run through the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AfctdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance that has been affected by the process run through the event."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmAffectedBalance
	 * CorporateActionBalanceDetails21.mmAffectedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAffectedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "AfctdBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedBalance";
			definition = "Balance that has been affected by the process run through the event.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmAffectedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};
	protected BalanceFormat1Choice unaffectedBalance;
	/**
	 * Balance that has not been affected by the process run through the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
	 * CorporateActionBalanceDetails17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UafctdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnaffectedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance that has not been affected by the process run through the event."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmUnaffectedBalance
	 * CorporateActionBalanceDetails21.mmUnaffectedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnaffectedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails17.mmObject();
			isDerived = false;
			xmlTag = "UafctdBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnaffectedBalance";
			definition = "Balance that has not been affected by the process run through the event.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails21.mmUnaffectedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmBlockedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmCollateralInBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmOnLoanBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmPendingReceiptBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmSettlementPositionBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmTradeDatePositionBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmRegisteredBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmObligatedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmUninstructedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmInstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmAffectedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails17.mmUnaffectedBalance);
				trace_lazy = () -> CorporateActionEntitlement.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionBalanceDetails17";
				definition = "Eligible and not eligible balance of securities for a corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails21.mmObject());
				previousVersion_lazy = () -> CorporateActionBalanceDetails10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Quantity3Choice getTotalEligibleBalance() {
		return totalEligibleBalance;
	}

	public void setTotalEligibleBalance(Quantity3Choice totalEligibleBalance) {
		this.totalEligibleBalance = totalEligibleBalance;
	}

	public BalanceFormat1Choice getBlockedBalance() {
		return blockedBalance;
	}

	public void setBlockedBalance(BalanceFormat1Choice blockedBalance) {
		this.blockedBalance = blockedBalance;
	}

	public BalanceFormat1Choice getBorrowedBalance() {
		return borrowedBalance;
	}

	public void setBorrowedBalance(BalanceFormat1Choice borrowedBalance) {
		this.borrowedBalance = borrowedBalance;
	}

	public BalanceFormat1Choice getCollateralInBalance() {
		return collateralInBalance;
	}

	public void setCollateralInBalance(BalanceFormat1Choice collateralInBalance) {
		this.collateralInBalance = collateralInBalance;
	}

	public BalanceFormat1Choice getCollateralOutBalance() {
		return collateralOutBalance;
	}

	public void setCollateralOutBalance(BalanceFormat1Choice collateralOutBalance) {
		this.collateralOutBalance = collateralOutBalance;
	}

	public BalanceFormat1Choice getOnLoanBalance() {
		return onLoanBalance;
	}

	public void setOnLoanBalance(BalanceFormat1Choice onLoanBalance) {
		this.onLoanBalance = onLoanBalance;
	}

	public List<BalanceFormat3Choice> getPendingDeliveryBalance() {
		return pendingDeliveryBalance;
	}

	public void setPendingDeliveryBalance(List<BalanceFormat3Choice> pendingDeliveryBalance) {
		this.pendingDeliveryBalance = pendingDeliveryBalance;
	}

	public List<BalanceFormat3Choice> getPendingReceiptBalance() {
		return pendingReceiptBalance;
	}

	public void setPendingReceiptBalance(List<BalanceFormat3Choice> pendingReceiptBalance) {
		this.pendingReceiptBalance = pendingReceiptBalance;
	}

	public BalanceFormat1Choice getOutForRegistrationBalance() {
		return outForRegistrationBalance;
	}

	public void setOutForRegistrationBalance(BalanceFormat1Choice outForRegistrationBalance) {
		this.outForRegistrationBalance = outForRegistrationBalance;
	}

	public List<BalanceFormat3Choice> getSettlementPositionBalance() {
		return settlementPositionBalance;
	}

	public void setSettlementPositionBalance(List<BalanceFormat3Choice> settlementPositionBalance) {
		this.settlementPositionBalance = settlementPositionBalance;
	}

	public BalanceFormat1Choice getStreetPositionBalance() {
		return streetPositionBalance;
	}

	public void setStreetPositionBalance(BalanceFormat1Choice streetPositionBalance) {
		this.streetPositionBalance = streetPositionBalance;
	}

	public BalanceFormat1Choice getTradeDatePositionBalance() {
		return tradeDatePositionBalance;
	}

	public void setTradeDatePositionBalance(BalanceFormat1Choice tradeDatePositionBalance) {
		this.tradeDatePositionBalance = tradeDatePositionBalance;
	}

	public BalanceFormat1Choice getInTransshipmentBalance() {
		return inTransshipmentBalance;
	}

	public void setInTransshipmentBalance(BalanceFormat1Choice inTransshipmentBalance) {
		this.inTransshipmentBalance = inTransshipmentBalance;
	}

	public BalanceFormat1Choice getRegisteredBalance() {
		return registeredBalance;
	}

	public void setRegisteredBalance(BalanceFormat1Choice registeredBalance) {
		this.registeredBalance = registeredBalance;
	}

	public BalanceFormat1Choice getObligatedBalance() {
		return obligatedBalance;
	}

	public void setObligatedBalance(BalanceFormat1Choice obligatedBalance) {
		this.obligatedBalance = obligatedBalance;
	}

	public BalanceFormat1Choice getUninstructedBalance() {
		return uninstructedBalance;
	}

	public void setUninstructedBalance(BalanceFormat1Choice uninstructedBalance) {
		this.uninstructedBalance = uninstructedBalance;
	}

	public BalanceFormat1Choice getInstructedBalance() {
		return instructedBalance;
	}

	public void setInstructedBalance(BalanceFormat1Choice instructedBalance) {
		this.instructedBalance = instructedBalance;
	}

	public BalanceFormat1Choice getAffectedBalance() {
		return affectedBalance;
	}

	public void setAffectedBalance(BalanceFormat1Choice affectedBalance) {
		this.affectedBalance = affectedBalance;
	}

	public BalanceFormat1Choice getUnaffectedBalance() {
		return unaffectedBalance;
	}

	public void setUnaffectedBalance(BalanceFormat1Choice unaffectedBalance) {
		this.unaffectedBalance = unaffectedBalance;
	}
}
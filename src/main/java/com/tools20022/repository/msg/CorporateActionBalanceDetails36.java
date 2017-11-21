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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.BalanceFormat10Choice;
import com.tools20022.repository.choice.BalanceFormat7Choice;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmTotalEligibleBalance
 * CorporateActionBalanceDetails36.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmBlockedBalance
 * CorporateActionBalanceDetails36.mmBlockedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmBorrowedBalance
 * CorporateActionBalanceDetails36.mmBorrowedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmCollateralInBalance
 * CorporateActionBalanceDetails36.mmCollateralInBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmCollateralOutBalance
 * CorporateActionBalanceDetails36.mmCollateralOutBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmOnLoanBalance
 * CorporateActionBalanceDetails36.mmOnLoanBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmPendingDeliveryBalance
 * CorporateActionBalanceDetails36.mmPendingDeliveryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmPendingReceiptBalance
 * CorporateActionBalanceDetails36.mmPendingReceiptBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmOutForRegistrationBalance
 * CorporateActionBalanceDetails36.mmOutForRegistrationBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmSettlementPositionBalance
 * CorporateActionBalanceDetails36.mmSettlementPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmStreetPositionBalance
 * CorporateActionBalanceDetails36.mmStreetPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmTradeDatePositionBalance
 * CorporateActionBalanceDetails36.mmTradeDatePositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmInTransshipmentBalance
 * CorporateActionBalanceDetails36.mmInTransshipmentBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmRegisteredBalance
 * CorporateActionBalanceDetails36.mmRegisteredBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmObligatedBalance
 * CorporateActionBalanceDetails36.mmObligatedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmUninstructedBalance
 * CorporateActionBalanceDetails36.mmUninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmInstructedBalance
 * CorporateActionBalanceDetails36.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmAffectedBalance
 * CorporateActionBalanceDetails36.mmAffectedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmUnaffectedBalance
 * CorporateActionBalanceDetails36.mmUnaffectedBalance}</li>
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
 * "CorporateActionBalanceDetails36"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Eligible and not eligible balance of securities for a corporate action event."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionBalanceDetails36", propOrder = {"totalEligibleBalance", "blockedBalance", "borrowedBalance", "collateralInBalance", "collateralOutBalance", "onLoanBalance", "pendingDeliveryBalance", "pendingReceiptBalance",
		"outForRegistrationBalance", "settlementPositionBalance", "streetPositionBalance", "tradeDatePositionBalance", "inTransshipmentBalance", "registeredBalance", "obligatedBalance", "uninstructedBalance", "instructedBalance",
		"affectedBalance", "unaffectedBalance"})
public class CorporateActionBalanceDetails36 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TotalEligibleBalanceFormat9 totalEligibleBalance;
	/**
	 * Total balance of securities eligible for this corporate action event. The
	 * entitlement calculation is based on this balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TotalEligibleBalanceFormat9
	 * TotalEligibleBalanceFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
	 * CorporateActionEntitlement.mmEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * definition} =
	 * "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalEligibleBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmEligibleBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TotalEligibleBalanceFormat9.mmObject();
		}
	};
	protected BalanceFormat7Choice blockedBalance;
	/**
	 * Balance of financial instruments that are blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmBlockedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "BlckdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedBalance";
			definition = "Balance of financial instruments that are blocked.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice borrowedBalance;
	/**
	 * Balance of financial instruments that have been borrowed from another
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmBorrowedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "BrrwdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowedBalance";
			definition = "Balance of financial instruments that have been borrowed from another party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice collateralInBalance;
	/**
	 * Balance of securities that belong to a third party and that are held for
	 * the purpose of collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralInBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "CollInBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInBalance";
			definition = "Balance of securities that belong to a third party and that are held for the purpose of collateralisation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice collateralOutBalance;
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
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralOutBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "CollOutBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOutBalance";
			definition = "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice onLoanBalance;
	/**
	 * Balance of financial instruments that have been loaned to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmOnLoanBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "OnLnBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoanBalance";
			definition = "Balance of financial instruments that have been loaned to a third party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected List<BalanceFormat10Choice> pendingDeliveryBalance;
	/**
	 * Balance of financial instruments that are pending delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice
	 * BalanceFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingDeliveryBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "PdgDlvryBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryBalance";
			definition = "Balance of financial instruments that are pending delivery.";
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat10Choice.mmObject();
		}
	};
	protected List<BalanceFormat10Choice> pendingReceiptBalance;
	/**
	 * Balance of financial instruments that are pending receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice
	 * BalanceFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingReceiptBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "PdgRctBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptBalance";
			definition = "Balance of financial instruments that are pending receipt.";
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat10Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice outForRegistrationBalance;
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
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmOutForRegistrationBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "OutForRegnBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistrationBalance";
			definition = "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected List<BalanceFormat10Choice> settlementPositionBalance;
	/**
	 * Balance of securities representing only settled transactions; pending
	 * transactions not included.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat10Choice
	 * BalanceFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementPositionBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "SttlmPosBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPositionBalance";
			definition = "Balance of securities representing only settled transactions; pending transactions not included.";
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat10Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice streetPositionBalance;
	/**
	 * Balance of financial instruments that remain registered in the name of
	 * the prior beneficial owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmStreetPositionBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "StrtPosBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPositionBalance";
			definition = "Balance of financial instruments that remain registered in the name of the prior beneficial owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice tradeDatePositionBalance;
	/**
	 * Balance of securities based on trade date, for example, includes all
	 * pending transactions in addition to the balance of settled transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDatePositionBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "TradDtPosBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDatePositionBalance";
			definition = "Balance of securities based on trade date, for example, includes all pending transactions in addition to the balance of settled transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice inTransshipmentBalance;
	/**
	 * Balance of physical securities that are in the process of being
	 * transferred from one depository/agent to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInTransshipmentBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "InTrnsShipmntBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipmentBalance";
			definition = "Balance of physical securities that are in the process of being transferred from one depository/agent to another.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice registeredBalance;
	/**
	 * Balance of financial instruments that are registered (in the name of a
	 * nominee name or of the beneficial owner).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegisteredBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "RegdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredBalance";
			definition = "Balance of financial instruments that are registered (in the name of a nominee name or of the beneficial owner).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice obligatedBalance;
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
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmObligatedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "OblgtdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligatedBalance";
			definition = "Position that account holders should return to the account servicer to participate in the event or to fulfil their obligation for the event to be complete, for example, return of securities for late announced drawing.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice uninstructedBalance;
	/**
	 * Balance of uninstructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
	 * CorporateActionEntitlement.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmUninstructedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmUninstructedBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "UinstdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninstructedBalance";
			definition = "Balance of uninstructed position.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice instructedBalance;
	/**
	 * Balance of instructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "InstdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of instructed position.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice affectedBalance;
	/**
	 * Balance that has been affected by the process run through the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAffectedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "AfctdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedBalance";
			definition = "Balance that has been affected by the process run through the event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};
	protected BalanceFormat7Choice unaffectedBalance;
	/**
	 * Balance that has not been affected by the process run through the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
	 * CorporateActionBalanceDetails36}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnaffectedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> CorporateActionBalanceDetails36.mmObject();
			isDerived = false;
			xmlTag = "UafctdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnaffectedBalance";
			definition = "Balance that has not been affected by the process run through the event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionBalanceDetails36.mmTotalEligibleBalance, CorporateActionBalanceDetails36.mmBlockedBalance, CorporateActionBalanceDetails36.mmBorrowedBalance,
						CorporateActionBalanceDetails36.mmCollateralInBalance, CorporateActionBalanceDetails36.mmCollateralOutBalance, CorporateActionBalanceDetails36.mmOnLoanBalance,
						CorporateActionBalanceDetails36.mmPendingDeliveryBalance, CorporateActionBalanceDetails36.mmPendingReceiptBalance, CorporateActionBalanceDetails36.mmOutForRegistrationBalance,
						CorporateActionBalanceDetails36.mmSettlementPositionBalance, CorporateActionBalanceDetails36.mmStreetPositionBalance, CorporateActionBalanceDetails36.mmTradeDatePositionBalance,
						CorporateActionBalanceDetails36.mmInTransshipmentBalance, CorporateActionBalanceDetails36.mmRegisteredBalance, CorporateActionBalanceDetails36.mmObligatedBalance,
						CorporateActionBalanceDetails36.mmUninstructedBalance, CorporateActionBalanceDetails36.mmInstructedBalance, CorporateActionBalanceDetails36.mmAffectedBalance, CorporateActionBalanceDetails36.mmUnaffectedBalance);
				trace_lazy = () -> CorporateActionEntitlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionBalanceDetails36";
				definition = "Eligible and not eligible balance of securities for a corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TtlElgblBal")
	public TotalEligibleBalanceFormat9 getTotalEligibleBalance() {
		return totalEligibleBalance;
	}

	public void setTotalEligibleBalance(com.tools20022.repository.msg.TotalEligibleBalanceFormat9 totalEligibleBalance) {
		this.totalEligibleBalance = totalEligibleBalance;
	}

	@XmlElement(name = "BlckdBal")
	public BalanceFormat7Choice getBlockedBalance() {
		return blockedBalance;
	}

	public void setBlockedBalance(BalanceFormat7Choice blockedBalance) {
		this.blockedBalance = blockedBalance;
	}

	@XmlElement(name = "BrrwdBal")
	public BalanceFormat7Choice getBorrowedBalance() {
		return borrowedBalance;
	}

	public void setBorrowedBalance(BalanceFormat7Choice borrowedBalance) {
		this.borrowedBalance = borrowedBalance;
	}

	@XmlElement(name = "CollInBal")
	public BalanceFormat7Choice getCollateralInBalance() {
		return collateralInBalance;
	}

	public void setCollateralInBalance(BalanceFormat7Choice collateralInBalance) {
		this.collateralInBalance = collateralInBalance;
	}

	@XmlElement(name = "CollOutBal")
	public BalanceFormat7Choice getCollateralOutBalance() {
		return collateralOutBalance;
	}

	public void setCollateralOutBalance(BalanceFormat7Choice collateralOutBalance) {
		this.collateralOutBalance = collateralOutBalance;
	}

	@XmlElement(name = "OnLnBal")
	public BalanceFormat7Choice getOnLoanBalance() {
		return onLoanBalance;
	}

	public void setOnLoanBalance(BalanceFormat7Choice onLoanBalance) {
		this.onLoanBalance = onLoanBalance;
	}

	@XmlElement(name = "PdgDlvryBal")
	public List<BalanceFormat10Choice> getPendingDeliveryBalance() {
		return pendingDeliveryBalance;
	}

	public void setPendingDeliveryBalance(List<BalanceFormat10Choice> pendingDeliveryBalance) {
		this.pendingDeliveryBalance = pendingDeliveryBalance;
	}

	@XmlElement(name = "PdgRctBal")
	public List<BalanceFormat10Choice> getPendingReceiptBalance() {
		return pendingReceiptBalance;
	}

	public void setPendingReceiptBalance(List<BalanceFormat10Choice> pendingReceiptBalance) {
		this.pendingReceiptBalance = pendingReceiptBalance;
	}

	@XmlElement(name = "OutForRegnBal")
	public BalanceFormat7Choice getOutForRegistrationBalance() {
		return outForRegistrationBalance;
	}

	public void setOutForRegistrationBalance(BalanceFormat7Choice outForRegistrationBalance) {
		this.outForRegistrationBalance = outForRegistrationBalance;
	}

	@XmlElement(name = "SttlmPosBal")
	public List<BalanceFormat10Choice> getSettlementPositionBalance() {
		return settlementPositionBalance;
	}

	public void setSettlementPositionBalance(List<BalanceFormat10Choice> settlementPositionBalance) {
		this.settlementPositionBalance = settlementPositionBalance;
	}

	@XmlElement(name = "StrtPosBal")
	public BalanceFormat7Choice getStreetPositionBalance() {
		return streetPositionBalance;
	}

	public void setStreetPositionBalance(BalanceFormat7Choice streetPositionBalance) {
		this.streetPositionBalance = streetPositionBalance;
	}

	@XmlElement(name = "TradDtPosBal")
	public BalanceFormat7Choice getTradeDatePositionBalance() {
		return tradeDatePositionBalance;
	}

	public void setTradeDatePositionBalance(BalanceFormat7Choice tradeDatePositionBalance) {
		this.tradeDatePositionBalance = tradeDatePositionBalance;
	}

	@XmlElement(name = "InTrnsShipmntBal")
	public BalanceFormat7Choice getInTransshipmentBalance() {
		return inTransshipmentBalance;
	}

	public void setInTransshipmentBalance(BalanceFormat7Choice inTransshipmentBalance) {
		this.inTransshipmentBalance = inTransshipmentBalance;
	}

	@XmlElement(name = "RegdBal")
	public BalanceFormat7Choice getRegisteredBalance() {
		return registeredBalance;
	}

	public void setRegisteredBalance(BalanceFormat7Choice registeredBalance) {
		this.registeredBalance = registeredBalance;
	}

	@XmlElement(name = "OblgtdBal")
	public BalanceFormat7Choice getObligatedBalance() {
		return obligatedBalance;
	}

	public void setObligatedBalance(BalanceFormat7Choice obligatedBalance) {
		this.obligatedBalance = obligatedBalance;
	}

	@XmlElement(name = "UinstdBal")
	public BalanceFormat7Choice getUninstructedBalance() {
		return uninstructedBalance;
	}

	public void setUninstructedBalance(BalanceFormat7Choice uninstructedBalance) {
		this.uninstructedBalance = uninstructedBalance;
	}

	@XmlElement(name = "InstdBal")
	public BalanceFormat7Choice getInstructedBalance() {
		return instructedBalance;
	}

	public void setInstructedBalance(BalanceFormat7Choice instructedBalance) {
		this.instructedBalance = instructedBalance;
	}

	@XmlElement(name = "AfctdBal")
	public BalanceFormat7Choice getAffectedBalance() {
		return affectedBalance;
	}

	public void setAffectedBalance(BalanceFormat7Choice affectedBalance) {
		this.affectedBalance = affectedBalance;
	}

	@XmlElement(name = "UafctdBal")
	public BalanceFormat7Choice getUnaffectedBalance() {
		return unaffectedBalance;
	}

	public void setUnaffectedBalance(BalanceFormat7Choice unaffectedBalance) {
		this.unaffectedBalance = unaffectedBalance;
	}
}
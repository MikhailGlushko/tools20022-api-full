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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.CashAccountType2Code;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.BICIdentifier;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashAccount;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;

/**
 * Account to or from which a cash entry is made.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmName
 * CashAccountDetails1.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmType
 * CashAccountDetails1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmCurrency
 * CashAccountDetails1.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmCurrentMultilateralLimit
 * CashAccountDetails1.mmCurrentMultilateralLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmAccountOwner
 * CashAccountDetails1.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmAccountServicer
 * CashAccountDetails1.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmMultilateralBalance
 * CashAccountDetails1.mmMultilateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmCurrentBilateralLimit
 * CashAccountDetails1.mmCurrentBilateralLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1#mmStandingOrder
 * CashAccountDetails1.mmStandingOrder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a cash entry is made."</li>
 * </ul>
 */
public class CashAccountDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text name;
	/**
	 * Name of the account. It provides an additional means of identification,
	 * and is designated by the account servicer in agreement with the account
	 * owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1
	 * CashAccountDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AccountIdentification.mmName;
			componentContext_lazy = () -> CashAccountDetails1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CashAccountType2Code type;
	/**
	 * Specifies the nature, or use, of the cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountType
	 * CashAccount.mmCashAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1
	 * CashAccountDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the nature, or use, of the cash account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCashAccountType;
			componentContext_lazy = () -> CashAccountDetails1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the nature, or use, of the cash account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CashAccountType2Code.mmObject();
		}
	};
	protected CurrencyCode currency;
	/**
	 * Medium of exchange of value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
	 * Account.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1
	 * CashAccountDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Medium of exchange of value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.mmBaseCurrency;
			componentContext_lazy = () -> CashAccountDetails1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected LimitDetails currentMultilateralLimit;
	/**
	 * Maximum amount value applied to or by a participant versus a set of
	 * counterparts. The multilateral system is taken into account by the
	 * transaction administrator to contain the risk in the system. With the
	 * help of the multilateral limit, the direct participant restricts the use
	 * of liquidity when clearing payments with all other direct participants
	 * for whom no bilateral limit was set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitDetails
	 * LimitDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRiskManagementLimit
	 * CashManagementService.mmRiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1
	 * CashAccountDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurMulLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentMultilateralLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount value applied to or by a participant versus a set of counterparts. The multilateral system is taken into account by the transaction administrator to contain the risk in the system.\nWith the help of the multilateral limit, the direct participant restricts the use of liquidity when clearing payments with all other direct participants for whom no bilateral limit was set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrentMultilateralLimit = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmRiskManagementLimit;
			componentContext_lazy = () -> CashAccountDetails1.mmObject();
			isDerived = false;
			xmlTag = "CurMulLmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentMultilateralLimit";
			definition = "Maximum amount value applied to or by a participant versus a set of counterparts. The multilateral system is taken into account by the transaction administrator to contain the risk in the system.\nWith the help of the multilateral limit, the direct participant restricts the use of liquidity when clearing payments with all other direct participants for whom no bilateral limit was set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LimitDetails.mmObject();
		}
	};
	protected AnyBICIdentifier accountOwner;
	/**
	 * Owner of the account which is being queried.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1
	 * CashAccountDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Owner of the account which is being queried."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwner = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> CashAccountDetails1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Owner of the account which is being queried.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	protected BICIdentifier accountServicer;
	/**
	 * Servicer of the account which is being queried.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1
	 * CashAccountDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Servicer of the account which is being queried."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> CashAccountDetails1.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Servicer of the account which is being queried.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashBalanceDetails2> multilateralBalance;
	/**
	 * Balance is calculated with regard to many members in the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashBalanceDetails2
	 * CashBalanceDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1
	 * CashAccountDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MulBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance is calculated with regard to many members in the system."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMultilateralBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCashBalance;
			componentContext_lazy = () -> CashAccountDetails1.mmObject();
			isDerived = false;
			xmlTag = "MulBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilateralBalance";
			definition = "Balance is calculated with regard to many members in the system.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashBalanceDetails2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BilateralLimitDetails1> currentBilateralLimit;
	/**
	 * Limit fixed by a party A with regard to a specific counterparty B and
	 * corresponding to the maximum amount of traffic that party A may send to
	 * party B. The bilateral limit can be expressed as a debit limit or a
	 * credit limit. With the help of a bilateral limit, the direct participant
	 * restricts the use of liquidity when clearing payments with another direct
	 * participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BilateralLimitDetails1
	 * BilateralLimitDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRiskManagementLimit
	 * CashManagementService.mmRiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1
	 * CashAccountDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurBilLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentBilateralLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit fixed by a party A with regard to a specific counterparty B and corresponding to the maximum amount of traffic that party A may send to party B. The bilateral limit can be expressed as a debit limit or a credit limit. \nWith the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrentBilateralLimit = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmRiskManagementLimit;
			componentContext_lazy = () -> CashAccountDetails1.mmObject();
			isDerived = false;
			xmlTag = "CurBilLmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentBilateralLimit";
			definition = "Limit fixed by a party A with regard to a specific counterparty B and corresponding to the maximum amount of traffic that party A may send to party B. The bilateral limit can be expressed as a debit limit or a credit limit. \nWith the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BilateralLimitDetails1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.StandingOrderDetails3> standingOrder;
	/**
	 * Instruction given by a party that has explicit authority to instruct a
	 * debit on the account, ie, either the debit account owner or originating
	 * party, to a first agent, to process cash transfers at specified intervals
	 * during an implicit or explicit period of time. A standing order is given
	 * once and is valid for an open or closed period of time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.StandingOrderDetails3
	 * StandingOrderDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmStandingOrder
	 * CashManagementService.mmStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountDetails1
	 * CashAccountDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction given by a party that has explicit authority to instruct a debit on the account, ie, either the debit account owner or originating party, to a first agent, to process cash transfers at specified intervals during an implicit or explicit period of time. A standing order is given once and is valid for an open or closed period of time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStandingOrder = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmStandingOrder;
			componentContext_lazy = () -> CashAccountDetails1.mmObject();
			isDerived = false;
			xmlTag = "StgOrdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrder";
			definition = "Instruction given by a party that has explicit authority to instruct a debit on the account, ie, either the debit account owner or originating party, to a first agent, to process cash transfers at specified intervals during an implicit or explicit period of time. A standing order is given once and is valid for an open or closed period of time.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StandingOrderDetails3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountDetails1.mmName, com.tools20022.repository.msg.CashAccountDetails1.mmType, com.tools20022.repository.msg.CashAccountDetails1.mmCurrency,
						com.tools20022.repository.msg.CashAccountDetails1.mmCurrentMultilateralLimit, com.tools20022.repository.msg.CashAccountDetails1.mmAccountOwner, com.tools20022.repository.msg.CashAccountDetails1.mmAccountServicer,
						com.tools20022.repository.msg.CashAccountDetails1.mmMultilateralBalance, com.tools20022.repository.msg.CashAccountDetails1.mmCurrentBilateralLimit, com.tools20022.repository.msg.CashAccountDetails1.mmStandingOrder);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CashAccountDetails1";
				definition = "Account to or from which a cash entry is made.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getName() {
		return name;
	}

	public void setName(Max35Text name) {
		this.name = name;
	}

	public CashAccountType2Code getType() {
		return type;
	}

	public void setType(CashAccountType2Code type) {
		this.type = type;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public LimitDetails getCurrentMultilateralLimit() {
		return currentMultilateralLimit;
	}

	public void setCurrentMultilateralLimit(com.tools20022.repository.msg.LimitDetails currentMultilateralLimit) {
		this.currentMultilateralLimit = currentMultilateralLimit;
	}

	public AnyBICIdentifier getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(AnyBICIdentifier accountOwner) {
		this.accountOwner = accountOwner;
	}

	public BICIdentifier getAccountServicer() {
		return accountServicer;
	}

	public void setAccountServicer(BICIdentifier accountServicer) {
		this.accountServicer = accountServicer;
	}

	public List<CashBalanceDetails2> getMultilateralBalance() {
		return multilateralBalance;
	}

	public void setMultilateralBalance(List<com.tools20022.repository.msg.CashBalanceDetails2> multilateralBalance) {
		this.multilateralBalance = multilateralBalance;
	}

	public List<BilateralLimitDetails1> getCurrentBilateralLimit() {
		return currentBilateralLimit;
	}

	public void setCurrentBilateralLimit(List<com.tools20022.repository.msg.BilateralLimitDetails1> currentBilateralLimit) {
		this.currentBilateralLimit = currentBilateralLimit;
	}

	public List<StandingOrderDetails3> getStandingOrder() {
		return standingOrder;
	}

	public void setStandingOrder(List<com.tools20022.repository.msg.StandingOrderDetails3> standingOrder) {
		this.standingOrder = standingOrder;
	}
}
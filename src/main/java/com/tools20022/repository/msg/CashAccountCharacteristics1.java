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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.codeset.AccountLevel2Code;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CompensationMethod1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.OrganisationIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the characteristics of the cash account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmAccountLevel
 * CashAccountCharacteristics1.mmAccountLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmCashAccount
 * CashAccountCharacteristics1.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmAccountServicer
 * CashAccountCharacteristics1.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmParentAccount
 * CashAccountCharacteristics1.mmParentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmCompensationMethod
 * CashAccountCharacteristics1.mmCompensationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmDebitAccount
 * CashAccountCharacteristics1.mmDebitAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmDelayedDebitDate
 * CashAccountCharacteristics1.mmDelayedDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmSettlementAdvice
 * CashAccountCharacteristics1.mmSettlementAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmAccountBalanceCurrencyCode
 * CashAccountCharacteristics1.mmAccountBalanceCurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmSettlementCurrencyCode
 * CashAccountCharacteristics1.mmSettlementCurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmHostCurrencyCode
 * CashAccountCharacteristics1.mmHostCurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmTax
 * CashAccountCharacteristics1.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmAccountServicerContact
 * CashAccountCharacteristics1.mmAccountServicerContact}</li>
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
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountCharacteristics1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the characteristics of the cash account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2
 * CashAccountCharacteristics2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CashAccountCharacteristics1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountLevel2Code accountLevel;
	/**
	 * Defines the account level within an account hierarchy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountLevel2Code
	 * AccountLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmLevel
	 * CashAccount.mmLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the account level within an account hierarchy."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountLevel
	 * CashAccountCharacteristics2.mmAccountLevel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountLevel = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccount.mmLevel;
			componentContext_lazy = () -> CashAccountCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "AcctLvl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountLevel";
			definition = "Defines the account level within an account hierarchy.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmAccountLevel);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountLevel2Code.mmObject();
		}
	};
	protected CashAccount16 cashAccount;
	/**
	 * Account to or from which a cash entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmCashAccount
	 * CashAccountCharacteristics2.mmCashAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> CashAccountCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account to or from which a cash entry is made.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmCashAccount);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification5 accountServicer;
	/**
	 * Usage: the account servicer is the domicile agent servicing the local
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
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
	 * definition} =
	 * "Usage: the account servicer is the domicile agent servicing the local account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountServicer
	 * CashAccountCharacteristics2.mmAccountServicer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicer = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> OrganisationIdentification.mmObject();
			componentContext_lazy = () -> CashAccountCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Usage: the account servicer is the domicile agent servicing the local account.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmAccountServicer);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	protected ParentCashAccount1 parentAccount;
	/**
	 * Defines a parent account to which the cash account is related to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ParentCashAccount1
	 * ParentCashAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmParentAccount
	 * Account.mmParentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrntAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines a parent account to which the cash account is related to."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmParentAccount
	 * CashAccountCharacteristics2.mmParentAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.mmParentAccount;
			componentContext_lazy = () -> CashAccountCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "PrntAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParentAccount";
			definition = "Defines a parent account to which the cash account is related to.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmParentAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ParentCashAccount1.mmObject();
		}
	};
	protected CompensationMethod1Code compensationMethod;
	/**
	 * Defines if and how charges and taxes due are paid to the financial
	 * institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CompensationMethod1Code
	 * CompensationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCompensationMethod
	 * CashAccountService.mmCompensationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CompstnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompensationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines if and how charges and taxes due are paid to the financial institution."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmCompensationMethod
	 * CashAccountCharacteristics2.mmCompensationMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCompensationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmCompensationMethod;
			componentContext_lazy = () -> CashAccountCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "CompstnMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompensationMethod";
			definition = "Defines if and how charges and taxes due are paid to the financial institution.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmCompensationMethod);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CompensationMethod1Code.mmObject();
		}
	};
	protected AccountIdentification4Choice debitAccount;
	/**
	 * Defines the account debited for charges and taxes due on the cash
	 * account, if different from the cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the account debited for charges and taxes due on the cash account, if different from the cash account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmDebitAccount
	 * CashAccountCharacteristics2.mmDebitAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebitAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.mmIdentification;
			componentContext_lazy = () -> CashAccountCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "DbtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAccount";
			definition = "Defines the account debited for charges and taxes due on the cash account, if different from the cash account.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmDebitAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification4Choice.mmObject();
		}
	};
	protected ISODate delayedDebitDate;
	/**
	 * Future date on which the account will be automatically debited for
	 * charges and taxes due.
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
	 * {@linkplain com.tools20022.repository.entity.Entry#mmValueDate
	 * Entry.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DelydDbtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelayedDebitDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Future date on which the account will be automatically debited for charges and taxes due."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmDelayedDebitDate
	 * CashAccountCharacteristics2.mmDelayedDebitDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDelayedDebitDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Entry.mmValueDate;
			componentContext_lazy = () -> CashAccountCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "DelydDbtDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelayedDebitDate";
			definition = "Future date on which the account will be automatically debited for charges and taxes due.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmDelayedDebitDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max105Text settlementAdvice;
	/**
	 * Free form message advising the customer about the settlement of charges
	 * and taxes due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Free form message advising the customer about the settlement of charges and taxes due."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmSettlementAdvice
	 * CashAccountCharacteristics2.mmSettlementAdvice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementAdvice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashAccountCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "SttlmAdvc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAdvice";
			definition = "Free form message advising the customer about the settlement of charges and taxes due.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmSettlementAdvice);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode accountBalanceCurrencyCode;
	/**
	 * Currency used to specify the account's balance currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmReportingCurrency
	 * Account.mmReportingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctBalCcyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBalanceCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency used to specify the account's balance currency."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountBalanceCurrencyCode
	 * CashAccountCharacteristics2.mmAccountBalanceCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountBalanceCurrencyCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Account.mmReportingCurrency;
			componentContext_lazy = () -> CashAccountCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "AcctBalCcyCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBalanceCurrencyCode";
			definition = "Currency used to specify the account's balance currency.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmAccountBalanceCurrencyCode);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode settlementCurrencyCode;
	/**
	 * Currency used to specify the account's settlement currency
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmSettlementCurrency
	 * CashAccount.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency used to specify the account's settlement currency"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmSettlementCurrencyCode
	 * CashAccountCharacteristics2.mmSettlementCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCurrencyCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccount.mmSettlementCurrency;
			componentContext_lazy = () -> CashAccountCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcyCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrencyCode";
			definition = "Currency used to specify the account's settlement currency";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmSettlementCurrencyCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode hostCurrencyCode;
	/**
	 * Currency used to specify the account's taxing host currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCurrency
	 * Tax.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstCcyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency used to specify the account's taxing host currency."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmHostCurrencyCode
	 * CashAccountCharacteristics2.mmHostCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHostCurrencyCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmCurrency;
			componentContext_lazy = () -> CashAccountCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "HstCcyCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostCurrencyCode";
			definition = "Currency used to specify the account's taxing host currency.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmHostCurrencyCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected AccountTax1 tax;
	/**
	 * Describes account taxing parameters
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountTax1
	 * AccountTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmTax
	 * CashAccount.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes account taxing parameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmTax
	 * CashAccountCharacteristics2.mmTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccount.mmTax;
			componentContext_lazy = () -> CashAccountCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Describes account taxing parameters";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmTax);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountTax1.mmObject();
		}
	};
	protected ContactDetails3 accountServicerContact;
	/**
	 * Individual to contact at the financial institution's location regarding
	 * problems of a business nature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ContactDetails3
	 * ContactDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
	 * Person.mmPersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1
	 * CashAccountCharacteristics1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrCtct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerContact"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Individual to contact at the financial institution's location regarding problems of a business nature."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmAccountServicerContact
	 * CashAccountCharacteristics2.mmAccountServicerContact}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicerContact = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.mmPersonIdentification;
			componentContext_lazy = () -> CashAccountCharacteristics1.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrCtct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerContact";
			definition = "Individual to contact at the financial institution's location regarding problems of a business nature.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.mmAccountServicerContact);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.ContactDetails3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics1.mmAccountLevel, com.tools20022.repository.msg.CashAccountCharacteristics1.mmCashAccount,
						com.tools20022.repository.msg.CashAccountCharacteristics1.mmAccountServicer, com.tools20022.repository.msg.CashAccountCharacteristics1.mmParentAccount,
						com.tools20022.repository.msg.CashAccountCharacteristics1.mmCompensationMethod, com.tools20022.repository.msg.CashAccountCharacteristics1.mmDebitAccount,
						com.tools20022.repository.msg.CashAccountCharacteristics1.mmDelayedDebitDate, com.tools20022.repository.msg.CashAccountCharacteristics1.mmSettlementAdvice,
						com.tools20022.repository.msg.CashAccountCharacteristics1.mmAccountBalanceCurrencyCode, com.tools20022.repository.msg.CashAccountCharacteristics1.mmSettlementCurrencyCode,
						com.tools20022.repository.msg.CashAccountCharacteristics1.mmHostCurrencyCode, com.tools20022.repository.msg.CashAccountCharacteristics1.mmTax,
						com.tools20022.repository.msg.CashAccountCharacteristics1.mmAccountServicerContact);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccountCharacteristics1";
				definition = "Specifies the characteristics of the cash account.";
				nextVersions_lazy = () -> Arrays.asList(CashAccountCharacteristics2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AccountLevel2Code getAccountLevel() {
		return accountLevel;
	}

	public void setAccountLevel(AccountLevel2Code accountLevel) {
		this.accountLevel = accountLevel;
	}

	public CashAccount16 getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(com.tools20022.repository.msg.CashAccount16 cashAccount) {
		this.cashAccount = cashAccount;
	}

	public BranchAndFinancialInstitutionIdentification5 getAccountServicer() {
		return accountServicer;
	}

	public void setAccountServicer(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 accountServicer) {
		this.accountServicer = accountServicer;
	}

	public ParentCashAccount1 getParentAccount() {
		return parentAccount;
	}

	public void setParentAccount(com.tools20022.repository.msg.ParentCashAccount1 parentAccount) {
		this.parentAccount = parentAccount;
	}

	public CompensationMethod1Code getCompensationMethod() {
		return compensationMethod;
	}

	public void setCompensationMethod(CompensationMethod1Code compensationMethod) {
		this.compensationMethod = compensationMethod;
	}

	public AccountIdentification4Choice getDebitAccount() {
		return debitAccount;
	}

	public void setDebitAccount(AccountIdentification4Choice debitAccount) {
		this.debitAccount = debitAccount;
	}

	public ISODate getDelayedDebitDate() {
		return delayedDebitDate;
	}

	public void setDelayedDebitDate(ISODate delayedDebitDate) {
		this.delayedDebitDate = delayedDebitDate;
	}

	public Max105Text getSettlementAdvice() {
		return settlementAdvice;
	}

	public void setSettlementAdvice(Max105Text settlementAdvice) {
		this.settlementAdvice = settlementAdvice;
	}

	public ActiveOrHistoricCurrencyCode getAccountBalanceCurrencyCode() {
		return accountBalanceCurrencyCode;
	}

	public void setAccountBalanceCurrencyCode(ActiveOrHistoricCurrencyCode accountBalanceCurrencyCode) {
		this.accountBalanceCurrencyCode = accountBalanceCurrencyCode;
	}

	public ActiveOrHistoricCurrencyCode getSettlementCurrencyCode() {
		return settlementCurrencyCode;
	}

	public void setSettlementCurrencyCode(ActiveOrHistoricCurrencyCode settlementCurrencyCode) {
		this.settlementCurrencyCode = settlementCurrencyCode;
	}

	public ActiveOrHistoricCurrencyCode getHostCurrencyCode() {
		return hostCurrencyCode;
	}

	public void setHostCurrencyCode(ActiveOrHistoricCurrencyCode hostCurrencyCode) {
		this.hostCurrencyCode = hostCurrencyCode;
	}

	public AccountTax1 getTax() {
		return tax;
	}

	public void setTax(com.tools20022.repository.msg.AccountTax1 tax) {
		this.tax = tax;
	}

	public ContactDetails3 getAccountServicerContact() {
		return accountServicerContact;
	}

	public void setAccountServicerContact(com.tools20022.repository.msg.ContactDetails3 accountServicerContact) {
		this.accountServicerContact = accountServicerContact;
	}
}
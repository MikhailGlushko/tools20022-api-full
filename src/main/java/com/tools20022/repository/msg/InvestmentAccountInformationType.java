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
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Select the type(s) of information to be retrieved about a registered
 * investment account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType#mmInvestmentAccount
 * InvestmentAccountInformationType.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType#mmAccountParties
 * InvestmentAccountInformationType.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType#mmIntermediaries
 * InvestmentAccountInformationType.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType#mmInvestmentPlan
 * InvestmentAccountInformationType.mmInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType#mmCashSettlement
 * InvestmentAccountInformationType.mmCashSettlement}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccountInformationType"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Select the type(s) of information to be retrieved about a registered investment account."
 * </li>
 * </ul>
 */
public class InvestmentAccountInformationType {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator investmentAccount;
	/**
	 * Indicates if the core investment account information must be selected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType
	 * InvestmentAccountInformationType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the core investment account information must be selected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestmentAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountInformationType.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Indicates if the core investment account information must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator accountParties;
	/**
	 * Indicates if the information about account parties must be selected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType
	 * InvestmentAccountInformationType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the information about account parties must be selected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountParties = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountInformationType.mmObject();
			isDerived = false;
			xmlTag = "AcctPties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountParties";
			definition = "Indicates if the information about account parties must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator intermediaries;
	/**
	 * Indicates if the information about the intermediaries must be selected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType
	 * InvestmentAccountInformationType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmies"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediaries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the information about the intermediaries must be selected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntermediaries = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountInformationType.mmObject();
			isDerived = false;
			xmlTag = "Intrmies";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediaries";
			definition = "Indicates if the information about the intermediaries must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator investmentPlan;
	/**
	 * Indicates if the information about the investment plan(s) must be
	 * selected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType
	 * InvestmentAccountInformationType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the information about the investment plan(s) must be selected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestmentPlan = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountInformationType.mmObject();
			isDerived = false;
			xmlTag = "InvstmtPlan";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPlan";
			definition = "Indicates if the information about the investment plan(s) must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator cashSettlement;
	/**
	 * Indicates if the cash settlement information must be selected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountInformationType
	 * InvestmentAccountInformationType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the cash settlement information must be selected."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashSettlement = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountInformationType.mmObject();
			isDerived = false;
			xmlTag = "CshSttlm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Indicates if the cash settlement information must be selected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountInformationType.mmInvestmentAccount, com.tools20022.repository.msg.InvestmentAccountInformationType.mmAccountParties,
						com.tools20022.repository.msg.InvestmentAccountInformationType.mmIntermediaries, com.tools20022.repository.msg.InvestmentAccountInformationType.mmInvestmentPlan,
						com.tools20022.repository.msg.InvestmentAccountInformationType.mmCashSettlement);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InvestmentAccountInformationType";
				definition = "Select the type(s) of information to be retrieved about a registered investment account.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(YesNoIndicator investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	public YesNoIndicator getAccountParties() {
		return accountParties;
	}

	public void setAccountParties(YesNoIndicator accountParties) {
		this.accountParties = accountParties;
	}

	public YesNoIndicator getIntermediaries() {
		return intermediaries;
	}

	public void setIntermediaries(YesNoIndicator intermediaries) {
		this.intermediaries = intermediaries;
	}

	public YesNoIndicator getInvestmentPlan() {
		return investmentPlan;
	}

	public void setInvestmentPlan(YesNoIndicator investmentPlan) {
		this.investmentPlan = investmentPlan;
	}

	public YesNoIndicator getCashSettlement() {
		return cashSettlement;
	}

	public void setCashSettlement(YesNoIndicator cashSettlement) {
		this.cashSettlement = cashSettlement;
	}
}
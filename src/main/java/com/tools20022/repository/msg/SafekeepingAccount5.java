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
import com.tools20022.repository.entity.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Account on which a securities entry is made.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmAccountIdentification
 * SafekeepingAccount5.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmAccountOwner
 * SafekeepingAccount5.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmAccountServicer
 * SafekeepingAccount5.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmBeneficialOwner
 * SafekeepingAccount5.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmBalanceForAccount
 * SafekeepingAccount5.mmBalanceForAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmAgent
 * SafekeepingAccount5.mmAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmAccountSubLevel1
 * SafekeepingAccount5.mmAccountSubLevel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmAccountSubLevel1Difference
 * SafekeepingAccount5.mmAccountSubLevel1Difference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
 * SecuritiesAccount}</li>
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
 * "SafekeepingAccount5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account on which a securities entry is made."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount7
 * SafekeepingAccount7}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class SafekeepingAccount5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesAccount19 accountIdentification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5
	 * SafekeepingAccount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountIdentification
	 * SafekeepingAccount7.mmAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> SafekeepingAccount5.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafekeepingAccount7.mmAccountIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
		}
	};
	protected PartyIdentification100 accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5
	 * SafekeepingAccount5}</li>
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
	 * definition} = "Party that legally owns the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountOwner
	 * SafekeepingAccount7.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwner = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> SafekeepingAccount5.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafekeepingAccount7.mmAccountOwner);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification100.mmObject();
		}
	};
	protected PartyIdentification100 accountServicer;
	/**
	 * Party that manages the account on behalf of the account owner, that is
	 * manages the registration and booking of entries on the account,
	 * calculates balances on the account and provides information about the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5
	 * SafekeepingAccount5}</li>
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
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountServicer
	 * SafekeepingAccount7.mmAccountServicer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicer = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> SafekeepingAccount5.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafekeepingAccount7.mmAccountServicer);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification100.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.BeneficialOwner2> beneficialOwner;
	/**
	 * Individual or entity that is ultimately entitled to the benefit of income
	 * and rights in a financial instrument, as opposed to a nominal or legal
	 * owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BeneficialOwner2
	 * BeneficialOwner2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5
	 * SafekeepingAccount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Individual or entity that is ultimately entitled to the benefit of income and rights in a financial instrument, as opposed to a nominal or legal owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmBeneficialOwner
	 * SafekeepingAccount7.mmBeneficialOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficialOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> SafekeepingAccount5.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwner";
			definition = "Individual or entity that is ultimately entitled to the benefit of income and rights in a financial instrument, as opposed to a nominal or legal owner.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafekeepingAccount7.mmBeneficialOwner);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BeneficialOwner2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AggregateHoldingBalance1> balanceForAccount;
	/**
	 * Report on the net position of a financial instrument, on the account, for
	 * a certain date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1
	 * AggregateHoldingBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5
	 * SafekeepingAccount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalForAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Report on the net position of a financial instrument, on the account,  for a certain date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalanceForAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> SafekeepingAccount5.mmObject();
			isDerived = false;
			xmlTag = "BalForAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccount";
			definition = "Report on the net position of a financial instrument, on the account,  for a certain date.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AggregateHoldingBalance1.mmObject();
		}
	};
	protected Intermediary28 agent;
	/**
	 * Agent of the financial instrument, for example, the transfer agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary28
	 * Intermediary28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryRole
	 * IntermediaryRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5
	 * SafekeepingAccount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Agt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent of the financial instrument, for example, the transfer agent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAgent = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> IntermediaryRole.mmObject();
			componentContext_lazy = () -> SafekeepingAccount5.mmObject();
			isDerived = false;
			xmlTag = "Agt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			definition = "Agent of the financial instrument, for example, the transfer agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Intermediary28.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AccountSubLevel1> accountSubLevel1;
	/**
	 * Holdings of level 1.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountSubLevel1
	 * AccountSubLevel1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5
	 * SafekeepingAccount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSubLvl1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSubLevel1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holdings of level 1."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountSubLevel1
	 * SafekeepingAccount7.mmAccountSubLevel1}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountSubLevel1 = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> SafekeepingAccount5.mmObject();
			isDerived = false;
			xmlTag = "AcctSubLvl1";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSubLevel1";
			definition = "Holdings of level 1.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafekeepingAccount7.mmAccountSubLevel1);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountSubLevel1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AggregateHoldingBalance2> accountSubLevel1Difference;
	/**
	 * Difference in holdings between the safekeeping account and the
	 * sub-accounts of level 1.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance2
	 * AggregateHoldingBalance2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5
	 * SafekeepingAccount5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSubLvl1Diff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSubLevel1Difference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference in holdings between the safekeeping account and the sub-accounts of level 1."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountSubLevel1Difference
	 * SafekeepingAccount7.mmAccountSubLevel1Difference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountSubLevel1Difference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> SafekeepingAccount5.mmObject();
			isDerived = false;
			xmlTag = "AcctSubLvl1Diff";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSubLevel1Difference";
			definition = "Difference in holdings between the safekeeping account and the sub-accounts of level 1.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafekeepingAccount7.mmAccountSubLevel1Difference);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AggregateHoldingBalance2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafekeepingAccount5.mmAccountIdentification, com.tools20022.repository.msg.SafekeepingAccount5.mmAccountOwner,
						com.tools20022.repository.msg.SafekeepingAccount5.mmAccountServicer, com.tools20022.repository.msg.SafekeepingAccount5.mmBeneficialOwner, com.tools20022.repository.msg.SafekeepingAccount5.mmBalanceForAccount,
						com.tools20022.repository.msg.SafekeepingAccount5.mmAgent, com.tools20022.repository.msg.SafekeepingAccount5.mmAccountSubLevel1, com.tools20022.repository.msg.SafekeepingAccount5.mmAccountSubLevel1Difference);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SafekeepingAccount5";
				definition = "Account on which a securities entry is made.";
				nextVersions_lazy = () -> Arrays.asList(SafekeepingAccount7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccount19 getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(com.tools20022.repository.msg.SecuritiesAccount19 accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	public PartyIdentification100 getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(com.tools20022.repository.msg.PartyIdentification100 accountOwner) {
		this.accountOwner = accountOwner;
	}

	public PartyIdentification100 getAccountServicer() {
		return accountServicer;
	}

	public void setAccountServicer(com.tools20022.repository.msg.PartyIdentification100 accountServicer) {
		this.accountServicer = accountServicer;
	}

	public List<BeneficialOwner2> getBeneficialOwner() {
		return beneficialOwner;
	}

	public void setBeneficialOwner(List<com.tools20022.repository.msg.BeneficialOwner2> beneficialOwner) {
		this.beneficialOwner = beneficialOwner;
	}

	public List<AggregateHoldingBalance1> getBalanceForAccount() {
		return balanceForAccount;
	}

	public void setBalanceForAccount(List<com.tools20022.repository.msg.AggregateHoldingBalance1> balanceForAccount) {
		this.balanceForAccount = balanceForAccount;
	}

	public Intermediary28 getAgent() {
		return agent;
	}

	public void setAgent(com.tools20022.repository.msg.Intermediary28 agent) {
		this.agent = agent;
	}

	public List<AccountSubLevel1> getAccountSubLevel1() {
		return accountSubLevel1;
	}

	public void setAccountSubLevel1(List<com.tools20022.repository.msg.AccountSubLevel1> accountSubLevel1) {
		this.accountSubLevel1 = accountSubLevel1;
	}

	public List<AggregateHoldingBalance2> getAccountSubLevel1Difference() {
		return accountSubLevel1Difference;
	}

	public void setAccountSubLevel1Difference(List<com.tools20022.repository.msg.AggregateHoldingBalance2> accountSubLevel1Difference) {
		this.accountSubLevel1Difference = accountSubLevel1Difference;
	}
}
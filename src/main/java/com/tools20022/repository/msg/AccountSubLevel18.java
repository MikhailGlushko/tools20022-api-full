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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account and holding of the next sub-level (Level 8).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmAccountIdentification
 * AccountSubLevel18.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmAccountOwner
 * AccountSubLevel18.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmAccountServicer
 * AccountSubLevel18.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmBeneficialOwner
 * AccountSubLevel18.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmBalanceDetails
 * AccountSubLevel18.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmAccountSubLevel9
 * AccountSubLevel18.mmAccountSubLevel9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmAccountSubLevel9Difference
 * AccountSubLevel18.mmAccountSubLevel9Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmSupplementaryData
 * AccountSubLevel18.mmSupplementaryData}</li>
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
 * "AccountSubLevel18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account and holding of the next sub-level (Level 8)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8 AccountSubLevel8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountSubLevel18", propOrder = {"accountIdentification", "accountOwner", "accountServicer", "beneficialOwner", "balanceDetails", "accountSubLevel9", "accountSubLevel9Difference", "supplementaryData"})
public class AccountSubLevel18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesAccount19 accountIdentification;
	/**
	 * Unique and unambiguous identification for the sub-account between the
	 * account owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18
	 * AccountSubLevel18}</li>
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
	 * "Unique and unambiguous identification for the sub-account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#mmAccountIdentification
	 * AccountSubLevel8.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> AccountSubLevel18.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the sub-account between the account owner and the account servicer.";
			previousVersion_lazy = () -> AccountSubLevel8.mmAccountIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
		}
	};
	protected PartyIdentification100 accountOwner;
	/**
	 * Party that legally owns the sub-account.
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
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18
	 * AccountSubLevel18}</li>
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
	 * definition} = "Party that legally owns the sub-account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#mmAccountOwner
	 * AccountSubLevel8.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwner = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> AccountSubLevel18.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the sub-account.";
			previousVersion_lazy = () -> AccountSubLevel8.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification100.mmObject();
		}
	};
	protected PartyIdentification100 accountServicer;
	/**
	 * Party that manages the sub-account on behalf of the account owner, that
	 * is manages the registration and booking of entries on the account,
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18
	 * AccountSubLevel18}</li>
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
	 * "Party that manages the sub-account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#mmAccountServicer
	 * AccountSubLevel8.mmAccountServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> AccountSubLevel18.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the sub-account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			previousVersion_lazy = () -> AccountSubLevel8.mmAccountServicer;
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
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18
	 * AccountSubLevel18}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#mmBeneficialOwner
	 * AccountSubLevel8.mmBeneficialOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficialOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> AccountSubLevel18.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwner";
			definition = "Individual or entity that is ultimately entitled to the benefit of income and rights in a financial instrument, as opposed to a nominal or legal owner.";
			previousVersion_lazy = () -> AccountSubLevel8.mmBeneficialOwner;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BeneficialOwner2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AggregateHoldingBalance3> balanceDetails;
	/**
	 * Report on the net position of a financial instrument on the sub-account
	 * (sub-account level 8), for a certain date. The agent, for example, a
	 * trade intermediary, may also be specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance3
	 * AggregateHoldingBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18
	 * AccountSubLevel18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Report on the net position of a financial instrument on the sub-account (sub-account level 8),  for a certain date. The agent, for example, a trade intermediary, may also be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalanceDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> AccountSubLevel18.mmObject();
			isDerived = false;
			xmlTag = "BalDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceDetails";
			definition = "Report on the net position of a financial instrument on the sub-account (sub-account level 8),  for a certain date. The agent, for example, a trade intermediary, may also be specified.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AggregateHoldingBalance3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AccountSubLevel19> accountSubLevel9;
	/**
	 * Holdings of level 9.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountSubLevel19
	 * AccountSubLevel19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18
	 * AccountSubLevel18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSubLvl9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSubLevel9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holdings of level 9."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#mmAccountSubLevel9
	 * AccountSubLevel8.mmAccountSubLevel9}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountSubLevel9 = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> AccountSubLevel18.mmObject();
			isDerived = false;
			xmlTag = "AcctSubLvl9";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSubLevel9";
			definition = "Holdings of level 9.";
			previousVersion_lazy = () -> AccountSubLevel8.mmAccountSubLevel9;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountSubLevel19.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AggregateHoldingBalance2> accountSubLevel9Difference;
	/**
	 * Difference in holdings between the sub-account at level 8 and the
	 * sub-accounts of level 9.
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
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18
	 * AccountSubLevel18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSubLvl9Diff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSubLevel9Difference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference in holdings between the sub-account at level 8 and the sub-accounts of level 9."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#mmAccountSubLevel9Difference
	 * AccountSubLevel8.mmAccountSubLevel9Difference}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountSubLevel9Difference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> AccountSubLevel18.mmObject();
			isDerived = false;
			xmlTag = "AcctSubLvl9Diff";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSubLevel9Difference";
			definition = "Difference in holdings between the sub-account at level 8 and the sub-accounts of level 9.";
			previousVersion_lazy = () -> AccountSubLevel8.mmAccountSubLevel9Difference;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AggregateHoldingBalance2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18
	 * AccountSubLevel18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#mmSupplementaryData
	 * AccountSubLevel8.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountSubLevel18.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> AccountSubLevel8.mmSupplementaryData;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountSubLevel18.mmAccountIdentification, AccountSubLevel18.mmAccountOwner, AccountSubLevel18.mmAccountServicer, AccountSubLevel18.mmBeneficialOwner,
						AccountSubLevel18.mmBalanceDetails, AccountSubLevel18.mmAccountSubLevel9, AccountSubLevel18.mmAccountSubLevel9Difference, AccountSubLevel18.mmSupplementaryData);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountSubLevel18";
				definition = "Account and holding of the next sub-level (Level 8).";
				previousVersion_lazy = () -> AccountSubLevel8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AcctId", required = true)
	public SecuritiesAccount19 getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(com.tools20022.repository.msg.SecuritiesAccount19 accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	@XmlElement(name = "AcctOwnr", required = true)
	public PartyIdentification100 getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(com.tools20022.repository.msg.PartyIdentification100 accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "AcctSvcr", required = true)
	public PartyIdentification100 getAccountServicer() {
		return accountServicer;
	}

	public void setAccountServicer(com.tools20022.repository.msg.PartyIdentification100 accountServicer) {
		this.accountServicer = accountServicer;
	}

	@XmlElement(name = "BnfclOwnr")
	public List<BeneficialOwner2> getBeneficialOwner() {
		return beneficialOwner;
	}

	public void setBeneficialOwner(List<com.tools20022.repository.msg.BeneficialOwner2> beneficialOwner) {
		this.beneficialOwner = beneficialOwner;
	}

	@XmlElement(name = "BalDtls")
	public List<AggregateHoldingBalance3> getBalanceDetails() {
		return balanceDetails;
	}

	public void setBalanceDetails(List<com.tools20022.repository.msg.AggregateHoldingBalance3> balanceDetails) {
		this.balanceDetails = balanceDetails;
	}

	@XmlElement(name = "AcctSubLvl9")
	public List<AccountSubLevel19> getAccountSubLevel9() {
		return accountSubLevel9;
	}

	public void setAccountSubLevel9(List<com.tools20022.repository.msg.AccountSubLevel19> accountSubLevel9) {
		this.accountSubLevel9 = accountSubLevel9;
	}

	@XmlElement(name = "AcctSubLvl9Diff")
	public List<AggregateHoldingBalance2> getAccountSubLevel9Difference() {
		return accountSubLevel9Difference;
	}

	public void setAccountSubLevel9Difference(List<com.tools20022.repository.msg.AggregateHoldingBalance2> accountSubLevel9Difference) {
		this.accountSubLevel9Difference = accountSubLevel9Difference;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}
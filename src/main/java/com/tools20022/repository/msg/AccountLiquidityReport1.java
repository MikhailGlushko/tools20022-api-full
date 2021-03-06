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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details about praticipant's liquidity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmAccount
 * AccountLiquidityReport1.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmAccountOverdueIndicator
 * AccountLiquidityReport1.mmAccountOverdueIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmLimitInformation
 * AccountLiquidityReport1.mmLimitInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmLiquidityInformation
 * AccountLiquidityReport1.mmLiquidityInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmArrestInformation
 * AccountLiquidityReport1.mmArrestInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmDebitQueuedTransactions
 * AccountLiquidityReport1.mmDebitQueuedTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmCreditQueuedTransactions
 * AccountLiquidityReport1.mmCreditQueuedTransactions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountLiquidityReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details about praticipant's liquidity."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountLiquidityReport1", propOrder = {"account", "accountOverdueIndicator", "limitInformation", "liquidityInformation", "arrestInformation", "debitQueuedTransactions", "creditQueuedTransactions"})
public class AccountLiquidityReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acct", required = true)
	protected CashAccount25 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount25
	 * CashAccount25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountLiquidityReport1, CashAccount25> mmAccount = new MMMessageAssociationEnd<AccountLiquidityReport1, CashAccount25>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount25.mmObject();
		}

		@Override
		public CashAccount25 getValue(AccountLiquidityReport1 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(AccountLiquidityReport1 obj, CashAccount25 value) {
			obj.setAccount(value);
		}
	};
	@XmlElement(name = "AcctOvrdueInd", required = true)
	protected YesNoIndicator accountOverdueIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOvrdueInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOverdueIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates overdue FTI queue on the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountLiquidityReport1, YesNoIndicator> mmAccountOverdueIndicator = new MMMessageAttribute<AccountLiquidityReport1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "AcctOvrdueInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOverdueIndicator";
			definition = "Indicates overdue FTI queue on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(AccountLiquidityReport1 obj) {
			return obj.getAccountOverdueIndicator();
		}

		@Override
		public void setValue(AccountLiquidityReport1 obj, YesNoIndicator value) {
			obj.setAccountOverdueIndicator(value);
		}
	};
	@XmlElement(name = "LmtInf")
	protected List<AccountLimits1> limitInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountLimits1
	 * AccountLimits1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about funds limits set on the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountLiquidityReport1, List<AccountLimits1>> mmLimitInformation = new MMMessageAssociationEnd<AccountLiquidityReport1, List<AccountLimits1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "LmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitInformation";
			definition = "Information about funds limits set on the account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountLimits1.mmObject();
		}

		@Override
		public List<AccountLimits1> getValue(AccountLiquidityReport1 obj) {
			return obj.getLimitInformation();
		}

		@Override
		public void setValue(AccountLiquidityReport1 obj, List<AccountLimits1> value) {
			obj.setLimitInformation(value);
		}
	};
	@XmlElement(name = "LqdtyInf")
	protected LiquidityDetails1 liquidityInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LiquidityDetails1
	 * LiquidityDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdtyInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about liquidity of the funds of the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountLiquidityReport1, Optional<LiquidityDetails1>> mmLiquidityInformation = new MMMessageAssociationEnd<AccountLiquidityReport1, Optional<LiquidityDetails1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "LqdtyInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityInformation";
			definition = "Information about liquidity of the funds of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LiquidityDetails1.mmObject();
		}

		@Override
		public Optional<LiquidityDetails1> getValue(AccountLiquidityReport1 obj) {
			return obj.getLiquidityInformation();
		}

		@Override
		public void setValue(AccountLiquidityReport1 obj, Optional<LiquidityDetails1> value) {
			obj.setLiquidityInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "ArrstInf", required = true)
	protected ArrestedFunds1 arrestInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ArrestedFunds1
	 * ArrestedFunds1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ArrstInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArrestInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about restricted (arrested) funds on the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountLiquidityReport1, ArrestedFunds1> mmArrestInformation = new MMMessageAssociationEnd<AccountLiquidityReport1, ArrestedFunds1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "ArrstInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ArrestInformation";
			definition = "Information about restricted (arrested) funds on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ArrestedFunds1.mmObject();
		}

		@Override
		public ArrestedFunds1 getValue(AccountLiquidityReport1 obj) {
			return obj.getArrestInformation();
		}

		@Override
		public void setValue(AccountLiquidityReport1 obj, ArrestedFunds1 value) {
			obj.setArrestInformation(value);
		}
	};
	@XmlElement(name = "DbtQdTxs")
	protected List<QueuedTransactionsReport1> debitQueuedTransactions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QueuedTransactionsReport1
	 * QueuedTransactionsReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtQdTxs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitQueuedTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about queued debit transactions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountLiquidityReport1, List<QueuedTransactionsReport1>> mmDebitQueuedTransactions = new MMMessageAssociationEnd<AccountLiquidityReport1, List<QueuedTransactionsReport1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "DbtQdTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitQueuedTransactions";
			definition = "Information about queued debit transactions.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QueuedTransactionsReport1.mmObject();
		}

		@Override
		public List<QueuedTransactionsReport1> getValue(AccountLiquidityReport1 obj) {
			return obj.getDebitQueuedTransactions();
		}

		@Override
		public void setValue(AccountLiquidityReport1 obj, List<QueuedTransactionsReport1> value) {
			obj.setDebitQueuedTransactions(value);
		}
	};
	@XmlElement(name = "CdtQdTxs")
	protected List<QueuedTransactionsReport1> creditQueuedTransactions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QueuedTransactionsReport1
	 * QueuedTransactionsReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtQdTxs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditQueuedTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about queued credit transactions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountLiquidityReport1, List<QueuedTransactionsReport1>> mmCreditQueuedTransactions = new MMMessageAssociationEnd<AccountLiquidityReport1, List<QueuedTransactionsReport1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "CdtQdTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditQueuedTransactions";
			definition = "Information about queued credit transactions.";
			maxOccurs = 2;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QueuedTransactionsReport1.mmObject();
		}

		@Override
		public List<QueuedTransactionsReport1> getValue(AccountLiquidityReport1 obj) {
			return obj.getCreditQueuedTransactions();
		}

		@Override
		public void setValue(AccountLiquidityReport1 obj, List<QueuedTransactionsReport1> value) {
			obj.setCreditQueuedTransactions(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountLiquidityReport1.mmAccount, com.tools20022.repository.msg.AccountLiquidityReport1.mmAccountOverdueIndicator,
						com.tools20022.repository.msg.AccountLiquidityReport1.mmLimitInformation, com.tools20022.repository.msg.AccountLiquidityReport1.mmLiquidityInformation,
						com.tools20022.repository.msg.AccountLiquidityReport1.mmArrestInformation, com.tools20022.repository.msg.AccountLiquidityReport1.mmDebitQueuedTransactions,
						com.tools20022.repository.msg.AccountLiquidityReport1.mmCreditQueuedTransactions);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountLiquidityReport1";
				definition = "Details about praticipant's liquidity.";
			}
		});
		return mmObject_lazy.get();
	}

	public CashAccount25 getAccount() {
		return account;
	}

	public AccountLiquidityReport1 setAccount(CashAccount25 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public YesNoIndicator getAccountOverdueIndicator() {
		return accountOverdueIndicator;
	}

	public AccountLiquidityReport1 setAccountOverdueIndicator(YesNoIndicator accountOverdueIndicator) {
		this.accountOverdueIndicator = Objects.requireNonNull(accountOverdueIndicator);
		return this;
	}

	public List<AccountLimits1> getLimitInformation() {
		return limitInformation == null ? limitInformation = new ArrayList<>() : limitInformation;
	}

	public AccountLiquidityReport1 setLimitInformation(List<AccountLimits1> limitInformation) {
		this.limitInformation = Objects.requireNonNull(limitInformation);
		return this;
	}

	public Optional<LiquidityDetails1> getLiquidityInformation() {
		return liquidityInformation == null ? Optional.empty() : Optional.of(liquidityInformation);
	}

	public AccountLiquidityReport1 setLiquidityInformation(LiquidityDetails1 liquidityInformation) {
		this.liquidityInformation = liquidityInformation;
		return this;
	}

	public ArrestedFunds1 getArrestInformation() {
		return arrestInformation;
	}

	public AccountLiquidityReport1 setArrestInformation(ArrestedFunds1 arrestInformation) {
		this.arrestInformation = Objects.requireNonNull(arrestInformation);
		return this;
	}

	public List<QueuedTransactionsReport1> getDebitQueuedTransactions() {
		return debitQueuedTransactions == null ? debitQueuedTransactions = new ArrayList<>() : debitQueuedTransactions;
	}

	public AccountLiquidityReport1 setDebitQueuedTransactions(List<QueuedTransactionsReport1> debitQueuedTransactions) {
		this.debitQueuedTransactions = Objects.requireNonNull(debitQueuedTransactions);
		return this;
	}

	public List<QueuedTransactionsReport1> getCreditQueuedTransactions() {
		return creditQueuedTransactions == null ? creditQueuedTransactions = new ArrayList<>() : creditQueuedTransactions;
	}

	public AccountLiquidityReport1 setCreditQueuedTransactions(List<QueuedTransactionsReport1> creditQueuedTransactions) {
		this.creditQueuedTransactions = Objects.requireNonNull(creditQueuedTransactions);
		return this;
	}
}
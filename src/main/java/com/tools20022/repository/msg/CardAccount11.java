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
import com.tools20022.repository.choice.AccountIdentification31Choice;
import com.tools20022.repository.choice.PartyIdentification72Choice;
import com.tools20022.repository.codeset.AccountChoiceMethod1Code;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CardAccountType3Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.entity.AccountServicerRole;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Customer account information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount11#mmSelectionMethod
 * CardAccount11.mmSelectionMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount11#mmSelectedAccountType
 * CardAccount11.mmSelectedAccountType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount11#mmAccountName
 * CardAccount11.mmAccountName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount11#mmCurrency
 * CardAccount11.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount11#mmAccountIdentifier
 * CardAccount11.mmAccountIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardAccount11#mmCreditReference
 * CardAccount11.mmCreditReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardAccount11#mmServicer
 * CardAccount11.mmServicer}</li>
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
 * "CardAccount11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Customer account information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardAccount11", propOrder = {"selectionMethod", "selectedAccountType", "accountName", "currency", "accountIdentifier", "creditReference", "servicer"})
public class CardAccount11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountChoiceMethod1Code selectionMethod;
	/**
	 * Method used by the cardholder and the terminal for the choice of the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code
	 * AccountChoiceMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount11 CardAccount11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SelctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectionMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used by the cardholder and the terminal for the choice of the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSelectionMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardAccount11.mmObject();
			isDerived = false;
			xmlTag = "SelctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectionMethod";
			definition = "Method used by the cardholder and the terminal for the choice of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccountChoiceMethod1Code.mmObject();
		}
	};
	protected CardAccountType3Code selectedAccountType;
	/**
	 * Type of cardholder account used for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmType
	 * Account.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount11 CardAccount11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SelctdAcctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectedAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of cardholder account used for the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSelectedAccountType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmType;
			componentContext_lazy = () -> CardAccount11.mmObject();
			isDerived = false;
			xmlTag = "SelctdAcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectedAccountType";
			definition = "Type of cardholder account used for the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardAccountType3Code.mmObject();
		}
	};
	protected Max70Text accountName;
	/**
	 * Name of the account, as assigned by the account servicing institution, in
	 * agreement with the account owner in order to provide an additional means
	 * of identification of the account.<br>
	 * Usage: The account name is different from the account owner name. The
	 * account name is used in certain user communities to provide a means of
	 * identifying the account, in addition to the account owner's identity and
	 * the account number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount11 CardAccount11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account.\r\nUsage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> CardAccount11.mmObject();
			isDerived = false;
			xmlTag = "AcctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountName";
			definition = "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account.\r\nUsage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected ActiveCurrencyCode currency;
	/**
	 * Identification of the currency in which the account is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
	 * Account.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount11 CardAccount11}</li>
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
	 * definition} =
	 * "Identification of the currency in which the account is held."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> CardAccount11.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Identification of the currency in which the account is held.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected AccountIdentification31Choice accountIdentifier;
	/**
	 * Unique identifier of the account, as assigned by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification31Choice
	 * AccountIdentification31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount11 CardAccount11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of the account, as assigned by the account servicer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentifier = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> CardAccount11.mmObject();
			isDerived = false;
			xmlTag = "AcctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentifier";
			definition = "Unique identifier of the account, as assigned by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification31Choice.mmObject();
		}
	};
	protected Max35Text creditReference;
	/**
	 * Internal account reference in case of credit account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount11 CardAccount11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Internal account reference in case of credit account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardAccount11.mmObject();
			isDerived = false;
			xmlTag = "CdtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditReference";
			definition = "Internal account reference in case of credit account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification72Choice servicer;
	/**
	 * Party that manages the account on behalf of the account owner, that is
	 * manages the registration and booking of entries on the account,
	 * calculates balances on the account and provides information about the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice
	 * PartyIdentification72Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountServicerRole
	 * AccountServicerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardAccount11 CardAccount11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Svcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Servicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServicer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AccountServicerRole.mmObject();
			componentContext_lazy = () -> CardAccount11.mmObject();
			isDerived = false;
			xmlTag = "Svcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Servicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification72Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardAccount11.mmSelectionMethod, CardAccount11.mmSelectedAccountType, CardAccount11.mmAccountName, CardAccount11.mmCurrency, CardAccount11.mmAccountIdentifier,
						CardAccount11.mmCreditReference, CardAccount11.mmServicer);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardAccount11";
				definition = "Customer account information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SelctnMtd")
	public AccountChoiceMethod1Code getSelectionMethod() {
		return selectionMethod;
	}

	public void setSelectionMethod(AccountChoiceMethod1Code selectionMethod) {
		this.selectionMethod = selectionMethod;
	}

	@XmlElement(name = "SelctdAcctTp")
	public CardAccountType3Code getSelectedAccountType() {
		return selectedAccountType;
	}

	public void setSelectedAccountType(CardAccountType3Code selectedAccountType) {
		this.selectedAccountType = selectedAccountType;
	}

	@XmlElement(name = "AcctNm")
	public Max70Text getAccountName() {
		return accountName;
	}

	public void setAccountName(Max70Text accountName) {
		this.accountName = accountName;
	}

	@XmlElement(name = "Ccy")
	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
	}

	@XmlElement(name = "AcctIdr")
	public AccountIdentification31Choice getAccountIdentifier() {
		return accountIdentifier;
	}

	public void setAccountIdentifier(AccountIdentification31Choice accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
	}

	@XmlElement(name = "CdtRef")
	public Max35Text getCreditReference() {
		return creditReference;
	}

	public void setCreditReference(Max35Text creditReference) {
		this.creditReference = creditReference;
	}

	@XmlElement(name = "Svcr")
	public PartyIdentification72Choice getServicer() {
		return servicer;
	}

	public void setServicer(PartyIdentification72Choice servicer) {
		this.servicer = servicer;
	}
}
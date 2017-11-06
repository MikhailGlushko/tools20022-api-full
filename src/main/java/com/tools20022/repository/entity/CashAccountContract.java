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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.AccountContract;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Account contract established between the organisation or the group to which
 * the organisation belongs, and the account servicer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashAccountContract" src="doc-files/CashAccountContract.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccount
 * CashAccountContract.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmTransferCashAccount
 * CashAccountContract.mmTransferCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmServices
 * CashAccountContract.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmBalanceTransfer
 * CashAccountContract.mmBalanceTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmCashAccountMandate
 * CashAccountContract.mmCashAccountMandate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountContract
 * CashAccount.mmCashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmClosedAccountContract
 * CashAccount.mmClosedAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedAccountClosingTerms
 * PaymentObligation.mmRelatedAccountClosingTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccountContract
 * CashAccountService.mmCashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountMandate#mmCashAccountContract
 * CashAccountMandate.mmCashAccountContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport1#mmUnderlyingMasterAgreement
 * AccountReport1.mmUnderlyingMasterAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport1#mmContractDates
 * AccountReport1.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport15#mmUnderlyingMasterAgreement
 * AccountReport15.mmUnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport15#mmContractDates
 * AccountReport15.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport14#mmUnderlyingMasterAgreement
 * AccountReport14.mmUnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport14#mmContractDates
 * AccountReport14.mmContractDates}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountContract
 * AccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport7 AccountReport7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport8 AccountReport8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport10
 * AccountReport10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport13
 * AccountReport13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract4
 * AccountContract4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract2
 * AccountContract2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract3
 * AccountContract3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport1 AccountReport1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15
 * AccountReport15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport14
 * AccountReport14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport17
 * AccountReport17}</li>
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
 * "CashAccountContract"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer."
 * </li>
 * </ul>
 */
public class CashAccountContract extends AccountContract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * Specifies the account which is managed by the stipulations of the
	 * contract. it is derived from the association between AccountContract and
	 * Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountContract
	 * CashAccount.mmCashAccountContract}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport7#mmAccount
	 * AccountReport7.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport8#mmAccount
	 * AccountReport8.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport10#mmAccount
	 * AccountReport10.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport13#mmAccountOrError
	 * AccountReport13.mmAccountOrError}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport1#mmAccount
	 * AccountReport1.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport1#mmReferenceAccount
	 * AccountReport1.mmReferenceAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15#mmAccount
	 * AccountReport15.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport15#mmReferenceAccount
	 * AccountReport15.mmReferenceAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest1#mmAccount
	 * ReportingRequest1.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest2#mmAccount
	 * ReportingRequest2.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest3#mmAccount
	 * ReportingRequest3.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmAccountCharacteristics
	 * BillingStatement1.mmAccountCharacteristics}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport14#mmAccount
	 * AccountReport14.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport14#mmReferenceAccount
	 * AccountReport14.mmReferenceAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport17#mmAccountOrError
	 * AccountReport17.mmAccountOrError}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmAccountCharacteristics
	 * BillingStatement2.mmAccountCharacteristics}</li>
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
	 * definition} =
	 * "Specifies the account which is managed by the stipulations of the contract. it is derived from the association between AccountContract and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountReport7.mmAccount, com.tools20022.repository.msg.AccountReport8.mmAccount, com.tools20022.repository.msg.AccountReport10.mmAccount,
					com.tools20022.repository.msg.AccountReport13.mmAccountOrError, com.tools20022.repository.msg.AccountReport1.mmAccount, com.tools20022.repository.msg.AccountReport1.mmReferenceAccount,
					com.tools20022.repository.msg.AccountReport15.mmAccount, com.tools20022.repository.msg.AccountReport15.mmReferenceAccount, com.tools20022.repository.msg.ReportingRequest1.mmAccount,
					com.tools20022.repository.msg.ReportingRequest2.mmAccount, com.tools20022.repository.msg.ReportingRequest3.mmAccount, com.tools20022.repository.msg.BillingStatement1.mmAccountCharacteristics,
					com.tools20022.repository.msg.AccountReport14.mmAccount, com.tools20022.repository.msg.AccountReport14.mmReferenceAccount, com.tools20022.repository.msg.AccountReport17.mmAccountOrError,
					com.tools20022.repository.msg.BillingStatement2.mmAccountCharacteristics);
			elementContext_lazy = () -> CashAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Specifies the account which is managed by the stipulations of the contract. it is derived from the association between AccountContract and Account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCashAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> transferCashAccount;
	/**
	 * Identification of the account to/from which the balance of the account
	 * must be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmClosedAccountContract
	 * CashAccount.mmClosedAccountContract}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the account to/from which the balance of the account must be transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTransferCashAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCashAccount";
			definition = "Identification of the account to/from which the balance of the account must be transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmClosedAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashAccountService> services;
	/**
	 * Operations on a bank account that are allowed as part of the services
	 * offered to the owners of a bank account. It is derived from the
	 * association between AccountContract and AccountService.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccountContract
	 * CashAccountService.mmCashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account. It is derived from the association between AccountContract and AccountService."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmServices = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account. It is derived from the association between AccountContract and AccountService.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmCashAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> balanceTransfer;
	/**
	 * Specifies the transfer of a positive balance (fully or partially) or the
	 * transfer of cash to compensate a negative balance. This transfer occurs
	 * at the closing of the account. It contains the identification of the
	 * account to which or from which the amount must be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedAccountClosingTerms
	 * PaymentObligation.mmRelatedAccountClosingTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the transfer of a positive balance (fully or partially) or the transfer of cash to compensate a negative balance. This transfer occurs at the closing of the account. It contains the identification of the account to which or from which the amount must be transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBalanceTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceTransfer";
			definition = "Specifies the transfer of a positive balance (fully or partially) or the transfer of cash to compensate a negative balance. This transfer occurs at the closing of the account. It contains the identification of the account to which or from which the amount must be transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmRelatedAccountClosingTerms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected CashAccountMandate cashAccountMandate;
	/**
	 * Mandate associated with a cash account contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountMandate#mmCashAccountContract
	 * CashAccountMandate.mmCashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountMandate
	 * CashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mandate associated with a cash account contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccountMandate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccountContract.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountMandate";
			definition = "Mandate associated with a cash account contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmCashAccountContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccountContract";
				definition = "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmCashAccountContract, com.tools20022.repository.entity.CashAccount.mmClosedAccountContract,
						com.tools20022.repository.entity.PaymentObligation.mmRelatedAccountClosingTerms, com.tools20022.repository.entity.CashAccountService.mmCashAccountContract,
						com.tools20022.repository.entity.CashAccountMandate.mmCashAccountContract);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountReport1.mmUnderlyingMasterAgreement, com.tools20022.repository.msg.AccountReport1.mmContractDates,
						com.tools20022.repository.msg.AccountReport15.mmUnderlyingMasterAgreement, com.tools20022.repository.msg.AccountReport15.mmContractDates, com.tools20022.repository.msg.AccountReport14.mmUnderlyingMasterAgreement,
						com.tools20022.repository.msg.AccountReport14.mmContractDates);
				superType_lazy = () -> AccountContract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountContract.mmCashAccount, com.tools20022.repository.entity.CashAccountContract.mmTransferCashAccount,
						com.tools20022.repository.entity.CashAccountContract.mmServices, com.tools20022.repository.entity.CashAccountContract.mmBalanceTransfer, com.tools20022.repository.entity.CashAccountContract.mmCashAccountMandate);
				derivationComponent_lazy = () -> Arrays.asList(AccountReport7.mmObject(), AccountReport8.mmObject(), AccountReport10.mmObject(), AccountReport13.mmObject(), AccountContract4.mmObject(), AccountContract2.mmObject(),
						AccountContract3.mmObject(), AccountReport1.mmObject(), AccountReport15.mmObject(), AccountReport14.mmObject(), AccountReport17.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = cashAccount;
	}

	public List<CashAccount> getTransferCashAccount() {
		return transferCashAccount;
	}

	public void setTransferCashAccount(List<com.tools20022.repository.entity.CashAccount> transferCashAccount) {
		this.transferCashAccount = transferCashAccount;
	}

	public List<CashAccountService> getServices() {
		return services;
	}

	public void setServices(List<com.tools20022.repository.entity.CashAccountService> services) {
		this.services = services;
	}

	public List<PaymentObligation> getBalanceTransfer() {
		return balanceTransfer;
	}

	public void setBalanceTransfer(List<com.tools20022.repository.entity.PaymentObligation> balanceTransfer) {
		this.balanceTransfer = balanceTransfer;
	}

	public CashAccountMandate getCashAccountMandate() {
		return cashAccountMandate;
	}

	public void setCashAccountMandate(com.tools20022.repository.entity.CashAccountMandate cashAccountMandate) {
		this.cashAccountMandate = cashAccountMandate;
	}
}
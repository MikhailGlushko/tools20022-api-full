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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountContract
 * AccountContract}</li>
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport20#mmUnderlyingMasterAgreement
 * AccountReport20.mmUnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountReport20#mmContractDates
 * AccountReport20.mmContractDates}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.msg.BalanceTransferReference1
 * BalanceTransferReference1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport20
 * AccountReport20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceTransfer1
 * BalanceTransfer1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport21
 * AccountReport21}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountContract"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CashAccountContract extends AccountContract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountContract
	 * CashAccount.mmCashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport20#mmAccount
	 * AccountReport20.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport20#mmReferenceAccount
	 * AccountReport20.mmReferenceAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportingRequest4#mmAccount
	 * ReportingRequest4.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountReport21#mmAccountOrError
	 * AccountReport21.mmAccountOrError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account which is managed by the stipulations of the contract. it is derived from the association between AccountContract and Account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashAccountContract, List<CashAccount>> mmCashAccount = new MMBusinessAssociationEnd<CashAccountContract, List<CashAccount>>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountReport7.mmAccount, AccountReport8.mmAccount, AccountReport10.mmAccount, AccountReport13.mmAccountOrError, AccountReport1.mmAccount, AccountReport1.mmReferenceAccount,
					AccountReport15.mmAccount, AccountReport15.mmReferenceAccount, ReportingRequest1.mmAccount, ReportingRequest2.mmAccount, ReportingRequest3.mmAccount, BillingStatement1.mmAccountCharacteristics,
					AccountReport14.mmAccount, AccountReport14.mmReferenceAccount, AccountReport17.mmAccountOrError, BillingStatement2.mmAccountCharacteristics, AccountReport20.mmAccount, AccountReport20.mmReferenceAccount,
					ReportingRequest4.mmAccount, AccountReport21.mmAccountOrError);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Specifies the account which is managed by the stipulations of the contract. it is derived from the association between AccountContract and Account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCashAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}

		@Override
		public List<CashAccount> getValue(CashAccountContract obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(CashAccountContract obj, List<CashAccount> value) {
			obj.setCashAccount(value);
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> transferCashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmClosedAccountContract
	 * CashAccount.mmClosedAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the account to/from which the balance of the account must be transferred."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashAccountContract, List<CashAccount>> mmTransferCashAccount = new MMBusinessAssociationEnd<CashAccountContract, List<CashAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCashAccount";
			definition = "Identification of the account to/from which the balance of the account must be transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmClosedAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}

		@Override
		public List<CashAccount> getValue(CashAccountContract obj) {
			return obj.getTransferCashAccount();
		}

		@Override
		public void setValue(CashAccountContract obj, List<CashAccount> value) {
			obj.setTransferCashAccount(value);
		}
	};
	protected List<CashAccountService> services;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccountContract
	 * CashAccountService.mmCashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Services"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account. It is derived from the association between AccountContract and AccountService."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashAccountContract, List<CashAccountService>> mmServices = new MMBusinessAssociationEnd<CashAccountContract, List<CashAccountService>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Services";
			definition = "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account. It is derived from the association between AccountContract and AccountService.";
			minOccurs = 0;
			opposite_lazy = () -> CashAccountService.mmCashAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccountService.mmObject();
		}

		@Override
		public List<CashAccountService> getValue(CashAccountContract obj) {
			return obj.getServices();
		}

		@Override
		public void setValue(CashAccountContract obj, List<CashAccountService> value) {
			obj.setServices(value);
		}
	};
	protected List<PaymentObligation> balanceTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedAccountClosingTerms
	 * PaymentObligation.mmRelatedAccountClosingTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceTransfer1#mmBalanceTransferReference
	 * BalanceTransfer1.mmBalanceTransferReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the transfer of a positive balance (fully or partially) or the transfer of cash to compensate a negative balance. This transfer occurs at the closing of the account. It contains the identification of the account to which or from which the amount must be transferred."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashAccountContract, List<PaymentObligation>> mmBalanceTransfer = new MMBusinessAssociationEnd<CashAccountContract, List<PaymentObligation>>() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceTransfer1.mmBalanceTransferReference);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BalanceTransfer";
			definition = "Specifies the transfer of a positive balance (fully or partially) or the transfer of cash to compensate a negative balance. This transfer occurs at the closing of the account. It contains the identification of the account to which or from which the amount must be transferred.";
			minOccurs = 0;
			opposite_lazy = () -> PaymentObligation.mmRelatedAccountClosingTerms;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}

		@Override
		public List<PaymentObligation> getValue(CashAccountContract obj) {
			return obj.getBalanceTransfer();
		}

		@Override
		public void setValue(CashAccountContract obj, List<PaymentObligation> value) {
			obj.setBalanceTransfer(value);
		}
	};
	protected CashAccountMandate cashAccountMandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountMandate
	 * CashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountMandate#mmCashAccountContract
	 * CashAccountMandate.mmCashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mandate associated with a cash account contract."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashAccountContract, com.tools20022.repository.entity.CashAccountMandate> mmCashAccountMandate = new MMBusinessAssociationEnd<CashAccountContract, com.tools20022.repository.entity.CashAccountMandate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccountMandate";
			definition = "Mandate associated with a cash account contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmCashAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.CashAccountMandate getValue(CashAccountContract obj) {
			return obj.getCashAccountMandate();
		}

		@Override
		public void setValue(CashAccountContract obj, com.tools20022.repository.entity.CashAccountMandate value) {
			obj.setCashAccountMandate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountContract";
				definition = "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmCashAccountContract, com.tools20022.repository.entity.CashAccount.mmClosedAccountContract,
						PaymentObligation.mmRelatedAccountClosingTerms, CashAccountService.mmCashAccountContract, com.tools20022.repository.entity.CashAccountMandate.mmCashAccountContract);
				derivationElement_lazy = () -> Arrays.asList(AccountReport1.mmUnderlyingMasterAgreement, AccountReport1.mmContractDates, AccountReport15.mmUnderlyingMasterAgreement, AccountReport15.mmContractDates,
						AccountReport14.mmUnderlyingMasterAgreement, AccountReport14.mmContractDates, AccountReport20.mmUnderlyingMasterAgreement, AccountReport20.mmContractDates);
				superType_lazy = () -> AccountContract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountContract.mmCashAccount, com.tools20022.repository.entity.CashAccountContract.mmTransferCashAccount,
						com.tools20022.repository.entity.CashAccountContract.mmServices, com.tools20022.repository.entity.CashAccountContract.mmBalanceTransfer, com.tools20022.repository.entity.CashAccountContract.mmCashAccountMandate);
				derivationComponent_lazy = () -> Arrays.asList(AccountReport7.mmObject(), AccountReport8.mmObject(), AccountReport10.mmObject(), AccountReport13.mmObject(), AccountContract4.mmObject(), AccountContract2.mmObject(),
						AccountContract3.mmObject(), AccountReport1.mmObject(), AccountReport15.mmObject(), AccountReport14.mmObject(), AccountReport17.mmObject(), BalanceTransferReference1.mmObject(), AccountReport20.mmObject(),
						BalanceTransfer1.mmObject(), AccountReport21.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashAccountContract.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount == null ? cashAccount = new ArrayList<>() : cashAccount;
	}

	public CashAccountContract setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public List<CashAccount> getTransferCashAccount() {
		return transferCashAccount == null ? transferCashAccount = new ArrayList<>() : transferCashAccount;
	}

	public CashAccountContract setTransferCashAccount(List<com.tools20022.repository.entity.CashAccount> transferCashAccount) {
		this.transferCashAccount = Objects.requireNonNull(transferCashAccount);
		return this;
	}

	public List<CashAccountService> getServices() {
		return services == null ? services = new ArrayList<>() : services;
	}

	public CashAccountContract setServices(List<CashAccountService> services) {
		this.services = Objects.requireNonNull(services);
		return this;
	}

	public List<PaymentObligation> getBalanceTransfer() {
		return balanceTransfer == null ? balanceTransfer = new ArrayList<>() : balanceTransfer;
	}

	public CashAccountContract setBalanceTransfer(List<PaymentObligation> balanceTransfer) {
		this.balanceTransfer = Objects.requireNonNull(balanceTransfer);
		return this;
	}

	public CashAccountMandate getCashAccountMandate() {
		return cashAccountMandate;
	}

	public CashAccountContract setCashAccountMandate(com.tools20022.repository.entity.CashAccountMandate cashAccountMandate) {
		this.cashAccountMandate = Objects.requireNonNull(cashAccountMandate);
		return this;
	}
}
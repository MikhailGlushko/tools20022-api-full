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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.msg.Authorisation1;
import com.tools20022.repository.msg.Authorisation2;
import com.tools20022.repository.msg.MaximumAmountByPeriod1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Threshold related to a bank account operation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="OperationThreshold" src="doc-files/OperationThreshold.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OperationThreshold#mmBankOperation
 * OperationThreshold.mmBankOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OperationThreshold#mmMininumAmountPerTransaction
 * OperationThreshold.mmMininumAmountPerTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OperationThreshold#mmMaximumAmount
 * OperationThreshold.mmMaximumAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankOperation#mmOperationThreshold
 * BankOperation.mmOperationThreshold}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MaximumAmountByPeriod1
 * MaximumAmountByPeriod1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Authorisation1 Authorisation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Authorisation2 Authorisation2}</li>
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
 * "OperationThreshold"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Threshold related to a bank account operation."</li>
 * </ul>
 */
public class OperationThreshold {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected BankOperation bankOperation;
	/**
	 * Bank operation for which a threshold is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankOperation#mmOperationThreshold
	 * BankOperation.mmOperationThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankOperation
	 * BankOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold
	 * OperationThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank operation for which a threshold is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBankOperation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> OperationThreshold.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankOperation";
			definition = "Bank operation for which a threshold is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BankOperation.mmOperationThreshold;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankOperation.mmObject();
		}
	};
	protected CurrencyAndAmount mininumAmountPerTransaction;
	/**
	 * Lower limit for the operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold
	 * OperationThreshold}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Authorisation1#mmMinimumAmountPerTransaction
	 * Authorisation1.mmMinimumAmountPerTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MininumAmountPerTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lower limit for the operation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMininumAmountPerTransaction = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Authorisation1.mmMinimumAmountPerTransaction);
			elementContext_lazy = () -> OperationThreshold.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MininumAmountPerTransaction";
			definition = "Lower limit for the operation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount maximumAmount;
	/**
	 * Maximum amount allowed over a specific period of time and/or amount which
	 * is the upper limit for an operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold
	 * OperationThreshold}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaximumAmountByPeriod1#mmMaximumAmount
	 * MaximumAmountByPeriod1.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Authorisation1#mmMaximumAmountPerTransaction
	 * Authorisation1.mmMaximumAmountPerTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Authorisation1#mmMaximumAmountByPeriod
	 * Authorisation1.mmMaximumAmountByPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Authorisation2#mmMaximumAmountByTransaction
	 * Authorisation2.mmMaximumAmountByTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Authorisation2#mmMaximumAmountByPeriod
	 * Authorisation2.mmMaximumAmountByPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Authorisation2#mmMaximumAmountByBulkSubmission
	 * Authorisation2.mmMaximumAmountByBulkSubmission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount allowed over a specific period of time and/or amount which is the upper limit for an operation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaximumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaximumAmountByPeriod1.mmMaximumAmount, com.tools20022.repository.msg.Authorisation1.mmMaximumAmountPerTransaction,
					com.tools20022.repository.msg.Authorisation1.mmMaximumAmountByPeriod, com.tools20022.repository.msg.Authorisation2.mmMaximumAmountByTransaction, com.tools20022.repository.msg.Authorisation2.mmMaximumAmountByPeriod,
					com.tools20022.repository.msg.Authorisation2.mmMaximumAmountByBulkSubmission);
			elementContext_lazy = () -> OperationThreshold.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount allowed over a specific period of time and/or amount which is the upper limit for an operation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OperationThreshold";
				definition = "Threshold related to a bank account operation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BankOperation.mmOperationThreshold);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OperationThreshold.mmBankOperation, com.tools20022.repository.entity.OperationThreshold.mmMininumAmountPerTransaction,
						com.tools20022.repository.entity.OperationThreshold.mmMaximumAmount);
				derivationComponent_lazy = () -> Arrays.asList(MaximumAmountByPeriod1.mmObject(), Authorisation1.mmObject(), Authorisation2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public BankOperation getBankOperation() {
		return bankOperation;
	}

	public void setBankOperation(com.tools20022.repository.entity.BankOperation bankOperation) {
		this.bankOperation = bankOperation;
	}

	public CurrencyAndAmount getMininumAmountPerTransaction() {
		return mininumAmountPerTransaction;
	}

	public void setMininumAmountPerTransaction(CurrencyAndAmount mininumAmountPerTransaction) {
		this.mininumAmountPerTransaction = mininumAmountPerTransaction;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public void setMaximumAmount(CurrencyAndAmount maximumAmount) {
		this.maximumAmount = maximumAmount;
	}
}
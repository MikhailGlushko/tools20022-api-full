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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.entity.IndividualPayment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money representing a value paid by a debtor to an agent bank.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashDeposit" src="doc-files/CashDeposit.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDeposit#mmNoteDenomination
 * CashDeposit.mmNoteDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashDeposit#mmNumberOfNotes
 * CashDeposit.mmNumberOfNotes}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashDeposit#mmDepositAmount
 * CashDeposit.mmDepositAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDeposit#mmRelatedBankingTransaction
 * CashDeposit.mmRelatedBankingTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.IndividualPayment
 * IndividualPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashDeposit1 CashDeposit1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmCashDeposit
 * BankingTransaction.mmCashDeposit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmCashDeposit
 * EntryTransaction3.mmCashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmCashDeposit
 * EntryTransaction4.mmCashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmCashDeposit
 * EntryTransaction7.mmCashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmCashDeposit
 * EntryTransaction8.mmCashDeposit}</li>
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
 * "CashDeposit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money representing a value paid by a debtor to an agent bank."</li>
 * </ul>
 */
public class CashDeposit extends IndividualPayment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount noteDenomination;
	/**
	 * Specifies the note or coin denomination, including the currency, such as
	 * a 50 euro note.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashDeposit1#mmNoteDenomination
	 * CashDeposit1.mmNoteDenomination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDeposit CashDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoteDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the note or coin denomination, including the currency, such as a 50 euro note."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNoteDenomination = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashDeposit1.mmNoteDenomination);
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDeposit.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoteDenomination";
			definition = "Specifies the note or coin denomination, including the currency, such as a 50 euro note.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDeposit.class.getMethod("getNoteDenomination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max15NumericText numberOfNotes;
	/**
	 * Specifies the number of notes of the same denomination in the deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashDeposit1#mmNumberOfNotes
	 * CashDeposit1.mmNumberOfNotes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDeposit CashDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfNotes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of notes of the same denomination in the deposit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNumberOfNotes = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashDeposit1.mmNumberOfNotes);
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDeposit.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberOfNotes";
			definition = "Specifies the number of notes of the same denomination in the deposit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDeposit.class.getMethod("getNumberOfNotes", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount depositAmount;
	/**
	 * Specifies the total amount of money in the cash deposit, that is the note
	 * denomination times the number of notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashDeposit1#mmAmount
	 * CashDeposit1.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDeposit CashDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total amount of money in the cash deposit, that is the note denomination times the number of notes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDepositAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashDeposit1.mmAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDeposit.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositAmount";
			definition = "Specifies the total amount of money in the cash deposit, that is the note denomination times the number of notes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashDeposit.class.getMethod("getDepositAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BankingTransaction relatedBankingTransaction;
	/**
	 * Describes the type of transaction associated with a cash deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmCashDeposit
	 * BankingTransaction.mmCashDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankingTransaction
	 * BankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashDeposit CashDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedBankingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the type of transaction associated with a cash deposit."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedBankingTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CashDeposit.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedBankingTransaction";
			definition = "Describes the type of transaction associated with a cash deposit.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmCashDeposit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashDeposit";
				definition = "Amount of money representing a value paid by a debtor to an agent bank.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BankingTransaction.mmCashDeposit);
				derivationElement_lazy = () -> Arrays.asList(EntryTransaction3.mmCashDeposit, EntryTransaction4.mmCashDeposit, EntryTransaction7.mmCashDeposit, EntryTransaction8.mmCashDeposit);
				superType_lazy = () -> IndividualPayment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashDeposit.mmNoteDenomination, com.tools20022.repository.entity.CashDeposit.mmNumberOfNotes, com.tools20022.repository.entity.CashDeposit.mmDepositAmount,
						com.tools20022.repository.entity.CashDeposit.mmRelatedBankingTransaction);
				derivationComponent_lazy = () -> Arrays.asList(CashDeposit1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashDeposit.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getNoteDenomination() {
		return noteDenomination;
	}

	public void setNoteDenomination(CurrencyAndAmount noteDenomination) {
		this.noteDenomination = noteDenomination;
	}

	public Max15NumericText getNumberOfNotes() {
		return numberOfNotes;
	}

	public void setNumberOfNotes(Max15NumericText numberOfNotes) {
		this.numberOfNotes = numberOfNotes;
	}

	public CurrencyAndAmount getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(CurrencyAndAmount depositAmount) {
		this.depositAmount = depositAmount;
	}

	public BankingTransaction getRelatedBankingTransaction() {
		return relatedBankingTransaction;
	}

	public void setRelatedBankingTransaction(com.tools20022.repository.entity.BankingTransaction relatedBankingTransaction) {
		this.relatedBankingTransaction = relatedBankingTransaction;
	}
}
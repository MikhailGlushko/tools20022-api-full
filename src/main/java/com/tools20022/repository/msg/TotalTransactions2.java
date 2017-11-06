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
import com.tools20022.metamodel.MMMessageComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Set of elements used to provide summary information on entries.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTransactions2#mmTotalEntries
 * TotalTransactions2.mmTotalEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTransactions2#mmTotalCreditEntries
 * TotalTransactions2.mmTotalCreditEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTransactions2#mmTotalDebitEntries
 * TotalTransactions2.mmTotalDebitEntries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTransactions2#mmTotalEntriesPerBankTransactionCode
 * TotalTransactions2.mmTotalEntriesPerBankTransactionCode}</li>
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
 * "TotalTransactions2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide summary information on entries."</li>
 * </ul>
 */
public class TotalTransactions2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected NumberAndSumOfTransactions2 totalEntries;
	/**
	 * Specifies the total number and sum of debit and credit entries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions2
	 * NumberAndSumOfTransactions2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions2
	 * TotalTransactions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNtries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total number and sum of debit and credit entries."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalEntries = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TotalTransactions2.mmObject();
			isDerived = false;
			xmlTag = "TtlNtries";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEntries";
			definition = "Specifies the total number and sum of debit and credit entries.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NumberAndSumOfTransactions2.mmObject();
		}
	};
	protected NumberAndSumOfTransactions1 totalCreditEntries;
	/**
	 * Specifies the total number and sum of credit entries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions1
	 * NumberAndSumOfTransactions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions2
	 * TotalTransactions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlCdtNtries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCreditEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the total number and sum of credit entries."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalCreditEntries = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TotalTransactions2.mmObject();
			isDerived = false;
			xmlTag = "TtlCdtNtries";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCreditEntries";
			definition = "Specifies the total number and sum of credit entries.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NumberAndSumOfTransactions1.mmObject();
		}
	};
	protected NumberAndSumOfTransactions1 totalDebitEntries;
	/**
	 * Specifies the total number and sum of debit entries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions1
	 * NumberAndSumOfTransactions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions2
	 * TotalTransactions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlDbtNtries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDebitEntries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the total number and sum of debit entries."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalDebitEntries = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TotalTransactions2.mmObject();
			isDerived = false;
			xmlTag = "TtlDbtNtries";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDebitEntries";
			definition = "Specifies the total number and sum of debit entries.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NumberAndSumOfTransactions1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TotalsPerBankTransactionCode2> totalEntriesPerBankTransactionCode;
	/**
	 * Specifies the total number and sum of entries per bank transaction code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode2
	 * TotalsPerBankTransactionCode2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTransactions2
	 * TotalTransactions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNtriesPerBkTxCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEntriesPerBankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total number and sum of entries per bank transaction code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalEntriesPerBankTransactionCode = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TotalTransactions2.mmObject();
			isDerived = false;
			xmlTag = "TtlNtriesPerBkTxCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEntriesPerBankTransactionCode";
			definition = "Specifies the total number and sum of entries per bank transaction code.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TotalsPerBankTransactionCode2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalTransactions2.mmTotalEntries, com.tools20022.repository.msg.TotalTransactions2.mmTotalCreditEntries,
						com.tools20022.repository.msg.TotalTransactions2.mmTotalDebitEntries, com.tools20022.repository.msg.TotalTransactions2.mmTotalEntriesPerBankTransactionCode);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TotalTransactions2";
				definition = "Set of elements used to provide summary information on entries.";
			}
		});
		return mmObject_lazy.get();
	}

	public NumberAndSumOfTransactions2 getTotalEntries() {
		return totalEntries;
	}

	public void setTotalEntries(com.tools20022.repository.msg.NumberAndSumOfTransactions2 totalEntries) {
		this.totalEntries = totalEntries;
	}

	public NumberAndSumOfTransactions1 getTotalCreditEntries() {
		return totalCreditEntries;
	}

	public void setTotalCreditEntries(com.tools20022.repository.msg.NumberAndSumOfTransactions1 totalCreditEntries) {
		this.totalCreditEntries = totalCreditEntries;
	}

	public NumberAndSumOfTransactions1 getTotalDebitEntries() {
		return totalDebitEntries;
	}

	public void setTotalDebitEntries(com.tools20022.repository.msg.NumberAndSumOfTransactions1 totalDebitEntries) {
		this.totalDebitEntries = totalDebitEntries;
	}

	public List<TotalsPerBankTransactionCode2> getTotalEntriesPerBankTransactionCode() {
		return totalEntriesPerBankTransactionCode;
	}

	public void setTotalEntriesPerBankTransactionCode(List<com.tools20022.repository.msg.TotalsPerBankTransactionCode2> totalEntriesPerBankTransactionCode) {
		this.totalEntriesPerBankTransactionCode = totalEntriesPerBankTransactionCode;
	}
}
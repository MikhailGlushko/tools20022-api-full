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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.ATMTotals1;
import com.tools20022.repository.msg.ATMTotals3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Current totals of the ATM.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ATMTotal" src="doc-files/ATMTotal.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ATMTotal#mmATMBalance
 * ATMTotal.mmATMBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ATMTotal#mmCurrency
 * ATMTotal.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ATMTotal#mmATMCurrentNumber
 * ATMTotal.mmATMCurrentNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ATMTotal#mmATMBalanceNumber
 * ATMTotal.mmATMBalanceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ATMTotal#mmATMCurrent
 * ATMTotal.mmATMCurrent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmRelatedCardPayment
 * ATMTotal.mmRelatedCardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CardPayment#mmATMTotal
 * CardPayment.mmATMTotal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals3#mmPeriod
 * ATMTotals3.mmPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1 ATMTotals1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals3 ATMTotals3}</li>
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
 * "ATMTotal"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Current totals of the ATM."</li>
 * </ul>
 */
public class ATMTotal {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ImpliedCurrencyAndAmount aTMBalance;
	/**
	 * Total balance of the ATM including reject cassette, but excluding the
	 * retract cassette.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ATMTotal
	 * ATMTotal}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmATMBalance
	 * ATMTotals1.mmATMBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of the ATM including reject cassette, but excluding the retract cassette."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmATMBalance = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTotals1.mmATMBalance);
			elementContext_lazy = () -> ATMTotal.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ATMBalance";
			definition = "Total balance of the ATM including reject cassette, but excluding the retract cassette.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyCode currency;
	/**
	 * Currency of the totals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ATMTotal
	 * ATMTotal}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmCurrency
	 * ATMTotals1.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals3#mmCurrency
	 * ATMTotals3.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the totals."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTotals1.mmCurrency, com.tools20022.repository.msg.ATMTotals3.mmCurrency);
			elementContext_lazy = () -> ATMTotal.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency of the totals.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected Number aTMCurrentNumber;
	/**
	 * Total number of units for non-valued media, excluding reject cassette.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ATMTotal
	 * ATMTotal}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTotals1#mmATMCurrentNumber
	 * ATMTotals1.mmATMCurrentNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals3#mmCount
	 * ATMTotals3.mmCount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCurrentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of units for non-valued media, excluding reject cassette."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmATMCurrentNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTotals1.mmATMCurrentNumber, com.tools20022.repository.msg.ATMTotals3.mmCount);
			elementContext_lazy = () -> ATMTotal.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ATMCurrentNumber";
			definition = "Total number of units for non-valued media, excluding reject cassette.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number aTMBalanceNumber;
	/**
	 * Total number of units for non-valued media, including reject cassette.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ATMTotal
	 * ATMTotal}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTotals1#mmATMBalanceNumber
	 * ATMTotals1.mmATMBalanceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalanceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of units for non-valued media, including reject cassette."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmATMBalanceNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTotals1.mmATMBalanceNumber);
			elementContext_lazy = () -> ATMTotal.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ATMBalanceNumber";
			definition = "Total number of units for non-valued media, including reject cassette.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount aTMCurrent;
	/**
	 * Available amount for dispense in the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ATMTotal
	 * ATMTotal}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmATMCurrent
	 * ATMTotals1.mmATMCurrent}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals3#mmAmount
	 * ATMTotals3.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCurrent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Available amount for dispense in the ATM."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmATMCurrent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTotals1.mmATMCurrent, com.tools20022.repository.msg.ATMTotals3.mmAmount);
			elementContext_lazy = () -> ATMTotal.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ATMCurrent";
			definition = "Available amount for dispense in the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CardPayment> relatedCardPayment;
	/**
	 * Related payments representing the current totals of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmATMTotal
	 * CardPayment.mmATMTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ATMTotal
	 * ATMTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related payments representing the current totals of the ATM."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCardPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ATMTotal.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPayment";
			definition = "Related payments representing the current totals of the ATM.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.mmATMTotal;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMTotal";
				definition = "Current totals of the ATM.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.mmATMTotal);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTotals3.mmPeriod);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ATMTotal.mmATMBalance, com.tools20022.repository.entity.ATMTotal.mmCurrency, com.tools20022.repository.entity.ATMTotal.mmATMCurrentNumber,
						com.tools20022.repository.entity.ATMTotal.mmATMBalanceNumber, com.tools20022.repository.entity.ATMTotal.mmATMCurrent, com.tools20022.repository.entity.ATMTotal.mmRelatedCardPayment);
				derivationComponent_lazy = () -> Arrays.asList(ATMTotals1.mmObject(), ATMTotals3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ImpliedCurrencyAndAmount getATMBalance() {
		return aTMBalance;
	}

	public void setATMBalance(ImpliedCurrencyAndAmount aTMBalance) {
		this.aTMBalance = aTMBalance;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public Number getATMCurrentNumber() {
		return aTMCurrentNumber;
	}

	public void setATMCurrentNumber(Number aTMCurrentNumber) {
		this.aTMCurrentNumber = aTMCurrentNumber;
	}

	public Number getATMBalanceNumber() {
		return aTMBalanceNumber;
	}

	public void setATMBalanceNumber(Number aTMBalanceNumber) {
		this.aTMBalanceNumber = aTMBalanceNumber;
	}

	public ImpliedCurrencyAndAmount getATMCurrent() {
		return aTMCurrent;
	}

	public void setATMCurrent(ImpliedCurrencyAndAmount aTMCurrent) {
		this.aTMCurrent = aTMCurrent;
	}

	public List<CardPayment> getRelatedCardPayment() {
		return relatedCardPayment;
	}

	public void setRelatedCardPayment(List<com.tools20022.repository.entity.CardPayment> relatedCardPayment) {
		this.relatedCardPayment = relatedCardPayment;
	}
}
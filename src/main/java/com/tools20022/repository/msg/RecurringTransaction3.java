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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.Frequency3Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Instalment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Financial loan (instalment) or a recurring transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmStartDate
 * RecurringTransaction3.mmStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmNumberOfOccurrences
 * RecurringTransaction3.mmNumberOfOccurrences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmEndDate
 * RecurringTransaction3.mmEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmPeriodUnit
 * RecurringTransaction3.mmPeriodUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3#mmIntervalDay
 * RecurringTransaction3.mmIntervalDay}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
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
 * "RecurringTransaction3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Financial loan (instalment) or a recurring transaction."</li>
 * </ul>
 */
public class RecurringTransaction3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate startDate;
	/**
	 * Date of first transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmFirstPaymentDate
	 * Instalment.mmFirstPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3
	 * RecurringTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of first transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStartDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Instalment.mmFirstPaymentDate;
			componentContext_lazy = () -> RecurringTransaction3.mmObject();
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Date of first transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Number numberOfOccurrences;
	/**
	 * Number of transfers to perform.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmTotalNumberOfInstalment
	 * Instalment.mmTotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3
	 * RecurringTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfOcrncs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfOccurrences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of transfers to perform."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfOccurrences = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Instalment.mmTotalNumberOfInstalment;
			componentContext_lazy = () -> RecurringTransaction3.mmObject();
			isDerived = false;
			xmlTag = "NbOfOcrncs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfOccurrences";
			definition = "Number of transfers to perform.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ISODate endDate;
	/**
	 * Date of last transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3
	 * RecurringTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of last transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEndDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RecurringTransaction3.mmObject();
			isDerived = false;
			xmlTag = "EndDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndDate";
			definition = "Date of last transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Frequency3Code periodUnit;
	/**
	 * Period of the recurring transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency3Code
	 * Frequency3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmPeriodUnit
	 * Instalment.mmPeriodUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3
	 * RecurringTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrdUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of the recurring transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPeriodUnit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Instalment.mmPeriodUnit;
			componentContext_lazy = () -> RecurringTransaction3.mmObject();
			isDerived = false;
			xmlTag = "PrdUnit";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodUnit";
			definition = "Period of the recurring transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency3Code.mmObject();
		}
	};
	protected Number intervalDay;
	/**
	 * Day of the period when the transfer will be performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmNumberOfUnits
	 * Instalment.mmNumberOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction3
	 * RecurringTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrvlDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntervalDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Day of the period when the transfer will be performed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntervalDay = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Instalment.mmNumberOfUnits;
			componentContext_lazy = () -> RecurringTransaction3.mmObject();
			isDerived = false;
			xmlTag = "IntrvlDay";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntervalDay";
			definition = "Day of the period when the transfer will be performed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RecurringTransaction3.mmStartDate, com.tools20022.repository.msg.RecurringTransaction3.mmNumberOfOccurrences,
						com.tools20022.repository.msg.RecurringTransaction3.mmEndDate, com.tools20022.repository.msg.RecurringTransaction3.mmPeriodUnit, com.tools20022.repository.msg.RecurringTransaction3.mmIntervalDay);
				trace_lazy = () -> Instalment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RecurringTransaction3";
				definition = "Financial loan (instalment) or a recurring transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getStartDate() {
		return startDate;
	}

	public void setStartDate(ISODate startDate) {
		this.startDate = startDate;
	}

	public Number getNumberOfOccurrences() {
		return numberOfOccurrences;
	}

	public void setNumberOfOccurrences(Number numberOfOccurrences) {
		this.numberOfOccurrences = numberOfOccurrences;
	}

	public ISODate getEndDate() {
		return endDate;
	}

	public void setEndDate(ISODate endDate) {
		this.endDate = endDate;
	}

	public Frequency3Code getPeriodUnit() {
		return periodUnit;
	}

	public void setPeriodUnit(Frequency3Code periodUnit) {
		this.periodUnit = periodUnit;
	}

	public Number getIntervalDay() {
		return intervalDay;
	}

	public void setIntervalDay(Number intervalDay) {
		this.intervalDay = intervalDay;
	}
}
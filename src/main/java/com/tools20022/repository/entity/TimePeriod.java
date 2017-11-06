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
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.msg.TimePeriodDetails;
import com.tools20022.repository.msg.TimePeriodDetails1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Particular time span specified between a start time and an end time. The time
 * period cannot exceed 24 hours.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TimePeriod" src="doc-files/TimePeriod.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimePeriod#mmSystemAvailability
 * TimePeriod.mmSystemAvailability}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TimePeriod#mmFromTime
 * TimePeriod.mmFromTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TimePeriod#mmToTime
 * TimePeriod.mmToTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmAvailableSessionPeriod
 * SystemAvailability.mmAvailableSessionPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TimePeriodDetails
 * TimePeriodDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TimePeriodDetails1
 * TimePeriodDetails1}</li>
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
 * "TimePeriod"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Particular time span specified between a start time and an end time. The time period cannot exceed 24 hours."
 * </li>
 * </ul>
 */
public class TimePeriod {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemAvailability systemAvailability;
	/**
	 * System for which a session period is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmAvailableSessionPeriod
	 * SystemAvailability.mmAvailableSessionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemAvailability
	 * SystemAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TimePeriod TimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemAvailability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which a session period is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystemAvailability = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemAvailability";
			definition = "System for which a session period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmAvailableSessionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmObject();
		}
	};
	protected ISOTime fromTime;
	/**
	 * Time at which the time span starts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TimePeriod TimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TimePeriodDetails#mmFromTime
	 * TimePeriodDetails.mmFromTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TimePeriodDetails1#mmFromTime
	 * TimePeriodDetails1.mmFromTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time at which the time span starts."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFromTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TimePeriodDetails.mmFromTime, com.tools20022.repository.msg.TimePeriodDetails1.mmFromTime);
			elementContext_lazy = () -> TimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FromTime";
			definition = "Time at which the time span starts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	protected ISOTime toTime;
	/**
	 * Time at which the time span ends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TimePeriod TimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TimePeriodDetails#mmToTime
	 * TimePeriodDetails.mmToTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TimePeriodDetails1#mmToTime
	 * TimePeriodDetails1.mmToTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time at which the time span ends."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmToTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TimePeriodDetails.mmToTime, com.tools20022.repository.msg.TimePeriodDetails1.mmToTime);
			elementContext_lazy = () -> TimePeriod.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ToTime";
			definition = "Time at which the time span ends.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TimePeriod";
				definition = "Particular time span specified between a start time and an end time. The time period cannot exceed 24 hours.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemAvailability.mmAvailableSessionPeriod);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TimePeriod.mmSystemAvailability, com.tools20022.repository.entity.TimePeriod.mmFromTime, com.tools20022.repository.entity.TimePeriod.mmToTime);
				derivationComponent_lazy = () -> Arrays.asList(TimePeriodDetails.mmObject(), TimePeriodDetails1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SystemAvailability getSystemAvailability() {
		return systemAvailability;
	}

	public void setSystemAvailability(com.tools20022.repository.entity.SystemAvailability systemAvailability) {
		this.systemAvailability = systemAvailability;
	}

	public ISOTime getFromTime() {
		return fromTime;
	}

	public void setFromTime(ISOTime fromTime) {
		this.fromTime = fromTime;
	}

	public ISOTime getToTime() {
		return toTime;
	}

	public void setToTime(ISOTime toTime) {
		this.toTime = toTime;
	}
}
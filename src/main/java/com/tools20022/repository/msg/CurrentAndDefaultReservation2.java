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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Reservation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ReservationReport4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports on reservations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2#mmCurrentReservation
 * CurrentAndDefaultReservation2.mmCurrentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2#mmDefaultReservation
 * CurrentAndDefaultReservation2.mmDefaultReservation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Reservation
 * Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrentAndDefaultReservation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reports on reservations."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation3
 * CurrentAndDefaultReservation3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation1
 * CurrentAndDefaultReservation1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrentAndDefaultReservation2", propOrder = {"currentReservation", "defaultReservation"})
public class CurrentAndDefaultReservation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CurRsvatn")
	protected List<ReservationReport4> currentReservation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReservationReport4
	 * ReservationReport4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2
	 * CurrentAndDefaultReservation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurRsvatn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentReservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report is given for a current reservation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation3#mmCurrentReservation
	 * CurrentAndDefaultReservation3.mmCurrentReservation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation1#mmCurrentReservation
	 * CurrentAndDefaultReservation1.mmCurrentReservation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrentAndDefaultReservation2, List<ReservationReport4>> mmCurrentReservation = new MMMessageAssociationEnd<CurrentAndDefaultReservation2, List<ReservationReport4>>() {
		{
			businessComponentTrace_lazy = () -> Reservation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrentAndDefaultReservation2.mmObject();
			isDerived = false;
			xmlTag = "CurRsvatn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentReservation";
			definition = "Report is given for a current reservation.";
			nextVersions_lazy = () -> Arrays.asList(CurrentAndDefaultReservation3.mmCurrentReservation);
			previousVersion_lazy = () -> CurrentAndDefaultReservation1.mmCurrentReservation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReservationReport4.mmObject();
		}

		@Override
		public List<ReservationReport4> getValue(CurrentAndDefaultReservation2 obj) {
			return obj.getCurrentReservation();
		}

		@Override
		public void setValue(CurrentAndDefaultReservation2 obj, List<ReservationReport4> value) {
			obj.setCurrentReservation(value);
		}
	};
	@XmlElement(name = "DfltRsvatn")
	protected List<ReservationReport4> defaultReservation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReservationReport4
	 * ReservationReport4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2
	 * CurrentAndDefaultReservation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltRsvatn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultReservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report is given for a default reservation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation3#mmDefaultReservation
	 * CurrentAndDefaultReservation3.mmDefaultReservation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation1#mmDefaultReservation
	 * CurrentAndDefaultReservation1.mmDefaultReservation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrentAndDefaultReservation2, List<ReservationReport4>> mmDefaultReservation = new MMMessageAssociationEnd<CurrentAndDefaultReservation2, List<ReservationReport4>>() {
		{
			businessComponentTrace_lazy = () -> Reservation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrentAndDefaultReservation2.mmObject();
			isDerived = false;
			xmlTag = "DfltRsvatn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultReservation";
			definition = "Report is given for a default reservation.";
			nextVersions_lazy = () -> Arrays.asList(CurrentAndDefaultReservation3.mmDefaultReservation);
			previousVersion_lazy = () -> CurrentAndDefaultReservation1.mmDefaultReservation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReservationReport4.mmObject();
		}

		@Override
		public List<ReservationReport4> getValue(CurrentAndDefaultReservation2 obj) {
			return obj.getDefaultReservation();
		}

		@Override
		public void setValue(CurrentAndDefaultReservation2 obj, List<ReservationReport4> value) {
			obj.setDefaultReservation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrentAndDefaultReservation2.mmCurrentReservation, com.tools20022.repository.msg.CurrentAndDefaultReservation2.mmDefaultReservation);
				trace_lazy = () -> Reservation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrentAndDefaultReservation2";
				definition = "Reports on reservations.";
				nextVersions_lazy = () -> Arrays.asList(CurrentAndDefaultReservation3.mmObject());
				previousVersion_lazy = () -> CurrentAndDefaultReservation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<ReservationReport4> getCurrentReservation() {
		return currentReservation == null ? currentReservation = new ArrayList<>() : currentReservation;
	}

	public CurrentAndDefaultReservation2 setCurrentReservation(List<ReservationReport4> currentReservation) {
		this.currentReservation = Objects.requireNonNull(currentReservation);
		return this;
	}

	public List<ReservationReport4> getDefaultReservation() {
		return defaultReservation == null ? defaultReservation = new ArrayList<>() : defaultReservation;
	}

	public CurrentAndDefaultReservation2 setDefaultReservation(List<ReservationReport4> defaultReservation) {
		this.defaultReservation = Objects.requireNonNull(defaultReservation);
		return this;
	}
}
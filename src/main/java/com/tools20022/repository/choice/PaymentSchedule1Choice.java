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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.msg.PaymentDateRange1;
import com.tools20022.repository.msg.PaymentDateRange2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Choice between expected/due payment date and a payment schedule per amount
 * and due date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentSchedule1Choice#mmDateRange
 * PaymentSchedule1Choice.mmDateRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentSchedule1Choice#mmSubSchedule
 * PaymentSchedule1Choice.mmSubSchedule}</li>
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
 * "PaymentSchedule1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between expected/due payment date and a payment schedule per amount and due date."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.ShipmentSchedule2Choice
 * ShipmentSchedule2Choice}</li>
 * </ul>
 */
public class PaymentSchedule1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentDateRange1 dateRange;
	/**
	 * Specifies an expected date and a due date for the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentDateRange1
	 * PaymentDateRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentSchedule1Choice
	 * PaymentSchedule1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an expected date and a due date for the payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ShipmentSchedule2Choice#mmShipmentDateRange
	 * ShipmentSchedule2Choice.mmShipmentDateRange}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDateRange = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentSchedule1Choice.mmObject();
			isDerived = false;
			xmlTag = "DtRg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateRange";
			definition = "Specifies an expected date and a due date for the payment.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.ShipmentSchedule2Choice.mmShipmentDateRange;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentDateRange1.mmObject();
		}
	};
	protected List<PaymentDateRange2> subSchedule;
	/**
	 * Specifies a payment sub-schedule, that is the amount of money that must
	 * be paid no sooner than the expected date and no later than the latest
	 * shipment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentDateRange2
	 * PaymentDateRange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentSchedule1Choice
	 * PaymentSchedule1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubSchdl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a payment sub-schedule, that is the amount of money that must be paid no sooner than the expected date and no later than the latest shipment date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ShipmentSchedule2Choice#mmShipmentSubSchedule
	 * ShipmentSchedule2Choice.mmShipmentSubSchedule}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubSchedule = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentSchedule1Choice.mmObject();
			isDerived = false;
			xmlTag = "SubSchdl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSchedule";
			definition = "Specifies a payment sub-schedule, that is the amount of money that must be paid no sooner than the expected date and no later than the latest shipment date.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.ShipmentSchedule2Choice.mmShipmentSubSchedule;
			minOccurs = 2;
			isComposite = true;
			type_lazy = () -> PaymentDateRange2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentSchedule1Choice.mmDateRange, com.tools20022.repository.choice.PaymentSchedule1Choice.mmSubSchedule);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentSchedule1Choice";
				definition = "Choice between expected/due payment date and a payment schedule per amount and due date.";
				previousVersion_lazy = () -> ShipmentSchedule2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentDateRange1 getDateRange() {
		return dateRange;
	}

	public void setDateRange(PaymentDateRange1 dateRange) {
		this.dateRange = dateRange;
	}

	public List<PaymentDateRange2> getSubSchedule() {
		return subSchedule;
	}

	public void setSubSchedule(List<PaymentDateRange2> subSchedule) {
		this.subSchedule = subSchedule;
	}
}
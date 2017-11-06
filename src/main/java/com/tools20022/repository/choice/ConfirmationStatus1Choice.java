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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.OrderConfirmationStatus1Code;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.msg.ConfirmationRejectedStatus2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Status of the confirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice#mmConfirmationRejected
 * ConfirmationStatus1Choice.mmConfirmationRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice#mmAmendmentRejected
 * ConfirmationStatus1Choice.mmAmendmentRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice#mmStatus
 * ConfirmationStatus1Choice.mmStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
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
 * "ConfirmationStatus1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of the confirmation."</li>
 * </ul>
 */
public class ConfirmationStatus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected List<ConfirmationRejectedStatus2> confirmationRejected;
	/**
	 * Status of the order confirmation is rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2
	 * ConfirmationRejectedStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConfirmationRejectedStatusReason
	 * SecuritiesOrderStatus.mmConfirmationRejectedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice
	 * ConfirmationStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfRjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the order confirmation is rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConfirmationRejected = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmConfirmationRejectedStatusReason;
			componentContext_lazy = () -> ConfirmationStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "ConfRjctd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationRejected";
			definition = "Status of the order confirmation is rejected.";
			maxOccurs = 10;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ConfirmationRejectedStatus2.mmObject();
		}
	};
	protected List<ConfirmationRejectedStatus2> amendmentRejected;
	/**
	 * Status of the order confirmation amendment is rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2
	 * ConfirmationRejectedStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
	 * SecuritiesOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice
	 * ConfirmationStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntRjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the order confirmation amendment is rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmendmentRejected = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrderStatus.mmObject();
			componentContext_lazy = () -> ConfirmationStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "AmdmntRjctd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentRejected";
			definition = "Status of the order confirmation amendment is rejected.";
			maxOccurs = 10;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ConfirmationRejectedStatus2.mmObject();
		}
	};
	protected OrderConfirmationStatus1Code status;
	/**
	 * Status of the order confirmation is accepted or received or sent to next
	 * party or there is a communication problem with next party. There is no
	 * reason attached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatus1Code
	 * OrderConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConfirmationStatus
	 * SecuritiesOrderStatus.mmConfirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice
	 * ConfirmationStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the order confirmation is accepted or received or sent to next party or there is a communication problem with next party. There is no reason attached."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmConfirmationStatus;
			componentContext_lazy = () -> ConfirmationStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the order confirmation is accepted or received or sent to next party or there is a communication problem with next party. There is no reason attached.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderConfirmationStatus1Code.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ConfirmationStatus1Choice.mmConfirmationRejected, com.tools20022.repository.choice.ConfirmationStatus1Choice.mmAmendmentRejected,
						com.tools20022.repository.choice.ConfirmationStatus1Choice.mmStatus);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ConfirmationStatus1Choice";
				definition = "Status of the confirmation.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<ConfirmationRejectedStatus2> getConfirmationRejected() {
		return confirmationRejected;
	}

	public void setConfirmationRejected(List<ConfirmationRejectedStatus2> confirmationRejected) {
		this.confirmationRejected = confirmationRejected;
	}

	public List<ConfirmationRejectedStatus2> getAmendmentRejected() {
		return amendmentRejected;
	}

	public void setAmendmentRejected(List<ConfirmationRejectedStatus2> amendmentRejected) {
		this.amendmentRejected = amendmentRejected;
	}

	public OrderConfirmationStatus1Code getStatus() {
		return status;
	}

	public void setStatus(OrderConfirmationStatus1Code status) {
		this.status = status;
	}
}
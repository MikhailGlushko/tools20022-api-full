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
import com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMTransaction12;
import com.tools20022.repository.msg.AutomatedTellerMachine3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the acknowledgement of an ATM reconciliation from the
 * ATM. manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAcknowledgement1#mmATM
 * ATMReconciliationAcknowledgement1.mmATM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAcknowledgement1#mmTransaction
 * ATMReconciliationAcknowledgement1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV01#mmATMReconciliationAcknowledgement
 * ATMReconciliationAcknowledgementV01.mmATMReconciliationAcknowledgement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMReconciliationAcknowledgement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the acknowledgement of an ATM reconciliation from the ATM. manager."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMReconciliationAcknowledgement1", propOrder = {"aTM", "transaction"})
public class ATMReconciliationAcknowledgement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ATM", required = true)
	protected AutomatedTellerMachine3 aTM;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine3
	 * AutomatedTellerMachine3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAcknowledgement1
	 * ATMReconciliationAcknowledgement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMReconciliationAcknowledgement1, AutomatedTellerMachine3> mmATM = new MMMessageAssociationEnd<ATMReconciliationAcknowledgement1, AutomatedTellerMachine3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReconciliationAcknowledgement1.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AutomatedTellerMachine3.mmObject();
		}

		@Override
		public AutomatedTellerMachine3 getValue(ATMReconciliationAcknowledgement1 obj) {
			return obj.getATM();
		}

		@Override
		public void setValue(ATMReconciliationAcknowledgement1 obj, AutomatedTellerMachine3 value) {
			obj.setATM(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction12 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction12
	 * ATMTransaction12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAcknowledgement1
	 * ATMReconciliationAcknowledgement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the reconciliation response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMReconciliationAcknowledgement1, ATMTransaction12> mmTransaction = new MMMessageAssociationEnd<ATMReconciliationAcknowledgement1, ATMTransaction12>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReconciliationAcknowledgement1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Information about the reconciliation response.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction12.mmObject();
		}

		@Override
		public ATMTransaction12 getValue(ATMReconciliationAcknowledgement1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMReconciliationAcknowledgement1 obj, ATMTransaction12 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMReconciliationAcknowledgement1.mmATM, com.tools20022.repository.msg.ATMReconciliationAcknowledgement1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMReconciliationAcknowledgementV01.mmATMReconciliationAcknowledgement);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMReconciliationAcknowledgement1";
				definition = "Information related to the acknowledgement of an ATM reconciliation from the ATM. manager.";
			}
		});
		return mmObject_lazy.get();
	}

	public AutomatedTellerMachine3 getATM() {
		return aTM;
	}

	public ATMReconciliationAcknowledgement1 setATM(AutomatedTellerMachine3 aTM) {
		this.aTM = Objects.requireNonNull(aTM);
		return this;
	}

	public ATMTransaction12 getTransaction() {
		return transaction;
	}

	public ATMReconciliationAcknowledgement1 setTransaction(ATMTransaction12 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}
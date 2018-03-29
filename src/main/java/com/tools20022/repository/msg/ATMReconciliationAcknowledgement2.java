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
import com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMTransaction26;
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
 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAcknowledgement2#mmATM
 * ATMReconciliationAcknowledgement2.mmATM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAcknowledgement2#mmTransaction
 * ATMReconciliationAcknowledgement2.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02#mmATMReconciliationAcknowledgement
 * ATMReconciliationAcknowledgementV02.mmATMReconciliationAcknowledgement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMReconciliationAcknowledgement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the acknowledgement of an ATM reconciliation from the ATM. manager."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMReconciliationAcknowledgement2", propOrder = {"aTM", "transaction"})
public class ATMReconciliationAcknowledgement2 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAcknowledgement2
	 * ATMReconciliationAcknowledgement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMReconciliationAcknowledgement2, AutomatedTellerMachine3> mmATM = new MMMessageAssociationEnd<ATMReconciliationAcknowledgement2, AutomatedTellerMachine3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReconciliationAcknowledgement2.mmObject();
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
		public AutomatedTellerMachine3 getValue(ATMReconciliationAcknowledgement2 obj) {
			return obj.getATM();
		}

		@Override
		public void setValue(ATMReconciliationAcknowledgement2 obj, AutomatedTellerMachine3 value) {
			obj.setATM(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction26 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction26
	 * ATMTransaction26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAcknowledgement2
	 * ATMReconciliationAcknowledgement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the reconciliation response."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMReconciliationAcknowledgement2, ATMTransaction26> mmTransaction = new MMMessageAssociationEnd<ATMReconciliationAcknowledgement2, ATMTransaction26>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReconciliationAcknowledgement2.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Information about the reconciliation response.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction26.mmObject();
		}

		@Override
		public ATMTransaction26 getValue(ATMReconciliationAcknowledgement2 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMReconciliationAcknowledgement2 obj, ATMTransaction26 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMReconciliationAcknowledgement2.mmATM, com.tools20022.repository.msg.ATMReconciliationAcknowledgement2.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMReconciliationAcknowledgementV02.mmATMReconciliationAcknowledgement);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMReconciliationAcknowledgement2";
				definition = "Information related to the acknowledgement of an ATM reconciliation from the ATM. manager.";
			}
		});
		return mmObject_lazy.get();
	}

	public AutomatedTellerMachine3 getATM() {
		return aTM;
	}

	public ATMReconciliationAcknowledgement2 setATM(AutomatedTellerMachine3 aTM) {
		this.aTM = Objects.requireNonNull(aTM);
		return this;
	}

	public ATMTransaction26 getTransaction() {
		return transaction;
	}

	public ATMReconciliationAcknowledgement2 setTransaction(ATMTransaction26 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}
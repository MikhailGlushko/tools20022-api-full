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
import com.tools20022.repository.area.caam.ATMReconciliationAdviceV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCommand5;
import com.tools20022.repository.msg.ATMCommand6;
import com.tools20022.repository.msg.ATMEnvironment10;
import com.tools20022.repository.msg.ATMTransaction11;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the reconciliation of an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice1#mmEnvironment
 * ATMReconciliationAdvice1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice1#mmCommandResult
 * ATMReconciliationAdvice1.mmCommandResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice1#mmCommandContext
 * ATMReconciliationAdvice1.mmCommandContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice1#mmTransaction
 * ATMReconciliationAdvice1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV01#mmATMReconciliationAdvice
 * ATMReconciliationAdviceV01.mmATMReconciliationAdvice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMReconciliationAdvice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the reconciliation of an ATM."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMReconciliationAdvice1", propOrder = {"environment", "commandResult", "commandContext", "transaction"})
public class ATMReconciliationAdvice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment10 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment10
	 * ATMEnvironment10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice1
	 * ATMReconciliationAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMReconciliationAdvice1, ATMEnvironment10> mmEnvironment = new MMMessageAssociationEnd<ATMReconciliationAdvice1, ATMEnvironment10>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReconciliationAdvice1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment10.mmObject();
		}

		@Override
		public ATMEnvironment10 getValue(ATMReconciliationAdvice1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMReconciliationAdvice1 obj, ATMEnvironment10 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "CmdRslt")
	protected List<ATMCommand5> commandResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand5
	 * ATMCommand5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice1
	 * ATMReconciliationAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Command result for reinitialisation of the transaction counters."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMReconciliationAdvice1, List<ATMCommand5>> mmCommandResult = new MMMessageAssociationEnd<ATMReconciliationAdvice1, List<ATMCommand5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReconciliationAdvice1.mmObject();
			isDerived = false;
			xmlTag = "CmdRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandResult";
			definition = "Command result for reinitialisation of the transaction counters.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand5.mmObject();
		}

		@Override
		public List<ATMCommand5> getValue(ATMReconciliationAdvice1 obj) {
			return obj.getCommandResult();
		}

		@Override
		public void setValue(ATMReconciliationAdvice1 obj, List<ATMCommand5> value) {
			obj.setCommandResult(value);
		}
	};
	@XmlElement(name = "CmdCntxt")
	protected ATMCommand6 commandContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand6
	 * ATMCommand6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice1
	 * ATMReconciliationAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdCntxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which has requested the reconciliation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMReconciliationAdvice1, Optional<ATMCommand6>> mmCommandContext = new MMMessageAssociationEnd<ATMReconciliationAdvice1, Optional<ATMCommand6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReconciliationAdvice1.mmObject();
			isDerived = false;
			xmlTag = "CmdCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandContext";
			definition = "Party which has requested the reconciliation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand6.mmObject();
		}

		@Override
		public Optional<ATMCommand6> getValue(ATMReconciliationAdvice1 obj) {
			return obj.getCommandContext();
		}

		@Override
		public void setValue(ATMReconciliationAdvice1 obj, Optional<ATMCommand6> value) {
			obj.setCommandContext(value.orElse(null));
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction11 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction11
	 * ATMTransaction11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMReconciliationAdvice1
	 * ATMReconciliationAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the reconciliation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMReconciliationAdvice1, ATMTransaction11> mmTransaction = new MMMessageAssociationEnd<ATMReconciliationAdvice1, ATMTransaction11>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMReconciliationAdvice1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Information about the reconciliation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction11.mmObject();
		}

		@Override
		public ATMTransaction11 getValue(ATMReconciliationAdvice1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMReconciliationAdvice1 obj, ATMTransaction11 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMReconciliationAdvice1.mmEnvironment, com.tools20022.repository.msg.ATMReconciliationAdvice1.mmCommandResult,
						com.tools20022.repository.msg.ATMReconciliationAdvice1.mmCommandContext, com.tools20022.repository.msg.ATMReconciliationAdvice1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMReconciliationAdviceV01.mmATMReconciliationAdvice);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMReconciliationAdvice1";
				definition = "Information related to the reconciliation of an ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment10 getEnvironment() {
		return environment;
	}

	public ATMReconciliationAdvice1 setEnvironment(ATMEnvironment10 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public List<ATMCommand5> getCommandResult() {
		return commandResult == null ? commandResult = new ArrayList<>() : commandResult;
	}

	public ATMReconciliationAdvice1 setCommandResult(List<ATMCommand5> commandResult) {
		this.commandResult = Objects.requireNonNull(commandResult);
		return this;
	}

	public Optional<ATMCommand6> getCommandContext() {
		return commandContext == null ? Optional.empty() : Optional.of(commandContext);
	}

	public ATMReconciliationAdvice1 setCommandContext(ATMCommand6 commandContext) {
		this.commandContext = commandContext;
		return this;
	}

	public ATMTransaction11 getTransaction() {
		return transaction;
	}

	public ATMReconciliationAdvice1 setTransaction(ATMTransaction11 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}
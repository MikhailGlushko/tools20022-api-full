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
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.msg.ProprietaryAgent3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the agents specific to the individual
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmInstructingAgent
 * TransactionAgents4.mmInstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmInstructedAgent
 * TransactionAgents4.mmInstructedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmDebtorAgent
 * TransactionAgents4.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmCreditorAgent
 * TransactionAgents4.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmIntermediaryAgent1
 * TransactionAgents4.mmIntermediaryAgent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmIntermediaryAgent2
 * TransactionAgents4.mmIntermediaryAgent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmIntermediaryAgent3
 * TransactionAgents4.mmIntermediaryAgent3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmReceivingAgent
 * TransactionAgents4.mmReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmDeliveringAgent
 * TransactionAgents4.mmDeliveringAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmIssuingAgent
 * TransactionAgents4.mmIssuingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmSettlementPlace
 * TransactionAgents4.mmSettlementPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAgents4#mmProprietary
 * TransactionAgents4.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
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
 * "TransactionAgents4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details on the agents specific to the individual transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransactionAgents3
 * TransactionAgents3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionAgents4", propOrder = {"instructingAgent", "instructedAgent", "debtorAgent", "creditorAgent", "intermediaryAgent1", "intermediaryAgent2", "intermediaryAgent3", "receivingAgent", "deliveringAgent",
		"issuingAgent", "settlementPlace", "proprietary"})
public class TransactionAgents4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstgAgt")
	protected BranchAndFinancialInstitutionIdentification5 instructingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that instructs the next party in the chain to carry out the (set of) instruction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>> mmInstructingAgent = new MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents4.mmObject();
			isDerived = false;
			xmlTag = "InstgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgent";
			definition = "Agent that instructs the next party in the chain to carry out the (set of) instruction(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(TransactionAgents4 obj) {
			return obj.getInstructingAgent();
		}

		@Override
		public void setValue(TransactionAgents4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setInstructingAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdAgt")
	protected BranchAndFinancialInstitutionIdentification5 instructedAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>> mmInstructedAgent = new MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents4.mmObject();
			isDerived = false;
			xmlTag = "InstdAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgent";
			definition = "Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(TransactionAgents4 obj) {
			return obj.getInstructedAgent();
		}

		@Override
		public void setValue(TransactionAgents4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setInstructedAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAgt")
	protected BranchAndFinancialInstitutionIdentification5 debtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmDebtorAgent
	 * TransactionAgents3.mmDebtorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>> mmDebtorAgent = new MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents4.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			previousVersion_lazy = () -> TransactionAgents3.mmDebtorAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(TransactionAgents4 obj) {
			return obj.getDebtorAgent();
		}

		@Override
		public void setValue(TransactionAgents4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setDebtorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAgt")
	protected BranchAndFinancialInstitutionIdentification5 creditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmCreditorAgent
	 * TransactionAgents3.mmCreditorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>> mmCreditorAgent = new MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents4.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			previousVersion_lazy = () -> TransactionAgents3.mmCreditorAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(TransactionAgents4 obj) {
			return obj.getCreditorAgent();
		}

		@Override
		public void setValue(TransactionAgents4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setCreditorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt1")
	protected BranchAndFinancialInstitutionIdentification5 intermediaryAgent1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the DebtorAgent and the IntermediaryAgent2."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmIntermediaryAgent1
	 * TransactionAgents3.mmIntermediaryAgent1}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>> mmIntermediaryAgent1 = new MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents4.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1";
			definition = "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the DebtorAgent and the IntermediaryAgent2.";
			previousVersion_lazy = () -> TransactionAgents3.mmIntermediaryAgent1;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(TransactionAgents4 obj) {
			return obj.getIntermediaryAgent1();
		}

		@Override
		public void setValue(TransactionAgents4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setIntermediaryAgent1(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt2")
	protected BranchAndFinancialInstitutionIdentification5 intermediaryAgent2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the IntermediaryAgent1 and the IntermediaryAgent3."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmIntermediaryAgent2
	 * TransactionAgents3.mmIntermediaryAgent2}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>> mmIntermediaryAgent2 = new MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents4.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2";
			definition = "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the IntermediaryAgent1 and the IntermediaryAgent3.";
			previousVersion_lazy = () -> TransactionAgents3.mmIntermediaryAgent2;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(TransactionAgents4 obj) {
			return obj.getIntermediaryAgent2();
		}

		@Override
		public void setValue(TransactionAgents4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setIntermediaryAgent2(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt3")
	protected BranchAndFinancialInstitutionIdentification5 intermediaryAgent3;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If IntermediaryAgent3 is present, then it identifies the agent between the IntermediaryAgent 2 and the CreditorAgent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmIntermediaryAgent3
	 * TransactionAgents3.mmIntermediaryAgent3}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>> mmIntermediaryAgent3 = new MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents4.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3";
			definition = "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If IntermediaryAgent3 is present, then it identifies the agent between the IntermediaryAgent 2 and the CreditorAgent.";
			previousVersion_lazy = () -> TransactionAgents3.mmIntermediaryAgent3;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(TransactionAgents4 obj) {
			return obj.getIntermediaryAgent3();
		}

		@Override
		public void setValue(TransactionAgents4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setIntermediaryAgent3(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgAgt")
	protected BranchAndFinancialInstitutionIdentification5 receivingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives securities from the delivering agent at the place of settlement, such as central securities depository.\nCan also be used in the context of treasury operations."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmReceivingAgent
	 * TransactionAgents3.mmReceivingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>> mmReceivingAgent = new MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents4.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgent";
			definition = "Party that receives securities from the delivering agent at the place of settlement, such as central securities depository.\nCan also be used in the context of treasury operations.";
			previousVersion_lazy = () -> TransactionAgents3.mmReceivingAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(TransactionAgents4 obj) {
			return obj.getReceivingAgent();
		}

		@Override
		public void setValue(TransactionAgents4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setReceivingAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgAgt")
	protected BranchAndFinancialInstitutionIdentification5 deliveringAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that delivers securities to the receiving agent at the place of settlement, such as a central securities depository.\nCan also be used in the context of treasury operations."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmDeliveringAgent
	 * TransactionAgents3.mmDeliveringAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>> mmDeliveringAgent = new MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents4.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgent";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, such as a central securities depository.\nCan also be used in the context of treasury operations.";
			previousVersion_lazy = () -> TransactionAgents3.mmDeliveringAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(TransactionAgents4 obj) {
			return obj.getDeliveringAgent();
		}

		@Override
		public void setValue(TransactionAgents4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setDeliveringAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "IssgAgt")
	protected BranchAndFinancialInstitutionIdentification5 issuingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal entity that has the right to issue securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmIssuingAgent
	 * TransactionAgents3.mmIssuingAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>> mmIssuingAgent = new MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents4.mmObject();
			isDerived = false;
			xmlTag = "IssgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuingAgent";
			definition = "Legal entity that has the right to issue securities.";
			previousVersion_lazy = () -> TransactionAgents3.mmIssuingAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(TransactionAgents4 obj) {
			return obj.getIssuingAgent();
		}

		@Override
		public void setValue(TransactionAgents4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setIssuingAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmPlc")
	protected BranchAndFinancialInstitutionIdentification5 settlementPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where settlement of the securities takes place.\nUsage: This is typed by a financial institution identification as this is the standard way to identify a securities settlement agent/central system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmSettlementPlace
	 * TransactionAgents3.mmSettlementPlace}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>> mmSettlementPlace = new MMMessageAssociationEnd<TransactionAgents4, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents4.mmObject();
			isDerived = false;
			xmlTag = "SttlmPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPlace";
			definition = "Place where settlement of the securities takes place.\nUsage: This is typed by a financial institution identification as this is the standard way to identify a securities settlement agent/central system.";
			previousVersion_lazy = () -> TransactionAgents3.mmSettlementPlace;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(TransactionAgents4 obj) {
			return obj.getSettlementPlace();
		}

		@Override
		public void setValue(TransactionAgents4 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setSettlementPlace(value.orElse(null));
		}
	};
	@XmlElement(name = "Prtry")
	protected List<ProprietaryAgent3> proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryAgent3
	 * ProprietaryAgent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents4
	 * TransactionAgents4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary agent related to the underlying transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAgents3#mmProprietary
	 * TransactionAgents3.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionAgents4, List<ProprietaryAgent3>> mmProprietary = new MMMessageAssociationEnd<TransactionAgents4, List<ProprietaryAgent3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionAgents4.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary agent related to the underlying transaction.";
			previousVersion_lazy = () -> TransactionAgents3.mmProprietary;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProprietaryAgent3.mmObject();
		}

		@Override
		public List<ProprietaryAgent3> getValue(TransactionAgents4 obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(TransactionAgents4 obj, List<ProprietaryAgent3> value) {
			obj.setProprietary(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionAgents4.mmInstructingAgent, com.tools20022.repository.msg.TransactionAgents4.mmInstructedAgent,
						com.tools20022.repository.msg.TransactionAgents4.mmDebtorAgent, com.tools20022.repository.msg.TransactionAgents4.mmCreditorAgent, com.tools20022.repository.msg.TransactionAgents4.mmIntermediaryAgent1,
						com.tools20022.repository.msg.TransactionAgents4.mmIntermediaryAgent2, com.tools20022.repository.msg.TransactionAgents4.mmIntermediaryAgent3, com.tools20022.repository.msg.TransactionAgents4.mmReceivingAgent,
						com.tools20022.repository.msg.TransactionAgents4.mmDeliveringAgent, com.tools20022.repository.msg.TransactionAgents4.mmIssuingAgent, com.tools20022.repository.msg.TransactionAgents4.mmSettlementPlace,
						com.tools20022.repository.msg.TransactionAgents4.mmProprietary);
				trace_lazy = () -> Role.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionAgents4";
				definition = "Provides further details on the agents specific to the individual transaction.";
				previousVersion_lazy = () -> TransactionAgents3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getInstructingAgent() {
		return instructingAgent == null ? Optional.empty() : Optional.of(instructingAgent);
	}

	public TransactionAgents4 setInstructingAgent(BranchAndFinancialInstitutionIdentification5 instructingAgent) {
		this.instructingAgent = instructingAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getInstructedAgent() {
		return instructedAgent == null ? Optional.empty() : Optional.of(instructedAgent);
	}

	public TransactionAgents4 setInstructedAgent(BranchAndFinancialInstitutionIdentification5 instructedAgent) {
		this.instructedAgent = instructedAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getDebtorAgent() {
		return debtorAgent == null ? Optional.empty() : Optional.of(debtorAgent);
	}

	public TransactionAgents4 setDebtorAgent(BranchAndFinancialInstitutionIdentification5 debtorAgent) {
		this.debtorAgent = debtorAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getCreditorAgent() {
		return creditorAgent == null ? Optional.empty() : Optional.of(creditorAgent);
	}

	public TransactionAgents4 setCreditorAgent(BranchAndFinancialInstitutionIdentification5 creditorAgent) {
		this.creditorAgent = creditorAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getIntermediaryAgent1() {
		return intermediaryAgent1 == null ? Optional.empty() : Optional.of(intermediaryAgent1);
	}

	public TransactionAgents4 setIntermediaryAgent1(BranchAndFinancialInstitutionIdentification5 intermediaryAgent1) {
		this.intermediaryAgent1 = intermediaryAgent1;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getIntermediaryAgent2() {
		return intermediaryAgent2 == null ? Optional.empty() : Optional.of(intermediaryAgent2);
	}

	public TransactionAgents4 setIntermediaryAgent2(BranchAndFinancialInstitutionIdentification5 intermediaryAgent2) {
		this.intermediaryAgent2 = intermediaryAgent2;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getIntermediaryAgent3() {
		return intermediaryAgent3 == null ? Optional.empty() : Optional.of(intermediaryAgent3);
	}

	public TransactionAgents4 setIntermediaryAgent3(BranchAndFinancialInstitutionIdentification5 intermediaryAgent3) {
		this.intermediaryAgent3 = intermediaryAgent3;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getReceivingAgent() {
		return receivingAgent == null ? Optional.empty() : Optional.of(receivingAgent);
	}

	public TransactionAgents4 setReceivingAgent(BranchAndFinancialInstitutionIdentification5 receivingAgent) {
		this.receivingAgent = receivingAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getDeliveringAgent() {
		return deliveringAgent == null ? Optional.empty() : Optional.of(deliveringAgent);
	}

	public TransactionAgents4 setDeliveringAgent(BranchAndFinancialInstitutionIdentification5 deliveringAgent) {
		this.deliveringAgent = deliveringAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getIssuingAgent() {
		return issuingAgent == null ? Optional.empty() : Optional.of(issuingAgent);
	}

	public TransactionAgents4 setIssuingAgent(BranchAndFinancialInstitutionIdentification5 issuingAgent) {
		this.issuingAgent = issuingAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getSettlementPlace() {
		return settlementPlace == null ? Optional.empty() : Optional.of(settlementPlace);
	}

	public TransactionAgents4 setSettlementPlace(BranchAndFinancialInstitutionIdentification5 settlementPlace) {
		this.settlementPlace = settlementPlace;
		return this;
	}

	public List<ProprietaryAgent3> getProprietary() {
		return proprietary == null ? proprietary = new ArrayList<>() : proprietary;
	}

	public TransactionAgents4 setProprietary(List<ProprietaryAgent3> proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}
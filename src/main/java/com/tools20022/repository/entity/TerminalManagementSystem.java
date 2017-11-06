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
import com.tools20022.repository.choice.ATMCommandParameters1Choice;
import com.tools20022.repository.codeset.TMSContactLevelCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Terminal management system (TMS), has in charge the maintenance of the
 * terminal, including monitoring, software update, configuration parameters
 * management.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TerminalManagementSystem"
 * src="doc-files/TerminalManagementSystem.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmAcceptorConfiguration
 * TerminalManagementSystem.mmAcceptorConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmNetworkAccess
 * TerminalManagementSystem.mmNetworkAccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmCardPaymentAcquiring
 * TerminalManagementSystem.mmCardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmContactLevel
 * TerminalManagementSystem.mmContactLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmContactDateTime
 * TerminalManagementSystem.mmContactDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmTerminalManagerRole
 * TerminalManagementSystem.mmTerminalManagerRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmControlledPointOfInteraction
 * TerminalManagementSystem.mmControlledPointOfInteraction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmAction
 * TerminalManagementSystem.mmAction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTMSTrigger
 * CardPaymentAcquiring.mmTMSTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmControllingTerminalManagementSystem
 * PointOfInteraction.mmControllingTerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTerminalManagementSystem
 * AcceptorConfiguration.mmTerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmTerminalManagementSystem
 * TerminalManagementAction.mmTerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmTerminalManagementSystem
 * NetworkAccess.mmTerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagerRole#mmTerminalManagementSystem
 * TerminalManagerRole.mmTerminalManagementSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.System System}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration1
 * AcquirerHostConfiguration1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HostCommunicationParameter1
 * HostCommunicationParameter1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration2
 * AcquirerHostConfiguration2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HostCommunicationParameter2
 * HostCommunicationParameter2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSTrigger1 TMSTrigger1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration3
 * AcquirerHostConfiguration3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HostCommunicationParameter3
 * HostCommunicationParameter3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCompletionAdvice1
 * ATMCompletionAdvice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement1
 * ATMCompletionAcknowledgement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand1 ATMCommand1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommandParameters1
 * ATMCommandParameters1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand4 ATMCommand4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand5 ATMCommand5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice
 * ATMCommandParameters1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HostCommunicationParameter4
 * HostCommunicationParameter4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCompletionAdvice2
 * ATMCompletionAdvice2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement2
 * ATMCompletionAcknowledgement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand7 ATMCommand7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand8 ATMCommand8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration4
 * AcquirerHostConfiguration4}</li>
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
 * "TerminalManagementSystem"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Terminal management system (TMS), has in charge the maintenance of the terminal, including monitoring, software update, configuration parameters management."
 * </li>
 * </ul>
 */
public class TerminalManagementSystem extends System {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.AcceptorConfiguration> acceptorConfiguration;
	/**
	 * Acceptor parameters to be downloaded from the terminal management system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTerminalManagementSystem
	 * AcceptorConfiguration.mmTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acceptor parameters to be downloaded from the terminal management system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAcceptorConfiguration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptorConfiguration";
			definition = "Acceptor parameters to be downloaded from the terminal management system.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmTerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.NetworkAccess> networkAccess;
	/**
	 * Parameters used to access a network.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmTerminalManagementSystem
	 * NetworkAccess.mmTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.NetworkAccess
	 * NetworkAccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction1#mmAddress
	 * TMSAction1.mmAddress}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#mmAddress
	 * TMSAction2.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter1#mmAddress
	 * HostCommunicationParameter1.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter2#mmAddress
	 * HostCommunicationParameter2.mmAddress}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3#mmAddress
	 * TMSAction3.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter3#mmAddress
	 * HostCommunicationParameter3.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter4#mmAddress
	 * HostCommunicationParameter4.mmAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkAccess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters used to access a network."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetworkAccess = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction1.mmAddress, com.tools20022.repository.msg.TMSAction2.mmAddress, com.tools20022.repository.msg.HostCommunicationParameter1.mmAddress,
					com.tools20022.repository.msg.HostCommunicationParameter2.mmAddress, com.tools20022.repository.msg.TMSAction3.mmAddress, com.tools20022.repository.msg.HostCommunicationParameter3.mmAddress,
					com.tools20022.repository.msg.HostCommunicationParameter4.mmAddress);
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetworkAccess";
			definition = "Parameters used to access a network.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmTerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmObject();
		}
	};
	protected CardPaymentAcquiring cardPaymentAcquiring;
	/**
	 * Process for which a TMS trigger is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTMSTrigger
	 * CardPaymentAcquiring.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
	 * CardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentAcquiring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Process for which a TMS trigger is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCardPaymentAcquiring = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentAcquiring";
			definition = "Process for which a TMS trigger is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmTMSTrigger;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmObject();
		}
	};
	protected TMSContactLevelCode contactLevel;
	/**
	 * Level of urgency in contacting the maintenance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevelCode
	 * TMSContactLevelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSTrigger1#mmTMSContactLevel
	 * TMSTrigger1.mmTMSContactLevel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand1#mmUrgency
	 * ATMCommand1.mmUrgency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand4#mmUrgency
	 * ATMCommand4.mmUrgency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand7#mmUrgency
	 * ATMCommand7.mmUrgency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Level of urgency in contacting the maintenance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmContactLevel = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSTrigger1.mmTMSContactLevel, com.tools20022.repository.msg.ATMCommand1.mmUrgency, com.tools20022.repository.msg.ATMCommand4.mmUrgency,
					com.tools20022.repository.msg.ATMCommand7.mmUrgency);
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactLevel";
			definition = "Level of urgency in contacting the maintenance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TMSContactLevelCode.mmObject();
		}
	};
	protected ISODateTime contactDateTime;
	/**
	 * Date and time for calling the maintenance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSTrigger1#mmTMSContactDateTime
	 * TMSTrigger1.mmTMSContactDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time for calling the maintenance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmContactDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSTrigger1.mmTMSContactDateTime);
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactDateTime";
			definition = "Date and time for calling the maintenance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TerminalManagerRole> terminalManagerRole;
	/**
	 * Identifies the party which is the terminal manager (TM) to contact for
	 * the maintenance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagerRole#mmTerminalManagementSystem
	 * TerminalManagerRole.mmTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TerminalManagerRole
	 * TerminalManagerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagerRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party which is the terminal manager (TM) to contact for the maintenance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTerminalManagerRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalManagerRole";
			definition = "Identifies the party which is the terminal manager (TM) to contact for the maintenance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagerRole.mmTerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagerRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PointOfInteraction> controlledPointOfInteraction;
	/**
	 * Specifies each point of interaction controlled by a TMS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PointOfInteraction#mmControllingTerminalManagementSystem
	 * PointOfInteraction.mmControllingTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PointOfInteraction
	 * PointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlledPointOfInteraction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies each point of interaction controlled by a TMS."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmControlledPointOfInteraction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ControlledPointOfInteraction";
			definition = "Specifies each point of interaction controlled by a TMS.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmControllingTerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TerminalManagementAction> action;
	/**
	 * Terminal management action to be performed by the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmTerminalManagementSystem
	 * TerminalManagementAction.mmTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Action"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management action to be performed by the point of interaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TerminalManagementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Action";
			definition = "Terminal management action to be performed by the point of interaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmTerminalManagementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementSystem";
				definition = "Terminal management system (TMS), has in charge the maintenance of the terminal, including monitoring, software update, configuration parameters management.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentAcquiring.mmTMSTrigger, com.tools20022.repository.entity.PointOfInteraction.mmControllingTerminalManagementSystem,
						com.tools20022.repository.entity.AcceptorConfiguration.mmTerminalManagementSystem, com.tools20022.repository.entity.TerminalManagementAction.mmTerminalManagementSystem,
						com.tools20022.repository.entity.NetworkAccess.mmTerminalManagementSystem, com.tools20022.repository.entity.TerminalManagerRole.mmTerminalManagementSystem);
				superType_lazy = () -> System.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.mmAcceptorConfiguration, com.tools20022.repository.entity.TerminalManagementSystem.mmNetworkAccess,
						com.tools20022.repository.entity.TerminalManagementSystem.mmCardPaymentAcquiring, com.tools20022.repository.entity.TerminalManagementSystem.mmContactLevel,
						com.tools20022.repository.entity.TerminalManagementSystem.mmContactDateTime, com.tools20022.repository.entity.TerminalManagementSystem.mmTerminalManagerRole,
						com.tools20022.repository.entity.TerminalManagementSystem.mmControlledPointOfInteraction, com.tools20022.repository.entity.TerminalManagementSystem.mmAction);
				derivationComponent_lazy = () -> Arrays.asList(AcquirerHostConfiguration1.mmObject(), HostCommunicationParameter1.mmObject(), AcquirerHostConfiguration2.mmObject(), HostCommunicationParameter2.mmObject(),
						TMSTrigger1.mmObject(), AcquirerHostConfiguration3.mmObject(), HostCommunicationParameter3.mmObject(), ATMCompletionAdvice1.mmObject(), ATMCompletionAcknowledgement1.mmObject(), ATMCommand1.mmObject(),
						ATMCommandParameters1.mmObject(), ATMCommand4.mmObject(), ATMCommand5.mmObject(), ATMCommandParameters1Choice.mmObject(), HostCommunicationParameter4.mmObject(), ATMCompletionAdvice2.mmObject(),
						ATMCompletionAcknowledgement2.mmObject(), ATMCommand7.mmObject(), ATMCommand8.mmObject(), AcquirerHostConfiguration4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<AcceptorConfiguration> getAcceptorConfiguration() {
		return acceptorConfiguration;
	}

	public void setAcceptorConfiguration(List<com.tools20022.repository.entity.AcceptorConfiguration> acceptorConfiguration) {
		this.acceptorConfiguration = acceptorConfiguration;
	}

	public List<NetworkAccess> getNetworkAccess() {
		return networkAccess;
	}

	public void setNetworkAccess(List<com.tools20022.repository.entity.NetworkAccess> networkAccess) {
		this.networkAccess = networkAccess;
	}

	public CardPaymentAcquiring getCardPaymentAcquiring() {
		return cardPaymentAcquiring;
	}

	public void setCardPaymentAcquiring(com.tools20022.repository.entity.CardPaymentAcquiring cardPaymentAcquiring) {
		this.cardPaymentAcquiring = cardPaymentAcquiring;
	}

	public TMSContactLevelCode getContactLevel() {
		return contactLevel;
	}

	public void setContactLevel(TMSContactLevelCode contactLevel) {
		this.contactLevel = contactLevel;
	}

	public ISODateTime getContactDateTime() {
		return contactDateTime;
	}

	public void setContactDateTime(ISODateTime contactDateTime) {
		this.contactDateTime = contactDateTime;
	}

	public List<TerminalManagerRole> getTerminalManagerRole() {
		return terminalManagerRole;
	}

	public void setTerminalManagerRole(List<com.tools20022.repository.entity.TerminalManagerRole> terminalManagerRole) {
		this.terminalManagerRole = terminalManagerRole;
	}

	public List<PointOfInteraction> getControlledPointOfInteraction() {
		return controlledPointOfInteraction;
	}

	public void setControlledPointOfInteraction(List<com.tools20022.repository.entity.PointOfInteraction> controlledPointOfInteraction) {
		this.controlledPointOfInteraction = controlledPointOfInteraction;
	}

	public List<TerminalManagementAction> getAction() {
		return action;
	}

	public void setAction(List<com.tools20022.repository.entity.TerminalManagementAction> action) {
		this.action = action;
	}
}
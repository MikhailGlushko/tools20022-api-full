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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.DataSetCategory4Code;
import com.tools20022.repository.codeset.TerminalManagementAction1Code;
import com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code;
import com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.TerminalManagementAction;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Single terminal management action to be performed by the point of
 * interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#mmType
 * TMSAction4.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#mmRemoteAccess
 * TMSAction4.mmRemoteAccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction4#mmTerminalManagerIdentification
 * TMSAction4.mmTerminalManagerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#mmTMSProtocol
 * TMSAction4.mmTMSProtocol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction4#mmTMSProtocolVersion
 * TMSAction4.mmTMSProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction4#mmDataSetIdentification
 * TMSAction4.mmDataSetIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#mmComponentType
 * TMSAction4.mmComponentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction4#mmParametersSubsetIdentification
 * TMSAction4.mmParametersSubsetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction4#mmParametersSubsetDefinition
 * TMSAction4.mmParametersSubsetDefinition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#mmDelegationProof
 * TMSAction4.mmDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction4#mmProtectedDelegationProof
 * TMSAction4.mmProtectedDelegationProof}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#mmTrigger
 * TMSAction4.mmTrigger}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#mmAdditionalProcess
 * TMSAction4.mmAdditionalProcess}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#mmReTry
 * TMSAction4.mmReTry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#mmTimeCondition
 * TMSAction4.mmTimeCondition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#mmTMChallenge
 * TMSAction4.mmTMChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction4#mmKeyEnciphermentCertificate
 * TMSAction4.mmKeyEnciphermentCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction4#mmErrorAction
 * TMSAction4.mmErrorAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction4#mmAdditionalInformation
 * TMSAction4.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
 * TerminalManagementAction}</li>
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
 * "TMSAction4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Single terminal management action to be performed by the point of interaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5 TMSAction5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TMSAction3
 * TMSAction3}</li>
 * </ul>
 */
public class TMSAction4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TerminalManagementAction1Code type;
	/**
	 * Types of action to be performed by a point of interaction (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code
	 * TerminalManagementAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmType
	 * TerminalManagementAction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Types of action to be performed by a point of interaction (POI)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5#mmType
	 * TMSAction5.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#mmType
	 * TMSAction3.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmType;
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Types of action to be performed by a point of interaction (POI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmType);
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSAction3.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction1Code.mmObject();
		}
	};
	protected NetworkParameters3 remoteAccess;
	/**
	 * Host access information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters3
	 * NetworkParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmotAccs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemoteAccess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Host access information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5#mmRemoteAccess
	 * TMSAction5.mmRemoteAccess}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemoteAccess = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "RmotAccs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemoteAccess";
			definition = "Host access information.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmRemoteAccess);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetworkParameters3.mmObject();
		}
	};
	protected GenericIdentification71 terminalManagerIdentification;
	/**
	 * Identification of the master terminal manager or the terminal manager
	 * with which the POI has to perform the action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification71
	 * GenericIdentification71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermnlMgrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the master terminal manager or the terminal manager with which the POI has to perform the action."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmTerminalManagerIdentification
	 * TMSAction5.mmTerminalManagerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminalManagerIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "TermnlMgrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalManagerIdentification";
			definition = "Identification of the master terminal manager or the terminal manager with which the POI has to perform the action.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmTerminalManagerIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification71.mmObject();
		}
	};
	protected Max35Text tMSProtocol;
	/**
	 * TMS protocol to use for performing the maintenance action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMSPrtcol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TMS protocol to use for performing the maintenance action."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5#mmTMSProtocol
	 * TMSAction5.mmTMSProtocol}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTMSProtocol = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcol";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocol";
			definition = "TMS protocol to use for performing the maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmTMSProtocol);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text tMSProtocolVersion;
	/**
	 * Version of the TMS protocol to use to perform the maintenance action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMSPrtcolVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Version of the TMS protocol to use to perform the maintenance action."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmTMSProtocolVersion
	 * TMSAction5.mmTMSProtocolVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTMSProtocolVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcolVrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolVersion";
			definition = "Version of the TMS protocol to use to perform the maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmTMSProtocolVersion);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DataSetIdentification4 dataSetIdentification;
	/**
	 * Data set on which the action has to be performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification4
	 * DataSetIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set on which the action has to be performed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmDataSetIdentification
	 * TMSAction5.mmDataSetIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#mmDataSetIdentification
	 * TMSAction3.mmDataSetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Data set on which the action has to be performed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmDataSetIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSAction3.mmDataSetIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DataSetIdentification4.mmObject();
		}
	};
	protected List<DataSetCategory4Code> componentType;
	/**
	 * Type of POI components to send in a status report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory4Code
	 * DataSetCategory4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpntTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComponentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of POI components to send in a status report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5#mmComponentType
	 * TMSAction5.mmComponentType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmComponentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "CmpntTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComponentType";
			definition = "Type of POI components to send in a status report.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmComponentType);
			minOccurs = 0;
			simpleType_lazy = () -> DataSetCategory4Code.mmObject();
		}
	};
	protected Max35Text parametersSubsetIdentification;
	/**
	 * Identification of the parameters subset assigned by the MTM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ParamsSubsetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParametersSubsetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the parameters subset assigned by the MTM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmDelegationScopeIdentification
	 * TMSAction5.mmDelegationScopeIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParametersSubsetIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "ParamsSubsetId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParametersSubsetIdentification";
			definition = "Identification of the parameters subset assigned by the MTM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmDelegationScopeIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max3000Binary parametersSubsetDefinition;
	/**
	 * Definition of the subset of application parameters, for instance the
	 * range of application profiles, the RID (registered application provider
	 * identification).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3000Binary
	 * Max3000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ParamsSubsetDef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParametersSubsetDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Definition of the subset of application parameters, for instance the range of application profiles, the RID (registered application provider identification)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmDelegationScopeDefinition
	 * TMSAction5.mmDelegationScopeDefinition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParametersSubsetDefinition = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "ParamsSubsetDef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParametersSubsetDefinition";
			definition = "Definition of the subset of application parameters, for instance the range of application profiles, the RID (registered application provider identification).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmDelegationScopeDefinition);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}
	};
	protected Max5000Binary delegationProof;
	/**
	 * Proof of delegation to be verified by the POI, when performing the
	 * delegated actions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proof of delegation to be verified by the POI, when performing the delegated actions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmDelegationProof
	 * TMSAction5.mmDelegationProof}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDelegationProof = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "DlgtnProof";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationProof";
			definition = "Proof of delegation to be verified by the POI, when performing the delegated actions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmDelegationProof);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};
	protected ContentInformationType12 protectedDelegationProof;
	/**
	 * Protected proof of delegation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdDlgtnProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedDelegationProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protected proof of delegation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmProtectedDelegationProof
	 * TMSAction5.mmProtectedDelegationProof}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedDelegationProof = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "PrtctdDlgtnProof";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedDelegationProof";
			definition = "Protected proof of delegation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmProtectedDelegationProof);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType12.mmObject();
		}
	};
	protected TerminalManagementActionTrigger1Code trigger;
	/**
	 * Event on which the action has to be activated by the point of interaction
	 * (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code
	 * TerminalManagementActionTrigger1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmTrigger
	 * TerminalManagementAction.mmTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trggr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event on which the action has to be activated by the point of interaction (POI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5#mmTrigger
	 * TMSAction5.mmTrigger}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#mmTrigger
	 * TMSAction3.mmTrigger}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTrigger = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmTrigger;
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "Trggr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trigger";
			definition = "Event on which the action has to be activated by the point of interaction (POI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmTrigger);
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSAction3.mmTrigger;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionTrigger1Code.mmObject();
		}
	};
	protected List<TerminalManagementAdditionalProcess1Code> additionalProcess;
	/**
	 * Additional process to perform before starting or after completing the
	 * action by the point of interaction (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code
	 * TerminalManagementAdditionalProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmAdditionalProcess
	 * TerminalManagementAction.mmAdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional process to perform before starting or after completing the action by the point of interaction (POI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmAdditionalProcess
	 * TMSAction5.mmAdditionalProcess}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#mmAdditionalProcess
	 * TMSAction3.mmAdditionalProcess}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalProcess = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TerminalManagementAction.mmAdditionalProcess;
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "AddtlPrc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalProcess";
			definition = "Additional process to perform before starting or after completing the action by the point of interaction (POI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmAdditionalProcess);
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSAction3.mmAdditionalProcess;
			minOccurs = 0;
			simpleType_lazy = () -> TerminalManagementAdditionalProcess1Code.mmObject();
		}
	};
	protected ProcessRetry2 reTry;
	/**
	 * Definition of retry process if activation of the action fails.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessRetry2
	 * ProcessRetry2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReTry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReTry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Definition of retry process if activation of the action fails."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5#mmReTry
	 * TMSAction5.mmReTry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#mmReTry
	 * TMSAction3.mmReTry}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReTry = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "ReTry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTry";
			definition = "Definition of retry process if activation of the action fails.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmReTry);
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSAction3.mmReTry;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessRetry2.mmObject();
		}
	};
	protected ProcessTiming3 timeCondition;
	/**
	 * Date and time the action has to be performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessTiming3
	 * ProcessTiming3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time the action has to be performed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5#mmTimeCondition
	 * TMSAction5.mmTimeCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#mmTimeCondition
	 * TMSAction3.mmTimeCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTimeCondition = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "TmCond";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeCondition";
			definition = "Date and time the action has to be performed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmTimeCondition);
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSAction3.mmTimeCondition;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessTiming3.mmObject();
		}
	};
	protected Max140Binary tMChallenge;
	/**
	 * Terminal manager challenge for cryptographic key injection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMChllng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal manager challenge for cryptographic key injection."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5#mmTMChallenge
	 * TMSAction5.mmTMChallenge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#mmTMChallenge
	 * TMSAction3.mmTMChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTMChallenge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "TMChllng";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMChallenge";
			definition = "Terminal manager challenge for cryptographic key injection.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmTMChallenge);
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSAction3.mmTMChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	protected List<Max10KBinary> keyEnciphermentCertificate;
	/**
	 * Certificate chain for the encryption of temporary transport key of the
	 * key to inject.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10KBinary Max10KBinary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyNcphrmntCert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyEnciphermentCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate chain for the encryption of temporary transport key of the key to inject."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmKeyEnciphermentCertificate
	 * TMSAction5.mmKeyEnciphermentCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#mmKeyEnciphermentCertificate
	 * TMSAction3.mmKeyEnciphermentCertificate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmKeyEnciphermentCertificate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "KeyNcphrmntCert";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyEnciphermentCertificate";
			definition = "Certificate chain for the encryption of temporary transport key of the key to inject.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmKeyEnciphermentCertificate);
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSAction3.mmKeyEnciphermentCertificate;
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ErrorAction2> errorAction;
	/**
	 * Action to perform in case of error on the related action in progress.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorAction2
	 * ErrorAction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ErrActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Action to perform in case of error on the related action in progress."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction5#mmErrorAction
	 * TMSAction5.mmErrorAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#mmErrorAction
	 * TMSAction3.mmErrorAction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmErrorAction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "ErrActn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorAction";
			definition = "Action to perform in case of error on the related action in progress.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmErrorAction);
			previousVersion_lazy = () -> com.tools20022.repository.msg.TMSAction3.mmErrorAction;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ErrorAction2.mmObject();
		}
	};
	protected List<Max3000Binary> additionalInformation;
	/**
	 * Additional information about the maintenance action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3000Binary
	 * Max3000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction4
	 * TMSAction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the maintenance action."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction5#mmAdditionalInformation
	 * TMSAction5.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSAction4.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction5.mmAdditionalInformation);
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSAction4.mmType, com.tools20022.repository.msg.TMSAction4.mmRemoteAccess, com.tools20022.repository.msg.TMSAction4.mmTerminalManagerIdentification,
						com.tools20022.repository.msg.TMSAction4.mmTMSProtocol, com.tools20022.repository.msg.TMSAction4.mmTMSProtocolVersion, com.tools20022.repository.msg.TMSAction4.mmDataSetIdentification,
						com.tools20022.repository.msg.TMSAction4.mmComponentType, com.tools20022.repository.msg.TMSAction4.mmParametersSubsetIdentification, com.tools20022.repository.msg.TMSAction4.mmParametersSubsetDefinition,
						com.tools20022.repository.msg.TMSAction4.mmDelegationProof, com.tools20022.repository.msg.TMSAction4.mmProtectedDelegationProof, com.tools20022.repository.msg.TMSAction4.mmTrigger,
						com.tools20022.repository.msg.TMSAction4.mmAdditionalProcess, com.tools20022.repository.msg.TMSAction4.mmReTry, com.tools20022.repository.msg.TMSAction4.mmTimeCondition,
						com.tools20022.repository.msg.TMSAction4.mmTMChallenge, com.tools20022.repository.msg.TMSAction4.mmKeyEnciphermentCertificate, com.tools20022.repository.msg.TMSAction4.mmErrorAction,
						com.tools20022.repository.msg.TMSAction4.mmAdditionalInformation);
				trace_lazy = () -> TerminalManagementAction.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TMSAction4";
				definition = "Single terminal management action to be performed by the point of interaction.";
				nextVersions_lazy = () -> Arrays.asList(TMSAction5.mmObject());
				previousVersion_lazy = () -> TMSAction3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction1Code getType() {
		return type;
	}

	public void setType(TerminalManagementAction1Code type) {
		this.type = type;
	}

	public NetworkParameters3 getRemoteAccess() {
		return remoteAccess;
	}

	public void setRemoteAccess(com.tools20022.repository.msg.NetworkParameters3 remoteAccess) {
		this.remoteAccess = remoteAccess;
	}

	public GenericIdentification71 getTerminalManagerIdentification() {
		return terminalManagerIdentification;
	}

	public void setTerminalManagerIdentification(com.tools20022.repository.msg.GenericIdentification71 terminalManagerIdentification) {
		this.terminalManagerIdentification = terminalManagerIdentification;
	}

	public Max35Text getTMSProtocol() {
		return tMSProtocol;
	}

	public void setTMSProtocol(Max35Text tMSProtocol) {
		this.tMSProtocol = tMSProtocol;
	}

	public Max35Text getTMSProtocolVersion() {
		return tMSProtocolVersion;
	}

	public void setTMSProtocolVersion(Max35Text tMSProtocolVersion) {
		this.tMSProtocolVersion = tMSProtocolVersion;
	}

	public DataSetIdentification4 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public void setDataSetIdentification(com.tools20022.repository.msg.DataSetIdentification4 dataSetIdentification) {
		this.dataSetIdentification = dataSetIdentification;
	}

	public List<DataSetCategory4Code> getComponentType() {
		return componentType;
	}

	public void setComponentType(List<DataSetCategory4Code> componentType) {
		this.componentType = componentType;
	}

	public Max35Text getParametersSubsetIdentification() {
		return parametersSubsetIdentification;
	}

	public void setParametersSubsetIdentification(Max35Text parametersSubsetIdentification) {
		this.parametersSubsetIdentification = parametersSubsetIdentification;
	}

	public Max3000Binary getParametersSubsetDefinition() {
		return parametersSubsetDefinition;
	}

	public void setParametersSubsetDefinition(Max3000Binary parametersSubsetDefinition) {
		this.parametersSubsetDefinition = parametersSubsetDefinition;
	}

	public Max5000Binary getDelegationProof() {
		return delegationProof;
	}

	public void setDelegationProof(Max5000Binary delegationProof) {
		this.delegationProof = delegationProof;
	}

	public ContentInformationType12 getProtectedDelegationProof() {
		return protectedDelegationProof;
	}

	public void setProtectedDelegationProof(com.tools20022.repository.msg.ContentInformationType12 protectedDelegationProof) {
		this.protectedDelegationProof = protectedDelegationProof;
	}

	public TerminalManagementActionTrigger1Code getTrigger() {
		return trigger;
	}

	public void setTrigger(TerminalManagementActionTrigger1Code trigger) {
		this.trigger = trigger;
	}

	public List<TerminalManagementAdditionalProcess1Code> getAdditionalProcess() {
		return additionalProcess;
	}

	public void setAdditionalProcess(List<TerminalManagementAdditionalProcess1Code> additionalProcess) {
		this.additionalProcess = additionalProcess;
	}

	public ProcessRetry2 getReTry() {
		return reTry;
	}

	public void setReTry(com.tools20022.repository.msg.ProcessRetry2 reTry) {
		this.reTry = reTry;
	}

	public ProcessTiming3 getTimeCondition() {
		return timeCondition;
	}

	public void setTimeCondition(com.tools20022.repository.msg.ProcessTiming3 timeCondition) {
		this.timeCondition = timeCondition;
	}

	public Max140Binary getTMChallenge() {
		return tMChallenge;
	}

	public void setTMChallenge(Max140Binary tMChallenge) {
		this.tMChallenge = tMChallenge;
	}

	public List<Max10KBinary> getKeyEnciphermentCertificate() {
		return keyEnciphermentCertificate;
	}

	public void setKeyEnciphermentCertificate(List<Max10KBinary> keyEnciphermentCertificate) {
		this.keyEnciphermentCertificate = keyEnciphermentCertificate;
	}

	public List<ErrorAction2> getErrorAction() {
		return errorAction;
	}

	public void setErrorAction(List<com.tools20022.repository.msg.ErrorAction2> errorAction) {
		this.errorAction = errorAction;
	}

	public List<Max3000Binary> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<Max3000Binary> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}
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
import com.tools20022.repository.codeset.BatchTransactionType1Code;
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.AcceptorConfiguration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Acceptor parameters dedicated to the acquirer protocol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmActionType
 * AcquirerProtocolParameters10.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmAcquirerIdentification
 * AcquirerProtocolParameters10.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmVersion
 * AcquirerProtocolParameters10.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmApplicationIdentification
 * AcquirerProtocolParameters10.mmApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmHost
 * AcquirerProtocolParameters10.mmHost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmOnLineTransaction
 * AcquirerProtocolParameters10.mmOnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmOffLineTransaction
 * AcquirerProtocolParameters10.mmOffLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmReconciliationExchange
 * AcquirerProtocolParameters10.mmReconciliationExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmReconciliationByAcquirer
 * AcquirerProtocolParameters10.mmReconciliationByAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmTotalsPerCurrency
 * AcquirerProtocolParameters10.mmTotalsPerCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmSplitTotals
 * AcquirerProtocolParameters10.mmSplitTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmReconciliationError
 * AcquirerProtocolParameters10.mmReconciliationError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmCardDataVerification
 * AcquirerProtocolParameters10.mmCardDataVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmNotifyOffLineCancellation
 * AcquirerProtocolParameters10.mmNotifyOffLineCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmBatchTransferContent
 * AcquirerProtocolParameters10.mmBatchTransferContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmFileTransferBatch
 * AcquirerProtocolParameters10.mmFileTransferBatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmBatchDigitalSignature
 * AcquirerProtocolParameters10.mmBatchDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmMessageItem
 * AcquirerProtocolParameters10.mmMessageItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmProtectCardData
 * AcquirerProtocolParameters10.mmProtectCardData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmMandatorySecurityTrailer
 * AcquirerProtocolParameters10.mmMandatorySecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
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
 * "AcquirerProtocolParameters10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Acceptor parameters dedicated to the acquirer protocol."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9
 * AcquirerProtocolParameters9}</li>
 * </ul>
 */
public class AcquirerProtocolParameters10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TerminalManagementAction3Code actionType;
	/**
	 * Type of action for the configuration parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of action for the configuration parameters."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmActionType
	 * AcquirerProtocolParameters9.mmActionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Type of action for the configuration parameters.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmActionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GenericIdentification53> acquirerIdentification;
	/**
	 * Identification of the acquirer using this protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53
	 * GenericIdentification53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqrrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the acquirer using this protocol."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmAcquirerIdentification
	 * AcquirerProtocolParameters9.mmAcquirerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirerIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "AcqrrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerIdentification";
			definition = "Identification of the acquirer using this protocol.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmAcquirerIdentification;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification53.mmObject();
		}
	};
	protected Max256Text version;
	/**
	 * Version of the acquirer protocol parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the acquirer protocol parameters."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmVersion
	 * AcquirerProtocolParameters9.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the acquirer protocol parameters.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected List<Max35Text> applicationIdentification;
	/**
	 * Identification of the payment application, user of the acquirer protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationIdentification
	 * AcceptorConfiguration.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the payment application, user of the acquirer protocol."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmApplicationIdentification
	 * AcquirerProtocolParameters9.mmApplicationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApplicationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmApplicationIdentification;
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "ApplId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of the payment application, user of the acquirer protocol.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmApplicationIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AcquirerHostConfiguration4> host;
	/**
	 * Acquirer host configuration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration4
	 * AcquirerHostConfiguration4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTerminalManagementSystem
	 * AcceptorConfiguration.mmTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Host"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer host configuration."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmHost
	 * AcquirerProtocolParameters9.mmHost}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHost = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmTerminalManagementSystem;
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "Hst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Host";
			definition = "Acquirer host configuration.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmHost;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerHostConfiguration4.mmObject();
		}
	};
	protected AcquirerProtocolParameters8 onLineTransaction;
	/**
	 * Acquirer protocol parameters of transactions performing an online
	 * authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8
	 * AcquirerProtocolParameters8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLineTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer protocol parameters of transactions performing an online authorisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmOnLineTransaction
	 * AcquirerProtocolParameters9.mmOnLineTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOnLineTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "OnLineTx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineTransaction";
			definition = "Acquirer protocol parameters of transactions performing an online authorisation.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmOnLineTransaction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters8.mmObject();
		}
	};
	protected AcquirerProtocolParameters8 offLineTransaction;
	/**
	 * Acquirer protocol parameters of transactions performing an offline
	 * authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8
	 * AcquirerProtocolParameters8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffLineTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer protocol parameters of transactions performing an offline authorisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmOffLineTransaction
	 * AcquirerProtocolParameters9.mmOffLineTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOffLineTransaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "OffLineTx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineTransaction";
			definition = "Acquirer protocol parameters of transactions performing an offline authorisation.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmOffLineTransaction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters8.mmObject();
		}
	};
	protected ExchangeConfiguration6 reconciliationExchange;
	/**
	 * Configuration parameters of reconciliation exchanges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6
	 * ExchangeConfiguration6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters of reconciliation exchanges."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmReconciliationExchange
	 * AcquirerProtocolParameters9.mmReconciliationExchange}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReconciliationExchange = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "RcncltnXchg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationExchange";
			definition = "Configuration parameters of reconciliation exchanges.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmReconciliationExchange;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration6.mmObject();
		}
	};
	protected TrueFalseIndicator reconciliationByAcquirer;
	/**
	 * Indicates the reconciliation period is assigned by the acquirer instead
	 * of the acceptor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmReconciliationByAcquirer
	 * AcceptorConfiguration.mmReconciliationByAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnByAcqrr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationByAcquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters9.mmReconciliationByAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationByAcquirer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmReconciliationByAcquirer;
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "RcncltnByAcqrr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationByAcquirer";
			definition = "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmReconciliationByAcquirer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator totalsPerCurrency;
	/**
	 * Indicates the reconciliation total amounts are computed per currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTotalsPerCurrency
	 * AcceptorConfiguration.mmTotalsPerCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlsPerCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsPerCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation total amounts are computed per currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmTotalsPerCurrency
	 * AcquirerProtocolParameters9.mmTotalsPerCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalsPerCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmTotalsPerCurrency;
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "TtlsPerCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsPerCurrency";
			definition = "Indicates the reconciliation total amounts are computed per currency.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmTotalsPerCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator splitTotals;
	/**
	 * Indicates that totals in reconciliation or batch must be split per group
	 * of points of interaction and card product profiles when these information
	 * are present in the transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpltTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that totals in reconciliation or batch must be split per group of points of interaction and card product profiles when these information are present in the transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmSplitTotals
	 * AcquirerProtocolParameters9.mmSplitTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSplitTotals = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "SpltTtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitTotals";
			definition = "Indicates that totals in reconciliation or batch must be split per group of points of interaction and card product profiles when these information are present in the transactions.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmSplitTotals;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator reconciliationError;
	/**
	 * After an error in a totals of the Reconciliation, the POI sends
	 * transactions in error in the BatchTransfer messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "After an error in a totals of the Reconciliation, the POI sends transactions in error in the BatchTransfer messages."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmReconciliationError
	 * AcquirerProtocolParameters9.mmReconciliationError}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationError = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "RcncltnErr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationError";
			definition = "After an error in a totals of the Reconciliation, the POI sends transactions in error in the BatchTransfer messages.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmReconciliationError;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator cardDataVerification;
	/**
	 * True if the POI must send card data (protected or plain card data) in the
	 * AcceptorCompletionAdvice message following an authorisation exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardDataVrfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDataVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if the POI must send card data (protected or plain card data) in the AcceptorCompletionAdvice message following an authorisation exchange."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmCardDataVerification
	 * AcquirerProtocolParameters9.mmCardDataVerification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardDataVerification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "CardDataVrfctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDataVerification";
			definition = "True if the POI must send card data (protected or plain card data) in the AcceptorCompletionAdvice message following an authorisation exchange.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmCardDataVerification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator notifyOffLineCancellation;
	/**
	 * Send a cancellation advice for offline transactions not yet captured.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfyOffLineCxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotifyOffLineCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Send a cancellation advice for offline transactions not yet captured."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmNotifyOffLineCancellation
	 * AcquirerProtocolParameters9.mmNotifyOffLineCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotifyOffLineCancellation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "NtfyOffLineCxl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyOffLineCancellation";
			definition = "Send a cancellation advice for offline transactions not yet captured.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmNotifyOffLineCancellation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected List<BatchTransactionType1Code> batchTransferContent;
	/**
	 * Types of transaction to include in the batch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BatchTransactionType1Code
	 * BatchTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmBatchTransferContent
	 * AcceptorConfiguration.mmBatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchTrfCntt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransferContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Types of transaction to include in the batch."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmBatchTransferContent
	 * AcquirerProtocolParameters9.mmBatchTransferContent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBatchTransferContent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmBatchTransferContent;
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "BtchTrfCntt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransferContent";
			definition = "Types of transaction to include in the batch.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmBatchTransferContent;
			minOccurs = 0;
			simpleType_lazy = () -> BatchTransactionType1Code.mmObject();
		}
	};
	protected TrueFalseIndicator fileTransferBatch;
	/**
	 * BatchTransfer are exchanged per file transfer protocol rather than per
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FileTrfBtch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FileTransferBatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BatchTransfer are exchanged per file transfer protocol rather than per message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmFileTransferBatch
	 * AcquirerProtocolParameters9.mmFileTransferBatch}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFileTransferBatch = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "FileTrfBtch";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileTransferBatch";
			definition = "BatchTransfer are exchanged per file transfer protocol rather than per message.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmFileTransferBatch;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator batchDigitalSignature;
	/**
	 * BatchTransfer are authenticated by digital signature rather than a MAC
	 * (Message Authentication Code).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchDgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchDigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BatchTransfer are authenticated by digital signature rather than a MAC (Message Authentication Code)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmBatchDigitalSignature
	 * AcquirerProtocolParameters9.mmBatchDigitalSignature}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBatchDigitalSignature = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "BtchDgtlSgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchDigitalSignature";
			definition = "BatchTransfer are authenticated by digital signature rather than a MAC (Message Authentication Code).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmBatchDigitalSignature;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.MessageItemCondition1> messageItem;
	/**
	 * Configuration of a message item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageItemCondition1
	 * MessageItemCondition1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of a message item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmMessageItem
	 * AcquirerProtocolParameters9.mmMessageItem}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageItem = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "MsgItm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageItem";
			definition = "Configuration of a message item.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmMessageItem;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MessageItemCondition1.mmObject();
		}
	};
	protected TrueFalseIndicator protectCardData;
	/**
	 * Indicator to require protection of sensitive card data in messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmProtectCardData
	 * AcceptorConfiguration.mmProtectCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator to require protection of sensitive card data in messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmProtectCardData
	 * AcquirerProtocolParameters9.mmProtectCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectCardData = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmProtectCardData;
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "PrtctCardData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectCardData";
			definition = "Indicator to require protection of sensitive card data in messages.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmProtectCardData;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator mandatorySecurityTrailer;
	/**
	 * A security trailer is mandatory in the messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtrySctyTrlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatorySecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A security trailer is mandatory in the messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmMandatorySecurityTrailer
	 * AcquirerProtocolParameters9.mmMandatorySecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMandatorySecurityTrailer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "MndtrySctyTrlr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatorySecurityTrailer";
			definition = "A security trailer is mandatory in the messages.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters9.mmMandatorySecurityTrailer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters10.mmActionType, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmAcquirerIdentification,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmVersion, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmApplicationIdentification,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmHost, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmOnLineTransaction,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmOffLineTransaction, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmReconciliationExchange,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmReconciliationByAcquirer, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmTotalsPerCurrency,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmSplitTotals, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmReconciliationError,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmCardDataVerification, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmNotifyOffLineCancellation,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmBatchTransferContent, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmFileTransferBatch,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmBatchDigitalSignature, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmMessageItem,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmProtectCardData, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmMandatorySecurityTrailer);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AcquirerProtocolParameters10";
				definition = "Acceptor parameters dedicated to the acquirer protocol.";
				previousVersion_lazy = () -> AcquirerProtocolParameters9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction3Code getActionType() {
		return actionType;
	}

	public void setActionType(TerminalManagementAction3Code actionType) {
		this.actionType = actionType;
	}

	public List<GenericIdentification53> getAcquirerIdentification() {
		return acquirerIdentification;
	}

	public void setAcquirerIdentification(List<com.tools20022.repository.msg.GenericIdentification53> acquirerIdentification) {
		this.acquirerIdentification = acquirerIdentification;
	}

	public Max256Text getVersion() {
		return version;
	}

	public void setVersion(Max256Text version) {
		this.version = version;
	}

	public List<Max35Text> getApplicationIdentification() {
		return applicationIdentification;
	}

	public void setApplicationIdentification(List<Max35Text> applicationIdentification) {
		this.applicationIdentification = applicationIdentification;
	}

	public List<AcquirerHostConfiguration4> getHost() {
		return host;
	}

	public void setHost(List<com.tools20022.repository.msg.AcquirerHostConfiguration4> host) {
		this.host = host;
	}

	public AcquirerProtocolParameters8 getOnLineTransaction() {
		return onLineTransaction;
	}

	public void setOnLineTransaction(com.tools20022.repository.msg.AcquirerProtocolParameters8 onLineTransaction) {
		this.onLineTransaction = onLineTransaction;
	}

	public AcquirerProtocolParameters8 getOffLineTransaction() {
		return offLineTransaction;
	}

	public void setOffLineTransaction(com.tools20022.repository.msg.AcquirerProtocolParameters8 offLineTransaction) {
		this.offLineTransaction = offLineTransaction;
	}

	public ExchangeConfiguration6 getReconciliationExchange() {
		return reconciliationExchange;
	}

	public void setReconciliationExchange(com.tools20022.repository.msg.ExchangeConfiguration6 reconciliationExchange) {
		this.reconciliationExchange = reconciliationExchange;
	}

	public TrueFalseIndicator getReconciliationByAcquirer() {
		return reconciliationByAcquirer;
	}

	public void setReconciliationByAcquirer(TrueFalseIndicator reconciliationByAcquirer) {
		this.reconciliationByAcquirer = reconciliationByAcquirer;
	}

	public TrueFalseIndicator getTotalsPerCurrency() {
		return totalsPerCurrency;
	}

	public void setTotalsPerCurrency(TrueFalseIndicator totalsPerCurrency) {
		this.totalsPerCurrency = totalsPerCurrency;
	}

	public TrueFalseIndicator getSplitTotals() {
		return splitTotals;
	}

	public void setSplitTotals(TrueFalseIndicator splitTotals) {
		this.splitTotals = splitTotals;
	}

	public TrueFalseIndicator getReconciliationError() {
		return reconciliationError;
	}

	public void setReconciliationError(TrueFalseIndicator reconciliationError) {
		this.reconciliationError = reconciliationError;
	}

	public TrueFalseIndicator getCardDataVerification() {
		return cardDataVerification;
	}

	public void setCardDataVerification(TrueFalseIndicator cardDataVerification) {
		this.cardDataVerification = cardDataVerification;
	}

	public TrueFalseIndicator getNotifyOffLineCancellation() {
		return notifyOffLineCancellation;
	}

	public void setNotifyOffLineCancellation(TrueFalseIndicator notifyOffLineCancellation) {
		this.notifyOffLineCancellation = notifyOffLineCancellation;
	}

	public List<BatchTransactionType1Code> getBatchTransferContent() {
		return batchTransferContent;
	}

	public void setBatchTransferContent(List<BatchTransactionType1Code> batchTransferContent) {
		this.batchTransferContent = batchTransferContent;
	}

	public TrueFalseIndicator getFileTransferBatch() {
		return fileTransferBatch;
	}

	public void setFileTransferBatch(TrueFalseIndicator fileTransferBatch) {
		this.fileTransferBatch = fileTransferBatch;
	}

	public TrueFalseIndicator getBatchDigitalSignature() {
		return batchDigitalSignature;
	}

	public void setBatchDigitalSignature(TrueFalseIndicator batchDigitalSignature) {
		this.batchDigitalSignature = batchDigitalSignature;
	}

	public List<MessageItemCondition1> getMessageItem() {
		return messageItem;
	}

	public void setMessageItem(List<com.tools20022.repository.msg.MessageItemCondition1> messageItem) {
		this.messageItem = messageItem;
	}

	public TrueFalseIndicator getProtectCardData() {
		return protectCardData;
	}

	public void setProtectCardData(TrueFalseIndicator protectCardData) {
		this.protectCardData = protectCardData;
	}

	public TrueFalseIndicator getMandatorySecurityTrailer() {
		return mandatorySecurityTrailer;
	}

	public void setMandatorySecurityTrailer(TrueFalseIndicator mandatorySecurityTrailer) {
		this.mandatorySecurityTrailer = mandatorySecurityTrailer;
	}
}
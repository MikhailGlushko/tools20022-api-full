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
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters applied to the settlement of a security transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount3#mmReceiversCustodianDetails
 * ReceivingPartiesAndAccount3.mmReceiversCustodianDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount3#mmReceiversIntermediaryDetails
 * ReceivingPartiesAndAccount3.mmReceiversIntermediaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount3#mmReceivingAgentDetails
 * ReceivingPartiesAndAccount3.mmReceivingAgentDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
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
 * "ReceivingPartiesAndAccount3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to the settlement of a security transfer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16
 * ReceivingPartiesAndAccount16}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ReceivingPartiesAndAccount3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentificationAndAccount3 receiversCustodianDetails;
	/**
	 * Party that acts on behalf of the buyer of securities when the buyer does
	 * not have a direct relationship with the receiving agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount3
	 * PartyIdentificationAndAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount3
	 * ReceivingPartiesAndAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrsCtdnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that acts on behalf of the buyer of securities when the buyer does not have a direct relationship with the receiving agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16#mmReceiversCustodianDetails
	 * ReceivingPartiesAndAccount16.mmReceiversCustodianDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceiversCustodianDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> ReceivingPartiesAndAccount3.mmObject();
			isDerived = false;
			xmlTag = "RcvrsCtdnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetails";
			definition = "Party that acts on behalf of the buyer of securities when the buyer does not have a direct relationship with the receiving agent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReceivingPartiesAndAccount16.mmReceiversCustodianDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount3.mmObject();
		}
	};
	protected PartyIdentificationAndAccount3 receiversIntermediaryDetails;
	/**
	 * Party that the Receiver's custodian uses to effect the receipt of a
	 * security, when the Receiver's custodian does not have a direct
	 * relationship with the Receiver agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount3
	 * PartyIdentificationAndAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount3
	 * ReceivingPartiesAndAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrsIntrmyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that the Receiver's custodian uses to effect the receipt of a security, when the Receiver's custodian does not have a direct relationship with the Receiver agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16#mmReceiversIntermediary1Details
	 * ReceivingPartiesAndAccount16.mmReceiversIntermediary1Details}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceiversIntermediaryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> ReceivingPartiesAndAccount3.mmObject();
			isDerived = false;
			xmlTag = "RcvrsIntrmyDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetails";
			definition = "Party that the Receiver's custodian uses to effect the receipt of a security, when the Receiver's custodian does not have a direct relationship with the Receiver agent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReceivingPartiesAndAccount16.mmReceiversIntermediary1Details);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount3.mmObject();
		}
	};
	protected PartyIdentificationAndAccount3 receivingAgentDetails;
	/**
	 * Party that receives securities from the delivering agent at the place of
	 * settlement, eg, central securities depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount3
	 * PartyIdentificationAndAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount3
	 * ReceivingPartiesAndAccount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives securities from the delivering agent at the place of settlement, eg, central securities depository."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16#mmReceivingAgentDetails
	 * ReceivingPartiesAndAccount16.mmReceivingAgentDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingAgentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> ReceivingPartiesAndAccount3.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgtDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgentDetails";
			definition = "Party that receives securities from the delivering agent at the place of settlement, eg, central securities depository.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReceivingPartiesAndAccount16.mmReceivingAgentDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReceivingPartiesAndAccount3.mmReceiversCustodianDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount3.mmReceiversIntermediaryDetails,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount3.mmReceivingAgentDetails);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReceivingPartiesAndAccount3";
				definition = "Parameters applied to the settlement of a security transfer.";
				nextVersions_lazy = () -> Arrays.asList(ReceivingPartiesAndAccount16.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentificationAndAccount3 getReceiversCustodianDetails() {
		return receiversCustodianDetails;
	}

	public void setReceiversCustodianDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount3 receiversCustodianDetails) {
		this.receiversCustodianDetails = receiversCustodianDetails;
	}

	public PartyIdentificationAndAccount3 getReceiversIntermediaryDetails() {
		return receiversIntermediaryDetails;
	}

	public void setReceiversIntermediaryDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount3 receiversIntermediaryDetails) {
		this.receiversIntermediaryDetails = receiversIntermediaryDetails;
	}

	public PartyIdentificationAndAccount3 getReceivingAgentDetails() {
		return receivingAgentDetails;
	}

	public void setReceivingAgentDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount3 receivingAgentDetails) {
		this.receivingAgentDetails = receivingAgentDetails;
	}
}
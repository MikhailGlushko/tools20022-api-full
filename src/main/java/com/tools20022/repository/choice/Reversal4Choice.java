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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.entity.SecuritiesTransfer;
import com.tools20022.repository.msg.TransferIn9;
import com.tools20022.repository.msg.TransferReference6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice between reversal by reference or by reversal details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Reversal4Choice#mmReference
 * Reversal4Choice.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reversal4Choice#mmTransferInConfirmationDetails
 * Reversal4Choice.mmTransferInConfirmationDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
 * SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV05#mmReversal
 * ReversalOfTransferInConfirmationV05.mmReversal}</li>
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
 * "Reversal4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between reversal by reference or by reversal details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Reversal6Choice
 * Reversal6Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Reversal2Choice Reversal2Choice}
 * </li>
 * </ul>
 */
public class Reversal4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected TransferReference6 reference;
	/**
	 * Reference of the transfer confirmation to be reversed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference6
	 * TransferReference6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reversal4Choice
	 * Reversal4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the transfer confirmation to be reversed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal6Choice#mmReference
	 * Reversal6Choice.mmReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reversal2Choice#mmReference
	 * Reversal2Choice.mmReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reversal4Choice.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference of the transfer confirmation to be reversed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Reversal6Choice.mmReference);
			previousVersion_lazy = () -> com.tools20022.repository.choice.Reversal2Choice.mmReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransferReference6.mmObject();
		}
	};
	protected TransferIn9 transferInConfirmationDetails;
	/**
	 * Details of the transfer in confirmation to be reversed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TransferIn9
	 * TransferIn9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmRelatedSettlement
	 * SecuritiesTransfer.mmRelatedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reversal4Choice
	 * Reversal4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfInConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferInConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the transfer in confirmation to be reversed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reversal6Choice#mmTransferInConfirmationDetails
	 * Reversal6Choice.mmTransferInConfirmationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reversal2Choice#mmTransferInConfirmationDetails
	 * Reversal2Choice.mmTransferInConfirmationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferInConfirmationDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmRelatedSettlement;
			componentContext_lazy = () -> Reversal4Choice.mmObject();
			isDerived = false;
			xmlTag = "TrfInConfDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferInConfirmationDetails";
			definition = "Details of the transfer in confirmation to be reversed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Reversal6Choice.mmTransferInConfirmationDetails);
			previousVersion_lazy = () -> com.tools20022.repository.choice.Reversal2Choice.mmTransferInConfirmationDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransferIn9.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Reversal4Choice.mmReference, com.tools20022.repository.choice.Reversal4Choice.mmTransferInConfirmationDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV05.mmReversal);
				trace_lazy = () -> SecuritiesTransfer.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Reversal4Choice";
				definition = "Choice between reversal by reference or by reversal details.";
				nextVersions_lazy = () -> Arrays.asList(Reversal6Choice.mmObject());
				previousVersion_lazy = () -> Reversal2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TransferReference6 getReference() {
		return reference;
	}

	public void setReference(TransferReference6 reference) {
		this.reference = reference;
	}

	public TransferIn9 getTransferInConfirmationDetails() {
		return transferInConfirmationDetails;
	}

	public void setTransferInConfirmationDetails(TransferIn9 transferInConfirmationDetails) {
		this.transferInConfirmationDetails = transferInConfirmationDetails;
	}
}
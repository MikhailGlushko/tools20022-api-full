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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ISATransfer12;
import com.tools20022.repository.msg.TransferReference7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between cancellation by transfer details or reference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation6Choice#mmCancellationByTransferInstructionDetails
 * Cancellation6Choice.mmCancellationByTransferInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation6Choice#mmCancellationByReference
 * Cancellation6Choice.mmCancellationByReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05#mmCancellation
 * PortfolioTransferCancellationRequestV05.mmCancellation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Cancellation6Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between cancellation by transfer details or reference."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Cancellation7Choice
 * Cancellation7Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Cancellation3Choice
 * Cancellation3Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Cancellation6Choice", propOrder = {"cancellationByTransferInstructionDetails", "cancellationByReference"})
public class Cancellation6Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CxlByTrfInstrDtls", required = true)
	protected ISATransfer12 cancellationByTransferInstructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ISATransfer12
	 * ISATransfer12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTransferOperation
	 * SecuritiesSettlement.mmTransferOperation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation6Choice
	 * Cancellation6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlByTrfInstrDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByTransferInstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the transfer instruction to be cancelled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation7Choice#mmCancellationByTransferInstructionDetails
	 * Cancellation7Choice.mmCancellationByTransferInstructionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation3Choice#mmCancellationByTransferInstructionDetails
	 * Cancellation3Choice.mmCancellationByTransferInstructionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cancellation6Choice, ISATransfer12> mmCancellationByTransferInstructionDetails = new MMMessageAttribute<Cancellation6Choice, ISATransfer12>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmTransferOperation;
			componentContext_lazy = () -> com.tools20022.repository.choice.Cancellation6Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlByTrfInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByTransferInstructionDetails";
			definition = "Information related to the transfer instruction to be cancelled.";
			nextVersions_lazy = () -> Arrays.asList(Cancellation7Choice.mmCancellationByTransferInstructionDetails);
			previousVersion_lazy = () -> Cancellation3Choice.mmCancellationByTransferInstructionDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ISATransfer12.mmObject();
		}

		@Override
		public ISATransfer12 getValue(Cancellation6Choice obj) {
			return obj.getCancellationByTransferInstructionDetails();
		}

		@Override
		public void setValue(Cancellation6Choice obj, ISATransfer12 value) {
			obj.setCancellationByTransferInstructionDetails(value);
		}
	};
	@XmlElement(name = "CxlByRef", required = true)
	protected TransferReference7 cancellationByReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference7
	 * TransferReference7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
	 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation6Choice
	 * Cancellation6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlByRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the transfer instruction to be cancelled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation7Choice#mmCancellationByReference
	 * Cancellation7Choice.mmCancellationByReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation3Choice#mmCancellationByReference
	 * Cancellation3Choice.mmCancellationByReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cancellation6Choice, TransferReference7> mmCancellationByReference = new MMMessageAttribute<Cancellation6Choice, TransferReference7>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.choice.Cancellation6Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlByRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByReference";
			definition = "Reference of the transfer instruction to be cancelled.";
			nextVersions_lazy = () -> Arrays.asList(Cancellation7Choice.mmCancellationByReference);
			previousVersion_lazy = () -> Cancellation3Choice.mmCancellationByReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransferReference7.mmObject();
		}

		@Override
		public TransferReference7 getValue(Cancellation6Choice obj) {
			return obj.getCancellationByReference();
		}

		@Override
		public void setValue(Cancellation6Choice obj, TransferReference7 value) {
			obj.setCancellationByReference(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Cancellation6Choice.mmCancellationByTransferInstructionDetails, com.tools20022.repository.choice.Cancellation6Choice.mmCancellationByReference);
				messageBuildingBlock_lazy = () -> Arrays.asList(PortfolioTransferCancellationRequestV05.mmCancellation);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cancellation6Choice";
				definition = "Choice between cancellation by transfer details or reference.";
				nextVersions_lazy = () -> Arrays.asList(Cancellation7Choice.mmObject());
				previousVersion_lazy = () -> Cancellation3Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISATransfer12 getCancellationByTransferInstructionDetails() {
		return cancellationByTransferInstructionDetails;
	}

	public Cancellation6Choice setCancellationByTransferInstructionDetails(ISATransfer12 cancellationByTransferInstructionDetails) {
		this.cancellationByTransferInstructionDetails = Objects.requireNonNull(cancellationByTransferInstructionDetails);
		return this;
	}

	public TransferReference7 getCancellationByReference() {
		return cancellationByReference;
	}

	public Cancellation6Choice setCancellationByReference(TransferReference7 cancellationByReference) {
		this.cancellationByReference = Objects.requireNonNull(cancellationByReference);
		return this;
	}
}
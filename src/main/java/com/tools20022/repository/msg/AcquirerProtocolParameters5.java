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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CancellationProcess1Code;
import com.tools20022.repository.codeset.FinancialCapture1Code;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ExchangeConfiguration4;
import com.tools20022.repository.msg.ExchangeConfiguration5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5#mmFinancialCapture
 * AcquirerProtocolParameters5.mmFinancialCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5#mmBatchTransfer
 * AcquirerProtocolParameters5.mmBatchTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5#mmCompletionExchange
 * AcquirerProtocolParameters5.mmCompletionExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5#mmCancellationExchange
 * AcquirerProtocolParameters5.mmCancellationExchange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcquirerProtocolParameters5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Acceptor parameters dedicated to the acquirer protocol."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8
 * AcquirerProtocolParameters8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4
 * AcquirerProtocolParameters4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcquirerProtocolParameters5", propOrder = {"financialCapture", "batchTransfer", "completionExchange", "cancellationExchange"})
public class AcquirerProtocolParameters5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinCaptr", required = true)
	protected FinancialCapture1Code financialCapture;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCapture1Code
	 * FinancialCapture1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmFinancialCapture
	 * AcceptorConfiguration.mmFinancialCapture}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5
	 * AcquirerProtocolParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinCaptr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mode for the financial capture of the transaction by the acquirer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8#mmFinancialCapture
	 * AcquirerProtocolParameters8.mmFinancialCapture}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4#mmFinancialCapture
	 * AcquirerProtocolParameters4.mmFinancialCapture}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcquirerProtocolParameters5, FinancialCapture1Code> mmFinancialCapture = new MMMessageAttribute<AcquirerProtocolParameters5, FinancialCapture1Code>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmFinancialCapture;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters5.mmObject();
			isDerived = false;
			xmlTag = "FinCaptr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCapture";
			definition = "Mode for the financial capture of the transaction by the acquirer.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters8.mmFinancialCapture);
			previousVersion_lazy = () -> AcquirerProtocolParameters4.mmFinancialCapture;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCapture1Code.mmObject();
		}

		@Override
		public FinancialCapture1Code getValue(AcquirerProtocolParameters5 obj) {
			return obj.getFinancialCapture();
		}

		@Override
		public void setValue(AcquirerProtocolParameters5 obj, FinancialCapture1Code value) {
			obj.setFinancialCapture(value);
		}
	};
	@XmlElement(name = "BtchTrf")
	protected ExchangeConfiguration4 batchTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4
	 * ExchangeConfiguration4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmBatchTransferContent
	 * AcceptorConfiguration.mmBatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5
	 * AcquirerProtocolParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchTrf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of the batch transfers."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8#mmBatchTransfer
	 * AcquirerProtocolParameters8.mmBatchTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4#mmBatchTransfer
	 * AcquirerProtocolParameters4.mmBatchTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerProtocolParameters5, Optional<ExchangeConfiguration4>> mmBatchTransfer = new MMMessageAssociationEnd<AcquirerProtocolParameters5, Optional<ExchangeConfiguration4>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmBatchTransferContent;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters5.mmObject();
			isDerived = false;
			xmlTag = "BtchTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransfer";
			definition = "Configuration of the batch transfers.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters8.mmBatchTransfer);
			previousVersion_lazy = () -> AcquirerProtocolParameters4.mmBatchTransfer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExchangeConfiguration4.mmObject();
		}

		@Override
		public Optional<ExchangeConfiguration4> getValue(AcquirerProtocolParameters5 obj) {
			return obj.getBatchTransfer();
		}

		@Override
		public void setValue(AcquirerProtocolParameters5 obj, Optional<ExchangeConfiguration4> value) {
			obj.setBatchTransfer(value.orElse(null));
		}
	};
	@XmlElement(name = "CmpltnXchg")
	protected ExchangeConfiguration5 completionExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5
	 * ExchangeConfiguration5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5
	 * AcquirerProtocolParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpltnXchg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters of completion exchanges."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8#mmCompletionExchange
	 * AcquirerProtocolParameters8.mmCompletionExchange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4#mmCompletionExchange
	 * AcquirerProtocolParameters4.mmCompletionExchange}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerProtocolParameters5, Optional<ExchangeConfiguration5>> mmCompletionExchange = new MMMessageAssociationEnd<AcquirerProtocolParameters5, Optional<ExchangeConfiguration5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters5.mmObject();
			isDerived = false;
			xmlTag = "CmpltnXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionExchange";
			definition = "Configuration parameters of completion exchanges.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters8.mmCompletionExchange);
			previousVersion_lazy = () -> AcquirerProtocolParameters4.mmCompletionExchange;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExchangeConfiguration5.mmObject();
		}

		@Override
		public Optional<ExchangeConfiguration5> getValue(AcquirerProtocolParameters5 obj) {
			return obj.getCompletionExchange();
		}

		@Override
		public void setValue(AcquirerProtocolParameters5 obj, Optional<ExchangeConfiguration5> value) {
			obj.setCompletionExchange(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlXchg")
	protected CancellationProcess1Code cancellationExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcess1Code
	 * CancellationProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5
	 * AcquirerProtocolParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlXchg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of the cancellation exchanges."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8#mmCancellationExchange
	 * AcquirerProtocolParameters8.mmCancellationExchange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4#mmCancellationExchange
	 * AcquirerProtocolParameters4.mmCancellationExchange}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcquirerProtocolParameters5, Optional<CancellationProcess1Code>> mmCancellationExchange = new MMMessageAttribute<AcquirerProtocolParameters5, Optional<CancellationProcess1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters5.mmObject();
			isDerived = false;
			xmlTag = "CxlXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationExchange";
			definition = "Configuration of the cancellation exchanges.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters8.mmCancellationExchange);
			previousVersion_lazy = () -> AcquirerProtocolParameters4.mmCancellationExchange;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CancellationProcess1Code.mmObject();
		}

		@Override
		public Optional<CancellationProcess1Code> getValue(AcquirerProtocolParameters5 obj) {
			return obj.getCancellationExchange();
		}

		@Override
		public void setValue(AcquirerProtocolParameters5 obj, Optional<CancellationProcess1Code> value) {
			obj.setCancellationExchange(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters5.mmFinancialCapture, com.tools20022.repository.msg.AcquirerProtocolParameters5.mmBatchTransfer,
						com.tools20022.repository.msg.AcquirerProtocolParameters5.mmCompletionExchange, com.tools20022.repository.msg.AcquirerProtocolParameters5.mmCancellationExchange);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerProtocolParameters5";
				definition = "Acceptor parameters dedicated to the acquirer protocol.";
				nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters8.mmObject());
				previousVersion_lazy = () -> AcquirerProtocolParameters4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialCapture1Code getFinancialCapture() {
		return financialCapture;
	}

	public AcquirerProtocolParameters5 setFinancialCapture(FinancialCapture1Code financialCapture) {
		this.financialCapture = Objects.requireNonNull(financialCapture);
		return this;
	}

	public Optional<ExchangeConfiguration4> getBatchTransfer() {
		return batchTransfer == null ? Optional.empty() : Optional.of(batchTransfer);
	}

	public AcquirerProtocolParameters5 setBatchTransfer(ExchangeConfiguration4 batchTransfer) {
		this.batchTransfer = batchTransfer;
		return this;
	}

	public Optional<ExchangeConfiguration5> getCompletionExchange() {
		return completionExchange == null ? Optional.empty() : Optional.of(completionExchange);
	}

	public AcquirerProtocolParameters5 setCompletionExchange(ExchangeConfiguration5 completionExchange) {
		this.completionExchange = completionExchange;
		return this;
	}

	public Optional<CancellationProcess1Code> getCancellationExchange() {
		return cancellationExchange == null ? Optional.empty() : Optional.of(cancellationExchange);
	}

	public AcquirerProtocolParameters5 setCancellationExchange(CancellationProcess1Code cancellationExchange) {
		this.cancellationExchange = cancellationExchange;
		return this;
	}
}
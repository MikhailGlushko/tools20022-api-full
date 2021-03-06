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

package com.tools20022.repository.area.caaa;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AcceptortoAcquirerCardTransactionPreviousVersion;
import com.tools20022.repository.msg.AcceptorReconciliationResponse4;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header30;
import com.tools20022.repository.msgset.CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The AcceptorReconciliationResponse message is sent by the acquirer (or its
 * agent) to an acceptor (or its agent), to ensure that the debits and credits
 * performed by the acceptor matches the computed balances of the acquirer for
 * the debits and credits performed during the same reconciliation period.<br>
 * If the acceptor or the acquirer notices a difference in totals, the
 * discrepancy will be resolved by other means, outside the scope of the
 * protocol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.010.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionPreviousVersion
 * AcceptortoAcquirerCardTransactionPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05#mmHeader
 * AcceptorReconciliationResponseV05.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05#mmReconciliationResponse
 * AcceptorReconciliationResponseV05.mmReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05#mmSecurityTrailer
 * AcceptorReconciliationResponseV05.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion
 * CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrRcncltnRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorReconciliationResponseV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorReconciliationResponse message is sent by the acquirer (or its agent) to an acceptor (or its agent), to ensure that the debits and credits performed by the acceptor matches the computed balances of the acquirer for the debits and credits performed during the same reconciliation period.\r\nIf the acceptor or the acquirer notices a difference in totals, the discrepancy will be resolved by other means, outside the scope of the protocol."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV06
 * AcceptorReconciliationResponseV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV04
 * AcceptorReconciliationResponseV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorReconciliationResponseV05", propOrder = {"header", "reconciliationResponse", "securityTrailer"})
public class AcceptorReconciliationResponseV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header30 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header30
	 * Header30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reconciliation response message management information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV06#mmHeader
	 * AcceptorReconciliationResponseV06.mmHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV04#mmHeader
	 * AcceptorReconciliationResponseV04.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorReconciliationResponseV05, Header30> mmHeader = new MMMessageBuildingBlock<AcceptorReconciliationResponseV05, Header30>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Reconciliation response message management information.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationResponseV06.mmHeader);
			previousVersion_lazy = () -> AcceptorReconciliationResponseV04.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header30.mmObject();
		}

		@Override
		public Header30 getValue(AcceptorReconciliationResponseV05 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcceptorReconciliationResponseV05 obj, Header30 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "RcncltnRspn", required = true)
	protected AcceptorReconciliationResponse4 reconciliationResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationResponse4
	 * AcceptorReconciliationResponse4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the reconciliation response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV06#mmReconciliationResponse
	 * AcceptorReconciliationResponseV06.mmReconciliationResponse}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV04#mmReconciliationResponse
	 * AcceptorReconciliationResponseV04.mmReconciliationResponse}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorReconciliationResponseV05, AcceptorReconciliationResponse4> mmReconciliationResponse = new MMMessageBuildingBlock<AcceptorReconciliationResponseV05, AcceptorReconciliationResponse4>() {
		{
			xmlTag = "RcncltnRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationResponse";
			definition = "Information related to the reconciliation response.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationResponseV06.mmReconciliationResponse);
			previousVersion_lazy = () -> AcceptorReconciliationResponseV04.mmReconciliationResponse;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorReconciliationResponse4.mmObject();
		}

		@Override
		public AcceptorReconciliationResponse4 getValue(AcceptorReconciliationResponseV05 obj) {
			return obj.getReconciliationResponse();
		}

		@Override
		public void setValue(AcceptorReconciliationResponseV05 obj, AcceptorReconciliationResponse4 value) {
			obj.setReconciliationResponse(value);
		}
	};
	@XmlElement(name = "SctyTrlr")
	protected ContentInformationType15 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trailer of the message containing a MAC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV06#mmSecurityTrailer
	 * AcceptorReconciliationResponseV06.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV04#mmSecurityTrailer
	 * AcceptorReconciliationResponseV04.mmSecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorReconciliationResponseV05, Optional<ContentInformationType15>> mmSecurityTrailer = new MMMessageBuildingBlock<AcceptorReconciliationResponseV05, Optional<ContentInformationType15>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationResponseV06.mmSecurityTrailer);
			previousVersion_lazy = () -> AcceptorReconciliationResponseV04.mmSecurityTrailer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType15.mmObject();
		}

		@Override
		public Optional<ContentInformationType15> getValue(AcceptorReconciliationResponseV05 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(AcceptorReconciliationResponseV05 obj, Optional<ContentInformationType15> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorReconciliationResponseV05";
				definition = "The AcceptorReconciliationResponse message is sent by the acquirer (or its agent) to an acceptor (or its agent), to ensure that the debits and credits performed by the acceptor matches the computed balances of the acquirer for the debits and credits performed during the same reconciliation period.\r\nIf the acceptor or the acquirer notices a difference in totals, the discrepancy will be resolved by other means, outside the scope of the protocol.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationResponseV06.mmObject());
				previousVersion_lazy = () -> AcceptorReconciliationResponseV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrRcncltnRspn";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05.mmHeader, com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05.mmReconciliationResponse,
						com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "010";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorReconciliationResponseV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header30 getHeader() {
		return header;
	}

	public AcceptorReconciliationResponseV05 setHeader(Header30 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorReconciliationResponse4 getReconciliationResponse() {
		return reconciliationResponse;
	}

	public AcceptorReconciliationResponseV05 setReconciliationResponse(AcceptorReconciliationResponse4 reconciliationResponse) {
		this.reconciliationResponse = Objects.requireNonNull(reconciliationResponse);
		return this;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public AcceptorReconciliationResponseV05 setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.010.001.05")
	static public class Document {
		@XmlElement(name = "AccptrRcncltnRspn", required = true)
		public AcceptorReconciliationResponseV05 messageBody;
	}
}
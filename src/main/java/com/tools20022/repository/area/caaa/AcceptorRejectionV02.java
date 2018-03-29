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
import com.tools20022.repository.area.AcceptortoAcquirerCardTransactionArchive;
import com.tools20022.repository.msg.AcceptorRejection1;
import com.tools20022.repository.msg.Header5;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The AcceptorRejection message is sent by the acquirer (or its agent) to
 * reject a message request or advice sent by an acceptor (or its agent), to
 * indicate that the received message could not be processed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV02#mmHeader
 * AcceptorRejectionV02.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV02#mmReject
 * AcceptorRejectionV02.mmReject}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrRjctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionArchive
 * AcceptortoAcquirerCardTransactionArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.015.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorRejectionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorRejection message is sent by the acquirer (or its agent) to reject a message request or advice sent by an acceptor (or its agent), to indicate that the received message could not be processed."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV03
 * AcceptorRejectionV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV01
 * AcceptorRejectionV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorRejectionV02", propOrder = {"header", "reject"})
public class AcceptorRejectionV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header5 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header5 Header5}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rejection message management information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV03#mmHeader
	 * AcceptorRejectionV03.mmHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorRejectionV02, Header5> mmHeader = new MMMessageBuildingBlock<AcceptorRejectionV02, Header5>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Rejection message management information.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorRejectionV03.mmHeader);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header5.mmObject();
		}

		@Override
		public Header5 getValue(AcceptorRejectionV02 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcceptorRejectionV02 obj, Header5 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "Rjct", required = true)
	protected AcceptorRejection1 reject;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection1
	 * AcceptorRejection1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the reject."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV03#mmReject
	 * AcceptorRejectionV03.mmReject}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorRejectionV02, AcceptorRejection1> mmReject = new MMMessageBuildingBlock<AcceptorRejectionV02, AcceptorRejection1>() {
		{
			xmlTag = "Rjct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reject";
			definition = "Information related to the reject.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorRejectionV03.mmReject);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorRejection1.mmObject();
		}

		@Override
		public AcceptorRejection1 getValue(AcceptorRejectionV02 obj) {
			return obj.getReject();
		}

		@Override
		public void setValue(AcceptorRejectionV02 obj, AcceptorRejection1 value) {
			obj.setReject(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorRejectionV02";
				definition = "The AcceptorRejection message is sent by the acquirer (or its agent) to reject a message request or advice sent by an acceptor (or its agent), to indicate that the received message could not be processed.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorRejectionV03.mmObject());
				previousVersion_lazy = () -> AcceptorRejectionV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrRjctn";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorRejectionV02.mmHeader, com.tools20022.repository.area.caaa.AcceptorRejectionV02.mmReject);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "015";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorRejectionV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header5 getHeader() {
		return header;
	}

	public AcceptorRejectionV02 setHeader(Header5 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorRejection1 getReject() {
		return reject;
	}

	public AcceptorRejectionV02 setReject(AcceptorRejection1 reject) {
		this.reject = Objects.requireNonNull(reject);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.015.001.02")
	static public class Document {
		@XmlElement(name = "AccptrRjctn", required = true)
		public AcceptorRejectionV02 messageBody;
	}
}
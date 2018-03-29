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

package com.tools20022.repository.area.catm;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TerminalManagementPreviousVersion;
import com.tools20022.repository.msg.AcceptorRejection3;
import com.tools20022.repository.msg.Header15;
import com.tools20022.repository.msgset.CardPaymentsExchangesTerminalManagementISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The TerminalManagementRejection message is sent by the terminal manager to
 * reject a message request sent by an acceptor, to indicate that the received
 * message could not be processed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.TerminalManagementRejectionV03#mmHeader
 * TerminalManagementRejectionV03.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.TerminalManagementRejectionV03#mmReject
 * TerminalManagementRejectionV03.mmReject}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CardPaymentsExchangesTerminalManagementISOPreviousversion
 * CardPaymentsExchangesTerminalManagementISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "TermnlMgmtRjctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TerminalManagementPreviousVersion
 * TerminalManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catm.004.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementRejectionV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The TerminalManagementRejection message is sent by the terminal manager to reject a message request sent by an acceptor, to indicate that the received message could not be processed."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.TerminalManagementRejectionV04
 * TerminalManagementRejectionV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.catm.TerminalManagementRejectionV02
 * TerminalManagementRejectionV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TerminalManagementRejectionV03", propOrder = {"header", "reject"})
public class TerminalManagementRejectionV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header15 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header15
	 * Header15}</li>
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
	 * {@linkplain com.tools20022.repository.area.catm.TerminalManagementRejectionV04#mmHeader
	 * TerminalManagementRejectionV04.mmHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.TerminalManagementRejectionV02#mmHeader
	 * TerminalManagementRejectionV02.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TerminalManagementRejectionV03, Header15> mmHeader = new MMMessageBuildingBlock<TerminalManagementRejectionV03, Header15>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Rejection message management information.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementRejectionV04.mmHeader);
			previousVersion_lazy = () -> TerminalManagementRejectionV02.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header15.mmObject();
		}

		@Override
		public Header15 getValue(TerminalManagementRejectionV03 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(TerminalManagementRejectionV03 obj, Header15 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "Rjct", required = true)
	protected AcceptorRejection3 reject;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection3
	 * AcceptorRejection3}</li>
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
	 * {@linkplain com.tools20022.repository.area.catm.TerminalManagementRejectionV04#mmReject
	 * TerminalManagementRejectionV04.mmReject}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.TerminalManagementRejectionV02#mmReject
	 * TerminalManagementRejectionV02.mmReject}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TerminalManagementRejectionV03, AcceptorRejection3> mmReject = new MMMessageBuildingBlock<TerminalManagementRejectionV03, AcceptorRejection3>() {
		{
			xmlTag = "Rjct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reject";
			definition = "Information related to the reject.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementRejectionV04.mmReject);
			previousVersion_lazy = () -> TerminalManagementRejectionV02.mmReject;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorRejection3.mmObject();
		}

		@Override
		public AcceptorRejection3 getValue(TerminalManagementRejectionV03 obj) {
			return obj.getReject();
		}

		@Override
		public void setValue(TerminalManagementRejectionV03 obj, AcceptorRejection3 value) {
			obj.setReject(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementRejectionV03";
				definition = "The TerminalManagementRejection message is sent by the terminal manager to reject a message request sent by an acceptor, to indicate that the received message could not be processed.";
				nextVersions_lazy = () -> Arrays.asList(TerminalManagementRejectionV04.mmObject());
				previousVersion_lazy = () -> TerminalManagementRejectionV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(CardPaymentsExchangesTerminalManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "TermnlMgmtRjctn";
				businessArea_lazy = () -> TerminalManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catm.TerminalManagementRejectionV03.mmHeader, com.tools20022.repository.area.catm.TerminalManagementRejectionV03.mmReject);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catm";
						messageFunctionality = "004";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TerminalManagementRejectionV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header15 getHeader() {
		return header;
	}

	public TerminalManagementRejectionV03 setHeader(Header15 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorRejection3 getReject() {
		return reject;
	}

	public TerminalManagementRejectionV03 setReject(AcceptorRejection3 reject) {
		this.reject = Objects.requireNonNull(reject);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.004.001.03")
	static public class Document {
		@XmlElement(name = "TermnlMgmtRjctn", required = true)
		public TerminalManagementRejectionV03 messageBody;
	}
}
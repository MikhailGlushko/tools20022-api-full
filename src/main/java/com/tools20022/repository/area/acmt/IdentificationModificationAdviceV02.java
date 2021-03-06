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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementLatestVersion;
import com.tools20022.repository.msg.IdentificationAssignment2;
import com.tools20022.repository.msg.IdentificationModification2;
import com.tools20022.repository.msg.OriginalTransactionReference18;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ChangeorVerifyAccountIdentificationISOLatestversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The IdentificationModificationAdvice message is sent by an assigner to an
 * assignee. The message is used to advice on the correct party and/or account
 * identification information.<br>
 * <b>Usage</b><br>
 * The IdentificationModificationAdvice message is sent after the receipt of one
 * or several transaction messages that included no longer valid party and/or
 * account identification information.<br>
 * The IdentificationModificationAdvice message is exchanged between financial
 * institutions and between financial institutions and non financial
 * institutions and can contain one or more modification advises.<br>
 * There is no time limit on the time between the sending of an
 * IdentificationModificationAdvice message and the receipt of the transaction
 * messages that the IdentificationModificationAdvice refers to.<br>
 * The IdentificationModificationAdvice includes the correct party and/or
 * account identification information, the IdentificationModificationAdvice or
 * the included information may be forwarded to the initiating party of the
 * transaction messages.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.022.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
 * AccountManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02#mmAssignment
 * IdentificationModificationAdviceV02.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02#mmOriginalTransactionReference
 * IdentificationModificationAdviceV02.mmOriginalTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02#mmModification
 * IdentificationModificationAdviceV02.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02#mmSupplementaryData
 * IdentificationModificationAdviceV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ChangeorVerifyAccountIdentificationISOLatestversion
 * ChangeorVerifyAccountIdentificationISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "IdModAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IdentificationModificationAdviceV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe IdentificationModificationAdvice message is sent by an assigner to an assignee. The message is used to advice on the correct party and/or account identification information.\r\nUsage\r\nThe IdentificationModificationAdvice message is sent after the receipt of one or several transaction messages that included no longer valid party and/or account identification information.\r\nThe IdentificationModificationAdvice message is exchanged between financial institutions and between financial institutions and non financial institutions and can contain one or more modification advises.\r\nThere is no time limit on the time between the sending of an IdentificationModificationAdvice message and the receipt of the transaction messages that the IdentificationModificationAdvice refers to.\r\nThe IdentificationModificationAdvice includes the correct party and/or account identification information, the IdentificationModificationAdvice or the included information may be forwarded to the initiating party of the transaction messages."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV01
 * IdentificationModificationAdviceV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IdentificationModificationAdviceV02", propOrder = {"assignment", "originalTransactionReference", "modification", "supplementaryData"})
public class IdentificationModificationAdviceV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected IdentificationAssignment2 assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationAssignment2
	 * IdentificationAssignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the identification assignment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IdentificationModificationAdviceV02, IdentificationAssignment2> mmAssignment = new MMMessageBuildingBlock<IdentificationModificationAdviceV02, IdentificationAssignment2>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the identification assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IdentificationAssignment2.mmObject();
		}

		@Override
		public IdentificationAssignment2 getValue(IdentificationModificationAdviceV02 obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(IdentificationModificationAdviceV02 obj, IdentificationAssignment2 value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "OrgnlTxRef")
	protected OriginalTransactionReference18 originalTransactionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference18
	 * OriginalTransactionReference18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides reference information on the original message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IdentificationModificationAdviceV02, Optional<OriginalTransactionReference18>> mmOriginalTransactionReference = new MMMessageBuildingBlock<IdentificationModificationAdviceV02, Optional<OriginalTransactionReference18>>() {
		{
			xmlTag = "OrgnlTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionReference";
			definition = "Provides reference information on the original message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OriginalTransactionReference18.mmObject();
		}

		@Override
		public Optional<OriginalTransactionReference18> getValue(IdentificationModificationAdviceV02 obj) {
			return obj.getOriginalTransactionReference();
		}

		@Override
		public void setValue(IdentificationModificationAdviceV02 obj, Optional<OriginalTransactionReference18> value) {
			obj.setOriginalTransactionReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Mod", required = true)
	protected List<IdentificationModification2> modification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IdentificationModification2
	 * IdentificationModification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mod"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the identification data that is advised to be modified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IdentificationModificationAdviceV02, List<IdentificationModification2>> mmModification = new MMMessageBuildingBlock<IdentificationModificationAdviceV02, List<IdentificationModification2>>() {
		{
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Information concerning the identification data that is advised to be modified.";
			minOccurs = 1;
			complexType_lazy = () -> IdentificationModification2.mmObject();
		}

		@Override
		public List<IdentificationModification2> getValue(IdentificationModificationAdviceV02 obj) {
			return obj.getModification();
		}

		@Override
		public void setValue(IdentificationModificationAdviceV02 obj, List<IdentificationModification2> value) {
			obj.setModification(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<IdentificationModificationAdviceV02, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<IdentificationModificationAdviceV02, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(IdentificationModificationAdviceV02 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(IdentificationModificationAdviceV02 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationModificationAdviceV02";
				definition = "Scope\r\nThe IdentificationModificationAdvice message is sent by an assigner to an assignee. The message is used to advice on the correct party and/or account identification information.\r\nUsage\r\nThe IdentificationModificationAdvice message is sent after the receipt of one or several transaction messages that included no longer valid party and/or account identification information.\r\nThe IdentificationModificationAdvice message is exchanged between financial institutions and between financial institutions and non financial institutions and can contain one or more modification advises.\r\nThere is no time limit on the time between the sending of an IdentificationModificationAdvice message and the receipt of the transaction messages that the IdentificationModificationAdvice refers to.\r\nThe IdentificationModificationAdvice includes the correct party and/or account identification information, the IdentificationModificationAdvice or the included information may be forwarded to the initiating party of the transaction messages.";
				previousVersion_lazy = () -> IdentificationModificationAdviceV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ChangeorVerifyAccountIdentificationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "IdModAdvc";
				businessArea_lazy = () -> AccountManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02.mmAssignment,
						com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02.mmOriginalTransactionReference, com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02.mmModification,
						com.tools20022.repository.area.acmt.IdentificationModificationAdviceV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "022";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return IdentificationModificationAdviceV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public IdentificationAssignment2 getAssignment() {
		return assignment;
	}

	public IdentificationModificationAdviceV02 setAssignment(IdentificationAssignment2 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Optional<OriginalTransactionReference18> getOriginalTransactionReference() {
		return originalTransactionReference == null ? Optional.empty() : Optional.of(originalTransactionReference);
	}

	public IdentificationModificationAdviceV02 setOriginalTransactionReference(OriginalTransactionReference18 originalTransactionReference) {
		this.originalTransactionReference = originalTransactionReference;
		return this;
	}

	public List<IdentificationModification2> getModification() {
		return modification == null ? modification = new ArrayList<>() : modification;
	}

	public IdentificationModificationAdviceV02 setModification(List<IdentificationModification2> modification) {
		this.modification = Objects.requireNonNull(modification);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public IdentificationModificationAdviceV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.022.001.02")
	static public class Document {
		@XmlElement(name = "IdModAdvc", required = true)
		public IdentificationModificationAdviceV02 messageBody;
	}
}
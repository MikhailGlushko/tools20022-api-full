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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementPreviousVersion;
import com.tools20022.repository.msg.Case3;
import com.tools20022.repository.msg.CaseAssignment3;
import com.tools20022.repository.msg.DebitAuthorisationConfirmation2;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ExceptionsandInvestigationsISOPreviousversion;
import com.tools20022.repository.msgset.ExceptionsandInvestigationsMaintenance20162017;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Debit Authorisation Response message is sent by an account owner to its
 * account servicing institution. This message is used to approve or reject a
 * debit authorisation request.<br>
 * <b>Usage</b><br>
 * The Debit Authorisation Response message is used to reply to a Debit
 * Authorisation Request message.<br>
 * The Debit Authorisation Response message covers one and only one payment
 * instruction at a time. If an account owner needs to reply to several Debit
 * Authorisation Request messages, then multiple Debit Authorisation Response
 * messages must be sent.<br>
 * The Debit Authorisation Response message indicates whether the account owner
 * agrees with the request by means of a code. It also allows further details to
 * be given about the debit authorisation, such as acceptable amount and value
 * date for the debit.<br>
 * The Debit Authorisation Response message must be used exclusively between the
 * account owner and the account servicing institution. It must not be used in
 * place of a Resolution Of Investigation message between subsequent agents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV03#mmAssignment
 * DebitAuthorisationResponseV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV03#mmCase
 * DebitAuthorisationResponseV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV03#mmConfirmation
 * DebitAuthorisationResponseV03.mmConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV03#mmSupplementaryData
 * DebitAuthorisationResponseV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ExceptionsandInvestigationsISOPreviousversion
 * ExceptionsandInvestigationsISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ExceptionsandInvestigationsMaintenance20162017
 * ExceptionsandInvestigationsMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "DbtAuthstnRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
 * CashManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.036.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DebitAuthorisationResponseV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Debit Authorisation Response message is sent by an account owner to its account servicing institution. This message is used to approve or reject a debit authorisation request.\r\nUsage\r\nThe Debit Authorisation Response message is used to reply to a Debit Authorisation Request message.\r\nThe Debit Authorisation Response message covers one and only one payment instruction at a time. If an account owner needs to reply to several Debit Authorisation Request messages, then multiple Debit Authorisation Response messages must be sent.\r\nThe Debit Authorisation Response message indicates whether the account owner agrees with the request by means of a code. It also allows further details to be given about the debit authorisation, such as acceptable amount and value date for the debit.\r\nThe Debit Authorisation Response message must be used exclusively between the account owner and the account servicing institution. It must not be used in place of a Resolution Of Investigation message between subsequent agents."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV04
 * DebitAuthorisationResponseV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV02
 * DebitAuthorisationResponseV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DebitAuthorisationResponseV03", propOrder = {"assignment", "case_", "confirmation", "supplementaryData"})
public class DebitAuthorisationResponseV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment3 assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV04#mmAssignment
	 * DebitAuthorisationResponseV04.mmAssignment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DebitAuthorisationResponseV03, CaseAssignment3> mmAssignment = new MMMessageBuildingBlock<DebitAuthorisationResponseV03, CaseAssignment3>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			nextVersions_lazy = () -> Arrays.asList(DebitAuthorisationResponseV04.mmAssignment);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment3.mmObject();
		}

		@Override
		public CaseAssignment3 getValue(DebitAuthorisationResponseV03 obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(DebitAuthorisationResponseV03 obj, CaseAssignment3 value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "Case", required = true)
	protected Case3 case_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the investigation case."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV04#mmCase
	 * DebitAuthorisationResponseV04.mmCase}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DebitAuthorisationResponseV03, Case3> mmCase = new MMMessageBuildingBlock<DebitAuthorisationResponseV03, Case3>() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			nextVersions_lazy = () -> Arrays.asList(DebitAuthorisationResponseV04.mmCase);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case3.mmObject();
		}

		@Override
		public Case3 getValue(DebitAuthorisationResponseV03 obj) {
			return obj.getCase();
		}

		@Override
		public void setValue(DebitAuthorisationResponseV03 obj, Case3 value) {
			obj.setCase(value);
		}
	};
	@XmlElement(name = "Conf", required = true)
	protected DebitAuthorisationConfirmation2 confirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2
	 * DebitAuthorisationConfirmation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Conf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if the debit authorisation is granted or not."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV04#mmConfirmation
	 * DebitAuthorisationResponseV04.mmConfirmation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DebitAuthorisationResponseV03, DebitAuthorisationConfirmation2> mmConfirmation = new MMMessageBuildingBlock<DebitAuthorisationResponseV03, DebitAuthorisationConfirmation2>() {
		{
			xmlTag = "Conf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			definition = "Indicates if the debit authorisation is granted or not.";
			nextVersions_lazy = () -> Arrays.asList(DebitAuthorisationResponseV04.mmConfirmation);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DebitAuthorisationConfirmation2.mmObject();
		}

		@Override
		public DebitAuthorisationConfirmation2 getValue(DebitAuthorisationResponseV03 obj) {
			return obj.getConfirmation();
		}

		@Override
		public void setValue(DebitAuthorisationResponseV03 obj, DebitAuthorisationConfirmation2 value) {
			obj.setConfirmation(value);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV04#mmSupplementaryData
	 * DebitAuthorisationResponseV04.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DebitAuthorisationResponseV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<DebitAuthorisationResponseV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(DebitAuthorisationResponseV04.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(DebitAuthorisationResponseV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(DebitAuthorisationResponseV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebitAuthorisationResponseV03";
				definition = "Scope\r\nThe Debit Authorisation Response message is sent by an account owner to its account servicing institution. This message is used to approve or reject a debit authorisation request.\r\nUsage\r\nThe Debit Authorisation Response message is used to reply to a Debit Authorisation Request message.\r\nThe Debit Authorisation Response message covers one and only one payment instruction at a time. If an account owner needs to reply to several Debit Authorisation Request messages, then multiple Debit Authorisation Response messages must be sent.\r\nThe Debit Authorisation Response message indicates whether the account owner agrees with the request by means of a code. It also allows further details to be given about the debit authorisation, such as acceptable amount and value date for the debit.\r\nThe Debit Authorisation Response message must be used exclusively between the account owner and the account servicing institution. It must not be used in place of a Resolution Of Investigation message between subsequent agents.";
				nextVersions_lazy = () -> Arrays.asList(DebitAuthorisationResponseV04.mmObject());
				previousVersion_lazy = () -> DebitAuthorisationResponseV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ExceptionsandInvestigationsISOPreviousversion.mmObject(), ISOArchive.mmObject(), ExceptionsandInvestigationsMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "DbtAuthstnRspn";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.DebitAuthorisationResponseV03.mmAssignment, com.tools20022.repository.area.camt.DebitAuthorisationResponseV03.mmCase,
						com.tools20022.repository.area.camt.DebitAuthorisationResponseV03.mmConfirmation, com.tools20022.repository.area.camt.DebitAuthorisationResponseV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "036";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return DebitAuthorisationResponseV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment3 getAssignment() {
		return assignment;
	}

	public DebitAuthorisationResponseV03 setAssignment(CaseAssignment3 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Case3 getCase() {
		return case_;
	}

	public DebitAuthorisationResponseV03 setCase(Case3 case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public DebitAuthorisationConfirmation2 getConfirmation() {
		return confirmation;
	}

	public DebitAuthorisationResponseV03 setConfirmation(DebitAuthorisationConfirmation2 confirmation) {
		this.confirmation = Objects.requireNonNull(confirmation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public DebitAuthorisationResponseV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.036.001.03")
	static public class Document {
		@XmlElement(name = "DbtAuthstnRspn", required = true)
		public DebitAuthorisationResponseV03 messageBody;
	}
}
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
import com.tools20022.repository.area.CashManagementPreviousVersion;
import com.tools20022.repository.msg.Case2;
import com.tools20022.repository.msg.CaseAssignment2;
import com.tools20022.repository.msg.InvestigationRejectionJustification1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The Reject Investigation message is sent by a case assignee to a case creator
 * or case assigner to reject a case given to him.<br>
 * <b>Usage</b><br>
 * The Reject Investigation message is used to notify the case creator or case
 * assigner the rejection of an assignment by the case assignee in a:<br>
 * - request to cancel payment case<br>
 * - request to modify payment case<br>
 * - unable to apply case<br>
 * - claim non receipt case<br>
 * Rejecting a case assignment occurs when:<br>
 * - the case assignee is unable to trace the original payment instruction<br>
 * - the case assignee is unable, or does not have authority, to process the
 * assigned case (indicate "You have by-passed a party",<br>
 * - the case assignee has received a non expected message, and rejects the
 * message with a wrong message indicator<br>
 * - the case assignee has not yet received the Resolution Of Investigation
 * message and the case has already been reopened<br>
 * - the case assignee has rejects an non-cash related query<br>
 * The Reject Investigation message covers one and only one case at a time. If
 * the case assignee needs to reject several case assignments, then multiple
 * Reject Investigation messages must be sent.<br>
 * The Reject Investigation message must be forwarded by all subsequent case
 * assignee(s) until it reaches the case assigner and must not be used in place
 * of a Resolution Of Investigation or Case Status Report message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
 * CashManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RjctInvstgtn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectInvestigationV03#mmAssignment
 * RejectInvestigationV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectInvestigationV03#mmCase
 * RejectInvestigationV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RejectInvestigationV03#mmJustification
 * RejectInvestigationV03.mmJustification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.031.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectInvestigationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Reject Investigation message is sent by a case assignee to a case creator or case assigner to reject a case given to him.\r\nUsage\r\nThe Reject Investigation message is used to notify the case creator or case assigner the rejection of an assignment by the case assignee in a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nRejecting a case assignment occurs when:\r\n- the case assignee is unable to trace the original payment instruction\r\n- the case assignee is unable, or does not have authority, to process the assigned case (indicate \"You have by-passed a party\",\r\n- the case assignee has received a non expected message, and rejects the message with a wrong message indicator\r\n- the case assignee has not yet received the Resolution Of Investigation message and the case has already been reopened\r\n- the case assignee has rejects an non-cash related query\r\nThe Reject Investigation message covers one and only one case at a time. If the case assignee needs to reject several case assignments, then multiple Reject Investigation messages must be sent.\r\nThe Reject Investigation message must be forwarded by all subsequent case assignee(s) until it reaches the case assigner and must not be used in place of a Resolution Of Investigation or Case Status Report message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.camt.RejectInvestigationV04
 * RejectInvestigationV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class RejectInvestigationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected CaseAssignment2 assignment;
	/**
	 * Identifies the assignment of an investigation case from an assigner to an
	 * assignee. Usage: The Assigner must be the sender of this confirmation and
	 * the Assignee must be the receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment2.mmObject();
		}
	};
	protected Case2 case_;
	/**
	 * Identifies the investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case2 Case2}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case2.mmObject();
		}
	};
	protected InvestigationRejectionJustification1 justification;
	/**
	 * Specifies the reason for the rejection of an investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestigationRejectionJustification1
	 * InvestigationRejectionJustification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Justfn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Justification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for the rejection of an investigation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmJustification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Justfn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Justification";
			definition = "Specifies the reason for the rejection of an investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestigationRejectionJustification1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RejectInvestigationV03";
				definition = "Scope\r\nThe Reject Investigation message is sent by a case assignee to a case creator or case assigner to reject a case given to him.\r\nUsage\r\nThe Reject Investigation message is used to notify the case creator or case assigner the rejection of an assignment by the case assignee in a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nRejecting a case assignment occurs when:\r\n- the case assignee is unable to trace the original payment instruction\r\n- the case assignee is unable, or does not have authority, to process the assigned case (indicate \"You have by-passed a party\",\r\n- the case assignee has received a non expected message, and rejects the message with a wrong message indicator\r\n- the case assignee has not yet received the Resolution Of Investigation message and the case has already been reopened\r\n- the case assignee has rejects an non-cash related query\r\nThe Reject Investigation message covers one and only one case at a time. If the case assignee needs to reject several case assignments, then multiple Reject Investigation messages must be sent.\r\nThe Reject Investigation message must be forwarded by all subsequent case assignee(s) until it reaches the case assigner and must not be used in place of a Resolution Of Investigation or Case Status Report message.";
				nextVersions_lazy = () -> Arrays.asList(RejectInvestigationV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "RjctInvstgtn";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.RejectInvestigationV03.mmAssignment, com.tools20022.repository.area.camt.RejectInvestigationV03.mmCase,
						com.tools20022.repository.area.camt.RejectInvestigationV03.mmJustification);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "031";
						version = "03";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment2 getAssignment() {
		return assignment;
	}

	public void setAssignment(CaseAssignment2 assignment) {
		this.assignment = assignment;
	}

	public Case2 getCase() {
		return case_;
	}

	public void setCase(Case2 case_) {
		this.case_ = case_;
	}

	public InvestigationRejectionJustification1 getJustification() {
		return justification;
	}

	public void setJustification(InvestigationRejectionJustification1 justification) {
		this.justification = justification;
	}
}
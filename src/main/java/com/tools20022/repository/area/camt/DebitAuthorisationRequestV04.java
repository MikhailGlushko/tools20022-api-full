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
import com.tools20022.repository.choice.UnderlyingTransaction2Choice;
import com.tools20022.repository.msg.Case3;
import com.tools20022.repository.msg.CaseAssignment3;
import com.tools20022.repository.msg.DebitAuthorisation1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ExceptionsandInvestigationsISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * The Debit Authorisation Request message is sent by an account servicing
 * institution to an account owner. This message is used to request
 * authorisation to debit an account.<br>
 * <b>Usage</b><br>
 * The Debit Authorisation Request message must be answered with a Debit
 * Authorisation Response message.<br>
 * The Debit Authorisation Request message can be used to request debit
 * authorisation in a:<br>
 * - request to modify payment case (in the case of a lower final amount or
 * change of creditor)<br>
 * - request to cancel payment case (full amount)<br>
 * - unable to apply case (the creditor whose account has been credited is not
 * the intended beneficiary)<br>
 * - claim non receipt case (the creditor whose account has been credited is not
 * the intended beneficiary)<br>
 * The Debit Authorisation Request message covers one and only one payment
 * instruction at a time. If an account servicing institution needs to request
 * debit authorisation for several instructions, then multiple Debit
 * Authorisation Request messages must be sent.<br>
 * The Debit Authorisation Request must be used exclusively between the account
 * servicing institution and the account owner. It must not be used in place of
 * a Request To Modify Payment or Request To Cancel Payment message between
 * subsequent agents.
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
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ExceptionsandInvestigationsISOPreviousversion
 * ExceptionsandInvestigationsISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "DbtAuthstnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV04#mmAssignment
 * DebitAuthorisationRequestV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV04#mmCase
 * DebitAuthorisationRequestV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV04#mmUnderlying
 * DebitAuthorisationRequestV04.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV04#mmDetail
 * DebitAuthorisationRequestV04.mmDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV04#mmSupplementaryData
 * DebitAuthorisationRequestV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.037.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DebitAuthorisationRequestV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Debit Authorisation Request message is sent by an account servicing institution to an account owner. This message is used to request authorisation to debit an account.\r\nUsage\r\nThe Debit Authorisation Request message must be answered with a Debit Authorisation Response message.\r\nThe Debit Authorisation Request message can be used to request debit authorisation in a:\r\n- request to modify payment case (in the case of a lower final amount or change of creditor)\r\n- request to cancel payment case (full amount)\r\n- unable to apply case (the creditor whose account has been credited is not the intended beneficiary)\r\n- claim non receipt case (the creditor whose account has been credited is not the intended beneficiary)\r\nThe Debit Authorisation Request message covers one and only one payment instruction at a time. If an account servicing institution needs to request debit authorisation for several instructions, then multiple Debit Authorisation Request messages must be sent.\r\nThe Debit Authorisation Request must be used exclusively between the account servicing institution and the account owner. It must not be used in place of a Request To Modify Payment or Request To Cancel Payment message between subsequent agents."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05
 * DebitAuthorisationRequestV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV03
 * DebitAuthorisationRequestV03}</li>
 * </ul>
 */
public class DebitAuthorisationRequestV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected CaseAssignment3 assignment;
	/**
	 * Identifies the assignment of an investigation case from an assigner to an
	 * assignee. Usage: The Assigner must be the sender of this confirmation and
	 * the Assignee must be the receiver.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05#mmAssignment
	 * DebitAuthorisationRequestV05.mmAssignment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.DebitAuthorisationRequestV05.mmAssignment);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment3.mmObject();
		}
	};
	protected Case3 case_;
	/**
	 * Identifies the investigation case.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05#mmCase
	 * DebitAuthorisationRequestV05.mmCase}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.DebitAuthorisationRequestV05.mmCase);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case3.mmObject();
		}
	};
	protected UnderlyingTransaction2Choice underlying;
	/**
	 * Identifies the underlying payment instructrion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice
	 * UnderlyingTransaction2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Undrlyg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Underlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the underlying payment instructrion."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05#mmUnderlying
	 * DebitAuthorisationRequestV05.mmUnderlying}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUnderlying = new MMMessageBuildingBlock() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the underlying payment instructrion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.DebitAuthorisationRequestV05.mmUnderlying);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction2Choice.mmObject();
		}
	};
	protected DebitAuthorisation1 detail;
	/**
	 * Detailed information about the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisation1
	 * DebitAuthorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dtl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed information about the request."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05#mmDetail
	 * DebitAuthorisationRequestV05.mmDetail}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDetail = new MMMessageBuildingBlock() {
		{
			xmlTag = "Dtl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detail";
			definition = "Detailed information about the request.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.DebitAuthorisationRequestV05.mmDetail);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DebitAuthorisation1.mmObject();
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05#mmSupplementaryData
	 * DebitAuthorisationRequestV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.DebitAuthorisationRequestV05.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DebitAuthorisationRequestV04";
				definition = "Scope\r\nThe Debit Authorisation Request message is sent by an account servicing institution to an account owner. This message is used to request authorisation to debit an account.\r\nUsage\r\nThe Debit Authorisation Request message must be answered with a Debit Authorisation Response message.\r\nThe Debit Authorisation Request message can be used to request debit authorisation in a:\r\n- request to modify payment case (in the case of a lower final amount or change of creditor)\r\n- request to cancel payment case (full amount)\r\n- unable to apply case (the creditor whose account has been credited is not the intended beneficiary)\r\n- claim non receipt case (the creditor whose account has been credited is not the intended beneficiary)\r\nThe Debit Authorisation Request message covers one and only one payment instruction at a time. If an account servicing institution needs to request debit authorisation for several instructions, then multiple Debit Authorisation Request messages must be sent.\r\nThe Debit Authorisation Request must be used exclusively between the account servicing institution and the account owner. It must not be used in place of a Request To Modify Payment or Request To Cancel Payment message between subsequent agents.";
				nextVersions_lazy = () -> Arrays.asList(DebitAuthorisationRequestV05.mmObject());
				previousVersion_lazy = () -> DebitAuthorisationRequestV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ExceptionsandInvestigationsISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "DbtAuthstnReq";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.DebitAuthorisationRequestV04.mmAssignment, com.tools20022.repository.area.camt.DebitAuthorisationRequestV04.mmCase,
						com.tools20022.repository.area.camt.DebitAuthorisationRequestV04.mmUnderlying, com.tools20022.repository.area.camt.DebitAuthorisationRequestV04.mmDetail,
						com.tools20022.repository.area.camt.DebitAuthorisationRequestV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "037";
						version = "04";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment3 getAssignment() {
		return assignment;
	}

	public void setAssignment(CaseAssignment3 assignment) {
		this.assignment = assignment;
	}

	public Case3 getCase() {
		return case_;
	}

	public void setCase(Case3 case_) {
		this.case_ = case_;
	}

	public UnderlyingTransaction2Choice getUnderlying() {
		return underlying;
	}

	public void setUnderlying(UnderlyingTransaction2Choice underlying) {
		this.underlying = underlying;
	}

	public DebitAuthorisation1 getDetail() {
		return detail;
	}

	public void setDetail(DebitAuthorisation1 detail) {
		this.detail = detail;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}
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
import com.tools20022.repository.area.AccountManagementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * An account owner, for example, an investor or its designated agent, sends the
 * AccountModificationInstruction message to the account servicer, for example,
 * a registrar, transfer agent or custodian bank to modify, that is, create,
 * update or delete specific details of an existing investment fund account.<br>
 * <b>Usage</b><br>
 * The AccountModificationInstruction message is used to modify the details of
 * an existing account.<br>
 * The AccountModificationInstruction message has three specific uses:<br>
 * - to maintain/update any of the existing account details, for example, to
 * update the address of the beneficiary or modify the preference to income from
 * distribution to capitalisation, or,<br>
 * - to add/create specific details to the existing account when these details
 * were not yet recorded at the time of account creation, for example, to add a
 * second address or to establish new cash settlement standing instructions, or,<br>
 * - to delete specific account details, for example, delete cash standing
 * instructions.<br>
 * This message cannot be used to delete an entire account, as institution
 * specific and regulatory rules pertaining to account deletion are diverse.<br>
 * The usage of this message may be subject to service level agreement (SLA)
 * between the counterparties.<br>
 * Execution of the AccountModificationInstruction is confirmed via an
 * AccountDetailsConfirmation message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementArchive
 * AccountManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctModInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmMessageIdentification
 * AccountModificationInstructionV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmPreviousReference
 * AccountModificationInstructionV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmInstructionDetails
 * AccountModificationInstructionV03.mmInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmInvestmentAccountSelection
 * AccountModificationInstructionV03.mmInvestmentAccountSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedInvestmentAccount
 * AccountModificationInstructionV03.mmModifiedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedAccountParties
 * AccountModificationInstructionV03.mmModifiedAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedIntermediaries
 * AccountModificationInstructionV03.mmModifiedIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedPlacement
 * AccountModificationInstructionV03.mmModifiedPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedIssueAllocation
 * AccountModificationInstructionV03.mmModifiedIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedSavingsInvestmentPlan
 * AccountModificationInstructionV03.mmModifiedSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedWithdrawalInvestmentPlan
 * AccountModificationInstructionV03.mmModifiedWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedCashSettlement
 * AccountModificationInstructionV03.mmModifiedCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedServiceLevelAgreement
 * AccountModificationInstructionV03.mmModifiedServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmExtension
 * AccountModificationInstructionV03.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.003.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountModificationInstructionV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner, for example, an investor or its designated agent, sends the AccountModificationInstruction message to the account servicer, for example, a registrar, transfer agent or custodian bank to modify, that is, create, update or delete specific details of an existing investment fund account.\r\nUsage\r\nThe AccountModificationInstruction message is used to modify the details of an existing account.\r\nThe AccountModificationInstruction message has three specific uses:\r\n- to maintain/update any of the existing account details, for example, to update the address of the beneficiary or modify the preference to income from distribution to capitalisation, or,\r\n- to add/create specific details to the existing account when these details were not yet recorded at the time of account creation, for example, to add a second address or to establish new cash settlement standing instructions, or,\r\n- to delete specific account details, for example, delete cash standing instructions.\r\nThis message cannot be used to delete an entire account, as institution specific and regulatory rules pertaining to account deletion are diverse.\r\nThe usage of this message may be subject to service level agreement (SLA) between the counterparties.\r\nExecution of the AccountModificationInstruction is confirmed via an AccountDetailsConfirmation message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04
 * AccountModificationInstructionV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02
 * AccountModificationInstructionV02}</li>
 * </ul>
 */
public class AccountModificationInstructionV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Identifies the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmMessageIdentification
	 * AccountModificationInstructionV04.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the message.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	protected AdditionalReference3 previousReference;
	/**
	 * Reference to a linked message that was previously sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmPreviousReference
	 * AccountModificationInstructionV04.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmPreviousReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
	protected InvestmentAccountModificationDetails instructionDetails;
	/**
	 * Provide detailed information about the application modification
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModificationDetails
	 * InvestmentAccountModificationDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide detailed information about the application modification instruction. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmInstructionDetails
	 * AccountModificationInstructionV04.mmInstructionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionDetails";
			definition = "Provide detailed information about the application modification instruction. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmInstructionDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccountModificationDetails.mmObject();
		}
	};
	protected InvestmentAccountSelection2 investmentAccountSelection;
	/**
	 * Investment account selection information used to identify the account for
	 * which the information is modified..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountSelection2
	 * InvestmentAccountSelection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctSelctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountSelection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account selection information used to identify the account for which the information is modified.."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmInvestmentAccountSelection
	 * AccountModificationInstructionV04.mmInvestmentAccountSelection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvestmentAccountSelection = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstmtAcctSelctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountSelection";
			definition = "Investment account selection information used to identify the account for which the information is modified..";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmInvestmentAccountSelection);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestmentAccountSelection2.mmObject();
		}
	};
	protected InvestmentAccount36 modifiedInvestmentAccount;
	/**
	 * Information related to general characteristics of an investment account
	 * to be inserted, updated or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36
	 * InvestmentAccount36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdInvstmtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedInvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to general characteristics of an investment account to be inserted, updated or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedInvestmentAccount
	 * AccountModificationInstructionV04.mmModifiedInvestmentAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedInvestmentAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdInvstmtAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedInvestmentAccount";
			definition = "Information related to general characteristics of an investment account to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmModifiedInvestmentAccount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccount36.mmObject();
		}
	};
	protected List<AccountParties7> modifiedAccountParties;
	/**
	 * Information related to the account related parties (eg. account owner) to
	 * be inserted, updated or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdAcctPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedAccountParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the account related parties (eg. account owner) to be inserted, updated or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedAccountParties
	 * AccountModificationInstructionV04.mmModifiedAccountParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedAccountParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdAcctPties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedAccountParties";
			definition = "Information related to the account related parties (eg. account owner) to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmModifiedAccountParties);
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> AccountParties7.mmObject();
		}
	};
	protected List<ModificationScope7> modifiedIntermediaries;
	/**
	 * Information related to intermediaries to be inserted, updated or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope7
	 * ModificationScope7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdIntrmies"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedIntermediaries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to intermediaries to be inserted, updated or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedIntermediaries
	 * AccountModificationInstructionV04.mmModifiedIntermediaries}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedIntermediaries = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdIntrmies";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedIntermediaries";
			definition = "Information related to intermediaries to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmModifiedIntermediaries);
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope7.mmObject();
		}
	};
	protected ReferredAgent1 modifiedPlacement;
	/**
	 * Information related to referred placement agent in the hedge fund
	 * industry to be inserted, updated or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReferredAgent1
	 * ReferredAgent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdPlcmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedPlacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to referred placement agent in the hedge fund industry to be inserted, updated or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedPlacement
	 * AccountModificationInstructionV04.mmModifiedPlacement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedPlacement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdPlcmnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedPlacement";
			definition = "Information related to referred placement agent in the hedge fund industry to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmModifiedPlacement);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReferredAgent1.mmObject();
		}
	};
	protected ModificationScope9 modifiedIssueAllocation;
	/**
	 * Eligibility conditions information related to new issues allocation to be
	 * inserted, updated or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope9
	 * ModificationScope9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdIsseAllcn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedIssueAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligibility conditions information related to new issues allocation to be inserted, updated or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedIssueAllocation
	 * AccountModificationInstructionV04.mmModifiedIssueAllocation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedIssueAllocation = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdIsseAllcn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedIssueAllocation";
			definition = "Eligibility conditions information related to new issues allocation to be inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmModifiedIssueAllocation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope9.mmObject();
		}
	};
	protected List<ModificationScope16> modifiedSavingsInvestmentPlan;
	/**
	 * Information related to a savings plan to be either inserted, updated or
	 * deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope16
	 * ModificationScope16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdSvgsInvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedSavingsInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to a savings plan to be either inserted, updated or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedSavingsInvestmentPlan
	 * AccountModificationInstructionV04.mmModifiedSavingsInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedSavingsInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdSvgsInvstmtPlan";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedSavingsInvestmentPlan";
			definition = "Information related to a savings plan to be either inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmModifiedSavingsInvestmentPlan);
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope16.mmObject();
		}
	};
	protected List<ModificationScope16> modifiedWithdrawalInvestmentPlan;
	/**
	 * Information related to a withdrawal plan to be either inserted, updated
	 * or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope16
	 * ModificationScope16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdWdrwlInvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedWithdrawalInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to a withdrawal plan to be either inserted, updated or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedWithdrawalInvestmentPlan
	 * AccountModificationInstructionV04.mmModifiedWithdrawalInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedWithdrawalInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdWdrwlInvstmtPlan";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedWithdrawalInvestmentPlan";
			definition = "Information related to a withdrawal plan to be either inserted, updated or deleted.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmModifiedWithdrawalInvestmentPlan);
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope16.mmObject();
		}
	};
	protected List<InvestmentFundCashSettlementInformation6> modifiedCashSettlement;
	/**
	 * Cash settlement standing instruction associated to the investment fund
	 * transaction and to be either inserted or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation6
	 * InvestmentFundCashSettlementInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdCshSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedCashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash settlement standing instruction associated to the investment fund transaction and to be either inserted or deleted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedCashSettlement
	 * AccountModificationInstructionV04.mmModifiedCashSettlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedCashSettlement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdCshSttlm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedCashSettlement";
			definition = "Cash settlement standing instruction associated to the investment fund transaction and to be either inserted or deleted.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmModifiedCashSettlement);
			maxOccurs = 8;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundCashSettlementInformation6.mmObject();
		}
	};
	protected List<ModificationScope10> modifiedServiceLevelAgreement;
	/**
	 * Information related to documents to be added, deleted or updated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope10
	 * ModificationScope10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdSvcLvlAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedServiceLevelAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to documents to be added, deleted or updated.\n"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedServiceLevelAgreement
	 * AccountModificationInstructionV04.mmModifiedServiceLevelAgreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedServiceLevelAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdSvcLvlAgrmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedServiceLevelAgreement";
			definition = "Information related to documents to be added, deleted or updated.\n";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmModifiedServiceLevelAgreement);
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> ModificationScope10.mmObject();
		}
	};
	protected List<Extension1> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmExtension
	 * AccountModificationInstructionV04.mmExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmExtension);
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountModificationInstructionV03";
				definition = "Scope\r\nAn account owner, for example, an investor or its designated agent, sends the AccountModificationInstruction message to the account servicer, for example, a registrar, transfer agent or custodian bank to modify, that is, create, update or delete specific details of an existing investment fund account.\r\nUsage\r\nThe AccountModificationInstruction message is used to modify the details of an existing account.\r\nThe AccountModificationInstruction message has three specific uses:\r\n- to maintain/update any of the existing account details, for example, to update the address of the beneficiary or modify the preference to income from distribution to capitalisation, or,\r\n- to add/create specific details to the existing account when these details were not yet recorded at the time of account creation, for example, to add a second address or to establish new cash settlement standing instructions, or,\r\n- to delete specific account details, for example, delete cash standing instructions.\r\nThis message cannot be used to delete an entire account, as institution specific and regulatory rules pertaining to account deletion are diverse.\r\nThe usage of this message may be subject to service level agreement (SLA) between the counterparties.\r\nExecution of the AccountModificationInstruction is confirmed via an AccountDetailsConfirmation message.";
				nextVersions_lazy = () -> Arrays.asList(AccountModificationInstructionV04.mmObject());
				previousVersion_lazy = () -> AccountModificationInstructionV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AcctModInstr";
				businessArea_lazy = () -> AccountManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmMessageIdentification,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmPreviousReference, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmInstructionDetails,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmInvestmentAccountSelection, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedInvestmentAccount,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedAccountParties, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedIntermediaries,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedPlacement, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedIssueAllocation,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedSavingsInvestmentPlan, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedWithdrawalInvestmentPlan,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedCashSettlement, com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedServiceLevelAgreement,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "003";
						version = "03";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	public AdditionalReference3 getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
	}

	public InvestmentAccountModificationDetails getInstructionDetails() {
		return instructionDetails;
	}

	public void setInstructionDetails(InvestmentAccountModificationDetails instructionDetails) {
		this.instructionDetails = instructionDetails;
	}

	public InvestmentAccountSelection2 getInvestmentAccountSelection() {
		return investmentAccountSelection;
	}

	public void setInvestmentAccountSelection(InvestmentAccountSelection2 investmentAccountSelection) {
		this.investmentAccountSelection = investmentAccountSelection;
	}

	public InvestmentAccount36 getModifiedInvestmentAccount() {
		return modifiedInvestmentAccount;
	}

	public void setModifiedInvestmentAccount(InvestmentAccount36 modifiedInvestmentAccount) {
		this.modifiedInvestmentAccount = modifiedInvestmentAccount;
	}

	public List<AccountParties7> getModifiedAccountParties() {
		return modifiedAccountParties;
	}

	public void setModifiedAccountParties(List<AccountParties7> modifiedAccountParties) {
		this.modifiedAccountParties = modifiedAccountParties;
	}

	public List<ModificationScope7> getModifiedIntermediaries() {
		return modifiedIntermediaries;
	}

	public void setModifiedIntermediaries(List<ModificationScope7> modifiedIntermediaries) {
		this.modifiedIntermediaries = modifiedIntermediaries;
	}

	public ReferredAgent1 getModifiedPlacement() {
		return modifiedPlacement;
	}

	public void setModifiedPlacement(ReferredAgent1 modifiedPlacement) {
		this.modifiedPlacement = modifiedPlacement;
	}

	public ModificationScope9 getModifiedIssueAllocation() {
		return modifiedIssueAllocation;
	}

	public void setModifiedIssueAllocation(ModificationScope9 modifiedIssueAllocation) {
		this.modifiedIssueAllocation = modifiedIssueAllocation;
	}

	public List<ModificationScope16> getModifiedSavingsInvestmentPlan() {
		return modifiedSavingsInvestmentPlan;
	}

	public void setModifiedSavingsInvestmentPlan(List<ModificationScope16> modifiedSavingsInvestmentPlan) {
		this.modifiedSavingsInvestmentPlan = modifiedSavingsInvestmentPlan;
	}

	public List<ModificationScope16> getModifiedWithdrawalInvestmentPlan() {
		return modifiedWithdrawalInvestmentPlan;
	}

	public void setModifiedWithdrawalInvestmentPlan(List<ModificationScope16> modifiedWithdrawalInvestmentPlan) {
		this.modifiedWithdrawalInvestmentPlan = modifiedWithdrawalInvestmentPlan;
	}

	public List<InvestmentFundCashSettlementInformation6> getModifiedCashSettlement() {
		return modifiedCashSettlement;
	}

	public void setModifiedCashSettlement(List<InvestmentFundCashSettlementInformation6> modifiedCashSettlement) {
		this.modifiedCashSettlement = modifiedCashSettlement;
	}

	public List<ModificationScope10> getModifiedServiceLevelAgreement() {
		return modifiedServiceLevelAgreement;
	}

	public void setModifiedServiceLevelAgreement(List<ModificationScope10> modifiedServiceLevelAgreement) {
		this.modifiedServiceLevelAgreement = modifiedServiceLevelAgreement;
	}

	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}
}
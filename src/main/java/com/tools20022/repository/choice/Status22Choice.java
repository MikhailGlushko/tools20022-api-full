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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmAffirmationStatus
 * Status22Choice.mmAffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmAllocationStatus
 * Status22Choice.mmAllocationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmRepoCallRequestStatus
 * Status22Choice.mmRepoCallRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmCorporateActionEventProcessingStatus
 * Status22Choice.mmCorporateActionEventProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmCorporateActionEventStage
 * Status22Choice.mmCorporateActionEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmInferredMatchingStatus
 * Status22Choice.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmInstructionProcessingStatus
 * Status22Choice.mmInstructionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmMatchingStatus
 * Status22Choice.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmRegistrationProcessingStatus
 * Status22Choice.mmRegistrationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmResponseStatus
 * Status22Choice.mmResponseStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmReplacementProcessingStatus
 * Status22Choice.mmReplacementProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmCancellationProcessingStatus
 * Status22Choice.mmCancellationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmSettlementStatus
 * Status22Choice.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmSettlementConditionModificationStatus
 * Status22Choice.mmSettlementConditionModificationStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Status22Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status."</li>
 * </ul>
 */
public class Status22Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AffirmationStatus9Choice affirmationStatus;
	/**
	 * Status of affirmation of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus9Choice
	 * AffirmationStatus9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAffirmationStatus
	 * SecuritiesTradeStatus.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AffirmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of affirmation of a trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAffirmationStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmAffirmationStatus;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "AffirmSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AffirmationStatus9Choice.mmObject();
		}
	};
	protected AllocationSatus4Choice allocationStatus;
	/**
	 * Provides the status of allocation of collateral to cover the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus4Choice
	 * AllocationSatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmCollateralAllocationStatus
	 * SecuritiesTradeStatus.mmCollateralAllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllcnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of allocation of collateral to cover the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAllocationStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmCollateralAllocationStatus;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "AllcnSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationStatus";
			definition = "Provides the status of allocation of collateral to cover the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.AllocationSatus4Choice.mmObject();
		}
	};
	protected RepoCallRequestStatus10Choice repoCallRequestStatus;
	/**
	 * Provides the status of the repurchase agreement call request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus10Choice
	 * RepoCallRequestStatus10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmRepoCallRequestStatus
	 * SecuritiesTradeStatus.mmRepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RepoCallReqSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoCallRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the repurchase agreement call request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepoCallRequestStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmRepoCallRequestStatus;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "RepoCallReqSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoCallRequestStatus";
			definition = "Provides the status of the repurchase agreement call request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RepoCallRequestStatus10Choice.mmObject();
		}
	};
	protected CorporateActionEventProcessingStatus4Choice corporateActionEventProcessingStatus;
	/**
	 * Provides the status of a corporate action or the status of a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventProcessingStatus4Choice
	 * CorporateActionEventProcessingStatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmEventProcessingStatus
	 * CorporateActionStatus.mmEventProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of a corporate action or the status of a payment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCorporateActionEventProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionStatus.mmEventProcessingStatus;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtPrcgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventProcessingStatus";
			definition = "Provides the status of a corporate action or the status of a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CorporateActionEventProcessingStatus4Choice.mmObject();
		}
	};
	protected CorporateActionEventStage4Choice corporateActionEventStage;
	/**
	 * Stage in the corporate action event life cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStage4Choice
	 * CorporateActionEventStage4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventStage
	 * CorporateActionEvent.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtStag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCorporateActionEventStage = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtStag";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventStage";
			definition = "Stage in the corporate action event life cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CorporateActionEventStage4Choice.mmObject();
		}
	};
	protected MatchingStatus28Choice inferredMatchingStatus;
	/**
	 * Provides the matching status of an instruction as known by the account
	 * servicer based on an allegement. At this time no matching took place on
	 * the market (at the CSD/ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus28Choice
	 * MatchingStatus28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IfrrdMtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the matching status of an instruction as known by the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInferredMatchingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as known by the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.MatchingStatus28Choice.mmObject();
		}
	};
	protected InstructionProcessingStatus26Choice instructionProcessingStatus;
	/**
	 * Provides the status of an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus26Choice
	 * InstructionProcessingStatus26Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
	 * Status.mmTransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of an instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Provides the status of an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus26Choice.mmObject();
		}
	};
	protected MatchingStatus28Choice matchingStatus;
	/**
	 * Provides the matching status of the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus28Choice
	 * MatchingStatus28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the matching status of the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMatchingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "MtchgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.MatchingStatus28Choice.mmObject();
		}
	};
	protected RegistrationProcessingStatus4Choice registrationProcessingStatus;
	/**
	 * Provides the status of the registration processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RegistrationProcessingStatus4Choice
	 * RegistrationProcessingStatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
	 * Status.mmTransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of the registration processing."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegistrationProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "RegnPrcgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationProcessingStatus";
			definition = "Provides the status of the registration processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.RegistrationProcessingStatus4Choice.mmObject();
		}
	};
	protected ResponseStatus7Choice responseStatus;
	/**
	 * Provides the status of the received collateral message (collateral claim,
	 * a collateral proposal or a proposal/request for collateral substitution)
	 * from a collateral management perspective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus7Choice
	 * ResponseStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmResponseStatus
	 * CollateralStatus.mmResponseStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the received collateral message (collateral claim, a collateral proposal or a proposal/request for collateral substitution) from a collateral management perspective."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResponseStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CollateralStatus.mmResponseStatus;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "RspnSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseStatus";
			definition = "Provides the status of the received collateral message (collateral claim, a collateral proposal or a proposal/request for collateral substitution) from a collateral management perspective.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.ResponseStatus7Choice.mmObject();
		}
	};
	protected ReplacementProcessingStatus9Choice replacementProcessingStatus;
	/**
	 * Provides the processing status of the replacement request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus9Choice
	 * ReplacementProcessingStatus9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
	 * Status.mmTransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RplcmntPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplacementProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the processing status of the replacement request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReplacementProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "RplcmntPrcgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReplacementProcessingStatus";
			definition = "Provides the processing status of the replacement request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.ReplacementProcessingStatus9Choice.mmObject();
		}
	};
	protected CancellationProcessingStatus8Choice cancellationProcessingStatus;
	/**
	 * Provides the status of a cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus8Choice
	 * CancellationProcessingStatus8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmCancellationProcessingStatus
	 * Status.mmCancellationProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of a cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.mmCancellationProcessingStatus;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlPrcgSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationProcessingStatus";
			definition = "Provides the status of a cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CancellationProcessingStatus8Choice.mmObject();
		}
	};
	protected SettlementStatus25Choice settlementStatus;
	/**
	 * Provides the status of settlement of a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus25Choice
	 * SettlementStatus25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmSettlementStatus
	 * Status.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of settlement of a transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.mmSettlementStatus;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.SettlementStatus25Choice.mmObject();
		}
	};
	protected SettlementConditionModificationStatus4Choice settlementConditionModificationStatus;
	/**
	 * Provides the status of a securities settlement condition modification
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus4Choice
	 * SettlementConditionModificationStatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSettlementConditionModificationStatus
	 * SecuritiesTradeStatus.mmSettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status22Choice
	 * Status22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCondModSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementConditionModificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of a securities settlement condition modification request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementConditionModificationStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmSettlementConditionModificationStatus;
			componentContext_lazy = () -> Status22Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmCondModSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementConditionModificationStatus";
			definition = "Provides the status of a securities settlement condition modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.SettlementConditionModificationStatus4Choice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status22Choice.mmAffirmationStatus, com.tools20022.repository.choice.Status22Choice.mmAllocationStatus,
						com.tools20022.repository.choice.Status22Choice.mmRepoCallRequestStatus, com.tools20022.repository.choice.Status22Choice.mmCorporateActionEventProcessingStatus,
						com.tools20022.repository.choice.Status22Choice.mmCorporateActionEventStage, com.tools20022.repository.choice.Status22Choice.mmInferredMatchingStatus,
						com.tools20022.repository.choice.Status22Choice.mmInstructionProcessingStatus, com.tools20022.repository.choice.Status22Choice.mmMatchingStatus,
						com.tools20022.repository.choice.Status22Choice.mmRegistrationProcessingStatus, com.tools20022.repository.choice.Status22Choice.mmResponseStatus,
						com.tools20022.repository.choice.Status22Choice.mmReplacementProcessingStatus, com.tools20022.repository.choice.Status22Choice.mmCancellationProcessingStatus,
						com.tools20022.repository.choice.Status22Choice.mmSettlementStatus, com.tools20022.repository.choice.Status22Choice.mmSettlementConditionModificationStatus);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Status22Choice";
				definition = "Choice of status.";
			}
		});
		return mmObject_lazy.get();
	}

	public AffirmationStatus9Choice getAffirmationStatus() {
		return affirmationStatus;
	}

	public void setAffirmationStatus(com.tools20022.repository.choice.AffirmationStatus9Choice affirmationStatus) {
		this.affirmationStatus = affirmationStatus;
	}

	public AllocationSatus4Choice getAllocationStatus() {
		return allocationStatus;
	}

	public void setAllocationStatus(com.tools20022.repository.choice.AllocationSatus4Choice allocationStatus) {
		this.allocationStatus = allocationStatus;
	}

	public RepoCallRequestStatus10Choice getRepoCallRequestStatus() {
		return repoCallRequestStatus;
	}

	public void setRepoCallRequestStatus(com.tools20022.repository.choice.RepoCallRequestStatus10Choice repoCallRequestStatus) {
		this.repoCallRequestStatus = repoCallRequestStatus;
	}

	public CorporateActionEventProcessingStatus4Choice getCorporateActionEventProcessingStatus() {
		return corporateActionEventProcessingStatus;
	}

	public void setCorporateActionEventProcessingStatus(com.tools20022.repository.choice.CorporateActionEventProcessingStatus4Choice corporateActionEventProcessingStatus) {
		this.corporateActionEventProcessingStatus = corporateActionEventProcessingStatus;
	}

	public CorporateActionEventStage4Choice getCorporateActionEventStage() {
		return corporateActionEventStage;
	}

	public void setCorporateActionEventStage(com.tools20022.repository.choice.CorporateActionEventStage4Choice corporateActionEventStage) {
		this.corporateActionEventStage = corporateActionEventStage;
	}

	public MatchingStatus28Choice getInferredMatchingStatus() {
		return inferredMatchingStatus;
	}

	public void setInferredMatchingStatus(com.tools20022.repository.choice.MatchingStatus28Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = inferredMatchingStatus;
	}

	public InstructionProcessingStatus26Choice getInstructionProcessingStatus() {
		return instructionProcessingStatus;
	}

	public void setInstructionProcessingStatus(com.tools20022.repository.choice.InstructionProcessingStatus26Choice instructionProcessingStatus) {
		this.instructionProcessingStatus = instructionProcessingStatus;
	}

	public MatchingStatus28Choice getMatchingStatus() {
		return matchingStatus;
	}

	public void setMatchingStatus(com.tools20022.repository.choice.MatchingStatus28Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
	}

	public RegistrationProcessingStatus4Choice getRegistrationProcessingStatus() {
		return registrationProcessingStatus;
	}

	public void setRegistrationProcessingStatus(com.tools20022.repository.choice.RegistrationProcessingStatus4Choice registrationProcessingStatus) {
		this.registrationProcessingStatus = registrationProcessingStatus;
	}

	public ResponseStatus7Choice getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(com.tools20022.repository.choice.ResponseStatus7Choice responseStatus) {
		this.responseStatus = responseStatus;
	}

	public ReplacementProcessingStatus9Choice getReplacementProcessingStatus() {
		return replacementProcessingStatus;
	}

	public void setReplacementProcessingStatus(com.tools20022.repository.choice.ReplacementProcessingStatus9Choice replacementProcessingStatus) {
		this.replacementProcessingStatus = replacementProcessingStatus;
	}

	public CancellationProcessingStatus8Choice getCancellationProcessingStatus() {
		return cancellationProcessingStatus;
	}

	public void setCancellationProcessingStatus(com.tools20022.repository.choice.CancellationProcessingStatus8Choice cancellationProcessingStatus) {
		this.cancellationProcessingStatus = cancellationProcessingStatus;
	}

	public SettlementStatus25Choice getSettlementStatus() {
		return settlementStatus;
	}

	public void setSettlementStatus(com.tools20022.repository.choice.SettlementStatus25Choice settlementStatus) {
		this.settlementStatus = settlementStatus;
	}

	public SettlementConditionModificationStatus4Choice getSettlementConditionModificationStatus() {
		return settlementConditionModificationStatus;
	}

	public void setSettlementConditionModificationStatus(com.tools20022.repository.choice.SettlementConditionModificationStatus4Choice settlementConditionModificationStatus) {
		this.settlementConditionModificationStatus = settlementConditionModificationStatus;
	}
}
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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.SettlementTransactionCondition5Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesSettlement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Parameters which explicitly state the conditions that must be fulfilled
 * before a particular transaction of a financial instrument can be settled.
 * These parameters are defined by the instructing party in compliance with
 * settlement rules in the market the transaction will settle in.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmHoldIndicator
 * SettlementDetails72.mmHoldIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails72#mmPriority
 * SettlementDetails72.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmSettlementTransactionCondition
 * SettlementDetails72.mmSettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmSettlingCapacity
 * SettlementDetails72.mmSettlingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmStampDutyTaxBasis
 * SettlementDetails72.mmStampDutyTaxBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmSecuritiesRTGS
 * SettlementDetails72.mmSecuritiesRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmBeneficialOwnership
 * SettlementDetails72.mmBeneficialOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmCashClearingSystem
 * SettlementDetails72.mmCashClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmTaxCapacity
 * SettlementDetails72.mmTaxCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmMarketClientSide
 * SettlementDetails72.mmMarketClientSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmFXStandingInstruction
 * SettlementDetails72.mmFXStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmBlockTrade
 * SettlementDetails72.mmBlockTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmLegalRestrictions
 * SettlementDetails72.mmLegalRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmSettlementSystemMethod
 * SettlementDetails72.mmSettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmNettingEligibility
 * SettlementDetails72.mmNettingEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmCCPEligibility
 * SettlementDetails72.mmCCPEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails72#mmTracking
 * SettlementDetails72.mmTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmAutomaticBorrowing
 * SettlementDetails72.mmAutomaticBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmPartialSettlementIndicator
 * SettlementDetails72.mmPartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmEligibleForCollateral
 * SettlementDetails72.mmEligibleForCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV05#mmSettlementParameters
 * SecuritiesFinancingInstructionV05.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04#mmSettlementParameters
 * SecuritiesFinancingModificationInstructionV04.mmSettlementParameters}</li>
 * </ul>
 * </li>
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
 * "SettlementDetails72"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails97
 * SettlementDetails97}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SettlementDetails62
 * SettlementDetails62}</li>
 * </ul>
 */
public class SettlementDetails72 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator holdIndicator;
	/**
	 * Specifies whether the transaction is on hold/blocked/frozen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldIndicator
	 * SecuritiesSettlement.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is on hold/blocked/frozen."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmHoldIndicator
	 * SettlementDetails97.mmHoldIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmHoldIndicator
	 * SettlementDetails62.mmHoldIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmHoldIndicator;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "HldInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold/blocked/frozen.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmHoldIndicator);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmHoldIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PriorityNumeric1Choice priority;
	/**
	 * Specifies whether the transaction is to be executed with a high priority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric1Choice
	 * PriorityNumeric1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmPriority
	 * Obligation.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmPriority
	 * SettlementDetails97.mmPriority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmPriority
	 * SettlementDetails62.mmPriority}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriority = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Obligation.mmPriority;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmPriority);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmPriority;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriorityNumeric1Choice.mmObject();
		}
	};
	protected List<SettlementTransactionCondition7Choice> settlementTransactionCondition;
	/**
	 * Conditions under which the order/trade is to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition7Choice
	 * SettlementTransactionCondition7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
	 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTxCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditions under which the order/trade is to be settled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmSettlementTransactionCondition
	 * SettlementDetails97.mmSettlementTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmSettlementTransactionCondition
	 * SettlementDetails62.mmSettlementTransactionCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTransactionCondition = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "SttlmTxCond";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmSettlementTransactionCondition);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmSettlementTransactionCondition;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementTransactionCondition7Choice.mmObject();
		}
	};
	protected SettlingCapacity4Choice settlingCapacity;
	/**
	 * Role of a party in the settlement of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlingCapacity4Choice
	 * SettlingCapacity4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSettlingCapacity
	 * SecuritiesSettlementPartyRole.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlgCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of a party in the settlement of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmSettlingCapacity
	 * SettlementDetails97.mmSettlingCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmSettlingCapacity
	 * SettlementDetails62.mmSettlingCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlingCapacity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSettlingCapacity;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "SttlgCpcty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingCapacity";
			definition = "Role of a party in the settlement of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmSettlingCapacity);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmSettlingCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlingCapacity4Choice.mmObject();
		}
	};
	protected GenericIdentification20 stampDutyTaxBasis;
	/**
	 * Specifies the stamp duty type or exemption reason applicable to the
	 * settlement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyTaxBasis
	 * SecuritiesTax.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDtyTaxBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyTaxBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the stamp duty type or exemption reason applicable to the settlement transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmStampDutyTaxBasis
	 * SettlementDetails97.mmStampDutyTaxBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmStampDutyTaxBasis
	 * SettlementDetails62.mmStampDutyTaxBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStampDutyTaxBasis = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmStampDutyTaxBasis;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyTaxBsis";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyTaxBasis";
			definition = "Specifies the stamp duty type or exemption reason applicable to the settlement transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmStampDutyTaxBasis);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmStampDutyTaxBasis;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification20.mmObject();
		}
	};
	protected SecuritiesRTGS1Choice securitiesRTGS;
	/**
	 * Specifies whether the settlement transaction is to be settled through an
	 * RTGS or a non RTGS system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS1Choice
	 * SecuritiesRTGS1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesRealTimeGrossSettlement
	 * SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmSecuritiesRTGS
	 * SettlementDetails97.mmSecuritiesRTGS}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmSecuritiesRTGS
	 * SettlementDetails62.mmSecuritiesRTGS}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesRTGS = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "SctiesRTGS";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRTGS";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmSecuritiesRTGS);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmSecuritiesRTGS;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesRTGS1Choice.mmObject();
		}
	};
	protected BeneficialOwnership1Choice beneficialOwnership;
	/**
	 * Specifies whether there is change of beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership1Choice
	 * BeneficialOwnership1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBeneficialOwnershipIndicator
	 * SecuritiesSettlement.mmBeneficialOwnershipIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether there is change of beneficial ownership."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmBeneficialOwnership
	 * SettlementDetails97.mmBeneficialOwnership}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmBeneficialOwnership
	 * SettlementDetails62.mmBeneficialOwnership}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficialOwnership = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmBeneficialOwnershipIndicator;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrsh";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnership";
			definition = "Specifies whether there is change of beneficial ownership.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmBeneficialOwnership);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmBeneficialOwnership;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BeneficialOwnership1Choice.mmObject();
		}
	};
	protected CashSettlementSystem1Choice cashClearingSystem;
	/**
	 * Specifies the category of cash clearing system, for example, cheque
	 * clearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem1Choice
	 * CashSettlementSystem1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole#mmSystem
	 * SettlementInstructionSystemRole.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshClrSys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the category of cash clearing system, for example, cheque clearing."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmCashClearingSystem
	 * SettlementDetails97.mmCashClearingSystem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmCashClearingSystem
	 * SettlementDetails62.mmCashClearingSystem}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashClearingSystem = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SettlementInstructionSystemRole.mmSystem;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "CshClrSys";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystem";
			definition = "Specifies the category of cash clearing system, for example, cheque clearing.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmCashClearingSystem);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmCashClearingSystem;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashSettlementSystem1Choice.mmObject();
		}
	};
	protected TaxCapacityParty1Choice taxCapacity;
	/**
	 * Tax role capacity of the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty1Choice
	 * TaxCapacityParty1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmTaxCapacity
	 * SecuritiesSettlementPartyRole.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax role capacity of the instructing party."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmTaxCapacity
	 * SettlementDetails97.mmTaxCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmTaxCapacity
	 * SettlementDetails62.mmTaxCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxCapacity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmTaxCapacity;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "TaxCpcty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCapacity";
			definition = "Tax role capacity of the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmTaxCapacity);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmTaxCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxCapacityParty1Choice.mmObject();
		}
	};
	protected MarketClientSide1Choice marketClientSide;
	/**
	 * Specifies if an instruction is for a market side or a client side
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide1Choice
	 * MarketClientSide1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmMarketClientSide
	 * SecuritiesSettlement.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktClntSd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClientSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if an instruction is for a market side or a client side transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmMarketClientSide
	 * SettlementDetails97.mmMarketClientSide}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmMarketClientSide
	 * SettlementDetails62.mmMarketClientSide}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarketClientSide = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmMarketClientSide;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "MktClntSd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmMarketClientSide);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmMarketClientSide;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketClientSide1Choice.mmObject();
		}
	};
	protected FXStandingInstruction1Choice fXStandingInstruction;
	/**
	 * Specifies whether the foreign exchange standing instruction in place
	 * should apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction1Choice
	 * FXStandingInstruction1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
	 * Settlement.mmStandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxStgInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the foreign exchange standing instruction in place should apply."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmFXStandingInstruction
	 * SettlementDetails97.mmFXStandingInstruction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmFXStandingInstruction
	 * SettlementDetails62.mmFXStandingInstruction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFXStandingInstruction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Settlement.mmStandingSettlementInstruction;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "FxStgInstr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstruction";
			definition = "Specifies whether the foreign exchange standing instruction in place should apply.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmFXStandingInstruction);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmFXStandingInstruction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FXStandingInstruction1Choice.mmObject();
		}
	};
	protected BlockTrade1Choice blockTrade;
	/**
	 * Specifies whether the settlement instruction is a block parent or child.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.BlockTrade1Choice
	 * BlockTrade1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBlockTrade
	 * SecuritiesSettlement.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction is a block parent or child."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmBlockTrade
	 * SettlementDetails97.mmBlockTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmBlockTrade
	 * SettlementDetails62.mmBlockTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBlockTrade = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmBlockTrade;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "BlckTrad";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockTrade";
			definition = "Specifies whether the settlement instruction is a block parent or child.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmBlockTrade);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmBlockTrade;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BlockTrade1Choice.mmObject();
		}
	};
	protected Restriction1Choice legalRestrictions;
	/**
	 * Regulatory restrictions applicable to a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Restriction1Choice
	 * Restriction1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRestriction
	 * Security.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglRstrctns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory restrictions applicable to a security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmLegalRestrictions
	 * SettlementDetails97.mmLegalRestrictions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmLegalRestrictions
	 * SettlementDetails62.mmLegalRestrictions}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegalRestrictions = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.mmRestriction;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctns";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictions";
			definition = "Regulatory restrictions applicable to a security.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmLegalRestrictions);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmLegalRestrictions;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Restriction1Choice.mmObject();
		}
	};
	protected SettlementSystemMethod1Choice settlementSystemMethod;
	/**
	 * Specifies whether the settlement instruction is to be settled through the
	 * default or the alternate settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod1Choice
	 * SettlementSystemMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementSystemMethod
	 * SecuritiesSettlement.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSysMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmSettlementSystemMethod
	 * SettlementDetails97.mmSettlementSystemMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmSettlementSystemMethod
	 * SettlementDetails62.mmSettlementSystemMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementSystemMethod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementSystemMethod;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "SttlmSysMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmSettlementSystemMethod);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmSettlementSystemMethod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementSystemMethod1Choice.mmObject();
		}
	};
	protected NettingEligibility1Choice nettingEligibility;
	/**
	 * Specifies whether the settlement transaction is eligible for netting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility1Choice
	 * NettingEligibility1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmNettingEligibility
	 * SecuritiesDeliveryObligation.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetgElgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettingEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is eligible for netting."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmNettingEligibility
	 * SettlementDetails97.mmNettingEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmNettingEligibility
	 * SettlementDetails62.mmNettingEligibility}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNettingEligibility = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmNettingEligibility;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "NetgElgblty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettingEligibility";
			definition = "Specifies whether the settlement transaction is eligible for netting.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmNettingEligibility);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmNettingEligibility;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NettingEligibility1Choice.mmObject();
		}
	};
	protected CentralCounterPartyEligibility1Choice cCPEligibility;
	/**
	 * Specifies whether the settlement transaction is CCP (Central
	 * Counterparty) eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility1Choice
	 * CentralCounterPartyEligibility1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmCCPEligibility
	 * SecuritiesDeliveryObligation.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CCPElgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmCCPEligibility
	 * SettlementDetails97.mmCCPEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmCCPEligibility
	 * SettlementDetails62.mmCCPEligibility}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCCPEligibility = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmCCPEligibility;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "CCPElgblty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPEligibility";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmCCPEligibility);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmCCPEligibility;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CentralCounterPartyEligibility1Choice.mmObject();
		}
	};
	protected Tracking1Choice tracking;
	/**
	 * Specifies whether the loan and/or collateral is tracked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Tracking1Choice
	 * Tracking1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTracking
	 * SecuritiesSettlement.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trckg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the loan and/or collateral is tracked."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmTracking
	 * SettlementDetails97.mmTracking}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmTracking
	 * SettlementDetails62.mmTracking}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTracking = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmTracking;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "Trckg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tracking";
			definition = "Specifies whether the loan and/or collateral is tracked.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmTracking);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmTracking;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tracking1Choice.mmObject();
		}
	};
	protected AutomaticBorrowing1Choice automaticBorrowing;
	/**
	 * Condition for automatic borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing1Choice
	 * AutomaticBorrowing1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAutomaticBorrowing
	 * SecuritiesSettlement.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AutomtcBrrwg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition for automatic borrowing."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmAutomaticBorrowing
	 * SettlementDetails97.mmAutomaticBorrowing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmAutomaticBorrowing
	 * SettlementDetails62.mmAutomaticBorrowing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAutomaticBorrowing = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmAutomaticBorrowing;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "AutomtcBrrwg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticBorrowing";
			definition = "Condition for automatic borrowing.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmAutomaticBorrowing);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmAutomaticBorrowing;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AutomaticBorrowing1Choice.mmObject();
		}
	};
	protected SettlementTransactionCondition5Code partialSettlementIndicator;
	/**
	 * Specifies whether partial settlement is allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition5Code
	 * SettlementTransactionCondition5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
	 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether partial settlement is allowed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmPartialSettlementIndicator
	 * SettlementDetails97.mmPartialSettlementIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmPartialSettlementIndicator
	 * SettlementDetails62.mmPartialSettlementIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialSettlementIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmPartialSettlementIndicator);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmPartialSettlementIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SettlementTransactionCondition5Code.mmObject();
		}
	};
	protected YesNoIndicator eligibleForCollateral;
	/**
	 * Specifies whether securities should be included in the pool of securities
	 * eligible for collateral purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmEligibleForCollateral
	 * SecuritiesSettlement.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72
	 * SettlementDetails72}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblForColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether securities should be included in the pool of securities eligible for collateral purposes."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmEligibleForCollateral
	 * SettlementDetails97.mmEligibleForCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmEligibleForCollateral
	 * SettlementDetails62.mmEligibleForCollateral}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEligibleForCollateral = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmEligibleForCollateral;
			componentContext_lazy = () -> SettlementDetails72.mmObject();
			isDerived = false;
			xmlTag = "ElgblForColl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities should be included in the pool of securities eligible for collateral purposes.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails97.mmEligibleForCollateral);
			previousVersion_lazy = () -> com.tools20022.repository.msg.SettlementDetails62.mmEligibleForCollateral;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails72.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails72.mmPriority,
						com.tools20022.repository.msg.SettlementDetails72.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails72.mmSettlingCapacity,
						com.tools20022.repository.msg.SettlementDetails72.mmStampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails72.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails72.mmBeneficialOwnership,
						com.tools20022.repository.msg.SettlementDetails72.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails72.mmTaxCapacity, com.tools20022.repository.msg.SettlementDetails72.mmMarketClientSide,
						com.tools20022.repository.msg.SettlementDetails72.mmFXStandingInstruction, com.tools20022.repository.msg.SettlementDetails72.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails72.mmLegalRestrictions,
						com.tools20022.repository.msg.SettlementDetails72.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails72.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails72.mmCCPEligibility,
						com.tools20022.repository.msg.SettlementDetails72.mmTracking, com.tools20022.repository.msg.SettlementDetails72.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails72.mmPartialSettlementIndicator,
						com.tools20022.repository.msg.SettlementDetails72.mmEligibleForCollateral);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV05.mmSettlementParameters,
						com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04.mmSettlementParameters);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementDetails72";
				definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
				nextVersions_lazy = () -> Arrays.asList(SettlementDetails97.mmObject());
				previousVersion_lazy = () -> SettlementDetails62.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getHoldIndicator() {
		return holdIndicator;
	}

	public void setHoldIndicator(YesNoIndicator holdIndicator) {
		this.holdIndicator = holdIndicator;
	}

	public PriorityNumeric1Choice getPriority() {
		return priority;
	}

	public void setPriority(PriorityNumeric1Choice priority) {
		this.priority = priority;
	}

	public List<SettlementTransactionCondition7Choice> getSettlementTransactionCondition() {
		return settlementTransactionCondition;
	}

	public void setSettlementTransactionCondition(List<SettlementTransactionCondition7Choice> settlementTransactionCondition) {
		this.settlementTransactionCondition = settlementTransactionCondition;
	}

	public SettlingCapacity4Choice getSettlingCapacity() {
		return settlingCapacity;
	}

	public void setSettlingCapacity(SettlingCapacity4Choice settlingCapacity) {
		this.settlingCapacity = settlingCapacity;
	}

	public GenericIdentification20 getStampDutyTaxBasis() {
		return stampDutyTaxBasis;
	}

	public void setStampDutyTaxBasis(com.tools20022.repository.msg.GenericIdentification20 stampDutyTaxBasis) {
		this.stampDutyTaxBasis = stampDutyTaxBasis;
	}

	public SecuritiesRTGS1Choice getSecuritiesRTGS() {
		return securitiesRTGS;
	}

	public void setSecuritiesRTGS(SecuritiesRTGS1Choice securitiesRTGS) {
		this.securitiesRTGS = securitiesRTGS;
	}

	public BeneficialOwnership1Choice getBeneficialOwnership() {
		return beneficialOwnership;
	}

	public void setBeneficialOwnership(BeneficialOwnership1Choice beneficialOwnership) {
		this.beneficialOwnership = beneficialOwnership;
	}

	public CashSettlementSystem1Choice getCashClearingSystem() {
		return cashClearingSystem;
	}

	public void setCashClearingSystem(CashSettlementSystem1Choice cashClearingSystem) {
		this.cashClearingSystem = cashClearingSystem;
	}

	public TaxCapacityParty1Choice getTaxCapacity() {
		return taxCapacity;
	}

	public void setTaxCapacity(TaxCapacityParty1Choice taxCapacity) {
		this.taxCapacity = taxCapacity;
	}

	public MarketClientSide1Choice getMarketClientSide() {
		return marketClientSide;
	}

	public void setMarketClientSide(MarketClientSide1Choice marketClientSide) {
		this.marketClientSide = marketClientSide;
	}

	public FXStandingInstruction1Choice getFXStandingInstruction() {
		return fXStandingInstruction;
	}

	public void setFXStandingInstruction(FXStandingInstruction1Choice fXStandingInstruction) {
		this.fXStandingInstruction = fXStandingInstruction;
	}

	public BlockTrade1Choice getBlockTrade() {
		return blockTrade;
	}

	public void setBlockTrade(BlockTrade1Choice blockTrade) {
		this.blockTrade = blockTrade;
	}

	public Restriction1Choice getLegalRestrictions() {
		return legalRestrictions;
	}

	public void setLegalRestrictions(Restriction1Choice legalRestrictions) {
		this.legalRestrictions = legalRestrictions;
	}

	public SettlementSystemMethod1Choice getSettlementSystemMethod() {
		return settlementSystemMethod;
	}

	public void setSettlementSystemMethod(SettlementSystemMethod1Choice settlementSystemMethod) {
		this.settlementSystemMethod = settlementSystemMethod;
	}

	public NettingEligibility1Choice getNettingEligibility() {
		return nettingEligibility;
	}

	public void setNettingEligibility(NettingEligibility1Choice nettingEligibility) {
		this.nettingEligibility = nettingEligibility;
	}

	public CentralCounterPartyEligibility1Choice getCCPEligibility() {
		return cCPEligibility;
	}

	public void setCCPEligibility(CentralCounterPartyEligibility1Choice cCPEligibility) {
		this.cCPEligibility = cCPEligibility;
	}

	public Tracking1Choice getTracking() {
		return tracking;
	}

	public void setTracking(Tracking1Choice tracking) {
		this.tracking = tracking;
	}

	public AutomaticBorrowing1Choice getAutomaticBorrowing() {
		return automaticBorrowing;
	}

	public void setAutomaticBorrowing(AutomaticBorrowing1Choice automaticBorrowing) {
		this.automaticBorrowing = automaticBorrowing;
	}

	public SettlementTransactionCondition5Code getPartialSettlementIndicator() {
		return partialSettlementIndicator;
	}

	public void setPartialSettlementIndicator(SettlementTransactionCondition5Code partialSettlementIndicator) {
		this.partialSettlementIndicator = partialSettlementIndicator;
	}

	public YesNoIndicator getEligibleForCollateral() {
		return eligibleForCollateral;
	}

	public void setEligibleForCollateral(YesNoIndicator eligibleForCollateral) {
		this.eligibleForCollateral = eligibleForCollateral;
	}
}
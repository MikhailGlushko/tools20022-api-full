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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.SettlementTransactionCondition5Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification20;
import com.tools20022.repository.msg.HoldIndicator4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmHoldIndicator
 * SettlementDetails67.mmHoldIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails67#mmPriority
 * SettlementDetails67.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmSecuritiesTransactionType
 * SettlementDetails67.mmSecuritiesTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmSettlementTransactionCondition
 * SettlementDetails67.mmSettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmPartialSettlementIndicator
 * SettlementDetails67.mmPartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmBeneficialOwnership
 * SettlementDetails67.mmBeneficialOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmBlockTrade
 * SettlementDetails67.mmBlockTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmCCPEligibility
 * SettlementDetails67.mmCCPEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmDeliveryReturnReason
 * SettlementDetails67.mmDeliveryReturnReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmCashClearingSystem
 * SettlementDetails67.mmCashClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmExposureType
 * SettlementDetails67.mmExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmFXStandingInstruction
 * SettlementDetails67.mmFXStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmMarketClientSide
 * SettlementDetails67.mmMarketClientSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmNettingEligibility
 * SettlementDetails67.mmNettingEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmRegistration
 * SettlementDetails67.mmRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmRepurchaseType
 * SettlementDetails67.mmRepurchaseType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmLegalRestrictions
 * SettlementDetails67.mmLegalRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmSecuritiesRTGS
 * SettlementDetails67.mmSecuritiesRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmSettlingCapacity
 * SettlementDetails67.mmSettlingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmSettlementSystemMethod
 * SettlementDetails67.mmSettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmTaxCapacity
 * SettlementDetails67.mmTaxCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmStampDutyTaxBasis
 * SettlementDetails67.mmStampDutyTaxBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails67#mmTracking
 * SettlementDetails67.mmTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmAutomaticBorrowing
 * SettlementDetails67.mmAutomaticBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmLetterOfGuarantee
 * SettlementDetails67.mmLetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmReturnLeg
 * SettlementDetails67.mmReturnLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmModificationCancellationAllowed
 * SettlementDetails67.mmModificationCancellationAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmEligibleForCollateral
 * SettlementDetails67.mmEligibleForCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmSecuritiesSubBalanceType
 * SettlementDetails67.mmSecuritiesSubBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmCashSubBalanceType
 * SettlementDetails67.mmCashSubBalanceType}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmSettlementParameters
 * SecuritiesSettlementTransactionGenerationNotificationV05.
 * mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05#mmSettlementParameters
 * SecuritiesSettlementTransactionInstructionV05.mmSettlementParameters}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementDetails67"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails67
 * ConstraintSettlementDetailsRule.forSettlementDetails67}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails67
 * ConstraintCashClearingSystemRule.forSettlementDetails67}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule#forSettlementDetails67
 * ConstraintFXStandingInstructionPresenceRule.forSettlementDetails67}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails67
 * ConstraintSettlementParametersGuideline.forSettlementDetails67}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails93
 * SettlementDetails93}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SettlementDetails42
 * SettlementDetails42}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementDetails67", propOrder = {"holdIndicator", "priority", "securitiesTransactionType", "settlementTransactionCondition", "partialSettlementIndicator", "beneficialOwnership", "blockTrade", "cCPEligibility",
		"deliveryReturnReason", "cashClearingSystem", "exposureType", "fXStandingInstruction", "marketClientSide", "nettingEligibility", "registration", "repurchaseType", "legalRestrictions", "securitiesRTGS", "settlingCapacity",
		"settlementSystemMethod", "taxCapacity", "stampDutyTaxBasis", "tracking", "automaticBorrowing", "letterOfGuarantee", "returnLeg", "modificationCancellationAllowed", "eligibleForCollateral", "securitiesSubBalanceType",
		"cashSubBalanceType"})
public class SettlementDetails67 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HldInd")
	protected HoldIndicator4 holdIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.HoldIndicator4
	 * HoldIndicator4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldIndicator
	 * SecuritiesSettlement.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is on hold/blocked/frozen."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmHoldIndicator
	 * SettlementDetails93.mmHoldIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmHoldIndicator
	 * SettlementDetails42.mmHoldIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<HoldIndicator4>> mmHoldIndicator = new MMMessageAssociationEnd<SettlementDetails67, Optional<HoldIndicator4>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmHoldIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "HldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold/blocked/frozen.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmHoldIndicator);
			previousVersion_lazy = () -> SettlementDetails42.mmHoldIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> HoldIndicator4.mmObject();
		}

		@Override
		public Optional<HoldIndicator4> getValue(SettlementDetails67 obj) {
			return obj.getHoldIndicator();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<HoldIndicator4> value) {
			obj.setHoldIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Prty")
	protected PriorityNumeric1Choice priority;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmPriority
	 * SettlementDetails93.mmPriority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmPriority
	 * SettlementDetails42.mmPriority}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<PriorityNumeric1Choice>> mmPriority = new MMMessageAssociationEnd<SettlementDetails67, Optional<PriorityNumeric1Choice>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmPriority);
			previousVersion_lazy = () -> SettlementDetails42.mmPriority;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriorityNumeric1Choice.mmObject();
		}

		@Override
		public Optional<PriorityNumeric1Choice> getValue(SettlementDetails67 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<PriorityNumeric1Choice> value) {
			obj.setPriority(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesTxTp", required = true)
	protected SecuritiesTransactionType9Choice securitiesTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType9Choice
	 * SecuritiesTransactionType9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
	 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of securities transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmSecuritiesTransactionType
	 * SettlementDetails93.mmSecuritiesTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmSecuritiesTransactionType
	 * SettlementDetails42.mmSecuritiesTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, SecuritiesTransactionType9Choice> mmSecuritiesTransactionType = new MMMessageAssociationEnd<SettlementDetails67, SecuritiesTransactionType9Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Identifies the type of securities transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmSecuritiesTransactionType);
			previousVersion_lazy = () -> SettlementDetails42.mmSecuritiesTransactionType;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionType9Choice.mmObject();
		}

		@Override
		public SecuritiesTransactionType9Choice getValue(SettlementDetails67 obj) {
			return obj.getSecuritiesTransactionType();
		}

		@Override
		public void setValue(SettlementDetails67 obj, SecuritiesTransactionType9Choice value) {
			obj.setSecuritiesTransactionType(value);
		}
	};
	@XmlElement(name = "SttlmTxCond")
	protected List<SettlementTransactionCondition12Choice> settlementTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition12Choice
	 * SettlementTransactionCondition12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
	 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTxCond"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditions under which the order/trade is to be settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmSettlementTransactionCondition
	 * SettlementDetails93.mmSettlementTransactionCondition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmSettlementTransactionCondition
	 * SettlementDetails42.mmSettlementTransactionCondition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, List<SettlementTransactionCondition12Choice>> mmSettlementTransactionCondition = new MMMessageAssociationEnd<SettlementDetails67, List<SettlementTransactionCondition12Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "SttlmTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmSettlementTransactionCondition);
			previousVersion_lazy = () -> SettlementDetails42.mmSettlementTransactionCondition;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementTransactionCondition12Choice.mmObject();
		}

		@Override
		public List<SettlementTransactionCondition12Choice> getValue(SettlementDetails67 obj) {
			return obj.getSettlementTransactionCondition();
		}

		@Override
		public void setValue(SettlementDetails67 obj, List<SettlementTransactionCondition12Choice> value) {
			obj.setSettlementTransactionCondition(value);
		}
	};
	@XmlElement(name = "PrtlSttlmInd")
	protected SettlementTransactionCondition5Code partialSettlementIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlmInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether partial settlement is allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmPartialSettlementIndicator
	 * SettlementDetails93.mmPartialSettlementIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmPartialSettlementIndicator
	 * SettlementDetails42.mmPartialSettlementIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails67, Optional<SettlementTransactionCondition5Code>> mmPartialSettlementIndicator = new MMMessageAttribute<SettlementDetails67, Optional<SettlementTransactionCondition5Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmPartialSettlementIndicator);
			previousVersion_lazy = () -> SettlementDetails42.mmPartialSettlementIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SettlementTransactionCondition5Code.mmObject();
		}

		@Override
		public Optional<SettlementTransactionCondition5Code> getValue(SettlementDetails67 obj) {
			return obj.getPartialSettlementIndicator();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<SettlementTransactionCondition5Code> value) {
			obj.setPartialSettlementIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "BnfclOwnrsh")
	protected BeneficialOwnership1Choice beneficialOwnership;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrsh"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether there is change of beneficial ownership."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmBeneficialOwnership
	 * SettlementDetails93.mmBeneficialOwnership}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmBeneficialOwnership
	 * SettlementDetails42.mmBeneficialOwnership}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<BeneficialOwnership1Choice>> mmBeneficialOwnership = new MMMessageAssociationEnd<SettlementDetails67, Optional<BeneficialOwnership1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmBeneficialOwnershipIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnership";
			definition = "Specifies whether there is change of beneficial ownership.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmBeneficialOwnership);
			previousVersion_lazy = () -> SettlementDetails42.mmBeneficialOwnership;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BeneficialOwnership1Choice.mmObject();
		}

		@Override
		public Optional<BeneficialOwnership1Choice> getValue(SettlementDetails67 obj) {
			return obj.getBeneficialOwnership();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<BeneficialOwnership1Choice> value) {
			obj.setBeneficialOwnership(value.orElse(null));
		}
	};
	@XmlElement(name = "BlckTrad")
	protected BlockTrade1Choice blockTrade;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckTrad"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction is a block parent or child."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmBlockTrade
	 * SettlementDetails93.mmBlockTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmBlockTrade
	 * SettlementDetails42.mmBlockTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<BlockTrade1Choice>> mmBlockTrade = new MMMessageAssociationEnd<SettlementDetails67, Optional<BlockTrade1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmBlockTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "BlckTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockTrade";
			definition = "Specifies whether the settlement instruction is a block parent or child.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmBlockTrade);
			previousVersion_lazy = () -> SettlementDetails42.mmBlockTrade;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BlockTrade1Choice.mmObject();
		}

		@Override
		public Optional<BlockTrade1Choice> getValue(SettlementDetails67 obj) {
			return obj.getBlockTrade();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<BlockTrade1Choice> value) {
			obj.setBlockTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "CCPElgblty")
	protected CentralCounterPartyEligibility1Choice cCPEligibility;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CCPElgblty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmCCPEligibility
	 * SettlementDetails93.mmCCPEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmCCPEligibility
	 * SettlementDetails42.mmCCPEligibility}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<CentralCounterPartyEligibility1Choice>> mmCCPEligibility = new MMMessageAssociationEnd<SettlementDetails67, Optional<CentralCounterPartyEligibility1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmCCPEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "CCPElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPEligibility";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmCCPEligibility);
			previousVersion_lazy = () -> SettlementDetails42.mmCCPEligibility;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CentralCounterPartyEligibility1Choice.mmObject();
		}

		@Override
		public Optional<CentralCounterPartyEligibility1Choice> getValue(SettlementDetails67 obj) {
			return obj.getCCPEligibility();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<CentralCounterPartyEligibility1Choice> value) {
			obj.setCCPEligibility(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryRtrRsn")
	protected DeliveryReturn1Choice deliveryReturnReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn1Choice
	 * DeliveryReturn1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryRtrRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryReturnReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason of a delivery return."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmDeliveryReturnReason
	 * SettlementDetails93.mmDeliveryReturnReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmDeliveryReturnReason
	 * SettlementDetails42.mmDeliveryReturnReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<DeliveryReturn1Choice>> mmDeliveryReturnReason = new MMMessageAssociationEnd<SettlementDetails67, Optional<DeliveryReturn1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "DlvryRtrRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryReturnReason";
			definition = "Specifies the reason of a delivery return.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmDeliveryReturnReason);
			previousVersion_lazy = () -> SettlementDetails42.mmDeliveryReturnReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeliveryReturn1Choice.mmObject();
		}

		@Override
		public Optional<DeliveryReturn1Choice> getValue(SettlementDetails67 obj) {
			return obj.getDeliveryReturnReason();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<DeliveryReturn1Choice> value) {
			obj.setDeliveryReturnReason(value.orElse(null));
		}
	};
	@XmlElement(name = "CshClrSys")
	protected CashSettlementSystem1Choice cashClearingSystem;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshClrSys"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the category of cash clearing system, for example, cheque clearing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmCashClearingSystem
	 * SettlementDetails93.mmCashClearingSystem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmCashClearingSystem
	 * SettlementDetails42.mmCashClearingSystem}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<CashSettlementSystem1Choice>> mmCashClearingSystem = new MMMessageAssociationEnd<SettlementDetails67, Optional<CashSettlementSystem1Choice>>() {
		{
			businessElementTrace_lazy = () -> SettlementInstructionSystemRole.mmSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "CshClrSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystem";
			definition = "Specifies the category of cash clearing system, for example, cheque clearing.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmCashClearingSystem);
			previousVersion_lazy = () -> SettlementDetails42.mmCashClearingSystem;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashSettlementSystem1Choice.mmObject();
		}

		@Override
		public Optional<CashSettlementSystem1Choice> getValue(SettlementDetails67 obj) {
			return obj.getCashClearingSystem();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<CashSettlementSystem1Choice> value) {
			obj.setCashClearingSystem(value.orElse(null));
		}
	};
	@XmlElement(name = "XpsrTp")
	protected ExposureType10Choice exposureType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ExposureType10Choice
	 * ExposureType10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmExposureType
	 * ExposureTerm.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsrTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying business area/type of trade causing the collateral movement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmExposureType
	 * SettlementDetails93.mmExposureType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmExposureType
	 * SettlementDetails42.mmExposureType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<ExposureType10Choice>> mmExposureType = new MMMessageAssociationEnd<SettlementDetails67, Optional<ExposureType10Choice>>() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmExposureType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmExposureType);
			previousVersion_lazy = () -> SettlementDetails42.mmExposureType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExposureType10Choice.mmObject();
		}

		@Override
		public Optional<ExposureType10Choice> getValue(SettlementDetails67 obj) {
			return obj.getExposureType();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<ExposureType10Choice> value) {
			obj.setExposureType(value.orElse(null));
		}
	};
	@XmlElement(name = "FxStgInstr")
	protected FXStandingInstruction1Choice fXStandingInstruction;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxStgInstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the foreign exchange standing instruction in place should apply."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmFXStandingInstruction
	 * SettlementDetails93.mmFXStandingInstruction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmFXStandingInstruction
	 * SettlementDetails42.mmFXStandingInstruction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<FXStandingInstruction1Choice>> mmFXStandingInstruction = new MMMessageAssociationEnd<SettlementDetails67, Optional<FXStandingInstruction1Choice>>() {
		{
			businessElementTrace_lazy = () -> Settlement.mmStandingSettlementInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "FxStgInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstruction";
			definition = "Specifies whether the foreign exchange standing instruction in place should apply.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmFXStandingInstruction);
			previousVersion_lazy = () -> SettlementDetails42.mmFXStandingInstruction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FXStandingInstruction1Choice.mmObject();
		}

		@Override
		public Optional<FXStandingInstruction1Choice> getValue(SettlementDetails67 obj) {
			return obj.getFXStandingInstruction();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<FXStandingInstruction1Choice> value) {
			obj.setFXStandingInstruction(value.orElse(null));
		}
	};
	@XmlElement(name = "MktClntSd")
	protected MarketClientSide1Choice marketClientSide;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktClntSd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClientSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if an instruction is for a market side or a client side transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmMarketClientSide
	 * SettlementDetails93.mmMarketClientSide}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmMarketClientSide
	 * SettlementDetails42.mmMarketClientSide}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<MarketClientSide1Choice>> mmMarketClientSide = new MMMessageAssociationEnd<SettlementDetails67, Optional<MarketClientSide1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmMarketClientSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "MktClntSd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmMarketClientSide);
			previousVersion_lazy = () -> SettlementDetails42.mmMarketClientSide;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketClientSide1Choice.mmObject();
		}

		@Override
		public Optional<MarketClientSide1Choice> getValue(SettlementDetails67 obj) {
			return obj.getMarketClientSide();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<MarketClientSide1Choice> value) {
			obj.setMarketClientSide(value.orElse(null));
		}
	};
	@XmlElement(name = "NetgElgblty")
	protected NettingEligibility1Choice nettingEligibility;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetgElgblty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettingEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is eligible for netting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmNettingEligibility
	 * SettlementDetails93.mmNettingEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmNettingEligibility
	 * SettlementDetails42.mmNettingEligibility}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<NettingEligibility1Choice>> mmNettingEligibility = new MMMessageAssociationEnd<SettlementDetails67, Optional<NettingEligibility1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmNettingEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "NetgElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettingEligibility";
			definition = "Specifies whether the settlement transaction is eligible for netting.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmNettingEligibility);
			previousVersion_lazy = () -> SettlementDetails42.mmNettingEligibility;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NettingEligibility1Choice.mmObject();
		}

		@Override
		public Optional<NettingEligibility1Choice> getValue(SettlementDetails67 obj) {
			return obj.getNettingEligibility();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<NettingEligibility1Choice> value) {
			obj.setNettingEligibility(value.orElse(null));
		}
	};
	@XmlElement(name = "Regn")
	protected Registration1Choice registration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Registration1Choice
	 * Registration1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistration
	 * Security.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Regn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether registration should occur upon receipt."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmRegistration
	 * SettlementDetails93.mmRegistration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmRegistration
	 * SettlementDetails42.mmRegistration}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<Registration1Choice>> mmRegistration = new MMMessageAssociationEnd<SettlementDetails67, Optional<Registration1Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistration;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "Regn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registration";
			definition = "Specifies whether registration should occur upon receipt.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmRegistration);
			previousVersion_lazy = () -> SettlementDetails42.mmRegistration;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Registration1Choice.mmObject();
		}

		@Override
		public Optional<Registration1Choice> getValue(SettlementDetails67 obj) {
			return obj.getRegistration();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<Registration1Choice> value) {
			obj.setRegistration(value.orElse(null));
		}
	};
	@XmlElement(name = "RpTp")
	protected RepurchaseType1Choice repurchaseType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType1Choice
	 * RepurchaseType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseType
	 * SecuritiesFinancing.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RpTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the rate is fixed, variable or a forfeit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmRepurchaseType
	 * SettlementDetails93.mmRepurchaseType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmRepurchaseType
	 * SettlementDetails42.mmRepurchaseType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<RepurchaseType1Choice>> mmRepurchaseType = new MMMessageAssociationEnd<SettlementDetails67, Optional<RepurchaseType1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "RpTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseType";
			definition = "Specifies whether the rate is fixed, variable or a forfeit.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmRepurchaseType);
			previousVersion_lazy = () -> SettlementDetails42.mmRepurchaseType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RepurchaseType1Choice.mmObject();
		}

		@Override
		public Optional<RepurchaseType1Choice> getValue(SettlementDetails67 obj) {
			return obj.getRepurchaseType();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<RepurchaseType1Choice> value) {
			obj.setRepurchaseType(value.orElse(null));
		}
	};
	@XmlElement(name = "LglRstrctns")
	protected Restriction1Choice legalRestrictions;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglRstrctns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory restrictions applicable to a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmLegalRestrictions
	 * SettlementDetails93.mmLegalRestrictions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmLegalRestrictions
	 * SettlementDetails42.mmLegalRestrictions}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<Restriction1Choice>> mmLegalRestrictions = new MMMessageAssociationEnd<SettlementDetails67, Optional<Restriction1Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRestriction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictions";
			definition = "Regulatory restrictions applicable to a security.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmLegalRestrictions);
			previousVersion_lazy = () -> SettlementDetails42.mmLegalRestrictions;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Restriction1Choice.mmObject();
		}

		@Override
		public Optional<Restriction1Choice> getValue(SettlementDetails67 obj) {
			return obj.getLegalRestrictions();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<Restriction1Choice> value) {
			obj.setLegalRestrictions(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesRTGS")
	protected SecuritiesRTGS1Choice securitiesRTGS;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRTGS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmSecuritiesRTGS
	 * SettlementDetails93.mmSecuritiesRTGS}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmSecuritiesRTGS
	 * SettlementDetails42.mmSecuritiesRTGS}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<SecuritiesRTGS1Choice>> mmSecuritiesRTGS = new MMMessageAssociationEnd<SettlementDetails67, Optional<SecuritiesRTGS1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "SctiesRTGS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRTGS";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmSecuritiesRTGS);
			previousVersion_lazy = () -> SettlementDetails42.mmSecuritiesRTGS;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesRTGS1Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesRTGS1Choice> getValue(SettlementDetails67 obj) {
			return obj.getSecuritiesRTGS();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<SecuritiesRTGS1Choice> value) {
			obj.setSecuritiesRTGS(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlgCpcty")
	protected SettlingCapacity4Choice settlingCapacity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlgCpcty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of a party in the settlement of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmSettlingCapacity
	 * SettlementDetails93.mmSettlingCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmSettlingCapacity
	 * SettlementDetails42.mmSettlingCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<SettlingCapacity4Choice>> mmSettlingCapacity = new MMMessageAssociationEnd<SettlementDetails67, Optional<SettlingCapacity4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmSettlingCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "SttlgCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingCapacity";
			definition = "Role of a party in the settlement of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmSettlingCapacity);
			previousVersion_lazy = () -> SettlementDetails42.mmSettlingCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlingCapacity4Choice.mmObject();
		}

		@Override
		public Optional<SettlingCapacity4Choice> getValue(SettlementDetails67 obj) {
			return obj.getSettlingCapacity();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<SettlingCapacity4Choice> value) {
			obj.setSettlingCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmSysMtd")
	protected SettlementSystemMethod1Choice settlementSystemMethod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSysMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmSettlementSystemMethod
	 * SettlementDetails93.mmSettlementSystemMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmSettlementSystemMethod
	 * SettlementDetails42.mmSettlementSystemMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<SettlementSystemMethod1Choice>> mmSettlementSystemMethod = new MMMessageAssociationEnd<SettlementDetails67, Optional<SettlementSystemMethod1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementSystemMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "SttlmSysMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmSettlementSystemMethod);
			previousVersion_lazy = () -> SettlementDetails42.mmSettlementSystemMethod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementSystemMethod1Choice.mmObject();
		}

		@Override
		public Optional<SettlementSystemMethod1Choice> getValue(SettlementDetails67 obj) {
			return obj.getSettlementSystemMethod();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<SettlementSystemMethod1Choice> value) {
			obj.setSettlementSystemMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxCpcty")
	protected TaxCapacityParty1Choice taxCapacity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCpcty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax role capacity of the instructing party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmTaxCapacity
	 * SettlementDetails93.mmTaxCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmTaxCapacity
	 * SettlementDetails42.mmTaxCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<TaxCapacityParty1Choice>> mmTaxCapacity = new MMMessageAssociationEnd<SettlementDetails67, Optional<TaxCapacityParty1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmTaxCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "TaxCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCapacity";
			definition = "Tax role capacity of the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmTaxCapacity);
			previousVersion_lazy = () -> SettlementDetails42.mmTaxCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxCapacityParty1Choice.mmObject();
		}

		@Override
		public Optional<TaxCapacityParty1Choice> getValue(SettlementDetails67 obj) {
			return obj.getTaxCapacity();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<TaxCapacityParty1Choice> value) {
			obj.setTaxCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "StmpDtyTaxBsis")
	protected GenericIdentification20 stampDutyTaxBasis;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDtyTaxBsis"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyTaxBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the stamp duty type or exemption reason applicable to the settlement transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmStampDutyTaxBasis
	 * SettlementDetails93.mmStampDutyTaxBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmStampDutyTaxBasis
	 * SettlementDetails42.mmStampDutyTaxBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<GenericIdentification20>> mmStampDutyTaxBasis = new MMMessageAssociationEnd<SettlementDetails67, Optional<GenericIdentification20>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmStampDutyTaxBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyTaxBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyTaxBasis";
			definition = "Specifies the stamp duty type or exemption reason applicable to the settlement transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmStampDutyTaxBasis);
			previousVersion_lazy = () -> SettlementDetails42.mmStampDutyTaxBasis;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification20.mmObject();
		}

		@Override
		public Optional<GenericIdentification20> getValue(SettlementDetails67 obj) {
			return obj.getStampDutyTaxBasis();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<GenericIdentification20> value) {
			obj.setStampDutyTaxBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "Trckg")
	protected Tracking1Choice tracking;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trckg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the loan and/or collateral is tracked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmTracking
	 * SettlementDetails93.mmTracking}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmTracking
	 * SettlementDetails42.mmTracking}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<Tracking1Choice>> mmTracking = new MMMessageAssociationEnd<SettlementDetails67, Optional<Tracking1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmTracking;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "Trckg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tracking";
			definition = "Specifies whether the loan and/or collateral is tracked.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmTracking);
			previousVersion_lazy = () -> SettlementDetails42.mmTracking;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tracking1Choice.mmObject();
		}

		@Override
		public Optional<Tracking1Choice> getValue(SettlementDetails67 obj) {
			return obj.getTracking();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<Tracking1Choice> value) {
			obj.setTracking(value.orElse(null));
		}
	};
	@XmlElement(name = "AutomtcBrrwg")
	protected AutomaticBorrowing1Choice automaticBorrowing;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AutomtcBrrwg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition for automatic borrowing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmAutomaticBorrowing
	 * SettlementDetails93.mmAutomaticBorrowing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmAutomaticBorrowing
	 * SettlementDetails42.mmAutomaticBorrowing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<AutomaticBorrowing1Choice>> mmAutomaticBorrowing = new MMMessageAssociationEnd<SettlementDetails67, Optional<AutomaticBorrowing1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmAutomaticBorrowing;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "AutomtcBrrwg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticBorrowing";
			definition = "Condition for automatic borrowing.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmAutomaticBorrowing);
			previousVersion_lazy = () -> SettlementDetails42.mmAutomaticBorrowing;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AutomaticBorrowing1Choice.mmObject();
		}

		@Override
		public Optional<AutomaticBorrowing1Choice> getValue(SettlementDetails67 obj) {
			return obj.getAutomaticBorrowing();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<AutomaticBorrowing1Choice> value) {
			obj.setAutomaticBorrowing(value.orElse(null));
		}
	};
	@XmlElement(name = "LttrOfGrnt")
	protected LetterOfGuarantee1Choice letterOfGuarantee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee1Choice
	 * LetterOfGuarantee1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmLetterOfGuarantee
	 * SecuritiesSettlement.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfGrnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmLetterOfGuarantee
	 * SettlementDetails93.mmLetterOfGuarantee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmLetterOfGuarantee
	 * SettlementDetails42.mmLetterOfGuarantee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<LetterOfGuarantee1Choice>> mmLetterOfGuarantee = new MMMessageAssociationEnd<SettlementDetails67, Optional<LetterOfGuarantee1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmLetterOfGuarantee;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "LttrOfGrnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmLetterOfGuarantee);
			previousVersion_lazy = () -> SettlementDetails42.mmLetterOfGuarantee;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LetterOfGuarantee1Choice.mmObject();
		}

		@Override
		public Optional<LetterOfGuarantee1Choice> getValue(SettlementDetails67 obj) {
			return obj.getLetterOfGuarantee();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<LetterOfGuarantee1Choice> value) {
			obj.setLetterOfGuarantee(value.orElse(null));
		}
	};
	@XmlElement(name = "RtrLeg")
	protected YesNoIndicator returnLeg;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmReturnLegInstruction
	 * SecuritiesFinancing.mmReturnLegInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrLeg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmReturnLeg
	 * SettlementDetails93.mmReturnLeg}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmReturnLeg
	 * SettlementDetails42.mmReturnLeg}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails67, Optional<YesNoIndicator>> mmReturnLeg = new MMMessageAttribute<SettlementDetails67, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmReturnLegInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "RtrLeg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnLeg";
			definition = "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmReturnLeg);
			previousVersion_lazy = () -> SettlementDetails42.mmReturnLeg;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SettlementDetails67 obj) {
			return obj.getReturnLeg();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<YesNoIndicator> value) {
			obj.setReturnLeg(value.orElse(null));
		}
	};
	@XmlElement(name = "ModCxlAllwd")
	protected ModificationCancellationAllowed1Choice modificationCancellationAllowed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ModificationCancellationAllowed1Choice
	 * ModificationCancellationAllowed1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModCxlAllwd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationCancellationAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a third party is allowed to modify or cancel the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmModificationCancellationAllowed
	 * SettlementDetails93.mmModificationCancellationAllowed}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmModificationCancellationAllowed
	 * SettlementDetails42.mmModificationCancellationAllowed}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<ModificationCancellationAllowed1Choice>> mmModificationCancellationAllowed = new MMMessageAssociationEnd<SettlementDetails67, Optional<ModificationCancellationAllowed1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "ModCxlAllwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationCancellationAllowed";
			definition = "Specifies whether a third party is allowed to modify or cancel the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmModificationCancellationAllowed);
			previousVersion_lazy = () -> SettlementDetails42.mmModificationCancellationAllowed;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ModificationCancellationAllowed1Choice.mmObject();
		}

		@Override
		public Optional<ModificationCancellationAllowed1Choice> getValue(SettlementDetails67 obj) {
			return obj.getModificationCancellationAllowed();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<ModificationCancellationAllowed1Choice> value) {
			obj.setModificationCancellationAllowed(value.orElse(null));
		}
	};
	@XmlElement(name = "ElgblForColl")
	protected YesNoIndicator eligibleForCollateral;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblForColl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether securities should be included in the pool of securities eligible for collateral purposes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmEligibleForCollateral
	 * SettlementDetails93.mmEligibleForCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmEligibleForCollateral
	 * SettlementDetails42.mmEligibleForCollateral}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails67, Optional<YesNoIndicator>> mmEligibleForCollateral = new MMMessageAttribute<SettlementDetails67, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmEligibleForCollateral;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "ElgblForColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities should be included in the pool of securities eligible for collateral purposes.";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmEligibleForCollateral);
			previousVersion_lazy = () -> SettlementDetails42.mmEligibleForCollateral;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SettlementDetails67 obj) {
			return obj.getEligibleForCollateral();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<YesNoIndicator> value) {
			obj.setEligibleForCollateral(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesSubBalTp")
	protected GenericIdentification20 securitiesSubBalanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSubBalTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities sub balance type indicator (example restriction type for a market infrastructure)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmSecuritiesSubBalanceType
	 * SettlementDetails93.mmSecuritiesSubBalanceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmSecuritiesSubBalanceType
	 * SettlementDetails42.mmSecuritiesSubBalanceType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<GenericIdentification20>> mmSecuritiesSubBalanceType = new MMMessageAssociationEnd<SettlementDetails67, Optional<GenericIdentification20>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "SctiesSubBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSubBalanceType";
			definition = "Specifies the securities sub balance type indicator (example restriction type for a market infrastructure).";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmSecuritiesSubBalanceType);
			previousVersion_lazy = () -> SettlementDetails42.mmSecuritiesSubBalanceType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification20.mmObject();
		}

		@Override
		public Optional<GenericIdentification20> getValue(SettlementDetails67 obj) {
			return obj.getSecuritiesSubBalanceType();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<GenericIdentification20> value) {
			obj.setSecuritiesSubBalanceType(value.orElse(null));
		}
	};
	@XmlElement(name = "CshSubBalTp")
	protected GenericIdentification20 cashSubBalanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSubBalTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash sub balance type indicator (example restriction type for a market infrastructure)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmCashSubBalanceType
	 * SettlementDetails93.mmCashSubBalanceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmCashSubBalanceType
	 * SettlementDetails42.mmCashSubBalanceType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails67, Optional<GenericIdentification20>> mmCashSubBalanceType = new MMMessageAssociationEnd<SettlementDetails67, Optional<GenericIdentification20>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails67.mmObject();
			isDerived = false;
			xmlTag = "CshSubBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSubBalanceType";
			definition = "Specifies the cash sub balance type indicator (example restriction type for a market infrastructure).";
			nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmCashSubBalanceType);
			previousVersion_lazy = () -> SettlementDetails42.mmCashSubBalanceType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification20.mmObject();
		}

		@Override
		public Optional<GenericIdentification20> getValue(SettlementDetails67 obj) {
			return obj.getCashSubBalanceType();
		}

		@Override
		public void setValue(SettlementDetails67 obj, Optional<GenericIdentification20> value) {
			obj.setCashSubBalanceType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails67.mmHoldIndicator, com.tools20022.repository.msg.SettlementDetails67.mmPriority,
						com.tools20022.repository.msg.SettlementDetails67.mmSecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails67.mmSettlementTransactionCondition,
						com.tools20022.repository.msg.SettlementDetails67.mmPartialSettlementIndicator, com.tools20022.repository.msg.SettlementDetails67.mmBeneficialOwnership,
						com.tools20022.repository.msg.SettlementDetails67.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails67.mmCCPEligibility, com.tools20022.repository.msg.SettlementDetails67.mmDeliveryReturnReason,
						com.tools20022.repository.msg.SettlementDetails67.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails67.mmExposureType, com.tools20022.repository.msg.SettlementDetails67.mmFXStandingInstruction,
						com.tools20022.repository.msg.SettlementDetails67.mmMarketClientSide, com.tools20022.repository.msg.SettlementDetails67.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails67.mmRegistration,
						com.tools20022.repository.msg.SettlementDetails67.mmRepurchaseType, com.tools20022.repository.msg.SettlementDetails67.mmLegalRestrictions, com.tools20022.repository.msg.SettlementDetails67.mmSecuritiesRTGS,
						com.tools20022.repository.msg.SettlementDetails67.mmSettlingCapacity, com.tools20022.repository.msg.SettlementDetails67.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails67.mmTaxCapacity,
						com.tools20022.repository.msg.SettlementDetails67.mmStampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails67.mmTracking, com.tools20022.repository.msg.SettlementDetails67.mmAutomaticBorrowing,
						com.tools20022.repository.msg.SettlementDetails67.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails67.mmReturnLeg,
						com.tools20022.repository.msg.SettlementDetails67.mmModificationCancellationAllowed, com.tools20022.repository.msg.SettlementDetails67.mmEligibleForCollateral,
						com.tools20022.repository.msg.SettlementDetails67.mmSecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails67.mmCashSubBalanceType);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV05.mmSettlementParameters, SecuritiesSettlementTransactionInstructionV05.mmSettlementParameters);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails67,
						com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails67, com.tools20022.repository.constraints.ConstraintFXStandingInstructionPresenceRule.forSettlementDetails67,
						com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails67);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDetails67";
				definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
				nextVersions_lazy = () -> Arrays.asList(SettlementDetails93.mmObject());
				previousVersion_lazy = () -> SettlementDetails42.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<HoldIndicator4> getHoldIndicator() {
		return holdIndicator == null ? Optional.empty() : Optional.of(holdIndicator);
	}

	public SettlementDetails67 setHoldIndicator(HoldIndicator4 holdIndicator) {
		this.holdIndicator = holdIndicator;
		return this;
	}

	public Optional<PriorityNumeric1Choice> getPriority() {
		return priority == null ? Optional.empty() : Optional.of(priority);
	}

	public SettlementDetails67 setPriority(PriorityNumeric1Choice priority) {
		this.priority = priority;
		return this;
	}

	public SecuritiesTransactionType9Choice getSecuritiesTransactionType() {
		return securitiesTransactionType;
	}

	public SettlementDetails67 setSecuritiesTransactionType(SecuritiesTransactionType9Choice securitiesTransactionType) {
		this.securitiesTransactionType = Objects.requireNonNull(securitiesTransactionType);
		return this;
	}

	public List<SettlementTransactionCondition12Choice> getSettlementTransactionCondition() {
		return settlementTransactionCondition == null ? settlementTransactionCondition = new ArrayList<>() : settlementTransactionCondition;
	}

	public SettlementDetails67 setSettlementTransactionCondition(List<SettlementTransactionCondition12Choice> settlementTransactionCondition) {
		this.settlementTransactionCondition = Objects.requireNonNull(settlementTransactionCondition);
		return this;
	}

	public Optional<SettlementTransactionCondition5Code> getPartialSettlementIndicator() {
		return partialSettlementIndicator == null ? Optional.empty() : Optional.of(partialSettlementIndicator);
	}

	public SettlementDetails67 setPartialSettlementIndicator(SettlementTransactionCondition5Code partialSettlementIndicator) {
		this.partialSettlementIndicator = partialSettlementIndicator;
		return this;
	}

	public Optional<BeneficialOwnership1Choice> getBeneficialOwnership() {
		return beneficialOwnership == null ? Optional.empty() : Optional.of(beneficialOwnership);
	}

	public SettlementDetails67 setBeneficialOwnership(BeneficialOwnership1Choice beneficialOwnership) {
		this.beneficialOwnership = beneficialOwnership;
		return this;
	}

	public Optional<BlockTrade1Choice> getBlockTrade() {
		return blockTrade == null ? Optional.empty() : Optional.of(blockTrade);
	}

	public SettlementDetails67 setBlockTrade(BlockTrade1Choice blockTrade) {
		this.blockTrade = blockTrade;
		return this;
	}

	public Optional<CentralCounterPartyEligibility1Choice> getCCPEligibility() {
		return cCPEligibility == null ? Optional.empty() : Optional.of(cCPEligibility);
	}

	public SettlementDetails67 setCCPEligibility(CentralCounterPartyEligibility1Choice cCPEligibility) {
		this.cCPEligibility = cCPEligibility;
		return this;
	}

	public Optional<DeliveryReturn1Choice> getDeliveryReturnReason() {
		return deliveryReturnReason == null ? Optional.empty() : Optional.of(deliveryReturnReason);
	}

	public SettlementDetails67 setDeliveryReturnReason(DeliveryReturn1Choice deliveryReturnReason) {
		this.deliveryReturnReason = deliveryReturnReason;
		return this;
	}

	public Optional<CashSettlementSystem1Choice> getCashClearingSystem() {
		return cashClearingSystem == null ? Optional.empty() : Optional.of(cashClearingSystem);
	}

	public SettlementDetails67 setCashClearingSystem(CashSettlementSystem1Choice cashClearingSystem) {
		this.cashClearingSystem = cashClearingSystem;
		return this;
	}

	public Optional<ExposureType10Choice> getExposureType() {
		return exposureType == null ? Optional.empty() : Optional.of(exposureType);
	}

	public SettlementDetails67 setExposureType(ExposureType10Choice exposureType) {
		this.exposureType = exposureType;
		return this;
	}

	public Optional<FXStandingInstruction1Choice> getFXStandingInstruction() {
		return fXStandingInstruction == null ? Optional.empty() : Optional.of(fXStandingInstruction);
	}

	public SettlementDetails67 setFXStandingInstruction(FXStandingInstruction1Choice fXStandingInstruction) {
		this.fXStandingInstruction = fXStandingInstruction;
		return this;
	}

	public Optional<MarketClientSide1Choice> getMarketClientSide() {
		return marketClientSide == null ? Optional.empty() : Optional.of(marketClientSide);
	}

	public SettlementDetails67 setMarketClientSide(MarketClientSide1Choice marketClientSide) {
		this.marketClientSide = marketClientSide;
		return this;
	}

	public Optional<NettingEligibility1Choice> getNettingEligibility() {
		return nettingEligibility == null ? Optional.empty() : Optional.of(nettingEligibility);
	}

	public SettlementDetails67 setNettingEligibility(NettingEligibility1Choice nettingEligibility) {
		this.nettingEligibility = nettingEligibility;
		return this;
	}

	public Optional<Registration1Choice> getRegistration() {
		return registration == null ? Optional.empty() : Optional.of(registration);
	}

	public SettlementDetails67 setRegistration(Registration1Choice registration) {
		this.registration = registration;
		return this;
	}

	public Optional<RepurchaseType1Choice> getRepurchaseType() {
		return repurchaseType == null ? Optional.empty() : Optional.of(repurchaseType);
	}

	public SettlementDetails67 setRepurchaseType(RepurchaseType1Choice repurchaseType) {
		this.repurchaseType = repurchaseType;
		return this;
	}

	public Optional<Restriction1Choice> getLegalRestrictions() {
		return legalRestrictions == null ? Optional.empty() : Optional.of(legalRestrictions);
	}

	public SettlementDetails67 setLegalRestrictions(Restriction1Choice legalRestrictions) {
		this.legalRestrictions = legalRestrictions;
		return this;
	}

	public Optional<SecuritiesRTGS1Choice> getSecuritiesRTGS() {
		return securitiesRTGS == null ? Optional.empty() : Optional.of(securitiesRTGS);
	}

	public SettlementDetails67 setSecuritiesRTGS(SecuritiesRTGS1Choice securitiesRTGS) {
		this.securitiesRTGS = securitiesRTGS;
		return this;
	}

	public Optional<SettlingCapacity4Choice> getSettlingCapacity() {
		return settlingCapacity == null ? Optional.empty() : Optional.of(settlingCapacity);
	}

	public SettlementDetails67 setSettlingCapacity(SettlingCapacity4Choice settlingCapacity) {
		this.settlingCapacity = settlingCapacity;
		return this;
	}

	public Optional<SettlementSystemMethod1Choice> getSettlementSystemMethod() {
		return settlementSystemMethod == null ? Optional.empty() : Optional.of(settlementSystemMethod);
	}

	public SettlementDetails67 setSettlementSystemMethod(SettlementSystemMethod1Choice settlementSystemMethod) {
		this.settlementSystemMethod = settlementSystemMethod;
		return this;
	}

	public Optional<TaxCapacityParty1Choice> getTaxCapacity() {
		return taxCapacity == null ? Optional.empty() : Optional.of(taxCapacity);
	}

	public SettlementDetails67 setTaxCapacity(TaxCapacityParty1Choice taxCapacity) {
		this.taxCapacity = taxCapacity;
		return this;
	}

	public Optional<GenericIdentification20> getStampDutyTaxBasis() {
		return stampDutyTaxBasis == null ? Optional.empty() : Optional.of(stampDutyTaxBasis);
	}

	public SettlementDetails67 setStampDutyTaxBasis(GenericIdentification20 stampDutyTaxBasis) {
		this.stampDutyTaxBasis = stampDutyTaxBasis;
		return this;
	}

	public Optional<Tracking1Choice> getTracking() {
		return tracking == null ? Optional.empty() : Optional.of(tracking);
	}

	public SettlementDetails67 setTracking(Tracking1Choice tracking) {
		this.tracking = tracking;
		return this;
	}

	public Optional<AutomaticBorrowing1Choice> getAutomaticBorrowing() {
		return automaticBorrowing == null ? Optional.empty() : Optional.of(automaticBorrowing);
	}

	public SettlementDetails67 setAutomaticBorrowing(AutomaticBorrowing1Choice automaticBorrowing) {
		this.automaticBorrowing = automaticBorrowing;
		return this;
	}

	public Optional<LetterOfGuarantee1Choice> getLetterOfGuarantee() {
		return letterOfGuarantee == null ? Optional.empty() : Optional.of(letterOfGuarantee);
	}

	public SettlementDetails67 setLetterOfGuarantee(LetterOfGuarantee1Choice letterOfGuarantee) {
		this.letterOfGuarantee = letterOfGuarantee;
		return this;
	}

	public Optional<YesNoIndicator> getReturnLeg() {
		return returnLeg == null ? Optional.empty() : Optional.of(returnLeg);
	}

	public SettlementDetails67 setReturnLeg(YesNoIndicator returnLeg) {
		this.returnLeg = returnLeg;
		return this;
	}

	public Optional<ModificationCancellationAllowed1Choice> getModificationCancellationAllowed() {
		return modificationCancellationAllowed == null ? Optional.empty() : Optional.of(modificationCancellationAllowed);
	}

	public SettlementDetails67 setModificationCancellationAllowed(ModificationCancellationAllowed1Choice modificationCancellationAllowed) {
		this.modificationCancellationAllowed = modificationCancellationAllowed;
		return this;
	}

	public Optional<YesNoIndicator> getEligibleForCollateral() {
		return eligibleForCollateral == null ? Optional.empty() : Optional.of(eligibleForCollateral);
	}

	public SettlementDetails67 setEligibleForCollateral(YesNoIndicator eligibleForCollateral) {
		this.eligibleForCollateral = eligibleForCollateral;
		return this;
	}

	public Optional<GenericIdentification20> getSecuritiesSubBalanceType() {
		return securitiesSubBalanceType == null ? Optional.empty() : Optional.of(securitiesSubBalanceType);
	}

	public SettlementDetails67 setSecuritiesSubBalanceType(GenericIdentification20 securitiesSubBalanceType) {
		this.securitiesSubBalanceType = securitiesSubBalanceType;
		return this;
	}

	public Optional<GenericIdentification20> getCashSubBalanceType() {
		return cashSubBalanceType == null ? Optional.empty() : Optional.of(cashSubBalanceType);
	}

	public SettlementDetails67 setCashSubBalanceType(GenericIdentification20 cashSubBalanceType) {
		this.cashSubBalanceType = cashSubBalanceType;
		return this;
	}
}
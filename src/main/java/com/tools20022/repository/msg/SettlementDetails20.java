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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification25;
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
 * <li>{@linkplain com.tools20022.repository.msg.SettlementDetails20#mmPriority
 * SettlementDetails20.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmSecuritiesTransactionType
 * SettlementDetails20.mmSecuritiesTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmSettlementTransactionCondition
 * SettlementDetails20.mmSettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmPartialSettlementIndicator
 * SettlementDetails20.mmPartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmBeneficialOwnership
 * SettlementDetails20.mmBeneficialOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmBlockTrade
 * SettlementDetails20.mmBlockTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmCCPEligibility
 * SettlementDetails20.mmCCPEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmCashClearingSystem
 * SettlementDetails20.mmCashClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmExposureType
 * SettlementDetails20.mmExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmMarketClientSide
 * SettlementDetails20.mmMarketClientSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmNettingEligibility
 * SettlementDetails20.mmNettingEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmRegistration
 * SettlementDetails20.mmRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmRepurchaseType
 * SettlementDetails20.mmRepurchaseType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmLegalRestrictions
 * SettlementDetails20.mmLegalRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmSecuritiesRTGS
 * SettlementDetails20.mmSecuritiesRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmSettlingCapacity
 * SettlementDetails20.mmSettlingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmSettlementSystemMethod
 * SettlementDetails20.mmSettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmTaxCapacity
 * SettlementDetails20.mmTaxCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmStampDutyTaxBasis
 * SettlementDetails20.mmStampDutyTaxBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmAutomaticBorrowing
 * SettlementDetails20.mmAutomaticBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmLetterOfGuarantee
 * SettlementDetails20.mmLetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmEligibleForCollateral
 * SettlementDetails20.mmEligibleForCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsRule#forSettlementDetails20
 * ConstraintSettlementDetailsRule.forSettlementDetails20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCashClearingSystemRule#forSettlementDetails20
 * ConstraintCashClearingSystemRule.forSettlementDetails20}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementDetails20"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementDetails20", propOrder = {"priority", "securitiesTransactionType", "settlementTransactionCondition", "partialSettlementIndicator", "beneficialOwnership", "blockTrade", "cCPEligibility", "cashClearingSystem",
		"exposureType", "marketClientSide", "nettingEligibility", "registration", "repurchaseType", "legalRestrictions", "securitiesRTGS", "settlingCapacity", "settlementSystemMethod", "taxCapacity", "stampDutyTaxBasis",
		"automaticBorrowing", "letterOfGuarantee", "eligibleForCollateral"})
public class SettlementDetails20 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Prty")
	protected PriorityNumeric2Choice priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric2Choice
	 * PriorityNumeric2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmPriority
	 * Obligation.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction was executed with a high priority."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<PriorityNumeric2Choice>> mmPriority = new MMMessageAssociationEnd<SettlementDetails20, Optional<PriorityNumeric2Choice>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction was executed with a high priority.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriorityNumeric2Choice.mmObject();
		}

		@Override
		public Optional<PriorityNumeric2Choice> getValue(SettlementDetails20 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<PriorityNumeric2Choice> value) {
			obj.setPriority(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesTxTp", required = true)
	protected SecuritiesTransactionType6Choice securitiesTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType6Choice
	 * SecuritiesTransactionType6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
	 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of securities transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, SecuritiesTransactionType6Choice> mmSecuritiesTransactionType = new MMMessageAssociationEnd<SettlementDetails20, SecuritiesTransactionType6Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Identifies the type of securities transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionType6Choice.mmObject();
		}

		@Override
		public SecuritiesTransactionType6Choice getValue(SettlementDetails20 obj) {
			return obj.getSecuritiesTransactionType();
		}

		@Override
		public void setValue(SettlementDetails20 obj, SecuritiesTransactionType6Choice value) {
			obj.setSecuritiesTransactionType(value);
		}
	};
	@XmlElement(name = "SttlmTxCond")
	protected List<SettlementTransactionCondition3Choice> settlementTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition3Choice
	 * SettlementTransactionCondition3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
	 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTxCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditions under which the order/trade was to be settled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, List<SettlementTransactionCondition3Choice>> mmSettlementTransactionCondition = new MMMessageAssociationEnd<SettlementDetails20, List<SettlementTransactionCondition3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "SttlmTxCond";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade was to be settled.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementTransactionCondition3Choice.mmObject();
		}

		@Override
		public List<SettlementTransactionCondition3Choice> getValue(SettlementDetails20 obj) {
			return obj.getSettlementTransactionCondition();
		}

		@Override
		public void setValue(SettlementDetails20 obj, List<SettlementTransactionCondition3Choice> value) {
			obj.setSettlementTransactionCondition(value);
		}
	};
	@XmlElement(name = "PrtlSttlmInd")
	protected YesNoIndicator partialSettlementIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartialSettlementIndicator
	 * SecuritiesSettlement.mmPartialSettlementIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STCO//NPAR or PART</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether partial settlement was allowed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails20, Optional<YesNoIndicator>> mmPartialSettlementIndicator = new MMMessageAttribute<SettlementDetails20, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartialSettlementIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STCO//NPAR or PART"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement was allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SettlementDetails20 obj) {
			return obj.getPartialSettlementIndicator();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<YesNoIndicator> value) {
			obj.setPartialSettlementIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "BnfclOwnrsh")
	protected BeneficialOwnership2Choice beneficialOwnership;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership2Choice
	 * BeneficialOwnership2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBeneficialOwnershipIndicator
	 * SecuritiesSettlement.mmBeneficialOwnershipIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::BENE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether there was change of beneficial ownership."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<BeneficialOwnership2Choice>> mmBeneficialOwnership = new MMMessageAssociationEnd<SettlementDetails20, Optional<BeneficialOwnership2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmBeneficialOwnershipIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrsh";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::BENE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnership";
			definition = "Specifies whether there was change of beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BeneficialOwnership2Choice.mmObject();
		}

		@Override
		public Optional<BeneficialOwnership2Choice> getValue(SettlementDetails20 obj) {
			return obj.getBeneficialOwnership();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<BeneficialOwnership2Choice> value) {
			obj.setBeneficialOwnership(value.orElse(null));
		}
	};
	@XmlElement(name = "BlckTrad")
	protected BlockTrade2Choice blockTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.BlockTrade2Choice
	 * BlockTrade2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBlockTrade
	 * SecuritiesSettlement.mmBlockTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::BLOC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction was a block parent or child."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<BlockTrade2Choice>> mmBlockTrade = new MMMessageAssociationEnd<SettlementDetails20, Optional<BlockTrade2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmBlockTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "BlckTrad";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::BLOC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockTrade";
			definition = "Specifies whether the settlement instruction was a block parent or child.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BlockTrade2Choice.mmObject();
		}

		@Override
		public Optional<BlockTrade2Choice> getValue(SettlementDetails20 obj) {
			return obj.getBlockTrade();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<BlockTrade2Choice> value) {
			obj.setBlockTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "CCPElgblty")
	protected CentralCounterPartyEligibility2Choice cCPEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility2Choice
	 * CentralCounterPartyEligibility2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmCCPEligibility
	 * SecuritiesDeliveryObligation.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CCPElgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CCPT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction was CCP (Central Counterparty) eligible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<CentralCounterPartyEligibility2Choice>> mmCCPEligibility = new MMMessageAssociationEnd<SettlementDetails20, Optional<CentralCounterPartyEligibility2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmCCPEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "CCPElgblty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CCPT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPEligibility";
			definition = "Specifies whether the settlement transaction was CCP (Central Counterparty) eligible.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CentralCounterPartyEligibility2Choice.mmObject();
		}

		@Override
		public Optional<CentralCounterPartyEligibility2Choice> getValue(SettlementDetails20 obj) {
			return obj.getCCPEligibility();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<CentralCounterPartyEligibility2Choice> value) {
			obj.setCCPEligibility(value.orElse(null));
		}
	};
	@XmlElement(name = "CshClrSys")
	protected CashSettlementSystem2Choice cashClearingSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem2Choice
	 * CashSettlementSystem2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole#mmSystem
	 * SettlementInstructionSystemRole.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshClrSys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CASY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the category of cash clearing system, eg, cheque clearing."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<CashSettlementSystem2Choice>> mmCashClearingSystem = new MMMessageAssociationEnd<SettlementDetails20, Optional<CashSettlementSystem2Choice>>() {
		{
			businessElementTrace_lazy = () -> SettlementInstructionSystemRole.mmSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "CshClrSys";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CASY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystem";
			definition = "Specifies the category of cash clearing system, eg, cheque clearing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashSettlementSystem2Choice.mmObject();
		}

		@Override
		public Optional<CashSettlementSystem2Choice> getValue(SettlementDetails20 obj) {
			return obj.getCashClearingSystem();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<CashSettlementSystem2Choice> value) {
			obj.setCashClearingSystem(value.orElse(null));
		}
	};
	@XmlElement(name = "XpsrTp")
	protected ExposureType2Choice exposureType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ExposureType2Choice
	 * ExposureType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmExposureType
	 * ExposureTerm.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::COLA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying business area/type of trade having caused the collateral movement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<ExposureType2Choice>> mmExposureType = new MMMessageAssociationEnd<SettlementDetails20, Optional<ExposureType2Choice>>() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmExposureType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "XpsrTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::COLA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade having caused the collateral movement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExposureType2Choice.mmObject();
		}

		@Override
		public Optional<ExposureType2Choice> getValue(SettlementDetails20 obj) {
			return obj.getExposureType();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<ExposureType2Choice> value) {
			obj.setExposureType(value.orElse(null));
		}
	};
	@XmlElement(name = "MktClntSd")
	protected MarketClientSide2Choice marketClientSide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide2Choice
	 * MarketClientSide2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmMarketClientSide
	 * SecuritiesSettlement.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktClntSd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::MACL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClientSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if an instruction was for a market side or a client side transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<MarketClientSide2Choice>> mmMarketClientSide = new MMMessageAssociationEnd<SettlementDetails20, Optional<MarketClientSide2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmMarketClientSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "MktClntSd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::MACL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction was for a market side or a client side transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketClientSide2Choice.mmObject();
		}

		@Override
		public Optional<MarketClientSide2Choice> getValue(SettlementDetails20 obj) {
			return obj.getMarketClientSide();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<MarketClientSide2Choice> value) {
			obj.setMarketClientSide(value.orElse(null));
		}
	};
	@XmlElement(name = "NetgElgblty")
	protected NettingEligibility2Choice nettingEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility2Choice
	 * NettingEligibility2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmNettingEligibility
	 * SecuritiesDeliveryObligation.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetgElgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::NETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettingEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction was eligible for netting."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<NettingEligibility2Choice>> mmNettingEligibility = new MMMessageAssociationEnd<SettlementDetails20, Optional<NettingEligibility2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmNettingEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "NetgElgblty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::NETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettingEligibility";
			definition = "Specifies whether the settlement transaction was eligible for netting.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NettingEligibility2Choice.mmObject();
		}

		@Override
		public Optional<NettingEligibility2Choice> getValue(SettlementDetails20 obj) {
			return obj.getNettingEligibility();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<NettingEligibility2Choice> value) {
			obj.setNettingEligibility(value.orElse(null));
		}
	};
	@XmlElement(name = "Regn")
	protected Registration2Choice registration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Registration2Choice
	 * Registration2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistration
	 * Security.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Regn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::REGT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether registration was to occur upon receipt."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<Registration2Choice>> mmRegistration = new MMMessageAssociationEnd<SettlementDetails20, Optional<Registration2Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistration;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "Regn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::REGT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registration";
			definition = "Specifies whether registration was to occur upon receipt.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Registration2Choice.mmObject();
		}

		@Override
		public Optional<Registration2Choice> getValue(SettlementDetails20 obj) {
			return obj.getRegistration();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<Registration2Choice> value) {
			obj.setRegistration(value.orElse(null));
		}
	};
	@XmlElement(name = "RpTp")
	protected RepurchaseType6Choice repurchaseType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepurchaseType6Choice
	 * RepurchaseType6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseType
	 * SecuritiesFinancing.mmRepurchaseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RpTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::REPT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of repurchase transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<RepurchaseType6Choice>> mmRepurchaseType = new MMMessageAssociationEnd<SettlementDetails20, Optional<RepurchaseType6Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "RpTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::REPT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseType";
			definition = "Specifies the type of repurchase transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RepurchaseType6Choice.mmObject();
		}

		@Override
		public Optional<RepurchaseType6Choice> getValue(SettlementDetails20 obj) {
			return obj.getRepurchaseType();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<RepurchaseType6Choice> value) {
			obj.setRepurchaseType(value.orElse(null));
		}
	};
	@XmlElement(name = "LglRstrctns")
	protected Restriction2Choice legalRestrictions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Restriction2Choice
	 * Restriction2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRestriction
	 * Security.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglRstrctns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::REST</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory restrictions applicable to a security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<Restriction2Choice>> mmLegalRestrictions = new MMMessageAssociationEnd<SettlementDetails20, Optional<Restriction2Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRestriction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctns";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::REST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictions";
			definition = "Regulatory restrictions applicable to a security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Restriction2Choice.mmObject();
		}

		@Override
		public Optional<Restriction2Choice> getValue(SettlementDetails20 obj) {
			return obj.getLegalRestrictions();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<Restriction2Choice> value) {
			obj.setLegalRestrictions(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesRTGS")
	protected SecuritiesRTGS2Choice securitiesRTGS;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS2Choice
	 * SecuritiesRTGS2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesRealTimeGrossSettlement
	 * SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RTGS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction was to be settled through an RTGS or a non RTGS system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<SecuritiesRTGS2Choice>> mmSecuritiesRTGS = new MMMessageAssociationEnd<SettlementDetails20, Optional<SecuritiesRTGS2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "SctiesRTGS";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RTGS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRTGS";
			definition = "Specifies whether the settlement transaction was to be settled through an RTGS or a non RTGS system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesRTGS2Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesRTGS2Choice> getValue(SettlementDetails20 obj) {
			return obj.getSecuritiesRTGS();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<SecuritiesRTGS2Choice> value) {
			obj.setSecuritiesRTGS(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlgCpcty")
	protected SettlingCapacity2Choice settlingCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlingCapacity2Choice
	 * SettlingCapacity2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSettlingCapacity
	 * SecuritiesSettlementPartyRole.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlgCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRCA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of a party in the settlement of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<SettlingCapacity2Choice>> mmSettlingCapacity = new MMMessageAssociationEnd<SettlementDetails20, Optional<SettlingCapacity2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmSettlingCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "SttlgCpcty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRCA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingCapacity";
			definition = "Role of a party in the settlement of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlingCapacity2Choice.mmObject();
		}

		@Override
		public Optional<SettlingCapacity2Choice> getValue(SettlementDetails20 obj) {
			return obj.getSettlingCapacity();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<SettlingCapacity2Choice> value) {
			obj.setSettlingCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmSysMtd")
	protected SettlementSystemMethod2Choice settlementSystemMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementSystemMethod2Choice
	 * SettlementSystemMethod2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementSystemMethod
	 * SecuritiesSettlement.mmSettlementSystemMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSysMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction was to be settled through the default or the alternate settlement system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<SettlementSystemMethod2Choice>> mmSettlementSystemMethod = new MMMessageAssociationEnd<SettlementDetails20, Optional<SettlementSystemMethod2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementSystemMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "SttlmSysMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Specifies whether the settlement instruction was to be settled through the default or the alternate settlement system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementSystemMethod2Choice.mmObject();
		}

		@Override
		public Optional<SettlementSystemMethod2Choice> getValue(SettlementDetails20 obj) {
			return obj.getSettlementSystemMethod();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<SettlementSystemMethod2Choice> value) {
			obj.setSettlementSystemMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxCpcty")
	protected TaxCapacityParty2Choice taxCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty2Choice
	 * TaxCapacityParty2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmTaxCapacity
	 * SecuritiesSettlementPartyRole.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TCPI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax role capacity of the instructing party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<TaxCapacityParty2Choice>> mmTaxCapacity = new MMMessageAssociationEnd<SettlementDetails20, Optional<TaxCapacityParty2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmTaxCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "TaxCpcty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TCPI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCapacity";
			definition = "Tax role capacity of the instructing party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxCapacityParty2Choice.mmObject();
		}

		@Override
		public Optional<TaxCapacityParty2Choice> getValue(SettlementDetails20 obj) {
			return obj.getTaxCapacity();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<TaxCapacityParty2Choice> value) {
			obj.setTaxCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "StmpDtyTaxBsis")
	protected GenericIdentification25 stampDutyTaxBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification25
	 * GenericIdentification25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyTaxBasis
	 * SecuritiesTax.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDtyTaxBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STAM</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<GenericIdentification25>> mmStampDutyTaxBasis = new MMMessageAssociationEnd<SettlementDetails20, Optional<GenericIdentification25>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmStampDutyTaxBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyTaxBsis";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STAM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyTaxBasis";
			definition = "Specifies the stamp duty type or exemption reason applicable to the settlement transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification25.mmObject();
		}

		@Override
		public Optional<GenericIdentification25> getValue(SettlementDetails20 obj) {
			return obj.getStampDutyTaxBasis();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<GenericIdentification25> value) {
			obj.setStampDutyTaxBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "AutomtcBrrwg")
	protected AutomaticBorrowing4Choice automaticBorrowing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing4Choice
	 * AutomaticBorrowing4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAutomaticBorrowing
	 * SecuritiesSettlement.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AutomtcBrrwg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::BORR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition for automatic borrowing."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<AutomaticBorrowing4Choice>> mmAutomaticBorrowing = new MMMessageAssociationEnd<SettlementDetails20, Optional<AutomaticBorrowing4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmAutomaticBorrowing;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "AutomtcBrrwg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::BORR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticBorrowing";
			definition = "Condition for automatic borrowing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AutomaticBorrowing4Choice.mmObject();
		}

		@Override
		public Optional<AutomaticBorrowing4Choice> getValue(SettlementDetails20 obj) {
			return obj.getAutomaticBorrowing();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<AutomaticBorrowing4Choice> value) {
			obj.setAutomaticBorrowing(value.orElse(null));
		}
	};
	@XmlElement(name = "LttrOfGrnt")
	protected LetterOfGuarantee2Choice letterOfGuarantee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee2Choice
	 * LetterOfGuarantee2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmLetterOfGuarantee
	 * SecuritiesSettlement.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfGrnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LEOG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether physical settlement was executed using a letter of guarantee or if the physical certificates were used."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementDetails20, Optional<LetterOfGuarantee2Choice>> mmLetterOfGuarantee = new MMMessageAssociationEnd<SettlementDetails20, Optional<LetterOfGuarantee2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmLetterOfGuarantee;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "LttrOfGrnt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LEOG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement was executed using a letter of guarantee or if the physical certificates were used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LetterOfGuarantee2Choice.mmObject();
		}

		@Override
		public Optional<LetterOfGuarantee2Choice> getValue(SettlementDetails20 obj) {
			return obj.getLetterOfGuarantee();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<LetterOfGuarantee2Choice> value) {
			obj.setLetterOfGuarantee(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20
	 * SettlementDetails20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblForColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RLEG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether securities were requested to be included in the pool of securities eligible for collateral purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails20, Optional<YesNoIndicator>> mmEligibleForCollateral = new MMMessageAttribute<SettlementDetails20, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmEligibleForCollateral;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails20.mmObject();
			isDerived = false;
			xmlTag = "ElgblForColl";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RLEG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities were requested to be included in the pool of securities eligible for collateral purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SettlementDetails20 obj) {
			return obj.getEligibleForCollateral();
		}

		@Override
		public void setValue(SettlementDetails20 obj, Optional<YesNoIndicator> value) {
			obj.setEligibleForCollateral(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails20.mmPriority, com.tools20022.repository.msg.SettlementDetails20.mmSecuritiesTransactionType,
						com.tools20022.repository.msg.SettlementDetails20.mmSettlementTransactionCondition, com.tools20022.repository.msg.SettlementDetails20.mmPartialSettlementIndicator,
						com.tools20022.repository.msg.SettlementDetails20.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails20.mmBlockTrade, com.tools20022.repository.msg.SettlementDetails20.mmCCPEligibility,
						com.tools20022.repository.msg.SettlementDetails20.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails20.mmExposureType, com.tools20022.repository.msg.SettlementDetails20.mmMarketClientSide,
						com.tools20022.repository.msg.SettlementDetails20.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails20.mmRegistration, com.tools20022.repository.msg.SettlementDetails20.mmRepurchaseType,
						com.tools20022.repository.msg.SettlementDetails20.mmLegalRestrictions, com.tools20022.repository.msg.SettlementDetails20.mmSecuritiesRTGS, com.tools20022.repository.msg.SettlementDetails20.mmSettlingCapacity,
						com.tools20022.repository.msg.SettlementDetails20.mmSettlementSystemMethod, com.tools20022.repository.msg.SettlementDetails20.mmTaxCapacity, com.tools20022.repository.msg.SettlementDetails20.mmStampDutyTaxBasis,
						com.tools20022.repository.msg.SettlementDetails20.mmAutomaticBorrowing, com.tools20022.repository.msg.SettlementDetails20.mmLetterOfGuarantee,
						com.tools20022.repository.msg.SettlementDetails20.mmEligibleForCollateral);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsRule.forSettlementDetails20,
						com.tools20022.repository.constraints.ConstraintCashClearingSystemRule.forSettlementDetails20);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDetails20";
				definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PriorityNumeric2Choice> getPriority() {
		return priority == null ? Optional.empty() : Optional.of(priority);
	}

	public SettlementDetails20 setPriority(PriorityNumeric2Choice priority) {
		this.priority = priority;
		return this;
	}

	public SecuritiesTransactionType6Choice getSecuritiesTransactionType() {
		return securitiesTransactionType;
	}

	public SettlementDetails20 setSecuritiesTransactionType(SecuritiesTransactionType6Choice securitiesTransactionType) {
		this.securitiesTransactionType = Objects.requireNonNull(securitiesTransactionType);
		return this;
	}

	public List<SettlementTransactionCondition3Choice> getSettlementTransactionCondition() {
		return settlementTransactionCondition == null ? settlementTransactionCondition = new ArrayList<>() : settlementTransactionCondition;
	}

	public SettlementDetails20 setSettlementTransactionCondition(List<SettlementTransactionCondition3Choice> settlementTransactionCondition) {
		this.settlementTransactionCondition = Objects.requireNonNull(settlementTransactionCondition);
		return this;
	}

	public Optional<YesNoIndicator> getPartialSettlementIndicator() {
		return partialSettlementIndicator == null ? Optional.empty() : Optional.of(partialSettlementIndicator);
	}

	public SettlementDetails20 setPartialSettlementIndicator(YesNoIndicator partialSettlementIndicator) {
		this.partialSettlementIndicator = partialSettlementIndicator;
		return this;
	}

	public Optional<BeneficialOwnership2Choice> getBeneficialOwnership() {
		return beneficialOwnership == null ? Optional.empty() : Optional.of(beneficialOwnership);
	}

	public SettlementDetails20 setBeneficialOwnership(BeneficialOwnership2Choice beneficialOwnership) {
		this.beneficialOwnership = beneficialOwnership;
		return this;
	}

	public Optional<BlockTrade2Choice> getBlockTrade() {
		return blockTrade == null ? Optional.empty() : Optional.of(blockTrade);
	}

	public SettlementDetails20 setBlockTrade(BlockTrade2Choice blockTrade) {
		this.blockTrade = blockTrade;
		return this;
	}

	public Optional<CentralCounterPartyEligibility2Choice> getCCPEligibility() {
		return cCPEligibility == null ? Optional.empty() : Optional.of(cCPEligibility);
	}

	public SettlementDetails20 setCCPEligibility(CentralCounterPartyEligibility2Choice cCPEligibility) {
		this.cCPEligibility = cCPEligibility;
		return this;
	}

	public Optional<CashSettlementSystem2Choice> getCashClearingSystem() {
		return cashClearingSystem == null ? Optional.empty() : Optional.of(cashClearingSystem);
	}

	public SettlementDetails20 setCashClearingSystem(CashSettlementSystem2Choice cashClearingSystem) {
		this.cashClearingSystem = cashClearingSystem;
		return this;
	}

	public Optional<ExposureType2Choice> getExposureType() {
		return exposureType == null ? Optional.empty() : Optional.of(exposureType);
	}

	public SettlementDetails20 setExposureType(ExposureType2Choice exposureType) {
		this.exposureType = exposureType;
		return this;
	}

	public Optional<MarketClientSide2Choice> getMarketClientSide() {
		return marketClientSide == null ? Optional.empty() : Optional.of(marketClientSide);
	}

	public SettlementDetails20 setMarketClientSide(MarketClientSide2Choice marketClientSide) {
		this.marketClientSide = marketClientSide;
		return this;
	}

	public Optional<NettingEligibility2Choice> getNettingEligibility() {
		return nettingEligibility == null ? Optional.empty() : Optional.of(nettingEligibility);
	}

	public SettlementDetails20 setNettingEligibility(NettingEligibility2Choice nettingEligibility) {
		this.nettingEligibility = nettingEligibility;
		return this;
	}

	public Optional<Registration2Choice> getRegistration() {
		return registration == null ? Optional.empty() : Optional.of(registration);
	}

	public SettlementDetails20 setRegistration(Registration2Choice registration) {
		this.registration = registration;
		return this;
	}

	public Optional<RepurchaseType6Choice> getRepurchaseType() {
		return repurchaseType == null ? Optional.empty() : Optional.of(repurchaseType);
	}

	public SettlementDetails20 setRepurchaseType(RepurchaseType6Choice repurchaseType) {
		this.repurchaseType = repurchaseType;
		return this;
	}

	public Optional<Restriction2Choice> getLegalRestrictions() {
		return legalRestrictions == null ? Optional.empty() : Optional.of(legalRestrictions);
	}

	public SettlementDetails20 setLegalRestrictions(Restriction2Choice legalRestrictions) {
		this.legalRestrictions = legalRestrictions;
		return this;
	}

	public Optional<SecuritiesRTGS2Choice> getSecuritiesRTGS() {
		return securitiesRTGS == null ? Optional.empty() : Optional.of(securitiesRTGS);
	}

	public SettlementDetails20 setSecuritiesRTGS(SecuritiesRTGS2Choice securitiesRTGS) {
		this.securitiesRTGS = securitiesRTGS;
		return this;
	}

	public Optional<SettlingCapacity2Choice> getSettlingCapacity() {
		return settlingCapacity == null ? Optional.empty() : Optional.of(settlingCapacity);
	}

	public SettlementDetails20 setSettlingCapacity(SettlingCapacity2Choice settlingCapacity) {
		this.settlingCapacity = settlingCapacity;
		return this;
	}

	public Optional<SettlementSystemMethod2Choice> getSettlementSystemMethod() {
		return settlementSystemMethod == null ? Optional.empty() : Optional.of(settlementSystemMethod);
	}

	public SettlementDetails20 setSettlementSystemMethod(SettlementSystemMethod2Choice settlementSystemMethod) {
		this.settlementSystemMethod = settlementSystemMethod;
		return this;
	}

	public Optional<TaxCapacityParty2Choice> getTaxCapacity() {
		return taxCapacity == null ? Optional.empty() : Optional.of(taxCapacity);
	}

	public SettlementDetails20 setTaxCapacity(TaxCapacityParty2Choice taxCapacity) {
		this.taxCapacity = taxCapacity;
		return this;
	}

	public Optional<GenericIdentification25> getStampDutyTaxBasis() {
		return stampDutyTaxBasis == null ? Optional.empty() : Optional.of(stampDutyTaxBasis);
	}

	public SettlementDetails20 setStampDutyTaxBasis(GenericIdentification25 stampDutyTaxBasis) {
		this.stampDutyTaxBasis = stampDutyTaxBasis;
		return this;
	}

	public Optional<AutomaticBorrowing4Choice> getAutomaticBorrowing() {
		return automaticBorrowing == null ? Optional.empty() : Optional.of(automaticBorrowing);
	}

	public SettlementDetails20 setAutomaticBorrowing(AutomaticBorrowing4Choice automaticBorrowing) {
		this.automaticBorrowing = automaticBorrowing;
		return this;
	}

	public Optional<LetterOfGuarantee2Choice> getLetterOfGuarantee() {
		return letterOfGuarantee == null ? Optional.empty() : Optional.of(letterOfGuarantee);
	}

	public SettlementDetails20 setLetterOfGuarantee(LetterOfGuarantee2Choice letterOfGuarantee) {
		this.letterOfGuarantee = letterOfGuarantee;
		return this;
	}

	public Optional<YesNoIndicator> getEligibleForCollateral() {
		return eligibleForCollateral == null ? Optional.empty() : Optional.of(eligibleForCollateral);
	}

	public SettlementDetails20 setEligibleForCollateral(YesNoIndicator eligibleForCollateral) {
		this.eligibleForCollateral = eligibleForCollateral;
		return this;
	}
}
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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV02;
import com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV03;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SettlementTypeAndIdentification13;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of reference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References18Choice#mmSecuritiesSettlementTransactionConfirmationIdentification
 * References18Choice.
 * mmSecuritiesSettlementTransactionConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References18Choice#mmIntraPositionMovementConfirmationIdentification
 * References18Choice.mmIntraPositionMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References18Choice#mmSecuritiesBalanceAccountingReportIdentification
 * References18Choice.mmSecuritiesBalanceAccountingReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References18Choice#mmSecuritiesBalanceCustodyReportIdentification
 * References18Choice.mmSecuritiesBalanceCustodyReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References18Choice#mmIntraPositionMovementPostingReportIdentification
 * References18Choice.mmIntraPositionMovementPostingReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References18Choice#mmSecuritiesFinancingConfirmationIdentification
 * References18Choice.mmSecuritiesFinancingConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References18Choice#mmSecuritiesTransactionPendingReportIdentification
 * References18Choice.mmSecuritiesTransactionPendingReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References18Choice#mmSecuritiesTransactionPostingReportIdentification
 * References18Choice.mmSecuritiesTransactionPostingReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References18Choice#mmSecuritiesSettlementTransactionAllegementReportIdentification
 * References18Choice.
 * mmSecuritiesSettlementTransactionAllegementReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References18Choice#mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
 * References18Choice.
 * mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References18Choice#mmPortfolioTransferNotificationIdentification
 * References18Choice.mmPortfolioTransferNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References18Choice#mmSecuritiesSettlementTransactionGenerationNotificationIdentification
 * References18Choice.
 * mmSecuritiesSettlementTransactionGenerationNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References18Choice#mmOtherMessageIdentification
 * References18Choice.mmOtherMessageIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV02#mmReference
 * SecuritiesMessageCancellationAdviceV02.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdviceV03#mmReference
 * SecuritiesMessageCancellationAdviceV03.mmReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesSettlementTransactionAllegementNotificationRule#forReferences18Choice
 * ConstraintSecuritiesSettlementTransactionAllegementNotificationRule.
 * forReferences18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forReferences18Choice
 * ConstraintCoexistenceIdentificationRule.forReferences18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherMessageIdentificationUsageRule#forReferences18Choice
 * ConstraintOtherMessageIdentificationUsageRule.forReferences18Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "References18Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of reference."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.References37Choice
 * References37Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "References18Choice", propOrder = {"securitiesSettlementTransactionConfirmationIdentification", "intraPositionMovementConfirmationIdentification", "securitiesBalanceAccountingReportIdentification",
		"securitiesBalanceCustodyReportIdentification", "intraPositionMovementPostingReportIdentification", "securitiesFinancingConfirmationIdentification", "securitiesTransactionPendingReportIdentification",
		"securitiesTransactionPostingReportIdentification", "securitiesSettlementTransactionAllegementReportIdentification", "securitiesSettlementTransactionAllegementNotificationTransactionIdentification",
		"portfolioTransferNotificationIdentification", "securitiesSettlementTransactionGenerationNotificationIdentification", "otherMessageIdentification"})
public class References18Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesSttlmTxConfId", required = true)
	protected SettlementTypeAndIdentification13 securitiesSettlementTransactionConfirmationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification13
	 * SettlementTypeAndIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmTxConfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the confirmation to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References18Choice, SettlementTypeAndIdentification13> mmSecuritiesSettlementTransactionConfirmationIdentification = new MMMessageAssociationEnd<References18Choice, SettlementTypeAndIdentification13>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.References18Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionConfirmationIdentification";
			definition = "Unambiguous identification of the confirmation to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification13.mmObject();
		}

		@Override
		public SettlementTypeAndIdentification13 getValue(References18Choice obj) {
			return obj.getSecuritiesSettlementTransactionConfirmationIdentification();
		}

		@Override
		public void setValue(References18Choice obj, SettlementTypeAndIdentification13 value) {
			obj.setSecuritiesSettlementTransactionConfirmationIdentification(value);
		}
	};
	@XmlElement(name = "IntraPosMvmntConfId", required = true)
	protected Max35Text intraPositionMovementConfirmationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraPosMvmntConfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionMovementConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous account servicer identification of the intra-position movement confirmation to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References18Choice, Max35Text> mmIntraPositionMovementConfirmationIdentification = new MMMessageAttribute<References18Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References18Choice.mmObject();
			isDerived = false;
			xmlTag = "IntraPosMvmntConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionMovementConfirmationIdentification";
			definition = "Unambiguous account servicer identification of the intra-position movement confirmation to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(References18Choice obj) {
			return obj.getIntraPositionMovementConfirmationIdentification();
		}

		@Override
		public void setValue(References18Choice obj, Max35Text value) {
			obj.setIntraPositionMovementConfirmationIdentification(value);
		}
	};
	@XmlElement(name = "SctiesBalAcctgRptId", required = true)
	protected Max35Text securitiesBalanceAccountingReportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesBalAcctgRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalanceAccountingReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the report message to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References18Choice, Max35Text> mmSecuritiesBalanceAccountingReportIdentification = new MMMessageAttribute<References18Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References18Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesBalAcctgRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBalanceAccountingReportIdentification";
			definition = "Unambiguous identification of the report message to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(References18Choice obj) {
			return obj.getSecuritiesBalanceAccountingReportIdentification();
		}

		@Override
		public void setValue(References18Choice obj, Max35Text value) {
			obj.setSecuritiesBalanceAccountingReportIdentification(value);
		}
	};
	@XmlElement(name = "SctiesBalCtdyRptId", required = true)
	protected Max35Text securitiesBalanceCustodyReportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesBalCtdyRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalanceCustodyReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the report message to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References18Choice, Max35Text> mmSecuritiesBalanceCustodyReportIdentification = new MMMessageAttribute<References18Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References18Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesBalCtdyRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBalanceCustodyReportIdentification";
			definition = "Unambiguous identification of the report message to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(References18Choice obj) {
			return obj.getSecuritiesBalanceCustodyReportIdentification();
		}

		@Override
		public void setValue(References18Choice obj, Max35Text value) {
			obj.setSecuritiesBalanceCustodyReportIdentification(value);
		}
	};
	@XmlElement(name = "IntraPosMvmntPstngRptId", required = true)
	protected Max35Text intraPositionMovementPostingReportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraPosMvmntPstngRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionMovementPostingReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the intra-position movement posting report to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References18Choice, Max35Text> mmIntraPositionMovementPostingReportIdentification = new MMMessageAttribute<References18Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References18Choice.mmObject();
			isDerived = false;
			xmlTag = "IntraPosMvmntPstngRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionMovementPostingReportIdentification";
			definition = "Identification of the intra-position movement posting report to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(References18Choice obj) {
			return obj.getIntraPositionMovementPostingReportIdentification();
		}

		@Override
		public void setValue(References18Choice obj, Max35Text value) {
			obj.setIntraPositionMovementPostingReportIdentification(value);
		}
	};
	@XmlElement(name = "SctiesFincgConfId", required = true)
	protected SettlementTypeAndIdentification13 securitiesFinancingConfirmationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification13
	 * SettlementTypeAndIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgConfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the confirmation to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References18Choice, SettlementTypeAndIdentification13> mmSecuritiesFinancingConfirmationIdentification = new MMMessageAssociationEnd<References18Choice, SettlementTypeAndIdentification13>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References18Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingConfirmationIdentification";
			definition = "Unambiguous identification of the confirmation to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification13.mmObject();
		}

		@Override
		public SettlementTypeAndIdentification13 getValue(References18Choice obj) {
			return obj.getSecuritiesFinancingConfirmationIdentification();
		}

		@Override
		public void setValue(References18Choice obj, SettlementTypeAndIdentification13 value) {
			obj.setSecuritiesFinancingConfirmationIdentification(value);
		}
	};
	@XmlElement(name = "SctiesTxPdgRptId", required = true)
	protected Max35Text securitiesTransactionPendingReportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxPdgRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionPendingReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the report message to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References18Choice, Max35Text> mmSecuritiesTransactionPendingReportIdentification = new MMMessageAttribute<References18Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References18Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxPdgRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionPendingReportIdentification";
			definition = "Unambiguous identification of the report message to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(References18Choice obj) {
			return obj.getSecuritiesTransactionPendingReportIdentification();
		}

		@Override
		public void setValue(References18Choice obj, Max35Text value) {
			obj.setSecuritiesTransactionPendingReportIdentification(value);
		}
	};
	@XmlElement(name = "SctiesTxPstngRptId", required = true)
	protected Max35Text securitiesTransactionPostingReportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxPstngRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionPostingReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the report message to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References18Choice, Max35Text> mmSecuritiesTransactionPostingReportIdentification = new MMMessageAttribute<References18Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References18Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxPstngRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionPostingReportIdentification";
			definition = "Unambiguous identification of the report message to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(References18Choice obj) {
			return obj.getSecuritiesTransactionPostingReportIdentification();
		}

		@Override
		public void setValue(References18Choice obj, Max35Text value) {
			obj.setSecuritiesTransactionPostingReportIdentification(value);
		}
	};
	@XmlElement(name = "SctiesSttlmTxAllgmtRptId", required = true)
	protected Max35Text securitiesSettlementTransactionAllegementReportIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmTxAllgmtRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionAllegementReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of the report to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References18Choice, Max35Text> mmSecuritiesSettlementTransactionAllegementReportIdentification = new MMMessageAttribute<References18Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.References18Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxAllgmtRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementReportIdentification";
			definition = "Unambiguous identification of the report to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(References18Choice obj) {
			return obj.getSecuritiesSettlementTransactionAllegementReportIdentification();
		}

		@Override
		public void setValue(References18Choice obj, Max35Text value) {
			obj.setSecuritiesSettlementTransactionAllegementReportIdentification(value);
		}
	};
	@XmlElement(name = "SctiesSttlmTxAllgmtNtfctnTxId", required = true)
	protected SettlementTypeAndIdentification13 securitiesSettlementTransactionAllegementNotificationTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification13
	 * SettlementTypeAndIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmTxAllgmtNtfctnTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the allegement notification to be cancelled as know by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References18Choice, SettlementTypeAndIdentification13> mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification = new MMMessageAssociationEnd<References18Choice, SettlementTypeAndIdentification13>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.References18Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxAllgmtNtfctnTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionAllegementNotificationTransactionIdentification";
			definition = "Unambiguous identification of the allegement notification to be cancelled as know by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification13.mmObject();
		}

		@Override
		public SettlementTypeAndIdentification13 getValue(References18Choice obj) {
			return obj.getSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification();
		}

		@Override
		public void setValue(References18Choice obj, SettlementTypeAndIdentification13 value) {
			obj.setSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification(value);
		}
	};
	@XmlElement(name = "PrtflTrfNtfctnId", required = true)
	protected Max35Text portfolioTransferNotificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtflTrfNtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioTransferNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the portfolio transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References18Choice, Max35Text> mmPortfolioTransferNotificationIdentification = new MMMessageAttribute<References18Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References18Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtflTrfNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioTransferNotificationIdentification";
			definition = "Identification of the portfolio transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(References18Choice obj) {
			return obj.getPortfolioTransferNotificationIdentification();
		}

		@Override
		public void setValue(References18Choice obj, Max35Text value) {
			obj.setPortfolioTransferNotificationIdentification(value);
		}
	};
	@XmlElement(name = "SctiesSttlmTxGnrtnNtfctnId", required = true)
	protected SettlementTypeAndIdentification13 securitiesSettlementTransactionGenerationNotificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification13
	 * SettlementTypeAndIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmTxGnrtnNtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "SecuritiesSettlementTransactionGenerationNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the notification message to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References18Choice, SettlementTypeAndIdentification13> mmSecuritiesSettlementTransactionGenerationNotificationIdentification = new MMMessageAssociationEnd<References18Choice, SettlementTypeAndIdentification13>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.References18Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxGnrtnNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionGenerationNotificationIdentification";
			definition = "Unambiguous identification of the notification message to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification13.mmObject();
		}

		@Override
		public SettlementTypeAndIdentification13 getValue(References18Choice obj) {
			return obj.getSecuritiesSettlementTransactionGenerationNotificationIdentification();
		}

		@Override
		public void setValue(References18Choice obj, SettlementTypeAndIdentification13 value) {
			obj.setSecuritiesSettlementTransactionGenerationNotificationIdentification(value);
		}
	};
	@XmlElement(name = "OthrMsgId", required = true)
	protected Max35Text otherMessageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References18Choice
	 * References18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrMsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the message to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References18Choice, Max35Text> mmOtherMessageIdentification = new MMMessageAttribute<References18Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References18Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherMessageIdentification";
			definition = "Unambiguous identification of the message to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(References18Choice obj) {
			return obj.getOtherMessageIdentification();
		}

		@Override
		public void setValue(References18Choice obj, Max35Text value) {
			obj.setOtherMessageIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.References18Choice.mmSecuritiesSettlementTransactionConfirmationIdentification,
						com.tools20022.repository.choice.References18Choice.mmIntraPositionMovementConfirmationIdentification, com.tools20022.repository.choice.References18Choice.mmSecuritiesBalanceAccountingReportIdentification,
						com.tools20022.repository.choice.References18Choice.mmSecuritiesBalanceCustodyReportIdentification, com.tools20022.repository.choice.References18Choice.mmIntraPositionMovementPostingReportIdentification,
						com.tools20022.repository.choice.References18Choice.mmSecuritiesFinancingConfirmationIdentification, com.tools20022.repository.choice.References18Choice.mmSecuritiesTransactionPendingReportIdentification,
						com.tools20022.repository.choice.References18Choice.mmSecuritiesTransactionPostingReportIdentification,
						com.tools20022.repository.choice.References18Choice.mmSecuritiesSettlementTransactionAllegementReportIdentification,
						com.tools20022.repository.choice.References18Choice.mmSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification,
						com.tools20022.repository.choice.References18Choice.mmPortfolioTransferNotificationIdentification,
						com.tools20022.repository.choice.References18Choice.mmSecuritiesSettlementTransactionGenerationNotificationIdentification, com.tools20022.repository.choice.References18Choice.mmOtherMessageIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesMessageCancellationAdviceV02.mmReference, SecuritiesMessageCancellationAdviceV03.mmReference);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesSettlementTransactionAllegementNotificationRule.forReferences18Choice,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forReferences18Choice, com.tools20022.repository.constraints.ConstraintOtherMessageIdentificationUsageRule.forReferences18Choice);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "References18Choice";
				definition = "Choice of reference.";
				nextVersions_lazy = () -> Arrays.asList(References37Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementTypeAndIdentification13 getSecuritiesSettlementTransactionConfirmationIdentification() {
		return securitiesSettlementTransactionConfirmationIdentification;
	}

	public References18Choice setSecuritiesSettlementTransactionConfirmationIdentification(SettlementTypeAndIdentification13 securitiesSettlementTransactionConfirmationIdentification) {
		this.securitiesSettlementTransactionConfirmationIdentification = Objects.requireNonNull(securitiesSettlementTransactionConfirmationIdentification);
		return this;
	}

	public Max35Text getIntraPositionMovementConfirmationIdentification() {
		return intraPositionMovementConfirmationIdentification;
	}

	public References18Choice setIntraPositionMovementConfirmationIdentification(Max35Text intraPositionMovementConfirmationIdentification) {
		this.intraPositionMovementConfirmationIdentification = Objects.requireNonNull(intraPositionMovementConfirmationIdentification);
		return this;
	}

	public Max35Text getSecuritiesBalanceAccountingReportIdentification() {
		return securitiesBalanceAccountingReportIdentification;
	}

	public References18Choice setSecuritiesBalanceAccountingReportIdentification(Max35Text securitiesBalanceAccountingReportIdentification) {
		this.securitiesBalanceAccountingReportIdentification = Objects.requireNonNull(securitiesBalanceAccountingReportIdentification);
		return this;
	}

	public Max35Text getSecuritiesBalanceCustodyReportIdentification() {
		return securitiesBalanceCustodyReportIdentification;
	}

	public References18Choice setSecuritiesBalanceCustodyReportIdentification(Max35Text securitiesBalanceCustodyReportIdentification) {
		this.securitiesBalanceCustodyReportIdentification = Objects.requireNonNull(securitiesBalanceCustodyReportIdentification);
		return this;
	}

	public Max35Text getIntraPositionMovementPostingReportIdentification() {
		return intraPositionMovementPostingReportIdentification;
	}

	public References18Choice setIntraPositionMovementPostingReportIdentification(Max35Text intraPositionMovementPostingReportIdentification) {
		this.intraPositionMovementPostingReportIdentification = Objects.requireNonNull(intraPositionMovementPostingReportIdentification);
		return this;
	}

	public SettlementTypeAndIdentification13 getSecuritiesFinancingConfirmationIdentification() {
		return securitiesFinancingConfirmationIdentification;
	}

	public References18Choice setSecuritiesFinancingConfirmationIdentification(SettlementTypeAndIdentification13 securitiesFinancingConfirmationIdentification) {
		this.securitiesFinancingConfirmationIdentification = Objects.requireNonNull(securitiesFinancingConfirmationIdentification);
		return this;
	}

	public Max35Text getSecuritiesTransactionPendingReportIdentification() {
		return securitiesTransactionPendingReportIdentification;
	}

	public References18Choice setSecuritiesTransactionPendingReportIdentification(Max35Text securitiesTransactionPendingReportIdentification) {
		this.securitiesTransactionPendingReportIdentification = Objects.requireNonNull(securitiesTransactionPendingReportIdentification);
		return this;
	}

	public Max35Text getSecuritiesTransactionPostingReportIdentification() {
		return securitiesTransactionPostingReportIdentification;
	}

	public References18Choice setSecuritiesTransactionPostingReportIdentification(Max35Text securitiesTransactionPostingReportIdentification) {
		this.securitiesTransactionPostingReportIdentification = Objects.requireNonNull(securitiesTransactionPostingReportIdentification);
		return this;
	}

	public Max35Text getSecuritiesSettlementTransactionAllegementReportIdentification() {
		return securitiesSettlementTransactionAllegementReportIdentification;
	}

	public References18Choice setSecuritiesSettlementTransactionAllegementReportIdentification(Max35Text securitiesSettlementTransactionAllegementReportIdentification) {
		this.securitiesSettlementTransactionAllegementReportIdentification = Objects.requireNonNull(securitiesSettlementTransactionAllegementReportIdentification);
		return this;
	}

	public SettlementTypeAndIdentification13 getSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification() {
		return securitiesSettlementTransactionAllegementNotificationTransactionIdentification;
	}

	public References18Choice setSecuritiesSettlementTransactionAllegementNotificationTransactionIdentification(SettlementTypeAndIdentification13 securitiesSettlementTransactionAllegementNotificationTransactionIdentification) {
		this.securitiesSettlementTransactionAllegementNotificationTransactionIdentification = Objects.requireNonNull(securitiesSettlementTransactionAllegementNotificationTransactionIdentification);
		return this;
	}

	public Max35Text getPortfolioTransferNotificationIdentification() {
		return portfolioTransferNotificationIdentification;
	}

	public References18Choice setPortfolioTransferNotificationIdentification(Max35Text portfolioTransferNotificationIdentification) {
		this.portfolioTransferNotificationIdentification = Objects.requireNonNull(portfolioTransferNotificationIdentification);
		return this;
	}

	public SettlementTypeAndIdentification13 getSecuritiesSettlementTransactionGenerationNotificationIdentification() {
		return securitiesSettlementTransactionGenerationNotificationIdentification;
	}

	public References18Choice setSecuritiesSettlementTransactionGenerationNotificationIdentification(SettlementTypeAndIdentification13 securitiesSettlementTransactionGenerationNotificationIdentification) {
		this.securitiesSettlementTransactionGenerationNotificationIdentification = Objects.requireNonNull(securitiesSettlementTransactionGenerationNotificationIdentification);
		return this;
	}

	public Max35Text getOtherMessageIdentification() {
		return otherMessageIdentification;
	}

	public References18Choice setOtherMessageIdentification(Max35Text otherMessageIdentification) {
		this.otherMessageIdentification = Objects.requireNonNull(otherMessageIdentification);
		return this;
	}
}
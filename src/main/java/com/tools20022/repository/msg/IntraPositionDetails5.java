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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.choice.PartyIdentification18Choice;
import com.tools20022.repository.choice.SecuritiesBalanceType4Choice;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesAccount17;
import com.tools20022.repository.msg.SecurityIdentification12;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the intra-position movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#mmPoolIdentification
 * IntraPositionDetails5.mmPoolIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#mmAccountOwner
 * IntraPositionDetails5.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#mmSafekeepingAccount
 * IntraPositionDetails5.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#mmFinancialInstrumentIdentification
 * IntraPositionDetails5.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#mmSettledQuantity
 * IntraPositionDetails5.mmSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#mmSettlementDate
 * IntraPositionDetails5.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#mmBalanceFrom
 * IntraPositionDetails5.mmBalanceFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5#mmBalanceTo
 * IntraPositionDetails5.mmBalanceTo}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forIntraPositionDetails5
 * ConstraintCoexistenceIdentificationRule.forIntraPositionDetails5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forIntraPositionDetails5
 * ConstraintCoexistenceQuantityRule.forIntraPositionDetails5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionDetails5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the intra-position movement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraPositionDetails5", propOrder = {"poolIdentification", "accountOwner", "safekeepingAccount", "financialInstrumentIdentification", "settledQuantity", "settlementDate", "balanceFrom", "balanceTo"})
public class IntraPositionDetails5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PoolId")
	protected RestrictedFINXMax16Text poolIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5
	 * IntraPositionDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::POOL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionDetails5, Optional<RestrictedFINXMax16Text>> mmPoolIdentification = new MMMessageAttribute<IntraPositionDetails5, Optional<RestrictedFINXMax16Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails5.mmObject();
			isDerived = false;
			xmlTag = "PoolId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::POOL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(IntraPositionDetails5 obj) {
			return obj.getPoolIdentification();
		}

		@Override
		public void setValue(IntraPositionDetails5 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setPoolIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification18Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification18Choice
	 * PartyIdentification18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5
	 * IntraPositionDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::ACOW</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionDetails5, Optional<PartyIdentification18Choice>> mmAccountOwner = new MMMessageAssociationEnd<IntraPositionDetails5, Optional<PartyIdentification18Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails5.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::ACOW"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification18Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification18Choice> getValue(IntraPositionDetails5 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(IntraPositionDetails5 obj, Optional<PartyIdentification18Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct", required = true)
	protected SecuritiesAccount17 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount17
	 * SecuritiesAccount17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmAccount
	 * SecuritiesTransfer.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5
	 * IntraPositionDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97A::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionDetails5, SecuritiesAccount17> mmSafekeepingAccount = new MMMessageAssociationEnd<IntraPositionDetails5, SecuritiesAccount17>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails5.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97A::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount17.mmObject();
		}

		@Override
		public SecuritiesAccount17 getValue(IntraPositionDetails5 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(IntraPositionDetails5 obj, SecuritiesAccount17 value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification12 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification12
	 * SecurityIdentification12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5
	 * IntraPositionDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionDetails5, SecurityIdentification12> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<IntraPositionDetails5, SecurityIdentification12>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails5.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification12.mmObject();
		}

		@Override
		public SecurityIdentification12 getValue(IntraPositionDetails5 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(IntraPositionDetails5 obj, SecurityIdentification12 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "SttldQty", required = true)
	protected FinancialInstrumentQuantity15Choice settledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5
	 * IntraPositionDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::ESTT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument effectively settled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionDetails5, FinancialInstrumentQuantity15Choice> mmSettledQuantity = new MMMessageAssociationEnd<IntraPositionDetails5, FinancialInstrumentQuantity15Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails5.mmObject();
			isDerived = false;
			xmlTag = "SttldQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::ESTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledQuantity";
			definition = "Quantity of financial instrument effectively settled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity15Choice getValue(IntraPositionDetails5 obj) {
			return obj.getSettledQuantity();
		}

		@Override
		public void setValue(IntraPositionDetails5 obj, FinancialInstrumentQuantity15Choice value) {
			obj.setSettledQuantity(value);
		}
	};
	@XmlElement(name = "SttlmDt", required = true)
	protected DateAndDateTimeChoice settlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5
	 * IntraPositionDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the securities are to be moved."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionDetails5, DateAndDateTimeChoice> mmSettlementDate = new MMMessageAssociationEnd<IntraPositionDetails5, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails5.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities are to be moved.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(IntraPositionDetails5 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(IntraPositionDetails5 obj, DateAndDateTimeChoice value) {
			obj.setSettlementDate(value);
		}
	};
	@XmlElement(name = "BalFr")
	protected SecuritiesBalanceType4Choice balanceFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType4Choice
	 * SecuritiesBalanceType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5
	 * IntraPositionDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::FROM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance from which the securities are moving."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionDetails5, Optional<SecuritiesBalanceType4Choice>> mmBalanceFrom = new MMMessageAssociationEnd<IntraPositionDetails5, Optional<SecuritiesBalanceType4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails5.mmObject();
			isDerived = false;
			xmlTag = "BalFr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::FROM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFrom";
			definition = "Balance from which the securities are moving.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesBalanceType4Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesBalanceType4Choice> getValue(IntraPositionDetails5 obj) {
			return obj.getBalanceFrom();
		}

		@Override
		public void setValue(IntraPositionDetails5 obj, Optional<SecuritiesBalanceType4Choice> value) {
			obj.setBalanceFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "BalTo")
	protected SecuritiesBalanceType4Choice balanceTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType4Choice
	 * SecuritiesBalanceType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails5
	 * IntraPositionDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::TOBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance to which the securities are moving."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionDetails5, Optional<SecuritiesBalanceType4Choice>> mmBalanceTo = new MMMessageAssociationEnd<IntraPositionDetails5, Optional<SecuritiesBalanceType4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails5.mmObject();
			isDerived = false;
			xmlTag = "BalTo";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::TOBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTo";
			definition = "Balance to which the securities are moving.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesBalanceType4Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesBalanceType4Choice> getValue(IntraPositionDetails5 obj) {
			return obj.getBalanceTo();
		}

		@Override
		public void setValue(IntraPositionDetails5 obj, Optional<SecuritiesBalanceType4Choice> value) {
			obj.setBalanceTo(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraPositionDetails5.mmPoolIdentification, com.tools20022.repository.msg.IntraPositionDetails5.mmAccountOwner,
						com.tools20022.repository.msg.IntraPositionDetails5.mmSafekeepingAccount, com.tools20022.repository.msg.IntraPositionDetails5.mmFinancialInstrumentIdentification,
						com.tools20022.repository.msg.IntraPositionDetails5.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails5.mmSettlementDate, com.tools20022.repository.msg.IntraPositionDetails5.mmBalanceFrom,
						com.tools20022.repository.msg.IntraPositionDetails5.mmBalanceTo);
				trace_lazy = () -> IntraPositionTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forIntraPositionDetails5,
						com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forIntraPositionDetails5);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "IntraPositionDetails5";
				definition = "Details of the intra-position movement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RestrictedFINXMax16Text> getPoolIdentification() {
		return poolIdentification == null ? Optional.empty() : Optional.of(poolIdentification);
	}

	public IntraPositionDetails5 setPoolIdentification(RestrictedFINXMax16Text poolIdentification) {
		this.poolIdentification = poolIdentification;
		return this;
	}

	public Optional<PartyIdentification18Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public IntraPositionDetails5 setAccountOwner(PartyIdentification18Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public SecuritiesAccount17 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public IntraPositionDetails5 setSafekeepingAccount(SecuritiesAccount17 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public SecurityIdentification12 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public IntraPositionDetails5 setFinancialInstrumentIdentification(SecurityIdentification12 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public FinancialInstrumentQuantity15Choice getSettledQuantity() {
		return settledQuantity;
	}

	public IntraPositionDetails5 setSettledQuantity(FinancialInstrumentQuantity15Choice settledQuantity) {
		this.settledQuantity = Objects.requireNonNull(settledQuantity);
		return this;
	}

	public DateAndDateTimeChoice getSettlementDate() {
		return settlementDate;
	}

	public IntraPositionDetails5 setSettlementDate(DateAndDateTimeChoice settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public Optional<SecuritiesBalanceType4Choice> getBalanceFrom() {
		return balanceFrom == null ? Optional.empty() : Optional.of(balanceFrom);
	}

	public IntraPositionDetails5 setBalanceFrom(SecuritiesBalanceType4Choice balanceFrom) {
		this.balanceFrom = balanceFrom;
		return this;
	}

	public Optional<SecuritiesBalanceType4Choice> getBalanceTo() {
		return balanceTo == null ? Optional.empty() : Optional.of(balanceTo);
	}

	public IntraPositionDetails5 setBalanceTo(SecuritiesBalanceType4Choice balanceTo) {
		this.balanceTo = balanceTo;
		return this;
	}
}
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
import com.tools20022.repository.choice.CashAccountIdentification5Choice;
import com.tools20022.repository.choice.NonEligibleProceedsIndicator1Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.Payment1Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * Provides information about the cash option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption11#mmCreditDebitIndicator
 * CashOption11.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption11#mmContractualPaymentIndicator
 * CashOption11.mmContractualPaymentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption11#mmNonEligibleProceedsIndicator
 * CashOption11.mmNonEligibleProceedsIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption11#mmIncomeType
 * CashOption11.mmIncomeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption11#mmCashAccountIdentification
 * CashOption11.mmCashAccountIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption11#mmAmountDetails
 * CashOption11.mmAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption11#mmDateDetails
 * CashOption11.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption11#mmForeignExchangeDetails
 * CashOption11.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption11#mmRateAndAmountDetails
 * CashOption11.mmRateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption11#mmPriceDetails
 * CashOption11.mmPriceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
 * CashProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashOption11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the cash option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCashOption11
 * ConstraintGenericCashPricePerProductGuideline.forCashOption11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCashOption11
 * ConstraintCoexistenceAmountRule.forCashOption11}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption16 CashOption16}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashOption11", propOrder = {"creditDebitIndicator", "contractualPaymentIndicator", "nonEligibleProceedsIndicator", "incomeType", "cashAccountIdentification", "amountDetails", "dateDetails", "foreignExchangeDetails",
		"rateAndAmountDetails", "priceDetails"})
public class CashOption11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CdtDbtInd", required = true)
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCreditDebitIndicator
	 * ProceedsDefinition.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption11 CashOption11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the value is a debit or a credit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::CRDB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOption11, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<CashOption11, CreditDebitCode>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption11.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::CRDB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the value is a debit or a credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(CashOption11 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(CashOption11 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "CtrctlPmtInd")
	protected Payment1Code contractualPaymentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Payment1Code
	 * Payment1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmContractualPaymentIndicator
	 * CashProceedsDefinition.mmContractualPaymentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption11 CashOption11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctlPmtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractualPaymentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cash payment occurs or will occur in advance of receipt of proceeds from the issuer and based on a contractual agreement established with the account servicer or upon receipt of proceeds from the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H:CONT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOption11, Optional<Payment1Code>> mmContractualPaymentIndicator = new MMMessageAttribute<CashOption11, Optional<Payment1Code>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmContractualPaymentIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption11.mmObject();
			isDerived = false;
			xmlTag = "CtrctlPmtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H:CONT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractualPaymentIndicator";
			definition = "Indicates whether the cash payment occurs or will occur in advance of receipt of proceeds from the issuer and based on a contractual agreement established with the account servicer or upon receipt of proceeds from the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Payment1Code.mmObject();
		}

		@Override
		public Optional<Payment1Code> getValue(CashOption11 obj) {
			return obj.getContractualPaymentIndicator();
		}

		@Override
		public void setValue(CashOption11 obj, Optional<Payment1Code> value) {
			obj.setContractualPaymentIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NonElgblPrcdsInd")
	protected NonEligibleProceedsIndicator1Choice nonEligibleProceedsIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator1Choice
	 * NonEligibleProceedsIndicator1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmNonEligibleProceedsIndicator
	 * ProceedsDefinition.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption11 CashOption11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonElgblPrcdsInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleProceedsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information regarding outturn resources that cannot be processed by the Central Securities Depository (CSD). Special delivery instruction is required from the account owner for the corporate action outcome to be credited."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::NELP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption11, Optional<NonEligibleProceedsIndicator1Choice>> mmNonEligibleProceedsIndicator = new MMMessageAssociationEnd<CashOption11, Optional<NonEligibleProceedsIndicator1Choice>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmNonEligibleProceedsIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption11.mmObject();
			isDerived = false;
			xmlTag = "NonElgblPrcdsInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::NELP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEligibleProceedsIndicator";
			definition = "Specifies information regarding outturn resources that cannot be processed by the Central Securities Depository (CSD). Special delivery instruction is required from the account owner for the corporate action outcome to be credited.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NonEligibleProceedsIndicator1Choice.mmObject();
		}

		@Override
		public Optional<NonEligibleProceedsIndicator1Choice> getValue(CashOption11 obj) {
			return obj.getNonEligibleProceedsIndicator();
		}

		@Override
		public void setValue(CashOption11 obj, Optional<NonEligibleProceedsIndicator1Choice> value) {
			obj.setNonEligibleProceedsIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmTp")
	protected GenericIdentification20 incomeType;
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
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
	 * CashProceedsDefinition.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption11 CashOption11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of income.\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ITYP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption11, Optional<GenericIdentification20>> mmIncomeType = new MMMessageAssociationEnd<CashOption11, Optional<GenericIdentification20>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIncomeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption11.mmObject();
			isDerived = false;
			xmlTag = "IncmTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ITYP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeType";
			definition = "Specifies the type of income.\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification20.mmObject();
		}

		@Override
		public Optional<GenericIdentification20> getValue(CashOption11 obj) {
			return obj.getIncomeType();
		}

		@Override
		public void setValue(CashOption11 obj, Optional<GenericIdentification20> value) {
			obj.setIncomeType(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAcctId")
	protected CashAccountIdentification5Choice cashAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice
	 * CashAccountIdentification5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption11 CashOption11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the account in which cash is maintained."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97a::CASH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption11, Optional<CashAccountIdentification5Choice>> mmCashAccountIdentification = new MMMessageAssociationEnd<CashOption11, Optional<CashAccountIdentification5Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption11.mmObject();
			isDerived = false;
			xmlTag = "CshAcctId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97a::CASH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountIdentification";
			definition = "Identification of the account in which cash is maintained.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification5Choice.mmObject();
		}

		@Override
		public Optional<CashAccountIdentification5Choice> getValue(CashOption11 obj) {
			return obj.getCashAccountIdentification();
		}

		@Override
		public void setValue(CashOption11 obj, Optional<CashAccountIdentification5Choice> value) {
			obj.setCashAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AmtDtls")
	protected CorporateActionAmounts9 amountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9
	 * CorporateActionAmounts9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption11 CashOption11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the amounts related to a cash movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption11, Optional<CorporateActionAmounts9>> mmAmountDetails = new MMMessageAssociationEnd<CashOption11, Optional<CorporateActionAmounts9>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption11.mmObject();
			isDerived = false;
			xmlTag = "AmtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Provides information about the amounts related to a cash movement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionAmounts9.mmObject();
		}

		@Override
		public Optional<CorporateActionAmounts9> getValue(CashOption11 obj) {
			return obj.getAmountDetails();
		}

		@Override
		public void setValue(CashOption11 obj, Optional<CorporateActionAmounts9> value) {
			obj.setAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DtDtls", required = true)
	protected CorporateActionDate17 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate17
	 * CorporateActionDate17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption11 CashOption11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to a cash movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption11, CorporateActionDate17> mmDateDetails = new MMMessageAssociationEnd<CashOption11, CorporateActionDate17>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption11.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a cash movement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionDate17.mmObject();
		}

		@Override
		public CorporateActionDate17 getValue(CashOption11 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(CashOption11 obj, CorporateActionDate17 value) {
			obj.setDateDetails(value);
		}
	};
	@XmlElement(name = "FXDtls")
	protected ForeignExchangeTerms13 foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13
	 * ForeignExchangeTerms13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
	 * CorporateActionEvent.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption11 CashOption11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange rate between the amount and the resulting amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::EXCH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption11, Optional<ForeignExchangeTerms13>> mmForeignExchangeDetails = new MMMessageAssociationEnd<CashOption11, Optional<ForeignExchangeTerms13>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption11.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::EXCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Exchange rate between the amount and the resulting amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms13.mmObject();
		}

		@Override
		public Optional<ForeignExchangeTerms13> getValue(CashOption11 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(CashOption11 obj, Optional<ForeignExchangeTerms13> value) {
			obj.setForeignExchangeDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RateAndAmtDtls")
	protected RateDetails3 rateAndAmountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RateDetails3
	 * RateDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption11 CashOption11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateAndAmtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndAmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the corporate action option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption11, Optional<RateDetails3>> mmRateAndAmountDetails = new MMMessageAssociationEnd<CashOption11, Optional<RateDetails3>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption11.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about the corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateDetails3.mmObject();
		}

		@Override
		public Optional<RateDetails3> getValue(CashOption11 obj) {
			return obj.getRateAndAmountDetails();
		}

		@Override
		public void setValue(CashOption11 obj, Optional<RateDetails3> value) {
			obj.setRateAndAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected PriceDetails3 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceDetails3
	 * PriceDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption11 CashOption11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the prices related to a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption11, Optional<PriceDetails3>> mmPriceDetails = new MMMessageAssociationEnd<CashOption11, Optional<PriceDetails3>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption11.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceDetails3.mmObject();
		}

		@Override
		public Optional<PriceDetails3> getValue(CashOption11 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(CashOption11 obj, Optional<PriceDetails3> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOption11.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption11.mmContractualPaymentIndicator,
						com.tools20022.repository.msg.CashOption11.mmNonEligibleProceedsIndicator, com.tools20022.repository.msg.CashOption11.mmIncomeType, com.tools20022.repository.msg.CashOption11.mmCashAccountIdentification,
						com.tools20022.repository.msg.CashOption11.mmAmountDetails, com.tools20022.repository.msg.CashOption11.mmDateDetails, com.tools20022.repository.msg.CashOption11.mmForeignExchangeDetails,
						com.tools20022.repository.msg.CashOption11.mmRateAndAmountDetails, com.tools20022.repository.msg.CashOption11.mmPriceDetails);
				trace_lazy = () -> CashProceedsDefinition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption11,
						com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCashOption11);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CashOption11";
				definition = "Provides information about the cash option.";
				nextVersions_lazy = () -> Arrays.asList(CashOption16.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public CashOption11 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<Payment1Code> getContractualPaymentIndicator() {
		return contractualPaymentIndicator == null ? Optional.empty() : Optional.of(contractualPaymentIndicator);
	}

	public CashOption11 setContractualPaymentIndicator(Payment1Code contractualPaymentIndicator) {
		this.contractualPaymentIndicator = contractualPaymentIndicator;
		return this;
	}

	public Optional<NonEligibleProceedsIndicator1Choice> getNonEligibleProceedsIndicator() {
		return nonEligibleProceedsIndicator == null ? Optional.empty() : Optional.of(nonEligibleProceedsIndicator);
	}

	public CashOption11 setNonEligibleProceedsIndicator(NonEligibleProceedsIndicator1Choice nonEligibleProceedsIndicator) {
		this.nonEligibleProceedsIndicator = nonEligibleProceedsIndicator;
		return this;
	}

	public Optional<GenericIdentification20> getIncomeType() {
		return incomeType == null ? Optional.empty() : Optional.of(incomeType);
	}

	public CashOption11 setIncomeType(GenericIdentification20 incomeType) {
		this.incomeType = incomeType;
		return this;
	}

	public Optional<CashAccountIdentification5Choice> getCashAccountIdentification() {
		return cashAccountIdentification == null ? Optional.empty() : Optional.of(cashAccountIdentification);
	}

	public CashOption11 setCashAccountIdentification(CashAccountIdentification5Choice cashAccountIdentification) {
		this.cashAccountIdentification = cashAccountIdentification;
		return this;
	}

	public Optional<CorporateActionAmounts9> getAmountDetails() {
		return amountDetails == null ? Optional.empty() : Optional.of(amountDetails);
	}

	public CashOption11 setAmountDetails(CorporateActionAmounts9 amountDetails) {
		this.amountDetails = amountDetails;
		return this;
	}

	public CorporateActionDate17 getDateDetails() {
		return dateDetails;
	}

	public CashOption11 setDateDetails(CorporateActionDate17 dateDetails) {
		this.dateDetails = Objects.requireNonNull(dateDetails);
		return this;
	}

	public Optional<ForeignExchangeTerms13> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? Optional.empty() : Optional.of(foreignExchangeDetails);
	}

	public CashOption11 setForeignExchangeDetails(ForeignExchangeTerms13 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
		return this;
	}

	public Optional<RateDetails3> getRateAndAmountDetails() {
		return rateAndAmountDetails == null ? Optional.empty() : Optional.of(rateAndAmountDetails);
	}

	public CashOption11 setRateAndAmountDetails(RateDetails3 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
		return this;
	}

	public Optional<PriceDetails3> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public CashOption11 setPriceDetails(PriceDetails3 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}
}
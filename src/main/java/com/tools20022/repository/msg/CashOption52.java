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
import com.tools20022.repository.choice.Account8Choice;
import com.tools20022.repository.choice.IssuerOfferorTaxabilityIndicator1Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.Payment1Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.CashOption52#mmCreditDebitIndicator
 * CashOption52.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption52#mmContractualPaymentIndicator
 * CashOption52.mmContractualPaymentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption52#mmIssuerOfferorTaxabilityIndicator
 * CashOption52.mmIssuerOfferorTaxabilityIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#mmIncomeType
 * CashOption52.mmIncomeType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#mmExemptionType
 * CashOption52.mmExemptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption52#mmCountryOfIncomeSource
 * CashOption52.mmCountryOfIncomeSource}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#mmAccount
 * CashOption52.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#mmCashParties
 * CashOption52.mmCashParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#mmAmountDetails
 * CashOption52.mmAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#mmDateDetails
 * CashOption52.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption52#mmForeignExchangeDetails
 * CashOption52.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption52#mmTaxVoucherDetails
 * CashOption52.mmTaxVoucherDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption52#mmRateAndAmountDetails
 * CashOption52.mmRateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#mmPriceDetails
 * CashOption52.mmPriceDetails}</li>
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
 * "CashOption52"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the cash option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintExemptionTypeUsageRule#forCashOption52
 * ConstraintExemptionTypeUsageRule.forCashOption52}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption52
 * ConstraintIncomeTypeUsageRule.forCashOption52}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption52
 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption52}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption58 CashOption58}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CashOption44
 * CashOption44}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashOption52", propOrder = {"creditDebitIndicator", "contractualPaymentIndicator", "issuerOfferorTaxabilityIndicator", "incomeType", "exemptionType", "countryOfIncomeSource", "account", "cashParties", "amountDetails",
		"dateDetails", "foreignExchangeDetails", "taxVoucherDetails", "rateAndAmountDetails", "priceDetails"})
public class CashOption52 {

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
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the value is a debit or credit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::CRDB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmCreditDebitIndicator
	 * CashOption58.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmCreditDebitIndicator
	 * CashOption44.mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOption52, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<CashOption52, CreditDebitCode>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::CRDB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the value is a debit or credit.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmCreditDebitIndicator);
			previousVersion_lazy = () -> CashOption44.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(CashOption52 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(CashOption52 obj, CreditDebitCode value) {
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
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
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
	 * semanticMarkup} = ISO15022Synonym: :22H::CONT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmContractualPaymentIndicator
	 * CashOption58.mmContractualPaymentIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmContractualPaymentIndicator
	 * CashOption44.mmContractualPaymentIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOption52, Optional<Payment1Code>> mmContractualPaymentIndicator = new MMMessageAttribute<CashOption52, Optional<Payment1Code>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmContractualPaymentIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "CtrctlPmtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::CONT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractualPaymentIndicator";
			definition = "Indicates whether the cash payment occurs or will occur in advance of receipt of proceeds from the issuer and based on a contractual agreement established with the account servicer or upon receipt of proceeds from the issuer.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmContractualPaymentIndicator);
			previousVersion_lazy = () -> CashOption44.mmContractualPaymentIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Payment1Code.mmObject();
		}

		@Override
		public Optional<Payment1Code> getValue(CashOption52 obj) {
			return obj.getContractualPaymentIndicator();
		}

		@Override
		public void setValue(CashOption52 obj, Optional<Payment1Code> value) {
			obj.setContractualPaymentIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrOfferrTaxbltyInd")
	protected IssuerOfferorTaxabilityIndicator1Choice issuerOfferorTaxabilityIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.IssuerOfferorTaxabilityIndicator1Choice
	 * IssuerOfferorTaxabilityIndicator1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmIssuerOfferorTaxabilityIndicator
	 * ProceedsDefinition.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrOfferrTaxbltyInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proceeds are taxable according to the information provided by the issuer / offeror."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmIssuerOfferorTaxabilityIndicator
	 * CashOption58.mmIssuerOfferorTaxabilityIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmIssuerOfferorTaxabilityIndicator
	 * CashOption44.mmIssuerOfferorTaxabilityIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOption52, Optional<IssuerOfferorTaxabilityIndicator1Choice>> mmIssuerOfferorTaxabilityIndicator = new MMMessageAttribute<CashOption52, Optional<IssuerOfferorTaxabilityIndicator1Choice>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmIssuerOfferorTaxabilityIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "IssrOfferrTaxbltyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicator";
			definition = "Proceeds are taxable according to the information provided by the issuer / offeror.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmIssuerOfferorTaxabilityIndicator);
			previousVersion_lazy = () -> CashOption44.mmIssuerOfferorTaxabilityIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IssuerOfferorTaxabilityIndicator1Choice.mmObject();
		}

		@Override
		public Optional<IssuerOfferorTaxabilityIndicator1Choice> getValue(CashOption52 obj) {
			return obj.getIssuerOfferorTaxabilityIndicator();
		}

		@Override
		public void setValue(CashOption52 obj, Optional<IssuerOfferorTaxabilityIndicator1Choice> value) {
			obj.setIssuerOfferorTaxabilityIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmTp")
	protected GenericIdentification30 incomeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
	 * CashProceedsDefinition.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption58#mmIncomeType
	 * CashOption58.mmIncomeType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmIncomeType
	 * CashOption44.mmIncomeType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption52, Optional<GenericIdentification30>> mmIncomeType = new MMMessageAssociationEnd<CashOption52, Optional<GenericIdentification30>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIncomeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "IncmTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ITYP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeType";
			definition = "Specifies the type of income.\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmIncomeType);
			previousVersion_lazy = () -> CashOption44.mmIncomeType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification30.mmObject();
		}

		@Override
		public Optional<GenericIdentification30> getValue(CashOption52 obj) {
			return obj.getIncomeType();
		}

		@Override
		public void setValue(CashOption52 obj, Optional<GenericIdentification30> value) {
			obj.setIncomeType(value.orElse(null));
		}
	};
	@XmlElement(name = "XmptnTp")
	protected List<GenericIdentification30> exemptionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the basis for the reduced rate of withholding."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmExemptionType
	 * CashOption58.mmExemptionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmExemptionType
	 * CashOption44.mmExemptionType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption52, List<GenericIdentification30>> mmExemptionType = new MMMessageAssociationEnd<CashOption52, List<GenericIdentification30>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "XmptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionType";
			definition = "Specifies the basis for the reduced rate of withholding.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmExemptionType);
			previousVersion_lazy = () -> CashOption44.mmExemptionType;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification30.mmObject();
		}

		@Override
		public List<GenericIdentification30> getValue(CashOption52 obj) {
			return obj.getExemptionType();
		}

		@Override
		public void setValue(CashOption52 obj, List<GenericIdentification30> value) {
			obj.setExemptionType(value);
		}
	};
	@XmlElement(name = "CtryOfIncmSrc")
	protected CountryCode countryOfIncomeSource;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCountryOfIncomeSource
	 * ProceedsDefinition.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfIncmSrc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfIncomeSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the country from which the income originates."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmCountryOfIncomeSource
	 * CashOption58.mmCountryOfIncomeSource}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmCountryOfIncomeSource
	 * CashOption44.mmCountryOfIncomeSource}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOption52, Optional<CountryCode>> mmCountryOfIncomeSource = new MMMessageAttribute<CashOption52, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmCountryOfIncomeSource;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIncmSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIncomeSource";
			definition = "Indicates the country from which the income originates.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmCountryOfIncomeSource);
			previousVersion_lazy = () -> CashOption44.mmCountryOfIncomeSource;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(CashOption52 obj) {
			return obj.getCountryOfIncomeSource();
		}

		@Override
		public void setValue(CashOption52 obj, Optional<CountryCode> value) {
			obj.setCountryOfIncomeSource(value.orElse(null));
		}
	};
	@XmlElement(name = "Acct")
	protected Account8Choice account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Account8Choice
	 * Account8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmCashAccount
	 * CorporateActionElection.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Choice between a cash account, a charges account or a tax account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97a:CASH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption58#mmAccount
	 * CashOption58.mmAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmAccount
	 * CashOption44.mmAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption52, Optional<Account8Choice>> mmAccount = new MMMessageAssociationEnd<CashOption52, Optional<Account8Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionElection.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97a:CASH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Choice between a cash account, a charges account or a tax account.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmAccount);
			previousVersion_lazy = () -> CashOption44.mmAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Account8Choice.mmObject();
		}

		@Override
		public Optional<Account8Choice> getValue(CashOption52 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(CashOption52 obj, Optional<Account8Choice> value) {
			obj.setAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties28 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashParties28
	 * CashParties28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about cash parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:CSHPRTY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption58#mmCashParties
	 * CashOption58.mmCashParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmCashParties
	 * CashOption44.mmCashParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption52, Optional<CashParties28>> mmCashParties = new MMMessageAssociationEnd<CashOption52, Optional<CashParties28>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "CshPties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:CSHPRTY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Provides information about cash parties.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmCashParties);
			previousVersion_lazy = () -> CashOption44.mmCashParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashParties28.mmObject();
		}

		@Override
		public Optional<CashParties28> getValue(CashOption52 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(CashOption52 obj, Optional<CashParties28> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "AmtDtls", required = true)
	protected CorporateActionAmounts37 amountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37
	 * CorporateActionAmounts37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmAmountDetails
	 * CashOption58.mmAmountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmAmountDetails
	 * CashOption44.mmAmountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption52, CorporateActionAmounts37> mmAmountDetails = new MMMessageAssociationEnd<CashOption52, CorporateActionAmounts37>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "AmtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Provides information about the amounts related to a cash movement.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmAmountDetails);
			previousVersion_lazy = () -> CashOption44.mmAmountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionAmounts37.mmObject();
		}

		@Override
		public CorporateActionAmounts37 getValue(CashOption52 obj) {
			return obj.getAmountDetails();
		}

		@Override
		public void setValue(CashOption52 obj, CorporateActionAmounts37 value) {
			obj.setAmountDetails(value);
		}
	};
	@XmlElement(name = "DtDtls", required = true)
	protected CorporateActionDate24 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate24
	 * CorporateActionDate24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption58#mmDateDetails
	 * CashOption58.mmDateDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmDateDetails
	 * CashOption44.mmDateDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption52, CorporateActionDate24> mmDateDetails = new MMMessageAssociationEnd<CashOption52, CorporateActionDate24>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a cash movement.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmDateDetails);
			previousVersion_lazy = () -> CashOption44.mmDateDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionDate24.mmObject();
		}

		@Override
		public CorporateActionDate24 getValue(CashOption52 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(CashOption52 obj, CorporateActionDate24 value) {
			obj.setDateDetails(value);
		}
	};
	@XmlElement(name = "FXDtls")
	protected ForeignExchangeTerms23 foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23
	 * ForeignExchangeTerms23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
	 * CorporateActionEvent.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmForeignExchangeDetails
	 * CashOption58.mmForeignExchangeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmForeignExchangeDetails
	 * CashOption44.mmForeignExchangeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption52, Optional<ForeignExchangeTerms23>> mmForeignExchangeDetails = new MMMessageAssociationEnd<CashOption52, Optional<ForeignExchangeTerms23>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::EXCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Exchange rate between the amount and the resulting amount.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmForeignExchangeDetails);
			previousVersion_lazy = () -> CashOption44.mmForeignExchangeDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms23.mmObject();
		}

		@Override
		public Optional<ForeignExchangeTerms23> getValue(CashOption52 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(CashOption52 obj, Optional<ForeignExchangeTerms23> value) {
			obj.setForeignExchangeDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxVchrDtls")
	protected TaxVoucher2 taxVoucherDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxVoucher2
	 * TaxVoucher2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmTaxVoucher
	 * CorporateActionDistribution.mmTaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxVchrDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucherDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the tax voucher related to a cash movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R::TAXVODET</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmTaxVoucherDetails
	 * CashOption58.mmTaxVoucherDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmTaxVoucherDetails
	 * CashOption44.mmTaxVoucherDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption52, Optional<TaxVoucher2>> mmTaxVoucherDetails = new MMMessageAssociationEnd<CashOption52, Optional<TaxVoucher2>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmTaxVoucher;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "TaxVchrDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R::TAXVODET"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxVoucherDetails";
			definition = "Provides information about the tax voucher related to a cash movement.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmTaxVoucherDetails);
			previousVersion_lazy = () -> CashOption44.mmTaxVoucherDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxVoucher2.mmObject();
		}

		@Override
		public Optional<TaxVoucher2> getValue(CashOption52 obj) {
			return obj.getTaxVoucherDetails();
		}

		@Override
		public void setValue(CashOption52 obj, Optional<TaxVoucher2> value) {
			obj.setTaxVoucherDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RateAndAmtDtls")
	protected RateDetails27 rateAndAmountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RateDetails27
	 * RateDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmRateAndAmountDetails
	 * CashOption58.mmRateAndAmountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmRateAndAmountDetails
	 * CashOption44.mmRateAndAmountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption52, Optional<RateDetails27>> mmRateAndAmountDetails = new MMMessageAssociationEnd<CashOption52, Optional<RateDetails27>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about the corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmRateAndAmountDetails);
			previousVersion_lazy = () -> CashOption44.mmRateAndAmountDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateDetails27.mmObject();
		}

		@Override
		public Optional<RateDetails27> getValue(CashOption52 obj) {
			return obj.getRateAndAmountDetails();
		}

		@Override
		public void setValue(CashOption52 obj, Optional<RateDetails27> value) {
			obj.setRateAndAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected PriceDetails23 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceDetails23
	 * PriceDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmPriceDetails
	 * CashOption58.mmPriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmPriceDetails
	 * CashOption44.mmPriceDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption52, Optional<PriceDetails23>> mmPriceDetails = new MMMessageAssociationEnd<CashOption52, Optional<PriceDetails23>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption52.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action option.";
			nextVersions_lazy = () -> Arrays.asList(CashOption58.mmPriceDetails);
			previousVersion_lazy = () -> CashOption44.mmPriceDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceDetails23.mmObject();
		}

		@Override
		public Optional<PriceDetails23> getValue(CashOption52 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(CashOption52 obj, Optional<PriceDetails23> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOption52.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption52.mmContractualPaymentIndicator,
						com.tools20022.repository.msg.CashOption52.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption52.mmIncomeType, com.tools20022.repository.msg.CashOption52.mmExemptionType,
						com.tools20022.repository.msg.CashOption52.mmCountryOfIncomeSource, com.tools20022.repository.msg.CashOption52.mmAccount, com.tools20022.repository.msg.CashOption52.mmCashParties,
						com.tools20022.repository.msg.CashOption52.mmAmountDetails, com.tools20022.repository.msg.CashOption52.mmDateDetails, com.tools20022.repository.msg.CashOption52.mmForeignExchangeDetails,
						com.tools20022.repository.msg.CashOption52.mmTaxVoucherDetails, com.tools20022.repository.msg.CashOption52.mmRateAndAmountDetails, com.tools20022.repository.msg.CashOption52.mmPriceDetails);
				trace_lazy = () -> CashProceedsDefinition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintExemptionTypeUsageRule.forCashOption52, com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption52,
						com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption52);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashOption52";
				definition = "Provides information about the cash option.";
				nextVersions_lazy = () -> Arrays.asList(CashOption58.mmObject());
				previousVersion_lazy = () -> CashOption44.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public CashOption52 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<Payment1Code> getContractualPaymentIndicator() {
		return contractualPaymentIndicator == null ? Optional.empty() : Optional.of(contractualPaymentIndicator);
	}

	public CashOption52 setContractualPaymentIndicator(Payment1Code contractualPaymentIndicator) {
		this.contractualPaymentIndicator = contractualPaymentIndicator;
		return this;
	}

	public Optional<IssuerOfferorTaxabilityIndicator1Choice> getIssuerOfferorTaxabilityIndicator() {
		return issuerOfferorTaxabilityIndicator == null ? Optional.empty() : Optional.of(issuerOfferorTaxabilityIndicator);
	}

	public CashOption52 setIssuerOfferorTaxabilityIndicator(IssuerOfferorTaxabilityIndicator1Choice issuerOfferorTaxabilityIndicator) {
		this.issuerOfferorTaxabilityIndicator = issuerOfferorTaxabilityIndicator;
		return this;
	}

	public Optional<GenericIdentification30> getIncomeType() {
		return incomeType == null ? Optional.empty() : Optional.of(incomeType);
	}

	public CashOption52 setIncomeType(GenericIdentification30 incomeType) {
		this.incomeType = incomeType;
		return this;
	}

	public List<GenericIdentification30> getExemptionType() {
		return exemptionType == null ? exemptionType = new ArrayList<>() : exemptionType;
	}

	public CashOption52 setExemptionType(List<GenericIdentification30> exemptionType) {
		this.exemptionType = Objects.requireNonNull(exemptionType);
		return this;
	}

	public Optional<CountryCode> getCountryOfIncomeSource() {
		return countryOfIncomeSource == null ? Optional.empty() : Optional.of(countryOfIncomeSource);
	}

	public CashOption52 setCountryOfIncomeSource(CountryCode countryOfIncomeSource) {
		this.countryOfIncomeSource = countryOfIncomeSource;
		return this;
	}

	public Optional<Account8Choice> getAccount() {
		return account == null ? Optional.empty() : Optional.of(account);
	}

	public CashOption52 setAccount(Account8Choice account) {
		this.account = account;
		return this;
	}

	public Optional<CashParties28> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public CashOption52 setCashParties(CashParties28 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public CorporateActionAmounts37 getAmountDetails() {
		return amountDetails;
	}

	public CashOption52 setAmountDetails(CorporateActionAmounts37 amountDetails) {
		this.amountDetails = Objects.requireNonNull(amountDetails);
		return this;
	}

	public CorporateActionDate24 getDateDetails() {
		return dateDetails;
	}

	public CashOption52 setDateDetails(CorporateActionDate24 dateDetails) {
		this.dateDetails = Objects.requireNonNull(dateDetails);
		return this;
	}

	public Optional<ForeignExchangeTerms23> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? Optional.empty() : Optional.of(foreignExchangeDetails);
	}

	public CashOption52 setForeignExchangeDetails(ForeignExchangeTerms23 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
		return this;
	}

	public Optional<TaxVoucher2> getTaxVoucherDetails() {
		return taxVoucherDetails == null ? Optional.empty() : Optional.of(taxVoucherDetails);
	}

	public CashOption52 setTaxVoucherDetails(TaxVoucher2 taxVoucherDetails) {
		this.taxVoucherDetails = taxVoucherDetails;
		return this;
	}

	public Optional<RateDetails27> getRateAndAmountDetails() {
		return rateAndAmountDetails == null ? Optional.empty() : Optional.of(rateAndAmountDetails);
	}

	public CashOption52 setRateAndAmountDetails(RateDetails27 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
		return this;
	}

	public Optional<PriceDetails23> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public CashOption52 setPriceDetails(PriceDetails23 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}
}
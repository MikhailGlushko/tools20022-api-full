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
import com.tools20022.repository.choice.CashAccountIdentification6Choice;
import com.tools20022.repository.choice.IssuerOfferorTaxabilityIndicator1Choice;
import com.tools20022.repository.choice.NonEligibleProceedsIndicator4Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.CreditDebitCode;
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
 * {@linkplain com.tools20022.repository.msg.CashOption63#mmCreditDebitIndicator
 * CashOption63.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption63#mmNonEligibleProceedsIndicator
 * CashOption63.mmNonEligibleProceedsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption63#mmIssuerOfferorTaxabilityIndicator
 * CashOption63.mmIssuerOfferorTaxabilityIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption63#mmIncomeType
 * CashOption63.mmIncomeType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption63#mmExemptionType
 * CashOption63.mmExemptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption63#mmCountryOfIncomeSource
 * CashOption63.mmCountryOfIncomeSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption63#mmCashAccountIdentification
 * CashOption63.mmCashAccountIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption63#mmAmountDetails
 * CashOption63.mmAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption63#mmDateDetails
 * CashOption63.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption63#mmForeignExchangeDetails
 * CashOption63.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOption63#mmRateAndAmountDetails
 * CashOption63.mmRateAndAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOption63#mmPriceDetails
 * CashOption63.mmPriceDetails}</li>
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
 * "CashOption63"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the cash option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCashOption63
 * ConstraintGenericCashPricePerProductGuideline.forCashOption63}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption63
 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption63}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintExemptionTypeUsageRule#forCashOption63
 * ConstraintExemptionTypeUsageRule.forCashOption63}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption63
 * ConstraintIncomeTypeUsageRule.forCashOption63}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashOption63", propOrder = {"creditDebitIndicator", "nonEligibleProceedsIndicator", "issuerOfferorTaxabilityIndicator", "incomeType", "exemptionType", "countryOfIncomeSource", "cashAccountIdentification", "amountDetails",
		"dateDetails", "foreignExchangeDetails", "rateAndAmountDetails", "priceDetails"})
public class CashOption63 {

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
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
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
	public static final MMMessageAttribute<CashOption63, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<CashOption63, CreditDebitCode>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption63.mmObject();
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
		public CreditDebitCode getValue(CashOption63 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(CashOption63 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "NonElgblPrcdsInd")
	protected NonEligibleProceedsIndicator4Choice nonEligibleProceedsIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator4Choice
	 * NonEligibleProceedsIndicator4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmNonEligibleProceedsIndicator
	 * ProceedsDefinition.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
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
	public static final MMMessageAssociationEnd<CashOption63, Optional<NonEligibleProceedsIndicator4Choice>> mmNonEligibleProceedsIndicator = new MMMessageAssociationEnd<CashOption63, Optional<NonEligibleProceedsIndicator4Choice>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmNonEligibleProceedsIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption63.mmObject();
			isDerived = false;
			xmlTag = "NonElgblPrcdsInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::NELP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEligibleProceedsIndicator";
			definition = "Specifies information regarding outturn resources that cannot be processed by the Central Securities Depository (CSD). Special delivery instruction is required from the account owner for the corporate action outcome to be credited.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NonEligibleProceedsIndicator4Choice.mmObject();
		}

		@Override
		public Optional<NonEligibleProceedsIndicator4Choice> getValue(CashOption63 obj) {
			return obj.getNonEligibleProceedsIndicator();
		}

		@Override
		public void setValue(CashOption63 obj, Optional<NonEligibleProceedsIndicator4Choice> value) {
			obj.setNonEligibleProceedsIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOption63, Optional<IssuerOfferorTaxabilityIndicator1Choice>> mmIssuerOfferorTaxabilityIndicator = new MMMessageAttribute<CashOption63, Optional<IssuerOfferorTaxabilityIndicator1Choice>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmIssuerOfferorTaxabilityIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption63.mmObject();
			isDerived = false;
			xmlTag = "IssrOfferrTaxbltyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicator";
			definition = "Proceeds are taxable according to the information provided by the issuer / offeror.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IssuerOfferorTaxabilityIndicator1Choice.mmObject();
		}

		@Override
		public Optional<IssuerOfferorTaxabilityIndicator1Choice> getValue(CashOption63 obj) {
			return obj.getIssuerOfferorTaxabilityIndicator();
		}

		@Override
		public void setValue(CashOption63 obj, Optional<IssuerOfferorTaxabilityIndicator1Choice> value) {
			obj.setIssuerOfferorTaxabilityIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmTp")
	protected GenericIdentification47 incomeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification47
	 * GenericIdentification47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
	 * CashProceedsDefinition.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
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
	public static final MMMessageAssociationEnd<CashOption63, Optional<GenericIdentification47>> mmIncomeType = new MMMessageAssociationEnd<CashOption63, Optional<GenericIdentification47>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIncomeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption63.mmObject();
			isDerived = false;
			xmlTag = "IncmTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ITYP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeType";
			definition = "Specifies the type of income.\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification47.mmObject();
		}

		@Override
		public Optional<GenericIdentification47> getValue(CashOption63 obj) {
			return obj.getIncomeType();
		}

		@Override
		public void setValue(CashOption63 obj, Optional<GenericIdentification47> value) {
			obj.setIncomeType(value.orElse(null));
		}
	};
	@XmlElement(name = "XmptnTp")
	protected List<GenericIdentification47> exemptionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification47
	 * GenericIdentification47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOption63, List<GenericIdentification47>> mmExemptionType = new MMMessageAssociationEnd<CashOption63, List<GenericIdentification47>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption63.mmObject();
			isDerived = false;
			xmlTag = "XmptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionType";
			definition = "Specifies the basis for the reduced rate of withholding.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification47.mmObject();
		}

		@Override
		public List<GenericIdentification47> getValue(CashOption63 obj) {
			return obj.getExemptionType();
		}

		@Override
		public void setValue(CashOption63 obj, List<GenericIdentification47> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOption63, Optional<CountryCode>> mmCountryOfIncomeSource = new MMMessageAttribute<CashOption63, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmCountryOfIncomeSource;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption63.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIncmSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIncomeSource";
			definition = "Indicates the country from which the income originates.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(CashOption63 obj) {
			return obj.getCountryOfIncomeSource();
		}

		@Override
		public void setValue(CashOption63 obj, Optional<CountryCode> value) {
			obj.setCountryOfIncomeSource(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAcctId")
	protected CashAccountIdentification6Choice cashAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification6Choice
	 * CashAccountIdentification6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
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
	public static final MMMessageAssociationEnd<CashOption63, Optional<CashAccountIdentification6Choice>> mmCashAccountIdentification = new MMMessageAssociationEnd<CashOption63, Optional<CashAccountIdentification6Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption63.mmObject();
			isDerived = false;
			xmlTag = "CshAcctId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97a::CASH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountIdentification";
			definition = "Identification of the account in which cash is maintained.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification6Choice.mmObject();
		}

		@Override
		public Optional<CashAccountIdentification6Choice> getValue(CashOption63 obj) {
			return obj.getCashAccountIdentification();
		}

		@Override
		public void setValue(CashOption63 obj, Optional<CashAccountIdentification6Choice> value) {
			obj.setCashAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AmtDtls")
	protected CorporateActionAmounts47 amountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47
	 * CorporateActionAmounts47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
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
	public static final MMMessageAssociationEnd<CashOption63, Optional<CorporateActionAmounts47>> mmAmountDetails = new MMMessageAssociationEnd<CashOption63, Optional<CorporateActionAmounts47>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption63.mmObject();
			isDerived = false;
			xmlTag = "AmtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Provides information about the amounts related to a cash movement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionAmounts47.mmObject();
		}

		@Override
		public Optional<CorporateActionAmounts47> getValue(CashOption63 obj) {
			return obj.getAmountDetails();
		}

		@Override
		public void setValue(CashOption63 obj, Optional<CorporateActionAmounts47> value) {
			obj.setAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DtDtls", required = true)
	protected CorporateActionDate72 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate72
	 * CorporateActionDate72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
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
	public static final MMMessageAssociationEnd<CashOption63, CorporateActionDate72> mmDateDetails = new MMMessageAssociationEnd<CashOption63, CorporateActionDate72>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption63.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a cash movement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionDate72.mmObject();
		}

		@Override
		public CorporateActionDate72 getValue(CashOption63 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(CashOption63 obj, CorporateActionDate72 value) {
			obj.setDateDetails(value);
		}
	};
	@XmlElement(name = "FXDtls")
	protected ForeignExchangeTerms28 foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28
	 * ForeignExchangeTerms28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
	 * CorporateActionEvent.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
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
	public static final MMMessageAssociationEnd<CashOption63, Optional<ForeignExchangeTerms28>> mmForeignExchangeDetails = new MMMessageAssociationEnd<CashOption63, Optional<ForeignExchangeTerms28>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption63.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::EXCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Exchange rate between the amount and the resulting amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms28.mmObject();
		}

		@Override
		public Optional<ForeignExchangeTerms28> getValue(CashOption63 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(CashOption63 obj, Optional<ForeignExchangeTerms28> value) {
			obj.setForeignExchangeDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RateAndAmtDtls")
	protected RateDetails34 rateAndAmountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RateDetails34
	 * RateDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
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
	public static final MMMessageAssociationEnd<CashOption63, Optional<RateDetails34>> mmRateAndAmountDetails = new MMMessageAssociationEnd<CashOption63, Optional<RateDetails34>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption63.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about the corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateDetails34.mmObject();
		}

		@Override
		public Optional<RateDetails34> getValue(CashOption63 obj) {
			return obj.getRateAndAmountDetails();
		}

		@Override
		public void setValue(CashOption63 obj, Optional<RateDetails34> value) {
			obj.setRateAndAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected PriceDetails25 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceDetails25
	 * PriceDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
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
	public static final MMMessageAssociationEnd<CashOption63, Optional<PriceDetails25>> mmPriceDetails = new MMMessageAssociationEnd<CashOption63, Optional<PriceDetails25>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOption63.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceDetails25.mmObject();
		}

		@Override
		public Optional<PriceDetails25> getValue(CashOption63 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(CashOption63 obj, Optional<PriceDetails25> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOption63.mmCreditDebitIndicator, com.tools20022.repository.msg.CashOption63.mmNonEligibleProceedsIndicator,
						com.tools20022.repository.msg.CashOption63.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.CashOption63.mmIncomeType, com.tools20022.repository.msg.CashOption63.mmExemptionType,
						com.tools20022.repository.msg.CashOption63.mmCountryOfIncomeSource, com.tools20022.repository.msg.CashOption63.mmCashAccountIdentification, com.tools20022.repository.msg.CashOption63.mmAmountDetails,
						com.tools20022.repository.msg.CashOption63.mmDateDetails, com.tools20022.repository.msg.CashOption63.mmForeignExchangeDetails, com.tools20022.repository.msg.CashOption63.mmRateAndAmountDetails,
						com.tools20022.repository.msg.CashOption63.mmPriceDetails);
				trace_lazy = () -> CashProceedsDefinition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption63,
						com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption63, com.tools20022.repository.constraints.ConstraintExemptionTypeUsageRule.forCashOption63,
						com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption63);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashOption63";
				definition = "Provides information about the cash option.";
			}
		});
		return mmObject_lazy.get();
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public CashOption63 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<NonEligibleProceedsIndicator4Choice> getNonEligibleProceedsIndicator() {
		return nonEligibleProceedsIndicator == null ? Optional.empty() : Optional.of(nonEligibleProceedsIndicator);
	}

	public CashOption63 setNonEligibleProceedsIndicator(NonEligibleProceedsIndicator4Choice nonEligibleProceedsIndicator) {
		this.nonEligibleProceedsIndicator = nonEligibleProceedsIndicator;
		return this;
	}

	public Optional<IssuerOfferorTaxabilityIndicator1Choice> getIssuerOfferorTaxabilityIndicator() {
		return issuerOfferorTaxabilityIndicator == null ? Optional.empty() : Optional.of(issuerOfferorTaxabilityIndicator);
	}

	public CashOption63 setIssuerOfferorTaxabilityIndicator(IssuerOfferorTaxabilityIndicator1Choice issuerOfferorTaxabilityIndicator) {
		this.issuerOfferorTaxabilityIndicator = issuerOfferorTaxabilityIndicator;
		return this;
	}

	public Optional<GenericIdentification47> getIncomeType() {
		return incomeType == null ? Optional.empty() : Optional.of(incomeType);
	}

	public CashOption63 setIncomeType(GenericIdentification47 incomeType) {
		this.incomeType = incomeType;
		return this;
	}

	public List<GenericIdentification47> getExemptionType() {
		return exemptionType == null ? exemptionType = new ArrayList<>() : exemptionType;
	}

	public CashOption63 setExemptionType(List<GenericIdentification47> exemptionType) {
		this.exemptionType = Objects.requireNonNull(exemptionType);
		return this;
	}

	public Optional<CountryCode> getCountryOfIncomeSource() {
		return countryOfIncomeSource == null ? Optional.empty() : Optional.of(countryOfIncomeSource);
	}

	public CashOption63 setCountryOfIncomeSource(CountryCode countryOfIncomeSource) {
		this.countryOfIncomeSource = countryOfIncomeSource;
		return this;
	}

	public Optional<CashAccountIdentification6Choice> getCashAccountIdentification() {
		return cashAccountIdentification == null ? Optional.empty() : Optional.of(cashAccountIdentification);
	}

	public CashOption63 setCashAccountIdentification(CashAccountIdentification6Choice cashAccountIdentification) {
		this.cashAccountIdentification = cashAccountIdentification;
		return this;
	}

	public Optional<CorporateActionAmounts47> getAmountDetails() {
		return amountDetails == null ? Optional.empty() : Optional.of(amountDetails);
	}

	public CashOption63 setAmountDetails(CorporateActionAmounts47 amountDetails) {
		this.amountDetails = amountDetails;
		return this;
	}

	public CorporateActionDate72 getDateDetails() {
		return dateDetails;
	}

	public CashOption63 setDateDetails(CorporateActionDate72 dateDetails) {
		this.dateDetails = Objects.requireNonNull(dateDetails);
		return this;
	}

	public Optional<ForeignExchangeTerms28> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? Optional.empty() : Optional.of(foreignExchangeDetails);
	}

	public CashOption63 setForeignExchangeDetails(ForeignExchangeTerms28 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
		return this;
	}

	public Optional<RateDetails34> getRateAndAmountDetails() {
		return rateAndAmountDetails == null ? Optional.empty() : Optional.of(rateAndAmountDetails);
	}

	public CashOption63 setRateAndAmountDetails(RateDetails34 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
		return this;
	}

	public Optional<PriceDetails25> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public CashOption63 setPriceDetails(PriceDetails25 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}
}
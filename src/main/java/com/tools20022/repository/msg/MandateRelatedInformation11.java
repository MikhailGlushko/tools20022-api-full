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
import com.tools20022.repository.choice.Frequency36Choice;
import com.tools20022.repository.choice.MandateSetupReason1Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.entity.ElectronicSignature;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further details related to a direct debit mandate signed between the
 * creditor and the debtor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmMandateIdentification
 * MandateRelatedInformation11.mmMandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmDateOfSignature
 * MandateRelatedInformation11.mmDateOfSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmAmendmentIndicator
 * MandateRelatedInformation11.mmAmendmentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmAmendmentInformationDetails
 * MandateRelatedInformation11.mmAmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmElectronicSignature
 * MandateRelatedInformation11.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFirstCollectionDate
 * MandateRelatedInformation11.mmFirstCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFinalCollectionDate
 * MandateRelatedInformation11.mmFinalCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFrequency
 * MandateRelatedInformation11.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmReason
 * MandateRelatedInformation11.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmTrackingDays
 * MandateRelatedInformation11.mmTrackingDays}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
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
 * "MandateRelatedInformation11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details related to a direct debit mandate signed between the creditor and the debtor."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10
 * MandateRelatedInformation10}</li>
 * </ul>
 */
public class MandateRelatedInformation11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text mandateIdentification;
	/**
	 * Unique identification, as assigned by the creditor, to unambiguously
	 * identify the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateIdentification
	 * Mandate.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
	 * MandateRelatedInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the creditor, to unambiguously identify the mandate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmMandateIdentification
	 * MandateRelatedInformation10.mmMandateIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMandateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.mmMandateIdentification;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "MndtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateIdentification";
			definition = "Unique identification, as assigned by the creditor, to unambiguously identify the mandate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmMandateIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODate dateOfSignature;
	/**
	 * Date on which the direct debit mandate has been signed by the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDateSigned
	 * Agreement.mmDateSigned}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
	 * MandateRelatedInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtOfSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the direct debit mandate has been signed by the debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmDateOfSignature
	 * MandateRelatedInformation10.mmDateOfSignature}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateOfSignature = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.mmDateSigned;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "DtOfSgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfSignature";
			definition = "Date on which the direct debit mandate has been signed by the debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmDateOfSignature;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected TrueFalseIndicator amendmentIndicator;
	/**
	 * Indicator notifying whether the underlying mandate is amended or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmAmendment
	 * Mandate.mmAmendment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
	 * MandateRelatedInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator notifying whether the underlying mandate is amended or not."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmAmendmentIndicator
	 * MandateRelatedInformation10.mmAmendmentIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmendmentIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.mmAmendment;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "AmdmntInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentIndicator";
			definition = "Indicator notifying whether the underlying mandate is amended or not.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmAmendmentIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected AmendmentInformationDetails11 amendmentInformationDetails;
	/**
	 * List of mandate elements that have been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails11
	 * AmendmentInformationDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
	 * MandateRelatedInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntInfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentInformationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of mandate elements that have been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmAmendmentInformationDetails
	 * MandateRelatedInformation10.mmAmendmentInformationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmendmentInformationDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DirectDebitMandate.mmObject();
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "AmdmntInfDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentInformationDetails";
			definition = "List of mandate elements that have been modified.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmAmendmentInformationDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails11.mmObject();
		}
	};
	protected Max1025Text electronicSignature;
	/**
	 * Additional security provisions, such as a digital signature, as provided
	 * by the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1025Text
	 * Max1025Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
	 * MandateRelatedInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional security provisions, such as a digital signature, as provided by the debtor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmElectronicSignature
	 * MandateRelatedInformation10.mmElectronicSignature}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElectronicSignature = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> ElectronicSignature.mmObject();
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSignature";
			definition = "Additional security provisions, such as a digital signature, as provided by the debtor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmElectronicSignature;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};
	protected ISODate firstCollectionDate;
	/**
	 * Date of the first collection of a direct debit as per the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFirstCollectionDate
	 * DirectDebitMandate.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
	 * MandateRelatedInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the first collection of a direct debit as per the mandate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmFirstCollectionDate
	 * MandateRelatedInformation10.mmFirstCollectionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmFirstCollectionDate;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "FrstColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmFirstCollectionDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate finalCollectionDate;
	/**
	 * Date of the final collection of a direct debit as per the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFinalCollectionDate
	 * DirectDebitMandate.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
	 * MandateRelatedInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the final collection of a direct debit as per the mandate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmFinalCollectionDate
	 * MandateRelatedInformation10.mmFinalCollectionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmFinalCollectionDate;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "FnlColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmFinalCollectionDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Frequency36Choice frequency;
	/**
	 * Regularity with which direct debit instructions are to be created and
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency36Choice
	 * Frequency36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFrequency
	 * DirectDebitMandate.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
	 * MandateRelatedInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regularity with which direct debit instructions are to be created and processed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmFrequency
	 * MandateRelatedInformation10.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmFrequency;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Regularity with which direct debit instructions are to be created and processed.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency36Choice.mmObject();
		}
	};
	protected MandateSetupReason1Choice reason;
	/**
	 * Reason for the direct debit mandate to allow the user to distinguish
	 * between different mandates for the same creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MandateSetupReason1Choice
	 * MandateSetupReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDescription
	 * Agreement.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
	 * MandateRelatedInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the direct debit mandate to allow the user to distinguish between different mandates for the same creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmReason
	 * MandateRelatedInformation10.mmReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.mmDescription;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the direct debit mandate to allow the user to distinguish between different mandates for the same creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateSetupReason1Choice.mmObject();
		}
	};
	protected Exact2NumericText trackingDays;
	/**
	 * Specifies the number of days the direct debit instruction must be
	 * tracked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact2NumericText
	 * Exact2NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmTrackingDays
	 * Mandate.mmTrackingDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
	 * MandateRelatedInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrckgDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrackingDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days the direct debit instruction must be tracked."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTrackingDays = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.mmTrackingDays;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "TrckgDays";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TrackingDays";
			definition = "Specifies the number of days the direct debit instruction must be tracked.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact2NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation11.mmMandateIdentification, com.tools20022.repository.msg.MandateRelatedInformation11.mmDateOfSignature,
						com.tools20022.repository.msg.MandateRelatedInformation11.mmAmendmentIndicator, com.tools20022.repository.msg.MandateRelatedInformation11.mmAmendmentInformationDetails,
						com.tools20022.repository.msg.MandateRelatedInformation11.mmElectronicSignature, com.tools20022.repository.msg.MandateRelatedInformation11.mmFirstCollectionDate,
						com.tools20022.repository.msg.MandateRelatedInformation11.mmFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation11.mmFrequency,
						com.tools20022.repository.msg.MandateRelatedInformation11.mmReason, com.tools20022.repository.msg.MandateRelatedInformation11.mmTrackingDays);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateRelatedInformation11";
				definition = "Provides further details related to a direct debit mandate signed between the creditor and the debtor.";
				previousVersion_lazy = () -> MandateRelatedInformation10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMandateIdentification() {
		return mandateIdentification;
	}

	public void setMandateIdentification(Max35Text mandateIdentification) {
		this.mandateIdentification = mandateIdentification;
	}

	public ISODate getDateOfSignature() {
		return dateOfSignature;
	}

	public void setDateOfSignature(ISODate dateOfSignature) {
		this.dateOfSignature = dateOfSignature;
	}

	public TrueFalseIndicator getAmendmentIndicator() {
		return amendmentIndicator;
	}

	public void setAmendmentIndicator(TrueFalseIndicator amendmentIndicator) {
		this.amendmentIndicator = amendmentIndicator;
	}

	public AmendmentInformationDetails11 getAmendmentInformationDetails() {
		return amendmentInformationDetails;
	}

	public void setAmendmentInformationDetails(com.tools20022.repository.msg.AmendmentInformationDetails11 amendmentInformationDetails) {
		this.amendmentInformationDetails = amendmentInformationDetails;
	}

	public Max1025Text getElectronicSignature() {
		return electronicSignature;
	}

	public void setElectronicSignature(Max1025Text electronicSignature) {
		this.electronicSignature = electronicSignature;
	}

	public ISODate getFirstCollectionDate() {
		return firstCollectionDate;
	}

	public void setFirstCollectionDate(ISODate firstCollectionDate) {
		this.firstCollectionDate = firstCollectionDate;
	}

	public ISODate getFinalCollectionDate() {
		return finalCollectionDate;
	}

	public void setFinalCollectionDate(ISODate finalCollectionDate) {
		this.finalCollectionDate = finalCollectionDate;
	}

	public Frequency36Choice getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency36Choice frequency) {
		this.frequency = frequency;
	}

	public MandateSetupReason1Choice getReason() {
		return reason;
	}

	public void setReason(MandateSetupReason1Choice reason) {
		this.reason = reason;
	}

	public Exact2NumericText getTrackingDays() {
		return trackingDays;
	}

	public void setTrackingDays(Exact2NumericText trackingDays) {
		this.trackingDays = trackingDays;
	}
}
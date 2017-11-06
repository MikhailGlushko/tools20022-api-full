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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.GeneralBusinessOrError1Choice;
import com.tools20022.repository.choice.GeneralBusinessOrError2Choice;
import com.tools20022.repository.choice.GeneralBusinessOrError3Choice;
import com.tools20022.repository.choice.GeneralBusinessOrError4Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Details about business information related to a system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemBusinessInformation"
 * src="doc-files/SystemBusinessInformation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmQualifier
 * SystemBusinessInformation.mmQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmSubject
 * SystemBusinessInformation.mmSubject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmSubjectDetails
 * SystemBusinessInformation.mmSubjectDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmIdentification
 * SystemBusinessInformation.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmReference
 * SystemBusinessInformation.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmSystem
 * SystemBusinessInformation.mmSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#mmSystemGeneratedInformation
 * System.mmSystemGeneratedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationQualifier#mmSystemBusinessInformation
 * InformationQualifier.mmSystemBusinessInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport#mmGeneralBusinessInformation
 * GeneralBusinessReport.mmGeneralBusinessInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2#mmGeneralBusinessInformation
 * GeneralBusinessReport2.mmGeneralBusinessInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport3#mmGeneralBusinessOrError
 * GeneralBusinessReport3.mmGeneralBusinessOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport4#mmGeneralBusinessOrError
 * GeneralBusinessReport4.mmGeneralBusinessOrError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralBusinessInformation
 * GeneralBusinessInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralBusinessReport
 * GeneralBusinessReport}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralBusinessReport2
 * GeneralBusinessReport2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneralBusinessOrError2Choice
 * GeneralBusinessOrError2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralBusinessReport3
 * GeneralBusinessReport3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneralBusinessOrError1Choice
 * GeneralBusinessOrError1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria
 * GeneralBusinessInformationSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneralBusinessOrError3Choice
 * GeneralBusinessOrError3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneralBusinessOrError4Choice
 * GeneralBusinessOrError4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralBusinessReport4
 * GeneralBusinessReport4}</li>
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
 * "SystemBusinessInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details about business information related to a system."</li>
 * </ul>
 */
public class SystemBusinessInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected InformationQualifier qualifier;
	/**
	 * Further information about the criticality or importance of a general
	 * business information system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationQualifier#mmSystemBusinessInformation
	 * InformationQualifier.mmSystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationQualifier
	 * InformationQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformation#mmQualifier
	 * GeneralBusinessInformation.mmQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria#mmQualifier
	 * GeneralBusinessInformationSearchCriteria.mmQualifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Qualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information about the criticality or importance of a general business information system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQualifier = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessInformation.mmQualifier, com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria.mmQualifier);
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Qualifier";
			definition = "Further information about the criticality or importance of a general business information system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationQualifier.mmSystemBusinessInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InformationQualifier.mmObject();
		}
	};
	protected Max35Text subject;
	/**
	 * Subject line of an item of general business information, summarizing the
	 * topic and intended destination of the information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformation#mmSubject
	 * GeneralBusinessInformation.mmSubject}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria#mmSubject
	 * GeneralBusinessInformationSearchCriteria.mmSubject}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subject line of an item of general business information, summarizing the topic and intended destination of the information."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSubject = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessInformation.mmSubject, com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria.mmSubject);
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Subject";
			definition = "Subject line of an item of general business information, summarizing the topic and intended destination of the information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max350Text subjectDetails;
	/**
	 * General business information, in unstructured form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformation#mmSubjectDetails
	 * GeneralBusinessInformation.mmSubjectDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General business information, in unstructured form."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSubjectDetails = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessInformation.mmSubjectDetails);
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubjectDetails";
			definition = "General business information, in unstructured form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Unique and unambiguous identification of a general business information
	 * system, as assigned by the system transaction administrator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport#mmBusinessInformationReference
	 * GeneralBusinessReport.mmBusinessInformationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2#mmBusinessInformationReference
	 * GeneralBusinessReport2.mmBusinessInformationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport3#mmBusinessInformationReference
	 * GeneralBusinessReport3.mmBusinessInformationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport4#mmBusinessInformationReference
	 * GeneralBusinessReport4.mmBusinessInformationReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a general business information system, as assigned by the system transaction administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessReport.mmBusinessInformationReference, com.tools20022.repository.msg.GeneralBusinessReport2.mmBusinessInformationReference,
					com.tools20022.repository.msg.GeneralBusinessReport3.mmBusinessInformationReference, com.tools20022.repository.msg.GeneralBusinessReport4.mmBusinessInformationReference);
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a general business information system, as assigned by the system transaction administrator.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text reference;
	/**
	 * Unique and unambiguous reference assigned to a general business
	 * information system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria#mmReference
	 * GeneralBusinessInformationSearchCriteria.mmReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous reference assigned to a general business information system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria.mmReference);
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reference";
			definition = "Unique and unambiguous reference assigned to a general business information system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected System system;
	/**
	 * System for which business information is generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmSystemGeneratedInformation
	 * System.mmSystemGeneratedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which business information is generated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which business information is generated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmSystemGeneratedInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemBusinessInformation";
				definition = "Details about business information related to a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.mmSystemGeneratedInformation, com.tools20022.repository.entity.InformationQualifier.mmSystemBusinessInformation);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessReport.mmGeneralBusinessInformation, com.tools20022.repository.msg.GeneralBusinessReport2.mmGeneralBusinessInformation,
						com.tools20022.repository.msg.GeneralBusinessReport3.mmGeneralBusinessOrError, com.tools20022.repository.msg.GeneralBusinessReport4.mmGeneralBusinessOrError);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemBusinessInformation.mmQualifier, com.tools20022.repository.entity.SystemBusinessInformation.mmSubject,
						com.tools20022.repository.entity.SystemBusinessInformation.mmSubjectDetails, com.tools20022.repository.entity.SystemBusinessInformation.mmIdentification,
						com.tools20022.repository.entity.SystemBusinessInformation.mmReference, com.tools20022.repository.entity.SystemBusinessInformation.mmSystem);
				derivationComponent_lazy = () -> Arrays.asList(GeneralBusinessInformation.mmObject(), GeneralBusinessReport.mmObject(), GeneralBusinessReport2.mmObject(), GeneralBusinessOrError2Choice.mmObject(),
						GeneralBusinessReport3.mmObject(), GeneralBusinessOrError1Choice.mmObject(), GeneralBusinessInformationSearchCriteria.mmObject(), GeneralBusinessOrError3Choice.mmObject(), GeneralBusinessOrError4Choice.mmObject(),
						GeneralBusinessReport4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public InformationQualifier getQualifier() {
		return qualifier;
	}

	public void setQualifier(com.tools20022.repository.entity.InformationQualifier qualifier) {
		this.qualifier = qualifier;
	}

	public Max35Text getSubject() {
		return subject;
	}

	public void setSubject(Max35Text subject) {
		this.subject = subject;
	}

	public Max350Text getSubjectDetails() {
		return subjectDetails;
	}

	public void setSubjectDetails(Max350Text subjectDetails) {
		this.subjectDetails = subjectDetails;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Max35Text getReference() {
		return reference;
	}

	public void setReference(Max35Text reference) {
		this.reference = reference;
	}

	public System getSystem() {
		return system;
	}

	public void setSystem(com.tools20022.repository.entity.System system) {
		this.system = system;
	}
}
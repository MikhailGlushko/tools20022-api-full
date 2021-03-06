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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to report on business information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria#mmQualifierIndicator
 * GeneralBusinessInformationReturnCriteria.mmQualifierIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria#mmSubjectIndicator
 * GeneralBusinessInformationReturnCriteria.mmSubjectIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria#mmSubjectDetailsIndicator
 * GeneralBusinessInformationReturnCriteria.mmSubjectDetailsIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GeneralBusinessInformationReturnCriteria"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on business information."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2018</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria1
 * GeneralBusinessInformationReturnCriteria1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GeneralBusinessInformationReturnCriteria", propOrder = {"qualifierIndicator", "subjectIndicator", "subjectDetailsIndicator"})
public class GeneralBusinessInformationReturnCriteria {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QlfrInd")
	protected RequestedIndicator qualifierIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria
	 * GeneralBusinessInformationReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QlfrInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifierIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the qualifier is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria1#mmQualifierIndicator
	 * GeneralBusinessInformationReturnCriteria1.mmQualifierIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeneralBusinessInformationReturnCriteria, Optional<RequestedIndicator>> mmQualifierIndicator = new MMMessageAttribute<GeneralBusinessInformationReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "QlfrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifierIndicator";
			definition = "Indicates whether the qualifier is requested.";
			nextVersions_lazy = () -> Arrays.asList(GeneralBusinessInformationReturnCriteria1.mmQualifierIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(GeneralBusinessInformationReturnCriteria obj) {
			return obj.getQualifierIndicator();
		}

		@Override
		public void setValue(GeneralBusinessInformationReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setQualifierIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "SbjtInd")
	protected RequestedIndicator subjectIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria
	 * GeneralBusinessInformationReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbjtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the subject is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria1#mmSubjectIndicator
	 * GeneralBusinessInformationReturnCriteria1.mmSubjectIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeneralBusinessInformationReturnCriteria, Optional<RequestedIndicator>> mmSubjectIndicator = new MMMessageAttribute<GeneralBusinessInformationReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "SbjtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectIndicator";
			definition = "Indicates whether the subject is requested.";
			nextVersions_lazy = () -> Arrays.asList(GeneralBusinessInformationReturnCriteria1.mmSubjectIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(GeneralBusinessInformationReturnCriteria obj) {
			return obj.getSubjectIndicator();
		}

		@Override
		public void setValue(GeneralBusinessInformationReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setSubjectIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "SbjtDtlsInd")
	protected RequestedIndicator subjectDetailsIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria
	 * GeneralBusinessInformationReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbjtDtlsInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectDetailsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the subject details are requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria1#mmSubjectDetailsIndicator
	 * GeneralBusinessInformationReturnCriteria1.mmSubjectDetailsIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeneralBusinessInformationReturnCriteria, Optional<RequestedIndicator>> mmSubjectDetailsIndicator = new MMMessageAttribute<GeneralBusinessInformationReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "SbjtDtlsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectDetailsIndicator";
			definition = "Indicates whether the subject details are requested.";
			nextVersions_lazy = () -> Arrays.asList(GeneralBusinessInformationReturnCriteria1.mmSubjectDetailsIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(GeneralBusinessInformationReturnCriteria obj) {
			return obj.getSubjectDetailsIndicator();
		}

		@Override
		public void setValue(GeneralBusinessInformationReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setSubjectDetailsIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria.mmQualifierIndicator,
						com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria.mmSubjectIndicator, com.tools20022.repository.msg.GeneralBusinessInformationReturnCriteria.mmSubjectDetailsIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "GeneralBusinessInformationReturnCriteria";
				definition = "Defines the criteria used to report on business information.";
				nextVersions_lazy = () -> Arrays.asList(GeneralBusinessInformationReturnCriteria1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RequestedIndicator> getQualifierIndicator() {
		return qualifierIndicator == null ? Optional.empty() : Optional.of(qualifierIndicator);
	}

	public GeneralBusinessInformationReturnCriteria setQualifierIndicator(RequestedIndicator qualifierIndicator) {
		this.qualifierIndicator = qualifierIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getSubjectIndicator() {
		return subjectIndicator == null ? Optional.empty() : Optional.of(subjectIndicator);
	}

	public GeneralBusinessInformationReturnCriteria setSubjectIndicator(RequestedIndicator subjectIndicator) {
		this.subjectIndicator = subjectIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getSubjectDetailsIndicator() {
		return subjectDetailsIndicator == null ? Optional.empty() : Optional.of(subjectDetailsIndicator);
	}

	public GeneralBusinessInformationReturnCriteria setSubjectDetailsIndicator(RequestedIndicator subjectDetailsIndicator) {
		this.subjectDetailsIndicator = subjectDetailsIndicator;
		return this;
	}
}
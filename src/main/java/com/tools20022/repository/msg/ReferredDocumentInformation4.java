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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DocumentLineInformation1;
import com.tools20022.repository.msg.ReferredDocumentType2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the documents referred to in the remittance information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4#mmType
 * ReferredDocumentInformation4.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4#mmNumber
 * ReferredDocumentInformation4.mmNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4#mmRelatedDate
 * ReferredDocumentInformation4.mmRelatedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4#mmLineDetails
 * ReferredDocumentInformation4.mmLineDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReferredDocumentInformation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the documents referred to in the remittance information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3
 * ReferredDocumentInformation3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReferredDocumentInformation4", propOrder = {"type", "number", "relatedDate", "lineDetails"})
public class ReferredDocumentInformation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp")
	protected ReferredDocumentType2 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReferredDocumentType2
	 * ReferredDocumentType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmType
	 * Document.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4
	 * ReferredDocumentInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of referred document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3#mmType
	 * ReferredDocumentInformation3.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReferredDocumentInformation4, Optional<ReferredDocumentType2>> mmType = new MMMessageAssociationEnd<ReferredDocumentInformation4, Optional<ReferredDocumentType2>>() {
		{
			businessElementTrace_lazy = () -> Document.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReferredDocumentInformation4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of referred document.";
			previousVersion_lazy = () -> ReferredDocumentInformation3.mmType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReferredDocumentType2.mmObject();
		}

		@Override
		public Optional<ReferredDocumentType2> getValue(ReferredDocumentInformation4 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(ReferredDocumentInformation4 obj, Optional<ReferredDocumentType2> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Nb")
	protected Max35Text number;
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
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4
	 * ReferredDocumentInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the referred document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3#mmNumber
	 * ReferredDocumentInformation3.mmNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReferredDocumentInformation4, Optional<Max35Text>> mmNumber = new MMMessageAttribute<ReferredDocumentInformation4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReferredDocumentInformation4.mmObject();
			isDerived = false;
			xmlTag = "Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Unique and unambiguous identification of the referred document.";
			previousVersion_lazy = () -> ReferredDocumentInformation3.mmNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ReferredDocumentInformation4 obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(ReferredDocumentInformation4 obj, Optional<Max35Text> value) {
			obj.setNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdDt")
	protected ISODate relatedDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4
	 * ReferredDocumentInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date associated with the referred document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3#mmRelatedDate
	 * ReferredDocumentInformation3.mmRelatedDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReferredDocumentInformation4, Optional<ISODate>> mmRelatedDate = new MMMessageAttribute<ReferredDocumentInformation4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReferredDocumentInformation4.mmObject();
			isDerived = false;
			xmlTag = "RltdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDate";
			definition = "Date associated with the referred document.";
			previousVersion_lazy = () -> ReferredDocumentInformation3.mmRelatedDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ReferredDocumentInformation4 obj) {
			return obj.getRelatedDate();
		}

		@Override
		public void setValue(ReferredDocumentInformation4 obj, Optional<ISODate> value) {
			obj.setRelatedDate(value.orElse(null));
		}
	};
	@XmlElement(name = "LineDtls")
	protected List<DocumentLineInformation1> lineDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentLineInformation1
	 * DocumentLineInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4
	 * ReferredDocumentInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide the content of the referred document line."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReferredDocumentInformation4, List<DocumentLineInformation1>> mmLineDetails = new MMMessageAssociationEnd<ReferredDocumentInformation4, List<DocumentLineInformation1>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReferredDocumentInformation4.mmObject();
			isDerived = false;
			xmlTag = "LineDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineDetails";
			definition = "Set of elements used to provide the content of the referred document line.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentLineInformation1.mmObject();
		}

		@Override
		public List<DocumentLineInformation1> getValue(ReferredDocumentInformation4 obj) {
			return obj.getLineDetails();
		}

		@Override
		public void setValue(ReferredDocumentInformation4 obj, List<DocumentLineInformation1> value) {
			obj.setLineDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReferredDocumentInformation4.mmType, com.tools20022.repository.msg.ReferredDocumentInformation4.mmNumber,
						com.tools20022.repository.msg.ReferredDocumentInformation4.mmRelatedDate, com.tools20022.repository.msg.ReferredDocumentInformation4.mmLineDetails);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReferredDocumentInformation4";
				definition = "Identifies the documents referred to in the remittance information.";
				previousVersion_lazy = () -> ReferredDocumentInformation3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ReferredDocumentType2> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public ReferredDocumentInformation4 setType(ReferredDocumentType2 type) {
		this.type = type;
		return this;
	}

	public Optional<Max35Text> getNumber() {
		return number == null ? Optional.empty() : Optional.of(number);
	}

	public ReferredDocumentInformation4 setNumber(Max35Text number) {
		this.number = number;
		return this;
	}

	public Optional<ISODate> getRelatedDate() {
		return relatedDate == null ? Optional.empty() : Optional.of(relatedDate);
	}

	public ReferredDocumentInformation4 setRelatedDate(ISODate relatedDate) {
		this.relatedDate = relatedDate;
		return this;
	}

	public List<DocumentLineInformation1> getLineDetails() {
		return lineDetails == null ? lineDetails = new ArrayList<>() : lineDetails;
	}

	public ReferredDocumentInformation4 setLineDetails(List<DocumentLineInformation1> lineDetails) {
		this.lineDetails = Objects.requireNonNull(lineDetails);
		return this;
	}
}
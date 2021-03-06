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
import com.tools20022.repository.area.caaa.*;
import com.tools20022.repository.codeset.ContentType1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AuthenticatedData1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General cryptographic message syntax (CMS) containing authenticated data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType3#mmContentType
 * ContentInformationType3.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType3#mmAuthenticatedData
 * ContentInformationType3.mmAuthenticatedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV01#mmSecurityTrailer
 * AcceptorDiagnosticResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV01#mmSecurityTrailer
 * AcceptorCancellationAdviceResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV01#mmSecurityTrailer
 * AcceptorAuthorisationRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV01#mmSecurityTrailer
 * AcceptorCompletionAdviceResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV01#mmSecurityTrailer
 * AcceptorReconciliationRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV01#mmSecurityTrailer
 * AcceptorReconciliationResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV01#mmSecurityTrailer
 * AcceptorCancellationRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV01#mmSecurityTrailer
 * AcceptorCancellationResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV01#mmSecurityTrailer
 * AcceptorDiagnosticRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV01#mmSecurityTrailer
 * AcceptorCompletionAdviceV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV01#mmSecurityTrailer
 * AcceptorCancellationAdviceV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV01#mmSecurityTrailer
 * AcceptorAuthorisationResponseV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ContentInformationType3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing authenticated data."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContentInformationType6
 * ContentInformationType6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContentInformationType3", propOrder = {"contentType", "authenticatedData"})
public class ContentInformationType3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CnttTp", required = true)
	protected ContentType1Code contentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType1Code
	 * ContentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType3
	 * ContentInformationType3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnttTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of data protection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContentInformationType3, ContentType1Code> mmContentType = new MMMessageAttribute<ContentInformationType3, ContentType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType3.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType1Code.mmObject();
		}

		@Override
		public ContentType1Code getValue(ContentInformationType3 obj) {
			return obj.getContentType();
		}

		@Override
		public void setValue(ContentInformationType3 obj, ContentType1Code value) {
			obj.setContentType(value);
		}
	};
	@XmlElement(name = "AuthntcdData")
	protected List<AuthenticatedData1> authenticatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthenticatedData1
	 * AuthenticatedData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType3
	 * ContentInformationType3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcdData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protection by a message authentication code (MAC)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContentInformationType3, List<AuthenticatedData1>> mmAuthenticatedData = new MMMessageAssociationEnd<ContentInformationType3, List<AuthenticatedData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType3.mmObject();
			isDerived = false;
			xmlTag = "AuthntcdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			definition = "Data protection by a message authentication code (MAC).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AuthenticatedData1.mmObject();
		}

		@Override
		public List<AuthenticatedData1> getValue(ContentInformationType3 obj) {
			return obj.getAuthenticatedData();
		}

		@Override
		public void setValue(ContentInformationType3 obj, List<AuthenticatedData1> value) {
			obj.setAuthenticatedData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType3.mmContentType, com.tools20022.repository.msg.ContentInformationType3.mmAuthenticatedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorDiagnosticResponseV01.mmSecurityTrailer, AcceptorCancellationAdviceResponseV01.mmSecurityTrailer, AcceptorAuthorisationRequestV01.mmSecurityTrailer,
						AcceptorCompletionAdviceResponseV01.mmSecurityTrailer, AcceptorReconciliationRequestV01.mmSecurityTrailer, AcceptorReconciliationResponseV01.mmSecurityTrailer, AcceptorCancellationRequestV01.mmSecurityTrailer,
						AcceptorCancellationResponseV01.mmSecurityTrailer, AcceptorDiagnosticRequestV01.mmSecurityTrailer, AcceptorCompletionAdviceV01.mmSecurityTrailer, AcceptorCancellationAdviceV01.mmSecurityTrailer,
						AcceptorAuthorisationResponseV01.mmSecurityTrailer);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType3";
				definition = "General cryptographic message syntax (CMS) containing authenticated data.";
				nextVersions_lazy = () -> Arrays.asList(ContentInformationType6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ContentType1Code getContentType() {
		return contentType;
	}

	public ContentInformationType3 setContentType(ContentType1Code contentType) {
		this.contentType = Objects.requireNonNull(contentType);
		return this;
	}

	public List<AuthenticatedData1> getAuthenticatedData() {
		return authenticatedData == null ? authenticatedData = new ArrayList<>() : authenticatedData;
	}

	public ContentInformationType3 setAuthenticatedData(List<AuthenticatedData1> authenticatedData) {
		this.authenticatedData = Objects.requireNonNull(authenticatedData);
		return this;
	}
}
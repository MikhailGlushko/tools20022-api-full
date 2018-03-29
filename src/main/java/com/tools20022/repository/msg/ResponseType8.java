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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Response;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Trace of response by the entities in the path from the issuer to the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResponseType8#mmResponderIdentification
 * ResponseType8.mmResponderIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType8#mmCodification
 * ResponseType8.mmCodification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType8#mmResponse
 * ResponseType8.mmResponse}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponseType8#mmResponseReason
 * ResponseType8.mmResponseReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResponseType8#mmAdditionalResponseInformation
 * ResponseType8.mmAdditionalResponseInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Response Response}</li>
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
 * "ResponseType8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Trace of response by the entities in the path from the issuer to the ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ResponseType8", propOrder = {"responderIdentification", "codification", "response", "responseReason", "additionalResponseInformation"})
public class ResponseType8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RspndrId", required = true)
	protected Max35Text responderIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ResponseType8 ResponseType8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspndrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the responder."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType8, Max35Text> mmResponderIdentification = new MMMessageAttribute<ResponseType8, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType8.mmObject();
			isDerived = false;
			xmlTag = "RspndrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponderIdentification";
			definition = "Identification of the responder.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ResponseType8 obj) {
			return obj.getResponderIdentification();
		}

		@Override
		public void setValue(ResponseType8 obj, Max35Text value) {
			obj.setResponderIdentification(value);
		}
	};
	@XmlElement(name = "Cdfctn")
	protected Max35Text codification;
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
	 * {@linkplain com.tools20022.repository.msg.ResponseType8 ResponseType8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Codification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Codification of the response (for instance ISO 8583, IFX)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType8, Optional<Max35Text>> mmCodification = new MMMessageAttribute<ResponseType8, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType8.mmObject();
			isDerived = false;
			xmlTag = "Cdfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Codification";
			definition = "Codification of the response (for instance ISO 8583, IFX).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ResponseType8 obj) {
			return obj.getCodification();
		}

		@Override
		public void setValue(ResponseType8 obj, Optional<Max35Text> value) {
			obj.setCodification(value.orElse(null));
		}
	};
	@XmlElement(name = "Rspn", required = true)
	protected Max35Text response;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Response Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType8 ResponseType8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Response"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType8, Max35Text> mmResponse = new MMMessageAttribute<ResponseType8, Max35Text>() {
		{
			businessComponentTrace_lazy = () -> Response.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType8.mmObject();
			isDerived = false;
			xmlTag = "Rspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Result of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ResponseType8 obj) {
			return obj.getResponse();
		}

		@Override
		public void setValue(ResponseType8 obj, Max35Text value) {
			obj.setResponse(value);
		}
	};
	@XmlElement(name = "RspnRsn")
	protected Max35Text responseReason;
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
	 * {@linkplain com.tools20022.repository.entity.Response#mmResponseReason
	 * Response.mmResponseReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResponseType8 ResponseType8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detail of the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType8, Optional<Max35Text>> mmResponseReason = new MMMessageAttribute<ResponseType8, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Response.mmResponseReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType8.mmObject();
			isDerived = false;
			xmlTag = "RspnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseReason";
			definition = "Detail of the response.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ResponseType8 obj) {
			return obj.getResponseReason();
		}

		@Override
		public void setValue(ResponseType8 obj, Optional<Max35Text> value) {
			obj.setResponseReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRspnInf")
	protected Max35Text additionalResponseInformation;
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
	 * {@linkplain com.tools20022.repository.msg.ResponseType8 ResponseType8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRspnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalResponseInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information to be logged for further examination."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponseType8, Optional<Max35Text>> mmAdditionalResponseInformation = new MMMessageAttribute<ResponseType8, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponseType8.mmObject();
			isDerived = false;
			xmlTag = "AddtlRspnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalResponseInformation";
			definition = "Additional information to be logged for further examination.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ResponseType8 obj) {
			return obj.getAdditionalResponseInformation();
		}

		@Override
		public void setValue(ResponseType8 obj, Optional<Max35Text> value) {
			obj.setAdditionalResponseInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ResponseType8.mmResponderIdentification, com.tools20022.repository.msg.ResponseType8.mmCodification,
						com.tools20022.repository.msg.ResponseType8.mmResponse, com.tools20022.repository.msg.ResponseType8.mmResponseReason, com.tools20022.repository.msg.ResponseType8.mmAdditionalResponseInformation);
				trace_lazy = () -> Response.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResponseType8";
				definition = "Trace of response by the entities in the path from the issuer to the ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getResponderIdentification() {
		return responderIdentification;
	}

	public ResponseType8 setResponderIdentification(Max35Text responderIdentification) {
		this.responderIdentification = Objects.requireNonNull(responderIdentification);
		return this;
	}

	public Optional<Max35Text> getCodification() {
		return codification == null ? Optional.empty() : Optional.of(codification);
	}

	public ResponseType8 setCodification(Max35Text codification) {
		this.codification = codification;
		return this;
	}

	public Max35Text getResponse() {
		return response;
	}

	public ResponseType8 setResponse(Max35Text response) {
		this.response = Objects.requireNonNull(response);
		return this;
	}

	public Optional<Max35Text> getResponseReason() {
		return responseReason == null ? Optional.empty() : Optional.of(responseReason);
	}

	public ResponseType8 setResponseReason(Max35Text responseReason) {
		this.responseReason = responseReason;
		return this;
	}

	public Optional<Max35Text> getAdditionalResponseInformation() {
		return additionalResponseInformation == null ? Optional.empty() : Optional.of(additionalResponseInformation);
	}

	public ResponseType8 setAdditionalResponseInformation(Max35Text additionalResponseInformation) {
		this.additionalResponseInformation = additionalResponseInformation;
		return this;
	}
}
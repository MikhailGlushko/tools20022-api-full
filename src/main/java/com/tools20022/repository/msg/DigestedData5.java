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
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlgorithmIdentification21;
import com.tools20022.repository.msg.EncapsulatedContent3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Digest computed on the identified data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DigestedData5#mmVersion
 * DigestedData5.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DigestedData5#mmDigestAlgorithm
 * DigestedData5.mmDigestAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DigestedData5#mmEncapsulatedContent
 * DigestedData5.mmEncapsulatedContent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DigestedData5#mmDigest
 * DigestedData5.mmDigest}</li>
 * </ul>
 * </li>
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
 * "DigestedData5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Digest computed on the identified data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.DigestedData4
 * DigestedData4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DigestedData5", propOrder = {"version", "digestAlgorithm", "encapsulatedContent", "digest"})
public class DigestedData5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Vrsn")
	protected Number version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DigestedData5 DigestedData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the data structure."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DigestedData4#mmVersion
	 * DigestedData4.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DigestedData5, Optional<Number>> mmVersion = new MMMessageAttribute<DigestedData5, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DigestedData5.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data structure.";
			previousVersion_lazy = () -> DigestedData4.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(DigestedData5 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(DigestedData5 obj, Optional<Number> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "DgstAlgo", required = true)
	protected AlgorithmIdentification21 digestAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification21
	 * AlgorithmIdentification21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DigestedData5 DigestedData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgstAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigestAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the digest algorithm."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DigestedData4#mmDigestAlgorithm
	 * DigestedData4.mmDigestAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DigestedData5, AlgorithmIdentification21> mmDigestAlgorithm = new MMMessageAssociationEnd<DigestedData5, AlgorithmIdentification21>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DigestedData5.mmObject();
			isDerived = false;
			xmlTag = "DgstAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestAlgorithm";
			definition = "Identification of the digest algorithm.";
			previousVersion_lazy = () -> DigestedData4.mmDigestAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AlgorithmIdentification21.mmObject();
		}

		@Override
		public AlgorithmIdentification21 getValue(DigestedData5 obj) {
			return obj.getDigestAlgorithm();
		}

		@Override
		public void setValue(DigestedData5 obj, AlgorithmIdentification21 value) {
			obj.setDigestAlgorithm(value);
		}
	};
	@XmlElement(name = "NcpsltdCntt", required = true)
	protected EncapsulatedContent3 encapsulatedContent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EncapsulatedContent3
	 * EncapsulatedContent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DigestedData5 DigestedData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcpsltdCntt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncapsulatedContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data on which the digest is computed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DigestedData4#mmEncapsulatedContent
	 * DigestedData4.mmEncapsulatedContent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DigestedData5, EncapsulatedContent3> mmEncapsulatedContent = new MMMessageAssociationEnd<DigestedData5, EncapsulatedContent3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DigestedData5.mmObject();
			isDerived = false;
			xmlTag = "NcpsltdCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncapsulatedContent";
			definition = "Data on which the digest is computed.";
			previousVersion_lazy = () -> DigestedData4.mmEncapsulatedContent;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EncapsulatedContent3.mmObject();
		}

		@Override
		public EncapsulatedContent3 getValue(DigestedData5 obj) {
			return obj.getEncapsulatedContent();
		}

		@Override
		public void setValue(DigestedData5 obj, EncapsulatedContent3 value) {
			obj.setEncapsulatedContent(value);
		}
	};
	@XmlElement(name = "Dgst", required = true)
	protected Max140Binary digest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DigestedData5 DigestedData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dgst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Digest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of data-digesting process."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DigestedData4#mmDigest
	 * DigestedData4.mmDigest}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DigestedData5, Max140Binary> mmDigest = new MMMessageAttribute<DigestedData5, Max140Binary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DigestedData5.mmObject();
			isDerived = false;
			xmlTag = "Dgst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Digest";
			definition = "Result of data-digesting process.";
			previousVersion_lazy = () -> DigestedData4.mmDigest;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Max140Binary getValue(DigestedData5 obj) {
			return obj.getDigest();
		}

		@Override
		public void setValue(DigestedData5 obj, Max140Binary value) {
			obj.setDigest(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DigestedData5.mmVersion, com.tools20022.repository.msg.DigestedData5.mmDigestAlgorithm,
						com.tools20022.repository.msg.DigestedData5.mmEncapsulatedContent, com.tools20022.repository.msg.DigestedData5.mmDigest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DigestedData5";
				definition = "Digest computed on the identified data.";
				previousVersion_lazy = () -> DigestedData4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public DigestedData5 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public AlgorithmIdentification21 getDigestAlgorithm() {
		return digestAlgorithm;
	}

	public DigestedData5 setDigestAlgorithm(AlgorithmIdentification21 digestAlgorithm) {
		this.digestAlgorithm = Objects.requireNonNull(digestAlgorithm);
		return this;
	}

	public EncapsulatedContent3 getEncapsulatedContent() {
		return encapsulatedContent;
	}

	public DigestedData5 setEncapsulatedContent(EncapsulatedContent3 encapsulatedContent) {
		this.encapsulatedContent = Objects.requireNonNull(encapsulatedContent);
		return this;
	}

	public Max140Binary getDigest() {
		return digest;
	}

	public DigestedData5 setDigest(Max140Binary digest) {
		this.digest = Objects.requireNonNull(digest);
		return this;
	}
}
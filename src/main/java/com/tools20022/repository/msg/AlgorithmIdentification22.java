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
import com.tools20022.repository.codeset.Algorithm17Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Parameter7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a cryptographic algorithm and parameters for the MAC
 * computation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification22#mmAlgorithm
 * AlgorithmIdentification22.mmAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification22#mmParameter
 * AlgorithmIdentification22.mmParameter}</li>
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
 * "AlgorithmIdentification22"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a cryptographic algorithm and parameters for the MAC computation."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification15
 * AlgorithmIdentification15}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AlgorithmIdentification22", propOrder = {"algorithm", "parameter"})
public class AlgorithmIdentification22 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Algo", required = true)
	protected Algorithm17Code algorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification22
	 * AlgorithmIdentification22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Algo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Algorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the MAC algorithm."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification15#mmAlgorithm
	 * AlgorithmIdentification15.mmAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AlgorithmIdentification22, Algorithm17Code> mmAlgorithm = new MMMessageAttribute<AlgorithmIdentification22, Algorithm17Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AlgorithmIdentification22.mmObject();
			isDerived = false;
			xmlTag = "Algo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Algorithm";
			definition = "Identification of the MAC algorithm.";
			previousVersion_lazy = () -> AlgorithmIdentification15.mmAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Algorithm17Code.mmObject();
		}

		@Override
		public Algorithm17Code getValue(AlgorithmIdentification22 obj) {
			return obj.getAlgorithm();
		}

		@Override
		public void setValue(AlgorithmIdentification22 obj, Algorithm17Code value) {
			obj.setAlgorithm(value);
		}
	};
	@XmlElement(name = "Param")
	protected Parameter7 parameter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Parameter7 Parameter7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification22
	 * AlgorithmIdentification22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Param"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters associated to the MAC algorithm."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification15#mmParameter
	 * AlgorithmIdentification15.mmParameter}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AlgorithmIdentification22, Optional<Parameter7>> mmParameter = new MMMessageAssociationEnd<AlgorithmIdentification22, Optional<Parameter7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AlgorithmIdentification22.mmObject();
			isDerived = false;
			xmlTag = "Param";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameter";
			definition = "Parameters associated to the MAC algorithm.";
			previousVersion_lazy = () -> AlgorithmIdentification15.mmParameter;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Parameter7.mmObject();
		}

		@Override
		public Optional<Parameter7> getValue(AlgorithmIdentification22 obj) {
			return obj.getParameter();
		}

		@Override
		public void setValue(AlgorithmIdentification22 obj, Optional<Parameter7> value) {
			obj.setParameter(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlgorithmIdentification22.mmAlgorithm, com.tools20022.repository.msg.AlgorithmIdentification22.mmParameter);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AlgorithmIdentification22";
				definition = "Identification of a cryptographic algorithm and parameters for the MAC computation.";
				previousVersion_lazy = () -> AlgorithmIdentification15.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Algorithm17Code getAlgorithm() {
		return algorithm;
	}

	public AlgorithmIdentification22 setAlgorithm(Algorithm17Code algorithm) {
		this.algorithm = Objects.requireNonNull(algorithm);
		return this;
	}

	public Optional<Parameter7> getParameter() {
		return parameter == null ? Optional.empty() : Optional.of(parameter);
	}

	public AlgorithmIdentification22 setParameter(Parameter7 parameter) {
		this.parameter = parameter;
		return this;
	}
}
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
import com.tools20022.repository.codeset.CryptographicKeyType2Code;
import com.tools20022.repository.codeset.KeyUsage1Code;
import com.tools20022.repository.datatype.Exact10Text;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Binary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContentInformationType7;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Cryptographic Key to exchange.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey4#mmIdentification
 * CryptographicKey4.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey4#mmAdditionalIdentification
 * CryptographicKey4.mmAdditionalIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey4#mmVersion
 * CryptographicKey4.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey4#mmType
 * CryptographicKey4.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey4#mmFunction
 * CryptographicKey4.mmFunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey4#mmActivationDate
 * CryptographicKey4.mmActivationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey4#mmDeactivationDate
 * CryptographicKey4.mmDeactivationDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey4#mmKeyValue
 * CryptographicKey4.mmKeyValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CryptographicKey4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cryptographic Key to exchange."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey5
 * CryptographicKey5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CryptographicKey2
 * CryptographicKey2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CryptographicKey4", propOrder = {"identification", "additionalIdentification", "version", "type", "function", "activationDate", "deactivationDate", "keyValue"})
public class CryptographicKey4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max140Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4
	 * CryptographicKey4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey5#mmIdentification
	 * CryptographicKey5.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2#mmIdentification
	 * CryptographicKey2.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey4, Max140Text> mmIdentification = new MMMessageAttribute<CryptographicKey4, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey4.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Name of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey5.mmIdentification);
			previousVersion_lazy = () -> CryptographicKey2.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(CryptographicKey4 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(CryptographicKey4 obj, Max140Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "AddtlId")
	protected Max35Binary additionalIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Binary
	 * Max35Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4
	 * CryptographicKey4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional identification of the key.\r\nUsage\r\nFor derived unique key per transaction (DUKPT) keys, the key serial number (KSN) with the 21 bits of the transaction counter set to zero."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey5#mmAdditionalIdentification
	 * CryptographicKey5.mmAdditionalIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2#mmAdditionalIdentification
	 * CryptographicKey2.mmAdditionalIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey4, Optional<Max35Binary>> mmAdditionalIdentification = new MMMessageAttribute<CryptographicKey4, Optional<Max35Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey4.mmObject();
			isDerived = false;
			xmlTag = "AddtlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalIdentification";
			definition = "Additional identification of the key.\r\nUsage\r\nFor derived unique key per transaction (DUKPT) keys, the key serial number (KSN) with the 21 bits of the transaction counter set to zero.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey5.mmAdditionalIdentification);
			previousVersion_lazy = () -> CryptographicKey2.mmAdditionalIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}

		@Override
		public Optional<Max35Binary> getValue(CryptographicKey4 obj) {
			return obj.getAdditionalIdentification();
		}

		@Override
		public void setValue(CryptographicKey4 obj, Optional<Max35Binary> value) {
			obj.setAdditionalIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Vrsn", required = true)
	protected Exact10Text version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Exact10Text
	 * Exact10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4
	 * CryptographicKey4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey5#mmVersion
	 * CryptographicKey5.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2#mmVersion
	 * CryptographicKey2.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey4, Exact10Text> mmVersion = new MMMessageAttribute<CryptographicKey4, Exact10Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey4.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey5.mmVersion);
			previousVersion_lazy = () -> CryptographicKey2.mmVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact10Text.mmObject();
		}

		@Override
		public Exact10Text getValue(CryptographicKey4 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(CryptographicKey4 obj, Exact10Text value) {
			obj.setVersion(value);
		}
	};
	@XmlElement(name = "Tp")
	protected CryptographicKeyType2Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType2Code
	 * CryptographicKeyType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4
	 * CryptographicKey4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of algorithm used by the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey5#mmType
	 * CryptographicKey5.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2#mmType
	 * CryptographicKey2.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey4, Optional<CryptographicKeyType2Code>> mmType = new MMMessageAttribute<CryptographicKey4, Optional<CryptographicKeyType2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of algorithm used by the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey5.mmType);
			previousVersion_lazy = () -> CryptographicKey2.mmType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CryptographicKeyType2Code.mmObject();
		}

		@Override
		public Optional<CryptographicKeyType2Code> getValue(CryptographicKey4 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CryptographicKey4 obj, Optional<CryptographicKeyType2Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Fctn", required = true)
	protected List<KeyUsage1Code> function;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4
	 * CryptographicKey4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Function"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allowed usage of the key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey5#mmFunction
	 * CryptographicKey5.mmFunction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2#mmFunction
	 * CryptographicKey2.mmFunction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey4, List<KeyUsage1Code>> mmFunction = new MMMessageAttribute<CryptographicKey4, List<KeyUsage1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey4.mmObject();
			isDerived = false;
			xmlTag = "Fctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Function";
			definition = "Allowed usage of the key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey5.mmFunction);
			previousVersion_lazy = () -> CryptographicKey2.mmFunction;
			minOccurs = 1;
			simpleType_lazy = () -> KeyUsage1Code.mmObject();
		}

		@Override
		public List<KeyUsage1Code> getValue(CryptographicKey4 obj) {
			return obj.getFunction();
		}

		@Override
		public void setValue(CryptographicKey4 obj, List<KeyUsage1Code> value) {
			obj.setFunction(value);
		}
	};
	@XmlElement(name = "ActvtnDt")
	protected ISODateTime activationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4
	 * CryptographicKey4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time on which the key must be activated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey5#mmActivationDate
	 * CryptographicKey5.mmActivationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2#mmActivationDate
	 * CryptographicKey2.mmActivationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey4, Optional<ISODateTime>> mmActivationDate = new MMMessageAttribute<CryptographicKey4, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey4.mmObject();
			isDerived = false;
			xmlTag = "ActvtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivationDate";
			definition = "Date and time on which the key must be activated.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey5.mmActivationDate);
			previousVersion_lazy = () -> CryptographicKey2.mmActivationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CryptographicKey4 obj) {
			return obj.getActivationDate();
		}

		@Override
		public void setValue(CryptographicKey4 obj, Optional<ISODateTime> value) {
			obj.setActivationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DeactvtnDt")
	protected ISODateTime deactivationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4
	 * CryptographicKey4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeactvtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time on which the key must be deactivated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey5#mmDeactivationDate
	 * CryptographicKey5.mmDeactivationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2#mmDeactivationDate
	 * CryptographicKey2.mmDeactivationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey4, Optional<ISODateTime>> mmDeactivationDate = new MMMessageAttribute<CryptographicKey4, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey4.mmObject();
			isDerived = false;
			xmlTag = "DeactvtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivationDate";
			definition = "Date and time on which the key must be deactivated.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey5.mmDeactivationDate);
			previousVersion_lazy = () -> CryptographicKey2.mmDeactivationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CryptographicKey4 obj) {
			return obj.getDeactivationDate();
		}

		@Override
		public void setValue(CryptographicKey4 obj, Optional<ISODateTime> value) {
			obj.setDeactivationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "KeyVal", required = true)
	protected ContentInformationType7 keyValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType7
	 * ContentInformationType7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey4
	 * CryptographicKey4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey5#mmKeyValue
	 * CryptographicKey5.mmKeyValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2#mmKeyValue
	 * CryptographicKey2.mmKeyValue}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CryptographicKey4, ContentInformationType7> mmKeyValue = new MMMessageAssociationEnd<CryptographicKey4, ContentInformationType7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey4.mmObject();
			isDerived = false;
			xmlTag = "KeyVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyValue";
			definition = "Encrypted cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey5.mmKeyValue);
			previousVersion_lazy = () -> CryptographicKey2.mmKeyValue;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ContentInformationType7.mmObject();
		}

		@Override
		public ContentInformationType7 getValue(CryptographicKey4 obj) {
			return obj.getKeyValue();
		}

		@Override
		public void setValue(CryptographicKey4 obj, ContentInformationType7 value) {
			obj.setKeyValue(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CryptographicKey4.mmIdentification, com.tools20022.repository.msg.CryptographicKey4.mmAdditionalIdentification,
						com.tools20022.repository.msg.CryptographicKey4.mmVersion, com.tools20022.repository.msg.CryptographicKey4.mmType, com.tools20022.repository.msg.CryptographicKey4.mmFunction,
						com.tools20022.repository.msg.CryptographicKey4.mmActivationDate, com.tools20022.repository.msg.CryptographicKey4.mmDeactivationDate, com.tools20022.repository.msg.CryptographicKey4.mmKeyValue);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CryptographicKey4";
				definition = "Cryptographic Key to exchange.";
				nextVersions_lazy = () -> Arrays.asList(CryptographicKey5.mmObject());
				previousVersion_lazy = () -> CryptographicKey2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getIdentification() {
		return identification;
	}

	public CryptographicKey4 setIdentification(Max140Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max35Binary> getAdditionalIdentification() {
		return additionalIdentification == null ? Optional.empty() : Optional.of(additionalIdentification);
	}

	public CryptographicKey4 setAdditionalIdentification(Max35Binary additionalIdentification) {
		this.additionalIdentification = additionalIdentification;
		return this;
	}

	public Exact10Text getVersion() {
		return version;
	}

	public CryptographicKey4 setVersion(Exact10Text version) {
		this.version = Objects.requireNonNull(version);
		return this;
	}

	public Optional<CryptographicKeyType2Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public CryptographicKey4 setType(CryptographicKeyType2Code type) {
		this.type = type;
		return this;
	}

	public List<KeyUsage1Code> getFunction() {
		return function == null ? function = new ArrayList<>() : function;
	}

	public CryptographicKey4 setFunction(List<KeyUsage1Code> function) {
		this.function = Objects.requireNonNull(function);
		return this;
	}

	public Optional<ISODateTime> getActivationDate() {
		return activationDate == null ? Optional.empty() : Optional.of(activationDate);
	}

	public CryptographicKey4 setActivationDate(ISODateTime activationDate) {
		this.activationDate = activationDate;
		return this;
	}

	public Optional<ISODateTime> getDeactivationDate() {
		return deactivationDate == null ? Optional.empty() : Optional.of(deactivationDate);
	}

	public CryptographicKey4 setDeactivationDate(ISODateTime deactivationDate) {
		this.deactivationDate = deactivationDate;
		return this;
	}

	public ContentInformationType7 getKeyValue() {
		return keyValue;
	}

	public CryptographicKey4 setKeyValue(ContentInformationType7 keyValue) {
		this.keyValue = Objects.requireNonNull(keyValue);
		return this;
	}
}
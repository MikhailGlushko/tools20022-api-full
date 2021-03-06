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
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Max35Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.NetworkAccess;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NetworkParameters4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters to communicate with a host.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NetworkParameters3#mmAddress
 * NetworkParameters3.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetworkParameters3#mmUserName
 * NetworkParameters3.mmUserName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters3#mmAccessCode
 * NetworkParameters3.mmAccessCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters3#mmServerCertificate
 * NetworkParameters3.mmServerCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetworkParameters3#mmServerCertificateIdentifier
 * NetworkParameters3.mmServerCertificateIdentifier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.NetworkAccess
 * NetworkAccess}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NetworkParameters3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters to communicate with a host."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NetworkParameters4
 * NetworkParameters4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetworkParameters5
 * NetworkParameters5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetworkParameters6
 * NetworkParameters6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.NetworkParameters1
 * NetworkParameters1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NetworkParameters3", propOrder = {"address", "userName", "accessCode", "serverCertificate", "serverCertificateIdentifier"})
public class NetworkParameters3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Adr", required = true)
	protected List<NetworkParameters4> address;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters4
	 * NetworkParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters3
	 * NetworkParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Adr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Address"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Network addresses of the host."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters5#mmAddress
	 * NetworkParameters5.mmAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NetworkParameters3, List<NetworkParameters4>> mmAddress = new MMMessageAssociationEnd<NetworkParameters3, List<NetworkParameters4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetworkParameters3.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Network addresses of the host.";
			nextVersions_lazy = () -> Arrays.asList(NetworkParameters5.mmAddress);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NetworkParameters4.mmObject();
		}

		@Override
		public List<NetworkParameters4> getValue(NetworkParameters3 obj) {
			return obj.getAddress();
		}

		@Override
		public void setValue(NetworkParameters3 obj, List<NetworkParameters4> value) {
			obj.setAddress(value);
		}
	};
	@XmlElement(name = "UsrNm")
	protected Max35Text userName;
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
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmUserName
	 * NetworkAccess.mmUserName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters3
	 * NetworkParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "User name identifying the client."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters5#mmUserName
	 * NetworkParameters5.mmUserName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters1#mmUserName
	 * NetworkParameters1.mmUserName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetworkParameters3, Optional<Max35Text>> mmUserName = new MMMessageAttribute<NetworkParameters3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> NetworkAccess.mmUserName;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetworkParameters3.mmObject();
			isDerived = false;
			xmlTag = "UsrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserName";
			definition = "User name identifying the client.";
			nextVersions_lazy = () -> Arrays.asList(NetworkParameters5.mmUserName);
			previousVersion_lazy = () -> NetworkParameters1.mmUserName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(NetworkParameters3 obj) {
			return obj.getUserName();
		}

		@Override
		public void setValue(NetworkParameters3 obj, Optional<Max35Text> value) {
			obj.setUserName(value.orElse(null));
		}
	};
	@XmlElement(name = "AccsCd")
	protected Max35Binary accessCode;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmAccessCode
	 * NetworkAccess.mmAccessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters3
	 * NetworkParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccsCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccessCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Password authenticating the client."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters5#mmAccessCode
	 * NetworkParameters5.mmAccessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters6#mmAccess
	 * NetworkParameters6.mmAccess}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters1#mmAccessCode
	 * NetworkParameters1.mmAccessCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetworkParameters3, Optional<Max35Binary>> mmAccessCode = new MMMessageAttribute<NetworkParameters3, Optional<Max35Binary>>() {
		{
			businessElementTrace_lazy = () -> NetworkAccess.mmAccessCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetworkParameters3.mmObject();
			isDerived = false;
			xmlTag = "AccsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccessCode";
			definition = "Password authenticating the client.";
			nextVersions_lazy = () -> Arrays.asList(NetworkParameters5.mmAccessCode, NetworkParameters6.mmAccess);
			previousVersion_lazy = () -> NetworkParameters1.mmAccessCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}

		@Override
		public Optional<Max35Binary> getValue(NetworkParameters3 obj) {
			return obj.getAccessCode();
		}

		@Override
		public void setValue(NetworkParameters3 obj, Optional<Max35Binary> value) {
			obj.setAccessCode(value.orElse(null));
		}
	};
	@XmlElement(name = "SvrCert")
	protected List<Max3000Binary> serverCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3000Binary
	 * Max3000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters3
	 * NetworkParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvrCert"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServerCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "X.509 Certificate required to authenticate the server."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters5#mmServerCertificate
	 * NetworkParameters5.mmServerCertificate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetworkParameters3, List<Max3000Binary>> mmServerCertificate = new MMMessageAttribute<NetworkParameters3, List<Max3000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetworkParameters3.mmObject();
			isDerived = false;
			xmlTag = "SvrCert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServerCertificate";
			definition = "X.509 Certificate required to authenticate the server.";
			nextVersions_lazy = () -> Arrays.asList(NetworkParameters5.mmServerCertificate);
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}

		@Override
		public List<Max3000Binary> getValue(NetworkParameters3 obj) {
			return obj.getServerCertificate();
		}

		@Override
		public void setValue(NetworkParameters3 obj, List<Max3000Binary> value) {
			obj.setServerCertificate(value);
		}
	};
	@XmlElement(name = "SvrCertIdr")
	protected List<Max140Binary> serverCertificateIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters3
	 * NetworkParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvrCertIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServerCertificateIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the X.509 Certificate required to authenticate the server, for instance a digest of the certificate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetworkParameters5#mmServerCertificateIdentifier
	 * NetworkParameters5.mmServerCertificateIdentifier}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetworkParameters3, List<Max140Binary>> mmServerCertificateIdentifier = new MMMessageAttribute<NetworkParameters3, List<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetworkParameters3.mmObject();
			isDerived = false;
			xmlTag = "SvrCertIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServerCertificateIdentifier";
			definition = "Identification of the X.509 Certificate required to authenticate the server, for instance a digest of the certificate.";
			nextVersions_lazy = () -> Arrays.asList(NetworkParameters5.mmServerCertificateIdentifier);
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public List<Max140Binary> getValue(NetworkParameters3 obj) {
			return obj.getServerCertificateIdentifier();
		}

		@Override
		public void setValue(NetworkParameters3 obj, List<Max140Binary> value) {
			obj.setServerCertificateIdentifier(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetworkParameters3.mmAddress, com.tools20022.repository.msg.NetworkParameters3.mmUserName,
						com.tools20022.repository.msg.NetworkParameters3.mmAccessCode, com.tools20022.repository.msg.NetworkParameters3.mmServerCertificate, com.tools20022.repository.msg.NetworkParameters3.mmServerCertificateIdentifier);
				trace_lazy = () -> NetworkAccess.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetworkParameters3";
				definition = "Parameters to communicate with a host.";
				nextVersions_lazy = () -> Arrays.asList(NetworkParameters4.mmObject(), NetworkParameters5.mmObject(), NetworkParameters6.mmObject());
				previousVersion_lazy = () -> NetworkParameters1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<NetworkParameters4> getAddress() {
		return address == null ? address = new ArrayList<>() : address;
	}

	public NetworkParameters3 setAddress(List<NetworkParameters4> address) {
		this.address = Objects.requireNonNull(address);
		return this;
	}

	public Optional<Max35Text> getUserName() {
		return userName == null ? Optional.empty() : Optional.of(userName);
	}

	public NetworkParameters3 setUserName(Max35Text userName) {
		this.userName = userName;
		return this;
	}

	public Optional<Max35Binary> getAccessCode() {
		return accessCode == null ? Optional.empty() : Optional.of(accessCode);
	}

	public NetworkParameters3 setAccessCode(Max35Binary accessCode) {
		this.accessCode = accessCode;
		return this;
	}

	public List<Max3000Binary> getServerCertificate() {
		return serverCertificate == null ? serverCertificate = new ArrayList<>() : serverCertificate;
	}

	public NetworkParameters3 setServerCertificate(List<Max3000Binary> serverCertificate) {
		this.serverCertificate = Objects.requireNonNull(serverCertificate);
		return this;
	}

	public List<Max140Binary> getServerCertificateIdentifier() {
		return serverCertificateIdentifier == null ? serverCertificateIdentifier = new ArrayList<>() : serverCertificateIdentifier;
	}

	public NetworkParameters3 setServerCertificateIdentifier(List<Max140Binary> serverCertificateIdentifier) {
		this.serverCertificateIdentifier = Objects.requireNonNull(serverCertificateIdentifier);
		return this;
	}
}
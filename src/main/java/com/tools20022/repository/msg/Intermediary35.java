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
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.choice.Role4Choice;
import com.tools20022.repository.entity.AccountPartyRole;
import com.tools20022.repository.entity.IntermediaryRole;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.RolePlayer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Account20;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Party that provides services to investors relating to financial products.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary35#mmIdentification
 * Intermediary35.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary35#mmAccount
 * Intermediary35.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary35#mmRole
 * Intermediary35.mmRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IntermediaryRole
 * IntermediaryRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Intermediary35"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that provides services to investors relating to financial products."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary42 Intermediary42}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Intermediary34
 * Intermediary34}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Intermediary35", propOrder = {"identification", "account", "role"})
public class Intermediary35 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected PartyIdentification70Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary35 Intermediary35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identifier of the intermediary."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary42#mmIdentification
	 * Intermediary42.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary34#mmIdentification
	 * Intermediary34.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Intermediary35, PartyIdentification70Choice> mmIdentification = new MMMessageAttribute<Intermediary35, PartyIdentification70Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary35.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier of the intermediary.";
			nextVersions_lazy = () -> Arrays.asList(Intermediary42.mmIdentification);
			previousVersion_lazy = () -> Intermediary34.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification70Choice.mmObject();
		}

		@Override
		public PartyIdentification70Choice getValue(Intermediary35 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Intermediary35 obj, PartyIdentification70Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Acct")
	protected Account20 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Account20 Account20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountPartyRole#mmAccount
	 * AccountPartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary35 Intermediary35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business relationship between two entities; one entity is the account owner, the other entity is the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary42#mmAccount
	 * Intermediary42.mmAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary34#mmAccount
	 * Intermediary34.mmAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Intermediary35, Optional<Account20>> mmAccount = new MMMessageAssociationEnd<Intermediary35, Optional<Account20>>() {
		{
			businessElementTrace_lazy = () -> AccountPartyRole.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary35.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Business relationship between two entities; one entity is the account owner, the other entity is the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(Intermediary42.mmAccount);
			previousVersion_lazy = () -> Intermediary34.mmAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Account20.mmObject();
		}

		@Override
		public Optional<Account20> getValue(Intermediary35 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(Intermediary35 obj, Optional<Account20> value) {
			obj.setAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "Role")
	protected Role4Choice role;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Role4Choice
	 * Role4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer#mmRole
	 * RolePlayer.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary35 Intermediary35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Role"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Function performed by the intermediary."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary42#mmRole
	 * Intermediary42.mmRole}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary34#mmRole
	 * Intermediary34.mmRole}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Intermediary35, Optional<Role4Choice>> mmRole = new MMMessageAssociationEnd<Intermediary35, Optional<Role4Choice>>() {
		{
			businessElementTrace_lazy = () -> RolePlayer.mmRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary35.mmObject();
			isDerived = false;
			xmlTag = "Role";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Role";
			definition = "Function performed by the intermediary.";
			nextVersions_lazy = () -> Arrays.asList(Intermediary42.mmRole);
			previousVersion_lazy = () -> Intermediary34.mmRole;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Role4Choice.mmObject();
		}

		@Override
		public Optional<Role4Choice> getValue(Intermediary35 obj) {
			return obj.getRole();
		}

		@Override
		public void setValue(Intermediary35 obj, Optional<Role4Choice> value) {
			obj.setRole(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary35.mmIdentification, com.tools20022.repository.msg.Intermediary35.mmAccount, com.tools20022.repository.msg.Intermediary35.mmRole);
				trace_lazy = () -> IntermediaryRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Intermediary35";
				definition = "Party that provides services to investors relating to financial products.";
				nextVersions_lazy = () -> Arrays.asList(Intermediary42.mmObject());
				previousVersion_lazy = () -> Intermediary34.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification70Choice getIdentification() {
		return identification;
	}

	public Intermediary35 setIdentification(PartyIdentification70Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Account20> getAccount() {
		return account == null ? Optional.empty() : Optional.of(account);
	}

	public Intermediary35 setAccount(Account20 account) {
		this.account = account;
		return this;
	}

	public Optional<Role4Choice> getRole() {
		return role == null ? Optional.empty() : Optional.of(role);
	}

	public Intermediary35 setRole(Role4Choice role) {
		this.role = role;
		return this;
	}
}
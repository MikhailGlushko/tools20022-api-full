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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification33Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.ContactPersonRole;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContactIdentification2;
import com.tools20022.repository.msg.SubAccount1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Party involved in the settlement chain.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#mmPartyIdentification
 * PartyIdentificationAndAccount32.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#mmAccountIdentification
 * PartyIdentificationAndAccount32.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#mmProcessingIdentification
 * PartyIdentificationAndAccount32.mmProcessingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#mmProcessingDate
 * PartyIdentificationAndAccount32.mmProcessingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#mmSubAccountDetails
 * PartyIdentificationAndAccount32.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#mmContactPerson
 * PartyIdentificationAndAccount32.mmContactPerson}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentificationAndAccount32"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party involved in the settlement chain."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102
 * PartyIdentificationAndAccount102}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentificationAndAccount32", propOrder = {"partyIdentification", "accountIdentification", "processingIdentification", "processingDate", "subAccountDetails", "contactPerson"})
public class PartyIdentificationAndAccount32 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtyId", required = true)
	protected PartyIdentification33Choice partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice
	 * PartyIdentification33Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32
	 * PartyIdentificationAndAccount32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#mmPartyIdentification
	 * PartyIdentificationAndAccount102.mmPartyIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationAndAccount32, PartyIdentification33Choice> mmPartyIdentification = new MMMessageAttribute<PartyIdentificationAndAccount32, PartyIdentification33Choice>() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount32.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount102.mmPartyIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification33Choice.mmObject();
		}

		@Override
		public PartyIdentification33Choice getValue(PartyIdentificationAndAccount32 obj) {
			return obj.getPartyIdentification();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount32 obj, PartyIdentification33Choice value) {
			obj.setPartyIdentification(value);
		}
	};
	@XmlElement(name = "AcctId")
	protected Max35Text accountIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32
	 * PartyIdentificationAndAccount32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the account owned by the party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#mmAccountIdentification
	 * PartyIdentificationAndAccount102.mmAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationAndAccount32, Optional<Max35Text>> mmAccountIdentification = new MMMessageAttribute<PartyIdentificationAndAccount32, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount32.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Identification of the account owned by the party.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount102.mmAccountIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PartyIdentificationAndAccount32 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount32 obj, Optional<Max35Text> value) {
			obj.setAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgId")
	protected Max35Text processingIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32
	 * PartyIdentificationAndAccount32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference of the transaction at the party identified in the sequence."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#mmProcessingIdentification
	 * PartyIdentificationAndAccount102.mmProcessingIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationAndAccount32, Optional<Max35Text>> mmProcessingIdentification = new MMMessageAttribute<PartyIdentificationAndAccount32, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount32.mmObject();
			isDerived = false;
			xmlTag = "PrcgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingIdentification";
			definition = "Specifies the reference of the transaction at the party identified in the sequence.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount102.mmProcessingIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PartyIdentificationAndAccount32 obj) {
			return obj.getProcessingIdentification();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount32 obj, Optional<Max35Text> value) {
			obj.setProcessingIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgDt")
	protected DateAndDateTimeChoice processingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32
	 * PartyIdentificationAndAccount32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and optionally the time, at which this transaction was processed by the party identified in this sequence."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#mmProcessingDate
	 * PartyIdentificationAndAccount102.mmProcessingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationAndAccount32, Optional<DateAndDateTimeChoice>> mmProcessingDate = new MMMessageAttribute<PartyIdentificationAndAccount32, Optional<DateAndDateTimeChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount32.mmObject();
			isDerived = false;
			xmlTag = "PrcgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingDate";
			definition = "Date and optionally the time, at which this transaction was processed by the party identified in this sequence.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount102.mmProcessingDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(PartyIdentificationAndAccount32 obj) {
			return obj.getProcessingDate();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount32 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setProcessingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected SubAccount1 subAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubAccount1
	 * SubAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmSubAccount
	 * Account.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32
	 * PartyIdentificationAndAccount32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetails"</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#mmSubAccount
	 * PartyIdentificationAndAccount102.mmSubAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentificationAndAccount32, Optional<SubAccount1>> mmSubAccountDetails = new MMMessageAssociationEnd<PartyIdentificationAndAccount32, Optional<SubAccount1>>() {
		{
			businessElementTrace_lazy = () -> Account.mmSubAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount32.mmObject();
			isDerived = false;
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Business relationship between two entities; one entity is the account owner, the other entity is the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount102.mmSubAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SubAccount1.mmObject();
		}

		@Override
		public Optional<SubAccount1> getValue(PartyIdentificationAndAccount32 obj) {
			return obj.getSubAccountDetails();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount32 obj, Optional<SubAccount1> value) {
			obj.setSubAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctPrsn")
	protected ContactIdentification2 contactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContactIdentification2
	 * ContactIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32
	 * PartyIdentificationAndAccount32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctPrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact person and contact information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#mmContactPerson
	 * PartyIdentificationAndAccount102.mmContactPerson}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentificationAndAccount32, Optional<ContactIdentification2>> mmContactPerson = new MMMessageAssociationEnd<PartyIdentificationAndAccount32, Optional<ContactIdentification2>>() {
		{
			businessComponentTrace_lazy = () -> ContactPersonRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount32.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPerson";
			definition = "Contact person and contact information.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount102.mmContactPerson);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContactIdentification2.mmObject();
		}

		@Override
		public Optional<ContactIdentification2> getValue(PartyIdentificationAndAccount32 obj) {
			return obj.getContactPerson();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount32 obj, Optional<ContactIdentification2> value) {
			obj.setContactPerson(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentificationAndAccount32.mmPartyIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount32.mmAccountIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount32.mmProcessingIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount32.mmProcessingDate,
						com.tools20022.repository.msg.PartyIdentificationAndAccount32.mmSubAccountDetails, com.tools20022.repository.msg.PartyIdentificationAndAccount32.mmContactPerson);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationAndAccount32";
				definition = "Party involved in the settlement chain.";
				nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount102.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification33Choice getPartyIdentification() {
		return partyIdentification;
	}

	public PartyIdentificationAndAccount32 setPartyIdentification(PartyIdentification33Choice partyIdentification) {
		this.partyIdentification = Objects.requireNonNull(partyIdentification);
		return this;
	}

	public Optional<Max35Text> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public PartyIdentificationAndAccount32 setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public Optional<Max35Text> getProcessingIdentification() {
		return processingIdentification == null ? Optional.empty() : Optional.of(processingIdentification);
	}

	public PartyIdentificationAndAccount32 setProcessingIdentification(Max35Text processingIdentification) {
		this.processingIdentification = processingIdentification;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getProcessingDate() {
		return processingDate == null ? Optional.empty() : Optional.of(processingDate);
	}

	public PartyIdentificationAndAccount32 setProcessingDate(DateAndDateTimeChoice processingDate) {
		this.processingDate = processingDate;
		return this;
	}

	public Optional<SubAccount1> getSubAccountDetails() {
		return subAccountDetails == null ? Optional.empty() : Optional.of(subAccountDetails);
	}

	public PartyIdentificationAndAccount32 setSubAccountDetails(SubAccount1 subAccountDetails) {
		this.subAccountDetails = subAccountDetails;
		return this;
	}

	public Optional<ContactIdentification2> getContactPerson() {
		return contactPerson == null ? Optional.empty() : Optional.of(contactPerson);
	}

	public PartyIdentificationAndAccount32 setContactPerson(ContactIdentification2 contactPerson) {
		this.contactPerson = contactPerson;
		return this;
	}
}
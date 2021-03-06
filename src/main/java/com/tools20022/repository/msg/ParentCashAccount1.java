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
import com.tools20022.repository.codeset.AccountLevel1Code;
import com.tools20022.repository.entity.AccountServicerRole;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.msg.CashAccount16;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the cash account elements of a parent cash account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount1#mmLevel
 * ParentCashAccount1.mmLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ParentCashAccount1#mmIdentification
 * ParentCashAccount1.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount1#mmServicer
 * ParentCashAccount1.mmServicer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ParentCashAccount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash account elements of a parent cash account."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount2
 * ParentCashAccount2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ParentCashAccount1", propOrder = {"level", "identification", "servicer"})
public class ParentCashAccount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Lvl")
	protected AccountLevel1Code level;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountLevel1Code
	 * AccountLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmLevel
	 * CashAccount.mmLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParentCashAccount1
	 * ParentCashAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lvl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the parent account level within a hierarchy."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ParentCashAccount2#mmLevel
	 * ParentCashAccount2.mmLevel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ParentCashAccount1, Optional<AccountLevel1Code>> mmLevel = new MMMessageAttribute<ParentCashAccount1, Optional<AccountLevel1Code>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmLevel;
			componentContext_lazy = () -> com.tools20022.repository.msg.ParentCashAccount1.mmObject();
			isDerived = false;
			xmlTag = "Lvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level";
			definition = "Defines the parent account level within a hierarchy.";
			nextVersions_lazy = () -> Arrays.asList(ParentCashAccount2.mmLevel);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccountLevel1Code.mmObject();
		}

		@Override
		public Optional<AccountLevel1Code> getValue(ParentCashAccount1 obj) {
			return obj.getLevel();
		}

		@Override
		public void setValue(ParentCashAccount1 obj, Optional<AccountLevel1Code> value) {
			obj.setLevel(value.orElse(null));
		}
	};
	@XmlElement(name = "Id", required = true)
	protected CashAccount16 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParentCashAccount1
	 * ParentCashAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the parent account between the parent account owner and the parent account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ParentCashAccount2#mmIdentification
	 * ParentCashAccount2.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ParentCashAccount1, CashAccount16> mmIdentification = new MMMessageAttribute<ParentCashAccount1, CashAccount16>() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ParentCashAccount1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the parent account between the parent account owner and the parent account servicer.";
			nextVersions_lazy = () -> Arrays.asList(ParentCashAccount2.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CashAccount16.mmObject();
		}

		@Override
		public CashAccount16 getValue(ParentCashAccount1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(ParentCashAccount1 obj, CashAccount16 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Svcr")
	protected BranchAndFinancialInstitutionIdentification5 servicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountServicerRole
	 * AccountServicerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ParentCashAccount1
	 * ParentCashAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Svcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Servicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution in which the parent account resides."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ParentCashAccount2#mmServicer
	 * ParentCashAccount2.mmServicer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ParentCashAccount1, Optional<BranchAndFinancialInstitutionIdentification5>> mmServicer = new MMMessageAttribute<ParentCashAccount1, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessComponentTrace_lazy = () -> AccountServicerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ParentCashAccount1.mmObject();
			isDerived = false;
			xmlTag = "Svcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Servicer";
			definition = "Financial institution in which the parent account resides.";
			nextVersions_lazy = () -> Arrays.asList(ParentCashAccount2.mmServicer);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(ParentCashAccount1 obj) {
			return obj.getServicer();
		}

		@Override
		public void setValue(ParentCashAccount1 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setServicer(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ParentCashAccount1.mmLevel, com.tools20022.repository.msg.ParentCashAccount1.mmIdentification,
						com.tools20022.repository.msg.ParentCashAccount1.mmServicer);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ParentCashAccount1";
				definition = "Specifies the cash account elements of a parent cash account.";
				nextVersions_lazy = () -> Arrays.asList(ParentCashAccount2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AccountLevel1Code> getLevel() {
		return level == null ? Optional.empty() : Optional.of(level);
	}

	public ParentCashAccount1 setLevel(AccountLevel1Code level) {
		this.level = level;
		return this;
	}

	public CashAccount16 getIdentification() {
		return identification;
	}

	public ParentCashAccount1 setIdentification(CashAccount16 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getServicer() {
		return servicer == null ? Optional.empty() : Optional.of(servicer);
	}

	public ParentCashAccount1 setServicer(BranchAndFinancialInstitutionIdentification5 servicer) {
		this.servicer = servicer;
		return this;
	}
}
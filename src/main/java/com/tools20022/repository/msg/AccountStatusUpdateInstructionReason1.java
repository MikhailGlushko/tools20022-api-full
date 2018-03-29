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
import com.tools20022.repository.choice.AccountStatusUpdateInstructionReason2Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reason for an update to an account status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1#mmCode
 * AccountStatusUpdateInstructionReason1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1#mmAdditionalInformation
 * AccountStatusUpdateInstructionReason1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReasonElementRule#forAccountStatusUpdateInstructionReason1
 * ConstraintReasonElementRule.forAccountStatusUpdateInstructionReason1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountStatusUpdateInstructionReason1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for an update to an account status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.EnabledStatusReason1
 * EnabledStatusReason1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountStatusUpdateInstructionReason1", propOrder = {"code", "additionalInformation"})
public class AccountStatusUpdateInstructionReason1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd")
	protected AccountStatusUpdateInstructionReason2Choice code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountStatusUpdateInstructionReason2Choice
	 * AccountStatusUpdateInstructionReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1
	 * AccountStatusUpdateInstructionReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the instruction to change the account status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EnabledStatusReason1#mmCode
	 * EnabledStatusReason1.mmCode}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountStatusUpdateInstructionReason1, Optional<AccountStatusUpdateInstructionReason2Choice>> mmCode = new MMMessageAssociationEnd<AccountStatusUpdateInstructionReason1, Optional<AccountStatusUpdateInstructionReason2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Reason for the instruction to change the account status.";
			previousVersion_lazy = () -> EnabledStatusReason1.mmCode;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountStatusUpdateInstructionReason2Choice.mmObject();
		}

		@Override
		public Optional<AccountStatusUpdateInstructionReason2Choice> getValue(AccountStatusUpdateInstructionReason1 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(AccountStatusUpdateInstructionReason1 obj, Optional<AccountStatusUpdateInstructionReason2Choice> value) {
			obj.setCode(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max350Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1
	 * AccountStatusUpdateInstructionReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about the reason for the instruction to change the account status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EnabledStatusReason1#mmAdditionalInformation
	 * EnabledStatusReason1.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountStatusUpdateInstructionReason1, Optional<Max350Text>> mmAdditionalInformation = new MMMessageAttribute<AccountStatusUpdateInstructionReason1, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the reason for the instruction to change the account status.";
			previousVersion_lazy = () -> EnabledStatusReason1.mmAdditionalInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(AccountStatusUpdateInstructionReason1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(AccountStatusUpdateInstructionReason1 obj, Optional<Max350Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1.mmCode, com.tools20022.repository.msg.AccountStatusUpdateInstructionReason1.mmAdditionalInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReasonElementRule.forAccountStatusUpdateInstructionReason1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountStatusUpdateInstructionReason1";
				definition = "Reason for an update to an account status.";
				previousVersion_lazy = () -> EnabledStatusReason1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AccountStatusUpdateInstructionReason2Choice> getCode() {
		return code == null ? Optional.empty() : Optional.of(code);
	}

	public AccountStatusUpdateInstructionReason1 setCode(AccountStatusUpdateInstructionReason2Choice code) {
		this.code = code;
		return this;
	}

	public Optional<Max350Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public AccountStatusUpdateInstructionReason1 setAdditionalInformation(Max350Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}
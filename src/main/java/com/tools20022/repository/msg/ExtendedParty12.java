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
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.InvestmentAccountPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Other type of party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty12#mmExtendedPartyRole
 * ExtendedParty12.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty12#mmOtherPartyDetails
 * ExtendedParty12.mmOtherPartyDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExtendedParty12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Other type of party."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ExtendedParty10
 * ExtendedParty10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExtendedParty12", propOrder = {"extendedPartyRole", "otherPartyDetails"})
public class ExtendedParty12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "XtndedPtyRole", required = true)
	protected Extended350Code extendedPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExtendedParty12
	 * ExtendedParty12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedPtyRole"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other type of party's role."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExtendedParty10#mmExtendedPartyRole
	 * ExtendedParty10.mmExtendedPartyRole}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExtendedParty12, Extended350Code> mmExtendedPartyRole = new MMMessageAttribute<ExtendedParty12, Extended350Code>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ExtendedParty12.mmObject();
			isDerived = false;
			xmlTag = "XtndedPtyRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedPartyRole";
			definition = "Other type of party's role.";
			previousVersion_lazy = () -> ExtendedParty10.mmExtendedPartyRole;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Extended350Code getValue(ExtendedParty12 obj) {
			return obj.getExtendedPartyRole();
		}

		@Override
		public void setValue(ExtendedParty12 obj, Extended350Code value) {
			obj.setExtendedPartyRole(value);
		}
	};
	@XmlElement(name = "OthrPtyDtls", required = true)
	protected InvestmentAccountOwnershipInformation15 otherPartyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExtendedParty12
	 * ExtendedParty12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPtyDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherPartyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed ownership information about a party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExtendedParty10#mmOtherPartyDetails
	 * ExtendedParty10.mmOtherPartyDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExtendedParty12, InvestmentAccountOwnershipInformation15> mmOtherPartyDetails = new MMMessageAssociationEnd<ExtendedParty12, InvestmentAccountOwnershipInformation15>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ExtendedParty12.mmObject();
			isDerived = false;
			xmlTag = "OthrPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPartyDetails";
			definition = "Detailed ownership information about a party.";
			previousVersion_lazy = () -> ExtendedParty10.mmOtherPartyDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation15.mmObject();
		}

		@Override
		public InvestmentAccountOwnershipInformation15 getValue(ExtendedParty12 obj) {
			return obj.getOtherPartyDetails();
		}

		@Override
		public void setValue(ExtendedParty12 obj, InvestmentAccountOwnershipInformation15 value) {
			obj.setOtherPartyDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExtendedParty12.mmExtendedPartyRole, com.tools20022.repository.msg.ExtendedParty12.mmOtherPartyDetails);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtendedParty12";
				definition = "Other type of party.";
				previousVersion_lazy = () -> ExtendedParty10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Extended350Code getExtendedPartyRole() {
		return extendedPartyRole;
	}

	public ExtendedParty12 setExtendedPartyRole(Extended350Code extendedPartyRole) {
		this.extendedPartyRole = Objects.requireNonNull(extendedPartyRole);
		return this;
	}

	public InvestmentAccountOwnershipInformation15 getOtherPartyDetails() {
		return otherPartyDetails;
	}

	public ExtendedParty12 setOtherPartyDetails(InvestmentAccountOwnershipInformation15 otherPartyDetails) {
		this.otherPartyDetails = Objects.requireNonNull(otherPartyDetails);
		return this;
	}
}
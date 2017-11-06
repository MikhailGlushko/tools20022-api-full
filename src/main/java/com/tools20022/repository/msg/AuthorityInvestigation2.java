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
import com.tools20022.repository.choice.InvestigatedParties1Choice;
import com.tools20022.repository.datatype.Max500Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the requested authority investigation information details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AuthorityInvestigation2#mmType
 * AuthorityInvestigation2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2#mmInvestigatedRoles
 * AuthorityInvestigation2.mmInvestigatedRoles}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2#mmAdditionalInvestigatedParties
 * AuthorityInvestigation2.mmAdditionalInvestigatedParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2#mmAdditionalInformation
 * AuthorityInvestigation2.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AuthorityInvestigation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the requested authority investigation information details."</li>
 * </ul>
 */
public class AuthorityInvestigation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AuthorityRequestType1 type;
	/**
	 * Identifies the type requested information as a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AuthorityRequestType1
	 * AuthorityRequestType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2
	 * AuthorityInvestigation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type requested information as a code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AuthorityInvestigation2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Identifies the type requested information as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.AuthorityRequestType1.mmObject();
		}
	};
	protected InvestigatedParties1Choice investigatedRoles;
	/**
	 * Identifies the roles the customer plays in the requested information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestigatedParties1Choice
	 * InvestigatedParties1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2
	 * AuthorityInvestigation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstgtdRoles"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigatedRoles"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the roles the customer plays in the requested information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestigatedRoles = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AuthorityInvestigation2.mmObject();
			isDerived = false;
			xmlTag = "InvstgtdRoles";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigatedRoles";
			definition = "Identifies the roles the customer plays in the requested information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestigatedParties1Choice.mmObject();
		}
	};
	protected InvestigatedParties1Choice additionalInvestigatedParties;
	/**
	 * Specifies the additional investigated parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestigatedParties1Choice
	 * InvestigatedParties1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2
	 * AuthorityInvestigation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInvstgtdPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInvestigatedParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the additional investigated parties."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInvestigatedParties = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AuthorityInvestigation2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInvstgtdPties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInvestigatedParties";
			definition = "Specifies the additional investigated parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestigatedParties1Choice.mmObject();
		}
	};
	protected Max500Text additionalInformation;
	/**
	 * Additional information, in free text form, to complement the requested
	 * information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthorityInvestigation2
	 * AuthorityInvestigation2}</li>
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
	 * "Additional information, in free text form, to complement the requested information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AuthorityInvestigation2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information, in free text form, to complement the requested information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AuthorityInvestigation2.mmType, com.tools20022.repository.msg.AuthorityInvestigation2.mmInvestigatedRoles,
						com.tools20022.repository.msg.AuthorityInvestigation2.mmAdditionalInvestigatedParties, com.tools20022.repository.msg.AuthorityInvestigation2.mmAdditionalInformation);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AuthorityInvestigation2";
				definition = "Specifies the requested authority investigation information details.";
			}
		});
		return mmObject_lazy.get();
	}

	public AuthorityRequestType1 getType() {
		return type;
	}

	public void setType(com.tools20022.repository.msg.AuthorityRequestType1 type) {
		this.type = type;
	}

	public InvestigatedParties1Choice getInvestigatedRoles() {
		return investigatedRoles;
	}

	public void setInvestigatedRoles(InvestigatedParties1Choice investigatedRoles) {
		this.investigatedRoles = investigatedRoles;
	}

	public InvestigatedParties1Choice getAdditionalInvestigatedParties() {
		return additionalInvestigatedParties;
	}

	public void setAdditionalInvestigatedParties(InvestigatedParties1Choice additionalInvestigatedParties) {
		this.additionalInvestigatedParties = additionalInvestigatedParties;
	}

	public Max500Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max500Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}
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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02;
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03;
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04;
import com.tools20022.repository.codeset.AccountManagementType2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provide information about the type of request or instruction which triggered
 * this confirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation1#mmConfirmationType
 * AccountManagementConfirmation1.mmConfirmationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation1#mmAccountApplicationIdentification
 * AccountManagementConfirmation1.mmAccountApplicationIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmConfirmationDetails
 * AccountDetailsConfirmationV02.mmConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmConfirmationDetails
 * AccountDetailsConfirmationV03.mmConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmConfirmationDetails
 * AccountDetailsConfirmationV04.mmConfirmationDetails}</li>
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
 * "AccountManagementConfirmation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provide information about the type of request or instruction which triggered this confirmation."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountManagementConfirmation2
 * AccountManagementConfirmation2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountManagementConfirmation1", propOrder = {"confirmationType", "accountApplicationIdentification"})
public class AccountManagementConfirmation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountManagementType2Code confirmationType;
	/**
	 * Specifies if the confirmation message applies to an account opening, an
	 * account modification request or to a get account details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementType2Code
	 * AccountManagementType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation1
	 * AccountManagementConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the confirmation message applies to an account opening,  an account modification request or to a get account details."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation2#mmConfirmationType
	 * AccountManagementConfirmation2.mmConfirmationType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmationType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountManagementConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "ConfTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationType";
			definition = "Specifies if the confirmation message applies to an account opening,  an account modification request or to a get account details.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementConfirmation2.mmConfirmationType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountManagementType2Code.mmObject();
		}
	};
	protected Max35Text accountApplicationIdentification;
	/**
	 * Unique and unambiguous identifier of the account opening or modification
	 * instruction at application level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation1
	 * AccountManagementConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctApplId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of the account opening or modification instruction at application level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation2#mmAccountApplicationIdentification
	 * AccountManagementConfirmation2.mmAccountApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountApplicationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountManagementConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "AcctApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountApplicationIdentification";
			definition = "Unique and unambiguous identifier of the account opening or modification instruction at application level.";
			nextVersions_lazy = () -> Arrays.asList(AccountManagementConfirmation2.mmAccountApplicationIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountManagementConfirmation1.mmConfirmationType, AccountManagementConfirmation1.mmAccountApplicationIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV02.mmConfirmationDetails, AccountDetailsConfirmationV03.mmConfirmationDetails, AccountDetailsConfirmationV04.mmConfirmationDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountManagementConfirmation1";
				definition = "Provide information about the type of request or instruction which triggered this confirmation.";
				nextVersions_lazy = () -> Arrays.asList(AccountManagementConfirmation2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ConfTp", required = true)
	public AccountManagementType2Code getConfirmationType() {
		return confirmationType;
	}

	public void setConfirmationType(AccountManagementType2Code confirmationType) {
		this.confirmationType = confirmationType;
	}

	@XmlElement(name = "AcctApplId")
	public Max35Text getAccountApplicationIdentification() {
		return accountApplicationIdentification;
	}

	public void setAccountApplicationIdentification(Max35Text accountApplicationIdentification) {
		this.accountApplicationIdentification = accountApplicationIdentification;
	}
}
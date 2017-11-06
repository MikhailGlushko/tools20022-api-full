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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provide information about the reason for the modification and about the
 * application request which triggered this modification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModificationDetails#mmModificationReason
 * InvestmentAccountModificationDetails.mmModificationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModificationDetails#mmAccountApplicationIdentification
 * InvestmentAccountModificationDetails.mmAccountApplicationIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmInstructionDetails
 * AccountModificationInstructionV02.mmInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmInstructionDetails
 * AccountModificationInstructionV03.mmInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmInstructionDetails
 * AccountModificationInstructionV04.mmInstructionDetails}</li>
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
 * "InvestmentAccountModificationDetails"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provide information about the reason for the modification and about the application request which triggered this modification."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccountModification1
 * InvestmentAccountModification1}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class InvestmentAccountModificationDetails {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text modificationReason;
	/**
	 * Reason for the modification brought to the investment account
	 * information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModificationDetails
	 * InvestmentAccountModificationDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the modification brought to the investment account information."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1#mmModificationReason
	 * InvestmentAccountModification1.mmModificationReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmModificationReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountModificationDetails.mmObject();
			isDerived = false;
			xmlTag = "ModRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationReason";
			definition = "Reason for the modification brought to the investment account information.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountModification1.mmModificationReason);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text accountApplicationIdentification;
	/**
	 * Unique and unambiguous identifier of the account modification request.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModificationDetails
	 * InvestmentAccountModificationDetails}</li>
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
	 * "Unique and unambiguous identifier of the account modification request."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountModification1#mmAccountApplicationIdentification
	 * InvestmentAccountModification1.mmAccountApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountApplicationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountModificationDetails.mmObject();
			isDerived = false;
			xmlTag = "AcctApplId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountApplicationIdentification";
			definition = "Unique and unambiguous identifier of the account modification request.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountModification1.mmAccountApplicationIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountModificationDetails.mmModificationReason,
						com.tools20022.repository.msg.InvestmentAccountModificationDetails.mmAccountApplicationIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmInstructionDetails,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmInstructionDetails, com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmInstructionDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountModificationDetails";
				definition = "Provide information about the reason for the modification and about the application request which triggered this modification.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentAccountModification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getModificationReason() {
		return modificationReason;
	}

	public void setModificationReason(Max350Text modificationReason) {
		this.modificationReason = modificationReason;
	}

	public Max35Text getAccountApplicationIdentification() {
		return accountApplicationIdentification;
	}

	public void setAccountApplicationIdentification(Max35Text accountApplicationIdentification) {
		this.accountApplicationIdentification = accountApplicationIdentification;
	}
}
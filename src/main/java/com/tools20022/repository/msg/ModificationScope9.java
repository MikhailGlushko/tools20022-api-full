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
import com.tools20022.repository.codeset.DataModification1Code;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Scope of the modification to be applied on an identified set of information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ModificationScope9#mmModificationScopeIndication
 * ModificationScope9.mmModificationScopeIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ModificationScope9#mmIssueAllocation
 * ModificationScope9.mmIssueAllocation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmModifiedIssueAllocation
 * AccountModificationInstructionV02.mmModifiedIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedIssueAllocation
 * AccountModificationInstructionV03.mmModifiedIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV04#mmModifiedIssueAllocation
 * AccountModificationInstructionV04.mmModifiedIssueAllocation}</li>
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
 * "ModificationScope9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope of the modification to be applied on an identified set of information."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ModificationScope21
 * ModificationScope21}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ModificationScope9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DataModification1Code modificationScopeIndication;
	/**
	 * Specifies the type of modification to be applied on a set of information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataModification1Code
	 * DataModification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope9
	 * ModificationScope9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModScpIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationScopeIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of modification to be applied on a set of information."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationScope21#mmModificationScopeIndication
	 * ModificationScope21.mmModificationScopeIndication}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmModificationScopeIndication = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ModificationScope9.mmObject();
			isDerived = false;
			xmlTag = "ModScpIndctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationScopeIndication";
			definition = "Specifies the type of modification to be applied on a set of information.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ModificationScope21.mmModificationScopeIndication);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataModification1Code.mmObject();
		}
	};
	protected NewIssueAllocation1 issueAllocation;
	/**
	 * Information about the investment account ownership with respect to new
	 * issue allocation for a hedge fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NewIssueAllocation1
	 * NewIssueAllocation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope9
	 * ModificationScope9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseAllcn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the investment account ownership with respect to new issue allocation for a hedge fund."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationScope21#mmIssueAllocation
	 * ModificationScope21.mmIssueAllocation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssueAllocation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ModificationScope9.mmObject();
			isDerived = false;
			xmlTag = "IsseAllcn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueAllocation";
			definition = "Information about the investment account ownership with respect to new issue allocation for a hedge fund.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ModificationScope21.mmIssueAllocation);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NewIssueAllocation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ModificationScope9.mmModificationScopeIndication, com.tools20022.repository.msg.ModificationScope9.mmIssueAllocation);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountModificationInstructionV02.mmModifiedIssueAllocation,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV03.mmModifiedIssueAllocation, com.tools20022.repository.area.acmt.AccountModificationInstructionV04.mmModifiedIssueAllocation);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ModificationScope9";
				definition = "Scope of the modification to be applied on an identified set of information.";
				nextVersions_lazy = () -> Arrays.asList(ModificationScope21.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DataModification1Code getModificationScopeIndication() {
		return modificationScopeIndication;
	}

	public void setModificationScopeIndication(DataModification1Code modificationScopeIndication) {
		this.modificationScopeIndication = modificationScopeIndication;
	}

	public NewIssueAllocation1 getIssueAllocation() {
		return issueAllocation;
	}

	public void setIssueAllocation(com.tools20022.repository.msg.NewIssueAllocation1 issueAllocation) {
		this.issueAllocation = issueAllocation;
	}
}
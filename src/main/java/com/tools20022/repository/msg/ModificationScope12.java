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
import com.tools20022.repository.codeset.DataModification2Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrument10;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.ModificationScope12#mmModificationScopeIndication
 * ModificationScope12.mmModificationScopeIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ModificationScope12#mmFundDetails
 * ModificationScope12.mmFundDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ModificationScope12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope of the modification to be applied on an identified set of information."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ModificationScope13
 * ModificationScope13}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ModificationScope12", propOrder = {"modificationScopeIndication", "fundDetails"})
public class ModificationScope12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ModScpIndctn", required = true)
	protected DataModification2Code modificationScopeIndication;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataModification2Code
	 * DataModification2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope12
	 * ModificationScope12}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<ModificationScope12, DataModification2Code> mmModificationScopeIndication = new MMMessageAttribute<ModificationScope12, DataModification2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ModificationScope12.mmObject();
			isDerived = false;
			xmlTag = "ModScpIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationScopeIndication";
			definition = "Specifies the type of modification to be applied on a set of information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataModification2Code.mmObject();
		}

		@Override
		public DataModification2Code getValue(ModificationScope12 obj) {
			return obj.getModificationScopeIndication();
		}

		@Override
		public void setValue(ModificationScope12 obj, DataModification2Code value) {
			obj.setModificationScopeIndication(value);
		}
	};
	@XmlElement(name = "FndDtls", required = true)
	protected FinancialInstrument10 fundDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument10
	 * FinancialInstrument10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope12
	 * ModificationScope12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the account to be modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ModificationScope12, FinancialInstrument10> mmFundDetails = new MMMessageAssociationEnd<ModificationScope12, FinancialInstrument10>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ModificationScope12.mmObject();
			isDerived = false;
			xmlTag = "FndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetails";
			definition = "Information related to the account to be modified.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument10.mmObject();
		}

		@Override
		public FinancialInstrument10 getValue(ModificationScope12 obj) {
			return obj.getFundDetails();
		}

		@Override
		public void setValue(ModificationScope12 obj, FinancialInstrument10 value) {
			obj.setFundDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ModificationScope12.mmModificationScopeIndication, com.tools20022.repository.msg.ModificationScope12.mmFundDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ModificationScope12";
				definition = "Scope of the modification to be applied on an identified set of information.";
				nextVersions_lazy = () -> Arrays.asList(ModificationScope13.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DataModification2Code getModificationScopeIndication() {
		return modificationScopeIndication;
	}

	public ModificationScope12 setModificationScopeIndication(DataModification2Code modificationScopeIndication) {
		this.modificationScopeIndication = Objects.requireNonNull(modificationScopeIndication);
		return this;
	}

	public FinancialInstrument10 getFundDetails() {
		return fundDetails;
	}

	public ModificationScope12 setFundDetails(FinancialInstrument10 fundDetails) {
		this.fundDetails = Objects.requireNonNull(fundDetails);
		return this;
	}
}
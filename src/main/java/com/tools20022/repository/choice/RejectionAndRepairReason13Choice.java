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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RejectionReason27Code;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification20;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for the rejection or repair reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason13Choice#mmCode
 * RejectionAndRepairReason13Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason13Choice#mmProprietary
 * RejectionAndRepairReason13Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionAndRepairReason13Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the rejection or repair reason."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReportItemRejectionReason1Choice
 * ReportItemRejectionReason1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason25Choice
 * RejectionAndRepairReason25Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason10Choice
 * RejectionAndRepairReason10Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RejectionAndRepairReason13Choice", propOrder = {"code", "proprietary"})
public class RejectionAndRepairReason13Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected RejectionReason27Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason27Code
	 * RejectionReason27Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason13Choice
	 * RejectionAndRepairReason13Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/request has a repair or rejection status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::REJT or REPR//4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemRejectionReason1Choice#mmCode
	 * ReportItemRejectionReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason25Choice#mmCode
	 * RejectionAndRepairReason25Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RejectionAndRepairReason13Choice, RejectionReason27Code> mmCode = new MMMessageAttribute<RejectionAndRepairReason13Choice, RejectionReason27Code>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.RejectionAndRepairReason13Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::REJT or REPR//4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies the reason why the instruction/request has a repair or rejection status.";
			nextVersions_lazy = () -> Arrays.asList(ReportItemRejectionReason1Choice.mmCode, RejectionAndRepairReason25Choice.mmCode);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectionReason27Code.mmObject();
		}

		@Override
		public RejectionReason27Code getValue(RejectionAndRepairReason13Choice obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(RejectionAndRepairReason13Choice obj, RejectionReason27Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification20 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason13Choice
	 * RejectionAndRepairReason13Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/request has a repair or rejection status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::REJT or REPR/4!c[4c]/4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReportItemRejectionReason1Choice#mmProprietary
	 * ReportItemRejectionReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RejectionAndRepairReason25Choice#mmProprietary
	 * RejectionAndRepairReason25Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RejectionAndRepairReason13Choice, GenericIdentification20> mmProprietary = new MMMessageAssociationEnd<RejectionAndRepairReason13Choice, GenericIdentification20>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.RejectionAndRepairReason13Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::REJT or REPR/4!c[4c]/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Specifies the reason why the instruction/request has a repair or rejection status.";
			nextVersions_lazy = () -> Arrays.asList(ReportItemRejectionReason1Choice.mmProprietary, RejectionAndRepairReason25Choice.mmProprietary);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification20.mmObject();
		}

		@Override
		public GenericIdentification20 getValue(RejectionAndRepairReason13Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(RejectionAndRepairReason13Choice obj, GenericIdentification20 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RejectionAndRepairReason13Choice.mmCode, com.tools20022.repository.choice.RejectionAndRepairReason13Choice.mmProprietary);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionAndRepairReason13Choice";
				definition = "Choice of format for the rejection or repair reason.";
				nextVersions_lazy = () -> Arrays.asList(ReportItemRejectionReason1Choice.mmObject(), RejectionAndRepairReason25Choice.mmObject());
				previousVersion_lazy = () -> RejectionAndRepairReason10Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public RejectionReason27Code getCode() {
		return code;
	}

	public RejectionAndRepairReason13Choice setCode(RejectionReason27Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public GenericIdentification20 getProprietary() {
		return proprietary;
	}

	public RejectionAndRepairReason13Choice setProprietary(GenericIdentification20 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}
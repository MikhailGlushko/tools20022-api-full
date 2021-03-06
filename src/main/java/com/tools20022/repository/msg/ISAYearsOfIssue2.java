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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.PreviousYearChoice;
import com.tools20022.repository.codeset.ISAType2Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Year in which the ISA plan is issued.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#CurrentYearTypeOrExtendedCurrentYearTypeRule
 * ISAYearsOfIssue2.CurrentYearTypeOrExtendedCurrentYearTypeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#mmCurrentYearType
 * ISAYearsOfIssue2.mmCurrentYearType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#mmExtendedCurrentYearType
 * ISAYearsOfIssue2.mmExtendedCurrentYearType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#mmPreviousYears
 * ISAYearsOfIssue2.mmPreviousYears}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ISAYearsOfIssue2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Year in which the ISA plan is issued."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrentYearTypeRule#forISAYearsOfIssue2
 * ConstraintCurrentYearTypeRule.forISAYearsOfIssue2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ISAYearsOfIssue2", propOrder = {"currentYearType", "extendedCurrentYearType", "previousYears"})
public class ISAYearsOfIssue2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CurYrTp")
	protected ISAType2Code currentYearType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ISAType2Code
	 * ISAType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCurrentYearISAType
	 * PortfolioTransfer.mmCurrentYearISAType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2
	 * ISAYearsOfIssue2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurYrTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISA that was issued during the current fiscal year."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ISAYearsOfIssue2, Optional<ISAType2Code>> mmCurrentYearType = new MMMessageAttribute<ISAYearsOfIssue2, Optional<ISAType2Code>>() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmCurrentYearISAType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue2.mmObject();
			isDerived = false;
			xmlTag = "CurYrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearType";
			definition = "ISA that was issued during the current fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISAType2Code.mmObject();
		}

		@Override
		public Optional<ISAType2Code> getValue(ISAYearsOfIssue2 obj) {
			return obj.getCurrentYearType();
		}

		@Override
		public void setValue(ISAYearsOfIssue2 obj, Optional<ISAType2Code> value) {
			obj.setCurrentYearType(value.orElse(null));
		}
	};
	@XmlElement(name = "XtndedCurYrTp")
	protected Extended350Code extendedCurrentYearType;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCurrentYearISAType
	 * PortfolioTransfer.mmCurrentYearISAType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2
	 * ISAYearsOfIssue2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedCurYrTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedCurrentYearType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current year ISA is an ISA that was issued during the current fiscal year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ISAYearsOfIssue2, Optional<Extended350Code>> mmExtendedCurrentYearType = new MMMessageAttribute<ISAYearsOfIssue2, Optional<Extended350Code>>() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmCurrentYearISAType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue2.mmObject();
			isDerived = false;
			xmlTag = "XtndedCurYrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedCurrentYearType";
			definition = "Current year ISA is an ISA that was issued during the current fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Optional<Extended350Code> getValue(ISAYearsOfIssue2 obj) {
			return obj.getExtendedCurrentYearType();
		}

		@Override
		public void setValue(ISAYearsOfIssue2 obj, Optional<Extended350Code> value) {
			obj.setExtendedCurrentYearType(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsYrs")
	protected PreviousYearChoice previousYears;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PreviousYearChoice
	 * PreviousYearChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2
	 * ISAYearsOfIssue2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsYrs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Selection of investment plans issued during previous years."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ISAYearsOfIssue2, Optional<PreviousYearChoice>> mmPreviousYears = new MMMessageAssociationEnd<ISAYearsOfIssue2, Optional<PreviousYearChoice>>() {
		{
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue2.mmObject();
			isDerived = false;
			xmlTag = "PrvsYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousYears";
			definition = "Selection of investment plans issued during previous years.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PreviousYearChoice.mmObject();
		}

		@Override
		public Optional<PreviousYearChoice> getValue(ISAYearsOfIssue2 obj) {
			return obj.getPreviousYears();
		}

		@Override
		public void setValue(ISAYearsOfIssue2 obj, Optional<PreviousYearChoice> value) {
			obj.setPreviousYears(value.orElse(null));
		}
	};
	/**
	 * Either CurrentYearType or ExtendedCurrentYearType may be present, but not
	 * both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2
	 * ISAYearsOfIssue2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#mmCurrentYearType
	 * ISAYearsOfIssue2.mmCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#mmExtendedCurrentYearType
	 * ISAYearsOfIssue2.mmExtendedCurrentYearType}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearTypeOrExtendedCurrentYearTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CurrentYearType or ExtendedCurrentYearType may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor CurrentYearTypeOrExtendedCurrentYearTypeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearTypeOrExtendedCurrentYearTypeRule";
			definition = "Either CurrentYearType or ExtendedCurrentYearType may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue2.mmCurrentYearType, com.tools20022.repository.msg.ISAYearsOfIssue2.mmExtendedCurrentYearType);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue2.mmCurrentYearType, com.tools20022.repository.msg.ISAYearsOfIssue2.mmExtendedCurrentYearType,
						com.tools20022.repository.msg.ISAYearsOfIssue2.mmPreviousYears);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrentYearTypeRule.forISAYearsOfIssue2);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ISAYearsOfIssue2";
				definition = "Year in which the ISA plan is issued.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue2.CurrentYearTypeOrExtendedCurrentYearTypeRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISAType2Code> getCurrentYearType() {
		return currentYearType == null ? Optional.empty() : Optional.of(currentYearType);
	}

	public ISAYearsOfIssue2 setCurrentYearType(ISAType2Code currentYearType) {
		this.currentYearType = currentYearType;
		return this;
	}

	public Optional<Extended350Code> getExtendedCurrentYearType() {
		return extendedCurrentYearType == null ? Optional.empty() : Optional.of(extendedCurrentYearType);
	}

	public ISAYearsOfIssue2 setExtendedCurrentYearType(Extended350Code extendedCurrentYearType) {
		this.extendedCurrentYearType = extendedCurrentYearType;
		return this;
	}

	public Optional<PreviousYearChoice> getPreviousYears() {
		return previousYears == null ? Optional.empty() : Optional.of(previousYears);
	}

	public ISAYearsOfIssue2 setPreviousYears(PreviousYearChoice previousYears) {
		this.previousYears = previousYears;
		return this;
	}
}
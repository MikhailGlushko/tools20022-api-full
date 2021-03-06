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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.area.seev.MeetingCancellationV02;
import com.tools20022.repository.codeset.MeetingCancellationReason2Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.MeetingStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the reason for cancelling a meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1#CodeOrExtendedCodeRule
 * MeetingCancellationReason1.CodeOrExtendedCodeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1#mmCode
 * MeetingCancellationReason1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1#mmExtendedCode
 * MeetingCancellationReason1.mmExtendedCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1#mmCancellationReason
 * MeetingCancellationReason1.mmCancellationReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatusReason
 * MeetingStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV02#mmReason
 * MeetingCancellationV02.mmReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingCancellationReason1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for cancelling a meeting."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingCancellationReason1", propOrder = {"code", "extendedCode", "cancellationReason"})
public class MeetingCancellationReason1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected MeetingCancellationReason2Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReason2Code
	 * MeetingCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#mmMeetingCancellationReason
	 * MeetingStatusReason.mmMeetingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1
	 * MeetingCancellationReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for cancelling a meeting in coded form."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingCancellationReason1, MeetingCancellationReason2Code> mmCode = new MMMessageAttribute<MeetingCancellationReason1, MeetingCancellationReason2Code>() {
		{
			businessElementTrace_lazy = () -> MeetingStatusReason.mmMeetingCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingCancellationReason1.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies the reason for cancelling a meeting in coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingCancellationReason2Code.mmObject();
		}

		@Override
		public MeetingCancellationReason2Code getValue(MeetingCancellationReason1 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(MeetingCancellationReason1 obj, MeetingCancellationReason2Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "XtndedCd", required = true)
	protected Extended350Code extendedCode;
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
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#mmMeetingCancellationReason
	 * MeetingStatusReason.mmMeetingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1
	 * MeetingCancellationReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for cancelling a meeting in free text form."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingCancellationReason1, Extended350Code> mmExtendedCode = new MMMessageAttribute<MeetingCancellationReason1, Extended350Code>() {
		{
			businessElementTrace_lazy = () -> MeetingStatusReason.mmMeetingCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingCancellationReason1.mmObject();
			isDerived = false;
			xmlTag = "XtndedCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedCode";
			definition = "Specifies the reason for cancelling a meeting in free text form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Extended350Code getValue(MeetingCancellationReason1 obj) {
			return obj.getExtendedCode();
		}

		@Override
		public void setValue(MeetingCancellationReason1 obj, Extended350Code value) {
			obj.setExtendedCode(value);
		}
	};
	@XmlElement(name = "CxlRsn")
	protected Max140Text cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1
	 * MeetingCancellationReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides more information on the reason for cancelling a meeting in free format form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingCancellationReason1, Optional<Max140Text>> mmCancellationReason = new MMMessageAttribute<MeetingCancellationReason1, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingCancellationReason1.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Provides more information on the reason for cancelling a meeting in free format form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(MeetingCancellationReason1 obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(MeetingCancellationReason1 obj, Optional<Max140Text> value) {
			obj.setCancellationReason(value.orElse(null));
		}
	};
	/**
	 * Either Code or ExtendedCode must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1
	 * MeetingCancellationReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1#mmCode
	 * MeetingCancellationReason1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1#mmExtendedCode
	 * MeetingCancellationReason1.mmExtendedCode}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CodeOrExtendedCodeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Code or ExtendedCode must be present, but not both."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor CodeOrExtendedCodeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CodeOrExtendedCodeRule";
			definition = "Either Code or ExtendedCode must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.MeetingCancellationReason1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingCancellationReason1.mmCode, com.tools20022.repository.msg.MeetingCancellationReason1.mmExtendedCode);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingCancellationReason1.mmCode, com.tools20022.repository.msg.MeetingCancellationReason1.mmExtendedCode,
						com.tools20022.repository.msg.MeetingCancellationReason1.mmCancellationReason);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingCancellationV02.mmReason);
				trace_lazy = () -> MeetingStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "MeetingCancellationReason1";
				definition = "Specifies the reason for cancelling a meeting.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingCancellationReason1.CodeOrExtendedCodeRule);
			}
		});
		return mmObject_lazy.get();
	}

	public MeetingCancellationReason2Code getCode() {
		return code;
	}

	public MeetingCancellationReason1 setCode(MeetingCancellationReason2Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public Extended350Code getExtendedCode() {
		return extendedCode;
	}

	public MeetingCancellationReason1 setExtendedCode(Extended350Code extendedCode) {
		this.extendedCode = Objects.requireNonNull(extendedCode);
		return this;
	}

	public Optional<Max140Text> getCancellationReason() {
		return cancellationReason == null ? Optional.empty() : Optional.of(cancellationReason);
	}

	public MeetingCancellationReason1 setCancellationReason(Max140Text cancellationReason) {
		this.cancellationReason = cancellationReason;
		return this;
	}
}
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
import com.tools20022.repository.choice.PendingSettlementStatus3Choice;
import com.tools20022.repository.codeset.NoReasonCode;
import com.tools20022.repository.codeset.PendingSettlementStatusReason2Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reason for the pending settlement status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#ReasonOrExtendedOrDssOrNoSpecifiedReasonRule
 * PendingSettlementStatus2.ReasonOrExtendedOrDssOrNoSpecifiedReasonRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#mmReason
 * PendingSettlementStatus2.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#mmExtendedReason
 * PendingSettlementStatus2.mmExtendedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#mmDataSourceScheme
 * PendingSettlementStatus2.mmDataSourceScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#mmNoSpecifiedReason
 * PendingSettlementStatus2.mmNoSpecifiedReason}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PendingSettlementStatus2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for the pending settlement status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice
 * PendingSettlementStatus3Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PendingSettlementStatus2", propOrder = {"reason", "extendedReason", "dataSourceScheme", "noSpecifiedReason"})
public class PendingSettlementStatus2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rsn", required = true)
	protected PendingSettlementStatusReason2Code reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmPendingSettlementReason
	 * SecuritiesTradeStatusReason.mmPendingSettlementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2
	 * PendingSettlementStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the settlement pending status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#mmReason
	 * PendingSettlementStatus3Choice.mmReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PendingSettlementStatus2, PendingSettlementStatusReason2Code> mmReason = new MMMessageAttribute<PendingSettlementStatus2, PendingSettlementStatusReason2Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmPendingSettlementReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.PendingSettlementStatus2.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the settlement pending status.";
			nextVersions_lazy = () -> Arrays.asList(PendingSettlementStatus3Choice.mmReason);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}

		@Override
		public PendingSettlementStatusReason2Code getValue(PendingSettlementStatus2 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(PendingSettlementStatus2 obj, PendingSettlementStatusReason2Code value) {
			obj.setReason(value);
		}
	};
	@XmlElement(name = "XtndedRsn", required = true)
	protected Extended350Code extendedReason;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2
	 * PendingSettlementStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the settlement pending status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#mmExtendedReason
	 * PendingSettlementStatus3Choice.mmExtendedReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PendingSettlementStatus2, Extended350Code> mmExtendedReason = new MMMessageAttribute<PendingSettlementStatus2, Extended350Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PendingSettlementStatus2.mmObject();
			isDerived = false;
			xmlTag = "XtndedRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedReason";
			definition = "Reason for the settlement pending status.";
			nextVersions_lazy = () -> Arrays.asList(PendingSettlementStatus3Choice.mmExtendedReason);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Extended350Code getValue(PendingSettlementStatus2 obj) {
			return obj.getExtendedReason();
		}

		@Override
		public void setValue(PendingSettlementStatus2 obj, Extended350Code value) {
			obj.setExtendedReason(value);
		}
	};
	@XmlElement(name = "DataSrcSchme", required = true)
	protected GenericIdentification1 dataSourceScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
	 * StatusReason.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2
	 * PendingSettlementStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSrcSchme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSourceScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of the reason for the pending settlement status."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#mmDataSourceScheme
	 * PendingSettlementStatus3Choice.mmDataSourceScheme}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PendingSettlementStatus2, GenericIdentification1> mmDataSourceScheme = new MMMessageAssociationEnd<PendingSettlementStatus2, GenericIdentification1>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmDataSourceScheme;
			componentContext_lazy = () -> com.tools20022.repository.msg.PendingSettlementStatus2.mmObject();
			isDerived = false;
			xmlTag = "DataSrcSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for the pending settlement status.";
			nextVersions_lazy = () -> Arrays.asList(PendingSettlementStatus3Choice.mmDataSourceScheme);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification1.mmObject();
		}

		@Override
		public GenericIdentification1 getValue(PendingSettlementStatus2 obj) {
			return obj.getDataSourceScheme();
		}

		@Override
		public void setValue(PendingSettlementStatus2 obj, GenericIdentification1 value) {
			obj.setDataSourceScheme(value);
		}
	};
	@XmlElement(name = "NoSpcfdRsn", required = true)
	protected NoReasonCode noSpecifiedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmNoSpecifiedReason
	 * StatusReason.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2
	 * PendingSettlementStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoSpcfdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSpecifiedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that there is no reason available or to report."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PendingSettlementStatus3Choice#mmNoSpecifiedReason
	 * PendingSettlementStatus3Choice.mmNoSpecifiedReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PendingSettlementStatus2, NoReasonCode> mmNoSpecifiedReason = new MMMessageAttribute<PendingSettlementStatus2, NoReasonCode>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmNoSpecifiedReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.PendingSettlementStatus2.mmObject();
			isDerived = false;
			xmlTag = "NoSpcfdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSpecifiedReason";
			definition = "Indicates that there is no reason available or to report.";
			nextVersions_lazy = () -> Arrays.asList(PendingSettlementStatus3Choice.mmNoSpecifiedReason);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}

		@Override
		public NoReasonCode getValue(PendingSettlementStatus2 obj) {
			return obj.getNoSpecifiedReason();
		}

		@Override
		public void setValue(PendingSettlementStatus2 obj, NoReasonCode value) {
			obj.setNoSpecifiedReason(value);
		}
	};
	/**
	 * One and only one message element in the list (Reason, ExtendedReason,
	 * DataSourceScheme, NoSpecifiedReason) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2
	 * PendingSettlementStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#mmReason
	 * PendingSettlementStatus2.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#mmExtendedReason
	 * PendingSettlementStatus2.mmExtendedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#mmDataSourceScheme
	 * PendingSettlementStatus2.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PendingSettlementStatus2#mmNoSpecifiedReason
	 * PendingSettlementStatus2.mmNoSpecifiedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonOrExtendedOrDssOrNoSpecifiedReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (Reason, ExtendedReason, DataSourceScheme, NoSpecifiedReason) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor ReasonOrExtendedOrDssOrNoSpecifiedReasonRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonOrExtendedOrDssOrNoSpecifiedReasonRule";
			definition = "One and only one message element in the list (Reason, ExtendedReason, DataSourceScheme, NoSpecifiedReason) must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PendingSettlementStatus2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PendingSettlementStatus2.mmReason, com.tools20022.repository.msg.PendingSettlementStatus2.mmExtendedReason,
					com.tools20022.repository.msg.PendingSettlementStatus2.mmDataSourceScheme, com.tools20022.repository.msg.PendingSettlementStatus2.mmNoSpecifiedReason);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PendingSettlementStatus2.mmReason, com.tools20022.repository.msg.PendingSettlementStatus2.mmExtendedReason,
						com.tools20022.repository.msg.PendingSettlementStatus2.mmDataSourceScheme, com.tools20022.repository.msg.PendingSettlementStatus2.mmNoSpecifiedReason);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PendingSettlementStatus2";
				definition = "Reason for the pending settlement status.";
				nextVersions_lazy = () -> Arrays.asList(PendingSettlementStatus3Choice.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PendingSettlementStatus2.ReasonOrExtendedOrDssOrNoSpecifiedReasonRule);
			}
		});
		return mmObject_lazy.get();
	}

	public PendingSettlementStatusReason2Code getReason() {
		return reason;
	}

	public PendingSettlementStatus2 setReason(PendingSettlementStatusReason2Code reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public Extended350Code getExtendedReason() {
		return extendedReason;
	}

	public PendingSettlementStatus2 setExtendedReason(Extended350Code extendedReason) {
		this.extendedReason = Objects.requireNonNull(extendedReason);
		return this;
	}

	public GenericIdentification1 getDataSourceScheme() {
		return dataSourceScheme;
	}

	public PendingSettlementStatus2 setDataSourceScheme(GenericIdentification1 dataSourceScheme) {
		this.dataSourceScheme = Objects.requireNonNull(dataSourceScheme);
		return this;
	}

	public NoReasonCode getNoSpecifiedReason() {
		return noSpecifiedReason;
	}

	public PendingSettlementStatus2 setNoSpecifiedReason(NoReasonCode noSpecifiedReason) {
		this.noSpecifiedReason = Objects.requireNonNull(noSpecifiedReason);
		return this;
	}
}
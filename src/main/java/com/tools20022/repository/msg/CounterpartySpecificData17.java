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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContractValuationData4;
import com.tools20022.repository.msg.TradeCollateralReport3;
import com.tools20022.repository.msg.TradeCounterpartyReport7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data related specifically to counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CounterpartySpecificData17#mmCounterparty
 * CounterpartySpecificData17.mmCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CounterpartySpecificData17#mmValuation
 * CounterpartySpecificData17.mmValuation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CounterpartySpecificData17#mmCollateral
 * CounterpartySpecificData17.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CounterpartySpecificData17#mmReportingDateTime
 * CounterpartySpecificData17.mmReportingDateTime}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CounterpartySpecificData17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Data related specifically to counterparty."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CounterpartySpecificData17", propOrder = {"counterparty", "valuation", "collateral", "reportingDateTime"})
public class CounterpartySpecificData17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtrPty", required = true)
	protected TradeCounterpartyReport7 counterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradeCounterpartyReport7
	 * TradeCounterpartyReport7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartySpecificData17
	 * CounterpartySpecificData17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data specific to counterparties of the reported transaction/position."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CounterpartySpecificData17, TradeCounterpartyReport7> mmCounterparty = new MMMessageAssociationEnd<CounterpartySpecificData17, TradeCounterpartyReport7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CounterpartySpecificData17.mmObject();
			isDerived = false;
			xmlTag = "CtrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counterparty";
			definition = "Data specific to counterparties of the reported transaction/position.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeCounterpartyReport7.mmObject();
		}

		@Override
		public TradeCounterpartyReport7 getValue(CounterpartySpecificData17 obj) {
			return obj.getCounterparty();
		}

		@Override
		public void setValue(CounterpartySpecificData17 obj, TradeCounterpartyReport7 value) {
			obj.setCounterparty(value);
		}
	};
	@XmlElement(name = "Valtn")
	protected ContractValuationData4 valuation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContractValuationData4
	 * ContractValuationData4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartySpecificData17
	 * CounterpartySpecificData17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Valtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data specific to the valuation of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CounterpartySpecificData17, Optional<ContractValuationData4>> mmValuation = new MMMessageAssociationEnd<CounterpartySpecificData17, Optional<ContractValuationData4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CounterpartySpecificData17.mmObject();
			isDerived = false;
			xmlTag = "Valtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Valuation";
			definition = "Data specific to the valuation of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContractValuationData4.mmObject();
		}

		@Override
		public Optional<ContractValuationData4> getValue(CounterpartySpecificData17 obj) {
			return obj.getValuation();
		}

		@Override
		public void setValue(CounterpartySpecificData17 obj, Optional<ContractValuationData4> value) {
			obj.setValuation(value.orElse(null));
		}
	};
	@XmlElement(name = "Coll")
	protected TradeCollateralReport3 collateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeCollateralReport3
	 * TradeCollateralReport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartySpecificData17
	 * CounterpartySpecificData17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Coll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to collateral agreement existing between counterparties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CounterpartySpecificData17, Optional<TradeCollateralReport3>> mmCollateral = new MMMessageAssociationEnd<CounterpartySpecificData17, Optional<TradeCollateralReport3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CounterpartySpecificData17.mmObject();
			isDerived = false;
			xmlTag = "Coll";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Information related to collateral agreement existing between counterparties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeCollateralReport3.mmObject();
		}

		@Override
		public Optional<TradeCollateralReport3> getValue(CounterpartySpecificData17 obj) {
			return obj.getCollateral();
		}

		@Override
		public void setValue(CounterpartySpecificData17 obj, Optional<TradeCollateralReport3> value) {
			obj.setCollateral(value.orElse(null));
		}
	};
	@XmlElement(name = "RptgDtTm", required = true)
	protected ISODateTime reportingDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartySpecificData17
	 * CounterpartySpecificData17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of reporting to the trade repository as required by regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CounterpartySpecificData17, ISODateTime> mmReportingDateTime = new MMMessageAttribute<CounterpartySpecificData17, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CounterpartySpecificData17.mmObject();
			isDerived = false;
			xmlTag = "RptgDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingDateTime";
			definition = "Date and time of reporting to the trade repository as required by regulation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CounterpartySpecificData17 obj) {
			return obj.getReportingDateTime();
		}

		@Override
		public void setValue(CounterpartySpecificData17 obj, ISODateTime value) {
			obj.setReportingDateTime(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CounterpartySpecificData17.mmCounterparty, com.tools20022.repository.msg.CounterpartySpecificData17.mmValuation,
						com.tools20022.repository.msg.CounterpartySpecificData17.mmCollateral, com.tools20022.repository.msg.CounterpartySpecificData17.mmReportingDateTime);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CounterpartySpecificData17";
				definition = "Data related specifically to counterparty.";
			}
		});
		return mmObject_lazy.get();
	}

	public TradeCounterpartyReport7 getCounterparty() {
		return counterparty;
	}

	public CounterpartySpecificData17 setCounterparty(TradeCounterpartyReport7 counterparty) {
		this.counterparty = Objects.requireNonNull(counterparty);
		return this;
	}

	public Optional<ContractValuationData4> getValuation() {
		return valuation == null ? Optional.empty() : Optional.of(valuation);
	}

	public CounterpartySpecificData17 setValuation(ContractValuationData4 valuation) {
		this.valuation = valuation;
		return this;
	}

	public Optional<TradeCollateralReport3> getCollateral() {
		return collateral == null ? Optional.empty() : Optional.of(collateral);
	}

	public CounterpartySpecificData17 setCollateral(TradeCollateralReport3 collateral) {
		this.collateral = collateral;
		return this;
	}

	public ISODateTime getReportingDateTime() {
		return reportingDateTime;
	}

	public CounterpartySpecificData17 setReportingDateTime(ISODateTime reportingDateTime) {
		this.reportingDateTime = Objects.requireNonNull(reportingDateTime);
		return this;
	}
}
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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TimeUnit1Code;
import com.tools20022.repository.codeset.UnitOfMeasure3Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Price1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters for contracts which obligate the buyer to receive and the seller
 * to deliver in the future the assets specified at an agreed price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmContractSize
 * Future1.mmContractSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmExercisePrice
 * Future1.mmExercisePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmExpiryDate
 * Future1.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmFutureDate
 * Future1.mmFutureDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmMinimumSize
 * Future1.mmMinimumSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmUnitOfMeasure
 * Future1.mmUnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmTimeUnit
 * Future1.mmTimeUnit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Future Future}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Future1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Future1", propOrder = {"contractSize", "exercisePrice", "expiryDate", "futureDate", "minimumSize", "unitOfMeasure", "timeUnit"})
public class Future1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtrctSz")
	protected BaseOneRate contractSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmContractSize
	 * SecuritiesConversion.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future1
	 * Future1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctSz"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ratio or multiplying factor used to convert one contract into a quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Future1, Optional<BaseOneRate>> mmContractSize = new MMMessageAttribute<Future1, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmContractSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future1.mmObject();
			isDerived = false;
			xmlTag = "CtrctSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(Future1 obj) {
			return obj.getContractSize();
		}

		@Override
		public void setValue(Future1 obj, Optional<BaseOneRate> value) {
			obj.setContractSize(value.orElse(null));
		}
	};
	@XmlElement(name = "ExrcPric")
	protected Price1 exercisePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmExercisePrice
	 * Derivative.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future1
	 * Future1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExrcPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder of a Future will have to buy or sell the underlying instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Future1, Optional<Price1>> mmExercisePrice = new MMMessageAttribute<Future1, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmExercisePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future1.mmObject();
			isDerived = false;
			xmlTag = "ExrcPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExercisePrice";
			definition = "Predetermined price at which the holder of a Future will have to buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(Future1 obj) {
			return obj.getExercisePrice();
		}

		@Override
		public void setValue(Future1 obj, Optional<Price1> value) {
			obj.setExercisePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt")
	protected ISODateTime expiryDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmExpiryDate
	 * Asset.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future1
	 * Future1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time upon which the future expires."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Future1, Optional<ISODateTime>> mmExpiryDate = new MMMessageAttribute<Future1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future1.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date and time upon which the future expires.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Future1 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(Future1 obj, Optional<ISODateTime> value) {
			obj.setExpiryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FutrDt")
	protected ISODateTime futureDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Future#mmFutureDate
	 * Future.mmFutureDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future1
	 * Future1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FutrDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which future contracts settle."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Future1, Optional<ISODateTime>> mmFutureDate = new MMMessageAttribute<Future1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Future.mmFutureDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future1.mmObject();
			isDerived = false;
			xmlTag = "FutrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureDate";
			definition = "Date on which future contracts settle.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Future1 obj) {
			return obj.getFutureDate();
		}

		@Override
		public void setValue(Future1 obj, Optional<ISODateTime> value) {
			obj.setFutureDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MinSz")
	protected ActiveCurrencyAndAmount minimumSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Future#mmMinimumSize
	 * Future.mmMinimumSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future1
	 * Future1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinSz"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the minimum ratio or multiply factor used to convert from contracts to shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Future1, Optional<ActiveCurrencyAndAmount>> mmMinimumSize = new MMMessageAttribute<Future1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Future.mmMinimumSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future1.mmObject();
			isDerived = false;
			xmlTag = "MinSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSize";
			definition = "Specifies the minimum ratio or multiply factor used to convert from contracts to shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Future1 obj) {
			return obj.getMinimumSize();
		}

		@Override
		public void setValue(Future1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setMinimumSize(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitOfMeasr")
	protected UnitOfMeasure3Code unitOfMeasure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure3Code
	 * UnitOfMeasure3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Future#mmUnitOfMeasure
	 * Future.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future1
	 * Future1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitOfMeasr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to indicate the size of the underlying commodity on which the contract is based (e.g., 2500 lbs of lean cattle, 1000 barrels of crude oil, 1000 bushels of corn, etc.)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 996</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Future1, Optional<UnitOfMeasure3Code>> mmUnitOfMeasure = new MMMessageAttribute<Future1, Optional<UnitOfMeasure3Code>>() {
		{
			businessElementTrace_lazy = () -> Future.mmUnitOfMeasure;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future1.mmObject();
			isDerived = false;
			xmlTag = "UnitOfMeasr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "996"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitOfMeasure";
			definition = "Used to indicate the size of the underlying commodity on which the contract is based (e.g., 2500 lbs of lean cattle, 1000 barrels of crude oil, 1000 bushels of corn, etc.).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UnitOfMeasure3Code.mmObject();
		}

		@Override
		public Optional<UnitOfMeasure3Code> getValue(Future1 obj) {
			return obj.getUnitOfMeasure();
		}

		@Override
		public void setValue(Future1 obj, Optional<UnitOfMeasure3Code> value) {
			obj.setUnitOfMeasure(value.orElse(null));
		}
	};
	@XmlElement(name = "TmUnit")
	protected TimeUnit1Code timeUnit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnit1Code
	 * TimeUnit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FutureRule#mmTimeType
	 * FutureRule.mmTimeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future1
	 * Future1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmUnit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to indicate a time unit for the contract (e.g., days, weeks, months, etc.)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 997</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Future1, Optional<TimeUnit1Code>> mmTimeUnit = new MMMessageAttribute<Future1, Optional<TimeUnit1Code>>() {
		{
			businessElementTrace_lazy = () -> FutureRule.mmTimeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future1.mmObject();
			isDerived = false;
			xmlTag = "TmUnit";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "997"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeUnit";
			definition = "Used to indicate a time unit for the contract (e.g., days, weeks, months, etc.).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TimeUnit1Code.mmObject();
		}

		@Override
		public Optional<TimeUnit1Code> getValue(Future1 obj) {
			return obj.getTimeUnit();
		}

		@Override
		public void setValue(Future1 obj, Optional<TimeUnit1Code> value) {
			obj.setTimeUnit(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Future1.mmContractSize, com.tools20022.repository.msg.Future1.mmExercisePrice, com.tools20022.repository.msg.Future1.mmExpiryDate,
						com.tools20022.repository.msg.Future1.mmFutureDate, com.tools20022.repository.msg.Future1.mmMinimumSize, com.tools20022.repository.msg.Future1.mmUnitOfMeasure, com.tools20022.repository.msg.Future1.mmTimeUnit);
				trace_lazy = () -> Future.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Future1";
				definition = "Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BaseOneRate> getContractSize() {
		return contractSize == null ? Optional.empty() : Optional.of(contractSize);
	}

	public Future1 setContractSize(BaseOneRate contractSize) {
		this.contractSize = contractSize;
		return this;
	}

	public Optional<Price1> getExercisePrice() {
		return exercisePrice == null ? Optional.empty() : Optional.of(exercisePrice);
	}

	public Future1 setExercisePrice(Price1 exercisePrice) {
		this.exercisePrice = exercisePrice;
		return this;
	}

	public Optional<ISODateTime> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public Future1 setExpiryDate(ISODateTime expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<ISODateTime> getFutureDate() {
		return futureDate == null ? Optional.empty() : Optional.of(futureDate);
	}

	public Future1 setFutureDate(ISODateTime futureDate) {
		this.futureDate = futureDate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getMinimumSize() {
		return minimumSize == null ? Optional.empty() : Optional.of(minimumSize);
	}

	public Future1 setMinimumSize(ActiveCurrencyAndAmount minimumSize) {
		this.minimumSize = minimumSize;
		return this;
	}

	public Optional<UnitOfMeasure3Code> getUnitOfMeasure() {
		return unitOfMeasure == null ? Optional.empty() : Optional.of(unitOfMeasure);
	}

	public Future1 setUnitOfMeasure(UnitOfMeasure3Code unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
		return this;
	}

	public Optional<TimeUnit1Code> getTimeUnit() {
		return timeUnit == null ? Optional.empty() : Optional.of(timeUnit);
	}

	public Future1 setTimeUnit(TimeUnit1Code timeUnit) {
		this.timeUnit = timeUnit;
		return this;
	}
}
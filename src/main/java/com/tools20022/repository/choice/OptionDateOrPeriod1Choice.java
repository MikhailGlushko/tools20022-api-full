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

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Option;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the exercise date or notice period for a call/put option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionDateOrPeriod1Choice#mmEarliestExerciseDate
 * OptionDateOrPeriod1Choice.mmEarliestExerciseDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OptionDateOrPeriod1Choice#mmNoticePeriod
 * OptionDateOrPeriod1Choice.mmNoticePeriod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Option Option}</li>
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
 * "OptionDateOrPeriod1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the exercise date or notice period for a call/put option."</li>
 * </ul>
 */
public class OptionDateOrPeriod1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate earliestExerciseDate;
	/**
	 * First date on which the call option or the put option can be exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmEarliestExerciseDate
	 * Option.mmEarliestExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OptionDateOrPeriod1Choice
	 * OptionDateOrPeriod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstExrcDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestExerciseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First date on which the call option or the put option can be exercised. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEarliestExerciseDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Option.mmEarliestExerciseDate;
			componentContext_lazy = () -> OptionDateOrPeriod1Choice.mmObject();
			isDerived = false;
			xmlTag = "EarlstExrcDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestExerciseDate";
			definition = "First date on which the call option or the put option can be exercised. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Number noticePeriod;
	/**
	 * Number of calendar days that the holder of the instrument/issuer of the
	 * instrument will give to the issuer/holder of the instrument before
	 * exercising the put/call option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPeriod
	 * SecuritiesConversion.mmConversionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OptionDateOrPeriod1Choice
	 * OptionDateOrPeriod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtcePrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoticePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of calendar days that the holder of the instrument/issuer of the instrument will give to the issuer/holder of the instrument before exercising the put/call option. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNoticePeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmConversionPeriod;
			componentContext_lazy = () -> OptionDateOrPeriod1Choice.mmObject();
			isDerived = false;
			xmlTag = "NtcePrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoticePeriod";
			definition = "Number of calendar days that the holder of the instrument/issuer of the instrument will give to the issuer/holder of the instrument before exercising the put/call option. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OptionDateOrPeriod1Choice.mmEarliestExerciseDate, com.tools20022.repository.choice.OptionDateOrPeriod1Choice.mmNoticePeriod);
				trace_lazy = () -> Option.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OptionDateOrPeriod1Choice";
				definition = "Provides the exercise date or notice period for a call/put option.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getEarliestExerciseDate() {
		return earliestExerciseDate;
	}

	public void setEarliestExerciseDate(ISODate earliestExerciseDate) {
		this.earliestExerciseDate = earliestExerciseDate;
	}

	public Number getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(Number noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
}
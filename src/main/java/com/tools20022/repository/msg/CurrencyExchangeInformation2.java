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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CurrencyExchangeReport2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports on currency exchange information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeInformation2#mmCurrencyExchangeReport
 * CurrencyExchangeInformation2.mmCurrencyExchangeReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyExchangeInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reports on currency exchange information."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyExchangeInformation2", propOrder = "currencyExchangeReport")
public class CurrencyExchangeInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CcyXchgRpt", required = true)
	protected List<CurrencyExchangeReport2> currencyExchangeReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport2
	 * CurrencyExchangeReport2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeInformation2
	 * CurrencyExchangeInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyXchgRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reports either on currency exchange information or on a business error."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyExchangeInformation2, List<CurrencyExchangeReport2>> mmCurrencyExchangeReport = new MMMessageAssociationEnd<CurrencyExchangeInformation2, List<CurrencyExchangeReport2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyExchangeInformation2.mmObject();
			isDerived = false;
			xmlTag = "CcyXchgRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchangeReport";
			definition = "Reports either on currency exchange information or on a business error.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CurrencyExchangeReport2.mmObject();
		}

		@Override
		public List<CurrencyExchangeReport2> getValue(CurrencyExchangeInformation2 obj) {
			return obj.getCurrencyExchangeReport();
		}

		@Override
		public void setValue(CurrencyExchangeInformation2 obj, List<CurrencyExchangeReport2> value) {
			obj.setCurrencyExchangeReport(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchangeInformation2.mmCurrencyExchangeReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CurrencyExchangeInformation2";
				definition = "Reports on currency exchange information.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<CurrencyExchangeReport2> getCurrencyExchangeReport() {
		return currencyExchangeReport == null ? currencyExchangeReport = new ArrayList<>() : currencyExchangeReport;
	}

	public CurrencyExchangeInformation2 setCurrencyExchangeReport(List<CurrencyExchangeReport2> currencyExchangeReport) {
		this.currencyExchangeReport = Objects.requireNonNull(currencyExchangeReport);
		return this;
	}
}
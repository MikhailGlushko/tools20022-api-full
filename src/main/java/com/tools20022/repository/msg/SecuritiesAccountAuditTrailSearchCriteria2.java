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
import com.tools20022.repository.choice.DateSearchChoice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesAccount19;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes search criteria for securities account audit trail query.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailSearchCriteria2#mmSecuritiesAccountIdentification
 * SecuritiesAccountAuditTrailSearchCriteria2.mmSecuritiesAccountIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailSearchCriteria2#mmDatePeriod
 * SecuritiesAccountAuditTrailSearchCriteria2.mmDatePeriod}</li>
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
 * "SecuritiesAccountAuditTrailSearchCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes search criteria for securities account audit trail query."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailSearchCriteria1
 * SecuritiesAccountAuditTrailSearchCriteria1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccountAuditTrailSearchCriteria2", propOrder = {"securitiesAccountIdentification", "datePeriod"})
public class SecuritiesAccountAuditTrailSearchCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesAcctId")
	protected SecuritiesAccount19 securitiesAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailSearchCriteria2
	 * SecuritiesAccountAuditTrailSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes securities account to be queried."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailSearchCriteria1#mmSecuritiesAccountIdentification
	 * SecuritiesAccountAuditTrailSearchCriteria1.
	 * mmSecuritiesAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountAuditTrailSearchCriteria2, Optional<SecuritiesAccount19>> mmSecuritiesAccountIdentification = new MMMessageAttribute<SecuritiesAccountAuditTrailSearchCriteria2, Optional<SecuritiesAccount19>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountAuditTrailSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountIdentification";
			definition = "Describes securities account to be queried.";
			previousVersion_lazy = () -> SecuritiesAccountAuditTrailSearchCriteria1.mmSecuritiesAccountIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesAccount19.mmObject();
		}

		@Override
		public Optional<SecuritiesAccount19> getValue(SecuritiesAccountAuditTrailSearchCriteria2 obj) {
			return obj.getSecuritiesAccountIdentification();
		}

		@Override
		public void setValue(SecuritiesAccountAuditTrailSearchCriteria2 obj, Optional<SecuritiesAccount19> value) {
			obj.setSecuritiesAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DtPrd")
	protected DateSearchChoice datePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailSearchCriteria2
	 * SecuritiesAccountAuditTrailSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes date period for querying information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountAuditTrailSearchCriteria1#mmDatePeriod
	 * SecuritiesAccountAuditTrailSearchCriteria1.mmDatePeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountAuditTrailSearchCriteria2, Optional<DateSearchChoice>> mmDatePeriod = new MMMessageAttribute<SecuritiesAccountAuditTrailSearchCriteria2, Optional<DateSearchChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountAuditTrailSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "DtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatePeriod";
			definition = "Describes date period for querying information.";
			previousVersion_lazy = () -> SecuritiesAccountAuditTrailSearchCriteria1.mmDatePeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}

		@Override
		public Optional<DateSearchChoice> getValue(SecuritiesAccountAuditTrailSearchCriteria2 obj) {
			return obj.getDatePeriod();
		}

		@Override
		public void setValue(SecuritiesAccountAuditTrailSearchCriteria2 obj, Optional<DateSearchChoice> value) {
			obj.setDatePeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccountAuditTrailSearchCriteria2.mmSecuritiesAccountIdentification,
						com.tools20022.repository.msg.SecuritiesAccountAuditTrailSearchCriteria2.mmDatePeriod);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccountAuditTrailSearchCriteria2";
				definition = "Describes search criteria for securities account audit trail query.";
				previousVersion_lazy = () -> SecuritiesAccountAuditTrailSearchCriteria1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecuritiesAccount19> getSecuritiesAccountIdentification() {
		return securitiesAccountIdentification == null ? Optional.empty() : Optional.of(securitiesAccountIdentification);
	}

	public SecuritiesAccountAuditTrailSearchCriteria2 setSecuritiesAccountIdentification(SecuritiesAccount19 securitiesAccountIdentification) {
		this.securitiesAccountIdentification = securitiesAccountIdentification;
		return this;
	}

	public Optional<DateSearchChoice> getDatePeriod() {
		return datePeriod == null ? Optional.empty() : Optional.of(datePeriod);
	}

	public SecuritiesAccountAuditTrailSearchCriteria2 setDatePeriod(DateSearchChoice datePeriod) {
		this.datePeriod = datePeriod;
		return this;
	}
}
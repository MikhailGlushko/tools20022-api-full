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
import com.tools20022.repository.choice.ResidenceLocation1Choice;
import com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code;
import com.tools20022.repository.datatype.Max40Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes account taxing parameters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountTax1#mmCalculationMethod
 * AccountTax1.mmCalculationMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountTax1#mmRegion
 * AccountTax1.mmRegion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountTax1#mmNonResidenceCountry
 * AccountTax1.mmNonResidenceCountry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
 * "AccountTax1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Describes account taxing parameters."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountTax1", propOrder = {"calculationMethod", "region", "nonResidenceCountry"})
public class AccountTax1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BillingTaxCalculationMethod1Code calculationMethod;
	/**
	 * Defines the calculation method on how the taxes are applied on the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BillingTaxCalculationMethod1Code
	 * BillingTaxCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountTax1 AccountTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the calculation method on how the taxes are applied on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCalculationMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountTax1.mmObject();
			isDerived = false;
			xmlTag = "ClctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationMethod";
			definition = "Defines the calculation method on how the taxes are applied on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BillingTaxCalculationMethod1Code.mmObject();
		}
	};
	protected Max40Text region;
	/**
	 * Identifies the tax region in which the account resides.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max40Text
	 * Max40Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAdministrationZone
	 * Tax.mmAdministrationZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountTax1 AccountTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Region"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the tax region in which the account resides."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegion = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAdministrationZone;
			componentContext_lazy = () -> AccountTax1.mmObject();
			isDerived = false;
			xmlTag = "Rgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Region";
			definition = "Identifies the tax region in which the account resides.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
	protected ResidenceLocation1Choice nonResidenceCountry;
	/**
	 * Specifies the country of residence, when the account owner does not
	 * reside in the account's tax region.
	 * 
	 * Usage: If present, the account owner does not reside in the account's tax
	 * region.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ResidenceLocation1Choice
	 * ResidenceLocation1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmContactPoint
	 * Party.mmContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountTax1 AccountTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonResCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonResidenceCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the country of residence, when the account owner does not reside in the account's tax region.\n\nUsage: If present, the account owner does not reside in the account's tax region."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonResidenceCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmContactPoint;
			componentContext_lazy = () -> AccountTax1.mmObject();
			isDerived = false;
			xmlTag = "NonResCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResidenceCountry";
			definition = "Specifies the country of residence, when the account owner does not reside in the account's tax region.\n\nUsage: If present, the account owner does not reside in the account's tax region.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ResidenceLocation1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountTax1.mmCalculationMethod, AccountTax1.mmRegion, AccountTax1.mmNonResidenceCountry);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountTax1";
				definition = "Describes account taxing parameters.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ClctnMtd", required = true)
	public BillingTaxCalculationMethod1Code getCalculationMethod() {
		return calculationMethod;
	}

	public void setCalculationMethod(BillingTaxCalculationMethod1Code calculationMethod) {
		this.calculationMethod = calculationMethod;
	}

	@XmlElement(name = "Rgn")
	public Max40Text getRegion() {
		return region;
	}

	public void setRegion(Max40Text region) {
		this.region = region;
	}

	@XmlElement(name = "NonResCtry")
	public ResidenceLocation1Choice getNonResidenceCountry() {
		return nonResidenceCountry;
	}

	public void setNonResidenceCountry(ResidenceLocation1Choice nonResidenceCountry) {
		this.nonResidenceCountry = nonResidenceCountry;
	}
}
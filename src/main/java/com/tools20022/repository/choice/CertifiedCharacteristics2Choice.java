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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.msg.Quantity9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics of the goods that are certified, in the context of a
 * commercial trade transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmOrigin
 * CertifiedCharacteristics2Choice.mmOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmQuality
 * CertifiedCharacteristics2Choice.mmQuality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmAnalysis
 * CertifiedCharacteristics2Choice.mmAnalysis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmWeight
 * CertifiedCharacteristics2Choice.mmWeight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmQuantity
 * CertifiedCharacteristics2Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmHealthIndication
 * CertifiedCharacteristics2Choice.mmHealthIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmPhytosanitaryIndication
 * CertifiedCharacteristics2Choice.mmPhytosanitaryIndication}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
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
 * "CertifiedCharacteristics2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics of the goods that are certified, in the context of a commercial trade transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice
 * CertifiedCharacteristics1Choice}</li>
 * </ul>
 */
public class CertifiedCharacteristics2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CountryCode origin;
	/**
	 * Country of origin of the goods, as proven by the certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmOrigin
	 * Product.mmOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Orgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Origin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of origin of the goods, as proven by the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmOrigin
	 * CertifiedCharacteristics1Choice.mmOrigin}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrigin = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.mmOrigin;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "Orgn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Origin";
			definition = "Country of origin of the goods, as proven by the certificate.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmOrigin;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected Max70Text quality;
	/**
	 * Quality of the goods, as proven by the certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuality
	 * Product.mmQuality}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qlty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quality of the goods, as proven by the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmQuality
	 * CertifiedCharacteristics1Choice.mmQuality}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuality = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.mmQuality;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "Qlty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quality";
			definition = "Quality of the goods, as proven by the certificate.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmQuality;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max70Text analysis;
	/**
	 * Analysis of the goods, as proven by the certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Goods#mmAnalysis
	 * Goods.mmAnalysis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Anlys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Analysis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Analysis of the goods, as proven by the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmAnalysis
	 * CertifiedCharacteristics1Choice.mmAnalysis}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAnalysis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Goods.mmAnalysis;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "Anlys";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Analysis";
			definition = "Analysis of the goods, as proven by the certificate.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmAnalysis;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Quantity9 weight;
	/**
	 * Weight of the goods, as proven by the certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity9
	 * Quantity9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuantity
	 * Product.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Weight of the goods, as proven by the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmWeight
	 * CertifiedCharacteristics1Choice.mmWeight}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWeight = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.mmQuantity;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "Wght";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weight";
			definition = "Weight of the goods, as proven by the certificate.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmWeight;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity9.mmObject();
		}
	};
	protected Quantity9 quantity;
	/**
	 * Quantity of the goods, as proven by the certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity9
	 * Quantity9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuantity
	 * Product.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of the goods, as proven by the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmQuantity
	 * CertifiedCharacteristics1Choice.mmQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.mmQuantity;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of the goods, as proven by the certificate.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity9.mmObject();
		}
	};
	protected YesNoIndicator healthIndication;
	/**
	 * Indicates if the goods have passed the health check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Goods#mmHealthCheck
	 * Goods.mmHealthCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HlthIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HealthIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if the goods have passed the health check."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmHealthIndication
	 * CertifiedCharacteristics1Choice.mmHealthIndication}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHealthIndication = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Goods.mmHealthCheck;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "HlthIndctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HealthIndication";
			definition = "Indicates if the goods have passed the health check.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmHealthIndication;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator phytosanitaryIndication;
	/**
	 * Indicates if the goods have passed the phytosanitary check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Goods#mmPhytosanitaryInspection
	 * Goods.mmPhytosanitaryInspection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
	 * CertifiedCharacteristics2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhytosntryIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhytosanitaryIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the goods have passed the phytosanitary check."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmPhytosanitaryIndication
	 * CertifiedCharacteristics1Choice.mmPhytosanitaryIndication}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPhytosanitaryIndication = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Goods.mmPhytosanitaryInspection;
			componentContext_lazy = () -> CertifiedCharacteristics2Choice.mmObject();
			isDerived = false;
			xmlTag = "PhytosntryIndctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhytosanitaryIndication";
			definition = "Indicates if the goods have passed the phytosanitary check.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmPhytosanitaryIndication;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CertifiedCharacteristics2Choice.mmOrigin, com.tools20022.repository.choice.CertifiedCharacteristics2Choice.mmQuality,
						com.tools20022.repository.choice.CertifiedCharacteristics2Choice.mmAnalysis, com.tools20022.repository.choice.CertifiedCharacteristics2Choice.mmWeight,
						com.tools20022.repository.choice.CertifiedCharacteristics2Choice.mmQuantity, com.tools20022.repository.choice.CertifiedCharacteristics2Choice.mmHealthIndication,
						com.tools20022.repository.choice.CertifiedCharacteristics2Choice.mmPhytosanitaryIndication);
				trace_lazy = () -> Product.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CertifiedCharacteristics2Choice";
				definition = "Characteristics of the goods that are certified, in the context of a commercial trade transaction.";
				previousVersion_lazy = () -> CertifiedCharacteristics1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getOrigin() {
		return origin;
	}

	public void setOrigin(CountryCode origin) {
		this.origin = origin;
	}

	public Max70Text getQuality() {
		return quality;
	}

	public void setQuality(Max70Text quality) {
		this.quality = quality;
	}

	public Max70Text getAnalysis() {
		return analysis;
	}

	public void setAnalysis(Max70Text analysis) {
		this.analysis = analysis;
	}

	public Quantity9 getWeight() {
		return weight;
	}

	public void setWeight(Quantity9 weight) {
		this.weight = weight;
	}

	public Quantity9 getQuantity() {
		return quantity;
	}

	public void setQuantity(Quantity9 quantity) {
		this.quantity = quantity;
	}

	public YesNoIndicator getHealthIndication() {
		return healthIndication;
	}

	public void setHealthIndication(YesNoIndicator healthIndication) {
		this.healthIndication = healthIndication;
	}

	public YesNoIndicator getPhytosanitaryIndication() {
		return phytosanitaryIndication;
	}

	public void setPhytosanitaryIndication(YesNoIndicator phytosanitaryIndication) {
		this.phytosanitaryIndication = phytosanitaryIndication;
	}
}
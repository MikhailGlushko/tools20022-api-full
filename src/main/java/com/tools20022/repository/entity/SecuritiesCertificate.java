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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Physical representation of a security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesCertificate"
 * src="doc-files/SecuritiesCertificate.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
 * SecuritiesCertificate.mmNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmBasicRegistration
 * SecuritiesCertificate.mmBasicRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmRelatedDelivery
 * SecuritiesCertificate.mmRelatedDelivery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForSecuritiesCertificate
 * GenericIdentification.mmIdentificationForSecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmIssuedCertificateNumber
 * PhysicalDelivery.mmIssuedCertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecuritiesCertificate
 * BasicSecuritiesRegistration.mmSecuritiesCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCertificate1
 * SecuritiesCertificate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCertificate2
 * SecuritiesCertificate2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCertificate3
 * SecuritiesCertificate3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCertificate4
 * SecuritiesCertificate4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCertificate5
 * SecuritiesCertificate5}</li>
 * </ul>
 * </li>
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
 * "SecuritiesCertificate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Physical representation of a security."</li>
 * </ul>
 */
public class SecuritiesCertificate {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification number;
	/**
	 * Identifier of a certificate assigned by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForSecuritiesCertificate
	 * GenericIdentification.mmIdentificationForSecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit1#mmCertificateNumber
	 * Unit1.mmCertificateNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit3#mmCertificateNumber
	 * Unit3.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1#mmCertificateNumber
	 * RegistrationParameters1.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters2#mmCertificateNumber
	 * RegistrationParameters2.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmCertificateNumber
	 * FinancialInstrumentAttributes1.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate3#mmNumber
	 * SecuritiesCertificate3.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmCertificateNumber
	 * FinancialInstrumentAttributes31.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmCertificateNumber
	 * FinancialInstrumentAttributes44.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity5#mmCertificateNumber
	 * Quantity5.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity6#mmCertificateNumber
	 * Quantity6.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity7#mmCertificateNumber
	 * Quantity7.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity8#mmCertificateNumber
	 * Quantity8.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmCertificateNumber
	 * CommonFinancialInstrumentAttributes1.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4#mmCertificateNumber
	 * RegistrationParameters4.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity11#mmCertificateNumber
	 * Quantity11.mmCertificateNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#mmCertificateNumber
	 * Unit6.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters5#mmCertificateNumber
	 * RegistrationParameters5.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity12#mmCertificateNumber
	 * Quantity12.mmCertificateNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of a certificate assigned by the issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNumber = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Unit1.mmCertificateNumber, com.tools20022.repository.msg.Unit3.mmCertificateNumber, com.tools20022.repository.msg.RegistrationParameters1.mmCertificateNumber,
					com.tools20022.repository.msg.RegistrationParameters2.mmCertificateNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmCertificateNumber, com.tools20022.repository.msg.SecuritiesCertificate3.mmNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.mmCertificateNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes44.mmCertificateNumber,
					com.tools20022.repository.msg.Quantity5.mmCertificateNumber, com.tools20022.repository.msg.Quantity6.mmCertificateNumber, com.tools20022.repository.msg.Quantity7.mmCertificateNumber,
					com.tools20022.repository.msg.Quantity8.mmCertificateNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.mmCertificateNumber,
					com.tools20022.repository.msg.RegistrationParameters4.mmCertificateNumber, com.tools20022.repository.msg.Quantity11.mmCertificateNumber, com.tools20022.repository.msg.Unit6.mmCertificateNumber,
					com.tools20022.repository.msg.RegistrationParameters5.mmCertificateNumber, com.tools20022.repository.msg.Quantity12.mmCertificateNumber);
			elementContext_lazy = () -> SecuritiesCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Identifier of a certificate assigned by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForSecuritiesCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected BasicSecuritiesRegistration basicRegistration;
	/**
	 * Registration process which requires a securities certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecuritiesCertificate
	 * BasicSecuritiesRegistration.mmSecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasicRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Registration process which requires a securities certificate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBasicRegistration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasicRegistration";
			definition = "Registration process which requires a securities certificate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecuritiesCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
		}
	};
	protected PhysicalDelivery relatedDelivery;
	/**
	 * Delivery parameters which specify the certificate parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmIssuedCertificateNumber
	 * PhysicalDelivery.mmIssuedCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivery parameters which specify the certificate parameters."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDelivery";
			definition = "Delivery parameters which specify the certificate parameters.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmIssuedCertificateNumber;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesCertificate";
				definition = "Physical representation of a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentificationForSecuritiesCertificate, com.tools20022.repository.entity.PhysicalDelivery.mmIssuedCertificateNumber,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecuritiesCertificate);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesCertificate.mmNumber, com.tools20022.repository.entity.SecuritiesCertificate.mmBasicRegistration,
						com.tools20022.repository.entity.SecuritiesCertificate.mmRelatedDelivery);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesCertificate1.mmObject(), SecuritiesCertificate2.mmObject(), SecuritiesCertificate3.mmObject(), SecuritiesCertificate4.mmObject(), SecuritiesCertificate5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification getNumber() {
		return number;
	}

	public void setNumber(com.tools20022.repository.entity.GenericIdentification number) {
		this.number = number;
	}

	public BasicSecuritiesRegistration getBasicRegistration() {
		return basicRegistration;
	}

	public void setBasicRegistration(com.tools20022.repository.entity.BasicSecuritiesRegistration basicRegistration) {
		this.basicRegistration = basicRegistration;
	}

	public PhysicalDelivery getRelatedDelivery() {
		return relatedDelivery;
	}

	public void setRelatedDelivery(com.tools20022.repository.entity.PhysicalDelivery relatedDelivery) {
		this.relatedDelivery = relatedDelivery;
	}
}
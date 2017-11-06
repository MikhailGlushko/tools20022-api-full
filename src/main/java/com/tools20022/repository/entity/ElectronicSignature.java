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
import com.tools20022.repository.entity.Signature;
import com.tools20022.repository.msg.PartyAndSignature2;
import com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Additional security provisions, such as a digital signature.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ElectronicSignature" src="doc-files/ElectronicSignature.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#mmUndertaking
 * ElectronicSignature.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#mmRelatedSecurityCertificate
 * ElectronicSignature.mmRelatedSecurityCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmElectronicSignature
 * Undertaking.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#mmElectronicSignature
 * SecurityCertificate.mmElectronicSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature2#mmSignature
 * PartyAndSignature2.mmSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation1#mmElectronicSignature
 * MandateRelatedInformation1.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation6#mmElectronicSignature
 * MandateRelatedInformation6.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation7#mmElectronicSignature
 * MandateRelatedInformation7.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmElectronicSignature
 * MandateRelatedInformation8.mmElectronicSignature}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Document9#mmDigitalSignature
 * Document9.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmElectronicSignature
 * MandateRelatedInformation9.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation4#mmElectronicSignature
 * MandateRelatedInformation4.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation5#mmElectronicSignature
 * MandateRelatedInformation5.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmElectronicSignature
 * MandateRelatedInformation10.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmDigitalSignature
 * BusinessLetter1.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1#mmSignature
 * QualifiedPartyAndXMLSignature1.mmSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmElectronicSignature
 * MandateRelatedInformation11.mmElectronicSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Signature
 * Signature}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature2
 * PartyAndSignature2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1
 * QualifiedPartyAndXMLSignature1}</li>
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
 * "ElectronicSignature"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additional security provisions, such as a digital signature."</li>
 * </ul>
 */
public class ElectronicSignature extends Signature {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Undertaking undertaking;
	/**
	 * Undertaking for which a signature is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmElectronicSignature
	 * Undertaking.mmElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking for which a signature is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertaking = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ElectronicSignature.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which a signature is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.mmElectronicSignature;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecurityCertificate> relatedSecurityCertificate;
	/**
	 * Certificate linked to a digital signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#mmElectronicSignature
	 * SecurityCertificate.mmElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecurityCertificate
	 * SecurityCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyAndCertificate1#mmCertificate
	 * PartyAndCertificate1.mmCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecurityCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate linked to a digital signature."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSecurityCertificate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyAndCertificate1.mmCertificate);
			elementContext_lazy = () -> ElectronicSignature.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecurityCertificate";
			definition = "Certificate linked to a digital signature.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.mmElectronicSignature;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ElectronicSignature";
				definition = "Additional security provisions, such as a digital signature.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.mmElectronicSignature, com.tools20022.repository.entity.SecurityCertificate.mmElectronicSignature);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyAndSignature2.mmSignature, com.tools20022.repository.msg.MandateRelatedInformation1.mmElectronicSignature,
						com.tools20022.repository.msg.MandateRelatedInformation6.mmElectronicSignature, com.tools20022.repository.msg.MandateRelatedInformation7.mmElectronicSignature,
						com.tools20022.repository.msg.MandateRelatedInformation8.mmElectronicSignature, com.tools20022.repository.msg.Document9.mmDigitalSignature,
						com.tools20022.repository.msg.MandateRelatedInformation9.mmElectronicSignature, com.tools20022.repository.msg.MandateRelatedInformation4.mmElectronicSignature,
						com.tools20022.repository.msg.MandateRelatedInformation5.mmElectronicSignature, com.tools20022.repository.msg.MandateRelatedInformation10.mmElectronicSignature,
						com.tools20022.repository.msg.BusinessLetter1.mmDigitalSignature, com.tools20022.repository.msg.QualifiedPartyAndXMLSignature1.mmSignature,
						com.tools20022.repository.msg.MandateRelatedInformation11.mmElectronicSignature);
				superType_lazy = () -> Signature.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ElectronicSignature.mmUndertaking, com.tools20022.repository.entity.ElectronicSignature.mmRelatedSecurityCertificate);
				derivationComponent_lazy = () -> Arrays.asList(PartyAndSignature2.mmObject(), QualifiedPartyAndXMLSignature1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking getUndertaking() {
		return undertaking;
	}

	public void setUndertaking(com.tools20022.repository.entity.Undertaking undertaking) {
		this.undertaking = undertaking;
	}

	public List<SecurityCertificate> getRelatedSecurityCertificate() {
		return relatedSecurityCertificate;
	}

	public void setRelatedSecurityCertificate(List<com.tools20022.repository.entity.SecurityCertificate> relatedSecurityCertificate) {
		this.relatedSecurityCertificate = relatedSecurityCertificate;
	}
}
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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of certification required.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
 * BeneficiaryCertificationTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#mmAccreditedInvestor
 * BeneficiaryCertificationType4Code.mmAccreditedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#mmDomicileCountry
 * BeneficiaryCertificationType4Code.mmDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#mmNonDomicileCountry
 * BeneficiaryCertificationType4Code.mmNonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#mmFullBeneficialOwnerBreakdown
 * BeneficiaryCertificationType4Code.mmFullBeneficialOwnerBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#mmNonCompany
 * BeneficiaryCertificationType4Code.mmNonCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#mmQIBCertification
 * BeneficiaryCertificationType4Code.mmQIBCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#mmTaxRateBreakdown
 * BeneficiaryCertificationType4Code.mmTaxRateBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#mmBeneficialOwnerPaperwork
 * BeneficiaryCertificationType4Code.mmBeneficialOwnerPaperwork}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#mmICSDParticipantBreakdown
 * BeneficiaryCertificationType4Code.mmICSDParticipantBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code#mmFractionBreakdown
 * BeneficiaryCertificationType4Code.mmFractionBreakdown}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACCI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BeneficiaryCertificationType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of certification required."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType2Code
 * BeneficiaryCertificationType2Code}</li>
 * </ul>
 */
public class BeneficiaryCertificationType4Code extends BeneficiaryCertificationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccreditedInvestor"</li>
	 * </ul>
	 */
	public static final MMCode mmAccreditedInvestor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccreditedInvestor";
			owner_lazy = () -> BeneficiaryCertificationType4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomicileCountry"</li>
	 * </ul>
	 */
	public static final MMCode mmDomicileCountry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomicileCountry";
			owner_lazy = () -> BeneficiaryCertificationType4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDomicileCountry"</li>
	 * </ul>
	 */
	public static final MMCode mmNonDomicileCountry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDomicileCountry";
			owner_lazy = () -> BeneficiaryCertificationType4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullBeneficialOwnerBreakdown"</li>
	 * </ul>
	 */
	public static final MMCode mmFullBeneficialOwnerBreakdown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullBeneficialOwnerBreakdown";
			owner_lazy = () -> BeneficiaryCertificationType4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCompany"</li>
	 * </ul>
	 */
	public static final MMCode mmNonCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCompany";
			owner_lazy = () -> BeneficiaryCertificationType4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QIBCertification"</li>
	 * </ul>
	 */
	public static final MMCode mmQIBCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QIBCertification";
			owner_lazy = () -> BeneficiaryCertificationType4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRateBreakdown"</li>
	 * </ul>
	 */
	public static final MMCode mmTaxRateBreakdown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRateBreakdown";
			owner_lazy = () -> BeneficiaryCertificationType4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerPaperwork"</li>
	 * </ul>
	 */
	public static final MMCode mmBeneficialOwnerPaperwork = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerPaperwork";
			owner_lazy = () -> BeneficiaryCertificationType4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICSDParticipantBreakdown"</li>
	 * </ul>
	 */
	public static final MMCode mmICSDParticipantBreakdown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICSDParticipantBreakdown";
			owner_lazy = () -> BeneficiaryCertificationType4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType4Code
	 * BeneficiaryCertificationType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionBreakdown"</li>
	 * </ul>
	 */
	public static final MMCode mmFractionBreakdown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionBreakdown";
			owner_lazy = () -> BeneficiaryCertificationType4Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACCI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BeneficiaryCertificationType4Code";
				definition = "Specifies the type of certification required.";
				previousVersion_lazy = () -> BeneficiaryCertificationType2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmAccreditedInvestor, com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmDomicileCountry,
						com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmNonDomicileCountry, com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmFullBeneficialOwnerBreakdown,
						com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmNonCompany, com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmQIBCertification,
						com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmTaxRateBreakdown, com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmBeneficialOwnerPaperwork,
						com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmICSDParticipantBreakdown, com.tools20022.repository.codeset.BeneficiaryCertificationType4Code.mmFractionBreakdown);
				trace_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
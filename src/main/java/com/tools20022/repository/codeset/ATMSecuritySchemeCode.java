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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Key exchange security scheme on an ATM for the host manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#mmApplicationRemoteKeyLoading
 * ATMSecuritySchemeCode.mmApplicationRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#mmCertificateRemoteKeyLoading
 * ATMSecuritySchemeCode.mmCertificateRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#mmGermanRemoteKeyLoading
 * ATMSecuritySchemeCode.mmGermanRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#mmFrenchRemoteKeyLoading
 * ATMSecuritySchemeCode.mmFrenchRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#mmLuxemburgRemoteKeyLoading
 * ATMSecuritySchemeCode.mmLuxemburgRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#mmManualKeyEntry
 * ATMSecuritySchemeCode.mmManualKeyEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#mmPKIKeyDownload
 * ATMSecuritySchemeCode.mmPKIKeyDownload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#mmSignatureRemoteKeyLoading
 * ATMSecuritySchemeCode.mmSignatureRemoteKeyLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode#mmUnitialised
 * ATMSecuritySchemeCode.mmUnitialised}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code
 * ATMSecurityScheme2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code
 * ATMSecurityScheme1Code}</li>
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
 * "ATMSecuritySchemeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Key exchange security scheme on an ATM for the host manager."</li>
 * </ul>
 */
public class ATMSecuritySchemeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Application key download protected by a share symmetric key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationRemoteKeyLoading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Application key download protected by a share symmetric key."</li>
	 * </ul>
	 */
	public static final MMCode mmApplicationRemoteKeyLoading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationRemoteKeyLoading";
			definition = "Application key download protected by a share symmetric key.";
			owner_lazy = () -> ATMSecuritySchemeCode.mmObject();
			codeName = "APPK";
		}
	};
	/**
	 * Key download protected by asymmetric keys authenticated by a certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateRemoteKeyLoading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key download protected by asymmetric keys authenticated by a certificate."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCertificateRemoteKeyLoading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateRemoteKeyLoading";
			definition = "Key download protected by asymmetric keys authenticated by a certificate.";
			owner_lazy = () -> ATMSecuritySchemeCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Key download conform to the German ATM key download security scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanRemoteKeyLoading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key download conform to the German ATM key download security scheme."</li>
	 * </ul>
	 */
	public static final MMCode mmGermanRemoteKeyLoading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanRemoteKeyLoading";
			definition = "Key download conform to the German ATM key download security scheme.";
			owner_lazy = () -> ATMSecuritySchemeCode.mmObject();
			codeName = "DTCH";
		}
	};
	/**
	 * Key download conform to the French ATM key download security scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchRemoteKeyLoading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key download conform to the French ATM key download security scheme."</li>
	 * </ul>
	 */
	public static final MMCode mmFrenchRemoteKeyLoading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchRemoteKeyLoading";
			definition = "Key download conform to the French ATM key download security scheme.";
			owner_lazy = () -> ATMSecuritySchemeCode.mmObject();
			codeName = "FRAN";
		}
	};
	/**
	 * Key download conform to the Luxemburg ATM key download security scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LUXG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LuxemburgRemoteKeyLoading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key download conform to the Luxemburg ATM key download security scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLuxemburgRemoteKeyLoading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LuxemburgRemoteKeyLoading";
			definition = "Key download conform to the Luxemburg ATM key download security scheme.";
			owner_lazy = () -> ATMSecuritySchemeCode.mmObject();
			codeName = "LUXG";
		}
	};
	/**
	 * Manual key entry on the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MANU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualKeyEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Manual key entry on the ATM."</li>
	 * </ul>
	 */
	public static final MMCode mmManualKeyEntry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualKeyEntry";
			definition = "Manual key entry on the ATM.";
			owner_lazy = () -> ATMSecuritySchemeCode.mmObject();
			codeName = "MANU";
		}
	};
	/**
	 * Key download protected by asymmetric keys authenticated by a PKI (Public
	 * Key Infrastructure).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PKIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PKIKeyDownload"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key download protected by asymmetric keys authenticated by a PKI (Public Key Infrastructure)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPKIKeyDownload = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PKIKeyDownload";
			definition = "Key download protected by asymmetric keys authenticated by a PKI (Public Key Infrastructure).";
			owner_lazy = () -> ATMSecuritySchemeCode.mmObject();
			codeName = "PKIP";
		}
	};
	/**
	 * Key download protected by asymmetric keys authenticated by a digital
	 * signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureRemoteKeyLoading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key download protected by asymmetric keys authenticated by a digital signature."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSignatureRemoteKeyLoading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureRemoteKeyLoading";
			definition = "Key download protected by asymmetric keys authenticated by a digital signature.";
			owner_lazy = () -> ATMSecuritySchemeCode.mmObject();
			codeName = "SIGN";
		}
	};
	/**
	 * No key exchange performed, no security scheme defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecuritySchemeCode
	 * ATMSecuritySchemeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unitialised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No key exchange performed, no security scheme defined."</li>
	 * </ul>
	 */
	public static final MMCode mmUnitialised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unitialised";
			definition = "No key exchange performed, no security scheme defined.";
			owner_lazy = () -> ATMSecuritySchemeCode.mmObject();
			codeName = "NONE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMSecuritySchemeCode";
				definition = "Key exchange security scheme on an ATM for the host manager.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmApplicationRemoteKeyLoading, com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmCertificateRemoteKeyLoading,
						com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmGermanRemoteKeyLoading, com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmFrenchRemoteKeyLoading,
						com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmLuxemburgRemoteKeyLoading, com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmManualKeyEntry,
						com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmPKIKeyDownload, com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmSignatureRemoteKeyLoading,
						com.tools20022.repository.codeset.ATMSecuritySchemeCode.mmUnitialised);
				derivation_lazy = () -> Arrays.asList(ATMSecurityScheme2Code.mmObject(), ATMSecurityScheme1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
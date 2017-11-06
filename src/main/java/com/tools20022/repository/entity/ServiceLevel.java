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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ServiceLevelCode;
import com.tools20022.repository.codeset.SWIFTServiceLevelCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.ServiceLevel4;
import com.tools20022.repository.msg.ServiceLevel5;
import com.tools20022.repository.msg.ServiceLevel6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agreement under which or rules under which the transaction should be
 * processed.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ServiceLevel" src="doc-files/ServiceLevel.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ServiceLevel#mmPaymentProcessing
 * ServiceLevel.mmPaymentProcessing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ServiceLevel#mmCode
 * ServiceLevel.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ServiceLevel#mmOther
 * ServiceLevel.mmOther}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ServiceLevel#mmBilateral
 * ServiceLevel.mmBilateral}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmServiceLevel
 * PaymentProcessing.mmServiceLevel}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ServiceLevel2Choice#mmProprietary
 * ServiceLevel2Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ServiceLevel8Choice#mmProprietary
 * ServiceLevel8Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ServiceLevel3Choice#mmProprietary
 * ServiceLevel3Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ServiceLevel6Choice#mmProprietary
 * ServiceLevel6Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ServiceLevel7Choice#mmProprietary
 * ServiceLevel7Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ServiceLevel2Choice
 * ServiceLevel2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ServiceLevel8Choice
 * ServiceLevel8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ServiceLevel3Choice
 * ServiceLevel3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RestrictedProprietaryChoice
 * RestrictedProprietaryChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceLevel4 ServiceLevel4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ServiceLevel6Choice
 * ServiceLevel6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceLevel6 ServiceLevel6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceLevel5 ServiceLevel5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ServiceLevel7Choice
 * ServiceLevel7Choice}</li>
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
 * "ServiceLevel"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement under which or rules under which the transaction should be processed."
 * </li>
 * </ul>
 */
public class ServiceLevel {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentProcessing paymentProcessing;
	/**
	 * Payment process for which a service level is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmServiceLevel
	 * PaymentProcessing.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment process for which a service level is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentProcessing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ServiceLevel.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentProcessing";
			definition = "Payment process for which a service level is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmServiceLevel;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.mmObject();
		}
	};
	protected ServiceLevelCode code;
	/**
	 * Identification of a pre-agreed level of service between the parties in a
	 * coded form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceLevelCode
	 * ServiceLevelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ServiceLevel2Choice#mmCode
	 * ServiceLevel2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ServiceLevel8Choice#mmCode
	 * ServiceLevel8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ServiceLevel3Choice#mmCode
	 * ServiceLevel3Choice.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ServiceLevel4#mmCode
	 * ServiceLevel4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ServiceLevel6Choice#mmCode
	 * ServiceLevel6Choice.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ServiceLevel6#mmCode
	 * ServiceLevel6.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ServiceLevel5#mmCode
	 * ServiceLevel5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ServiceLevel7Choice#mmCode
	 * ServiceLevel7Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a pre-agreed level of service between the parties in a coded form."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ServiceLevel2Choice.mmCode, com.tools20022.repository.choice.ServiceLevel8Choice.mmCode, com.tools20022.repository.choice.ServiceLevel3Choice.mmCode,
					com.tools20022.repository.msg.ServiceLevel4.mmCode, com.tools20022.repository.choice.ServiceLevel6Choice.mmCode, com.tools20022.repository.msg.ServiceLevel6.mmCode, com.tools20022.repository.msg.ServiceLevel5.mmCode,
					com.tools20022.repository.choice.ServiceLevel7Choice.mmCode);
			elementContext_lazy = () -> ServiceLevel.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Identification of a pre-agreed level of service between the parties in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ServiceLevelCode.mmObject();
		}
	};
	protected SWIFTServiceLevelCode other;
	/**
	 * SWIFT defined service level applies to the payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevelCode
	 * SWIFTServiceLevelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmBankOperationCode
	 * RequestedModification.mmBankOperationCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SWIFT defined service level applies to the payment instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOther = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestedModification.mmBankOperationCode);
			elementContext_lazy = () -> ServiceLevel.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "SWIFT defined service level applies to the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SWIFTServiceLevelCode.mmObject();
		}
	};
	protected Max35Text bilateral;
	/**
	 * Unambiguous identification of a pre-agreed level of service between the
	 * parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of a pre-agreed level of service between the parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBilateral = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ServiceLevel.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bilateral";
			definition = "Unambiguous identification of a pre-agreed level of service between the parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ServiceLevel";
				definition = "Agreement under which or rules under which the transaction should be processed.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentProcessing.mmServiceLevel);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ServiceLevel2Choice.mmProprietary, com.tools20022.repository.choice.ServiceLevel8Choice.mmProprietary,
						com.tools20022.repository.choice.ServiceLevel3Choice.mmProprietary, com.tools20022.repository.choice.ServiceLevel6Choice.mmProprietary, com.tools20022.repository.choice.ServiceLevel7Choice.mmProprietary);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ServiceLevel.mmPaymentProcessing, com.tools20022.repository.entity.ServiceLevel.mmCode, com.tools20022.repository.entity.ServiceLevel.mmOther,
						com.tools20022.repository.entity.ServiceLevel.mmBilateral);
				derivationComponent_lazy = () -> Arrays.asList(ServiceLevel2Choice.mmObject(), ServiceLevel8Choice.mmObject(), ServiceLevel3Choice.mmObject(), RestrictedProprietaryChoice.mmObject(), ServiceLevel4.mmObject(),
						ServiceLevel6Choice.mmObject(), ServiceLevel6.mmObject(), ServiceLevel5.mmObject(), ServiceLevel7Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentProcessing getPaymentProcessing() {
		return paymentProcessing;
	}

	public void setPaymentProcessing(com.tools20022.repository.entity.PaymentProcessing paymentProcessing) {
		this.paymentProcessing = paymentProcessing;
	}

	public ServiceLevelCode getCode() {
		return code;
	}

	public void setCode(ServiceLevelCode code) {
		this.code = code;
	}

	public SWIFTServiceLevelCode getOther() {
		return other;
	}

	public void setOther(SWIFTServiceLevelCode other) {
		this.other = other;
	}

	public Max35Text getBilateral() {
		return bilateral;
	}

	public void setBilateral(Max35Text bilateral) {
		this.bilateral = bilateral;
	}
}
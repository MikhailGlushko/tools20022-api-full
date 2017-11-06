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
import com.tools20022.repository.choice.Appearance2Choice;
import com.tools20022.repository.choice.FormOfSecurity5Choice;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the form of the financial Instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentForm1#mmBookingAppearance
 * FinancialInstrumentForm1.mmBookingAppearance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentForm1#mmLegalForm
 * FinancialInstrumentForm1.mmLegalForm}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentForm1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the form of the financial Instrument."</li>
 * </ul>
 */
public class FinancialInstrumentForm1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Appearance2Choice bookingAppearance;
	/**
	 * Indicates the booking appareance of the financial Instrument
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Appearance2Choice
	 * Appearance2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentForm1
	 * FinancialInstrumentForm1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookgApprnc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingAppearance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the booking appareance of the financial Instrument"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBookingAppearance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentForm1.mmObject();
			isDerived = false;
			xmlTag = "BookgApprnc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookingAppearance";
			definition = "Indicates the booking appareance of the financial Instrument";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Appearance2Choice.mmObject();
		}
	};
	protected FormOfSecurity5Choice legalForm;
	/**
	 * Specifies the form, ie, ownership, of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FormOfSecurity5Choice
	 * FormOfSecurity5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentForm1
	 * FinancialInstrumentForm1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the form, ie, ownership, of the security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalForm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentForm1.mmObject();
			isDerived = false;
			xmlTag = "LglForm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalForm";
			definition = "Specifies the form, ie, ownership, of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FormOfSecurity5Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentForm1.mmBookingAppearance, com.tools20022.repository.msg.FinancialInstrumentForm1.mmLegalForm);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrumentForm1";
				definition = "Indicates the form of the financial Instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public Appearance2Choice getBookingAppearance() {
		return bookingAppearance;
	}

	public void setBookingAppearance(Appearance2Choice bookingAppearance) {
		this.bookingAppearance = bookingAppearance;
	}

	public FormOfSecurity5Choice getLegalForm() {
		return legalForm;
	}

	public void setLegalForm(FormOfSecurity5Choice legalForm) {
		this.legalForm = legalForm;
	}
}
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
import com.tools20022.repository.datatype.Max10Text;
import com.tools20022.repository.datatype.Min2Max3NumericText;
import com.tools20022.repository.datatype.Min8Max28NumericText;
import com.tools20022.repository.entity.PaymentCard;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Sensible data associated with the payment card performing the transaction
 * provided for verification in response.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData5#mmPAN
 * PlainCardData5.mmPAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlainCardData5#mmCardSequenceNumber
 * PlainCardData5.mmCardSequenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData5#mmEffectiveDate
 * PlainCardData5.mmEffectiveDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlainCardData5#mmExpiryDate
 * PlainCardData5.mmExpiryDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentCard
 * PaymentCard}</li>
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
 * "PlainCardData5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Sensible data associated with the payment card performing the transaction provided for verification in response."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PlainCardData3
 * PlainCardData3}</li>
 * </ul>
 */
public class PlainCardData5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Min8Max28NumericText pAN;
	/**
	 * Primary Account Number (PAN) of the card, or card number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min8Max28NumericText
	 * Min8Max28NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmNumber
	 * PaymentCard.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData5 PlainCardData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Primary Account Number (PAN) of the card, or card number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData3#mmPAN
	 * PlainCardData3.mmPAN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPAN = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmNumber;
			componentContext_lazy = () -> PlainCardData5.mmObject();
			isDerived = false;
			xmlTag = "PAN";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PAN";
			definition = "Primary Account Number (PAN) of the card, or card number.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PlainCardData3.mmPAN;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Min8Max28NumericText.mmObject();
		}
	};
	protected Min2Max3NumericText cardSequenceNumber;
	/**
	 * Identify a card inside a set of cards with the same card number (PAN).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min2Max3NumericText
	 * Min2Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmSequenceNumber
	 * PaymentCard.mmSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData5 PlainCardData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identify a card inside a set of cards with the same card number (PAN)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData3#mmCardSequenceNumber
	 * PlainCardData3.mmCardSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardSequenceNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmSequenceNumber;
			componentContext_lazy = () -> PlainCardData5.mmObject();
			isDerived = false;
			xmlTag = "CardSeqNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardSequenceNumber";
			definition = "Identify a card inside a set of cards with the same card number (PAN).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PlainCardData3.mmCardSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min2Max3NumericText.mmObject();
		}
	};
	protected Max10Text effectiveDate;
	/**
	 * Date from which the card can be used, expressed either in the YYYY-MM
	 * format, or in the YYYY-MM-DD format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData5 PlainCardData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date from which the card can be used, expressed either in the YYYY-MM format, or in the YYYY-MM-DD format."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData3#mmEffectiveDate
	 * PlainCardData3.mmEffectiveDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveDate = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PaymentCard.mmObject();
			componentContext_lazy = () -> PlainCardData5.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date from which the card can be used, expressed either in the YYYY-MM format, or in the YYYY-MM-DD format.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PlainCardData3.mmEffectiveDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	protected Max10Text expiryDate;
	/**
	 * Expiry date of the card expressed either in the YYYY-MM format, or in the
	 * YYYY-MM-DD format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData5 PlainCardData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expiry date of the card expressed either in the YYYY-MM format, or in the YYYY-MM-DD format."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PlainCardData3#mmExpiryDate
	 * PlainCardData3.mmExpiryDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpiryDate = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PaymentCard.mmObject();
			componentContext_lazy = () -> PlainCardData5.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Expiry date of the card expressed either in the YYYY-MM format, or in the YYYY-MM-DD format.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PlainCardData3.mmExpiryDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PlainCardData5.mmPAN, com.tools20022.repository.msg.PlainCardData5.mmCardSequenceNumber, com.tools20022.repository.msg.PlainCardData5.mmEffectiveDate,
						com.tools20022.repository.msg.PlainCardData5.mmExpiryDate);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PlainCardData5";
				definition = "Sensible data associated with the payment card performing the transaction provided for verification in response.";
				previousVersion_lazy = () -> PlainCardData3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Min8Max28NumericText getPAN() {
		return pAN;
	}

	public void setPAN(Min8Max28NumericText pAN) {
		this.pAN = pAN;
	}

	public Min2Max3NumericText getCardSequenceNumber() {
		return cardSequenceNumber;
	}

	public void setCardSequenceNumber(Min2Max3NumericText cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
	}

	public Max10Text getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Max10Text effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Max10Text getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Max10Text expiryDate) {
		this.expiryDate = expiryDate;
	}
}
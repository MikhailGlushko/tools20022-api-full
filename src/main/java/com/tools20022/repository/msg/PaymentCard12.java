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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Exact3AlphaNumericText;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max3Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.PaymentCard;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment card performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmProtectedCardData
 * PaymentCard12.mmProtectedCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard12#mmPlainCardData
 * PaymentCard12.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard12#mmIssuerBIN
 * PaymentCard12.mmIssuerBIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmCardCountryCode
 * PaymentCard12.mmCardCountryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmCardCurrencyCode
 * PaymentCard12.mmCardCurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard12#mmAdditionalCardData
 * PaymentCard12.mmAdditionalCardData}</li>
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
 * "PaymentCard12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment card performing the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard14 PaymentCard14}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentCard9
 * PaymentCard9}</li>
 * </ul>
 */
public class PaymentCard12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ContentInformationType10 protectedCardData;
	/**
	 * Replacement of the message element PlainCardData by a digital envelope
	 * using a cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12 PaymentCard12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replacement of the message element PlainCardData by a digital envelope using a cryptographic key."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14#mmProtectedCardData
	 * PaymentCard14.mmProtectedCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9#mmProtectedCardData
	 * PaymentCard9.mmProtectedCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedCardData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentCard12.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCardData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardData";
			definition = "Replacement of the message element PlainCardData by a digital envelope using a cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard14.mmProtectedCardData);
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentCard9.mmProtectedCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	protected PlainCardData10 plainCardData;
	/**
	 * Sensitive data associated with the card performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PlainCardData10
	 * PlainCardData10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12 PaymentCard12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sensitive data associated with the card performing the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14#mmPlainCardData
	 * PaymentCard14.mmPlainCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9#mmPlainCardData
	 * PaymentCard9.mmPlainCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlainCardData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentCard12.mmObject();
			isDerived = false;
			xmlTag = "PlainCardData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainCardData";
			definition = "Sensitive data associated with the card performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard14.mmPlainCardData);
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentCard9.mmPlainCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PlainCardData10.mmObject();
		}
	};
	protected Max15NumericText issuerBIN;
	/**
	 * Bank identifier number of the issuer for routing purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12 PaymentCard12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank identifier number of the issuer for routing purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard14#mmIssuerBIN
	 * PaymentCard14.mmIssuerBIN}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9#mmIssuerBIN
	 * PaymentCard9.mmIssuerBIN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerBIN = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentCard12.mmObject();
			isDerived = false;
			xmlTag = "IssrBIN";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerBIN";
			definition = "Bank identifier number of the issuer for routing purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard14.mmIssuerBIN);
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentCard9.mmIssuerBIN;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected Max3Text cardCountryCode;
	/**
	 * Country code assigned to the card by the card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCountryCode
	 * PaymentCard.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12 PaymentCard12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardCtryCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCountryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country code assigned to the card by the card issuer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14#mmCardCountryCode
	 * PaymentCard14.mmCardCountryCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9#mmCardCountryCode
	 * PaymentCard9.mmCardCountryCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardCountryCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentCard.mmCardCountryCode;
			componentContext_lazy = () -> PaymentCard12.mmObject();
			isDerived = false;
			xmlTag = "CardCtryCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCountryCode";
			definition = "Country code assigned to the card by the card issuer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard14.mmCardCountryCode);
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentCard9.mmCardCountryCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}
	};
	protected Exact3AlphaNumericText cardCurrencyCode;
	/**
	 * Currency code of the card issuer (ISO 4217 numeric code).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3AlphaNumericText
	 * Exact3AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12 PaymentCard12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardCcyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency code of the card issuer (ISO 4217 numeric code)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard14#mmCardCurrencyCode
	 * PaymentCard14.mmCardCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9#mmCardCurrencyCode
	 * PaymentCard9.mmCardCurrencyCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardCurrencyCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentCard12.mmObject();
			isDerived = false;
			xmlTag = "CardCcyCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCurrencyCode";
			definition = "Currency code of the card issuer (ISO 4217 numeric code).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard14.mmCardCurrencyCode);
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentCard9.mmCardCurrencyCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3AlphaNumericText.mmObject();
		}
	};
	protected Max70Text additionalCardData;
	/**
	 * Additional card issuer specific data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard12 PaymentCard12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional card issuer specific data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard9#mmAdditionalCardData
	 * PaymentCard9.mmAdditionalCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalCardData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentCard12.mmObject();
			isDerived = false;
			xmlTag = "AddtlCardData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCardData";
			definition = "Additional card issuer specific data.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PaymentCard9.mmAdditionalCardData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard12.mmProtectedCardData, com.tools20022.repository.msg.PaymentCard12.mmPlainCardData,
						com.tools20022.repository.msg.PaymentCard12.mmIssuerBIN, com.tools20022.repository.msg.PaymentCard12.mmCardCountryCode, com.tools20022.repository.msg.PaymentCard12.mmCardCurrencyCode,
						com.tools20022.repository.msg.PaymentCard12.mmAdditionalCardData);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentCard12";
				definition = "Payment card performing the transaction.";
				nextVersions_lazy = () -> Arrays.asList(PaymentCard14.mmObject());
				previousVersion_lazy = () -> PaymentCard9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ContentInformationType10 getProtectedCardData() {
		return protectedCardData;
	}

	public void setProtectedCardData(com.tools20022.repository.msg.ContentInformationType10 protectedCardData) {
		this.protectedCardData = protectedCardData;
	}

	public PlainCardData10 getPlainCardData() {
		return plainCardData;
	}

	public void setPlainCardData(com.tools20022.repository.msg.PlainCardData10 plainCardData) {
		this.plainCardData = plainCardData;
	}

	public Max15NumericText getIssuerBIN() {
		return issuerBIN;
	}

	public void setIssuerBIN(Max15NumericText issuerBIN) {
		this.issuerBIN = issuerBIN;
	}

	public Max3Text getCardCountryCode() {
		return cardCountryCode;
	}

	public void setCardCountryCode(Max3Text cardCountryCode) {
		this.cardCountryCode = cardCountryCode;
	}

	public Exact3AlphaNumericText getCardCurrencyCode() {
		return cardCurrencyCode;
	}

	public void setCardCurrencyCode(Exact3AlphaNumericText cardCurrencyCode) {
		this.cardCurrencyCode = cardCurrencyCode;
	}

	public Max70Text getAdditionalCardData() {
		return additionalCardData;
	}

	public void setAdditionalCardData(Max70Text additionalCardData) {
		this.additionalCardData = additionalCardData;
	}
}
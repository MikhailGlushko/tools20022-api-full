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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.PaymentCard;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContentInformationType7;
import com.tools20022.repository.msg.PlainCardData6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.PaymentCard8#mmProtectedCardData
 * PaymentCard8.mmProtectedCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard8#mmPlainCardData
 * PaymentCard8.mmPlainCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard8#mmCardCountryCode
 * PaymentCard8.mmCardCountryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard8#mmCardCurrencyCode
 * PaymentCard8.mmCardCurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard8#mmCardProductProfile
 * PaymentCard8.mmCardProductProfile}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard8#mmCardBrand
 * PaymentCard8.mmCardBrand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard8#mmAdditionalCardData
 * PaymentCard8.mmAdditionalCardData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentCard
 * PaymentCard}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentCard8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment card performing the transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentCard6
 * PaymentCard6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentCard8", propOrder = {"protectedCardData", "plainCardData", "cardCountryCode", "cardCurrencyCode", "cardProductProfile", "cardBrand", "additionalCardData"})
public class PaymentCard8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrtctdCardData")
	protected ContentInformationType7 protectedCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType7
	 * ContentInformationType7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8 PaymentCard8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdCardData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replacement of the message element PlainCardData by a digital envelope using a cryptographic key."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6#mmProtectedCardData
	 * PaymentCard6.mmProtectedCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCard8, Optional<ContentInformationType7>> mmProtectedCardData = new MMMessageAssociationEnd<PaymentCard8, Optional<ContentInformationType7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard8.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardData";
			definition = "Replacement of the message element PlainCardData by a digital envelope using a cryptographic key.";
			previousVersion_lazy = () -> PaymentCard6.mmProtectedCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType7.mmObject();
		}

		@Override
		public Optional<ContentInformationType7> getValue(PaymentCard8 obj) {
			return obj.getProtectedCardData();
		}

		@Override
		public void setValue(PaymentCard8 obj, Optional<ContentInformationType7> value) {
			obj.setProtectedCardData(value.orElse(null));
		}
	};
	@XmlElement(name = "PlainCardData")
	protected PlainCardData6 plainCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PlainCardData6
	 * PlainCardData6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8 PaymentCard8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlainCardData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sensitive data associated with the card performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6#mmPlainCardData
	 * PaymentCard6.mmPlainCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCard8, Optional<PlainCardData6>> mmPlainCardData = new MMMessageAssociationEnd<PaymentCard8, Optional<PlainCardData6>>() {
		{
			businessComponentTrace_lazy = () -> PaymentCard.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard8.mmObject();
			isDerived = false;
			xmlTag = "PlainCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainCardData";
			definition = "Sensitive data associated with the card performing the transaction.";
			previousVersion_lazy = () -> PaymentCard6.mmPlainCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PlainCardData6.mmObject();
		}

		@Override
		public Optional<PlainCardData6> getValue(PaymentCard8 obj) {
			return obj.getPlainCardData();
		}

		@Override
		public void setValue(PaymentCard8 obj, Optional<PlainCardData6> value) {
			obj.setPlainCardData(value.orElse(null));
		}
	};
	@XmlElement(name = "CardCtryCd")
	protected Max3Text cardCountryCode;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8 PaymentCard8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardCtryCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCountryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country code assigned to the card by the card issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6#mmCardCountryCode
	 * PaymentCard6.mmCardCountryCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard8, Optional<Max3Text>> mmCardCountryCode = new MMMessageAttribute<PaymentCard8, Optional<Max3Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardCountryCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard8.mmObject();
			isDerived = false;
			xmlTag = "CardCtryCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCountryCode";
			definition = "Country code assigned to the card by the card issuer.";
			previousVersion_lazy = () -> PaymentCard6.mmCardCountryCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}

		@Override
		public Optional<Max3Text> getValue(PaymentCard8 obj) {
			return obj.getCardCountryCode();
		}

		@Override
		public void setValue(PaymentCard8 obj, Optional<Max3Text> value) {
			obj.setCardCountryCode(value.orElse(null));
		}
	};
	@XmlElement(name = "CardCcyCd")
	protected Exact3NumericText cardCurrencyCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCurrencyCode
	 * PaymentCard.mmCardCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8 PaymentCard8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardCcyCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency code of the card issuer (ISO 4217 numeric code)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard8, Optional<Exact3NumericText>> mmCardCurrencyCode = new MMMessageAttribute<PaymentCard8, Optional<Exact3NumericText>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardCurrencyCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard8.mmObject();
			isDerived = false;
			xmlTag = "CardCcyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCurrencyCode";
			definition = "Currency code of the card issuer (ISO 4217 numeric code).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Optional<Exact3NumericText> getValue(PaymentCard8 obj) {
			return obj.getCardCurrencyCode();
		}

		@Override
		public void setValue(PaymentCard8 obj, Optional<Exact3NumericText> value) {
			obj.setCardCurrencyCode(value.orElse(null));
		}
	};
	@XmlElement(name = "CardPdctPrfl")
	protected Exact4NumericText cardProductProfile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4NumericText
	 * Exact4NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmProfileNumber
	 * PaymentCard.mmProfileNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8 PaymentCard8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPdctPrfl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProductProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines a category of cards related the acceptance processing rules defined by the acquirer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6#mmCardProductProfile
	 * PaymentCard6.mmCardProductProfile}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard8, Optional<Exact4NumericText>> mmCardProductProfile = new MMMessageAttribute<PaymentCard8, Optional<Exact4NumericText>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmProfileNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard8.mmObject();
			isDerived = false;
			xmlTag = "CardPdctPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProductProfile";
			definition = "Defines a category of cards related the acceptance processing rules defined by the acquirer.";
			previousVersion_lazy = () -> PaymentCard6.mmCardProductProfile;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4NumericText.mmObject();
		}

		@Override
		public Optional<Exact4NumericText> getValue(PaymentCard8 obj) {
			return obj.getCardProductProfile();
		}

		@Override
		public void setValue(PaymentCard8 obj, Optional<Exact4NumericText> value) {
			obj.setCardProductProfile(value.orElse(null));
		}
	};
	@XmlElement(name = "CardBrnd")
	protected Max35Text cardBrand;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardBrand
	 * PaymentCard.mmCardBrand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8 PaymentCard8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardBrnd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardBrand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Brand name of the card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6#mmCardBrand
	 * PaymentCard6.mmCardBrand}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard8, Optional<Max35Text>> mmCardBrand = new MMMessageAttribute<PaymentCard8, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardBrand;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard8.mmObject();
			isDerived = false;
			xmlTag = "CardBrnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardBrand";
			definition = "Brand name of the card.";
			previousVersion_lazy = () -> PaymentCard6.mmCardBrand;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentCard8 obj) {
			return obj.getCardBrand();
		}

		@Override
		public void setValue(PaymentCard8 obj, Optional<Max35Text> value) {
			obj.setCardBrand(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlCardData")
	protected Max70Text additionalCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard8 PaymentCard8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlCardData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional card issuer specific data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard6#mmAdditionalCardData
	 * PaymentCard6.mmAdditionalCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard8, Optional<Max70Text>> mmAdditionalCardData = new MMMessageAttribute<PaymentCard8, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard8.mmObject();
			isDerived = false;
			xmlTag = "AddtlCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCardData";
			definition = "Additional card issuer specific data.";
			previousVersion_lazy = () -> PaymentCard6.mmAdditionalCardData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(PaymentCard8 obj) {
			return obj.getAdditionalCardData();
		}

		@Override
		public void setValue(PaymentCard8 obj, Optional<Max70Text> value) {
			obj.setAdditionalCardData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard8.mmProtectedCardData, com.tools20022.repository.msg.PaymentCard8.mmPlainCardData,
						com.tools20022.repository.msg.PaymentCard8.mmCardCountryCode, com.tools20022.repository.msg.PaymentCard8.mmCardCurrencyCode, com.tools20022.repository.msg.PaymentCard8.mmCardProductProfile,
						com.tools20022.repository.msg.PaymentCard8.mmCardBrand, com.tools20022.repository.msg.PaymentCard8.mmAdditionalCardData);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCard8";
				definition = "Payment card performing the transaction.";
				previousVersion_lazy = () -> PaymentCard6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ContentInformationType7> getProtectedCardData() {
		return protectedCardData == null ? Optional.empty() : Optional.of(protectedCardData);
	}

	public PaymentCard8 setProtectedCardData(ContentInformationType7 protectedCardData) {
		this.protectedCardData = protectedCardData;
		return this;
	}

	public Optional<PlainCardData6> getPlainCardData() {
		return plainCardData == null ? Optional.empty() : Optional.of(plainCardData);
	}

	public PaymentCard8 setPlainCardData(PlainCardData6 plainCardData) {
		this.plainCardData = plainCardData;
		return this;
	}

	public Optional<Max3Text> getCardCountryCode() {
		return cardCountryCode == null ? Optional.empty() : Optional.of(cardCountryCode);
	}

	public PaymentCard8 setCardCountryCode(Max3Text cardCountryCode) {
		this.cardCountryCode = cardCountryCode;
		return this;
	}

	public Optional<Exact3NumericText> getCardCurrencyCode() {
		return cardCurrencyCode == null ? Optional.empty() : Optional.of(cardCurrencyCode);
	}

	public PaymentCard8 setCardCurrencyCode(Exact3NumericText cardCurrencyCode) {
		this.cardCurrencyCode = cardCurrencyCode;
		return this;
	}

	public Optional<Exact4NumericText> getCardProductProfile() {
		return cardProductProfile == null ? Optional.empty() : Optional.of(cardProductProfile);
	}

	public PaymentCard8 setCardProductProfile(Exact4NumericText cardProductProfile) {
		this.cardProductProfile = cardProductProfile;
		return this;
	}

	public Optional<Max35Text> getCardBrand() {
		return cardBrand == null ? Optional.empty() : Optional.of(cardBrand);
	}

	public PaymentCard8 setCardBrand(Max35Text cardBrand) {
		this.cardBrand = cardBrand;
		return this;
	}

	public Optional<Max70Text> getAdditionalCardData() {
		return additionalCardData == null ? Optional.empty() : Optional.of(additionalCardData);
	}

	public PaymentCard8 setAdditionalCardData(Max70Text additionalCardData) {
		this.additionalCardData = additionalCardData;
		return this;
	}
}
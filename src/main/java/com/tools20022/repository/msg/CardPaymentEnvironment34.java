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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Environment of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmAcquirer
 * CardPaymentEnvironment34.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmMerchant
 * CardPaymentEnvironment34.mmMerchant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmPOI
 * CardPaymentEnvironment34.mmPOI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmCard
 * CardPaymentEnvironment34.mmCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmCustomerDevice
 * CardPaymentEnvironment34.mmCustomerDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmWallet
 * CardPaymentEnvironment34.mmWallet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmPaymentToken
 * CardPaymentEnvironment34.mmPaymentToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmCardholder
 * CardPaymentEnvironment34.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmProtectedCardholderData
 * CardPaymentEnvironment34.mmProtectedCardholderData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "CardPaymentEnvironment34"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47
 * CardPaymentEnvironment47}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22
 * CardPaymentEnvironment22}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardPaymentEnvironment34", propOrder = {"acquirer", "merchant", "POI", "card", "customerDevice", "wallet", "paymentToken", "cardholder", "protectedCardholderData"})
public class CardPaymentEnvironment34 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Acquirer4 acquirer;
	/**
	 * Acquirer involved in the card payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Acquirer4 Acquirer4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcquirerRole AcquirerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34
	 * CardPaymentEnvironment34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acqrr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer involved in the card payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmAcquirer
	 * CardPaymentEnvironment47.mmAcquirer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmAcquirer
	 * CardPaymentEnvironment22.mmAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcquirerRole.mmObject();
			componentContext_lazy = () -> CardPaymentEnvironment34.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer involved in the card payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment47.mmAcquirer);
			previousVersion_lazy = () -> CardPaymentEnvironment22.mmAcquirer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Acquirer4.mmObject();
		}
	};
	protected Organisation8 merchant;
	/**
	 * Merchant performing the card payment.<br>
	 * Usage: In some cases, merchant and acceptor may be regarded as the same
	 * entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation8
	 * Organisation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole MerchantRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34
	 * CardPaymentEnvironment34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mrchnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Merchant performing the card payment.\r\nUsage: In some cases, merchant and acceptor may be regarded as the same entity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmMerchant
	 * CardPaymentEnvironment47.mmMerchant}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmMerchant
	 * CardPaymentEnvironment22.mmMerchant}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMerchant = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MerchantRole.mmObject();
			componentContext_lazy = () -> CardPaymentEnvironment34.mmObject();
			isDerived = false;
			xmlTag = "Mrchnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merchant";
			definition = "Merchant performing the card payment.\r\nUsage: In some cases, merchant and acceptor may be regarded as the same entity.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment47.mmMerchant);
			previousVersion_lazy = () -> CardPaymentEnvironment22.mmMerchant;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation8.mmObject();
		}
	};
	protected PointOfInteraction4 pOI;
	/**
	 * Point of interaction (POI) performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction4
	 * PointOfInteraction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34
	 * CardPaymentEnvironment34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Point of interaction (POI) performing the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmPOI
	 * CardPaymentEnvironment47.mmPOI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmPOI
	 * CardPaymentEnvironment22.mmPOI}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOI = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> CardPaymentEnvironment34.mmObject();
			isDerived = false;
			xmlTag = "POI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POI";
			definition = "Point of interaction (POI) performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment47.mmPOI);
			previousVersion_lazy = () -> CardPaymentEnvironment22.mmPOI;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PointOfInteraction4.mmObject();
		}
	};
	protected PaymentCard11 card;
	/**
	 * Payment card performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PaymentCard11
	 * PaymentCard11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34
	 * CardPaymentEnvironment34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card performing the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmCard
	 * CardPaymentEnvironment47.mmCard}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmCard
	 * CardPaymentEnvironment22.mmCard}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCard = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmPaymentCard;
			componentContext_lazy = () -> CardPaymentEnvironment34.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Payment card performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment47.mmCard);
			previousVersion_lazy = () -> CardPaymentEnvironment22.mmCard;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PaymentCard11.mmObject();
		}
	};
	protected CustomerDevice1 customerDevice;
	/**
	 * Device used by the customer to perform the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CustomerDevice1
	 * CustomerDevice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34
	 * CardPaymentEnvironment34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrDvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDevice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Device used by the customer to perform the payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmCustomerDevice
	 * CardPaymentEnvironment47.mmCustomerDevice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCustomerDevice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment34.mmObject();
			isDerived = false;
			xmlTag = "CstmrDvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDevice";
			definition = "Device used by the customer to perform the payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment47.mmCustomerDevice);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CustomerDevice1.mmObject();
		}
	};
	protected CustomerDevice1 wallet;
	/**
	 * Container of tenders used by the customer to perform the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CustomerDevice1
	 * CustomerDevice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34
	 * CardPaymentEnvironment34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wllt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wallet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Container of tenders used by the customer to perform the payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmWallet
	 * CardPaymentEnvironment47.mmWallet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWallet = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment34.mmObject();
			isDerived = false;
			xmlTag = "Wllt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wallet";
			definition = "Container of tenders used by the customer to perform the payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment47.mmWallet);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CustomerDevice1.mmObject();
		}
	};
	protected CardPaymentToken3 paymentToken;
	/**
	 * Payment token information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentToken3
	 * CardPaymentToken3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34
	 * CardPaymentEnvironment34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTkn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentToken"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment token information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmPaymentToken
	 * CardPaymentEnvironment47.mmPaymentToken}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentToken = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment34.mmObject();
			isDerived = false;
			xmlTag = "PmtTkn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			definition = "Payment token information.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment47.mmPaymentToken);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentToken3.mmObject();
		}
	};
	protected Cardholder8 cardholder;
	/**
	 * Cardholder involved in the card payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cardholder8
	 * Cardholder8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole
	 * CardholderRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34
	 * CardPaymentEnvironment34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Crdhldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cardholder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder involved in the card payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmCardholder
	 * CardPaymentEnvironment47.mmCardholder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmCardholder
	 * CardPaymentEnvironment22.mmCardholder}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCardholder = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardholderRole.mmObject();
			componentContext_lazy = () -> CardPaymentEnvironment34.mmObject();
			isDerived = false;
			xmlTag = "Crdhldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cardholder";
			definition = "Cardholder involved in the card payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment47.mmCardholder);
			previousVersion_lazy = () -> CardPaymentEnvironment22.mmCardholder;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Cardholder8.mmObject();
		}
	};
	protected ContentInformationType10 protectedCardholderData;
	/**
	 * Replacement of the message element Cardholder by a digital envelope using
	 * a cryptographic key.
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34
	 * CardPaymentEnvironment34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdCrdhldrData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedCardholderData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replacement of the message element Cardholder by a digital envelope using a cryptographic key."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmProtectedCardholderData
	 * CardPaymentEnvironment47.mmProtectedCardholderData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmProtectedCardholderData
	 * CardPaymentEnvironment22.mmProtectedCardholderData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedCardholderData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment34.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCrdhldrData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardholderData";
			definition = "Replacement of the message element Cardholder by a digital envelope using a cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment47.mmProtectedCardholderData);
			previousVersion_lazy = () -> CardPaymentEnvironment22.mmProtectedCardholderData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentEnvironment34.mmAcquirer, CardPaymentEnvironment34.mmMerchant, CardPaymentEnvironment34.mmPOI, CardPaymentEnvironment34.mmCard, CardPaymentEnvironment34.mmCustomerDevice,
						CardPaymentEnvironment34.mmWallet, CardPaymentEnvironment34.mmPaymentToken, CardPaymentEnvironment34.mmCardholder, CardPaymentEnvironment34.mmProtectedCardholderData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentEnvironment34";
				definition = "Environment of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment47.mmObject());
				previousVersion_lazy = () -> CardPaymentEnvironment22.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Acqrr")
	public Acquirer4 getAcquirer() {
		return acquirer;
	}

	public void setAcquirer(com.tools20022.repository.msg.Acquirer4 acquirer) {
		this.acquirer = acquirer;
	}

	@XmlElement(name = "Mrchnt")
	public Organisation8 getMerchant() {
		return merchant;
	}

	public void setMerchant(com.tools20022.repository.msg.Organisation8 merchant) {
		this.merchant = merchant;
	}

	@XmlElement(name = "POI", required = true)
	public PointOfInteraction4 getPOI() {
		return pOI;
	}

	public void setPOI(com.tools20022.repository.msg.PointOfInteraction4 pOI) {
		this.pOI = pOI;
	}

	@XmlElement(name = "Card")
	public PaymentCard11 getCard() {
		return card;
	}

	public void setCard(com.tools20022.repository.msg.PaymentCard11 card) {
		this.card = card;
	}

	@XmlElement(name = "CstmrDvc")
	public CustomerDevice1 getCustomerDevice() {
		return customerDevice;
	}

	public void setCustomerDevice(com.tools20022.repository.msg.CustomerDevice1 customerDevice) {
		this.customerDevice = customerDevice;
	}

	@XmlElement(name = "Wllt")
	public CustomerDevice1 getWallet() {
		return wallet;
	}

	public void setWallet(com.tools20022.repository.msg.CustomerDevice1 wallet) {
		this.wallet = wallet;
	}

	@XmlElement(name = "PmtTkn")
	public CardPaymentToken3 getPaymentToken() {
		return paymentToken;
	}

	public void setPaymentToken(com.tools20022.repository.msg.CardPaymentToken3 paymentToken) {
		this.paymentToken = paymentToken;
	}

	@XmlElement(name = "Crdhldr")
	public Cardholder8 getCardholder() {
		return cardholder;
	}

	public void setCardholder(com.tools20022.repository.msg.Cardholder8 cardholder) {
		this.cardholder = cardholder;
	}

	@XmlElement(name = "PrtctdCrdhldrData")
	public ContentInformationType10 getProtectedCardholderData() {
		return protectedCardholderData;
	}

	public void setProtectedCardholderData(com.tools20022.repository.msg.ContentInformationType10 protectedCardholderData) {
		this.protectedCardholderData = protectedCardholderData;
	}
}
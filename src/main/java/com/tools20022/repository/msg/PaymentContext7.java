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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment context in which the transaction is performed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext7#mmCardPresent
 * PaymentContext7.mmCardPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmCardholderPresent
 * PaymentContext7.mmCardholderPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmOnLineContext
 * PaymentContext7.mmOnLineContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmAttendanceContext
 * PaymentContext7.mmAttendanceContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmTransactionEnvironment
 * PaymentContext7.mmTransactionEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmTransactionChannel
 * PaymentContext7.mmTransactionChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmAttendantMessageCapable
 * PaymentContext7.mmAttendantMessageCapable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmAttendantLanguage
 * PaymentContext7.mmAttendantLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmCardDataEntryMode
 * PaymentContext7.mmCardDataEntryMode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmFallbackIndicator
 * PaymentContext7.mmFallbackIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext7#mmSupportedOption
 * PaymentContext7.mmSupportedOption}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
 * CardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentContext7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment context in which the transaction is performed."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext12
 * PaymentContext12}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentContext4
 * PaymentContext4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentContext7", propOrder = {"cardPresent", "cardholderPresent", "onLineContext", "attendanceContext", "transactionEnvironment", "transactionChannel", "attendantMessageCapable", "attendantLanguage", "cardDataEntryMode",
		"fallbackIndicator", "supportedOption"})
public class PaymentContext7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CardPres")
	protected TrueFalseIndicator cardPresent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPresent
	 * CardPaymentAcquiring.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7
	 * PaymentContext7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPres"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction has been initiated by a card physically present or not."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmCardPresent
	 * PaymentContext12.mmCardPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmCardPresent
	 * PaymentContext4.mmCardPresent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext7, Optional<TrueFalseIndicator>> mmCardPresent = new MMMessageAttribute<PaymentContext7, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPresent;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext7.mmObject();
			isDerived = false;
			xmlTag = "CardPres";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPresent";
			definition = "Indicates whether the transaction has been initiated by a card physically present or not.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext12.mmCardPresent);
			previousVersion_lazy = () -> PaymentContext4.mmCardPresent;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext7 obj) {
			return obj.getCardPresent();
		}

		@Override
		public void setValue(PaymentContext7 obj, Optional<TrueFalseIndicator> value) {
			obj.setCardPresent(value.orElse(null));
		}
	};
	@XmlElement(name = "CrdhldrPres")
	protected TrueFalseIndicator cardholderPresent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardholderPresent
	 * CardPaymentAcquiring.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7
	 * PaymentContext7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrPres"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction has been initiated in presence of the cardholder or not."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmCardholderPresent
	 * PaymentContext12.mmCardholderPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmCardholderPresent
	 * PaymentContext4.mmCardholderPresent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext7, Optional<TrueFalseIndicator>> mmCardholderPresent = new MMMessageAttribute<PaymentContext7, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardholderPresent;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext7.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrPres";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderPresent";
			definition = "Indicates whether the transaction has been initiated in presence of the cardholder or not.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext12.mmCardholderPresent);
			previousVersion_lazy = () -> PaymentContext4.mmCardholderPresent;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext7 obj) {
			return obj.getCardholderPresent();
		}

		@Override
		public void setValue(PaymentContext7 obj, Optional<TrueFalseIndicator> value) {
			obj.setCardholderPresent(value.orElse(null));
		}
	};
	@XmlElement(name = "OnLineCntxt")
	protected TrueFalseIndicator onLineContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmOnLineContext
	 * CardPaymentAcquiring.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7
	 * PaymentContext7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLineCntxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On-line or off-line context of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmOnLineContext
	 * PaymentContext12.mmOnLineContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmOnLineContext
	 * PaymentContext4.mmOnLineContext}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext7, Optional<TrueFalseIndicator>> mmOnLineContext = new MMMessageAttribute<PaymentContext7, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmOnLineContext;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext7.mmObject();
			isDerived = false;
			xmlTag = "OnLineCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineContext";
			definition = "On-line or off-line context of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext12.mmOnLineContext);
			previousVersion_lazy = () -> PaymentContext4.mmOnLineContext;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext7 obj) {
			return obj.getOnLineContext();
		}

		@Override
		public void setValue(PaymentContext7 obj, Optional<TrueFalseIndicator> value) {
			obj.setOnLineContext(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndncCntxt")
	protected AttendanceContext1Code attendanceContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContext1Code
	 * AttendanceContext1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmAttendanceContext
	 * CardPaymentAcquiring.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7
	 * PaymentContext7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncCntxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Human attendance at the POI (Point Of Interaction) location during the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmAttendanceContext
	 * PaymentContext12.mmAttendanceContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmAttendanceContext
	 * PaymentContext4.mmAttendanceContext}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext7, Optional<AttendanceContext1Code>> mmAttendanceContext = new MMMessageAttribute<PaymentContext7, Optional<AttendanceContext1Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmAttendanceContext;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext7.mmObject();
			isDerived = false;
			xmlTag = "AttndncCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceContext";
			definition = "Human attendance at the POI (Point Of Interaction) location during the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext12.mmAttendanceContext);
			previousVersion_lazy = () -> PaymentContext4.mmAttendanceContext;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AttendanceContext1Code.mmObject();
		}

		@Override
		public Optional<AttendanceContext1Code> getValue(PaymentContext7 obj) {
			return obj.getAttendanceContext();
		}

		@Override
		public void setValue(PaymentContext7 obj, Optional<AttendanceContext1Code> value) {
			obj.setAttendanceContext(value.orElse(null));
		}
	};
	@XmlElement(name = "TxEnvt")
	protected TransactionEnvironment1Code transactionEnvironment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironment1Code
	 * TransactionEnvironment1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionEnvironment
	 * CardPaymentAcquiring.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7
	 * PaymentContext7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxEnvt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionEnvironment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the environment of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmTransactionEnvironment
	 * PaymentContext12.mmTransactionEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmTransactionEnvironment
	 * PaymentContext4.mmTransactionEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext7, Optional<TransactionEnvironment1Code>> mmTransactionEnvironment = new MMMessageAttribute<PaymentContext7, Optional<TransactionEnvironment1Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionEnvironment;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext7.mmObject();
			isDerived = false;
			xmlTag = "TxEnvt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionEnvironment";
			definition = "Indicates the environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext12.mmTransactionEnvironment);
			previousVersion_lazy = () -> PaymentContext4.mmTransactionEnvironment;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionEnvironment1Code.mmObject();
		}

		@Override
		public Optional<TransactionEnvironment1Code> getValue(PaymentContext7 obj) {
			return obj.getTransactionEnvironment();
		}

		@Override
		public void setValue(PaymentContext7 obj, Optional<TransactionEnvironment1Code> value) {
			obj.setTransactionEnvironment(value.orElse(null));
		}
	};
	@XmlElement(name = "TxChanl")
	protected TransactionChannel1Code transactionChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code
	 * TransactionChannel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionChannel
	 * CardPaymentAcquiring.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7
	 * PaymentContext7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxChanl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the type of the communication channels used by the cardholder to the acceptor system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmTransactionChannel
	 * PaymentContext12.mmTransactionChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmTransactionChannel
	 * PaymentContext4.mmTransactionChannel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext7, Optional<TransactionChannel1Code>> mmTransactionChannel = new MMMessageAttribute<PaymentContext7, Optional<TransactionChannel1Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionChannel;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext7.mmObject();
			isDerived = false;
			xmlTag = "TxChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionChannel";
			definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext12.mmTransactionChannel);
			previousVersion_lazy = () -> PaymentContext4.mmTransactionChannel;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionChannel1Code.mmObject();
		}

		@Override
		public Optional<TransactionChannel1Code> getValue(PaymentContext7 obj) {
			return obj.getTransactionChannel();
		}

		@Override
		public void setValue(PaymentContext7 obj, Optional<TransactionChannel1Code> value) {
			obj.setTransactionChannel(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndntMsgCpbl")
	protected TrueFalseIndicator attendantMessageCapable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmAttendantMessageCapable
	 * CardPaymentAcquiring.mmAttendantMessageCapable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7
	 * PaymentContext7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndntMsgCpbl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendantMessageCapable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a message can be sent or not on an attendant display (attendant display present or not)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmAttendantMessageCapable
	 * PaymentContext12.mmAttendantMessageCapable}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmAttendantMessageCapable
	 * PaymentContext4.mmAttendantMessageCapable}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext7, Optional<TrueFalseIndicator>> mmAttendantMessageCapable = new MMMessageAttribute<PaymentContext7, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmAttendantMessageCapable;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext7.mmObject();
			isDerived = false;
			xmlTag = "AttndntMsgCpbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendantMessageCapable";
			definition = "Indicates whether a message can be sent or not on an attendant display (attendant display present or not).";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext12.mmAttendantMessageCapable);
			previousVersion_lazy = () -> PaymentContext4.mmAttendantMessageCapable;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext7 obj) {
			return obj.getAttendantMessageCapable();
		}

		@Override
		public void setValue(PaymentContext7 obj, Optional<TrueFalseIndicator> value) {
			obj.setAttendantMessageCapable(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndntLang")
	protected ISO2ALanguageCode attendantLanguage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ISO2ALanguageCode
	 * ISO2ALanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmAttendantLanguage
	 * CardPaymentAcquiring.mmAttendantLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7
	 * PaymentContext7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndntLang"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendantLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language used to display messages to the attendant."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmAttendantLanguage
	 * PaymentContext12.mmAttendantLanguage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmAttendantLanguage
	 * PaymentContext4.mmAttendantLanguage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext7, Optional<ISO2ALanguageCode>> mmAttendantLanguage = new MMMessageAttribute<PaymentContext7, Optional<ISO2ALanguageCode>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmAttendantLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext7.mmObject();
			isDerived = false;
			xmlTag = "AttndntLang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendantLanguage";
			definition = "Language used to display messages to the attendant.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext12.mmAttendantLanguage);
			previousVersion_lazy = () -> PaymentContext4.mmAttendantLanguage;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}

		@Override
		public Optional<ISO2ALanguageCode> getValue(PaymentContext7 obj) {
			return obj.getAttendantLanguage();
		}

		@Override
		public void setValue(PaymentContext7 obj, Optional<ISO2ALanguageCode> value) {
			obj.setAttendantLanguage(value.orElse(null));
		}
	};
	@XmlElement(name = "CardDataNtryMd")
	protected CardDataReading1Code cardDataEntryMode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardDataEntryMode
	 * CardPaymentAcquiring.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7
	 * PaymentContext7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardDataNtryMd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDataEntryMode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry mode of the card data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmCardDataEntryMode
	 * PaymentContext12.mmCardDataEntryMode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmCardDataEntryMode
	 * PaymentContext4.mmCardDataEntryMode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext7, Optional<CardDataReading1Code>> mmCardDataEntryMode = new MMMessageAttribute<PaymentContext7, Optional<CardDataReading1Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardDataEntryMode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext7.mmObject();
			isDerived = false;
			xmlTag = "CardDataNtryMd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDataEntryMode";
			definition = "Entry mode of the card data.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext12.mmCardDataEntryMode);
			previousVersion_lazy = () -> PaymentContext4.mmCardDataEntryMode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardDataReading1Code.mmObject();
		}

		@Override
		public Optional<CardDataReading1Code> getValue(PaymentContext7 obj) {
			return obj.getCardDataEntryMode();
		}

		@Override
		public void setValue(PaymentContext7 obj, Optional<CardDataReading1Code> value) {
			obj.setCardDataEntryMode(value.orElse(null));
		}
	};
	@XmlElement(name = "FllbckInd")
	protected TrueFalseIndicator fallbackIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmFallbackIndicator
	 * CardPaymentAcquiring.mmFallbackIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7
	 * PaymentContext7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FllbckInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicator of a card entry mode fallback."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmFallbackIndicator
	 * PaymentContext12.mmFallbackIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext4#mmFallbackIndicator
	 * PaymentContext4.mmFallbackIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext7, Optional<TrueFalseIndicator>> mmFallbackIndicator = new MMMessageAttribute<PaymentContext7, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmFallbackIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext7.mmObject();
			isDerived = false;
			xmlTag = "FllbckInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackIndicator";
			definition = "Indicator of a card entry mode fallback.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext12.mmFallbackIndicator);
			previousVersion_lazy = () -> PaymentContext4.mmFallbackIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext7 obj) {
			return obj.getFallbackIndicator();
		}

		@Override
		public void setValue(PaymentContext7 obj, Optional<TrueFalseIndicator> value) {
			obj.setFallbackIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "SpprtdOptn")
	protected List<SupportedPaymentOption1Code> supportedOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SupportedPaymentOption1Code
	 * SupportedPaymentOption1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext7
	 * PaymentContext7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpprtdOptn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupportedOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment options the card acceptor can support."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext12#mmSupportedOption
	 * PaymentContext12.mmSupportedOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext7, List<SupportedPaymentOption1Code>> mmSupportedOption = new MMMessageAttribute<PaymentContext7, List<SupportedPaymentOption1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext7.mmObject();
			isDerived = false;
			xmlTag = "SpprtdOptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportedOption";
			definition = "Payment options the card acceptor can support.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext12.mmSupportedOption);
			minOccurs = 0;
			simpleType_lazy = () -> SupportedPaymentOption1Code.mmObject();
		}

		@Override
		public List<SupportedPaymentOption1Code> getValue(PaymentContext7 obj) {
			return obj.getSupportedOption();
		}

		@Override
		public void setValue(PaymentContext7 obj, List<SupportedPaymentOption1Code> value) {
			obj.setSupportedOption(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext7.mmCardPresent, com.tools20022.repository.msg.PaymentContext7.mmCardholderPresent,
						com.tools20022.repository.msg.PaymentContext7.mmOnLineContext, com.tools20022.repository.msg.PaymentContext7.mmAttendanceContext, com.tools20022.repository.msg.PaymentContext7.mmTransactionEnvironment,
						com.tools20022.repository.msg.PaymentContext7.mmTransactionChannel, com.tools20022.repository.msg.PaymentContext7.mmAttendantMessageCapable, com.tools20022.repository.msg.PaymentContext7.mmAttendantLanguage,
						com.tools20022.repository.msg.PaymentContext7.mmCardDataEntryMode, com.tools20022.repository.msg.PaymentContext7.mmFallbackIndicator, com.tools20022.repository.msg.PaymentContext7.mmSupportedOption);
				trace_lazy = () -> CardPaymentAcquiring.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentContext7";
				definition = "Payment context in which the transaction is performed.";
				nextVersions_lazy = () -> Arrays.asList(PaymentContext12.mmObject());
				previousVersion_lazy = () -> PaymentContext4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getCardPresent() {
		return cardPresent == null ? Optional.empty() : Optional.of(cardPresent);
	}

	public PaymentContext7 setCardPresent(TrueFalseIndicator cardPresent) {
		this.cardPresent = cardPresent;
		return this;
	}

	public Optional<TrueFalseIndicator> getCardholderPresent() {
		return cardholderPresent == null ? Optional.empty() : Optional.of(cardholderPresent);
	}

	public PaymentContext7 setCardholderPresent(TrueFalseIndicator cardholderPresent) {
		this.cardholderPresent = cardholderPresent;
		return this;
	}

	public Optional<TrueFalseIndicator> getOnLineContext() {
		return onLineContext == null ? Optional.empty() : Optional.of(onLineContext);
	}

	public PaymentContext7 setOnLineContext(TrueFalseIndicator onLineContext) {
		this.onLineContext = onLineContext;
		return this;
	}

	public Optional<AttendanceContext1Code> getAttendanceContext() {
		return attendanceContext == null ? Optional.empty() : Optional.of(attendanceContext);
	}

	public PaymentContext7 setAttendanceContext(AttendanceContext1Code attendanceContext) {
		this.attendanceContext = attendanceContext;
		return this;
	}

	public Optional<TransactionEnvironment1Code> getTransactionEnvironment() {
		return transactionEnvironment == null ? Optional.empty() : Optional.of(transactionEnvironment);
	}

	public PaymentContext7 setTransactionEnvironment(TransactionEnvironment1Code transactionEnvironment) {
		this.transactionEnvironment = transactionEnvironment;
		return this;
	}

	public Optional<TransactionChannel1Code> getTransactionChannel() {
		return transactionChannel == null ? Optional.empty() : Optional.of(transactionChannel);
	}

	public PaymentContext7 setTransactionChannel(TransactionChannel1Code transactionChannel) {
		this.transactionChannel = transactionChannel;
		return this;
	}

	public Optional<TrueFalseIndicator> getAttendantMessageCapable() {
		return attendantMessageCapable == null ? Optional.empty() : Optional.of(attendantMessageCapable);
	}

	public PaymentContext7 setAttendantMessageCapable(TrueFalseIndicator attendantMessageCapable) {
		this.attendantMessageCapable = attendantMessageCapable;
		return this;
	}

	public Optional<ISO2ALanguageCode> getAttendantLanguage() {
		return attendantLanguage == null ? Optional.empty() : Optional.of(attendantLanguage);
	}

	public PaymentContext7 setAttendantLanguage(ISO2ALanguageCode attendantLanguage) {
		this.attendantLanguage = attendantLanguage;
		return this;
	}

	public Optional<CardDataReading1Code> getCardDataEntryMode() {
		return cardDataEntryMode == null ? Optional.empty() : Optional.of(cardDataEntryMode);
	}

	public PaymentContext7 setCardDataEntryMode(CardDataReading1Code cardDataEntryMode) {
		this.cardDataEntryMode = cardDataEntryMode;
		return this;
	}

	public Optional<TrueFalseIndicator> getFallbackIndicator() {
		return fallbackIndicator == null ? Optional.empty() : Optional.of(fallbackIndicator);
	}

	public PaymentContext7 setFallbackIndicator(TrueFalseIndicator fallbackIndicator) {
		this.fallbackIndicator = fallbackIndicator;
		return this;
	}

	public List<SupportedPaymentOption1Code> getSupportedOption() {
		return supportedOption == null ? supportedOption = new ArrayList<>() : supportedOption;
	}

	public PaymentContext7 setSupportedOption(List<SupportedPaymentOption1Code> supportedOption) {
		this.supportedOption = Objects.requireNonNull(supportedOption);
		return this;
	}
}
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
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext6#mmCardPresent
 * PaymentContext6.mmCardPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmCardholderPresent
 * PaymentContext6.mmCardholderPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmOnLineContext
 * PaymentContext6.mmOnLineContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmAttendanceContext
 * PaymentContext6.mmAttendanceContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmTransactionEnvironment
 * PaymentContext6.mmTransactionEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmTransactionChannel
 * PaymentContext6.mmTransactionChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmCardDataEntryMode
 * PaymentContext6.mmCardDataEntryMode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmFallbackIndicator
 * PaymentContext6.mmFallbackIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmSupportedOption
 * PaymentContext6.mmSupportedOption}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentContext6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment context in which the transaction is performed."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext9
 * PaymentContext9}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentContext2
 * PaymentContext2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentContext6", propOrder = {"cardPresent", "cardholderPresent", "onLineContext", "attendanceContext", "transactionEnvironment", "transactionChannel", "cardDataEntryMode", "fallbackIndicator", "supportedOption"})
public class PaymentContext6 {

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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6
	 * PaymentContext6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPres"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction has been initiated by a card physically present or not."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmCardPresent
	 * PaymentContext9.mmCardPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmCardPresent
	 * PaymentContext2.mmCardPresent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext6, Optional<TrueFalseIndicator>> mmCardPresent = new MMMessageAttribute<PaymentContext6, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPresent;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext6.mmObject();
			isDerived = false;
			xmlTag = "CardPres";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPresent";
			definition = "Indicates whether the transaction has been initiated by a card physically present or not.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext9.mmCardPresent);
			previousVersion_lazy = () -> PaymentContext2.mmCardPresent;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext6 obj) {
			return obj.getCardPresent();
		}

		@Override
		public void setValue(PaymentContext6 obj, Optional<TrueFalseIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6
	 * PaymentContext6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrPres"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction has been initiated in presence of the cardholder or not."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmCardholderPresent
	 * PaymentContext9.mmCardholderPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmCardholderPresent
	 * PaymentContext2.mmCardholderPresent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext6, Optional<TrueFalseIndicator>> mmCardholderPresent = new MMMessageAttribute<PaymentContext6, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardholderPresent;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext6.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrPres";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderPresent";
			definition = "Indicates whether the transaction has been initiated in presence of the cardholder or not.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext9.mmCardholderPresent);
			previousVersion_lazy = () -> PaymentContext2.mmCardholderPresent;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext6 obj) {
			return obj.getCardholderPresent();
		}

		@Override
		public void setValue(PaymentContext6 obj, Optional<TrueFalseIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6
	 * PaymentContext6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLineCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On-line or off-line context of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmOnLineContext
	 * PaymentContext9.mmOnLineContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmOnLineContext
	 * PaymentContext2.mmOnLineContext}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext6, Optional<TrueFalseIndicator>> mmOnLineContext = new MMMessageAttribute<PaymentContext6, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmOnLineContext;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext6.mmObject();
			isDerived = false;
			xmlTag = "OnLineCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineContext";
			definition = "On-line or off-line context of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext9.mmOnLineContext);
			previousVersion_lazy = () -> PaymentContext2.mmOnLineContext;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext6 obj) {
			return obj.getOnLineContext();
		}

		@Override
		public void setValue(PaymentContext6 obj, Optional<TrueFalseIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6
	 * PaymentContext6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Human attendance at the POI (Point Of Interaction) location during the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmAttendanceContext
	 * PaymentContext9.mmAttendanceContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmAttendanceContext
	 * PaymentContext2.mmAttendanceContext}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext6, Optional<AttendanceContext1Code>> mmAttendanceContext = new MMMessageAttribute<PaymentContext6, Optional<AttendanceContext1Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmAttendanceContext;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext6.mmObject();
			isDerived = false;
			xmlTag = "AttndncCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceContext";
			definition = "Human attendance at the POI (Point Of Interaction) location during the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext9.mmAttendanceContext);
			previousVersion_lazy = () -> PaymentContext2.mmAttendanceContext;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AttendanceContext1Code.mmObject();
		}

		@Override
		public Optional<AttendanceContext1Code> getValue(PaymentContext6 obj) {
			return obj.getAttendanceContext();
		}

		@Override
		public void setValue(PaymentContext6 obj, Optional<AttendanceContext1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6
	 * PaymentContext6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxEnvt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionEnvironment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the environment of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmTransactionEnvironment
	 * PaymentContext9.mmTransactionEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmTransactionEnvironment
	 * PaymentContext2.mmTransactionEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext6, Optional<TransactionEnvironment1Code>> mmTransactionEnvironment = new MMMessageAttribute<PaymentContext6, Optional<TransactionEnvironment1Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionEnvironment;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext6.mmObject();
			isDerived = false;
			xmlTag = "TxEnvt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionEnvironment";
			definition = "Indicates the environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext9.mmTransactionEnvironment);
			previousVersion_lazy = () -> PaymentContext2.mmTransactionEnvironment;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionEnvironment1Code.mmObject();
		}

		@Override
		public Optional<TransactionEnvironment1Code> getValue(PaymentContext6 obj) {
			return obj.getTransactionEnvironment();
		}

		@Override
		public void setValue(PaymentContext6 obj, Optional<TransactionEnvironment1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6
	 * PaymentContext6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxChanl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the type of the communication channels used by the cardholder to the acceptor system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmTransactionChannel
	 * PaymentContext9.mmTransactionChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmTransactionChannel
	 * PaymentContext2.mmTransactionChannel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext6, Optional<TransactionChannel1Code>> mmTransactionChannel = new MMMessageAttribute<PaymentContext6, Optional<TransactionChannel1Code>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionChannel;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext6.mmObject();
			isDerived = false;
			xmlTag = "TxChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionChannel";
			definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext9.mmTransactionChannel);
			previousVersion_lazy = () -> PaymentContext2.mmTransactionChannel;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionChannel1Code.mmObject();
		}

		@Override
		public Optional<TransactionChannel1Code> getValue(PaymentContext6 obj) {
			return obj.getTransactionChannel();
		}

		@Override
		public void setValue(PaymentContext6 obj, Optional<TransactionChannel1Code> value) {
			obj.setTransactionChannel(value.orElse(null));
		}
	};
	@XmlElement(name = "CardDataNtryMd", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6
	 * PaymentContext6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardDataNtryMd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDataEntryMode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry mode of the card data."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmCardDataEntryMode
	 * PaymentContext9.mmCardDataEntryMode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmCardDataEntryMode
	 * PaymentContext2.mmCardDataEntryMode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext6, CardDataReading1Code> mmCardDataEntryMode = new MMMessageAttribute<PaymentContext6, CardDataReading1Code>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardDataEntryMode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext6.mmObject();
			isDerived = false;
			xmlTag = "CardDataNtryMd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDataEntryMode";
			definition = "Entry mode of the card data.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext9.mmCardDataEntryMode);
			previousVersion_lazy = () -> PaymentContext2.mmCardDataEntryMode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardDataReading1Code.mmObject();
		}

		@Override
		public CardDataReading1Code getValue(PaymentContext6 obj) {
			return obj.getCardDataEntryMode();
		}

		@Override
		public void setValue(PaymentContext6 obj, CardDataReading1Code value) {
			obj.setCardDataEntryMode(value);
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6
	 * PaymentContext6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FllbckInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicator of a card entry mode fallback."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmFallbackIndicator
	 * PaymentContext9.mmFallbackIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext2#mmFallbackIndicator
	 * PaymentContext2.mmFallbackIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext6, Optional<TrueFalseIndicator>> mmFallbackIndicator = new MMMessageAttribute<PaymentContext6, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmFallbackIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext6.mmObject();
			isDerived = false;
			xmlTag = "FllbckInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackIndicator";
			definition = "Indicator of a card entry mode fallback.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext9.mmFallbackIndicator);
			previousVersion_lazy = () -> PaymentContext2.mmFallbackIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext6 obj) {
			return obj.getFallbackIndicator();
		}

		@Override
		public void setValue(PaymentContext6 obj, Optional<TrueFalseIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6
	 * PaymentContext6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpprtdOptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupportedOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment options the card acceptor can support."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmSupportedOption
	 * PaymentContext9.mmSupportedOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext6, List<SupportedPaymentOption1Code>> mmSupportedOption = new MMMessageAttribute<PaymentContext6, List<SupportedPaymentOption1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext6.mmObject();
			isDerived = false;
			xmlTag = "SpprtdOptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportedOption";
			definition = "Payment options the card acceptor can support.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext9.mmSupportedOption);
			minOccurs = 0;
			simpleType_lazy = () -> SupportedPaymentOption1Code.mmObject();
		}

		@Override
		public List<SupportedPaymentOption1Code> getValue(PaymentContext6 obj) {
			return obj.getSupportedOption();
		}

		@Override
		public void setValue(PaymentContext6 obj, List<SupportedPaymentOption1Code> value) {
			obj.setSupportedOption(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext6.mmCardPresent, com.tools20022.repository.msg.PaymentContext6.mmCardholderPresent,
						com.tools20022.repository.msg.PaymentContext6.mmOnLineContext, com.tools20022.repository.msg.PaymentContext6.mmAttendanceContext, com.tools20022.repository.msg.PaymentContext6.mmTransactionEnvironment,
						com.tools20022.repository.msg.PaymentContext6.mmTransactionChannel, com.tools20022.repository.msg.PaymentContext6.mmCardDataEntryMode, com.tools20022.repository.msg.PaymentContext6.mmFallbackIndicator,
						com.tools20022.repository.msg.PaymentContext6.mmSupportedOption);
				trace_lazy = () -> CardPaymentAcquiring.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentContext6";
				definition = "Payment context in which the transaction is performed.";
				nextVersions_lazy = () -> Arrays.asList(PaymentContext9.mmObject());
				previousVersion_lazy = () -> PaymentContext2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getCardPresent() {
		return cardPresent == null ? Optional.empty() : Optional.of(cardPresent);
	}

	public PaymentContext6 setCardPresent(TrueFalseIndicator cardPresent) {
		this.cardPresent = cardPresent;
		return this;
	}

	public Optional<TrueFalseIndicator> getCardholderPresent() {
		return cardholderPresent == null ? Optional.empty() : Optional.of(cardholderPresent);
	}

	public PaymentContext6 setCardholderPresent(TrueFalseIndicator cardholderPresent) {
		this.cardholderPresent = cardholderPresent;
		return this;
	}

	public Optional<TrueFalseIndicator> getOnLineContext() {
		return onLineContext == null ? Optional.empty() : Optional.of(onLineContext);
	}

	public PaymentContext6 setOnLineContext(TrueFalseIndicator onLineContext) {
		this.onLineContext = onLineContext;
		return this;
	}

	public Optional<AttendanceContext1Code> getAttendanceContext() {
		return attendanceContext == null ? Optional.empty() : Optional.of(attendanceContext);
	}

	public PaymentContext6 setAttendanceContext(AttendanceContext1Code attendanceContext) {
		this.attendanceContext = attendanceContext;
		return this;
	}

	public Optional<TransactionEnvironment1Code> getTransactionEnvironment() {
		return transactionEnvironment == null ? Optional.empty() : Optional.of(transactionEnvironment);
	}

	public PaymentContext6 setTransactionEnvironment(TransactionEnvironment1Code transactionEnvironment) {
		this.transactionEnvironment = transactionEnvironment;
		return this;
	}

	public Optional<TransactionChannel1Code> getTransactionChannel() {
		return transactionChannel == null ? Optional.empty() : Optional.of(transactionChannel);
	}

	public PaymentContext6 setTransactionChannel(TransactionChannel1Code transactionChannel) {
		this.transactionChannel = transactionChannel;
		return this;
	}

	public CardDataReading1Code getCardDataEntryMode() {
		return cardDataEntryMode;
	}

	public PaymentContext6 setCardDataEntryMode(CardDataReading1Code cardDataEntryMode) {
		this.cardDataEntryMode = Objects.requireNonNull(cardDataEntryMode);
		return this;
	}

	public Optional<TrueFalseIndicator> getFallbackIndicator() {
		return fallbackIndicator == null ? Optional.empty() : Optional.of(fallbackIndicator);
	}

	public PaymentContext6 setFallbackIndicator(TrueFalseIndicator fallbackIndicator) {
		this.fallbackIndicator = fallbackIndicator;
		return this;
	}

	public List<SupportedPaymentOption1Code> getSupportedOption() {
		return supportedOption == null ? supportedOption = new ArrayList<>() : supportedOption;
	}

	public PaymentContext6 setSupportedOption(List<SupportedPaymentOption1Code> supportedOption) {
		this.supportedOption = Objects.requireNonNull(supportedOption);
		return this;
	}
}
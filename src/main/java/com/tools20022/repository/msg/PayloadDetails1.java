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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This component identifies the instance of the document exchanged.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDetails1#mmPayloadIdentifier
 * PayloadDetails1.mmPayloadIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDetails1#mmCreationDateAndTime
 * PayloadDetails1.mmCreationDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDetails1#mmPossibleDuplicateFlag
 * PayloadDetails1.mmPossibleDuplicateFlag}</li>
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
 * "PayloadDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This component identifies the instance of the document exchanged."</li>
 * </ul>
 */
public class PayloadDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text payloadIdentifier;
	/**
	 * String of characters that uniquely identifies the file, which was
	 * delivered by the sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PayloadDetails1
	 * PayloadDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyldIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayloadIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "String of characters that uniquely identifies the file, which was delivered by the sender."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayloadIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PayloadDetails1.mmObject();
			isDerived = false;
			xmlTag = "PyldIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayloadIdentifier";
			definition = "String of characters that uniquely identifies the file, which was delivered by the sender.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime creationDateAndTime;
	/**
	 * Date and time when the file was created by the sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PayloadDetails1
	 * PayloadDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time when the file was created by the sender."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateAndTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PayloadDetails1.mmObject();
			isDerived = false;
			xmlTag = "CreDtAndTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateAndTime";
			definition = "Date and time when the file was created by the sender.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected TrueFalseIndicator possibleDuplicateFlag;
	/**
	 * Flag indicating if the file exchanged between the two business
	 * applications is possibly a duplicate. If this indicator is not present
	 * within the message, please note that the default value would be "False".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PayloadDetails1
	 * PayloadDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PssblDplctFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicateFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flag indicating if the file exchanged between the two business applications is possibly a duplicate. If this indicator is not present within the message, please note that the default value would be \"False\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPossibleDuplicateFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PayloadDetails1.mmObject();
			isDerived = false;
			xmlTag = "PssblDplctFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicateFlag";
			definition = "Flag indicating if the file exchanged between the two business applications is possibly a duplicate. If this indicator is not present within the message, please note that the default value would be \"False\".";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PayloadDetails1.mmPayloadIdentifier, com.tools20022.repository.msg.PayloadDetails1.mmCreationDateAndTime,
						com.tools20022.repository.msg.PayloadDetails1.mmPossibleDuplicateFlag);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PayloadDetails1";
				definition = "This component identifies the instance of the document exchanged.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPayloadIdentifier() {
		return payloadIdentifier;
	}

	public void setPayloadIdentifier(Max35Text payloadIdentifier) {
		this.payloadIdentifier = payloadIdentifier;
	}

	public ISODateTime getCreationDateAndTime() {
		return creationDateAndTime;
	}

	public void setCreationDateAndTime(ISODateTime creationDateAndTime) {
		this.creationDateAndTime = creationDateAndTime;
	}

	public TrueFalseIndicator getPossibleDuplicateFlag() {
		return possibleDuplicateFlag;
	}

	public void setPossibleDuplicateFlag(TrueFalseIndicator possibleDuplicateFlag) {
		this.possibleDuplicateFlag = possibleDuplicateFlag;
	}
}
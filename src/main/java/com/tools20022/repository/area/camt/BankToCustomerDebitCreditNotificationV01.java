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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.msg.AccountNotification1;
import com.tools20022.repository.msg.GroupHeader23;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * The Bank-to-Customer Debit/Credit Notification message is sent by the account
 * servicer to an account owner or to a party authorised by the account owner to
 * receive the message. It can be used to inform the account owner, or
 * authorised party, of single or multiple debit and/or credit entries reported
 * to the account.<br>
 * <b>Usage</b><br>
 * The Bank-to-Customer Debit/Credit Notification message can contain reports
 * for more than 1 account. It provides information for cash management and/or
 * reconciliation.<br>
 * It can be used to :<br>
 * - report pending and booked items;<br>
 * - notify one or more debit entries;<br>
 * - notify one or more credit entries;<br>
 * - notify a combination of debit and credit entries<br>
 * It can include underlying details of transactions that have been included in
 * the entry.<br>
 * It is possible that the receiver of the message is not the account owner, but
 * a party entitled by the account owner to receive the account information
 * (also known as recipient).<br>
 * It does not contain balance information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BkToCstmrDbtCdtNtfctnV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV01#mmGroupHeader
 * BankToCustomerDebitCreditNotificationV01.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV01#mmNotification
 * BankToCustomerDebitCreditNotificationV01.mmNotification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.054.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BankToCustomerDebitCreditNotificationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Bank-to-Customer Debit/Credit Notification message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It can be used to inform the account owner, or authorised party, of single or multiple debit and/or credit entries reported to the account.\r\nUsage\r\nThe Bank-to-Customer Debit/Credit Notification message can contain reports for more than 1 account. It provides information for cash management and/or reconciliation.\r\nIt can be used to :\r\n- report pending and booked items;\r\n- notify one or more debit entries;\r\n- notify one or more credit entries;\r\n- notify a combination of debit and credit entries\r\nIt can include underlying details of transactions that have been included in the entry.\r\nIt is possible that the receiver of the message is not the account owner, but a party entitled by the account owner to receive the account information (also known as recipient).\r\nIt does not contain balance information."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV02
 * BankToCustomerDebitCreditNotificationV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class BankToCustomerDebitCreditNotificationV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected GroupHeader23 groupHeader;
	/**
	 * Common information for the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader23
	 * GroupHeader23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common information for the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Common information for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader23.mmObject();
		}
	};
	protected List<AccountNotification1> notification;
	/**
	 * Notifies debit and credit entries for the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification1
	 * AccountNotification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notifies debit and credit entries for the account."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNotification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Ntfctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notification";
			definition = "Notifies debit and credit entries for the account.";
			minOccurs = 1;
			complexType_lazy = () -> AccountNotification1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BankToCustomerDebitCreditNotificationV01";
				definition = "Scope\r\nThe Bank-to-Customer Debit/Credit Notification message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It can be used to inform the account owner, or authorised party, of single or multiple debit and/or credit entries reported to the account.\r\nUsage\r\nThe Bank-to-Customer Debit/Credit Notification message can contain reports for more than 1 account. It provides information for cash management and/or reconciliation.\r\nIt can be used to :\r\n- report pending and booked items;\r\n- notify one or more debit entries;\r\n- notify one or more credit entries;\r\n- notify a combination of debit and credit entries\r\nIt can include underlying details of transactions that have been included in the entry.\r\nIt is possible that the receiver of the message is not the account owner, but a party entitled by the account owner to receive the account information (also known as recipient).\r\nIt does not contain balance information.";
				nextVersions_lazy = () -> Arrays.asList(BankToCustomerDebitCreditNotificationV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "BkToCstmrDbtCdtNtfctnV01";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV01.mmGroupHeader,
						com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV01.mmNotification);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "054";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader23 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(GroupHeader23 groupHeader) {
		this.groupHeader = groupHeader;
	}

	public List<AccountNotification1> getNotification() {
		return notification;
	}

	public void setNotification(List<AccountNotification1> notification) {
		this.notification = notification;
	}
}
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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.msg.AccountNotification11;
import com.tools20022.repository.msg.GroupHeader58;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * Scope The BankToCustomerDebitCreditNotification message is sent by the
 * account servicer to an account owner or to a party authorised by the account
 * owner to receive the message. It can be used to inform the account owner, or
 * authorised party, of single or multiple debit and/or credit entries reported
 * to the account. Usage The BankToCustomerDebitCreditNotification message can
 * contain reports for more than one account. It provides information for cash
 * management and/or reconciliation. The BankToCustomerDebitCreditNotification
 * message can be used to: - report pending and booked items; - notify one or
 * more debit entries; - notify one or more credit entries; - notify a
 * combination of debit and credit entries. It can include underlying details of
 * transactions that have been included in the entry. It is possible that the
 * receiver of the message is not the account owner, but a party entitled by the
 * account owner to receive the account information (also known as recipient).
 * It does not contain balance information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.054.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV05#mmGroupHeader
 * BankToCustomerDebitCreditNotificationV05.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV05#mmNotification
 * BankToCustomerDebitCreditNotificationV05.mmNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV05#mmSupplementaryData
 * BankToCustomerDebitCreditNotificationV05.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BkToCstmrDbtCdtNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BankToCustomerDebitCreditNotificationV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nThe BankToCustomerDebitCreditNotification message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It can be used to inform the account owner, or authorised party, of single or multiple debit and/or credit entries reported to the account.\nUsage\nThe BankToCustomerDebitCreditNotification message can contain reports for more than one account. It provides information for cash management and/or reconciliation.\nThe BankToCustomerDebitCreditNotification message can be used to: \n- report pending and booked items;\n- notify one or more debit entries;\n- notify one or more credit entries;\n- notify a combination of debit and credit entries.\nIt can include underlying details of transactions that have been included in the entry.\nIt is possible that the receiver of the message is not the account owner, but a party entitled by the account owner to receive the account information (also known as recipient).\nIt does not contain balance information."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule#for_camt_BankToCustomerDebitCreditNotificationV05
 * ConstraintMessageOrNotificationPaginationRule.
 * for_camt_BankToCustomerDebitCreditNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_camt_BankToCustomerDebitCreditNotificationV05
 * ConstraintSupplementaryDataRule.
 * for_camt_BankToCustomerDebitCreditNotificationV05}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06
 * BankToCustomerDebitCreditNotificationV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV04
 * BankToCustomerDebitCreditNotificationV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BankToCustomerDebitCreditNotificationV05", propOrder = {"groupHeader", "notification", "supplementaryData"})
public class BankToCustomerDebitCreditNotificationV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader58 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader58
	 * GroupHeader58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common information for the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06#mmGroupHeader
	 * BankToCustomerDebitCreditNotificationV06.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV04#mmGroupHeader
	 * BankToCustomerDebitCreditNotificationV04.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BankToCustomerDebitCreditNotificationV05, GroupHeader58> mmGroupHeader = new MMMessageBuildingBlock<BankToCustomerDebitCreditNotificationV05, GroupHeader58>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Common information for the message.";
			nextVersions_lazy = () -> Arrays.asList(BankToCustomerDebitCreditNotificationV06.mmGroupHeader);
			previousVersion_lazy = () -> BankToCustomerDebitCreditNotificationV04.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader58.mmObject();
		}

		@Override
		public GroupHeader58 getValue(BankToCustomerDebitCreditNotificationV05 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(BankToCustomerDebitCreditNotificationV05 obj, GroupHeader58 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "Ntfctn", required = true)
	protected List<AccountNotification11> notification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntfctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notifies debit and credit entries for the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06#mmNotification
	 * BankToCustomerDebitCreditNotificationV06.mmNotification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV04#mmNotification
	 * BankToCustomerDebitCreditNotificationV04.mmNotification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BankToCustomerDebitCreditNotificationV05, List<AccountNotification11>> mmNotification = new MMMessageBuildingBlock<BankToCustomerDebitCreditNotificationV05, List<AccountNotification11>>() {
		{
			xmlTag = "Ntfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notification";
			definition = "Notifies debit and credit entries for the account.";
			nextVersions_lazy = () -> Arrays.asList(BankToCustomerDebitCreditNotificationV06.mmNotification);
			previousVersion_lazy = () -> BankToCustomerDebitCreditNotificationV04.mmNotification;
			minOccurs = 1;
			complexType_lazy = () -> AccountNotification11.mmObject();
		}

		@Override
		public List<AccountNotification11> getValue(BankToCustomerDebitCreditNotificationV05 obj) {
			return obj.getNotification();
		}

		@Override
		public void setValue(BankToCustomerDebitCreditNotificationV05 obj, List<AccountNotification11> value) {
			obj.setNotification(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06#mmSupplementaryData
	 * BankToCustomerDebitCreditNotificationV06.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV04#mmSupplementaryData
	 * BankToCustomerDebitCreditNotificationV04.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BankToCustomerDebitCreditNotificationV05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<BankToCustomerDebitCreditNotificationV05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(BankToCustomerDebitCreditNotificationV06.mmSupplementaryData);
			previousVersion_lazy = () -> BankToCustomerDebitCreditNotificationV04.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(BankToCustomerDebitCreditNotificationV05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(BankToCustomerDebitCreditNotificationV05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule.for_camt_BankToCustomerDebitCreditNotificationV05,
						com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_camt_BankToCustomerDebitCreditNotificationV05);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankToCustomerDebitCreditNotificationV05";
				definition = "Scope\nThe BankToCustomerDebitCreditNotification message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It can be used to inform the account owner, or authorised party, of single or multiple debit and/or credit entries reported to the account.\nUsage\nThe BankToCustomerDebitCreditNotification message can contain reports for more than one account. It provides information for cash management and/or reconciliation.\nThe BankToCustomerDebitCreditNotification message can be used to: \n- report pending and booked items;\n- notify one or more debit entries;\n- notify one or more credit entries;\n- notify a combination of debit and credit entries.\nIt can include underlying details of transactions that have been included in the entry.\nIt is possible that the receiver of the message is not the account owner, but a party entitled by the account owner to receive the account information (also known as recipient).\nIt does not contain balance information.";
				nextVersions_lazy = () -> Arrays.asList(BankToCustomerDebitCreditNotificationV06.mmObject());
				previousVersion_lazy = () -> BankToCustomerDebitCreditNotificationV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "BkToCstmrDbtCdtNtfctn";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV05.mmGroupHeader,
						com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV05.mmNotification, com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "054";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return BankToCustomerDebitCreditNotificationV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader58 getGroupHeader() {
		return groupHeader;
	}

	public BankToCustomerDebitCreditNotificationV05 setGroupHeader(GroupHeader58 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<AccountNotification11> getNotification() {
		return notification == null ? notification = new ArrayList<>() : notification;
	}

	public BankToCustomerDebitCreditNotificationV05 setNotification(List<AccountNotification11> notification) {
		this.notification = Objects.requireNonNull(notification);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public BankToCustomerDebitCreditNotificationV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.05")
	static public class Document {
		@XmlElement(name = "BkToCstmrDbtCdtNtfctn", required = true)
		public BankToCustomerDebitCreditNotificationV05 messageBody;
	}
}
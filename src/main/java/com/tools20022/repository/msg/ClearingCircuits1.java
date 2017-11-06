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
import com.tools20022.repository.choice.ClearingScheme1Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max40Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Clearing circuits information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmClearingCircuit
 * ClearingCircuits1.mmClearingCircuit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmClaimLimitIndicator
 * ClearingCircuits1.mmClaimLimitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmClearingSchemeShortName
 * ClearingCircuits1.mmClearingSchemeShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmClearingSchemeLongName
 * ClearingCircuits1.mmClearingSchemeLongName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmAllOrNothingIndicator
 * ClearingCircuits1.mmAllOrNothingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmGuaranteeFunds
 * ClearingCircuits1.mmGuaranteeFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmClearingAccount
 * ClearingCircuits1.mmClearingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmClearingAccountOwner
 * ClearingCircuits1.mmClearingAccountOwner}</li>
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
 * "ClearingCircuits1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Clearing circuits information."</li>
 * </ul>
 */
public class ClearingCircuits1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ClearingScheme1Choice clearingCircuit;
	/**
	 * Clearing scheme used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClearingScheme1Choice
	 * ClearingScheme1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrCrct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingCircuit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing scheme used."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClearingCircuit = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "ClrCrct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingCircuit";
			definition = "Clearing scheme used.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ClearingScheme1Choice.mmObject();
		}
	};
	protected YesNoIndicator claimLimitIndicator;
	/**
	 * Indicates whether the limits can be set for the external payment system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClmLmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimLimitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the limits can be set for the external payment system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClaimLimitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "ClmLmtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimLimitIndicator";
			definition = "Indicates whether the limits can be set for the external payment system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max40Text clearingSchemeShortName;
	/**
	 * Short name of the clearing scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max40Text
	 * Max40Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSchmeShrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSchemeShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short name of the clearing scheme."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingSchemeShortName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "ClrSchmeShrtNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSchemeShortName";
			definition = "Short name of the clearing scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
	protected Max140Text clearingSchemeLongName;
	/**
	 * Long name of the clearing scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSchmeLngNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSchemeLongName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Long name of the clearing scheme."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingSchemeLongName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "ClrSchmeLngNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSchemeLongName";
			definition = "Long name of the clearing scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected YesNoIndicator allOrNothingIndicator;
	/**
	 * Indicates whether all or nothing rule is in effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllOrNthgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNothingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether all or nothing rule is in effect."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllOrNothingIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "AllOrNthgInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNothingIndicator";
			definition = "Indicates whether all or nothing rule is in effect.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected GuaranteeFunds1 guaranteeFunds;
	/**
	 * Guarantee funds details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GuaranteeFunds1
	 * GuaranteeFunds1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntFnds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee funds details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGuaranteeFunds = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "GrntFnds";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeFunds";
			definition = "Guarantee funds details.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GuaranteeFunds1.mmObject();
		}
	};
	protected CashAccount24 clearingAccount;
	/**
	 * Clearing account identifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing account identifier."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClearingAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "ClrAcct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAccount";
			definition = "Clearing account identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	protected FinancialInstitutionIdentification9 clearingAccountOwner;
	/**
	 * Identification of the clearing account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9
	 * FinancialInstitutionIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrAcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the clearing account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClearingAccountOwner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "ClrAcctOwnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAccountOwner";
			definition = "Identification of the clearing account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClearingCircuits1.mmClearingCircuit, com.tools20022.repository.msg.ClearingCircuits1.mmClaimLimitIndicator,
						com.tools20022.repository.msg.ClearingCircuits1.mmClearingSchemeShortName, com.tools20022.repository.msg.ClearingCircuits1.mmClearingSchemeLongName,
						com.tools20022.repository.msg.ClearingCircuits1.mmAllOrNothingIndicator, com.tools20022.repository.msg.ClearingCircuits1.mmGuaranteeFunds, com.tools20022.repository.msg.ClearingCircuits1.mmClearingAccount,
						com.tools20022.repository.msg.ClearingCircuits1.mmClearingAccountOwner);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ClearingCircuits1";
				definition = "Clearing circuits information.";
			}
		});
		return mmObject_lazy.get();
	}

	public ClearingScheme1Choice getClearingCircuit() {
		return clearingCircuit;
	}

	public void setClearingCircuit(ClearingScheme1Choice clearingCircuit) {
		this.clearingCircuit = clearingCircuit;
	}

	public YesNoIndicator getClaimLimitIndicator() {
		return claimLimitIndicator;
	}

	public void setClaimLimitIndicator(YesNoIndicator claimLimitIndicator) {
		this.claimLimitIndicator = claimLimitIndicator;
	}

	public Max40Text getClearingSchemeShortName() {
		return clearingSchemeShortName;
	}

	public void setClearingSchemeShortName(Max40Text clearingSchemeShortName) {
		this.clearingSchemeShortName = clearingSchemeShortName;
	}

	public Max140Text getClearingSchemeLongName() {
		return clearingSchemeLongName;
	}

	public void setClearingSchemeLongName(Max140Text clearingSchemeLongName) {
		this.clearingSchemeLongName = clearingSchemeLongName;
	}

	public YesNoIndicator getAllOrNothingIndicator() {
		return allOrNothingIndicator;
	}

	public void setAllOrNothingIndicator(YesNoIndicator allOrNothingIndicator) {
		this.allOrNothingIndicator = allOrNothingIndicator;
	}

	public GuaranteeFunds1 getGuaranteeFunds() {
		return guaranteeFunds;
	}

	public void setGuaranteeFunds(com.tools20022.repository.msg.GuaranteeFunds1 guaranteeFunds) {
		this.guaranteeFunds = guaranteeFunds;
	}

	public CashAccount24 getClearingAccount() {
		return clearingAccount;
	}

	public void setClearingAccount(com.tools20022.repository.msg.CashAccount24 clearingAccount) {
		this.clearingAccount = clearingAccount;
	}

	public FinancialInstitutionIdentification9 getClearingAccountOwner() {
		return clearingAccountOwner;
	}

	public void setClearingAccountOwner(com.tools20022.repository.msg.FinancialInstitutionIdentification9 clearingAccountOwner) {
		this.clearingAccountOwner = clearingAccountOwner;
	}
}
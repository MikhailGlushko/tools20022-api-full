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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ElectionMovementTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.msg.CorporateActionElection1;
import com.tools20022.repository.msg.CorporateActionElection2;
import com.tools20022.repository.msg.CorporateActionElection3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Decision taken by the account holder regarding the corporate action event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionElection"
 * src="doc-files/CorporateActionElection.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmExecutionRequestedDateTime
 * CorporateActionElection.mmExecutionRequestedDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmOption
 * CorporateActionElection.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmCashAccount
 * CorporateActionElection.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmElectionType
 * CorporateActionElection.mmElectionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmQuantity
 * CorporateActionElection.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmAmendmentReason
 * CorporateActionElection.mmAmendmentReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmRelatedServicing
 * CorporateActionElection.mmRelatedServicing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCorporateActionElection
 * CashAccount.mmRelatedCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionElection
 * SecuritiesQuantity.mmCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCorporateActionElection
 * CorporateActionOption.mmCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionElection
 * CorporateActionServicing.mmCorporateActionElection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionElection3
 * CorporateActionElection3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionElection1
 * CorporateActionElection1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionElection2
 * CorporateActionElection2}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionElection"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Decision taken by the account holder regarding the corporate action event."</li>
 * </ul>
 */
public class CorporateActionElection {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime executionRequestedDateTime;
	/**
	 * Date/time at which the instructing party requests the instruction to be
	 * executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#mmExecutionRequestedDateTime
	 * CorporateActionOption5.mmExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#mmExecutionRequestedDateTime
	 * CorporateActionOption13.mmExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#mmExecutionRequestedDateTime
	 * CorporateActionOption25.mmExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#mmExecutionRequestedDateTime
	 * CorporateActionOption30.mmExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#mmExecutionRequestedDateTime
	 * CorporateActionOption38.mmExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#mmExecutionRequestedDateTime
	 * CorporateActionOption47.mmExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#mmExecutionRequestedDateTime
	 * CorporateActionOption57.mmExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#mmExecutionRequestedDateTime
	 * CorporateActionOption58.mmExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#mmExecutionRequestedDateTime
	 * CorporateActionOption103.mmExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#mmExecutionRequestedDateTime
	 * CorporateActionOption107.mmExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#mmExecutionRequestedDateTime
	 * CorporateActionOption118.mmExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#mmExecutionRequestedDateTime
	 * CorporateActionOption123.mmExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmExecutionRequestedDateTime
	 * CorporateActionOption131.mmExecutionRequestedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#mmExecutionRequestedDateTime
	 * CorporateActionOption134.mmExecutionRequestedDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionRequestedDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the instructing party requests the instruction to be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExecutionRequestedDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption5.mmExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption13.mmExecutionRequestedDateTime,
					com.tools20022.repository.msg.CorporateActionOption25.mmExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption30.mmExecutionRequestedDateTime,
					com.tools20022.repository.msg.CorporateActionOption38.mmExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption47.mmExecutionRequestedDateTime,
					com.tools20022.repository.msg.CorporateActionOption57.mmExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption58.mmExecutionRequestedDateTime,
					com.tools20022.repository.msg.CorporateActionOption103.mmExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption107.mmExecutionRequestedDateTime,
					com.tools20022.repository.msg.CorporateActionOption118.mmExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption123.mmExecutionRequestedDateTime,
					com.tools20022.repository.msg.CorporateActionOption131.mmExecutionRequestedDateTime, com.tools20022.repository.msg.CorporateActionOption134.mmExecutionRequestedDateTime);
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutionRequestedDateTime";
			definition = "Date/time at which the instructing party requests the instruction to be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionOption> option;
	/**
	 * Option on which the investor makes its decision.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCorporateActionElection
	 * CorporateActionOption.mmCorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option on which the investor makes its decision."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option on which the investor makes its decision.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmCorporateActionElection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * Specifies the account(s) used in relation with the election of an option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCorporateActionElection
	 * CashAccount.mmRelatedCorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption2#mmAccount
	 * CashOption2.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption9#mmAccount
	 * CashOption9.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption12#mmAccount
	 * CashOption12.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption13#mmAccount
	 * CashOption13.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption18#mmAccount
	 * CashOption18.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption22#mmAccount
	 * CashOption22.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption26#mmAccount
	 * CashOption26.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption27#mmAccount
	 * CashOption27.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption5#mmAccount
	 * CashOption5.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption7#mmAccount
	 * CashOption7.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption19#mmAccount
	 * CashOption19.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption23#mmAccount
	 * CashOption23.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption30#mmAccount
	 * CashOption30.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption38#mmAccount
	 * CashOption38.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption39#mmAccount
	 * CashOption39.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption41#mmAccount
	 * CashOption41.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption44#mmAccount
	 * CashOption44.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption45#mmAccount
	 * CashOption45.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption46#mmAccount
	 * CashOption46.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption48#mmAccount
	 * CashOption48.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption52#mmAccount
	 * CashOption52.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption55#mmAccount
	 * CashOption55.mmAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account(s) used in relation with the election of an option."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOption2.mmAccount, com.tools20022.repository.msg.CashOption9.mmAccount, com.tools20022.repository.msg.CashOption12.mmAccount,
					com.tools20022.repository.msg.CashOption13.mmAccount, com.tools20022.repository.msg.CashOption18.mmAccount, com.tools20022.repository.msg.CashOption22.mmAccount, com.tools20022.repository.msg.CashOption26.mmAccount,
					com.tools20022.repository.msg.CashOption27.mmAccount, com.tools20022.repository.msg.CashOption5.mmAccount, com.tools20022.repository.msg.CashOption7.mmAccount, com.tools20022.repository.msg.CashOption19.mmAccount,
					com.tools20022.repository.msg.CashOption23.mmAccount, com.tools20022.repository.msg.CashOption30.mmAccount, com.tools20022.repository.msg.CashOption38.mmAccount, com.tools20022.repository.msg.CashOption39.mmAccount,
					com.tools20022.repository.msg.CashOption41.mmAccount, com.tools20022.repository.msg.CashOption44.mmAccount, com.tools20022.repository.msg.CashOption45.mmAccount, com.tools20022.repository.msg.CashOption46.mmAccount,
					com.tools20022.repository.msg.CashOption48.mmAccount, com.tools20022.repository.msg.CashOption52.mmAccount, com.tools20022.repository.msg.CashOption55.mmAccount);
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Specifies the account(s) used in relation with the election of an option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedCorporateActionElection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected ElectionMovementTypeCode electionType;
	/**
	 * Specifies whether the election results in a change of balance type that
	 * transfers control of the underlying securities or the transfer of
	 * underlying securities themselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ElectionMovementTypeCode
	 * ElectionMovementTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat1Choice#mmCode
	 * ElectionTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat1Choice#mmProprietary
	 * ElectionTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmElectionType
	 * CorporateAction3.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat2Choice#mmCode
	 * ElectionTypeFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat2Choice#mmProprietary
	 * ElectionTypeFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmElectionType
	 * CorporateAction4.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmElectionType
	 * CorporateAction5.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmElectionType
	 * CorporateAction6.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmElectionType
	 * CorporateAction7.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmElectionType
	 * CorporateAction8.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmElectionType
	 * CorporateAction10.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmElectionType
	 * CorporateAction11.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmElectionType
	 * CorporateAction2.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmElectionType
	 * CorporateAction12.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmElectionType
	 * CorporateAction17.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmElectionType
	 * CorporateAction31.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat3Choice#mmCode
	 * ElectionTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat3Choice#mmProprietary
	 * ElectionTypeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmElectionType
	 * CorporateAction40.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat4Choice#mmCode
	 * ElectionTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat4Choice#mmProprietary
	 * ElectionTypeFormat4Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the election results in a change of balance type that transfers control of the underlying securities or the transfer of underlying securities themselves."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmElectionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ElectionTypeFormat1Choice.mmCode, com.tools20022.repository.choice.ElectionTypeFormat1Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateAction3.mmElectionType, com.tools20022.repository.choice.ElectionTypeFormat2Choice.mmCode, com.tools20022.repository.choice.ElectionTypeFormat2Choice.mmProprietary,
					com.tools20022.repository.msg.CorporateAction4.mmElectionType, com.tools20022.repository.msg.CorporateAction5.mmElectionType, com.tools20022.repository.msg.CorporateAction6.mmElectionType,
					com.tools20022.repository.msg.CorporateAction7.mmElectionType, com.tools20022.repository.msg.CorporateAction8.mmElectionType, com.tools20022.repository.msg.CorporateAction10.mmElectionType,
					com.tools20022.repository.msg.CorporateAction11.mmElectionType, com.tools20022.repository.msg.CorporateAction2.mmElectionType, com.tools20022.repository.msg.CorporateAction12.mmElectionType,
					com.tools20022.repository.msg.CorporateAction17.mmElectionType, com.tools20022.repository.msg.CorporateAction31.mmElectionType, com.tools20022.repository.choice.ElectionTypeFormat3Choice.mmCode,
					com.tools20022.repository.choice.ElectionTypeFormat3Choice.mmProprietary, com.tools20022.repository.msg.CorporateAction40.mmElectionType, com.tools20022.repository.choice.ElectionTypeFormat4Choice.mmCode,
					com.tools20022.repository.choice.ElectionTypeFormat4Choice.mmProprietary);
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectionType";
			definition = "Specifies whether the election results in a change of balance type that transfers control of the underlying securities or the transfer of underlying securities themselves.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ElectionMovementTypeCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> quantity;
	/**
	 * Specifies the quantity of securities elected for the associated option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionElection
	 * SecuritiesQuantity.mmCorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmInstructedUnderlyingSecuritiesQuantity
	 * CorporateActionElection3.mmInstructedUnderlyingSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmInstructedSecuritiesQuantityToReceive
	 * CorporateActionElection3.mmInstructedSecuritiesQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection1#mmOriginalInstructedQuantity
	 * CorporateActionElection1.mmOriginalInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection1#mmRemainingQuantity
	 * CorporateActionElection1.mmRemainingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection2#mmNewInstructedQuantity
	 * CorporateActionElection2.mmNewInstructedQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the quantity of securities elected for the associated option."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionElection3.mmInstructedUnderlyingSecuritiesQuantity,
					com.tools20022.repository.msg.CorporateActionElection3.mmInstructedSecuritiesQuantityToReceive, com.tools20022.repository.msg.CorporateActionElection1.mmOriginalInstructedQuantity,
					com.tools20022.repository.msg.CorporateActionElection1.mmRemainingQuantity, com.tools20022.repository.msg.CorporateActionElection2.mmNewInstructedQuantity);
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity of securities elected for the associated option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmCorporateActionElection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected Max350Text amendmentReason;
	/**
	 * Reason explaining the amendment of the election.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection2#mmReason
	 * CorporateActionElection2.mmReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason explaining the amendment of the election."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmendmentReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionElection2.mmReason);
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmendmentReason";
			definition = "Reason explaining the amendment of the election.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected CorporateActionServicing relatedServicing;
	/**
	 * Process which groups the activities related to corporate action
	 * servicing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionElection
	 * CorporateActionServicing.mmCorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to corporate action servicing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionElection.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionElection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionElection";
				definition = "Decision taken by the account holder regarding the corporate action event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmRelatedCorporateActionElection, com.tools20022.repository.entity.SecuritiesQuantity.mmCorporateActionElection,
						com.tools20022.repository.entity.CorporateActionOption.mmCorporateActionElection, com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionElection);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionElection.mmExecutionRequestedDateTime, com.tools20022.repository.entity.CorporateActionElection.mmOption,
						com.tools20022.repository.entity.CorporateActionElection.mmCashAccount, com.tools20022.repository.entity.CorporateActionElection.mmElectionType, com.tools20022.repository.entity.CorporateActionElection.mmQuantity,
						com.tools20022.repository.entity.CorporateActionElection.mmAmendmentReason, com.tools20022.repository.entity.CorporateActionElection.mmRelatedServicing);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionElection3.mmObject(), CorporateActionElection1.mmObject(), CorporateActionElection2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getExecutionRequestedDateTime() {
		return executionRequestedDateTime;
	}

	public void setExecutionRequestedDateTime(ISODateTime executionRequestedDateTime) {
		this.executionRequestedDateTime = executionRequestedDateTime;
	}

	public List<CorporateActionOption> getOption() {
		return option;
	}

	public void setOption(List<com.tools20022.repository.entity.CorporateActionOption> option) {
		this.option = option;
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = cashAccount;
	}

	public ElectionMovementTypeCode getElectionType() {
		return electionType;
	}

	public void setElectionType(ElectionMovementTypeCode electionType) {
		this.electionType = electionType;
	}

	public List<SecuritiesQuantity> getQuantity() {
		return quantity;
	}

	public void setQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> quantity) {
		this.quantity = quantity;
	}

	public Max350Text getAmendmentReason() {
		return amendmentReason;
	}

	public void setAmendmentReason(Max350Text amendmentReason) {
		this.amendmentReason = amendmentReason;
	}

	public CorporateActionServicing getRelatedServicing() {
		return relatedServicing;
	}

	public void setRelatedServicing(com.tools20022.repository.entity.CorporateActionServicing relatedServicing) {
		this.relatedServicing = relatedServicing;
	}
}
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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Interest;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides details on the interest statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmInterestPeriod
 * InterestStatement3.mmInterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmTotalInterestAmountDueToA
 * InterestStatement3.mmTotalInterestAmountDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmTotalInterestAmountDueToB
 * InterestStatement3.mmTotalInterestAmountDueToB}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestStatement3#mmValueDate
 * InterestStatement3.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmInterestPaymentRequestIdentification
 * InterestStatement3.mmInterestPaymentRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmInterestCalculation
 * InterestStatement3.mmInterestCalculation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV03#mmInterestStatement
 * InterestPaymentStatementV03.mmInterestStatement}</li>
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
 * "InterestStatement3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details on the interest statement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InterestStatement4
 * InterestStatement4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InterestStatement2
 * InterestStatement2}</li>
 * </ul>
 */
public class InterestStatement3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DatePeriodDetails interestPeriod;
	/**
	 * Provides the period during which the interest rate has been applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails
	 * DatePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
	 * InterestCalculation.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3
	 * InterestStatement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the period during which the interest rate has been applied."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmInterestPeriod
	 * InterestStatement4.mmInterestPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmInterestPeriod
	 * InterestStatement2.mmInterestPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmInterestPeriod;
			componentContext_lazy = () -> InterestStatement3.mmObject();
			isDerived = false;
			xmlTag = "IntrstPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPeriod";
			definition = "Provides the period during which the interest rate has been applied.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestStatement4.mmInterestPeriod);
			previousVersion_lazy = () -> com.tools20022.repository.msg.InterestStatement2.mmInterestPeriod;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.DatePeriodDetails.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount totalInterestAmountDueToA;
	/**
	 * Provides the total amount of interest that is due to partyA.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3
	 * InterestStatement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlIntrstAmtDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterestAmountDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the total amount of interest that is due to partyA."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmTotalInterestAmountDueToA
	 * InterestStatement4.mmTotalInterestAmountDueToA}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmTotalInterestAmountDueToA
	 * InterestStatement2.mmTotalInterestAmountDueToA}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalInterestAmountDueToA = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Interest.mmAmount;
			componentContext_lazy = () -> InterestStatement3.mmObject();
			isDerived = false;
			xmlTag = "TtlIntrstAmtDueToA";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterestAmountDueToA";
			definition = "Provides the total amount of interest that is due to partyA.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestStatement4.mmTotalInterestAmountDueToA);
			previousVersion_lazy = () -> com.tools20022.repository.msg.InterestStatement2.mmTotalInterestAmountDueToA;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount totalInterestAmountDueToB;
	/**
	 * Provides the total amount of interest that is due to partyB.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3
	 * InterestStatement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlIntrstAmtDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterestAmountDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the total amount of interest that is due to partyB."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmTotalInterestAmountDueToB
	 * InterestStatement4.mmTotalInterestAmountDueToB}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmTotalInterestAmountDueToB
	 * InterestStatement2.mmTotalInterestAmountDueToB}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalInterestAmountDueToB = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Interest.mmAmount;
			componentContext_lazy = () -> InterestStatement3.mmObject();
			isDerived = false;
			xmlTag = "TtlIntrstAmtDueToB";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterestAmountDueToB";
			definition = "Provides the total amount of interest that is due to partyB.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestStatement4.mmTotalInterestAmountDueToB);
			previousVersion_lazy = () -> com.tools20022.repository.msg.InterestStatement2.mmTotalInterestAmountDueToB;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ISODate valueDate;
	/**
	 * Indicates the value date of the interest statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmPaymentDate
	 * Interest.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3
	 * InterestStatement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the value date of the interest statement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmValueDate
	 * InterestStatement4.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmValueDate
	 * InterestStatement2.mmValueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Interest.mmPaymentDate;
			componentContext_lazy = () -> InterestStatement3.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Indicates the value date of the interest statement.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestStatement4.mmValueDate);
			previousVersion_lazy = () -> com.tools20022.repository.msg.InterestStatement2.mmValueDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text interestPaymentRequestIdentification;
	/**
	 * Provides the reference to the interest payment request.
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
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3
	 * InterestStatement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmtReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the reference to the interest payment request."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmInterestPaymentRequestIdentification
	 * InterestStatement4.mmInterestPaymentRequestIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmInterestPaymentRequestIdentification
	 * InterestStatement2.mmInterestPaymentRequestIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestPaymentRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InterestStatement3.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtReqId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRequestIdentification";
			definition = "Provides the reference to the interest payment request.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestStatement4.mmInterestPaymentRequestIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.InterestStatement2.mmInterestPaymentRequestIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InterestCalculation3> interestCalculation;
	/**
	 * Provides the details of the interest calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InterestCalculation3
	 * InterestCalculation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3
	 * InterestStatement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstClctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the details of the interest calculation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmInterestCalculation
	 * InterestStatement4.mmInterestCalculation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmInterestCalculationDetails
	 * InterestStatement2.mmInterestCalculationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterestCalculation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Interest.mmInterestCalculation;
			componentContext_lazy = () -> InterestStatement3.mmObject();
			isDerived = false;
			xmlTag = "IntrstClctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestCalculation";
			definition = "Provides the details of the interest calculation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestStatement4.mmInterestCalculation);
			previousVersion_lazy = () -> com.tools20022.repository.msg.InterestStatement2.mmInterestCalculationDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InterestCalculation3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestStatement3.mmInterestPeriod, com.tools20022.repository.msg.InterestStatement3.mmTotalInterestAmountDueToA,
						com.tools20022.repository.msg.InterestStatement3.mmTotalInterestAmountDueToB, com.tools20022.repository.msg.InterestStatement3.mmValueDate,
						com.tools20022.repository.msg.InterestStatement3.mmInterestPaymentRequestIdentification, com.tools20022.repository.msg.InterestStatement3.mmInterestCalculation);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.InterestPaymentStatementV03.mmInterestStatement);
				trace_lazy = () -> Interest.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InterestStatement3";
				definition = "Provides details on the interest statement.";
				nextVersions_lazy = () -> Arrays.asList(InterestStatement4.mmObject());
				previousVersion_lazy = () -> InterestStatement2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DatePeriodDetails getInterestPeriod() {
		return interestPeriod;
	}

	public void setInterestPeriod(com.tools20022.repository.msg.DatePeriodDetails interestPeriod) {
		this.interestPeriod = interestPeriod;
	}

	public ActiveCurrencyAndAmount getTotalInterestAmountDueToA() {
		return totalInterestAmountDueToA;
	}

	public void setTotalInterestAmountDueToA(ActiveCurrencyAndAmount totalInterestAmountDueToA) {
		this.totalInterestAmountDueToA = totalInterestAmountDueToA;
	}

	public ActiveCurrencyAndAmount getTotalInterestAmountDueToB() {
		return totalInterestAmountDueToB;
	}

	public void setTotalInterestAmountDueToB(ActiveCurrencyAndAmount totalInterestAmountDueToB) {
		this.totalInterestAmountDueToB = totalInterestAmountDueToB;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
	}

	public Max35Text getInterestPaymentRequestIdentification() {
		return interestPaymentRequestIdentification;
	}

	public void setInterestPaymentRequestIdentification(Max35Text interestPaymentRequestIdentification) {
		this.interestPaymentRequestIdentification = interestPaymentRequestIdentification;
	}

	public List<InterestCalculation3> getInterestCalculation() {
		return interestCalculation;
	}

	public void setInterestCalculation(List<com.tools20022.repository.msg.InterestCalculation3> interestCalculation) {
		this.interestCalculation = interestCalculation;
	}
}
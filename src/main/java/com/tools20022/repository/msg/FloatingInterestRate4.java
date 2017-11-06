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
import com.tools20022.repository.choice.BenchmarkCurveName4Choice;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Index;
import com.tools20022.repository.entity.VariableInterest;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the index used to define the rate and optionally the basis point
 * spread.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4#mmReferenceRate
 * FloatingInterestRate4.mmReferenceRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FloatingInterestRate4#mmTerm
 * FloatingInterestRate4.mmTerm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4#mmBasisPointSpread
 * FloatingInterestRate4.mmBasisPointSpread}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.VariableInterest
 * VariableInterest}</li>
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
 * "FloatingInterestRate4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the index used to define the rate and optionally the basis point spread."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FloatingInterestRate6
 * FloatingInterestRate6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.VariableInterest1Rate
 * VariableInterest1Rate}</li>
 * </ul>
 */
public class FloatingInterestRate4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BenchmarkCurveName4Choice referenceRate;
	/**
	 * Identifies the reference index for the debt instrument. <br>
	 * <br>
	 * Usage:<br>
	 * Where an identifier exists, the ISIN must be used; otherwise, names will
	 * be necessary (such as EURIBOR6M, LIBOR3M) as other identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice
	 * BenchmarkCurveName4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIdentification
	 * Index.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4
	 * FloatingInterestRate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the reference index for the debt instrument. \r\n\r\nUsage:\r\nWhere an identifier exists, the ISIN must be used; otherwise, names will be necessary (such as EURIBOR6M, LIBOR3M) as other identification."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate6#mmReferenceRate
	 * FloatingInterestRate6.mmReferenceRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VariableInterest1Rate#mmIndex
	 * VariableInterest1Rate.mmIndex}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Index.mmIdentification;
			componentContext_lazy = () -> FloatingInterestRate4.mmObject();
			isDerived = false;
			xmlTag = "RefRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRate";
			definition = "Identifies the reference index for the debt instrument. \r\n\r\nUsage:\r\nWhere an identifier exists, the ISIN must be used; otherwise, names will be necessary (such as EURIBOR6M, LIBOR3M) as other identification.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FloatingInterestRate6.mmReferenceRate);
			previousVersion_lazy = () -> com.tools20022.repository.msg.VariableInterest1Rate.mmIndex;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BenchmarkCurveName4Choice.mmObject();
		}
	};
	protected InterestRateContractTerm1 term;
	/**
	 * Term of the index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm1
	 * InterestRateContractTerm1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4
	 * FloatingInterestRate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Term"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Term"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Term of the index."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate6#mmTerm
	 * FloatingInterestRate6.mmTerm}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerm = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Index.mmObject();
			componentContext_lazy = () -> FloatingInterestRate4.mmObject();
			isDerived = false;
			xmlTag = "Term";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Term";
			definition = "Term of the index.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FloatingInterestRate6.mmTerm);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InterestRateContractTerm1.mmObject();
		}
	};
	protected Number basisPointSpread;
	/**
	 * Provides the number of basis points added to (if positive) or deducted
	 * from (if negative) the underlying reference rate to calculate the actual
	 * interest rate applicable for a given period at issuance of the floating
	 * rate instrument.<br>
	 * <br>
	 * Used to express differences in interest rates, for example, a difference
	 * of 0.10% is equivalent to a change of 10 basis points.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBasisPointSpread
	 * Spread.mmBasisPointSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4
	 * FloatingInterestRate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsisPtSprd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisPointSpread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the number of basis points added to (if positive) or deducted from (if negative) the underlying reference rate to calculate the actual interest rate applicable for a given period at issuance of the floating rate instrument.\r\n\r\nUsed to express differences in interest rates, for example, a difference of 0.10% is equivalent to a change of 10 basis points."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate6#mmBasisPointSpread
	 * FloatingInterestRate6.mmBasisPointSpread}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBasisPointSpread = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Spread.mmBasisPointSpread;
			componentContext_lazy = () -> FloatingInterestRate4.mmObject();
			isDerived = false;
			xmlTag = "BsisPtSprd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisPointSpread";
			definition = "Provides the number of basis points added to (if positive) or deducted from (if negative) the underlying reference rate to calculate the actual interest rate applicable for a given period at issuance of the floating rate instrument.\r\n\r\nUsed to express differences in interest rates, for example, a difference of 0.10% is equivalent to a change of 10 basis points.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FloatingInterestRate6.mmBasisPointSpread);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FloatingInterestRate4.mmReferenceRate, com.tools20022.repository.msg.FloatingInterestRate4.mmTerm,
						com.tools20022.repository.msg.FloatingInterestRate4.mmBasisPointSpread);
				trace_lazy = () -> VariableInterest.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FloatingInterestRate4";
				definition = "Provides the index used to define the rate and optionally the basis point spread.";
				nextVersions_lazy = () -> Arrays.asList(FloatingInterestRate6.mmObject());
				previousVersion_lazy = () -> VariableInterest1Rate.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public BenchmarkCurveName4Choice getReferenceRate() {
		return referenceRate;
	}

	public void setReferenceRate(BenchmarkCurveName4Choice referenceRate) {
		this.referenceRate = referenceRate;
	}

	public InterestRateContractTerm1 getTerm() {
		return term;
	}

	public void setTerm(com.tools20022.repository.msg.InterestRateContractTerm1 term) {
		this.term = term;
	}

	public Number getBasisPointSpread() {
		return basisPointSpread;
	}

	public void setBasisPointSpread(Number basisPointSpread) {
		this.basisPointSpread = basisPointSpread;
	}
}
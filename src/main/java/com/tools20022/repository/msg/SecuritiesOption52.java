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
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.Quantity20Choice;
import com.tools20022.repository.entity.CorporateActionOption;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the security option of a corporate event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption52#mmConditionalQuantity
 * SecuritiesOption52.mmConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption52#mmInstructedQuantity
 * SecuritiesOption52.mmInstructedQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
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
 * "SecuritiesOption52"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the security option of a corporate event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2
 * SecuritiesOption2}</li>
 * </ul>
 */
public class SecuritiesOption52 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentQuantity1Choice conditionalQuantity;
	/**
	 * Minimum quantity of securities to be accepted (used in the framework of
	 * conditional privilege on election). In case of proration, if this minimum
	 * quantity is not reached then the instruction is void.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmConditionalQuantity
	 * SecuritiesProceedsDefinition.mmConditionalQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption52
	 * SecuritiesOption52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election). In case of proration, if this minimum quantity is not reached then the instruction is void."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption2#mmConditionalQuantity
	 * SecuritiesOption2.mmConditionalQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConditionalQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmConditionalQuantity;
			componentContext_lazy = () -> SecuritiesOption52.mmObject();
			isDerived = false;
			xmlTag = "CondlQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantity";
			definition = "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election). In case of proration, if this minimum quantity is not reached then the instruction is void.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.SecuritiesOption2.mmConditionalQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected Quantity20Choice instructedQuantity;
	/**
	 * Quantity of securities to which this instruction applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity20Choice
	 * Quantity20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption52
	 * SecuritiesOption52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities to which this instruction applies."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> SecuritiesOption52.mmObject();
			isDerived = false;
			xmlTag = "InstdQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedQuantity";
			definition = "Quantity of securities to which this instruction applies.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity20Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption52.mmConditionalQuantity, com.tools20022.repository.msg.SecuritiesOption52.mmInstructedQuantity);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOption52";
				definition = "Specifies the security option of a corporate event.";
				previousVersion_lazy = () -> SecuritiesOption2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentQuantity1Choice getConditionalQuantity() {
		return conditionalQuantity;
	}

	public void setConditionalQuantity(FinancialInstrumentQuantity1Choice conditionalQuantity) {
		this.conditionalQuantity = conditionalQuantity;
	}

	public Quantity20Choice getInstructedQuantity() {
		return instructedQuantity;
	}

	public void setInstructedQuantity(Quantity20Choice instructedQuantity) {
		this.instructedQuantity = instructedQuantity;
	}
}
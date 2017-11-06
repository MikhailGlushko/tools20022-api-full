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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.entity.RiskManagementLimit;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Limit details of one particular limit set by the member and managed by the
 * transaction administrator.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmSingleLimitOrAllLimitsRule
 * LimitDetailsStructure2.mmSingleLimitOrAllLimitsRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmCurrentLimitIdentification
 * LimitDetailsStructure2.mmCurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmDefaultLimitIdentification
 * LimitDetailsStructure2.mmDefaultLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmAllCurrentLimits
 * LimitDetailsStructure2.mmAllCurrentLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmAllDefaultLimits
 * LimitDetailsStructure2.mmAllDefaultLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmNewLimitValueSet
 * LimitDetailsStructure2.mmNewLimitValueSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RiskManagementLimit
 * RiskManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitDetailsStructure2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Limit details of one particular limit set by the member and managed by the transaction administrator."
 * </li>
 * </ul>
 */
public class LimitDetailsStructure2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected LimitIdentificationDetails2 currentLimitIdentification;
	/**
	 * Identification of the current limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails2
	 * LimitIdentificationDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2
	 * LimitDetailsStructure2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurLmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentLimitIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the current limit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrentLimitIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> LimitDetailsStructure2.mmObject();
			isDerived = false;
			xmlTag = "CurLmtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentLimitIdentification";
			definition = "Identification of the current limit.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LimitIdentificationDetails2.mmObject();
		}
	};
	protected LimitIdentificationDetails2 defaultLimitIdentification;
	/**
	 * Identification of the default limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails2
	 * LimitIdentificationDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2
	 * LimitDetailsStructure2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltLmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultLimitIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the default limit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDefaultLimitIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> LimitDetailsStructure2.mmObject();
			isDerived = false;
			xmlTag = "DfltLmtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultLimitIdentification";
			definition = "Identification of the default limit.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LimitIdentificationDetails2.mmObject();
		}
	};
	protected LimitIdentificationDetails3 allCurrentLimits;
	/**
	 * Identification of the current limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails3
	 * LimitIdentificationDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2
	 * LimitDetailsStructure2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllCurLmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllCurrentLimits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the current limit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAllCurrentLimits = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> LimitDetailsStructure2.mmObject();
			isDerived = false;
			xmlTag = "AllCurLmts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllCurrentLimits";
			definition = "Identification of the current limit.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LimitIdentificationDetails3.mmObject();
		}
	};
	protected LimitIdentificationDetails3 allDefaultLimits;
	/**
	 * Identification of the default limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails3
	 * LimitIdentificationDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2
	 * LimitDetailsStructure2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllDfltLmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllDefaultLimits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the default limit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAllDefaultLimits = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> LimitDetailsStructure2.mmObject();
			isDerived = false;
			xmlTag = "AllDfltLmts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllDefaultLimits";
			definition = "Identification of the default limit.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LimitIdentificationDetails3.mmObject();
		}
	};
	protected LimitDetails4 newLimitValueSet;
	/**
	 * New limit values.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitDetails4
	 * LimitDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2
	 * LimitDetailsStructure2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewLmtValSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewLimitValueSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New limit values."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewLimitValueSet = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> LimitDetailsStructure2.mmObject();
			isDerived = false;
			xmlTag = "NewLmtValSet";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewLimitValueSet";
			definition = "New limit values.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LimitDetails4.mmObject();
		}
	};
	/**
	 * Each ModifyLimit message can only modify one type of limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmCurrentLimitIdentification
	 * LimitDetailsStructure2.mmCurrentLimitIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmDefaultLimitIdentification
	 * LimitDetailsStructure2.mmDefaultLimitIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmAllCurrentLimits
	 * LimitDetailsStructure2.mmAllCurrentLimits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmAllDefaultLimits
	 * LimitDetailsStructure2.mmAllDefaultLimits}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2
	 * LimitDetailsStructure2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleLimitOrAllLimitsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Each ModifyLimit message can only modify one type of limit."</li>
	 * </ul>
	 */
	public static final MMXor mmSingleLimitOrAllLimitsRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleLimitOrAllLimitsRule";
			definition = "Each ModifyLimit message can only modify one type of limit.";
			messageComponent_lazy = () -> LimitDetailsStructure2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetailsStructure2.mmCurrentLimitIdentification, com.tools20022.repository.msg.LimitDetailsStructure2.mmDefaultLimitIdentification,
					com.tools20022.repository.msg.LimitDetailsStructure2.mmAllCurrentLimits, com.tools20022.repository.msg.LimitDetailsStructure2.mmAllDefaultLimits);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetailsStructure2.mmCurrentLimitIdentification, com.tools20022.repository.msg.LimitDetailsStructure2.mmDefaultLimitIdentification,
						com.tools20022.repository.msg.LimitDetailsStructure2.mmAllCurrentLimits, com.tools20022.repository.msg.LimitDetailsStructure2.mmAllDefaultLimits,
						com.tools20022.repository.msg.LimitDetailsStructure2.mmNewLimitValueSet);
				trace_lazy = () -> RiskManagementLimit.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "LimitDetailsStructure2";
				definition = "Limit details of one particular limit set by the member and managed by the transaction administrator.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetailsStructure2.mmSingleLimitOrAllLimitsRule);
			}
		});
		return mmObject_lazy.get();
	}

	public LimitIdentificationDetails2 getCurrentLimitIdentification() {
		return currentLimitIdentification;
	}

	public void setCurrentLimitIdentification(com.tools20022.repository.msg.LimitIdentificationDetails2 currentLimitIdentification) {
		this.currentLimitIdentification = currentLimitIdentification;
	}

	public LimitIdentificationDetails2 getDefaultLimitIdentification() {
		return defaultLimitIdentification;
	}

	public void setDefaultLimitIdentification(com.tools20022.repository.msg.LimitIdentificationDetails2 defaultLimitIdentification) {
		this.defaultLimitIdentification = defaultLimitIdentification;
	}

	public LimitIdentificationDetails3 getAllCurrentLimits() {
		return allCurrentLimits;
	}

	public void setAllCurrentLimits(com.tools20022.repository.msg.LimitIdentificationDetails3 allCurrentLimits) {
		this.allCurrentLimits = allCurrentLimits;
	}

	public LimitIdentificationDetails3 getAllDefaultLimits() {
		return allDefaultLimits;
	}

	public void setAllDefaultLimits(com.tools20022.repository.msg.LimitIdentificationDetails3 allDefaultLimits) {
		this.allDefaultLimits = allDefaultLimits;
	}

	public LimitDetails4 getNewLimitValueSet() {
		return newLimitValueSet;
	}

	public void setNewLimitValueSet(com.tools20022.repository.msg.LimitDetails4 newLimitValueSet) {
		this.newLimitValueSet = newLimitValueSet;
	}
}
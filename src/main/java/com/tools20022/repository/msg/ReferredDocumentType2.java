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
import com.tools20022.repository.choice.ReferredDocumentType1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.DocumentIssuer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of the document referred in the remittance information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType2#mmCodeOrProprietary
 * ReferredDocumentType2.mmCodeOrProprietary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentType2#mmIssuer
 * ReferredDocumentType2.mmIssuer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
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
 * "ReferredDocumentType2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of the document referred in the remittance information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GarnishmentType1
 * GarnishmentType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentType4
 * ReferredDocumentType4}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ReferredDocumentType2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ReferredDocumentType1Choice codeOrProprietary;
	/**
	 * Provides the type details of the referred document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType1Choice
	 * ReferredDocumentType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType2
	 * ReferredDocumentType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdOrPrtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CodeOrProprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the type details of the referred document."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineType1#mmCodeOrProprietary
	 * DocumentLineType1.mmCodeOrProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GarnishmentType1#mmCodeOrProprietary
	 * GarnishmentType1.mmCodeOrProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType4#mmCodeOrProprietary
	 * ReferredDocumentType4.mmCodeOrProprietary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCodeOrProprietary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> ReferredDocumentType2.mmObject();
			isDerived = false;
			xmlTag = "CdOrPrtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CodeOrProprietary";
			definition = "Provides the type details of the referred document.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentLineType1.mmCodeOrProprietary, com.tools20022.repository.msg.GarnishmentType1.mmCodeOrProprietary,
					com.tools20022.repository.msg.ReferredDocumentType4.mmCodeOrProprietary);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReferredDocumentType1Choice.mmObject();
		}
	};
	protected Max35Text issuer;
	/**
	 * Identification of the issuer of the reference document type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DocumentIssuer
	 * DocumentIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType2
	 * ReferredDocumentType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the issuer of the reference document type."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineType1#mmIssuer
	 * DocumentLineType1.mmIssuer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GarnishmentType1#mmIssuer
	 * GarnishmentType1.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType4#mmIssuer
	 * ReferredDocumentType4.mmIssuer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuer = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> DocumentIssuer.mmObject();
			componentContext_lazy = () -> ReferredDocumentType2.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Identification of the issuer of the reference document type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentLineType1.mmIssuer, com.tools20022.repository.msg.GarnishmentType1.mmIssuer, com.tools20022.repository.msg.ReferredDocumentType4.mmIssuer);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReferredDocumentType2.mmCodeOrProprietary, com.tools20022.repository.msg.ReferredDocumentType2.mmIssuer);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReferredDocumentType2";
				definition = "Specifies the type of the document referred in the remittance information.";
				nextVersions_lazy = () -> Arrays.asList(GarnishmentType1.mmObject(), ReferredDocumentType4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ReferredDocumentType1Choice getCodeOrProprietary() {
		return codeOrProprietary;
	}

	public void setCodeOrProprietary(ReferredDocumentType1Choice codeOrProprietary) {
		this.codeOrProprietary = codeOrProprietary;
	}

	public Max35Text getIssuer() {
		return issuer;
	}

	public void setIssuer(Max35Text issuer) {
		this.issuer = issuer;
	}
}
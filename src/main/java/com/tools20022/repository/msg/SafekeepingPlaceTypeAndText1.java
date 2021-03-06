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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SafekeepingPlace3Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.SafekeepingPlace;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of the place of safekeeping expressed as a code and a
 * narrative description.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1#mmSafekeepingPlaceType
 * SafekeepingPlaceTypeAndText1.mmSafekeepingPlaceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1#mmIdentification
 * SafekeepingPlaceTypeAndText1.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
 * SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SafekeepingPlaceTypeAndText1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of the place of safekeeping expressed as a code and a narrative description."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SafekeepingPlaceTypeAndText1", propOrder = {"safekeepingPlaceType", "identification"})
public class SafekeepingPlaceTypeAndText1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SfkpgPlcTp", required = true)
	protected SafekeepingPlace3Code safekeepingPlaceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlace3Code
	 * SafekeepingPlace3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSafekeepingPlaceType
	 * SafekeepingPlace.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1
	 * SafekeepingPlaceTypeAndText1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of safekeeping as a code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SafekeepingPlaceTypeAndText1, SafekeepingPlace3Code> mmSafekeepingPlaceType = new MMMessageAttribute<SafekeepingPlaceTypeAndText1, SafekeepingPlace3Code>() {
		{
			businessElementTrace_lazy = () -> SafekeepingPlace.mmSafekeepingPlaceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlaceType";
			definition = "Place of safekeeping as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SafekeepingPlace3Code.mmObject();
		}

		@Override
		public SafekeepingPlace3Code getValue(SafekeepingPlaceTypeAndText1 obj) {
			return obj.getSafekeepingPlaceType();
		}

		@Override
		public void setValue(SafekeepingPlaceTypeAndText1 obj, SafekeepingPlace3Code value) {
			obj.setSafekeepingPlaceType(value);
		}
	};
	@XmlElement(name = "Id")
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1
	 * SafekeepingPlaceTypeAndText1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of safekeeping."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SafekeepingPlaceTypeAndText1, Optional<Max35Text>> mmIdentification = new MMMessageAttribute<SafekeepingPlaceTypeAndText1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SafekeepingPlaceTypeAndText1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SafekeepingPlaceTypeAndText1 obj, Optional<Max35Text> value) {
			obj.setIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1.mmSafekeepingPlaceType, com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1.mmIdentification);
				trace_lazy = () -> SafekeepingPlace.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlaceTypeAndText1";
				definition = "Identification of the place of safekeeping expressed as a code and a narrative description.";
			}
		});
		return mmObject_lazy.get();
	}

	public SafekeepingPlace3Code getSafekeepingPlaceType() {
		return safekeepingPlaceType;
	}

	public SafekeepingPlaceTypeAndText1 setSafekeepingPlaceType(SafekeepingPlace3Code safekeepingPlaceType) {
		this.safekeepingPlaceType = Objects.requireNonNull(safekeepingPlaceType);
		return this;
	}

	public Optional<Max35Text> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public SafekeepingPlaceTypeAndText1 setIdentification(Max35Text identification) {
		this.identification = identification;
		return this;
	}
}
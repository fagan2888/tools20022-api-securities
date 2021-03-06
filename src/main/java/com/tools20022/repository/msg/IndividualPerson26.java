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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.LongPostalAddress2Choice;
import com.tools20022.repository.choice.PartyIdentification40Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AttendanceCard2;
import com.tools20022.repository.msg.PersonIdentification6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Human entity, as distinguished from a corporate entity (which is sometimes
 * referred to as an 'artificial person').
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson26#mmBirthName
 * IndividualPerson26.mmBirthName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson26#mmGivenName
 * IndividualPerson26.mmGivenName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson26#mmIdentification
 * IndividualPerson26.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson26#mmAddress
 * IndividualPerson26.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson26#mmEmployingParty
 * IndividualPerson26.mmEmployingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson26#mmAttendanceCardDetails
 * IndividualPerson26.mmAttendanceCardDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
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
 * "IndividualPerson26"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndividualPerson26", propOrder = {"birthName", "givenName", "identification", "address", "employingParty", "attendanceCardDetails"})
public class IndividualPerson26 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BirthNm", required = true)
	protected Max35Text birthName;
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmBirthName
	 * PersonName.mmBirthName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson26
	 * IndividualPerson26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BirthNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BirthName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name received at birth, for example, maiden name."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson26, Max35Text> mmBirthName = new MMMessageAttribute<IndividualPerson26, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmBirthName;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson26.mmObject();
			isDerived = false;
			xmlTag = "BirthNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BirthName";
			definition = "Name received at birth, for example, maiden name.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IndividualPerson26 obj) {
			return obj.getBirthName();
		}

		@Override
		public void setValue(IndividualPerson26 obj, Max35Text value) {
			obj.setBirthName(value);
		}
	};
	@XmlElement(name = "GvnNm")
	protected Max35Text givenName;
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
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmGivenName
	 * PersonName.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson26
	 * IndividualPerson26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GvnNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GivenName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First name of the person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson26, Optional<Max35Text>> mmGivenName = new MMMessageAttribute<IndividualPerson26, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmGivenName;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson26.mmObject();
			isDerived = false;
			xmlTag = "GvnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GivenName";
			definition = "First name of the person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualPerson26 obj) {
			return obj.getGivenName();
		}

		@Override
		public void setValue(IndividualPerson26 obj, Optional<Max35Text> value) {
			obj.setGivenName(value.orElse(null));
		}
	};
	@XmlElement(name = "Id")
	protected PersonIdentification6 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PersonIdentification6
	 * PersonIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
	 * Person.mmPersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson26
	 * IndividualPerson26}</li>
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
	 * definition} =
	 * "Unique and unambiguous identification of the person, for example, passport."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualPerson26, Optional<PersonIdentification6>> mmIdentification = new MMMessageAssociationEnd<IndividualPerson26, Optional<PersonIdentification6>>() {
		{
			businessElementTrace_lazy = () -> Person.mmPersonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson26.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of the person, for example, passport.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PersonIdentification6.mmObject();
		}

		@Override
		public Optional<PersonIdentification6> getValue(IndividualPerson26 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(IndividualPerson26 obj, Optional<PersonIdentification6> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Adr")
	protected LongPostalAddress2Choice address;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LongPostalAddress2Choice
	 * LongPostalAddress2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson26
	 * IndividualPerson26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Adr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Address"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal address of the party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualPerson26, Optional<LongPostalAddress2Choice>> mmAddress = new MMMessageAssociationEnd<IndividualPerson26, Optional<LongPostalAddress2Choice>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson26.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Postal address of the party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LongPostalAddress2Choice.mmObject();
		}

		@Override
		public Optional<LongPostalAddress2Choice> getValue(IndividualPerson26 obj) {
			return obj.getAddress();
		}

		@Override
		public void setValue(IndividualPerson26 obj, Optional<LongPostalAddress2Choice> value) {
			obj.setAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "EmplngPty")
	protected PartyIdentification40Choice employingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.EmployingPartyRole
	 * EmployingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson26
	 * IndividualPerson26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EmplngPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organisation represented by the person, or for which the person works."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualPerson26, Optional<PartyIdentification40Choice>> mmEmployingParty = new MMMessageAssociationEnd<IndividualPerson26, Optional<PartyIdentification40Choice>>() {
		{
			businessComponentTrace_lazy = () -> EmployingPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson26.mmObject();
			isDerived = false;
			xmlTag = "EmplngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployingParty";
			definition = "Organisation represented by the person, or for which the person works.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification40Choice> getValue(IndividualPerson26 obj) {
			return obj.getEmployingParty();
		}

		@Override
		public void setValue(IndividualPerson26 obj, Optional<PartyIdentification40Choice> value) {
			obj.setEmployingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndncCardDtls", required = true)
	protected AttendanceCard2 attendanceCardDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AttendanceCard2
	 * AttendanceCard2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingAttendance#mmAttendanceCard
	 * MeetingAttendance.mmAttendanceCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson26
	 * IndividualPerson26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncCardDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceCardDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies details related to the attendance card."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualPerson26, AttendanceCard2> mmAttendanceCardDetails = new MMMessageAssociationEnd<IndividualPerson26, AttendanceCard2>() {
		{
			businessElementTrace_lazy = () -> MeetingAttendance.mmAttendanceCard;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson26.mmObject();
			isDerived = false;
			xmlTag = "AttndncCardDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceCardDetails";
			definition = "Specifies details related to the attendance card.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AttendanceCard2.mmObject();
		}

		@Override
		public AttendanceCard2 getValue(IndividualPerson26 obj) {
			return obj.getAttendanceCardDetails();
		}

		@Override
		public void setValue(IndividualPerson26 obj, AttendanceCard2 value) {
			obj.setAttendanceCardDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson26.mmBirthName, com.tools20022.repository.msg.IndividualPerson26.mmGivenName,
						com.tools20022.repository.msg.IndividualPerson26.mmIdentification, com.tools20022.repository.msg.IndividualPerson26.mmAddress, com.tools20022.repository.msg.IndividualPerson26.mmEmployingParty,
						com.tools20022.repository.msg.IndividualPerson26.mmAttendanceCardDetails);
				trace_lazy = () -> Person.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndividualPerson26";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getBirthName() {
		return birthName;
	}

	public IndividualPerson26 setBirthName(Max35Text birthName) {
		this.birthName = Objects.requireNonNull(birthName);
		return this;
	}

	public Optional<Max35Text> getGivenName() {
		return givenName == null ? Optional.empty() : Optional.of(givenName);
	}

	public IndividualPerson26 setGivenName(Max35Text givenName) {
		this.givenName = givenName;
		return this;
	}

	public Optional<PersonIdentification6> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public IndividualPerson26 setIdentification(PersonIdentification6 identification) {
		this.identification = identification;
		return this;
	}

	public Optional<LongPostalAddress2Choice> getAddress() {
		return address == null ? Optional.empty() : Optional.of(address);
	}

	public IndividualPerson26 setAddress(LongPostalAddress2Choice address) {
		this.address = address;
		return this;
	}

	public Optional<PartyIdentification40Choice> getEmployingParty() {
		return employingParty == null ? Optional.empty() : Optional.of(employingParty);
	}

	public IndividualPerson26 setEmployingParty(PartyIdentification40Choice employingParty) {
		this.employingParty = employingParty;
		return this;
	}

	public AttendanceCard2 getAttendanceCardDetails() {
		return attendanceCardDetails;
	}

	public IndividualPerson26 setAttendanceCardDetails(AttendanceCard2 attendanceCardDetails) {
		this.attendanceCardDetails = Objects.requireNonNull(attendanceCardDetails);
		return this;
	}
}
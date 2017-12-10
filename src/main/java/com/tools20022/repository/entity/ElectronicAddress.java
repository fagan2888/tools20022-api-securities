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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Address which is accessed by electronic means.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ElectronicAddress" src="doc-files/ElectronicAddress.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ContactPoint
 * ContactPoint}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmEmailAddress
 * ElectronicAddress.mmEmailAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmURLAddress
 * ElectronicAddress.mmURLAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmTelexAddress
 * ElectronicAddress.mmTelexAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmRelatedPresentation
 * ElectronicAddress.mmRelatedPresentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmTeletextAddress
 * ElectronicAddress.mmTeletextAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmISDNAddress
 * ElectronicAddress.mmISDNAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmElectronicPresentationAddress
 * Presentation.mmElectronicPresentationAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.VoteMethods2#mmElectronicVote
 * VoteMethods2.mmElectronicVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVotingBallotElectronicAddress
 * VoteParameters4.mmVotingBallotElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary36#mmPrimaryCommunicationAddress
 * Intermediary36.mmPrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary36#mmSecondaryCommunicationAddress
 * Intermediary36.mmSecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmPrimaryCommunicationAddress
 * InvestmentAccountOwnershipInformation15.mmPrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmSecondaryCommunicationAddress
 * InvestmentAccountOwnershipInformation15.mmSecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmPrimaryCommunicationAddress
 * InvestmentAccountOwnershipInformation14.mmPrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmSecondaryCommunicationAddress
 * InvestmentAccountOwnershipInformation14.mmSecondaryCommunicationAddress}</li>
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
 * "ElectronicAddress"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Address which is accessed by electronic means."</li>
 * </ul>
 */
public class ElectronicAddress extends ContactPoint {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max256Text emailAddress;
	/**
	 * Address for electronic mail (e-mail).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactAttributes1#mmEmailAddress
	 * ContactAttributes1.mmEmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactDetails2#mmEmailAddress
	 * ContactDetails2.mmEmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification2#mmEmailAddress
	 * ContactIdentification2.mmEmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1#mmEmailAddress
	 * ContactIdentification1.mmEmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress4#mmEmailAddress
	 * CommunicationAddress4.mmEmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification4#mmEmailAddress
	 * ContactIdentification4.mmEmailAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6#mmEmail
	 * CommunicationAddress6.mmEmail}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmailAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for electronic mail (e-mail)."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEmailAddress = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ContactAttributes1.mmEmailAddress, ContactDetails2.mmEmailAddress, ContactIdentification2.mmEmailAddress, ContactIdentification1.mmEmailAddress, CommunicationAddress4.mmEmailAddress,
					ContactIdentification4.mmEmailAddress, CommunicationAddress6.mmEmail);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmailAddress";
			definition = "Address for electronic mail (e-mail).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ElectronicAddress.class.getMethod("getEmailAddress", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max256Text uRLAddress;
	/**
	 * Address for the Universal Resource Locator (URL), eg, used over the www
	 * (HTTP) service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactAttributes1#mmURLAddress
	 * ContactAttributes1.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress4#mmURLAddress
	 * CommunicationAddress4.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative1#mmURLAddress
	 * CorporateActionNarrative1.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IssuerInformation2#mmURLAddress
	 * IssuerInformation2.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAdditionalDocumentationURLAddress
	 * MeetingNotice4.mmAdditionalDocumentationURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRightInformationURLAddress
	 * AdditionalRights2.mmAdditionalRightInformationURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6#mmURLAddress
	 * CommunicationAddress6.mmURLAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "URLAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmURLAddress = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ContactAttributes1.mmURLAddress, CommunicationAddress4.mmURLAddress, CorporateActionNarrative1.mmURLAddress, IssuerInformation2.mmURLAddress,
					MeetingNotice4.mmAdditionalDocumentationURLAddress, AdditionalRights2.mmAdditionalRightInformationURLAddress, CommunicationAddress6.mmURLAddress);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "URLAddress";
			definition = "Address for the Universal Resource Locator (URL), eg, used over the www (HTTP) service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ElectronicAddress.class.getMethod("getURLAddress", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text telexAddress;
	/**
	 * Address for a telex machine.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress6#mmTelexAddress
	 * CommunicationAddress6.mmTelexAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelexAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for a telex machine."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTelexAddress = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CommunicationAddress6.mmTelexAddress);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TelexAddress";
			definition = "Address for a telex machine.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ElectronicAddress.class.getMethod("getTelexAddress", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Presentation relatedPresentation;
	/**
	 * Presentation process for which an electronic presentation address is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmElectronicPresentationAddress
	 * Presentation.mmElectronicPresentationAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Presentation
	 * Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPresentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Presentation process for which an electronic presentation address is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPresentation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPresentation";
			definition = "Presentation process for which an electronic presentation address is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Presentation.mmElectronicPresentationAddress;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
		}
	};
	protected Max35Text teletextAddress;
	/**
	 * Address for a teletext.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TeletextAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for a teletext."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTeletextAddress = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TeletextAddress";
			definition = "Address for a teletext.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ElectronicAddress.class.getMethod("getTeletextAddress", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text iSDNAddress;
	/**
	 * Address for an Integrated Services Digital Network.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISDNAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for an Integrated Services Digital Network."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmISDNAddress = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ISDNAddress";
			definition = "Address for an Integrated Services Digital Network.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ElectronicAddress.class.getMethod("getISDNAddress", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ElectronicAddress";
				definition = "Address which is accessed by electronic means.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Presentation.mmElectronicPresentationAddress);
				derivationElement_lazy = () -> Arrays.asList(VoteMethods2.mmElectronicVote, VoteParameters4.mmVotingBallotElectronicAddress, Intermediary36.mmPrimaryCommunicationAddress, Intermediary36.mmSecondaryCommunicationAddress,
						InvestmentAccountOwnershipInformation15.mmPrimaryCommunicationAddress, InvestmentAccountOwnershipInformation15.mmSecondaryCommunicationAddress, InvestmentAccountOwnershipInformation14.mmPrimaryCommunicationAddress,
						InvestmentAccountOwnershipInformation14.mmSecondaryCommunicationAddress);
				superType_lazy = () -> ContactPoint.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ElectronicAddress.mmEmailAddress, com.tools20022.repository.entity.ElectronicAddress.mmURLAddress,
						com.tools20022.repository.entity.ElectronicAddress.mmTelexAddress, com.tools20022.repository.entity.ElectronicAddress.mmRelatedPresentation, com.tools20022.repository.entity.ElectronicAddress.mmTeletextAddress,
						com.tools20022.repository.entity.ElectronicAddress.mmISDNAddress);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ElectronicAddress.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max256Text getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(Max256Text emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Max256Text getURLAddress() {
		return uRLAddress;
	}

	public void setURLAddress(Max256Text uRLAddress) {
		this.uRLAddress = uRLAddress;
	}

	public Max35Text getTelexAddress() {
		return telexAddress;
	}

	public void setTelexAddress(Max35Text telexAddress) {
		this.telexAddress = telexAddress;
	}

	public Presentation getRelatedPresentation() {
		return relatedPresentation;
	}

	public void setRelatedPresentation(com.tools20022.repository.entity.Presentation relatedPresentation) {
		this.relatedPresentation = relatedPresentation;
	}

	public Max35Text getTeletextAddress() {
		return teletextAddress;
	}

	public void setTeletextAddress(Max35Text teletextAddress) {
		this.teletextAddress = teletextAddress;
	}

	public Max35Text getISDNAddress() {
		return iSDNAddress;
	}

	public void setISDNAddress(Max35Text iSDNAddress) {
		this.iSDNAddress = iSDNAddress;
	}
}
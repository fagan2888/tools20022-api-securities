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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.FATCAFormTypeCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.AccountPartyRole;
import com.tools20022.repository.entity.CRSStatus;
import com.tools20022.repository.entity.FATCAStatus;
import com.tools20022.repository.entity.InvestmentAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Specifies roles played by a party that are related to an investment account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentAccountPartyRole"
 * src="doc-files/InvestmentAccountPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountPartyRole
 * AccountPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmOwnershipBeneficiaryRate
 * InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmInvestmentAccount
 * InvestmentAccountPartyRole.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAFormType
 * InvestmentAccountPartyRole.mmFATCAFormType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAStatus
 * InvestmentAccountPartyRole.mmFATCAStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmCRSStatus
 * InvestmentAccountPartyRole.mmCRSStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountPartyRole
 * InvestmentAccount.mmInvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmInvestmentAccountParty
 * FATCAStatus.mmInvestmentAccountParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmInvestmentAccountParty
 * CRSStatus.mmInvestmentAccountParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmPrincipalAccountParty
 * AccountParties15.mmPrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#mmOtherParty
 * AccountParties15.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmPrincipalAccountParty
 * AccountParties16.mmPrincipalAccountParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#mmOtherParty
 * AccountParties16.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty12#mmExtendedPartyRole
 * ExtendedParty12.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty12#mmOtherPartyDetails
 * ExtendedParty12.mmOtherPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty11#mmExtendedPartyRole
 * ExtendedParty11.mmExtendedPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtendedParty11#mmOtherPartyDetails
 * ExtendedParty11.mmOtherPartyDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PrimaryOwner PrimaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TrusteeRole TrusteeRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CustodianForMinor
 * CustodianForMinor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Nominee Nominee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.JointOwner JointOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecondaryOwner
 * SecondaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LegalGuardianRole
 * LegalGuardianRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SuccessorOnDeath
 * SuccessorOnDeath}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AdministratorRole
 * AdministratorRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Investor Investor}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.MoneyLaunderingCheck1Choice
 * MoneyLaunderingCheck1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.FATCAForm1Choice
 * FATCAForm1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15
 * AccountParties15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16
 * AccountParties16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
 * InvestmentAccountOwnershipInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties11Choice
 * AccountParties11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty12
 * ExtendedParty12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CRSForm1Choice
 * CRSForm1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties10Choice
 * AccountParties10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
 * InvestmentAccountOwnershipInformation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExtendedParty11
 * ExtendedParty11}</li>
 * </ul>
 * </li>
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
 * "InvestmentAccountPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies roles played by a party that are related to an investment account."
 * </li>
 * </ul>
 */
public class InvestmentAccountPartyRole extends AccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate ownershipBeneficiaryRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation15.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation14.mmOwnershipBeneficiaryRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipBeneficiaryRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InvestmentAccountPartyRole, PercentageRate> mmOwnershipBeneficiaryRate = new MMBusinessAttribute<InvestmentAccountPartyRole, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmOwnershipBeneficiaryRate, InvestmentAccountOwnershipInformation14.mmOwnershipBeneficiaryRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OwnershipBeneficiaryRate";
			definition = "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(InvestmentAccountPartyRole obj) {
			return obj.getOwnershipBeneficiaryRate();
		}

		@Override
		public void setValue(InvestmentAccountPartyRole obj, PercentageRate value) {
			obj.setOwnershipBeneficiaryRate(value);
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountPartyRole
	 * InvestmentAccount.mmInvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account for which the party plays a role. It is derived from the association between AccountPartyRole and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestmentAccountPartyRole, List<InvestmentAccount>> mmInvestmentAccount = new MMBusinessAssociationEnd<InvestmentAccountPartyRole, List<InvestmentAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccount";
			definition = "Specifies the account for which the party plays a role. It is derived from the association between AccountPartyRole and Account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}

		@Override
		public List<InvestmentAccount> getValue(InvestmentAccountPartyRole obj) {
			return obj.getInvestmentAccount();
		}

		@Override
		public void setValue(InvestmentAccountPartyRole obj, List<InvestmentAccount> value) {
			obj.setInvestmentAccount(value);
		}
	};
	protected FATCAFormTypeCode fATCAFormType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.FATCAForm1Choice#mmCode
	 * FATCAForm1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation15.mmFATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmCRSFormType
	 * InvestmentAccountOwnershipInformation15.mmCRSFormType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.CRSForm1Choice#mmCode
	 * CRSForm1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation14.mmFATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmCRSFormType
	 * InvestmentAccountOwnershipInformation14.mmCRSFormType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAFormType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InvestmentAccountPartyRole, FATCAFormTypeCode> mmFATCAFormType = new MMBusinessAttribute<InvestmentAccountPartyRole, FATCAFormTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FATCAForm1Choice.mmCode, InvestmentAccountOwnershipInformation15.mmFATCAFormType, InvestmentAccountOwnershipInformation15.mmCRSFormType, CRSForm1Choice.mmCode,
					InvestmentAccountOwnershipInformation14.mmFATCAFormType, InvestmentAccountOwnershipInformation14.mmCRSFormType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FATCAFormType";
			definition = "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FATCAFormTypeCode.mmObject();
		}

		@Override
		public FATCAFormTypeCode getValue(InvestmentAccountPartyRole obj) {
			return obj.getFATCAFormType();
		}

		@Override
		public void setValue(InvestmentAccountPartyRole obj, FATCAFormTypeCode value) {
			obj.setFATCAFormType(value);
		}
	};
	protected List<com.tools20022.repository.entity.FATCAStatus> fATCAStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmInvestmentAccountParty
	 * FATCAStatus.mmInvestmentAccountParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FATCAStatus
	 * FATCAStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation15.mmFATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation14.mmFATCAStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign Account Tax Compliance Act (FATCA) status of the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestmentAccountPartyRole, List<FATCAStatus>> mmFATCAStatus = new MMBusinessAssociationEnd<InvestmentAccountPartyRole, List<FATCAStatus>>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmFATCAStatus, InvestmentAccountOwnershipInformation14.mmFATCAStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FATCAStatus";
			definition = "Foreign Account Tax Compliance Act (FATCA) status of the investor.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmInvestmentAccountParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FATCAStatus.mmObject();
		}

		@Override
		public List<FATCAStatus> getValue(InvestmentAccountPartyRole obj) {
			return obj.getFATCAStatus();
		}

		@Override
		public void setValue(InvestmentAccountPartyRole obj, List<FATCAStatus> value) {
			obj.setFATCAStatus(value);
		}
	};
	protected CRSStatus cRSStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmInvestmentAccountParty
	 * CRSStatus.mmInvestmentAccountParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CRSStatus CRSStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmCRSStatus
	 * InvestmentAccountOwnershipInformation15.mmCRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmCRSStatus
	 * InvestmentAccountOwnershipInformation14.mmCRSStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRSStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common Reporting Standard (CRS) status of the investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InvestmentAccountPartyRole, com.tools20022.repository.entity.CRSStatus> mmCRSStatus = new MMBusinessAssociationEnd<InvestmentAccountPartyRole, com.tools20022.repository.entity.CRSStatus>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmCRSStatus, InvestmentAccountOwnershipInformation14.mmCRSStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CRSStatus";
			definition = "Common Reporting Standard (CRS) status of the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmInvestmentAccountParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CRSStatus.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.CRSStatus getValue(InvestmentAccountPartyRole obj) {
			return obj.getCRSStatus();
		}

		@Override
		public void setValue(InvestmentAccountPartyRole obj, com.tools20022.repository.entity.CRSStatus value) {
			obj.setCRSStatus(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountPartyRole";
				definition = "Specifies roles played by a party that are related to an investment account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.mmInvestmentAccountPartyRole, com.tools20022.repository.entity.FATCAStatus.mmInvestmentAccountParty,
						com.tools20022.repository.entity.CRSStatus.mmInvestmentAccountParty);
				derivationElement_lazy = () -> Arrays.asList(AccountParties15.mmPrincipalAccountParty, AccountParties15.mmOtherParty, AccountParties16.mmPrincipalAccountParty, AccountParties16.mmOtherParty,
						ExtendedParty12.mmExtendedPartyRole, ExtendedParty12.mmOtherPartyDetails, ExtendedParty11.mmExtendedPartyRole, ExtendedParty11.mmOtherPartyDetails);
				subType_lazy = () -> Arrays.asList(PrimaryOwner.mmObject(), TrusteeRole.mmObject(), CustodianForMinor.mmObject(), Nominee.mmObject(), JointOwner.mmObject(), SecondaryOwner.mmObject(), LegalGuardianRole.mmObject(),
						SuccessorOnDeath.mmObject(), AdministratorRole.mmObject(), Investor.mmObject());
				superType_lazy = () -> AccountPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate, com.tools20022.repository.entity.InvestmentAccountPartyRole.mmInvestmentAccount,
						com.tools20022.repository.entity.InvestmentAccountPartyRole.mmFATCAFormType, com.tools20022.repository.entity.InvestmentAccountPartyRole.mmFATCAStatus,
						com.tools20022.repository.entity.InvestmentAccountPartyRole.mmCRSStatus);
				derivationComponent_lazy = () -> Arrays.asList(MoneyLaunderingCheck1Choice.mmObject(), FATCAForm1Choice.mmObject(), AccountParties15.mmObject(), AccountParties16.mmObject(),
						InvestmentAccountOwnershipInformation15.mmObject(), AccountParties11Choice.mmObject(), ExtendedParty12.mmObject(), CRSForm1Choice.mmObject(), AccountParties10Choice.mmObject(),
						InvestmentAccountOwnershipInformation14.mmObject(), ExtendedParty11.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentAccountPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getOwnershipBeneficiaryRate() {
		return ownershipBeneficiaryRate;
	}

	public InvestmentAccountPartyRole setOwnershipBeneficiaryRate(PercentageRate ownershipBeneficiaryRate) {
		this.ownershipBeneficiaryRate = Objects.requireNonNull(ownershipBeneficiaryRate);
		return this;
	}

	public List<InvestmentAccount> getInvestmentAccount() {
		return investmentAccount == null ? investmentAccount = new ArrayList<>() : investmentAccount;
	}

	public InvestmentAccountPartyRole setInvestmentAccount(List<com.tools20022.repository.entity.InvestmentAccount> investmentAccount) {
		this.investmentAccount = Objects.requireNonNull(investmentAccount);
		return this;
	}

	public FATCAFormTypeCode getFATCAFormType() {
		return fATCAFormType;
	}

	public InvestmentAccountPartyRole setFATCAFormType(FATCAFormTypeCode fATCAFormType) {
		this.fATCAFormType = Objects.requireNonNull(fATCAFormType);
		return this;
	}

	public List<FATCAStatus> getFATCAStatus() {
		return fATCAStatus == null ? fATCAStatus = new ArrayList<>() : fATCAStatus;
	}

	public InvestmentAccountPartyRole setFATCAStatus(List<com.tools20022.repository.entity.FATCAStatus> fATCAStatus) {
		this.fATCAStatus = Objects.requireNonNull(fATCAStatus);
		return this;
	}

	public CRSStatus getCRSStatus() {
		return cRSStatus;
	}

	public InvestmentAccountPartyRole setCRSStatus(com.tools20022.repository.entity.CRSStatus cRSStatus) {
		this.cRSStatus = Objects.requireNonNull(cRSStatus);
		return this;
	}
}
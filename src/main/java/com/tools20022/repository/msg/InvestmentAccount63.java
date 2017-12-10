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
import com.tools20022.repository.area.acmt.AccountModificationInstructionV07;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a securities account and its characteristics.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmAccountStatusUpdateInstruction
 * InvestmentAccount63.mmAccountStatusUpdateInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmName
 * InvestmentAccount63.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmDesignation
 * InvestmentAccount63.mmDesignation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmType
 * InvestmentAccount63.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmOwnershipType
 * InvestmentAccount63.mmOwnershipType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmTaxExemption
 * InvestmentAccount63.mmTaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmStatementFrequency
 * InvestmentAccount63.mmStatementFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmReferenceCurrency
 * InvestmentAccount63.mmReferenceCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmLanguage
 * InvestmentAccount63.mmLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmIncomePreference
 * InvestmentAccount63.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmReinvestmentDetails
 * InvestmentAccount63.mmReinvestmentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmTaxWithholdingMethod
 * InvestmentAccount63.mmTaxWithholdingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmTaxReporting
 * InvestmentAccount63.mmTaxReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmLetterIntentDetails
 * InvestmentAccount63.mmLetterIntentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmAccumulationRightReference
 * InvestmentAccount63.mmAccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmRequiredSignatoriesNumber
 * InvestmentAccount63.mmRequiredSignatoriesNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmFundFamilyName
 * InvestmentAccount63.mmFundFamilyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmModifiedFinancialInstrumentDetails
 * InvestmentAccount63.mmModifiedFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmRoundingDetails
 * InvestmentAccount63.mmRoundingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmAccountServicer
 * InvestmentAccount63.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmBlockedStatus
 * InvestmentAccount63.mmBlockedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmAccountUsageType
 * InvestmentAccount63.mmAccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmForeignStatusCertification
 * InvestmentAccount63.mmForeignStatusCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmAccountSignatureDateTime
 * InvestmentAccount63.mmAccountSignatureDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmTransactionChannelType
 * InvestmentAccount63.mmTransactionChannelType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmInvestmentAccountCategory
 * InvestmentAccount63.mmInvestmentAccountCategory}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmPledging
 * InvestmentAccount63.mmPledging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmCollateral
 * InvestmentAccount63.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmThirdPartyRights
 * InvestmentAccount63.mmThirdPartyRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmPowerOfAttorneyLevelOfControl
 * InvestmentAccount63.mmPowerOfAttorneyLevelOfControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmAccountingStatus
 * InvestmentAccount63.mmAccountingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmOpeningDate
 * InvestmentAccount63.mmOpeningDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmClosingDate
 * InvestmentAccount63.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmNegativeIndicator
 * InvestmentAccount63.mmNegativeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmProcessingOrder
 * InvestmentAccount63.mmProcessingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmLiability
 * InvestmentAccount63.mmLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmModifiedInvestorProfile
 * InvestmentAccount63.mmModifiedInvestorProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmFiscalYear
 * InvestmentAccount63.mmFiscalYear}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedInvestmentAccount
 * AccountModificationInstructionV07.mmModifiedInvestmentAccount}</li>
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
 * "InvestmentAccount63"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about a securities account and its characteristics."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InvestmentAccount63", propOrder = {"accountStatusUpdateInstruction", "name", "designation", "type", "ownershipType", "taxExemption", "statementFrequency", "referenceCurrency", "language", "incomePreference",
		"reinvestmentDetails", "taxWithholdingMethod", "taxReporting", "letterIntentDetails", "accumulationRightReference", "requiredSignatoriesNumber", "fundFamilyName", "modifiedFinancialInstrumentDetails", "roundingDetails",
		"accountServicer", "blockedStatus", "accountUsageType", "foreignStatusCertification", "accountSignatureDateTime", "transactionChannelType", "investmentAccountCategory", "pledging", "collateral", "thirdPartyRights",
		"powerOfAttorneyLevelOfControl", "accountingStatus", "openingDate", "closingDate", "negativeIndicator", "processingOrder", "liability", "modifiedInvestorProfile", "fiscalYear"})
public class InvestmentAccount63 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountStatusUpdateInstruction1 accountStatusUpdateInstruction;
	/**
	 * Change of account status is instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatusUpdateInstruction1
	 * AccountStatusUpdateInstruction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctStsUpdInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountStatusUpdateInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change of account status is instructed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountStatusUpdateInstruction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "AcctStsUpdInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountStatusUpdateInstruction";
			definition = "Change of account status is instructed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountStatusUpdateInstruction1.mmObject();
		}
	};
	protected Max35Text name;
	/**
	 * Name of the account. It provides an additional means of identification,
	 * and is designated by the account servicer in agreement with the account
	 * owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text designation;
	/**
	 * Supplementary registration information applying to a specific block of
	 * units for dealing and reporting purposes. The supplementary registration
	 * information may be used when all the units are registered, for example,
	 * to a funds supermarket, but holdings for each investor have to reconciled
	 * individually.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDesignation
	 * InvestmentAccount.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dsgnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Designation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDesignation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmDesignation;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "Dsgnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Designation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AccountType2Choice type;
	/**
	 * Type of account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountType2Choice
	 * AccountType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccount.mmObject();
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountType2Choice.mmObject();
		}
	};
	protected OwnershipType2Choice ownershipType;
	/**
	 * Ownership status of the account, for example, joint owners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OwnershipType2Choice
	 * OwnershipType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmOwnershipType
	 * InvestmentAccount.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnrshTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership status of the account, for example, joint owners."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnershipType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmOwnershipType;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "OwnrshTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnershipType";
			definition = "Ownership status of the account, for example, joint owners.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OwnershipType2Choice.mmObject();
		}
	};
	protected TaxExemptionReason2Choice taxExemption;
	/**
	 * Tax advantage specific to the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReason2Choice
	 * TaxExemptionReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTax
	 * InvestmentAccount.mmInvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxXmptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax advantage specific to the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxExemption = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentFundTax;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "TaxXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemption";
			definition = "Tax advantage specific to the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxExemptionReason2Choice.mmObject();
		}
	};
	protected StatementFrequencyReason2Choice statementFrequency;
	/**
	 * Frequency at which a statement is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementFrequencyReason2Choice
	 * StatementFrequencyReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
	 * ReportingService.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency at which a statement is issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "StmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementFrequency";
			definition = "Frequency at which a statement is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementFrequencyReason2Choice.mmObject();
		}
	};
	protected ActiveCurrencyCode referenceCurrency;
	/**
	 * Currency chosen for reporting purposes by the account owner in agreement
	 * with the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmReferenceCurrency
	 * InvestmentAccount.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency chosen for reporting purposes by the account owner in agreement with the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmReferenceCurrency;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "RefCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceCurrency";
			definition = "Currency chosen for reporting purposes by the account owner in agreement with the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected LanguageCode language;
	/**
	 * Language for all communication concerning the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmLanguage
	 * Account.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lang"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language for all communication concerning the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLanguage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmLanguage;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "Lang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Language";
			definition = "Language for all communication concerning the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	protected IncomePreference2Code incomePreference;
	/**
	 * Dividend option chosen by the account owner based on the options offered
	 * in the prospectus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference2Code
	 * IncomePreference2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomePreference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference2Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Reinvestment3> reinvestmentDetails;
	/**
	 * Specifies, for income on the fund or security that is to be reinvested,
	 * parameters for the reinvestment. If the reinvestment percentage is less
	 * than one hundred percent, the remaining percentage will be invested
	 * according to the investor’s or account owner's subsequent instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Reinvestment3
	 * Reinvestment3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReinvestment
	 * InvestmentAccountService.mmReinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies, for income on the fund or security that is to be reinvested, parameters for the reinvestment. If the reinvestment percentage is less than one hundred percent, the remaining percentage will be invested according to the investor’s or account owner's subsequent instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReinvestmentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmReinvestment;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentDetails";
			definition = "Specifies, for income on the fund or security that is to be reinvested, parameters for the reinvestment. If the reinvestment percentage is less than one hundred percent, the remaining percentage will be invested according to the investor’s or account owner's subsequent instructions.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Reinvestment3.mmObject();
		}
	};
	protected TaxWithholdingMethod3Code taxWithholdingMethod;
	/**
	 * Method by which the tax (withholding tax) is to be processed, that is,
	 * either withheld at source or tax information is reported to tax
	 * authorities or tax information is reported due to the provision of a tax
	 * certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code
	 * TaxWithholdingMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmTaxWithholdingMethod
	 * InvestmentAccountService.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxWhldgMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxWithholdingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method by which the tax (withholding tax) is to be processed, that is,  either withheld at source or tax information is reported to tax authorities or tax information is reported due to the provision of a tax certificate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxWithholdingMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmTaxWithholdingMethod;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "TaxWhldgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxWithholdingMethod";
			definition = "Method by which the tax (withholding tax) is to be processed, that is,  either withheld at source or tax information is reported to tax authorities or tax information is reported due to the provision of a tax certificate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxWithholdingMethod3Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TaxReporting2> taxReporting;
	/**
	 * Details for the reporting of tax, for example, the country of taxation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxReporting2
	 * TaxReporting2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole#mmTax
	 * TaxPartyRole.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details for the reporting of tax, for example, the country of taxation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxReporting = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TaxPartyRole.mmTax;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "TaxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReporting";
			definition = "Details for the reporting of tax, for example, the country of taxation.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxReporting2.mmObject();
		}
	};
	protected LetterIntent1 letterIntentDetails;
	/**
	 * Details of the letter of intent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.LetterIntent1
	 * LetterIntent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmLetterIntentReference
	 * InvestmentAccountContract.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrInttDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterIntentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the letter of intent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLetterIntentDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountContract.mmLetterIntentReference;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "LttrInttDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterIntentDetails";
			definition = "Details of the letter of intent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.LetterIntent1.mmObject();
		}
	};
	protected Max35Text accumulationRightReference;
	/**
	 * Reference of an accumulation rights program, in which sales commissions
	 * are based on a customer's present purchases of shares and the aggregate
	 * quantity previously purchased by the customer. An accumulation rights
	 * program is mainly used in the US market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmAccumulationRightReference
	 * InvestmentAccountContract.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcmltnRghtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulationRightReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of an accumulation rights program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccumulationRightReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountContract.mmAccumulationRightReference;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "AcmltnRghtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulationRightReference";
			definition = "Reference of an accumulation rights program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Number requiredSignatoriesNumber;
	/**
	 * Number of account owners or related parties required to authorise
	 * transactions on the account.
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
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmRequiredSignatureNumber
	 * SignatureCondition.mmRequiredSignatureNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqrdSgntriesNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredSignatoriesNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of account owners or related parties required to authorise transactions on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequiredSignatoriesNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmRequiredSignatureNumber;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "ReqrdSgntriesNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredSignatoriesNumber";
			definition = "Number of account owners or related parties required to authorise transactions on the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max350Text fundFamilyName;
	/**
	 * Name of the investment fund family.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily#mmFundFamilyName
	 * InvestmentFundFamily.mmFundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndFmlyNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundFamilyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the investment fund family."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFundFamilyName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundFamily.mmFundFamilyName;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "FndFmlyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundFamilyName";
			definition = "Name of the investment fund family.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ModificationScope36> modifiedFinancialInstrumentDetails;
	/**
	 * Detailed information about the financial instrument associated to the
	 * account that is to be modified or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ModificationScope36
	 * ModificationScope36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
	 * InvestmentAccount.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdFinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedFinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information about the financial instrument associated to the account that is to be modified or deleted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModifiedFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentFundClass;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "ModfdFinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedFinancialInstrumentDetails";
			definition = "Detailed information about the financial instrument associated to the account that is to be modified or deleted.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ModificationScope36.mmObject();
		}
	};
	protected RoundingParameters1 roundingDetails;
	/**
	 * Parameters to be applied on deal amount for orders when the amount is a
	 * fractional number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RoundingParameters1
	 * RoundingParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmRoundingMethod
	 * InvestmentAccountService.mmRoundingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters to be applied on deal amount for orders when the amount is a fractional number."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRoundingDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmRoundingMethod;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "RndgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingDetails";
			definition = "Parameters to be applied on deal amount for orders when the amount is a fractional number.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RoundingParameters1.mmObject();
		}
	};
	protected PartyIdentification70Choice accountServicer;
	/**
	 * Party that manages the account on behalf of the account owner, that is
	 * manages the registration and booking of entries on the account,
	 * calculates balances on the account and provides information about the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountServicer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification70Choice.mmObject();
		}
	};
	protected BlockedStatusReason2Choice blockedStatus;
	/**
	 * Specifies the account is blocked and other factors for the blocked
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BlockedStatusReason2Choice
	 * BlockedStatusReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmStatus
	 * Account.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account is blocked and other factors for the blocked account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBlockedStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmStatus;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "BlckdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedStatus";
			definition = "Specifies the account is blocked and other factors for the blocked account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BlockedStatusReason2Choice.mmObject();
		}
	};
	protected AccountUsageType2Choice accountUsageType;
	/**
	 * Specifies the type of usage of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountUsageType2Choice
	 * AccountUsageType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctUsgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountUsageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of usage of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountUsageType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccount.mmObject();
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "AcctUsgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountUsageType";
			definition = "Specifies the type of usage of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountUsageType2Choice.mmObject();
		}
	};
	protected Provided1Code foreignStatusCertification;
	/**
	 * Specifies if documentary evidence has been provided for the foreign
	 * resident.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Provided1Code
	 * Provided1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnStsCertfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignStatusCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if documentary evidence has been provided for the foreign resident."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignStatusCertification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "FrgnStsCertfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignStatusCertification";
			definition = "Specifies if documentary evidence has been provided for the foreign resident.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Provided1Code.mmObject();
		}
	};
	protected DateAndDateTimeChoice accountSignatureDateTime;
	/**
	 * Date the investor or account owner signs the open account form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDateSigned
	 * Agreement.mmDateSigned}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSgntrDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSignatureDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date the investor or account owner signs the open account form."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountSignatureDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDateSigned;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "AcctSgntrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSignatureDateTime";
			definition = "Date the investor or account owner signs the open account form.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected TransactionChannelType1Choice transactionChannelType;
	/**
	 * Means by which the investor or account owner submits the open account
	 * form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionChannelType1Choice
	 * TransactionChannelType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTransactionChannel
	 * AccountContract.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxChanlTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionChannelType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Means by which the investor or account owner submits the open account form. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionChannelType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AccountContract.mmTransactionChannel;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "TxChanlTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionChannelType";
			definition = "Means by which the investor or account owner submits the open account form. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionChannelType1Choice.mmObject();
		}
	};
	protected InvestmentAccountCategory1Choice investmentAccountCategory;
	/**
	 * Specifies the category of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountCategory1Choice
	 * InvestmentAccountCategory1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCategory
	 * InvestmentAccount.mmCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentAccountCategory = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmCategory;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountCategory";
			definition = "Specifies the category of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountCategory1Choice.mmObject();
		}
	};
	protected Eligible1Code pledging;
	/**
	 * Specifies whether the holdings in the account are eligible for pledging.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Eligible1Code
	 * Eligible1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pldgg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the holdings in the account are eligible for pledging."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPledging = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "Pldgg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledging";
			definition = "Specifies whether the holdings in the account are eligible for pledging.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Eligible1Code.mmObject();
		}
	};
	protected Collateral1Code collateral;
	/**
	 * Specifies whether the holdings in the account are used as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Collateral1Code
	 * Collateral1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Coll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the holdings in the account are used as collateral."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateral = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "Coll";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Specifies whether the holdings in the account are used as collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Collateral1Code.mmObject();
		}
	};
	protected ThirdPartyRights1 thirdPartyRights;
	/**
	 * Details of third party rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ThirdPartyRights1
	 * ThirdPartyRights1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdPtyRghts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdPartyRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of third party rights."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmThirdPartyRights = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "ThrdPtyRghts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdPartyRights";
			definition = "Details of third party rights.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ThirdPartyRights1.mmObject();
		}
	};
	protected LevelOfControl1Choice powerOfAttorneyLevelOfControl;
	/**
	 * Functionality permitted to a third party in the actions that may be taken
	 * on an account on behalf of the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LevelOfControl1Choice
	 * LevelOfControl1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PwrOfAttnyLvlOfCtrl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorneyLevelOfControl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Functionality permitted to a third party in the actions that may be taken on an account on behalf of the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPowerOfAttorneyLevelOfControl = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "PwrOfAttnyLvlOfCtrl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorneyLevelOfControl";
			definition = "Functionality permitted to a third party in the actions that may be taken on an account on behalf of the investor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LevelOfControl1Choice.mmObject();
		}
	};
	protected AccountingStatus1Choice accountingStatus;
	/**
	 * Specifies if the account is regarded as domestic or non-domestic for
	 * reporting purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountingStatus1Choice
	 * AccountingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the account is regarded as domestic or non-domestic for reporting purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountingStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "AcctgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountingStatus";
			definition = "Specifies if the account is regarded as domestic or non-domestic for reporting purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountingStatus1Choice.mmObject();
		}
	};
	protected DateAndDateTimeChoice openingDate;
	/**
	 * Legal opening date for the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmOpeningDate
	 * Account.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal opening date for the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOpeningDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmOpeningDate;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Legal opening date for the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice closingDate;
	/**
	 * Legal closing date for the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmClosingDate
	 * Account.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal closing date for the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClosingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmClosingDate;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Legal closing date for the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected YesNoIndicator negativeIndicator;
	/**
	 * Indicates whether the account can hold a negative position in a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NegInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegativeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account can hold a negative position in a security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNegativeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "NegInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegativeIndicator";
			definition = "Indicates whether the account can hold a negative position in a security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected PositionEffect3Code processingOrder;
	/**
	 * Order in which securities are moved from the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect3Code
	 * PositionEffect3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPositionEffect
	 * SecuritiesOrder.mmPositionEffect}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order in which securities are moved from the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingOrder = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmPositionEffect;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "PrcgOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingOrder";
			definition = "Order in which securities are moved from the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PositionEffect3Code.mmObject();
		}
	};
	protected Liability1Choice liability;
	/**
	 * Specifies whether the investor assumes responsibility for the liability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Liability1Choice
	 * Liability1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investor assumes responsibility for the liability."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLiability = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "Lblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liability";
			definition = "Specifies whether the investor assumes responsibility for the liability.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Liability1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ModificationScope32> modifiedInvestorProfile;
	/**
	 * Information related to the investor profile to be inserted, updated or
	 * deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ModificationScope32
	 * ModificationScope32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdInvstrPrfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedInvestorProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the investor profile to be inserted, updated or deleted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModifiedInvestorProfile = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "ModfdInvstrPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedInvestorProfile";
			definition = "Information related to the investor profile to be inserted, updated or deleted.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ModificationScope32.mmObject();
		}
	};
	protected FiscalYear1Choice fiscalYear;
	/**
	 * Fiscal year, when not the same as the calendar year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.FiscalYear1Choice
	 * FiscalYear1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxDate Tax.mmTaxDate}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63
	 * InvestmentAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FsclYr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fiscal year, when not the same as the calendar year."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFiscalYear = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxDate;
			componentContext_lazy = () -> InvestmentAccount63.mmObject();
			isDerived = false;
			xmlTag = "FsclYr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalYear";
			definition = "Fiscal year, when not the same as the calendar year.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FiscalYear1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InvestmentAccount63.mmAccountStatusUpdateInstruction, InvestmentAccount63.mmName, InvestmentAccount63.mmDesignation, InvestmentAccount63.mmType, InvestmentAccount63.mmOwnershipType,
						InvestmentAccount63.mmTaxExemption, InvestmentAccount63.mmStatementFrequency, InvestmentAccount63.mmReferenceCurrency, InvestmentAccount63.mmLanguage, InvestmentAccount63.mmIncomePreference,
						InvestmentAccount63.mmReinvestmentDetails, InvestmentAccount63.mmTaxWithholdingMethod, InvestmentAccount63.mmTaxReporting, InvestmentAccount63.mmLetterIntentDetails, InvestmentAccount63.mmAccumulationRightReference,
						InvestmentAccount63.mmRequiredSignatoriesNumber, InvestmentAccount63.mmFundFamilyName, InvestmentAccount63.mmModifiedFinancialInstrumentDetails, InvestmentAccount63.mmRoundingDetails,
						InvestmentAccount63.mmAccountServicer, InvestmentAccount63.mmBlockedStatus, InvestmentAccount63.mmAccountUsageType, InvestmentAccount63.mmForeignStatusCertification, InvestmentAccount63.mmAccountSignatureDateTime,
						InvestmentAccount63.mmTransactionChannelType, InvestmentAccount63.mmInvestmentAccountCategory, InvestmentAccount63.mmPledging, InvestmentAccount63.mmCollateral, InvestmentAccount63.mmThirdPartyRights,
						InvestmentAccount63.mmPowerOfAttorneyLevelOfControl, InvestmentAccount63.mmAccountingStatus, InvestmentAccount63.mmOpeningDate, InvestmentAccount63.mmClosingDate, InvestmentAccount63.mmNegativeIndicator,
						InvestmentAccount63.mmProcessingOrder, InvestmentAccount63.mmLiability, InvestmentAccount63.mmModifiedInvestorProfile, InvestmentAccount63.mmFiscalYear);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmModifiedInvestmentAccount);
				trace_lazy = () -> InvestmentAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccount63";
				definition = "Information about a securities account and its characteristics.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AcctStsUpdInstr")
	public AccountStatusUpdateInstruction1 getAccountStatusUpdateInstruction() {
		return accountStatusUpdateInstruction;
	}

	public void setAccountStatusUpdateInstruction(com.tools20022.repository.msg.AccountStatusUpdateInstruction1 accountStatusUpdateInstruction) {
		this.accountStatusUpdateInstruction = accountStatusUpdateInstruction;
	}

	@XmlElement(name = "Nm")
	public Max35Text getName() {
		return name;
	}

	public void setName(Max35Text name) {
		this.name = name;
	}

	@XmlElement(name = "Dsgnt")
	public Max35Text getDesignation() {
		return designation;
	}

	public void setDesignation(Max35Text designation) {
		this.designation = designation;
	}

	@XmlElement(name = "Tp")
	public AccountType2Choice getType() {
		return type;
	}

	public void setType(AccountType2Choice type) {
		this.type = type;
	}

	@XmlElement(name = "OwnrshTp")
	public OwnershipType2Choice getOwnershipType() {
		return ownershipType;
	}

	public void setOwnershipType(OwnershipType2Choice ownershipType) {
		this.ownershipType = ownershipType;
	}

	@XmlElement(name = "TaxXmptn")
	public TaxExemptionReason2Choice getTaxExemption() {
		return taxExemption;
	}

	public void setTaxExemption(TaxExemptionReason2Choice taxExemption) {
		this.taxExemption = taxExemption;
	}

	@XmlElement(name = "StmtFrqcy")
	public StatementFrequencyReason2Choice getStatementFrequency() {
		return statementFrequency;
	}

	public void setStatementFrequency(StatementFrequencyReason2Choice statementFrequency) {
		this.statementFrequency = statementFrequency;
	}

	@XmlElement(name = "RefCcy")
	public ActiveCurrencyCode getReferenceCurrency() {
		return referenceCurrency;
	}

	public void setReferenceCurrency(ActiveCurrencyCode referenceCurrency) {
		this.referenceCurrency = referenceCurrency;
	}

	@XmlElement(name = "Lang")
	public LanguageCode getLanguage() {
		return language;
	}

	public void setLanguage(LanguageCode language) {
		this.language = language;
	}

	@XmlElement(name = "IncmPref")
	public IncomePreference2Code getIncomePreference() {
		return incomePreference;
	}

	public void setIncomePreference(IncomePreference2Code incomePreference) {
		this.incomePreference = incomePreference;
	}

	@XmlElement(name = "RinvstmtDtls")
	public List<Reinvestment3> getReinvestmentDetails() {
		return reinvestmentDetails;
	}

	public void setReinvestmentDetails(List<com.tools20022.repository.msg.Reinvestment3> reinvestmentDetails) {
		this.reinvestmentDetails = reinvestmentDetails;
	}

	@XmlElement(name = "TaxWhldgMtd")
	public TaxWithholdingMethod3Code getTaxWithholdingMethod() {
		return taxWithholdingMethod;
	}

	public void setTaxWithholdingMethod(TaxWithholdingMethod3Code taxWithholdingMethod) {
		this.taxWithholdingMethod = taxWithholdingMethod;
	}

	@XmlElement(name = "TaxRptg")
	public List<TaxReporting2> getTaxReporting() {
		return taxReporting;
	}

	public void setTaxReporting(List<com.tools20022.repository.msg.TaxReporting2> taxReporting) {
		this.taxReporting = taxReporting;
	}

	@XmlElement(name = "LttrInttDtls")
	public LetterIntent1 getLetterIntentDetails() {
		return letterIntentDetails;
	}

	public void setLetterIntentDetails(com.tools20022.repository.msg.LetterIntent1 letterIntentDetails) {
		this.letterIntentDetails = letterIntentDetails;
	}

	@XmlElement(name = "AcmltnRghtRef")
	public Max35Text getAccumulationRightReference() {
		return accumulationRightReference;
	}

	public void setAccumulationRightReference(Max35Text accumulationRightReference) {
		this.accumulationRightReference = accumulationRightReference;
	}

	@XmlElement(name = "ReqrdSgntriesNb")
	public Number getRequiredSignatoriesNumber() {
		return requiredSignatoriesNumber;
	}

	public void setRequiredSignatoriesNumber(Number requiredSignatoriesNumber) {
		this.requiredSignatoriesNumber = requiredSignatoriesNumber;
	}

	@XmlElement(name = "FndFmlyNm")
	public Max350Text getFundFamilyName() {
		return fundFamilyName;
	}

	public void setFundFamilyName(Max350Text fundFamilyName) {
		this.fundFamilyName = fundFamilyName;
	}

	@XmlElement(name = "ModfdFinInstrmDtls")
	public List<ModificationScope36> getModifiedFinancialInstrumentDetails() {
		return modifiedFinancialInstrumentDetails;
	}

	public void setModifiedFinancialInstrumentDetails(List<com.tools20022.repository.msg.ModificationScope36> modifiedFinancialInstrumentDetails) {
		this.modifiedFinancialInstrumentDetails = modifiedFinancialInstrumentDetails;
	}

	@XmlElement(name = "RndgDtls")
	public RoundingParameters1 getRoundingDetails() {
		return roundingDetails;
	}

	public void setRoundingDetails(com.tools20022.repository.msg.RoundingParameters1 roundingDetails) {
		this.roundingDetails = roundingDetails;
	}

	@XmlElement(name = "AcctSvcr")
	public PartyIdentification70Choice getAccountServicer() {
		return accountServicer;
	}

	public void setAccountServicer(PartyIdentification70Choice accountServicer) {
		this.accountServicer = accountServicer;
	}

	@XmlElement(name = "BlckdSts")
	public BlockedStatusReason2Choice getBlockedStatus() {
		return blockedStatus;
	}

	public void setBlockedStatus(BlockedStatusReason2Choice blockedStatus) {
		this.blockedStatus = blockedStatus;
	}

	@XmlElement(name = "AcctUsgTp")
	public AccountUsageType2Choice getAccountUsageType() {
		return accountUsageType;
	}

	public void setAccountUsageType(AccountUsageType2Choice accountUsageType) {
		this.accountUsageType = accountUsageType;
	}

	@XmlElement(name = "FrgnStsCertfctn")
	public Provided1Code getForeignStatusCertification() {
		return foreignStatusCertification;
	}

	public void setForeignStatusCertification(Provided1Code foreignStatusCertification) {
		this.foreignStatusCertification = foreignStatusCertification;
	}

	@XmlElement(name = "AcctSgntrDtTm")
	public DateAndDateTimeChoice getAccountSignatureDateTime() {
		return accountSignatureDateTime;
	}

	public void setAccountSignatureDateTime(DateAndDateTimeChoice accountSignatureDateTime) {
		this.accountSignatureDateTime = accountSignatureDateTime;
	}

	@XmlElement(name = "TxChanlTp")
	public TransactionChannelType1Choice getTransactionChannelType() {
		return transactionChannelType;
	}

	public void setTransactionChannelType(TransactionChannelType1Choice transactionChannelType) {
		this.transactionChannelType = transactionChannelType;
	}

	@XmlElement(name = "InvstmtAcctCtgy")
	public InvestmentAccountCategory1Choice getInvestmentAccountCategory() {
		return investmentAccountCategory;
	}

	public void setInvestmentAccountCategory(InvestmentAccountCategory1Choice investmentAccountCategory) {
		this.investmentAccountCategory = investmentAccountCategory;
	}

	@XmlElement(name = "Pldgg")
	public Eligible1Code getPledging() {
		return pledging;
	}

	public void setPledging(Eligible1Code pledging) {
		this.pledging = pledging;
	}

	@XmlElement(name = "Coll")
	public Collateral1Code getCollateral() {
		return collateral;
	}

	public void setCollateral(Collateral1Code collateral) {
		this.collateral = collateral;
	}

	@XmlElement(name = "ThrdPtyRghts")
	public ThirdPartyRights1 getThirdPartyRights() {
		return thirdPartyRights;
	}

	public void setThirdPartyRights(com.tools20022.repository.msg.ThirdPartyRights1 thirdPartyRights) {
		this.thirdPartyRights = thirdPartyRights;
	}

	@XmlElement(name = "PwrOfAttnyLvlOfCtrl")
	public LevelOfControl1Choice getPowerOfAttorneyLevelOfControl() {
		return powerOfAttorneyLevelOfControl;
	}

	public void setPowerOfAttorneyLevelOfControl(LevelOfControl1Choice powerOfAttorneyLevelOfControl) {
		this.powerOfAttorneyLevelOfControl = powerOfAttorneyLevelOfControl;
	}

	@XmlElement(name = "AcctgSts")
	public AccountingStatus1Choice getAccountingStatus() {
		return accountingStatus;
	}

	public void setAccountingStatus(AccountingStatus1Choice accountingStatus) {
		this.accountingStatus = accountingStatus;
	}

	@XmlElement(name = "OpngDt")
	public DateAndDateTimeChoice getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(DateAndDateTimeChoice openingDate) {
		this.openingDate = openingDate;
	}

	@XmlElement(name = "ClsgDt")
	public DateAndDateTimeChoice getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(DateAndDateTimeChoice closingDate) {
		this.closingDate = closingDate;
	}

	@XmlElement(name = "NegInd")
	public YesNoIndicator getNegativeIndicator() {
		return negativeIndicator;
	}

	public void setNegativeIndicator(YesNoIndicator negativeIndicator) {
		this.negativeIndicator = negativeIndicator;
	}

	@XmlElement(name = "PrcgOrdr")
	public PositionEffect3Code getProcessingOrder() {
		return processingOrder;
	}

	public void setProcessingOrder(PositionEffect3Code processingOrder) {
		this.processingOrder = processingOrder;
	}

	@XmlElement(name = "Lblty")
	public Liability1Choice getLiability() {
		return liability;
	}

	public void setLiability(Liability1Choice liability) {
		this.liability = liability;
	}

	@XmlElement(name = "ModfdInvstrPrfl")
	public List<ModificationScope32> getModifiedInvestorProfile() {
		return modifiedInvestorProfile;
	}

	public void setModifiedInvestorProfile(List<com.tools20022.repository.msg.ModificationScope32> modifiedInvestorProfile) {
		this.modifiedInvestorProfile = modifiedInvestorProfile;
	}

	@XmlElement(name = "FsclYr")
	public FiscalYear1Choice getFiscalYear() {
		return fiscalYear;
	}

	public void setFiscalYear(FiscalYear1Choice fiscalYear) {
		this.fiscalYear = fiscalYear;
	}
}
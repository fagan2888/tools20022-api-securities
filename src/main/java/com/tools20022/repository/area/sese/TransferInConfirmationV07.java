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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementLatestVersion;
import com.tools20022.repository.codeset.TransferInFunction2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a transfer agent, sends the
 * TransferInConfirmation message to the instructing party, for example, an
 * investment manager or its authorised representative, to confirm the receipt
 * of a financial instrument, free of payment, on a given date, from a specified
 * party.<br>
 * This message may also be used to confirm the receipt of a financial
 * instrument, free of payment, from another of the instructing parties own
 * accounts or from a third party.<br>
 * This message may also be used as an advice, that is, the message is used to
 * provide account information.<br>
 * <b>Usage</b><br>
 * The TransferInConfirmation message is used to confirm receipt of a financial
 * instrument, either from another account owned by the instructing party or
 * from a third party. The reference of the transfer confirmation is identified
 * in TransferConfirmationReference.<br>
 * The reference of the original transfer instruction is specified in
 * TransferReference. The message identification of the TransferInInstruction
 * message in which the transfer instruction was conveyed may also be quoted in
 * RelatedReference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmMessageIdentification
 * TransferInConfirmationV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmPoolReference
 * TransferInConfirmationV07.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmPreviousReference
 * TransferInConfirmationV07.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmRelatedReference
 * TransferInConfirmationV07.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmFunction
 * TransferInConfirmationV07.mmFunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmMasterReference
 * TransferInConfirmationV07.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmTransferDetails
 * TransferInConfirmationV07.mmTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmAccountDetails
 * TransferInConfirmationV07.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmSettlementDetails
 * TransferInConfirmationV07.mmSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmMarketPracticeVersion
 * TransferInConfirmationV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmCopyDetails
 * TransferInConfirmationV07.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmExtension
 * TransferInConfirmationV07.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "TrfInConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
 * SecuritiesSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.007.001.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferInConfirmationV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a transfer agent, sends the TransferInConfirmation message to the instructing party, for example, an investment manager or its authorised representative, to confirm the receipt of a financial instrument, free of payment, on a given date, from a specified party.\r\nThis message may also be used to confirm the receipt of a financial instrument, free of payment, from another of the instructing parties own accounts or from a third party.\r\nThis message may also be used as an advice, that is, the message is used to provide account information.\r\nUsage\r\nThe TransferInConfirmation message is used to confirm receipt of a financial instrument, either from another account owned by the instructing party or from a third party. The reference of the transfer confirmation is identified in TransferConfirmationReference.\r\nThe reference of the original transfer instruction is specified in TransferReference. The message identification of the TransferInInstruction message in which the transfer instruction was conveyed may also be quoted in RelatedReference."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransferInConfirmationV07", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "function", "masterReference", "transferDetails", "accountDetails", "settlementDetails",
		"marketPracticeVersion", "copyDetails", "extension"})
public class TransferInConfirmationV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Reference that uniquely identifies a message from a business application
	 * standpoint.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInConfirmationV07.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference6 poolReference;
	/**
	 * Collective reference identifying a set of messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInConfirmationV07.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference6 previousReference;
	/**
	 * Reference of the linked message that was previously sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the linked message that was previously sent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference of the linked message that was previously sent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInConfirmationV07.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference6 relatedReference;
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInConfirmationV07.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransferInFunction2Code function;
	/**
	 * Function of the transfer in, that is, whether the transfer in message is
	 * used as a confirmation or as or an advice. The absence of Function
	 * indicates the message is a confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferInFunction2Code
	 * TransferInFunction2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Function"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Function of the transfer in, that is, whether the transfer in message is used as a confirmation or as or an advice. The absence of Function indicates the message is a confirmation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFunction = new MMMessageBuildingBlock() {
		{
			xmlTag = "Fctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Function";
			definition = "Function of the transfer in, that is, whether the transfer in message is used as a confirmation or as or an advice. The absence of Function indicates the message is a confirmation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransferInFunction2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInConfirmationV07.class.getMethod("getFunction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text masterReference;
	/**
	 * Unique and unambiguous identifier for a group of individual transfers as
	 * assigned by the instructing party. This identifier links the individual
	 * transfers together.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMasterReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInConfirmationV07.class.getMethod("getMasterReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Transfer33> transferDetails;
	/**
	 * General information related to the transfer of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Transfer33
	 * Transfer33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information related to the transfer of a financial instrument. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransferDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TrfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferDetails";
			definition = "General information related to the transfer of a financial instrument. ";
			minOccurs = 1;
			complexType_lazy = () -> Transfer33.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInConfirmationV07.class.getMethod("getTransferDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentAccount56 accountDetails;
	/**
	 * Information related to the account into which the financial instrument
	 * was received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56
	 * InvestmentAccount56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the account into which the financial instrument was received."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Information related to the account into which the financial instrument was received.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvestmentAccount56.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInConfirmationV07.class.getMethod("getAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DeliverInformation17 settlementDetails;
	/**
	 * Information related to the delivering side of the transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17
	 * DeliverInformation17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the delivering side of the transfer."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Information related to the delivering side of the transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DeliverInformation17.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInConfirmationV07.class.getMethod("getSettlementDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * Identifies the market practice to which the message conforms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarketPracticeVersion = new MMMessageBuildingBlock() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInConfirmationV07.class.getMethod("getMarketPracticeVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CopyInformation4 copyDetails;
	/**
	 * Information provided when the message is a copy of a previous message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation4
	 * CopyInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information provided when the message is a copy of a previous message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCopyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInConfirmationV07.class.getMethod("getCopyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Extension1> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInConfirmationV07.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferInConfirmationV07";
				definition = "Scope\r\nAn executing party, for example, a transfer agent, sends the TransferInConfirmation message to the instructing party, for example, an investment manager or its authorised representative, to confirm the receipt of a financial instrument, free of payment, on a given date, from a specified party.\r\nThis message may also be used to confirm the receipt of a financial instrument, free of payment, from another of the instructing parties own accounts or from a third party.\r\nThis message may also be used as an advice, that is, the message is used to provide account information.\r\nUsage\r\nThe TransferInConfirmation message is used to confirm receipt of a financial instrument, either from another account owned by the instructing party or from a third party. The reference of the transfer confirmation is identified in TransferConfirmationReference.\r\nThe reference of the original transfer instruction is specified in TransferReference. The message identification of the TransferInInstruction message in which the transfer instruction was conveyed may also be quoted in RelatedReference.";
				rootElement = "Document";
				xmlTag = "TrfInConf";
				businessArea_lazy = () -> SecuritiesSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferInConfirmationV07.mmMessageIdentification, com.tools20022.repository.area.sese.TransferInConfirmationV07.mmPoolReference,
						com.tools20022.repository.area.sese.TransferInConfirmationV07.mmPreviousReference, com.tools20022.repository.area.sese.TransferInConfirmationV07.mmRelatedReference,
						com.tools20022.repository.area.sese.TransferInConfirmationV07.mmFunction, com.tools20022.repository.area.sese.TransferInConfirmationV07.mmMasterReference,
						com.tools20022.repository.area.sese.TransferInConfirmationV07.mmTransferDetails, com.tools20022.repository.area.sese.TransferInConfirmationV07.mmAccountDetails,
						com.tools20022.repository.area.sese.TransferInConfirmationV07.mmSettlementDetails, com.tools20022.repository.area.sese.TransferInConfirmationV07.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferInConfirmationV07.mmCopyDetails, com.tools20022.repository.area.sese.TransferInConfirmationV07.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "007";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransferInConfirmationV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgId", required = true)
	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	@XmlElement(name = "PoolRef")
	public AdditionalReference6 getPoolReference() {
		return poolReference;
	}

	public void setPoolReference(AdditionalReference6 poolReference) {
		this.poolReference = poolReference;
	}

	@XmlElement(name = "PrvsRef")
	public AdditionalReference6 getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(AdditionalReference6 previousReference) {
		this.previousReference = previousReference;
	}

	@XmlElement(name = "RltdRef")
	public AdditionalReference6 getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(AdditionalReference6 relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "Fctn")
	public TransferInFunction2Code getFunction() {
		return function;
	}

	public void setFunction(TransferInFunction2Code function) {
		this.function = function;
	}

	@XmlElement(name = "MstrRef")
	public Max35Text getMasterReference() {
		return masterReference;
	}

	public void setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
	}

	@XmlElement(name = "TrfDtls", required = true)
	public List<Transfer33> getTransferDetails() {
		return transferDetails;
	}

	public void setTransferDetails(List<Transfer33> transferDetails) {
		this.transferDetails = transferDetails;
	}

	@XmlElement(name = "AcctDtls", required = true)
	public InvestmentAccount56 getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(InvestmentAccount56 accountDetails) {
		this.accountDetails = accountDetails;
	}

	@XmlElement(name = "SttlmDtls")
	public DeliverInformation17 getSettlementDetails() {
		return settlementDetails;
	}

	public void setSettlementDetails(DeliverInformation17 settlementDetails) {
		this.settlementDetails = settlementDetails;
	}

	@XmlElement(name = "MktPrctcVrsn")
	public MarketPracticeVersion1 getMarketPracticeVersion() {
		return marketPracticeVersion;
	}

	public void setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
	}

	@XmlElement(name = "CpyDtls")
	public CopyInformation4 getCopyDetails() {
		return copyDetails;
	}

	public void setCopyDetails(CopyInformation4 copyDetails) {
		this.copyDetails = copyDetails;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.007.07.07")
	static public class Document {
		@XmlElement(name = "TrfInConf", required = true)
		public TransferInConfirmationV07 messageBody;
	}
}
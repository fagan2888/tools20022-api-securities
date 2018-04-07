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

package com.tools20022.repository.area.setr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesTradeLatestVersion;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The SubscriptionBulkOrderConfirmationCancellationInstruction message is sent
 * by an executing party, for example, a transfer agent, to the instructing
 * party, for example, an investment manager or its authorised representative,
 * to cancel a previously sent SubscriptionBulkOrderConfirmation.<br>
 * <b>Usage</b><br>
 * To request the cancellation of one or more individual order executions, the
 * order reference and deal reference of each individual order execution in the
 * original SubscriptionBulkOrderConfirmation are specified in the order
 * reference and deal reference elements respectively. The message
 * identification of the SubscriptionBulkOrderConfirmation message in which the
 * individual order execution was conveyed may also be quoted in
 * PreviousReference but this is not recommended. The AmendmentIndicator is used
 * to specify whether the subscription bulk order confirmation cancellation is
 * to be followed by an amendment An amendment of a subscription bulk order
 * confirmation is carried out by sending a SubscriptionBulkOrderConfirmation
 * message in which the AmendmentIndicator contains the value ‘true’.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmMessageIdentification
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.
 * mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmPoolReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmPreviousReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.
 * mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmRelatedReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.
 * mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmAmendmentIndicator
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.
 * mmAmendmentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmMasterReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmMasterReference
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmOrderReferences
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmOrderReferences
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmCopyDetails
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmCopyDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SbcptBlkOrdrConfCxlInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
 * SecuritiesTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.049.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionBulkOrderConfirmationCancellationInstructionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe SubscriptionBulkOrderConfirmationCancellationInstruction message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to cancel a previously sent SubscriptionBulkOrderConfirmation.\r\nUsage\r\nTo request the cancellation of one or more individual order executions, the order reference and deal reference of each individual order execution in the original SubscriptionBulkOrderConfirmation are specified in the order reference and deal reference elements respectively. The message identification of the SubscriptionBulkOrderConfirmation message in which the individual order execution was conveyed may also be quoted in PreviousReference but this is not recommended. The AmendmentIndicator is used to specify whether the subscription bulk order confirmation cancellation is to be followed by an amendment An amendment of a subscription bulk order confirmation is carried out by sending a SubscriptionBulkOrderConfirmation message in which the AmendmentIndicator contains the value ‘true’."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubscriptionBulkOrderConfirmationCancellationInstructionV02", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "amendmentIndicator", "masterReference", "orderReferences",
		"copyDetails"})
public class SubscriptionBulkOrderConfirmationCancellationInstructionV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
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
	 * "Reference that uniquely identifies the message from a business application standpoint."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "PoolRef")
	protected AdditionalReference9 poolReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9
	 * AdditionalReference9}</li>
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
	public static final MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, Optional<AdditionalReference9>> mmPoolReference = new MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, Optional<AdditionalReference9>>() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference9.mmObject();
		}

		@Override
		public Optional<AdditionalReference9> getValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getPoolReference();
		}

		@Override
		public void setValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj, Optional<AdditionalReference9> value) {
			obj.setPoolReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRef")
	protected List<AdditionalReference8> previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
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
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, List<AdditionalReference8>> mmPreviousReference = new MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, List<AdditionalReference8>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference8.mmObject();
		}

		@Override
		public List<AdditionalReference8> getValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj, List<AdditionalReference8> value) {
			obj.setPreviousReference(value);
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference8 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
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
	public static final MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, Optional<AdditionalReference8>> mmRelatedReference = new MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, Optional<AdditionalReference8>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference8.mmObject();
		}

		@Override
		public Optional<AdditionalReference8> getValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj, Optional<AdditionalReference8> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "AmdmntInd", required = true)
	protected YesNoIndicator amendmentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a confirmation amendment message will follow the confirmation cancellation instruction or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, YesNoIndicator> mmAmendmentIndicator = new MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, YesNoIndicator>() {
		{
			xmlTag = "AmdmntInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentIndicator";
			definition = "Indicates whether a confirmation amendment message will follow the confirmation cancellation instruction or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getAmendmentIndicator();
		}

		@Override
		public void setValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj, YesNoIndicator value) {
			obj.setAmendmentIndicator(value);
		}
	};
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
	/**
	 * 
	 <p>
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
	 * "Reference assigned to a set of orders or trades in order to link them together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, Optional<Max35Text>> mmMasterReference = new MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, Optional<Max35Text>>() {
		{
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Reference assigned to a set of orders or trades in order to link them together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrRefs", required = true)
	protected List<InvestmentFundOrder11> orderReferences;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11
	 * InvestmentFundOrder11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRefs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the individual order confirmation to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, List<InvestmentFundOrder11>> mmOrderReferences = new MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, List<InvestmentFundOrder11>>() {
		{
			xmlTag = "OrdrRefs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferences";
			definition = "Identification of the individual order confirmation to be cancelled.";
			minOccurs = 1;
			complexType_lazy = () -> InvestmentFundOrder11.mmObject();
		}

		@Override
		public List<InvestmentFundOrder11> getValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getOrderReferences();
		}

		@Override
		public void setValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj, List<InvestmentFundOrder11> value) {
			obj.setOrderReferences(value);
		}
	};
	@XmlElement(name = "CpyDtls")
	protected CopyInformation4 copyDetails;
	/**
	 * 
	 <p>
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
	 * definition} = "Message is a copy."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, Optional<CopyInformation4>> mmCopyDetails = new MMMessageBuildingBlock<SubscriptionBulkOrderConfirmationCancellationInstructionV02, Optional<CopyInformation4>>() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Message is a copy.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation4.mmObject();
		}

		@Override
		public Optional<CopyInformation4> getValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj) {
			return obj.getCopyDetails();
		}

		@Override
		public void setValue(SubscriptionBulkOrderConfirmationCancellationInstructionV02 obj, Optional<CopyInformation4> value) {
			obj.setCopyDetails(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionBulkOrderConfirmationCancellationInstructionV02";
				definition = "Scope\r\nThe SubscriptionBulkOrderConfirmationCancellationInstruction message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to cancel a previously sent SubscriptionBulkOrderConfirmation.\r\nUsage\r\nTo request the cancellation of one or more individual order executions, the order reference and deal reference of each individual order execution in the original SubscriptionBulkOrderConfirmation are specified in the order reference and deal reference elements respectively. The message identification of the SubscriptionBulkOrderConfirmation message in which the individual order execution was conveyed may also be quoted in PreviousReference but this is not recommended. The AmendmentIndicator is used to specify whether the subscription bulk order confirmation cancellation is to be followed by an amendment An amendment of a subscription bulk order confirmation is carried out by sending a SubscriptionBulkOrderConfirmation message in which the AmendmentIndicator contains the value ‘true’.";
				rootElement = "Document";
				xmlTag = "SbcptBlkOrdrConfCxlInstr";
				businessArea_lazy = () -> SecuritiesTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmMessageIdentification,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmPoolReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmPreviousReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmRelatedReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmAmendmentIndicator,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmMasterReference,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmOrderReferences,
						com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmCopyDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "049";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SubscriptionBulkOrderConfirmationCancellationInstructionV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public SubscriptionBulkOrderConfirmationCancellationInstructionV02 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference9> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public SubscriptionBulkOrderConfirmationCancellationInstructionV02 setPoolReference(AdditionalReference9 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public List<AdditionalReference8> getPreviousReference() {
		return previousReference == null ? previousReference = new ArrayList<>() : previousReference;
	}

	public SubscriptionBulkOrderConfirmationCancellationInstructionV02 setPreviousReference(List<AdditionalReference8> previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public Optional<AdditionalReference8> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public SubscriptionBulkOrderConfirmationCancellationInstructionV02 setRelatedReference(AdditionalReference8 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public YesNoIndicator getAmendmentIndicator() {
		return amendmentIndicator;
	}

	public SubscriptionBulkOrderConfirmationCancellationInstructionV02 setAmendmentIndicator(YesNoIndicator amendmentIndicator) {
		this.amendmentIndicator = Objects.requireNonNull(amendmentIndicator);
		return this;
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public SubscriptionBulkOrderConfirmationCancellationInstructionV02 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public List<InvestmentFundOrder11> getOrderReferences() {
		return orderReferences == null ? orderReferences = new ArrayList<>() : orderReferences;
	}

	public SubscriptionBulkOrderConfirmationCancellationInstructionV02 setOrderReferences(List<InvestmentFundOrder11> orderReferences) {
		this.orderReferences = Objects.requireNonNull(orderReferences);
		return this;
	}

	public Optional<CopyInformation4> getCopyDetails() {
		return copyDetails == null ? Optional.empty() : Optional.of(copyDetails);
	}

	public SubscriptionBulkOrderConfirmationCancellationInstructionV02 setCopyDetails(CopyInformation4 copyDetails) {
		this.copyDetails = copyDetails;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.049.001.02")
	static public class Document {
		@XmlElement(name = "SbcptBlkOrdrConfCxlInstr", required = true)
		public SubscriptionBulkOrderConfirmationCancellationInstructionV02 messageBody;
	}
}
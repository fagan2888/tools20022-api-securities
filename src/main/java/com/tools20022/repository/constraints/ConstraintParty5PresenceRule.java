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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If Party5 is present, then Party4 must be present.
 */
public class ConstraintParty5PresenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Party4&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Party5&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party5PresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "If Party5 is present, then Party4 must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties23> forSettlementParties23 = new MMConstraint<SettlementParties23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party5PresenceRule";
			definition = "If Party5 is present, then Party4 must be present.";
			owner_lazy = () -> SettlementParties23.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Party4</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Party5</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SettlementParties23 obj) throws Exception {
			checkSettlementParties23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties63
	 * SettlementParties63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Party4&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Party5&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party5PresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "If Party5 is present, then Party4 must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties63> forSettlementParties63 = new MMConstraint<SettlementParties63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party5PresenceRule";
			definition = "If Party5 is present, then Party4 must be present.";
			owner_lazy = () -> SettlementParties63.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Party4</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Party5</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SettlementParties63 obj) throws Exception {
			checkSettlementParties63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties32
	 * SettlementParties32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Party4&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Party5&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party5PresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "If Party5 is present, then Party4 must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties32> forSettlementParties32 = new MMConstraint<SettlementParties32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party5PresenceRule";
			definition = "If Party5 is present, then Party4 must be present.";
			owner_lazy = () -> SettlementParties32.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Party4</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Party5</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SettlementParties32 obj) throws Exception {
			checkSettlementParties32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties40
	 * SettlementParties40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Party4&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Party5&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party5PresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "If Party5 is present, then Party4 must be present."</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties40> forSettlementParties40 = new MMConstraint<SettlementParties40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party5PresenceRule";
			definition = "If Party5 is present, then Party4 must be present.";
			owner_lazy = () -> SettlementParties40.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Party4</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Party5</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SettlementParties40 obj) throws Exception {
			checkSettlementParties40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties62
	 * SettlementParties62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Party4&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Party5&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party5PresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "If Party5 is present, then Party4 must be present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintParty5PresenceRule#forSettlementParties36
	 * ConstraintParty5PresenceRule.forSettlementParties36}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties62> forSettlementParties62 = new MMConstraint<SettlementParties62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party5PresenceRule";
			definition = "If Party5 is present, then Party4 must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintParty5PresenceRule.forSettlementParties36;
			owner_lazy = () -> SettlementParties62.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Party4</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Party5</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SettlementParties62 obj) throws Exception {
			checkSettlementParties62(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Party4&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Party5&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party5PresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "If Party5 is present, then Party4 must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintParty5PresenceRule#forSettlementParties62
	 * ConstraintParty5PresenceRule.forSettlementParties62}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties36> forSettlementParties36 = new MMConstraint<SettlementParties36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party5PresenceRule";
			definition = "If Party5 is present, then Party4 must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintParty5PresenceRule.forSettlementParties62);
			owner_lazy = () -> SettlementParties36.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Party4</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Party5</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(SettlementParties36 obj) throws Exception {
			checkSettlementParties36(obj);
		}
	};

	/**
	 * If Party5 is present, then Party4 must be present.
	 */
	public static void checkSettlementParties23(SettlementParties23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Party5 is present, then Party4 must be present.
	 */
	public static void checkSettlementParties63(SettlementParties63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Party5 is present, then Party4 must be present.
	 */
	public static void checkSettlementParties32(SettlementParties32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Party5 is present, then Party4 must be present.
	 */
	public static void checkSettlementParties40(SettlementParties40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Party5 is present, then Party4 must be present.
	 */
	public static void checkSettlementParties62(SettlementParties62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Party5 is present, then Party4 must be present.
	 */
	public static void checkSettlementParties36(SettlementParties36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}
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
import com.tools20022.repository.area.camt.BankToCustomerStatementV03;
import com.tools20022.repository.area.camt.BankToCustomerStatementV04;
import com.tools20022.repository.area.camt.BankToCustomerStatementV05;
import com.tools20022.repository.area.camt.BankToCustomerStatementV06;
import java.util.Arrays;

/**
 * MessagePagination may be present or StatementPagination may be present, but
 * not both.
 */
public class ConstraintMessageOrStatementPaginationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV06
	 * BankToCustomerStatementV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Statement[*]/StatementPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrStatementPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or StatementPagination may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrStatementPaginationRule#forBankToCustomerStatementV05
	 * ConstraintMessageOrStatementPaginationRule.forBankToCustomerStatementV05}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerStatementV06> forBankToCustomerStatementV06 = new MMConstraint<BankToCustomerStatementV06>() {
		{
			validator = ConstraintMessageOrStatementPaginationRule::checkBankToCustomerStatementV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrStatementPaginationRule";
			definition = "MessagePagination may be present or StatementPagination may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrStatementPaginationRule.forBankToCustomerStatementV05;
			owner_lazy = () -> BankToCustomerStatementV06.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Statement[*]/StatementPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV05
	 * BankToCustomerStatementV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Statement[*]/StatementPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrStatementPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or StatementPagination may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrStatementPaginationRule#forBankToCustomerStatementV06
	 * ConstraintMessageOrStatementPaginationRule.forBankToCustomerStatementV06}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrStatementPaginationRule#forBankToCustomerStatementV04
	 * ConstraintMessageOrStatementPaginationRule.forBankToCustomerStatementV04}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerStatementV05> forBankToCustomerStatementV05 = new MMConstraint<BankToCustomerStatementV05>() {
		{
			validator = ConstraintMessageOrStatementPaginationRule::checkBankToCustomerStatementV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrStatementPaginationRule";
			definition = "MessagePagination may be present or StatementPagination may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrStatementPaginationRule.forBankToCustomerStatementV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrStatementPaginationRule.forBankToCustomerStatementV04;
			owner_lazy = () -> BankToCustomerStatementV05.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Statement[*]/StatementPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV03
	 * BankToCustomerStatementV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Statement[*]/StatementPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrStatementPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or StatementPagination may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerStatementV03> forBankToCustomerStatementV03 = new MMConstraint<BankToCustomerStatementV03>() {
		{
			validator = ConstraintMessageOrStatementPaginationRule::checkBankToCustomerStatementV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrStatementPaginationRule";
			definition = "MessagePagination may be present or StatementPagination may be present, but not both.";
			owner_lazy = () -> BankToCustomerStatementV03.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Statement[*]/StatementPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV04
	 * BankToCustomerStatementV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Statement[*]/StatementPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrStatementPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or StatementPagination may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrStatementPaginationRule#forBankToCustomerStatementV05
	 * ConstraintMessageOrStatementPaginationRule.forBankToCustomerStatementV05}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerStatementV04> forBankToCustomerStatementV04 = new MMConstraint<BankToCustomerStatementV04>() {
		{
			validator = ConstraintMessageOrStatementPaginationRule::checkBankToCustomerStatementV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrStatementPaginationRule";
			definition = "MessagePagination may be present or StatementPagination may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrStatementPaginationRule.forBankToCustomerStatementV05);
			owner_lazy = () -> BankToCustomerStatementV04.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Statement[*]/StatementPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}
	};

	/**
	 * MessagePagination may be present or StatementPagination may be present,
	 * but not both.
	 */
	public static void checkBankToCustomerStatementV06(BankToCustomerStatementV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MessagePagination may be present or StatementPagination may be present,
	 * but not both.
	 */
	public static void checkBankToCustomerStatementV05(BankToCustomerStatementV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MessagePagination may be present or StatementPagination may be present,
	 * but not both.
	 */
	public static void checkBankToCustomerStatementV03(BankToCustomerStatementV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MessagePagination may be present or StatementPagination may be present,
	 * but not both.
	 */
	public static void checkBankToCustomerStatementV04(BankToCustomerStatementV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}
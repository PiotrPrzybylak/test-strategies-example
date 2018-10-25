package company.v3;

import java.math.BigDecimal;

final class SalaryCalculator {

    BigDecimal calculateSalaryAfterTheRise(final BigDecimal percents, final BigDecimal initialSalary) {
        return initialSalary.multiply(percents.add(BigDecimal.valueOf(100))).divide(BigDecimal.valueOf(100));
    }
}

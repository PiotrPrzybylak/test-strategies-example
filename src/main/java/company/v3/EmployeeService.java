package company.v3;

import java.math.BigDecimal;

final class EmployeeService {

    private final EmployeeRepository repository;
    private final SalaryCalculator salaryCalculator;

    public EmployeeService(final EmployeeRepository repository, final SalaryCalculator salaryCalculator) {
        this.repository = repository;
        this.salaryCalculator = salaryCalculator;
    }

    public void giveRise(String employeeId, BigDecimal percents) {
        Employee employee = repository.getById(employeeId);
        employee.setSalary(salaryCalculator.calculateSalaryAfterTheRise(percents, employee.getSalary()));
        repository.update(employee);
    }

}

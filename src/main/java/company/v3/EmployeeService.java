package company.v3;

import java.math.BigDecimal;

final class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(final EmployeeRepository repository) {
        this.repository = repository;
    }

    public void giveRise(String employeeId, BigDecimal percents) {
        Employee employee = repository.getById(employeeId);
        employee.setSalary(calculateSalaryAfterTheRise(percents, employee));
        repository.update(employee);
    }

    private BigDecimal calculateSalaryAfterTheRise(final BigDecimal percents, final Employee employee) {
        return employee.getSalary().multiply(percents.add(BigDecimal.valueOf(100))).divide(BigDecimal.valueOf(100));
    }
}
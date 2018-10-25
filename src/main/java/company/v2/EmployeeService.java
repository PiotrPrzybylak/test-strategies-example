package company.v2;

import java.math.BigDecimal;

final class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(final EmployeeRepository repository) {
        this.repository = repository;
    }

    public void giveRise(String employeeId, BigDecimal percents) {
        Employee employee = repository.getById(employeeId);
        employee.setSalary(employee.getSalary().multiply(percents.add(BigDecimal.valueOf(100))).divide(BigDecimal.valueOf(100)));
        repository.update(employee);
    }
}

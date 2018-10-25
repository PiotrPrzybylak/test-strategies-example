package company.v1;

import java.math.BigDecimal;

final class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(final EmployeeRepository repository) {
        this.repository = repository;
    }

    public void giveRise(String employeeId, BigDecimal percents) {
        Employee employee = repository.getById(employeeId);
        employee.giveRise(percents);
        repository.update(employee);
    }
}

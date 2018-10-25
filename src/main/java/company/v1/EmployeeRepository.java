package company.v1;

interface EmployeeRepository {

    Employee getById(String employeeId);

    void update(Employee employee);
}

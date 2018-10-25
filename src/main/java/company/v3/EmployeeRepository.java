package company.v3;

interface EmployeeRepository {

    Employee getById(String employeeId);

    void update(Employee employee);
}

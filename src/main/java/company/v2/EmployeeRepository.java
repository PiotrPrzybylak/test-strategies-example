package company.v2;

interface EmployeeRepository {

    Employee getById(String employeeId);

    void update(Employee employee);
}

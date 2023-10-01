package org.skg.employeeservice.service;

import org.skg.employeeservice.dto.EmployeeDto;

public interface EmployeeService
{
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);
}

package org.skg.departmentservice.service;

import org.skg.departmentservice.dto.DepartmentDto;

public interface DepartmentService
{
    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartemntByCode(String code);

}

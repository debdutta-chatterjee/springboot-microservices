package org.skg.departmentservice.service.impl;

import lombok.AllArgsConstructor;
import org.skg.departmentservice.dto.DepartmentDto;
import org.skg.departmentservice.entity.Department;
import org.skg.departmentservice.repository.DepartmentRepository;
import org.skg.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService
{
    private DepartmentRepository departmentRepository;
    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
            );
        Department savedDepartment = departmentRepository.save(department);

        DepartmentDto savedDepartmentDto = new DepartmentDto(
                savedDepartment.getId(),
                savedDepartment.getDepartmentName(),
                savedDepartment.getDepartmentDescription(),
                savedDepartment.getDepartmentCode()
        );
        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartemntByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        DepartmentDto departmentDto = new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                department.getDepartmentCode()
        );
        return departmentDto;
    }
}

package org.skg.departmentservice.controller;

import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.skg.departmentservice.dto.DepartmentDto;
import org.skg.departmentservice.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController
{
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartemnt
            (@RequestBody DepartmentDto departmentDto)
    {
        DepartmentDto savedDepartmentDto =departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(savedDepartmentDto, HttpStatus.CREATED);
    }

    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto> getDepartment
            (@PathVariable("department-code") String departmentCode)
    {
        DepartmentDto departmentDto =departmentService.getDepartemntByCode(departmentCode);
        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }
}

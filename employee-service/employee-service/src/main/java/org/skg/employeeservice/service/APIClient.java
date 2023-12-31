package org.skg.employeeservice.service;

import org.skg.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "DEPARTMENT-SERVICE")

//Configure multiple instances of dept service running in 8080 & 8082 <registered in Eureka server>
//@FeignClient(url = "http://localhost:8080;http://localhost:8080", value = "DEPARTMENT-SERVICE")
public interface APIClient
{
    @GetMapping("api/departments/{department-code}")
    public DepartmentDto getDepartment
            (@PathVariable("department-code") String departmentCode);
}

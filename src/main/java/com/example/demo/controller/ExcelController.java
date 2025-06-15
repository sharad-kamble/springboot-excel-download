package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.ExcelService;

@RestController
public class ExcelController {

    @Autowired
    private ExcelService excelService;

    @GetMapping("/download/excel")
    public ResponseEntity<byte[]> downloadExcel() {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Sharad", "sharad@example.com", "IT"),
                new Employee(2, "Pranali", "pranali@example.com", "HR"),
                new Employee(3, "Rutuja", "rutuja@example.com", "Finance"),
                new Employee(4, "Ashok", "ashok@example.com", "Finance")
        );

        byte[] excelBytes = null;
        try {
            excelBytes = excelService.generateExcel(employees);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=employees.xlsx")
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(excelBytes);
    }
}

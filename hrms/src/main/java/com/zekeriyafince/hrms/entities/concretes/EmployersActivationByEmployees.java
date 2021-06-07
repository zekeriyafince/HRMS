/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zekeriyafince.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 21:08
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employers_activation_by_employees")
public class EmployersActivationByEmployees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employers_id")
    private int employerId;

    @Column(name = "employees_id")
    private int employeeId;

    @Column(name = "is_confirmed")
    private boolean isConformed;

    @Column(name = "created_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate createdDate;
}

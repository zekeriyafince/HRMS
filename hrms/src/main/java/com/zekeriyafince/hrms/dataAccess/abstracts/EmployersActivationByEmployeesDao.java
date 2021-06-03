package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.EmployersActivationByEmployees;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 21:16
 */
public interface EmployersActivationByEmployeesDao extends JpaRepository<EmployersActivationByEmployees, Integer> {

}

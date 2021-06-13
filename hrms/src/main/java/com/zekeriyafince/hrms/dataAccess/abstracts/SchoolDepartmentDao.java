package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.SchoolDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 22:16
 */
public interface SchoolDepartmentDao extends JpaRepository<SchoolDepartment, Integer> {
    
}

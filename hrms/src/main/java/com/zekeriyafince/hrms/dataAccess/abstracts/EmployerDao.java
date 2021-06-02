package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 02.06.2021 22:32
 */
public interface EmployerDao extends JpaRepository<Employer, Integer> {

    boolean existsByEmail(String email);
}

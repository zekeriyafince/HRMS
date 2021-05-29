package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 23.05.2021 22:14
 */
public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}

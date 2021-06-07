package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.JobAdvertisement;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 07.06.2021 21:08
 */
public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

    List<JobAdvertisement> getByIsActiveTrue();

    List<JobAdvertisement> getByIsActiveTrueAndEmployer_Id(int EmployerId);
}

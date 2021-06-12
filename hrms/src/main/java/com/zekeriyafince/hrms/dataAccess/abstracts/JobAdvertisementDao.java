package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.JobAdvertisement;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 07.06.2021 21:08
 */
public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

    List<JobAdvertisement> getByIsActiveTrue();

    List<JobAdvertisement> getByIsActiveTrueAndEmployer_Id(int EmployerId);

    @Query("Select new com.zekeriyafince.hrms.entities.dtos.JobAdvertisementWithEmployerDto(j.id, e.id) from Employer e inner join e.jobAdvertisements j")
    List<JobAdvertisement> getJobAdvertisementWithEmployerDetails();

}

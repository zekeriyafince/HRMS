package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 02.06.2021 22:28
 */
public interface CandidateDao extends JpaRepository<Candidate, Integer> {

    boolean existsByEmail(String email);

    boolean existsByNationalIdentityNumber(String nationalIdentityNumber);
}

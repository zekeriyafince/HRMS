package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.CandidateCurriculumVitae;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 00:15
 */
public interface CandidateCurriculumVitaeDao extends JpaRepository<CandidateCurriculumVitae, Integer> {

    CandidateCurriculumVitae getByCandidateId(int candidateId);
}

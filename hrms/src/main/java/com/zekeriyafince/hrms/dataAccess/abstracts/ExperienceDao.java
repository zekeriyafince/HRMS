package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.CandidateCurriculumVitae;
import com.zekeriyafince.hrms.entities.concretes.Experience;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 21:38
 */
public interface ExperienceDao extends JpaRepository<Experience, Integer> {

    Experience getByCv_Candidate_Id(int candidateId);

    List<Experience> getAllByCv_Candidate_Id(int candidateId);

    List<Experience> getAllByCv_IdOrderByFinishDateDesc(int cvId);
}

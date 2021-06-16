package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.CandidateSchool;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 21:15
 */
public interface CandidateSchoolDao extends JpaRepository<CandidateSchool, Integer> {

    CandidateSchool getByCv_Candidate_Id(int candidateId);

    List<CandidateSchool> getAllByCv_Candidate_Id(int candidateId);

    List<CandidateSchool> getAllByCv_Candidate_IdOrderByFinishDateDesc(int candidateId);
}

package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.CandidateSkill;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 21:31
 */
public interface CandidateSkillDao extends JpaRepository<CandidateSkill, Integer> {

    CandidateSkill getByCandidateId(int candidateId);

    List<CandidateSkill> getAllByCandidateId(int candidateId);

}

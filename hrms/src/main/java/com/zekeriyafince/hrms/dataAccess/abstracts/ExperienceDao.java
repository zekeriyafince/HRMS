package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.Experience;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 21:38
 */
public interface ExperienceDao extends JpaRepository<Experience, Integer> {

    Experience getByCandidateId(int candidateId);

    List<Experience> getAllByCandidateId(int candidateId);

    List<Experience> getAllByCandidateIdOrderByFinishDateDesc(int candidateId);
}

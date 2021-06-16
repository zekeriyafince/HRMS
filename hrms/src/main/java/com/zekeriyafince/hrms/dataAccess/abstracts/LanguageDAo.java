package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 22:10
 */
public interface LanguageDAo extends JpaRepository<Language, Integer> {

    Language getByCv_Candidate_Id(int candidateId);

}

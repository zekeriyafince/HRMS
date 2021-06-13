package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 22:17
 */
public interface SkillDao extends JpaRepository<Skill, Integer> {

}

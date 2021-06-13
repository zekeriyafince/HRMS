package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.TechnologyCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 22:20
 */
public interface TechnologyCategoryDao extends JpaRepository<TechnologyCategory, Integer> {
    
}

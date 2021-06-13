package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 22:18
 */
public interface SocialMediaDao extends JpaRepository<SocialMedia, Integer> {

}

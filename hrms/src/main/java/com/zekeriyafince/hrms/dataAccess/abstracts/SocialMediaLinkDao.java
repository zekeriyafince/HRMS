package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.SocialMediaLink;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 22:19
 */
public interface SocialMediaLinkDao extends JpaRepository<SocialMediaLink, Integer> {

}

package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 21:17
 */
public interface UserDao extends JpaRepository<User, Integer> {

    boolean existsByEmail(String email);

}

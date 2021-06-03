package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.ActivationCode;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 21:16
 */
public interface ActivationCodeDao extends JpaRepository<ActivationCode, Integer> {

    ActivationCode getByActivationCode(String code);

    boolean existsByActivationCode(String code);
}

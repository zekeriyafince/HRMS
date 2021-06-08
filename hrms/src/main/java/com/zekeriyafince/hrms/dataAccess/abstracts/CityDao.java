package com.zekeriyafince.hrms.dataAccess.abstracts;

import com.zekeriyafince.hrms.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 08.06.2021 21:35
 */
public interface CityDao extends JpaRepository<City, Integer> {

    City findByCityName(String cityName);
}

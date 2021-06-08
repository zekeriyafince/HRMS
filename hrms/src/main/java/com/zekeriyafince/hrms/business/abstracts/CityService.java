package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.City;
import java.util.List;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 08.06.2021 21:36
 */
public interface CityService {

    DataResult<List<City>> getAll();

    DataResult<City> getByCityName(String cityName);

    Result add(City city);
}

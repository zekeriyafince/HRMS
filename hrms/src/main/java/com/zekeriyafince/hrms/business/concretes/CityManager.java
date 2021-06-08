package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.CityService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import com.zekeriyafince.hrms.core.utilities.results.SuccessDataResult;
import com.zekeriyafince.hrms.dataAccess.abstracts.CityDao;
import com.zekeriyafince.hrms.entities.concretes.City;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 08.06.2021 21:37
 */
@Service
public class CityManager implements CityService {

    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(this.cityDao.findAll());
    }

    @Override
    public DataResult<City> getByCityName(String cityName) {
        return new SuccessDataResult<City>(this.cityDao.findByCityName(cityName.toUpperCase()));
    }

    @Override
    public Result add(City city) {
        this.cityDao.save(city);
        return new SuccesResult("Şehir Ekleme Başarılı.");
    }

}

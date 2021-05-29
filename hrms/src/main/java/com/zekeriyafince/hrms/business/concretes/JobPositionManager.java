package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.JobPositionService;
import com.zekeriyafince.hrms.dataAccess.abstracts.JobPositionDao;
import com.zekeriyafince.hrms.entities.concretes.JobPosition;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 23.05.2021 22:16
 */
@Service
public class JobPositionManager implements JobPositionService {

    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public List<JobPosition> getAll() {
        return this.jobPositionDao.findAll();
    }

}

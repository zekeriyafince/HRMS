package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.CandidateSkillService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import com.zekeriyafince.hrms.core.utilities.results.SuccessDataResult;
import com.zekeriyafince.hrms.dataAccess.abstracts.CandidateSkillDao;
import com.zekeriyafince.hrms.entities.concretes.CandidateSkill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 23:05
 */
@Service
public class CandidateSkillManager implements CandidateSkillService {

    private CandidateSkillDao candidateSkillDao;

    @Autowired
    public CandidateSkillManager(CandidateSkillDao candidateSkillDao) {
        this.candidateSkillDao = candidateSkillDao;
    }

    @Override
    public Result add(CandidateSkill candidateSkill) {
        this.candidateSkillDao.save(candidateSkill);
        return new SuccesResult("Yetenek Bilgisi Eklenildi.");
    }

    @Override
    public DataResult<List<CandidateSkill>> getAll() {
        return new SuccessDataResult<List<CandidateSkill>>(this.candidateSkillDao.findAll(), "Yetenek Bilgisi listelendi.");
    }

}

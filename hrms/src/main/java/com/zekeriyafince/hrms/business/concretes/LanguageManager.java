package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.LanguageService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import com.zekeriyafince.hrms.core.utilities.results.SuccessDataResult;
import com.zekeriyafince.hrms.dataAccess.abstracts.LanguageDAo;
import com.zekeriyafince.hrms.entities.concretes.Language;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 23:11
 */
public class LanguageManager implements LanguageService {

    private LanguageDAo languageDao;

    @Autowired
    public LanguageManager(LanguageDAo languageDao) {
        this.languageDao = languageDao;
    }

    @Override
    public Result add(Language language) {
        this.languageDao.save(language);
        return new SuccesResult("Dil Bilgisi Eklenildi.");
    }

    @Override
    public DataResult<List<Language>> getAll() {
        return new SuccessDataResult<List<Language>>(this.languageDao.findAll(), "Dil Bilgisi listelendi.");
    }

}

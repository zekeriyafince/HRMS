package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.Language;
import java.util.List;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 22:52
 */
public interface LanguageService {

    Result add(Language language);

    DataResult<List<Language>> getAll();
}

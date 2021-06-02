package com.zekeriyafince.hrms.core.utilities.helpers;

import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 02.06.2021 22:34
 */
public class BusinessRules {

    public static Result run(Result... logics) {
        for (Result logic : logics) {
            if (!logic.isSuccess()) {
                return logic;
            }
        }
        return new SuccesResult();
    }
}

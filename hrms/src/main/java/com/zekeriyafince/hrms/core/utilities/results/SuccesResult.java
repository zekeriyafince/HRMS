package com.zekeriyafince.hrms.core.utilities.results;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 29.05.2021 21:13
 */
public class SuccesResult extends Result {

    public SuccesResult() {
        super(true);
    }

    public SuccesResult(String message) {
        super(true, message);
    }

}

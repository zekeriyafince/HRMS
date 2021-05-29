package com.zekeriyafince.hrms.core.utilities.results;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 29.05.2021 21:14
 */
public class ErrorResult extends Result {

    public ErrorResult() {
        super(false);
    }

    public ErrorResult(String message) {
        super(false, message);
    }

}

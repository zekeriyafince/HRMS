package com.zekeriyafince.hrms.core.utilities.results;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 29.05.2021 21:17
 */
public class SuccessDataResult<T> extends DataResult<T> {

    public SuccessDataResult(T data) {
        super(data, true);
    }

    public SuccessDataResult(T data, String message) {
        super(data, true, message);
    }

}

package com.zekeriyafince.hrms.core.utilities.results;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 29.05.2021 21:19
 */
public class ErrorDataResult<T> extends DataResult<T> {

    public ErrorDataResult(T data) {
        super(data, false);
    }

    public ErrorDataResult(T data, String message) {
        super(data, true, message);
    }

}

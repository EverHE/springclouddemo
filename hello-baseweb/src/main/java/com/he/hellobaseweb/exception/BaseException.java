package com.he.hellobaseweb.exception;


/**
 * 
 * 异常基类，所有异常都必须继承于此异常
 */
public class BaseException extends Exception {

    /**
     * 具体异常码
     */
    protected int code;

    protected BaseException() {
        super();
    }

    public int getCode() {
        return code;
    }

    /**
     * 实例化异常
     * 
     * @param msgFormat
     * @param args
     * @return
     */
    protected BaseException newInstance(String msgFormat, Object[] args) {
        return new BaseException(this.code, msgFormat, args);
    }

    public BaseException(int code) {
        this(code, ExceptionBundle.getMessage(String.valueOf(code)));
    }

    public BaseException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BaseException(int code, Object[] args) {
        this(code, ExceptionBundle.getMessage(String.valueOf(code)), args);
    }

    public BaseException(int code, String msgFormat, Object[] args) {
        super(String.format(msgFormat, args));
        this.code = code;
    }

    public BaseException(int code, Throwable cause) {
        super(ExceptionBundle.getMessage(String.valueOf(code)), cause);
        this.code = code;
    }

    public BaseException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}

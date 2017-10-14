package org.seckill.exception;

/**
 * 秒杀时的异常
 * Created by pohoulong on 2017/10/14.
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}

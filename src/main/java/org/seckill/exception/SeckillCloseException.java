package org.seckill.exception;

/**
 * 关闭秒杀后的异常
 * Created by pohoulong on 2017/10/14.
 */
public class SeckillCloseException extends RuntimeException {
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}

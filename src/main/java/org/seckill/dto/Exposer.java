package org.seckill.dto;

/**
 * 暴露秒杀地址DTO
 * Created by pohoulong on 2017/10/14.
 */
public class Exposer {

    private boolean exposed;

    //一种加密措施
    private String md;

    //系统当前时间（毫秒）
    private long now;

    private long start;

    private long end;

    private Long seckillId;

    public Exposer(boolean exposed, Long seckillId) {
        this.exposed = exposed;
        this.seckillId = seckillId;
    }

    public Exposer(boolean exposed, String md, Long seckillId) {
        this.exposed = exposed;
        this.md = md;
        this.seckillId = seckillId;
    }

    public Exposer(boolean exposed, long now, long start, long end, Long seckillId) {
        this.exposed = exposed;
        this.now = now;
        this.start = start;
        this.end = end;
        this.seckillId = seckillId;
    }

    public boolean isExposed() {
        return exposed;
    }

    public String getMd() {
        return md;
    }

    public long getNow() {
        return now;
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public void setExposed(boolean exposed) {
        this.exposed = exposed;
    }

    public void setMd(String md) {
        this.md = md;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    @Override
    public String toString() {
        return "Exposer{" +
                "exposed=" + exposed +
                ", md='" + md + '\'' +
                ", now=" + now +
                ", start=" + start +
                ", end=" + end +
                ", seckillId=" + seckillId +
                '}';
    }
}

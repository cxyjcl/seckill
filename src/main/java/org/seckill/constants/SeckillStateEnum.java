package org.seckill.constants;

/**
 * 处理秒杀的枚举类
 * Created by pohoulong on 2017/10/15.
 */
public enum SeckillStateEnum {

    INVALID_DATA(-1, "无效数据"),SUCCESS_KILL(0,"秒杀成功");

    private int state;

    private String stateInfo;

    SeckillStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public SeckillStateEnum getEnumFromState(int state) {
        for (SeckillStateEnum enums : values()) {
            if (enums.getState() == state) {
                return enums;
            }
        }
        return null;
    }
}

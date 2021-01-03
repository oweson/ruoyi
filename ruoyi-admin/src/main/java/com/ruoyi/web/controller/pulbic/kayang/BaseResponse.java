package com.ruoyi.web.controller.pulbic.kayang;

/**
 * @author oweson
 * @date 2020/12/24 21:34
 */


public class BaseResponse {
    private Integer MsgId;
    private String Msg;
    private String Result;

    public Integer getMsgId() {
        return MsgId;
    }

    public void setMsgId(Integer msgId) {
        MsgId = msgId;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }
}

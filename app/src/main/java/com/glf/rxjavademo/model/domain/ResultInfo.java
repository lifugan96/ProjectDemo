package com.glf.rxjavademo.model.domain;

import java.util.List;

public class ResultInfo<T> {


    /**
     * Code : 1
     * Message : 返回成功
     * data : 1
     */

    private String Code;
    private String Message;
    private List<T> Data;

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public List<T> getData() {
        return Data;
    }

    public void setData(List<T> data) {
        Data = data;
    }
}

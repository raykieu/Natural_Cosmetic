package com.qfedu.natural_cosmetic.vo;


import lombok.Data;

@Data
public class R<T> {
    private Integer code;
    private String msg;
    private T data;

    public static R setOK(String msg,Object data){
        R r = new R();
        r.setCode(200);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
    public static R setERROR(String msg,Object data){
        R r = new R();
        r.setCode(400);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
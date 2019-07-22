package com.seecen.customer.entity;

public class Result {
    //状态: 0、不存在 1、已有该用户2、成功
    private Integer status;
    //返回请求的结果信息
    private String msg;

    public Result(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public static Result success(){
        return new Result(1,"");
    }
    public static Result success(String msg){
        return new Result(1,msg);
    }
    public static Result error(String msg){
        return new Result(2,msg);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

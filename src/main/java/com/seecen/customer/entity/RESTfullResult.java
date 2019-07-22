package com.seecen.customer.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: CalcYu
 * Date: 2018/2/20
 */
public class RESTfullResult<T> {
    //200：成功 404: 找不到   500：失败
    private Integer status;
    private String error;

    private T data;


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public RESTfullResult(Integer status, String error) {
        this.status = status;
        this.error = error;
    }

    public RESTfullResult(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    public RESTfullResult(Integer status) {
        this.status = status;
    }

    public static <T> RESTfullResult<T> success() {
        return new RESTfullResult<>(StateEnum.SUCCESS.getState());
    }

    public static <T> RESTfullResult<T> success(T data) {
        return new RESTfullResult<T>(StateEnum.SUCCESS.getState(), data);
    }

    public static <T> RESTfullResult<T> error(String message) {
        return new RESTfullResult<T>(StateEnum.ERROR.getState(), message);
    }

    public enum StateEnum {

        SUCCESS(200), WARN(400), ERROR(500);

        private int state;

        StateEnum(int state) {
            this.state = state;
        }

        public int getState() {
            return state;
        }
    }

//    public static void main(String[] args) {
//        RESTfullResult<User> r = RESTfullResult.success();
//        System.out.println(r);
//        User u = new User();
//        u.setUserName("zs");
//        r = RESTfullResult.success(u);
//        System.out.println(r);
//        r = RESTfullResult.error("失败");
//        System.out.println(r);
//        List<User> list = new ArrayList<>();
//        list.add(u);
//        RESTfullResult<List<User>> rr = RESTfullResult.success(list);
//        System.out.println(rr);
//    }

}

package model;

public class McResponse<T> {
    public McResponse(){}

    private boolean success = false;
    private String message = null;
    private T data = null;

    public boolean isSuccess(){
        return success;
    }

    public String getMessage(){
        return message;
    }

    public T getData(){
        return data;
    }
}

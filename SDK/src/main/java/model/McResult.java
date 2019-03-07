package model;

public class McResult {
    public McResult(){}

    private boolean success = false;
    private String message = null;
    private String data = null;

    private String address;

    public boolean getSuccess(){
        return success;
    }

    public String getMessage(){
        return message;
    }

    public String getData(){
        return data;
    }
}

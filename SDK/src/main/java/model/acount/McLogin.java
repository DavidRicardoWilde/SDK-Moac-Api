package model.acount;

public class McLogin {
    public McLogin(){}

    private boolean success = false;
    private String message = null;
    private String address = null;

    public boolean isSuccess(){
        return success;
    }

    public String getMessage(){
        return message;
    }

    public String getAddress(){
        return address;
    }
}

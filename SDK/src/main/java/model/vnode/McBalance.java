package model.vnode;

public class McBalance {
    public McBalance(){}

    private boolean success = false;
    private String message = null;
    private String data = null;

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

package model.micro;

public class MicroSendRawTransaction {
    public MicroSendRawTransaction(){}
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

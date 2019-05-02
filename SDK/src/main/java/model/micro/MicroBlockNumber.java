package model.micro;

public class MicroBlockNumber {

    public  MicroBlockNumber(){}

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getData() {
        return data;
    }

    private boolean success = false;
    private String message = null;
    private String data = null;


}

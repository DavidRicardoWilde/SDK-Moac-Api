package model.micro;

public class MicroRedeemMoacMintToken {
    public MicroRedeemMoacMintToken(){}

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

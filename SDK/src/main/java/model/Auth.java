package model;

public class Auth {
    private boolean success;
    private String message;
    private String token;

    public Auth(boolean success,String data){
        this.success=success;
        this.token=data;
    }

    public void setSuccess(boolean success){
        this.success=success;
    }
    public boolean getSuccess(){
        return success;
    }

    /***
     *
     * @return auth token
     */
    public String getToken(){
        return token;
    }
    public void setToken(String token){
        this.token=token;
    }

    public String getMessage(){return message;}
    public void setMessage(){this.message=message;}

}

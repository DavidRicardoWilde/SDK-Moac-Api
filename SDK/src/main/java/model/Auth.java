package model;

public class Auth {
    



    private boolean success;
    private String message;
    private String data;

    public Auth(boolean success, String message, String data){
        this.success=success;
        this.message=message;
        this.data=data;
    }

    //error
    public Auth(boolean success, String message){
        this.success = success;
        this.message = message;
        this.data = "";
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
        return data;
    }
    public void setToken(String token){
        this.data=token;
    }

    public String getMessage(){return message;}
    public void setMessage(){this.message=message;}

}

package model;

public class Register {
    private boolean success;
    private String message;
    private Data data;

    /**
     * Parameter: paddress, privatekey, keystore
     */
    public class Data{
        private String address;
        private String privateKey;
        private String keyStore;

        public String getaddress(){
            return address;
        }

        public String getPrivateKey(){
            return privateKey;
        }

        public String getKeyStore(){
            return keyStore;
        }
    }

    public Register(boolean success, String message, Data data){
        this.success = success;
        this.message = message;
        this.data = data;
    }

    //data

    public boolean getSuccess(){
        return success;
    }
    public void setSuccess(boolean success){
        this.success = success;
    }

    public String getMessage(){
        return  message;
    }
    public void setMessage(String message){
        this.message = message;
    }

    /**
     *
     * @return
     */
    public Data getData(){
        return data;
    }
    public void setData(Data data){
        this.data = data;
    }

}

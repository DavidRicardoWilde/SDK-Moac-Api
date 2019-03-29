package model.acount;

public class McImport {
    private boolean success;
    private String message;
    private String address;
    private String encode;
    private String privatekey;

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getAddress() {
        return address;
    }

    public String getEncode() {
        return encode;
    }

    public String getPrivatekey() {
        return privatekey;
    }
}

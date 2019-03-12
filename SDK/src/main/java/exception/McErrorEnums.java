package exception;

public enum McErrorEnums implements McErrorInterface {
    //Network
    NETWORK_CONNECT_LOST("N0001","CONNECT_LOST"),
    NETWORK_CONNECT_BAD("N0002","BAD_CONNECTION"),
        //OTHER NETWORKS ERRORS
    //RESPONSE MESSAGE
    MC_ERROR_ACCOUNT("MC001","ACCOUNT_MISSING"),
    MC_ERROR_PASSWORD("MC002","PASSWORD ERROR");

    private String errorCode;
    private String errorMsg;

    McErrorEnums(String errorCode, String errorMsg) {

    }

    @Override
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}

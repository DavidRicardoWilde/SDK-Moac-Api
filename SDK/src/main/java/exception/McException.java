package exception;

public class McException extends Exception {
    private static final long serialVersionUID = 1L;

    private McErrorEnums mcErrorEnums;

    private String errorDetail;

//    public McException(McErrorEnums mcErrorEnums, String errorDetail){
//        this.mcErrorEnums = mcErrorEnums;
//        this.errorDetail = errorDetail;
//    }

//    public McException(String mcErrorCode){
//
//    }

    public McException(String errorDetail){
        super(errorDetail);
    }

    public McErrorEnums getMcErrorEnums() {
        return mcErrorEnums;
    }

    public void setMcErrorEnums(McErrorEnums mcErrorEnums) {
        this.mcErrorEnums = mcErrorEnums;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }
}

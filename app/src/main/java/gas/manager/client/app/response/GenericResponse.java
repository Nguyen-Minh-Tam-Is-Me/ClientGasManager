package gas.manager.client.app.response;

public class GenericResponse {
    private String code;
    private boolean success;

    public GenericResponse(String code, boolean success) {
        this.code = code;
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}

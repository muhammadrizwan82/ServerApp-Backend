package rizzu82.com.infraserverinventory.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;


public class ServerNotFoundException  extends RuntimeException {
    private Exception exception;
    private String errorCode;
    private String errorMessage;
    public ServerNotFoundException(String errorCode,String errorMessage,Exception exception) {
        super();
        this.errorCode=errorCode;
        this.errorMessage=errorMessage;
        this.exception =exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public Exception getException() {
        return exception;
    }

    public void setErrorCode(String errorCode) { this.errorCode = errorCode;}

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    public ServerNotFoundException(){

    }
}

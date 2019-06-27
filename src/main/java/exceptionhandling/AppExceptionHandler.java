package exceptionhandling;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.domain.Rebel;
@ControllerAdvice
public class AppExceptionHandler {

		@ResponseBody
		@ExceptionHandler(value = ValidationException.class)
		public ResponseEntity<Object> handleException(ValidationException exception, WebRequest request){

		String errorMessageDescription = exception.getLocalizedMessage();
		
		if(errorMessageDescription == null) errorMessageDescription = exception.toString();
		
		ErrorMessage errorMessage = new ErrorMessage(new Date(), exception.getLocalizedMessage());
		
		return new ResponseEntity<>(
				errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
				
		}
}

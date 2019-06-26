package exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Rebel;

public class AppExceptionHandler {

		@ResponseBody
		@ExceptionHandler(value = ValidationException.class)
		public ResponseEntity<String> handleException(ValidationException exception){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMsg());
		}
}

package br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.config;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.config.excepitions.ApiError;

@ControllerAdvice
public class ExeptionHandlerConfig {

    @ExceptionHandler({ ObjectNotFoundException.class })
    public ResponseEntity<ApiError> notFoundException(ObjectNotFoundException exception, HttpServletRequest request) {
        var error = new ApiError(System.currentTimeMillis(), 404, exception.getMessage(), "Recurso não localizado",
                request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}

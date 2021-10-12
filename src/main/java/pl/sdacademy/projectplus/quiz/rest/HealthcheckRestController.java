package pl.sdacademy.projectplus.quiz.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.sdacademy.projectplus.quiz.dto.HealthcheckDto;

@RestController
@RequestMapping("/api/health")
public class HealthcheckRestController {

    @GetMapping
    public HealthcheckDto healthcheckDto() {
        HealthcheckDto dto = new HealthcheckDto(true, "It's working");
        return dto;
    }

}

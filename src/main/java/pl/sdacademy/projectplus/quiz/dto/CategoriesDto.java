package pl.sdacademy.projectplus.quiz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@NoArgsConstructor
@Getter
@ToString
public class CategoriesDto {

    @JsonProperty("trivia_categories")
    private List<CategoryDto> categories;

    @NoArgsConstructor
    @Getter
    @ToString
    public static class CategoryDto {
        private int id;
        private String name;
    }





}

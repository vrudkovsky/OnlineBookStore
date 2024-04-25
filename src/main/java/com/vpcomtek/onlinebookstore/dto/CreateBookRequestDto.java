package com.vpcomtek.onlinebookstore.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.ISBN;
import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateBookRequestDto {
    @NotBlank
    @Size(max = 255, message = "Text limit 255 symbols")
    private String title;
    @NotBlank
    @Size(max = 255, message = "Text limit 255 symbols")
    private String author;
    @ISBN(type = ISBN.Type.ANY)
    @NotBlank
    private String isbn;
    @NotBlank
    @Positive
    private BigDecimal price;
    private String description;
    private String coverImage;
}

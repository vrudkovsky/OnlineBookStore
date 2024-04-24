package com.vpcomtek.onlinebookstore.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateBookRequestDto {
    @NotBlank
    @Size(max = 255, message = "Text limit 255 symbols")
    private String title;
    @NotBlank
    @Size(max = 255, message = "Text limit 255 symbols")
    private String author;
    @NotBlank
    @Pattern(regexp = "^(?:[0-9-]{10}|[0-9-]{13})$",
            message = "Text limit 10 or 13 symbols, without any letters!")
    private String isbn;
    @NotBlank
    @Min(0)
    private BigDecimal price;
    private String description;
    private String coverImage;
}

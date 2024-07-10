package com.kody.kiwi.domain.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ServiceErrorRequest {
    @NotBlank
    private String title;
    @NotBlank
    private String content;
}

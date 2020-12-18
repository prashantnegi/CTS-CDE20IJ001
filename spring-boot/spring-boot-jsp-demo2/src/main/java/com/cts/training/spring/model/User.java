package com.cts.training.spring.model;

import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Size(min = 3, max = 30)
    private String name;

    @Email(message = "Provide a valid email")
    private String email;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    // @NotBlank
    private Date birthDate;

    @NotBlank
    @Size(min = 4, max = 30)
    private String password;
    
    @NotBlank
    private String profession;
    
}

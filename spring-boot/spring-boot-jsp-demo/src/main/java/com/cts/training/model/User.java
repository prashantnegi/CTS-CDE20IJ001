package com.cts.training.model;

import java.sql.Date;

import javax.validation.constraints.AssertTrue;
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

    @Size(min = 3, max = 50)
    private String name;

    @NotBlank
    @Email(message = "Please provide a valid email")
    private String email;

    @NotBlank
    private String gender;

    @NotBlank
    @Size(min = 8, max = 15)
    private String password;

    @NotBlank
    private String profession;

    @NotBlank
    private String note;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date birthDay;

    @AssertTrue
    private boolean married;
    
}

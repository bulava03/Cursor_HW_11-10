package com.example.Cursor_HW_110.entity.dto;

import com.example.Cursor_HW_110.entity.Name;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class StudentNoListDTO {

    private Name name;
    @Email(message = "Неправильний email")
    private String email;

}

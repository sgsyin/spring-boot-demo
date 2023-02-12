package com.me.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest {

    @NotBlank(message = "嘉宾名字不能为空")
    private String name;
    @NotBlank
    private String role;

}

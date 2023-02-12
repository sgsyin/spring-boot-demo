package com.me.controller;

import com.me.bean.Guest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@Controller
public class NewGuestController {

    /**
     * @Valid  直接放在bean前方
     * 用来校验它是否符合注解规则
     * 校验不通过时  直接返回400 和  失败原因
     * 处理方式是，遍历全部属性，失败结果全部返回
     * @param guest
     * @return
     */
    @PostMapping("/hello")
    @ResponseBody
    public String hello(@Valid Guest guest, BindingResult result){
        if (result.getErrorCount()>0){
            List<FieldError> fieldErrorList = result.getFieldErrors();
            StringBuffer stringBuffer = new StringBuffer();
            for(FieldError fieldError : fieldErrorList){
                stringBuffer.append(fieldError.getField());
                stringBuffer.append("\t");
                stringBuffer.append(fieldError.getDefaultMessage());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }
        return "hello world";
    }

    @RequestMapping("/error404")
    public String error404(){
        return "error404";
    }
}

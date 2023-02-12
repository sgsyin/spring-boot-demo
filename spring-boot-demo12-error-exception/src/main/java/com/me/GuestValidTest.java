package com.me;

import com.me.bean.Guest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class GuestValidTest {
    public static void main(String[] args) {
        //通过Validation创建一个Validator实例
//        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        //创建一个“快速失败模式”的实例
        Validator validator = Validation.byDefaultProvider().configure()
                .addProperty("hibernate.validator.fail_fast","true")
                .buildValidatorFactory().getValidator();
        //创建一个不符合要求的bean
        Guest guest = new Guest("","");
        //开始验证，接收验证结果
        Set<ConstraintViolation<Guest>> validates = validator.validate(guest);
        for (ConstraintViolation<Guest> validate:validates){
            System.out.println(validate.getPropertyPath()+"\t"+validate.getMessage());
        }
    }
}

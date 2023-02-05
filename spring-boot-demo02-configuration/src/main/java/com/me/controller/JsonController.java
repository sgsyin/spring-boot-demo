package com.me.controller;

import com.me.config.FootConfig;
import com.me.config.VegetablesConfig;
import com.me.domain.Foot;
import com.me.domain.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController
 * 是@Controller和@ResponseBody的组合
 * 返回json形式的响应结果,而不是视图
 */
@RestController
public class JsonController {

//    @Value("${foot.meat}")
//    private String meat;
//    @Value("${foot.rice}")
//    private String rice;

    @Autowired
    private FootConfig footConfig;

    @RequestMapping("/json")
    public Foot json(){
        Foot foot = new Foot();
//        foot.setMeat(meat);
//        foot.setRice(null);

        foot.setMeat(footConfig.getMeat());
        foot.setRice(footConfig.getRice());
        foot.setSauce(footConfig.getSauce());
        return foot;
    }

    @Autowired
    private VegetablesConfig vegetablesConfig;

    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());
        return vegetables;
    }

//    @Value("${info.username}")
//    private String username;
//    @Value("${info.password}")
//    private String password;
//
//    @RequestMapping("/info")
//    public String info(){
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append(username);
//        stringBuffer.append("\t");
//        stringBuffer.append(password);
//        return stringBuffer.toString();
//    }
}

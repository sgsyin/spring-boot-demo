package com.me.controller;

import com.me.config.FootConfig;
import com.me.domain.Foot;
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
        return foot;
    }
}

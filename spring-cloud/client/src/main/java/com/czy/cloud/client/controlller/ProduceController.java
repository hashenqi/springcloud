package com.czy.cloud.client.controlller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ProduceController
 * @Description: TODO
 * @Author chenzeyao
 * @Date 2021/1/19
 **/
@RestController
@RequestMapping("/produce")
public class ProduceController {

    @RequestMapping("/detail")
    public String detail(){
        return "client成功";
    }

    @RequestMapping("/detail2")
    public String detail2(){
        return "client2成功";
    }

}

package com.czy.cloud.client.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ProduceController
 * @Description: TODO
 * @Author chenzeyao
 * @Date 2021/1/19
 **/
@RestController
@RequestMapping("/produce")
public class ProduceController {

    private static final String urlPrex = "http://";

    private static final String productId = "provider/product/getId";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/detail")
    public String detail(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity(urlPrex + productId, String.class);
        return forEntity.getBody();
    }

    @RequestMapping("/detail2")
    public String detail2(){
        return "client2成功";
    }

}

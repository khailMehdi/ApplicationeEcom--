package org.example.customerservice.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RefreshScope
@RestController
public class ConfigRestControlor {
     @Autowired private CustomerConfigParm customerConfigParm;
    @Value("${global.params.p1}")
    private String a ;
    @Value("${global.params.p2}")
    private String b ;

    @GetMapping("/testConfig1")
    public Map<String, String> testConfig() {
        return Map.of("a",a,"b",b);

    }

    @GetMapping("/testConfig2")
    public CustomerConfigParm CustomtestConfig2() {
        return customerConfigParm;

    }

}

package org.sid.billing.web;

import org.sid.billing.configs.TokenConfigConsul;
import org.sid.billing.configs.UserConfigVault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConculConfigRestController {

    @Autowired
    private TokenConfigConsul tokenConfig;
    @Autowired
    private UserConfigVault userConfig;

    @GetMapping("/myconfig")
    public Map<String,Object> myconfig(){
        return Map.of("tokenConfig",tokenConfig ,
                    "userConfig",userConfig
                );
    }


}

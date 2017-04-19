package net.djhurley;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DJHURLEY on 19/04/2017.
 */

@RefreshScope
@Component
@RestController
class MessageRestController {

    @Value("${message.greeting}")
    private String message;

    @RequestMapping("/")
    String getMessage() {
        return this.message;
    }
}

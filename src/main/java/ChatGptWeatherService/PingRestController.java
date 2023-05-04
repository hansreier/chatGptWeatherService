package ChatGptWeatherService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingRestController {

    @GetMapping( "/ping")
    public ResponseEntity<String> getPing() {
        return ResponseEntity.ok("pong");
    }

}

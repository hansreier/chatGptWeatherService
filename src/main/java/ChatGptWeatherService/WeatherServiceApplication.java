package ChatGptWeatherService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController //Forgotten by ChatGPT
public class WeatherServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherServiceApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @GetMapping("/met") //Forgotten by ChatGPT
    public void getWeather() {
        System.out.println("Hei");
        String url = "https://api.met.no/weatherapi/locationforecast/2.0/compact?lat=59.911491&lon=10.757933";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);
    }

    @GetMapping( "/pils")
    public ResponseEntity<String> getPing() {
        return ResponseEntity.ok("pols");
    }

}
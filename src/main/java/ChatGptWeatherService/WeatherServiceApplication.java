package ChatGptWeatherService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherServiceApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    public void getWeather() {
        String url = "https://api.met.no/weatherapi/locationforecast/2.0/compact?lat=59.911491&lon=10.757933";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);
    }

}
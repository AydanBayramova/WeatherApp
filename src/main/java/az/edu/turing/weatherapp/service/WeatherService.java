package az.edu.turing.weatherapp.service;

import az.edu.turing.weatherapp.model.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final RestTemplate restTemplate;

    public  WeatherResponse  getWeather(String city){
        String apiKey = "ef1bcb530a0b0bc40ac79254dd4d4b9f";
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

            return restTemplate.getForObject(url, WeatherResponse.class);
    }


}

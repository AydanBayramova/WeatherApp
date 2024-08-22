package az.edu.turing.weatherapp.controller;

import az.edu.turing.weatherapp.model.WeatherResponse;
import az.edu.turing.weatherapp.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:63342")
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherResponse getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }
}

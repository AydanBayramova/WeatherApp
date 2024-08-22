package az.edu.turing.weatherapp.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class WeatherResponse {
    private String name;
    private Main main;
}

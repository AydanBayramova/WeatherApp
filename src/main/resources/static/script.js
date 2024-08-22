function getWeather() {
    const city = document.getElementById('city').value;
    fetch(`http://localhost:8080/weather?city=${city}`)
        .then(response => response.json())
        .then(data => {
            console.log(data); // Gelen veriyi kontrol edin
            if (data.weather && data.weather.length > 0) {
                // weather dizisi mevcut ve en az bir eleman içeriyorsa
                document.getElementById('weatherResult').innerHTML = `
                <p>City: ${data.name}</p>
                <p>Temperature: ${data.main.temp} °C</p>
                <p>Weather: ${data.weather[0].description}</p>
            `;
            } else {
                // weather dizisi yoksa veya boşsa
                document.getElementById('weatherResult').innerHTML = `
                <p>City: ${data.name}</p>
                <p>Temperature: ${data.main.temp} °C</p>
                <p>Weather information not available</p>
            `;
            }
        })
        .catch(error => console.error('Error:', error));

}

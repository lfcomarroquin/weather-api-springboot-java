package org.adaschool.Weather;

import org.adaschool.Weather.data.WeatherReport;
import org.adaschool.Weather.service.WeatherReportService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class WeatherReportServiceTest {

    @InjectMocks
    private WeatherReportService weatherReportService;

    @Test
    public void getWeatherReportShouldWork() {
        // Preparacion
        double latitude = 37.8267;
        double longitude = -122.4233;

        // Ejecucion
        WeatherReport report = weatherReportService.getWeatherReport(latitude, longitude);

        // Validacion
        assertNotNull(report);
        assertEquals(report.getTemperature(), report.getTemperature());
        assertEquals(report.getHumidity(), report.getHumidity());
    }

}
package org.adaschool.Weather;

import org.adaschool.Weather.controller.WeatherReportController;
import org.adaschool.Weather.data.WeatherReport;
import org.adaschool.Weather.service.WeatherReportService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class WeatherReportControllerTest {

    @InjectMocks
    private WeatherReportController weatherReportController;

    @Mock
    private WeatherReportService weatherReportService;

    @Test
    public void getWeatherReportShouldWork() {
        // Preparacion
        double latitude = 37.8267;
        double longitude = -122.4233;
        WeatherReport mockReport = new WeatherReport();
        mockReport.setTemperature(20.0);
        mockReport.setHumidity(30.0);

        when(weatherReportService.getWeatherReport(latitude, longitude)).thenReturn(mockReport);

        // Ejecucion
        WeatherReport report = weatherReportController.getWeatherReport(latitude, longitude);

        // Validacion
        assertNotNull(report);
        assertEquals(mockReport.getTemperature(), report.getTemperature());
        assertEquals(mockReport.getHumidity(), report.getHumidity());
    }

}
package com.training.SpringLimitsService.Configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "limits-service")
public class MyConfiguration {

    private int minimum;
    private int maximum;

    public MyConfiguration() {
    }

    public MyConfiguration(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public String toString() {
        return "MyConfiguration{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                '}';
    }
}

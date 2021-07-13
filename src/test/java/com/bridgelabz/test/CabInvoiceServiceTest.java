package com.bridgelabz.test;

import com.bridgelabz.main.CabInvoiceService;
import com.bridgelabz.main.Ride;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceServiceTest {
    CabInvoiceService cabInvoiceService = new CabInvoiceService();

    @Test
    public void givenDistanceAndTime_shouldReturn_totalFare(){
        double distance = 5.0;
        int time = 15;
        double fare = cabInvoiceService.fareCalculator(distance, time);
        Assertions.assertEquals(65, fare, 0.0);
    }

    @Test
    public void givenLessDistanceAndTime_shouldReturnMinFare(){
        double distance = 0.1;
        int time = 2;
        double fare = cabInvoiceService.fareCalculator(distance, time);
        Assertions.assertEquals(5, fare, 0.0);
    }

    @Test
    public void givenMultipleRides_shouldReturnInvoiceSummary(){
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1),
                new Ride(4.1, 25)
        };
        double totalFare = cabInvoiceService.fareCalculateForMultipleRides(rides);
        Assertions.assertEquals(96, totalFare, 0);
    }
}

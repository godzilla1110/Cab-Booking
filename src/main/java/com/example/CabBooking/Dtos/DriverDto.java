package com.example.CabBooking.Dtos;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DriverDto {
    private String name;
    private String gender;
    private int age;
    private String vehicleDetails;
    private LocationDto currentLocation;
    private boolean available = true;

}

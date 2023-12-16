package ru.itis.clientservice.dto;

import ru.itis.clientservice.dto.response.CinemaResponse;
import ru.itis.clientservice.dto.response.HotelResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InfoDto {
    private List<HotelResponse> hotels;
    private List<CinemaResponse> cinemas;
}

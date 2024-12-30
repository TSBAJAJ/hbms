package com.hmbs.hotel_service.mapper;

import com.hmbs.hotel_service.dto.HotelDto;
import com.hmbs.hotel_service.entity.Hotel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HotelMapper {

    Hotel toEntity(HotelDto hotelDto);

    HotelDto toDto(Hotel hotel);
}

package com.hmbs.hotel_service.service;

import com.hmbs.hotel_service.dto.HotelDto;
import com.hmbs.hotel_service.entity.Hotel;
import com.hmbs.hotel_service.mapper.HotelMapper;
import com.hmbs.hotel_service.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class HotelService {

    private final HotelMapper hotelMapper;
    private final HotelRepository hotelRepository;

    public HotelDto createHotel(HotelDto hotelDto) {

//        todo - check already exists or not

        long milliseconds = System.currentTimeMillis();
        hotelDto.setCreatedOn(milliseconds);
        hotelDto.setUpdatedOn(milliseconds);
        log.info("dto : " + hotelDto);
        Hotel hotelEntity = hotelMapper.toEntity(hotelDto);
        log.info("" + hotelEntity);
        hotelEntity = hotelRepository.save(hotelEntity);

        return hotelMapper.toDto(hotelEntity);

    }
}

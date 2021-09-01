package com.example.demowt.strategy.service.impl;

import com.example.demowt.strategy.annotation.TravelType;
import com.example.demowt.strategy.domain.Travel;
import com.example.demowt.strategy.service.ITravelService;
import com.example.demowt.strategy.travelenum.TravelTypeEnum;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author caowq
 * @date 2021-08-31 17:09
 */
@Service
@TravelType(value = {TravelTypeEnum.TRAVEL_TYPE_BASE_GEOGRAPHICAL_LANDSCAPE})
public class GeographicalLandscapeTravelService implements ITravelService {

    @Override
    public List<Travel> getTravelByCondition(String value, String touristName) {
        return Collections.singletonList(Travel
                .builder()
                .name(TravelTypeEnum.TRAVEL_TYPE_BASE_GEOGRAPHICAL_LANDSCAPE.getName())
                .value(value)
                .tourist(Collections.singletonList(touristName))
                .build());
    }

}

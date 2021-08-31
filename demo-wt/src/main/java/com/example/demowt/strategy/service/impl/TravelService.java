package com.example.demowt.strategy.service.impl;

import com.example.demowt.strategy.domain.Travel;
import com.example.demowt.strategy.service.ITravelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caowq
 * @date 2021-08-31 17:55
 */
@Service
public class TravelService implements ITravelService {

    @Override
    public List<Travel> getTravelByCondition(String value, String touristName) {
        return new ArrayList<>();
    }

}

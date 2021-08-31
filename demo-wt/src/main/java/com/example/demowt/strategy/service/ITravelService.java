package com.example.demowt.strategy.service;

import com.example.demowt.strategy.domain.Travel;

import java.util.List;

/**
 * @author caowq
 * @date 2021-08-31 17:10
 */
public interface ITravelService {

    List<Travel> getTravelByCondition(String value, String touristName);

}

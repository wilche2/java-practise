package com.example.demowt.strategy;

import com.example.demowt.strategy.domain.Travel;
import com.example.demowt.strategy.service.ITravelService;
import com.example.demowt.strategy.travelenum.TravelTypeEnum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.example.demowt.strategy.common.TravelCommonInit.travelServiceMap;

/**
 * @author caowq
 * @date 2021-08-31 17:47
 */
@SpringBootTest
public class TravelTest {

    @Resource
    private ITravelService travelService;

    @Test
    public void travelTest1() {
        List<Travel> travelByCondition = getTravelService(TravelTypeEnum.TRAVEL_TYPE_BASE_CULTURAL_LANDSCAPE).getTravelByCondition("test1", "wilche");
        System.out.println("travelByCondition = " + Arrays.toString(travelByCondition.toArray()));
    }

    private ITravelService getTravelService(TravelTypeEnum type) {
        ITravelService service = travelServiceMap.get(type);
        return service == null ? this.travelService : service;
    }

}

package com.example.demowt.strategy;

import com.example.demowt.strategy.common.TravelCommonInit;
import com.example.demowt.strategy.domain.Travel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author caowq
 * @date 2021-08-31 17:47
 */
@SpringBootTest
public class TravelTest {

    @Test
    public void travelTest1() {
        List<Travel> travelByCondition = TravelCommonInit.travelServiceMap.get("GL").getTravelByCondition("test1", "wilche");
        System.out.println("travelByCondition = " + Arrays.toString(travelByCondition.toArray()));
    }

}

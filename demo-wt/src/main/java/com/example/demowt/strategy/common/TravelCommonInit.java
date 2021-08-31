package com.example.demowt.strategy.common;

import com.example.demowt.strategy.annotation.TravelType;
import com.example.demowt.strategy.service.ITravelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author caowq
 * @date 2021-08-31 17:25
 */
@Slf4j
@Component
public class TravelCommonInit implements ApplicationContextAware {

    public static Map<String, ITravelService> travelServiceMap = new HashMap<>();

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    public void setTravelInit() {
        Map<String, Object> annotation = applicationContext.getBeansWithAnnotation(TravelType.class);
        Set<Map.Entry<String, Object>> entries = annotation.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            if (entry.getValue() instanceof ITravelService) {
                ITravelService obj = (ITravelService) entry.getValue();
                String[] values = obj.getClass().getAnnotation(TravelType.class).value();
                for (String value : values) {
                    log.info("注入对象 value={}, obj={}", value, obj);
                    travelServiceMap.put(value, obj);
                }
            }
        }
    }

}

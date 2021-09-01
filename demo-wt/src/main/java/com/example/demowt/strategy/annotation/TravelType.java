package com.example.demowt.strategy.annotation;

import com.example.demowt.strategy.travelenum.TravelTypeEnum;
import org.springframework.stereotype.Indexed;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
@Inherited
public @interface TravelType {
    String name() default "";
    TravelTypeEnum[] value() default TravelTypeEnum.TRAVEL_TYPE_BASE_OTHER;
}

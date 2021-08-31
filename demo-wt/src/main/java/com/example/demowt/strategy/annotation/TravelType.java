package com.example.demowt.strategy.annotation;

import org.springframework.stereotype.Indexed;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
@Inherited
public @interface TravelType {
    String name() default "";
    String[] value() default "";
}

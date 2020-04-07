package com.upluis.homework.spring.v1.demo.mvcframework.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPService {
    String value() default "";
}

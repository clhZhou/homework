package com.upluis.homework.spring.v1.demo.mvcframework.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPAutowired {
    String value() default "";
}

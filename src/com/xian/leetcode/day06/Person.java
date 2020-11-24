package com.xian.leetcode.day06;

import java.lang.annotation.*;

/**
 * @author xiancreate
 * @create 2020-11-17 10:54
 * @Description:
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Person {

    String name() default "basic_name";
    int age() default 18;

}

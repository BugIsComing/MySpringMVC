package com.lc.annotation;

/**
 * @Author:LC
 * @Date:Created in 22:37 2018/3/27
 * @Modifyed by:
 */
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {
    /**
     * 表示参数的别名，必填
     * @return
     */
    String value();

}

package com.example.shoporder.annotation;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@NacosPropertySource(dataId = "")
@Documented
public @interface EnableHuaihaiNacos {

    @AliasFor( annotation = NacosPropertySource.class, attribute = "dataId")
    String app();

    @AliasFor(annotation = NacosPropertySource.class, attribute = "autoRefreshed")
    boolean refresh() default true;
}

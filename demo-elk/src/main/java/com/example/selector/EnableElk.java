package com.example.selector;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import({ElkSelector.class})//可以是列表,导入很多选择器,用于导入FruitConfigurationSelector选择器
public @interface EnableElk {
}
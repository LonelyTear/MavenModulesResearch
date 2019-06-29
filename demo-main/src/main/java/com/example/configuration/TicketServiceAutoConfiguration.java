package com.example.configuration;

import com.example.bean.Hero;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//标注这是一个配置类，这个类的位置不需要在启动类MySpringBootApplication的子包下，因为由META-INF/spring.factories指定了加载位置
@ConditionalOnWebApplication//添加一些条件（也可以不加）web项目时才有效
@ConditionalOnClass({String.class})//ITicketService.class存在时本配置才有效
//@ConditionalOnMissingClass({"com.example.simple.service.ITicketService"})//指定类不存在的时候配置才有效
//@EnableConfigurationProperties(TicketProperties.class)//让TicketProperties在当前配置中直接生效
//@ComponentScan(basePackages={"com.example"})
public class TicketServiceAutoConfiguration {//声明自动配置类

//    @Autowired
//    TicketProperties ticketProperties;//自动包装

    //声明自动装配的Bean,这样当于在项目启动时就内置加载了该Bean
    @Bean
    //这个配置就是SpringBoot可以优先使用自定义Bean的核心所在，如果没有我们的自定义Bean ITicketService.class 存在, 那么才会自动配置一个新的Bean
    @ConditionalOnMissingBean(String.class)
    public Hero ticketService() {
        Hero hero = new Hero();
        return hero;
    }

    // 参考: https://blog.csdn.net/xcy1193068639/article/details/81517456
    //@ConditionOnBean在判断list的时候，如果list没有值，返回false，否则返回true
    //@ConditionOnMissingBean在判断list的时候，如果list没有值，返回true，否则返回false，其他逻辑都一样

}
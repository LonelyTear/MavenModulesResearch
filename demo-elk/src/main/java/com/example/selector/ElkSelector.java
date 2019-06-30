package com.example.selector;

import com.example.configuration.ElkAutoConfiguration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 根据ImportSelector接口源码注释说明，其主要作用是收集需要导入的配置类，
 * 如果该接口的实现类同时实现EnvironmentAware， BeanFactoryAware ，BeanClassLoaderAware或者ResourceLoaderAware，
 * 那么在调用其selectImports方法之前先调用上述接口中对应的方法，
 * 如果需要在所有的@Configuration处理完在导入时可以实现DeferredImportSelector接口。
 */
public class ElkSelector implements ImportSelector, BeanFactoryAware {
    private BeanFactory beanFactory;


    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        importingClassMetadata.getAnnotationTypes().forEach(System.out::println);//打印配置类上的所有注解
        System.out.println(beanFactory);//打印所有定义好的bean
        return new String[]{//重点在此,返回指定配置类的全类名,返回之后在其它地方会把该配置类作为正常的@Configuration注解类做预加载bean操作
                ElkAutoConfiguration.class.getName()
        };
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

}



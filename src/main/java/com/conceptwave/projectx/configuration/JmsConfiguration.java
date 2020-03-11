package com.conceptwave.projectx.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MarshallingMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class JmsConfiguration {
    @Value("${context.path}")
    private  String contextPath;

    @Bean
    public MarshallingMessageConverter marshallingMessageConverter(final Jaxb2Marshaller jaxb2Marshaller) {
        return new MarshallingMessageConverter(jaxb2Marshaller);
    }

    @Bean
    Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath(contextPath);
        return jaxb2Marshaller;
    }
}

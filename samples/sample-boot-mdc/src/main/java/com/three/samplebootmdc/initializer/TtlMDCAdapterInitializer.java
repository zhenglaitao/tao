package com.three.samplebootmdc.initializer;

import org.slf4j.TtlMDCAdapter;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class TtlMDCAdapterInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {

        //加载TtlMDCAdapter实例
        TtlMDCAdapter.getInstance();
    }
}

package com.three.samplebootmdc;

import com.three.samplebootmdc.initializer.TtlMDCAdapterInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SampleBootMdcApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SampleBootMdcApplication.class);
        application.addInitializers(new TtlMDCAdapterInitializer());
        application.run(args);
    }

}

package org.zalando.zmon.config;

import io.opentracing.Tracer;
import io.opentracing.util.GlobalTracer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("jaeger")
public class TracingConfig {

    private String samplerType;
    private int samplerParam;
    private String serviceName;

    public String getSamplerType() {
        return samplerType;
    }

    public void setSamplerType(String samplerType) {
        this.samplerType = samplerType;
    }

    public int getSamplerParam() {
        return samplerParam;
    }

    public void setSamplerParam(int samplerParam) {
        this.samplerParam = samplerParam;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}

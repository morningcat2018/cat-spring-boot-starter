package morning.cat.cat.configuration;

import morning.cat.cat.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/9/23 10:40 AM
 */
@Configuration
@ConditionalOnClass(CatService.class)
@EnableConfigurationProperties(CatServiceProperties.class)
public class CatAutoConfiguration {

    private final CatServiceProperties properties;

    @Autowired
    public CatAutoConfiguration(CatServiceProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "cat.service", value = "enabled", havingValue = "true")
    CatService catService() {
        return new CatService(properties);
    }
}

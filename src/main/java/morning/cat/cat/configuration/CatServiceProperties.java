package morning.cat.cat.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/9/23 10:42 AM
 */
@ConfigurationProperties("cat.service")
public class CatServiceProperties {
    private String catNo;
    private String mimiName;


    public String getCatNo() {
        return catNo;
    }

    public void setCatNo(String catNo) {
        this.catNo = catNo;
    }

    public String getMimiName() {
        return mimiName;
    }

    public void setMimiName(String mimiName) {
        this.mimiName = mimiName;
    }
}

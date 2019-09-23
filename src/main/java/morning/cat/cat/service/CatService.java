package morning.cat.cat.service;

import morning.cat.cat.configuration.CatServiceProperties;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/9/23 10:43 AM
 */
public class CatService {
    private CatServiceProperties properties;

    public CatService(CatServiceProperties properties) {
        this.properties = properties;
    }

    public String spleep() {
        return properties.getMimiName() + " is sleep;";
    }

    public String run() {
        return properties.getMimiName() + " is runing;";
    }

    public String mimi() {
        return properties.getMimiName() + "  喵喵;";
    }

    public String sayNo() {
        return properties.getMimiName() + "  no id " + properties.getCatNo();
    }
}

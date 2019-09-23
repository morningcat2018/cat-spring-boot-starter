package morning.cat.catspringbootstarter;

import morning.cat.cat.configuration.CatAutoConfiguration;
import morning.cat.cat.service.CatService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CatAutoConfiguration.class})
@ComponentScan("morning.cat.cat")
public class CatSpringBootStarterApplicationTests {

    @Autowired
    CatService catService;

    @Test
    public void contextLoads() {
        System.out.println(catService.mimi());
    }

}

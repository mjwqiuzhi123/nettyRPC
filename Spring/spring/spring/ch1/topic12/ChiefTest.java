package spring.ch1.topic12;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by louyuting on 17/1/20.
 * 注入Map
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring/ch1/topic12/ApplicationContext-test.xml"})
public class ChiefTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testChief(){
        Chief jack = (Chief)applicationContext.getBean("jack");
        jack.userOvens();

        System.out.println("--------------------");

        Chief rose = (Chief)applicationContext.getBean("rose");
        rose.userOvens();
    }
}

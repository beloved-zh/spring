import com.zh.mapper.UserMapper;
import com.zh.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void findAll(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("UserMapper2", UserMapper.class);

        List<User> list = userMapper.findAll();

        for (User user : list) {
            System.out.println(user);
        }
    }

}

import com.zh.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        //获取spring上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService ser = (UserService) context.getBean("ser");

        ser.getUser();
    }

}

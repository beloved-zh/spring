import com.zh.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //对象由spring来创建，管理，分配
        Hello hello = (Hello) context.getBean("hello");

        System.out.println(hello.toString());
    }
}

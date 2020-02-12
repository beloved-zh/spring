import com.zh.config.AppConfig;
import com.zh.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        //如果完全使用了配置类，只能通过AnnotationConfig上下文获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        User user = context.getBean("user", User.class);

        System.out.println(user.getName());

    }

}

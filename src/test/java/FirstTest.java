import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.egartech.database.pool.ConnectionPool;

public class FirstTest {

    @Test
    void oneTest() {
        var context = new ClassPathXmlApplicationContext("application.xml");

        var connectionPool1 = context.getBean("pool1", ConnectionPool.class);
        var connectionPool2 = context.getBean("pool2", ConnectionPool.class);
        System.out.println("connectionPool1: " + connectionPool1);
        System.out.println("connectionPool2: " + connectionPool2);
    }
}

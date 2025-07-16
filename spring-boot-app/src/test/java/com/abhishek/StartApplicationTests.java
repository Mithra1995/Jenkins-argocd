import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StartApplicationTests {

    @Test
    void contextLoads() {
        // Basic Spring context loading test
    }

    @Test
    void testIndexViewNameAndModelAttributes() {
        StartApplication app = new StartApplication();
        Model model = new ExtendedModelMap();

        String viewName = app.index(model);

        assertEquals("index", viewName);
        assertEquals("I have successfuly built a sprint boot application using Maven", model.getAttribute("title"));
        assertEquals("This application is deployed on to Kubernetes using Argo CD", model.getAttribute("msg"));
    }
}

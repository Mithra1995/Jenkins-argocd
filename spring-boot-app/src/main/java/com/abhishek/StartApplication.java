package com.abhishek;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.ModelMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StartApplicationTests {

    @Test
    void contextLoads() {
        // Just tests if the Spring context loads successfully
    }

    @Test
    void testIndexViewName() {
        StartApplication app = new StartApplication();
        ModelMap model = new ModelMap();
        String viewName = app.index(model);

        assertEquals("index", viewName);
        assertEquals("I have successfuly built a sprint boot application using Maven", model.get("title"));
        assertEquals("This application is deployed on to Kubernetes using Argo CD", model.get("msg"));
    }
}

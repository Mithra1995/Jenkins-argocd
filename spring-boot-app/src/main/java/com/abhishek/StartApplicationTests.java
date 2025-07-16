package com.abhishek;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.ModelMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StartApplicationTests {

    @Test
    void contextLoads() {
        // Basic Spring context test
    }

    @Test
    void testIndexViewName() {
        StartApplication app = new StartApplication();
        ModelMap model = new ModelMap();
        String view = app.index(model);

        assertEquals("index", view);
        assertEquals("I have successfuly built a sprint boot application using Maven", model.get("title"));
        assertEquals("This application is deployed on to Kubernetes using Argo CD", model.get("msg"));
    }
}


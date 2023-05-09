package com.example.myproject.webapp;
import com.example.myproject.webapp.Service.WebService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {WebService.class})
public class WebAppUnitTest {

    @Autowired
    private WebService service;

    @Test
    public void testGetMessage_shouldReturnExpectedString(){
        String message= service.getMessage();
        System.out.println(message);
        assertEquals("Hello, world!",message);
    }
}

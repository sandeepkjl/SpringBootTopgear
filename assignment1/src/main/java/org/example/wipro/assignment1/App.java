package org.example.wipro.assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext= SpringApplication.run(App.class, args);
        String beans[]=appContext.getBeanDefinitionNames();
        for (String bean: beans) {
            System.out.println(bean);
        }
        		
    }
}

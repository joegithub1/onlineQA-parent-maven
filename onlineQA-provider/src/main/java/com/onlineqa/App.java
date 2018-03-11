package com.onlineqa;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context = 
        		new ClassPathXmlApplicationContext(new String[]{"ApplicationContent-dubbo.xml"});
        
        context.start();
        System.out.println("请按任意键退出。。。");
        System.in.read();
        context.close();
    }
}

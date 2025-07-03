package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class App 
{
    public static void main( String[] args )
    {
        try(var context = new ClassPathXmlApplicationContext("applicationContext.xml")){
            BookService bookService = context.getBean("bookService", BookService.class);
            bookService.displayServiceInfo();
        }
    }
}

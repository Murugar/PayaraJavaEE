package com.iqmsoft.payara.javaee;

import fish.payara.micro.cdi.Outbound;
import javax.ejb.Singleton;
import javax.ejb.Schedule;
import javax.enterprise.event.Event;
import javax.inject.Inject;


@Singleton
public class ProductTimer {
    
    @Inject
    @Outbound(loopBack = true)
    Event<Product> pEvents;

    @Schedule(hour = "*", minute="*", second = "*/5", persistent = false)
    public void generatePrice() {
        
        String symbol = "TEST";
        Product stock = new Product(symbol,"Test Description",(Math.random()*1000.0) + 100.0);
        System.out.println(stock);
        pEvents.fire(stock);
        
    }

}

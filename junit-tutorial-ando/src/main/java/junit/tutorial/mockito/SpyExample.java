// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.mockito;

import java.util.logging.Logger;

public class SpyExample {

    Logger logger = Logger.getLogger(SpyExample.class.getName());
    
    public void doSomething() {
        logger.info("doSomething");
    }
}

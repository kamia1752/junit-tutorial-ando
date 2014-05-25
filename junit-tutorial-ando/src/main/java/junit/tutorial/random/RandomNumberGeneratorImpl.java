// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.random;

import java.util.Random;

public class RandomNumberGeneratorImpl implements RandomNumberGenerator {
    private final Random rand = new Random();
    
    @Override
    public int nextInt() {
        // TODO Auto-generated method stub
        return rand.nextInt();
    }

}

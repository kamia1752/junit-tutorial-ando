// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.random;

import java.util.List;

public class Randoms {
    RandomNumberGenerator generator = new RandomNumberGeneratorImpl();
    
    public <T> T choice(List<T> options) {
        if (options.size() == 0) return null;
        int idx = generator.nextInt() % options.size();
        return options.get(idx);
    }
}

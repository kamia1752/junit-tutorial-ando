// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial;

import java.io.File;

import org.junit.rules.TemporaryFolder;

public class SpecificTemporaryFolder extends TemporaryFolder {
    public File srcFolder;
    public File binFolder;

    
    @Override
    protected void before() throws Throwable {
        // TODO Auto-generated method stub
        super.before();
        srcFolder = newFolder("src");
        binFolder = newFolder("bin");
    }
}

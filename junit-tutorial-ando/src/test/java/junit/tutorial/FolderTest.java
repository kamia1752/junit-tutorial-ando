// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Rule;
import org.junit.Test;

public class FolderTest {

    @Rule
    public SpecificTemporaryFolder specificTemporaryFolder = new SpecificTemporaryFolder();
    
    @Test
    public void サブクラスを作るテスト() throws Exception {
        // SetUp
        // Exercise
        // Verify
        assertThat(specificTemporaryFolder.srcFolder.getName(), is("src"));
        assertThat(specificTemporaryFolder.binFolder.getName(), is("bin"));
    }
}

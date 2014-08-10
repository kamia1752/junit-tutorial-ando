package junit.tutorial.network;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

public class NetworkResourcesTest {

    @Test
    public void test() throws IOException {
        NetworkLoader sut = mock(NetworkLoader.class);
        ByteArrayInputStream bais = new ByteArrayInputStream("Hello World".getBytes());
        when(sut.getInput()).thenReturn(bais);
        NetworkResources resources = new NetworkResources();
        resources.loader = sut;
        assertThat(resources.load(), is("Hello World"));
    }

}

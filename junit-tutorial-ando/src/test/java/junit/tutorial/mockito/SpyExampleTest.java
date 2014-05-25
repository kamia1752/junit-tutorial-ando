// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doAnswer;

import java.util.logging.Logger;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class SpyExampleTest {

    @Test
    public void Mockitoのspyを使ったテスト() throws Exception{
        // SetUp
        SpyExample sut = new SpyExample();
        Logger spy = Mockito.spy(sut.logger);
        final StringBuilder infoLog = new StringBuilder();
        doAnswer(new Answer<Void>(){
            @Override
            public Void answer(InvocationOnMock invocation) throws Throwable {
                infoLog.append(invocation.getArguments()[0]);
                invocation.callRealMethod();
                return null;
            }
        }).when(spy).info(anyString());
        sut.logger = spy;
        // Exercise
        sut.doSomething();
        // Verify
        assertThat(infoLog.toString(), is("doSomething"));
    }

}

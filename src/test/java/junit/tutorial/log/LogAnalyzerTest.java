package junit.tutorial.log;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;

import junit.tutorial.log.LogAnalyzer.AnalyzeException;

import org.hamcrest.collection.IsMapContaining;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LogAnalyzerTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void AnalyzeExceptionを返すことのtest() throws Exception{
        final IOException exception = new IOException();
        expectedException.expect(AnalyzeException.class);
        expectedException.expectMessage("");
        expectedException.expectCause(is(exception));
        
        LogAnalyzer sut = new LogAnalyzer();
        LogLoader mockLoader = mock(LogLoader.class);
        sut.logLoader = mockLoader;
        when(mockLoader.load("a")).thenThrow(exception);
        
        sut.analyze("a");
    }

}

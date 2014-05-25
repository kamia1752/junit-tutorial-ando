// Copyright(c) 2013 GROWTH XPARTNERS, Incorporated.
//
//
package junit.tutorial.mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class MockitoSampleTest {

    @Test
    public void test() {
        // モックオブジェクトの作成
        List<String> mock = mock(List.class);
        assertThat(mock.get(0), is(nullValue()));
        assertThat(mock.contains("Hello"), is(false));
    }

    @Test
    public void test2() {
        // モックオブジェクトの作成
        List<String> stub = mock(List.class);
        when(stub.get(0)).thenReturn("Hello");
        assertThat(stub.get(0), is("Hello"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test3() {
        // モックオブジェクトの作成
        List<String> stub = mock(List.class);
        when(stub.get(0)).thenReturn("Hello");
        when(stub.get(1)).thenReturn("World");
        when(stub.get(2)).thenThrow(new IndexOutOfBoundsException());
        stub.get(2);
    }

    @Test(expected = RuntimeException.class)
    public void test4() {
        List<String> stub = mock(List.class);
        doThrow(new RuntimeException()).when(stub).clear();
        stub.clear();
    }

    @Test
    public void test5() {
        List<String> stub = mock(List.class);
        when(stub.get(anyInt())).thenReturn("Hello");
        assertThat(stub.get(0), is("Hello"));
        assertThat(stub.get(1), is("Hello"));
        assertThat(stub.get(100), is("Hello"));
    }

    @Test
    public void test6() {
        List<String> mock = mock(List.class);
        mock.clear();
        mock.add("Hello");
        mock.add("Hello");
        verify(mock).clear();
        verify(mock, times(2)).add("Hello");
        verify(mock, atLeastOnce()).add("Hello");
        verify(mock, atLeast(1)).add("Hello");
        verify(mock, atMost(3)).add("Hello");
        verify(mock, never()).add("World");
    }

    @Test
    public void test7() {
        List list = new ArrayList();
        List spy = spy(list);
        when(spy.size()).thenReturn(100);
        spy.add("Hello");

        assertThat((String)spy.get(0), is("Hello"));
        assertThat(spy.size(), is(100));
    }
    
    @Test
    public void test8() {
        List<String> list = new java.util.LinkedList<String>();
        List<String> spy = spy(list);
        doReturn("Mockito").when(spy).get(1);
        spy.add("Hello");
        spy.add("World");
        verify(spy).add("Hello");
        verify(spy).add("World");
        assertThat(spy.get(0), is("Hello"));
        assertThat(spy.get(1), is("Mockito"));
    }

}

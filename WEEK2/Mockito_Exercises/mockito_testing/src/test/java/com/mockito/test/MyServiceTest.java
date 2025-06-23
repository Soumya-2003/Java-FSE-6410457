package com.mockito.test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class  MyServiceTest{
    @Test
    public void testExternalApi(){
        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("Mocked Data");

        MyService service = new MyService(mockApi);

        String result = service.fetchData();
        assertEquals("Mocked Data", result);
    }
}

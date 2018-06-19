package au.com.sealink.quicktravel.client.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServerScanErrorCodeTest {
    @Test
    public void testValues() {
        assertEquals(0, ServerScanErrorCode.None.getValue());
        assertEquals(1, ServerScanErrorCode.WrongDate.getValue());
        assertEquals(2, ServerScanErrorCode.WrongResource.getValue());
        assertEquals(3, ServerScanErrorCode.WrongTime.getValue());
    }
}
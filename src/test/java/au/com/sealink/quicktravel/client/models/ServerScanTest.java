package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.models.barcodes.IssuedTicket;
import org.junit.Assert;
import org.junit.Test;

public class ServerScanTest {
    @Test
    public void fromConstructor() {
        ServerScan scan = new ServerScan("1", new IssuedTicket(), ServerScanErrorCode.WrongDate, true);
        Assert.assertEquals("1", scan.getId());
    }

    @Test
    public void fromDefaultConstructor() {
        ServerScan scan = new ServerScan();
        Assert.assertEquals(null, scan.getId());
        Assert.assertEquals(null, scan.getBarcode());
    }
}
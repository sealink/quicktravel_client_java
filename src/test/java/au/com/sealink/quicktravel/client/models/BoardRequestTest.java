package au.com.sealink.quicktravel.client.models;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class BoardRequestTest {
    @Test
    public void fromConstructor() {
        ServerScan scanA = new ServerScan();
        ServerScan scanB = new ServerScan();

        ArrayList<ServerScan>list =new ArrayList<>();
        list.add(scanA);
        list.add(scanB);

        BoardRequest request = new BoardRequest(list);
        Assert.assertEquals(2, request.getBarcodes().size());
    }
}
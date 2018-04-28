package au.com.sealink.quicktravel.client.models.barcodes.core;

import org.junit.Assert;
import org.junit.Test;

public class ConsumerTypeCountTest {

    @Test
    public void totalCount() {
        ConsumerTypeCount count = new ConsumerTypeCount();
        count.put("Adult", 1);
        count.put("Children", 3);
        Assert.assertEquals(4, count.totalCount());
    }
}
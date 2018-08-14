package au.com.sealink.quicktravel.client.services.analytics;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class AnalyticsEventTest {
    @Test
    public void testAttributesAndMetrics() {
        AnalyticsEvent event = new AnalyticsEvent("test_event");
        event.withAttribute("attr_1", "value_1")
                .withAttribute("attr_2", "value_2")
                .withMetric("metric_1", 1.0)
                .withMetric("metric_2", 2.0);

        Map<String, String> allAttributes = event.allAttributes();
        Assert.assertEquals(2, allAttributes.size());
        Assert.assertEquals("value_1", allAttributes.get("attr_1"));
        Assert.assertEquals("value_2", allAttributes.get("attr_2"));

        Map<String, Double> allMetrics = event.allMetrics();
        Assert.assertEquals(2, allMetrics.size());
        Assert.assertEquals(new Double(1.0), allMetrics.get("metric_1"));
        Assert.assertEquals(new Double(2.0), allMetrics.get("metric_2"));

        Assert.assertEquals("test_event", event.getEventType());
    }
}
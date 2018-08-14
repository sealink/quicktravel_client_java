package au.com.sealink.quicktravel.client.services.analytics;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AnalyticsEvent {
    private String eventType;
    private Map<String, String> attributes = new ConcurrentHashMap<>();
    private Map<String, Double> metrics = new ConcurrentHashMap<>();

    public AnalyticsEvent(String eventType) {
        this.eventType = eventType;
    }

    public Map<String, String> allAttributes() {
        return Collections.unmodifiableMap(this.attributes);
    }

    public Map<String, Double> allMetrics() {
        return Collections.unmodifiableMap(this.metrics);
    }

    AnalyticsEvent withAttribute(String name, String value) {
        this.attributes.put(name, value);
        return this;
    }

    AnalyticsEvent withMetric(String name, Double value) {
        this.metrics.put(name, value);
        return this;
    }

    public String getEventType() {
        return eventType;
    }
}

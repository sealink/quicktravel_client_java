package au.com.sealink.quicktravel.client.services.analytics;

public interface AnalyticsService {
    void startSession();
    void stopSession();
    void recordEvent(AnalyticsEvent event);
    AnalyticsEvent createEvent(String type);
    void addGlobalAttribute(String attributeName, String attributeValue);
    void addGlobalAttribute(String eventType, String attributeName, String attributeValue);
    void addGlobalMetric(String metricName, Double metricValue);
    void addGlobalMetric(String eventType, String metricName, Double metricValue);
}

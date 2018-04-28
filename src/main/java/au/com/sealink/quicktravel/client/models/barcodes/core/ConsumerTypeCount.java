package au.com.sealink.quicktravel.client.models.barcodes.core;

import java.util.HashMap;
import java.util.Map;

public class ConsumerTypeCount extends HashMap<String, Integer> {
    public int totalCount() {
        int count = 0;
        for(Map.Entry<String, Integer> entry : this.entrySet()) {
            count += entry.getValue();
        }
        return count;
    }
}

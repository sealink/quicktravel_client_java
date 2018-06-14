package au.com.sealink.quicktravel.client.models;

import java.util.List;

public class BoardRequest {
    private List<ServerScan> barcodes;

    public BoardRequest(List<ServerScan> tickets) {
        barcodes = tickets;
    }

    public List<ServerScan> getBarcodes() {
        return this.barcodes;
    }
}
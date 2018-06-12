package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import au.com.sealink.quicktravel.client.models.barcodes.ITicket;

public class ServerScan {
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("barcode")
    @Expose
    private ITicket barcode;

    @SerializedName("error_code")
    @Expose
    private ServerScanErrorCode errorCode;

    @SerializedName("boarded")
    @Expose
    private Boolean boarded;

    public ServerScan() {

    }

    public ServerScan(String id, ITicket barcode, ServerScanErrorCode errorCode, Boolean boarded) {
        this.setId(id);
        this.setBarcode(barcode);
        this.setErrorCode(errorCode);
        this.setBoarded(boarded);
    }

    //region GETTER/SETTERS
    String getId() { return this.id; }
    void setId(String id) { this.id = id; }

    ITicket getBarcode() { return this.barcode; }
    void setBarcode(ITicket barcode) { this.barcode = barcode; }

    void setErrorCode(ServerScanErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    void setBoarded(Boolean boarded) {
        this.boarded = boarded;
    }
    //endregion
}

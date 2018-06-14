package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.models.barcodes.ITicket;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
        this.setBoarded(false);
    }

    public ServerScan(String id, ITicket barcode, ServerScanErrorCode errorCode, Boolean boarded) {
        this.setId(id);
        this.setBarcode(barcode);
        this.setErrorCode(errorCode);
        this.setBoarded(boarded);
    }

    //region GETTER/SETTERS
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ITicket getBarcode() {
        return this.barcode;
    }

    public void setBarcode(ITicket barcode) {
        this.barcode = barcode;
    }

    public void setErrorCode(ServerScanErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ServerScanErrorCode getErrorCode() {
        return this.errorCode;
    }

    public void setBoarded(Boolean boarded) {
        this.boarded = boarded;
    }

    public Boolean getBoarded() {
        return this.boarded;

    }
    //endregion
}

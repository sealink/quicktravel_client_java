package au.com.sealink.quicktravel.client.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ClientSearchResponse {
    @SerializedName("clients")
    @Expose
    private List<ClientSearchClient> clients = new ArrayList<>();

    @SerializedName("page")
    @Expose
    private int page;

    @SerializedName("pages")
    @Expose
    private int pages;

    @SerializedName("results")
    @Expose
    private int results;

    public List<ClientSearchClient> getClients() {
        return clients;
    }

    public int getPage() {
        return page;
    }


    public int getPages() {
        return pages;
    }

    public int getResults() {
        return results;
    }
}

package com.mciezczak.bcscanner.model;

public class DataSheetEntry {
    public final String Id;
    public final String DataSheetId;
    public final String GPC;
    public final String Info;
    public final Double Quantity;

    public DataSheetEntry(String id, String dataSheetId, String gpc, String info, Double quantity) {
        Id = id;
        DataSheetId = dataSheetId;
        GPC = gpc;
        Info = info;
        Quantity = quantity;
    }
}

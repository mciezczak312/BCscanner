package com.mciezczak.bcscanner.model;

import java.util.Date;
import java.util.List;

public class DataSheet {
    public final String id;
    public final String name;
    public final String warehouse;
    public final Date modified_on;
    public final List<DataSheetEntry> entries;

    public DataSheet(String id, String name, String warehouse, Date modified_on, List<DataSheetEntry> entries) {
        this.id = id;
        this.name = name;
        this.warehouse = warehouse;
        this.modified_on = modified_on;
        this.entries = entries;
    }
}

package com.mciezczak.bcscanner.dummy;

import com.mciezczak.bcscanner.model.DataSheet;
import com.mciezczak.bcscanner.model.DataSheetEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Calendar;


public class DummyContentSheet {
    public static final List<DataSheet> ITEMS = new ArrayList<DataSheet>();

    public static final Map<String, DataSheet> ITEM_MAP = new HashMap<String, DataSheet>();

    private static final int COUNT = 25;

    static {
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DataSheet item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DataSheet createDummyItem(int position) {
        List<DataSheetEntry> testEntries = new ArrayList<DataSheetEntry>();
        testEntries.add(new DataSheetEntry("1", String.valueOf(position), "999", "Info123", 12.));

        return new DataSheet(String.valueOf(position), "Item " + position, "Mag " + position, Calendar.getInstance().getTime(), testEntries);
    }
}

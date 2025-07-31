package org.example;

import org.example.data.JSONData;
import org.example.data.XMLData;

public class ToolAdapter extends AnalysisTool{

    public void analyse(XMLData data) {
        // logic to change XMLData to JSONData
        JSONData jdata = new JSONData();
        jdata.data = data.data;
        jdata.keys = data.tags;
        super.analyse(jdata);
    }

}

package org.example;

import org.example.data.XMLData;

public class Main {
    public static void main(String[] args) {
        XMLData data = new XMLData();
        ToolAdapter tool = new ToolAdapter();
        tool.analyse(data);
    }
}
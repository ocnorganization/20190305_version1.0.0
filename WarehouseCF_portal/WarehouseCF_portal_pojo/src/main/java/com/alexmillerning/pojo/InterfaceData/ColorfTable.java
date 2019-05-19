/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.pojo.InterfaceData;

import java.util.List;

public class ColorfTable {
    private int draw;
    private int recordsTotal;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    private int recordsFiltered;
    private List<?> data;

    @Override
    public String toString() {
        StringBuilder colorfTable = new StringBuilder();
        colorfTable.append(" draw:"+draw);
        colorfTable.append(" recordsTotal:"+recordsTotal);
        colorfTable.append(" recordsFiltered:"+recordsFiltered);
        for (int i = 0; i < data.size(); i++) {
            colorfTable.append(data.get(i).toString());
        }
        return colorfTable.toString();
    }
}

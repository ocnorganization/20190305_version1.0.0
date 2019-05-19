/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.pojo.InterfaceData;

import java.util.List;

public class BasicColorfDrop {
    private List<?> results;

    public List<?> getResults() {
        return results;
    }

    public void setResults(List<?> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        StringBuilder basicColorfDrop = new StringBuilder();
        basicColorfDrop.append("results :");
        for (int i = 0; i < results.size(); i++) {
            basicColorfDrop.append(results.get(i).toString());
        }
        return basicColorfDrop.toString();
    }
}

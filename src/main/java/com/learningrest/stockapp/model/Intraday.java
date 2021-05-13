package com.learningrest.stockapp.model;

import java.time.LocalDate;

public class Intraday {
    
    private LocalDate date;
    private String minute;
    private String label;
    private double high;
    private double low;
    private double open;
    private double close;
    private double average;
    private int volume;
    private int notional;
    private int numberOfTrades;

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }
    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
    /**
     * @return the minute
     */
    public String getMinute() {
        return minute;
    }
    /**
     * @param minute the minute to set
     */
    public void setMinute(String minute) {
        this.minute = minute;
    }
    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }
    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }
    /**
     * @return the high
     */
    public double getHigh() {
        return high;
    }
    /**
     * @param high the high to set
     */
    public void setHigh(double high) {
        this.high = high;
    }
    /**
     * @return the low
     */
    public double getLow() {
        return low;
    }
    /**
     * @param low the low to set
     */
    public void setLow(double low) {
        this.low = low;
    }
    /**
     * @return the open
     */
    public double getOpen() {
        return open;
    }
    /**
     * @param open the open to set
     */
    public void setOpen(double open) {
        this.open = open;
    }
    /**
     * @return the close
     */
    public double getClose() {
        return close;
    }
    /**
     * @param close the close to set
     */
    public void setClose(double close) {
        this.close = close;
    }
    /**
     * @return the average
     */
    public double getAverage() {
        return average;
    }
    /**
     * @param average the average to set
     */
    public void setAverage(double average) {
        this.average = average;
    }
    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }
    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }
    /**
     * @return the notional
     */
    public int getNotional() {
        return notional;
    }
    /**
     * @param notional the notional to set
     */
    public void setNotional(int notional) {
        this.notional = notional;
    }
    /**
     * @return the numberOfTrades
     */
    public int getNumberOfTrades() {
        return numberOfTrades;
    }
    /**
     * @param numberOfTrades the numberOfTrades to set
     */
    public void setNumberOfTrades(int numberOfTrades) {
        this.numberOfTrades = numberOfTrades;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Intraday [average=" + average + ", close=" + close + ", date=" + date + ", high=" + high + ", label="
                + label + ", low=" + low + ", minute=" + minute + ", notional=" + notional + ", numberOfTrades="
                + numberOfTrades + ", open=" + open + ", volume=" + volume + "]";
    }   
}

package com.exam.book.harry;
import org.springframework.stereotype.Component;

public class BookResponse {
    private int id;
    private String seriesName;
    private int price;
    private int amount;

    public int getBookId() {
        return id;
    }

    public void setBookId(int id) {
        this.id = id;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

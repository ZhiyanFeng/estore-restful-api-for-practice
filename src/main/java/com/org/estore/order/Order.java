package com.org.estore.order;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Order {
    private int id;
    private Date orderDate;
    private Time orderTime;
    private double total;
    private String creditcardNumber;
    private int creditcardMonth;
    private int creditcardYear;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_date")
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "order_time")
    public Time getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Time orderTime) {
        this.orderTime = orderTime;
    }

    @Basic
    @Column(name = "total")
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Basic
    @Column(name = "creditcard_number")
    public String getCreditcardNumber() {
        return creditcardNumber;
    }

    public void setCreditcardNumber(String creditcardNumber) {
        this.creditcardNumber = creditcardNumber;
    }

    @Basic
    @Column(name = "creditcard_month")
    public int getCreditcardMonth() {
        return creditcardMonth;
    }

    public void setCreditcardMonth(int creditcardMonth) {
        this.creditcardMonth = creditcardMonth;
    }

    @Basic
    @Column(name = "creditcard_year")
    public int getCreditcardYear() {
        return creditcardYear;
    }

    public void setCreditcardYear(int creditcardYear) {
        this.creditcardYear = creditcardYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                Double.compare(order.total, total) == 0 &&
                creditcardMonth == order.creditcardMonth &&
                creditcardYear == order.creditcardYear &&
                Objects.equals(orderDate, order.orderDate) &&
                Objects.equals(orderTime, order.orderTime) &&
                Objects.equals(creditcardNumber, order.creditcardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderDate, orderTime, total, creditcardNumber, creditcardMonth, creditcardYear);
    }
}

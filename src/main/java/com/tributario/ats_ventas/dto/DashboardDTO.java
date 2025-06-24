package com.tributario.ats_ventas.dto;

import java.math.BigDecimal;

public class DashboardDTO {
    private String month;
    private BigDecimal totalPayments;

    public DashboardDTO(String month, BigDecimal totalPayments) {
        this.month = month;
        this.totalPayments = totalPayments;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BigDecimal getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(BigDecimal totalPayments) {
        this.totalPayments = totalPayments;
    }

    @Override
    public String toString() {
        return "DashboardDTO{" +
                "month='" + month + '\'' +
                ", totalPayments=" + totalPayments +
                '}';
    }
}
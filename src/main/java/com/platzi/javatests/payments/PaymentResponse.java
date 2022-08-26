package com.platzi.javatests.payments;

public class PaymentResponse {

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    enum PaymentStatus{
        OK, ERROR
    }

    private PaymentStatus status;

}

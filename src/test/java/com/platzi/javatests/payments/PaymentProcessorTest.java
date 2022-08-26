package com.platzi.javatests.payments;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {


    @Test
    public void payment_is_correct(){
        PaymentGateway PaymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(PaymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        PaymentProcessor paymentProcessor = new PaymentProcessor(PaymentGateway);

        boolean result_paymentProcessor=paymentProcessor.makePayment(1000);

        assertTrue(result_paymentProcessor);
    }

    @Test
    public void payment_is_wrong(){
        PaymentGateway PaymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(PaymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        PaymentProcessor paymentProcessor = new PaymentProcessor(PaymentGateway);

        boolean result_paymentProcessor=paymentProcessor.makePayment(1000);

        assertFalse(result_paymentProcessor);
    }

}
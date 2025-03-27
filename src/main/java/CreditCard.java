class CreditCard implements PaymentMethod {

    private String cardNumber;
    private String cardOwner;
    private String cvv;
    private String expDate;

    @Override
    public boolean processPayment(double amount) {
        System.out.println("procesando pago para el usuario" + cardOwner);
        return wasPaymentSuccessfull();
    }

    private boolean wasPaymentSuccessfull() {
        return true;
    }
}

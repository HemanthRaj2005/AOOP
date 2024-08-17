package postlabweek3;

public class CreditCardFactory implements PaymentMethodFactory
{
public PaymentMethod createPaymentMethod() {
return new CreditCardPayment();
}
}
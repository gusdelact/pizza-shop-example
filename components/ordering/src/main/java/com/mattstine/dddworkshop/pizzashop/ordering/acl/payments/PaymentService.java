package com.mattstine.dddworkshop.pizzashop.ordering.acl.payments;

import com.mattstine.dddworkshop.pizzashop.infrastructure.domain.valuetypes.Amount;

/**
 * @author Matt Stine
 */
public interface PaymentService {
	PaymentRef createPaymentOf(Amount of);

	void requestPaymentFor(PaymentRef ref);
}

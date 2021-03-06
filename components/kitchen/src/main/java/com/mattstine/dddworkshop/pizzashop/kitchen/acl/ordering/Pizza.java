package com.mattstine.dddworkshop.pizzashop.kitchen.acl.ordering;

import com.mattstine.dddworkshop.pizzashop.infrastructure.domain.valuetypes.Amount;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

/**
 * @author Matt Stine
 */
@Value
public final class Pizza {

	Size size;

	@SuppressWarnings("unused")
	@Builder
	private Pizza(@NonNull Size size) {
		this.size = size;
	}

	public enum Size {
		MEDIUM(Amount.of(6, 0));

		final Amount price;

		Size(Amount price) {
			this.price = price;
		}
	}
}

package com.mercadolibre.poc.useCases;

import com.mercadolibre.poc.integration.doubles.ShippingPresenterDouble;
import com.mercadolibre.poc.integration.doubles.ShippingUseCaseResponseDouble;
import com.mercadolibre.poc.entities.Item;
import com.mercadolibre.poc.entities.User;
import com.mercadolibre.poc.useCases.responses.UseCaseResponse;
import org.junit.Test;

import static com.mercadolibre.poc.entities.ShippingCost.FREE;
import static com.mercadolibre.poc.entities.ShippingCost.NOT_FREE;
import static org.junit.Assert.assertEquals;

public class UseCaseTest {

    @Test
    public void should_return_NOT_FREE_for_user_with_loyalty_level_0() {
        // GIVEN
	    final User user = new User(0);
	    final Item item = new Item(120);

	    final ShippingUseCase useCase = new ShippingUseCase(item, user, new ShippingPresenterDouble());

	    // WHEN
        final UseCaseResponse resp = useCase.doWork();

	    // THEN
	    assertEquals(NOT_FREE, ((ShippingUseCaseResponseDouble) resp).cost);
    }

    @Test
    public void should_return_NOT_FREE_for_user_with_loyalty_level_1() {
        // GIVEN
        final User user = new User(1);
        final Item item = new Item(120);

        final ShippingUseCase useCase = new ShippingUseCase(item, user, new ShippingPresenterDouble());

        // WHEN
        final UseCaseResponse resp = useCase.doWork();

        // THEN
        assertEquals(NOT_FREE, ((ShippingUseCaseResponseDouble) resp).cost);
    }

    @Test
    public void should_return_NOT_FREE_for_user_with_loyalty_level_2_and_item_price_less_than_1200() {
        // GIVEN
        final User user = new User(2);
        final Item item = new Item(120);

        final ShippingUseCase useCase = new ShippingUseCase(item, user, new ShippingPresenterDouble());

        // WHEN
        final UseCaseResponse resp = useCase.doWork();

        // THEN
        assertEquals(NOT_FREE, ((ShippingUseCaseResponseDouble) resp).cost);
    }

    @Test
    public void should_return_FREE_for_user_with_loyalty_level_2_and_item_price_greater_than_1200() {
        // GIVEN
        final User user = new User(2);
        final Item item = new Item(1400);

        final ShippingUseCase useCase = new ShippingUseCase(item, user, new ShippingPresenterDouble());

        // WHEN
        final UseCaseResponse resp = useCase.doWork();

        // THEN
        assertEquals(FREE, ((ShippingUseCaseResponseDouble) resp).cost);
    }

}

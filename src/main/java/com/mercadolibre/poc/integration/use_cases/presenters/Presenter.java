package com.mercadolibre.poc.integration.use_cases.presenters;

import com.mercadolibre.poc.integration.use_cases.responses.UseCaseResponse;

public interface Presenter<T> {

    public UseCaseResponse present(T entityToPresent);

}

package com.mercadolibre.poc.useCases.presenters;

import com.mercadolibre.poc.useCases.responses.UseCaseResponse;

public interface Presenter<T> {

    public UseCaseResponse present(T entityToPresent);

}

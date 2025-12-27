package currencyconverter.service;

import org.springframework.stereotype.Service;
import currencyconverter.model.Currency;
import currencyconverter.repository.CurrencyRepository;

@Service
public class CurrencyService {

    private final CurrencyRepository repository;

    public CurrencyService(CurrencyRepository repository) {
        this.repository = repository;
    }

    public double convertCurrency(String from, String to, Double amount) {

        Currency fromCurrency = repository.findByCurrencyCode(from);
        Currency toCurrency = repository.findByCurrencyCode(to);

        if (fromCurrency == null || toCurrency == null) {
            throw new IllegalArgumentException("Invalid currency code provided.");
        }

        // Conversion formula
        return amount * (toCurrency.getExchangeRate() / fromCurrency.getExchangeRate());
    }
}

package currencyconverter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import currencyconverter.model.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, String> {
    Currency findByCurrencyCode(String currencyCode);
}

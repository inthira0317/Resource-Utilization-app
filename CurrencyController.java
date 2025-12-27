package currencyconverter.controller;

import org.springframework.web.bind.annotation.*;
import currencyconverter.service.CurrencyService;

@RestController
@RequestMapping("/api/currency")
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/convert")
    public Double convertCurrency(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam Double amount) {

        return currencyService.convertCurrency(from, to, amount);
    }
}

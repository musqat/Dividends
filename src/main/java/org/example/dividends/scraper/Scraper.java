package org.example.dividends.scraper;

import org.example.dividends.model.Company;
import org.example.dividends.model.ScrapedResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);
    ScrapedResult scrap(Company company);
}

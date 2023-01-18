@TestHillelPage
Feature: CertificateCheck

  Scenario: Check Test
    When I open page "https://certificate.ithillel.ua/"
    And Enter key "123" in search field
    Then Get text "Сертификат не найден"

Automation Project 

- Acest proiect este un framework de testare automată UI realizat cu:
Java, Selenium WebDriver, TestNG, Maven

- Framework-ul folosește Page Object Model (POM) pentru a face codul mai:
ușor de întreținut / reutilizabil /scalabil

- Aplicația testată: https://practicesoftwaretesting.com


Cum rulezi proiectul: 
- Clone repository git clone <repo-url>
- Ruleaza testele mvn test

Teste implementate:

- Login Tests: validare login invalid, verificare pagina login
- Product Tests: verificare produse afișate, deschidere produs, Add to Cart
- Search Tests: test data-driven (DataProvider), căutare produse multiple
- Cart Tests: adăugare produs în coș, navigare către checkout

Design Patters:

- Page Object Model (POM) - Separă logica UI de test logic.
- BasePage -Conține metode comune: click, type, isDisplayed
- Explicit Waits - Folosește WaitUtils în loc de Thread.sleep().
- Config externalizat - Datele sunt în config.properties.
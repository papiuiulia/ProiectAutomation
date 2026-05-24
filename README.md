# Automation Project 

## Descriere proiect 
Acest proiect este un framework de testare automată UI realizat cu:
Java, Selenium WebDriver, TestNG, Maven

## Tehnologii folosite
Framework-ul folosește Page Object Model (POM) pentru a face codul mai:
ușor de întreținut / reutilizabil /scalabil

- Aplicația testată: https://practicesoftwaretesting.com


## Cum rulezi proiectul: 
- Clone repository git clone <repo-url>
- Ruleaza testele mvn test

## Teste implementate:

- Login Tests: validare login invalid, verificare pagina login
- Product Tests: verificare produse afișate, deschidere produs, Add to Cart
- Search Tests: test data-driven (DataProvider), căutare produse multiple
- Cart Tests: adăugare produs în coș, navigare către checkout

## Design Patters:

- Page Object Model (POM) - Separă logica UI de test logic.
- BasePage -Conține metode comune: click, type, isDisplayed
- Explicit Waits - Folosește WaitUtils în loc de Thread.sleep().
- Config externalizat - Datele sunt în config.properties.


##  Allure Reports

Acest proiect folosește Allure Reports pentru generarea de rapoarte interactive și detaliate ale testelor automate.

- Configurare: Allure este integrat prin: `allure-testng` dependency, Maven Surefire Plugin, Allure Maven Plugin
- Instalarea dependențelor: mvn clean install
- Pentru a rula toate testele: mvn clean test. Rezultatele vor fi generate in target/allure-results
- Pentru a genera și deschide raportul Allure: allure serve target/allure-results. Aceasta comanda generează raportul HTML, pornește un server local si deschide automat raportul în browser.

Structura raportului:
- allure-results/ → date brute ale testelor
- allure-report/ → raport HTML generat

  <img width="1215" height="837" alt="image" src="https://github.com/user-attachments/assets/6587419a-71c6-472b-b753-32d083632186" />

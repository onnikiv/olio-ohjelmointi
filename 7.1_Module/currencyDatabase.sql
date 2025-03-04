-------1--------
DROP DATABASE IF EXISTS currencyDatabase;

-------2--------
CREATE DATABASE currencyDatabase;
USE currencyDatabase;

-------3--------
CREATE TABLE CURRENCIES (
    id INT NOT NULL AUTO_INCREMENT,
    currencyCode VARCHAR(3) NOT NULL,
    currencyName VARCHAR(25) NOT NULL,
    conversionRate DECIMAL(10, 4) NOT NULL,
    PRIMARY KEY (id)
);

-------4--------
INSERT INTO CURRENCIES (currencyCode, currencyName, conversionRate) VALUES
    ('EUR', 'Euro', 0.9535),
    ('USD', 'US Dollar', 1.0000),
    ('GBP', 'British Pound', 0.7902),
    ('JPY', 'Japanese Yen', 149.40),
    ('AUD', 'Australian Dollar', 1.5859),
    ('CAD', 'Canadian Dollar', 1.4358),
    ('CHF', 'Swiss Franc', 0.8955),
    ('CNY', 'Chinese Yuan', 7.2570);


-------5--------
DROP USER IF EXISTS 'appuser'@'localhost';

-------6--------
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'root';

-------7--------
GRANT SELECT, INSERT, UPDATE ON currencyDatabase.CURRENCIES TO 'appuser'@'localhost';
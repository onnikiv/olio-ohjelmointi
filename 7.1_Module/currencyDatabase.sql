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
    ('EUR', 'Euro', 0.85),
    ('USD', 'US Dollar', 1.00),
    ('GBP', 'British Pound', 0.75),
    ('JPY', 'Japanese Yen', 110.00),
    ('AUD', 'Australian Dollar', 1.35),
    ('CAD', 'Canadian Dollar', 1.25),
    ('CHF', 'Swiss Franc', 0.92),
    ('CNY', 'Chinese Yuan', 6.45);

-------5--------
DROP USER IF EXISTS 'appuser'@'localhost';

-------6--------
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'root';

-------7--------
GRANT SELECT, INSERT, UPDATE ON currencyDatabase.CURRENCIES TO 'appuser'@'localhost';
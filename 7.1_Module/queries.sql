-------1--------
SELECT * FROM CURRENCIES;
-------2--------
SELECT * FROM CURRENCIES WHERE `currencyCode` = 'EUR';
-------3--------
SELECT COUNT(*) FROM CURRENCIES;
-------4--------
SELECT * FROM CURRENCIES ORDER BY `conversionRate` DESC LIMIT 1;
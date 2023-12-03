-- https://www.hackerrank.com/challenges/weather-observation-station-1/problem

SELECT CITY, STATE FROM STATION;

-- https://www.hackerrank.com/challenges/weather-observation-station-3/problem

SELECT DISTINCT CITY FROM STATION WHERE ID % 2 = 0;

-- https://www.hackerrank.com/challenges/weather-observation-station-4/problem

SELECT COUNT(CITY) - COUNT(DISTINCT CITY) FROM STATION;

-- https://www.hackerrank.com/challenges/weather-observation-station-5/problem

SELECT CITY, LENGTH(CITY) FROM STATION ORDER BY LENGTH(CITY), CITY LIMIT 1;
SELECT CITY, LENGTH(CITY) FROM STATION ORDER BY LENGTH(CITY) DESC, CITY LIMIT 1;

-- https://www.hackerrank.com/challenges/weather-observation-station-6/problem

SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE 'a%' OR CITY LIKE 'e%' OR CITY LIKE 'i%' OR CITY LIKE 'o%' OR CITY LIKE 'u%';

-- https://www.hackerrank.com/challenges/weather-observation-station-7/problem

SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE '%a' OR CITY LIKE '%e' OR CITY LIKE '%i' OR CITY LIKE '%o' OR CITY LIKE '%u';

-- https://www.hackerrank.com/challenges/weather-observation-station-8/problem

SELECT DISTINCT CITY FROM STATION WHERE CITY REGEXP '^[aeiou].*[aeiou]$';

-- https://www.hackerrank.com/challenges/weather-observation-station-9/problem

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT LIKE 'a%' AND CITY NOT LIKE 'e%' AND CITY NOT LIKE 'i%' AND CITY NOT LIKE 'o%' AND CITY NOT LIKE 'u%';

-- https://www.hackerrank.com/challenges/weather-observation-station-10/problem

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT REGEXP '[aeiou]$';

-- https://www.hackerrank.com/challenges/weather-observation-station-11/problem

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT REGEXP '^[aeiou]' OR CITY NOT REGEXP '[aeiou]$';

-- https://www.hackerrank.com/challenges/weather-observation-station-12/problem

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT REGEXP '^[aeiou]' AND CITY NOT REGEXP '[aeiou]$';

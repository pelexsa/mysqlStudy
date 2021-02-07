package mysqlStudy.src.main.java.com.mysql.mysqlStudy.LeetCode;

public class BigCountries {
    SELECT name,population,area
    FROM WORLD
    WHERE population >= 25000000
    or area >= 3000000;
}

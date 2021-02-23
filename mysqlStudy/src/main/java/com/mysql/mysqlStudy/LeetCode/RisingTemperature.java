package mysqlStudy.src.main.java.com.mysql.mysqlStudy.LeetCode;

public class RisingTemperature {
    SELECT today.id
    FROM Weather today
    LEFT OUTER JOIN Weather yesterday on (today.recordDate = date_add(yesterday.recordDate, interval +1 day))
    WHERE today.Temperature > yesterday.Temperature;
}

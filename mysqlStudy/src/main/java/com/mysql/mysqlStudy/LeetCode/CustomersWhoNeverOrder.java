package mysqlStudy.src.main.java.com.mysql.mysqlStudy.LeetCode;

public class CustomersWhoNeverOrder {
    SELECT Name AS Customers
    FROM Customers ct
    LEFT JOIN Orders od ON (ct.Id = od.CustomerId)
    WHERE od.CustomerId IS NULL;
}

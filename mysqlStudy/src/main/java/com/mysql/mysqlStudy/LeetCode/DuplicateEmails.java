package mysqlStudy.src.main.java.com.mysql.mysqlStudy.LeetCode;

public class DuplicateEmails {
    SELECT Email
    FROM Person
    GROUP BY Email
    HAVING COUNT(Email) > 1
}

package mysqlStudy.src.main.java.com.mysql.mysqlStudy.LeetCode;

public class CombineTwoTables {
    SELECT ps.FirstName,ps.LastName,ar.City,ar.State
    FROM Person ps
    LEFT OUTER JOIN Address ar on (ps.PersonId = ar.PersonId)
}

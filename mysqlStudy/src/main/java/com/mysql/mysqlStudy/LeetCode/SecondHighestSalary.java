package mysqlStudy.src.main.java.com.mysql.mysqlStudy.LeetCode;

public class SecondHighestSalary {
    SELECT  MAX(Salary) AS SecondHighestSalary
      FROM  Employee
     WHERE  Salary NOT IN (SELECT MAX(Salary)
                           FROM Employee
                     )
}

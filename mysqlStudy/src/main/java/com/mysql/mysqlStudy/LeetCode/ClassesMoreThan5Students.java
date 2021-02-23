package mysqlStudy.src.main.java.com.mysql.mysqlStudy.LeetCode;

public class ClassesMoreThan5Students {
    SELECT CLASS
    FROM courses
    GROUP BY CLASS
    HAVING COUNT(DISTINCT(STUDENT))>=5
}

package mysqlStudy.src.main.java.com.mysql.mysqlStudy.LeetCode;

public class NotBoringMovies {
    SELECT *
    FROM CINEMA
    WHERE DESCRIPTION != 'boring'
    AND ID%2 != 0
    ORDER BY RATING DESC;
}

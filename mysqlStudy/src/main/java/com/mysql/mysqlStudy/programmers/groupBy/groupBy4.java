package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.groupBy;

public class groupBy4 {
    set @hour := -1;

    SELECT (@hour := @hour+1) as hour,
    (SELECT COUNT(*) FROM ANIMAL_OUTS WHERE HOUR(DATETIME) = @hour) as COUNT
    from ANIMAL_OUTS
    WHERE @hour < 23;
}

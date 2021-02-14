package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.groupBy;

public class groupBy3 {
    SELECT hour(DATETIME) as HOUR,count(*) as COUNT
    from ANIMAL_OUTS
    where hour(DATETIME) >= 9 and hour(DATETIME) <= 20
    group by hour(DATETIME)
    order by hour;
}

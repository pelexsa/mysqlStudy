package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.groupBy;

public class groupBy2 {
    SELECT name,count(name) as count
    from ANIMAL_INS
    where name is not null
    group by name
    having count(name) > 1
    order by name asc;
}

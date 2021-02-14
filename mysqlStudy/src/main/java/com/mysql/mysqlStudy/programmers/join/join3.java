package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.join;

public class join3 {
    SELECT a.name,a.datetime
    from ANIMAL_INS as a
    left join ANIMAL_OUTS  as b
    on a.ANIMAL_ID = b.ANIMAL_ID
    where b.datetime is null
    order by a.datetime asc
    limit 3;
}

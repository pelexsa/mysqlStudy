package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.join;

public class join1 {
    SELECT b.animal_id,b.name
    from ANIMAL_INS as a
    right join ANIMAL_OUTS as b
    on a.ANIMAL_ID = b.ANIMAL_ID
    where a.animal_id is null
    order by b.animal_id asc;
}

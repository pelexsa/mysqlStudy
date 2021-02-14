package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.stringDate;

public class stringDate2 {
    SELECT ANIMAL_ID,NAME
    from ANIMAL_INS
    where name like '%EL%'
    and ANIMAL_TYPE = 'dog'
    order by name asc;
}

package mysqlStudy.src.main.java.com.mysql.mysqlStudy.programmers.stringDate;

public class stringDate5 {
    SELECT ANIMAL_ID,NAME,DATE_format(DATETIME,'%Y-%m-%d') as '날짜'
    from ANIMAL_INS;
}

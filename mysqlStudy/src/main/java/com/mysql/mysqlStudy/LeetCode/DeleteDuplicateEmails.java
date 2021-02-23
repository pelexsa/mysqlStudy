package mysqlStudy.src.main.java.com.mysql.mysqlStudy.LeetCode;

public class DeleteDuplicateEmails {
    delete from Person
    where Id NOT IN (select Id from (select MIN(Id) Id
                     from Person
                     group by Email) p
                    )
}

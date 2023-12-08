package h2Info;

public class H2dbQueryPractice {

	public static void main(String[] args) {
		/*
		 * Update tutorial
		 * https://www.tutorialspoint.com/h2_database/h2_database_update.htm
		 * 
CREATE TABLE CUSTOMER (id number, name varchar(20), age number, address varchar(20), salary number);  
INSERT into CUSTOMER values (1, 'Ramesh', 32, 'Ahmedabad', 2000); 
INSERT into CUSTOMER values (2, 'Khilan', 25, 'Delhi', 1500); 
INSERT into CUSTOMER values (3, 'kaushik', 23, 'Kota', 2000); 
INSERT into CUSTOMER values (4, 'Chaitali', 25, 'Mumbai', 6500); 
INSERT into CUSTOMER values (5, 'Hardik', 27, 'Bhopal', 8500); 
INSERT into CUSTOMER values (6, 'Komal', 22, 'MP', 4500); 
INSERT into CUSTOMER values (7, 'Muffy', 24, 'Indore', 10000);CUSTOMER 
		 * 
		 * 
		 * Update query
		 * UPDATE CUSTOMER SET ADDRESS = 'Pune' WHERE ID = 6;
		 * 
		 * select* from customer
		 * 
		 * 
		 * Insert query
INSERT INTO CUSTOMER VALUES (1, 'Ramesh', 32, 'Ahmedabad', 2000); 
INSERT INTO CUSTOMER VALUES (2, 'Khilan', 25, 'Delhi', 1500); 
INSERT INTO CUSTOMER VALUES (3, 'kaushik', 23, 'Kota', 2000); 
INSERT INTO CUSTOMER VALUES (4, 'Chaitali', 25, 'Mumbai', 6500); 
INSERT INTO CUSTOMER VALUES (5, 'Hardik', 27, 'Bhopal', 8500); 
INSERT INTO CUSTOMER VALUES (6, 'Komal', 22, 'MP', 4500); 
INSERT INTO CUSTOMER VALUES (7, 'Muffy', 24, 'Indore', 10000);
		 * 
		 * 
		 * Delete query
		 * DELETE FROM CUSTOMERS WHERE ID = 6;
		 * DELETE FROM CUSTOMER; 
		 * 
		 * 
		 * Merge query
		 * MERGE INTO CUSTOMER KEY (ID) VALUES (8, 'Loki', 32, 'Hyderabad', 3000);//8行目のレコードを置き換える
		 * 
		 * 
		 * Show query
		 * SHOW TABLES; //DB内のテーブル一覧を取得できる。
		 * 
		 * 
		 * 
		 * */

	}

}

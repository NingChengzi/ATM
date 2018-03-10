CREATE TABLE account(
  id INT(10) PRIMARY KEY AUTO_INCREMENT,
  account_number VARCHAR(16) NOT NULL,
  account_pwd VARCHAR(6) NOT NULL,
  account_money INT(20) NOT NULL,
  account_status INT NOT NULL,
  creation_time TIMESTAMP NOT NULL,
);

INSERT INTO account(account_number,account_pwd,account_money,account_status,creation_time)
VALUES
(1111222233334444,"tom","123456",9999.01,1,"2017-02-21"),
(1111222233334443,"jerry","123457",3999.01,0,"2017-02-22"),
(1111222233334441,"lili","123458",2999.01,1,"2017-02-23");




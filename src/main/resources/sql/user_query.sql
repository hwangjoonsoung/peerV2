SELECT * FROM user_info;

INSERT INTO user_info (USER_EMAIL, USER_PASS,USER_NAME, USER_GENDER,USER_AGE,USER_PHONE,USER_NICKNAME,USER_REGE,use_ny,USER_AUTHORITY, USER_BIRTH) VALUES ("test", "test","test", "test", 20, "test", "test", SYSDATE(),"y",1, SYSDATE());

SELECT * FROM user_info WHERE USER_EMAIL = "joonsoung93@naver.com";

UPDATE user_info SET USER_PASS = "zz", USER_NAME="tt",USER_GENDER="tt",USER_AGE=30,USER_PHONE="tt", USER_NICKNAME="tt", USER_REGE = SYSDATE(),USER_AUTHORITY=0,USER_BIRTH= SYSDATE() WHERE user_num = 1;

delete user_info where user_num = #{user_num};

SELECT TIMESTAMPDIFF(YEAR,SYSDATE(),USER_BIRTH) FROM user_info WHERE user_num=3;

ALTER TABLE user_info DROP COLUMN user_age;

SELECT TIMESTAMPDIFF(YEAR ,(SELECT user_birth FROM user_info WHERE USER_NUM = 20) , NOW());

SELECT user_birth FROM user_info WHERE USER_NUM = 20;
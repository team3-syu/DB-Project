drop table if exists member;

CREATE TABLE IF NOT EXISTS member
(
    member_code  INT AUTO_INCREMENT COMMENT '회원번호',
    member_id  VARCHAR(30) NOT NULL COMMENT '아이디',
    member_password  VARCHAR(30) NOT NULL COMMENT '비밀번호',
    member_name VARCHAR(30) NOT NULL COMMENT '이름',
    member_phone  VARCHAR(30) NOT NULL  COMMENT '전화번호',
    member_birthday  VARCHAR(30) NOT NULL  COMMENT '생년월일',
    member_gender VARCHAR(30) NOT NULL  COMMENT '성별',
    member_email  VARCHAR(30) NOT NULL  COMMENT '이메일',
    CONSTRAINT pk_member_id PRIMARY KEY (member_id)
    ) ENGINE=INNODB;

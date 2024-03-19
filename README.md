# ❗ 학습 목표
- MVC2패턴 구조 이해
- Ajax ID 중복 검사 - 유효성 검사 방식 숙지  
- Spring로 만드는 CRUD 처리 구문 연습

# 🔌 개발환경
- open JDK 11
- MYSQL
- mybatis
- JDBC
- Tomcat 9

# :computer: 기능구성
- 회원가입
- 로그인
- 회원목록출력
- 상세조회
- 수정
- 삭제
- ajax 이메일 중복체크
- 로그아웃

# :memo:회원관리 - SQL문

    use webdb;
    
    drop table if exists member_table;
    
    create table member_table(
        id bigint primary key auto_increment,
        memberEmail varchar(20) unique,
        memberPassword varchar(20),
        memberName varchar(20),
        memberAge int,
        memberMobile varchar(30)
    );

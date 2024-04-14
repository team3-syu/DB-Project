drop table if exists medicine;

create table medicine
(
    m_code varchar(255) not null primary key,
    m_name varchar(255),
    m_component varchar(255),
    m_effect varchar(255),
    m_side_effect varchar(255),
    m_amount int(255),
    m_strong varchar(10)
);

insert into medicine values('a1', '타이레놀500', '아세트아미노펜', '감기,발열,두통,신경통,근육통,생리통,치통,관절통', '금주,간손상,술금지', 200, '중');
insert into medicine values('a2', '부루펜', '이부프로펜', '두통,치통,근육통,관절통', '위경련,가슴앓이,위장장애,어지로움,피로,두드러기', 100, '중');
insert into medicine values('a3', '겔포스', '시메티콘', '위산과다,위염,속쓰림,위부팽만감,체함,구역,구토,위통', '변비,성사,우유,철분제금지', 120, '중');
insert into medicine values('a4', '베나치오', '창출,육계,감초', '소화불량,위산과다,속쓰림', '메스꺼움,설사,두드러기', 110, '중');
insert into medicine values('a5', '판콜', '아세트아미노펜,클로르페니라민말레산염', '두통,발열,감기', '위장장애,간손상,술금지,금주', 100, '중');
insert into medicine values('a6', '후시딘', '퓨시드산나트륨', '피부감염,향균,상처,염즘', '피부발진,알레르기,소화불량', 100, '하');
insert into medicine values('a7', '마데카솔', '센탈라아시아티카', '염증완화,피부보호,상처', '가려움,피부발진', 300, '하');
insert into medicine values('a8', '페니라민', '클로르페니라민말레산염', '두드러기,알레르기,가려움,비염', '녹내장환자,전립선비대', 50, '중');
insert into medicine values('a9', '임팩타민', '티아민,리보플라빈', '육체피로,면역,체력', '설사,변비,위장장애,소화불량', 100, '하');
insert into medicine values('a10', '가스모틴', '아메프라진수화물,모사프리드시트르산염수화물', '소화불량,복통', '설사,졸음', 50, '중');
insert into medicine values('a11', '이가탄', '제피아스코르브산', '구강내염증,인후통', '달걀알레르기,위장장애', 150, '중');
insert into medicine values('a13', '아로나민', '활성비타민', '육체피로,면역,체력', '속쓰림', 30, '하');
insert into medicine values('a14', '비판텐', '덱스판테놀', '보습,피부장벽강화,상처', '알레르기,스테로이드', 30, '중');
insert into medicine values('a16', '모티리움', '톰페리돈말레산염', '메스꺼움,구토', '두통,구강건조,복부경련,설사', 30, '중');
insert into medicine values('a17', '알레그라', '펙소페나딘', '비염,두드러기,알레르기,가려움', '두통,어지러움,구역', 30, '중');
insert into medicine values('a18', '트리메부틴', '트리메부틴말레산염', '복통,설사,변비,소화기능완화', '피로감,소화기계부작용', 30, '중');
insert into medicine values('a19', '콜대원', '아세트아미노펜,클로르페니라민말레산염,구아이페네신', '감기,오한,두통', '간손상,술금지,금주,가려움,식욕부진', 100, '중');
insert into medicine values('a20', '엑세라민', '푸르설티이민,비타민,칼슘', '뼈건강,소화,면역력,육체피로', '속쓰림,어지러움', 50, '하');
insert into medicine values('a24', '머시론', '테소게스트렐,에티닐에스트라디올', '생리미루기,월경주기조절,여드름,피임', '구토,복부팽만,월경외출혈,호르몬변화', 120, '중');
insert into medicine values('a26', '락토핏', '프로바이오틱스', '장건강,면역력', '설사,복부팽만', 200, '하');
insert into medicine values('a27', '케토톱', '케토프로펜', '관절염,근육통', '피부가려움,화끈거림,색소침착', 200, '하');
insert into medicine values('a30', '테라플루', '아세트아미노펜,페닐레프린염산염', '감기,코막힘,기침,목통증,발열', '피로,두통,불명,위장장애', 150, '중');
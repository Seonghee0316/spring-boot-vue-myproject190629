DROP TABLE IF EXISTS customers;
CREATE TABLE customers (
id INT AUTO_INCREMENT PRIMARY KEY,
customer_id VARCHAR(15) UNIQUE NOT NULL,
customer_name VARCHAR(15) NOT NULL,
PASSWORD VARCHAR(50) NOT NULL,
ssn VARCHAR(50) UNIQUE NOT NULL,
phone VARCHAR(50) NOT NULL,
city VARCHAR(110) NOT NULL,
address VARCHAR(110) NOT NULL,
postalcode VARCHAR(50) NOT NULL,
photo VARCHAR(50) DEFAULT 'defaut_photo'
)DEFAULT CHARSET=utf8;
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('haha','changha kim','1234','950117-1622514','01076794338','광주광역시 광산구 사암로 306(월곡동)','금호아파트 13동408호','62347');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('hoho','이규진','1234','910512-162513','010-4745-2222','서울특별시 성북구 화랑로 140-1(하월곡동)','한성아파트 104동101호','02793');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('test','이정록','1234','920412-162519','010-7676-3424','서울특별시 성북구 화랑로 142(하월곡동)','로하스 리빙홈 103호','02793');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode)values ('hii','고길동','1234','930626-162515','010-5456-5333','서울특별시 성북구 화랑로13길 144(하월곡동)','벤처타워 1234호','02748');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('qw','이천수','1234','940723-162513','010-3213-2542','부산광역시 해운대구 구남로 42(중동)','베스트 웨스턴 해운대 호텔','48094');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode)values ('we','안정환','1234','950714-262513','010-7899-2347','부산광역시 해운대구 달맞이길65번길 33(중동, 해운대 달맞이 유림 노르웨이숲)','해운대 달맞이 유림 노르웨이숲','48117');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('er','이을용','1234','960411-162513','010-5678-3604','부산광역시 해운대구 반송로877번길 60(반송동)','해운대 창조 비즈니스센터','48000');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode)values ('rt','손흥민','1234','970423-262513','010-8787-6389','부산광역시 해운대구 송정1로8번길 25-78(송정동, 해운대 송정 우림필유 아파트)','해운대 송정 우림필유 아파트','48068');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode)values ('ty','이재진','1234','980427-162513','010-7527-6743','부산광역시 해운대구 우동1로 119(우동)','해운대 중앙교회','48085');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('yu','앤더슨','1234','940116-242513','010-5626-7548','부산광역시 해운대구 구남로 15(우동)','삼성아파트','48095');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('ui','다실바','1234','940217-152513','010-5362-8498','서울특별시 강남구 테헤란로 108(역삼동)','테헤란빌딩','06232');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('og','이정재','1234','940312-222513','010-1545-2356','서울특별시 강남구 테헤란로52길 16(역삼동, 테헤란ipark)','테헤란파크','06213');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('as','토마스','1234','940612-112513','010-1456-2357','서울특별시 마포구 신촌로12나길 24-6(노고산동)','유하우스 102호','04057');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('sd','에릭','1234','940712-162513','010-7574-7534','부산광역시 북구 만덕대로290번길 28(만덕동, 신촌 맥스빌)','맥스빌105호','46564');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('df','버나드박','1234','940812-262513','010-1244-6544','강원도 철원군 동송읍 동송시장길 4-12','신촌 노래주점','24014');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('hj','윤종신','1234','810418-172513','010-7356-6562','충청남도 보령시 남포면 봉덕1길 67',' 신촌 노인회','33493');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('jk','이진영','1234','820412-1452513','010-7413-3412','서울특별시 서대문구 거북골로21길 66(북가좌동, 신촌연립)','신촌연립 305동','03713');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('kl','황빛찬','1234','830412-252513','010-3526-1454','서울특별시 서대문구 북아현로 29(북아현동, e편한세상신촌 3단지)','105동 1015호','03771');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('zo','시윤민','1234','840412-132513','010-6524-4454','서울특별시 서대문구 성산로 309-21(연희동)','신촌중앙교회','03706');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('rc','정종석','1234','850412-212513','010-7144-1244','서울특별시 마포구 월드컵북로2길 65(동교동)','kt신촌지사','03994');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('by','김민재','1234','860412-262513','010-1235-3453','광주광역시 남구 고싸움로 157(지석동)','신촌약국','61751');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('qwer','김민후','1234','880412-162513','010-2434-6535','서울특별시 마포구 독막로29길 29-4(신수동, 서강 드림파크)','서강드림파크 105동105호','04096');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('tre','김정재','1234','710412-162513','010-7124-2315','서울특별시 마포구 독막로29길 31(신수동, 서강 홈타운)','서강홈타운 105동 102호','04096');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('ngf','김민재','1234','720412-262513','010-6266-1451','서울특별시 서초구 언남16길 47(양재동)','양재아파트 109-150호','06781');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('uyt','이치영','1234','730412-162513','010-2134-5425','인천광역시 서구 서곶로255번길 14-6(심곡동)','서곳연립 10호','22730');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('kfhj','김국종','1234','740412-262513','010-5614-1341','울산광역시 동구 월봉8길 20(화정동)','울산아파트 150동1004호','44084');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('qwetz','김종국','1234','760412-162513','010-2154-1234','경기도 용인시 처인구 모현읍 갈월로49번길 12-28','모현아파트 108동1004호','17035');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('fgudu','이광수','1234','770412-262513','010-7213-2133','제주특별자치도 서귀포시 동홍서로 104-10(동홍동, 서강 파인힐)','서강파인힐 105동705호','63588');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('dfidi','한지민','1234','780412-162513','010-7622-5423','서울특별시 마포구 토정로14길 38(신정동)','서강gs아파트 1004동102호','04093');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('ngfeef','김미나','1234','871101-264513','010-6266-1451','서울특별시 강서구 곰달래로49가길 45(화곡동, 서강빌라)','서강빌라 109-150호','07739');
insert into customers(customer_id,customer_name,password,ssn,phone,city,address,postalcode) values ('dfa133','이아리','1234','640412-261113','010-2134-5425','서울특별시 동작구 성대로10길 89(상도동, 서강파미에)','서강파미에 205동103호','07049');
commit;
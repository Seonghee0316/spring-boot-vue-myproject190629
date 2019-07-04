-- DROP TABLE IF EXISTS job_offer;
-- CREATE TABLE job_offer (
-- id INT AUTO_INCREMENT PRIMARY KEY,
-- offer_id varchar(30) NOT NULL,
-- offer_password varchar(50) NOT NULL,
-- offer_name varchar(20) NOT NULL,
-- offer_ceo_name varchar(20) NOT NULL,
-- offer_industry varchar(100) NOT NULL,
-- offer_pm_name varchar(20) NOT NULL,
-- offer_pm_phone varchar(50) NOT NULL,
-- offer_homepage varchar(100) NOT NULL,
-- offer_address varchar(100) NOT NULL
-- )DEFAULT CHARSET=utf8;

/* insert into job_offer(offer_id,offer_password,offer_name,
offer_ceo_name,offer_industry,offer_pm_name,offer_pm_phone,offer_homepage,offer_address) 
values ('test','1234','농심','김모과','솔루션업체',
'김사과','010-1234-5248','https://www.kakaocorp.com/','광주광역시 광산구 사암로 306(월곡동)'); */

SELECT * FROM job_offer;
commit;
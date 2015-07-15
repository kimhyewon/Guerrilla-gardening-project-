-- Test Set

-- -----------------------------------------------------
-- Table `jado_dev`.`USER`
-- -----------------------------------------------------

-- 권한 종류
--		ROLE_EMAIL_NOT_VERIFIED_USER : 이메일 인증이 되지 않은 회원
--		ROLE_CUSTOMER : 이메일 인증이 되었고 구매자로 가입한 회원
--		ROLE_SELLER : 이메일 인증이 되었고 판매자로 가입한 회원
--		ROLE_DEVELOPER : 개발할 떄 사용할
		
-- 비밀번호 = 1
insert into USER VALUES('user', '1234', 'hi', 'phone', 'img');



-- Test Set

-- -----------------------------------------------------
-- Table `gardening_project`.`ARTICLE`
-- -----------------------------------------------------

insert into USER VALUES('user1', '1234','nickname','phone','/userImg/afterImg/1.png');
insert into USER VALUES('user2', '1234','nickname2','phone2','/userImg/afterImg/1.png');


insert into ARTICLE VALUES(null, 'user1', '써니힐 공사장 텃밭 꾸미기', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque posuere aliquet ex a tempor. Nulla in leo a augue accumsan egestas vel non eros. Aenean in posuere nisi. Suspendisse maximus magna massa, sed dignissim urna sagittis vel. Ut aliquam tortor arcu. Praesent mauris dui, vehicula non fermentum sed, vulputate eu augue. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Morbi et sapien vel leo malesuada sodales. Maecenas imperdiet dolor mauris, vel dictum ex tristique et. Praesent augue ex, cursus id scelerisque ut, sodales ut ex. Aliquam feugiat quis felis eu ullamcorper.Morbi est sem, egestas in maximus quis, dapibus quis nibh. Phasellus orci justo, malesuada sed tortor sit amet, elementum semper enim. Cras pellentesque dolor feugiat urna laoreet pulvinar. Aenean id elit enim. In ac ullamcorper purus. Aenean vulputate tempor ex, at tincidunt velit sollicitudin ut. In at posuere urna. Proin mollis nisi dolor, vitae luctus mi condimentum quis. Pellentesque condimentum mauris lacus, et faucibus turpis ultricies in. Suspendisse vel ullamcorper diam. Pellentesque ut eleifend quam.', 
'/userImg/beforeImg/1.png', '/userImg/afterImg/1.png', '서울특별시 마포구 연남동', 5, 0, null);
insert into ARTICLE VALUES(null, 'user2', '판교역 공터 미니정원 조성하실 분', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque posuere aliquet ex a tempor. Nulla in leo a augue accumsan egestas vel non eros. Aenean in posuere nisi. Suspendisse maximus magna massa, sed dignissim urna sagittis vel. Ut aliquam tortor arcu. Praesent mauris dui, vehicula non fermentum sed, vulputate eu augue. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Morbi et sapien vel leo malesuada sodales. Maecenas imperdiet dolor mauris, vel dictum ex tristique et. Praesent augue ex, cursus id scelerisque ut, sodales ut ex. Aliquam feugiat quis felis eu ullamcorper.Morbi est sem, egestas in maximus quis, dapibus quis nibh. Phasellus orci justo, malesuada sed tortor sit amet, elementum semper enim. Cras pellentesque dolor feugiat urna laoreet pulvinar. Aenean id elit enim. In ac ullamcorper purus. Aenean vulputate tempor ex, at tincidunt velit sollicitudin ut. In at posuere urna. Proin mollis nisi dolor, vitae luctus mi condimentum quis. Pellentesque condimentum mauris lacus, et faucibus turpis ultricies in. Suspendisse vel ullamcorper diam. Pellentesque ut eleifend quam.', 
'/userImg/beforeImg/2.jpg', '/userImg/afterImg/2.jpg', '경기 성남시 분당구 삼평동', 10, 10, null);


insert into ARTICLE_COMMENT VALUES(1, 'user1', null, '아아아아아아앙');
insert into ARTICLE_COMMENT VALUES(1, 'user2', null, '하하하하하');


--private int articleId;
--	private String userId;
--	private String commentTime;
--	private String content;

--private String id;
--	private String password;
--	private String nickName;
--	private String phone;
--	private String profileImg;


--private int id;
--	private String userId;
--	private String title;
--	private String content;
--	private String beforeImg;
--	private String afterImg;
--	private String address;
--	private int recruitCount;
--	private int nowCount;
--	private Timestamp articleTime;




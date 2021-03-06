
DROP TABLE IF EXISTS demo_cookies;
DROP TABLE IF EXISTS demo_comment;

CREATE TABLE demo_cookies (
  id INT PRIMARY KEY AUTO_INCREMENT,
  cookie VARCHAR(500),
  create_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
);

CREATE TABLE demo_comment (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL DEFAULT '',
  comment VARCHAR(200) NOT NULL DEFAULT '',
  create_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
);



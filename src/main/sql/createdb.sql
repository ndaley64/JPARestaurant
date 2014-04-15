USE restaurant;
CREATE TABLE `users` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL DEFAULT 'ROLE_USER',
  `authorities_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`authorities_id`),
  UNIQUE KEY `ix_auth_username` (`username`,`authority`),
  CONSTRAINT `fk_authorities_users` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;

INSERT INTO users VALUES('bob@isp.com','password1',1);
INSERT INTO users VALUES('sally@isp.com','f7a09271901560af708fc65bba63c5ad592eed33e520fc8d73b4c112e27a50adee6e201c45e9532d1667233555d97d6e60b8ec134f04fd5145a5e3fee0fcdaa3',1);
INSERT INTO users VALUES('tom@isp.com','1dca67581a5f684be074b6f130c405e57d85278dae9c32104e35b078f6385cae275a8feab21f401f8732239a2785dba9e3f340181811509f1858d56e249a5443',1);
INSERT INTO authorities VALUES('bob@isp.com','ROLE_ADMIN',1);
INSERT INTO authorities VALUES('sally@isp.com','ROLE_USER',2);
INSERT INTO authorities VALUES('tom@isp.com','ROLE_USER',3);

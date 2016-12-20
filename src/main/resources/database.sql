CREATE TABLE users (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  username VARCHAR(255) NOT NULL ,
  password VARCHAR(255) NOT NULL
)  ENGINE = InnoDB;


CREATE  TABLE roles (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  name VARCHAR(100) NOT NULL
) ENGINE = InnoDB;

CREATE TABLE user_roles(
  user_id INT NOT NULL ,
  role_id INT NOT NULL ,

  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (role_id) REFERENCES roles(id),
  UNIQUE (user_id,role_id)
) ENGINE = InnoDB;


INSERT INTO users VALUE (1,'serg','serg');
INSERT INTO  roles VALUE (1,'ROLE_USER');
INSERT INTO  roles VALUE (2,'ROLE_ADMIN');

INSERT INTO user_roles VALUE (1,2);
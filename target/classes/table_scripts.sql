CREATE TABLE `notes`.`Users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `create_time` DATETIME NULL,
  `last_update_time` DATETIME NULL,
  PRIMARY KEY (`id`, `email`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC));


CREATE TABLE `notes`.`notes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(50) NOT NULL,
  `note` VARCHAR(1000) NULL,
  `create_time` DATETIME NULL,
  `last_update_time` DATETIME NULL,
  `email` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`));

INSERT INTO `notes`.`Users` (`email`, `password`, `create_time`, `last_update_time`)
VALUES ('kalvin@kalvin.com', 'password', '2018-06-11 12:00:00', '2018-06-11 12:00:00');

INSERT INTO `notes`.`notes` (`title`, `note`, `create_time`, `last_update_time`, `email`) VALUES ('title', 'note', '2018-06-11 12:00:00', '2018-06-11 12:00:00', 'kalvin@kalvin.com');


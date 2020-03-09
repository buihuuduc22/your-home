CREATE TABLE IF NOT EXISTS `owner`(
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(225) DEFAULT NULL,
    `last_name` VARCHAR(255) DEFAULT NULL,
    `name` VARCHAR(255) NOT NULL,
    `address` VARCHAR(255) DEFAULT NULL,
    `dob` DATE DEFAULT NULL,
    PRIMARY KEY(id)
    )ENGINE = InnoDb DEFAULT CHARSET= utf8;

CREATE TABLE IF NOT EXISTS `address`(
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `city` VARCHAR(255) NOT NULL,
    `province` VARCHAR(255) NOT NULL,
    `district` VARCHAR(255) NOT NULL,
    `home_number` VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
)ENGINE = InnoDb DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `price`(
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `room_price` DOUBLE NOT NULL,
    `electric` DOUBLE DEFAULT NULL,
    `water` DOUBLE DEFAULT NULL,
    `service` DOUBLE DEFAULT NULL,
    `is_full_price` TINYINT(4) DEFAULT NULL,
    `deposits` DOUBLE DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDb DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `room`(
    `id` INT(11)  NOT NULL AUTO_INCREMENT,
    `area` DOUBLE NOT NULL,
    `address_id` INT(11) NOT NULL,
    `price_id` INT(11) NOT NULL,
    `home_appliances` VARCHAR(255),
    `owner_id` INT(11) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT `FK_room_address_id` FOREIGN KEY (`address_id`) REFERENCES `address`(`id`),
    CONSTRAINT `FK_rom_price_id` FOREIGN KEY (`price_id`) REFERENCES `price`(`id`),
    CONSTRAINT `FK_rom_owner_id` FOREIGN KEY (`owner_id`) REFERENCES `owner`(`id`)
) ENGINE = InnoDb DEFAULT CHARSET = utf8;


USE onlineFishHub;

-- create category table tbl_category
CREATE TABLE IF NOT EXISTS `OnlineFishHub`.`tbl_category` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `category_name` VARCHAR(255) NULL DEFAULT NULL);

-- create book table tbl_fish
CREATE TABLE IF NOT EXISTS `OnlineFishHub`.`tbl_fish` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `sku` VARCHAR(255) DEFAULT NULL,
  `name` VARCHAR(255) DEFAULT NULL,
  `description` VARCHAR(255) DEFAULT NULL,
  `unit_price` DECIMAL(13,2) DEFAULT NULL,
  `image_url` VARCHAR(255) DEFAULT NULL,
  `active` BIT DEFAULT 1,
  `units_in_stock` INT(11) DEFAULT NULL,
   `date_created` DATETIME DEFAULT NULL,
  `last_updated` DATETIME DEFAULT NULL,
  `category_id` BIGINT(20) NOT NULL,
  FOREIGN KEY (`category_id`) REFERENCES `tbl_category` (`id`)
);

-- insert sample data to category table
INSERT INTO tbl_category(category_name) VALUES ('FreshWater');
INSERT INTO tbl_category(category_name) VALUES ('SeaWater');


-- insert sample data to fishtable
INSERT INTO tbl_fish
(
	sku, 
	name, 
    description, 
    image_url, 
    active, 
    units_in_stock,
    unit_price, 
    category_id,
    date_created
)
VALUES 
(
	'freshwater', 
    'Karimeen', 
    'FreshWater Fish',
    'assets/images/FreshWater/kaarimeen.jpg',
    1,
    100,
    600.00,
    1, 
    NOW()
);

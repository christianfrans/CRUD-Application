CREATE TRIGGER `tr_stock` AFTER INSERT ON `outcoming`
 FOR EACH ROW BEGIN
UPDATE goods
 SET stock = stock - NEW.total
 WHERE
 id = NEW.product_id;
END

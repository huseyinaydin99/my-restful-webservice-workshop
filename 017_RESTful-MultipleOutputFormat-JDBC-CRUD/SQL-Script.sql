CREATE SCHEMA `firma_huseyin_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

CREATE TABLE `firma_huseyin_db`.`Musteri` (
  `musteriId` INT NOT NULL AUTO_INCREMENT,
  `musteriNo` INT NULL,
  `musteriAdi` VARCHAR(45) NULL,
  `musteriSoyadi` VARCHAR(50) NULL,
  PRIMARY KEY (`musteriId`));

INSERT INTO `firma_huseyin_db`.`Musteri` (`musteriNo`, `musteriAdi`, `musteriSoyadi`) VALUES ('100', 'Hüseyin', 'Aydýn');
INSERT INTO `firma_huseyin_db`.`Musteri` (`musteriNo`, `musteriAdi`, `musteriSoyadi`) VALUES ('101', 'Selami', 'Zýmba');
INSERT INTO `firma_huseyin_db`.`Musteri` (`musteriNo`, `musteriAdi`, `musteriSoyadi`) VALUES ('206', 'Hasan', 'Fefer');
INSERT INTO `firma_huseyin_db`.`Musteri` (`musteriNo`, `musteriAdi`, `musteriSoyadi`) VALUES ('307', 'Samet', 'Ünlü');

SELECT * FROM firma_huseyin_db.Musteri;
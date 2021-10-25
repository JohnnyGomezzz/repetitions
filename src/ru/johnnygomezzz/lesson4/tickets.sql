CREATE TABLE IF NOT EXISTS `mydb`.`tickets` (
  `idtickets` INT NOT NULL AUTO_INCREMENT,
  `ticket_number` INT NOT NULL,
  `session_id` INT NULL,
  PRIMARY KEY (`idtickets`),
  UNIQUE INDEX `idtickets_UNIQUE` (`idtickets` ASC) VISIBLE,
  UNIQUE INDEX `ticket_number_UNIQUE` (`ticket_number` ASC) VISIBLE,
  INDEX `movies_fk_idx` (`session_id` ASC) VISIBLE,
  CONSTRAINT `movies_fk`
    FOREIGN KEY (`session_id`)
    REFERENCES `mydb`.`movies` (`idmovies`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
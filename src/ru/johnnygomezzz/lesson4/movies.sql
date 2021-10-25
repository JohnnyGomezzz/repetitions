CREATE TABLE IF NOT EXISTS `mydb`.`movies` (
  `idmovies` INT NOT NULL AUTO_INCREMENT,
  `movie_name` VARCHAR(50) NOT NULL,
  `movie_duration` INT NOT NULL,
  `price` INT NOT NULL,
  `movie_starttime` INT NOT NULL,
  PRIMARY KEY (`idmovies`),
  UNIQUE INDEX `idmovies_UNIQUE` (`idmovies` ASC) VISIBLE)
ENGINE = InnoDB
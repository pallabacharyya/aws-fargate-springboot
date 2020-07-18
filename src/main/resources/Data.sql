DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee (
  employeeId INT AUTO_INCREMENT  PRIMARY KEY,
  firstName VARCHAR(250) NOT NULL,
  lastName VARCHAR(250) NOT NULL,
  age INT,
  gender VARCHAR(250)
);

INSERT INTO Employee(firstName,lastName,age) values("Mahamaya","Deva",1,"Male");

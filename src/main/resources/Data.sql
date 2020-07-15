DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee (
  employeeId INT AUTO_INCREMENT  PRIMARY KEY,
  firstName VARCHAR(250) NOT NULL,
  lastName VARCHAR(250) NOT NULL,
  age INT
);

INSERT INTO Employee(firstName,lastName,age) values("Mahamaya","Deva",1);

USE [library_management_system;];

CREATE TABLE Book (
    ISBN int PRIMARY KEY,
    Title varchar(20) NOT NULL,
    Author varchar(20) NOT NULL,
    Price int DEFAULT 0,
    Quantity int DEFAULT 0,
    CHECK (Price >= 0),
    CHECK (Quantity >= 0)
);

CREATE TABLE Student (
    SID int PRIMARY KEY,
    Name varchar(20) NOT NULL,
    Course varchar(20) NOT NULL,
    Branch varchar(20) NOT NULL,
    Email varchar(30) NOT NULL
);

CREATE TABLE Issue_Book (
    ISBN int,
    SID int,
    IssueDate date NOT NULL,
    FOREIGN KEY (ISBN) REFERENCES Book(ISBN),
    FOREIGN KEY (SID) REFERENCES Student(SID)
);

CREATE TABLE Record (
    SID int,
    ISBN int,
    IssueDate date DEFAULT NULL,
    ReturnDate date DEFAULT NULL,
    FOREIGN KEY (SID) REFERENCES Student(SID),
    FOREIGN KEY (ISBN) REFERENCES Book(ISBN)
);
CREATE TABLE Category (
    CategoryID int PRIMARY KEY,
    CategoryName varchar(50) NOT NULL
);
CREATE TABLE Publisher (
    PublisherID int PRIMARY KEY,
    PublisherName varchar(50) NOT NULL,
    Address varchar(100),
    Phone varchar(15)
);
CREATE TABLE AuthorBookMap (
    AuthorID int,
    ISBN int,
    PRIMARY KEY (AuthorID, ISBN),
    FOREIGN KEY (ISBN) REFERENCES Book(ISBN)
);
CREATE TABLE Reservation (
    ReservationID int PRIMARY KEY,
    SID int,
    ISBN int,
    ReservationDate date NOT NULL,
    FOREIGN KEY (SID) REFERENCES Student(SID),
    FOREIGN KEY (ISBN) REFERENCES Book(ISBN)
);
CREATE TABLE Fine (
    FineID int PRIMARY KEY,
    SID int,
    ISBN int,
    FineAmount int,
    FineDate date,
    FOREIGN KEY (SID) REFERENCES Student(SID),
    FOREIGN KEY (ISBN) REFERENCES Book(ISBN)
);


CREATE TABLE Return_Book (
    SID int,
    ISBN int,
    ReturnDate date NOT NULL,
    FOREIGN KEY (SID) REFERENCES Student(SID),
    FOREIGN KEY (ISBN) REFERENCES Book(ISBN)
);

/*For Triggering*/
USE [library_management_system];

-- Trigger for updating Quantity in Book table when a book is issued
CREATE TRIGGER UpdateQuantityOnIssue
ON Issue_Book
AFTER INSERT
AS
BEGIN
    SET NOCOUNT ON;

    UPDATE Book
    SET Quantity = Quantity - 1
    FROM Book
    INNER JOIN inserted ON Book.ISBN = inserted.ISBN;
END;

-- Trigger for updating ReturnDate in Record table when a book is returned
CREATE TRIGGER UpdateReturnDateOnReturn
ON Return_Book
AFTER INSERT
AS
BEGIN
    SET NOCOUNT ON;

    UPDATE Record
    SET ReturnDate = GETDATE()
    FROM Record
    INNER JOIN inserted ON Record.ISBN = inserted.ISBN AND Record.SID = inserted.SID;
END;

-- Trigger for updating Quantity in Book table when a book is returned
CREATE TRIGGER UpdateQuantityOnReturn
ON Return_Book
AFTER INSERT
AS
BEGIN
    SET NOCOUNT ON;

    UPDATE Book
    SET Quantity = Quantity + 1
    FROM Book
    INNER JOIN inserted ON Book.ISBN = inserted.ISBN;
END;

/* Stored Procedure*/
CREATE PROCEDURE AddStudent
    @SID INT,
    @Name NVARCHAR(255),
    @Course NVARCHAR(50),
    @Branch NVARCHAR(50),
    @Email NVARCHAR(100)
AS
BEGIN
    SET NOCOUNT ON;

    INSERT INTO Student (SID, Name, Course, Branch, Email)
    VALUES (@SID, @Name, @Course, @Branch, @Email);
END;



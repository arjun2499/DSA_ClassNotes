
Drop DATABASE IF EXISTS studentAttendanceManagementSystem;
CREATE DATABASE studentAttendanceManagementSystem;
USE studentAttendanceManagementSystem;
	
/* Table stores Staff detail */
CREATE TABLE
	StudentMst (
		SID int  – Student ID [Primary_Key and Auto_increments]
		RollNo nvarchar(50)
		Name nvarchar(max)
		StdName nvarchar(50)
		DivName nvarchar(50)
		Email nvarchar(50)
		Mobile nvarchar(50)
		DOB nvarchar(50)
		Image nvarchar(50)
		Add nvarchar(50)
		City nvarchar(50)
		Pincode nvarchar(50)
		Uname nvarchar(50)
		Pass nvarchar(50)
		EDate datetime – Student entry date
		);
	
/* Table stores Staff detail */
CREATE Table
		StaffMst (
		SID int  – Staff ID [Primary_Key and Auto_increments]
		Name nvarchar(50)
		StdName nvarchar(50)
		Email nvarchar(50)
		Mobile nvarchar(50)
		Image nvarchar(50)
		Qualification nvarchar(50)
		Add nvarchar(50)
		City nvarchar(50)
		Pincode nvarchar(50)
		Uname nvarchar(50)
		Pass nvarchar(50)
		Gender nvarchar(50)
		EDate datetime – Staff create date
		);
	
/* Table stores Attendance detail */
CREATE TABLE
	Attendance ( 
		AID int  – Attendance ID [Primary_Key and Auto_increments]
		Rollno varchar(50)
		Name varchar(50)
		Date varchar(500)
		Status varchar(50)
		StaffName varchar(50)
		EDate datetime – Attendance entry date
	);
	
/* Table stores Standard detail */
create Table
		StdMst (
		SID int  – standard ID [Primary_Key and Auto_increments]
		StdName nvarchar(50)
		EDate datetime – standard create date
		);
	
/* Table stores Feedback details from students */
CREATE TABLE
		FeedBackMst (
		FID int  – Feedback ID [Primary_Key and Auto_increments]
		Email nvarchar(50)
		Mobile nvarchar(50)
		Feedback nvarchar(500)
		EDate datetime – Feedback create date
		);
		
/* Table stores Leave details of Students */
CREATE TABLE
		LeaveMst(
		LID int  – Leave ID [Primary_Key and Auto_increments]
		Rollno nvarchar(50)
		Name nvarchar(50)
		StdName nvarchar(50)
		Message nvarchar(500)
		NoDays int – Number of days
		Reply nvarchar(500)
		EDate datetime – Leave create date
		);

/* Table stores Division detail */
CREATE TABLE
		DivMst(
		DID int  – Division ID [Primary_Key and Auto_increments]
		DivName char(1)
		StdName nvarchar(50)
		Seat int
		EDate datetime – Division create date
		);
		
/* Table stores Complain detail of students */
CREATE TABLE
		Complainmst(
		CID int  – Complain ID [Primary_Key and Auto_increments]
		Rollno nvarchar(50)
		Name nvarchar(50)
		Subject nvarchar(50)
		Message nvarchar(500)
		Reply nvarchar(500)
		EDate datetime – Complain entry date
		);
		
		
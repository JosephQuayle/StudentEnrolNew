package enrolsystem

class BootStrap {

    def init = { servletContext ->

def computing1 = new com.enrol.Course(
	department: 'Computing',
	courseTitle: 'BSC Computing',
	courseLeader: 'Dr Michelle Murphy',
	courseCode: 'CS123',
	studyMode: 'Fulltime',
	startDate: new Date('09/09/2019'),
	endDate: new Date('07/07/2023'),
	description: '"Course involving different aspects of the computing industry, web development, system architectures, and project management."',
	numberOfStudents: 15,
	tuitionFees: 9000)
	.save()

def music = new com.enrol.Course(
	department: 'Creative Media',
	courseTitle: 'Music',
	courseLeader: 'Jacky',
	courseCode: 'CM123',
	studyMode: 'Fulltime',
	startDate: new Date('09/09/2019'),
	endDate: new Date('07/07/2023'),
	description: 'All about music',
	numberOfStudents: 15,
	tuitionFees: 9000)
	.save()

def joey = new com.enrol.Student(
	studentName: 'Joseph Quayle',
	studentID: 'B9021177',
	dob: new Date('31/05/2001'),
	isFundingAvailable: 'Yes',
	studentEmail: 'b9021177@my.shu.sc.uk',
	studentUsername: 'b9021177',
	studentPassword: 'JoeyQ123',
	course:'Computing')
	.save()

def larry = new com.enrol.Student(
	studentName: 'Larry Wheels',
	studentID: 'LW77',
	dob: new Date('31/05/1993'),
	isFundingAvailable: 'Yes',
	studentEmail: 'LW77@my.shu.sc.uk',
	studentUsername: 'lw77',
	studentPassword: 'LarryW77',
	course:'Computing')
	.save()

def sysArch = new com.enrol.Module(
	title: 'System Architectures',
	moduleCode: 'SYSAR01',
	department: 'Computing',
	credits: '40',
	description: 'All about computer systems and architectures.'
).save()

def  webDevelopment = new com.enrol.Module(
	title: 'Web Development',
	moduleCode: 'WD01',
	department: 'Computing',
	credits: '40',
	description: 'All about computer systems and architectures.'
).save()

def faiza = new com.enrol.Lecturer(
	name: ' Samreen Faiza',
	lecturerID: 'SF101',
	lecturerEmail: 'sfaiza@email.com',
	postcode: 'SF 712',
	department: 'Computing',
	subject: 'System Architecture',
	dob: new Date('01/01/1980')
).save()

def charles = new com.enrol.Lecturer(
	name: 'Charles Boisvert',
	lecturerID: 'CB101',
	lecturerEmail: 'cboisvert@email.com',
	postcode: 'CB 172',
	department: 'Computing',
	subject: 'PCP',
	dob: new Date('01/01/1970')
).save()


    }
    def destroy = {
    }
}

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

def webDevelopment = new com.enrol.Course(
	department: 'Computing',
	courseTitle: 'Web Development',
	courseLeader: 'Jacky',
	courseCode: 'WD123',
	studyMode: 'Fulltime',
	startDate: new Date('09/09/2019'),
	endDate: new Date('07/07/2023'),
	description: 'Course involving different aspects of the computing industry, web development, system architectures, and project management.',
	numberOfStudents: 15,
	tuitionFees: 9000)
	.save()

def joey = new com.enrol.Student(
	studentName: 'Joseph Quayle',
	studentID: 'B9021177',
	dob: new Date('31/05/2001'),
	isFundingAvailable: '',
	studentEmail: 'b9021177@my.shu.sc.uk',
	studentUsername: 'b9021177',
	studentPassword: 'JoeyQ123',
	course:'Computing')
	.save()

    }
    def destroy = {
    }
}

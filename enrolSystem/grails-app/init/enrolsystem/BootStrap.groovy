package com.enrol

class BootStrap {

    def init = { servletContext ->

	def computing = new Course(
	
	department: 'Computing',
	courseTitle: 'Computing',
	courseLeader: 'Dr Michelle Murphy',
	courseCode: 'CS123',
	studyMode: 'Fulltime',
	startDate: new Date('09/09/2019'),
	endDate: new Date('07/07/2023'),
	description: '"Course involving different aspects of the computing industry, web development, system architectures, and project management."',
	numberOfStudents: 15,
	tuitionFees: 9000
	).save()

	def webDevelopment = new Course(

	department: 'Computing',
	courseTitle: 'Web Development',
	courseLeader: 'Jacky',
	courseCode: 'WD123',
	studyMode: 'Fulltime',
	startDate: new Date('09/09/2019'),
	endDate: new Date('07/07/2023'),
	description: '"Course involving different aspects of the computing industry, web development, system architectures, and project management."',
	numberOfStudents: 15,
	tuitionFees: 9000
	).save()

    }
    def destroy = {
    }
}

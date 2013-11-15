package edu.bu.steinway.codehub

class Answer implements Feedbackable, Commentable, Loggable {

	String rendered
	String markdown
	
	User creator
	Date created = new Date()

	static hasMany = [
		codes: Code
	]

    static constraints = {
    }
}

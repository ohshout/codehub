package edu.bu.steinway.codehub

class Comment implements Loggable, Feedbackable {

	String comment 
	User creator
	Date timestamp

    static constraints = {
    }
}

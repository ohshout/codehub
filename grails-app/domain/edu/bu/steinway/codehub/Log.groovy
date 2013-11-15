package edu.bu.steinway.codehub

class Log {

	Loggable entity
	Date timestamp
	User user 

	String action

	String jsonLog

    static constraints = {
    	action inList: ["Created", "Updated", "Deleted"]
    }
}

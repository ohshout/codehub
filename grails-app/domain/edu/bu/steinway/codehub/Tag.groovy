package edu.bu.steinway.codehub

class Tag {

	String name

	static hasMany = [
		entities: Taggable
	]
	
    static constraints = {
    }
}

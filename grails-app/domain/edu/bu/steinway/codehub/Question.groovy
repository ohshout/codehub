package edu.bu.steinway.codehub

class Question implements Taggable, Feedbackable, Commentable, Loggable {

	String title
	String rendered
	String markdown

	User creator

	Date created = new Date()

	String state

	static hasMany = [
		tags: Tag,
		codes: Code,
		answers: Answer
	]

    static constraints = {
    	creater nullable: false
    	state inList: ["Unsolved", "Solved"]
    }

    List<Tag> getTags() {
    	return tags
    }
}

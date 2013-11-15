package edu.bu.steinway.codehub

import grails.transaction.Transactional

@Transactional
class QuestionService {

	SecurityService securityService 

    def createQuestion(Question q) {
    	q.save();
    }
}

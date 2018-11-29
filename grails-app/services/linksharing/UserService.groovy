package linksharing

import grails.gorm.transactions.Transactional

@Transactional
class UserService {

    def serviceMethod() {

    }

    def saveUser(User user){

        List<Topic> topic = new ArrayList<Topic>()
        Topic topic1 = new Topic()
        topic1.name = "Core Java"
        topic1.seriousLevel = Seriousness.SERIOUS
        topic.add(topic1)
        user.topics = topic


        if(user.validate()){
           return user.save(flush:true, failOnError:true, validate: true)
        }
        else return null

    }

}

package linksharing

class Topic {

    String name
    String seriousness
    String status

    static constraints = {
        name(unique: true, minSize: 2, maxSize: 10)
        status(default:"unread")
    }
}

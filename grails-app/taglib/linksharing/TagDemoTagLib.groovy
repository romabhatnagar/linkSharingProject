package linksharing

class TagDemoTagLib {
    static defaultEncodeAs = [taglib:'html']
    static firstTag ="demoTag"

    def greet = { attrs ->
        def name = attrs.namek
        out << "Hello ${name}"
    }

}

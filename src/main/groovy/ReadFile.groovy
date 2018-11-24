class ReadFile {
    public static void main(String[] args) {
        File f = new File("/home/roma/roma bootcamp notes/notes")
//        f.eachDir {a->println(a)}
//        f.eachFile {s->println(s)}
        f.eachFileRecurse( {file->println file.getText()})
    }
}

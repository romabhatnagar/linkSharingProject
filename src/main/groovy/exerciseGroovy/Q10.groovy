package exerciseGroovy

def a=new File("/home/roma/roma bootcamp notes/notes/file1.txt")
        .eachLine ({line-> line.replaceAll("\\s","")|| line.replaceAll("\t","")})
new File("/home/roma/roma bootcamp notes/notes/file4.txt").append(a)
package exerciseGroovy

def file = new File("/home/roma/roma bootcamp notes/notes/combinedFile.txt")
File file1 = new File("/home/roma/roma bootcamp notes/notes")
file1.eachFileRecurse {{f->println file.getText()}}


//each*.getText()
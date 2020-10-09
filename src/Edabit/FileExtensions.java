package Edabit;

public class FileExtensions {

    //print the extensions of an array of file name

        public static String[] getExtension(String[] arr) {
        String [] extensions = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
		 String file = arr[i];
		 extensions[i] = file.substring(file.indexOf(".") + 1);

	 }

        return extensions;

 	}

        public static void main(String[] args) {

            String [] array = {"code.html", "code.css"};

            String [] newArray = getExtension(array);

            for (String file: newArray) {
	        System.out.println(file);
            }

        }


    }


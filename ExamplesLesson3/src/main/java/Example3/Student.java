package Example3;

// TODO Implement Comparable to compare Students based on
public class Student {

    private String name;
    private String id;

    Student(String name, String id){
        if( ! validateNumericString(id)){
            throw new IllegalArgumentException("String must have numeric characters");
        }
        this.name = name;
        this.id = id;
    }

    private boolean validateNumericString( String s){

        /** matches takens in a Regular Expression (regex)
         * This is FYI. The regex says:
         * the string should have one or more (+) of the characters from 0 to 9 [0-9]
         */
        return s.matches("[0-9]+");
    }
}

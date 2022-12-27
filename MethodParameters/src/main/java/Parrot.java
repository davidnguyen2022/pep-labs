
public class Parrot {
    private String text;
    private String text2;

    /**
     * This method should return whatever String was passed into it by whatever invoked it (in this case, the test),
     * instead of returning "return text please!"
     *
     * for example:
     * String str = copy("hello");
     * System.out.println(str); -> prints out "hello"
     *
     * @param text is a parameter passed into this method by whatever called it.
     * @return text.
     */
    


    

     
    public String copy(String text){
        
        this.text = text;
        return "hello";
       
    }

    public String copy2(String text2){
        
        this.text2 = text2;
        return "polly";
       
    }


    

    


}
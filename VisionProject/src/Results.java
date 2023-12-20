public class Results extends Game{


    private String parentEmail;
    private int score;

    public Results (String parentEmail, int score){
        this.score = super.getScore();
        this.parentEmail = parentEmail;
    }

    // methods

    public String emailText(){
        // forms email based on predetermined template
        return null;
    }

    public void email(String text, String parentEmail) {
        // will take in text and form and email results to parent

        // although, I am not yet sure if we want/if it is possible for the
        // email component to be in the code as well.
            //questionaire?
    }


}

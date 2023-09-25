public class Game {

    // declaring variables
    private int rightAnswers;

    private int wrongAnswers;

    private int zoomFactor;


    private int questionCount;


    private int lives; // lives of user

    private int score;

    private int time;



    // constructor
    public Game() {
        //need to figure out what variables this constructor will rely on
            // i.e. score, time, zoomFactor, rightAnswers, wrongAnswers, parentEmail
    }


    //  methods

    public void resetGame() {

    }


    public void stopGame() {

    }

    public boolean isCorrect(){
        //returns true/false depending on if user was correct on certain question
    }


    // returns true/false depending on if user's eyes are focused on screen, rather than external factors
    // (limits the potential of inaccurate data/results)
    public boolean visionTracking(){

    }




    // Getter methods



    public int getRightAnswers() {
        return rightAnswers;
    }

    public int getWrongAnswers() {
        return wrongAnswers;
    }

    public int getScore() {
        return score;
    }

    public int getTime() {
        return time;
    }

    public int getZoomFactor() {
        return zoomFactor;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public int getLives() {
        return lives;
    }






    //  Setter methods


    public void setZoomFactor (int zoomFactor){
        this.zoomFactor = zoomFactor;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

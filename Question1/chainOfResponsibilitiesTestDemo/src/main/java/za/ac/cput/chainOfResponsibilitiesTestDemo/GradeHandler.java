package za.ac.cput.chainOfResponsibilitiesTestDemo;

/**
 * Created by student on 2015/03/13.
 */
public abstract class GradeHandler {
    GradeHandler successor;
    public void setSuccessor(GradeHandler successor) {
        this.successor = successor;
    }
    public abstract String handleRequest(int request);
}

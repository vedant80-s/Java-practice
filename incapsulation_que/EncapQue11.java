
class Test11{
    private int[] arrOfMarks;

    public void displayMarks() {
    for(int mark : arrOfMarks) {
        System.out.print(mark + " ");
    }
}

    public void setArrOfMarks(int[] arrOfMarks) {
        this.arrOfMarks = arrOfMarks;
    }
}
public class EncapQue11 {
    public static void main(String[] args) {
        Test11 t1 = new Test11();
        int[] arr = {1,2,3,4,5,6,7};
        t1.setArrOfMarks(arr);
        t1.displayMarks();
    }
}

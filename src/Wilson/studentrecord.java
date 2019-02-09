package Wilson;

public class studentrecord {

    public int[] scores;

    studentrecord(int[] scores) {
        this.scores = scores;
    }


     private double average(int first, int last) {
        double sum = 0;
        for (int i=first;i <=last;i++)
            sum += (double)scores[i];
        return sum/(last-first+1);
    }


    boolean hasImproved() {
        for (int i=1; i <scores.length; i++) {
            if (scores[i-1]>scores[i])
                return false;
        }
        return true;
    }

    double finalAverage() {
        if (hasImproved())
        {
            return average(scores.length/2,scores.length-1);
        }
            return average(0,scores.length-1);
    }
}
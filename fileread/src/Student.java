class Student {

    private final int id;
    private final String name;
    private final Subject[] grades;


    Student(int id, String name, Subject[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public double getAverageScore() {
        double avg = 0;
        int counter = 0;
        for(Subject subject:grades){
            avg += subject.getScore();
            counter++;
        }

        return avg/counter;
    }

    public Performance getPerformance() {
        double score =  getAverageScore();
        if(score>90){
            return Performance.EXCELENT;
        }
        if(score>80){
            return Performance.GOOD;
        }
        if(score>70){
            return Performance.AVERAGE;
        }
        else{
            return Performance.BELOW_AVERAGE;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Subject[] getGrades() {
        return grades;
    }

    @Override
    public String toString() {

        return "Student: " +getName()+"\nAverage Score: "+ getAverageScore()+"\nPerformance: "+ getPerformance();
    }
}

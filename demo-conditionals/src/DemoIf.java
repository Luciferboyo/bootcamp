public class DemoIf {
    public static void main(String[] args) {
        //double salary = 15000.0 //by default 15000.0 is double
        double salary = 15000.0;
        if (salary > 14000) {
            System.out.println("salary > 14000");
        }
        if (salary >= 15000) {//double vs int
            System.out.println("salary >= 15000");
        }
        if (salary < 17000) {//double vs int
            System.out.println("salary < 17000");
        }
        if (salary <= 15000) {//double vs int
            System.out.println("salary <= 15000");
        }

        char grade = 'A';
        if (grade == 'A') {
            System.out.println("grade is A");
        }else if (grade == 'B') {
            System.out.println("grade is B");
        }else if (grade == 'C') {
            System.out.println("grade is C");
        }else if (grade == 'D') {
            System.out.println("grade is D");
        }else if(grade == 'E') {
            System.out.println("grade is E, you are fail");
        }
        System.out.println("---------------");
        
        //if
        // >= 90 -> A,>= 80 -> B,>= 70 -> C,>=  60-> D,

        //The first way of writing
        int score = 75;
        System.out.println("The first way of writing:");
        String grade1 = "D";
        if (score > 100 || score <0) {//if score is illegal
            grade1 = "score is mistake";
        }else if (score >= 90) {//if score >= 90
            grade1 = "A";
        }else if (score >= 80) {//if score >= 80 && score < 90
            grade1 = "B";
        }else if (score >= 70) {//if score >= 70 && score < 80
            grade1 = "C";
        }else if (score >= 60) {//if score >= 60 && score < 70
            grade1 = "D";
        }else{//if score >= 0 && score = 60
            grade1 = "E";
        }
        if (grade1.length() > 1) {
            System.out.println(grade1);
        }else{
             System.out.println("Grade = " + grade1);
        }
        System.out.println("------------------");
        System.out.println("The second way of writing:");
        //The second way of writing
        if (score >= 0 && score < 60) {
             grade1 = "E";
        }else if (score >= 60 && score < 70) {
             grade1 = "D";
        }else if (score >= 70 && score < 80) {
             grade1 = "C";
        }else if (score >= 80 && score < 90) {
             grade1 = "B";
        }else if (score >= 90 && score <= 100) {
             grade1 = "A";
        }
        System.out.println("Grade1 = " + grade1);
        System.out.println("----------------");
        int score2 = 40;
        //score and score2 >= 50, (score+score2)/2 ->grade
        //either score or score2 <50 -> grade F
        //both score and score2 <50 -> grade F
        double grad = 0.0;
        if (score < 50 || score2 < 50) {
            grade = 'F';
        }else{
            grad = (score + score2)/2;
            if (grad >= 90 && grad <= 100) {//if score >= 90
                grade1 = "A";
            }else if (grad >= 80) {//if score >= 80 && score < 90
                grade1 = "B";
            }else if (grad >= 70) {//if score >= 70 && score < 80
                grade1 = "C";
            }else if (grad >= 60) {//if score >= 60 && score < 70
                grade1 = "D";
            }else{
                grade1 = "E";
            }
        }
    }
}

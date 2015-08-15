package all_java;

/**
 * Created by Евгений on 15.08.2015.
 */
public class Salesman extends Coworker{
    int bonus = 7500;
    public void get_salary(){
        System.out.println("My total salary is:" + (bonus + salary));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student1;

/**
 *
 * @author Oscar O
 */
public class StudentList {
    public static void main(String[] args)
    {
        Student1 [] studentList =new Student1[3];
        
        Student1 s1 = new Student1();
        s1.setName("Ronak");
        
        Student1 s2 = new Student1();
        s2.setName("Sheth");
        
        Student1 s3 = new Student1();
        s3.setName("Joe Walsh");
        studentList[0] =s1;
        studentList[1] =s2;
        studentList[2]= s3;
        
        for (Student1 s : studentList){
            System.out.println(s.getName());
        }
        
        
    }
    
}

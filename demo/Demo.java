package demo;

public class Demo{
    public static void main (String[] args){

        // Object[] a = new Object[2];

        Person p1 = new Person("Jane","Smith");
        Student s1 = new Student(p1);
        s1.set_year("senior");

        Person p2 = new Person("Papa","Smith");
        Parent g1 = new Parent(p2);
        g1.add_child(s1);

        System.out.println(s1);
        
        System.out.println(g1);

        // a[0] = s1;
        // a[1] = g1;
        
        // for (Object object : a) {
        //     if(object != null)
        //         System.out.println(object);            
        // }

        s1.add_course("English");
        s1.add_course("History");
        s1.add_course("Math");
        System.out.println(s1.get_courses());

        //Parent c = new Parent(b);

    }    
}

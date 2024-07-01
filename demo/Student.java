package demo;

public class Student extends demo.Person{
    String year;
    Parent parent;
    String[] courses = new String[10];
    int course_count = 0;

    public Student(Person p){
        this.f_name = p.f_name;
        this.l_name = p.l_name;
        this.year = null;
    }

    public void add_course(String course_name){
        courses[course_count] = course_name;
        course_count++;
    }

    public String get_courses(){
        String ret = "";
        for(int i=0; i < courses.length; i++){
            if(courses[i] != null)
                ret+=courses[i]+"\n";
        }
        return ret;
    }
    public void set_year(String year){
        this.year = year;
    }

    public void set_parent(Parent p){
        this.parent = p;
    }

    public String get_first_name(){
        return this.f_name;
    }
    public String toString(){
        return "Student: "+this.f_name+" "+this.l_name+" ("+this.year+")";
    }
}

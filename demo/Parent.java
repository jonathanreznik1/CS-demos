package demo;

public class Parent extends demo.Person{
    Student child[];
    int child_count;

    public Parent(Person p){
        this.f_name = p.f_name;
        this.l_name = p.l_name;
        this.child = new Student[10];
        this.child_count = 0;
    }

    public void add_child(Student s){
        this.child[child_count] = s;
    }

    public String get_children_names(){
        int a = 0;
        String res = "";
        for (Student student : child) {
            if(a==0 && student!=null) {
                res+=student.get_first_name();
                a++;
            }
            else if(student!=null) {
                res+=", "+student.get_first_name();
            }
            else{
                continue;
            }
        }
        return res;
    }

    public String toString(){
        String children=this.get_children_names();
        return "Parent: "+f_name+" "+l_name+" ("+children+")";
    }
}

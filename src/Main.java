import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Lecture lecture1=new Lecture("a",10,20,12,33);
        Lecture lecture2=new Lecture("b",11,19,12,40);
        Lecture lecture3=new Lecture("c",8,10,9,3);
        Lecture lecture4=new Lecture("d",14,20,16,33);
        Lecture lecture5=new Lecture("e",15,00,18,33);
        LinkedList<Lecture>list=new LinkedList<>();
        list.add(lecture1);
        list.add(lecture2);
        list.add(lecture3);
        list.add(lecture4);
        list.add(lecture5);
        Lectures_Scheduling(list);

    }
    public static void Lectures_Scheduling(LinkedList<Lecture> Lectures){
        Lectures.sort(
                Comparator.comparingInt(Lecture::getStart_H)
                        .thenComparingInt(Lecture::getStart_M)
        );
        Lectures.forEach(items -> System.out.println(items));
        LinkedList<Lecture>classs=new LinkedList<>();
        int max=-1;
        for (int i = 0; i < Lectures.size() ; i++) {
            if (classs.size()==0){
                classs.add(Lectures.get(i));
            }
            else {
               int claseesize=classs.size();
                for (int j = 0; j <classs.size() ; j++) {
                    if(Lectures.get(i).getStart_H()>classs.get(j).fnish_H){
                        classs.remove(classs.get(j));
                        classs.add(Lectures.get(i));
                        break;
                    }
                    else if (Lectures.get(i).getStart_H()==classs.get(j).getStart_H()){
                        if(Lectures.get(i).getStart_M()>classs.get(j).getFnish_M()){
                            classs.remove(classs.get(j));
                            classs.add(Lectures.get(i));
                            break;
                        }
                    }
                    else {
                        classs.add(Lectures.get(i));
                        break;
                    }


                }
                System.out.println("//////////////////////////////////////");
                classs.forEach(item -> System.out.println(item));
                System.out.println("/////////////////////////////////////");
                if(max<classs.size()){
                    max=classs.size();

                }
            }
        }
        System.out.println(max);
    }

}

//A simple program which stores data in arraylist then copy to hashset and then print so that duplicates may be ignored
import java.util.*;
public class Session9b {
     
      public static void main(String []args){
              Name n1=new Name("sparky");//passing value to constructor of Name
              Name n2=new Name("jockey");//passing value to constructor of Name
              Name n3=new Name("raymond");//passing value to constructor of Name
              Name n4=new Name("raymond");//passing value to constructor of Name

              ArrayList<Name> arlist=new ArrayList<Name>();
              arlist.add(n1);//adding the data of Name class to arraylist
              arlist.add(n2);//adding the data of Name class to arraylist
              arlist.add(n3);//adding the data of Name class to arraylist
              arlist.add(n4);//adding the data of Name class to arraylist

              
              HashSet<String> hs=new HashSet<String>();
              
              Iterator itr=arlist.iterator();
              while(itr.hasNext()){
                        Name na=(Name)itr.next();
                        hs.add(na.name);//adding the data to hashmap from ArrayList
                        
              }

              Iterator it=hs.iterator();
              while(it.hasNext()){
                     System.out.println(it.next());//prints the nonduplicate data
              }
        
      }
} 

class Name{  
       String name;
  
         public Name(String name){//constructor of Name class
              this.name=name;
     
        }
}


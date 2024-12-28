package Reusability;
// Details of Computer 
public class Association2 {
    Monitor mn ;
    HardDisk hdd;
    Speaker sp ;
    Ram rm ;

        Association2(){
         mn= new   Monitor() ;
         hdd =new    HardDisk() ;
          sp =new   Speaker()  ;
         rm = new   Ram () ;
        }
        public static void main (String aa [])
        {
            Association2 ass = new Association2();
            ass.sp.speaker();

        }
}

class HardDisk{
    HardDisk()
    {
        System.out.println(" Hard Disk is strong");
    }
}

class Speaker{
    void speaker()
    {
        System.out.println(" speaker is week");
    }
}

class Monitor{
    Monitor()
    {
        System.out.println(" Monitor is week");
    }
}

class Ram{
  void  ram()
    {
        System.out.println("Ram is strong ");
    }
}
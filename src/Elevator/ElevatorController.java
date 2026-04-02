package Elevator;

import java.util.List;
import java.util.PriorityQueue;

public class ElevatorController {
//
//    To choose the best elevator, I would first look for an elevator
//    already moving in the same direction and that has not yet crossed the request floor.
//    If none exists, I would choose the nearest idle elevator.
//        Otherwise, I would fall back to the elevator with the minimum estimated wait time.


    /*

    ⚡ Starvation problem
Simple logic:

👉 har request ke saath timestamp store karo
👉 agar koi request bahut der se wait kar rahi hai
👉 toh usko priority de do (direction change force karo)
Agar ek elevator hamesha upar hi
Multiple requests same time

5 log ek saath button dabaye?

👉 bolna:

queue maintain
batch assign
process sequentially
Multiple requests same time

5. 📈 Optimization

Har baar sab elevators check karna slow hai?

👉 bolna:

maintain:
Map<Direction, List<Elevator>>
ya priority queue of elevators based on distance
Some follow-ups I would consider:
- starvation handling
- request prioritization
- elevator capacity and failure scenarios
    */

    int floor ;
    List<Elevatorr> el ;
   // List<Request> req ;

    PriorityQueue<Integer> downpq  = new PriorityQueue<>((a,b)->b-a);
    PriorityQueue<Integer> uppq = new PriorityQueue<>() ;

public ElevatorController( List<Elevatorr> el  ){
    this.el = el ;

}

   public Elevatorr findLift(List<Elevatorr> el) {
        for (Elevatorr ee : el) {
            if (ee.state == state.idle) {
               return ee;
            }

        }
        return null;
    }

       public void addRequesttoqueue(Request req ){
            Elevatorr ee = findLift(el);

                if(ee.cuf >req.dest){
                    downpq.add(req.dest);
                }else {
                    uppq.add(req.dest);
                }

                if(ee.state == state.idle){
                    decidedir(ee);
                    movelift(ee);
                }
                System.out.println(ee.id);
    }

    public void decidedir(Elevatorr ee){
        if(!uppq.isEmpty()){
            ee.direction = Direction.up ;
        }else if(!downpq.isEmpty()){
            ee.direction = Direction.down;
        }else{
            ee.state = state.idle;
        }
    }

  public   void movelift(Elevatorr ee){

        ee.state= state.moving ;
        while(!uppq.isEmpty() || !downpq.isEmpty()){
            if(ee.direction == Direction.up){
                while (!uppq.isEmpty()){
                    int next = uppq.poll();
                    while (ee.cuf < next) {
                        ee.moveup(ee);
                    }
                    ee.stop(ee);
                }
            }else if(ee.direction == Direction.down){
                while (!downpq.isEmpty()){
                   int next =  downpq.poll();
                   while(ee.cuf> next){
                       ee.moveup(ee);
                   }
                   ee.stop(ee);
                }
            }
        }




    }


}

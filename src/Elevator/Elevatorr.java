package Elevator;

import java.util.List;

public class Elevatorr {
   // Request request ;
    state state ;
    Direction direction;
    int id ;
    int cuf ;


public Elevatorr(int cuf , state state ,Direction direction ,int id ){
    this.cuf = cuf;
    this.state =  Elevator.state.idle ;
    this.direction = direction ;
    this.id = id ;
}

void moveup(Elevatorr el){
    el.direction = Direction.up;
    el.state = Elevator.state.moving ;
    cuf++ ;
}
void movedown(Elevatorr el){
    el.direction = Direction.down ;
        el.state = Elevator.state.moving ;
        cuf-- ;
}
void stop(Elevatorr el){
    el.state = Elevator.state.idle ;
}


}

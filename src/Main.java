import CabBooking.*;
import Elevator.*;
import FileSystem.FileSystem;
import LoggingFrameWork.Logger;
import LoggingFrameWork.Message;
import Multithreading.*;
import Splitwise.*;
//import Splitwise.User;
import CabBooking.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        List<Elevatorr> el = new ArrayList<>();
//        List<Request> rel = new ArrayList<>();
//        Elevatorr e1 = new Elevatorr(2 , state.idle , Direction.down ,999);
//        Elevatorr e2 = new Elevatorr(2 , state.idle , Direction.down ,123);
//        el.add(e1);
//        el.add(e2);
//        Request re1 = new Request(5);
//        Request re2 = new Request(1);
//        Request re3 = new Request(8);
//        rel.add(re1); rel.add(re2); rel.add(re3);
//
//        ElevatorController ec = new ElevatorController( el , rel);
//       ec.addRequesttoqueue(re1);

//        User user = new User( 1, "diksha");
//        expense expense =  new expense(1 , "milano" , 300 , SplitType.equal , user );
//        splitwiseService ss = new splitwiseService();
//        ArrayList<User> users =  ss.addUser(user);
//        ArrayList<expense> expenses =   ss.addExpense(expense);
//        //ss.
//        Group  group = new Group(1 , users , expenses);
//        BalanceSheet bs = new BalanceSheet();
//        Map<Integer, Map<Integer, Double>> balances =  bs.sheet(group);
//        ss.whoowns(balances);
//

//        BookingService bookingService = new BookingService();
//
//        location l = new location(2323.4 ,23.4);
//        Driver driver = new Driver("fg" , "nnm" ,  l, DriverStatus.IDLE);
//        User user = new User("dj" , "dkm" ,l );
//        Booking booking = new Booking(user , driver , l , 0);
//
//       bookingService.addDriverList(driver);
//       bookingService.addbookingQueue(booking);
//       bookingService.acceptBooking(booking);
//       bookingService.bookingstart(booking);
//       bookingService.boodingdone(booking);

//        createthread ct = new createthread();
//        Thread thread = new Thread(ct);
//        thread.start();
//        createExtendthread  cet = new createExtendthread();
//        cet.run();
//        createExtendthread  cet2 = new createExtendthread();
//        cet2.run();
//
//        sharedBuffer buffer = new sharedBuffer();
//        producer p = new producer(buffer);
//        Consumer c = new Consumer(buffer);
//
//        Thread producer = new Thread(p);
//        Thread consumer = new Thread(c);
//
//        producer.start();
//        consumer.start();
//      //  ct.run();
//
//        Logger logger = Logger.getLoggerInstance();
//        logger.debug(new Message());

         FileSystem fs = new FileSystem();
         fs.mkdir("a/b/x");
        fs.mkdir("a/b/y");
        fs.mkdir("a/b/p");
         fs.addContentToFile("a/b/x/f" , "yoo");
        String st =  fs.readContentToFile("a/b/x/f");
        List<String> al = fs.ls("a/b");
        for(int i = 0 ;i<al.size() ;i++){
            System.out.println(al.get(i));
        }
        System.out.println(st);
    }
}